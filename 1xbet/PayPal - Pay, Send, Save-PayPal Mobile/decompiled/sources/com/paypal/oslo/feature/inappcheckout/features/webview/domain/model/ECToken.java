package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ECToken;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/ECToken;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ECToken extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken {
    public static final int $stable = 0;
    private final java.lang.String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECToken(java.lang.String str) {
        super(str, com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ExternalTokenType.CHECKOUT_TOKEN, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken
    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ECToken(value=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken) other).value);
    }

    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken copy(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken(value);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken eCToken, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = eCToken.value;
        }
        return eCToken.copy(str);
    }
}
