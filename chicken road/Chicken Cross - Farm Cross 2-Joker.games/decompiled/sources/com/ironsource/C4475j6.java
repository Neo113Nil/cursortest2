package com.ironsource;

import android.app.Activity;
import com.ironsource.C4386e6;
import com.ironsource.InterfaceC4487k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4475j6 implements InterfaceC4547n6 {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8264a;
    private LevelPlayAdInfo b;
    private final InterfaceC4527m4 c;
    private final long d;

    public C4475j6(Va adInternal, LevelPlayAdInfo adInfo, InterfaceC4527m4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f8264a = adInternal;
        this.b = adInfo;
        this.c = currentTimeProvider;
        this.d = currentTimeProvider.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4411fd a2 = this.f8264a.f().a(this.f8264a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Va va = this.f8264a;
        va.a(new C4511l6(va, levelPlayAdInfo));
        this.f8264a.c().a(activity, a2);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public InterfaceC4487k0 c() {
        D3 a2 = this.f8264a.l().g().a(this.f8264a.h());
        return a2.d() ? InterfaceC4487k0.a.c.a(a2.e()) : InterfaceC4487k0.b.f8276a;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void loadAd() {
        this.f8264a.f().f().h().a(Long.valueOf(d()));
        this.f8264a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClicked() {
        this.f8264a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClosed() {
        this.f8264a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8264a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdInfoChanged(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        C4577p0 f = this.f8264a.f();
        IronLog.INTERNAL.verbose(C4577p0.a(f, "onAdInfoChanged adInfo: " + adInfo, (String) null, 2, (Object) null));
        f.f().h().a(this.b, adInfo);
        this.b = adInfo;
        f.b(new Runnable() { // from class: com.ironsource.j6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4475j6.a(C4475j6.this, adInfo);
            }
        });
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8264a.b("onAdLoadFailed on loaded state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8264a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a() {
        IronLog.INTERNAL.verbose(C4577p0.a(this.f8264a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.f8264a.a(C4386e6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4475j6 this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Wa k = this$0.f8264a.k();
        if (k != null) {
            k.onAdInfoChanged(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8264a.b("onAdDisplayFailed on loaded state with error: " + error.getErrorMessage());
    }
}
