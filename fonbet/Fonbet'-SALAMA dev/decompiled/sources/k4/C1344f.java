package k4;

/* renamed from: k4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1344f extends AbstractC1348j {

    /* renamed from: e, reason: collision with root package name */
    public int f14776e;

    public C1344f(Object obj, Object obj2, InterfaceC1346h interfaceC1346h, InterfaceC1346h interfaceC1346h2) {
        super(obj, obj2, interfaceC1346h, interfaceC1346h2);
        this.f14776e = -1;
    }

    @Override // k4.InterfaceC1346h
    public final boolean e() {
        return false;
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
        return new C1344f(obj, obj2, interfaceC1346h, interfaceC1346h2);
    }

    @Override // k4.AbstractC1348j
    public final int n() {
        return 2;
    }

    @Override // k4.AbstractC1348j
    public final void r(AbstractC1348j abstractC1348j) {
        if (this.f14776e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        this.f14780c = abstractC1348j;
    }

    @Override // k4.InterfaceC1346h
    public final int size() {
        if (this.f14776e == -1) {
            this.f14776e = this.f14781d.size() + this.f14780c.size() + 1;
        }
        return this.f14776e;
    }
}
