package a0;

import Y.g;
import Y.i;
import a.AbstractC0018a;
import g0.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.C0048e;
import r0.AbstractC0088a;

/* loaded from: classes.dex */
public abstract class b implements Y.d, c, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Y.d f418b;

    /* renamed from: c, reason: collision with root package name */
    public final i f419c;

    /* renamed from: d, reason: collision with root package name */
    public transient Y.d f420d;

    public b(Y.d dVar) {
        i h2 = dVar != null ? dVar.h() : null;
        this.f418b = dVar;
        this.f419c = h2;
    }

    public Y.d b(Y.d dVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object c(Object obj);

    @Override // a0.c
    public final c f() {
        Y.d dVar = this.f418b;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // Y.d
    public final i h() {
        i iVar = this.f419c;
        h.b(iVar);
        return iVar;
    }

    @Override // Y.d
    public final void k(Object obj) {
        Y.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            Y.d dVar2 = bVar.f418b;
            h.b(dVar2);
            try {
                obj = bVar.c(obj);
                if (obj == Z.a.f411b) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0018a.h(th);
            }
            Y.d dVar3 = bVar.f420d;
            if (dVar3 != null && dVar3 != bVar) {
                i iVar = bVar.f419c;
                h.b(iVar);
                g d2 = iVar.d(Y.e.f409b);
                h.b(d2);
                r0.h hVar = (r0.h) dVar3;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.h.f1168i;
                while (atomicReferenceFieldUpdater.get(hVar) == AbstractC0088a.f1158d) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(hVar);
                C0048e c0048e = obj2 instanceof C0048e ? (C0048e) obj2 : null;
                if (c0048e != null) {
                    c0048e.n();
                }
            }
            bVar.f420d = a.f417b;
            if (!(dVar2 instanceof b)) {
                dVar2.k(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        d dVar = (d) getClass().getAnnotation(d.class);
        String str2 = null;
        if (dVar != null && dVar.v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i2 = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i2 = -1;
            }
            int i3 = i2 >= 0 ? dVar.l()[i2] : -1;
            E.b bVar = e.f422b;
            E.b bVar2 = e.f421a;
            if (bVar == null) {
                try {
                    E.b bVar3 = new E.b(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    e.f422b = bVar3;
                    bVar = bVar3;
                } catch (Exception unused2) {
                    e.f422b = bVar2;
                    bVar = bVar2;
                }
            }
            if (bVar != bVar2 && (method = (Method) bVar.f18a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) bVar.f19b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = (Method) bVar.f20c;
                String invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
            }
            if (str2 == null) {
                str = dVar.c();
            } else {
                str = str2 + '/' + dVar.c();
            }
            str2 = new StackTraceElement(str, dVar.m(), dVar.f(), i3);
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        sb.append((Object) str2);
        return sb.toString();
    }
}
