package k4;

/* renamed from: k4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1347i extends AbstractC1348j {
    @Override // k4.InterfaceC1346h
    public final boolean e() {
        return true;
    }

    @Override // k4.AbstractC1348j
    public final AbstractC1348j l(Object obj, Object obj2, InterfaceC1346h interfaceC1346h, InterfaceC1346h interfaceC1346h2) {
        if (obj == null) {
            obj = this.f14778a;
        }
        if (obj2 == null) {
            obj2 = this.f14779b;
        }
        if (interfaceC1346h == null) {
            interfaceC1346h = this.f14780c;
        }
        if (interfaceC1346h2 == null) {
            interfaceC1346h2 = this.f14781d;
        }
        return new C1347i(obj, obj2, interfaceC1346h, interfaceC1346h2);
    }

    @Override // k4.AbstractC1348j
    public final int n() {
        return 1;
    }

    @Override // k4.InterfaceC1346h
    public final int size() {
        return this.f14781d.size() + this.f14780c.size() + 1;
    }
}
