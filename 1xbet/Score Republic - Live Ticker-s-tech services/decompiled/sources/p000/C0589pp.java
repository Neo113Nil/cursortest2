package p000;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0589pp extends xb1 implements h60 {

    /* JADX INFO: renamed from: n */
    public Throwable f6223n;

    /* JADX INFO: renamed from: o */
    public int f6224o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0848wp f6225p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0589pp(C0848wp c0848wp, InterfaceC0808vm interfaceC0808vm) {
        super(1, interfaceC0808vm);
        this.f6225p = c0848wp;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        return new C0589pp(this.f6225p, (InterfaceC0808vm) obj).mo17m(kf1.f4365a);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) {
        Throwable th;
        aa1 a01Var;
        int i = this.f6224o;
        C0848wp c0848wp = this.f6225p;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i == 0) {
                wo1.m5395v(obj);
                this.f6224o = 1;
                obj = C0848wp.m5404g(c0848wp, true, this);
                if (obj == enumC0513nn) {
                    return enumC0513nn;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.f6223n;
                    wo1.m5395v(obj);
                    a01Var = new a01(th, ((Number) obj).intValue());
                    return new kv0(a01Var, Boolean.TRUE);
                }
                wo1.m5395v(obj);
            }
            a01Var = (aa1) obj;
        } catch (Throwable th2) {
            g81 g81VarM5405h = c0848wp.m5405h();
            this.f6223n = th2;
            this.f6224o = 2;
            Integer numM1996a = g81VarM5405h.m1996a();
            if (numM1996a != enumC0513nn) {
                obj = numM1996a;
                th = th2;
            }
            return enumC0513nn;
        }
        return new kv0(a01Var, Boolean.TRUE);
    }
}
