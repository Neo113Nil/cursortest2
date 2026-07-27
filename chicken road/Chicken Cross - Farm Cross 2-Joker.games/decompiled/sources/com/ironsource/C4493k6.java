package com.ironsource;

import android.app.Activity;
import androidx.compose.material.MenuKt;
import com.ironsource.C4386e6;
import com.ironsource.InterfaceC4487k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4493k6 implements InterfaceC4547n6 {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8286a;
    private final InterfaceC4527m4 b;
    private final long c;
    private final LevelPlayAdInfo d;

    public C4493k6(Va adInternal, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8286a = adInternal;
        this.b = currentTimeProvider;
        this.c = currentTimeProvider.a();
        String uuid = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.d = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, MenuKt.InTransitionDuration, null);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f8286a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f8286a.a(new LevelPlayAdError(uuid, this.f8286a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public InterfaceC4487k0 c() {
        return new InterfaceC4487k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void loadAd() {
        String uuid = this.f8286a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f8286a.a(new LevelPlayAdError(uuid, this.f8286a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClicked() {
        this.f8286a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClosed() {
        this.f8286a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8286a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8286a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8286a.a(error, this.b.a() - this.c);
        this.f8286a.a(C4386e6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Va va = this.f8286a;
        va.a(new C4475j6(va, adInfo, this.b));
        this.f8286a.a(adInfo);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a() {
        this.f8286a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8286a.b("onAdDisplayFailed on loading state with error: " + error.getErrorMessage());
    }
}
