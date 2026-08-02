package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinatorStoreRegistry;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStore;", "getHighSpeedVideoSizes", "()Landroidx/lifecycle/ViewModelStore;", "Landroidx/lifecycle/ViewModelStore;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SetupFlowCoordinatorStoreRegistry {
    public static final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry INSTANCE = new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorStoreRegistry();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    static androidx.view.ViewModelStore getHighResolutionOutputSizeshNQ4ISI;

    private SetupFlowCoordinatorStoreRegistry() {
    }

    public final androidx.view.ViewModelStore getHighSpeedVideoSizes() {
        synchronized (this) {
            androidx.view.ViewModelStore viewModelStore = getHighResolutionOutputSizeshNQ4ISI;
            if (viewModelStore != null) {
                return viewModelStore;
            }
            androidx.view.ViewModelStore viewModelStore2 = new androidx.view.ViewModelStore();
            getHighResolutionOutputSizeshNQ4ISI = viewModelStore2;
            return viewModelStore2;
        }
    }
}
