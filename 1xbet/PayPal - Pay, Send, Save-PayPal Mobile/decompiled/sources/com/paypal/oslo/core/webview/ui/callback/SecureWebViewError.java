package com.paypal.oslo.core.webview.ui.callback;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "", "<init>", "()V", "AuthFailed", "UnauthorizedUrl", "ConfigFailed", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$AuthFailed;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$UnauthorizedUrl;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SecureWebViewError {
    public static final int $stable = 0;

    private SecureWebViewError() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$AuthFailed;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "", "url", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$AuthFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthFailed extends com.paypal.oslo.core.webview.ui.callback.SecureWebViewError {
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
            if (!(other instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed authFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, authFailed.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, authFailed.error);
        }

        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed copy(java.lang.String url, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed(url, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed copy$default(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.AuthFailed authFailed, java.lang.String str, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = authFailed.url;
            }
            if ((i & 2) != 0) {
                webAuthSessionError = authFailed.error;
            }
            return authFailed.copy(str, webAuthSessionError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$UnauthorizedUrl;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "", "url", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$UnauthorizedUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnauthorizedUrl extends com.paypal.oslo.core.webview.ui.callback.SecureWebViewError {
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
            if (!(other instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl unauthorizedUrl = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, unauthorizedUrl.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, unauthorizedUrl.error);
        }

        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl copy(java.lang.String url, com.paypal.oslo.core.webview.domain.models.ValidateURLError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl(url, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.ValidateURLError getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl copy$default(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.UnauthorizedUrl unauthorizedUrl, java.lang.String str, com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unauthorizedUrl.url;
            }
            if ((i & 2) != 0) {
                validateURLError = unauthorizedUrl.error;
            }
            return unauthorizedUrl.copy(str, validateURLError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError;", "", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/webview/ui/callback/SecureWebViewError$ConfigFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfigFailed extends com.paypal.oslo.core.webview.ui.callback.SecureWebViewError {
        public static final int $stable = 8;
        private final java.lang.String message;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigFailed(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.throwable = th;
        }

        public /* synthetic */ ConfigFailed(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigFailed(message=");
            sb.append(str);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.throwable;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed)) {
                return false;
            }
            com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed = (com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, configFailed.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, configFailed.throwable);
        }

        public final com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed copy(java.lang.String message, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed(message, throwable);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed copy$default(com.paypal.oslo.core.webview.ui.callback.SecureWebViewError.ConfigFailed configFailed, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = configFailed.message;
            }
            if ((i & 2) != 0) {
                th = configFailed.throwable;
            }
            return configFailed.copy(str, th);
        }
    }

    public /* synthetic */ SecureWebViewError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
