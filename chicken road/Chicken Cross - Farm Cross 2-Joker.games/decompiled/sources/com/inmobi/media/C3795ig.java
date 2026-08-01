package com.inmobi.media;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ig, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3795ig extends I2 {
    public final C3739gg b;
    public final Z9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3795ig(SignalsConfig.NovatiqConfig mConfig, C3739gg data, Z9 z9) {
        super(mConfig.getBeaconUrl());
        Intrinsics.checkNotNullParameter(mConfig, "mConfig");
        Intrinsics.checkNotNullParameter(data, "data");
        this.b = data;
        this.c = z9;
    }

    public final Kf a() {
        Z9 z9 = this.c;
        if (z9 != null) {
            C3739gg c3739gg = this.b;
            z9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c3739gg.f7123a + " - sspHost - " + c3739gg.b + " - pubId - inmobi");
        }
        String str = this.f6615a;
        Map a2 = Li.a(MapsKt.mapOf(TuplesKt.to("User-Agent", AbstractC3914mk.b())));
        Pair pair = TuplesKt.to("sptoken", this.b.f7123a);
        this.b.getClass();
        Pair pair2 = TuplesKt.to("sspid", "i6i");
        Pair pair3 = TuplesKt.to("ssphost", this.b.b);
        this.b.getClass();
        return new Kf(str, a2, null, MapsKt.mapOf(pair, pair2, pair3, TuplesKt.to(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "inmobi")), null, false, 52);
    }
}
