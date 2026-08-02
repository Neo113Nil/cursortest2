package com.paypal.oslo.downloads.api;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/downloads/api/HttpDownloadError;", "", "<init>", "()V", "NetworkRelated", "NetworkError", "TimeoutError", "MimeTypeMismatch", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$MimeTypeMismatch;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkRelated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class HttpDownloadError {
    private HttpDownloadError() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkRelated;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError;", "<init>", "()V", "", "getMessage", "()Ljava/lang/String;", "message", "", "getCause", "()Ljava/lang/Throwable;", "cause", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkError;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$TimeoutError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class NetworkRelated extends com.paypal.oslo.downloads.api.HttpDownloadError {
        public abstract java.lang.Throwable getCause();

        public abstract java.lang.String getMessage();

        private NetworkRelated() {
            super(null);
        }

        public /* synthetic */ NetworkRelated(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkError;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkRelated;", "Ljava/io/IOException;", "cause", "", "message", "<init>", "(Ljava/io/IOException;Ljava/lang/String;)V", "component1", "()Ljava/io/IOException;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/io/IOException;Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/io/IOException;", "getCause", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkError extends com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated {
        private final java.io.IOException cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.io.IOException iOException, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cause = iOException;
            this.message = str;
        }

        @Override // com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated
        public final java.io.IOException getCause() {
            return this.cause;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ NetworkError(java.io.IOException iOException, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(iOException, str);
            if ((i & 2) != 0 && (str = iOException.getMessage()) == null) {
                str = com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR;
            }
        }

        @Override // com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.io.IOException iOException = this.cause;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(cause=");
            sb.append(iOException);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cause.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError networkError = (com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cause, networkError.cause) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, networkError.message);
        }

        public final com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError copy(java.io.IOException cause, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError(cause, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.io.IOException getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError copy$default(com.paypal.oslo.downloads.api.HttpDownloadError.NetworkError networkError, java.io.IOException iOException, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                iOException = networkError.cause;
            }
            if ((i & 2) != 0) {
                str = networkError.message;
            }
            return networkError.copy(iOException, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/HttpDownloadError$TimeoutError;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError$NetworkRelated;", "Ljava/net/SocketTimeoutException;", "cause", "", "message", "<init>", "(Ljava/net/SocketTimeoutException;Ljava/lang/String;)V", "component1", "()Ljava/net/SocketTimeoutException;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/net/SocketTimeoutException;Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/HttpDownloadError$TimeoutError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/net/SocketTimeoutException;", "getCause", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TimeoutError extends com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated {
        private final java.net.SocketTimeoutException cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimeoutError(java.net.SocketTimeoutException socketTimeoutException, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(socketTimeoutException, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cause = socketTimeoutException;
            this.message = str;
        }

        @Override // com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated
        public final java.net.SocketTimeoutException getCause() {
            return this.cause;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ TimeoutError(java.net.SocketTimeoutException socketTimeoutException, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(socketTimeoutException, str);
            if ((i & 2) != 0 && (str = socketTimeoutException.getMessage()) == null) {
                str = "Download timed out";
            }
        }

        @Override // com.paypal.oslo.downloads.api.HttpDownloadError.NetworkRelated
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.net.SocketTimeoutException socketTimeoutException = this.cause;
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeoutError(cause=");
            sb.append(socketTimeoutException);
            sb.append(", message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cause.hashCode() * 31) + this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError)) {
                return false;
            }
            com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError timeoutError = (com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cause, timeoutError.cause) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, timeoutError.message);
        }

        public final com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError copy(java.net.SocketTimeoutException cause, java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError(cause, message);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final java.net.SocketTimeoutException getCause() {
            return this.cause;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError copy$default(com.paypal.oslo.downloads.api.HttpDownloadError.TimeoutError timeoutError, java.net.SocketTimeoutException socketTimeoutException, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                socketTimeoutException = timeoutError.cause;
            }
            if ((i & 2) != 0) {
                str = timeoutError.message;
            }
            return timeoutError.copy(socketTimeoutException, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/api/HttpDownloadError$MimeTypeMismatch;", "Lcom/paypal/oslo/downloads/api/HttpDownloadError;", "", "expectedMimeType", "actualMimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/downloads/api/HttpDownloadError$MimeTypeMismatch;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getExpectedMimeType", "getActualMimeType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MimeTypeMismatch extends com.paypal.oslo.downloads.api.HttpDownloadError {
        private final java.lang.String actualMimeType;
        private final java.lang.String expectedMimeType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MimeTypeMismatch(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.expectedMimeType = str;
            this.actualMimeType = str2;
        }

        public final java.lang.String getExpectedMimeType() {
            return this.expectedMimeType;
        }

        public final java.lang.String getActualMimeType() {
            return this.actualMimeType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.expectedMimeType;
            java.lang.String str2 = this.actualMimeType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MimeTypeMismatch(expectedMimeType=");
            sb.append(str);
            sb.append(", actualMimeType=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.expectedMimeType.hashCode() * 31) + this.actualMimeType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch)) {
                return false;
            }
            com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch mimeTypeMismatch = (com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.expectedMimeType, mimeTypeMismatch.expectedMimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.actualMimeType, mimeTypeMismatch.actualMimeType);
        }

        public final com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch copy(java.lang.String expectedMimeType, java.lang.String actualMimeType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expectedMimeType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualMimeType, "");
            return new com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch(expectedMimeType, actualMimeType);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getActualMimeType() {
            return this.actualMimeType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getExpectedMimeType() {
            return this.expectedMimeType;
        }

        public static /* synthetic */ com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch copy$default(com.paypal.oslo.downloads.api.HttpDownloadError.MimeTypeMismatch mimeTypeMismatch, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = mimeTypeMismatch.expectedMimeType;
            }
            if ((i & 2) != 0) {
                str2 = mimeTypeMismatch.actualMimeType;
            }
            return mimeTypeMismatch.copy(str, str2);
        }
    }

    public /* synthetic */ HttpDownloadError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
