package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "name", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "component2", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceAttributeName;", "getName", "Lcom/apollographql/apollo/api/Optional;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RevolvingCreditNotificationPreferenceAttributeInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount;
    private final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName name;

    public RevolvingCreditNotificationPreferenceAttributeInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferenceAttributeName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.name = revolvingCreditNotificationPreferenceAttributeName;
        this.amount = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName getName() {
        return this.name;
    }

    public /* synthetic */ RevolvingCreditNotificationPreferenceAttributeInput(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(revolvingCreditNotificationPreferenceAttributeName, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getAmount() {
        return this.amount;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName = this.name;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional = this.amount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RevolvingCreditNotificationPreferenceAttributeInput(name=");
        sb.append(revolvingCreditNotificationPreferenceAttributeName);
        sb.append(", amount=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.name.hashCode() * 31) + this.amount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput revolvingCreditNotificationPreferenceAttributeInput = (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput) other;
        return this.name == revolvingCreditNotificationPreferenceAttributeInput.name && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, revolvingCreditNotificationPreferenceAttributeInput.amount);
    }

    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput copy(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName name2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput(name2, amount);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component2() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput copy$default(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeInput revolvingCreditNotificationPreferenceAttributeInput, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceAttributeName revolvingCreditNotificationPreferenceAttributeName, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            revolvingCreditNotificationPreferenceAttributeName = revolvingCreditNotificationPreferenceAttributeInput.name;
        }
        if ((i & 2) != 0) {
            optional = revolvingCreditNotificationPreferenceAttributeInput.amount;
        }
        return revolvingCreditNotificationPreferenceAttributeInput.copy(revolvingCreditNotificationPreferenceAttributeName, optional);
    }
}
