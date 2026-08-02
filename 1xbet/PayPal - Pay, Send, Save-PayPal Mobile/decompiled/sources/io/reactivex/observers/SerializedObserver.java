package io.reactivex.observers;

/* loaded from: classes17.dex */
public final class SerializedObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
    final boolean Camera2StreamConfigurationMap;
    final io.reactivex.Observer<? super T> getHighResolutionOutputSizeshNQ4ISI;
    volatile boolean getHighSpeedVideoFpsRanges;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    io.reactivex.disposables.Disposable getInputFormats;

    public SerializedObserver(io.reactivex.Observer<? super T> observer) {
        this(observer, false);
    }

    public SerializedObserver(io.reactivex.Observer<? super T> observer, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = observer;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (io.reactivex.internal.disposables.DisposableHelper.validate(this.getInputFormats, disposable)) {
            this.getInputFormats = disposable;
            this.getHighResolutionOutputSizeshNQ4ISI.onSubscribe(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        this.getInputFormats.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.getInputFormats.isDisposed();
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        if (t == null) {
            this.getInputFormats.dispose();
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList2 = this.getHighSpeedVideoFpsRangesFor;
                if (appendOnlyLinkedArrayList2 == null) {
                    appendOnlyLinkedArrayList2 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList2;
                }
                appendOnlyLinkedArrayList2.add(io.reactivex.internal.util.NotificationLite.next(t));
                return;
            }
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
            do {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                    if (appendOnlyLinkedArrayList == null) {
                        this.getHighSpeedVideoSizes = false;
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor = null;
                }
            } while (!appendOnlyLinkedArrayList.accept(this.getHighResolutionOutputSizeshNQ4ISI));
        }
    }

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable th) {
        if (this.getHighSpeedVideoFpsRanges) {
            io.reactivex.plugins.RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoSizes) {
                    this.getHighSpeedVideoFpsRanges = true;
                    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                        this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                    }
                    java.lang.Object error = io.reactivex.internal.util.NotificationLite.error(th);
                    if (this.Camera2StreamConfigurationMap) {
                        appendOnlyLinkedArrayList.add(error);
                    } else {
                        appendOnlyLinkedArrayList.setFirst(error);
                    }
                    return;
                }
                this.getHighSpeedVideoFpsRanges = true;
                this.getHighSpeedVideoSizes = true;
                z = false;
            }
            if (z) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public final void onComplete() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoSizes) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoFpsRangesFor;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoFpsRangesFor = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.complete());
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            this.getHighSpeedVideoSizes = true;
            this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
        }
    }
}
