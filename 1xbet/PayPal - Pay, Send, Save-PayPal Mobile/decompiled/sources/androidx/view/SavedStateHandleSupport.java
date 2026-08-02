package androidx.view;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018\"\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u001aj\u0002`\u001b0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018"}, d2 = {"Landroidx/savedstate/SavedStateRegistryOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "T", "", "enableSavedStateHandles", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/SavedStateHandle;", "createSavedStateHandle", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/SavedStateHandle;", "", "VIEWMODEL_KEY", "Ljava/lang/String;", "SAVED_STATE_KEY", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesProvider", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "VIEW_MODEL_STORE_OWNER_KEY", "Landroid/os/Bundle;", "Landroidx/savedstate/Camera2StreamConfigurationMap;", "DEFAULT_ARGS_KEY"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateHandleSupport {
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle> DEFAULT_ARGS_KEY;
    public static final java.lang.String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.view.SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY;
    public static final java.lang.String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.view.ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY;

    public static final <T extends androidx.view.SavedStateRegistryOwner & androidx.view.ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) t;
        androidx.lifecycle.Lifecycle.State camera2StreamConfigurationMap = lifecycleOwner.getLifecycle().getCamera2StreamConfigurationMap();
        if (camera2StreamConfigurationMap != androidx.lifecycle.Lifecycle.State.INITIALIZED && camera2StreamConfigurationMap != androidx.lifecycle.Lifecycle.State.CREATED) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
            androidx.view.SavedStateHandlesProvider savedStateHandlesProvider = new androidx.view.SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
            lifecycleOwner.getLifecycle().addObserver(new androidx.view.SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final androidx.view.SavedStateHandle createSavedStateHandle(androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        androidx.view.SavedStateRegistryOwner savedStateRegistryOwner = (androidx.view.SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (savedStateRegistryOwner == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner = (androidx.view.ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        android.os.Bundle bundle = (android.os.Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
        java.lang.String str = (java.lang.String) creationExtras.get(androidx.view.ViewModelProvider.VIEW_MODEL_KEY);
        if (str == null) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        androidx.view.SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        androidx.view.SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        androidx.view.SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        androidx.view.SavedStateHandle createHandle = androidx.view.SavedStateHandle.INSTANCE.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, createHandle);
        return createHandle;
    }

    public static final androidx.view.SavedStateHandlesVM getSavedStateHandlesVM(androidx.view.ViewModelStoreOwner viewModelStoreOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
        return (androidx.view.SavedStateHandlesVM) androidx.view.ViewModelProvider.Companion.create$default(androidx.view.ViewModelProvider.INSTANCE, viewModelStoreOwner, new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final <T extends androidx.view.ViewModel> T create(kotlin.reflect.KClass<T> modelClass, androidx.view.viewmodel.CreationExtras extras) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
                return new androidx.view.SavedStateHandlesVM();
            }
        }, (androidx.view.viewmodel.CreationExtras) null, 4, (java.lang.Object) null).get(VIEWMODEL_KEY, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.SavedStateHandlesVM.class));
    }

    public static final androidx.view.SavedStateHandlesProvider getSavedStateHandlesProvider(androidx.view.SavedStateRegistryOwner savedStateRegistryOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "");
        androidx.savedstate.SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        androidx.view.SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof androidx.view.SavedStateHandlesProvider ? (androidx.view.SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider != null) {
            return savedStateHandlesProvider;
        }
        throw new java.lang.IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    static {
        androidx.view.viewmodel.CreationExtras.Companion companion = androidx.view.viewmodel.CreationExtras.INSTANCE;
        SAVED_STATE_REGISTRY_OWNER_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.view.SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$1
        };
        androidx.view.viewmodel.CreationExtras.Companion companion2 = androidx.view.viewmodel.CreationExtras.INSTANCE;
        VIEW_MODEL_STORE_OWNER_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.view.ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$2
        };
        androidx.view.viewmodel.CreationExtras.Companion companion3 = androidx.view.viewmodel.CreationExtras.INSTANCE;
        DEFAULT_ARGS_KEY = new androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$3
        };
    }
}
