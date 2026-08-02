package com.paypal.oslo.core.webview.domain.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;", "", "<init>", "()V", "UrlValidationError", "SessionAuthorizationFailure", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$SessionAuthorizationFailure;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$UrlValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class WebAuthSessionAuthorizationError {
    public static final int $stable = 0;

    private WebAuthSessionAuthorizationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$UrlValidationError;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "error", "<init>", "(Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)V", "component1", "()Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "copy", "(Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;)Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$UrlValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UrlValidationError extends com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.webview.domain.models.ValidateURLError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlValidationError(com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateURLError, "");
            this.error = validateURLError;
        }

        public final com.paypal.oslo.core.webview.domain.models.ValidateURLError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UrlValidationError(error=");
            sb.append(validateURLError);
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
            return (other instanceof com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError) other).error);
        }

        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError copy(com.paypal.oslo.core.webview.domain.models.ValidateURLError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.ValidateURLError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError copy$default(com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.UrlValidationError urlValidationError, com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                validateURLError = urlValidationError.error;
            }
            return urlValidationError.copy(validateURLError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$SessionAuthorizationFailure;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "error", "<init>", "(Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)V", "component1", "()Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "copy", "(Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;)Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionAuthorizationError$SessionAuthorizationFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/webview/domain/models/WebAuthSessionError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SessionAuthorizationFailure extends com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError {
        public static final int $stable = 0;
        private final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionAuthorizationFailure(com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAuthSessionError, "");
            this.error = webAuthSessionError;
        }

        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionAuthorizationFailure(error=");
            sb.append(webAuthSessionError);
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
            return (other instanceof com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure) other).error);
        }

        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure copy(com.paypal.oslo.core.webview.domain.models.WebAuthSessionError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.webview.domain.models.WebAuthSessionError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure copy$default(com.paypal.oslo.core.webview.domain.models.WebAuthSessionAuthorizationError.SessionAuthorizationFailure sessionAuthorizationFailure, com.paypal.oslo.core.webview.domain.models.WebAuthSessionError webAuthSessionError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webAuthSessionError = sessionAuthorizationFailure.error;
            }
            return sessionAuthorizationFailure.copy(webAuthSessionError);
        }
    }

    public /* synthetic */ WebAuthSessionAuthorizationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
