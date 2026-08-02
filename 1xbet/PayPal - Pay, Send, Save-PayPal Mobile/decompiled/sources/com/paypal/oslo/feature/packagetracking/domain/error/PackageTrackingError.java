package com.paypal.oslo.feature.packagetracking.domain.error;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "", "", "message", "errorCode", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "getErrorCode", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PackageTrackingError {
    public static final int $stable = 8;
    private final java.lang.Throwable cause;
    private final java.lang.String errorCode;
    private final java.lang.String message;

    public PackageTrackingError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.errorCode = str2;
        this.cause = th;
    }

    public /* synthetic */ PackageTrackingError(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.lang.String str2 = this.errorCode;
        java.lang.Throwable th = this.cause;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PackageTrackingError(message=");
        sb.append(str);
        sb.append(", errorCode=");
        sb.append(str2);
        sb.append(", cause=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        java.lang.String str = this.errorCode;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Throwable th = this.cause;
        return (((hashCode * 31) + hashCode2) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError = (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, packageTrackingError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, packageTrackingError.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, packageTrackingError.cause);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError copy(java.lang.String message, java.lang.String errorCode, java.lang.Throwable cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError(message, errorCode, cause);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Throwable getCause() {
        return this.cause;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError copy$default(com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = packageTrackingError.message;
        }
        if ((i & 2) != 0) {
            str2 = packageTrackingError.errorCode;
        }
        if ((i & 4) != 0) {
            th = packageTrackingError.cause;
        }
        return packageTrackingError.copy(str, str2, th);
    }
}
