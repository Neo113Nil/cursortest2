package io.reactivex.subjects;

/* loaded from: classes17.dex */
final class SerializedSubject<T> extends io.reactivex.subjects.Subject<T> implements io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
    final io.reactivex.subjects.Subject<T> Camera2StreamConfigurationMap;
    volatile boolean getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> getHighSpeedVideoSizes;

    SerializedSubject(io.reactivex.subjects.Subject<T> subject) {
        this.Camera2StreamConfigurationMap = subject;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.Camera2StreamConfigurationMap.subscribe(observer);
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        if (!this.getHighSpeedVideoFpsRanges) {
            synchronized (this) {
                boolean z = true;
                if (!this.getHighSpeedVideoFpsRanges) {
                    if (this.getHighSpeedVideoFpsRangesFor) {
                        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoSizes;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                            this.getHighSpeedVideoSizes = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.disposable(disposable));
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor = true;
                    z = false;
                }
                if (!z) {
                    this.Camera2StreamConfigurationMap.onSubscribe(disposable);
                    getHighResolutionOutputSizeshNQ4ISI();
                    return;
                }
            }
        }
        disposable.dispose();
    }

    @Override // io.reactivex.Observer
    public final void onNext(T t) {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        synchronized (this) {
            if (this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoSizes;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoSizes = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.next(t));
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.onNext(t);
            getHighResolutionOutputSizeshNQ4ISI();
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
                this.getHighSpeedVideoFpsRanges = true;
                if (this.getHighSpeedVideoFpsRangesFor) {
                    io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoSizes;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                        this.getHighSpeedVideoSizes = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.setFirst(io.reactivex.internal.util.NotificationLite.error(th));
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                z = false;
            }
            if (z) {
                io.reactivex.plugins.RxJavaPlugins.onError(th);
            } else {
                this.Camera2StreamConfigurationMap.onError(th);
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
            this.getHighSpeedVideoFpsRanges = true;
            if (this.getHighSpeedVideoFpsRangesFor) {
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList = this.getHighSpeedVideoSizes;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new io.reactivex.internal.util.AppendOnlyLinkedArrayList<>(4);
                    this.getHighSpeedVideoSizes = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.add(io.reactivex.internal.util.NotificationLite.complete());
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = true;
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.getHighSpeedVideoSizes;
                if (appendOnlyLinkedArrayList == null) {
                    this.getHighSpeedVideoFpsRangesFor = false;
                    return;
                }
                this.getHighSpeedVideoSizes = null;
            }
            appendOnlyLinkedArrayList.forEachWhile(this);
        }
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    public final boolean test(java.lang.Object obj) {
        return io.reactivex.internal.util.NotificationLite.acceptFull(obj, this.Camera2StreamConfigurationMap);
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasObservers() {
        return this.Camera2StreamConfigurationMap.hasObservers();
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasThrowable() {
        return this.Camera2StreamConfigurationMap.hasThrowable();
    }

    @Override // io.reactivex.subjects.Subject
    public final java.lang.Throwable getThrowable() {
        return this.Camera2StreamConfigurationMap.getThrowable();
    }

    @Override // io.reactivex.subjects.Subject
    public final boolean hasComplete() {
        return this.Camera2StreamConfigurationMap.hasComplete();
    }
}
