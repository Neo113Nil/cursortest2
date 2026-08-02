package com.paypal.oslo.feature.debitcard.shared.ui.addressselection;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/AddressSelectionConfig;", "", "", "showButton", "", "buttonText", "showAddNewAddressButton", "updateAddress", "isFullScreen", "<init>", "(ZLjava/lang/String;ZZZ)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;ZZZ)Lcom/paypal/oslo/feature/debitcard/shared/ui/addressselection/AddressSelectionConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getShowButton", "Ljava/lang/String;", "getButtonText", "getShowAddNewAddressButton", "getUpdateAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressSelectionConfig {
    public static final int $stable = 0;
    private final java.lang.String buttonText;
    private final boolean isFullScreen;
    private final boolean showAddNewAddressButton;
    private final boolean showButton;
    private final boolean updateAddress;

    public AddressSelectionConfig(boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4) {
        this.showButton = z;
        this.buttonText = str;
        this.showAddNewAddressButton = z2;
        this.updateAddress = z3;
        this.isFullScreen = z4;
    }

    public /* synthetic */ AddressSelectionConfig(boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? true : z4);
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    public final boolean getShowAddNewAddressButton() {
        return this.showAddNewAddressButton;
    }

    public final boolean getUpdateAddress() {
        return this.updateAddress;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final java.lang.String toString() {
        boolean z = this.showButton;
        java.lang.String str = this.buttonText;
        boolean z2 = this.showAddNewAddressButton;
        boolean z3 = this.updateAddress;
        boolean z4 = this.isFullScreen;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelectionConfig(showButton=");
        sb.append(z);
        sb.append(", buttonText=");
        sb.append(str);
        sb.append(", showAddNewAddressButton=");
        sb.append(z2);
        sb.append(", updateAddress=");
        sb.append(z3);
        sb.append(", isFullScreen=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.showButton);
        java.lang.String str = this.buttonText;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.showAddNewAddressButton)) * 31) + java.lang.Boolean.hashCode(this.updateAddress)) * 31) + java.lang.Boolean.hashCode(this.isFullScreen);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig = (com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig) other;
        return this.showButton == addressSelectionConfig.showButton && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonText, addressSelectionConfig.buttonText) && this.showAddNewAddressButton == addressSelectionConfig.showAddNewAddressButton && this.updateAddress == addressSelectionConfig.updateAddress && this.isFullScreen == addressSelectionConfig.isFullScreen;
    }

    public final com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig copy(boolean showButton, java.lang.String buttonText, boolean showAddNewAddressButton, boolean updateAddress, boolean isFullScreen) {
        return new com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig(showButton, buttonText, showAddNewAddressButton, updateAddress, isFullScreen);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUpdateAddress() {
        return this.updateAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowAddNewAddressButton() {
        return this.showAddNewAddressButton;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig copy$default(com.paypal.oslo.feature.debitcard.shared.ui.addressselection.AddressSelectionConfig addressSelectionConfig, boolean z, java.lang.String str, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = addressSelectionConfig.showButton;
        }
        if ((i & 2) != 0) {
            str = addressSelectionConfig.buttonText;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            z2 = addressSelectionConfig.showAddNewAddressButton;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = addressSelectionConfig.updateAddress;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            z4 = addressSelectionConfig.isFullScreen;
        }
        return addressSelectionConfig.copy(z, str2, z5, z6, z4);
    }

    public AddressSelectionConfig() {
        this(false, null, false, false, false, 31, null);
    }
}
