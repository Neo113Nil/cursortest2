package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u0006\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "", "", "code", "message", "", "isRecoverable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getMessage", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiError {
    public static final int $stable = 0;
    private final java.lang.String code;
    private final boolean isRecoverable;
    private final java.lang.String message;

    public UiError(java.lang.String str, java.lang.String str2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.code = str;
        this.message = str2;
        this.isRecoverable = z;
    }

    public /* synthetic */ UiError(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
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

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.message;
        boolean z = this.isRecoverable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UiError(code=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", isRecoverable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.code.hashCode() * 31) + this.message.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRecoverable);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, uiError.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, uiError.message) && this.isRecoverable == uiError.isRecoverable;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError copy(java.lang.String code, java.lang.String message, boolean isRecoverable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError(code, message, isRecoverable);
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

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uiError.code;
        }
        if ((i & 2) != 0) {
            str2 = uiError.message;
        }
        if ((i & 4) != 0) {
            z = uiError.isRecoverable;
        }
        return uiError.copy(str, str2, z);
    }
}
