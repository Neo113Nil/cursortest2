package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressType;", "addressType", "", "", "formattedAddress", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "openLocCode", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressType;Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressType;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressType;Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSuggestion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressType;", "getAddressType", "Ljava/util/List;", "getFormattedAddress", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress", "Ljava/lang/String;", "getOpenLocCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressSuggestion {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType;
    private final java.util.List<java.lang.String> formattedAddress;
    private final java.lang.String openLocCode;

    public AddressSuggestion(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType, java.util.List<java.lang.String> list, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.addressType = addressType;
        this.formattedAddress = list;
        this.address = address;
        this.openLocCode = str;
    }

    public /* synthetic */ AddressSuggestion(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType, java.util.List list, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(addressType, list, address, (i & 8) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType getAddressType() {
        return this.addressType;
    }

    public final java.util.List<java.lang.String> getFormattedAddress() {
        return this.formattedAddress;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.lang.String getOpenLocCode() {
        return this.openLocCode;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType = this.addressType;
        java.util.List<java.lang.String> list = this.formattedAddress;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.String str = this.openLocCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSuggestion(addressType=");
        sb.append(addressType);
        sb.append(", formattedAddress=");
        sb.append(list);
        sb.append(", address=");
        sb.append(address);
        sb.append(", openLocCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.addressType.hashCode();
        java.util.List<java.lang.String> list = this.formattedAddress;
        int hashCode2 = list == null ? 0 : list.hashCode();
        int hashCode3 = this.address.hashCode();
        java.lang.String str = this.openLocCode;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion addressSuggestion = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion) other;
        return this.addressType == addressSuggestion.addressType && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAddress, addressSuggestion.formattedAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressSuggestion.address) && kotlin.jvm.internal.Intrinsics.areEqual(this.openLocCode, addressSuggestion.openLocCode);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion copy(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType, java.util.List<java.lang.String> formattedAddress, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String openLocCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion(addressType, formattedAddress, address, openLocCode);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOpenLocCode() {
        return this.openLocCode;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.formattedAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType getAddressType() {
        return this.addressType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion copy$default(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSuggestion addressSuggestion, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressType addressType, java.util.List list, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            addressType = addressSuggestion.addressType;
        }
        if ((i & 2) != 0) {
            list = addressSuggestion.formattedAddress;
        }
        if ((i & 4) != 0) {
            address = addressSuggestion.address;
        }
        if ((i & 8) != 0) {
            str = addressSuggestion.openLocCode;
        }
        return addressSuggestion.copy(addressType, list, address, str);
    }
}
