package io.reactivex.plugins;

/* loaded from: classes3.dex */
public final class RxJavaPlugins {
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> ArtificialStackFrames;
    static volatile io.reactivex.functions.Consumer<? super java.lang.Throwable> Camera2StreamConfigurationMap;
    static volatile io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> CoroutineDebuggingKt;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> _BOUNDARY;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> accessartificialFrame;
    static volatile io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> coroutineBoundary;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> coroutineCreation;
    static volatile boolean getHighResolutionOutputSizeshNQ4ISI;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> getHighSpeedVideoFpsRanges;
    static volatile io.reactivex.functions.BooleanSupplier getHighSpeedVideoFpsRangesFor;
    static volatile boolean getHighSpeedVideoSizes;
    static volatile io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> getHighSpeedVideoSizesFor;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> getInputFormats;
    static volatile io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> getInputSizeshNQ4ISI;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> getOutputFormats;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getOutputMinFrameDuration;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getOutputMinFrameDurationlomOqCM;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getOutputSizes;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getOutputSizeshNQ4ISI;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> getOutputStallDuration;
    static volatile io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getOutputStallDurationlomOqCM;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> getValidOutputFormatsForInputhNQ4ISI;
    static volatile io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> isOutputSupportedFor;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> isOutputSupportedForhNQ4ISI;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> toString;
    static volatile io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> unwrapAs;

    public static void lockdown() {
        getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public static boolean isLockdown() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getHighSpeedVideoSizes = z;
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return getHighSpeedVideoSizes;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getComputationSchedulerHandler() {
        return getOutputMinFrameDuration;
    }

    public static io.reactivex.functions.Consumer<? super java.lang.Throwable> getErrorHandler() {
        return Camera2StreamConfigurationMap;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitComputationSchedulerHandler() {
        return getOutputSizeshNQ4ISI;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitIoSchedulerHandler() {
        return getOutputSizes;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitNewThreadSchedulerHandler() {
        return getOutputMinFrameDurationlomOqCM;
    }

    public static io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> getInitSingleSchedulerHandler() {
        return getOutputStallDurationlomOqCM;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getIoSchedulerHandler() {
        return toString;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getNewThreadSchedulerHandler() {
        return unwrapAs;
    }

    public static io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> getScheduleHandler() {
        return coroutineBoundary;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> getSingleSchedulerHandler() {
        return ArtificialStackFrames;
    }

    public static io.reactivex.Scheduler initComputationScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = getOutputSizeshNQ4ISI;
        if (function == null) {
            return getHighSpeedVideoFpsRangesFor(callable);
        }
        return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(Camera2StreamConfigurationMap(function, callable), "Scheduler Callable result can't be null");
    }

    public static io.reactivex.Scheduler initIoScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = getOutputSizes;
        if (function == null) {
            return getHighSpeedVideoFpsRangesFor(callable);
        }
        return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(Camera2StreamConfigurationMap(function, callable), "Scheduler Callable result can't be null");
    }

    public static io.reactivex.Scheduler initNewThreadScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = getOutputMinFrameDurationlomOqCM;
        if (function == null) {
            return getHighSpeedVideoFpsRangesFor(callable);
        }
        return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(Camera2StreamConfigurationMap(function, callable), "Scheduler Callable result can't be null");
    }

    public static io.reactivex.Scheduler initSingleScheduler(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable, "Scheduler Callable can't be null");
        io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function = getOutputStallDurationlomOqCM;
        if (function == null) {
            return getHighSpeedVideoFpsRangesFor(callable);
        }
        return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(Camera2StreamConfigurationMap(function, callable), "Scheduler Callable result can't be null");
    }

    public static io.reactivex.Scheduler onComputationScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = getOutputMinFrameDuration;
        return function == null ? scheduler : (io.reactivex.Scheduler) Camera2StreamConfigurationMap(function, scheduler);
    }

    public static void onError(java.lang.Throwable th) {
        io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer = Camera2StreamConfigurationMap;
        if (th == null) {
            th = new java.lang.NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof io.reactivex.exceptions.OnErrorNotImplementedException) && !(th instanceof io.reactivex.exceptions.MissingBackpressureException) && !(th instanceof java.lang.IllegalStateException) && !(th instanceof java.lang.NullPointerException) && !(th instanceof java.lang.IllegalArgumentException) && !(th instanceof io.reactivex.exceptions.CompositeException)) {
            th = new io.reactivex.exceptions.UndeliverableException(th);
        }
        if (consumer != null) {
            try {
                consumer.accept(th);
                return;
            } catch (java.lang.Throwable th2) {
                th2.printStackTrace();
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static io.reactivex.Scheduler onIoScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = toString;
        return function == null ? scheduler : (io.reactivex.Scheduler) Camera2StreamConfigurationMap(function, scheduler);
    }

    public static io.reactivex.Scheduler onNewThreadScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = unwrapAs;
        return function == null ? scheduler : (io.reactivex.Scheduler) Camera2StreamConfigurationMap(function, scheduler);
    }

    public static java.lang.Runnable onSchedule(java.lang.Runnable runnable) {
        io.reactivex.internal.functions.ObjectHelper.requireNonNull(runnable, "run is null");
        io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> function = coroutineBoundary;
        return function == null ? runnable : (java.lang.Runnable) Camera2StreamConfigurationMap(function, runnable);
    }

    public static io.reactivex.Scheduler onSingleScheduler(io.reactivex.Scheduler scheduler) {
        io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function = ArtificialStackFrames;
        return function == null ? scheduler : (io.reactivex.Scheduler) Camera2StreamConfigurationMap(function, scheduler);
    }

    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }

    public static void setComputationSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputMinFrameDuration = function;
    }

    public static void setErrorHandler(io.reactivex.functions.Consumer<? super java.lang.Throwable> consumer) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        Camera2StreamConfigurationMap = consumer;
    }

    public static void setInitComputationSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputSizeshNQ4ISI = function;
    }

    public static void setInitIoSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputSizes = function;
    }

    public static void setInitNewThreadSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputMinFrameDurationlomOqCM = function;
    }

    public static void setInitSingleSchedulerHandler(io.reactivex.functions.Function<? super java.util.concurrent.Callable<io.reactivex.Scheduler>, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputStallDurationlomOqCM = function;
    }

    public static void setIoSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        toString = function;
    }

    public static void setNewThreadSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        unwrapAs = function;
    }

    public static void setScheduleHandler(io.reactivex.functions.Function<? super java.lang.Runnable, ? extends java.lang.Runnable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        coroutineBoundary = function;
    }

    public static void setSingleSchedulerHandler(io.reactivex.functions.Function<? super io.reactivex.Scheduler, ? extends io.reactivex.Scheduler> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        ArtificialStackFrames = function;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> getOnCompletableAssembly() {
        return getHighSpeedVideoFpsRanges;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> getOnCompletableSubscribe() {
        return getInputFormats;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> getOnFlowableAssembly() {
        return getOutputFormats;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> getOnConnectableFlowableAssembly() {
        return getInputSizeshNQ4ISI;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> getOnFlowableSubscribe() {
        return getOutputStallDuration;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> getOnMaybeSubscribe() {
        return isOutputSupportedFor;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> getOnMaybeAssembly() {
        return isOutputSupportedForhNQ4ISI;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> getOnSingleAssembly() {
        return coroutineCreation;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> getOnSingleSubscribe() {
        return _BOUNDARY;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> getOnObservableAssembly() {
        return getValidOutputFormatsForInputhNQ4ISI;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> getOnConnectableObservableAssembly() {
        return getHighSpeedVideoSizesFor;
    }

    public static io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> getOnObservableSubscribe() {
        return accessartificialFrame;
    }

    public static void setOnCompletableAssembly(io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getHighSpeedVideoFpsRanges = function;
    }

    public static void setOnCompletableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> biFunction) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getInputFormats = biFunction;
    }

    public static void setOnFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputFormats = function;
    }

    public static void setOnMaybeAssembly(io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        isOutputSupportedForhNQ4ISI = function;
    }

    public static void setOnConnectableFlowableAssembly(io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getInputSizeshNQ4ISI = function;
    }

    public static void setOnFlowableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> biFunction) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getOutputStallDuration = biFunction;
    }

    public static void setOnMaybeSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> biFunction) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        isOutputSupportedFor = biFunction;
    }

    public static void setOnObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getValidOutputFormatsForInputhNQ4ISI = function;
    }

    public static void setOnConnectableObservableAssembly(io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getHighSpeedVideoSizesFor = function;
    }

    public static void setOnObservableSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> biFunction) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        accessartificialFrame = biFunction;
    }

    public static void setOnSingleAssembly(io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        coroutineCreation = function;
    }

    public static void setOnSingleSubscribe(io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> biFunction) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        _BOUNDARY = biFunction;
    }

    public static <T> org.reactivestreams.Subscriber<? super T> onSubscribe(io.reactivex.Flowable<T> flowable, org.reactivestreams.Subscriber<? super T> subscriber) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Flowable, ? super org.reactivestreams.Subscriber, ? extends org.reactivestreams.Subscriber> biFunction = getOutputStallDuration;
        return biFunction != null ? (org.reactivestreams.Subscriber) getHighResolutionOutputSizeshNQ4ISI(biFunction, flowable, subscriber) : subscriber;
    }

    public static <T> io.reactivex.Observer<? super T> onSubscribe(io.reactivex.Observable<T> observable, io.reactivex.Observer<? super T> observer) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Observable, ? super io.reactivex.Observer, ? extends io.reactivex.Observer> biFunction = accessartificialFrame;
        return biFunction != null ? (io.reactivex.Observer) getHighResolutionOutputSizeshNQ4ISI(biFunction, observable, observer) : observer;
    }

    public static <T> io.reactivex.SingleObserver<? super T> onSubscribe(io.reactivex.Single<T> single, io.reactivex.SingleObserver<? super T> singleObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Single, ? super io.reactivex.SingleObserver, ? extends io.reactivex.SingleObserver> biFunction = _BOUNDARY;
        return biFunction != null ? (io.reactivex.SingleObserver) getHighResolutionOutputSizeshNQ4ISI(biFunction, single, singleObserver) : singleObserver;
    }

    public static io.reactivex.CompletableObserver onSubscribe(io.reactivex.Completable completable, io.reactivex.CompletableObserver completableObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Completable, ? super io.reactivex.CompletableObserver, ? extends io.reactivex.CompletableObserver> biFunction = getInputFormats;
        return biFunction != null ? (io.reactivex.CompletableObserver) getHighResolutionOutputSizeshNQ4ISI(biFunction, completable, completableObserver) : completableObserver;
    }

    public static <T> io.reactivex.MaybeObserver<? super T> onSubscribe(io.reactivex.Maybe<T> maybe, io.reactivex.MaybeObserver<? super T> maybeObserver) {
        io.reactivex.functions.BiFunction<? super io.reactivex.Maybe, ? super io.reactivex.MaybeObserver, ? extends io.reactivex.MaybeObserver> biFunction = isOutputSupportedFor;
        return biFunction != null ? (io.reactivex.MaybeObserver) getHighResolutionOutputSizeshNQ4ISI(biFunction, maybe, maybeObserver) : maybeObserver;
    }

    public static <T> io.reactivex.Maybe<T> onAssembly(io.reactivex.Maybe<T> maybe) {
        io.reactivex.functions.Function<? super io.reactivex.Maybe, ? extends io.reactivex.Maybe> function = isOutputSupportedForhNQ4ISI;
        return function != null ? (io.reactivex.Maybe) Camera2StreamConfigurationMap(function, maybe) : maybe;
    }

    public static <T> io.reactivex.Flowable<T> onAssembly(io.reactivex.Flowable<T> flowable) {
        io.reactivex.functions.Function<? super io.reactivex.Flowable, ? extends io.reactivex.Flowable> function = getOutputFormats;
        return function != null ? (io.reactivex.Flowable) Camera2StreamConfigurationMap(function, flowable) : flowable;
    }

    public static <T> io.reactivex.flowables.ConnectableFlowable<T> onAssembly(io.reactivex.flowables.ConnectableFlowable<T> connectableFlowable) {
        io.reactivex.functions.Function<? super io.reactivex.flowables.ConnectableFlowable, ? extends io.reactivex.flowables.ConnectableFlowable> function = getInputSizeshNQ4ISI;
        return function != null ? (io.reactivex.flowables.ConnectableFlowable) Camera2StreamConfigurationMap(function, connectableFlowable) : connectableFlowable;
    }

    public static <T> io.reactivex.Observable<T> onAssembly(io.reactivex.Observable<T> observable) {
        io.reactivex.functions.Function<? super io.reactivex.Observable, ? extends io.reactivex.Observable> function = getValidOutputFormatsForInputhNQ4ISI;
        return function != null ? (io.reactivex.Observable) Camera2StreamConfigurationMap(function, observable) : observable;
    }

    public static <T> io.reactivex.observables.ConnectableObservable<T> onAssembly(io.reactivex.observables.ConnectableObservable<T> connectableObservable) {
        io.reactivex.functions.Function<? super io.reactivex.observables.ConnectableObservable, ? extends io.reactivex.observables.ConnectableObservable> function = getHighSpeedVideoSizesFor;
        return function != null ? (io.reactivex.observables.ConnectableObservable) Camera2StreamConfigurationMap(function, connectableObservable) : connectableObservable;
    }

    public static <T> io.reactivex.Single<T> onAssembly(io.reactivex.Single<T> single) {
        io.reactivex.functions.Function<? super io.reactivex.Single, ? extends io.reactivex.Single> function = coroutineCreation;
        return function != null ? (io.reactivex.Single) Camera2StreamConfigurationMap(function, single) : single;
    }

    public static io.reactivex.Completable onAssembly(io.reactivex.Completable completable) {
        io.reactivex.functions.Function<? super io.reactivex.Completable, ? extends io.reactivex.Completable> function = getHighSpeedVideoFpsRanges;
        return function != null ? (io.reactivex.Completable) Camera2StreamConfigurationMap(function, completable) : completable;
    }

    public static void setOnParallelAssembly(io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> function) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        CoroutineDebuggingKt = function;
    }

    public static io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> getOnParallelAssembly() {
        return CoroutineDebuggingKt;
    }

    public static <T> io.reactivex.parallel.ParallelFlowable<T> onAssembly(io.reactivex.parallel.ParallelFlowable<T> parallelFlowable) {
        io.reactivex.functions.Function<? super io.reactivex.parallel.ParallelFlowable, ? extends io.reactivex.parallel.ParallelFlowable> function = CoroutineDebuggingKt;
        return function != null ? (io.reactivex.parallel.ParallelFlowable) Camera2StreamConfigurationMap(function, parallelFlowable) : parallelFlowable;
    }

    public static boolean onBeforeBlocking() {
        io.reactivex.functions.BooleanSupplier booleanSupplier = getHighSpeedVideoFpsRangesFor;
        if (booleanSupplier == null) {
            return false;
        }
        try {
            return booleanSupplier.getAsBoolean();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    public static void setOnBeforeBlocking(io.reactivex.functions.BooleanSupplier booleanSupplier) {
        if (getHighResolutionOutputSizeshNQ4ISI) {
            throw new java.lang.IllegalStateException("Plugins can't be changed anymore");
        }
        getHighSpeedVideoFpsRangesFor = booleanSupplier;
    }

    public static io.reactivex.functions.BooleanSupplier getOnBeforeBlocking() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static io.reactivex.Scheduler createComputationScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.ComputationScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createIoScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.IoScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createNewThreadScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.NewThreadScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    public static io.reactivex.Scheduler createSingleScheduler(java.util.concurrent.ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.SingleScheduler((java.util.concurrent.ThreadFactory) io.reactivex.internal.functions.ObjectHelper.requireNonNull(threadFactory, "threadFactory is null"));
    }

    private static <T, R> R Camera2StreamConfigurationMap(io.reactivex.functions.Function<T, R> function, T t) {
        try {
            return function.apply(t);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    private static <T, U, R> R getHighResolutionOutputSizeshNQ4ISI(io.reactivex.functions.BiFunction<T, U, R> biFunction, T t, U u) {
        try {
            return biFunction.apply(t, u);
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    private static io.reactivex.Scheduler getHighSpeedVideoFpsRangesFor(java.util.concurrent.Callable<io.reactivex.Scheduler> callable) {
        try {
            return (io.reactivex.Scheduler) io.reactivex.internal.functions.ObjectHelper.requireNonNull(callable.call(), "Scheduler Callable result can't be null");
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    private RxJavaPlugins() {
        throw new java.lang.IllegalStateException("No instances!");
    }
}
