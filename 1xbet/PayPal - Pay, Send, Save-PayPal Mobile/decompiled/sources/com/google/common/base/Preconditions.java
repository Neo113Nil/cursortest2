package com.google.common.base;

/* loaded from: classes.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        return t;
    }

    private Preconditions() {
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new java.lang.IllegalArgumentException();
        }
    }

    public static void checkArgument(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.stringValueOf(obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, objArr));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, char c, char c2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, char c, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, char c, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, char c, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, java.lang.Character.valueOf(c), obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, int i, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, int i, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, long j, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, long j, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, long j, long j2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, long j, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, java.lang.Long.valueOf(j), obj));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, char c) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, int i) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, long j) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkArgument(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    public static void checkState(boolean z) {
        if (!z) {
            throw new java.lang.IllegalStateException();
        }
    }

    public static void checkState(boolean z, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.stringValueOf(obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object... objArr) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, objArr));
        }
    }

    public static void checkState(boolean z, java.lang.String str, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, char c, char c2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, char c, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, char c, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, char c, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, java.lang.Character.valueOf(c), obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, int i, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, int i, int i2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, int i, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, long j, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, long j, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, long j, long j2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, long j, java.lang.Object obj) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, java.lang.Long.valueOf(j), obj));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, char c) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, int i) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, long j) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, obj2));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3));
        }
    }

    public static void checkState(boolean z, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (!z) {
            throw new java.lang.IllegalStateException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3, obj4));
        }
    }

    public static <T> T checkNotNull(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.stringValueOf(obj));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object... objArr) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, objArr));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, char c, char c2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Character.valueOf(c2)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, char c, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, char c, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Character.valueOf(c), java.lang.Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, char c, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, java.lang.Character.valueOf(c), obj));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, int i, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, int i, int i2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, int i, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, int i, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, java.lang.Integer.valueOf(i), obj));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, long j, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, long j, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, long j, long j2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Strings.lenientFormat(str, java.lang.Long.valueOf(j), java.lang.Long.valueOf(j2)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, long j, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, java.lang.Long.valueOf(j), obj));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, char c) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, int i) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, long j) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, java.lang.Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, obj2));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3));
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(com.google.common.base.Platform.lenientFormat(str, obj, obj2, obj3, obj4));
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static int checkElementIndex(int i, int i2, java.lang.String str) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException(badElementIndex(i, i2, str));
        }
        return i;
    }

    private static java.lang.String badElementIndex(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("negative size: ".concat(java.lang.String.valueOf(i2)));
        }
        return com.google.common.base.Strings.lenientFormat("%s (%s) must be less than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static int checkPositionIndex(int i, int i2, java.lang.String str) {
        if (i < 0 || i > i2) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndex(i, i2, str));
        }
        return i;
    }

    private static java.lang.String badPositionIndex(int i, int i2, java.lang.String str) {
        if (i < 0) {
            return com.google.common.base.Strings.lenientFormat("%s (%s) must not be negative", str, java.lang.Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("negative size: ".concat(java.lang.String.valueOf(i2)));
        }
        return com.google.common.base.Strings.lenientFormat("%s (%s) must not be greater than size (%s)", str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException(badPositionIndexes(i, i2, i3));
        }
    }

    private static java.lang.String badPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return badPositionIndex(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return badPositionIndex(i2, i3, "end index");
        }
        return com.google.common.base.Strings.lenientFormat("end index (%s) must not be less than start index (%s)", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
    }
}
