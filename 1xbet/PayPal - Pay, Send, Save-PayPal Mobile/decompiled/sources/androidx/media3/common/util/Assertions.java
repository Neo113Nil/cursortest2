package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class Assertions {
    private Assertions() {
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static void checkArgument(boolean z) {
        com.google.common.base.Preconditions.checkArgument(z);
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static void checkArgument(boolean z, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkArgument(z, obj);
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static int checkIndex(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return i;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static void checkState(boolean z) {
        com.google.common.base.Preconditions.checkState(z);
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static void checkState(boolean z, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkState(z, obj);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkStateNotNull(T t) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkStateNotNull(T t, java.lang.Object obj) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t, obj);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkNotNull(T t) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t, obj);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String checkNotEmpty(java.lang.String str) {
        com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str));
        return str;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String checkNotEmpty(java.lang.String str, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkArgument(!android.text.TextUtils.isEmpty(str), obj);
        return str;
    }

    @java.lang.Deprecated
    @org.checkerframework.dataflow.qual.Pure
    public static void checkMainThread() {
        com.google.common.base.Preconditions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper(), "Not in application's main thread");
    }
}
