package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368ah extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final SafePackageManager f6996b;

    public C0368ah(C0459e5 c0459e5) {
        this(c0459e5, new SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Wg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(W5 w5) {
        HashSet hashSet;
        ArrayList b3;
        C0459e5 c0459e5 = this.f6796a;
        if (c0459e5.f7211t.c() && c0459e5.y()) {
            C0392bf c0392bf = c0459e5.f7195c;
            String e3 = this.f6796a.f7195c.e();
            try {
                if (!TextUtils.isEmpty(e3)) {
                    try {
                        hashSet = new HashSet();
                        JSONArray jSONArray = new JSONArray(e3);
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            hashSet.add(new Y9(jSONArray.getJSONObject(i3)));
                        }
                    } catch (Throwable unused) {
                    }
                    b3 = b();
                    if (CollectionUtils.areCollectionsEqual(hashSet, b3)) {
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = b3.iterator();
                        while (it.hasNext()) {
                            Y9 y9 = (Y9) it.next();
                            y9.getClass();
                            JSONObject put = new JSONObject().put("name", y9.f6860a).put("required", y9.f6862c);
                            int i4 = y9.f6861b;
                            if (i4 != -1) {
                                put.put("version", i4);
                            }
                            jSONArray2.put(put);
                        }
                        W5 a3 = W5.a(w5, new JSONObject().put("features", jSONArray2).toString());
                        C0799r9 c0799r9 = c0459e5.f7205n;
                        c0799r9.a(a3, Wk.a(c0799r9.f8207c.b(a3), a3.f6782i));
                        int i5 = c0799r9.f8214k;
                        c0799r9.f8216m = i5;
                        c0799r9.f8205a.a(i5).b();
                        c0392bf.i(jSONArray2.toString());
                    } else {
                        C0799r9 c0799r92 = c0459e5.f7205n;
                        int i6 = c0799r92.f8214k;
                        c0799r92.f8216m = i6;
                        c0799r92.f8205a.a(i6).b();
                    }
                }
                b3 = b();
                if (CollectionUtils.areCollectionsEqual(hashSet, b3)) {
                }
            } catch (Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final ArrayList b() {
        FeatureInfo[] featureInfoArr;
        try {
            C0459e5 c0459e5 = this.f6796a;
            SafePackageManager safePackageManager = this.f6996b;
            Context context = c0459e5.f7193a;
            PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            ArrayList arrayList = new ArrayList();
            X9 v9 = AndroidUtils.isApiAchieved(24) ? new V9() : new W9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(v9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C0368ah(C0459e5 c0459e5, SafePackageManager safePackageManager) {
        super(c0459e5);
        this.f6996b = safePackageManager;
    }
}
