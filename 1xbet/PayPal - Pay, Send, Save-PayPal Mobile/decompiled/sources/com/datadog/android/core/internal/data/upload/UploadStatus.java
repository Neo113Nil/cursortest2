package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000  2\u00020\u0001:\r !\"#$%&'()*+,B)\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\f-./012345678"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "", "p0", "", "p1", "", "p2", "<init>", "(ZILjava/lang/Throwable;)V", "", "context", "byteSize", "Lcom/datadog/android/api/InternalLogger;", "logger", "attempts", "requestId", "", "logStatus", "(Ljava/lang/String;ILcom/datadog/android/api/InternalLogger;ILjava/lang/String;)V", "code", com.visa.cbp.getEncExpo.warmup, "getCode", "()I", "shouldRetry", "Z", "getShouldRetry", "()Z", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Companion", "DNSError", "HttpClientError", "HttpClientRateLimiting", "HttpRedirection", "HttpServerError", "InvalidTokenError", "NetworkError", "RequestCreationError", "Success", "UnknownException", "UnknownHttpError", "UnknownStatus", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$DNSError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientRateLimiting;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpRedirection;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpServerError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$InvalidTokenError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$NetworkError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$RequestCreationError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$Success;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownException;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownHttpError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownStatus;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class UploadStatus {
    public static final java.lang.String ATTEMPTS_LOG_MESSAGE_FORMAT = " This request was attempted %d time(s).";
    public static final int UNKNOWN_RESPONSE_CODE = 0;
    private final int code;
    private final boolean shouldRetry;
    private final java.lang.Throwable throwable;

    private UploadStatus(boolean z, int i, java.lang.Throwable th) {
        this.shouldRetry = z;
        this.code = i;
        this.throwable = th;
    }

    public /* synthetic */ UploadStatus(boolean z, int i, java.lang.Throwable th, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : th, null);
    }

    public final boolean getShouldRetry() {
        return this.shouldRetry;
    }

    public final int getCode() {
        return this.code;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$Success;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Success extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public Success(int i) {
            super(false, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$NetworkError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.Throwable th) {
            super(true, 0, th, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$DNSError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DNSError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DNSError(java.lang.Throwable th) {
            super(true, 0, th, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$RequestCreationError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequestCreationError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public RequestCreationError(java.lang.Throwable th) {
            super(false, 0, th, 2, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$InvalidTokenError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InvalidTokenError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public InvalidTokenError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpRedirection;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HttpRedirection extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public HttpRedirection(int i) {
            super(false, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HttpClientError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public HttpClientError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpServerError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HttpServerError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public HttpServerError(int i) {
            super(true, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$HttpClientRateLimiting;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HttpClientRateLimiting extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public HttpClientRateLimiting(int i) {
            super(true, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownHttpError;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", "responseCode", "<init>", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownHttpError extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public UnknownHttpError(int i) {
            super(false, i, null, 4, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownException;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownException extends com.datadog.android.core.internal.data.upload.UploadStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownException(java.lang.Throwable th) {
            super(true, 0, th, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/UploadStatus$UnknownStatus;", "Lcom/datadog/android/core/internal/data/upload/UploadStatus;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnknownStatus extends com.datadog.android.core.internal.data.upload.UploadStatus {
        public static final com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus INSTANCE = new com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus();

        private UnknownStatus() {
            super(false, 0, null, 4, null);
        }
    }

    public static /* synthetic */ void logStatus$default(com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus, java.lang.String str, int i, com.datadog.android.api.InternalLogger internalLogger, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logStatus");
        }
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        uploadStatus.logStatus(str, i, internalLogger, i2, str2);
    }

    public static final /* synthetic */ java.lang.String access$buildStatusMessage(com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus, java.lang.String str, int i, java.lang.String str2, java.lang.Throwable th, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Batch [");
            sb2.append(i);
            sb2.append(" bytes] (");
            sb2.append(str2);
            sb2.append(")");
            sb.append(sb2.toString());
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Batch ");
            sb3.append(str);
            sb3.append(" [");
            sb3.append(i);
            sb3.append(" bytes] (");
            sb3.append(str2);
            sb3.append(")");
            sb.append(sb3.toString());
        }
        if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.DNSError) {
            sb.append(" failed because of a DNS error");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientError) {
            sb.append(" failed because of a processing error or invalid data");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientRateLimiting) {
            sb.append(" failed because of an intake rate limitation");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpRedirection) {
            sb.append(" failed because of a network redirection");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpServerError) {
            sb.append(" failed because of a server processing error");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError) {
            sb.append(" failed because your token is invalid");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.NetworkError) {
            sb.append(" failed because of a network error");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError) {
            sb.append(" failed because of an error when creating the request");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownException) {
            sb.append(" failed because of an unknown error");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownHttpError) {
            int i3 = uploadStatus.code;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(" failed because of an unexpected HTTP error (status code = ");
            sb4.append(i3);
            sb4.append(")");
            sb.append(sb4.toString());
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus) {
            sb.append(" status is unknown");
        } else if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success) {
            sb.append(" sent successfully.");
        }
        if (th != null) {
            sb.append(" (");
            sb.append(th.getClass().getName());
            sb.append(": ");
            sb.append(th.getMessage());
            sb.append(")");
        }
        if (uploadStatus.shouldRetry) {
            sb.append("; we will retry later.");
        } else if (!(uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success)) {
            sb.append("; the batch was dropped.");
        }
        if (uploadStatus instanceof com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError) {
            sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
        }
        java.lang.String format = java.lang.String.format(java.util.Locale.US, ATTEMPTS_LOG_MESSAGE_FORMAT, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(uploadStatus.code)}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        sb.append(format);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final void logStatus(final java.lang.String context, final int byteSize, com.datadog.android.api.InternalLogger logger, final int attempts, final java.lang.String requestId) {
        com.datadog.android.api.InternalLogger.Level level;
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        boolean z = this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientError;
        if (z || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpServerError) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownException) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownHttpError)) {
            level = com.datadog.android.api.InternalLogger.Level.ERROR;
        } else if ((this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.DNSError) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientRateLimiting) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpRedirection) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.NetworkError)) {
            level = com.datadog.android.api.InternalLogger.Level.WARN;
        } else {
            if (!(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            level = com.datadog.android.api.InternalLogger.Level.INFO;
        }
        com.datadog.android.api.InternalLogger.Level level2 = level;
        if (z || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpClientRateLimiting) || (this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownStatus)) {
            listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY});
        } else {
            if (!(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.DNSError) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpRedirection) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.HttpServerError) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.InvalidTokenError) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.NetworkError) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.RequestCreationError) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.Success) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownException) && !(this instanceof com.datadog.android.core.internal.data.upload.UploadStatus.UnknownHttpError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            listOf = kotlin.collections.CollectionsKt.listOf(com.datadog.android.api.InternalLogger.Target.USER);
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(logger, level2, listOf, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                com.datadog.android.core.internal.data.upload.UploadStatus uploadStatus = com.datadog.android.core.internal.data.upload.UploadStatus.this;
                return com.datadog.android.core.internal.data.upload.UploadStatus.access$buildStatusMessage(uploadStatus, requestId, byteSize, context, uploadStatus.getThrowable(), attempts);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    public /* synthetic */ UploadStatus(boolean z, int i, java.lang.Throwable th, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, th);
    }
}
