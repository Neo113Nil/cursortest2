package io.sentry.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Objects {
    private Objects() {
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hash(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static <T> T requireNonNull(T t7, String str) {
        if (t7 != null) {
            return t7;
        }
        throw new IllegalArgumentException(str);
    }
}
