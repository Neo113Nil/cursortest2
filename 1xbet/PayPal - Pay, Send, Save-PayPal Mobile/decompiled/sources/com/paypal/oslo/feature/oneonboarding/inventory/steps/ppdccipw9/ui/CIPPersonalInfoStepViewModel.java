package com.paypal.oslo.feature.oneonboarding.inventory.steps.ppdccipw9.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/ppdccipw9/ui/CIPPersonalInfoStepViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "addressCollectionStateHolder", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "getAddressCollectionStateHolder", "()Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressCollectionStateHolder;", "Landroidx/compose/runtime/MutableState;", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "selectedAddressState", "Landroidx/compose/runtime/MutableState;", "getSelectedAddressState", "()Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CIPPersonalInfoStepViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder;
    private final androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> selectedAddressState;

    @javax.inject.Inject
    public CIPPersonalInfoStepViewModel(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder addressCollectionStateHolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionStateHolder, "");
        this.addressCollectionStateHolder = addressCollectionStateHolder;
        this.selectedAddressState = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressCollectionStateHolder getAddressCollectionStateHolder() {
        return this.addressCollectionStateHolder;
    }

    public final androidx.compose.runtime.MutableState<com.paypal.oslo.core.i18n.domain.model.Address> getSelectedAddressState() {
        return this.selectedAddressState;
    }
}
