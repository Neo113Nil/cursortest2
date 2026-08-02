package p000;

/* JADX INFO: renamed from: ik */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0325ik implements f60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3591j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f3592k;

    public /* synthetic */ C0325ik(int i, Object obj) {
        this.f3591j = i;
        this.f3592k = obj;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: a */
    public final Object mo1083a() {
        int i = this.f3591j;
        Object obj = this.f3592k;
        switch (i) {
            case 0:
                C0149dt c0149dt = new C0149dt();
                ((DialogC0362jk) obj).m2918c().m2152b().m1656b(c0149dt);
                return c0149dt;
            case 1:
                return new gu0(new RunnableC0944za(2, (DialogC0362jk) obj));
            default:
                return new eu0((gu0) obj);
        }
    }
}
