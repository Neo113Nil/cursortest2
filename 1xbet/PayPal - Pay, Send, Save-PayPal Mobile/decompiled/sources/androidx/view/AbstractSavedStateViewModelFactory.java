package androidx.view;

@kotlin.Deprecated(message = "Use `viewModelFactory` or implement `ViewModelProvider.Factory`, combined with `CreationExtras.createSavedStateHandle()`.")
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\tJ/\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0017J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u001a\u001a\u00020\u0019H$¢\u0006\u0004\b\u0010\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010'"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Landroid/os/Bundle;", "defaultArgs", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "Landroidx/lifecycle/ViewModel;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "key", "Landroidx/lifecycle/SavedStateHandle;", "handle", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "viewModel", "", "onRequery", "(Landroidx/lifecycle/ViewModel;)V", "Landroidx/savedstate/SavedStateRegistry;", "Landroidx/savedstate/SavedStateRegistry;", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/Lifecycle;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/Lifecycle;", "getHighSpeedVideoSizes", "Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.view.Lifecycle getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.view.SavedStateRegistry getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.os.Bundle getHighSpeedVideoFpsRanges;

    protected abstract <T extends androidx.view.ViewModel> T create(java.lang.String key, java.lang.Class<T> modelClass, androidx.view.SavedStateHandle handle);

    public AbstractSavedStateViewModelFactory() {
    }

    public AbstractSavedStateViewModelFactory(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        this.getHighSpeedVideoFpsRangesFor = savedStateRegistryOwner.getSavedStateRegistry();
        this.getHighSpeedVideoSizes = savedStateRegistryOwner.getLifecycle();
        this.getHighSpeedVideoFpsRanges = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
        java.lang.String str = (java.lang.String) extras.get(androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str == null) {
            throw new java.lang.IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return (T) getHighSpeedVideoFpsRanges(str, modelClass);
        }
        return (T) create(str, modelClass, androidx.view.SavedStateHandleSupport.createSavedStateHandle(extras));
    }

    private final <T extends androidx.view.ViewModel> T getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.Class<T> p1) {
        androidx.view.SavedStateRegistry savedStateRegistry = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
        androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycle);
        androidx.view.SavedStateHandleController create = androidx.view.LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, p0, this.getHighSpeedVideoFpsRanges);
        T t = (T) create(p0, p1, create.getCamera2StreamConfigurationMap());
        t.addCloseable(androidx.view.LegacySavedStateHandleController.TAG_SAVED_STATE_HANDLE_CONTROLLER, create);
        return t;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
        java.lang.String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return (T) getHighSpeedVideoFpsRanges(canonicalName, modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.view.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        androidx.view.SavedStateRegistry savedStateRegistry = this.getHighSpeedVideoFpsRangesFor;
        if (savedStateRegistry != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(savedStateRegistry);
            androidx.view.Lifecycle lifecycle = this.getHighSpeedVideoSizes;
            kotlin.jvm.internal.Intrinsics.checkNotNull(lifecycle);
            androidx.view.LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }
}
