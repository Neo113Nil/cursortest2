package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddPartyPhoneInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phoneNumber", "", "primary", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "type", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;ZLcom/paypal/oslo/api/graphql/schema/type/PhoneType;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;ZLcom/paypal/oslo/api/graphql/schema/type/PhoneType;)Lcom/paypal/oslo/api/graphql/schema/type/AddPartyPhoneInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "getPhoneNumber", "Z", "getPrimary", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddPartyPhoneInput {
    private final com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber;
    private final boolean primary;
    private final com.paypal.oslo.api.graphql.schema.type.PhoneType type;

    public AddPartyPhoneInput(com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, boolean z, com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneType, "");
        this.phoneNumber = phoneInput;
        this.primary = z;
        this.type = phoneType;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhoneNumber() {
        return this.phoneNumber;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PhoneType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput = this.phoneNumber;
        boolean z = this.primary;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddPartyPhoneInput(phoneNumber=");
        sb.append(phoneInput);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", type=");
        sb.append(phoneType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.phoneNumber.hashCode() * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput addPartyPhoneInput = (com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, addPartyPhoneInput.phoneNumber) && this.primary == addPartyPhoneInput.primary && this.type == addPartyPhoneInput.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput copy(com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber, boolean primary, com.paypal.oslo.api.graphql.schema.type.PhoneType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput(phoneNumber, primary, type);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhoneNumber() {
        return this.phoneNumber;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput copy$default(com.paypal.oslo.api.graphql.schema.type.AddPartyPhoneInput addPartyPhoneInput, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, boolean z, com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            phoneInput = addPartyPhoneInput.phoneNumber;
        }
        if ((i & 2) != 0) {
            z = addPartyPhoneInput.primary;
        }
        if ((i & 4) != 0) {
            phoneType = addPartyPhoneInput.type;
        }
        return addPartyPhoneInput.copy(phoneInput, z, phoneType);
    }
}
