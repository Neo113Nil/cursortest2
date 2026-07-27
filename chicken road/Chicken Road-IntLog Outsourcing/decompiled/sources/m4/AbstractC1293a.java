package m4;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l.W;
import l4.EnumC1260a;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1293a implements InterfaceC1218d, d, Serializable {
    private final InterfaceC1218d completion;

    public AbstractC1293a(InterfaceC1218d interfaceC1218d) {
        this.completion = interfaceC1218d;
    }

    public InterfaceC1218d create(InterfaceC1218d completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.completion;
        if (interfaceC1218d instanceof d) {
            return (d) interfaceC1218d;
        }
        return null;
    }

    public final InterfaceC1218d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? eVar.l()[i2] : -1;
        W w3 = f.f11209b;
        W w5 = f.f11208a;
        if (w3 == null) {
            try {
                W w6 = new W(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f11209b = w6;
                w3 = w6;
            } catch (Exception unused2) {
                f.f11209b = w5;
                w3 = w5;
            }
        }
        if (w3 != w5 && (method = w3.f10820a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = w3.f10821b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = w3.f10822c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        InterfaceC1218d interfaceC1218d = this;
        while (true) {
            AbstractC1293a abstractC1293a = (AbstractC1293a) interfaceC1218d;
            InterfaceC1218d interfaceC1218d2 = abstractC1293a.completion;
            i.b(interfaceC1218d2);
            try {
                obj = abstractC1293a.invokeSuspend(obj);
                if (obj == EnumC1260a.f11058a) {
                    return;
                }
            } catch (Throwable th) {
                obj = e5.g.l(th);
            }
            abstractC1293a.releaseIntercepted();
            if (!(interfaceC1218d2 instanceof AbstractC1293a)) {
                interfaceC1218d2.resumeWith(obj);
                return;
            }
            interfaceC1218d = interfaceC1218d2;
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

    public InterfaceC1218d create(Object obj, InterfaceC1218d completion) {
        i.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
