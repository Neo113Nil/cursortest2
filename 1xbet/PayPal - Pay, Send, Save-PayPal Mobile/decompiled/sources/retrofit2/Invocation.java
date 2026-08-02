package retrofit2;

/* loaded from: classes5.dex */
public final class Invocation {
    private final java.lang.reflect.Method Camera2StreamConfigurationMap;
    private final java.util.List<?> getHighResolutionOutputSizeshNQ4ISI;

    @javax.annotation.Nullable
    private final java.lang.Object getHighSpeedVideoFpsRanges;
    private final java.lang.Class<?> getHighSpeedVideoSizes;

    public static <T> retrofit2.Invocation of(java.lang.Class<T> cls, T t, java.lang.reflect.Method method, java.util.List<?> list) {
        java.util.Objects.requireNonNull(cls, "service == null");
        java.util.Objects.requireNonNull(t, "instance == null");
        java.util.Objects.requireNonNull(method, "method == null");
        java.util.Objects.requireNonNull(list, "arguments == null");
        return new retrofit2.Invocation(cls, t, method, new java.util.ArrayList(list));
    }

    @java.lang.Deprecated
    public static retrofit2.Invocation of(java.lang.reflect.Method method, java.util.List<?> list) {
        java.util.Objects.requireNonNull(method, "method == null");
        java.util.Objects.requireNonNull(list, "arguments == null");
        return new retrofit2.Invocation(method.getDeclaringClass(), null, method, new java.util.ArrayList(list));
    }

    Invocation(java.lang.Class<?> cls, @javax.annotation.Nullable java.lang.Object obj, java.lang.reflect.Method method, java.util.List<?> list) {
        this.getHighSpeedVideoSizes = cls;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap = method;
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(list);
    }

    public final java.lang.Class<?> service() {
        return this.getHighSpeedVideoSizes;
    }

    @javax.annotation.Nullable
    public final java.lang.Object instance() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.reflect.Method method() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<?> arguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s.%s() %s", this.getHighSpeedVideoSizes.getName(), this.Camera2StreamConfigurationMap.getName(), this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
