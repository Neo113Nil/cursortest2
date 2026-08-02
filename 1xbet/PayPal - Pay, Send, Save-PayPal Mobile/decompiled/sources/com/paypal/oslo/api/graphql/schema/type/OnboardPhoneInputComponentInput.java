package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneInputComponentInput;", "", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "variant", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phone", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "Lcom/apollographql/apollo/api/Optional;", "", "submitId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/apollographql/apollo/api/Optional;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneInputComponentInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardPhoneVariant;", "getVariant", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "getPhone", "Ljava/lang/Object;", "getPhoneCountryCode", "Lcom/apollographql/apollo/api/Optional;", "getSubmitId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class OnboardPhoneInputComponentInput {
    private final com.paypal.oslo.api.graphql.schema.type.PhoneInput phone;
    private final java.lang.Object phoneCountryCode;
    private final com.apollographql.apollo.api.Optional<java.lang.String> submitId;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant variant;

    public OnboardPhoneInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, java.lang.Object obj, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardPhoneVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        this.variant = onboardPhoneVariant;
        this.phone = phoneInput;
        this.phoneCountryCode = obj;
        this.submitId = optional;
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhone() {
        return this.phone;
    }

    public final java.lang.Object getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public /* synthetic */ OnboardPhoneInputComponentInput(com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, java.lang.Object obj, com.apollographql.apollo.api.Optional.Absent absent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onboardPhoneVariant, phoneInput, obj, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSubmitId() {
        return this.submitId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant = this.variant;
        com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput = this.phone;
        java.lang.Object obj = this.phoneCountryCode;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.submitId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardPhoneInputComponentInput(variant=");
        sb.append(onboardPhoneVariant);
        sb.append(", phone=");
        sb.append(phoneInput);
        sb.append(", phoneCountryCode=");
        sb.append(obj);
        sb.append(", submitId=");
        sb.append(optional);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.variant.hashCode() * 31) + this.phone.hashCode()) * 31) + this.phoneCountryCode.hashCode()) * 31) + this.submitId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput onboardPhoneInputComponentInput = (com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput) other;
        return this.variant == onboardPhoneInputComponentInput.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, onboardPhoneInputComponentInput.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneCountryCode, onboardPhoneInputComponentInput.phoneCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitId, onboardPhoneInputComponentInput.submitId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput copy(com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant variant, com.paypal.oslo.api.graphql.schema.type.PhoneInput phone, java.lang.Object phoneCountryCode, com.apollographql.apollo.api.Optional<java.lang.String> submitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitId, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput(variant, phone, phoneCountryCode, submitId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component4() {
        return this.submitId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PhoneInput getPhone() {
        return this.phone;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant getVariant() {
        return this.variant;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardPhoneInputComponentInput onboardPhoneInputComponentInput, com.paypal.oslo.api.graphql.schema.type.OnboardPhoneVariant onboardPhoneVariant, com.paypal.oslo.api.graphql.schema.type.PhoneInput phoneInput, java.lang.Object obj, com.apollographql.apollo.api.Optional optional, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            onboardPhoneVariant = onboardPhoneInputComponentInput.variant;
        }
        if ((i & 2) != 0) {
            phoneInput = onboardPhoneInputComponentInput.phone;
        }
        if ((i & 4) != 0) {
            obj = onboardPhoneInputComponentInput.phoneCountryCode;
        }
        if ((i & 8) != 0) {
            optional = onboardPhoneInputComponentInput.submitId;
        }
        return onboardPhoneInputComponentInput.copy(onboardPhoneVariant, phoneInput, obj, optional);
    }
}
