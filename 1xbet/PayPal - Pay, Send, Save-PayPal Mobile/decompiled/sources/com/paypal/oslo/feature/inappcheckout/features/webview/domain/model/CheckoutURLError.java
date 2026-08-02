package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "", "<init>", "()V", "TransferSessionError", "AuthenticationPromptRequired", "CheckoutPreferencesError", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$AuthenticationPromptRequired;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$TransferSessionError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class CheckoutURLError {
    public static final int $stable = 0;

    private CheckoutURLError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$TransferSessionError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "transferError", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$TransferSessionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "getTransferError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransferSessionError extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.identity.domain.model.WebSessionTransferError transferError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransferSessionError(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSessionTransferError, "");
            this.transferError = webSessionTransferError;
        }

        public final com.paypal.oslo.core.identity.domain.model.WebSessionTransferError getTransferError() {
            return this.transferError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError = this.transferError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferSessionError(transferError=");
            sb.append(webSessionTransferError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.transferError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferError, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError) other).transferError);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError copy(com.paypal.oslo.core.identity.domain.model.WebSessionTransferError transferError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferError, "");
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError(transferError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.identity.domain.model.WebSessionTransferError getTransferError() {
            return this.transferError;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.TransferSessionError transferSessionError, com.paypal.oslo.core.identity.domain.model.WebSessionTransferError webSessionTransferError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                webSessionTransferError = transferSessionError.transferError;
            }
            return transferSessionError.copy(webSessionTransferError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$AuthenticationPromptRequired;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "checkoutAuthenticationContext", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$AuthenticationPromptRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "getCheckoutAuthenticationContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AuthenticationPromptRequired extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationPromptRequired(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
            this.checkoutAuthenticationContext = checkoutAuthenticationContext;
        }

        public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
            return this.checkoutAuthenticationContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = this.checkoutAuthenticationContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationPromptRequired(checkoutAuthenticationContext=");
            sb.append(checkoutAuthenticationContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.checkoutAuthenticationContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutAuthenticationContext, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired) other).checkoutAuthenticationContext);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired copy(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutAuthenticationContext, "");
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired(checkoutAuthenticationContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext getCheckoutAuthenticationContext() {
            return this.checkoutAuthenticationContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.AuthenticationPromptRequired authenticationPromptRequired, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                checkoutAuthenticationContext = authenticationPromptRequired.checkoutAuthenticationContext;
            }
            return authenticationPromptRequired.copy(checkoutAuthenticationContext);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError;", "<init>", "()V", "NetworkError", "GraphQLError", "DataError", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$DataError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$GraphQLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$NetworkError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class CheckoutPreferencesError extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError {
        public static final int $stable = 0;

        private CheckoutPreferencesError() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$NetworkError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NetworkError extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NetworkError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(message=");
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError) other).message);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = networkError.message;
                }
                return networkError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$GraphQLError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$GraphQLError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError {
            public static final int $stable = 8;
            private final java.util.List<java.lang.String> errors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GraphQLError(java.util.List<java.lang.String> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errors = list;
            }

            public final java.util.List<java.lang.String> getErrors() {
                return this.errors;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errors;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(errors=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errors.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError) other).errors);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError copy(java.util.List<java.lang.String> errors) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError(errors);
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errors;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.GraphQLError graphQLError, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = graphQLError.errors;
                }
                return graphQLError.copy(list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$DataError;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLError$CheckoutPreferencesError$DataError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataError extends com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DataError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataError(message=");
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
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError) other).message);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError copy$default(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLError.CheckoutPreferencesError.DataError dataError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dataError.message;
                }
                return dataError.copy(str);
            }
        }

        public /* synthetic */ CheckoutPreferencesError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutURLError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
