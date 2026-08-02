package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableCreate<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.FlowableOnSubscribe<T> Camera2StreamConfigurationMap;
    final io.reactivex.BackpressureStrategy getHighResolutionOutputSizeshNQ4ISI;

    public FlowableCreate(io.reactivex.FlowableOnSubscribe<T> flowableOnSubscribe, io.reactivex.BackpressureStrategy backpressureStrategy) {
        this.Camera2StreamConfigurationMap = flowableOnSubscribe;
        this.getHighResolutionOutputSizeshNQ4ISI = backpressureStrategy;
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[io.reactivex.BackpressureStrategy.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[io.reactivex.BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[io.reactivex.BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter missingEmitter;
        int i = io.reactivex.internal.operators.flowable.FlowableCreate.AnonymousClass1.getHighSpeedVideoSizes[this.getHighResolutionOutputSizeshNQ4ISI.ordinal()];
        if (i == 1) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.MissingEmitter(subscriber);
        } else if (i == 2) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.ErrorAsyncEmitter(subscriber);
        } else if (i == 3) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.DropAsyncEmitter(subscriber);
        } else if (i == 4) {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.LatestAsyncEmitter(subscriber);
        } else {
            missingEmitter = new io.reactivex.internal.operators.flowable.FlowableCreate.BufferAsyncEmitter(subscriber, bufferSize());
        }
        subscriber.onSubscribe(missingEmitter);
        try {
            this.Camera2StreamConfigurationMap.subscribe(missingEmitter);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            missingEmitter.onError(th);
        }
    }

    /* loaded from: classes17.dex */
    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        final io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> getHighResolutionOutputSizeshNQ4ISI;
        volatile boolean getHighSpeedVideoFpsRanges;
        final io.reactivex.internal.util.AtomicThrowable getHighSpeedVideoSizes = new io.reactivex.internal.util.AtomicThrowable();
        final io.reactivex.internal.fuseable.SimplePlainQueue<T> getHighSpeedVideoFpsRangesFor = new io.reactivex.internal.queue.SpscLinkedArrayQueue(16);

        @Override // io.reactivex.FlowableEmitter
        public final io.reactivex.FlowableEmitter<T> serialize() {
            return this;
        }

        SerializedEmitter(io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> baseEmitter) {
            this.getHighResolutionOutputSizeshNQ4ISI = baseEmitter;
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCancelled() || this.getHighSpeedVideoFpsRanges) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (get() == 0 && compareAndSet(0, 1)) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getHighSpeedVideoFpsRangesFor;
                synchronized (simplePlainQueue) {
                    simplePlainQueue.offer(t);
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

        @Override // io.reactivex.FlowableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCancelled() || this.getHighSpeedVideoFpsRanges) {
                return false;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!this.getHighSpeedVideoSizes.addThrowable(th)) {
                return false;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            return true;
        }

        @Override // io.reactivex.Emitter
        public final void onComplete() {
            if (this.getHighResolutionOutputSizeshNQ4ISI.isCancelled() || this.getHighSpeedVideoFpsRanges) {
                return;
            }
            this.getHighSpeedVideoFpsRanges = true;
            if (getAndIncrement() == 0) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> baseEmitter = this.getHighResolutionOutputSizeshNQ4ISI;
            io.reactivex.internal.fuseable.SimplePlainQueue<T> simplePlainQueue = this.getHighSpeedVideoFpsRangesFor;
            io.reactivex.internal.util.AtomicThrowable atomicThrowable = this.getHighSpeedVideoSizes;
            int i = 1;
            while (!baseEmitter.isCancelled()) {
                if (atomicThrowable.get() != null) {
                    simplePlainQueue.clear();
                    baseEmitter.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z = this.getHighSpeedVideoFpsRanges;
                T poll = simplePlainQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    baseEmitter.onComplete();
                    return;
                } else if (!z2) {
                    baseEmitter.onNext(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            simplePlainQueue.clear();
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.getHighResolutionOutputSizeshNQ4ISI.setDisposable(disposable);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            this.getHighResolutionOutputSizeshNQ4ISI.setCancellable(cancellable);
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return this.getHighResolutionOutputSizeshNQ4ISI.requested();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isCancelled();
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI.toString();
        }
    }

    /* loaded from: classes17.dex */
    static abstract class BaseEmitter<T> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableEmitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final org.reactivestreams.Subscriber<? super T> getHighResolutionOutputSizeshNQ4ISI;
        final io.reactivex.internal.disposables.SequentialDisposable getHighSpeedVideoSizes = new io.reactivex.internal.disposables.SequentialDisposable();

        void getHighSpeedVideoFpsRangesFor() {
        }

        void getHighSpeedVideoSizes() {
        }

        BaseEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
            Camera2StreamConfigurationMap();
        }

        protected final void Camera2StreamConfigurationMap() {
            if (isCancelled()) {
                return;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onComplete();
            } finally {
                this.getHighSpeedVideoSizes.dispose();
            }
        }

        @Override // io.reactivex.Emitter
        public final void onError(java.lang.Throwable th) {
            if (tryOnError(th)) {
                return;
            }
            io.reactivex.plugins.RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableEmitter
        public boolean tryOnError(java.lang.Throwable th) {
            return Camera2StreamConfigurationMap(th);
        }

        protected final boolean Camera2StreamConfigurationMap(java.lang.Throwable th) {
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isCancelled()) {
                return false;
            }
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
                this.getHighSpeedVideoSizes.dispose();
                return true;
            } catch (java.lang.Throwable th2) {
                this.getHighSpeedVideoSizes.dispose();
                throw th2;
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.getHighSpeedVideoSizes.dispose();
            getHighSpeedVideoSizes();
        }

        @Override // io.reactivex.FlowableEmitter
        public final boolean isCancelled() {
            return this.getHighSpeedVideoSizes.isDisposed();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(j)) {
                io.reactivex.internal.util.BackpressureHelper.add(this, j);
                getHighSpeedVideoFpsRangesFor();
            }
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setDisposable(io.reactivex.disposables.Disposable disposable) {
            this.getHighSpeedVideoSizes.update(disposable);
        }

        @Override // io.reactivex.FlowableEmitter
        public final void setCancellable(io.reactivex.functions.Cancellable cancellable) {
            setDisposable(new io.reactivex.internal.disposables.CancellableDisposable(cancellable));
        }

        @Override // io.reactivex.FlowableEmitter
        public final long requested() {
            return get();
        }

        @Override // io.reactivex.FlowableEmitter
        public final io.reactivex.FlowableEmitter<T> serialize() {
            return new io.reactivex.internal.operators.flowable.FlowableCreate.SerializedEmitter(this);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public java.lang.String toString() {
            return java.lang.String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }

    /* loaded from: classes17.dex */
    static final class MissingEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            long j;
            if (isCancelled()) {
                return;
            }
            if (t != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        }
    }

    /* loaded from: classes17.dex */
    static abstract class NoOverflowBaseAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void getHighResolutionOutputSizeshNQ4ISI();

        NoOverflowBaseAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (get() != 0) {
                this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
                io.reactivex.internal.util.BackpressureHelper.produced(this, 1L);
            } else {
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class DropAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        final void getHighResolutionOutputSizeshNQ4ISI() {
        }

        DropAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }
    }

    /* loaded from: classes17.dex */
    static final class ErrorAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        final void getHighResolutionOutputSizeshNQ4ISI() {
            onError(new io.reactivex.exceptions.MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger getInputSizeshNQ4ISI;

        BufferAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = new io.reactivex.internal.queue.SpscLinkedArrayQueue<>(i);
            this.getInputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.Camera2StreamConfigurationMap.offer(t);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges || isCancelled()) {
                return false;
            }
            if (th == null) {
                th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.getHighSpeedVideoFpsRangesFor = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighResolutionOutputSizeshNQ4ISI();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void getHighSpeedVideoFpsRangesFor() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void getHighSpeedVideoSizes() {
            if (this.getInputSizeshNQ4ISI.getAndIncrement() == 0) {
                this.Camera2StreamConfigurationMap.clear();
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getInputSizeshNQ4ISI.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.Camera2StreamConfigurationMap;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (isCancelled()) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        T poll = spscLinkedArrayQueue.poll();
                        boolean z2 = poll == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(poll);
                            j2++;
                        } else {
                            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                            if (th != null) {
                                Camera2StreamConfigurationMap(th);
                                return;
                            } else {
                                Camera2StreamConfigurationMap();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            spscLinkedArrayQueue.clear();
                            return;
                        }
                        boolean z3 = this.getHighSpeedVideoFpsRanges;
                        boolean isEmpty = spscLinkedArrayQueue.isEmpty();
                        if (z3 && isEmpty) {
                            java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                            if (th2 != null) {
                                Camera2StreamConfigurationMap(th2);
                                return;
                            } else {
                                Camera2StreamConfigurationMap();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this, j2);
                    }
                    i = this.getInputSizeshNQ4ISI.addAndGet(-i);
                } while (i != 0);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class LatestAsyncEmitter<T> extends io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        final java.util.concurrent.atomic.AtomicReference<T> Camera2StreamConfigurationMap;
        volatile boolean getHighSpeedVideoFpsRanges;
        java.lang.Throwable getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizesFor;

        LatestAsyncEmitter(org.reactivestreams.Subscriber<? super T> subscriber) {
            super(subscriber);
            this.Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighSpeedVideoSizesFor = new java.util.concurrent.atomic.AtomicInteger();
        }

        @Override // io.reactivex.Emitter
        public final void onNext(T t) {
            if (this.getHighSpeedVideoFpsRanges || isCancelled()) {
                return;
            }
            if (t == null) {
                onError(new java.lang.NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.Camera2StreamConfigurationMap.set(t);
                getHighResolutionOutputSizeshNQ4ISI();
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.FlowableEmitter
        public final boolean tryOnError(java.lang.Throwable th) {
            if (this.getHighSpeedVideoFpsRanges || isCancelled()) {
                return false;
            }
            if (th == null) {
                onError(new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.getHighSpeedVideoFpsRangesFor = th;
            this.getHighSpeedVideoFpsRanges = true;
            getHighResolutionOutputSizeshNQ4ISI();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, io.reactivex.Emitter
        public final void onComplete() {
            this.getHighSpeedVideoFpsRanges = true;
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void getHighSpeedVideoFpsRangesFor() {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void getHighSpeedVideoSizes() {
            if (this.getHighSpeedVideoSizesFor.getAndIncrement() == 0) {
                this.Camera2StreamConfigurationMap.lazySet(null);
            }
        }

        private void getHighResolutionOutputSizeshNQ4ISI() {
            if (this.getHighSpeedVideoSizesFor.getAndIncrement() == 0) {
                org.reactivestreams.Subscriber<? super T> subscriber = this.getHighResolutionOutputSizeshNQ4ISI;
                java.util.concurrent.atomic.AtomicReference<T> atomicReference = this.Camera2StreamConfigurationMap;
                int i = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            break;
                        }
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z = this.getHighSpeedVideoFpsRanges;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            subscriber.onNext(andSet);
                            j2++;
                        } else {
                            java.lang.Throwable th = this.getHighSpeedVideoFpsRangesFor;
                            if (th != null) {
                                Camera2StreamConfigurationMap(th);
                                return;
                            } else {
                                Camera2StreamConfigurationMap();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (isCancelled()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z3 = this.getHighSpeedVideoFpsRanges;
                        boolean z4 = atomicReference.get() == null;
                        if (z3 && z4) {
                            java.lang.Throwable th2 = this.getHighSpeedVideoFpsRangesFor;
                            if (th2 != null) {
                                Camera2StreamConfigurationMap(th2);
                                return;
                            } else {
                                Camera2StreamConfigurationMap();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        io.reactivex.internal.util.BackpressureHelper.produced(this, j2);
                    }
                    i = this.getHighSpeedVideoSizesFor.addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
