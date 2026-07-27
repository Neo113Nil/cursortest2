package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.ktor.sse.ServerSentEventKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.s5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4635s5 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4635s5 f8523a = new C4635s5();

    private C4635s5() {
    }

    static /* synthetic */ IronSourceError a(C4635s5 c4635s5, X7 x7, IronSourceError ironSourceError, int i, Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c4635s5.a(x7, ironSourceError);
    }

    public final IronSourceError b() {
        return a(this, X7.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final IronSourceError c() {
        return a(this, X7.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final IronSourceError d() {
        return a(this, X7.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final IronSourceError e() {
        return a(this, X7.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final IronSourceError f() {
        return a(this, X7.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final IronSourceError g() {
        return a(this, X7.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError h() {
        return a(this, X7.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final IronSourceError i() {
        return a(this, X7.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final IronSourceError j() {
        return a(this, X7.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final IronSourceError k() {
        return a(this, X7.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final IronSourceError l() {
        return a(this, X7.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final IronSourceError m() {
        return a(this, X7.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final IronSourceError n() {
        return a(this, X7.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final IronSourceError o() {
        return a(this, X7.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final IronSourceError p() {
        return a(this, X7.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final IronSourceError q() {
        return a(this, X7.ISErrorLoadNullADM, null, 2, null);
    }

    public final IronSourceError r() {
        return a(this, X7.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final IronSourceError s() {
        return a(this, X7.ISErrorLoadTimedOut, null, 2, null);
    }

    public final IronSourceError t() {
        return a(this, X7.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final IronSourceError a(X7 x7, IronSourceError ironSourceError) {
        String c;
        if (ironSourceError != null) {
            c = x7.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ServerSentEventKt.COLON + ironSourceError.getErrorMessage() + "'";
        } else {
            c = x7.c();
        }
        return new IronSourceError(x7.b(), c);
    }

    public final IronSourceError b(IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a(X7.ISErrorLoadNetworkFailed, error);
    }

    public final IronSourceError c(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return a(X7.ISErrorLoadNetworkFailed, description);
    }

    public final IronSourceError d(String str) {
        return a(X7.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ IronSourceError b(C4635s5 c4635s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4635s5.b(str);
    }

    public final IronSourceError c(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(X7.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ IronSourceError c(C4635s5 c4635s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4635s5.d(str);
    }

    public final IronSourceError b(String str) {
        return a(X7.ISErrorInterstitialLoadNoConfig, str);
    }

    private final IronSourceError a(X7 x7, String str) {
        if (str == null || str.length() == 0) {
            str = x7.c();
        }
        return new IronSourceError(x7.b(), str);
    }

    public final IronSourceError a(IronSourceError networkError) {
        Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(X7.ISErrorInitNetworkFailed, networkError);
    }

    public final IronSourceError a() {
        return a(this, X7.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ IronSourceError a(C4635s5 c4635s5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c4635s5.a(str);
    }

    public final IronSourceError a(String str) {
        return a(X7.ISErrorBannerLoadNoConfig, str);
    }
}
