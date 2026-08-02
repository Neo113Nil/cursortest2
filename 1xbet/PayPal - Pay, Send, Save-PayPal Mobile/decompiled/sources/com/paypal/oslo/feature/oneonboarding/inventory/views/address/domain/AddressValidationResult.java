package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010JL\u0010\u0013\u001a\u00020\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR+\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b!\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010\u0010R\u0011\u0010#\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressValidationResult;", "", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "", "fieldErrors", "", "hasPOBoxError", "hasPMBError", "hasUSTerritoryError", "<init>", "(Ljava/util/Map;ZZZ)V", "component1", "()Ljava/util/Map;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/util/Map;ZZZ)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressValidationResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getFieldErrors", "Z", "getHasPOBoxError", "getHasPMBError", "getHasUSTerritoryError", "isValid"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressValidationResult {
    public static final int $stable = 8;
    private final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> fieldErrors;
    private final boolean hasPMBError;
    private final boolean hasPOBoxError;
    private final boolean hasUSTerritoryError;

    public AddressValidationResult(java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.fieldErrors = map;
        this.hasPOBoxError = z;
        this.hasPMBError = z2;
        this.hasUSTerritoryError = z3;
    }

    public final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> getFieldErrors() {
        return this.fieldErrors;
    }

    public final boolean getHasPOBoxError() {
        return this.hasPOBoxError;
    }

    public final boolean getHasPMBError() {
        return this.hasPMBError;
    }

    public final boolean getHasUSTerritoryError() {
        return this.hasUSTerritoryError;
    }

    public final boolean isValid() {
        return (!this.fieldErrors.isEmpty() || this.hasPOBoxError || this.hasPMBError) ? false : true;
    }

    public final java.lang.String toString() {
        java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map = this.fieldErrors;
        boolean z = this.hasPOBoxError;
        boolean z2 = this.hasPMBError;
        boolean z3 = this.hasUSTerritoryError;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressValidationResult(fieldErrors=");
        sb.append(map);
        sb.append(", hasPOBoxError=");
        sb.append(z);
        sb.append(", hasPMBError=");
        sb.append(z2);
        sb.append(", hasUSTerritoryError=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.fieldErrors.hashCode() * 31) + java.lang.Boolean.hashCode(this.hasPOBoxError)) * 31) + java.lang.Boolean.hashCode(this.hasPMBError)) * 31) + java.lang.Boolean.hashCode(this.hasUSTerritoryError);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult addressValidationResult = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fieldErrors, addressValidationResult.fieldErrors) && this.hasPOBoxError == addressValidationResult.hasPOBoxError && this.hasPMBError == addressValidationResult.hasPMBError && this.hasUSTerritoryError == addressValidationResult.hasUSTerritoryError;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult copy(java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> fieldErrors, boolean hasPOBoxError, boolean hasPMBError, boolean hasUSTerritoryError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldErrors, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult(fieldErrors, hasPOBoxError, hasPMBError, hasUSTerritoryError);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasUSTerritoryError() {
        return this.hasUSTerritoryError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasPMBError() {
        return this.hasPMBError;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasPOBoxError() {
        return this.hasPOBoxError;
    }

    public final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> component1() {
        return this.fieldErrors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressValidationResult addressValidationResult, java.util.Map map, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = addressValidationResult.fieldErrors;
        }
        if ((i & 2) != 0) {
            z = addressValidationResult.hasPOBoxError;
        }
        if ((i & 4) != 0) {
            z2 = addressValidationResult.hasPMBError;
        }
        if ((i & 8) != 0) {
            z3 = addressValidationResult.hasUSTerritoryError;
        }
        return addressValidationResult.copy(map, z, z2, z3);
    }
}
