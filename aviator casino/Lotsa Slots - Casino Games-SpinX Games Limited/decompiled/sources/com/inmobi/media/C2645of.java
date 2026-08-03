package com.inmobi.media;

/* renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2645of extends com.inmobi.media.AbstractC2578m2 {
    public final com.inmobi.media.C2591mf b;
    public final com.inmobi.media.C2799u9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2645of(com.inmobi.media.core.config.models.SignalsConfig.NovatiqConfig mConfig, com.inmobi.media.C2591mf data, com.inmobi.media.C2799u9 c2799u9) {
        super(mConfig.getBeaconUrl());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mConfig, "mConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.b = data;
        this.c = c2799u9;
    }

    public final com.inmobi.media.Re a() {
        com.inmobi.media.C2799u9 c2799u9 = this.c;
        if (c2799u9 != null) {
            com.inmobi.media.C2591mf c2591mf = this.b;
            c2799u9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c2591mf.f5336a + " - sspHost - " + c2591mf.b + " - pubId - inmobi");
        }
        java.lang.String str = this.f5325a;
        kotlin.Pair pair = kotlin.TuplesKt.to("sptoken", this.b.f5336a);
        this.b.getClass();
        kotlin.Pair pair2 = kotlin.TuplesKt.to("sspid", "i6i");
        kotlin.Pair pair3 = kotlin.TuplesKt.to("ssphost", this.b.b);
        this.b.getClass();
        return new com.inmobi.media.Re(str, null, null, kotlin.collections.MapsKt.mapOf(pair, pair2, pair3, kotlin.TuplesKt.to("pubid", "inmobi")), null, false, 54);
    }
}
