package io.reactivex.internal.operators.flowable;

/* loaded from: classes3.dex */
public final class FlowableInternalHelper {
    private FlowableInternalHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    /* loaded from: classes17.dex */
    static final class SimpleGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.BiFunction
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.accept((io.reactivex.Emitter) obj2);
            return obj;
        }

        SimpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
            this.Camera2StreamConfigurationMap = consumer;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SimpleGenerator(consumer);
    }

    /* loaded from: classes17.dex */
    static final class SimpleBiGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.functions.BiFunction
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            this.getHighSpeedVideoFpsRangesFor.accept(obj, (io.reactivex.Emitter) obj2);
            return obj;
        }

        SimpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
            this.getHighSpeedVideoFpsRangesFor = biConsumer;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SimpleBiGenerator(biConsumer);
    }

    /* loaded from: classes17.dex */
    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> {
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> getHighSpeedVideoFpsRanges;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableTakePublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(obj), "The itemDelay returned a null Publisher"), 1L).map(io.reactivex.internal.functions.Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ItemDelayFunction(function);
    }

    /* loaded from: classes17.dex */
    static final class SubscriberOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final org.reactivestreams.Subscriber<T> getHighResolutionOutputSizeshNQ4ISI;

        SubscriberOnNext(org.reactivestreams.Subscriber<T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t) throws java.lang.Exception {
            this.getHighResolutionOutputSizeshNQ4ISI.onNext(t);
        }
    }

    /* loaded from: classes17.dex */
    static final class SubscriberOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final org.reactivestreams.Subscriber<T> getHighResolutionOutputSizeshNQ4ISI;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.getHighResolutionOutputSizeshNQ4ISI.onError(th);
        }

        SubscriberOnError(org.reactivestreams.Subscriber<T> subscriber) {
            this.getHighResolutionOutputSizeshNQ4ISI = subscriber;
        }
    }

    /* loaded from: classes17.dex */
    static final class SubscriberOnComplete<T> implements io.reactivex.functions.Action {
        final org.reactivestreams.Subscriber<T> Camera2StreamConfigurationMap;

        SubscriberOnComplete(org.reactivestreams.Subscriber<T> subscriber) {
            this.Camera2StreamConfigurationMap = subscriber;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.onComplete();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> subscriberOnNext(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnNext(subscriber);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> subscriberOnError(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnError(subscriber);
    }

    public static <T> io.reactivex.functions.Action subscriberOnComplete(org.reactivestreams.Subscriber<T> subscriber) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.SubscriberOnComplete(subscriber);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapWithCombinerInner<U, R, T> implements io.reactivex.functions.Function<U, R> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoFpsRanges;
        private final T getHighSpeedVideoSizes;

        FlatMapWithCombinerInner(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.getHighSpeedVideoFpsRanges = biFunction;
            this.getHighSpeedVideoSizes = t;
        }

        @Override // io.reactivex.functions.Function
        public final R apply(U u) throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRanges.apply(this.getHighSpeedVideoSizes, u);
        }
    }

    /* loaded from: classes17.dex */
    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> {
        private final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> getHighSpeedVideoFpsRanges;
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function) {
            this.getHighSpeedVideoSizes = biFunction;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableMapPublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(obj), "The mapper returned a null Publisher"), new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapWithCombinerInner(this.getHighSpeedVideoSizes, obj));
        }
    }

    public static <T, U, R> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapWithCombinerOuter(biFunction, function);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> getHighSpeedVideoFpsRanges;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.flowable.FlowableFromIterable((java.lang.Iterable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, org.reactivestreams.Publisher<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.FlatMapIntoIterable(function);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ReplayCallable(flowable);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, int i) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.BufferedReplayCallable(flowable, i);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.BufferedTimedReplay(flowable, i, j, timeUnit, scheduler);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> replayCallable(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.TimedReplay(flowable, j, timeUnit, scheduler);
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Flowable<T>, org.reactivestreams.Publisher<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> function, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ReplayFunction(function, scheduler);
    }

    public enum RequestMax implements io.reactivex.functions.Consumer<org.reactivestreams.Subscription> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public final void accept(org.reactivestreams.Subscription subscription) throws java.lang.Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes17.dex */
    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return io.reactivex.Flowable.zipIterable((java.util.List) obj, this.getHighSpeedVideoSizes, false, io.reactivex.Flowable.bufferSize());
        }

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            this.getHighSpeedVideoSizes = function;
        }
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<org.reactivestreams.Publisher<? extends T>>, org.reactivestreams.Publisher<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        return new io.reactivex.internal.operators.flowable.FlowableInternalHelper.ZipIterableFunction(function);
    }

    /* loaded from: classes17.dex */
    static final class ReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final io.reactivex.Flowable<T> Camera2StreamConfigurationMap;

        ReplayCallable(io.reactivex.Flowable<T> flowable) {
            this.Camera2StreamConfigurationMap = flowable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.Camera2StreamConfigurationMap.replay();
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final int getHighSpeedVideoFpsRanges;
        private final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;

        BufferedReplayCallable(io.reactivex.Flowable<T> flowable, int i) {
            this.getHighSpeedVideoFpsRangesFor = flowable;
            this.getHighSpeedVideoFpsRanges = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRangesFor.replay(this.getHighSpeedVideoFpsRanges);
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferedTimedReplay<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final long Camera2StreamConfigurationMap;
        private final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.Flowable<T> getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        BufferedTimedReplay(io.reactivex.Flowable<T> flowable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = flowable;
            this.getHighSpeedVideoSizes = i;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRanges.replay(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    static final class TimedReplay<T> implements java.util.concurrent.Callable<io.reactivex.flowables.ConnectableFlowable<T>> {
        private final long Camera2StreamConfigurationMap;
        private final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
        private final io.reactivex.Flowable<T> getHighSpeedVideoFpsRangesFor;

        TimedReplay(io.reactivex.Flowable<T> flowable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRangesFor = flowable;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRanges = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRangesFor.replay(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayFunction<T, R> implements io.reactivex.functions.Function<io.reactivex.Flowable<T>, org.reactivestreams.Publisher<R>> {
        private final io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> getHighSpeedVideoFpsRanges;
        private final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return io.reactivex.Flowable.fromPublisher((org.reactivestreams.Publisher) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply((io.reactivex.Flowable) obj), "The selector returned a null Publisher")).observeOn(this.getHighSpeedVideoFpsRangesFor);
        }

        ReplayFunction(io.reactivex.functions.Function<? super io.reactivex.Flowable<T>, ? extends org.reactivestreams.Publisher<R>> function, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = function;
            this.getHighSpeedVideoFpsRangesFor = scheduler;
        }
    }
}
