package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableBufferTimed<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, U> {
    final boolean Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final java.util.concurrent.Callable<U> getHighSpeedVideoFpsRangesFor;
    final io.reactivex.Scheduler getHighSpeedVideoSizes;
    final java.util.concurrent.TimeUnit getHighSpeedVideoSizesFor;
    final long getOutputFormats;
    final long getOutputMinFrameDuration;

    public FlowableBufferTimed(io.reactivex.Flowable<T> flowable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler, java.util.concurrent.Callable<U> callable, int i, boolean z) {
        super(flowable);
        this.getOutputFormats = j;
        this.getOutputMinFrameDuration = j2;
        this.getHighSpeedVideoSizesFor = timeUnit;
        this.getHighSpeedVideoSizes = scheduler;
        this.getHighSpeedVideoFpsRangesFor = callable;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = z;
    }

    @Override // io.reactivex.Flowable
    public final void subscribeActual(org.reactivestreams.Subscriber<? super U> subscriber) {
        if (this.getOutputFormats == this.getOutputMinFrameDuration && this.getHighResolutionOutputSizeshNQ4ISI == Integer.MAX_VALUE) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactUnboundedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes));
            return;
        }
        io.reactivex.Scheduler.Worker createWorker = this.getHighSpeedVideoSizes.createWorker();
        if (this.getOutputFormats == this.getOutputMinFrameDuration) {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferExactBoundedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, createWorker));
        } else {
            this.source.subscribe((io.reactivex.FlowableSubscriber) new io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber(new io.reactivex.subscribers.SerializedSubscriber(subscriber), this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, createWorker));
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferExactUnboundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable, io.reactivex.disposables.Disposable {
        final io.reactivex.Scheduler Camera2StreamConfigurationMap;
        final java.util.concurrent.Callable<U> getHighResolutionOutputSizeshNQ4ISI;
        org.reactivestreams.Subscription getHighSpeedVideoFpsRanges;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> getHighSpeedVideoFpsRangesFor;
        U getHighSpeedVideoSizes;
        final long getInputFormats;
        final java.util.concurrent.TimeUnit getOutputMinFrameDuration;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            this.actual.onNext((java.util.Collection) obj);
            return true;
        }

        BufferExactUnboundedSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>();
            this.getHighResolutionOutputSizeshNQ4ISI = callable;
            this.getInputFormats = j;
            this.getOutputMinFrameDuration = timeUnit;
            this.Camera2StreamConfigurationMap = scheduler;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighSpeedVideoFpsRanges, subscription)) {
                this.getHighSpeedVideoFpsRanges = subscription;
                try {
                    this.getHighSpeedVideoSizes = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The supplied buffer is null");
                    this.actual.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    io.reactivex.Scheduler scheduler = this.Camera2StreamConfigurationMap;
                    long j = this.getInputFormats;
                    io.reactivex.disposables.Disposable schedulePeriodicallyDirect = scheduler.schedulePeriodicallyDirect(this, j, j, this.getOutputMinFrameDuration);
                    if (androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoFpsRangesFor, null, schedulePeriodicallyDirect)) {
                        return;
                    }
                    schedulePeriodicallyDirect.dispose();
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.actual);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.getHighSpeedVideoSizes;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
            synchronized (this) {
                this.getHighSpeedVideoSizes = null;
            }
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
            synchronized (this) {
                U u = this.getHighSpeedVideoSizes;
                if (u == null) {
                    return;
                }
                this.getHighSpeedVideoSizes = null;
                this.queue.offer(u);
                this.done = true;
                if (enter()) {
                    io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(this.queue, this.actual, false, null, this);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.getHighSpeedVideoFpsRanges.cancel();
            io.reactivex.internal.disposables.DisposableHelper.dispose(this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.getHighSpeedVideoSizes;
                    if (u2 == null) {
                        return;
                    }
                    this.getHighSpeedVideoSizes = u;
                    fastPathEmitMax(u2, false, this);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.actual.onError(th);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getHighSpeedVideoFpsRangesFor.get() == io.reactivex.internal.disposables.DisposableHelper.DISPOSED;
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferSkipBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable {
        final long Camera2StreamConfigurationMap;
        org.reactivestreams.Subscription getHighResolutionOutputSizeshNQ4ISI;
        final long getHighSpeedVideoFpsRanges;
        final java.util.List<U> getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.Callable<U> getHighSpeedVideoSizes;
        final io.reactivex.Scheduler.Worker getHighSpeedVideoSizesFor;
        final java.util.concurrent.TimeUnit getInputFormats;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            subscriber.onNext((java.util.Collection) obj);
            return true;
        }

        BufferSkipBoundedSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, long j, long j2, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler.Worker worker) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoSizes = callable;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRanges = j2;
            this.getInputFormats = timeUnit;
            this.getHighSpeedVideoSizesFor = worker;
            this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedList();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getHighResolutionOutputSizeshNQ4ISI, subscription)) {
                this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                try {
                    java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The supplied buffer is null");
                    this.getHighSpeedVideoFpsRangesFor.add(collection);
                    this.actual.onSubscribe(this);
                    subscription.request(Long.MAX_VALUE);
                    io.reactivex.Scheduler.Worker worker = this.getHighSpeedVideoSizesFor;
                    long j = this.getHighSpeedVideoFpsRanges;
                    worker.schedulePeriodically(this, j, j, this.getInputFormats);
                    this.getHighSpeedVideoSizesFor.schedule(new io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.RemoveFromBuffer(collection), this.Camera2StreamConfigurationMap, this.getInputFormats);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getHighSpeedVideoSizesFor.dispose();
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.actual);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                java.util.Iterator<U> it = this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it.hasNext()) {
                    it.next().add(t);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            this.done = true;
            this.getHighSpeedVideoSizesFor.dispose();
            synchronized (this) {
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
            this.actual.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            java.util.ArrayList arrayList;
            synchronized (this) {
                arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.queue.offer((java.util.Collection) it.next());
            }
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(this.queue, this.actual, false, this.getHighSpeedVideoSizesFor, this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.cancelled = true;
            this.getHighResolutionOutputSizeshNQ4ISI.cancel();
            this.getHighSpeedVideoSizesFor.dispose();
            synchronized (this) {
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.cancelled) {
                return;
            }
            try {
                java.util.Collection collection = (java.util.Collection) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The supplied buffer is null");
                synchronized (this) {
                    if (this.cancelled) {
                        return;
                    }
                    this.getHighSpeedVideoFpsRangesFor.add(collection);
                    this.getHighSpeedVideoSizesFor.schedule(new io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.RemoveFromBuffer(collection), this.Camera2StreamConfigurationMap, this.getInputFormats);
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.actual.onError(th);
            }
        }

        final class RemoveFromBuffer implements java.lang.Runnable {
            private final U Camera2StreamConfigurationMap;

            RemoveFromBuffer(U u) {
                this.Camera2StreamConfigurationMap = u;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.this) {
                    io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.this.getHighSpeedVideoFpsRangesFor.remove(this.Camera2StreamConfigurationMap);
                }
                io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber bufferSkipBoundedSubscriber = io.reactivex.internal.operators.flowable.FlowableBufferTimed.BufferSkipBoundedSubscriber.this;
                bufferSkipBoundedSubscriber.fastPathOrderedEmitMax(this.Camera2StreamConfigurationMap, false, bufferSkipBoundedSubscriber.getHighSpeedVideoSizesFor);
            }
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferExactBoundedSubscriber<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.subscribers.QueueDrainSubscriber<T, U, U> implements org.reactivestreams.Subscription, java.lang.Runnable, io.reactivex.disposables.Disposable {
        U Camera2StreamConfigurationMap;
        final int getHighResolutionOutputSizeshNQ4ISI;
        long getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoFpsRangesFor;
        final java.util.concurrent.Callable<U> getHighSpeedVideoSizes;
        io.reactivex.disposables.Disposable getHighSpeedVideoSizesFor;
        final boolean getInputFormats;
        final long getInputSizeshNQ4ISI;
        final java.util.concurrent.TimeUnit getOutputFormats;
        org.reactivestreams.Subscription getOutputMinFrameDuration;
        final io.reactivex.Scheduler.Worker getOutputSizes;

        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final /* synthetic */ boolean accept(org.reactivestreams.Subscriber subscriber, java.lang.Object obj) {
            subscriber.onNext((java.util.Collection) obj);
            return true;
        }

        BufferExactBoundedSubscriber(org.reactivestreams.Subscriber<? super U> subscriber, java.util.concurrent.Callable<U> callable, long j, java.util.concurrent.TimeUnit timeUnit, int i, boolean z, io.reactivex.Scheduler.Worker worker) {
            super(subscriber, new io.reactivex.internal.queue.MpscLinkedQueue());
            this.getHighSpeedVideoSizes = callable;
            this.getInputSizeshNQ4ISI = j;
            this.getOutputFormats = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getInputFormats = z;
            this.getOutputSizes = worker;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(org.reactivestreams.Subscription subscription) {
            if (io.reactivex.internal.subscriptions.SubscriptionHelper.validate(this.getOutputMinFrameDuration, subscription)) {
                this.getOutputMinFrameDuration = subscription;
                try {
                    this.Camera2StreamConfigurationMap = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The supplied buffer is null");
                    this.actual.onSubscribe(this);
                    io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
                    long j = this.getInputSizeshNQ4ISI;
                    this.getHighSpeedVideoSizesFor = worker.schedulePeriodically(this, j, j, this.getOutputFormats);
                    subscription.request(Long.MAX_VALUE);
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    this.getOutputSizes.dispose();
                    subscription.cancel();
                    io.reactivex.internal.subscriptions.EmptySubscription.error(th, this.actual);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            synchronized (this) {
                U u = this.Camera2StreamConfigurationMap;
                if (u == null) {
                    return;
                }
                u.add(t);
                if (u.size() < this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.Camera2StreamConfigurationMap = null;
                this.getHighSpeedVideoFpsRanges++;
                if (this.getInputFormats) {
                    this.getHighSpeedVideoSizesFor.dispose();
                }
                fastPathOrderedEmitMax(u, false, this);
                try {
                    U u2 = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The supplied buffer is null");
                    synchronized (this) {
                        this.Camera2StreamConfigurationMap = u2;
                        this.getHighSpeedVideoFpsRangesFor++;
                    }
                    if (this.getInputFormats) {
                        io.reactivex.Scheduler.Worker worker = this.getOutputSizes;
                        long j = this.getInputSizeshNQ4ISI;
                        this.getHighSpeedVideoSizesFor = worker.schedulePeriodically(this, j, j, this.getOutputFormats);
                    }
                } catch (java.lang.Throwable th) {
                    io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                    cancel();
                    this.actual.onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(java.lang.Throwable th) {
            synchronized (this) {
                this.Camera2StreamConfigurationMap = null;
            }
            this.actual.onError(th);
            this.getOutputSizes.dispose();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            U u;
            synchronized (this) {
                u = this.Camera2StreamConfigurationMap;
                this.Camera2StreamConfigurationMap = null;
            }
            this.queue.offer(u);
            this.done = true;
            if (enter()) {
                io.reactivex.internal.util.QueueDrainHelper.drainMaxLoop(this.queue, this.actual, false, this, this);
            }
            this.getOutputSizes.dispose();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j) {
            requested(j);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            synchronized (this) {
                this.Camera2StreamConfigurationMap = null;
            }
            this.getOutputMinFrameDuration.cancel();
            this.getOutputSizes.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.getOutputSizes.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                U u = (U) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.Camera2StreamConfigurationMap;
                    if (u2 != null && this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRangesFor) {
                        this.Camera2StreamConfigurationMap = u;
                        fastPathOrderedEmitMax(u2, false, this);
                    }
                }
            } catch (java.lang.Throwable th) {
                io.reactivex.exceptions.Exceptions.throwIfFatal(th);
                cancel();
                this.actual.onError(th);
            }
        }
    }
}
