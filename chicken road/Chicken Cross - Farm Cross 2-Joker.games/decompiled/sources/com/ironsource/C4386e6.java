package com.ironsource;

import android.app.Activity;
import androidx.compose.material.MenuKt;
import com.ironsource.InterfaceC4487k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4386e6 implements InterfaceC4547n6 {

    /* renamed from: a, reason: collision with root package name */
    private final Va f8152a;
    private final a b;
    private final LevelPlayAdInfo c;

    /* renamed from: com.ironsource.e6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4386e6(Va adInternal, a status) {
        Intrinsics.checkNotNullParameter(adInternal, "adInternal");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f8152a = adInternal;
        this.b = status;
        String uuid = adInternal.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.c = new LevelPlayAdInfo(uuid, adInternal.h(), adInternal.d().toString(), null, null, null, null, MenuKt.InTransitionDuration, null);
    }

    private final boolean d() {
        if (this.f8152a.h().length() == 0) {
            Va va = this.f8152a;
            String uuid = this.f8152a.e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
            Va.a(va, new LevelPlayAdError(uuid, this.f8152a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        if (!this.f8152a.f().a()) {
            Va va2 = this.f8152a;
            String uuid2 = this.f8152a.e().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "adInternal.adId.toString()");
            Va.a(va2, new LevelPlayAdError(uuid2, this.f8152a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Sa a2 = this.f8152a.l().f().a();
        if (a2 != null && a2.a(this.f8152a.h(), this.f8152a.d())) {
            return true;
        }
        Va va3 = this.f8152a;
        String uuid3 = this.f8152a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid3, "adInternal.adId.toString()");
        Va.a(va3, new LevelPlayAdError(uuid3, this.f8152a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(Activity activity, String str) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str2 = this.b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String uuid = this.f8152a.e().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adInternal.adId.toString()");
        this.f8152a.a(new LevelPlayAdError(uuid, this.f8152a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.c);
    }

    @Override // com.ironsource.InterfaceC4547n6
    public LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4547n6
    public InterfaceC4487k0 c() {
        return new InterfaceC4487k0.a(this.b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void loadAd() {
        if (d()) {
            this.f8152a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClicked() {
        this.f8152a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdClosed() {
        this.f8152a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8152a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdInfoChanged(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8152a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoadFailed(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8152a.b("onAdLoadFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f8152a.b("onAdLoaded on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a(LevelPlayAdError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f8152a.b("onAdDisplayFailed on " + this.b + " state with error: " + error.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4547n6
    public void a() {
        this.f8152a.b("onAdExpired on " + this.b + " state");
    }

    public /* synthetic */ C4386e6(Va va, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(va, (i & 2) != 0 ? a.Created : aVar);
    }
}
