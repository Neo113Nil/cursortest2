package rx.internal.util;

/* loaded from: classes18.dex */
public final class UtilityFunctions {

    enum Identity implements rx.functions.Func1<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // rx.functions.Func1
        public final java.lang.Object call(java.lang.Object obj) {
            return obj;
        }
    }

    private UtilityFunctions() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> rx.functions.Func1<? super T, java.lang.Boolean> alwaysTrue() {
        return rx.internal.util.UtilityFunctions.AlwaysTrue.INSTANCE;
    }

    public static <T> rx.functions.Func1<? super T, java.lang.Boolean> alwaysFalse() {
        return rx.internal.util.UtilityFunctions.AlwaysFalse.INSTANCE;
    }

    public static <T> rx.functions.Func1<T, T> identity() {
        return rx.internal.util.UtilityFunctions.Identity.INSTANCE;
    }

    enum AlwaysTrue implements rx.functions.Func1<java.lang.Object, java.lang.Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        public final /* bridge */ /* synthetic */ java.lang.Boolean call(java.lang.Object obj) {
            return java.lang.Boolean.TRUE;
        }
    }

    enum AlwaysFalse implements rx.functions.Func1<java.lang.Object, java.lang.Boolean> {
        INSTANCE;

        @Override // rx.functions.Func1
        public final /* bridge */ /* synthetic */ java.lang.Boolean call(java.lang.Object obj) {
            return java.lang.Boolean.FALSE;
        }
    }
}
