package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;", "", "", "currentPassword", androidx.autofill.HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmNewPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/ChangePasswordInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCurrentPassword", "getNewPassword", "getConfirmNewPassword"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChangePasswordInput {
    private final java.lang.String confirmNewPassword;
    private final java.lang.String currentPassword;
    private final java.lang.String newPassword;

    public ChangePasswordInput(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.currentPassword = str;
        this.newPassword = str2;
        this.confirmNewPassword = str3;
    }

    public final java.lang.String getCurrentPassword() {
        return this.currentPassword;
    }

    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    public final java.lang.String getConfirmNewPassword() {
        return this.confirmNewPassword;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.currentPassword;
        java.lang.String str2 = this.newPassword;
        java.lang.String str3 = this.confirmNewPassword;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangePasswordInput(currentPassword=");
        sb.append(str);
        sb.append(", newPassword=");
        sb.append(str2);
        sb.append(", confirmNewPassword=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.currentPassword.hashCode() * 31) + this.newPassword.hashCode()) * 31) + this.confirmNewPassword.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput = (com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currentPassword, changePasswordInput.currentPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.newPassword, changePasswordInput.newPassword) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmNewPassword, changePasswordInput.confirmNewPassword);
    }

    public final com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput copy(java.lang.String currentPassword, java.lang.String newPassword, java.lang.String confirmNewPassword) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentPassword, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newPassword, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmNewPassword, "");
        return new com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput(currentPassword, newPassword, confirmNewPassword);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getConfirmNewPassword() {
        return this.confirmNewPassword;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNewPassword() {
        return this.newPassword;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCurrentPassword() {
        return this.currentPassword;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput copy$default(com.paypal.oslo.api.graphql.schema.type.ChangePasswordInput changePasswordInput, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordInput.currentPassword;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordInput.newPassword;
        }
        if ((i & 4) != 0) {
            str3 = changePasswordInput.confirmNewPassword;
        }
        return changePasswordInput.copy(str, str2, str3);
    }
}
