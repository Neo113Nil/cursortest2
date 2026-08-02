package p000;

/* JADX INFO: renamed from: hj */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0288hj extends AbstractC0213fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3218a;

    /* JADX INFO: renamed from: b */
    public final Object f3219b;

    /* JADX INFO: renamed from: c */
    public final Object f3220c;

    public /* synthetic */ C0288hj(int i, Object obj, Object obj2) {
        this.f3218a = i;
        this.f3219b = obj;
        this.f3220c = obj2;
    }

    @Override // p000.AbstractC0213fj
    /* JADX INFO: renamed from: d */
    public final void mo1875d(InterfaceC0435lj interfaceC0435lj) {
        int i = this.f3218a;
        Object obj = this.f3220c;
        Object obj2 = this.f3219b;
        switch (i) {
            case 0:
                ((AbstractC0213fj) obj2).m1874c(new C0251gj(0, interfaceC0435lj, (AbstractC0213fj) obj));
                break;
            case 1:
                C0546oj c0546oj = new C0546oj(interfaceC0435lj, (C0042ay) obj);
                interfaceC0435lj.mo608a(c0546oj);
                ((C0509nj) obj2).m1874c(c0546oj);
                break;
            case 2:
                C0251gj c0251gj = new C0251gj(1, interfaceC0435lj, (r60) obj);
                interfaceC0435lj.mo608a(c0251gj);
                ((hm0) obj2).m2293b(c0251gj);
                break;
            default:
                ((zs0) obj2).m5993v(new at0(interfaceC0435lj, (wz0) obj));
                break;
        }
    }
}
