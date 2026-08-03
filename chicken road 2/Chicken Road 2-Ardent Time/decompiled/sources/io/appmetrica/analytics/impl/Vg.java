package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vg extends io.appmetrica.analytics.impl.Rg {

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f5171b;

    public Vg(io.appmetrica.analytics.impl.X4 x4) {
        this(x4, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:9:0x0043, B:11:0x004d, B:12:0x005d, B:13:0x0066, B:15:0x006c, B:17:0x008f, B:19:0x0094, B:22:0x0098), top: B:8:0x0043 }] */
    @Override // io.appmetrica.analytics.impl.Rg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        java.util.HashSet hashSet;
        java.util.ArrayList b2;
        io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
        if (x4.t.c() && x4.y()) {
            io.appmetrica.analytics.impl.We we = x4.f5257c;
            java.lang.String e2 = this.f4907a.f5257c.e();
            try {
                if (!android.text.TextUtils.isEmpty(e2)) {
                    try {
                        hashSet = new java.util.HashSet();
                        org.json.JSONArray jSONArray = new org.json.JSONArray(e2);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(new io.appmetrica.analytics.impl.R9(jSONArray.getJSONObject(i2)));
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    b2 = b();
                    if (io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(hashSet, b2)) {
                        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                        java.util.Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            io.appmetrica.analytics.impl.R9 r9 = (io.appmetrica.analytics.impl.R9) it.next();
                            r9.getClass();
                            org.json.JSONObject put = new org.json.JSONObject().put("name", r9.f4900a).put("required", r9.f4902c);
                            int i3 = r9.f4901b;
                            if (i3 != -1) {
                                put.put("version", i3);
                            }
                            jSONArray2.put(put);
                        }
                        io.appmetrica.analytics.impl.P5 a2 = io.appmetrica.analytics.impl.P5.a(p5, new org.json.JSONObject().put("features", jSONArray2).toString());
                        io.appmetrica.analytics.impl.C0481k9 c0481k9 = x4.f5268n;
                        c0481k9.a(a2, io.appmetrica.analytics.impl.Rk.a(c0481k9.f6266c.b(a2), a2.f4821i));
                        int i4 = c0481k9.f6273j;
                        c0481k9.f6275l = i4;
                        c0481k9.f6264a.a(i4).b();
                        we.i(jSONArray2.toString());
                    } else {
                        io.appmetrica.analytics.impl.C0481k9 c0481k92 = x4.f5268n;
                        int i5 = c0481k92.f6273j;
                        c0481k92.f6275l = i5;
                        c0481k92.f6264a.a(i5).b();
                    }
                }
                b2 = b();
                if (io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.areCollectionsEqual(hashSet, b2)) {
                }
            } catch (java.lang.Throwable unused2) {
            }
            hashSet = null;
        }
        return false;
    }

    public final java.util.ArrayList b() {
        android.content.pm.FeatureInfo[] featureInfoArr;
        try {
            io.appmetrica.analytics.impl.X4 x4 = this.f4907a;
            io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = this.f5171b;
            android.content.Context context = x4.f5255a;
            android.content.pm.PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 16384);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            io.appmetrica.analytics.impl.Q9 o9 = io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(24) ? new io.appmetrica.analytics.impl.O9() : new io.appmetrica.analytics.impl.P9();
            if (packageInfo != null && (featureInfoArr = packageInfo.reqFeatures) != null) {
                for (android.content.pm.FeatureInfo featureInfo : featureInfoArr) {
                    arrayList.add(o9.a(featureInfo));
                }
            }
            return arrayList;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public Vg(io.appmetrica.analytics.impl.X4 x4, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager) {
        super(x4);
        this.f5171b = safePackageManager;
    }
}
