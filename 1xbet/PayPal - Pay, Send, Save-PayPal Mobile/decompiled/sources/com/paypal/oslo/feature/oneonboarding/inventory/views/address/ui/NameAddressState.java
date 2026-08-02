package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00058G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R/\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00058G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/NameAddressState;", "", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "nameAddressConfig", "Landroidx/compose/runtime/MutableState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "selectedAddressState", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "addressCollectionStateHolder", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;", "addressSelectionConfig", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "getAddressCollectionStateHolder", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "<set-?>", "selectedAddress$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectedAddress", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "setSelectedAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "selectedAddress", "Lcom/paypal/pds/components/BottomSheetController;", "selectionSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "getSelectionSheetController", "()Lcom/paypal/pds/components/BottomSheetController;", "editSheetController", "getEditSheetController", "addressToEdit$delegate", "getAddressToEdit", "setAddressToEdit", "addressToEdit"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressState {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder;

    /* renamed from: addressToEdit$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState addressToEdit;
    private final com.paypal.pds.components.BottomSheetController editSheetController;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig getHighSpeedVideoFpsRanges;

    /* renamed from: selectedAddress$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState selectedAddress;
    private final com.paypal.pds.components.BottomSheetController selectionSheetController;

    public NameAddressState(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> mutableState, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionStateHolder, "");
        this.getHighSpeedVideoFpsRanges = nameAddressViewComponentConfig;
        this.addressCollectionStateHolder = addressCollectionStateHolder;
        this.selectedAddress = mutableState;
        this.selectionSheetController = new com.paypal.pds.components.BottomSheetController();
        this.editSheetController = new com.paypal.pds.components.BottomSheetController();
        this.addressToEdit = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder getAddressCollectionStateHolder() {
        return this.addressCollectionStateHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.core.i18n.domain.model.Address getSelectedAddress() {
        return (com.paypal.oslo.core.i18n.domain.model.Address) this.selectedAddress.getValue();
    }

    public final void setSelectedAddress(com.paypal.oslo.core.i18n.domain.model.Address address) {
        this.selectedAddress.setValue(address);
    }

    public final com.paypal.pds.components.BottomSheetController getSelectionSheetController() {
        return this.selectionSheetController;
    }

    public final com.paypal.pds.components.BottomSheetController getEditSheetController() {
        return this.editSheetController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddressToEdit() {
        return (com.paypal.oslo.core.i18n.domain.model.Address) this.addressToEdit.getValue();
    }

    public final void setAddressToEdit(com.paypal.oslo.core.i18n.domain.model.Address address) {
        this.addressToEdit.setValue(address);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionConfig() {
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig = this.getHighSpeedVideoFpsRanges;
        if (nameAddressViewComponentConfig == null) {
            return null;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder = this.addressCollectionStateHolder;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address = nameAddressViewComponentConfig.getAddress();
        if (address == null) {
            address = kotlin.collections.CollectionsKt.emptyList();
        }
        addressCollectionStateHolder.seedIfEmpty(address);
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig(nameAddressViewComponentConfig.mo16702getIdfHLlpbY(), com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressStateKt.access$toAddressSelectionVariant(nameAddressViewComponentConfig.getVariant()), nameAddressViewComponentConfig.isEditable(), this.addressCollectionStateHolder.getAddresses(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
