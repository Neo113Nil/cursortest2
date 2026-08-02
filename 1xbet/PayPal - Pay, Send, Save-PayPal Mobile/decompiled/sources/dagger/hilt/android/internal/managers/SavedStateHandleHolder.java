package dagger.hilt.android.internal.managers;

/* loaded from: classes17.dex */
public final class SavedStateHandleHolder {
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private androidx.view.SavedStateHandle getHighSpeedVideoFpsRangesFor;
    private androidx.view.viewmodel.CreationExtras getHighSpeedVideoSizes;

    public SavedStateHandleHolder(androidx.view.viewmodel.CreationExtras creationExtras) {
        this.getHighResolutionOutputSizeshNQ4ISI = creationExtras != null;
        this.getHighSpeedVideoSizes = creationExtras;
    }

    public final androidx.view.SavedStateHandle getSavedStateHandle() {
        dagger.hilt.android.internal.ThreadUtil.ensureMainThread();
        dagger.hilt.internal.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new java.lang.Object[0]);
        androidx.view.SavedStateHandle savedStateHandle = this.getHighSpeedVideoFpsRangesFor;
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        dagger.hilt.internal.Preconditions.checkNotNull(this.getHighSpeedVideoSizes, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        androidx.view.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.view.viewmodel.MutableCreationExtras(this.getHighSpeedVideoSizes);
        mutableCreationExtras.set(androidx.view.SavedStateHandleSupport.DEFAULT_ARGS_KEY, android.os.Bundle.EMPTY);
        this.getHighSpeedVideoSizes = mutableCreationExtras;
        androidx.view.SavedStateHandle createSavedStateHandle = androidx.view.SavedStateHandleSupport.createSavedStateHandle(mutableCreationExtras);
        this.getHighSpeedVideoFpsRangesFor = createSavedStateHandle;
        this.getHighSpeedVideoSizes = null;
        return createSavedStateHandle;
    }

    public final void clear() {
        this.getHighSpeedVideoSizes = null;
    }

    public final void setExtras(androidx.view.viewmodel.CreationExtras creationExtras) {
        dagger.hilt.internal.Preconditions.checkState(this.getHighResolutionOutputSizeshNQ4ISI, "setExtras should only be called for an Activity that extends ComponentActivity", new java.lang.Object[0]);
        if (this.getHighSpeedVideoFpsRangesFor != null) {
            return;
        }
        this.getHighSpeedVideoSizes = creationExtras;
    }

    public final boolean isInvalid() {
        return this.getHighSpeedVideoFpsRangesFor == null && this.getHighSpeedVideoSizes == null;
    }
}
