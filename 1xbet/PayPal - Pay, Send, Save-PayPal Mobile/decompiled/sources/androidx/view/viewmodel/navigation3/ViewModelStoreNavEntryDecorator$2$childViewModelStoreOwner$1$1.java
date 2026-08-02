package androidx.view.viewmodel.navigation3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0007\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1 implements androidx.view.ViewModelStoreOwner, androidx.view.SavedStateRegistryOwner, androidx.view.HasDefaultViewModelProviderFactory {
    private final /* synthetic */ androidx.view.SavedStateRegistryOwner Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.ViewModelStore getHighSpeedVideoFpsRangesFor;

    ViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, androidx.view.ViewModelStore viewModelStore) {
        this.getHighSpeedVideoFpsRangesFor = viewModelStore;
        this.Camera2StreamConfigurationMap = savedStateRegistryOwner;
        if (getLifecycle().getCamera2StreamConfigurationMap() != androidx.lifecycle.Lifecycle.State.INITIALIZED) {
            throw new java.lang.IllegalArgumentException("The Lifecycle state is already beyond INITIALIZED. The ViewModelStoreNavEntryDecorator requires adding the SavedStateNavEntryDecorator to ensure support for SavedStateHandles.".toString());
        }
        androidx.view.SavedStateHandleSupport.enableSavedStateHandles(this);
    }

    @Override // androidx.view.ViewModelStoreOwner
    /* renamed from: getViewModelStore, reason: from getter */
    public final androidx.view.ViewModelStore getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public final androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return new androidx.view.SavedStateViewModelFactory();
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public final androidx.view.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras(null, 1, null);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        return mutableCreationExtras;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public final androidx.view.SavedStateRegistry getSavedStateRegistry() {
        return this.Camera2StreamConfigurationMap.getSavedStateRegistry();
    }

    @Override // androidx.view.LifecycleOwner
    public final androidx.view.Lifecycle getLifecycle() {
        return this.Camera2StreamConfigurationMap.getLifecycle();
    }
}
