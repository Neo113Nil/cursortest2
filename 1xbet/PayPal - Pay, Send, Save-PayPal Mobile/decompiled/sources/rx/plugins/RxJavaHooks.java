package rx.plugins;

/* loaded from: classes18.dex */
public final class RxJavaHooks {
    static volatile rx.functions.Func2<rx.Completable, rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> Camera2StreamConfigurationMap;
    static volatile rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> accessartificialFrame;
    static volatile rx.functions.Func1<rx.Completable.Operator, rx.Completable.Operator> getHighResolutionOutputSizeshNQ4ISI;
    static volatile rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> getHighSpeedVideoFpsRanges;
    static volatile boolean getHighSpeedVideoFpsRangesFor;
    static volatile rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> getHighSpeedVideoSizes;
    static volatile rx.functions.Action1<java.lang.Throwable> getHighSpeedVideoSizesFor;
    static volatile rx.functions.Func1<rx.Scheduler, rx.Scheduler> getInputFormats;
    static volatile rx.functions.Func0<? extends java.util.concurrent.ScheduledExecutorService> getInputSizeshNQ4ISI;
    static volatile rx.functions.Func1<rx.Scheduler, rx.Scheduler> getOutputFormats;
    static volatile rx.functions.Func1<rx.Scheduler, rx.Scheduler> getOutputMinFrameDuration;
    static volatile rx.functions.Func1<rx.Subscription, rx.Subscription> getOutputMinFrameDurationlomOqCM;
    static volatile rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> getOutputSizes;
    static volatile rx.functions.Func2<rx.Observable, rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> getOutputSizeshNQ4ISI;
    static volatile rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> getOutputStallDuration;
    static volatile rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> getOutputStallDurationlomOqCM;
    static volatile rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> getValidOutputFormatsForInputhNQ4ISI;
    static volatile rx.functions.Func1<rx.functions.Action0, rx.functions.Action0> isOutputSupportedFor;
    static volatile rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe> isOutputSupportedForhNQ4ISI;
    static volatile rx.functions.Func2<rx.Single, rx.Single.OnSubscribe, rx.Single.OnSubscribe> toString;
    static volatile rx.functions.Func1<rx.Subscription, rx.Subscription> unwrapAs;

    static {
        getHighSpeedVideoFpsRanges();
    }

    private RxJavaHooks() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    private static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoSizesFor = new rx.functions.Action1<java.lang.Throwable>() { // from class: rx.plugins.RxJavaHooks.1
            @Override // rx.functions.Action1
            public final /* synthetic */ void call(java.lang.Throwable th) {
                rx.plugins.RxJavaPlugins.getInstance().getErrorHandler().handleError(th);
            }
        };
        getOutputSizeshNQ4ISI = new rx.functions.Func2<rx.Observable, rx.Observable.OnSubscribe, rx.Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.2
            @Override // rx.functions.Func2
            public final /* synthetic */ rx.Observable.OnSubscribe call(rx.Observable observable, rx.Observable.OnSubscribe onSubscribe) {
                return rx.plugins.RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeStart(observable, onSubscribe);
            }
        };
        getOutputMinFrameDurationlomOqCM = new rx.functions.Func1<rx.Subscription, rx.Subscription>() { // from class: rx.plugins.RxJavaHooks.3
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Subscription call(rx.Subscription subscription) {
                return rx.plugins.RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeReturn(subscription);
            }
        };
        toString = new rx.functions.Func2<rx.Single, rx.Single.OnSubscribe, rx.Single.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.4
            @Override // rx.functions.Func2
            public final /* synthetic */ rx.Single.OnSubscribe call(rx.Single single, rx.Single.OnSubscribe onSubscribe) {
                rx.Single single2 = single;
                rx.Single.OnSubscribe onSubscribe2 = onSubscribe;
                rx.plugins.RxJavaSingleExecutionHook singleExecutionHook = rx.plugins.RxJavaPlugins.getInstance().getSingleExecutionHook();
                return singleExecutionHook == rx.plugins.RxJavaSingleExecutionHookDefault.getHighResolutionOutputSizeshNQ4ISI() ? onSubscribe2 : new rx.internal.operators.SingleFromObservable(singleExecutionHook.onSubscribeStart(single2, new rx.internal.operators.SingleToObservable(onSubscribe2)));
            }
        };
        unwrapAs = new rx.functions.Func1<rx.Subscription, rx.Subscription>() { // from class: rx.plugins.RxJavaHooks.5
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Subscription call(rx.Subscription subscription) {
                return rx.plugins.RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeReturn(subscription);
            }
        };
        Camera2StreamConfigurationMap = new rx.functions.Func2<rx.Completable, rx.Completable.OnSubscribe, rx.Completable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.6
            @Override // rx.functions.Func2
            public final /* synthetic */ rx.Completable.OnSubscribe call(rx.Completable completable, rx.Completable.OnSubscribe onSubscribe) {
                return rx.plugins.RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeStart(completable, onSubscribe);
            }
        };
        isOutputSupportedFor = new rx.functions.Func1<rx.functions.Action0, rx.functions.Action0>() { // from class: rx.plugins.RxJavaHooks.7
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.functions.Action0 call(rx.functions.Action0 action0) {
                return rx.plugins.RxJavaPlugins.getInstance().getSchedulersHook().onSchedule(action0);
            }
        };
        getOutputStallDurationlomOqCM = new rx.functions.Func1<java.lang.Throwable, java.lang.Throwable>() { // from class: rx.plugins.RxJavaHooks.8
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Throwable call(java.lang.Throwable th) {
                return rx.plugins.RxJavaPlugins.getInstance().getObservableExecutionHook().onSubscribeError(th);
            }
        };
        getOutputStallDuration = new rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator>() { // from class: rx.plugins.RxJavaHooks.9
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Observable.Operator call(rx.Observable.Operator operator) {
                return rx.plugins.RxJavaPlugins.getInstance().getObservableExecutionHook().onLift(operator);
            }
        };
        accessartificialFrame = new rx.functions.Func1<java.lang.Throwable, java.lang.Throwable>() { // from class: rx.plugins.RxJavaHooks.10
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Throwable call(java.lang.Throwable th) {
                return rx.plugins.RxJavaPlugins.getInstance().getSingleExecutionHook().onSubscribeError(th);
            }
        };
        getValidOutputFormatsForInputhNQ4ISI = new rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator>() { // from class: rx.plugins.RxJavaHooks.11
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Observable.Operator call(rx.Observable.Operator operator) {
                return rx.plugins.RxJavaPlugins.getInstance().getSingleExecutionHook().onLift(operator);
            }
        };
        getHighSpeedVideoFpsRanges = new rx.functions.Func1<java.lang.Throwable, java.lang.Throwable>() { // from class: rx.plugins.RxJavaHooks.12
            @Override // rx.functions.Func1
            public final /* synthetic */ java.lang.Throwable call(java.lang.Throwable th) {
                return rx.plugins.RxJavaPlugins.getInstance().getCompletableExecutionHook().onSubscribeError(th);
            }
        };
        getHighResolutionOutputSizeshNQ4ISI = new rx.functions.Func1<rx.Completable.Operator, rx.Completable.Operator>() { // from class: rx.plugins.RxJavaHooks.13
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Completable.Operator call(rx.Completable.Operator operator) {
                return rx.plugins.RxJavaPlugins.getInstance().getCompletableExecutionHook().onLift(operator);
            }
        };
        getOutputSizes = new rx.plugins.RxJavaHooks.AnonymousClass14();
        isOutputSupportedForhNQ4ISI = new rx.plugins.RxJavaHooks.AnonymousClass15();
        getHighSpeedVideoSizes = new rx.plugins.RxJavaHooks.AnonymousClass16();
    }

    /* renamed from: rx.plugins.RxJavaHooks$14, reason: invalid class name */
    static final class AnonymousClass14 implements rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> {
        AnonymousClass14() {
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Observable.OnSubscribe call(rx.Observable.OnSubscribe onSubscribe) {
            return rx.plugins.RxJavaPlugins.getInstance().getObservableExecutionHook().onCreate(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$15, reason: invalid class name */
    static final class AnonymousClass15 implements rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe> {
        AnonymousClass15() {
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Single.OnSubscribe call(rx.Single.OnSubscribe onSubscribe) {
            return rx.plugins.RxJavaPlugins.getInstance().getSingleExecutionHook().onCreate(onSubscribe);
        }
    }

    /* renamed from: rx.plugins.RxJavaHooks$16, reason: invalid class name */
    static final class AnonymousClass16 implements rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> {
        AnonymousClass16() {
        }

        @Override // rx.functions.Func1
        public final /* synthetic */ rx.Completable.OnSubscribe call(rx.Completable.OnSubscribe onSubscribe) {
            return rx.plugins.RxJavaPlugins.getInstance().getCompletableExecutionHook().onCreate(onSubscribe);
        }
    }

    public static void reset() {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoFpsRanges();
        getOutputFormats = null;
        getInputFormats = null;
        getOutputMinFrameDuration = null;
        getInputSizeshNQ4ISI = null;
    }

    public static void clear() {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoSizesFor = null;
        getOutputSizes = null;
        getOutputSizeshNQ4ISI = null;
        getOutputMinFrameDurationlomOqCM = null;
        getOutputStallDurationlomOqCM = null;
        getOutputStallDuration = null;
        isOutputSupportedForhNQ4ISI = null;
        toString = null;
        unwrapAs = null;
        accessartificialFrame = null;
        getValidOutputFormatsForInputhNQ4ISI = null;
        getHighSpeedVideoSizes = null;
        Camera2StreamConfigurationMap = null;
        getHighSpeedVideoFpsRanges = null;
        getHighResolutionOutputSizeshNQ4ISI = null;
        getOutputFormats = null;
        getInputFormats = null;
        getOutputMinFrameDuration = null;
        isOutputSupportedFor = null;
        getInputSizeshNQ4ISI = null;
    }

    public static void lockdown() {
        getHighSpeedVideoFpsRangesFor = true;
    }

    public static boolean isLockdown() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static void onError(java.lang.Throwable th) {
        rx.functions.Action1<java.lang.Throwable> action1 = getHighSpeedVideoSizesFor;
        if (action1 != null) {
            try {
                action1.call(th);
                return;
            } catch (java.lang.Throwable th2) {
                java.io.PrintStream printStream = java.lang.System.err;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The onError handler threw an Exception. It shouldn't. => ");
                sb.append(th2.getMessage());
                printStream.println(sb.toString());
                th2.printStackTrace();
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static <T> rx.Observable.OnSubscribe<T> onCreate(rx.Observable.OnSubscribe<T> onSubscribe) {
        rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> func1 = getOutputSizes;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static <T> rx.Single.OnSubscribe<T> onCreate(rx.Single.OnSubscribe<T> onSubscribe) {
        rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe> func1 = isOutputSupportedForhNQ4ISI;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static rx.Completable.OnSubscribe onCreate(rx.Completable.OnSubscribe onSubscribe) {
        rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> func1 = getHighSpeedVideoSizes;
        return func1 != null ? func1.call(onSubscribe) : onSubscribe;
    }

    public static rx.Scheduler onComputationScheduler(rx.Scheduler scheduler) {
        rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1 = getOutputFormats;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static rx.Scheduler onIOScheduler(rx.Scheduler scheduler) {
        rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1 = getInputFormats;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static rx.Scheduler onNewThreadScheduler(rx.Scheduler scheduler) {
        rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1 = getOutputMinFrameDuration;
        return func1 != null ? func1.call(scheduler) : scheduler;
    }

    public static rx.functions.Action0 onScheduledAction(rx.functions.Action0 action0) {
        rx.functions.Func1<rx.functions.Action0, rx.functions.Action0> func1 = isOutputSupportedFor;
        return func1 != null ? func1.call(action0) : action0;
    }

    public static <T> rx.Observable.OnSubscribe<T> onObservableStart(rx.Observable<T> observable, rx.Observable.OnSubscribe<T> onSubscribe) {
        rx.functions.Func2<rx.Observable, rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> func2 = getOutputSizeshNQ4ISI;
        return func2 != null ? func2.call(observable, onSubscribe) : onSubscribe;
    }

    public static rx.Subscription onObservableReturn(rx.Subscription subscription) {
        rx.functions.Func1<rx.Subscription, rx.Subscription> func1 = getOutputMinFrameDurationlomOqCM;
        return func1 != null ? func1.call(subscription) : subscription;
    }

    public static java.lang.Throwable onObservableError(java.lang.Throwable th) {
        rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1 = getOutputStallDurationlomOqCM;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> rx.Observable.Operator<R, T> onObservableLift(rx.Observable.Operator<R, T> operator) {
        rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> func1 = getOutputStallDuration;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static <T> rx.Single.OnSubscribe<T> onSingleStart(rx.Single<T> single, rx.Single.OnSubscribe<T> onSubscribe) {
        rx.functions.Func2<rx.Single, rx.Single.OnSubscribe, rx.Single.OnSubscribe> func2 = toString;
        return func2 != null ? func2.call(single, onSubscribe) : onSubscribe;
    }

    public static rx.Subscription onSingleReturn(rx.Subscription subscription) {
        rx.functions.Func1<rx.Subscription, rx.Subscription> func1 = unwrapAs;
        return func1 != null ? func1.call(subscription) : subscription;
    }

    public static java.lang.Throwable onSingleError(java.lang.Throwable th) {
        rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1 = accessartificialFrame;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> rx.Observable.Operator<R, T> onSingleLift(rx.Observable.Operator<R, T> operator) {
        rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> func1 = getValidOutputFormatsForInputhNQ4ISI;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static <T> rx.Completable.OnSubscribe onCompletableStart(rx.Completable completable, rx.Completable.OnSubscribe onSubscribe) {
        rx.functions.Func2<rx.Completable, rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> func2 = Camera2StreamConfigurationMap;
        return func2 != null ? func2.call(completable, onSubscribe) : onSubscribe;
    }

    public static java.lang.Throwable onCompletableError(java.lang.Throwable th) {
        rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1 = getHighSpeedVideoFpsRanges;
        return func1 != null ? func1.call(th) : th;
    }

    public static <T, R> rx.Completable.Operator onCompletableLift(rx.Completable.Operator operator) {
        rx.functions.Func1<rx.Completable.Operator, rx.Completable.Operator> func1 = getHighResolutionOutputSizeshNQ4ISI;
        return func1 != null ? func1.call(operator) : operator;
    }

    public static void setOnError(rx.functions.Action1<java.lang.Throwable> action1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoSizesFor = action1;
    }

    public static void setOnCompletableCreate(rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoSizes = func1;
    }

    public static void setOnObservableCreate(rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputSizes = func1;
    }

    public static void setOnSingleCreate(rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        isOutputSupportedForhNQ4ISI = func1;
    }

    public static void setOnComputationScheduler(rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputFormats = func1;
    }

    public static void setOnIOScheduler(rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getInputFormats = func1;
    }

    public static void setOnNewThreadScheduler(rx.functions.Func1<rx.Scheduler, rx.Scheduler> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputMinFrameDuration = func1;
    }

    public static void setOnScheduleAction(rx.functions.Func1<rx.functions.Action0, rx.functions.Action0> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        isOutputSupportedFor = func1;
    }

    public static void setOnCompletableStart(rx.functions.Func2<rx.Completable, rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> func2) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        Camera2StreamConfigurationMap = func2;
    }

    public static void setOnObservableStart(rx.functions.Func2<rx.Observable, rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> func2) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputSizeshNQ4ISI = func2;
    }

    public static void setOnSingleStart(rx.functions.Func2<rx.Single, rx.Single.OnSubscribe, rx.Single.OnSubscribe> func2) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        toString = func2;
    }

    public static void setOnObservableReturn(rx.functions.Func1<rx.Subscription, rx.Subscription> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputMinFrameDurationlomOqCM = func1;
    }

    public static void setOnSingleReturn(rx.functions.Func1<rx.Subscription, rx.Subscription> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        unwrapAs = func1;
    }

    public static void setOnSingleSubscribeError(rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        accessartificialFrame = func1;
    }

    public static rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> getOnSingleSubscribeError() {
        return accessartificialFrame;
    }

    public static void setOnCompletableSubscribeError(rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighSpeedVideoFpsRanges = func1;
    }

    public static rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> getOnCompletableSubscribeError() {
        return getHighSpeedVideoFpsRanges;
    }

    public static void setOnObservableSubscribeError(rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputStallDurationlomOqCM = func1;
    }

    public static rx.functions.Func1<java.lang.Throwable, java.lang.Throwable> getOnObservableSubscribeError() {
        return getOutputStallDurationlomOqCM;
    }

    public static void setOnObservableLift(rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputStallDuration = func1;
    }

    public static rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> getOnObservableLift() {
        return getOutputStallDuration;
    }

    public static void setOnSingleLift(rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getValidOutputFormatsForInputhNQ4ISI = func1;
    }

    public static rx.functions.Func1<rx.Observable.Operator, rx.Observable.Operator> getOnSingleLift() {
        return getValidOutputFormatsForInputhNQ4ISI;
    }

    public static void setOnCompletableLift(rx.functions.Func1<rx.Completable.Operator, rx.Completable.Operator> func1) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI = func1;
    }

    public static rx.functions.Func1<rx.Completable.Operator, rx.Completable.Operator> getOnCompletableLift() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public static rx.functions.Func1<rx.Scheduler, rx.Scheduler> getOnComputationScheduler() {
        return getOutputFormats;
    }

    public static rx.functions.Action1<java.lang.Throwable> getOnError() {
        return getHighSpeedVideoSizesFor;
    }

    public static rx.functions.Func1<rx.Scheduler, rx.Scheduler> getOnIOScheduler() {
        return getInputFormats;
    }

    public static rx.functions.Func1<rx.Scheduler, rx.Scheduler> getOnNewThreadScheduler() {
        return getOutputMinFrameDuration;
    }

    public static rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> getOnObservableCreate() {
        return getOutputSizes;
    }

    public static rx.functions.Func1<rx.functions.Action0, rx.functions.Action0> getOnScheduleAction() {
        return isOutputSupportedFor;
    }

    public static rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe> getOnSingleCreate() {
        return isOutputSupportedForhNQ4ISI;
    }

    public static rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> getOnCompletableCreate() {
        return getHighSpeedVideoSizes;
    }

    public static rx.functions.Func2<rx.Completable, rx.Completable.OnSubscribe, rx.Completable.OnSubscribe> getOnCompletableStart() {
        return Camera2StreamConfigurationMap;
    }

    public static rx.functions.Func2<rx.Observable, rx.Observable.OnSubscribe, rx.Observable.OnSubscribe> getOnObservableStart() {
        return getOutputSizeshNQ4ISI;
    }

    public static rx.functions.Func2<rx.Single, rx.Single.OnSubscribe, rx.Single.OnSubscribe> getOnSingleStart() {
        return toString;
    }

    public static rx.functions.Func1<rx.Subscription, rx.Subscription> getOnObservableReturn() {
        return getOutputMinFrameDurationlomOqCM;
    }

    public static rx.functions.Func1<rx.Subscription, rx.Subscription> getOnSingleReturn() {
        return unwrapAs;
    }

    public static void resetAssemblyTracking() {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputSizes = new rx.plugins.RxJavaHooks.AnonymousClass14();
        isOutputSupportedForhNQ4ISI = new rx.plugins.RxJavaHooks.AnonymousClass15();
        getHighSpeedVideoSizes = new rx.plugins.RxJavaHooks.AnonymousClass16();
    }

    public static void clearAssemblyTracking() {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputSizes = null;
        isOutputSupportedForhNQ4ISI = null;
        getHighSpeedVideoSizes = null;
    }

    public static void enableAssemblyTracking() {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getOutputSizes = new rx.functions.Func1<rx.Observable.OnSubscribe, rx.Observable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.17
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Observable.OnSubscribe call(rx.Observable.OnSubscribe onSubscribe) {
                return new rx.internal.operators.OnSubscribeOnAssembly(onSubscribe);
            }
        };
        isOutputSupportedForhNQ4ISI = new rx.functions.Func1<rx.Single.OnSubscribe, rx.Single.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.18
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Single.OnSubscribe call(rx.Single.OnSubscribe onSubscribe) {
                return new rx.internal.operators.OnSubscribeOnAssemblySingle(onSubscribe);
            }
        };
        getHighSpeedVideoSizes = new rx.functions.Func1<rx.Completable.OnSubscribe, rx.Completable.OnSubscribe>() { // from class: rx.plugins.RxJavaHooks.19
            @Override // rx.functions.Func1
            public final /* synthetic */ rx.Completable.OnSubscribe call(rx.Completable.OnSubscribe onSubscribe) {
                return new rx.internal.operators.OnSubscribeOnAssemblyCompletable(onSubscribe);
            }
        };
    }

    public static void setOnGenericScheduledExecutorService(rx.functions.Func0<? extends java.util.concurrent.ScheduledExecutorService> func0) {
        if (getHighSpeedVideoFpsRangesFor) {
            return;
        }
        getInputSizeshNQ4ISI = func0;
    }

    public static rx.functions.Func0<? extends java.util.concurrent.ScheduledExecutorService> getOnGenericScheduledExecutorService() {
        return getInputSizeshNQ4ISI;
    }
}
