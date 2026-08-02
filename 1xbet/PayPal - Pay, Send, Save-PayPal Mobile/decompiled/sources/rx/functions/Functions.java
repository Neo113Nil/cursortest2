package rx.functions;

/* loaded from: classes18.dex */
public final class Functions {
    private Functions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func0<? extends R> func0) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.1
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 0) {
                    throw new java.lang.IllegalArgumentException("Func0 expecting 0 arguments.");
                }
                return (R) rx.functions.Func0.this.call();
            }
        };
    }

    public static <T0, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func1<? super T0, ? extends R> func1) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.2
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 1) {
                    throw new java.lang.IllegalArgumentException("Func1 expecting 1 argument.");
                }
                return (R) rx.functions.Func1.this.call(objArr[0]);
            }
        };
    }

    public static <T0, T1, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func2<? super T0, ? super T1, ? extends R> func2) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.3
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 2) {
                    throw new java.lang.IllegalArgumentException("Func2 expecting 2 arguments.");
                }
                return (R) rx.functions.Func2.this.call(objArr[0], objArr[1]);
            }
        };
    }

    public static <T0, T1, T2, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func3<? super T0, ? super T1, ? super T2, ? extends R> func3) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.4
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 3) {
                    throw new java.lang.IllegalArgumentException("Func3 expecting 3 arguments.");
                }
                return (R) rx.functions.Func3.this.call(objArr[0], objArr[1], objArr[2]);
            }
        };
    }

    public static <T0, T1, T2, T3, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func4<? super T0, ? super T1, ? super T2, ? super T3, ? extends R> func4) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.5
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 4) {
                    throw new java.lang.IllegalArgumentException("Func4 expecting 4 arguments.");
                }
                return (R) rx.functions.Func4.this.call(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
        };
    }

    public static <T0, T1, T2, T3, T4, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func5<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func5) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.6
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 5) {
                    throw new java.lang.IllegalArgumentException("Func5 expecting 5 arguments.");
                }
                return (R) rx.functions.Func5.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
        };
    }

    public static <T0, T1, T2, T3, T4, T5, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func6<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func6) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.7
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 6) {
                    throw new java.lang.IllegalArgumentException("Func6 expecting 6 arguments.");
                }
                return (R) rx.functions.Func6.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
        };
    }

    public static <T0, T1, T2, T3, T4, T5, T6, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func7<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func7) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.8
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 7) {
                    throw new java.lang.IllegalArgumentException("Func7 expecting 7 arguments.");
                }
                return (R) rx.functions.Func7.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
        };
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func8<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func8) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.9
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 8) {
                    throw new java.lang.IllegalArgumentException("Func8 expecting 8 arguments.");
                }
                return (R) rx.functions.Func8.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
        };
    }

    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8, R> rx.functions.FuncN<R> fromFunc(final rx.functions.Func9<? super T0, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func9) {
        return new rx.functions.FuncN<R>() { // from class: rx.functions.Functions.10
            @Override // rx.functions.FuncN
            public final R call(java.lang.Object... objArr) {
                if (objArr.length != 9) {
                    throw new java.lang.IllegalArgumentException("Func9 expecting 9 arguments.");
                }
                return (R) rx.functions.Func9.this.call(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
        };
    }

    public static rx.functions.FuncN<java.lang.Void> fromAction(final rx.functions.Action0 action0) {
        return new rx.functions.FuncN<java.lang.Void>() { // from class: rx.functions.Functions.11
            @Override // rx.functions.FuncN
            public final /* synthetic */ java.lang.Void call(java.lang.Object[] objArr) {
                if (objArr.length != 0) {
                    throw new java.lang.IllegalArgumentException("Action0 expecting 0 arguments.");
                }
                rx.functions.Action0.this.call();
                return null;
            }
        };
    }

    public static <T0> rx.functions.FuncN<java.lang.Void> fromAction(final rx.functions.Action1<? super T0> action1) {
        return new rx.functions.FuncN<java.lang.Void>() { // from class: rx.functions.Functions.12
            @Override // rx.functions.FuncN
            public final /* synthetic */ java.lang.Void call(java.lang.Object[] objArr) {
                if (objArr.length != 1) {
                    throw new java.lang.IllegalArgumentException("Action1 expecting 1 argument.");
                }
                rx.functions.Action1.this.call(objArr[0]);
                return null;
            }
        };
    }

    public static <T0, T1> rx.functions.FuncN<java.lang.Void> fromAction(final rx.functions.Action2<? super T0, ? super T1> action2) {
        return new rx.functions.FuncN<java.lang.Void>() { // from class: rx.functions.Functions.13
            @Override // rx.functions.FuncN
            public final /* synthetic */ java.lang.Void call(java.lang.Object[] objArr) {
                if (objArr.length != 2) {
                    throw new java.lang.IllegalArgumentException("Action3 expecting 2 arguments.");
                }
                rx.functions.Action2.this.call(objArr[0], objArr[1]);
                return null;
            }
        };
    }

    public static <T0, T1, T2> rx.functions.FuncN<java.lang.Void> fromAction(final rx.functions.Action3<? super T0, ? super T1, ? super T2> action3) {
        return new rx.functions.FuncN<java.lang.Void>() { // from class: rx.functions.Functions.14
            @Override // rx.functions.FuncN
            public final /* synthetic */ java.lang.Void call(java.lang.Object[] objArr) {
                if (objArr.length != 3) {
                    throw new java.lang.IllegalArgumentException("Action3 expecting 3 arguments.");
                }
                rx.functions.Action3.this.call(objArr[0], objArr[1], objArr[2]);
                return null;
            }
        };
    }
}
