package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public abstract class AbstractCameraPresenceSource implements androidx.camera.core.impl.Observable<java.util.List<androidx.camera.core.CameraIdentifier>> {
    private final java.lang.Object Camera2StreamConfigurationMap;
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.util.List<androidx.camera.core.CameraIdentifier> getHighSpeedVideoFpsRangesFor;
    private final java.util.List<androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper> getHighSpeedVideoSizes;

    @Override // androidx.camera.core.impl.Observable
    public abstract com.google.common.util.concurrent.ListenableFuture<java.util.List<androidx.camera.core.CameraIdentifier>> fetchData();

    protected abstract void startMonitoring();

    protected abstract void stopMonitoring();

    public AbstractCameraPresenceSource() {
        this(java.util.Collections.emptyList());
    }

    public AbstractCameraPresenceSource(java.util.List<java.lang.String> list) {
        this.Camera2StreamConfigurationMap = new java.lang.Object();
        this.getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = false;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(androidx.camera.core.CameraIdentifier.Factory.create(it.next()));
        }
        this.getHighSpeedVideoFpsRangesFor = arrayList;
    }

    static class ObserverWrapper {
        final androidx.camera.core.impl.Observable.Observer<? super java.util.List<androidx.camera.core.CameraIdentifier>> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.Executor getHighSpeedVideoSizes;

        ObserverWrapper(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super java.util.List<androidx.camera.core.CameraIdentifier>> observer) {
            this.getHighSpeedVideoSizes = executor;
            this.getHighSpeedVideoFpsRangesFor = observer;
        }
    }

    public void updateData(java.util.List<androidx.camera.core.CameraIdentifier> list) {
        getHighSpeedVideoSizes(list, null);
    }

    public void updateError(java.lang.Throwable th) {
        getHighSpeedVideoSizes(null, th);
    }

    private void getHighSpeedVideoSizes(java.util.List<androidx.camera.core.CameraIdentifier> list, java.lang.Throwable th) {
        boolean z;
        java.util.List unmodifiableList;
        java.lang.Throwable th2;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (th != null) {
                z = this.getHighResolutionOutputSizeshNQ4ISI == null || !this.getHighSpeedVideoFpsRangesFor.isEmpty();
                this.getHighResolutionOutputSizeshNQ4ISI = th;
                this.getHighSpeedVideoFpsRangesFor = java.util.Collections.emptyList();
            } else {
                androidx.core.util.Preconditions.checkNotNull(list);
                z = (this.getHighResolutionOutputSizeshNQ4ISI == null && this.getHighSpeedVideoFpsRangesFor.equals(list)) ? false : true;
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRangesFor = list;
            }
            unmodifiableList = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            th2 = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (z) {
            this.getHighSpeedVideoSizes.size();
            for (androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper observerWrapper : this.getHighSpeedVideoSizes) {
                observerWrapper.getHighSpeedVideoSizes.execute(new androidx.camera.core.impl.AbstractCameraPresenceSource$$ExternalSyntheticLambda0(th2, observerWrapper, unmodifiableList));
            }
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(java.lang.Throwable th, androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper observerWrapper, java.util.List list) {
        if (th != null) {
            observerWrapper.getHighSpeedVideoFpsRangesFor.onError(th);
        } else {
            observerWrapper.getHighSpeedVideoFpsRangesFor.onNewData(list);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(java.util.concurrent.Executor executor, androidx.camera.core.impl.Observable.Observer<? super java.util.List<androidx.camera.core.CameraIdentifier>> observer) {
        java.util.List unmodifiableList;
        java.lang.Throwable th;
        androidx.core.util.Preconditions.checkNotNull(executor);
        androidx.core.util.Preconditions.checkNotNull(observer);
        this.getHighSpeedVideoSizes.add(new androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper(executor, observer));
        synchronized (this.Camera2StreamConfigurationMap) {
            if (!this.getHighSpeedVideoFpsRanges && !this.getHighSpeedVideoSizes.isEmpty()) {
                this.getHighSpeedVideoFpsRanges = true;
                startMonitoring();
            }
            unmodifiableList = java.util.Collections.unmodifiableList(this.getHighSpeedVideoFpsRangesFor);
            th = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper observerWrapper = new androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper(executor, observer);
        observerWrapper.getHighSpeedVideoSizes.execute(new androidx.camera.core.impl.AbstractCameraPresenceSource$$ExternalSyntheticLambda0(th, observerWrapper, unmodifiableList));
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(androidx.camera.core.impl.Observable.Observer<? super java.util.List<androidx.camera.core.CameraIdentifier>> observer) {
        androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper observerWrapper;
        androidx.core.util.Preconditions.checkNotNull(observer);
        java.util.Iterator<androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper> it = this.getHighSpeedVideoSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                observerWrapper = null;
                break;
            } else {
                observerWrapper = it.next();
                if (observerWrapper.getHighSpeedVideoFpsRangesFor.equals(observer)) {
                    break;
                }
            }
        }
        if (observerWrapper != null) {
            this.getHighSpeedVideoSizes.remove(observerWrapper);
        }
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes.isEmpty()) {
                this.getHighSpeedVideoFpsRanges = false;
                stopMonitoring();
            }
        }
    }
}
