package retrofit2;

/* loaded from: classes5.dex */
final class DefaultMethodSupport {

    @javax.annotation.Nullable
    private static java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> getHighSpeedVideoFpsRangesFor;

    @javax.annotation.Nullable
    static java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.reflect.Method method, java.lang.Class<?> cls, java.lang.Object obj, @javax.annotation.Nullable java.lang.Object[] objArr) throws java.lang.Throwable {
        java.lang.reflect.Constructor<java.lang.invoke.MethodHandles.Lookup> constructor = getHighSpeedVideoFpsRangesFor;
        if (constructor == null) {
            constructor = java.lang.invoke.MethodHandles.Lookup.class.getDeclaredConstructor(java.lang.Class.class, java.lang.Integer.TYPE);
            constructor.setAccessible(true);
            getHighSpeedVideoFpsRangesFor = constructor;
        }
        return constructor.newInstance(cls, -1).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    private DefaultMethodSupport() {
    }
}
