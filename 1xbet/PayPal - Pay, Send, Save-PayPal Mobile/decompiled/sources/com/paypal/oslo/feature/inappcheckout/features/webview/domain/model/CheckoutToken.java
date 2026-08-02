package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "", "", "p0", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "type", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "getType", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ExternalTokenType;", "", "isBAToken", "()Z", "isECToken", "isVaultSetupToken", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/BAToken;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ECToken;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/VaultSetupToken;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class CheckoutToken {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType type;
    private final java.lang.String value;

    private CheckoutToken(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType) {
        this.value = str;
        this.type = externalTokenType;
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType getType() {
        return this.type;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public final boolean isBAToken() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.BAToken;
    }

    public final boolean isECToken() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken;
    }

    public final boolean isVaultSetupToken() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.VaultSetupToken;
    }

    public /* synthetic */ CheckoutToken(java.lang.String str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType externalTokenType, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, externalTokenType);
    }
}
