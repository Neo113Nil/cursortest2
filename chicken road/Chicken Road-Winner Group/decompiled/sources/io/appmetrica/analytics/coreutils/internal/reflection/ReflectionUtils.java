package io.appmetrica.analytics.coreutils.internal.reflection;

import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean detectClassExists(String str) {
        return findClass(str) != null;
    }

    public static final Class<?> findClass(String str) {
        try {
            return Class.forName(str, false, ReflectionUtils.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isArgumentsOfClasses(Object[] objArr, Class<?>... clsArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        int length = objArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Object obj = objArr[i3];
            int i5 = i4 + 1;
            if (obj == null || !clsArr[i4].isAssignableFrom(obj.getClass())) {
                return false;
            }
            i3++;
            i4 = i5;
        }
        return true;
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(String str, Class<T> cls) {
        Constructor<T> constructor;
        try {
            Class loadClass = loadClass(str, cls);
            if (loadClass == null || (constructor = loadClass.getConstructor(new Class[0])) == null) {
                return null;
            }
            return constructor.newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> Class<T> loadClass(String str, Class<T> cls) {
        try {
            Class<T> cls2 = (Class<T>) Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(String str) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
