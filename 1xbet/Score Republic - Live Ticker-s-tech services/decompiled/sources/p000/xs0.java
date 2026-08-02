package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends z71 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9048a;

    /* JADX INFO: renamed from: b */
    public final Object f9049b;

    /* JADX INFO: renamed from: c */
    public final Object f9050c;

    public /* synthetic */ xs0(int i, Object obj, Object obj2) {
        this.f9048a = i;
        this.f9049b = obj;
        this.f9050c = obj2;
    }

    @Override // p000.z71
    /* JADX INFO: renamed from: b */
    public final void mo602b(c81 c81Var) {
        int i = this.f9048a;
        Object obj = this.f9050c;
        Object obj2 = this.f9049b;
        switch (i) {
            case 0:
                ((zs0) obj2).m5993v(new ws0(c81Var, (g72) obj));
                break;
            case 1:
                ((xs0) obj2).m5865a(new f50(this, c81Var, 29, false));
                break;
            case 2:
                ((z71) obj2).m5865a(new a81(0, this, c81Var));
                break;
            default:
                ((z71) obj2).m5865a(new C0251gj(5, c81Var, (CallableC0445lt) obj));
                break;
        }
    }
}
