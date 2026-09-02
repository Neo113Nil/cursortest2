package m1;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0931b implements k1.d, m1.InterfaceC0932c, java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final k1.d f8075a;

    /* renamed from: b, reason: collision with root package name */
    public final k1.i f8076b;

    /* renamed from: c, reason: collision with root package name */
    public transient k1.d f8077c;

    public AbstractC0931b(k1.d dVar, k1.i iVar) {
        this.f8075a = dVar;
        this.f8076b = iVar;
    }

    public k1.d b(java.lang.Object obj, k1.d dVar) {
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public java.lang.StackTraceElement e() {
        int i2;
        java.lang.String str;
        java.lang.reflect.Method method;
        java.lang.Object invoke;
        java.lang.reflect.Method method2;
        java.lang.Object invoke2;
        m1.InterfaceC0933d interfaceC0933d = (m1.InterfaceC0933d) getClass().getAnnotation(m1.InterfaceC0933d.class);
        java.lang.String str2 = null;
        if (interfaceC0933d == null) {
            return null;
        }
        int v2 = interfaceC0933d.v();
        if (v2 > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            i2 = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            i2 = -1;
        }
        int i3 = i2 >= 0 ? interfaceC0933d.l()[i2] : -1;
        R1.i iVar = m1.AbstractC0934e.f8079b;
        R1.i iVar2 = m1.AbstractC0934e.f8078a;
        if (iVar == null) {
            try {
                R1.i iVar3 = new R1.i(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                m1.AbstractC0934e.f8079b = iVar3;
                iVar = iVar3;
            } catch (java.lang.Exception unused2) {
                m1.AbstractC0934e.f8079b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f1700a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f1701b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            java.lang.reflect.Method method3 = iVar.f1702c;
            java.lang.Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof java.lang.String) {
                str2 = (java.lang.String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC0933d.c();
        } else {
            str = str2 + '/' + interfaceC0933d.c();
        }
        return new java.lang.StackTraceElement(str, interfaceC0933d.m(), interfaceC0933d.f(), i3);
    }

    public m1.InterfaceC0932c f() {
        k1.d dVar = this.f8075a;
        if (dVar instanceof m1.InterfaceC0932c) {
            return (m1.InterfaceC0932c) dVar;
        }
        return null;
    }

    public abstract java.lang.Object g(java.lang.Object obj);

    @Override // k1.d
    public k1.i getContext() {
        k1.i iVar = this.f8076b;
        kotlin.jvm.internal.i.b(iVar);
        return iVar;
    }

    public void h() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k1.d dVar = this.f8077c;
        if (dVar != null && dVar != this) {
            k1.g m2 = getContext().m(k1.e.f7950a);
            kotlin.jvm.internal.i.b(m2);
            E1.h hVar = (E1.h) dVar;
            do {
                atomicReferenceFieldUpdater = E1.h.f274h;
            } while (atomicReferenceFieldUpdater.get(hVar) == E1.AbstractC0000a.f264d);
            java.lang.Object obj = atomicReferenceFieldUpdater.get(hVar);
            z1.C1053f c1053f = obj instanceof z1.C1053f ? (z1.C1053f) obj : null;
            if (c1053f != null) {
                c1053f.q();
            }
        }
        this.f8077c = m1.C0930a.f8074a;
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        k1.d dVar = this;
        while (true) {
            m1.AbstractC0931b abstractC0931b = (m1.AbstractC0931b) dVar;
            k1.d dVar2 = abstractC0931b.f8075a;
            kotlin.jvm.internal.i.b(dVar2);
            try {
                obj = abstractC0931b.g(obj);
                if (obj == l1.EnumC0927a.f8017a) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = a.AbstractC0059a.i(th);
            }
            abstractC0931b.h();
            if (!(dVar2 instanceof m1.AbstractC0931b)) {
                dVar2.l(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object e2 = e();
        if (e2 == null) {
            e2 = getClass().getName();
        }
        sb.append(e2);
        return sb.toString();
    }

    public AbstractC0931b(k1.d dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}
