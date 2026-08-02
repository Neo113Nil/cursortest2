package com.paypal.oslo.feature.paymentauth.api.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "", "<init>", "()V", "NetworkError", "SdkInitializationError", "InvalidRequest", "Timeout", "Cancelled", "ServiceError", "UnsupportedMechanism", "Unknown", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Cancelled;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$InvalidRequest;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$NetworkError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$SdkInitializationError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$ServiceError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Timeout;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Unknown;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$UnsupportedMechanism;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentAuthError {
    public static final int $stable = 0;

    private PaymentAuthError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$NetworkError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "", "details", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        private final java.lang.String details;

        public NetworkError(java.lang.String str) {
            super(null);
            this.details = str;
        }

        public /* synthetic */ NetworkError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getDetails() {
            return this.details;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.details;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(details=");
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
            return (other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError) other).details);
        }

        public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError copy(java.lang.String details) {
            return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError(details);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDetails() {
            return this.details;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.details;
            }
            return networkError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$SdkInitializationError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "", "sdkErrorCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$SdkInitializationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSdkErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkInitializationError extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        private final java.lang.String sdkErrorCode;

        public SdkInitializationError(java.lang.String str) {
            super(null);
            this.sdkErrorCode = str;
        }

        public /* synthetic */ SdkInitializationError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getSdkErrorCode() {
            return this.sdkErrorCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sdkErrorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkInitializationError(sdkErrorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.sdkErrorCode;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkErrorCode, ((com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError) other).sdkErrorCode);
        }

        public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError copy(java.lang.String sdkErrorCode) {
            return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError(sdkErrorCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSdkErrorCode() {
            return this.sdkErrorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.SdkInitializationError sdkInitializationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sdkInitializationError.sdkErrorCode;
            }
            return sdkInitializationError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SdkInitializationError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$InvalidRequest;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InvalidRequest extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.InvalidRequest INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.InvalidRequest();

        public final int hashCode() {
            return 796746946;
        }

        private InvalidRequest() {
            super(null);
        }

        public final java.lang.String toString() {
            return "InvalidRequest";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.InvalidRequest)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Timeout;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Timeout extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Timeout INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Timeout();

        public final int hashCode() {
            return -1538774921;
        }

        private Timeout() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Timeout";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Timeout)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Cancelled;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Cancelled INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Cancelled();

        public final int hashCode() {
            return -868837657;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$ServiceError;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "", "details", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$ServiceError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDetails"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ServiceError extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        private final java.lang.String details;

        public ServiceError(java.lang.String str) {
            super(null);
            this.details = str;
        }

        public /* synthetic */ ServiceError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getDetails() {
            return this.details;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.details;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ServiceError(details=");
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
            return (other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError) && kotlin.jvm.internal.Intrinsics.areEqual(this.details, ((com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError) other).details);
        }

        public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError copy(java.lang.String details) {
            return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError(details);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDetails() {
            return this.details;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.ServiceError serviceError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = serviceError.details;
            }
            return serviceError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ServiceError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$UnsupportedMechanism;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnsupportedMechanism extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.UnsupportedMechanism INSTANCE = new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.UnsupportedMechanism();

        public final int hashCode() {
            return 494822734;
        }

        private UnsupportedMechanism() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UnsupportedMechanism";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.UnsupportedMechanism)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Unknown;", "Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/paymentauth/api/model/PaymentAuthError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(message=");
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
            return (other instanceof com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown) other).message);
        }

        public final com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown copy$default(com.paypal.oslo.feature.paymentauth.api.model.PaymentAuthError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.message;
            }
            return unknown.copy(str);
        }
    }

    public /* synthetic */ PaymentAuthError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
