package N4;

import e2.C1930k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final C1930k f3792a;

    public a(C1930k c1930k) {
        this.f3792a = c1930k;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, C1930k.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f3792a, objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getTargetException();
        } catch (ReflectiveOperationException e5) {
            throw new RuntimeException("Reflection failed for method " + method, e5);
        }
    }
}
