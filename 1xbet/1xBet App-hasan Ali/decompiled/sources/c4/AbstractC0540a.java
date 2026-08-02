package c4;

import W3.o;
import b4.EnumC0510a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* renamed from: c4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0540a implements a4.c, InterfaceC0543d, Serializable {
    private final a4.c<Object> completion;

    public AbstractC0540a(a4.c cVar) {
        this.completion = cVar;
    }

    public a4.c<o> create(a4.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // c4.InterfaceC0543d
    public InterfaceC0543d getCallerFrame() {
        a4.c<Object> cVar = this.completion;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    public final a4.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC0544e interfaceC0544e = (InterfaceC0544e) getClass().getAnnotation(InterfaceC0544e.class);
        String str2 = null;
        if (interfaceC0544e == null) {
            return null;
        }
        int v4 = interfaceC0544e.v();
        if (v4 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v4 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i5 = i >= 0 ? interfaceC0544e.l()[i] : -1;
        H4.i iVar = AbstractC0545f.f7408b;
        H4.i iVar2 = AbstractC0545f.f7407a;
        if (iVar == null) {
            try {
                H4.i iVar3 = new H4.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                AbstractC0545f.f7408b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                AbstractC0545f.f7408b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f2376a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f2377b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = iVar.f2378c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC0544e.c();
        } else {
            str = str2 + '/' + interfaceC0544e.c();
        }
        return new StackTraceElement(str, interfaceC0544e.m(), interfaceC0544e.f(), i5);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a4.c
    public final void resumeWith(Object obj) {
        a4.c cVar = this;
        while (true) {
            AbstractC0540a abstractC0540a = (AbstractC0540a) cVar;
            a4.c cVar2 = abstractC0540a.completion;
            l.c(cVar2);
            try {
                obj = abstractC0540a.invokeSuspend(obj);
                if (obj == EnumC0510a.f7289k) {
                    return;
                }
            } catch (Throwable th) {
                obj = G4.l.p(th);
            }
            abstractC0540a.releaseIntercepted();
            if (!(cVar2 instanceof AbstractC0540a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
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

    public a4.c<o> create(Object obj, a4.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
