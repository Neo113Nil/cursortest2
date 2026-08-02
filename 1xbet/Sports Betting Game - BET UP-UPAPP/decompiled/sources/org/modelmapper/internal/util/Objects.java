package org.modelmapper.internal.util;

import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public class Objects {
    private Objects() {
    }

    public static <T> T firstNonNull(T... tArr) {
        for (T t : tArr) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public static <T> T firstNonNull(Callable<T>... callableArr) {
        for (Callable<T> callable : callableArr) {
            T call = callable.call();
            if (call != null) {
                return call;
            }
        }
        return null;
    }

    public static <T> Callable<T> callable(final T t) {
        return new Callable<T>() { // from class: org.modelmapper.internal.util.Objects.1
            @Override // org.modelmapper.internal.util.Callable
            public T call() {
                return (T) t;
            }
        };
    }

    public static <T> T instantiate(Class<T> cls) {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
