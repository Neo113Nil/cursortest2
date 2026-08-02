package com.paypal.oslo.core.i18n.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "", "<init>", "()V", "MetadataFetchError", "ParsingFailure", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$ParsingFailure;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CurrencyMetadataError {
    private CurrencyMetadataError() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$MetadataFetchError;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "networkError", "<init>", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$MetadataFetchError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getNetworkError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MetadataFetchError extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError {
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
            return (other instanceof com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkError, ((com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError) other).networkError);
        }

        public final com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError copy(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            return new com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError(networkError);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getNetworkError() {
            return this.networkError;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError copy$default(com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.MetadataFetchError metadataFetchError, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkError = metadataFetchError.networkError;
            }
            return metadataFetchError.copy(networkError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$ParsingFailure;", "Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/core/i18n/domain/error/CurrencyMetadataError$ParsingFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ParsingFailure extends com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError {
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParsingFailure(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ ParsingFailure(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParsingFailure(message=");
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
            if (!(other instanceof com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure)) {
                return false;
            }
            com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure parsingFailure = (com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, parsingFailure.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, parsingFailure.cause);
        }

        public final com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure copy$default(com.paypal.oslo.core.i18n.domain.error.CurrencyMetadataError.ParsingFailure parsingFailure, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = parsingFailure.message;
            }
            if ((i & 2) != 0) {
                th = parsingFailure.cause;
            }
            return parsingFailure.copy(str, th);
        }
    }

    public /* synthetic */ CurrencyMetadataError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
