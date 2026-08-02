package k6;

import a.AbstractC0603a;
import i6.InterfaceC1287d;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import w1.C1759x1;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1354a implements InterfaceC1287d, InterfaceC1357d, Serializable {
    private final InterfaceC1287d completion;

    public AbstractC1354a(InterfaceC1287d interfaceC1287d) {
        this.completion = interfaceC1287d;
    }

    public InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        t6.h.e(interfaceC1287d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC1357d getCallerFrame() {
        InterfaceC1287d interfaceC1287d = this.completion;
        if (interfaceC1287d instanceof InterfaceC1357d) {
            return (InterfaceC1357d) interfaceC1287d;
        }
        return null;
    }

    public final InterfaceC1287d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i7;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC1358e interfaceC1358e = (InterfaceC1358e) getClass().getAnnotation(InterfaceC1358e.class);
        String str2 = null;
        if (interfaceC1358e == null) {
            return null;
        }
        int v6 = interfaceC1358e.v();
        if (v6 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v6 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i7 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i7 = -1;
        }
        int i8 = i7 >= 0 ? interfaceC1358e.l()[i7] : -1;
        C1759x1 c1759x1 = AbstractC1359f.f14794b;
        C1759x1 c1759x12 = AbstractC1359f.f14793a;
        if (c1759x1 == null) {
            try {
                C1759x1 c1759x13 = new C1759x1(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                AbstractC1359f.f14794b = c1759x13;
                c1759x1 = c1759x13;
            } catch (Exception unused2) {
                AbstractC1359f.f14794b = c1759x12;
                c1759x1 = c1759x12;
            }
        }
        if (c1759x1 != c1759x12 && (method = (Method) c1759x1.f17925b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c1759x1.f17926c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) c1759x1.f17927d;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC1358e.c();
        } else {
            str = str2 + '/' + interfaceC1358e.c();
        }
        return new StackTraceElement(str, interfaceC1358e.m(), interfaceC1358e.f(), i8);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // i6.InterfaceC1287d
    public final void resumeWith(Object obj) {
        InterfaceC1287d interfaceC1287d = this;
        while (true) {
            AbstractC1354a abstractC1354a = (AbstractC1354a) interfaceC1287d;
            InterfaceC1287d interfaceC1287d2 = abstractC1354a.completion;
            t6.h.b(interfaceC1287d2);
            try {
                obj = abstractC1354a.invokeSuspend(obj);
                if (obj == j6.a.f14642a) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0603a.h(th);
            }
            abstractC1354a.releaseIntercepted();
            if (!(interfaceC1287d2 instanceof AbstractC1354a)) {
                interfaceC1287d2.resumeWith(obj);
                return;
            }
            interfaceC1287d = interfaceC1287d2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        t6.h.e(interfaceC1287d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
