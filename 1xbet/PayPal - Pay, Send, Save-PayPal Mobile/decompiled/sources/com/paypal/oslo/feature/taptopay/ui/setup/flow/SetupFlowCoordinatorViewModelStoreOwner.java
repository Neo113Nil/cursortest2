package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/setup/flow/SetupFlowCoordinatorViewModelStoreOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelStore;", "p0", "p1", "<init>", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/HasDefaultViewModelProviderFactory;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
final class SetupFlowCoordinatorViewModelStoreOwner implements androidx.view.ViewModelStoreOwner, androidx.view.HasDefaultViewModelProviderFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.HasDefaultViewModelProviderFactory getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.ViewModelStore getHighSpeedVideoSizes;

    public SetupFlowCoordinatorViewModelStoreOwner(androidx.view.ViewModelStore viewModelStore, androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasDefaultViewModelProviderFactory, "");
        this.getHighSpeedVideoSizes = viewModelStore;
        this.getHighSpeedVideoFpsRangesFor = hasDefaultViewModelProviderFactory;
    }

    @Override // androidx.view.ViewModelStoreOwner
    /* renamed from: getViewModelStore, reason: from getter */
    public final androidx.view.ViewModelStore getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public final androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.getHighSpeedVideoFpsRangesFor.getDefaultViewModelProviderFactory();
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public final androidx.view.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        return this.getHighSpeedVideoFpsRangesFor.getDefaultViewModelCreationExtras();
    }
}
