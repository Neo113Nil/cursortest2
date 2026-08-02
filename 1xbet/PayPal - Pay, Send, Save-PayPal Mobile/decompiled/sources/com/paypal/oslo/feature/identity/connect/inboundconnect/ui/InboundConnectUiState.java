package com.paypal.oslo.feature.identity.connect.inboundconnect.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Loading", "WebViewLoading", "Completing", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$Completing;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$Loading;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$WebViewLoading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class InboundConnectUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private InboundConnectUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$Loading;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading();

        public final int hashCode() {
            return -430493670;
        }

        private Loading() {
            super("InboundConnectUiState.Loading", null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$WebViewLoading;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "", "connectUrl", "", "isInitialized", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$WebViewLoading;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConnectUrl", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewLoading extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final boolean isInitialized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewLoading(java.lang.String str, boolean z) {
            super("InboundConnectUiState.WebViewLoading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.connectUrl = str;
            this.isInitialized = z;
        }

        public /* synthetic */ WebViewLoading(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final boolean isInitialized() {
            return this.isInitialized;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.connectUrl;
            boolean z = this.isInitialized;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewLoading(connectUrl=");
            sb.append(str);
            sb.append(", isInitialized=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.connectUrl.hashCode() * 31) + java.lang.Boolean.hashCode(this.isInitialized);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading webViewLoading = (com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, webViewLoading.connectUrl) && this.isInitialized == webViewLoading.isInitialized;
        }

        public final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading copy(java.lang.String connectUrl, boolean isInitialized) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            return new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading(connectUrl, isInitialized);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsInitialized() {
            return this.isInitialized;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading copy$default(com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.WebViewLoading webViewLoading, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewLoading.connectUrl;
            }
            if ((i & 2) != 0) {
                z = webViewLoading.isInitialized;
            }
            return webViewLoading.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState$Completing;", "Lcom/paypal/oslo/feature/identity/connect/inboundconnect/ui/InboundConnectUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Completing extends com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing INSTANCE = new com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing();

        public final int hashCode() {
            return -1013858280;
        }

        private Completing() {
            super("InboundConnectUiState.Completing", null);
        }

        public final java.lang.String toString() {
            return "Completing";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.inboundconnect.ui.InboundConnectUiState.Completing)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ InboundConnectUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
