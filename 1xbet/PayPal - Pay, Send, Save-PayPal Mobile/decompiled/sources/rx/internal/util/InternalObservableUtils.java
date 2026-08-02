package rx.internal.util;

/* loaded from: classes18.dex */
public enum InternalObservableUtils {
    ;

    public static final rx.internal.util.InternalObservableUtils.PlusOneLongFunc2 LONG_COUNTER = new rx.internal.util.InternalObservableUtils.PlusOneLongFunc2();
    public static final rx.internal.util.InternalObservableUtils.ObjectEqualsFunc2 OBJECT_EQUALS = new rx.internal.util.InternalObservableUtils.ObjectEqualsFunc2();
    public static final rx.internal.util.InternalObservableUtils.ToArrayFunc1 TO_ARRAY = new rx.internal.util.InternalObservableUtils.ToArrayFunc1();
    static final rx.internal.util.InternalObservableUtils.ReturnsVoidFunc1 getHighResolutionOutputSizeshNQ4ISI = new rx.internal.util.InternalObservableUtils.ReturnsVoidFunc1();
    public static final rx.internal.util.InternalObservableUtils.PlusOneFunc2 COUNTER = new rx.internal.util.InternalObservableUtils.PlusOneFunc2();
    static final rx.internal.util.InternalObservableUtils.NotificationErrorExtractor Camera2StreamConfigurationMap = new rx.internal.util.InternalObservableUtils.NotificationErrorExtractor();
    public static final rx.functions.Action1<java.lang.Throwable> ERROR_NOT_IMPLEMENTED = new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.internal.util.InternalObservableUtils.ErrorNotImplementedAction
        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Throwable th) {
            throw new rx.exceptions.OnErrorNotImplementedException(th);
        }
    };
    public static final rx.Observable.Operator<java.lang.Boolean, java.lang.Object> IS_EMPTY = new rx.internal.operators.OperatorAny(rx.internal.util.UtilityFunctions.alwaysTrue(), true);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class PlusOneFunc2 implements rx.functions.Func2<java.lang.Integer, java.lang.Object, java.lang.Integer> {
        PlusOneFunc2() {
        }

        @Override // rx.functions.Func2
        public final /* synthetic */ java.lang.Integer call(java.lang.Integer num, java.lang.Object obj) {
            return java.lang.Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class PlusOneLongFunc2 implements rx.functions.Func2<java.lang.Long, java.lang.Object, java.lang.Long> {
        PlusOneLongFunc2() {
        }

        @Override // rx.functions.Func2
        public final /* synthetic */ java.lang.Long call(java.lang.Long l, java.lang.Object obj) {
            return java.lang.Long.valueOf(l.longValue() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class ObjectEqualsFunc2 implements rx.functions.Func2<java.lang.Object, java.lang.Object, java.lang.Boolean> {
        ObjectEqualsFunc2() {
        }

        @Override // rx.functions.Func2
        public final /* synthetic */ java.lang.Boolean call(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class ToArrayFunc1 implements rx.functions.Func1<java.util.List<? extends rx.Observable<?>>, rx.Observable<?>[]> {
        ToArrayFunc1() {
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Observable<?>[] call(java.util.List<? extends rx.Observable<?>> list) {
            java.util.List<? extends rx.Observable<?>> list2 = list;
            return (rx.Observable[]) list2.toArray(new rx.Observable[list2.size()]);
        }
    }

    public static rx.functions.Func1<java.lang.Object, java.lang.Boolean> equalsWith(java.lang.Object obj) {
        return new rx.internal.util.InternalObservableUtils.EqualsWithFunc1(obj);
    }

    static final class EqualsWithFunc1 implements rx.functions.Func1<java.lang.Object, java.lang.Boolean> {
        final java.lang.Object getHighSpeedVideoSizes;

        public EqualsWithFunc1(java.lang.Object obj) {
            this.getHighSpeedVideoSizes = obj;
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ java.lang.Boolean call(java.lang.Object obj) {
            java.lang.Object obj2 = this.getHighSpeedVideoSizes;
            return java.lang.Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    public static rx.functions.Func1<java.lang.Object, java.lang.Boolean> isInstanceOf(java.lang.Class<?> cls) {
        return new rx.internal.util.InternalObservableUtils.IsInstanceOfFunc1(cls);
    }

    static final class IsInstanceOfFunc1 implements rx.functions.Func1<java.lang.Object, java.lang.Boolean> {
        final java.lang.Class<?> getHighSpeedVideoFpsRangesFor;

        public IsInstanceOfFunc1(java.lang.Class<?> cls) {
            this.getHighSpeedVideoFpsRangesFor = cls;
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ java.lang.Boolean call(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.isInstance(obj));
        }
    }

    public static rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> createRepeatDematerializer(rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> func1) {
        return new rx.internal.util.InternalObservableUtils.RepeatNotificationDematerializer(func1);
    }

    static final class RepeatNotificationDematerializer implements rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> {
        final rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> getHighResolutionOutputSizeshNQ4ISI;

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Observable<?> call(rx.Observable<? extends rx.Notification<?>> observable) {
            return this.getHighResolutionOutputSizeshNQ4ISI.call(observable.map(rx.internal.util.InternalObservableUtils.getHighResolutionOutputSizeshNQ4ISI));
        }

        public RepeatNotificationDematerializer(rx.functions.Func1<? super rx.Observable<? extends java.lang.Void>, ? extends rx.Observable<?>> func1) {
            this.getHighResolutionOutputSizeshNQ4ISI = func1;
        }
    }

    static final class ReturnsVoidFunc1 implements rx.functions.Func1<java.lang.Object, java.lang.Void> {
        @Override // rx.functions.Func1
        public final /* bridge */ /* synthetic */ java.lang.Void call(java.lang.Object obj) {
            return null;
        }

        ReturnsVoidFunc1() {
        }
    }

    public static <T, R> rx.functions.Func1<rx.Observable<T>, rx.Observable<R>> createReplaySelectorAndObserveOn(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, rx.Scheduler scheduler) {
        return new rx.internal.util.InternalObservableUtils.SelectorAndObserveOn(func1, scheduler);
    }

    static final class SelectorAndObserveOn<T, R> implements rx.functions.Func1<rx.Observable<T>, rx.Observable<R>> {
        final rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> Camera2StreamConfigurationMap;
        final rx.Scheduler getHighSpeedVideoSizes;

        @Override // rx.functions.Func1
        public final /* synthetic */ java.lang.Object call(java.lang.Object obj) {
            return this.Camera2StreamConfigurationMap.call((rx.Observable) obj).observeOn(this.getHighSpeedVideoSizes);
        }

        public SelectorAndObserveOn(rx.functions.Func1<? super rx.Observable<T>, ? extends rx.Observable<R>> func1, rx.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = func1;
            this.getHighSpeedVideoSizes = scheduler;
        }
    }

    public static rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> createRetryDematerializer(rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1) {
        return new rx.internal.util.InternalObservableUtils.RetryNotificationDematerializer(func1);
    }

    static final class RetryNotificationDematerializer implements rx.functions.Func1<rx.Observable<? extends rx.Notification<?>>, rx.Observable<?>> {
        final rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> getHighSpeedVideoFpsRanges;

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Observable<?> call(rx.Observable<? extends rx.Notification<?>> observable) {
            return this.getHighSpeedVideoFpsRanges.call(observable.map(rx.internal.util.InternalObservableUtils.Camera2StreamConfigurationMap));
        }

        public RetryNotificationDematerializer(rx.functions.Func1<? super rx.Observable<? extends java.lang.Throwable>, ? extends rx.Observable<?>> func1) {
            this.getHighSpeedVideoFpsRanges = func1;
        }
    }

    static final class NotificationErrorExtractor implements rx.functions.Func1<rx.Notification<?>, java.lang.Throwable> {
        NotificationErrorExtractor() {
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ java.lang.Throwable call(rx.Notification<?> notification) {
            return notification.getThrowable();
        }
    }

    public static <T> rx.functions.Func0<rx.observables.ConnectableObservable<T>> createReplaySupplier(rx.Observable<T> observable) {
        return new rx.internal.util.InternalObservableUtils.ReplaySupplierNoParams(observable);
    }

    static final class ReplaySupplierNoParams<T> implements rx.functions.Func0<rx.observables.ConnectableObservable<T>> {
        private final rx.Observable<T> getHighSpeedVideoSizes;

        ReplaySupplierNoParams(rx.Observable<T> observable) {
            this.getHighSpeedVideoSizes = observable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            return this.getHighSpeedVideoSizes.replay();
        }
    }

    public static <T> rx.functions.Func0<rx.observables.ConnectableObservable<T>> createReplaySupplier(rx.Observable<T> observable, int i) {
        return new rx.internal.util.InternalObservableUtils.ReplaySupplierBuffer(observable, i);
    }

    static final class ReplaySupplierBuffer<T> implements rx.functions.Func0<rx.observables.ConnectableObservable<T>> {
        private final rx.Observable<T> Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        ReplaySupplierBuffer(rx.Observable<T> observable, int i) {
            this.Camera2StreamConfigurationMap = observable;
            this.getHighSpeedVideoSizes = i;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            return this.Camera2StreamConfigurationMap.replay(this.getHighSpeedVideoSizes);
        }
    }

    public static <T> rx.functions.Func0<rx.observables.ConnectableObservable<T>> createReplaySupplier(rx.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return new rx.internal.util.InternalObservableUtils.ReplaySupplierBufferTime(observable, j, timeUnit, scheduler);
    }

    static final class ReplaySupplierBufferTime<T> implements rx.functions.Func0<rx.observables.ConnectableObservable<T>> {
        private final java.util.concurrent.TimeUnit Camera2StreamConfigurationMap;
        private final rx.Scheduler getHighResolutionOutputSizeshNQ4ISI;
        private final long getHighSpeedVideoFpsRanges;
        private final rx.Observable<T> getHighSpeedVideoSizes;

        ReplaySupplierBufferTime(rx.Observable<T> observable, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
            this.Camera2StreamConfigurationMap = timeUnit;
            this.getHighSpeedVideoSizes = observable;
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighResolutionOutputSizeshNQ4ISI = scheduler;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            return this.getHighSpeedVideoSizes.replay(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static <T> rx.functions.Func0<rx.observables.ConnectableObservable<T>> createReplaySupplier(rx.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
        return new rx.internal.util.InternalObservableUtils.ReplaySupplierTime(observable, i, j, timeUnit, scheduler);
    }

    static final class ReplaySupplierTime<T> implements rx.functions.Func0<rx.observables.ConnectableObservable<T>> {
        private final rx.Scheduler Camera2StreamConfigurationMap;
        private final java.util.concurrent.TimeUnit getHighResolutionOutputSizeshNQ4ISI;
        private final rx.Observable<T> getHighSpeedVideoFpsRanges;
        private final long getHighSpeedVideoFpsRangesFor;
        private final int getHighSpeedVideoSizes;

        ReplaySupplierTime(rx.Observable<T> observable, int i, long j, java.util.concurrent.TimeUnit timeUnit, rx.Scheduler scheduler) {
            this.getHighSpeedVideoFpsRangesFor = j;
            this.getHighResolutionOutputSizeshNQ4ISI = timeUnit;
            this.Camera2StreamConfigurationMap = scheduler;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges = observable;
        }

        @Override // rx.functions.Func0, java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Object call() {
            return this.getHighSpeedVideoFpsRanges.replay(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    public static <T, R> rx.functions.Func2<R, T, R> createCollectorCaller(rx.functions.Action2<R, ? super T> action2) {
        return new rx.internal.util.InternalObservableUtils.CollectorCaller(action2);
    }

    static final class CollectorCaller<T, R> implements rx.functions.Func2<R, T, R> {
        final rx.functions.Action2<R, ? super T> getHighSpeedVideoFpsRangesFor;

        public CollectorCaller(rx.functions.Action2<R, ? super T> action2) {
            this.getHighSpeedVideoFpsRangesFor = action2;
        }

        @Override // rx.functions.Func2
        public final R call(R r, T t) {
            this.getHighSpeedVideoFpsRangesFor.call(r, t);
            return r;
        }
    }
}
