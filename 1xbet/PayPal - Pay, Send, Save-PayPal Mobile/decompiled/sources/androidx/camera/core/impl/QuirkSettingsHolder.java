package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class QuirkSettingsHolder {
    public static final androidx.camera.core.impl.QuirkSettings DEFAULT = androidx.camera.core.impl.QuirkSettings.withDefaultBehavior();
    private static final androidx.camera.core.impl.QuirkSettingsHolder getHighSpeedVideoFpsRanges = new androidx.camera.core.impl.QuirkSettingsHolder();
    private final androidx.camera.core.impl.MutableStateObservable<androidx.camera.core.impl.QuirkSettings> getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.impl.MutableStateObservable.withInitialState(DEFAULT);

    public static androidx.camera.core.impl.QuirkSettingsHolder instance() {
        return getHighSpeedVideoFpsRanges;
    }

    public final androidx.camera.core.impl.QuirkSettings get() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.fetchData().get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            throw new java.lang.AssertionError("Unexpected error in QuirkSettings StateObservable", e);
        }
    }

    public final void set(androidx.camera.core.impl.QuirkSettings quirkSettings) {
        this.getHighResolutionOutputSizeshNQ4ISI.setState(quirkSettings);
    }

    public final void observe(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.impl.QuirkSettings> consumer) {
        this.getHighResolutionOutputSizeshNQ4ISI.addObserver(executor, new androidx.camera.core.impl.QuirkSettingsHolder.ObserverToConsumerAdapter(consumer));
    }

    public final void reset() {
        this.getHighResolutionOutputSizeshNQ4ISI.removeObservers();
        this.getHighResolutionOutputSizeshNQ4ISI.setState(DEFAULT);
    }

    static class ObserverToConsumerAdapter<T> implements androidx.camera.core.impl.Observable.Observer<T> {
        private final androidx.core.util.Consumer<T> getHighSpeedVideoFpsRangesFor;

        ObserverToConsumerAdapter(androidx.core.util.Consumer<T> consumer) {
            this.getHighSpeedVideoFpsRangesFor = consumer;
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onNewData(T t) {
            this.getHighSpeedVideoFpsRangesFor.accept(t);
        }

        @Override // androidx.camera.core.impl.Observable.Observer
        public void onError(java.lang.Throwable th) {
            androidx.camera.core.Logger.e("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }
}
