package com.paypal.oslo.feature.verificationcapture.api.models;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "", "", "code", "message", "", "isRecoverable", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)Lcom/paypal/oslo/feature/verificationcapture/api/models/VerificationCaptureError;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getMessage", "Z", "Ljava/lang/Throwable;", "getCause", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class VerificationCaptureError {
    public static final java.lang.String CODE_INVALID_DOCUMENT = "INVALID_DOCUMENT";
    public static final java.lang.String CODE_INVALID_INPUT = "INVALID_INPUT";
    public static final java.lang.String CODE_NETWORK_ERROR = "NETWORK_ERROR";
    public static final java.lang.String CODE_NOT_FOUND = "NOT_FOUND";
    public static final java.lang.String CODE_PERMISSION_DENIED = "PERMISSION_DENIED";
    public static final java.lang.String CODE_SERVICE_UNAVAILABLE = "SERVICE_UNAVAILABLE";
    public static final java.lang.String CODE_SESSION_EXPIRED = "SESSION_EXPIRED";
    public static final java.lang.String CODE_TIMEOUT = "TIMEOUT";
    public static final java.lang.String CODE_UNKNOWN = "UNKNOWN";
    public static final java.lang.String CODE_UPLOAD_FAILED = "UPLOAD_FAILED";
    private final java.lang.Throwable cause;
    private final java.lang.String code;
    private final boolean isRecoverable;
    private final java.lang.String message;
    public static final int $stable = 8;

    public VerificationCaptureError(java.lang.String str, java.lang.String str2, boolean z, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.message = str2;
        this.isRecoverable = z;
        this.cause = th;
    }

    public /* synthetic */ VerificationCaptureError(java.lang.String str, java.lang.String str2, boolean z, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th);
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final boolean isRecoverable() {
        return this.isRecoverable;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.message;
        boolean z = this.isRecoverable;
        java.lang.Throwable th = this.cause;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VerificationCaptureError(code=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", isRecoverable=");
        sb.append(z);
        sb.append(", cause=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.code.hashCode();
        int hashCode2 = this.message.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isRecoverable);
        java.lang.Throwable th = this.cause;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (th == null ? 0 : th.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError verificationCaptureError = (com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, verificationCaptureError.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, verificationCaptureError.message) && this.isRecoverable == verificationCaptureError.isRecoverable && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, verificationCaptureError.cause);
    }

    public final com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError copy(java.lang.String code, java.lang.String message, boolean isRecoverable, java.lang.Throwable cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError(code, message, isRecoverable, cause);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRecoverable() {
        return this.isRecoverable;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError copy$default(com.paypal.oslo.feature.verificationcapture.api.models.VerificationCaptureError verificationCaptureError, java.lang.String str, java.lang.String str2, boolean z, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = verificationCaptureError.code;
        }
        if ((i & 2) != 0) {
            str2 = verificationCaptureError.message;
        }
        if ((i & 4) != 0) {
            z = verificationCaptureError.isRecoverable;
        }
        if ((i & 8) != 0) {
            th = verificationCaptureError.cause;
        }
        return verificationCaptureError.copy(str, str2, z, th);
    }
}
