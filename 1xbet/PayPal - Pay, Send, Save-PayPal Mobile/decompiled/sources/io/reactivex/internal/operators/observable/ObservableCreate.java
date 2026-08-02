package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableCreate<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableOnSubscribe<T> getHighSpeedVideoFpsRanges;

    public ObservableCreate(io.reactivex.ObservableOnSubscribe<T> observableOnSubscribe) {
        this.getHighSpeedVideoFpsRanges = observableOnSubscribe;
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(io.reactivex.Observer<? super T> observer) {
        io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter createEmitter = new io.reactivex.internal.operators.observable.ObservableCreate.CreateEmitter(observer);
        observer.onSubscribe(createEmitter);
        try {
            this.getHighSpeedVideoFpsRanges.subscribe(createEmitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            createEmitter.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class CreateEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.ObservableEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        final io.reactivex.Observer<? super T> getHighSpeedVideoFpsRangesFor;

        CreateEmitter(io.reactivex.Observer<? super T> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor.onNext(t);
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.ObservableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onError(th);
                dispose();
                return true;
            } catch (java.lang.Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.getHighSpeedVideoFpsRangesFor.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            io.reactivex.internal.disposables.DisposableHelper.set(this, disposable);
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.ObservableEmitter
        public final io.reactivex.ObservableEmitter<T> serialize() {
            return new io.reactivex.internal.operators.observable.ObservableCreate.SerializedEmitter(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return io.reactivex.internal.disposables.DisposableHelper.isDisposed(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* loaded from: classes17.dex */
    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean Camera2StreamConfigurationMap;
        final io.reactivex.ObservableEmitter<T> getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(16);

        @Override // io.reactivex.ObservableEmitter
        public final io.reactivex.ObservableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(io.reactivex.ObservableEmitter<T> observableEmitter) {
            this.getHighSpeedVideoFpsRanges = observableEmitter;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges.isDisposed() || this.Camera2StreamConfigurationMap) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.getHighSpeedVideoFpsRanges.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getHighSpeedVideoFpsRangesFor;
                synchronized (spscLinkedArrayQueue) {
                    spscLinkedArrayQueue.offer(t);
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.ObservableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges.isDisposed() || this.Camera2StreamConfigurationMap) {
                return false;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!this.getHighSpeedVideoSizes.addThrowable(th)) {
                return false;
            }
            this.Camera2StreamConfigurationMap = true;
            if (getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return true;
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.getHighSpeedVideoFpsRanges.isDisposed() || this.Camera2StreamConfigurationMap) {
                return;
            }
            this.Camera2StreamConfigurationMap = true;
            if (getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.ObservableEmitter<T> observableEmitter = this.getHighSpeedVideoFpsRanges;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoSizes;
            int i = 1;
            while (!observableEmitter.isDisposed()) {
                if (atomicThrowable.get() != null) {
                    spscLinkedArrayQueue.clear();
                    observableEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.Camera2StreamConfigurationMap;
                T poll = spscLinkedArrayQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    observableEmitter.onComplete();
                    return;
                } else if (!z2) {
                    observableEmitter.onNext(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoFpsRanges.setDisposable(disposable);
        }

        @Override // io.reactivex.ObservableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            this.getHighSpeedVideoFpsRanges.setCancellable(cancellable);
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRanges.isDisposed();
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges.toString();
        }
    }
}
