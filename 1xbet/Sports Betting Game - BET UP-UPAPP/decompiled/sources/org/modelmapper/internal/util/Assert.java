package org.modelmapper.internal.util;

/* loaded from: classes4.dex */
public final class Assert {
    private Assert() {
    }

    public static void isNull(Object obj) {
        if (obj != null) {
            throw new IllegalArgumentException();
        }
    }

    public static void isNull(Object obj, String str, Object... objArr) {
        if (obj != null) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void isTrue(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void isTrue(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static <T> T notNull(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T notNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " cannot be null");
    }

    public static void state(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void state(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
