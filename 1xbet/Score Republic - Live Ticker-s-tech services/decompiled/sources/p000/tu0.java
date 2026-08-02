package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 implements my0 {

    /* JADX INFO: renamed from: c */
    public static final dd0 f7601c = new dd0(17);

    /* JADX INFO: renamed from: d */
    public static final C0473mk f7602d = new C0473mk(5);

    /* JADX INFO: renamed from: a */
    public InterfaceC0554or f7603a;

    /* JADX INFO: renamed from: b */
    public volatile my0 f7604b;

    public tu0(dd0 dd0Var, my0 my0Var) {
        this.f7603a = dd0Var;
        this.f7604b = my0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4850a(InterfaceC0554or interfaceC0554or) {
        my0 my0Var;
        my0 my0Var2;
        my0 my0Var3 = this.f7604b;
        C0473mk c0473mk = f7602d;
        if (my0Var3 != c0473mk) {
            interfaceC0554or.mo1169a(my0Var3);
            return;
        }
        synchronized (this) {
            my0Var = this.f7604b;
            if (my0Var != c0473mk) {
                my0Var2 = my0Var;
            } else {
                this.f7603a = new C0615qe(12, this.f7603a, interfaceC0554or);
                my0Var2 = null;
            }
        }
        if (my0Var2 != null) {
            interfaceC0554or.mo1169a(my0Var);
        }
    }

    @Override // p000.my0
    public final Object get() {
        return this.f7604b.get();
    }
}
