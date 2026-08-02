package D6;

import i6.AbstractC1284a;
import i6.C1288e;
import i6.C1293j;
import i6.InterfaceC1289f;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public abstract class A extends AbstractC1284a implements InterfaceC1289f {

    /* renamed from: b, reason: collision with root package name */
    public static final C0142z f1773b = new C0142z(C1288e.f14067a, C0141y.f1889a);

    public A() {
        super(C1288e.f14067a);
    }

    public abstract void d(InterfaceC1292i interfaceC1292i, Runnable runnable);

    public boolean e() {
        return !(this instanceof F0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, t6.i] */
    @Override // i6.AbstractC1284a, i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        InterfaceC1290g interfaceC1290g;
        t6.h.e(interfaceC1291h, "key");
        if (!(interfaceC1291h instanceof C0142z)) {
            if (C1288e.f14067a == interfaceC1291h) {
                return this;
            }
            return null;
        }
        C0142z c0142z = (C0142z) interfaceC1291h;
        InterfaceC1291h interfaceC1291h2 = this.f14063a;
        if ((interfaceC1291h2 == c0142z || c0142z.f1894b == interfaceC1291h2) && (interfaceC1290g = (InterfaceC1290g) c0142z.f1893a.invoke(this)) != null) {
            return interfaceC1290g;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, t6.i] */
    @Override // i6.AbstractC1284a, i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        t6.h.e(interfaceC1291h, "key");
        boolean z4 = interfaceC1291h instanceof C0142z;
        C1293j c1293j = C1293j.f14068a;
        if (z4) {
            C0142z c0142z = (C0142z) interfaceC1291h;
            InterfaceC1291h interfaceC1291h2 = this.f14063a;
            if ((interfaceC1291h2 == c0142z || c0142z.f1894b == interfaceC1291h2) && ((InterfaceC1290g) c0142z.f1893a.invoke(this)) != null) {
                return c1293j;
            }
        } else if (C1288e.f14067a == interfaceC1291h) {
            return c1293j;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + E.i(this);
    }
}
