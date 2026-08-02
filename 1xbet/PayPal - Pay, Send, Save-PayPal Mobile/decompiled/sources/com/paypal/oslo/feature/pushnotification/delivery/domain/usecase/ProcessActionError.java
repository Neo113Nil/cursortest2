package com.paypal.oslo.feature.pushnotification.delivery.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError;", "", "InvalidInput", "NotAuthenticated", "ApiCallFailed", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$ApiCallFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$InvalidInput;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$NotAuthenticated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ProcessActionError {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$InvalidInput;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidInput implements com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.InvalidInput INSTANCE = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.InvalidInput();

        public final int hashCode() {
            return -1657451201;
        }

        private InvalidInput() {
        }

        public final java.lang.String toString() {
            return "InvalidInput";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.InvalidInput)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$NotAuthenticated;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotAuthenticated implements com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.NotAuthenticated INSTANCE = new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.NotAuthenticated();

        public final int hashCode() {
            return -622303416;
        }

        private NotAuthenticated() {
        }

        public final java.lang.String toString() {
            return "NotAuthenticated";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.NotAuthenticated)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$ApiCallFailed;", "Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "<init>", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)V", "component1", "()Lcom/paypal/oslo/core/network/graphql/error/CallError;", "copy", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/pushnotification/delivery/domain/usecase/ProcessActionError$ApiCallFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiCallFailed implements com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.network.graphql.error.CallError error;

        public ApiCallFailed(com.paypal.oslo.core.network.graphql.error.CallError callError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
            this.error = callError;
        }

        public final com.paypal.oslo.core.network.graphql.error.CallError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.graphql.error.CallError callError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiCallFailed(error=");
            sb.append(callError);
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
            return (other instanceof com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed) other).error);
        }

        public final com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed copy(com.paypal.oslo.core.network.graphql.error.CallError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.graphql.error.CallError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed copy$default(com.paypal.oslo.feature.pushnotification.delivery.domain.usecase.ProcessActionError.ApiCallFailed apiCallFailed, com.paypal.oslo.core.network.graphql.error.CallError callError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                callError = apiCallFailed.error;
            }
            return apiCallFailed.copy(callError);
        }
    }
}
