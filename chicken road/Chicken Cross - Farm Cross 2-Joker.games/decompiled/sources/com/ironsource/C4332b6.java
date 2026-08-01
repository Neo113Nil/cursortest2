package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4654t6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4332b6 implements InterfaceC4618r6, InterfaceC4636s6 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4368d6 f8094a;
    private final C4434h0 b;
    private final InterfaceC4654t6 c;

    public C4332b6(InterfaceC4368d6 listener, C4577p0 adTools, C4434h0 adProperties, InterfaceC4654t6.b adUnitStrategyFactory, InterfaceC4583p6 fullscreenAdUnitFactory) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        Intrinsics.checkNotNullParameter(adUnitStrategyFactory, "adUnitStrategyFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        this.f8094a = listener;
        this.b = adProperties;
        this.c = adUnitStrategyFactory.a(adTools, adTools.b(adProperties.e(), adProperties.c()), fullscreenAdUnitFactory, this, this);
    }

    public final void a(Activity activity, C4411fd c4411fd) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b.a(c4411fd);
        this.c.a(activity);
    }

    public final void b() {
        this.c.loadAd();
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void c(IronSourceError ironSourceError) {
        InterfaceC4368d6 interfaceC4368d6 = this.f8094a;
        String uuid = this.b.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC4368d6.a(new LevelPlayAdError(ironSourceError, uuid, this.b.c()));
    }

    @Override // com.ironsource.J0
    public void e() {
        this.f8094a.onAdClicked();
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8094a.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC4618r6
    public void onClosed() {
        this.f8094a.onAdClosed();
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void b(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8094a.onAdLoaded(adInfo);
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8094a.onAdDisplayed(adInfo);
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void b(IronSourceError ironSourceError) {
        InterfaceC4368d6 interfaceC4368d6 = this.f8094a;
        String uuid = this.b.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        interfaceC4368d6.onAdLoadFailed(new LevelPlayAdError(ironSourceError, uuid, this.b.c()));
    }

    @Override // com.ironsource.InterfaceC4618r6
    public void a(LevelPlayReward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        this.f8094a.a(reward);
    }

    @Override // com.ironsource.InterfaceC4636s6
    public void a() {
        this.f8094a.a();
    }

    public /* synthetic */ C4332b6(InterfaceC4368d6 interfaceC4368d6, C4577p0 c4577p0, C4434h0 c4434h0, InterfaceC4654t6.b bVar, InterfaceC4583p6 interfaceC4583p6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4368d6, c4577p0, c4434h0, (i & 8) != 0 ? new InterfaceC4654t6.b() : bVar, interfaceC4583p6);
    }
}
