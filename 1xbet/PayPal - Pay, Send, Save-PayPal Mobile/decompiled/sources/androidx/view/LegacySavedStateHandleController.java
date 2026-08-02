package androidx.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistry;", "registry", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "create", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/ViewModel;", "viewModel", "", "attachHandleIfNeeded", "(Landroidx/lifecycle/ViewModel;Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/Lifecycle;)V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "Ljava/lang/String;", "OnRecreation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final androidx.view.LegacySavedStateHandleController INSTANCE = new androidx.view.LegacySavedStateHandleController();
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    private LegacySavedStateHandleController() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.SavedStateHandleController create(androidx.view.SavedStateRegistry registry, androidx.view.Lifecycle lifecycle, java.lang.String key, android.os.Bundle defaultArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNull(key);
        androidx.view.SavedStateHandleController savedStateHandleController = new androidx.view.SavedStateHandleController(key, androidx.view.SavedStateHandle.INSTANCE.createHandle(registry.consumeRestoredStateForKey(key), defaultArgs));
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        getHighSpeedVideoFpsRanges(registry, lifecycle);
        return savedStateHandleController;
    }

    @kotlin.jvm.JvmStatic
    public static final void attachHandleIfNeeded(androidx.view.ViewModel viewModel, androidx.view.SavedStateRegistry registry, androidx.view.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(registry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        androidx.view.SavedStateHandleController savedStateHandleController = (androidx.view.SavedStateHandleController) viewModel.getCloseable(TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController == null || savedStateHandleController.getGetHighSpeedVideoSizes()) {
            return;
        }
        savedStateHandleController.attachToLifecycle(registry, lifecycle);
        getHighSpeedVideoFpsRanges(registry, lifecycle);
    }

    private static void getHighSpeedVideoFpsRanges(final androidx.view.SavedStateRegistry p0, final androidx.view.Lifecycle p1) {
        androidx.lifecycle.Lifecycle.State camera2StreamConfigurationMap = p1.getCamera2StreamConfigurationMap();
        if (camera2StreamConfigurationMap == androidx.lifecycle.Lifecycle.State.INITIALIZED || camera2StreamConfigurationMap.isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
            p0.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
        } else {
            p1.addObserver(new androidx.view.LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.view.LifecycleEventObserver
                public final void onStateChanged(androidx.view.LifecycleOwner source, androidx.lifecycle.Lifecycle.Event event) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
                    if (event == androidx.lifecycle.Lifecycle.Event.ON_START) {
                        androidx.view.Lifecycle.this.removeObserver(this);
                        p0.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "<init>", "()V", "Landroidx/savedstate/SavedStateRegistryOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "", "onRecreated", "(Landroidx/savedstate/SavedStateRegistryOwner;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public final void onRecreated(androidx.view.SavedStateRegistryOwner owner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
            if (!(owner instanceof androidx.view.ViewModelStoreOwner)) {
                throw new java.lang.IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(java.lang.String.valueOf(owner)).toString());
            }
            androidx.view.ViewModelStore getHighSpeedVideoSizes = ((androidx.view.ViewModelStoreOwner) owner).getGetHighSpeedVideoSizes();
            androidx.view.SavedStateRegistry savedStateRegistry = owner.getSavedStateRegistry();
            java.util.Iterator<java.lang.String> it = getHighSpeedVideoSizes.keys().iterator();
            while (it.hasNext()) {
                androidx.view.ViewModel viewModel = getHighSpeedVideoSizes.get(it.next());
                if (viewModel != null) {
                    androidx.view.LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, owner.getLifecycleRegistry());
                }
            }
            if (getHighSpeedVideoSizes.keys().isEmpty()) {
                return;
            }
            savedStateRegistry.runOnNextRecreation(androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class);
        }
    }
}
