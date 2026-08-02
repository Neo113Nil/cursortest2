package androidx.core.util;

/* loaded from: classes3.dex */
public class ObjectsCompat {
    public static <T> T requireNonNull(T t) {
        return t;
    }

    private ObjectsCompat() {
    }

    public static boolean equals(java.lang.Object obj, java.lang.Object obj2) {
        return java.util.Objects.equals(obj, obj2);
    }

    public static int hashCode(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static int hash(java.lang.Object... objArr) {
        return java.util.Objects.hash(objArr);
    }

    public static java.lang.String toString(java.lang.Object obj, java.lang.String str) {
        return obj != null ? obj.toString() : str;
    }

    public static <T> T requireNonNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }
}
