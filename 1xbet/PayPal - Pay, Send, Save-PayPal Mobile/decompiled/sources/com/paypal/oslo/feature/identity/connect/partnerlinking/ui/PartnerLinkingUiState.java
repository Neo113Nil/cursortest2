package com.paypal.oslo.feature.identity.connect.partnerlinking.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "<init>", "()V", "Initial", "InitializingOAuth", "WebViewReady", "Error", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$Error;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$Initial;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$InitializingOAuth;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$WebViewReady;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class PartnerLinkingUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;

    private PartnerLinkingUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$Initial;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial();
        private static final java.lang.String name = "Initial";

        public final int hashCode() {
            return 704826116;
        }

        private Initial() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$InitializingOAuth;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializingOAuth extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth INSTANCE = new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth();
        private static final java.lang.String name = "InitializingOAuth";

        public final int hashCode() {
            return -1575699926;
        }

        private InitializingOAuth() {
            super(null);
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "InitializingOAuth";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.InitializingOAuth)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$WebViewReady;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "", "connectUrl", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$WebViewReady;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConnectUrl", "getReturnUrl", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WebViewReady extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState {
        public static final int $stable = 0;
        private final java.lang.String connectUrl;
        private final java.lang.String name;
        private final java.lang.String returnUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewReady(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.connectUrl = str;
            this.returnUrl = str2;
            this.name = "WebViewReady";
        }

        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.connectUrl;
            java.lang.String str2 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WebViewReady(connectUrl=");
            sb.append(str);
            sb.append(", returnUrl=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.connectUrl.hashCode() * 31) + this.returnUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady)) {
                return false;
            }
            com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady webViewReady = (com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.connectUrl, webViewReady.connectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, webViewReady.returnUrl);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady copy(java.lang.String connectUrl, java.lang.String returnUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(returnUrl, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady(connectUrl, returnUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConnectUrl() {
            return this.connectUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.WebViewReady webViewReady, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = webViewReady.connectUrl;
            }
            if ((i & 2) != 0) {
                str2 = webViewReady.returnUrl;
            }
            return webViewReady.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$Error;", "Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/connect/partnerlinking/ui/PartnerLinkingUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final java.lang.String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.name = "Error";
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error copy$default(com.paypal.oslo.feature.identity.connect.partnerlinking.ui.PartnerLinkingUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ PartnerLinkingUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
