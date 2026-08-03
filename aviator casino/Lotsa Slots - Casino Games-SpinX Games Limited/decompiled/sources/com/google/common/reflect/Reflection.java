package com.google.common.reflect;

@com.google.common.reflect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class Reflection {
    public static java.lang.String getPackageName(java.lang.Class<?> clazz) {
        return getPackageName(clazz.getName());
    }

    public static java.lang.String getPackageName(java.lang.String classFullName) {
        int lastIndexOf = classFullName.lastIndexOf(46);
        return lastIndexOf < 0 ? "" : classFullName.substring(0, lastIndexOf);
    }

    public static void initialize(java.lang.Class<?>... classes) {
        for (java.lang.Class<?> cls : classes) {
            try {
                java.lang.Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (java.lang.ClassNotFoundException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }

    public static <T> T newProxy(java.lang.Class<T> interfaceType, java.lang.reflect.InvocationHandler handler) {
        com.google.common.base.Preconditions.checkNotNull(handler);
        com.google.common.base.Preconditions.checkArgument(interfaceType.isInterface(), "%s is not an interface", interfaceType);
        return interfaceType.cast(java.lang.reflect.Proxy.newProxyInstance(interfaceType.getClassLoader(), new java.lang.Class[]{interfaceType}, handler));
    }

    private Reflection() {
    }
}
