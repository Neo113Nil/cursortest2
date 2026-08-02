package p000;

import android.net.Uri;
import android.view.InputEvent;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: uf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0764uf extends xb1 implements v60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7808n;

    /* JADX INFO: renamed from: o */
    public int f7809o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f7810p;

    /* JADX INFO: renamed from: q */
    public Object f7811q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7812r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0764uf(Object obj, Object obj2, Object obj3, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f7808n = i;
        this.f7810p = obj;
        this.f7811q = obj2;
        this.f7812r = obj3;
    }

    @Override // p000.v60
    /* JADX INFO: renamed from: g */
    public final Object mo1490g(Object obj, Object obj2) {
        int i = this.f7808n;
        kf1 kf1Var = kf1.f4365a;
        switch (i) {
            case 0:
                return ((C0764uf) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 1:
                return ((C0764uf) mo1491k((InterfaceC0808vm) obj2, (u10) obj)).mo17m(kf1Var);
            case 2:
                return ((C0764uf) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            case 3:
                return ((C0764uf) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
            default:
                return ((C0764uf) mo1491k((InterfaceC0808vm) obj2, (InterfaceC0476mn) obj)).mo17m(kf1Var);
        }
    }

    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: k */
    public final InterfaceC0808vm mo1491k(InterfaceC0808vm interfaceC0808vm, Object obj) {
        int i = this.f7808n;
        Object obj2 = this.f7812r;
        switch (i) {
            case 0:
                C0764uf c0764uf = new C0764uf((u10) this.f7811q, (C0838wf) obj2, interfaceC0808vm, 0);
                c0764uf.f7810p = obj;
                return c0764uf;
            case 1:
                C0764uf c0764uf2 = new C0764uf((C0848wp) obj2, interfaceC0808vm);
                c0764uf2.f7810p = obj;
                return c0764uf2;
            case 2:
                C0764uf c0764uf3 = new C0764uf((C0848wp) this.f7811q, (v60) obj2, interfaceC0808vm, 2);
                c0764uf3.f7810p = obj;
                return c0764uf3;
            case 3:
                return new C0764uf((wf0) this.f7810p, (rw0) this.f7811q, (Long) obj2, interfaceC0808vm, 3);
            default:
                return new C0764uf((en0) this.f7810p, (Uri) this.f7811q, (InputEvent) obj2, interfaceC0808vm, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x01af  */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) throws Throwable {
        u10 u10Var;
        Object obj2;
        y10 y10Var;
        Object objMo622r;
        int i = this.f7808n;
        int i2 = 0;
        kf1 kf1Var = kf1.f4365a;
        Object obj3 = this.f7812r;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        int i3 = 1;
        InterfaceC0808vm interfaceC0808vm = null;
        switch (i) {
            case 0:
                int i4 = this.f7809o;
                if (i4 != 0) {
                    if (i4 == 1) {
                        wo1.m5395v(obj);
                        return kf1Var;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                InterfaceC0476mn interfaceC0476mn = (InterfaceC0476mn) this.f7810p;
                u10 u10Var2 = (u10) this.f7811q;
                C0838wf c0838wf = (C0838wf) obj3;
                InterfaceC0180en interfaceC0180en = c0838wf.f8528j;
                int i5 = c0838wf.f8529k;
                if (i5 == -3) {
                    i5 = -2;
                }
                EnumC0576pc enumC0576pc = c0838wf.f8530l;
                v60 c0801vf = new C0801vf(c0838wf, interfaceC0808vm, i2);
                kx0 kx0Var = new kx0(AbstractC0875xf.m5651j(interfaceC0476mn, interfaceC0180en), yd0.m5762a(i5, enumC0576pc, 4));
                kx0Var.m3607c0(EnumC0587pn.f6216k, kx0Var, c0801vf);
                this.f7809o = 1;
                Object objM5894e = zg1.m5894e(u10Var2, kx0Var, true, this);
                if (objM5894e != enumC0513nn) {
                    objM5894e = kf1Var;
                }
                return objM5894e == enumC0513nn ? enumC0513nn : kf1Var;
            case 1:
                C0848wp c0848wp = (C0848wp) obj3;
                int i6 = this.f7809o;
                int i7 = 2;
                if (i6 == 0) {
                    wo1.m5395v(obj);
                    u10 u10Var3 = (u10) this.f7810p;
                    this.f7810p = u10Var3;
                    this.f7809o = 1;
                    Object objM5973B = AbstractC0959zp.m5973B(c0848wp.f8608l.mo434b(), new C0182ep(c0848wp, interfaceC0808vm, i7), this);
                    if (objM5973B != enumC0513nn) {
                        u10Var = u10Var3;
                        obj = objM5973B;
                    }
                    return enumC0513nn;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            wo1.m5395v(obj);
                            return kf1Var;
                        }
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = (C0329io) this.f7811q;
                    u10Var = (u10) this.f7810p;
                    wo1.m5395v(obj);
                    int i8 = 29;
                    int i9 = 28;
                    y10Var = new y10(new b90(15, new C0312i6(i9, new C0312i6(i8, new C0312i6(27, new C0182ep(c0848wp, interfaceC0808vm, i2), (da1) c0848wp.f8613q.f5551k), new C0219fp(2, null)), new C0257gp(obj2, null, 0))), new C0294hp(c0848wp, (InterfaceC0808vm) null));
                    this.f7810p = null;
                    this.f7811q = null;
                    this.f7809o = 3;
                    if (!(u10Var instanceof gd1)) {
                        throw ((gd1) u10Var).f2709j;
                    }
                    objMo622r = y10Var.mo622r(u10Var, this);
                    if (objMo622r != enumC0513nn) {
                        objMo622r = kf1Var;
                    }
                    if (objMo622r != enumC0513nn) {
                        return kf1Var;
                    }
                    return enumC0513nn;
                }
                u10 u10Var4 = (u10) this.f7810p;
                wo1.m5395v(obj);
                u10Var = u10Var4;
                obj2 = (aa1) obj;
                if (obj2 instanceof C0329io) {
                    C0329io c0329io = (C0329io) obj2;
                    Object obj4 = c0329io.f3624b;
                    this.f7810p = u10Var;
                    this.f7811q = c0329io;
                    this.f7809o = 2;
                    if (u10Var.mo583j(obj4, this) != enumC0513nn) {
                    }
                    return enumC0513nn;
                }
                if (obj2 instanceof ef1) {
                    C0270h1.m2191g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return null;
                }
                if (obj2 instanceof a01) {
                    throw ((a01) obj2).f6b;
                }
                if (obj2 instanceof r00) {
                    return kf1Var;
                }
                int i10 = 29;
                int i11 = 28;
                y10Var = new y10(new b90(15, new C0312i6(i11, new C0312i6(i10, new C0312i6(27, new C0182ep(c0848wp, interfaceC0808vm, i2), (da1) c0848wp.f8613q.f5551k), new C0219fp(2, null)), new C0257gp(obj2, null, 0))), new C0294hp(c0848wp, (InterfaceC0808vm) null));
                this.f7810p = null;
                this.f7811q = null;
                this.f7809o = 3;
                if (!(u10Var instanceof gd1)) {
                    throw ((gd1) u10Var).f2709j;
                }
                objMo622r = y10Var.mo622r(u10Var, this);
                if (objMo622r != enumC0513nn) {
                    objMo622r = kf1Var;
                }
                if (objMo622r != enumC0513nn) {
                    return kf1Var;
                }
                return enumC0513nn;
            case 2:
                C0848wp c0848wp2 = (C0848wp) this.f7811q;
                int i12 = this.f7809o;
                if (i12 == 0) {
                    wo1.m5395v(obj);
                    InterfaceC0476mn interfaceC0476mn2 = (InterfaceC0476mn) this.f7810p;
                    C0324ij c0324ij = new C0324ij(true);
                    c0324ij.m2608H(null);
                    io0 io0Var = new io0((v60) obj3, c0324ij, c0848wp2.f8613q.m3591l(), interfaceC0476mn2.mo434b());
                    f71 f71Var = c0848wp2.f8617u;
                    Object objMo1436k = ((C0650rc) f71Var.f2336m).mo1436k(io0Var);
                    if (objMo1436k instanceof C0949zf) {
                        Throwable th = ((C0949zf) objMo1436k).f9751a;
                        if (th == null) {
                            throw new C0877xh("Channel was closed normally");
                        }
                        throw th;
                    }
                    if (!(objMo1436k instanceof C0017ag)) {
                        if (((AtomicInteger) ((nu1) f71Var.f2337n).f5551k).getAndIncrement() == 0) {
                            AbstractC0959zp.m5983l((InterfaceC0476mn) f71Var.f2334k, new C0662ro(f71Var, interfaceC0808vm, 6));
                        }
                        this.f7809o = 1;
                        Object objM2651a0 = c0324ij.m2651a0(this);
                        return objM2651a0 == enumC0513nn ? enumC0513nn : objM2651a0;
                    }
                    C0270h1.m2191g("Check failed.");
                } else {
                    if (i12 == 1) {
                        wo1.m5395v(obj);
                        return obj;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                int i13 = this.f7809o;
                if (i13 != 0) {
                    if (i13 == 1) {
                        wo1.m5395v(obj);
                        return obj;
                    }
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wo1.m5395v(obj);
                InterfaceC0921yo interfaceC0921yo = ((wf0) this.f7810p).f8535c;
                vf0 vf0Var = new vf0((rw0) this.f7811q, (Long) obj3, null);
                this.f7809o = 1;
                Object objMo2853d = interfaceC0921yo.mo2853d(new ow0(vf0Var, interfaceC0808vm, i3), this);
                return objMo2853d == enumC0513nn ? enumC0513nn : objMo2853d;
            default:
                int i14 = this.f7809o;
                if (i14 == 0) {
                    wo1.m5395v(obj);
                    this.f7809o = 1;
                    return ((en0) this.f7810p).f2146a.m2138y((Uri) this.f7811q, (InputEvent) obj3, this) == enumC0513nn ? enumC0513nn : kf1Var;
                }
                if (i14 == 1) {
                    wo1.m5395v(obj);
                    return kf1Var;
                }
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0764uf(Object obj, Object obj2, InterfaceC0808vm interfaceC0808vm, int i) {
        super(2, interfaceC0808vm);
        this.f7808n = i;
        this.f7811q = obj;
        this.f7812r = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0764uf(C0848wp c0848wp, InterfaceC0808vm interfaceC0808vm) {
        super(2, interfaceC0808vm);
        this.f7808n = 1;
        this.f7812r = c0848wp;
    }
}
