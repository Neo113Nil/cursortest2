package io.reactivex.internal.operators.observable;

/* loaded from: classes3.dex */
public final class ObservableInternalHelper {
    private ObservableInternalHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    /* loaded from: classes17.dex */
    static final class SimpleGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> getHighSpeedVideoFpsRanges;

        @Override // io.reactivex.functions.BiFunction
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            this.getHighSpeedVideoFpsRanges.accept((io.reactivex.Emitter) obj2);
            return obj;
        }

        SimpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
            this.getHighSpeedVideoFpsRanges = consumer;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleGenerator(io.reactivex.functions.Consumer<io.reactivex.Emitter<T>> consumer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleGenerator(consumer);
    }

    /* loaded from: classes17.dex */
    static final class SimpleBiGenerator<T, S> implements io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> {
        final io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.BiFunction
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.accept(obj, (io.reactivex.Emitter) obj2);
            return obj;
        }

        SimpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
            this.Camera2StreamConfigurationMap = biConsumer;
        }
    }

    public static <T, S> io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> simpleBiGenerator(io.reactivex.functions.BiConsumer<S, io.reactivex.Emitter<T>> biConsumer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.SimpleBiGenerator(biConsumer);
    }

    /* loaded from: classes17.dex */
    static final class ItemDelayFunction<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> {
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> getHighResolutionOutputSizeshNQ4ISI;

        ItemDelayFunction(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
            this.getHighResolutionOutputSizeshNQ4ISI = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableTake((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighResolutionOutputSizeshNQ4ISI.apply(obj), "The itemDelay returned a null ObservableSource"), 1L).map(io.reactivex.internal.functions.Functions.justFunction(obj)).defaultIfEmpty(obj);
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<T>> itemDelay(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ItemDelayFunction(function);
    }

    /* loaded from: classes17.dex */
    static final class ObserverOnNext<T> implements io.reactivex.functions.Consumer<T> {
        final io.reactivex.Observer<T> getHighSpeedVideoFpsRanges;

        ObserverOnNext(io.reactivex.Observer<T> observer) {
            this.getHighSpeedVideoFpsRanges = observer;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(T t) throws java.lang.Exception {
            this.getHighSpeedVideoFpsRanges.onNext(t);
        }
    }

    /* loaded from: classes17.dex */
    static final class ObserverOnError<T> implements io.reactivex.functions.Consumer<java.lang.Throwable> {
        final io.reactivex.Observer<T> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(java.lang.Throwable th) throws java.lang.Exception {
            this.Camera2StreamConfigurationMap.onError(th);
        }

        ObserverOnError(io.reactivex.Observer<T> observer) {
            this.Camera2StreamConfigurationMap = observer;
        }
    }

    /* loaded from: classes17.dex */
    static final class ObserverOnComplete<T> implements io.reactivex.functions.Action {
        final io.reactivex.Observer<T> getHighSpeedVideoFpsRangesFor;

        ObserverOnComplete(io.reactivex.Observer<T> observer) {
            this.getHighSpeedVideoFpsRangesFor = observer;
        }

        @Override // io.reactivex.functions.Action
        public final void run() throws java.lang.Exception {
            this.getHighSpeedVideoFpsRangesFor.onComplete();
        }
    }

    public static <T> io.reactivex.functions.Consumer<T> observerOnNext(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnNext(observer);
    }

    public static <T> io.reactivex.functions.Consumer<java.lang.Throwable> observerOnError(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnError(observer);
    }

    public static <T> io.reactivex.functions.Action observerOnComplete(io.reactivex.Observer<T> observer) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ObserverOnComplete(observer);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapWithCombinerInner<U, R, T> implements io.reactivex.functions.Function<U, R> {
        private final T getHighSpeedVideoFpsRanges;
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> getHighSpeedVideoSizes;

        FlatMapWithCombinerInner(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.getHighSpeedVideoSizes = biFunction;
            this.getHighSpeedVideoFpsRanges = t;
        }

        @Override // io.reactivex.functions.Function
        public final R apply(U u) throws java.lang.Exception {
            return this.getHighSpeedVideoSizes.apply(this.getHighSpeedVideoFpsRanges, u);
        }
    }

    /* loaded from: classes17.dex */
    static final class FlatMapWithCombinerOuter<T, R, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> Camera2StreamConfigurationMap;
        private final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> getHighSpeedVideoFpsRanges;

        FlatMapWithCombinerOuter(io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function) {
            this.Camera2StreamConfigurationMap = biFunction;
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableMap((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(obj), "The mapper returned a null ObservableSource"), new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapWithCombinerInner(this.Camera2StreamConfigurationMap, obj));
        }
    }

    public static <T, U, R> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<R>> flatMapWithCombiner(io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<? extends U>> function, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapWithCombinerOuter(biFunction, function);
    }

    /* loaded from: classes17.dex */
    static final class FlatMapIntoIterable<T, U> implements io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> {
        private final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> getHighSpeedVideoFpsRanges;

        FlatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
            this.getHighSpeedVideoFpsRanges = function;
        }

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return new io.reactivex.internal.operators.observable.ObservableFromIterable((java.lang.Iterable) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoFpsRanges.apply(obj), "The mapper returned a null Iterable"));
        }
    }

    public static <T, U> io.reactivex.functions.Function<T, io.reactivex.ObservableSource<U>> flatMapIntoIterable(io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends U>> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.FlatMapIntoIterable(function);
    }

    /* loaded from: classes17.dex */
    enum MapToInt implements io.reactivex.functions.Function<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public final java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return 0;
        }
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ReplayCallable(observable);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, int i) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.BufferedReplayCallable(observable, i);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.BufferedTimedReplayCallable(observable, i, j, timeUnit, scheduler);
    }

    public static <T> java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> replayCallable(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.TimedReplayCallable(observable, j, timeUnit, scheduler);
    }

    public static <T, R> io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> replayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> function, io.reactivex.Scheduler scheduler) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ReplayFunction(function, scheduler);
    }

    /* loaded from: classes17.dex */
    static final class ZipIterableFunction<T, R> implements io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> {
        private final io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> Camera2StreamConfigurationMap;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return io.reactivex.Observable.zipIterable((java.util.List) obj, this.Camera2StreamConfigurationMap, false, io.reactivex.Observable.bufferSize());
        }

        ZipIterableFunction(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
            this.Camera2StreamConfigurationMap = function;
        }
    }

    public static <T, R> io.reactivex.functions.Function<java.util.List<io.reactivex.ObservableSource<? extends T>>, io.reactivex.ObservableSource<? extends R>> zipIterable(io.reactivex.functions.Function<? super java.lang.Object[], ? extends R> function) {
        return new io.reactivex.internal.operators.observable.ObservableInternalHelper.ZipIterableFunction(function);
    }

    /* loaded from: classes17.dex */
    static final class ReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final io.reactivex.Observable<T> getHighSpeedVideoFpsRangesFor;

        ReplayCallable(io.reactivex.Observable<T> observable) {
            this.getHighSpeedVideoFpsRangesFor = observable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRangesFor.replay();
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final int Camera2StreamConfigurationMap;
        private final io.reactivex.Observable<T> getHighSpeedVideoSizes;

        BufferedReplayCallable(io.reactivex.Observable<T> observable, int i) {
            this.getHighSpeedVideoSizes = observable;
            this.Camera2StreamConfigurationMap = i;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoSizes.replay(this.Camera2StreamConfigurationMap);
        }
    }

    /* loaded from: classes17.dex */
    static final class BufferedTimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final long Camera2StreamConfigurationMap;
        private final io.reactivex.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.Observable<T> getHighSpeedVideoSizes;

        BufferedTimedReplayCallable(io.reactivex.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = observable;
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = timeUnit;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoSizes.replay(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* loaded from: classes17.dex */
    static final class TimedReplayCallable<T> implements java.util.concurrent.Callable<io.reactivex.observables.ConnectableObservable<T>> {
        private final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final io.reactivex.Observable<T> getHighSpeedVideoFpsRanges;
        private final io.reactivex.Scheduler getHighSpeedVideoSizes;

        TimedReplayCallable(io.reactivex.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = observable;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
            this.Camera2StreamConfigurationMap = timeUnit;
            this.getHighSpeedVideoSizes = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
            return this.getHighSpeedVideoFpsRanges.replay(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        }
    }

    /* loaded from: classes17.dex */
    static final class ReplayFunction<T, R> implements io.reactivex.functions.Function<io.reactivex.Observable<T>, io.reactivex.ObservableSource<R>> {
        private final io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor;
        private final io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> getHighSpeedVideoSizes;

        @Override // io.reactivex.functions.Function
        public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) throws java.lang.Exception {
            return io.reactivex.Observable.wrap((io.reactivex.ObservableSource) io.reactivex.internal.functions.ObjectHelper.requireNonNull(this.getHighSpeedVideoSizes.apply((io.reactivex.Observable) obj), "The selector returned a null ObservableSource")).observeOn(this.getHighSpeedVideoFpsRangesFor);
        }

        ReplayFunction(io.reactivex.functions.Function<? super io.reactivex.Observable<T>, ? extends io.reactivex.ObservableSource<R>> function, io.reactivex.Scheduler scheduler) {
            this.getHighSpeedVideoSizes = function;
            this.getHighSpeedVideoFpsRangesFor = scheduler;
        }
    }
}
