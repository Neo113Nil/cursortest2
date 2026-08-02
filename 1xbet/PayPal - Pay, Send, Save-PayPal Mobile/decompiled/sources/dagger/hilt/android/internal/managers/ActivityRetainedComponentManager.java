package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
final class ActivityRetainedComponentManager implements dagger.hilt.internal.GeneratedComponentManager<dagger.hilt.android.components.ActivityRetainedComponent> {
    private volatile dagger.hilt.android.components.ActivityRetainedComponent Camera2StreamConfigurationMap;
    final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    final androidx.view.ViewModelStoreOwner getHighSpeedVideoSizes;

    /* loaded from: classes5.dex */
    public interface ActivityRetainedComponentBuilderEntryPoint {
        dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder retainedComponentBuilder();
    }

    public interface ActivityRetainedLifecycleEntryPoint {
        dagger.hilt.android.ActivityRetainedLifecycle getActivityRetainedLifecycle();
    }

    static final class ActivityRetainedComponentViewModel extends androidx.view.ViewModel {
        final dagger.hilt.android.components.ActivityRetainedComponent Camera2StreamConfigurationMap;
        final dagger.hilt.android.internal.managers.SavedStateHandleHolder getHighSpeedVideoFpsRangesFor;

        ActivityRetainedComponentViewModel(dagger.hilt.android.components.ActivityRetainedComponent activityRetainedComponent, dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder) {
            this.Camera2StreamConfigurationMap = activityRetainedComponent;
            this.getHighSpeedVideoFpsRangesFor = savedStateHandleHolder;
        }

        @Override // androidx.view.ViewModel
        public final void onCleared() {
            super.onCleared();
            ((dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl) ((dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint) dagger.hilt.EntryPoints.get(this.Camera2StreamConfigurationMap, dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedLifecycleEntryPoint.class)).getActivityRetainedLifecycle()).dispatchOnCleared();
        }
    }

    ActivityRetainedComponentManager(androidx.view.ComponentActivity componentActivity) {
        this.getHighSpeedVideoSizes = componentActivity;
        this.getHighResolutionOutputSizeshNQ4ISI = componentActivity;
    }

    /* renamed from: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager$1, reason: invalid class name */
    class AnonymousClass1 implements androidx.lifecycle.ViewModelProvider.Factory {
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;

        AnonymousClass1(android.content.Context context) {
            this.getHighResolutionOutputSizeshNQ4ISI = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls, androidx.view.viewmodel.CreationExtras creationExtras) {
            dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder = new dagger.hilt.android.internal.managers.SavedStateHandleHolder(creationExtras);
            return new dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentViewModel(((dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint) dagger.hilt.android.EntryPointAccessors.fromApplication(this.getHighResolutionOutputSizeshNQ4ISI, dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentBuilderEntryPoint.class)).retainedComponentBuilder().savedStateHandleHolder(savedStateHandleHolder).build(), savedStateHandleHolder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // dagger.hilt.internal.GeneratedComponentManager
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public dagger.hilt.android.components.ActivityRetainedComponent generatedComponent() {
        if (this.Camera2StreamConfigurationMap == null) {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = ((dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentViewModel) new androidx.view.ViewModelProvider(this.getHighSpeedVideoSizes, new dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI)).get(dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.ActivityRetainedComponentViewModel.class)).Camera2StreamConfigurationMap;
                }
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    @dagger.Module
    static abstract class LifecycleModule {
        LifecycleModule() {
        }

        @dagger.Provides
        static dagger.hilt.android.ActivityRetainedLifecycle Camera2StreamConfigurationMap() {
            return new dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl();
        }
    }
}
