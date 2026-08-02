package androidx.fragment.app;

/* loaded from: classes3.dex */
class FragmentViewLifecycleOwner implements androidx.view.HasDefaultViewModelProviderFactory, androidx.view.SavedStateRegistryOwner, androidx.view.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory Camera2StreamConfigurationMap;
    private final java.lang.Runnable getHighSpeedVideoFpsRanges;
    private final androidx.fragment.app.Fragment getHighSpeedVideoFpsRangesFor;
    private final androidx.view.ViewModelStore getOutputFormats;
    private androidx.view.LifecycleRegistry getHighResolutionOutputSizeshNQ4ISI = null;
    private androidx.view.SavedStateRegistryController getHighSpeedVideoSizes = null;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment fragment, androidx.view.ViewModelStore viewModelStore, java.lang.Runnable runnable) {
        this.getHighSpeedVideoFpsRangesFor = fragment;
        this.getOutputFormats = viewModelStore;
        this.getHighSpeedVideoFpsRanges = runnable;
    }

    @Override // androidx.view.ViewModelStoreOwner
    public androidx.view.ViewModelStore getViewModelStore() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getOutputFormats;
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.view.LifecycleRegistry(this);
            androidx.view.SavedStateRegistryController create = androidx.view.SavedStateRegistryController.create(this);
            this.getHighSpeedVideoSizes = create;
            create.performAttach();
            this.getHighSpeedVideoFpsRanges.run();
        }
    }

    final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }

    @Override // androidx.view.LifecycleOwner
    public androidx.view.Lifecycle getLifecycle() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.lifecycle.Lifecycle.State state) {
        this.getHighResolutionOutputSizeshNQ4ISI.setCurrentState(state);
    }

    final void getHighSpeedVideoSizes(androidx.lifecycle.Lifecycle.Event event) {
        this.getHighResolutionOutputSizeshNQ4ISI.handleLifecycleEvent(event);
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        android.app.Application application;
        androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory = this.getHighSpeedVideoFpsRangesFor.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.getHighSpeedVideoFpsRangesFor.mDefaultFactory)) {
            this.Camera2StreamConfigurationMap = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.Camera2StreamConfigurationMap == null) {
            android.content.Context applicationContext = this.getHighSpeedVideoFpsRangesFor.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof android.content.ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof android.app.Application) {
                    application = (android.app.Application) applicationContext;
                    break;
                }
                applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
            }
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = new androidx.view.SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.view.HasDefaultViewModelProviderFactory
    public androidx.view.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
        android.app.Application application;
        android.content.Context applicationContext = this.getHighSpeedVideoFpsRangesFor.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof android.content.ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
                break;
            }
            applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext();
        }
        androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.getHighSpeedVideoFpsRangesFor);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.getHighSpeedVideoFpsRangesFor.getArguments() != null) {
            mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.getHighSpeedVideoFpsRangesFor.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.view.SavedStateRegistryOwner
    public androidx.view.SavedStateRegistry getSavedStateRegistry() {
        getHighResolutionOutputSizeshNQ4ISI();
        return this.getHighSpeedVideoSizes.getSavedStateRegistry();
    }

    final void getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle) {
        this.getHighSpeedVideoSizes.performRestore(bundle);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
        this.getHighSpeedVideoSizes.performSave(bundle);
    }
}
