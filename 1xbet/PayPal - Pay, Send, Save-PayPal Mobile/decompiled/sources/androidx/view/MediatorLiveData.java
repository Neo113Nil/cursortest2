package androidx.view;

/* loaded from: classes.dex */
public class MediatorLiveData<T> extends androidx.view.MutableLiveData<T> {
    private androidx.arch.core.internal.SafeIterableMap<androidx.view.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>> Camera2StreamConfigurationMap;

    public MediatorLiveData() {
        this.Camera2StreamConfigurationMap = new androidx.arch.core.internal.SafeIterableMap<>();
    }

    public MediatorLiveData(T t) {
        super(t);
        this.Camera2StreamConfigurationMap = new androidx.arch.core.internal.SafeIterableMap<>();
    }

    public <S> void addSource(androidx.view.LiveData<S> liveData, androidx.view.Observer<? super S> observer) {
        if (liveData == null) {
            throw new java.lang.NullPointerException("source cannot be null");
        }
        androidx.lifecycle.MediatorLiveData.Source<?> source = new androidx.lifecycle.MediatorLiveData.Source<>(liveData, observer);
        androidx.lifecycle.MediatorLiveData.Source<?> putIfAbsent = this.Camera2StreamConfigurationMap.putIfAbsent(liveData, source);
        if (putIfAbsent != null && putIfAbsent.getHighSpeedVideoFpsRangesFor != observer) {
            throw new java.lang.IllegalArgumentException("This source was already added with the different observer");
        }
        if (putIfAbsent == null && hasActiveObservers()) {
            source.getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public <S> void removeSource(androidx.view.LiveData<S> liveData) {
        androidx.lifecycle.MediatorLiveData.Source<?> remove = this.Camera2StreamConfigurationMap.remove(liveData);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRanges();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.LiveData
    public void onActive() {
        java.util.Iterator<java.util.Map.Entry<androidx.view.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().getValue().getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.view.LiveData
    public void onInactive() {
        java.util.Iterator<java.util.Map.Entry<androidx.view.LiveData<?>, androidx.lifecycle.MediatorLiveData.Source<?>>> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().getValue().getHighSpeedVideoFpsRanges();
        }
    }

    /* loaded from: classes7.dex */
    static class Source<V> implements androidx.view.Observer<V> {
        final androidx.view.LiveData<V> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges = -1;
        final androidx.view.Observer<? super V> getHighSpeedVideoFpsRangesFor;

        Source(androidx.view.LiveData<V> liveData, androidx.view.Observer<? super V> observer) {
            this.getHighResolutionOutputSizeshNQ4ISI = liveData;
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighResolutionOutputSizeshNQ4ISI.observeForever(this);
        }

        final void getHighSpeedVideoFpsRanges() {
            this.getHighResolutionOutputSizeshNQ4ISI.removeObserver(this);
        }

        @Override // androidx.view.Observer
        public void onChanged(V v) {
            if (this.getHighSpeedVideoFpsRanges != this.getHighResolutionOutputSizeshNQ4ISI.getVersion()) {
                this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getVersion();
                this.getHighSpeedVideoFpsRangesFor.onChanged(v);
            }
        }
    }
}
