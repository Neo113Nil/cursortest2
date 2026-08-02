package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;", "", "Default", "Error", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface GenericInAppBrowserUiState {

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;", "urlRequest", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "settings", "", "title", "<init>", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;", "component2", "()Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Default;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewURLRequest;", "getUrlRequest", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewSettings;", "getSettings", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState {
        public static final int $stable = com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings.$stable | com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest.$stable;
        private final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings settings;
        private final java.lang.String title;
        private final com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest urlRequest;

        public Default(com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewURLRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewSettings, "");
            this.urlRequest = secureWebViewURLRequest;
            this.settings = secureWebViewSettings;
            this.title = str;
        }

        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest getUrlRequest() {
            return this.urlRequest;
        }

        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings getSettings() {
            return this.settings;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest = this.urlRequest;
            com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings = this.settings;
            java.lang.String str = this.title;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Default(urlRequest=");
            sb.append(secureWebViewURLRequest);
            sb.append(", settings=");
            sb.append(secureWebViewSettings);
            sb.append(", title=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.urlRequest.hashCode();
            int hashCode2 = this.settings.hashCode();
            java.lang.String str = this.title;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r5 = (com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.urlRequest, r5.urlRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.settings, r5.settings) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, r5.title);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default copy(com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest urlRequest, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings settings, java.lang.String title) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlRequest, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "");
            return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default(urlRequest, settings, title);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings getSettings() {
            return this.settings;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest getUrlRequest() {
            return this.urlRequest;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default copy$default(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Default r0, com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest secureWebViewURLRequest, com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings secureWebViewSettings, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                secureWebViewURLRequest = r0.urlRequest;
            }
            if ((i & 2) != 0) {
                secureWebViewSettings = r0.settings;
            }
            if ((i & 4) != 0) {
                str = r0.title;
            }
            return r0.copy(secureWebViewURLRequest, secureWebViewSettings, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Error;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState;", "", "failedUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFailedUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState {
        public static final int $stable = 0;
        private final java.lang.String failedUrl;

        public Error(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.failedUrl = str;
        }

        public final java.lang.String getFailedUrl() {
            return this.failedUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.failedUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(failedUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.failedUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.failedUrl, ((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error) other).failedUrl);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error copy(java.lang.String failedUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedUrl, "");
            return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error(failedUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFailedUrl() {
            return this.failedUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error copy$default(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.failedUrl;
            }
            return error.copy(str);
        }
    }
}
