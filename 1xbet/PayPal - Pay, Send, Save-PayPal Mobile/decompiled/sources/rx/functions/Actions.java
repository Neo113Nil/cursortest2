package rx.functions;

/* loaded from: classes18.dex */
public final class Actions {
    private static final rx.functions.Actions.EmptyAction getHighSpeedVideoSizes = new rx.functions.Actions.EmptyAction();

    private Actions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> rx.functions.Actions.EmptyAction<T0, T1, T2, T3, T4, T5, T6, T7, T8> empty() {
        return getHighSpeedVideoSizes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class EmptyAction<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements rx.functions.Action0, rx.functions.Action1<T0>, rx.functions.Action2<T0, T1>, rx.functions.Action3<T0, T1, T2>, rx.functions.Action4<T0, T1, T2, T3>, rx.functions.Action5<T0, T1, T2, T3, T4>, rx.functions.Action6<T0, T1, T2, T3, T4, T5>, rx.functions.Action7<T0, T1, T2, T3, T4, T5, T6>, rx.functions.Action8<T0, T1, T2, T3, T4, T5, T6, T7>, rx.functions.Action9<T0, T1, T2, T3, T4, T5, T6, T7, T8>, rx.functions.ActionN {
        @Override // rx.functions.Action0
        public final void call() {
        }

        @Override // rx.functions.Action1
        public final void call(T0 t0) {
        }

        @Override // rx.functions.Action2
        public final void call(T0 t0, T1 t1) {
        }

        @Override // rx.functions.Action3
        public final void call(T0 t0, T1 t1, T2 t2) {
        }

        @Override // rx.functions.Action4
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3) {
        }

        @Override // rx.functions.Action5
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4) {
        }

        @Override // rx.functions.Action6
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        }

        @Override // rx.functions.Action7
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        }

        @Override // rx.functions.Action8
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        }

        @Override // rx.functions.Action9
        public final void call(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        }

        @Override // rx.functions.ActionN
        public final void call(java.lang.Object... objArr) {
        }

        EmptyAction() {
        }
    }

    public static rx.functions.Func0<java.lang.Void> toFunc(rx.functions.Action0 action0) {
        return toFunc(action0, (java.lang.Object) null);
    }

    public static <T1> rx.functions.Func1<T1, java.lang.Void> toFunc(rx.functions.Action1<T1> action1) {
        return toFunc(action1, (java.lang.Object) null);
    }

    public static <T1, T2> rx.functions.Func2<T1, T2, java.lang.Void> toFunc(rx.functions.Action2<T1, T2> action2) {
        return toFunc(action2, (java.lang.Object) null);
    }

    public static <T1, T2, T3> rx.functions.Func3<T1, T2, T3, java.lang.Void> toFunc(rx.functions.Action3<T1, T2, T3> action3) {
        return toFunc(action3, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4> rx.functions.Func4<T1, T2, T3, T4, java.lang.Void> toFunc(rx.functions.Action4<T1, T2, T3, T4> action4) {
        return toFunc(action4, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4, T5> rx.functions.Func5<T1, T2, T3, T4, T5, java.lang.Void> toFunc(rx.functions.Action5<T1, T2, T3, T4, T5> action5) {
        return toFunc(action5, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6> rx.functions.Func6<T1, T2, T3, T4, T5, T6, java.lang.Void> toFunc(rx.functions.Action6<T1, T2, T3, T4, T5, T6> action6) {
        return toFunc(action6, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> rx.functions.Func7<T1, T2, T3, T4, T5, T6, T7, java.lang.Void> toFunc(rx.functions.Action7<T1, T2, T3, T4, T5, T6, T7> action7) {
        return toFunc(action7, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> rx.functions.Func8<T1, T2, T3, T4, T5, T6, T7, T8, java.lang.Void> toFunc(rx.functions.Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8) {
        return toFunc(action8, (java.lang.Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> rx.functions.Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, java.lang.Void> toFunc(rx.functions.Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9) {
        return toFunc(action9, (java.lang.Object) null);
    }

    public static rx.functions.FuncN<java.lang.Void> toFunc(rx.functions.ActionN actionN) {
        return toFunc(actionN, (java.lang.Object) null);
    }

    public static <R> rx.functions.Func0<R> toFunc(final rx.functions.Action0 action0, final R r) {
        return new rx.functions.Func0<R>() { // from class: rx.functions.Actions.1
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final R call() {
                rx.functions.Action0.this.call();
                return (R) r;
            }
        };
    }

    public static <T1, R> rx.functions.Func1<T1, R> toFunc(final rx.functions.Action1<T1> action1, final R r) {
        return new rx.functions.Func1<T1, R>() { // from class: rx.functions.Actions.2
            @Override // rx.functions.Func1
            public final R call(T1 t1) {
                rx.functions.Action1.this.call(t1);
                return (R) r;
            }
        };
    }

    public static <T1, T2, R> rx.functions.Func2<T1, T2, R> toFunc(final rx.functions.Action2<T1, T2> action2, final R r) {
        return new rx.functions.Func2<T1, T2, R>() { // from class: rx.functions.Actions.3
            @Override // rx.functions.Func2
            public final R call(T1 t1, T2 t2) {
                rx.functions.Action2.this.call(t1, t2);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, R> rx.functions.Func3<T1, T2, T3, R> toFunc(final rx.functions.Action3<T1, T2, T3> action3, final R r) {
        return new rx.functions.Func3<T1, T2, T3, R>() { // from class: rx.functions.Actions.4
            @Override // rx.functions.Func3
            public final R call(T1 t1, T2 t2, T3 t3) {
                rx.functions.Action3.this.call(t1, t2, t3);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, R> rx.functions.Func4<T1, T2, T3, T4, R> toFunc(final rx.functions.Action4<T1, T2, T3, T4> action4, final R r) {
        return new rx.functions.Func4<T1, T2, T3, T4, R>() { // from class: rx.functions.Actions.5
            @Override // rx.functions.Func4
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4) {
                rx.functions.Action4.this.call(t1, t2, t3, t4);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, T5, R> rx.functions.Func5<T1, T2, T3, T4, T5, R> toFunc(final rx.functions.Action5<T1, T2, T3, T4, T5> action5, final R r) {
        return new rx.functions.Func5<T1, T2, T3, T4, T5, R>() { // from class: rx.functions.Actions.6
            @Override // rx.functions.Func5
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
                rx.functions.Action5.this.call(t1, t2, t3, t4, t5);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, T5, T6, R> rx.functions.Func6<T1, T2, T3, T4, T5, T6, R> toFunc(final rx.functions.Action6<T1, T2, T3, T4, T5, T6> action6, final R r) {
        return new rx.functions.Func6<T1, T2, T3, T4, T5, T6, R>() { // from class: rx.functions.Actions.7
            @Override // rx.functions.Func6
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
                rx.functions.Action6.this.call(t1, t2, t3, t4, t5, t6);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> rx.functions.Func7<T1, T2, T3, T4, T5, T6, T7, R> toFunc(final rx.functions.Action7<T1, T2, T3, T4, T5, T6, T7> action7, final R r) {
        return new rx.functions.Func7<T1, T2, T3, T4, T5, T6, T7, R>() { // from class: rx.functions.Actions.8
            @Override // rx.functions.Func7
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
                rx.functions.Action7.this.call(t1, t2, t3, t4, t5, t6, t7);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> rx.functions.Func8<T1, T2, T3, T4, T5, T6, T7, T8, R> toFunc(final rx.functions.Action8<T1, T2, T3, T4, T5, T6, T7, T8> action8, final R r) {
        return new rx.functions.Func8<T1, T2, T3, T4, T5, T6, T7, T8, R>() { // from class: rx.functions.Actions.9
            @Override // rx.functions.Func8
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
                rx.functions.Action8.this.call(t1, t2, t3, t4, t5, t6, t7, t8);
                return (R) r;
            }
        };
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> rx.functions.Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> toFunc(final rx.functions.Action9<T1, T2, T3, T4, T5, T6, T7, T8, T9> action9, final R r) {
        return new rx.functions.Func9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>() { // from class: rx.functions.Actions.10
            @Override // rx.functions.Func9
            public final R call(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
                rx.functions.Action9.this.call(t1, t2, t3, t4, t5, t6, t7, t8, t9);
                return (R) r;
            }
        };
    }

    public static <R> rx.functions.FuncN<R> toFunc(final rx.functions.ActionN actionN, final R r) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Actions.11
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                rx.functions.ActionN.this.call(objArr);
                return (R) r;
            }
        };
    }

    public static <T> rx.functions.Action1<T> toAction1(rx.functions.Action0 action0) {
        return new rx.functions.Actions.Action1CallsAction0(action0);
    }

    static final class Action1CallsAction0<T> implements rx.functions.Action1<T> {
        final rx.functions.Action0 Camera2StreamConfigurationMap;

        public Action1CallsAction0(rx.functions.Action0 action0) {
            this.Camera2StreamConfigurationMap = action0;
        }

        @Override // rx.functions.Action1
        public final void call(T t) {
            this.Camera2StreamConfigurationMap.call();
        }
    }

    enum NotImplemented implements rx.functions.Action1<java.lang.Throwable> {
        INSTANCE;

        @Override // rx.functions.Action1
        public final /* synthetic */ void call(java.lang.Throwable th) {
            throw new rx.exceptions.OnErrorNotImplementedException(th);
        }
    }

    public static rx.functions.Action1<java.lang.Throwable> errorNotImplemented() {
        return rx.functions.Actions.NotImplemented.INSTANCE;
    }
}
