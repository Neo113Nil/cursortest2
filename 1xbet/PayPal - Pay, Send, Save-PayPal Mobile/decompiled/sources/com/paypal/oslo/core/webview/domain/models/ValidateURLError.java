package com.paypal.oslo.core.webview.domain.models;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;", "code", "", "message", "", "extras", "<init>", "(Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/core/webview/domain/models/ValidateURLError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/webview/domain/models/ValidateURLErrorCode;", "getCode", "Ljava/lang/String;", "getMessage", "Ljava/util/Map;", "getExtras"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ValidateURLError {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode code;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final java.lang.String message;

    public ValidateURLError(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateURLErrorCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.code = validateURLErrorCode;
        this.message = str;
        this.extras = map;
    }

    public final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode getCode() {
        return this.code;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ ValidateURLError(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode, java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(validateURLErrorCode, str, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode = this.code;
        java.lang.String str = this.message;
        java.util.Map<java.lang.String, java.lang.String> map = this.extras;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidateURLError(code=");
        sb.append(validateURLErrorCode);
        sb.append(", message=");
        sb.append(str);
        sb.append(", extras=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + this.extras.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.domain.models.ValidateURLError)) {
            return false;
        }
        com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError = (com.paypal.oslo.core.webview.domain.models.ValidateURLError) other;
        return this.code == validateURLError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, validateURLError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, validateURLError.extras);
    }

    public final com.paypal.oslo.core.webview.domain.models.ValidateURLError copy(com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode code, java.lang.String message, java.util.Map<java.lang.String, java.lang.String> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        return new com.paypal.oslo.core.webview.domain.models.ValidateURLError(code, message, extras);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.extras;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode getCode() {
        return this.code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.webview.domain.models.ValidateURLError copy$default(com.paypal.oslo.core.webview.domain.models.ValidateURLError validateURLError, com.paypal.oslo.core.webview.domain.models.ValidateURLErrorCode validateURLErrorCode, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            validateURLErrorCode = validateURLError.code;
        }
        if ((i & 2) != 0) {
            str = validateURLError.message;
        }
        if ((i & 4) != 0) {
            map = validateURLError.extras;
        }
        return validateURLError.copy(validateURLErrorCode, str, map);
    }
}
