package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory implements dagger.internal.Factory<dagger.hilt.android.ActivityRetainedLifecycle> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final dagger.hilt.android.ActivityRetainedLifecycle get() {
        return provideActivityRetainedLifecycle();
    }

    public static dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory create() {
        return dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static dagger.hilt.android.ActivityRetainedLifecycle provideActivityRetainedLifecycle() {
        return (dagger.hilt.android.ActivityRetainedLifecycle) dagger.internal.Preconditions.checkNotNullFromProvides(dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.LifecycleModule.Camera2StreamConfigurationMap());
    }

    static final class InstanceHolder {
        static final dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory getHighResolutionOutputSizeshNQ4ISI = new dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory();

        private InstanceHolder() {
        }
    }
}
