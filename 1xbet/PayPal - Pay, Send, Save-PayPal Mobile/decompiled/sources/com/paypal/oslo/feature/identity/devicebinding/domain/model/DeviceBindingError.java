package com.paypal.oslo.feature.identity.devicebinding.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "<init>", "()V", "EmptyMethods", "NoEligibleMethods", "KeyGenerationFailed", "Api", "RateLimitExceeded", "ServerError", "NotAuthenticated", "UnsupportedDevice", "MethodNotEligible", "Unknown", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Api;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$EmptyMethods;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$KeyGenerationFailed;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$MethodNotEligible;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$NoEligibleMethods;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$NotAuthenticated;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$RateLimitExceeded;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$ServerError;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Unknown;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$UnsupportedDevice;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DeviceBindingError {
    public static final int $stable = 0;

    private DeviceBindingError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$EmptyMethods;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmptyMethods extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods INSTANCE = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods();

        public final int hashCode() {
            return 1905129609;
        }

        private EmptyMethods() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EmptyMethods";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.EmptyMethods)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$NoEligibleMethods;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoEligibleMethods extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods INSTANCE = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods();

        public final int hashCode() {
            return -2095973002;
        }

        private NoEligibleMethods() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoEligibleMethods";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NoEligibleMethods)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$KeyGenerationFailed;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KeyGenerationFailed extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.KeyGenerationFailed INSTANCE = new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.KeyGenerationFailed();

        public final int hashCode() {
            return -142067568;
        }

        private KeyGenerationFailed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "KeyGenerationFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.KeyGenerationFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Api;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "error", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Api;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/ApiError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Api extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.ApiError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError) {
            super(null);
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
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api) other).error);
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api copy(com.paypal.oslo.feature.identity.shared.domain.model.ApiError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.ApiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Api api, com.paypal.oslo.feature.identity.shared.domain.model.ApiError apiError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                apiError = api.error;
            }
            return api.copy(apiError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$RateLimitExceeded;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "retryAfterSeconds", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$RateLimitExceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRetryAfterSeconds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RateLimitExceeded extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final int retryAfterSeconds;

        public RateLimitExceeded(int i) {
            super(null);
            this.retryAfterSeconds = i;
        }

        public final int getRetryAfterSeconds() {
            return this.retryAfterSeconds;
        }

        public final java.lang.String toString() {
            int i = this.retryAfterSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RateLimitExceeded(retryAfterSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.retryAfterSeconds);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded) && this.retryAfterSeconds == ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded) other).retryAfterSeconds;
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded copy(int retryAfterSeconds) {
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded(retryAfterSeconds);
        }

        /* renamed from: component1, reason: from getter */
        public final int getRetryAfterSeconds() {
            return this.retryAfterSeconds;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.RateLimitExceeded rateLimitExceeded, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = rateLimitExceeded.retryAfterSeconds;
            }
            return rateLimitExceeded.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$ServerError;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServerError extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServerError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(message=");
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
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError) other).message);
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serverError.message;
            }
            return serverError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$NotAuthenticated;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "details", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$NotAuthenticated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotAuthenticated extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final java.lang.String details;

        public NotAuthenticated(java.lang.String str) {
            super(null);
            this.details = str;
        }

        public /* synthetic */ NotAuthenticated(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getDetails() {
            return this.details;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.details;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotAuthenticated(details=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.details;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated) other).details);
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated copy(java.lang.String details) {
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated(details);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDetails() {
            return this.details;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.NotAuthenticated notAuthenticated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = notAuthenticated.details;
            }
            return notAuthenticated.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotAuthenticated() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$UnsupportedDevice;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "details", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$UnsupportedDevice;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedDevice extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final java.lang.String details;

        public UnsupportedDevice(java.lang.String str) {
            super(null);
            this.details = str;
        }

        public /* synthetic */ UnsupportedDevice(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getDetails() {
            return this.details;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.details;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnsupportedDevice(details=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.details;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice) other).details);
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice copy(java.lang.String details) {
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice(details);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDetails() {
            return this.details;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.UnsupportedDevice unsupportedDevice, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unsupportedDevice.details;
            }
            return unsupportedDevice.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedDevice() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$MethodNotEligible;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$MethodNotEligible;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "getMethod"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MethodNotEligible extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MethodNotEligible(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceAuthMethod, "");
            this.method = deviceAuthMethod;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod getMethod() {
            return this.method;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = this.method;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MethodNotEligible(method=");
            sb.append(deviceAuthMethod);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.method.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible) && this.method == ((com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible) other).method;
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible copy(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible(method);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod getMethod() {
            return this.method;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.MethodNotEligible methodNotEligible, com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                deviceAuthMethod = methodNotEligible.method;
            }
            return methodNotEligible.copy(deviceAuthMethod);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Unknown;", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/identity/devicebinding/domain/model/DeviceBindingError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ Unknown(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown)) {
                return false;
            }
            com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown unknown = (com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unknown.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unknown.cause);
        }

        public final com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown copy$default(com.paypal.oslo.feature.identity.devicebinding.domain.model.DeviceBindingError.Unknown unknown, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            if ((i & 2) != 0) {
                th = unknown.cause;
            }
            return unknown.copy(str, th);
        }
    }

    public /* synthetic */ DeviceBindingError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
