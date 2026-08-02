package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001d\u0010\t"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/AddRevolvingCreditCustomerProfileInput;", "", "creditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "name", "birthDate", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "component3", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;Ljava/lang/Object;)Lcom/paypal/oslo/api/graphql/schema/type/AddRevolvingCreditCustomerProfileInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCreditAccountId", "Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "getName", "getBirthDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddRevolvingCreditCustomerProfileInput {
    private final java.lang.Object birthDate;
    private final java.lang.Object creditAccountId;
    private final com.paypal.oslo.api.graphql.schema.type.PersonNameInput name;

    public AddRevolvingCreditCustomerProfileInput(java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personNameInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        this.creditAccountId = obj;
        this.name = personNameInput;
        this.birthDate = obj2;
    }

    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PersonNameInput getName() {
        return this.name;
    }

    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.creditAccountId;
        com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput = this.name;
        java.lang.Object obj2 = this.birthDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddRevolvingCreditCustomerProfileInput(creditAccountId=");
        sb.append(obj);
        sb.append(", name=");
        sb.append(personNameInput);
        sb.append(", birthDate=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.creditAccountId.hashCode() * 31) + this.name.hashCode()) * 31) + this.birthDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput addRevolvingCreditCustomerProfileInput = (com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, addRevolvingCreditCustomerProfileInput.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, addRevolvingCreditCustomerProfileInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, addRevolvingCreditCustomerProfileInput.birthDate);
    }

    public final com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput copy(java.lang.Object creditAccountId, com.paypal.oslo.api.graphql.schema.type.PersonNameInput name2, java.lang.Object birthDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthDate, "");
        return new com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput(creditAccountId, name2, birthDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PersonNameInput getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCreditAccountId() {
        return this.creditAccountId;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput copy$default(com.paypal.oslo.api.graphql.schema.type.AddRevolvingCreditCustomerProfileInput addRevolvingCreditCustomerProfileInput, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = addRevolvingCreditCustomerProfileInput.creditAccountId;
        }
        if ((i & 2) != 0) {
            personNameInput = addRevolvingCreditCustomerProfileInput.name;
        }
        if ((i & 4) != 0) {
            obj2 = addRevolvingCreditCustomerProfileInput.birthDate;
        }
        return addRevolvingCreditCustomerProfileInput.copy(obj, personNameInput, obj2);
    }
}
