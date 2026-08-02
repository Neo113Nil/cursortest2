package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/CollectedItem;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "componentId", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVariant;", "variant", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "", "addressId", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVariant;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-fHLlpbY", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVariant;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component4", "copy-svVtR6Q", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVariant;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressCollectedItem;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getComponentId-fHLlpbY", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressVariant;", "getVariant", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressCollectedItem implements com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final java.lang.String addressId;
    private final java.lang.String componentId;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant variant;

    private AddressCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressVariant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.componentId = str;
        this.variant = addressVariant;
        this.address = address;
        this.addressId = str2;
    }

    public /* synthetic */ AddressCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addressVariant, address, (i & 8) != 0 ? null : str2, null);
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.domain.CollectedItem
    /* renamed from: getComponentId-fHLlpbY */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.componentId;
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant getVariant() {
        return this.variant;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    public final java.lang.String toString() {
        java.lang.String m16613toStringimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16613toStringimpl(this.componentId);
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant = this.variant;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.String str = this.addressId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressCollectedItem(componentId=");
        sb.append(m16613toStringimpl);
        sb.append(", variant=");
        sb.append(addressVariant);
        sb.append(", address=");
        sb.append(address);
        sb.append(", addressId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int m16612hashCodeimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16612hashCodeimpl(this.componentId);
        int hashCode = this.variant.hashCode();
        int hashCode2 = this.address.hashCode();
        java.lang.String str = this.addressId;
        return (((((m16612hashCodeimpl * 31) + hashCode) * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem addressCollectedItem = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem) other;
        return com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16611equalsimpl0(this.componentId, addressCollectedItem.componentId) && this.variant == addressCollectedItem.variant && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressCollectedItem.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, addressCollectedItem.addressId);
    }

    /* renamed from: copy-svVtR6Q, reason: not valid java name */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem m16905copysvVtR6Q(java.lang.String componentId, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant variant, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String addressId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem(componentId, variant, address, addressId, null);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAddressId() {
        return this.addressId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant getVariant() {
        return this.variant;
    }

    /* renamed from: component1-fHLlpbY, reason: not valid java name and from getter */
    public final java.lang.String getComponentId() {
        return this.componentId;
    }

    /* renamed from: copy-svVtR6Q$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem m16903copysvVtR6Q$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectedItem addressCollectedItem, java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressCollectedItem.componentId;
        }
        if ((i & 2) != 0) {
            addressVariant = addressCollectedItem.variant;
        }
        if ((i & 4) != 0) {
            address = addressCollectedItem.address;
        }
        if ((i & 8) != 0) {
            str2 = addressCollectedItem.addressId;
        }
        return addressCollectedItem.m16905copysvVtR6Q(str, addressVariant, address, str2);
    }

    public /* synthetic */ AddressCollectedItem(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, addressVariant, address, str2);
    }
}
