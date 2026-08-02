package dagger.internal;

/* loaded from: classes5.dex */
public final class Preconditions {
    public static <T> T checkNotNull(T t) {
        return t;
    }

    public static <T> T checkNotNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    public static <T> T checkNotNullFromProvides(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNullFromComponent(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNull(T t, java.lang.String str, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        if (str.contains("%s")) {
            if (str.indexOf("%s") != str.lastIndexOf("%s")) {
                throw new java.lang.IllegalArgumentException("errorMessageTemplate has more than one format specifier");
            }
            if (obj instanceof java.lang.Class) {
                obj = ((java.lang.Class) obj).getCanonicalName();
            }
            throw new java.lang.NullPointerException(str.replace("%s", java.lang.String.valueOf(obj)));
        }
        throw new java.lang.IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }

    public static <T> void checkBuilderRequirement(T t, java.lang.Class<T> cls) {
        if (t != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls.getCanonicalName());
        sb.append(" must be set");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private Preconditions() {
    }
}
