package io.reactivex.internal.functions;

/* loaded from: classes3.dex */
public final class ObjectHelper {
    static final io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> getHighSpeedVideoSizes = new io.reactivex.internal.functions.ObjectHelper.BiObjectPredicate();

    public static int compare(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int compare(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    private ObjectHelper() {
        throw new java.lang.IllegalStateException("No instances!");
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static <T> io.reactivex.functions.BiPredicate<T, T> equalsPredicate() {
        return (io.reactivex.functions.BiPredicate<T, T>) getHighSpeedVideoSizes;
    }

    public static int verifyPositive(int i, java.lang.String str) {
        if (i > 0) {
            return i;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static long verifyPositive(long j, java.lang.String str) {
        if (j > 0) {
            return j;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    /* loaded from: classes17.dex */
    static final class BiObjectPredicate implements io.reactivex.functions.BiPredicate<java.lang.Object, java.lang.Object> {
        BiObjectPredicate() {
        }

        @Override // io.reactivex.functions.BiPredicate
        public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
            return io.reactivex.internal.functions.ObjectHelper.equals(obj, obj2);
        }
    }

    @java.lang.Deprecated
    public static long requireNonNull(long j, java.lang.String str) {
        throw new java.lang.InternalError("Null check on a primitive: ".concat(java.lang.String.valueOf(str)));
    }
}
