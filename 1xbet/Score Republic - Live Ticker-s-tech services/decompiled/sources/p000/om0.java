package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class om0 extends hm0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5787j;

    /* JADX INFO: renamed from: k */
    public final Object f5788k;

    /* JADX INFO: renamed from: l */
    public final Object f5789l;

    public /* synthetic */ om0(int i, Object obj, Object obj2) {
        this.f5787j = i;
        this.f5788k = obj;
        this.f5789l = obj2;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        int i = this.f5787j;
        Object obj = this.f5789l;
        Object obj2 = this.f5788k;
        switch (i) {
            case 0:
                ((z71) obj2).m5865a(new mm0(xm0Var, (nw0) obj, 1));
                break;
            default:
                hm0[] hm0VarArr = (hm0[]) obj2;
                int length = hm0VarArr.length;
                if (length == 1) {
                    hm0VarArr[0].m2293b(new C0472mj(xm0Var, new an0(0, this), 1));
                } else {
                    bn0 bn0Var = new bn0(xm0Var, length, (wa0) obj);
                    xm0Var.mo975a(bn0Var);
                    for (int i2 = 0; i2 < length; i2++) {
                        if (!(bn0Var.get() <= 0)) {
                            hm0 hm0Var = hm0VarArr[i2];
                            if (hm0Var == null) {
                                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                                if (bn0Var.getAndSet(0) > 0) {
                                    bn0Var.m725a(i2);
                                    bn0Var.f921j.onError(nullPointerException);
                                } else {
                                    vt1.m5196h(nullPointerException);
                                }
                            } else {
                                hm0Var.m2293b(bn0Var.f923l[i2]);
                            }
                        }
                    }
                }
                break;
        }
    }
}
