package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthInputComponentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthVariant;", "variant", "birthDate", "Lcom/apollographql/apollo/api/Optional;", "", "submitId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthVariant;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthVariant;", "component2", "()Ljava/lang/Object;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthVariant;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthVariant;", "getVariant", "Ljava/lang/Object;", "getBirthDate", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardDateOfBirthInputComponentInput {
    private final java.lang.Object birthDate;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant variant;

    public OnboardDateOfBirthInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant onboardDateOfBirthVariant, java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardDateOfBirthVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.variant = onboardDateOfBirthVariant;
        this.birthDate = obj;
        this.submitId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant getVariant() {
        return this.variant;
    }

    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    public /* synthetic */ OnboardDateOfBirthInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant onboardDateOfBirthVariant, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardDateOfBirthVariant, obj, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant onboardDateOfBirthVariant = this.variant;
        java.lang.Object obj = this.birthDate;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardDateOfBirthInputComponentInput(variant=");
        sb.append(onboardDateOfBirthVariant);
        sb.append(", birthDate=");
        sb.append(obj);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.variant.hashCode() * 31) + this.birthDate.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput onboardDateOfBirthInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput) other;
        return this.variant == onboardDateOfBirthInputComponentInput.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, onboardDateOfBirthInputComponentInput.birthDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardDateOfBirthInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant variant, java.lang.Object birthDate, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput(variant, birthDate, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.submitId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant getVariant() {
        return this.variant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthInputComponentInput onboardDateOfBirthInputComponentInput, com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthVariant onboardDateOfBirthVariant, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            onboardDateOfBirthVariant = onboardDateOfBirthInputComponentInput.variant;
        }
        if ((i & 2) != 0) {
            obj = onboardDateOfBirthInputComponentInput.birthDate;
        }
        if ((i & 4) != 0) {
            optional = onboardDateOfBirthInputComponentInput.submitId;
        }
        return onboardDateOfBirthInputComponentInput.copy(onboardDateOfBirthVariant, obj, optional);
    }
}
