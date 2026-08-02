package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/BirthDate;", "birthDate", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthVariant;", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthVariant;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2-3XSjtYo", "component2", "component3", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthVariant;", "copy-zG63XPE", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthVariant;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "getBirthDate-3XSjtYo", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DateOfBirthCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 0;
    private final java.lang.String birthDate;
    private final java.lang.String componentId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant variant;

    private DateOfBirthCollectedItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateOfBirthVariant, "");
        this.componentId = str;
        this.birthDate = str2;
        this.variant = dateOfBirthVariant;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    /* renamed from: getBirthDate-3XSjtYo, reason: not valid java name */
    public final java.lang.String m17004getBirthDate3XSjtYo() {
        return this.birthDate;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant getVariant() {
        return this.variant;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        java.lang.String m16996toStringimpl = com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate.m16996toStringimpl(this.birthDate);
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant = this.variant;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DateOfBirthCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", birthDate=");
        sb.append(m16996toStringimpl);
        sb.append(", variant=");
        sb.append(dateOfBirthVariant);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate.m16995hashCodeimpl(this.birthDate)) * 31) + this.variant.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem dateOfBirthCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, dateOfBirthCollectedItem.componentId) && com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.BirthDate.m16994equalsimpl0(this.birthDate, dateOfBirthCollectedItem.birthDate) && this.variant == dateOfBirthCollectedItem.variant;
    }

    /* renamed from: copy-zG63XPE, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem m17003copyzG63XPE(java.lang.String componentId, java.lang.String birthDate, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant variant) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(birthDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem(componentId, birthDate, variant, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component2-3XSjtYo, reason: not valid java name and from getter */
    public final java.lang.String getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-zG63XPE$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem m17000copyzG63XPE$default(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthCollectedItem dateOfBirthCollectedItem, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = dateOfBirthCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            str2 = dateOfBirthCollectedItem.birthDate;
        }
        if ((i & 4) != 0) {
            dateOfBirthVariant = dateOfBirthCollectedItem.variant;
        }
        return dateOfBirthCollectedItem.m17003copyzG63XPE(str, str2, dateOfBirthVariant);
    }

    public /* synthetic */ DateOfBirthCollectedItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthVariant dateOfBirthVariant, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dateOfBirthVariant);
    }
}
