package i2;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import g2.C0320d;
import g2.InterfaceC0319c;
import g2.InterfaceC0322f;
import g2.h;
import h2.EnumC0326a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import w2.C1227f;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0343b implements InterfaceC0319c, InterfaceC0344c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0319c f5028a;

    /* renamed from: b, reason: collision with root package name */
    public final h f5029b;

    /* renamed from: c, reason: collision with root package name */
    public transient InterfaceC0319c f5030c;

    public AbstractC0343b(InterfaceC0319c interfaceC0319c, h hVar) {
        this.f5028a = interfaceC0319c;
        this.f5029b = hVar;
    }

    public InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC0344c c() {
        InterfaceC0319c interfaceC0319c = this.f5028a;
        if (interfaceC0319c instanceof InterfaceC0344c) {
            return (InterfaceC0344c) interfaceC0319c;
        }
        return null;
    }

    public StackTraceElement d() {
        int i3;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        InterfaceC0345d interfaceC0345d = (InterfaceC0345d) getClass().getAnnotation(InterfaceC0345d.class);
        String str2 = null;
        if (interfaceC0345d == null) {
            return null;
        }
        int v3 = interfaceC0345d.v();
        if (v3 > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v3 + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i3 = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i3 = -1;
        }
        int i4 = i3 >= 0 ? interfaceC0345d.l()[i3] : -1;
        e eVar = f.f5035b;
        e eVar2 = f.f5034a;
        if (eVar == null) {
            try {
                e eVar3 = new e(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f5035b = eVar3;
                eVar = eVar3;
            } catch (Exception unused2) {
                f.f5035b = eVar2;
                eVar = eVar2;
            }
        }
        if (eVar != eVar2 && (method = eVar.f5031a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = eVar.f5032b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = eVar.f5033c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = interfaceC0345d.c();
        } else {
            str = str2 + IOUtils.DIR_SEPARATOR_UNIX + interfaceC0345d.c();
        }
        return new StackTraceElement(str, interfaceC0345d.m(), interfaceC0345d.f(), i4);
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        InterfaceC0319c interfaceC0319c = this;
        while (true) {
            AbstractC0343b abstractC0343b = (AbstractC0343b) interfaceC0319c;
            InterfaceC0319c interfaceC0319c2 = abstractC0343b.f5028a;
            j.b(interfaceC0319c2);
            try {
                obj = abstractC0343b.g(obj);
                if (obj == EnumC0326a.f4994a) {
                    return;
                }
            } catch (Throwable th) {
                obj = X0.a.n(th);
            }
            abstractC0343b.h();
            if (!(interfaceC0319c2 instanceof AbstractC0343b)) {
                interfaceC0319c2.e(obj);
                return;
            }
            interfaceC0319c = interfaceC0319c2;
        }
    }

    public abstract Object g(Object obj);

    @Override // g2.InterfaceC0319c
    public h getContext() {
        h hVar = this.f5029b;
        j.b(hVar);
        return hVar;
    }

    public void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0319c interfaceC0319c = this.f5030c;
        if (interfaceC0319c != null && interfaceC0319c != this) {
            InterfaceC0322f k3 = getContext().k(C0320d.f4980a);
            j.b(k3);
            B2.h hVar = (B2.h) interfaceC0319c;
            do {
                atomicReferenceFieldUpdater = B2.h.f158h;
            } while (atomicReferenceFieldUpdater.get(hVar) == B2.a.f149d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C1227f c1227f = obj instanceof C1227f ? (C1227f) obj : null;
            if (c1227f != null) {
                c1227f.p();
            }
        }
        this.f5030c = C0342a.f5027a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object d3 = d();
        if (d3 == null) {
            d3 = getClass().getName();
        }
        sb.append(d3);
        return sb.toString();
    }

    public AbstractC0343b(InterfaceC0319c interfaceC0319c) {
        this(interfaceC0319c, interfaceC0319c != null ? interfaceC0319c.getContext() : null);
    }
}
