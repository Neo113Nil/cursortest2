package org.modelmapper.internal.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Members {
    private Members() {
    }

    public static Method methodFor(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (!method.isBridge() && !method.isSynthetic() && method.getName().equals(str) && ((clsArr == null && method.getParameterTypes().length == 0) || Arrays.equals(method.getParameterTypes(), clsArr))) {
                return method;
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            Method methodFor = methodFor(cls2, str, clsArr);
            if (methodFor != null) {
                return methodFor;
            }
        }
        return methodFor(cls.getSuperclass(), str, clsArr);
    }

    public static Field fieldFor(Class<?> cls, String str) {
        while (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().equals(str)) {
                    return field;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }
}
