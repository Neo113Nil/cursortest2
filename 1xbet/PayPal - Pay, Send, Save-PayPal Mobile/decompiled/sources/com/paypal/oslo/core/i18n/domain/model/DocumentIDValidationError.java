package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "", "<init>", "()V", "ValidationError", "ChecksumError", "MetadataNotFound", "MetadataFetchError", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ChecksumError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataNotFound;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DocumentIDValidationError {
    private DocumentIDValidationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ValidationError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ValidationError validationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationError.reason;
            }
            return validationError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ChecksumError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$ChecksumError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChecksumError extends com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChecksumError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChecksumError(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.ChecksumError checksumError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = checksumError.reason;
            }
            return checksumError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataNotFound;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MetadataNotFound extends com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError {
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetadataNotFound(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataNotFound(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound) other).reason);
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataNotFound metadataNotFound, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = metadataNotFound.reason;
            }
            return metadataNotFound.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "networkError", "<init>", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/core/i18n/domain/model/DocumentIDValidationError$MetadataFetchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getNetworkError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MetadataFetchError extends com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError {
        private final com.paypal.oslo.core.network.http.error.NetworkError networkError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MetadataFetchError(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            this.networkError = networkError;
        }

        public final com.paypal.oslo.core.network.http.error.NetworkError getNetworkError() {
            return this.networkError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.networkError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MetadataFetchError(networkError=");
            sb.append(networkError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkError.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkError, ((com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError) other).networkError);
        }

        public final com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError copy(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            return new com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError(networkError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getNetworkError() {
            return this.networkError;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError copy$default(com.paypal.oslo.core.i18n.domain.model.DocumentIDValidationError.MetadataFetchError metadataFetchError, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkError = metadataFetchError.networkError;
            }
            return metadataFetchError.copy(networkError);
        }
    }

    public /* synthetic */ DocumentIDValidationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
