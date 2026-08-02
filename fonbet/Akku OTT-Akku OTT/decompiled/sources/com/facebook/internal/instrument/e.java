package com.facebook.internal.instrument;

import android.os.Bundle;
import android.view.View;
import com.facebook.S;
import com.facebook.internal.C0715k;
import com.facebook.internal.E;
import com.facebook.internal.instrument.j;
import com.facebook.w;
import com.facebook.z;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.util.ViewUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements C0715k.a, Bundleable.Creator, ViewUtils.ViewVisitor {
    @Override // com.facebook.internal.C0715k.a
    public void b(boolean z) {
        File[] listFiles;
        if (z) {
            w wVar = w.a;
            if (!S.c() || E.x()) {
                return;
            }
            File b = j.b();
            if (b == null) {
                listFiles = new File[0];
            } else {
                listFiles = b.listFiles(new com.facebook.internal.instrument.errorreport.d());
                Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { _,…OR_REPORT_PREFIX)))\n    }");
            }
            final ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                Intrinsics.checkNotNullParameter(file, "file");
                com.facebook.internal.instrument.errorreport.a aVar = new com.facebook.internal.instrument.errorreport.a();
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                aVar.a = name;
                JSONObject e = j.e(name);
                if (e != null) {
                    aVar.c = Long.valueOf(e.optLong(Constants.TIMESTAMP, 0L));
                    aVar.b = e.optString("error_message", null);
                }
                if (aVar.b != null && aVar.c != null) {
                    arrayList.add(aVar);
                }
            }
            CollectionsKt.sortWith(arrayList, new com.facebook.internal.instrument.errorreport.b());
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < arrayList.size() && i < 1000; i++) {
                jSONArray.put(arrayList.get(i));
            }
            j.f("error_reports", jSONArray, new z.b() { // from class: com.facebook.internal.instrument.errorreport.c
                @Override // com.facebook.z.b
                public final void a(com.facebook.E response) {
                    JSONObject jSONObject;
                    ArrayList validReports = arrayList;
                    Intrinsics.checkNotNullParameter(validReports, "$validReports");
                    Intrinsics.checkNotNullParameter(response, "response");
                    try {
                        if (response.c == null && (jSONObject = response.d) != null && jSONObject.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                            Iterator it = validReports.iterator();
                            while (it.hasNext()) {
                                j.a(((a) it.next()).a);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable.Creator
    public Bundleable fromBundle(Bundle bundle) {
        CueGroup fromBundle;
        fromBundle = CueGroup.fromBundle(bundle);
        return fromBundle;
    }

    @Override // io.flutter.util.ViewUtils.ViewVisitor
    public boolean run(View view) {
        boolean hasFocus;
        hasFocus = view.hasFocus();
        return hasFocus;
    }
}
