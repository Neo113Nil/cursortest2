package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableFromIterable<T> extends io.reactivex.Observable<T> {
    final java.lang.Iterable<? extends T> getHighSpeedVideoSizes;

    public ObservableFromIterable(java.lang.Iterable<? extends T> iterable) {
        this.getHighSpeedVideoSizes = iterable;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        try {
            java.util.Iterator<? extends T> it = this.getHighSpeedVideoSizes.iterator();
            try {
                if (!it.hasNext()) {
                    io.reactivex.internal.disposables.EmptyDisposable.complete(observer);
                    return;
                }
                io.reactivex.internal.operators.observable.ObservableFromIterable.FromIterableDisposable fromIterableDisposable = new io.reactivex.internal.operators.observable.ObservableFromIterable.FromIterableDisposable(observer, it);
                observer.onSubscribe(fromIterableDisposable);
                if (fromIterableDisposable.getHighSpeedVideoFpsRanges) {
                    return;
                }
                while (!fromIterableDisposable.isDisposed()) {
                    try {
                        fromIterableDisposable.getHighSpeedVideoFpsRangesFor.onNext(io.reactivex.internal.functions.ObjectHelper.requireNonNull(fromIterableDisposable.getOutputMinFrameDuration.next(), "The iterator returned a null value"));
                        if (fromIterableDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            if (!fromIterableDisposable.getOutputMinFrameDuration.hasNext()) {
                                if (fromIterableDisposable.isDisposed()) {
                                    return;
                                }
                                fromIterableDisposable.getHighSpeedVideoFpsRangesFor.onComplete();
                                return;
                            }
                        } catch (java.lang.Throwable th) {
                            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                            fromIterableDisposable.getHighSpeedVideoFpsRangesFor.onError(th);
                            return;
                        }
                    } catch (java.lang.Throwable th2) {
                        io.reactivex.exceptions.Exceptions.throwIfFatal(th2);
                        fromIterableDisposable.getHighSpeedVideoFpsRangesFor.onError(th2);
                        return;
                    }
                }
            } catch (java.lang.Throwable th3) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th3);
                io.reactivex.internal.disposables.EmptyDisposable.error(th3, observer);
            }
        } catch (java.lang.Throwable th4) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th4);
            io.reactivex.internal.disposables.EmptyDisposable.error(th4, observer);
        }
    }

    /* loaded from: classes17.dex */
    static final class FromIterableDisposable<T> extends io.reactivex.internal.observers.BasicQueueDisposable<T> {
        volatile boolean Camera2StreamConfigurationMap;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        final java.util.Iterator<? extends T> getOutputMinFrameDuration;

        FromIterableDisposable(io.reactivex.Observer<? super T> observer, java.util.Iterator<? extends T> it) {
            this.getHighSpeedVideoFpsRangesFor = observer;
            this.getOutputMinFrameDuration = it;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.getHighSpeedVideoFpsRanges = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final T poll() {
            if (this.getHighSpeedVideoSizes) {
                return null;
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                if (!this.getOutputMinFrameDuration.hasNext()) {
                    this.getHighSpeedVideoSizes = true;
                    return null;
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
            }
            return (T) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getOutputMinFrameDuration.next(), "The iterator returned a null value");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.getHighSpeedVideoSizes = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.Camera2StreamConfigurationMap = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.Camera2StreamConfigurationMap;
        }
    }
}
