package p000;

import java.io.IOException;

/* JADX INFO: renamed from: hp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0294hp extends xb1 implements x60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f3279n = 1;

    /* JADX INFO: renamed from: o */
    public int f3280o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f3281p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0294hp(C0848wp c0848wp, InterfaceC0808vm interfaceC0808vm) {
        super(3, interfaceC0808vm);
        this.f3281p = c0848wp;
    }

    @Override // p000.x60
    /* JADX INFO: renamed from: e */
    public final Object mo928e(Object obj, Object obj2, Object obj3) {
        int i = this.f3279n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return new C0294hp((C0848wp) this.f3281p, (InterfaceC0808vm) obj3).mo17m(kf1Var);
            default:
                ((Boolean) obj2).getClass();
                C0294hp c0294hp = new C0294hp(3, (InterfaceC0808vm) obj3);
                c0294hp.f3281p = (i00) obj;
                return c0294hp.mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) throws IOException {
        int i = this.f3279n;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        switch (i) {
            case 0:
                int i2 = this.f3280o;
                if (i2 == 0) {
                    wo1.m5395v(obj);
                    C0848wp c0848wp = (C0848wp) this.f3281p;
                    this.f3280o = 1;
                    if (C0848wp.m5400a(c0848wp, this) == enumC0513nn) {
                        return enumC0513nn;
                    }
                } else {
                    if (i2 != 1) {
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wo1.m5395v(obj);
                }
                return kf1.f4365a;
            default:
                int i3 = this.f3280o;
                if (i3 != 0) {
                    if (i3 == 1) {
                        wo1.m5395v(obj);
                        return obj;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                i00 i00Var = (i00) this.f3281p;
                this.f3280o = 1;
                i00Var.getClass();
                Object objM2357a = i00.m2357a(i00Var, this);
                return objM2357a == enumC0513nn ? enumC0513nn : objM2357a;
        }
    }

    public /* synthetic */ C0294hp(int i, InterfaceC0808vm interfaceC0808vm) {
        super(i, interfaceC0808vm);
    }
}
