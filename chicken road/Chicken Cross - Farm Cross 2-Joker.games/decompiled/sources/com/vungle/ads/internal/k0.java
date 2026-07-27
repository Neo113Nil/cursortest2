package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class k0 extends s {
    public final VungleAdSize q;
    public volatile VungleAdSize r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, VungleAdSize adSize) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.q = adSize;
    }

    public final j0 a(com.vungle.ads.internal.presenter.b adPlayCallback) {
        Intrinsics.checkNotNullParameter(adPlayCallback, "adPlayCallback");
        return new j0(adPlayCallback, this);
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return this.q;
    }

    public final VungleAdSize m() {
        VungleAdSize vungleAdSize = this.r;
        return vungleAdSize == null ? this.q : vungleAdSize;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(j3 placement) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        return placement.e() || placement.h() || placement.f();
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        if (vungleAdSize != null) {
            return vungleAdSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final void a(com.vungle.ads.internal.model.i0 advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        super.a(advertisement);
        com.vungle.ads.internal.util.s e = e();
        Long a2 = e != null ? e.a() : null;
        if ((a2 != null && a2.longValue() == 3) || (a2 != null && a2.longValue() == 4)) {
            l();
        }
        String sb = com.iab.omid.library.vungle.internal.l.a("req=").append(this.q.getWidth()).append('x').append(this.q.getHeight()).append(" resp=").append(advertisement.d()).append('x').append(advertisement.a()).append(" adaptW=").append(this.q.getIsAdaptiveWidth()).append(" adaptH=").append(this.q.getIsAdaptiveHeight()).toString();
        if (this.q.getIsAdaptiveWidth() || this.q.getIsAdaptiveHeight()) {
            Pair a3 = com.vungle.ads.internal.util.a0.a(d());
            int intValue = ((Number) a3.component1()).intValue();
            int intValue2 = ((Number) a3.component2()).intValue();
            sb = sb + " device=" + intValue + 'x' + intValue2;
            int d = this.q.getIsAdaptiveWidth() ? advertisement.d() : this.q.getWidth();
            int a4 = this.q.getIsAdaptiveHeight() ? advertisement.a() : this.q.getHeight();
            int min = Math.min(intValue, d);
            int min2 = Math.min(intValue2, a4);
            if (this.q.getIsAdaptiveHeight() && this.q.getHeight() > 0) {
                min2 = Math.min(this.q.getHeight(), min2);
            }
            this.r = new VungleAdSize(min, min2);
        }
        VungleAdSize m = m();
        AnalyticsClient.INSTANCE.a(new k2(Sdk.SDKMetric.SDKMetricType.BANNER_SIZE_NEGOTIATED), e(), sb + " final=" + m.getWidth() + 'x' + m.getHeight());
    }
}
