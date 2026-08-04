package p077k6;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p065i6.d;
import p155w1.C1050x1;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements d, d, Serializable {
    private final d completion;

    public a(d dVar) {
        this.completion = dVar;
    }

    public d create(d dVar) {
        h.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        d dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i7 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        C1050x1 c1050x1 = f.f14800b;
        C1050x1 c1050x2 = f.f14799a;
        if (c1050x1 == null) {
            try {
                C1050x1 c1050x3 = new C1050x1(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                f.f14800b = c1050x3;
                c1050x1 = c1050x3;
            } catch (Exception unused2) {
                f.f14800b = c1050x2;
                c1050x1 = c1050x2;
            }
        }
        if (c1050x1 != c1050x2 && (method = (Method) c1050x1.f17931b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c1050x1.f17932c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) c1050x1.f17933d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i7);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p065i6.d
    public final void resumeWith(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.completion;
            h.b(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == j6.a.f14648a) {
                    return;
                }
            } catch (Throwable th) {
                obj = p003a.a.h(th);
            }
            aVar.releaseIntercepted();
            if (!(dVar2 instanceof a)) {
                dVar2.resumeWith(obj);
                return;
            }
            dVar = dVar2;
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

    public d create(Object obj, d dVar) {
        h.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
