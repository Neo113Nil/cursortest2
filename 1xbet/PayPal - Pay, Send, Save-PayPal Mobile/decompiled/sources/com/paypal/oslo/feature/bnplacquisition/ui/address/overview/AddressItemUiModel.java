package com.paypal.oslo.feature.bnplacquisition.ui.address.overview;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\u0007\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressItemUiModel;", "", "", "id", androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS, "cityStateZip", "", "isSelected", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/address/overview/AddressItemUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getStreetAddress", "getCityStateZip", "Z", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AddressItemUiModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final java.lang.String cityStateZip;
    private final java.lang.String id;
    private final boolean isSelected;
    private final java.lang.String streetAddress;

    public AddressItemUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.id = str;
        this.streetAddress = str2;
        this.cityStateZip = str3;
        this.isSelected = z;
        this.address = address;
    }

    public /* synthetic */ AddressItemUiModel(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.core.i18n.domain.model.Address address, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, address);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getStreetAddress() {
        return this.streetAddress;
    }

    public final java.lang.String getCityStateZip() {
        return this.cityStateZip;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.streetAddress;
        java.lang.String str3 = this.cityStateZip;
        boolean z = this.isSelected;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressItemUiModel(id=");
        sb.append(str);
        sb.append(", streetAddress=");
        sb.append(str2);
        sb.append(", cityStateZip=");
        sb.append(str3);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.streetAddress.hashCode()) * 31) + this.cityStateZip.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSelected)) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel = (com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, addressItemUiModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.streetAddress, addressItemUiModel.streetAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.cityStateZip, addressItemUiModel.cityStateZip) && this.isSelected == addressItemUiModel.isSelected && kotlin.jvm.internal.Intrinsics.areEqual(this.address, addressItemUiModel.address);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel copy(java.lang.String id, java.lang.String streetAddress, java.lang.String cityStateZip, boolean isSelected, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streetAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cityStateZip, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel(id, streetAddress, cityStateZip, isSelected, address);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCityStateZip() {
        return this.cityStateZip;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel copy$default(com.paypal.oslo.feature.bnplacquisition.ui.address.overview.AddressItemUiModel addressItemUiModel, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressItemUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = addressItemUiModel.streetAddress;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = addressItemUiModel.cityStateZip;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            z = addressItemUiModel.isSelected;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            address = addressItemUiModel.address;
        }
        return addressItemUiModel.copy(str, str4, str5, z2, address);
    }
}
