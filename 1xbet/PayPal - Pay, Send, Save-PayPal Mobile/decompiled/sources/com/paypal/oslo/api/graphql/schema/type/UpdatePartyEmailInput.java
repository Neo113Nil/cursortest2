package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyEmailInput;", "", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "primary", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/Object;Z)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePartyEmailInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getEmailAddress", "Z", "getPrimary"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UpdatePartyEmailInput {
    private final java.lang.Object emailAddress;
    private final java.lang.String id;
    private final boolean primary;

    public UpdatePartyEmailInput(java.lang.String str, java.lang.Object obj, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = str;
        this.emailAddress = obj;
        this.primary = z;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.Object obj = this.emailAddress;
        boolean z = this.primary;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdatePartyEmailInput(id=");
        sb.append(str);
        sb.append(", emailAddress=");
        sb.append(obj);
        sb.append(", primary=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput updatePartyEmailInput = (com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, updatePartyEmailInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, updatePartyEmailInput.emailAddress) && this.primary == updatePartyEmailInput.primary;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput copy(java.lang.String id, java.lang.Object emailAddress, boolean primary) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput(id, emailAddress, primary);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput copy$default(com.paypal.oslo.api.graphql.schema.type.UpdatePartyEmailInput updatePartyEmailInput, java.lang.String str, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = updatePartyEmailInput.id;
        }
        if ((i & 2) != 0) {
            obj = updatePartyEmailInput.emailAddress;
        }
        if ((i & 4) != 0) {
            z = updatePartyEmailInput.primary;
        }
        return updatePartyEmailInput.copy(str, obj, z);
    }
}
