package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdInputComponentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdType;", "type", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdVariant;", "variant", "", "taxId", "Lcom/apollographql/apollo/api/Optional;", "submitId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdType;Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdVariant;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdType;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdVariant;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdType;Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdVariant;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdType;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardTaxpayerIdVariant;", "getVariant", "Ljava/lang/String;", "getTaxId", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardTaxpayerIdInputComponentInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;
    private final java.lang.String taxId;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType type;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant variant;

    public OnboardTaxpayerIdInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType, com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant, java.lang.String str, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardTaxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardTaxpayerIdVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.type = onboardTaxpayerIdType;
        this.variant = onboardTaxpayerIdVariant;
        this.taxId = str;
        this.submitId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant getVariant() {
        return this.variant;
    }

    public final java.lang.String getTaxId() {
        return this.taxId;
    }

    public /* synthetic */ OnboardTaxpayerIdInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType, com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant, java.lang.String str, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardTaxpayerIdType, onboardTaxpayerIdVariant, str, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType = this.type;
        com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant = this.variant;
        java.lang.String str = this.taxId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardTaxpayerIdInputComponentInput(type=");
        sb.append(onboardTaxpayerIdType);
        sb.append(", variant=");
        sb.append(onboardTaxpayerIdVariant);
        sb.append(", taxId=");
        sb.append(str);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.type.hashCode() * 31) + this.variant.hashCode()) * 31) + this.taxId.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput onboardTaxpayerIdInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput) other;
        return this.type == onboardTaxpayerIdInputComponentInput.type && this.variant == onboardTaxpayerIdInputComponentInput.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.taxId, onboardTaxpayerIdInputComponentInput.taxId) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardTaxpayerIdInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType type, com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant variant, java.lang.String taxId, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput(type, variant, taxId, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.submitId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTaxId() {
        return this.taxId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput onboardTaxpayerIdInputComponentInput, com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType, com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant, java.lang.String str, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardTaxpayerIdType = onboardTaxpayerIdInputComponentInput.type;
        }
        if ((i & 2) != 0) {
            onboardTaxpayerIdVariant = onboardTaxpayerIdInputComponentInput.variant;
        }
        if ((i & 4) != 0) {
            str = onboardTaxpayerIdInputComponentInput.taxId;
        }
        if ((i & 8) != 0) {
            optional = onboardTaxpayerIdInputComponentInput.submitId;
        }
        return onboardTaxpayerIdInputComponentInput.copy(onboardTaxpayerIdType, onboardTaxpayerIdVariant, str, optional);
    }
}
