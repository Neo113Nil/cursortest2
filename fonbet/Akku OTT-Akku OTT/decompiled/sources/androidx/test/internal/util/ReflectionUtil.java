package androidx.test.internal.util;

import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
/* loaded from: classes3.dex */
public class ReflectionUtil {
    private static final String TAG = "ReflectionUtil";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class ReflectionException extends Exception {
        public ReflectionException(Exception exc) {
            super("Reflective call failed", exc);
        }
    }

    public static class ReflectionParams {
        final Class<?> type;
        final Object value;

        public ReflectionParams(Class<?> cls, Object obj) {
            this.type = cls;
            this.value = obj;
        }

        public static Class<?>[] getTypes(ReflectionParams[] reflectionParamsArr) {
            Class<?>[] clsArr = new Class[reflectionParamsArr.length];
            for (int i = 0; i < reflectionParamsArr.length; i++) {
                clsArr[i] = reflectionParamsArr[i].type;
            }
            return clsArr;
        }

        public static Object[] getValues(ReflectionParams[] reflectionParamsArr) {
            Object[] objArr = new Object[reflectionParamsArr.length];
            for (int i = 0; i < reflectionParamsArr.length; i++) {
                objArr[i] = reflectionParamsArr[i].value;
            }
            return objArr;
        }
    }

    public static Object callStaticMethod(String str, String str2, ReflectionParams... reflectionParamsArr) throws ReflectionException {
        try {
            return callStaticMethod(Class.forName(str), str2, reflectionParamsArr);
        } catch (ClassNotFoundException e) {
            throw new ReflectionException(e);
        }
    }

    public static Object callStaticMethod(Class<?> cls, String str, ReflectionParams... reflectionParamsArr) throws ReflectionException {
        try {
            Class<?>[] types = ReflectionParams.getTypes(reflectionParamsArr);
            Object[] values = ReflectionParams.getValues(reflectionParamsArr);
            Method declaredMethod = cls.getDeclaredMethod(str, types);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, values);
        } catch (IllegalAccessException e) {
            throw new ReflectionException(e);
        } catch (NoSuchMethodException e2) {
            throw new ReflectionException(e2);
        } catch (InvocationTargetException e3) {
            throw new ReflectionException(e3);
        }
    }
}
