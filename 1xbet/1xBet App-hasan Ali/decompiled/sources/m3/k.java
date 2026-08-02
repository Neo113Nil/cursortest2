package m3;

/* loaded from: classes.dex */
public final class k implements InterfaceC2094d, InterfaceC2092b, InterfaceC2093c {

    /* renamed from: l, reason: collision with root package name */
    public static k f18076l;

    /* renamed from: m, reason: collision with root package name */
    public static final l f18077m = new l(0, 0, 0, false, false);

    /* renamed from: k, reason: collision with root package name */
    public Object f18078k;

    public /* synthetic */ k(Object obj) {
        this.f18078k = obj;
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f18076l == null) {
                    f18076l = new k();
                }
                kVar = f18076l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    @Override // m3.InterfaceC2092b
    public void L(int i) {
        ((k3.g) this.f18078k).L(i);
    }

    @Override // m3.InterfaceC2092b
    public void N() {
        ((k3.g) this.f18078k).N();
    }

    @Override // m3.InterfaceC2093c
    public void Y(j3.b bVar) {
        ((k3.h) this.f18078k).Y(bVar);
    }

    @Override // m3.InterfaceC2094d
    public void a(j3.b bVar) {
        boolean z3 = bVar.f17502l == 0;
        AbstractC2095e abstractC2095e = (AbstractC2095e) this.f18078k;
        if (z3) {
            abstractC2095e.b(null, abstractC2095e.s());
            return;
        }
        InterfaceC2093c interfaceC2093c = abstractC2095e.f18036p;
        if (interfaceC2093c != null) {
            interfaceC2093c.Y(bVar);
        }
    }
}
