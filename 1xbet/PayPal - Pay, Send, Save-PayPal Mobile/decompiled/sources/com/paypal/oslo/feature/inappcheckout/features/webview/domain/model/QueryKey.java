package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/QueryKey;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BAToken", "Token", "ApprovalSessionId", "Source", "SwitchInitiatedTime", "IntegrationType", "ButtonSessionId", "PayerId", com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, "FlowType", "TokenType", "ReferrerURL", "AppSwitchEligible", "Environment", "Experiment", "FundingSourceCamelCase", "FundingSourceSnakeCase", "MerchantPath"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QueryKey {
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey AppSwitchEligible;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey ApprovalSessionId;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey BAToken;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey ButtonSessionId;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey Environment;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey Experiment;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey FlowType;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey FundingSourceCamelCase;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey FundingSourceSnakeCase;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey IntegrationType;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey Merchant;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey MerchantPath;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey PayerId;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey ReferrerURL;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey Source;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey SwitchInitiatedTime;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey Token;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey TokenType;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey[] getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private QueryKey(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("BAToken", 0, "ba_token");
        BAToken = queryKey;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey2 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("Token", 1, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY);
        Token = queryKey2;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey3 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("ApprovalSessionId", 2, "approval_session_id");
        ApprovalSessionId = queryKey3;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey4 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("Source", 3, "source");
        Source = queryKey4;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey5 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("SwitchInitiatedTime", 4, "switch_initiated_time");
        SwitchInitiatedTime = queryKey5;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey6 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("IntegrationType", 5, "integration_type");
        IntegrationType = queryKey6;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey7 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("ButtonSessionId", 6, "button_session_id");
        ButtonSessionId = queryKey7;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey8 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("PayerId", 7, "PayerID");
        PayerId = queryKey8;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey9 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT, 8, "merchant");
        Merchant = queryKey9;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey10 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("FlowType", 9, com.paypal.oslo.feature.subscriptions.api.navigation.DeeplinkParams.FLOW_TYPE);
        FlowType = queryKey10;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey11 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("TokenType", 10, "tokenType");
        TokenType = queryKey11;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey12 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("ReferrerURL", 11, "referrerURL");
        ReferrerURL = queryKey12;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey13 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("AppSwitchEligible", 12, "appSwitchEligible");
        AppSwitchEligible = queryKey13;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey14 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("Environment", 13, "env");
        Environment = queryKey14;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey15 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("Experiment", 14, "experiment");
        Experiment = queryKey15;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey16 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("FundingSourceCamelCase", 15, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE);
        FundingSourceCamelCase = queryKey16;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey17 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("FundingSourceSnakeCase", 16, "funding_source");
        FundingSourceSnakeCase = queryKey17;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey queryKey18 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey("MerchantPath", 17, "merchant_path");
        MerchantPath = queryKey18;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey[] queryKeyArr = {queryKey, queryKey2, queryKey3, queryKey4, queryKey5, queryKey6, queryKey7, queryKey8, queryKey9, queryKey10, queryKey11, queryKey12, queryKey13, queryKey14, queryKey15, queryKey16, queryKey17, queryKey18};
        getHighSpeedVideoFpsRanges = queryKeyArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(queryKeyArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
