package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "", "", "message", "", "messageRes", "", "isPersistent", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getMessageRes", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UiError {
    public static final int $stable = 0;
    private final boolean isPersistent;
    private final java.lang.String message;
    private final java.lang.Integer messageRes;

    public UiError(java.lang.String str, java.lang.Integer num, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.messageRes = num;
        this.isPersistent = z;
    }

    public /* synthetic */ UiError(java.lang.String str, java.lang.Integer num, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.Integer getMessageRes() {
        return this.messageRes;
    }

    public final boolean isPersistent() {
        return this.isPersistent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.lang.Integer num = this.messageRes;
        boolean z = this.isPersistent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UiError(message=");
        sb.append(str);
        sb.append(", messageRes=");
        sb.append(num);
        sb.append(", isPersistent=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        java.lang.Integer num = this.messageRes;
        return (((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isPersistent);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, uiError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageRes, uiError.messageRes) && this.isPersistent == uiError.isPersistent;
    }

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError copy(java.lang.String message, java.lang.Integer messageRes, boolean isPersistent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError(message, messageRes, isPersistent);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsPersistent() {
        return this.isPersistent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getMessageRes() {
        return this.messageRes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError, java.lang.String str, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = uiError.message;
        }
        if ((i & 2) != 0) {
            num = uiError.messageRes;
        }
        if ((i & 4) != 0) {
            z = uiError.isPersistent;
        }
        return uiError.copy(str, num, z);
    }

    public UiError() {
        this(null, null, false, 7, null);
    }
}
