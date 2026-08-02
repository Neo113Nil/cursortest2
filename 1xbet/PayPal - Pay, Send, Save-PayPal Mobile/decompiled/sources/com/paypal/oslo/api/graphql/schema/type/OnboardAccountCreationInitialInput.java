package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJH\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001e\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b!\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInitialInput;", "", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "email", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "phone", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/Object;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInitialInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getCountry", "getEmail", "Lcom/apollographql/apollo/api/Optional;", "getPhone", "getPhoneCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OnboardAccountCreationInitialInput {
    private final java.lang.Object country;
    private final java.lang.Object email;
    private final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> phone;
    private final com.apollographql.apollo.api.Optional<java.lang.Object> phoneCountryCode;

    public OnboardAccountCreationInitialInput(java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> optional, com.apollographql.apollo.api.Optional<? extends java.lang.Object> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.country = obj;
        this.email = obj2;
        this.phone = optional;
        this.phoneCountryCode = optional2;
    }

    public final java.lang.Object getCountry() {
        return this.country;
    }

    public final java.lang.Object getEmail() {
        return this.email;
    }

    public /* synthetic */ OnboardAccountCreationInitialInput(java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> getPhone() {
        return this.phone;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.country;
        java.lang.Object obj2 = this.email;
        com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> optional = this.phone;
        com.apollographql.apollo.api.Optional<java.lang.Object> optional2 = this.phoneCountryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardAccountCreationInitialInput(country=");
        sb.append(obj);
        sb.append(", email=");
        sb.append(obj2);
        sb.append(", phone=");
        sb.append(optional);
        sb.append(", phoneCountryCode=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.country.hashCode() * 31) + this.email.hashCode()) * 31) + this.phone.hashCode()) * 31) + this.phoneCountryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput onboardAccountCreationInitialInput = (com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.country, onboardAccountCreationInitialInput.country) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, onboardAccountCreationInitialInput.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, onboardAccountCreationInitialInput.phone) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneCountryCode, onboardAccountCreationInitialInput.phoneCountryCode);
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput copy(java.lang.Object country, java.lang.Object email, com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> phone, com.apollographql.apollo.api.Optional<? extends java.lang.Object> phoneCountryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCountryCode, "");
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput(country, email, phone, phoneCountryCode);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Object> component4() {
        return this.phoneCountryCode;
    }

    public final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.PhoneInput> component3() {
        return this.phone;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getCountry() {
        return this.country;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput copy$default(com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInitialInput onboardAccountCreationInitialInput, java.lang.Object obj, java.lang.Object obj2, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            obj = onboardAccountCreationInitialInput.country;
        }
        if ((i & 2) != 0) {
            obj2 = onboardAccountCreationInitialInput.email;
        }
        if ((i & 4) != 0) {
            optional = onboardAccountCreationInitialInput.phone;
        }
        if ((i & 8) != 0) {
            optional2 = onboardAccountCreationInitialInput.phoneCountryCode;
        }
        return onboardAccountCreationInitialInput.copy(obj, obj2, optional, optional2);
    }
}
