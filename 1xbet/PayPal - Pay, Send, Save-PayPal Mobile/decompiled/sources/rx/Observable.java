package rx;

/* loaded from: classes18.dex */
public class Observable<T> {
    final rx.Observable.OnSubscribe<T> getHighSpeedVideoSizes;

    public interface OnSubscribe<T> extends rx.functions.Action1<rx.Subscriber<? super T>> {
    }

    public interface Operator<R, T> extends rx.functions.Func1<rx.Subscriber<? super R>, rx.Subscriber<? super T>> {
    }

    public interface Transformer<T, R> extends rx.functions.Func1<rx.Observable<T>, rx.Observable<R>> {
    }

    public Observable(rx.Observable.OnSubscribe<T> onSubscribe) {
        this.getHighSpeedVideoSizes = onSubscribe;
    }

    @java.lang.Deprecated
    public static <T> rx.Observable<T> create(rx.Observable.OnSubscribe<T> onSubscribe) {
        return new rx.Observable<>(rx.plugins.RxJavaHooks.onCreate(onSubscribe));
    }

    public static <T> rx.Observable<T> create(rx.functions.Action1<rx.Emitter<T>> action1, rx.Emitter.BackpressureMode backpressureMode) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeCreate(action1, backpressureMode));
    }

    public static <T> rx.Observable<T> unsafeCreate(rx.Observable.OnSubscribe<T> onSubscribe) {
        return new rx.Observable<>(rx.plugins.RxJavaHooks.onCreate(onSubscribe));
    }

    public static <S, T> rx.Observable<T> create(rx.observables.SyncOnSubscribe<S, T> syncOnSubscribe) {
        return unsafeCreate(syncOnSubscribe);
    }

    public static <S, T> rx.Observable<T> create(rx.observables.AsyncOnSubscribe<S, T> asyncOnSubscribe) {
        return unsafeCreate(asyncOnSubscribe);
    }

    public final <R> rx.Observable<R> lift(rx.Observable.Operator<? extends R, ? super T> operator) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeLift(this.getHighSpeedVideoSizes, operator));
    }

    public <R> rx.Observable<R> compose(rx.Observable.Transformer<? super T, ? extends R> transformer) {
        return (rx.Observable) transformer.call(this);
    }

    public final <R> R to(rx.functions.Func1<? super rx.Observable<T>, R> func1) {
        return func1.call(this);
    }

    public rx.Single<T> toSingle() {
        return new rx.Single<>(rx.internal.operators.OnSubscribeSingle.create(this));
    }

    public rx.Completable toCompletable() {
        return rx.Completable.fromObservable(this);
    }

    public static <T> rx.Observable<T> amb(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(iterable));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4, observable5));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4, observable5, observable6));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static <T> rx.Observable<T> amb(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return unsafeCreate(rx.internal.operators.OnSubscribeAmb.amb(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9));
    }

    public static <T1, T2, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.functions.Func2<? super T1, ? super T2, ? extends R> func2) {
        return combineLatest(java.util.Arrays.asList(observable, observable2), rx.functions.Functions.fromFunc(func2));
    }

    public static <T1, T2, T3, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.functions.Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3), rx.functions.Functions.fromFunc(func3));
    }

    public static <T1, T2, T3, T4, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.functions.Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4), rx.functions.Functions.fromFunc(func4));
    }

    public static <T1, T2, T3, T4, T5, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.functions.Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5), rx.functions.Functions.fromFunc(func5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.functions.Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6), rx.functions.Functions.fromFunc(func6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.functions.Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7), rx.functions.Functions.fromFunc(func7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.Observable<? extends T8> observable8, rx.functions.Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8), rx.functions.Functions.fromFunc(func8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> rx.Observable<R> combineLatest(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.Observable<? extends T8> observable8, rx.Observable<? extends T9> observable9, rx.functions.Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return combineLatest(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9), rx.functions.Functions.fromFunc(func9));
    }

    public static <T, R> rx.Observable<R> combineLatest(java.util.List<? extends rx.Observable<? extends T>> list, rx.functions.FuncN<? extends R> funcN) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeCombineLatest(list, funcN));
    }

    public static <T, R> rx.Observable<R> combineLatest(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, rx.functions.FuncN<? extends R> funcN) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeCombineLatest(iterable, funcN));
    }

    public static <T, R> rx.Observable<R> combineLatestDelayError(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, rx.functions.FuncN<? extends R> funcN) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeCombineLatest(null, iterable, funcN, rx.internal.util.RxRingBuffer.SIZE, true));
    }

    public static <T> rx.Observable<T> concat(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return concat(from(iterable));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.concatMap(rx.internal.util.UtilityFunctions.identity());
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return concat(just(observable, observable2));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return concat(just(observable, observable2, observable3));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return concat(just(observable, observable2, observable3, observable4));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return concat(just(observable, observable2, observable3, observable4, observable5));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return concat(just(observable, observable2, observable3, observable4, observable5, observable6));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return concat(just(observable, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return concat(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static <T> rx.Observable<T> concat(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return concat(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.concatMapDelayError(rx.internal.util.UtilityFunctions.identity());
    }

    public static <T> rx.Observable<T> concatDelayError(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return concatDelayError(from(iterable));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return concatDelayError(just(observable, observable2));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return concatDelayError(just(observable, observable2, observable3));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return concatDelayError(just(observable, observable2, observable3, observable4));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return concatDelayError(just(observable, observable2, observable3, observable4, observable5));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return concatDelayError(just(observable, observable2, observable3, observable4, observable5, observable6));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return concatDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return concatDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static <T> rx.Observable<T> concatDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return concatDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9));
    }

    public static <T> rx.Observable<T> defer(rx.functions.Func0<rx.Observable<T>> func0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDefer(func0));
    }

    public static <T> rx.Observable<T> empty() {
        return rx.internal.operators.EmptyObservableHolder.instance();
    }

    public static <T> rx.Observable<T> error(java.lang.Throwable th) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeThrow(th));
    }

    public static <T> rx.Observable<T> from(java.util.concurrent.Future<? extends T> future) {
        return unsafeCreate(rx.internal.operators.OnSubscribeToObservableFuture.toObservableFuture(future));
    }

    public static <T> rx.Observable<T> from(java.util.concurrent.Future<? extends T> future, long j, java.util.concurrent.TimeUnit timeUnit) {
        return unsafeCreate(rx.internal.operators.OnSubscribeToObservableFuture.toObservableFuture(future, j, timeUnit));
    }

    public static <T> rx.Observable<T> from(java.util.concurrent.Future<? extends T> future, rx.Scheduler scheduler) {
        return unsafeCreate(rx.internal.operators.OnSubscribeToObservableFuture.toObservableFuture(future)).subscribeOn(scheduler);
    }

    public static <T> rx.Observable<T> from(java.lang.Iterable<? extends T> iterable) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeFromIterable(iterable));
    }

    public static <T> rx.Observable<T> from(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return just(tArr[0]);
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeFromArray(tArr));
    }

    public static <T> rx.Observable<T> fromCallable(java.util.concurrent.Callable<? extends T> callable) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeFromCallable(callable));
    }

    public static rx.Observable<java.lang.Long> interval(long j, java.util.concurrent.TimeUnit timeUnit) {
        return interval(j, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public static rx.Observable<java.lang.Long> interval(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return interval(j, j, timeUnit, scheduler);
    }

    public static rx.Observable<java.lang.Long> interval(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public static rx.Observable<java.lang.Long> interval(long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeTimerPeriodically(j, j2, timeUnit, scheduler));
    }

    public static <T> rx.Observable<T> just(T t) {
        return rx.internal.util.ScalarSynchronousObservable.create(t);
    }

    public static <T> rx.Observable<T> just(T t, T t2) {
        return from(new java.lang.Object[]{t, t2});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3) {
        return from(new java.lang.Object[]{t, t2, t3});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4) {
        return from(new java.lang.Object[]{t, t2, t3, t4});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5, t6});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5, t6, t7});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5, t6, t7, t8});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9});
    }

    public static <T> rx.Observable<T> just(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9, T t10) {
        return from(new java.lang.Object[]{t, t2, t3, t4, t5, t6, t7, t8, t9, t10});
    }

    public static <T> rx.Observable<T> merge(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return merge(from(iterable));
    }

    public static <T> rx.Observable<T> merge(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, int i) {
        return merge(from(iterable), i);
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        if (observable.getClass() == rx.internal.util.ScalarSynchronousObservable.class) {
            return ((rx.internal.util.ScalarSynchronousObservable) observable).scalarFlatMap(rx.internal.util.UtilityFunctions.identity());
        }
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorMerge.instance(false));
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends rx.Observable<? extends T>> observable, int i) {
        if (observable.getClass() == rx.internal.util.ScalarSynchronousObservable.class) {
            return ((rx.internal.util.ScalarSynchronousObservable) observable).scalarFlatMap(rx.internal.util.UtilityFunctions.identity());
        }
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorMerge.instance(false, i));
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return merge(new rx.Observable[]{observable, observable2});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return merge(new rx.Observable[]{observable, observable2, observable3});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4, observable5});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return merge(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9});
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T>[] observableArr) {
        return merge(from(observableArr));
    }

    public static <T> rx.Observable<T> merge(rx.Observable<? extends T>[] observableArr, int i) {
        return merge(from(observableArr), i);
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorMerge.instance(true));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends rx.Observable<? extends T>> observable, int i) {
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorMerge.instance(true, i));
    }

    public static <T> rx.Observable<T> mergeDelayError(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return mergeDelayError(from(iterable));
    }

    public static <T> rx.Observable<T> mergeDelayError(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, int i) {
        return mergeDelayError(from(iterable), i);
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return mergeDelayError(just(observable, observable2));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return mergeDelayError(just(observable, observable2, observable3));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return mergeDelayError(just(observable, observable2, observable3, observable4));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return mergeDelayError(just(observable, observable2, observable3, observable4, observable5));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return mergeDelayError(just(observable, observable2, observable3, observable4, observable5, observable6));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return mergeDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return mergeDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static <T> rx.Observable<T> mergeDelayError(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return mergeDelayError(just(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9));
    }

    public final rx.Observable<rx.Observable<T>> nest() {
        return just(this);
    }

    public static <T> rx.Observable<T> never() {
        return rx.internal.operators.NeverObservableHolder.instance();
    }

    public static rx.Observable<java.lang.Integer> range(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Count can not be negative");
        }
        if (i2 == 0) {
            return empty();
        }
        if (i > Integer.MIN_VALUE - i2) {
            throw new java.lang.IllegalArgumentException("start + count can not exceed Integer.MAX_VALUE");
        }
        if (i2 == 1) {
            return just(java.lang.Integer.valueOf(i));
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeRange(i, (i2 - 1) + i));
    }

    public static rx.Observable<java.lang.Integer> range(int i, int i2, rx.Scheduler scheduler) {
        return range(i, i2).subscribeOn(scheduler);
    }

    public static <T> rx.Observable<java.lang.Boolean> sequenceEqual(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return sequenceEqual(observable, observable2, rx.internal.util.InternalObservableUtils.OBJECT_EQUALS);
    }

    public static <T> rx.Observable<java.lang.Boolean> sequenceEqual(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.functions.Func2<? super T, ? super T, java.lang.Boolean> func2) {
        return rx.internal.operators.OperatorSequenceEqual.sequenceEqual(observable, observable2, func2);
    }

    public static <T> rx.Observable<T> switchOnNext(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorSwitch.instance(false));
    }

    public static <T> rx.Observable<T> switchOnNextDelayError(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.lift(rx.internal.operators.OperatorSwitch.instance(true));
    }

    @java.lang.Deprecated
    public static rx.Observable<java.lang.Long> timer(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return interval(j, j2, timeUnit, rx.schedulers.Schedulers.computation());
    }

    @java.lang.Deprecated
    public static rx.Observable<java.lang.Long> timer(long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return interval(j, j2, timeUnit, scheduler);
    }

    public static rx.Observable<java.lang.Long> timer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timer(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public static rx.Observable<java.lang.Long> timer(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeTimerOnce(j, timeUnit, scheduler));
    }

    public static <T, Resource> rx.Observable<T> using(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Observable<? extends T>> func1, rx.functions.Action1<? super Resource> action1) {
        return using(func0, func1, action1, false);
    }

    public static <T, Resource> rx.Observable<T> using(rx.functions.Func0<Resource> func0, rx.functions.Func1<? super Resource, ? extends rx.Observable<? extends T>> func1, rx.functions.Action1<? super Resource> action1, boolean z) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeUsing(func0, func1, action1, z));
    }

    public static <R> rx.Observable<R> zip(java.lang.Iterable<? extends rx.Observable<?>> iterable, rx.functions.FuncN<? extends R> funcN) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<? extends rx.Observable<?>> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return just(arrayList.toArray(new rx.Observable[arrayList.size()])).lift(new rx.internal.operators.OperatorZip(funcN));
    }

    public static <R> rx.Observable<R> zip(rx.Observable<?>[] observableArr, rx.functions.FuncN<? extends R> funcN) {
        return just(observableArr).lift(new rx.internal.operators.OperatorZip(funcN));
    }

    public static <R> rx.Observable<R> zip(rx.Observable<? extends rx.Observable<?>> observable, rx.functions.FuncN<? extends R> funcN) {
        return observable.toList().map(rx.internal.util.InternalObservableUtils.TO_ARRAY).lift(new rx.internal.operators.OperatorZip(funcN));
    }

    public static <T1, T2, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.functions.Func2<? super T1, ? super T2, ? extends R> func2) {
        return just(new rx.Observable[]{observable, observable2}).lift(new rx.internal.operators.OperatorZip(func2));
    }

    public static <T1, T2, T3, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.functions.Func3<? super T1, ? super T2, ? super T3, ? extends R> func3) {
        return just(new rx.Observable[]{observable, observable2, observable3}).lift(new rx.internal.operators.OperatorZip(func3));
    }

    public static <T1, T2, T3, T4, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.functions.Func4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func4) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4}).lift(new rx.internal.operators.OperatorZip(func4));
    }

    public static <T1, T2, T3, T4, T5, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.functions.Func5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func5) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4, observable5}).lift(new rx.internal.operators.OperatorZip(func5));
    }

    public static <T1, T2, T3, T4, T5, T6, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.functions.Func6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func6) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6}).lift(new rx.internal.operators.OperatorZip(func6));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.functions.Func7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func7) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7}).lift(new rx.internal.operators.OperatorZip(func7));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.Observable<? extends T8> observable8, rx.functions.Func8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func8) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8}).lift(new rx.internal.operators.OperatorZip(func8));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> rx.Observable<R> zip(rx.Observable<? extends T1> observable, rx.Observable<? extends T2> observable2, rx.Observable<? extends T3> observable3, rx.Observable<? extends T4> observable4, rx.Observable<? extends T5> observable5, rx.Observable<? extends T6> observable6, rx.Observable<? extends T7> observable7, rx.Observable<? extends T8> observable8, rx.Observable<? extends T9> observable9, rx.functions.Func9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func9) {
        return just(new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9}).lift(new rx.internal.operators.OperatorZip(func9));
    }

    public final rx.Observable<java.lang.Boolean> all(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return lift(new rx.internal.operators.OperatorAll(func1));
    }

    public final rx.Observable<T> ambWith(rx.Observable<? extends T> observable) {
        return amb(this, observable);
    }

    public final rx.Observable<T> asObservable() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorAsObservable.instance());
    }

    public final <TClosing> rx.Observable<java.util.List<T>> buffer(rx.functions.Func0<? extends rx.Observable<? extends TClosing>> func0) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithSingleObservable(func0, 16));
    }

    public final rx.Observable<java.util.List<T>> buffer(int i) {
        return buffer(i, i);
    }

    public final rx.Observable<java.util.List<T>> buffer(int i, int i2) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithSize(i, i2));
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return buffer(j, j2, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithTime(j, j2, timeUnit, Integer.MAX_VALUE, scheduler));
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return buffer(j, timeUnit, Integer.MAX_VALUE, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithTime(j, j, timeUnit, i, rx.schedulers.Schedulers.computation()));
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithTime(j, j, timeUnit, i, scheduler));
    }

    public final rx.Observable<java.util.List<T>> buffer(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return buffer(j, j, timeUnit, scheduler);
    }

    public final <TOpening, TClosing> rx.Observable<java.util.List<T>> buffer(rx.Observable<? extends TOpening> observable, rx.functions.Func1<? super TOpening, ? extends rx.Observable<? extends TClosing>> func1) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithStartEndObservable(observable, func1));
    }

    public final <B> rx.Observable<java.util.List<T>> buffer(rx.Observable<B> observable) {
        return buffer(observable, 16);
    }

    public final <B> rx.Observable<java.util.List<T>> buffer(rx.Observable<B> observable, int i) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorBufferWithSingleObservable(observable, i));
    }

    public final rx.Observable<T> cache() {
        return rx.internal.operators.CachedObservable.from(this);
    }

    @java.lang.Deprecated
    public final rx.Observable<T> cache(int i) {
        return cacheWithInitialCapacity(i);
    }

    public final rx.Observable<T> cacheWithInitialCapacity(int i) {
        return rx.internal.operators.CachedObservable.from(this, i);
    }

    public final <R> rx.Observable<R> cast(java.lang.Class<R> cls) {
        return lift(new rx.internal.operators.OperatorCast(cls));
    }

    public final <R> rx.Observable<R> collect(rx.functions.Func0<R> func0, rx.functions.Action2<R, ? super T> action2) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeCollect(this, func0, action2));
    }

    public final <R> rx.Observable<R> concatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        if (this instanceof rx.internal.util.ScalarSynchronousObservable) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarFlatMap(func1);
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeConcatMap(this, func1, 2, 0));
    }

    public final <R> rx.Observable<R> concatMapDelayError(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        if (this instanceof rx.internal.util.ScalarSynchronousObservable) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarFlatMap(func1);
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeConcatMap(this, func1, 2, 2));
    }

    public final <R> rx.Observable<R> concatMapIterable(rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1) {
        return rx.internal.operators.OnSubscribeFlattenIterable.createFrom(this, func1, rx.internal.util.RxRingBuffer.SIZE);
    }

    public final rx.Observable<T> concatWith(rx.Observable<? extends T> observable) {
        return concat(this, observable);
    }

    public final rx.Observable<java.lang.Boolean> contains(java.lang.Object obj) {
        return exists(rx.internal.util.InternalObservableUtils.equalsWith(obj));
    }

    public final rx.Observable<java.lang.Integer> count() {
        return reduce(0, rx.internal.util.InternalObservableUtils.COUNTER);
    }

    public final rx.Observable<java.lang.Long> countLong() {
        return reduce(0L, rx.internal.util.InternalObservableUtils.LONG_COUNTER);
    }

    public final <U> rx.Observable<T> debounce(rx.functions.Func1<? super T, ? extends rx.Observable<U>> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDebounceWithSelector(func1));
    }

    public final rx.Observable<T> debounce(long j, java.util.concurrent.TimeUnit timeUnit) {
        return debounce(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> debounce(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDebounceWithTime(j, timeUnit, scheduler));
    }

    public final rx.Observable<T> defaultIfEmpty(T t) {
        return switchIfEmpty(just(t));
    }

    public final rx.Observable<T> switchIfEmpty(rx.Observable<? extends T> observable) {
        if (observable == null) {
            throw new java.lang.NullPointerException("alternate is null");
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeSwitchIfEmpty(this, observable));
    }

    public final <U, V> rx.Observable<T> delay(rx.functions.Func0<? extends rx.Observable<U>> func0, rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1) {
        return (rx.Observable<T>) delaySubscription(func0).lift(new rx.internal.operators.OperatorDelayWithSelector(this, func1));
    }

    public final <U> rx.Observable<T> delay(rx.functions.Func1<? super T, ? extends rx.Observable<U>> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDelayWithSelector(this, func1));
    }

    public final rx.Observable<T> delay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delay(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> delay(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDelay(j, timeUnit, scheduler));
    }

    public final rx.Observable<T> delaySubscription(long j, java.util.concurrent.TimeUnit timeUnit) {
        return delaySubscription(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> delaySubscription(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDelaySubscription(this, j, timeUnit, scheduler));
    }

    public final <U> rx.Observable<T> delaySubscription(rx.functions.Func0<? extends rx.Observable<U>> func0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector(this, func0));
    }

    public final <U> rx.Observable<T> delaySubscription(rx.Observable<U> observable) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDelaySubscriptionOther(this, observable));
    }

    public final <T2> rx.Observable<T2> dematerialize() {
        return (rx.Observable<T2>) lift(rx.internal.operators.OperatorDematerialize.instance());
    }

    public final rx.Observable<T> distinct() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorDistinct.instance());
    }

    public final <U> rx.Observable<T> distinct(rx.functions.Func1<? super T, ? extends U> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDistinct(func1));
    }

    public final rx.Observable<T> distinctUntilChanged() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorDistinctUntilChanged.instance());
    }

    public final <U> rx.Observable<T> distinctUntilChanged(rx.functions.Func1<? super T, ? extends U> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDistinctUntilChanged(func1));
    }

    public final rx.Observable<T> distinctUntilChanged(rx.functions.Func2<? super T, ? super T, java.lang.Boolean> func2) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDistinctUntilChanged(func2));
    }

    public final rx.Observable<T> doOnCompleted(rx.functions.Action0 action0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, new rx.internal.util.ActionObserver(rx.functions.Actions.empty(), rx.functions.Actions.empty(), action0)));
    }

    public final rx.Observable<T> doOnEach(rx.functions.Action1<rx.Notification<? super T>> action1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, new rx.internal.util.ActionNotificationObserver(action1)));
    }

    public final rx.Observable<T> doOnEach(rx.Observer<? super T> observer) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, observer));
    }

    public final rx.Observable<T> doOnError(rx.functions.Action1<? super java.lang.Throwable> action1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, new rx.internal.util.ActionObserver(rx.functions.Actions.empty(), action1, rx.functions.Actions.empty())));
    }

    public final rx.Observable<T> doOnNext(rx.functions.Action1<? super T> action1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, new rx.internal.util.ActionObserver(action1, rx.functions.Actions.empty(), rx.functions.Actions.empty())));
    }

    public final rx.Observable<T> doOnRequest(rx.functions.Action1<? super java.lang.Long> action1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDoOnRequest(action1));
    }

    public final rx.Observable<T> doOnSubscribe(rx.functions.Action0 action0) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDoOnSubscribe(action0));
    }

    public final rx.Observable<T> doOnTerminate(rx.functions.Action0 action0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDoOnEach(this, new rx.internal.util.ActionObserver(rx.functions.Actions.empty(), rx.functions.Actions.toAction1(action0), action0)));
    }

    public final rx.Observable<T> doOnUnsubscribe(rx.functions.Action0 action0) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDoOnUnsubscribe(action0));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2) {
        return concatEager(java.util.Arrays.asList(observable, observable2));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8));
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends T> observable, rx.Observable<? extends T> observable2, rx.Observable<? extends T> observable3, rx.Observable<? extends T> observable4, rx.Observable<? extends T> observable5, rx.Observable<? extends T> observable6, rx.Observable<? extends T> observable7, rx.Observable<? extends T> observable8, rx.Observable<? extends T> observable9) {
        return concatEager(java.util.Arrays.asList(observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8, observable9));
    }

    public static <T> rx.Observable<T> concatEager(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable) {
        return from(iterable).concatMapEager(rx.internal.util.UtilityFunctions.identity());
    }

    public static <T> rx.Observable<T> concatEager(java.lang.Iterable<? extends rx.Observable<? extends T>> iterable, int i) {
        return from(iterable).concatMapEager(rx.internal.util.UtilityFunctions.identity(), i);
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends rx.Observable<? extends T>> observable) {
        return (rx.Observable<T>) observable.concatMapEager(rx.internal.util.UtilityFunctions.identity());
    }

    public static <T> rx.Observable<T> concatEager(rx.Observable<? extends rx.Observable<? extends T>> observable, int i) {
        return (rx.Observable<T>) observable.concatMapEager(rx.internal.util.UtilityFunctions.identity(), i);
    }

    public final <R> rx.Observable<R> concatMapEager(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        return concatMapEager(func1, rx.internal.util.RxRingBuffer.SIZE);
    }

    public final <R> rx.Observable<R> concatMapEager(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("capacityHint > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return lift(new rx.internal.operators.OperatorEagerConcatMap(func1, i, Integer.MAX_VALUE));
    }

    public final <R> rx.Observable<R> concatMapEager(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i, int i2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("capacityHint > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("maxConcurrent > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return lift(new rx.internal.operators.OperatorEagerConcatMap(func1, i, i2));
    }

    public final rx.Observable<T> elementAt(int i) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorElementAt(i));
    }

    public final rx.Observable<T> elementAtOrDefault(int i, T t) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorElementAt(i, t));
    }

    public final rx.Observable<java.lang.Boolean> exists(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return lift(new rx.internal.operators.OperatorAny(func1, false));
    }

    public final rx.Observable<T> filter(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeFilter(this, func1));
    }

    @java.lang.Deprecated
    public final rx.Observable<T> finallyDo(rx.functions.Action0 action0) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDoAfterTerminate(action0));
    }

    public final rx.Observable<T> doAfterTerminate(rx.functions.Action0 action0) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorDoAfterTerminate(action0));
    }

    public final rx.Observable<T> first() {
        return take(1).single();
    }

    public final rx.Observable<T> first(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return takeFirst(func1).single();
    }

    public final rx.Observable<T> firstOrDefault(T t) {
        return take(1).singleOrDefault(t);
    }

    public final rx.Observable<T> firstOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return takeFirst(func1).singleOrDefault(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        if (getClass() == rx.internal.util.ScalarSynchronousObservable.class) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarFlatMap(func1);
        }
        return merge(map(func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, int i) {
        if (getClass() == rx.internal.util.ScalarSynchronousObservable.class) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarFlatMap(func1);
        }
        return merge(map(func1), i);
    }

    public final <U, R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
        return merge(lift(new rx.internal.operators.OperatorMapPair(func1, func2)));
    }

    public final <U, R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2, int i) {
        return merge(lift(new rx.internal.operators.OperatorMapPair(func1, func2)), i);
    }

    public final rx.Observable<T> flatMapCompletable(rx.functions.Func1<? super T, ? extends rx.Completable> func1) {
        return flatMapCompletable(func1, false, Integer.MAX_VALUE);
    }

    public final rx.Observable<T> flatMapCompletable(rx.functions.Func1<? super T, ? extends rx.Completable> func1, boolean z) {
        return flatMapCompletable(func1, z, Integer.MAX_VALUE);
    }

    public final rx.Observable<T> flatMapCompletable(rx.functions.Func1<? super T, ? extends rx.Completable> func1, boolean z, int i) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeFlatMapCompletable(this, func1, z, i));
    }

    public final <R> rx.Observable<R> flatMapIterable(rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1) {
        return flatMapIterable(func1, rx.internal.util.RxRingBuffer.SIZE);
    }

    public final <R> rx.Observable<R> flatMapIterable(rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends R>> func1, int i) {
        return rx.internal.operators.OnSubscribeFlattenIterable.createFrom(this, func1, i);
    }

    public final <U, R> rx.Observable<R> flatMapIterable(rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
        return flatMap(rx.internal.operators.OperatorMapPair.convertSelector(func1), func2);
    }

    public final <U, R> rx.Observable<R> flatMapIterable(rx.functions.Func1<? super T, ? extends java.lang.Iterable<? extends U>> func1, rx.functions.Func2<? super T, ? super U, ? extends R> func2, int i) {
        return flatMap(rx.internal.operators.OperatorMapPair.convertSelector(func1), func2, i);
    }

    public final <R> rx.Observable<R> flatMapSingle(rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1) {
        return flatMapSingle(func1, false, Integer.MAX_VALUE);
    }

    public final <R> rx.Observable<R> flatMapSingle(rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1, boolean z) {
        return flatMapSingle(func1, z, Integer.MAX_VALUE);
    }

    public final <R> rx.Observable<R> flatMapSingle(rx.functions.Func1<? super T, ? extends rx.Single<? extends R>> func1, boolean z, int i) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeFlatMapSingle(this, func1, z, i));
    }

    public final void forEach(rx.functions.Action1<? super T> action1) {
        subscribe(action1);
    }

    public final void forEach(rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12) {
        subscribe(action1, action12);
    }

    public final void forEach(rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12, rx.functions.Action0 action0) {
        subscribe(action1, action12, action0);
    }

    public final <K, R> rx.Observable<rx.observables.GroupedObservable<K, R>> groupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends R> func12) {
        return lift(new rx.internal.operators.OperatorGroupByEvicting(func1, func12));
    }

    @java.lang.Deprecated
    public final <K, R> rx.Observable<rx.observables.GroupedObservable<K, R>> groupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends R> func12, rx.functions.Func1<rx.functions.Action1<K>, java.util.Map<K, java.lang.Object>> func13) {
        if (func13 == null) {
            throw new java.lang.NullPointerException("evictingMapFactory cannot be null");
        }
        return lift(new rx.internal.operators.OperatorGroupBy(func1, func12, func13));
    }

    public final <K, R> rx.Observable<rx.observables.GroupedObservable<K, R>> groupBy(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends R> func12, int i, boolean z, rx.functions.Func1<rx.functions.Action1<java.lang.Object>, java.util.Map<K, java.lang.Object>> func13) {
        if (func13 == null) {
            throw new java.lang.NullPointerException("evictingMapFactory cannot be null");
        }
        return lift(new rx.internal.operators.OperatorGroupByEvicting(func1, func12, i, z, func13));
    }

    public final <K> rx.Observable<rx.observables.GroupedObservable<K, T>> groupBy(rx.functions.Func1<? super T, ? extends K> func1) {
        return (rx.Observable<rx.observables.GroupedObservable<K, T>>) lift(new rx.internal.operators.OperatorGroupByEvicting(func1));
    }

    public final <T2, D1, D2, R> rx.Observable<R> groupJoin(rx.Observable<T2> observable, rx.functions.Func1<? super T, ? extends rx.Observable<D1>> func1, rx.functions.Func1<? super T2, ? extends rx.Observable<D2>> func12, rx.functions.Func2<? super T, ? super rx.Observable<T2>, ? extends R> func2) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeGroupJoin(this, observable, func1, func12, func2));
    }

    public final rx.Observable<T> ignoreElements() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorIgnoreElements.instance());
    }

    public final rx.Observable<java.lang.Boolean> isEmpty() {
        return lift(rx.internal.util.InternalObservableUtils.IS_EMPTY);
    }

    public final <TRight, TLeftDuration, TRightDuration, R> rx.Observable<R> join(rx.Observable<TRight> observable, rx.functions.Func1<T, rx.Observable<TLeftDuration>> func1, rx.functions.Func1<TRight, rx.Observable<TRightDuration>> func12, rx.functions.Func2<T, TRight, R> func2) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeJoin(this, observable, func1, func12, func2));
    }

    public final rx.Observable<T> last() {
        return takeLast(1).single();
    }

    public final rx.Observable<T> last(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return filter(func1).takeLast(1).single();
    }

    public final rx.Observable<T> lastOrDefault(T t) {
        return takeLast(1).singleOrDefault(t);
    }

    public final rx.Observable<T> lastOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return filter(func1).takeLast(1).singleOrDefault(t);
    }

    public final rx.Observable<T> limit(int i) {
        return take(i);
    }

    public final <R> rx.Observable<R> map(rx.functions.Func1<? super T, ? extends R> func1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeMap(this, func1));
    }

    public final rx.Observable<rx.Notification<T>> materialize() {
        return (rx.Observable<rx.Notification<T>>) lift(rx.internal.operators.OperatorMaterialize.instance());
    }

    public final rx.Observable<T> mergeWith(rx.Observable<? extends T> observable) {
        return merge(this, observable);
    }

    public final rx.Observable<T> observeOn(rx.Scheduler scheduler) {
        return observeOn(scheduler, rx.internal.util.RxRingBuffer.SIZE);
    }

    public final rx.Observable<T> observeOn(rx.Scheduler scheduler, int i) {
        return observeOn(scheduler, false, i);
    }

    public final rx.Observable<T> observeOn(rx.Scheduler scheduler, boolean z) {
        return observeOn(scheduler, z, rx.internal.util.RxRingBuffer.SIZE);
    }

    public final rx.Observable<T> observeOn(rx.Scheduler scheduler, boolean z, int i) {
        if (this instanceof rx.internal.util.ScalarSynchronousObservable) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarScheduleOn(scheduler);
        }
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorObserveOn(scheduler, z, i));
    }

    public final <R> rx.Observable<R> ofType(java.lang.Class<R> cls) {
        return filter(rx.internal.util.InternalObservableUtils.isInstanceOf(cls)).cast(cls);
    }

    public final rx.Observable<T> onBackpressureBuffer() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnBackpressureBuffer.instance());
    }

    public final rx.Observable<T> onBackpressureBuffer(long j) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorOnBackpressureBuffer(j));
    }

    public final rx.Observable<T> onBackpressureBuffer(long j, rx.functions.Action0 action0) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorOnBackpressureBuffer(j, action0));
    }

    public final rx.Observable<T> onBackpressureBuffer(long j, rx.functions.Action0 action0, rx.BackpressureOverflow.Strategy strategy) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorOnBackpressureBuffer(j, action0, strategy));
    }

    public final rx.Observable<T> onBackpressureDrop(rx.functions.Action1<? super T> action1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorOnBackpressureDrop(action1));
    }

    public final rx.Observable<T> onBackpressureDrop() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnBackpressureDrop.instance());
    }

    public final rx.Observable<T> onBackpressureLatest() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnBackpressureLatest.instance());
    }

    public final rx.Observable<T> onErrorResumeNext(rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Observable<? extends T>> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorOnErrorResumeNextViaFunction(func1));
    }

    public final rx.Observable<T> onErrorResumeNext(rx.Observable<? extends T> observable) {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnErrorResumeNextViaFunction.withOther(observable));
    }

    public final rx.Observable<T> onErrorReturn(rx.functions.Func1<? super java.lang.Throwable, ? extends T> func1) {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnErrorResumeNextViaFunction.withSingle(func1));
    }

    public final rx.Observable<T> onExceptionResumeNext(rx.Observable<? extends T> observable) {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorOnErrorResumeNextViaFunction.withException(observable));
    }

    public final rx.Observable<T> onTerminateDetach() {
        return unsafeCreate(new rx.internal.operators.OnSubscribeDetach(this));
    }

    public final rx.observables.ConnectableObservable<T> publish() {
        return rx.internal.operators.OperatorPublish.create(this);
    }

    public final <R> rx.Observable<R> publish(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1) {
        return rx.internal.operators.OperatorPublish.create(this, func1);
    }

    public final rx.Observable<T> rebatchRequests(int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("n > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorObserveOn.rebatch(i));
    }

    public final rx.Observable<T> reduce(rx.functions.Func2<T, T, T> func2) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeReduce(this, func2));
    }

    public final <R> rx.Observable<R> reduce(R r, rx.functions.Func2<R, ? super T, R> func2) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeReduceSeed(this, r, func2));
    }

    public final rx.Observable<T> repeat() {
        return rx.internal.operators.OnSubscribeRedo.repeat(this);
    }

    public final rx.Observable<T> repeat(rx.Scheduler scheduler) {
        return rx.internal.operators.OnSubscribeRedo.repeat(this, scheduler);
    }

    public final rx.Observable<T> repeat(long j) {
        return rx.internal.operators.OnSubscribeRedo.repeat(this, j);
    }

    public final rx.Observable<T> repeat(long j, rx.Scheduler scheduler) {
        return rx.internal.operators.OnSubscribeRedo.repeat(this, j, scheduler);
    }

    public final rx.Observable<T> repeatWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> func1, rx.Scheduler scheduler) {
        return rx.internal.operators.OnSubscribeRedo.repeat(this, rx.internal.util.InternalObservableUtils.createRepeatDematerializer(func1), scheduler);
    }

    public final rx.Observable<T> repeatWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> func1) {
        return rx.internal.operators.OnSubscribeRedo.repeat(this, rx.internal.util.InternalObservableUtils.createRepeatDematerializer(func1));
    }

    public final rx.observables.ConnectableObservable<T> replay() {
        return rx.internal.operators.OperatorReplay.create(this);
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1) {
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this), func1);
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, int i) {
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this, i), func1);
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(func1, i, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize < 0");
        }
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this, i, j, timeUnit, scheduler), func1);
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, int i, rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this, i), rx.internal.util.InternalObservableUtils.createReplaySelectorAndObserveOn(func1, scheduler));
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(func1, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this, j, timeUnit, scheduler), func1);
    }

    public final <R> rx.Observable<R> replay(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.multicastSelector(rx.internal.util.InternalObservableUtils.createReplaySupplier(this), rx.internal.util.InternalObservableUtils.createReplaySelectorAndObserveOn(func1, scheduler));
    }

    public final rx.observables.ConnectableObservable<T> replay(int i) {
        return rx.internal.operators.OperatorReplay.create(this, i);
    }

    public final rx.observables.ConnectableObservable<T> replay(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(i, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.observables.ConnectableObservable<T> replay(int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize < 0");
        }
        return rx.internal.operators.OperatorReplay.create(this, j, timeUnit, scheduler, i);
    }

    public final rx.observables.ConnectableObservable<T> replay(int i, rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.observeOn(replay(i), scheduler);
    }

    public final rx.observables.ConnectableObservable<T> replay(long j, java.util.concurrent.TimeUnit timeUnit) {
        return replay(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.observables.ConnectableObservable<T> replay(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.create(this, j, timeUnit, scheduler);
    }

    public final rx.observables.ConnectableObservable<T> replay(rx.Scheduler scheduler) {
        return rx.internal.operators.OperatorReplay.observeOn(replay(), scheduler);
    }

    public final rx.Observable<T> retry() {
        return rx.internal.operators.OnSubscribeRedo.retry(this);
    }

    public final rx.Observable<T> retry(long j) {
        return rx.internal.operators.OnSubscribeRedo.retry(this, j);
    }

    public final rx.Observable<T> retry(rx.functions.Func2<java.lang.Integer, java.lang.Throwable, java.lang.Boolean> func2) {
        return (rx.Observable<T>) nest().lift(new rx.internal.operators.OperatorRetryWithPredicate(func2));
    }

    public final rx.Observable<T> retryWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1) {
        return rx.internal.operators.OnSubscribeRedo.retry(this, rx.internal.util.InternalObservableUtils.createRetryDematerializer(func1));
    }

    public final rx.Observable<T> retryWhen(rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1, rx.Scheduler scheduler) {
        return rx.internal.operators.OnSubscribeRedo.retry(this, rx.internal.util.InternalObservableUtils.createRetryDematerializer(func1), scheduler);
    }

    public final rx.Observable<T> sample(long j, java.util.concurrent.TimeUnit timeUnit) {
        return sample(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> sample(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSampleWithTime(j, timeUnit, scheduler));
    }

    public final <U> rx.Observable<T> sample(rx.Observable<U> observable) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSampleWithObservable(observable));
    }

    public final rx.Observable<T> scan(rx.functions.Func2<T, T, T> func2) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorScan(func2));
    }

    public final <R> rx.Observable<R> scan(R r, rx.functions.Func2<R, ? super T, R> func2) {
        return lift(new rx.internal.operators.OperatorScan(r, func2));
    }

    public final rx.Observable<T> serialize() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorSerialize.instance());
    }

    public final rx.Observable<T> share() {
        return publish().refCount();
    }

    public final rx.Observable<T> single() {
        return (rx.Observable<T>) lift(rx.internal.operators.OperatorSingle.instance());
    }

    public final rx.Observable<T> single(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return filter(func1).single();
    }

    public final rx.Observable<T> singleOrDefault(T t) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSingle(t));
    }

    public final rx.Observable<T> singleOrDefault(T t, rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return filter(func1).singleOrDefault(t);
    }

    public final rx.Observable<T> skip(int i) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSkip(i));
    }

    public final rx.Observable<T> skip(long j, java.util.concurrent.TimeUnit timeUnit) {
        return skip(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> skip(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeSkipTimed(this, j, timeUnit, scheduler));
    }

    public final rx.Observable<T> skipLast(int i) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSkipLast(i));
    }

    public final rx.Observable<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return skipLast(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> skipLast(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSkipLastTimed(j, timeUnit, scheduler));
    }

    public final <U> rx.Observable<T> skipUntil(rx.Observable<U> observable) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSkipUntil(observable));
    }

    public final rx.Observable<T> skipWhile(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorSkipWhile(rx.internal.operators.OperatorSkipWhile.toPredicate2(func1)));
    }

    public final rx.Observable<T> startWith(rx.Observable<T> observable) {
        return concat(observable, this);
    }

    public final rx.Observable<T> startWith(java.lang.Iterable<T> iterable) {
        return concat(from(iterable), this);
    }

    public final rx.Observable<T> startWith(T t) {
        return concat(just(t), this);
    }

    public final rx.Observable<T> startWith(T t, T t2) {
        return concat(just(t, t2), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3) {
        return concat(just(t, t2, t3), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4) {
        return concat(just(t, t2, t3, t4), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4, T t5) {
        return concat(just(t, t2, t3, t4, t5), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4, T t5, T t6) {
        return concat(just(t, t2, t3, t4, t5, t6), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7) {
        return concat(just(t, t2, t3, t4, t5, t6, t7), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8), this);
    }

    public final rx.Observable<T> startWith(T t, T t2, T t3, T t4, T t5, T t6, T t7, T t8, T t9) {
        return concat(just(t, t2, t3, t4, t5, t6, t7, t8, t9), this);
    }

    public final rx.Subscription subscribe() {
        return subscribe((rx.Subscriber) new rx.internal.util.ActionSubscriber(rx.functions.Actions.empty(), rx.internal.util.InternalObservableUtils.ERROR_NOT_IMPLEMENTED, rx.functions.Actions.empty()));
    }

    public final rx.Subscription subscribe(rx.functions.Action1<? super T> action1) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        return subscribe((rx.Subscriber) new rx.internal.util.ActionSubscriber(action1, rx.internal.util.InternalObservableUtils.ERROR_NOT_IMPLEMENTED, rx.functions.Actions.empty()));
    }

    public final rx.Subscription subscribe(rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        return subscribe((rx.Subscriber) new rx.internal.util.ActionSubscriber(action1, action12, rx.functions.Actions.empty()));
    }

    public final rx.Subscription subscribe(rx.functions.Action1<? super T> action1, rx.functions.Action1<java.lang.Throwable> action12, rx.functions.Action0 action0) {
        if (action1 == null) {
            throw new java.lang.IllegalArgumentException("onNext can not be null");
        }
        if (action12 == null) {
            throw new java.lang.IllegalArgumentException("onError can not be null");
        }
        if (action0 == null) {
            throw new java.lang.IllegalArgumentException("onComplete can not be null");
        }
        return subscribe((rx.Subscriber) new rx.internal.util.ActionSubscriber(action1, action12, action0));
    }

    public final rx.Subscription subscribe(rx.Observer<? super T> observer) {
        if (observer instanceof rx.Subscriber) {
            return subscribe((rx.Subscriber) observer);
        }
        if (observer == null) {
            throw new java.lang.NullPointerException("observer is null");
        }
        return subscribe((rx.Subscriber) new rx.internal.util.ObserverSubscriber(observer));
    }

    public final rx.Subscription unsafeSubscribe(rx.Subscriber<? super T> subscriber) {
        try {
            subscriber.onStart();
            rx.plugins.RxJavaHooks.onObservableStart(this, this.getHighSpeedVideoSizes).call(subscriber);
            return rx.plugins.RxJavaHooks.onObservableReturn(subscriber);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            try {
                subscriber.onError(rx.plugins.RxJavaHooks.onObservableError(th));
                return rx.subscriptions.Subscriptions.unsubscribed();
            } catch (java.lang.Throwable th2) {
                rx.exceptions.Exceptions.throwIfFatal(th2);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error occurred attempting to subscribe [");
                sb.append(th.getMessage());
                sb.append("] and then again while trying to pass to onError.");
                rx.exceptions.OnErrorFailedException onErrorFailedException = new rx.exceptions.OnErrorFailedException(sb.toString(), th2);
                rx.plugins.RxJavaHooks.onObservableError(onErrorFailedException);
                throw onErrorFailedException;
            }
        }
    }

    public final rx.Subscription subscribe(rx.Subscriber<? super T> subscriber) {
        return getHighSpeedVideoFpsRangesFor(subscriber, this);
    }

    private static <T> rx.Subscription getHighSpeedVideoFpsRangesFor(rx.Subscriber<? super T> subscriber, rx.Observable<T> observable) {
        if (subscriber == null) {
            throw new java.lang.IllegalArgumentException("subscriber can not be null");
        }
        if (observable.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("onSubscribe function can not be null.");
        }
        subscriber.onStart();
        if (!(subscriber instanceof rx.observers.SafeSubscriber)) {
            subscriber = new rx.observers.SafeSubscriber(subscriber);
        }
        try {
            rx.plugins.RxJavaHooks.onObservableStart(observable, observable.getHighSpeedVideoSizes).call(subscriber);
            return rx.plugins.RxJavaHooks.onObservableReturn(subscriber);
        } catch (java.lang.Throwable th) {
            rx.exceptions.Exceptions.throwIfFatal(th);
            if (subscriber.isUnsubscribed()) {
                rx.plugins.RxJavaHooks.onError(rx.plugins.RxJavaHooks.onObservableError(th));
            } else {
                try {
                    subscriber.onError(rx.plugins.RxJavaHooks.onObservableError(th));
                } catch (java.lang.Throwable th2) {
                    rx.exceptions.Exceptions.throwIfFatal(th2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error occurred attempting to subscribe [");
                    sb.append(th.getMessage());
                    sb.append("] and then again while trying to pass to onError.");
                    rx.exceptions.OnErrorFailedException onErrorFailedException = new rx.exceptions.OnErrorFailedException(sb.toString(), th2);
                    rx.plugins.RxJavaHooks.onObservableError(onErrorFailedException);
                    throw onErrorFailedException;
                }
            }
            return rx.subscriptions.Subscriptions.unsubscribed();
        }
    }

    public final rx.Observable<T> subscribeOn(rx.Scheduler scheduler) {
        return subscribeOn(scheduler, !(this.getHighSpeedVideoSizes instanceof rx.internal.operators.OnSubscribeCreate));
    }

    public final rx.Observable<T> subscribeOn(rx.Scheduler scheduler, boolean z) {
        if (this instanceof rx.internal.util.ScalarSynchronousObservable) {
            return ((rx.internal.util.ScalarSynchronousObservable) this).scalarScheduleOn(scheduler);
        }
        return unsafeCreate(new rx.internal.operators.OperatorSubscribeOn(this, scheduler, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Observable<R> switchMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        return switchOnNext(map(func1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> rx.Observable<R> switchMapDelayError(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1) {
        return switchOnNextDelayError(map(func1));
    }

    public final rx.Observable<T> take(int i) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTake(i));
    }

    public final rx.Observable<T> take(long j, java.util.concurrent.TimeUnit timeUnit) {
        return take(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> take(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeTimed(j, timeUnit, scheduler));
    }

    public final rx.Observable<T> takeFirst(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return filter(func1).take(1);
    }

    public final rx.Observable<T> takeLast(int i) {
        if (i == 0) {
            return ignoreElements();
        }
        if (i == 1) {
            return unsafeCreate(new rx.internal.operators.OnSubscribeTakeLastOne(this));
        }
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeLast(i));
    }

    public final rx.Observable<T> takeLast(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> takeLast(int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeLastTimed(i, j, timeUnit, scheduler));
    }

    public final rx.Observable<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> takeLast(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeLastTimed(j, timeUnit, scheduler));
    }

    public final rx.Observable<java.util.List<T>> takeLastBuffer(int i) {
        return takeLast(i).toList();
    }

    public final rx.Observable<java.util.List<T>> takeLastBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(i, j, timeUnit).toList();
    }

    public final rx.Observable<java.util.List<T>> takeLastBuffer(int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return takeLast(i, j, timeUnit, scheduler).toList();
    }

    public final rx.Observable<java.util.List<T>> takeLastBuffer(long j, java.util.concurrent.TimeUnit timeUnit) {
        return takeLast(j, timeUnit).toList();
    }

    public final rx.Observable<java.util.List<T>> takeLastBuffer(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return takeLast(j, timeUnit, scheduler).toList();
    }

    public final <E> rx.Observable<T> takeUntil(rx.Observable<? extends E> observable) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeUntil(observable));
    }

    public final rx.Observable<T> takeWhile(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeWhile(func1));
    }

    public final rx.Observable<T> takeUntil(rx.functions.Func1<? super T, java.lang.Boolean> func1) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorTakeUntilPredicate(func1));
    }

    public final rx.Observable<T> throttleFirst(long j, java.util.concurrent.TimeUnit timeUnit) {
        return throttleFirst(j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> throttleFirst(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorThrottleFirst(j, timeUnit, scheduler));
    }

    public final rx.Observable<T> throttleLast(long j, java.util.concurrent.TimeUnit timeUnit) {
        return sample(j, timeUnit);
    }

    public final rx.Observable<T> throttleLast(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return sample(j, timeUnit, scheduler);
    }

    public final rx.Observable<T> throttleWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return debounce(j, timeUnit);
    }

    public final rx.Observable<T> throttleWithTimeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return debounce(j, timeUnit, scheduler);
    }

    public final rx.Observable<rx.schedulers.TimeInterval<T>> timeInterval() {
        return timeInterval(rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<rx.schedulers.TimeInterval<T>> timeInterval(rx.Scheduler scheduler) {
        return (rx.Observable<rx.schedulers.TimeInterval<T>>) lift(new rx.internal.operators.OperatorTimeInterval(scheduler));
    }

    public final <U, V> rx.Observable<T> timeout(rx.functions.Func0<? extends rx.Observable<U>> func0, rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1) {
        return timeout(func0, func1, (rx.Observable) null);
    }

    public final <U, V> rx.Observable<T> timeout(rx.functions.Func0<? extends rx.Observable<U>> func0, rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1, rx.Observable<? extends T> observable) {
        if (func1 == null) {
            throw new java.lang.NullPointerException("timeoutSelector is null");
        }
        return unsafeCreate(new rx.internal.operators.OnSubscribeTimeoutSelectorWithFallback(this, func0 != null ? defer(func0) : null, func1, observable));
    }

    public final <V> rx.Observable<T> timeout(rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1) {
        return timeout((rx.functions.Func0) null, func1, (rx.Observable) null);
    }

    public final <V> rx.Observable<T> timeout(rx.functions.Func1<? super T, ? extends rx.Observable<V>> func1, rx.Observable<? extends T> observable) {
        return timeout((rx.functions.Func0) null, func1, observable);
    }

    public final rx.Observable<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit) {
        return timeout(j, timeUnit, null, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Observable<? extends T> observable) {
        return timeout(j, timeUnit, observable, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Observable<? extends T> observable, rx.Scheduler scheduler) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeTimeoutTimedWithFallback(this, j, timeUnit, scheduler, observable));
    }

    public final rx.Observable<T> timeout(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return timeout(j, timeUnit, null, scheduler);
    }

    public final rx.Observable<rx.schedulers.Timestamped<T>> timestamp() {
        return timestamp(rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<rx.schedulers.Timestamped<T>> timestamp(rx.Scheduler scheduler) {
        return (rx.Observable<rx.schedulers.Timestamped<T>>) lift(new rx.internal.operators.OperatorTimestamp(scheduler));
    }

    public final rx.observables.BlockingObservable<T> toBlocking() {
        return rx.observables.BlockingObservable.from(this);
    }

    public final rx.Observable<java.util.List<T>> toList() {
        return (rx.Observable<java.util.List<T>>) lift(rx.internal.operators.OperatorToObservableList.instance());
    }

    public final <K> rx.Observable<java.util.Map<K, T>> toMap(rx.functions.Func1<? super T, ? extends K> func1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMap(this, func1, rx.internal.util.UtilityFunctions.identity()));
    }

    public final <K, V> rx.Observable<java.util.Map<K, V>> toMap(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMap(this, func1, func12));
    }

    public final <K, V> rx.Observable<java.util.Map<K, V>> toMap(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, V>> func0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMap(this, func1, func12, func0));
    }

    public final <K> rx.Observable<java.util.Map<K, java.util.Collection<T>>> toMultimap(rx.functions.Func1<? super T, ? extends K> func1) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMultimap(this, func1, rx.internal.util.UtilityFunctions.identity()));
    }

    public final <K, V> rx.Observable<java.util.Map<K, java.util.Collection<V>>> toMultimap(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMultimap(this, func1, func12));
    }

    public final <K, V> rx.Observable<java.util.Map<K, java.util.Collection<V>>> toMultimap(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, java.util.Collection<V>>> func0) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMultimap(this, func1, func12, func0));
    }

    public final <K, V> rx.Observable<java.util.Map<K, java.util.Collection<V>>> toMultimap(rx.functions.Func1<? super T, ? extends K> func1, rx.functions.Func1<? super T, ? extends V> func12, rx.functions.Func0<? extends java.util.Map<K, java.util.Collection<V>>> func0, rx.functions.Func1<? super K, ? extends java.util.Collection<V>> func13) {
        return unsafeCreate(new rx.internal.operators.OnSubscribeToMultimap(this, func1, func12, func0, func13));
    }

    public final rx.Observable<java.util.List<T>> toSortedList() {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorToObservableSortedList(10));
    }

    public final rx.Observable<java.util.List<T>> toSortedList(rx.functions.Func2<? super T, ? super T, java.lang.Integer> func2) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorToObservableSortedList(func2, 10));
    }

    public final rx.Observable<java.util.List<T>> toSortedList(int i) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorToObservableSortedList(i));
    }

    public final rx.Observable<java.util.List<T>> toSortedList(rx.functions.Func2<? super T, ? super T, java.lang.Integer> func2, int i) {
        return (rx.Observable<java.util.List<T>>) lift(new rx.internal.operators.OperatorToObservableSortedList(func2, i));
    }

    public final rx.Observable<T> sorted() {
        return (rx.Observable<T>) toSortedList().flatMapIterable(rx.internal.util.UtilityFunctions.identity());
    }

    public final rx.Observable<T> sorted(rx.functions.Func2<? super T, ? super T, java.lang.Integer> func2) {
        return (rx.Observable<T>) toSortedList(func2).flatMapIterable(rx.internal.util.UtilityFunctions.identity());
    }

    public final rx.Observable<T> unsubscribeOn(rx.Scheduler scheduler) {
        return (rx.Observable<T>) lift(new rx.internal.operators.OperatorUnsubscribeOn(scheduler));
    }

    public final <U, R> rx.Observable<R> withLatestFrom(rx.Observable<? extends U> observable, rx.functions.Func2<? super T, ? super U, ? extends R> func2) {
        return lift(new rx.internal.operators.OperatorWithLatestFrom(observable, func2));
    }

    public final <T1, T2, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.functions.Func3<? super T, ? super T1, ? super T2, R> func3) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2}, null, rx.functions.Functions.fromFunc(func3)));
    }

    public final <T1, T2, T3, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.functions.Func4<? super T, ? super T1, ? super T2, ? super T3, R> func4) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3}, null, rx.functions.Functions.fromFunc(func4)));
    }

    public final <T1, T2, T3, T4, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.Observable<T4> observable4, rx.functions.Func5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> func5) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3, observable4}, null, rx.functions.Functions.fromFunc(func5)));
    }

    public final <T1, T2, T3, T4, T5, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.Observable<T4> observable4, rx.Observable<T5> observable5, rx.functions.Func6<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, R> func6) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3, observable4, observable5}, null, rx.functions.Functions.fromFunc(func6)));
    }

    public final <T1, T2, T3, T4, T5, T6, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.Observable<T4> observable4, rx.Observable<T5> observable5, rx.Observable<T6> observable6, rx.functions.Func7<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, R> func7) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6}, null, rx.functions.Functions.fromFunc(func7)));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.Observable<T4> observable4, rx.Observable<T5> observable5, rx.Observable<T6> observable6, rx.Observable<T7> observable7, rx.functions.Func8<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, R> func8) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7}, null, rx.functions.Functions.fromFunc(func8)));
    }

    public final <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.Observable<R> withLatestFrom(rx.Observable<T1> observable, rx.Observable<T2> observable2, rx.Observable<T3> observable3, rx.Observable<T4> observable4, rx.Observable<T5> observable5, rx.Observable<T6> observable6, rx.Observable<T7> observable7, rx.Observable<T8> observable8, rx.functions.Func9<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, R> func9) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, new rx.Observable[]{observable, observable2, observable3, observable4, observable5, observable6, observable7, observable8}, null, rx.functions.Functions.fromFunc(func9)));
    }

    public final <R> rx.Observable<R> withLatestFrom(rx.Observable<?>[] observableArr, rx.functions.FuncN<R> funcN) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, observableArr, null, funcN));
    }

    public final <R> rx.Observable<R> withLatestFrom(java.lang.Iterable<rx.Observable<?>> iterable, rx.functions.FuncN<R> funcN) {
        return unsafeCreate(new rx.internal.operators.OperatorWithLatestFromMany(this, null, iterable, funcN));
    }

    public final <TClosing> rx.Observable<rx.Observable<T>> window(rx.functions.Func0<? extends rx.Observable<? extends TClosing>> func0) {
        return (rx.Observable<rx.Observable<T>>) lift(new rx.internal.operators.OperatorWindowWithObservableFactory(func0));
    }

    public final rx.Observable<rx.Observable<T>> window(int i) {
        return window(i, i);
    }

    public final rx.Observable<rx.Observable<T>> window(int i, int i2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("count > 0 required but it was ".concat(java.lang.String.valueOf(i)));
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("skip > 0 required but it was ".concat(java.lang.String.valueOf(i2)));
        }
        return (rx.Observable<rx.Observable<T>>) lift(new rx.internal.operators.OperatorWindowWithSize(i, i2));
    }

    public final rx.Observable<rx.Observable<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit) {
        return window(j, j2, timeUnit, Integer.MAX_VALUE, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<rx.Observable<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return window(j, j2, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public final rx.Observable<rx.Observable<T>> window(long j, long j2, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        return (rx.Observable<rx.Observable<T>>) lift(new rx.internal.operators.OperatorWindowWithTime(j, j2, timeUnit, i, scheduler));
    }

    public final rx.Observable<rx.Observable<T>> window(long j, java.util.concurrent.TimeUnit timeUnit) {
        return window(j, j, timeUnit, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<rx.Observable<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, int i) {
        return window(j, timeUnit, i, rx.schedulers.Schedulers.computation());
    }

    public final rx.Observable<rx.Observable<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, int i, rx.Scheduler scheduler) {
        return window(j, j, timeUnit, i, scheduler);
    }

    public final rx.Observable<rx.Observable<T>> window(long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return window(j, timeUnit, Integer.MAX_VALUE, scheduler);
    }

    public final <TOpening, TClosing> rx.Observable<rx.Observable<T>> window(rx.Observable<? extends TOpening> observable, rx.functions.Func1<? super TOpening, ? extends rx.Observable<? extends TClosing>> func1) {
        return (rx.Observable<rx.Observable<T>>) lift(new rx.internal.operators.OperatorWindowWithStartEndObservable(observable, func1));
    }

    public final <U> rx.Observable<rx.Observable<T>> window(rx.Observable<U> observable) {
        return (rx.Observable<rx.Observable<T>>) lift(new rx.internal.operators.OperatorWindowWithObservable(observable));
    }

    public final <T2, R> rx.Observable<R> zipWith(java.lang.Iterable<? extends T2> iterable, rx.functions.Func2<? super T, ? super T2, ? extends R> func2) {
        return lift(new rx.internal.operators.OperatorZipIterable(iterable, func2));
    }

    public final <T2, R> rx.Observable<R> zipWith(rx.Observable<? extends T2> observable, rx.functions.Func2<? super T, ? super T2, ? extends R> func2) {
        return zip(this, observable, func2);
    }

    public final rx.observers.AssertableSubscriber<T> test() {
        rx.internal.observers.AssertableSubscriberObservable create = rx.internal.observers.AssertableSubscriberObservable.create(Long.MAX_VALUE);
        subscribe((rx.Observer) create);
        return create;
    }

    public final rx.observers.AssertableSubscriber<T> test(long j) {
        rx.internal.observers.AssertableSubscriberObservable create = rx.internal.observers.AssertableSubscriberObservable.create(j);
        subscribe((rx.Observer) create);
        return create;
    }

    public final <R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Observable<? extends R>> func12, rx.functions.Func0<? extends rx.Observable<? extends R>> func0) {
        return merge(lift(new rx.internal.operators.OperatorMapNotification(func1, func12, func0)));
    }

    public final <R> rx.Observable<R> flatMap(rx.functions.Func1<? super T, ? extends rx.Observable<? extends R>> func1, rx.functions.Func1<? super java.lang.Throwable, ? extends rx.Observable<? extends R>> func12, rx.functions.Func0<? extends rx.Observable<? extends R>> func0, int i) {
        return merge(lift(new rx.internal.operators.OperatorMapNotification(func1, func12, func0)), i);
    }
}
