package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/views/MenuItemData;", "", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "p0", "", "p1", "<init>", "(Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/contacts/ui/contacts/model/CountryUi;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* data */ class MenuItemData {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final boolean getHighSpeedVideoSizes;

    public MenuItemData(com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryUi, "");
        this.getHighResolutionOutputSizeshNQ4ISI = countryUi;
        this.getHighSpeedVideoSizes = z;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.contacts.ui.contacts.model.CountryUi countryUi = this.getHighResolutionOutputSizeshNQ4ISI;
        boolean z = this.getHighSpeedVideoSizes;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuItemData(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(countryUi);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.contacts.ui.contacts.views.MenuItemData)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.views.MenuItemData menuItemData = (com.paypal.oslo.feature.contacts.ui.contacts.views.MenuItemData) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, menuItemData.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoSizes == menuItemData.getHighSpeedVideoSizes;
    }
}
