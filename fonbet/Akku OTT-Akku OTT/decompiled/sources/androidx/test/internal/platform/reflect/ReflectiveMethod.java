package androidx.test.internal.platform.reflect;

import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class ReflectiveMethod<T> {
    private final String className;
    private boolean initialized = false;
    private Method method;
    private final String methodName;
    private final Class<?>[] paramTypes;

    public ReflectiveMethod(String str, String str2, Class<?>... clsArr) {
        this.className = str;
        this.paramTypes = clsArr;
        this.methodName = str2;
    }

    private synchronized void initIfNecessary() throws ClassNotFoundException, NoSuchMethodException {
        if (this.initialized) {
            return;
        }
        Method declaredMethod = Class.forName(this.className).getDeclaredMethod(this.methodName, this.paramTypes);
        this.method = declaredMethod;
        declaredMethod.setAccessible(true);
        this.initialized = true;
    }

    public T invoke(Object obj, Object... objArr) throws ReflectionException {
        try {
            initIfNecessary();
            return (T) this.method.invoke(obj, objArr);
        } catch (ClassNotFoundException e) {
            throw new ReflectionException(e);
        } catch (IllegalAccessException e2) {
            throw new ReflectionException(e2);
        } catch (NoSuchMethodException e3) {
            throw new ReflectionException(e3);
        } catch (InvocationTargetException e4) {
            throw new ReflectionException(e4);
        }
    }

    public T invokeStatic(Object... objArr) throws ReflectionException {
        return invoke(null, objArr);
    }
}
