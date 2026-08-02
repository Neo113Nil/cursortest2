package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class f implements com.iovation.mobile.android.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.b.t f3930a;

    public f(com.iovation.mobile.android.b.t tVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "");
        this.f3930a = tVar;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (!com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            linkedHashMap.put("LSEN", "FALSE");
            return linkedHashMap;
        }
        linkedHashMap.put("LSEN", "TRUE");
        com.iovation.mobile.android.b.t tVar = this.f3930a;
        boolean z = tVar.e;
        linkedHashMap.put("LSG", (!z || tVar.f) ? (z || !tVar.f) ? (z && tVar.f) ? "BOTH" : "NONE" : "NET" : "GPS");
        try {
            android.location.Location a2 = this.f3930a.a(true);
            linkedHashMap.put("LAT", a2 != null ? java.lang.Double.valueOf(a2.getLatitude()).toString() : null);
            linkedHashMap.put("LON", a2 != null ? java.lang.Double.valueOf(a2.getLongitude()).toString() : null);
            linkedHashMap.put("ALT", a2 != null ? java.lang.Double.valueOf(a2.getAltitude()).toString() : null);
            linkedHashMap.put("GLA", a2 != null ? java.lang.Float.valueOf(a2.getAccuracy()).toString() : null);
            linkedHashMap.put("GLD", a2 != null ? java.lang.Long.valueOf(a2.getTime()).toString() : null);
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                linkedHashMap.put("SIMLOC", a2 != null ? java.lang.Boolean.valueOf(a2.isMock()).toString() : null);
            }
            linkedHashMap.put("NMEA", java.lang.String.valueOf(this.f3930a.d));
        } catch (java.lang.Exception unused) {
        }
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.g
    public final void b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context)) {
            this.f3930a.a(context);
        }
    }

    @Override // com.iovation.mobile.android.a.g
    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f3930a.a();
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "a0535d";
    }
}
