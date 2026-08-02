package com.facebook.internal.instrument.anrreport;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.E;
import com.facebook.internal.instrument.c;
import com.facebook.internal.instrument.h;
import com.facebook.internal.instrument.j;
import com.facebook.z;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nANRHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ANRHandler.kt\ncom/facebook/internal/instrument/anrreport/ANRHandler\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n11335#2:78\n11670#2,3:79\n766#3:82\n857#3,2:83\n1855#3,2:85\n1855#3,2:87\n*S KotlinDebug\n*F\n+ 1 ANRHandler.kt\ncom/facebook/internal/instrument/anrreport/ANRHandler\n*L\n58#1:78\n58#1:79,3\n59#1:82\n59#1:83,2\n63#1:85,2\n69#1:87,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e {
    public static final AtomicBoolean a;

    static {
        new e();
        a = new AtomicBoolean(false);
    }

    @JvmStatic
    @VisibleForTesting
    public static final void a() {
        File[] listFiles;
        if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
            return;
        }
        try {
            if (E.x()) {
                return;
            }
            File b = j.b();
            if (b == null) {
                listFiles = new File[0];
            } else {
                listFiles = b.listFiles(new h());
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(c.a.c(file));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((com.facebook.internal.instrument.c) next).a()) {
                    arrayList2.add(next);
                }
            }
            final List sortedWith = CollectionsKt.sortedWith(arrayList2, new c(0));
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it2 = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
            while (it2.hasNext()) {
                jSONArray.put(sortedWith.get(((IntIterator) it2).nextInt()));
            }
            j.f("anr_reports", jSONArray, new z.b() { // from class: com.facebook.internal.instrument.anrreport.d
                @Override // com.facebook.z.b
                public final void a(com.facebook.E response) {
                    JSONObject jSONObject;
                    List validReports = sortedWith;
                    if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                        return;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(validReports, "$validReports");
                        Intrinsics.checkNotNullParameter(response, "response");
                        try {
                            if (response.c == null && (jSONObject = response.d) != null && jSONObject.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                                Iterator it3 = validReports.iterator();
                                while (it3.hasNext()) {
                                    j.a(((com.facebook.internal.instrument.c) it3.next()).a);
                                }
                            }
                        } catch (JSONException unused) {
                        }
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, e.class);
                    }
                }
            });
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, e.class);
        }
    }
}
