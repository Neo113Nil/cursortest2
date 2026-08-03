package com.inmobi.media;

/* renamed from: com.inmobi.media.sj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2756sj extends com.inmobi.media.AbstractC2422g2 {
    public final com.inmobi.media.Uc b;
    public final kotlin.jvm.functions.Function0 c;
    public final java.util.concurrent.atomic.AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2756sj(final com.inmobi.media.Uc vastBeaconDataModel, kotlin.jvm.functions.Function0 getBeacons) {
        super(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.sj$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.C2756sj.a(com.inmobi.media.Uc.this));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.b = vastBeaconDataModel;
        this.c = getBeacons;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final boolean a(com.inmobi.media.Uc uc) {
        return com.inmobi.media.Wc.a(uc.f4995a);
    }

    @Override // com.inmobi.media.AbstractC2422g2
    public final void b(com.inmobi.media.D2 beaconExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (this.d.getAndSet(true)) {
            return;
        }
        boolean z = beaconExtras instanceof com.inmobi.media.Wo;
        java.util.Map emptyMap = z ? ((com.inmobi.media.Wo) beaconExtras).f5040a : kotlin.collections.MapsKt.emptyMap();
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) this.c.invoke(), (java.lang.Iterable) (z ? ((com.inmobi.media.Wo) beaconExtras).b : kotlin.collections.CollectionsKt.emptyList()));
        if (plus.isEmpty()) {
            return;
        }
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            java.lang.String url = com.inmobi.media.Wc.a((java.lang.String) it.next(), this.b, emptyMap);
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, false, null);
        }
    }
}
