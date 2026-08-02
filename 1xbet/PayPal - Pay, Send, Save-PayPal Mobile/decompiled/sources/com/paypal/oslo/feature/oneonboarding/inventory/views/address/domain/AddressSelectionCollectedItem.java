package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionVariant;", "variant", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionVariant;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionVariant;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy--h87A4M", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionVariant;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionVariant;", "getVariant", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressSelectionCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final java.lang.String componentId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant variant;

    private AddressSelectionCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant addressSelectionVariant, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.componentId = str;
        this.variant = addressSelectionVariant;
        this.address = address;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant addressSelectionVariant = this.variant;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelectionCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", variant=");
        sb.append(addressSelectionVariant);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId) * 31) + this.variant.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem addressSelectionCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, addressSelectionCollectedItem.componentId) && this.variant == addressSelectionCollectedItem.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressSelectionCollectedItem.address);
    }

    /* renamed from: copy--h87A4M, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem m16913copyh87A4M(java.lang.String componentId, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant variant, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem(componentId, variant, address, null);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy--h87A4M$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem m16911copyh87A4M$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionCollectedItem addressSelectionCollectedItem, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant addressSelectionVariant, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressSelectionCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            addressSelectionVariant = addressSelectionCollectedItem.variant;
        }
        if ((i & 4) != 0) {
            address = addressSelectionCollectedItem.address;
        }
        return addressSelectionCollectedItem.m16913copyh87A4M(str, addressSelectionVariant, address);
    }

    public /* synthetic */ AddressSelectionCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionVariant addressSelectionVariant, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addressSelectionVariant, address);
    }
}
