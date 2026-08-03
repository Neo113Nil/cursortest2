package io.appmetrica.analytics.coreutils.internal.reflection;

/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean detectClassExists(java.lang.String str) {
        return findClass(str) != null;
    }

    public static final java.lang.Class<?> findClass(java.lang.String str) {
        try {
            return java.lang.Class.forName(str, false, io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils.class.getClassLoader());
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final boolean isArgumentsOfClasses(java.lang.Object[] objArr, java.lang.Class<?>... clsArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        int length = objArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            java.lang.Object obj = objArr[i2];
            int i4 = i3 + 1;
            if (obj == null || !clsArr[i3].isAssignableFrom(obj.getClass())) {
                return false;
            }
            i2++;
            i3 = i4;
        }
        return true;
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(java.lang.String str, java.lang.Class<T> cls) {
        java.lang.reflect.Constructor<T> constructor;
        try {
            java.lang.Class loadClass = loadClass(str, cls);
            if (loadClass == null || (constructor = loadClass.getConstructor(null)) == null) {
                return null;
            }
            return constructor.newInstance(null);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final <T> java.lang.Class<T> loadClass(java.lang.String str, java.lang.Class<T> cls) {
        try {
            java.lang.Class<T> cls2 = (java.lang.Class<T>) java.lang.Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
