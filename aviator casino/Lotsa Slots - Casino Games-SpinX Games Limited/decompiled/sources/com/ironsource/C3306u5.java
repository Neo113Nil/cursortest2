package com.ironsource;

/* renamed from: com.ironsource.u5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3306u5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3306u5 f6757a = new com.ironsource.C3306u5();

    private C3306u5() {
    }

    static /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.C3306u5 c3306u5, com.ironsource.Z7 z7, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            ironSourceError = null;
        }
        return c3306u5.a(z7, ironSourceError);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError b() {
        return a(this, com.ironsource.Z7.ISErrorInitHttpRequestFailed, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError c() {
        return a(this, com.ironsource.Z7.ISErrorInitInvalidResponse, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError d() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMDecryptionFailure, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError e() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMEmptyServerData, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError f() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMEmptyWaterfall, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError g() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMInvalidConfigurationForRequestedNetwork, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError h() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMInvalidJSON, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError i() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMNoAuctionID, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError j() {
        return a(this, com.ironsource.Z7.ISErrorLoadADMNoConfigurationForRequestedNetwork, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError k() {
        return a(this, com.ironsource.Z7.ISErrorLoadBannerNetworkViewIsNull, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError l() {
        return a(this, com.ironsource.Z7.ISErrorLoadBannerNotSupportedSize, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError m() {
        return a(this, com.ironsource.Z7.ISErrorLoadBannerSizeIsNull, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError n() {
        return a(this, com.ironsource.Z7.ISErrorLoadBiddingInNonBidding, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError o() {
        return a(this, com.ironsource.Z7.ISErrorLoadInstanceNotInInitResponse, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError p() {
        return a(this, com.ironsource.Z7.ISErrorLoadNoAdFormatConfigurations, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError q() {
        return a(this, com.ironsource.Z7.ISErrorLoadNullADM, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError r() {
        return a(this, com.ironsource.Z7.ISErrorLoadSDKNotInitialized, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError s() {
        return a(this, com.ironsource.Z7.ISErrorLoadTimedOut, null, 2, null);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError t() {
        return a(this, com.ironsource.Z7.ISErrorShowNotReadyToShowAd, null, 2, null);
    }

    private final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.Z7 z7, com.ironsource.mediationsdk.logger.IronSourceError ironSourceError) {
        java.lang.String c;
        if (ironSourceError != null) {
            c = z7.c() + " Underlying network error: '" + ironSourceError.getErrorCode() + ":" + ironSourceError.getErrorMessage() + "'";
        } else {
            c = z7.c();
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(z7.b(), c);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError b(com.ironsource.mediationsdk.logger.IronSourceError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        return a(com.ironsource.Z7.ISErrorLoadNetworkFailed, error);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError c(java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return a(com.ironsource.Z7.ISErrorLoadNetworkFailed, description);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError d(java.lang.String str) {
        return a(com.ironsource.Z7.ISErrorRewardedLoadNoConfig, str);
    }

    public static /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError b(com.ironsource.C3306u5 c3306u5, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3306u5.b(str);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError c(com.ironsource.mediationsdk.logger.IronSourceError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(com.ironsource.Z7.ISErrorShowNetworkFailed, networkError);
    }

    public static /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError c(com.ironsource.C3306u5 c3306u5, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3306u5.d(str);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError b(java.lang.String str) {
        return a(com.ironsource.Z7.ISErrorInterstitialLoadNoConfig, str);
    }

    private final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.Z7 z7, java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = z7.c();
        }
        return new com.ironsource.mediationsdk.logger.IronSourceError(z7.b(), str);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.mediationsdk.logger.IronSourceError networkError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "networkError");
        return a(com.ironsource.Z7.ISErrorInitNetworkFailed, networkError);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a() {
        return a(this, com.ironsource.Z7.ISErrorInitDecryptionFailure, null, 2, null);
    }

    public static /* synthetic */ com.ironsource.mediationsdk.logger.IronSourceError a(com.ironsource.C3306u5 c3306u5, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c3306u5.a(str);
    }

    public final com.ironsource.mediationsdk.logger.IronSourceError a(java.lang.String str) {
        return a(com.ironsource.Z7.ISErrorBannerLoadNoConfig, str);
    }
}
