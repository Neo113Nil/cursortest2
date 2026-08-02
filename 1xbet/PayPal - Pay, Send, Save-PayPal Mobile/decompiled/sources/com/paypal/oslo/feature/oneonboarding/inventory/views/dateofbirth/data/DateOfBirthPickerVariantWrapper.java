package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthPickerVariantWrapper;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthVariantAdapter;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthPickerInputComponentVariant;", "variant", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthPickerInputComponentVariant;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthPickerInputComponentVariant;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthPickerInputComponentVariant;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthPickerVariantWrapper;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardDateOfBirthPickerInputComponentVariant;", "getVariant", "rawValue", "Ljava/lang/String;", "getRawValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DateOfBirthPickerVariantWrapper implements com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantAdapter {
    public static final int $stable = 0;
    private final java.lang.String rawValue;
    private final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant variant;

    public DateOfBirthPickerVariantWrapper(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant onboardDateOfBirthPickerInputComponentVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onboardDateOfBirthPickerInputComponentVariant, "");
        this.variant = onboardDateOfBirthPickerInputComponentVariant;
        this.rawValue = onboardDateOfBirthPickerInputComponentVariant.getRawValue();
    }

    public final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant getVariant() {
        return this.variant;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthVariantAdapter
    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant onboardDateOfBirthPickerInputComponentVariant = this.variant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateOfBirthPickerVariantWrapper(variant=");
        sb.append(onboardDateOfBirthPickerInputComponentVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.variant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper) && this.variant == ((com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper) other).variant;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper copy(com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper(variant);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper dateOfBirthPickerVariantWrapper, com.paypal.oslo.api.graphql.schema.type.OnboardDateOfBirthPickerInputComponentVariant onboardDateOfBirthPickerInputComponentVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onboardDateOfBirthPickerInputComponentVariant = dateOfBirthPickerVariantWrapper.variant;
        }
        return dateOfBirthPickerVariantWrapper.copy(onboardDateOfBirthPickerInputComponentVariant);
    }
}
