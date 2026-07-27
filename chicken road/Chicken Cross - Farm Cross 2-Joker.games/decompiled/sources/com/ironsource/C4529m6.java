package com.ironsource;

import android.app.Activity;
import com.ironsource.C4386e6;
import com.ironsource.InterfaceC4487k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4529m6 implements InterfaceC4547n6 {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8353a;
    private final LevelPlayAdInfo b;

    public C4529m6(Va adInternal, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8353a = adInternal;
        this.b = adInfo;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String uuid = this.f8353a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f8353a.a(new LevelPlayAdError(uuid, this.f8353a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public InterfaceC4487k0 c() {
        return new InterfaceC4487k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void loadAd() {
        String uuid = this.f8353a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        Va.a(this.f8353a, new LevelPlayAdError(uuid, this.f8353a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4577p0.a(this.f8353a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.f8353a.f().b(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4529m6.a(C4529m6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4577p0.a(this.f8353a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.f8353a.a(C4386e6.a.Closed);
        this.f8353a.f().b(new Runnable() { // from class: com.ironsource.m6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C4529m6.b(C4529m6.this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8353a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8353a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8353a.b("onAdLoadFailed on shown state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8353a.b("onAdLoaded on shown state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4529m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wa k = this$0.f8353a.k();
        if (k != null) {
            k.onAdClosed(this$0.b);
        }
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a() {
        this.f8353a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8353a.b("onAdDisplayFailed on shown state with error: " + error.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4529m6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Wa k = this$0.f8353a.k();
        if (k != null) {
            k.onAdClicked(this$0.b);
        }
    }
}
