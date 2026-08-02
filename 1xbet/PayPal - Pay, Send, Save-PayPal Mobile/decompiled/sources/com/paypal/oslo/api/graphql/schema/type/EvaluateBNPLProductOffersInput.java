package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJD\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "amount", "applicationSessionId", "", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "creditProductIdentifiers", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/EvaluateBNPLProductOffersInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getAmount", "Ljava/lang/Object;", "getApplicationSessionId", "getCreditProductIdentifiers"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EvaluateBNPLProductOffersInput {
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount;
    private final java.lang.Object applicationSessionId;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> creditProductIdentifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public EvaluateBNPLProductOffersInput(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional, java.lang.Object obj, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.amount = optional;
        this.applicationSessionId = obj;
        this.creditProductIdentifiers = optional2;
    }

    public /* synthetic */ EvaluateBNPLProductOffersInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, obj, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> getAmount() {
        return this.amount;
    }

    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> getCreditProductIdentifiers() {
        return this.creditProductIdentifiers;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> optional = this.amount;
        java.lang.Object obj = this.applicationSessionId;
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> optional2 = this.creditProductIdentifiers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvaluateBNPLProductOffersInput(amount=");
        sb.append(optional);
        sb.append(", applicationSessionId=");
        sb.append(obj);
        sb.append(", creditProductIdentifiers=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.amount.hashCode() * 31) + this.applicationSessionId.hashCode()) * 31) + this.creditProductIdentifiers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput evaluateBNPLProductOffersInput = (com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, evaluateBNPLProductOffersInput.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationSessionId, evaluateBNPLProductOffersInput.applicationSessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.creditProductIdentifiers, evaluateBNPLProductOffersInput.creditProductIdentifiers);
    }

    public final com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput copy(com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> amount, java.lang.Object applicationSessionId, com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> creditProductIdentifiers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationSessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifiers, "");
        return new com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput(amount, applicationSessionId, creditProductIdentifiers);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier>> component3() {
        return this.creditProductIdentifiers;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getApplicationSessionId() {
        return this.applicationSessionId;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> component1() {
        return this.amount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput copy$default(com.paypal.oslo.api.graphql.schema.type.EvaluateBNPLProductOffersInput evaluateBNPLProductOffersInput, com.apollographql.apollo.api.Optional optional, java.lang.Object obj, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            optional = evaluateBNPLProductOffersInput.amount;
        }
        if ((i & 2) != 0) {
            obj = evaluateBNPLProductOffersInput.applicationSessionId;
        }
        if ((i & 4) != 0) {
            optional2 = evaluateBNPLProductOffersInput.creditProductIdentifiers;
        }
        return evaluateBNPLProductOffersInput.copy(optional, obj, optional2);
    }
}
