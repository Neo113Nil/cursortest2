package rx;

/* loaded from: classes18.dex */
public class Completable {
    private final rx.Completable.OnSubscribe getHighSpeedVideoFpsRangesFor;
    static final rx.Completable getHighSpeedVideoFpsRanges = new rx.Completable(new rx.Completable.OnSubscribe() { // from class: rx.Completable.1
        @Override // rx.functions.Action1
        public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
            rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
            completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
            completableSubscriber2.onCompleted();
        }
    }, false);
    static final rx.Completable Camera2StreamConfigurationMap = new rx.Completable(new rx.Completable.OnSubscribe() { // from class: rx.Completable.2
        @Override // rx.functions.Action1
        public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
            completableSubscriber.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
        }
    }, false);

    public interface OnSubscribe extends rx.functions.Action1<rx.CompletableSubscriber> {
    }

    public interface Operator extends rx.functions.Func1<rx.CompletableSubscriber, rx.CompletableSubscriber> {
    }

    public interface Transformer extends rx.functions.Func1<rx.Completable, rx.Completable> {
    }

    public static rx.Completable amb(final rx.Completable... completableArr) {
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.3
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
                completableSubscriber2.onSubscribe(compositeSubscription);
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
                rx.CompletableSubscriber completableSubscriber3 = new rx.CompletableSubscriber() { // from class: rx.Completable.3.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            compositeSubscription.unsubscribe();
                            completableSubscriber2.onCompleted();
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(java.lang.Throwable th) {
                        if (atomicBoolean.compareAndSet(false, true)) {
                            compositeSubscription.unsubscribe();
                            completableSubscriber2.onError(th);
                        } else {
                            rx.plugins.RxJavaHooks.onError(th);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        compositeSubscription.add(subscription);
                    }
                };
                for (rx.Completable completable : completableArr) {
                    if (compositeSubscription.isUnsubscribed()) {
                        return;
                    }
                    if (completable == null) {
                        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                        if (atomicBoolean.compareAndSet(false, true)) {
                            compositeSubscription.unsubscribe();
                            completableSubscriber2.onError(nullPointerException);
                            return;
                        } else {
                            rx.plugins.RxJavaHooks.onError(nullPointerException);
                            return;
                        }
                    }
                    if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                        return;
                    }
                    completable.unsafeSubscribe(completableSubscriber3);
                }
            }
        });
    }

    public static rx.Completable amb(final java.lang.Iterable<? extends rx.Completable> iterable) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.4
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
                completableSubscriber2.onSubscribe(compositeSubscription);
                try {
                    java.util.Iterator it = iterable.iterator();
                    if (it == null) {
                        completableSubscriber2.onError(new java.lang.NullPointerException("The iterator returned is null"));
                        return;
                    }
                    final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean();
                    rx.CompletableSubscriber completableSubscriber3 = new rx.CompletableSubscriber() { // from class: rx.Completable.4.1
                        @Override // rx.CompletableSubscriber
                        public void onCompleted() {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber2.onCompleted();
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onError(java.lang.Throwable th) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber2.onError(th);
                            } else {
                                rx.plugins.RxJavaHooks.onError(th);
                            }
                        }

                        @Override // rx.CompletableSubscriber
                        public void onSubscribe(rx.Subscription subscription) {
                            compositeSubscription.add(subscription);
                        }
                    };
                    boolean z = true;
                    while (!atomicBoolean.get() && !compositeSubscription.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (z) {
                                    completableSubscriber2.onCompleted();
                                    return;
                                }
                                return;
                            }
                            if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                                return;
                            }
                            try {
                                rx.Completable completable = (rx.Completable) it.next();
                                if (completable == null) {
                                    java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("One of the sources is null");
                                    if (atomicBoolean.compareAndSet(false, true)) {
                                        compositeSubscription.unsubscribe();
                                        completableSubscriber2.onError(nullPointerException);
                                        return;
                                    } else {
                                        rx.plugins.RxJavaHooks.onError(nullPointerException);
                                        return;
                                    }
                                }
                                if (atomicBoolean.get() || compositeSubscription.isUnsubscribed()) {
                                    return;
                                }
                                completable.unsafeSubscribe(completableSubscriber3);
                                z = false;
                            } catch (java.lang.Throwable th) {
                                if (atomicBoolean.compareAndSet(false, true)) {
                                    compositeSubscription.unsubscribe();
                                    completableSubscriber2.onError(th);
                                    return;
                                } else {
                                    rx.plugins.RxJavaHooks.onError(th);
                                    return;
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            if (atomicBoolean.compareAndSet(false, true)) {
                                compositeSubscription.unsubscribe();
                                completableSubscriber2.onError(th2);
                                return;
                            } else {
                                rx.plugins.RxJavaHooks.onError(th2);
                                return;
                            }
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    completableSubscriber2.onError(th3);
                }
            }
        });
    }

    public static rx.Completable complete() {
        rx.Completable completable = getHighSpeedVideoFpsRanges;
        rx.Completable.OnSubscribe onCreate = rx.plugins.RxJavaHooks.onCreate(completable.getHighSpeedVideoFpsRangesFor);
        return onCreate == completable.getHighSpeedVideoFpsRangesFor ? completable : new rx.Completable(onCreate, false);
    }

    public static rx.Completable concat(rx.Completable... completableArr) {
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new rx.internal.operators.CompletableOnSubscribeConcatArray(completableArr));
    }

    public static rx.Completable concat(java.lang.Iterable<? extends rx.Completable> iterable) {
        return create(new rx.internal.operators.CompletableOnSubscribeConcatIterable(iterable));
    }

    public static rx.Completable concat(rx.Observable<? extends rx.Completable> observable) {
        return concat(observable, 2);
    }

    public static rx.Completable concat(rx.Observable<? extends rx.Completable> observable, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("prefetch > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return create(new rx.internal.operators.CompletableOnSubscribeConcat(observable, i));
    }

    public static rx.Completable create(rx.Completable.OnSubscribe onSubscribe) {
        try {
            return new rx.Completable(onSubscribe);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            rx.plugins.RxJavaHooks.onError(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static rx.Completable defer(final rx.functions.Func0<? extends rx.Completable> func0) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.5
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                try {
                    rx.Completable completable = (rx.Completable) rx.functions.Func0.this.call();
                    if (completable == null) {
                        completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                        completableSubscriber2.onError(new java.lang.NullPointerException("The completable returned is null"));
                    } else {
                        completable.unsafeSubscribe(completableSubscriber2);
                    }
                } catch (java.lang.Throwable th) {
                    completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                    completableSubscriber2.onError(th);
                }
            }
        });
    }

    public static rx.Completable error(final rx.functions.Func0<? extends java.lang.Throwable> func0) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.6
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                try {
                    th = (java.lang.Throwable) rx.functions.Func0.this.call();
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                if (th == null) {
                    th = new java.lang.NullPointerException("The error supplied is null");
                }
                completableSubscriber2.onError(th);
            }
        });
    }

    public static rx.Completable error(final java.lang.Throwable th) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.7
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                completableSubscriber2.onError(th);
            }
        });
    }

    public static rx.Completable fromAction(final rx.functions.Action0 action0) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.8
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.subscriptions.BooleanSubscription booleanSubscription = new rx.subscriptions.BooleanSubscription();
                completableSubscriber2.onSubscribe(booleanSubscription);
                try {
                    rx.functions.Action0.this.call();
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber2.onCompleted();
                } catch (java.lang.Throwable th) {
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber2.onError(th);
                }
            }
        });
    }

    public static rx.Completable fromCallable(final java.util.concurrent.Callable<?> callable) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.9
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.subscriptions.BooleanSubscription booleanSubscription = new rx.subscriptions.BooleanSubscription();
                completableSubscriber2.onSubscribe(booleanSubscription);
                try {
                    callable.call();
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber2.onCompleted();
                } catch (java.lang.Throwable th) {
                    if (booleanSubscription.isUnsubscribed()) {
                        return;
                    }
                    completableSubscriber2.onError(th);
                }
            }
        });
    }

    public static rx.Completable fromEmitter(rx.functions.Action1<rx.CompletableEmitter> action1) {
        return create(new rx.internal.operators.CompletableFromEmitter(action1));
    }

    public static rx.Completable fromFuture(java.util.concurrent.Future<?> future) {
        return fromObservable(rx.Observable.from(future));
    }

    public static rx.Completable fromObservable(final rx.Observable<?> observable) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.10
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.Subscriber<java.lang.Object> subscriber = new rx.Subscriber<java.lang.Object>() { // from class: rx.Completable.10.1
                    @Override // rx.Observer
                    public void onNext(java.lang.Object obj) {
                    }

                    @Override // rx.Observer
                    public void onCompleted() {
                        completableSubscriber2.onCompleted();
                    }

                    @Override // rx.Observer
                    public void onError(java.lang.Throwable th) {
                        completableSubscriber2.onError(th);
                    }
                };
                completableSubscriber2.onSubscribe(subscriber);
                rx.Observable.this.unsafeSubscribe(subscriber);
            }
        });
    }

    public static rx.Completable fromSingle(final rx.Single<?> single) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.11
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.SingleSubscriber<java.lang.Object> singleSubscriber = new rx.SingleSubscriber<java.lang.Object>() { // from class: rx.Completable.11.1
                    @Override // rx.SingleSubscriber
                    public void onError(java.lang.Throwable th) {
                        completableSubscriber2.onError(th);
                    }

                    @Override // rx.SingleSubscriber
                    public void onSuccess(java.lang.Object obj) {
                        completableSubscriber2.onCompleted();
                    }
                };
                completableSubscriber2.onSubscribe(singleSubscriber);
                rx.Single.this.subscribe(singleSubscriber);
            }
        });
    }

    public static rx.Completable merge(rx.Completable... completableArr) {
        if (completableArr.length == 0) {
            return complete();
        }
        if (completableArr.length == 1) {
            return completableArr[0];
        }
        return create(new rx.internal.operators.CompletableOnSubscribeMergeArray(completableArr));
    }

    public static rx.Completable merge(java.lang.Iterable<? extends rx.Completable> iterable) {
        return create(new rx.internal.operators.CompletableOnSubscribeMergeIterable(iterable));
    }

    public static rx.Completable merge(rx.Observable<? extends rx.Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, false);
    }

    public static rx.Completable merge(rx.Observable<? extends rx.Completable> observable, int i) {
        return merge0(observable, i, false);
    }

    protected static rx.Completable merge0(rx.Observable<? extends rx.Completable> observable, int i, boolean z) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxConcurrency > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return create(new rx.internal.operators.CompletableOnSubscribeMerge(observable, i, z));
    }

    public static rx.Completable mergeDelayError(rx.Completable... completableArr) {
        return create(new rx.internal.operators.CompletableOnSubscribeMergeDelayErrorArray(completableArr));
    }

    public static rx.Completable mergeDelayError(java.lang.Iterable<? extends rx.Completable> iterable) {
        return create(new rx.internal.operators.CompletableOnSubscribeMergeDelayErrorIterable(iterable));
    }

    public static rx.Completable mergeDelayError(rx.Observable<? extends rx.Completable> observable) {
        return merge0(observable, Integer.MAX_VALUE, true);
    }

    public static rx.Completable mergeDelayError(rx.Observable<? extends rx.Completable> observable, int i) {
        return merge0(observable, i, true);
    }

    public static rx.Completable never() {
        rx.Completable completable = Camera2StreamConfigurationMap;
        rx.Completable.OnSubscribe onCreate = rx.plugins.RxJavaHooks.onCreate(completable.getHighSpeedVideoFpsRangesFor);
        return onCreate == completable.getHighSpeedVideoFpsRangesFor ? completable : new rx.Completable(onCreate, false);
    }

    public static rx.Completable timer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timer(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public static rx.Completable timer(final long j, final java.util.concurrent.TimeUnit timeUnit, final rx.Scheduler scheduler) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.12
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription = new rx.subscriptions.MultipleAssignmentSubscription();
                completableSubscriber2.onSubscribe(multipleAssignmentSubscription);
                if (multipleAssignmentSubscription.isUnsubscribed()) {
                    return;
                }
                final rx.Scheduler.Worker createWorker = rx.Scheduler.this.createWorker();
                multipleAssignmentSubscription.set(createWorker);
                createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.12.1
                    @Override // rx.functions.Action0
                    public void call() {
                        try {
                            completableSubscriber2.onCompleted();
                        } finally {
                            createWorker.unsubscribe();
                        }
                    }
                }, j, timeUnit);
            }
        });
    }

    static java.lang.NullPointerException Camera2StreamConfigurationMap(java.lang.Throwable th) {
        java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th);
        return nullPointerException;
    }

    public static <R> rx.Completable using(rx.functions.Func0<R> func0, rx.functions.Func1<? super R, ? extends rx.Completable> func1, rx.functions.Action1<? super R> action1) {
        return using(func0, func1, action1, true);
    }

    public static <R> rx.Completable using(final rx.functions.Func0<R> func0, final rx.functions.Func1<? super R, ? extends rx.Completable> func1, final rx.functions.Action1<? super R> action1, final boolean z) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.13
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                try {
                    java.lang.Object call = rx.functions.Func0.this.call();
                    try {
                        rx.Completable completable = (rx.Completable) func1.call(call);
                        if (completable == null) {
                            try {
                                action1.call(call);
                                completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                                completableSubscriber2.onError(new java.lang.NullPointerException("The completable supplied is null"));
                                return;
                            } catch (java.lang.Throwable th) {
                                rx.exceptions.Exceptions.throwIfFatal(th);
                                completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                                completableSubscriber2.onError(new rx.exceptions.CompositeException(java.util.Arrays.asList(new java.lang.NullPointerException("The completable supplied is null"), th)));
                                return;
                            }
                        }
                        completable.unsafeSubscribe(new rx.Completable.AnonymousClass13.AnonymousClass1(new java.util.concurrent.atomic.AtomicBoolean(), call, completableSubscriber2));
                    } catch (java.lang.Throwable th2) {
                        try {
                            action1.call(call);
                            rx.exceptions.Exceptions.throwIfFatal(th2);
                            completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                            completableSubscriber2.onError(th2);
                        } catch (java.lang.Throwable th3) {
                            rx.exceptions.Exceptions.throwIfFatal(th2);
                            rx.exceptions.Exceptions.throwIfFatal(th3);
                            completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                            completableSubscriber2.onError(new rx.exceptions.CompositeException(java.util.Arrays.asList(th2, th3)));
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                    completableSubscriber2.onError(th4);
                }
            }

            /* renamed from: rx.Completable$13$1, reason: invalid class name */
            class AnonymousClass1 implements rx.CompletableSubscriber {
                final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean Camera2StreamConfigurationMap;
                rx.Subscription getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ rx.CompletableSubscriber getHighSpeedVideoSizes;

                AnonymousClass1(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.lang.Object obj, rx.CompletableSubscriber completableSubscriber) {
                    this.Camera2StreamConfigurationMap = atomicBoolean;
                    this.getHighSpeedVideoFpsRangesFor = obj;
                    this.getHighSpeedVideoSizes = completableSubscriber;
                }

                final void getHighResolutionOutputSizeshNQ4ISI() {
                    this.getHighResolutionOutputSizeshNQ4ISI.unsubscribe();
                    if (this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                        try {
                            action1.call(this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.lang.Throwable th) {
                            rx.plugins.RxJavaHooks.onError(th);
                        }
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    if (z && this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                        try {
                            action1.call(this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.lang.Throwable th) {
                            this.getHighSpeedVideoSizes.onError(th);
                            return;
                        }
                    }
                    this.getHighSpeedVideoSizes.onCompleted();
                    if (z) {
                        return;
                    }
                    getHighResolutionOutputSizeshNQ4ISI();
                }

                @Override // rx.CompletableSubscriber
                public void onError(java.lang.Throwable th) {
                    if (z && this.Camera2StreamConfigurationMap.compareAndSet(false, true)) {
                        try {
                            action1.call(this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.lang.Throwable th2) {
                            th = new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2));
                        }
                    }
                    this.getHighSpeedVideoSizes.onError(th);
                    if (z) {
                        return;
                    }
                    getHighResolutionOutputSizeshNQ4ISI();
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(rx.Subscription subscription) {
                    this.getHighResolutionOutputSizeshNQ4ISI = subscription;
                    this.getHighSpeedVideoSizes.onSubscribe(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.Completable.13.1.1
                        @Override // rx.functions.Action0
                        public void call() {
                            rx.Completable.AnonymousClass13.AnonymousClass1.this.getHighResolutionOutputSizeshNQ4ISI();
                        }
                    }));
                }
            }
        });
    }

    protected Completable(rx.Completable.OnSubscribe onSubscribe) {
        this.getHighSpeedVideoFpsRangesFor = rx.plugins.RxJavaHooks.onCreate(onSubscribe);
    }

    protected Completable(rx.Completable.OnSubscribe onSubscribe, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = z ? rx.plugins.RxJavaHooks.onCreate(onSubscribe) : onSubscribe;
    }

    public final rx.Completable ambWith(rx.Completable completable) {
        return amb(this, completable);
    }

    public final void await() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.14
            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                thArr[0] = th;
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0) {
            java.lang.Throwable th = thArr[0];
            if (th != null) {
                rx.exceptions.Exceptions.propagate(th);
                return;
            }
            return;
        }
        try {
            countDownLatch.await();
            java.lang.Throwable th2 = thArr[0];
            if (th2 != null) {
                rx.exceptions.Exceptions.propagate(th2);
            }
        } catch (java.lang.InterruptedException e) {
            throw rx.exceptions.Exceptions.propagate(e);
        }
    }

    public final boolean await(long j, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Throwable th;
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.15
            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th2) {
                thArr[0] = th2;
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0) {
            java.lang.Throwable th2 = thArr[0];
            if (th2 != null) {
                rx.exceptions.Exceptions.propagate(th2);
            }
            return true;
        }
        try {
            boolean await = countDownLatch.await(j, timeUnit);
            if (await && (th = thArr[0]) != null) {
                rx.exceptions.Exceptions.propagate(th);
            }
            return await;
        } catch (java.lang.InterruptedException e) {
            throw rx.exceptions.Exceptions.propagate(e);
        }
    }

    public final rx.Completable compose(rx.Completable.Transformer transformer) {
        return (rx.Completable) to(transformer);
    }

    public final <T> rx.Observable<T> andThen(rx.Observable<T> observable) {
        return observable.delaySubscription(toObservable());
    }

    public final <T> rx.Single<T> andThen(rx.Single<T> single) {
        return single.delaySubscription(toObservable());
    }

    public final rx.Completable andThen(rx.Completable completable) {
        return concatWith(completable);
    }

    public final rx.Completable concatWith(rx.Completable completable) {
        return concat(this, completable);
    }

    public final rx.Completable delay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delay(j, timeUnit, rx.schedulers.Schedulers.computation(), false);
    }

    public final rx.Completable delay(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return delay(j, timeUnit, scheduler, false);
    }

    public final rx.Completable delay(final long j, final java.util.concurrent.TimeUnit timeUnit, final rx.Scheduler scheduler, final boolean z) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.16
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.subscriptions.CompositeSubscription compositeSubscription = new rx.subscriptions.CompositeSubscription();
                final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                compositeSubscription.add(createWorker);
                rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.16.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        compositeSubscription.add(createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.16.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber2.onCompleted();
                                } finally {
                                    createWorker.unsubscribe();
                                }
                            }
                        }, j, timeUnit));
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(final java.lang.Throwable th) {
                        if (z) {
                            compositeSubscription.add(createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.16.1.2
                                @Override // rx.functions.Action0
                                public void call() {
                                    try {
                                        completableSubscriber2.onError(th);
                                    } finally {
                                        createWorker.unsubscribe();
                                    }
                                }
                            }, j, timeUnit));
                        } else {
                            completableSubscriber2.onError(th);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        compositeSubscription.add(subscription);
                        completableSubscriber2.onSubscribe(compositeSubscription);
                    }
                });
            }
        });
    }

    public final rx.Completable doOnCompleted(rx.functions.Action0 action0) {
        return doOnLifecycle(rx.functions.Actions.empty(), rx.functions.Actions.empty(), action0, rx.functions.Actions.empty(), rx.functions.Actions.empty());
    }

    public final rx.Completable doOnEach(final rx.functions.Action1<rx.Notification<java.lang.Object>> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNotification is null");
        }
        return doOnLifecycle(rx.functions.Actions.empty(), new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.Completable.17
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Throwable th) {
                action1.call(rx.Notification.createOnError(th));
            }
        }, new rx.functions.Action0() { // from class: rx.Completable.18
            @Override // rx.functions.Action0
            public void call() {
                action1.call(rx.Notification.createOnCompleted());
            }
        }, rx.functions.Actions.empty(), rx.functions.Actions.empty());
    }

    public final rx.Completable doOnUnsubscribe(rx.functions.Action0 action0) {
        return doOnLifecycle(rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty(), action0);
    }

    public final rx.Completable doOnError(rx.functions.Action1<? super java.lang.Throwable> action1) {
        return doOnLifecycle(rx.functions.Actions.empty(), action1, rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty());
    }

    /* renamed from: rx.Completable$19, reason: invalid class name */
    class AnonymousClass19 implements rx.Completable.OnSubscribe {
        final /* synthetic */ rx.functions.Action0 Camera2StreamConfigurationMap;
        final /* synthetic */ rx.functions.Action1 getHighSpeedVideoFpsRanges;
        final /* synthetic */ rx.functions.Action0 getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ rx.functions.Action1 getHighSpeedVideoSizes;
        final /* synthetic */ rx.functions.Action0 getOutputFormats;

        AnonymousClass19(rx.functions.Action0 action0, rx.functions.Action0 action02, rx.functions.Action1 action1, rx.functions.Action1 action12, rx.functions.Action0 action03) {
            this.getHighSpeedVideoFpsRangesFor = action0;
            this.Camera2StreamConfigurationMap = action02;
            this.getHighSpeedVideoFpsRanges = action1;
            this.getHighSpeedVideoSizes = action12;
            this.getOutputFormats = action03;
        }

        @Override // rx.functions.Action1
        public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
            final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
            rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.19.1
                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    try {
                        rx.Completable.AnonymousClass19.this.getHighSpeedVideoFpsRangesFor.call();
                        completableSubscriber2.onCompleted();
                        try {
                            rx.Completable.AnonymousClass19.this.Camera2StreamConfigurationMap.call();
                        } catch (java.lang.Throwable th) {
                            rx.plugins.RxJavaHooks.onError(th);
                        }
                    } catch (java.lang.Throwable th2) {
                        completableSubscriber2.onError(th2);
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onError(java.lang.Throwable th) {
                    try {
                        rx.Completable.AnonymousClass19.this.getHighSpeedVideoFpsRanges.call(th);
                    } catch (java.lang.Throwable th2) {
                        th = new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2));
                    }
                    completableSubscriber2.onError(th);
                    try {
                        rx.Completable.AnonymousClass19.this.Camera2StreamConfigurationMap.call();
                    } catch (java.lang.Throwable th3) {
                        rx.plugins.RxJavaHooks.onError(th3);
                    }
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(final rx.Subscription subscription) {
                    try {
                        rx.Completable.AnonymousClass19.this.getHighSpeedVideoSizes.call(subscription);
                        completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.Completable.19.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    rx.Completable.AnonymousClass19.this.getOutputFormats.call();
                                } catch (java.lang.Throwable th) {
                                    rx.plugins.RxJavaHooks.onError(th);
                                }
                                subscription.unsubscribe();
                            }
                        }));
                    } catch (java.lang.Throwable th) {
                        subscription.unsubscribe();
                        completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.unsubscribed());
                        completableSubscriber2.onError(th);
                    }
                }
            });
        }
    }

    protected final rx.Completable doOnLifecycle(rx.functions.Action1<? super rx.Subscription> action1, rx.functions.Action1<? super java.lang.Throwable> action12, rx.functions.Action0 action0, rx.functions.Action0 action02, rx.functions.Action0 action03) {
        return create(new rx.Completable.AnonymousClass19(action0, action02, action12, action1, action03));
    }

    public final rx.Completable doOnSubscribe(rx.functions.Action1<? super rx.Subscription> action1) {
        return doOnLifecycle(action1, rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty());
    }

    public final rx.Completable doOnTerminate(final rx.functions.Action0 action0) {
        return doOnLifecycle(rx.functions.Actions.empty(), new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.Completable.20
            @Override // rx.functions.Action1
            public /* bridge */ /* synthetic */ void call(java.lang.Throwable th) {
                action0.call();
            }
        }, action0, rx.functions.Actions.empty(), rx.functions.Actions.empty());
    }

    public final rx.Completable doAfterTerminate(rx.functions.Action0 action0) {
        return doOnLifecycle(rx.functions.Actions.empty(), rx.functions.Actions.empty(), rx.functions.Actions.empty(), action0, rx.functions.Actions.empty());
    }

    public final java.lang.Throwable get() {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.21
            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                thArr[0] = th;
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            countDownLatch.await();
            return thArr[0];
        } catch (java.lang.InterruptedException e) {
            throw rx.exceptions.Exceptions.propagate(e);
        }
    }

    public final java.lang.Throwable get(long j, java.util.concurrent.TimeUnit timeUnit) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final java.lang.Throwable[] thArr = new java.lang.Throwable[1];
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.22
            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
            }

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                countDownLatch.countDown();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                thArr[0] = th;
                countDownLatch.countDown();
            }
        });
        if (countDownLatch.getCount() == 0) {
            return thArr[0];
        }
        try {
            if (countDownLatch.await(j, timeUnit)) {
                return thArr[0];
            }
            rx.exceptions.Exceptions.propagate(new java.util.concurrent.TimeoutException());
            return null;
        } catch (java.lang.InterruptedException e) {
            throw rx.exceptions.Exceptions.propagate(e);
        }
    }

    public final rx.Completable lift(final rx.Completable.Operator operator) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.23
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                try {
                    rx.Completable.this.unsafeSubscribe(rx.plugins.RxJavaHooks.onCompletableLift(operator).call(completableSubscriber));
                } catch (java.lang.NullPointerException e) {
                    throw e;
                } catch (java.lang.Throwable th) {
                    throw rx.Completable.Camera2StreamConfigurationMap(th);
                }
            }
        });
    }

    public final rx.Completable mergeWith(rx.Completable completable) {
        return merge(this, completable);
    }

    public final rx.Completable observeOn(final rx.Scheduler scheduler) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.24
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.internal.util.SubscriptionList subscriptionList = new rx.internal.util.SubscriptionList();
                final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                subscriptionList.add(createWorker);
                completableSubscriber2.onSubscribe(subscriptionList);
                rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.24.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.24.1.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber2.onCompleted();
                                } finally {
                                    subscriptionList.unsubscribe();
                                }
                            }
                        });
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(final java.lang.Throwable th) {
                        createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.24.1.2
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    completableSubscriber2.onError(th);
                                } finally {
                                    subscriptionList.unsubscribe();
                                }
                            }
                        });
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        subscriptionList.add(subscription);
                    }
                });
            }
        });
    }

    public final rx.Completable onErrorComplete() {
        return onErrorComplete(rx.internal.util.UtilityFunctions.alwaysTrue());
    }

    public final rx.Completable onErrorComplete(final rx.functions.Func1<? super java.lang.Throwable, java.lang.Boolean> func1) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.25
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.25.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        completableSubscriber2.onCompleted();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(java.lang.Throwable th) {
                        boolean z;
                        try {
                            z = ((java.lang.Boolean) func1.call(th)).booleanValue();
                        } catch (java.lang.Throwable th2) {
                            rx.exceptions.Exceptions.throwIfFatal(th2);
                            rx.exceptions.CompositeException compositeException = new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2));
                            z = false;
                            th = compositeException;
                        }
                        if (z) {
                            completableSubscriber2.onCompleted();
                        } else {
                            completableSubscriber2.onError(th);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        completableSubscriber2.onSubscribe(subscription);
                    }
                });
            }
        });
    }

    public final rx.Completable onErrorResumeNext(final rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Completable> func1) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.26
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.subscriptions.SerialSubscription serialSubscription = new rx.subscriptions.SerialSubscription();
                completableSubscriber2.onSubscribe(serialSubscription);
                rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.26.1
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        completableSubscriber2.onCompleted();
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(java.lang.Throwable th) {
                        try {
                            rx.Completable completable = (rx.Completable) func1.call(th);
                            if (completable == null) {
                                completableSubscriber2.onError(new rx.exceptions.CompositeException(java.util.Arrays.asList(th, new java.lang.NullPointerException("The completable returned is null"))));
                            } else {
                                completable.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.26.1.1
                                    @Override // rx.CompletableSubscriber
                                    public void onCompleted() {
                                        completableSubscriber2.onCompleted();
                                    }

                                    @Override // rx.CompletableSubscriber
                                    public void onError(java.lang.Throwable th2) {
                                        completableSubscriber2.onError(th2);
                                    }

                                    @Override // rx.CompletableSubscriber
                                    public void onSubscribe(rx.Subscription subscription) {
                                        serialSubscription.set(subscription);
                                    }
                                });
                            }
                        } catch (java.lang.Throwable th2) {
                            completableSubscriber2.onError(new rx.exceptions.CompositeException(java.util.Arrays.asList(th, th2)));
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        serialSubscription.set(subscription);
                    }
                });
            }
        });
    }

    public final rx.Completable repeat() {
        return fromObservable(toObservable().repeat());
    }

    public final rx.Completable repeat(long j) {
        return fromObservable(toObservable().repeat(j));
    }

    public final rx.Completable repeatWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> func1) {
        return fromObservable(toObservable().repeatWhen(func1));
    }

    public final rx.Completable retry() {
        return fromObservable(toObservable().retry());
    }

    public final rx.Completable retry(rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2) {
        return fromObservable(toObservable().retry(func2));
    }

    public final rx.Completable retry(long j) {
        return fromObservable(toObservable().retry(j));
    }

    public final rx.Completable retryWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1) {
        return fromObservable(toObservable().retryWhen(func1));
    }

    public final rx.Completable startWith(rx.Completable completable) {
        return concat(completable, this);
    }

    public final <T> rx.Observable<T> startWith(rx.Observable<T> observable) {
        return toObservable().startWith((rx.Observable) observable);
    }

    public final rx.Subscription subscribe() {
        final rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription = new rx.subscriptions.MultipleAssignmentSubscription();
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.27
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                multipleAssignmentSubscription.unsubscribe();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                rx.plugins.RxJavaHooks.onError(th);
                multipleAssignmentSubscription.unsubscribe();
                rx.Completable.getHighSpeedVideoFpsRangesFor(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    public final rx.Subscription subscribe(final rx.functions.Action0 action0) {
        final rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription = new rx.subscriptions.MultipleAssignmentSubscription();
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.28
            boolean getHighSpeedVideoFpsRangesFor;

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    return;
                }
                this.getHighSpeedVideoFpsRangesFor = true;
                try {
                    action0.call();
                } finally {
                    try {
                    } finally {
                    }
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                rx.plugins.RxJavaHooks.onError(th);
                multipleAssignmentSubscription.unsubscribe();
                rx.Completable.getHighSpeedVideoFpsRangesFor(th);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    public final rx.Subscription subscribe(final rx.functions.Action0 action0, final rx.functions.Action1<? super java.lang.Throwable> action1) {
        final rx.subscriptions.MultipleAssignmentSubscription multipleAssignmentSubscription = new rx.subscriptions.MultipleAssignmentSubscription();
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.29
            boolean getHighResolutionOutputSizeshNQ4ISI;

            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                try {
                    action0.call();
                    multipleAssignmentSubscription.unsubscribe();
                } catch (java.lang.Throwable th) {
                    getHighSpeedVideoFpsRangesFor(th);
                }
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th) {
                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    getHighSpeedVideoFpsRangesFor(th);
                } else {
                    rx.plugins.RxJavaHooks.onError(th);
                    rx.Completable.getHighSpeedVideoFpsRangesFor(th);
                }
            }

            private void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
                try {
                    action1.call(th);
                } finally {
                    try {
                    } finally {
                    }
                }
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
                multipleAssignmentSubscription.set(subscription);
            }
        });
        return multipleAssignmentSubscription;
    }

    static void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public final void unsafeSubscribe(rx.CompletableSubscriber completableSubscriber) {
        try {
            rx.plugins.RxJavaHooks.onCompletableStart(this, this.getHighSpeedVideoFpsRangesFor).call(completableSubscriber);
        } catch (java.lang.NullPointerException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            java.lang.Throwable onCompletableError = rx.plugins.RxJavaHooks.onCompletableError(th);
            rx.plugins.RxJavaHooks.onError(onCompletableError);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(onCompletableError);
            throw nullPointerException;
        }
    }

    public final void subscribe(rx.CompletableSubscriber completableSubscriber) {
        if (!(completableSubscriber instanceof rx.observers.SafeCompletableSubscriber)) {
            completableSubscriber = new rx.observers.SafeCompletableSubscriber(completableSubscriber);
        }
        unsafeSubscribe(completableSubscriber);
    }

    public final <T> void unsafeSubscribe(rx.Subscriber<T> subscriber) {
        getHighSpeedVideoSizes(subscriber, true);
    }

    private <T> void getHighSpeedVideoSizes(final rx.Subscriber<T> subscriber, boolean z) {
        if (z) {
            try {
                subscriber.onStart();
            } catch (java.lang.NullPointerException e) {
                throw e;
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                java.lang.Throwable onObservableError = rx.plugins.RxJavaHooks.onObservableError(th);
                rx.plugins.RxJavaHooks.onError(onObservableError);
                java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
                nullPointerException.initCause(onObservableError);
                throw nullPointerException;
            }
        }
        unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.30
            @Override // rx.CompletableSubscriber
            public void onCompleted() {
                subscriber.onCompleted();
            }

            @Override // rx.CompletableSubscriber
            public void onError(java.lang.Throwable th2) {
                subscriber.onError(th2);
            }

            @Override // rx.CompletableSubscriber
            public void onSubscribe(rx.Subscription subscription) {
                subscriber.add(subscription);
            }
        });
        rx.plugins.RxJavaHooks.onObservableReturn(subscriber);
    }

    public final <T> void subscribe(rx.Subscriber<T> subscriber) {
        subscriber.onStart();
        if (!(subscriber instanceof rx.observers.SafeSubscriber)) {
            subscriber = new rx.observers.SafeSubscriber(subscriber);
        }
        getHighSpeedVideoSizes(subscriber, false);
    }

    public final rx.Completable subscribeOn(final rx.Scheduler scheduler) {
        return create(new rx.Completable.OnSubscribe() { // from class: rx.Completable.31
            @Override // rx.functions.Action1
            public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
                final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
                final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.31.1
                    @Override // rx.functions.Action0
                    public void call() {
                        try {
                            rx.Completable.this.unsafeSubscribe(completableSubscriber2);
                        } finally {
                            createWorker.unsubscribe();
                        }
                    }
                });
            }
        });
    }

    public final rx.Completable timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timeout0(j, timeUnit, rx.schedulers.Schedulers.computation(), null);
    }

    public final rx.Completable timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Completable completable) {
        return timeout0(j, timeUnit, rx.schedulers.Schedulers.computation(), completable);
    }

    public final rx.Completable timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return timeout0(j, timeUnit, scheduler, null);
    }

    public final rx.Completable timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler, rx.Completable completable) {
        return timeout0(j, timeUnit, scheduler, completable);
    }

    public final rx.Completable timeout0(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler, rx.Completable completable) {
        return create(new rx.internal.operators.CompletableOnSubscribeTimeout(this, j, timeUnit, scheduler, completable));
    }

    public final <R> R to(rx.functions.Func1<? super rx.Completable, R> func1) {
        return func1.call(this);
    }

    public final <T> rx.Observable<T> toObservable() {
        return rx.Observable.unsafeCreate(new rx.Observable.OnSubscribe<T>() { // from class: rx.Completable.32
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                rx.Completable.this.unsafeSubscribe((rx.Subscriber) obj);
            }
        });
    }

    public final <T> rx.Single<T> toSingle(final rx.functions.Func0<? extends T> func0) {
        return rx.Single.create(new rx.Single.OnSubscribe<T>() { // from class: rx.Completable.33
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.33.1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // rx.CompletableSubscriber
                    public void onCompleted() {
                        try {
                            java.lang.Object call = func0.call();
                            if (call == null) {
                                singleSubscriber.onError(new java.lang.NullPointerException("The value supplied is null"));
                            } else {
                                singleSubscriber.onSuccess(call);
                            }
                        } catch (java.lang.Throwable th) {
                            singleSubscriber.onError(th);
                        }
                    }

                    @Override // rx.CompletableSubscriber
                    public void onError(java.lang.Throwable th) {
                        singleSubscriber.onError(th);
                    }

                    @Override // rx.CompletableSubscriber
                    public void onSubscribe(rx.Subscription subscription) {
                        singleSubscriber.add(subscription);
                    }
                });
            }
        });
    }

    public final <T> rx.Single<T> toSingleDefault(final T t) {
        return toSingle(new rx.functions.Func0<T>() { // from class: rx.Completable.34
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public T call() {
                return (T) t;
            }
        });
    }

    /* renamed from: rx.Completable$35, reason: invalid class name */
    class AnonymousClass35 implements rx.Completable.OnSubscribe {
        final /* synthetic */ rx.Scheduler getHighSpeedVideoFpsRanges;

        AnonymousClass35(rx.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRanges = scheduler;
        }

        @Override // rx.functions.Action1
        public /* synthetic */ void call(rx.CompletableSubscriber completableSubscriber) {
            final rx.CompletableSubscriber completableSubscriber2 = completableSubscriber;
            rx.Completable.this.unsafeSubscribe(new rx.CompletableSubscriber() { // from class: rx.Completable.35.1
                @Override // rx.CompletableSubscriber
                public void onCompleted() {
                    completableSubscriber2.onCompleted();
                }

                @Override // rx.CompletableSubscriber
                public void onError(java.lang.Throwable th) {
                    completableSubscriber2.onError(th);
                }

                @Override // rx.CompletableSubscriber
                public void onSubscribe(final rx.Subscription subscription) {
                    completableSubscriber2.onSubscribe(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.Completable.35.1.1
                        @Override // rx.functions.Action0
                        public void call() {
                            final rx.Scheduler.Worker createWorker = rx.Completable.AnonymousClass35.this.getHighSpeedVideoFpsRanges.createWorker();
                            createWorker.schedule(new rx.functions.Action0() { // from class: rx.Completable.35.1.1.1
                                @Override // rx.functions.Action0
                                public void call() {
                                    try {
                                        subscription.unsubscribe();
                                    } finally {
                                        createWorker.unsubscribe();
                                    }
                                }
                            });
                        }
                    }));
                }
            });
        }
    }

    public final rx.Completable unsubscribeOn(rx.Scheduler scheduler) {
        return create(new rx.Completable.AnonymousClass35(scheduler));
    }

    public final rx.observers.AssertableSubscriber<java.lang.Void> test() {
        rx.internal.observers.AssertableSubscriberObservable create = rx.internal.observers.AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe(create);
        return create;
    }
}
