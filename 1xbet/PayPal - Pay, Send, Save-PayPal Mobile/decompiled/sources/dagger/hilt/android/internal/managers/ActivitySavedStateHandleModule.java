package dagger.hilt.android.internal.managers;

@dagger.Module
/* loaded from: classes17.dex */
abstract class ActivitySavedStateHandleModule {
    ActivitySavedStateHandleModule() {
    }

    @dagger.Provides
    static androidx.view.SavedStateHandle getHighResolutionOutputSizeshNQ4ISI(dagger.hilt.android.internal.managers.SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
