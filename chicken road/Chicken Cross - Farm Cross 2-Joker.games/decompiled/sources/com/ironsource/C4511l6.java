package com.ironsource;

import android.app.Activity;
import com.ironsource.C4386e6;
import com.ironsource.InterfaceC4487k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4511l6 implements InterfaceC4547n6 {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8309a;
    private final LevelPlayAdInfo b;

    public C4511l6(Va adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8309a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f8309a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f8309a.a(new LevelPlayAdError(uuid, this.f8309a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public InterfaceC4487k0 c() {
        return new InterfaceC4487k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void loadAd() {
        String uuid = this.f8309a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        Va.a(this.f8309a, new LevelPlayAdError(uuid, this.f8309a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClicked() {
        this.f8309a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClosed() {
        this.f8309a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4577p0 f = this.f8309a.f();
        final LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(adInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C4577p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        f.f().h().d();
        Va va = this.f8309a;
        va.a(new C4529m6(va, levelPlayAdInfo));
        f.b(new Runnable() { // from class: com.ironsource.l6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4511l6.a(C4511l6.this, levelPlayAdInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8309a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8309a.b("onAdLoadFailed on showing state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8309a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8309a.a(a(error, this.b));
        this.f8309a.a(error, this.b);
    }

    private final InterfaceC4547n6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        if (Y4.f8021a.a(Zf.f8052a.a(levelPlayAdError))) {
            Va va = this.f8309a;
            return new C4475j6(va, levelPlayAdInfo, va.j());
        }
        return new C4386e6(this.f8309a, C4386e6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a() {
        this.f8309a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4511l6 this$0, LevelPlayAdInfo adInfoWithPlacement) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfoWithPlacement, "$adInfoWithPlacement");
        Wa k = this$0.f8309a.k();
        if (k != null) {
            k.onAdDisplayed(adInfoWithPlacement);
        }
    }
}
