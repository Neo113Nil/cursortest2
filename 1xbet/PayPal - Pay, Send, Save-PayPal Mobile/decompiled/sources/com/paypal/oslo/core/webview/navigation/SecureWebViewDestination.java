package com.paypal.oslo.core.webview.navigation;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;)V", "component1", "()Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", "copy", "(Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;)Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/navigation/SecureWebViewDestinationData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes10.dex */
public final /* data */ class SecureWebViewDestination implements androidx.navigation3.runtime.NavKey {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData data;

    public SecureWebViewDestination(com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewDestinationData, "");
        this.data = secureWebViewDestinationData;
    }

    public final com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData getData() {
        return this.data;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureWebViewDestination(data=");
        sb.append(secureWebViewDestinationData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.core.webview.navigation.SecureWebViewDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.core.webview.navigation.SecureWebViewDestination) other).data);
    }

    public final com.paypal.oslo.core.webview.navigation.SecureWebViewDestination copy(com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.core.webview.navigation.SecureWebViewDestination(data);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData getData() {
        return this.data;
    }

    public static /* synthetic */ com.paypal.oslo.core.webview.navigation.SecureWebViewDestination copy$default(com.paypal.oslo.core.webview.navigation.SecureWebViewDestination secureWebViewDestination, com.paypal.oslo.core.webview.navigation.SecureWebViewDestinationData secureWebViewDestinationData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            secureWebViewDestinationData = secureWebViewDestination.data;
        }
        return secureWebViewDestination.copy(secureWebViewDestinationData);
    }
}
