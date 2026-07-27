package F2;

import b0.i;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final i f379a;

    public a(i iVar) {
        this.f379a = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean z3 = obj instanceof a;
        i iVar = this.f379a;
        return z3 ? iVar.equals(((a) obj).f379a) : iVar.equals(obj);
    }

    public final int hashCode() {
        return this.f379a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, i.class.getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f379a, objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getTargetException();
        } catch (ReflectiveOperationException e4) {
            throw new RuntimeException("Reflection failed for method " + method, e4);
        }
    }
}
