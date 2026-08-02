package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "ORDER_ID", "VAULT_ID", "CHECKOUT_TOKEN", "BILLING_TOKEN", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExternalTokenType {
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType BILLING_TOKEN;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType CHECKOUT_TOKEN;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType ORDER_ID;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType UNKNOWN;
    public static final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType VAULT_ID;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String rawValue;

    private ExternalTokenType(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType("ORDER_ID", 0, "ORDER_ID");
        ORDER_ID = externalTokenType;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType2 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType("VAULT_ID", 1, "VAULT_ID");
        VAULT_ID = externalTokenType2;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType3 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType("CHECKOUT_TOKEN", 2, "CHECKOUT_TOKEN");
        CHECKOUT_TOKEN = externalTokenType3;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType4 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType("BILLING_TOKEN", 3, "BILLING_TOKEN");
        BILLING_TOKEN = externalTokenType4;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType5 = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType("UNKNOWN", 4, "UNKNOWN__");
        UNKNOWN = externalTokenType5;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType[] externalTokenTypeArr = {externalTokenType, externalTokenType2, externalTokenType3, externalTokenType4, externalTokenType5};
        Camera2StreamConfigurationMap = externalTokenTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(externalTokenTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
