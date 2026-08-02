package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: vp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0811vp extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public j01 f8237n;

    /* JADX INFO: renamed from: o */
    public int f8238o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f8239p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ j01 f8240q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0848wp f8241r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f8242s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean f8243t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0811vp(j01 j01Var, C0848wp c0848wp, Object obj, boolean z, InterfaceC0808vm interfaceC0808vm) {
        super(2, interfaceC0808vm);
        this.f8240q = j01Var;
        this.f8241r = c0848wp;
        this.f8242s = obj;
        this.f8243t = z;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        return ((C0811vp) mo1491k((InterfaceC0808vm) obj2, (q00) obj)).mo17m(kf1.f4365a);
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        C0811vp c0811vp = new C0811vp(this.f8240q, this.f8241r, this.f8242s, this.f8243t, interfaceC0808vm);
        c0811vp.f8239p = obj;
        return c0811vp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r6.m4022b(r2, r8) == r7) goto L16;
     */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo17m(Object obj) {
        q00 q00Var;
        j01 j01Var;
        int i = this.f8238o;
        Object obj2 = this.f8242s;
        C0848wp c0848wp = this.f8241r;
        j01 j01Var2 = this.f8240q;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        if (i != 0) {
            if (i == 1) {
                j01Var = this.f8237n;
                q00Var = (q00) this.f8239p;
                wo1.m5395v(obj);
            } else {
                if (i != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
            }
            if (this.f8243t) {
                c0848wp.f8613q.m3593q(new C0329io(obj2, obj2 != null ? obj2.hashCode() : 0, j01Var2.f3764j));
            }
            return kf1.f4365a;
        }
        wo1.m5395v(obj);
        q00 q00Var2 = (q00) this.f8239p;
        g81 g81VarM5405h = c0848wp.m5405h();
        this.f8239p = q00Var2;
        this.f8237n = j01Var2;
        this.f8238o = 1;
        Integer num = new Integer(((AtomicInteger) g81VarM5405h.f2647b.f5551k).incrementAndGet());
        if (num != enumC0513nn) {
            q00Var = q00Var2;
            obj = num;
            j01Var = j01Var2;
        }
        return enumC0513nn;
        j01Var.f3764j = ((Number) obj).intValue();
        this.f8239p = null;
        this.f8237n = null;
        this.f8238o = 2;
    }
}
