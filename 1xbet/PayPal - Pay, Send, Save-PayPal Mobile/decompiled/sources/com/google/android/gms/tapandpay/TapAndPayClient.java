package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
public interface TapAndPayClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions> {
    public static final java.lang.String DATA_CHANGED_LISTENER_KEY = "tapAndPayDataChangedListener";
    public static final java.lang.String SERVICE_LISTENER_KEY_PREFIX = "tapAndPayServiceListener_";

    com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext> createPushProvisionSession(com.google.android.gms.tapandpay.issuer.CreatePushProvisionSessionRequest createPushProvisionSessionRequest);

    void createWallet(android.app.Activity activity, int i);

    com.google.android.gms.tasks.Task<java.lang.String> getActiveWalletId();

    com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo>> getActiveWalletInfos();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.String> getEnvironment();

    com.google.android.gms.tasks.Task<java.lang.String> getEnvironment(com.google.android.gms.tapandpay.issuer.GetEnvironmentRequest getEnvironmentRequest);

    com.google.android.gms.tasks.Task<java.lang.String> getLinkingToken(java.lang.String str);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.lang.String> getStableHardwareId();

    com.google.android.gms.tasks.Task<java.lang.String> getStableHardwareId(com.google.android.gms.tapandpay.issuer.GetStableHardwareIdRequest getStableHardwareIdRequest);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.TokenStatus> getTokenStatus(int i, java.lang.String str);

    com.google.android.gms.tasks.Task<com.google.android.gms.tapandpay.issuer.TokenStatus> getTokenStatus(com.google.android.gms.tapandpay.issuer.GetTokenStatusRequest getTokenStatusRequest);

    com.google.android.gms.tasks.Task<java.lang.Boolean> hasEligibleTokenizationTarget(com.google.android.gms.tapandpay.issuer.HasEligibleTokenizationTargetRequest hasEligibleTokenizationTargetRequest);

    com.google.android.gms.tasks.Task<java.lang.Boolean> isTokenized(com.google.android.gms.tapandpay.issuer.IsTokenizedRequest isTokenizedRequest);

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.TokenInfo>> listTokens();

    com.google.android.gms.tasks.Task<java.util.List<com.google.android.gms.tapandpay.issuer.TokenInfo>> listTokens(com.google.android.gms.tapandpay.issuer.ListTokensRequest listTokensRequest);

    com.google.android.gms.tasks.Task<android.app.PendingIntent> pushTokenize(com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest);

    void pushTokenize(android.app.Activity activity, com.google.android.gms.tapandpay.issuer.PushTokenizeRequest pushTokenizeRequest, int i);

    com.google.android.gms.tasks.Task<java.lang.Void> registerDataChangedListener(com.google.android.gms.tapandpay.TapAndPay.DataChangedListener dataChangedListener);

    com.google.android.gms.tasks.Task<java.lang.Void> removeDataChangedListener(com.google.android.gms.tapandpay.TapAndPay.DataChangedListener dataChangedListener);

    void requestDeleteToken(android.app.Activity activity, com.google.android.gms.tapandpay.issuer.RequestDeleteTokenRequest requestDeleteTokenRequest, int i);

    @java.lang.Deprecated
    void requestDeleteToken(android.app.Activity activity, java.lang.String str, int i, int i2);

    void requestSelectToken(android.app.Activity activity, com.google.android.gms.tapandpay.issuer.RequestSelectTokenRequest requestSelectTokenRequest, int i);

    @java.lang.Deprecated
    void requestSelectToken(android.app.Activity activity, java.lang.String str, int i, int i2);

    void serverPushProvision(android.app.Activity activity, com.google.android.gms.tapandpay.issuer.ServerPushProvisionRequest serverPushProvisionRequest, int i);

    void tokenize(android.app.Activity activity, com.google.android.gms.tapandpay.issuer.TokenizeRequest tokenizeRequest, int i);

    @java.lang.Deprecated
    void tokenize(android.app.Activity activity, java.lang.String str, int i, java.lang.String str2, int i2, int i3);

    com.google.android.gms.tasks.Task<android.app.PendingIntent> viewToken(com.google.android.gms.tapandpay.issuer.ViewTokenRequest viewTokenRequest);
}
