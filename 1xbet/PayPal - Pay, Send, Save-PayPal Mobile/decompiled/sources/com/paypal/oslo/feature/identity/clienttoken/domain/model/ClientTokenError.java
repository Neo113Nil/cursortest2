package com.paypal.oslo.feature.identity.clienttoken.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError;", "", "Api", "CacheNotAvailable", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError$Api;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError$CacheNotAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientTokenError {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError$Api;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError$Api;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Api implements com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.ApiError error;

        public Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiError, "");
            this.error = apiError;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Api(error=");
            sb.append(apiError);
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
            return (other instanceof com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api) other).error);
        }

        public final com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api copy(com.paypal.oslo.feature.identity.shared.domain.model.ApiError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api copy$default(com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.Api api, com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                apiError = api.error;
            }
            return api.copy(apiError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError$CacheNotAvailable;", "Lcom/paypal/oslo/feature/identity/clienttoken/domain/model/ClientTokenError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CacheNotAvailable implements com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.CacheNotAvailable INSTANCE = new com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.CacheNotAvailable();

        public final int hashCode() {
            return -2120117996;
        }

        private CacheNotAvailable() {
        }

        public final java.lang.String toString() {
            return "CacheNotAvailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.clienttoken.domain.model.ClientTokenError.CacheNotAvailable)) {
                return false;
            }
            return true;
        }
    }
}
