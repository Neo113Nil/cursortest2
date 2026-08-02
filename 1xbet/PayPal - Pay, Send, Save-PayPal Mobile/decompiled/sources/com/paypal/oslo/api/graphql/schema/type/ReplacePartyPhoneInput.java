package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/ReplacePartyPhoneInput;", "", "", "id", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phoneNumber", "", "primary", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;ZLcom/paypal/oslo/api/graphql/schema/type/PhoneType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "component3", "()Z", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;ZLcom/paypal/oslo/api/graphql/schema/type/PhoneType;)Lcom/paypal/oslo/api/graphql/schema/type/ReplacePartyPhoneInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "getPhoneNumber", "Z", "getPrimary", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReplacePartyPhoneInput {
    private final java.lang.String id;
    private final com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber;
    private final boolean primary;
    private final com.paypal.oslo.api.graphql.schema.type.PhoneType type;

    public ReplacePartyPhoneInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, boolean z, com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneType, "");
        this.id = str;
        this.phoneNumber = phoneInput;
        this.primary = z;
        this.type = phoneType;
    }

    public final java.lang.String getId() {
        return this.id;
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
        java.lang.String str = this.id;
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput = this.phoneNumber;
        boolean z = this.primary;
        com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReplacePartyPhoneInput(id=");
        sb.append(str);
        sb.append(", phoneNumber=");
        sb.append(phoneInput);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", type=");
        sb.append(phoneType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + java.lang.Boolean.hashCode(this.primary)) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput replacePartyPhoneInput = (com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, replacePartyPhoneInput.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, replacePartyPhoneInput.phoneNumber) && this.primary == replacePartyPhoneInput.primary && this.type == replacePartyPhoneInput.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput copy(java.lang.String id, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneNumber, boolean primary, com.paypal.oslo.api.graphql.schema.type.PhoneType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput(id, phoneNumber, primary, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput copy$default(com.paypal.oslo.api.graphql.schema.type.ReplacePartyPhoneInput replacePartyPhoneInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, boolean z, com.paypal.oslo.api.graphql.schema.type.PhoneType phoneType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = replacePartyPhoneInput.id;
        }
        if ((i & 2) != 0) {
            phoneInput = replacePartyPhoneInput.phoneNumber;
        }
        if ((i & 4) != 0) {
            z = replacePartyPhoneInput.primary;
        }
        if ((i & 8) != 0) {
            phoneType = replacePartyPhoneInput.type;
        }
        return replacePartyPhoneInput.copy(str, phoneInput, z, phoneType);
    }
}
