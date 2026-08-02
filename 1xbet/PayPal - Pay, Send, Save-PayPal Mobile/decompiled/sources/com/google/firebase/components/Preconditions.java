package com.google.firebase.components;

/* loaded from: classes4.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        return t;
    }

    public static void checkArgument(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static void checkState(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }
}
