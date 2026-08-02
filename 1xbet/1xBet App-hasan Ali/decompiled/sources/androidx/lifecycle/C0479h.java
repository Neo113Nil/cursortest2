package androidx.lifecycle;

import c.AbstractC0518E;
import c.C0514A;
import c.C0519F;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479h implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7054k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7055l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f7056m;

    public C0479h(InterfaceC0477f interfaceC0477f, InterfaceC0489s interfaceC0489s) {
        kotlin.jvm.internal.l.f("defaultLifecycleObserver", interfaceC0477f);
        this.f7055l = interfaceC0477f;
        this.f7056m = interfaceC0489s;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        switch (this.f7054k) {
            case 0:
                int i = AbstractC0478g.f7053a[enumC0486o.ordinal()];
                InterfaceC0477f interfaceC0477f = (InterfaceC0477f) this.f7055l;
                switch (i) {
                    case 1:
                        interfaceC0477f.f(interfaceC0491u);
                        break;
                    case 2:
                        interfaceC0477f.k(interfaceC0491u);
                        break;
                    case 3:
                        interfaceC0477f.b(interfaceC0491u);
                        break;
                    case 4:
                        interfaceC0477f.i(interfaceC0491u);
                        break;
                    case 5:
                        interfaceC0477f.l(interfaceC0491u);
                        break;
                    case 6:
                        interfaceC0477f.d(interfaceC0491u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new D2.e();
                }
                InterfaceC0489s interfaceC0489s = (InterfaceC0489s) this.f7056m;
                if (interfaceC0489s != null) {
                    interfaceC0489s.h(interfaceC0491u, enumC0486o);
                    return;
                }
                return;
            case 1:
                if (enumC0486o == EnumC0486o.ON_START) {
                    ((L) this.f7055l).k(this);
                    ((v3.g) this.f7056m).D();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C0473b) this.f7056m).f7044a;
                List list = (List) hashMap.get(enumC0486o);
                InterfaceC0490t interfaceC0490t = (InterfaceC0490t) this.f7055l;
                C0473b.a(list, interfaceC0491u, enumC0486o, interfaceC0490t);
                C0473b.a((List) hashMap.get(EnumC0486o.ON_ANY), interfaceC0491u, enumC0486o, interfaceC0490t);
                return;
            default:
                int i5 = AbstractC0518E.f7306a[enumC0486o.ordinal()];
                C0514A c0514a = (C0514A) this.f7055l;
                if (i5 == 1) {
                    c0514a.g(true);
                    return;
                }
                if (i5 == 2) {
                    c0514a.g(false);
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    c0514a.e();
                    ((L) this.f7056m).k(this);
                    return;
                }
        }
    }

    public C0479h(InterfaceC0490t interfaceC0490t) {
        this.f7055l = interfaceC0490t;
        C0475d c0475d = C0475d.f7048c;
        Class<?> cls = interfaceC0490t.getClass();
        C0473b c0473b = (C0473b) c0475d.f7049a.get(cls);
        this.f7056m = c0473b == null ? c0475d.a(cls, null) : c0473b;
    }

    public C0479h(L l5, v3.g gVar) {
        this.f7055l = l5;
        this.f7056m = gVar;
    }

    public C0479h(C0514A c0514a, C0519F c0519f, L l5) {
        this.f7055l = c0514a;
        this.f7056m = l5;
    }
}
