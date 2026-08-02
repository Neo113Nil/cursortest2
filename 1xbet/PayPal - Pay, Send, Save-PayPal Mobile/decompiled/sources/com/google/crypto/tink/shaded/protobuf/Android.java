package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes4.dex */
final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final java.lang.Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    private Android() {
    }

    static {
        IS_ROBOLECTRIC = (ASSUME_ANDROID || getClassForName("org.robolectric.Robolectric") == null) ? false : true;
    }

    static boolean isOnAndroidDevice() {
        if (ASSUME_ANDROID) {
            return true;
        }
        return (MEMORY_CLASS == null || IS_ROBOLECTRIC) ? false : true;
    }

    static java.lang.Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    private static <T> java.lang.Class<T> getClassForName(java.lang.String str) {
        try {
            return (java.lang.Class<T>) java.lang.Class.forName(str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
