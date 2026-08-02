package com.iovation.mobile.android.b;

/* loaded from: classes9.dex */
public final class e implements com.iovation.mobile.android.a.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.iovation.mobile.android.b.k f3929a;
    public final com.iovation.mobile.android.b.t b;
    public final android.location.Geocoder c;
    public com.iovation.mobile.android.b.d d;

    public e(com.iovation.mobile.android.b.k kVar, com.iovation.mobile.android.b.t tVar, android.location.Geocoder geocoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(geocoder, "");
        this.f3929a = kVar;
        this.b = tVar;
        this.c = geocoder;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.util.List list;
        android.location.Address address;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.iovation.mobile.android.b.d dVar = this.d;
        if (!(dVar instanceof com.iovation.mobile.android.b.c)) {
            if (!(dVar instanceof com.iovation.mobile.android.b.b)) {
                linkedHashMap.put("RGEN", "0");
                return linkedHashMap;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(dVar, "");
            linkedHashMap.put("RGERR", ((com.iovation.mobile.android.b.b) dVar).f3927a);
            return linkedHashMap;
        }
        linkedHashMap.put("RGEN", "1");
        try {
            com.iovation.mobile.android.b.d dVar2 = this.d;
            com.iovation.mobile.android.b.c cVar = dVar2 instanceof com.iovation.mobile.android.b.c ? (com.iovation.mobile.android.b.c) dVar2 : null;
            if (cVar != null && (list = cVar.f3928a) != null && (address = (android.location.Address) kotlin.collections.CollectionsKt.firstOrNull(list)) != null) {
                linkedHashMap.put("GCC", address.getCountryCode());
                linkedHashMap.put("RGST", address.getAdminArea());
                linkedHashMap.put("RGCT", address.getLocality());
            }
            return linkedHashMap;
        } catch (java.io.IOException e) {
            linkedHashMap.put("RGERR", e.getMessage());
            return linkedHashMap;
        }
    }

    @Override // com.iovation.mobile.android.a.g
    public final void b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.FraudForceManager fraudForceManager = com.iovation.mobile.android.FraudForceManager.INSTANCE;
        com.iovation.mobile.android.FraudForceConfiguration a2 = com.iovation.mobile.android.FraudForceManager.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.iovation.mobile.android.d.a.a("android.permission.ACCESS_FINE_LOCATION", context) && a2.getGetHighSpeedVideoFpsRanges() && android.location.Geocoder.isPresent() && this.b.a(true) != null) {
            final android.location.Location a3 = this.b.a(true);
            kotlin.jvm.internal.Intrinsics.checkNotNull(a3);
            this.f3929a.a("220d59", new java.util.concurrent.Callable() { // from class: com.iovation.mobile.android.b.e$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return com.iovation.mobile.android.b.e.a(com.iovation.mobile.android.b.e.this, a3);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.iovation.mobile.android.b.e$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.iovation.mobile.android.b.e.a(com.iovation.mobile.android.b.e.this, (java.util.List) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.iovation.mobile.android.b.e$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.iovation.mobile.android.b.e.a(com.iovation.mobile.android.b.e.this, (java.lang.Exception) obj);
                }
            });
        }
    }

    @Override // com.iovation.mobile.android.a.g
    public final void c(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.b.k kVar = this.f3929a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("220d59", "");
        java.util.concurrent.Future future = (java.util.concurrent.Future) kVar.b.get("220d59");
        if (future != null && !future.isCancelled() && !future.isDone()) {
            future.cancel(true);
        }
        this.b.a();
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "220d59";
    }

    public static final java.util.List a(com.iovation.mobile.android.b.e eVar, android.location.Location location) {
        return eVar.c.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
    }

    public static final kotlin.Unit a(com.iovation.mobile.android.b.e eVar, java.util.List list) {
        eVar.d = new com.iovation.mobile.android.b.c(list);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(com.iovation.mobile.android.b.e eVar, java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(message);
        eVar.d = new com.iovation.mobile.android.b.b(message);
        return kotlin.Unit.INSTANCE;
    }
}
