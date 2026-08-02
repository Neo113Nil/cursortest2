package io.reactivex.parallel;

/* loaded from: classes3.dex */
public abstract class ParallelFlowable<T> {
    public abstract int parallelism();

    public abstract void subscribe(org.reactivestreams.Subscriber<? super T>[] subscriberArr);

    protected final boolean validate(org.reactivestreams.Subscriber<?>[] subscriberArr) {
        int parallelism = parallelism();
        if (subscriberArr.length == parallelism) {
            return true;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("parallelism = ");
        sb.append(parallelism);
        sb.append(", subscribers = ");
        sb.append(subscriberArr.length);
        java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException(sb.toString());
        for (org.reactivestreams.Subscriber<?> subscriber : subscriberArr) {
            io.reactivex.internal.subscriptions.EmptySubscription.error(illegalArgumentException, subscriber);
        }
        return false;
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> publisher) {
        return from(publisher, java.lang.Runtime.getRuntime().availableProcessors(), io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> publisher, int i) {
        return from(publisher, i, io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> from(org.reactivestreams.Publisher<? extends T> publisher, int i, int i2) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(publisher, "source");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "parallelism");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i2, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFromPublisher(publisher, i, i2));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> R as(io.reactivex.parallel.ParallelFlowableConverter<T, R> parallelFlowableConverter) {
        return (R) ((io.reactivex.parallel.ParallelFlowableConverter) io.reactivex.internal.functions.ObjectHelper.requireNonNull(parallelFlowableConverter, "converter is null")).apply(this);
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> function) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelMap(this, function));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.parallel.ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelMapTry(this, function, parallelFailureHandling));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> map(io.reactivex.functions.Function<? super T, ? extends R> function, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelMapTry(this, function, biFunction));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> predicate) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(predicate, "predicate");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFilter(this, predicate));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.parallel.ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(predicate, "predicate");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFilterTry(this, predicate, parallelFailureHandling));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> filter(io.reactivex.functions.Predicate<? super T> predicate, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(predicate, "predicate");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFilterTry(this, predicate, biFunction));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> runOn(io.reactivex.Scheduler scheduler) {
        return runOn(scheduler, io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> runOn(io.reactivex.Scheduler scheduler, int i) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(scheduler, "scheduler");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelRunOn(this, scheduler, i));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> reduce(io.reactivex.functions.BiFunction<T, T, T> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "reducer");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelReduceFull(this, biFunction));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> reduce(java.util.concurrent.Callable<R> callable, io.reactivex.functions.BiFunction<R, ? super T, R> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "initialSupplier");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "reducer");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelReduce(this, callable, biFunction));
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequential() {
        return sequential(io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequential(int i) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelJoin(this, i, false));
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequentialDelayError() {
        return sequentialDelayError(io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.SchedulerSupport("none")
    @io.reactivex.annotations.BackpressureSupport(io.reactivex.annotations.BackpressureKind.FULL)
    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sequentialDelayError(int i) {
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelJoin(this, i, true));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted(java.util.Comparator<? super T> comparator) {
        return sorted(comparator, 16);
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<T> sorted(java.util.Comparator<? super T> comparator, int i) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(comparator, "comparator is null");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelSortedJoin(reduce(io.reactivex.internal.functions.Functions.createArrayList((i / parallelism()) + 1), io.reactivex.internal.util.ListAddBiConsumer.instance()).map(new io.reactivex.internal.util.SorterFunction(comparator)), comparator));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> toSortedList(java.util.Comparator<? super T> comparator) {
        return toSortedList(comparator, 16);
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.Flowable<java.util.List<T>> toSortedList(java.util.Comparator<? super T> comparator, int i) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(comparator, "comparator is null");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "capacityHint");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(reduce(io.reactivex.internal.functions.Functions.createArrayList((i / parallelism()) + 1), io.reactivex.internal.util.ListAddBiConsumer.instance()).map(new io.reactivex.internal.util.SorterFunction(comparator)).reduce(new io.reactivex.internal.util.MergerBiFunction(comparator)));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> consumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, consumer, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.parallel.ParallelFailureHandling parallelFailureHandling) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(parallelFailureHandling, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry(this, consumer, parallelFailureHandling));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnNext(io.reactivex.functions.Consumer<? super T> consumer, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> biFunction) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onNext is null");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biFunction, "errorHandler is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry(this, consumer, biFunction));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doAfterNext(io.reactivex.functions.Consumer<? super T> consumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onAfterNext is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), consumer, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnError(io.reactivex.functions.Consumer<java.lang.Throwable> consumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onError is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), consumer, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnComplete(io.reactivex.functions.Action action) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onComplete is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), action, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doAfterTerminated(io.reactivex.functions.Action action) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onAfterTerminate is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_ACTION, action, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnSubscribe(io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> consumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        io.reactivex.functions.Consumer emptyConsumer = io.reactivex.internal.functions.Functions.emptyConsumer();
        io.reactivex.functions.Consumer emptyConsumer2 = io.reactivex.internal.functions.Functions.emptyConsumer();
        io.reactivex.functions.Consumer emptyConsumer3 = io.reactivex.internal.functions.Functions.emptyConsumer();
        io.reactivex.functions.Action action = io.reactivex.internal.functions.Functions.EMPTY_ACTION;
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, emptyConsumer, emptyConsumer2, emptyConsumer3, action, action, consumer, io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnRequest(io.reactivex.functions.LongConsumer longConsumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), longConsumer, io.reactivex.internal.functions.Functions.EMPTY_ACTION));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final io.reactivex.parallel.ParallelFlowable<T> doOnCancel(io.reactivex.functions.Action action) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(action, "onCancel is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelPeek(this, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.EMPTY_ACTION, io.reactivex.internal.functions.Functions.emptyConsumer(), io.reactivex.internal.functions.Functions.EMPTY_LONG_CONSUMER, action));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <C> io.reactivex.parallel.ParallelFlowable<C> collect(java.util.concurrent.Callable<? extends C> callable, io.reactivex.functions.BiConsumer<? super C, ? super T> biConsumer) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(biConsumer, "collector is null");
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelCollect(this, callable, biConsumer));
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.parallel.ParallelFlowable<T> fromArray(org.reactivestreams.Publisher<T>... publisherArr) {
        if (publisherArr.length == 0) {
            throw new java.lang.IllegalArgumentException("Zero publishers not supported");
        }
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFromArray(publisherArr));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <U> U to(io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable<T>, U> function) {
        try {
            return (U) ((io.reactivex.functions.Function) io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (java.lang.Throwable th) {
            io.reactivex.exceptions.Exceptions.throwIfFatal(th);
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <U> io.reactivex.parallel.ParallelFlowable<U> compose(io.reactivex.parallel.ParallelTransformer<T, U> parallelTransformer) {
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(((io.reactivex.parallel.ParallelTransformer) io.reactivex.internal.functions.ObjectHelper.requireNonNull(parallelTransformer, "composer is null")).apply(this));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function) {
        return flatMap(function, false, Integer.MAX_VALUE, io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z) {
        return flatMap(function, z, Integer.MAX_VALUE, io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z, int i) {
        return flatMap(function, z, i, io.reactivex.Flowable.bufferSize());
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> flatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z, int i, int i2) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper is null");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, "maxConcurrency");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i2, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelFlatMap(this, function, z, i, i2));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function) {
        return concatMap(function, 2);
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMap(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper is null");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelConcatMap(this, function, i, io.reactivex.internal.util.ErrorMode.IMMEDIATE));
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, boolean z) {
        return concatMapDelayError(function, 2, z);
    }

    @io.reactivex.annotations.CheckReturnValue
    public final <R> io.reactivex.parallel.ParallelFlowable<R> concatMapDelayError(io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<? extends R>> function, int i, boolean z) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(function, "mapper is null");
        io.reactivex.internal.functions.ObjectHelper.verifyPositive(i, io.ktor.http.LinkHeader.Rel.Prefetch);
        return io.reactivex.plugins.RxJavaPlugins.onAssembly(new io.reactivex.internal.operators.parallel.ParallelConcatMap(this, function, i, z ? io.reactivex.internal.util.ErrorMode.END : io.reactivex.internal.util.ErrorMode.BOUNDARY));
    }
}
