package g2;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import o2.p;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318b implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final h f4978a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0322f f4979b;

    public C0318b(h left, InterfaceC0322f element) {
        j.e(left, "left");
        j.e(element, "element");
        this.f4978a = left;
        this.f4979b = element;
    }

    public final boolean equals(Object obj) {
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0318b) {
            C0318b c0318b = (C0318b) obj;
            c0318b.getClass();
            int i3 = 2;
            C0318b c0318b2 = c0318b;
            int i4 = 2;
            while (true) {
                h hVar = c0318b2.f4978a;
                c0318b2 = hVar instanceof C0318b ? (C0318b) hVar : null;
                if (c0318b2 == null) {
                    break;
                }
                i4++;
            }
            C0318b c0318b3 = this;
            while (true) {
                h hVar2 = c0318b3.f4978a;
                c0318b3 = hVar2 instanceof C0318b ? (C0318b) hVar2 : null;
                if (c0318b3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 == i3) {
                C0318b c0318b4 = this;
                while (true) {
                    InterfaceC0322f interfaceC0322f = c0318b4.f4979b;
                    if (!j.a(c0318b.k(interfaceC0322f.getKey()), interfaceC0322f)) {
                        z3 = false;
                        break;
                    }
                    h hVar3 = c0318b4.f4978a;
                    if (!(hVar3 instanceof C0318b)) {
                        j.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        InterfaceC0322f interfaceC0322f2 = (InterfaceC0322f) hVar3;
                        z3 = j.a(c0318b.k(interfaceC0322f2.getKey()), interfaceC0322f2);
                        break;
                    }
                    c0318b4 = (C0318b) hVar3;
                }
                if (z3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // g2.h
    public final h g(g key) {
        j.e(key, "key");
        InterfaceC0322f interfaceC0322f = this.f4979b;
        InterfaceC0322f k3 = interfaceC0322f.k(key);
        h hVar = this.f4978a;
        if (k3 != null) {
            return hVar;
        }
        h g3 = hVar.g(key);
        return g3 == hVar ? this : g3 == i.f4981a ? interfaceC0322f : new C0318b(g3, interfaceC0322f);
    }

    @Override // g2.h
    public final h h(h context) {
        j.e(context, "context");
        return context == i.f4981a ? this : (h) context.i(this, new com.startapp.sdk.components.c(2));
    }

    public final int hashCode() {
        return this.f4979b.hashCode() + this.f4978a.hashCode();
    }

    @Override // g2.h
    public final Object i(Object obj, p pVar) {
        return pVar.invoke(this.f4978a.i(obj, pVar), this.f4979b);
    }

    @Override // g2.h
    public final InterfaceC0322f k(g key) {
        j.e(key, "key");
        C0318b c0318b = this;
        while (true) {
            InterfaceC0322f k3 = c0318b.f4979b.k(key);
            if (k3 != null) {
                return k3;
            }
            h hVar = c0318b.f4978a;
            if (!(hVar instanceof C0318b)) {
                return hVar.k(key);
            }
            c0318b = (C0318b) hVar;
        }
    }

    public final String toString() {
        return "[" + ((String) i("", new com.startapp.sdk.components.c(1))) + ']';
    }
}
