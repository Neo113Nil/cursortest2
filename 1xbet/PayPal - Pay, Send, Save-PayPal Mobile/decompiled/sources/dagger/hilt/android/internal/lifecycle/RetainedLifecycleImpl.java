package dagger.hilt.android.internal.lifecycle;

/* loaded from: classes17.dex */
public final class RetainedLifecycleImpl implements dagger.hilt.android.ActivityRetainedLifecycle, dagger.hilt.android.ViewModelLifecycle {
    private final java.util.Set<dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
    private boolean getHighSpeedVideoFpsRangesFor = false;

    @Override // dagger.hilt.android.lifecycle.RetainedLifecycle
    public final void addOnClearedListener(dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener onClearedListener) {
        dagger.hilt.android.internal.ThreadUtil.ensureMainThread();
        if (!this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(onClearedListener);
            return;
        }
        throw new java.lang.IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
    }

    @Override // dagger.hilt.android.lifecycle.RetainedLifecycle
    public final void removeOnClearedListener(dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener onClearedListener) {
        dagger.hilt.android.internal.ThreadUtil.ensureMainThread();
        if (!this.getHighSpeedVideoFpsRangesFor) {
            this.getHighResolutionOutputSizeshNQ4ISI.remove(onClearedListener);
            return;
        }
        throw new java.lang.IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
    }

    public final void dispatchOnCleared() {
        dagger.hilt.android.internal.ThreadUtil.ensureMainThread();
        this.getHighSpeedVideoFpsRangesFor = true;
        java.util.Iterator<dagger.hilt.android.lifecycle.RetainedLifecycle.OnClearedListener> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
    }
}
