package io.reactivex.observers;

/* loaded from: classes3.dex */
public class TestObserver<T> extends io.reactivex.observers.BaseTestConsumer<T, io.reactivex.observers.TestObserver<T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, io.reactivex.MaybeObserver<T>, io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver {
    private final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRanges;
    private io.reactivex.internal.fuseable.QueueDisposable<T> getHighSpeedVideoFpsRangesFor;
    private final io.reactivex.Observer<? super T> getHighSpeedVideoSizes;

    /* loaded from: classes17.dex */
    enum EmptyObserver implements io.reactivex.Observer<java.lang.Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        public final void onComplete() {
        }

        @Override // io.reactivex.Observer
        public final void onError(java.lang.Throwable th) {
        }

        @Override // io.reactivex.Observer
        public final void onNext(java.lang.Object obj) {
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        }
    }

    public static <T> io.reactivex.observers.TestObserver<T> create() {
        return new io.reactivex.observers.TestObserver<>();
    }

    public static <T> io.reactivex.observers.TestObserver<T> create(io.reactivex.Observer<? super T> observer) {
        return new io.reactivex.observers.TestObserver<>(observer);
    }

    public TestObserver() {
        this(io.reactivex.observers.TestObserver.EmptyObserver.INSTANCE);
    }

    public TestObserver(io.reactivex.Observer<? super T> observer) {
        this.getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>();
        this.getHighSpeedVideoSizes = observer;
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable disposable) {
        this.lastThread = java.lang.Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new java.lang.NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRanges, null, disposable)) {
            disposable.dispose();
            if (this.getHighSpeedVideoFpsRanges.get() != io.reactivex.internal.disposables.DisposableHelper.DISPOSED) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe received multiple subscriptions: ".concat(java.lang.String.valueOf(disposable))));
                return;
            }
            return;
        }
        if (this.initialFusionMode != 0 && (disposable instanceof io.reactivex.internal.fuseable.QueueDisposable)) {
            io.reactivex.internal.fuseable.QueueDisposable<T> queueDisposable = (io.reactivex.internal.fuseable.QueueDisposable) disposable;
            this.getHighSpeedVideoFpsRangesFor = queueDisposable;
            int requestFusion = queueDisposable.requestFusion(this.initialFusionMode);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = java.lang.Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.getHighSpeedVideoFpsRangesFor.poll();
                        if (poll != null) {
                            this.values.add(poll);
                        } else {
                            this.completions++;
                            this.getHighSpeedVideoFpsRanges.lazySet(io.reactivex.internal.disposables.DisposableHelper.DISPOSED);
                            return;
                        }
                    } catch (java.lang.Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.getHighSpeedVideoSizes.onSubscribe(disposable);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.getHighSpeedVideoFpsRanges.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = java.lang.Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t);
            if (t == null) {
                this.errors.add(new java.lang.NullPointerException("onNext received a null value"));
            }
            this.getHighSpeedVideoSizes.onNext(t);
            return;
        }
        while (true) {
            try {
                T poll = this.getHighSpeedVideoFpsRangesFor.poll();
                if (poll == null) {
                    return;
                } else {
                    this.values.add(poll);
                }
            } catch (java.lang.Throwable th) {
                this.errors.add(th);
                this.getHighSpeedVideoFpsRangesFor.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.getHighSpeedVideoFpsRanges.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = java.lang.Thread.currentThread();
            if (th == null) {
                this.errors.add(new java.lang.NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th);
            }
            this.getHighSpeedVideoSizes.onError(th);
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.getHighSpeedVideoFpsRanges.get() == null) {
                this.errors.add(new java.lang.IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = java.lang.Thread.currentThread();
            this.completions++;
            this.getHighSpeedVideoSizes.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRanges);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return io.reactivex.internal.disposables.DisposableHelper.isDisposed(this.getHighSpeedVideoFpsRanges.get());
    }

    public final boolean hasSubscription() {
        return this.getHighSpeedVideoFpsRanges.get() != null;
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertSubscribed() {
        if (this.getHighSpeedVideoFpsRanges.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final io.reactivex.observers.TestObserver<T> assertNotSubscribed() {
        if (this.getHighSpeedVideoFpsRanges.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    public final io.reactivex.observers.TestObserver<T> assertOf(io.reactivex.functions.Consumer<? super io.reactivex.observers.TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }
}
