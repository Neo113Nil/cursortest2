package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameInputComponentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameVariant;", "variant", "Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "name", "Lcom/apollographql/apollo/api/Optional;", "", "submitId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameVariant;Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameVariant;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "component3", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameVariant;Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardNameVariant;", "getVariant", "Lcom/paypal/oslo/api/graphql/schema/type/PersonNameInput;", "getName", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardNameInputComponentInput {
    private final com.paypal.oslo.api.graphql.schema.type.PersonNameInput name;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant variant;

    public OnboardNameInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant onboardNameVariant, com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardNameVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personNameInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.variant = onboardNameVariant;
        this.name = personNameInput;
        this.submitId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PersonNameInput getName() {
        return this.name;
    }

    public /* synthetic */ OnboardNameInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant onboardNameVariant, com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardNameVariant, personNameInput, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant onboardNameVariant = this.variant;
        com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput = this.name;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardNameInputComponentInput(variant=");
        sb.append(onboardNameVariant);
        sb.append(", name=");
        sb.append(personNameInput);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.variant.hashCode() * 31) + this.name.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput onboardNameInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput) other;
        return this.variant == onboardNameInputComponentInput.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.name, onboardNameInputComponentInput.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardNameInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant variant, com.paypal.oslo.api.graphql.schema.type.PersonNameInput name2, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput(variant, name2, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.submitId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PersonNameInput getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant getVariant() {
        return this.variant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput onboardNameInputComponentInput, com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant onboardNameVariant, com.paypal.oslo.api.graphql.schema.type.PersonNameInput personNameInput, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardNameVariant = onboardNameInputComponentInput.variant;
        }
        if ((i & 2) != 0) {
            personNameInput = onboardNameInputComponentInput.name;
        }
        if ((i & 4) != 0) {
            optional = onboardNameInputComponentInput.submitId;
        }
        return onboardNameInputComponentInput.copy(onboardNameVariant, personNameInput, optional);
    }
}
