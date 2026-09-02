package O0;

import M0.i;
import b1.C0017e;
import g1.h;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class b implements M0.d, c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final M0.d f276a;

    /* renamed from: b, reason: collision with root package name */
    public final i f277b;

    /* renamed from: c, reason: collision with root package name */
    public transient M0.d f278c;

    public b(M0.d dVar) {
        i context = dVar != null ? dVar.getContext() : null;
        this.f276a = dVar;
        this.f277b = context;
    }

    public M0.d a(Object obj, M0.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public abstract Object b(Object obj);

    @Override // O0.c
    public final c c() {
        M0.d dVar = this.f276a;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    @Override // M0.d
    public final void f(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        M0.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            M0.d dVar2 = bVar.f276a;
            j.b(dVar2);
            try {
                obj = bVar.b(obj);
                if (obj == N0.a.f260a) {
                    return;
                }
            } catch (Throwable th) {
                obj = V.a.k(th);
            }
            M0.d dVar3 = bVar.f278c;
            if (dVar3 != null && dVar3 != bVar) {
                i iVar = bVar.f277b;
                j.b(iVar);
                M0.g i2 = iVar.i(M0.e.f225a);
                j.b(i2);
                h hVar = (h) dVar3;
                do {
                    atomicReferenceFieldUpdater = h.f1149h;
                } while (atomicReferenceFieldUpdater.get(hVar) == g1.a.f1139d);
                Object obj2 = atomicReferenceFieldUpdater.get(hVar);
                C0017e c0017e = obj2 instanceof C0017e ? (C0017e) obj2 : null;
                if (c0017e != null) {
                    c0017e.m();
                }
            }
            bVar.f278c = a.f275a;
            if (!(dVar2 instanceof b)) {
                dVar2.f(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    @Override // M0.d
    public final i getContext() {
        i iVar = this.f277b;
        j.b(iVar);
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
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
        if (dVar != null) {
            int v2 = dVar.v();
            if (v2 > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v2 + ". Please update the Kotlin standard library.").toString());
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
            int i3 = i2 >= 0 ? dVar.l()[i2] : -1;
            e eVar = f.f283b;
            e eVar2 = f.f282a;
            if (eVar == null) {
                try {
                    e eVar3 = new e(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    f.f283b = eVar3;
                    eVar = eVar3;
                } catch (Exception unused2) {
                    f.f283b = eVar2;
                    eVar = eVar2;
                }
            }
            if (eVar != eVar2 && (method = eVar.f279a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = eVar.f280b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
                Method method3 = eVar.f281c;
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
