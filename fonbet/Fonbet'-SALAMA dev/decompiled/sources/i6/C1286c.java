package i6;

import io.sentry.rrweb.RRWebVideoEvent;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* renamed from: i6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1286c implements InterfaceC1292i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1292i f14065a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1290g f14066b;

    public C1286c(InterfaceC1290g interfaceC1290g, InterfaceC1292i interfaceC1292i) {
        t6.h.e(interfaceC1292i, RRWebVideoEvent.JsonKeys.LEFT);
        t6.h.e(interfaceC1290g, "element");
        this.f14065a = interfaceC1292i;
        this.f14066b = interfaceC1290g;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        if (this != obj) {
            if (!(obj instanceof C1286c)) {
                return false;
            }
            C1286c c1286c = (C1286c) obj;
            c1286c.getClass();
            int i7 = 2;
            C1286c c1286c2 = c1286c;
            int i8 = 2;
            while (true) {
                InterfaceC1292i interfaceC1292i = c1286c2.f14065a;
                c1286c2 = interfaceC1292i instanceof C1286c ? (C1286c) interfaceC1292i : null;
                if (c1286c2 == null) {
                    break;
                }
                i8++;
            }
            C1286c c1286c3 = this;
            while (true) {
                InterfaceC1292i interfaceC1292i2 = c1286c3.f14065a;
                c1286c3 = interfaceC1292i2 instanceof C1286c ? (C1286c) interfaceC1292i2 : null;
                if (c1286c3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 != i7) {
                return false;
            }
            C1286c c1286c4 = this;
            while (true) {
                InterfaceC1290g interfaceC1290g = c1286c4.f14066b;
                if (!t6.h.a(c1286c.get(interfaceC1290g.getKey()), interfaceC1290g)) {
                    z4 = false;
                    break;
                }
                InterfaceC1292i interfaceC1292i3 = c1286c4.f14065a;
                if (!(interfaceC1292i3 instanceof C1286c)) {
                    t6.h.c(interfaceC1292i3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC1290g interfaceC1290g2 = (InterfaceC1290g) interfaceC1292i3;
                    z4 = t6.h.a(c1286c.get(interfaceC1290g2.getKey()), interfaceC1290g2);
                    break;
                }
                c1286c4 = (C1286c) interfaceC1292i3;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.f14065a.fold(obj, function2), this.f14066b);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        t6.h.e(interfaceC1291h, "key");
        C1286c c1286c = this;
        while (true) {
            InterfaceC1290g interfaceC1290g = c1286c.f14066b.get(interfaceC1291h);
            if (interfaceC1290g != null) {
                return interfaceC1290g;
            }
            InterfaceC1292i interfaceC1292i = c1286c.f14065a;
            if (!(interfaceC1292i instanceof C1286c)) {
                return interfaceC1292i.get(interfaceC1291h);
            }
            c1286c = (C1286c) interfaceC1292i;
        }
    }

    public final int hashCode() {
        return this.f14066b.hashCode() + this.f14065a.hashCode();
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        t6.h.e(interfaceC1291h, "key");
        InterfaceC1290g interfaceC1290g = this.f14066b;
        InterfaceC1290g interfaceC1290g2 = interfaceC1290g.get(interfaceC1291h);
        InterfaceC1292i interfaceC1292i = this.f14065a;
        if (interfaceC1290g2 != null) {
            return interfaceC1292i;
        }
        InterfaceC1292i minusKey = interfaceC1292i.minusKey(interfaceC1291h);
        return minusKey == interfaceC1292i ? this : minusKey == C1293j.f14068a ? interfaceC1290g : new C1286c(interfaceC1290g, minusKey);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        t6.h.e(interfaceC1292i, "context");
        return interfaceC1292i == C1293j.f14068a ? this : (InterfaceC1292i) interfaceC1292i.fold(this, new C1285b(1));
    }

    public final String toString() {
        return "[" + ((String) fold("", new C1285b(0))) + ']';
    }
}
