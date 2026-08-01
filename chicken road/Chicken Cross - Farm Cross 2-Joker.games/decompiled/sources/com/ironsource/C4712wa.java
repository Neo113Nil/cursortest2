package com.ironsource;

import androidx.compose.material.MenuKt;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4712wa extends AbstractC4522m implements M2, InterfaceC4748ya {
    private final C4577p0 b;
    private final H2 c;
    private final W8 d;
    private final WeakReference<InterfaceC4722x2> e;
    private LevelPlayAdInfo f;
    private final InterfaceC4730xa g;

    public C4712wa(InterfaceC4722x2 listener, C4577p0 adTools, H2 bannerAdProperties, U2 bannerViewContainer, W8 impressionDataListenerHolder) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        Intrinsics.checkNotNullParameter(impressionDataListenerHolder, "impressionDataListenerHolder");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = impressionDataListenerHolder;
        this.e = new WeakReference<>(listener);
        this.f = n();
        this.g = Ra.a(Ra.f7875a, adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), this, m(), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J2 a(C4712wa this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final L2 m() {
        return new L2() { // from class: com.ironsource.wa$$ExternalSyntheticLambda0
            @Override // com.ironsource.L2
            public final J2 a(boolean z) {
                J2 a2;
                a2 = C4712wa.a(C4712wa.this, z);
                return a2;
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
        String c = this.c.c();
        String aVar = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, MenuKt.InTransitionDuration, null);
    }

    public final void b() {
        this.g.b();
    }

    public final void c() {
        this.g.c();
    }

    public final void d() {
        this.g.d();
    }

    @Override // com.ironsource.J0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.g.f();
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void i() {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.a(this.f);
        }
    }

    @Override // com.ironsource.M2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void k() {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.c(this.f);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void onAdClicked() {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.d(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f = adInfo;
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.b(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void onAdLeftApplication() {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.e(this.f);
        }
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f = adInfo;
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            interfaceC4722x2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final J2 a(C4577p0 c4577p0, H2 h2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new J2(c4577p0, K2.z.a(h2, l().a(), z), this, this.d);
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void d(IronSourceError ironSourceError) {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.f;
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC4722x2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC4748ya
    public void a(IronSourceError ironSourceError) {
        InterfaceC4722x2 interfaceC4722x2 = this.e.get();
        if (interfaceC4722x2 != null) {
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC4722x2.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }
}
