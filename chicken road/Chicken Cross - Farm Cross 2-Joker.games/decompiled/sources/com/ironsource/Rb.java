package com.ironsource;

import androidx.compose.material.MenuKt;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Rb extends AbstractC4522m implements InterfaceC4410fc, L0, InterfaceC4756z0 {
    private final Ub b;
    private final C4577p0 c;
    private final C4338bc d;
    private C4374dc e;
    private LevelPlayAdInfo f;

    public Rb(Ub listener, C4577p0 adTools, C4338bc nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.b = listener;
        this.c = adTools;
        this.d = nativeAdProperties;
        this.f = m();
    }

    private final LevelPlayAdInfo m() {
        String uuid = this.d.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "nativeAdProperties.adId.toString()");
        String c = this.d.c();
        String aVar = this.d.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, MenuKt.InTransitionDuration, null);
    }

    public final void a(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C4374dc c4374dc = this.e;
        if (c4374dc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4374dc = null;
        }
        c4374dc.a(new Wb(nativeAdBinder), this);
    }

    @Override // com.ironsource.L0
    public void b(IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.InterfaceC4756z0
    public void c(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.J0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        C4374dc c4374dc = this.e;
        if (c4374dc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c4374dc = null;
        }
        c4374dc.a(true);
    }

    public final void o() {
        C4374dc a2 = a(this.c, this.d);
        this.e = a2;
        if (a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            a2 = null;
        }
        a2.a((L0) this);
    }

    private final C4374dc a(C4577p0 c4577p0, C4338bc c4338bc) {
        IronLog.INTERNAL.verbose();
        return new C4374dc(c4577p0, C4392ec.y.a(c4338bc, l().a()), this);
    }

    @Override // com.ironsource.L0
    public void a(C4666u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC4756z0
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
