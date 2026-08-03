package com.inmobi.media;

/* renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2316c3 extends com.inmobi.media.AbstractC2422g2 {
    public final com.inmobi.media.Uc b;
    public final java.util.concurrent.atomic.AtomicBoolean c;
    public final java.util.concurrent.atomic.AtomicBoolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2316c3(final com.inmobi.media.Uc vastBeaconDataModel) {
        super(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.c3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(com.inmobi.media.C2316c3.a(com.inmobi.media.Uc.this));
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        this.b = vastBeaconDataModel;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final boolean a(com.inmobi.media.Uc uc) {
        return com.inmobi.media.Wc.a(uc.f4995a);
    }

    @Override // com.inmobi.media.AbstractC2422g2
    public final void b(com.inmobi.media.D2 beaconExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        com.inmobi.media.Wo wo = beaconExtras instanceof com.inmobi.media.Wo ? (com.inmobi.media.Wo) beaconExtras : null;
        if (wo == null) {
            return;
        }
        java.util.Map map = wo.f5040a;
        java.util.List list = wo.b;
        java.lang.String str = (java.lang.String) map.get("[EVENTTYPE]");
        if (str == null) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "1") || kotlin.text.StringsKt.contains((java.lang.CharSequence) str, (java.lang.CharSequence) "companion", true)) {
            if (!this.d.compareAndSet(false, true)) {
                return;
            }
        } else if (!this.c.compareAndSet(false, true)) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String url = com.inmobi.media.Wc.a((java.lang.String) it.next(), this.b, map);
            com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            com.inmobi.media.A3.a(url, false, null);
        }
    }
}
