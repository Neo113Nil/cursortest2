package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservablePublish<T> extends io.reactivex.observables.ConnectableObservable<T> implements io.reactivex.internal.fuseable.HasUpstreamObservableSource<T> {
    final io.reactivex.ObservableSource<T> Camera2StreamConfigurationMap;
    final io.reactivex.ObservableSource<T> getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> getHighSpeedVideoSizes;

    public static <T> io.reactivex.observables.ConnectableObservable<T> create(io.reactivex.ObservableSource<T> observableSource) {
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        return io.reactivex.plugins.RxJavaPlugins.onAssembly((io.reactivex.observables.ConnectableObservable) new io.reactivex.internal.operators.observable.ObservablePublish(new io.reactivex.internal.operators.observable.ObservablePublish.PublishSource(atomicReference), observableSource, atomicReference));
    }

    private ObservablePublish(io.reactivex.ObservableSource<T> observableSource, io.reactivex.ObservableSource<T> observableSource2, java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
        this.getHighSpeedVideoFpsRangesFor = observableSource;
        this.Camera2StreamConfigurationMap = observableSource2;
        this.getHighSpeedVideoSizes = atomicReference;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public final io.reactivex.ObservableSource<T> source() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRangesFor.subscribe(observer);
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public final void connect(io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> consumer) {
        io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver;
        while (true) {
            publishObserver = this.getHighSpeedVideoSizes.get();
            if (publishObserver != null && !publishObserver.isDisposed()) {
                break;
            }
            io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver2 = new io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<>(this.getHighSpeedVideoSizes);
            if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, publishObserver, publishObserver2)) {
                publishObserver = publishObserver2;
                break;
            }
        }
        boolean z = false;
        if (!publishObserver.getInputSizeshNQ4ISI.get() && publishObserver.getInputSizeshNQ4ISI.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(publishObserver);
            if (z) {
                this.Camera2StreamConfigurationMap.subscribe(publishObserver);
            }
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class PublishObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] getHighResolutionOutputSizeshNQ4ISI = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[0];
        static final io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] getHighSpeedVideoSizes = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[0];
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> Camera2StreamConfigurationMap;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[]> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(getHighResolutionOutputSizeshNQ4ISI);
        final java.util.concurrent.atomic.AtomicBoolean getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicBoolean();

        PublishObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
            this.Camera2StreamConfigurationMap = atomicReference;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[]> atomicReference = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr = getHighSpeedVideoSizes;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, this, null);
                io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.get() == getHighSpeedVideoSizes;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.setOnce(this.getHighSpeedVideoFpsRanges, disposable);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t) {
            for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : this.getHighSpeedVideoFpsRangesFor.get()) {
                innerDisposable.getHighSpeedVideoSizes.onNext(t);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, this, null);
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] andSet = this.getHighSpeedVideoFpsRangesFor.getAndSet(getHighSpeedVideoSizes);
            if (andSet.length != 0) {
                for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : andSet) {
                    innerDisposable.getHighSpeedVideoSizes.onError(th);
                }
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.Camera2StreamConfigurationMap, this, null);
            for (io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable : this.getHighSpeedVideoFpsRangesFor.getAndSet(getHighSpeedVideoSizes)) {
                innerDisposable.getHighSpeedVideoSizes.onComplete();
            }
        }

        final void getHighResolutionOutputSizeshNQ4ISI(io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable) {
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.getHighSpeedVideoFpsRangesFor.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerDisposableArr[i].equals(innerDisposable)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = getHighResolutionOutputSizeshNQ4ISI;
                } else {
                    io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] innerDisposableArr3 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[length - 1];
                    java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i);
                    java.lang.System.arraycopy(innerDisposableArr, i + 1, innerDisposableArr3, i, (length - i) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, innerDisposableArr, innerDisposableArr2));
        }
    }

    /* loaded from: classes17.dex */
    static final class InnerDisposable<T> extends java.util.concurrent.atomic.AtomicReference<java.lang.Object> implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

        InnerDisposable(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoSizes = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get() == this;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            java.lang.Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) andSet).getHighResolutionOutputSizeshNQ4ISI(this);
        }
    }

    /* loaded from: classes17.dex */
    static final class PublishSource<T> implements io.reactivex.ObservableSource<T> {
        private final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> getHighSpeedVideoFpsRanges;

        PublishSource(java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T>> atomicReference) {
            this.getHighSpeedVideoFpsRanges = atomicReference;
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0008, code lost:
        
            continue;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // io.reactivex.ObservableSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void subscribe(io.reactivex.Observer<? super T> observer) {
            io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T>[] innerDisposableArr;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[] innerDisposableArr2;
            io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<T> innerDisposable = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable<>(observer);
            observer.onSubscribe(innerDisposable);
            loop0: while (true) {
                publishObserver = this.getHighSpeedVideoFpsRanges.get();
                if (publishObserver == null || publishObserver.isDisposed()) {
                    io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<T> publishObserver2 = new io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver<>(this.getHighSpeedVideoFpsRanges);
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, publishObserver, publishObserver2)) {
                        publishObserver = publishObserver2;
                    } else {
                        continue;
                    }
                }
                do {
                    innerDisposableArr = publishObserver.getHighSpeedVideoFpsRangesFor.get();
                    if (innerDisposableArr == io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver.getHighSpeedVideoSizes) {
                        break;
                    }
                    int length = innerDisposableArr.length;
                    innerDisposableArr2 = new io.reactivex.internal.operators.observable.ObservablePublish.InnerDisposable[length + 1];
                    java.lang.System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                    innerDisposableArr2[length] = innerDisposable;
                } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(publishObserver.getHighSpeedVideoFpsRangesFor, innerDisposableArr, innerDisposableArr2));
                if (innerDisposable.compareAndSet(null, publishObserver)) {
                    publishObserver.getHighResolutionOutputSizeshNQ4ISI(innerDisposable);
                    return;
                }
                return;
            }
            if (innerDisposable.compareAndSet(null, publishObserver)) {
            }
        }
    }
}
