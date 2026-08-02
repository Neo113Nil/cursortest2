package com.paypal.oslo.downloads.api.validation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/downloads/api/validation/ContentValidationError;", "", "", "message", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;)Lcom/paypal/oslo/downloads/api/validation/ContentValidationError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/downloads/api/validation/ContentValidationType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContentValidationError {
    private final java.lang.String message;
    private final com.paypal.oslo.downloads.api.validation.ContentValidationType type;

    public ContentValidationError(java.lang.String str, com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentValidationType, "");
        this.message = str;
        this.type = contentValidationType;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final com.paypal.oslo.downloads.api.validation.ContentValidationType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentValidationError(message=");
        sb.append(str);
        sb.append(", type=");
        sb.append(contentValidationType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.message.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.api.validation.ContentValidationError)) {
            return false;
        }
        com.paypal.oslo.downloads.api.validation.ContentValidationError contentValidationError = (com.paypal.oslo.downloads.api.validation.ContentValidationError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, contentValidationError.message) && this.type == contentValidationError.type;
    }

    public final com.paypal.oslo.downloads.api.validation.ContentValidationError copy(java.lang.String message, com.paypal.oslo.downloads.api.validation.ContentValidationType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.downloads.api.validation.ContentValidationError(message, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.downloads.api.validation.ContentValidationType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.api.validation.ContentValidationError copy$default(com.paypal.oslo.downloads.api.validation.ContentValidationError contentValidationError, java.lang.String str, com.paypal.oslo.downloads.api.validation.ContentValidationType contentValidationType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contentValidationError.message;
        }
        if ((i & 2) != 0) {
            contentValidationType = contentValidationError.type;
        }
        return contentValidationError.copy(str, contentValidationType);
    }
}
