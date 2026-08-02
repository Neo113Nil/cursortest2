package com.paypal.oslo.feature.identity.passwordrecovery.ui.contract;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0006\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/contract/PasswordCriteriaItem;", "", "", "text", "", "isError", "isMet", "<init>", "(Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/identity/passwordrecovery/ui/contract/PasswordCriteriaItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PasswordCriteriaItem {
    public static final int $stable = 0;
    private final boolean isError;
    private final boolean isMet;
    private final java.lang.String text;

    public PasswordCriteriaItem(java.lang.String str, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.isError = z;
        this.isMet = z2;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isMet() {
        return this.isMet;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        boolean z = this.isError;
        boolean z2 = this.isMet;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordCriteriaItem(text=");
        sb.append(str);
        sb.append(", isError=");
        sb.append(z);
        sb.append(", isMet=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.text.hashCode() * 31) + java.lang.Boolean.hashCode(this.isError)) * 31) + java.lang.Boolean.hashCode(this.isMet);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem passwordCriteriaItem = (com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, passwordCriteriaItem.text) && this.isError == passwordCriteriaItem.isError && this.isMet == passwordCriteriaItem.isMet;
    }

    public final com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem copy(java.lang.String text, boolean isError, boolean isMet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        return new com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem(text, isError, isMet);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMet() {
        return this.isMet;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem copy$default(com.paypal.oslo.feature.identity.passwordrecovery.ui.contract.PasswordCriteriaItem passwordCriteriaItem, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = passwordCriteriaItem.text;
        }
        if ((i & 2) != 0) {
            z = passwordCriteriaItem.isError;
        }
        if ((i & 4) != 0) {
            z2 = passwordCriteriaItem.isMet;
        }
        return passwordCriteriaItem.copy(str, z, z2);
    }
}
