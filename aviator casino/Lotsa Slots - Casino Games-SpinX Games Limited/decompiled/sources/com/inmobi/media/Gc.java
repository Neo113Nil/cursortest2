package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gc extends com.inmobi.media.AbstractC2422g2 {
    public final com.inmobi.media.Uc b;
    public final kotlin.jvm.functions.Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gc(final com.inmobi.media.Uc nativeBeaconMacroData, kotlin.jvm.functions.Function0 getBeacons) {
        super(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Gc$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.Gc.a(com.inmobi.media.Uc.this));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = nativeBeaconMacroData;
        this.c = getBeacons;
    }

    public static final boolean a(com.inmobi.media.Uc uc) {
        return com.inmobi.media.Wc.a(uc.f4995a);
    }

    @Override // com.inmobi.media.AbstractC2422g2
    public final void b(com.inmobi.media.D2 beaconExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        boolean z = beaconExtras instanceof com.inmobi.media.Wo;
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) this.c.invoke(), (java.lang.Iterable) (z ? ((com.inmobi.media.Wo) beaconExtras).b : kotlin.collections.CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        java.util.Map emptyMap = z ? ((com.inmobi.media.Wo) beaconExtras).f5040a : kotlin.collections.MapsKt.emptyMap();
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            java.lang.String url = com.inmobi.media.Wc.a((java.lang.String) it.next(), this.b, emptyMap);
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, false, null);
        }
    }
}
