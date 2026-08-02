package com.paypal.oslo.core.webview.ui.state;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "", "<init>", "()V", "Idle", "Loading", "Success", "UnauthorizedUrl", "AuthFailed", "ConfigFailed", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$AuthFailed;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$ConfigFailed;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Idle;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Loading;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Success;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$UnauthorizedUrl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SecureWebViewUIState {
    public static final int $stable = 0;

    private SecureWebViewUIState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Idle;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle INSTANCE = new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle();

        public final int hashCode() {
            return -2139356325;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Loading;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Loading INSTANCE = new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Loading();

        public final int hashCode() {
            return -1872192427;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Success;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "loadableContent", "<init>", "(Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "copy", "(Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;)Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/state/LoadableContent;", "getLoadableContent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadableContent, "");
            this.loadableContent = loadableContent;
        }

        public final com.paypal.oslo.core.webview.ui.state.LoadableContent getLoadableContent() {
            return this.loadableContent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent = this.loadableContent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(loadableContent=");
            sb.append(loadableContent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.loadableContent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadableContent, ((com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success) other).loadableContent);
        }

        public final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success copy(com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadableContent, "");
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success(loadableContent);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.state.LoadableContent getLoadableContent() {
            return this.loadableContent;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success copy$default(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.Success success, com.paypal.oslo.core.webview.ui.state.LoadableContent loadableContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loadableContent = success.loadableContent;
            }
            return success.copy(loadableContent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$UnauthorizedUrl;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "", "url", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$UnauthorizedUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnauthorizedUrl extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.webview.domain.models.ValidateURLError error;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnauthorizedUrl(java.lang.String str, com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateURLError, "");
            this.url = str;
            this.error = validateURLError;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final com.paypal.oslo.core.webview.domain.models.ValidateURLError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnauthorizedUrl(url=");
            sb.append(str);
            sb.append(", error=");
            sb.append(validateURLError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl unauthorizedUrl = (com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, unauthorizedUrl.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, unauthorizedUrl.error);
        }

        public final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl copy(java.lang.String url, com.paypal.oslo.core.webview.domain.models.ValidateURLError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl(url, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.ValidateURLError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl copy$default(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.UnauthorizedUrl unauthorizedUrl, java.lang.String str, com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unauthorizedUrl.url;
            }
            if ((i & 2) != 0) {
                validateURLError = unauthorizedUrl.error;
            }
            return unauthorizedUrl.copy(str, validateURLError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$AuthFailed;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "", "url", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$AuthFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthFailed extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError error;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthFailed(java.lang.String str, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAuthSessionError, "");
            this.url = str;
            this.error = webAuthSessionError;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthFailed(url=");
            sb.append(str);
            sb.append(", error=");
            sb.append(webAuthSessionError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.url.hashCode() * 31) + this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed authFailed = (com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, authFailed.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, authFailed.error);
        }

        public final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed copy(java.lang.String url, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed(url, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed copy$default(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.AuthFailed authFailed, java.lang.String str, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authFailed.url;
            }
            if ((i & 2) != 0) {
                webAuthSessionError = authFailed.error;
            }
            return authFailed.copy(str, webAuthSessionError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$ConfigFailed;", "Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "error", "<init>", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;)V", "component1", "()Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "copy", "(Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;)Lcom/paypal/oslo/core/webview/ui/state/SecureWebViewUIState$ConfigFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfigFailed extends com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigFailed(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFailed, "");
            this.error = configFailed;
        }

        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigFailed(error=");
            sb.append(configFailed);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed) other).error);
        }

        public final com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed copy(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed copy$default(com.paypal.oslo.core.webview.ui.state.SecureWebViewUIState.ConfigFailed configFailed, com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configFailed2 = configFailed.error;
            }
            return configFailed.copy(configFailed2);
        }
    }

    public /* synthetic */ SecureWebViewUIState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
