package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
public final class Asserts {
    private Asserts() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static void checkMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return;
        }
        android.os.Looper.getMainLooper().getThread();
        throw new java.lang.IllegalStateException(str);
    }

    public static void checkNotMainThread(java.lang.String str) {
        if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
            return;
        }
        android.os.Looper.getMainLooper().getThread();
        throw new java.lang.IllegalStateException(str);
    }

    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("null reference");
        }
    }

    public static void checkNull(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException("non-null reference");
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkNotNull(@javax.annotation.Nullable java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    public static void checkNull(@javax.annotation.Nullable java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj2));
        }
    }

    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
