package com.paypal.oslo.core.network.sse.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "", "ConnectionError", "ParseError", "UnknownError", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ConnectionError;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ParseError;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError$UnknownError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface SseError {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ConnectionError;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "error", "<init>", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)V", "component1", "()Lcom/paypal/oslo/core/network/http/error/NetworkError;", "copy", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ConnectionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConnectionError implements com.paypal.oslo.core.network.sse.domain.error.SseError {
        private final com.paypal.oslo.core.network.http.error.NetworkError error;

        public ConnectionError(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkError, "");
            this.error = networkError;
        }

        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.network.http.error.NetworkError networkError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConnectionError(error=");
            sb.append(networkError);
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
            return (other instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError) other).error);
        }

        public final com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError copy(com.paypal.oslo.core.network.http.error.NetworkError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.network.http.error.NetworkError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError copy$default(com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError connectionError, com.paypal.oslo.core.network.http.error.NetworkError networkError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                networkError = connectionError.error;
            }
            return connectionError.copy(networkError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ParseError;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", com.google.firebase.messaging.Constants.MessagePayloadKeys.RAW_DATA, "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "component1", "()Ljava/lang/Throwable;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/paypal/oslo/core/network/sse/domain/error/SseError$ParseError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Throwable;", "getThrowable", "Ljava/lang/String;", "getRawData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ParseError implements com.paypal.oslo.core.network.sse.domain.error.SseError {
        private final java.lang.String rawData;
        private final java.lang.Throwable throwable;

        public ParseError(java.lang.Throwable th, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.throwable = th;
            this.rawData = str;
        }

        public final java.lang.String getRawData() {
            return this.rawData;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.String str = this.rawData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ParseError(throwable=");
            sb.append(th);
            sb.append(", rawData=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.throwable.hashCode() * 31) + this.rawData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError)) {
                return false;
            }
            com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError parseError = (com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, parseError.throwable) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawData, parseError.rawData);
        }

        public final com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError copy(java.lang.Throwable throwable, java.lang.String rawData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawData, "");
            return new com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError(throwable, rawData);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRawData() {
            return this.rawData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError copy$default(com.paypal.oslo.core.network.sse.domain.error.SseError.ParseError parseError, java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = parseError.throwable;
            }
            if ((i & 2) != 0) {
                str = parseError.rawData;
            }
            return parseError.copy(th, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/error/SseError$UnknownError;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/network/sse/domain/error/SseError$UnknownError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownError implements com.paypal.oslo.core.network.sse.domain.error.SseError {
        private final java.lang.Throwable throwable;

        public UnknownError(java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnknownError(throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.throwable.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError) other).throwable);
        }

        public final com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError copy(java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
            return new com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError copy$default(com.paypal.oslo.core.network.sse.domain.error.SseError.UnknownError unknownError, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = unknownError.throwable;
            }
            return unknownError.copy(th);
        }
    }
}
