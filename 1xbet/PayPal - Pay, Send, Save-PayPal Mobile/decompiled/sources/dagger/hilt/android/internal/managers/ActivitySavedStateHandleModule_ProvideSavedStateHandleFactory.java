package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory implements dagger.internal.Factory<androidx.view.SavedStateHandle> {
    private final dagger.internal.Provider<dagger.hilt.android.internal.managers.SavedStateHandleHolder> getHighResolutionOutputSizeshNQ4ISI;

    private ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory(dagger.internal.Provider<dagger.hilt.android.internal.managers.SavedStateHandleHolder> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.view.SavedStateHandle get() {
        return provideSavedStateHandle(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static dagger.hilt.android.internal.managers.ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory create(dagger.internal.Provider<dagger.hilt.android.internal.managers.SavedStateHandleHolder> provider) {
        return new dagger.hilt.android.internal.managers.ActivitySavedStateHandleModule_ProvideSavedStateHandleFactory(provider);
    }

    public static androidx.view.SavedStateHandle provideSavedStateHandle(dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder) {
        return (androidx.view.SavedStateHandle) dagger.internal.Preconditions.checkNotNullFromProvides(dagger.hilt.android.internal.managers.ActivitySavedStateHandleModule.getHighResolutionOutputSizeshNQ4ISI(savedStateHandleHolder));
    }
}
