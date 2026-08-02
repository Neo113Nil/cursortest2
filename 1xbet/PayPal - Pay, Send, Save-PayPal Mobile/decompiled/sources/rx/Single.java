package rx;

/* loaded from: classes18.dex */
public class Single<T> {
    final rx.Single.OnSubscribe<T> getHighSpeedVideoSizes;

    public interface OnSubscribe<T> extends rx.functions.Action1<rx.SingleSubscriber<? super T>> {
    }

    public interface Transformer<T, R> extends rx.functions.Func1<rx.Single<T>, rx.Single<R>> {
    }

    public Single(rx.Single.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoSizes = rx.plugins.RxJavaHooks.onCreate(onSubscribe);
    }

    @java.lang.Deprecated
    protected Single(rx.Observable.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoSizes = rx.plugins.RxJavaHooks.onCreate(new rx.internal.operators.SingleFromObservable(onSubscribe));
    }

    public static <T> rx.Single<T> create(rx.Single.OnSubscribe<T> onSubscribe) {
        return new rx.Single<>(onSubscribe);
    }

    public final <R> rx.Single<R> lift(rx.Observable.Operator<? extends R, ? super T> operator) {
        return create(new rx.internal.operators.SingleLiftObservableOperator(this.getHighSpeedVideoSizes, operator));
    }

    public <R> rx.Single<R> compose(rx.Single.Transformer<? super T, ? extends R> transformer) {
        return (rx.Single) transformer.call(this);
    }

    public final <R> rx.Single<R> cast(java.lang.Class<R> cls) {
        return map(new rx.internal.operators.SingleOperatorCast(cls));
    }

    public static <T> rx.Single<T> error(final java.lang.Throwable th) {
        return create(new rx.Single.OnSubscribe<T>() { // from class: rx.Single.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                ((rx.SingleSubscriber) obj).onError(th);
            }
        });
    }

    public static <T> rx.Single<T> from(java.util.concurrent.Future<? extends T> future) {
        return create(new rx.internal.operators.SingleFromFuture(future, 0L, null));
    }

    public static <T> rx.Single<T> from(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new java.lang.NullPointerException("unit is null");
        }
        return create(new rx.internal.operators.SingleFromFuture(future, j, timeUnit));
    }

    public static <T> rx.Single<T> from(java.util.concurrent.Future<? extends T> future, rx.Scheduler scheduler) {
        return from(future).subscribeOn(scheduler);
    }

    public static <T> rx.Single<T> fromCallable(java.util.concurrent.Callable<? extends T> callable) {
        return create(new rx.internal.operators.SingleFromCallable(callable));
    }

    public static <T> rx.Single<T> fromEmitter(rx.functions.Action1<rx.SingleEmitter<T>> action1) {
        if (action1 == null) {
            throw new java.lang.NullPointerException("producer is null");
        }
        return create(new rx.internal.operators.SingleFromEmitter(action1));
    }

    public static <T> rx.Single<T> just(T t) {
        return rx.internal.util.ScalarSynchronousSingle.create(t);
    }

    public static <T> rx.Single<T> merge(rx.Single<? extends rx.Single<? extends T>> single) {
        if (single instanceof rx.internal.util.ScalarSynchronousSingle) {
            return ((rx.internal.util.ScalarSynchronousSingle) single).scalarFlatMap(rx.internal.util.UtilityFunctions.identity());
        }
        return create(new rx.Single.OnSubscribe<T>() { // from class: rx.Single.2
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                rx.SingleSubscriber<rx.Single<? extends T>> singleSubscriber2 = new rx.SingleSubscriber<rx.Single<? extends T>>() { // from class: rx.Single.2.1
                    @Override // rx.SingleSubscriber
                    public /* synthetic */ void onSuccess(java.lang.Object obj2) {
                        ((rx.Single) obj2).subscribe(singleSubscriber);
                    }

                    @Override // rx.SingleSubscriber
                    public void onError(java.lang.Throwable th) {
                        singleSubscriber.onError(th);
                    }
                };
                singleSubscriber.add(singleSubscriber2);
                rx.Single.this.subscribe(singleSubscriber2);
            }
        });
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends rx.Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends rx.Single<? extends T>> observable, int i) {
        return (rx.Observable<T>) observable.flatMapSingle(rx.internal.util.UtilityFunctions.identity(), false, i);
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends rx.Single<? extends T>> observable) {
        return merge(observable, Integer.MAX_VALUE);
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends rx.Single<? extends T>> observable, int i) {
        return (rx.Observable<T>) observable.flatMapSingle(rx.internal.util.UtilityFunctions.identity(), true, i);
    }

    public static <T1, T2, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, final rx.functions.Func2<? super T1, ? super T2, ? extends R> func2) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2}, new rx.functions.FuncN<R>() { // from class: rx.Single.3
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func2.this.call(objArr[0], objArr[1]);
            }
        });
    }

    public static <T1, T2, T3, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, final rx.functions.Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3}, new rx.functions.FuncN<R>() { // from class: rx.Single.4
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func3.this.call(objArr[0], objArr[1], objArr[2]);
            }
        });
    }

    public static <T1, T2, T3, T4, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, final rx.functions.Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4}, new rx.functions.FuncN<R>() { // from class: rx.Single.5
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func4.this.call(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        });
    }

    public static <T1, T2, T3, T4, T5, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, rx.Single<? extends T5> single5, final rx.functions.Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4, single5}, new rx.functions.FuncN<R>() { // from class: rx.Single.6
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func5.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        });
    }

    public static <T1, T2, T3, T4, T5, T6, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, rx.Single<? extends T5> single5, rx.Single<? extends T6> single6, final rx.functions.Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4, single5, single6}, new rx.functions.FuncN<R>() { // from class: rx.Single.7
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func6.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        });
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, rx.Single<? extends T5> single5, rx.Single<? extends T6> single6, rx.Single<? extends T7> single7, final rx.functions.Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4, single5, single6, single7}, new rx.functions.FuncN<R>() { // from class: rx.Single.8
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func7.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        });
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, rx.Single<? extends T5> single5, rx.Single<? extends T6> single6, rx.Single<? extends T7> single7, rx.Single<? extends T8> single8, final rx.functions.Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4, single5, single6, single7, single8}, new rx.functions.FuncN<R>() { // from class: rx.Single.9
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func8.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        });
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> rx.Single<R> zip(rx.Single<? extends T1> single, rx.Single<? extends T2> single2, rx.Single<? extends T3> single3, rx.Single<? extends T4> single4, rx.Single<? extends T5> single5, rx.Single<? extends T6> single6, rx.Single<? extends T7> single7, rx.Single<? extends T8> single8, rx.Single<? extends T9> single9, final rx.functions.Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return rx.internal.operators.SingleOperatorZip.zip(new rx.Single[]{single, single2, single3, single4, single5, single6, single7, single8, single9}, new rx.functions.FuncN<R>() { // from class: rx.Single.10
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                return (R) rx.functions.Func9.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
        });
    }

    public final rx.Single<T> cache() {
        return toObservable().cacheWithInitialCapacity(1).toSingle();
    }

    public final rx.Observable<T> concatWith(rx.Single<? extends T> single) {
        return concat(this, single);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Single<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1) {
        if (this instanceof rx.internal.util.ScalarSynchronousSingle) {
            return ((rx.internal.util.ScalarSynchronousSingle) this).scalarFlatMap(func1);
        }
        return merge(map(func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Observable<R> flatMapObservable(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(map(func1).getHighSpeedVideoSizes)));
    }

    public final rx.Completable flatMapCompletable(rx.functions.Func1<? super T, ? extends rx.Completable> func1) {
        return rx.Completable.create(new rx.internal.operators.CompletableFlatMapSingleToCompletable(this, func1));
    }

    public final <R> rx.Single<R> map(rx.functions.Func1<? super T, ? extends R> func1) {
        return create(new rx.internal.operators.SingleOnSubscribeMap(this, func1));
    }

    public final rx.Observable<T> mergeWith(rx.Single<? extends T> single) {
        return merge(this, single);
    }

    public final rx.Single<T> observeOn(rx.Scheduler scheduler) {
        if (this instanceof rx.internal.util.ScalarSynchronousSingle) {
            return ((rx.internal.util.ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        if (scheduler == null) {
            throw new java.lang.NullPointerException("scheduler is null");
        }
        return create(new rx.internal.operators.SingleObserveOn(this.getHighSpeedVideoSizes, scheduler));
    }

    public final rx.Single<T> onErrorReturn(rx.functions.Func1<java.lang.Throwable, ? extends T> func1) {
        return create(new rx.internal.operators.SingleOnErrorReturn(this.getHighSpeedVideoSizes, func1));
    }

    public final rx.Single<T> onErrorResumeNext(rx.Single<? extends T> single) {
        return new rx.Single<>(rx.internal.operators.SingleOperatorOnErrorResumeNext.withOther(this, single));
    }

    public final rx.Single<T> onErrorResumeNext(rx.functions.Func1<java.lang.Throwable, ? extends rx.Single<? extends T>> func1) {
        return new rx.Single<>(rx.internal.operators.SingleOperatorOnErrorResumeNext.withFunction(this, func1));
    }

    public final rx.Subscription subscribe() {
        return subscribe(rx.functions.Actions.empty(), rx.functions.Actions.errorNotImplemented());
    }

    public final rx.Subscription subscribe(rx.functions.Action1<? super T> action1) {
        return subscribe(action1, rx.functions.Actions.errorNotImplemented());
    }

    public final rx.Subscription subscribe(final rx.functions.Action1<? super T> action1, final rx.functions.Action1<java.lang.Throwable> action12) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onSuccess can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        return subscribe(new rx.SingleSubscriber<T>() { // from class: rx.Single.11
            @Override // rx.SingleSubscriber
            public final void onError(java.lang.Throwable th) {
                try {
                    action12.call(th);
                } finally {
                    unsubscribe();
                }
            }

            @Override // rx.SingleSubscriber
            public final void onSuccess(T t) {
                try {
                    action1.call(t);
                } finally {
                    unsubscribe();
                }
            }
        });
    }

    public final rx.Subscription unsafeSubscribe(rx.Subscriber<? super T> subscriber) {
        return getHighSpeedVideoFpsRangesFor(subscriber, true);
    }

    private rx.Subscription getHighSpeedVideoFpsRangesFor(rx.Subscriber<? super T> subscriber, boolean z) {
        if (z) {
            try {
                subscriber.onStart();
            } catch (java.lang.Throwable th) {
                rx.exceptions.Exceptions.throwIfFatal(th);
                try {
                    subscriber.onError(rx.plugins.RxJavaHooks.onSingleError(th));
                    return rx.subscriptions.Subscriptions.unsubscribed();
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwIfFatal(th2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error occurred attempting to subscribe [");
                    sb.append(th.getMessage());
                    sb.append("] and then again while trying to pass to onError.");
                    java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(sb.toString(), th2);
                    rx.plugins.RxJavaHooks.onSingleError(runtimeException);
                    throw runtimeException;
                }
            }
        }
        rx.plugins.RxJavaHooks.onSingleStart(this, this.getHighSpeedVideoSizes).call(rx.internal.operators.SingleLiftObservableOperator.wrap(subscriber));
        return rx.plugins.RxJavaHooks.onSingleReturn(subscriber);
    }

    public final rx.Subscription subscribe(final rx.Observer<? super T> observer) {
        if (observer == null) {
            throw new java.lang.NullPointerException("observer is null");
        }
        return subscribe(new rx.SingleSubscriber<T>() { // from class: rx.Single.12
            @Override // rx.SingleSubscriber
            public void onSuccess(T t) {
                observer.onNext(t);
                observer.onCompleted();
            }

            @Override // rx.SingleSubscriber
            public void onError(java.lang.Throwable th) {
                observer.onError(th);
            }
        });
    }

    public final rx.Subscription subscribe(rx.Subscriber<? super T> subscriber) {
        if (subscriber == null) {
            throw new java.lang.IllegalArgumentException("observer can not be null");
        }
        subscriber.onStart();
        if (!(subscriber instanceof rx.observers.SafeSubscriber)) {
            return getHighSpeedVideoFpsRangesFor(new rx.observers.SafeSubscriber(subscriber), false);
        }
        return getHighSpeedVideoFpsRangesFor(subscriber, true);
    }

    public final rx.Subscription subscribe(rx.SingleSubscriber<? super T> singleSubscriber) {
        if (singleSubscriber == null) {
            throw new java.lang.IllegalArgumentException("te is null");
        }
        try {
            rx.plugins.RxJavaHooks.onSingleStart(this, this.getHighSpeedVideoSizes).call(singleSubscriber);
            return rx.plugins.RxJavaHooks.onSingleReturn(singleSubscriber);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            try {
                singleSubscriber.onError(rx.plugins.RxJavaHooks.onSingleError(th));
                return rx.subscriptions.Subscriptions.empty();
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException(sb.toString(), th2);
                rx.plugins.RxJavaHooks.onSingleError(runtimeException);
                throw runtimeException;
            }
        }
    }

    public final rx.Single<T> subscribeOn(final rx.Scheduler scheduler) {
        if (this instanceof rx.internal.util.ScalarSynchronousSingle) {
            return ((rx.internal.util.ScalarSynchronousSingle) this).scalarScheduleOn(scheduler);
        }
        return create(new rx.Single.OnSubscribe<T>() { // from class: rx.Single.13
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                singleSubscriber.add(createWorker);
                createWorker.schedule(new rx.functions.Action0() { // from class: rx.Single.13.1
                    @Override // rx.functions.Action0
                    public void call() {
                        rx.SingleSubscriber<T> singleSubscriber2 = new rx.SingleSubscriber<T>() { // from class: rx.Single.13.1.1
                            @Override // rx.SingleSubscriber
                            public void onSuccess(T t) {
                                try {
                                    singleSubscriber.onSuccess(t);
                                } finally {
                                    createWorker.unsubscribe();
                                }
                            }

                            @Override // rx.SingleSubscriber
                            public void onError(java.lang.Throwable th) {
                                try {
                                    singleSubscriber.onError(th);
                                } finally {
                                    createWorker.unsubscribe();
                                }
                            }
                        };
                        singleSubscriber.add(singleSubscriber2);
                        rx.Single.this.subscribe(singleSubscriber2);
                    }
                });
            }
        });
    }

    public final rx.Single<T> takeUntil(rx.Completable completable) {
        return create(new rx.internal.operators.SingleTakeUntilCompletable(this.getHighSpeedVideoSizes, completable));
    }

    public final <E> rx.Single<T> takeUntil(rx.Observable<? extends E> observable) {
        return create(new rx.internal.operators.SingleTakeUntilObservable(this.getHighSpeedVideoSizes, observable));
    }

    public final <E> rx.Single<T> takeUntil(rx.Single<? extends E> single) {
        return create(new rx.internal.operators.SingleTakeUntilSingle(this.getHighSpeedVideoSizes, single));
    }

    public final <R> R to(rx.functions.Func1<? super rx.Single<T>, R> func1) {
        return func1.call(this);
    }

    public final rx.Completable toCompletable() {
        return rx.Completable.fromSingle(this);
    }

    public final rx.Single<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, rx.schedulers.Schedulers.computation());
    }

    public final rx.Single<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return timeout(j, timeUnit, null, scheduler);
    }

    public final rx.Single<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Single<? extends T> single) {
        return timeout(j, timeUnit, single, rx.schedulers.Schedulers.computation());
    }

    public final rx.Single<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Single<? extends T> single, rx.Scheduler scheduler) {
        if (single == null) {
            single = defer(new rx.functions.Func0<rx.Single<T>>() { // from class: rx.Single.14
                @Override // rx.functions.Func0, java.util.concurrent.Callable
                public /* synthetic */ java.lang.Object call() {
                    return rx.Single.error(new java.util.concurrent.TimeoutException());
                }
            });
        }
        return create(new rx.internal.operators.SingleTimeout(this.getHighSpeedVideoSizes, j, timeUnit, scheduler, single.getHighSpeedVideoSizes));
    }

    public final rx.singles.BlockingSingle<T> toBlocking() {
        return rx.singles.BlockingSingle.from(this);
    }

    public final <T2, R> rx.Single<R> zipWith(rx.Single<? extends T2> single, rx.functions.Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, single, func2);
    }

    public final rx.Single<T> doOnError(final rx.functions.Action1<java.lang.Throwable> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onError is null");
        }
        return create(new rx.internal.operators.SingleDoOnEvent(this, rx.functions.Actions.empty(), new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.Single.15
            @Override // rx.functions.Action1
            public /* bridge */ /* synthetic */ void call(java.lang.Throwable th) {
                action1.call(th);
            }
        }));
    }

    public final rx.Single<T> doOnEach(final rx.functions.Action1<rx.Notification<? extends T>> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNotification is null");
        }
        return create(new rx.internal.operators.SingleDoOnEvent(this, new rx.functions.Action1<T>() { // from class: rx.Single.16
            @Override // rx.functions.Action1
            public void call(T t) {
                action1.call(rx.Notification.createOnNext(t));
            }
        }, new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.Single.17
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Throwable th) {
                action1.call(rx.Notification.createOnError(th));
            }
        }));
    }

    public final rx.Single<T> doOnSuccess(rx.functions.Action1<? super T> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onSuccess is null");
        }
        return create(new rx.internal.operators.SingleDoOnEvent(this, action1, rx.functions.Actions.empty()));
    }

    public final rx.Single<T> doOnSubscribe(rx.functions.Action0 action0) {
        return create(new rx.internal.operators.SingleDoOnSubscribe(this.getHighSpeedVideoSizes, action0));
    }

    public final rx.Single<T> delay(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return create(new rx.internal.operators.SingleDelay(this.getHighSpeedVideoSizes, j, timeUnit, scheduler));
    }

    public final rx.Single<T> delay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delay(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public static <T> rx.Single<T> defer(final java.util.concurrent.Callable<rx.Single<T>> callable) {
        return create(new rx.Single.OnSubscribe<T>() { // from class: rx.Single.18
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Object obj) {
                rx.SingleSubscriber<? super T> singleSubscriber = (rx.SingleSubscriber) obj;
                try {
                    ((rx.Single) callable.call()).subscribe(singleSubscriber);
                } catch (java.lang.Throwable th) {
                    rx.exceptions.Exceptions.throwIfFatal(th);
                    singleSubscriber.onError(th);
                }
            }
        });
    }

    public final rx.Single<T> doOnUnsubscribe(rx.functions.Action0 action0) {
        return create(new rx.internal.operators.SingleDoOnUnsubscribe(this.getHighSpeedVideoSizes, action0));
    }

    public final rx.Single<T> doAfterTerminate(rx.functions.Action0 action0) {
        return create(new rx.internal.operators.SingleDoAfterTerminate(this, action0));
    }

    public final rx.Single<T> retry() {
        return toObservable().retry().toSingle();
    }

    public final rx.Single<T> retry(long j) {
        return toObservable().retry(j).toSingle();
    }

    public final rx.Single<T> retry(rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2) {
        return toObservable().retry(func2).toSingle();
    }

    public final rx.Single<T> retryWhen(rx.functions.Func1<rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1) {
        return toObservable().retryWhen(func1).toSingle();
    }

    public static <T, Resource> rx.Single<T> using(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Single<? extends T>> func1, rx.functions.Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T, Resource> rx.Single<T> using(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Single<? extends T>> func1, rx.functions.Action1<? super Resource> action1, boolean z) {
        if (func0 == null) {
            throw new java.lang.NullPointerException("resourceFactory is null");
        }
        if (func1 == null) {
            throw new java.lang.NullPointerException("singleFactory is null");
        }
        if (action1 == null) {
            throw new java.lang.NullPointerException("disposeAction is null");
        }
        return create(new rx.internal.operators.SingleOnSubscribeUsing(func0, func1, action1, z));
    }

    public final rx.Single<T> delaySubscription(rx.Observable<?> observable) {
        return create(new rx.internal.operators.SingleOnSubscribeDelaySubscriptionOther(this, observable));
    }

    public final rx.Single<T> unsubscribeOn(final rx.Scheduler scheduler) {
        return create(new rx.Single.OnSubscribe<T>() { // from class: rx.Single.19
            @Override // rx.functions.Action1
            public /* synthetic */ void call(java.lang.Object obj) {
                final rx.SingleSubscriber singleSubscriber = (rx.SingleSubscriber) obj;
                final rx.SingleSubscriber<T> singleSubscriber2 = new rx.SingleSubscriber<T>() { // from class: rx.Single.19.1
                    @Override // rx.SingleSubscriber
                    public void onSuccess(T t) {
                        singleSubscriber.onSuccess(t);
                    }

                    @Override // rx.SingleSubscriber
                    public void onError(java.lang.Throwable th) {
                        singleSubscriber.onError(th);
                    }
                };
                singleSubscriber.add(rx.subscriptions.Subscriptions.create(new rx.functions.Action0() { // from class: rx.Single.19.2
                    @Override // rx.functions.Action0
                    public void call() {
                        final rx.Scheduler.Worker createWorker = scheduler.createWorker();
                        createWorker.schedule(new rx.functions.Action0() { // from class: rx.Single.19.2.1
                            @Override // rx.functions.Action0
                            public void call() {
                                try {
                                    singleSubscriber2.unsubscribe();
                                } finally {
                                    createWorker.unsubscribe();
                                }
                            }
                        });
                    }
                }));
                rx.Single.this.subscribe(singleSubscriber2);
            }
        });
    }

    public final rx.observers.AssertableSubscriber<T> test() {
        rx.internal.observers.AssertableSubscriberObservable create = rx.internal.observers.AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe((rx.Subscriber) create);
        return create;
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7, rx.Single<? extends T> single8) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single8.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> concat(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7, rx.Single<? extends T> single8, rx.Single<? extends T> single9) {
        return rx.Observable.concat(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single8.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single9.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7, rx.Single<? extends T> single8) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single8.getHighSpeedVideoSizes)));
    }

    public static <T> rx.Observable<T> merge(rx.Single<? extends T> single, rx.Single<? extends T> single2, rx.Single<? extends T> single3, rx.Single<? extends T> single4, rx.Single<? extends T> single5, rx.Single<? extends T> single6, rx.Single<? extends T> single7, rx.Single<? extends T> single8, rx.Single<? extends T> single9) {
        return rx.Observable.merge(rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single2.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single3.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single4.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single5.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single6.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single7.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single8.getHighSpeedVideoSizes)), rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(single9.getHighSpeedVideoSizes)));
    }

    public final rx.Observable<T> toObservable() {
        return rx.Observable.unsafeCreate(new rx.internal.operators.SingleToObservable(this.getHighSpeedVideoSizes));
    }

    public static <R> rx.Single<R> zip(java.lang.Iterable<? extends rx.Single<?>> iterable, rx.functions.FuncN<? extends R> funcN) {
        rx.Single[] singleArr;
        if (iterable instanceof java.util.Collection) {
            java.util.Collection collection = (java.util.Collection) iterable;
            singleArr = (rx.Single[]) collection.toArray(new rx.Single[collection.size()]);
        } else {
            rx.Single[] singleArr2 = new rx.Single[8];
            int i = 0;
            for (rx.Single<?> single : iterable) {
                if (i == singleArr2.length) {
                    rx.Single[] singleArr3 = new rx.Single[(i >> 2) + i];
                    java.lang.System.arraycopy(singleArr2, 0, singleArr3, 0, i);
                    singleArr2 = singleArr3;
                }
                singleArr2[i] = single;
                i++;
            }
            if (singleArr2.length == i) {
                singleArr = singleArr2;
            } else {
                singleArr = new rx.Single[i];
                java.lang.System.arraycopy(singleArr2, 0, singleArr, 0, i);
            }
        }
        return rx.internal.operators.SingleOperatorZip.zip(singleArr, funcN);
    }
}
