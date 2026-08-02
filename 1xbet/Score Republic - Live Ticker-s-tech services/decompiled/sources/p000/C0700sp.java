package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: sp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0700sp extends xb1 implements h60 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7178n = 0;

    /* JADX INFO: renamed from: o */
    public int f7179o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C0848wp f7180p;

    /* JADX INFO: renamed from: q */
    public Object f7181q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f7182r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f7183s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700sp(k01 k01Var, C0848wp c0848wp, j01 j01Var, InterfaceC0808vm interfaceC0808vm) {
        super(1, interfaceC0808vm);
        this.f7182r = k01Var;
        this.f7180p = c0848wp;
        this.f7183s = j01Var;
    }

    @Override // p000.h60
    /* JADX INFO: renamed from: i */
    public final Object mo170i(Object obj) {
        int i = this.f7178n;
        kf1 kf1Var = kf1.f4365a;
        Object obj2 = this.f7183s;
        Object obj3 = this.f7182r;
        C0848wp c0848wp = this.f7180p;
        InterfaceC0808vm interfaceC0808vm = (InterfaceC0808vm) obj;
        switch (i) {
            case 0:
                return new C0700sp((k01) obj3, c0848wp, (j01) obj2, interfaceC0808vm).mo17m(kf1Var);
            default:
                return new C0700sp(c0848wp, (InterfaceC0180en) obj3, (v60) obj2, interfaceC0808vm).mo17m(kf1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // p000.AbstractC0243gb
    /* JADX INFO: renamed from: m */
    public final Object mo17m(Object obj) throws Throwable {
        k01 k01Var;
        j01 j01Var;
        C0329io c0329io;
        Object obj2;
        int iHashCode;
        int i = this.f7178n;
        Object obj3 = this.f7183s;
        Object obj4 = this.f7182r;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        C0848wp c0848wp = this.f7180p;
        int i2 = 1;
        InterfaceC0808vm interfaceC0808vm = null;
        switch (i) {
            case 0:
                j01 j01Var2 = (j01) obj3;
                k01 k01Var2 = (k01) obj4;
                int i3 = this.f7179o;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            k01Var = (k01) ((Serializable) this.f7181q);
                            wo1.m5395v(obj);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                j01Var2 = (j01) ((Serializable) this.f7181q);
                                wo1.m5395v(obj);
                                j01Var2.f3764j = ((Number) obj).intValue();
                                return kf1.f4365a;
                            }
                            j01Var = (j01) ((Serializable) this.f7181q);
                            wo1.m5395v(obj);
                        }
                        j01Var.f3764j = ((Number) obj).intValue();
                        return kf1.f4365a;
                    }
                    wo1.m5395v(obj);
                    this.f7181q = k01Var2;
                    this.f7179o = 1;
                    obj = c0848wp.m5407j(this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                    k01Var = k01Var2;
                    k01Var.f4243j = obj;
                    g81 g81VarM5405h = c0848wp.m5405h();
                    this.f7181q = j01Var2;
                    this.f7179o = 2;
                    obj = g81VarM5405h.m1996a();
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                    j01Var = j01Var2;
                    j01Var.f3764j = ((Number) obj).intValue();
                    return kf1.f4365a;
                } catch (C0661rn unused) {
                    Object obj5 = k01Var2.f4243j;
                    this.f7181q = j01Var2;
                    this.f7179o = 3;
                    obj = c0848wp.m5408k(obj5, true, this);
                    if (obj == enumC0513nn) {
                        return enumC0513nn;
                    }
                }
            default:
                int i4 = this.f7179o;
                if (i4 != 0) {
                    if (i4 == 1) {
                        wo1.m5395v(obj);
                    } else if (i4 == 2) {
                        c0329io = (C0329io) this.f7181q;
                        wo1.m5395v(obj);
                        obj2 = c0329io.f3624b;
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        if (iHashCode != c0329io.f3625c) {
                            if (!af0.m187a(c0329io.f3624b, obj)) {
                                this.f7181q = obj;
                                this.f7179o = 3;
                                if (c0848wp.m5408k(obj, true, this) == enumC0513nn) {
                                    return enumC0513nn;
                                }
                            }
                            return obj;
                        }
                        C0270h1.m2191g("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    } else {
                        if (i4 == 3) {
                            Object obj6 = this.f7181q;
                            wo1.m5395v(obj);
                            return obj6;
                        }
                        C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                wo1.m5395v(obj);
                this.f7179o = 1;
                obj = C0848wp.m5404g(c0848wp, true, this);
                if (obj == enumC0513nn) {
                    return enumC0513nn;
                }
                c0329io = (C0329io) obj;
                C0662ro c0662ro = new C0662ro((v60) obj3, c0329io, interfaceC0808vm, i2);
                this.f7181q = c0329io;
                this.f7179o = 2;
                obj = AbstractC0959zp.m5973B((InterfaceC0180en) obj4, c0662ro, this);
                if (obj == enumC0513nn) {
                    return enumC0513nn;
                }
                obj2 = c0329io.f3624b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode != c0329io.f3625c) {
                    C0270h1.m2191g("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    return null;
                }
                if (!af0.m187a(c0329io.f3624b, obj)) {
                    this.f7181q = obj;
                    this.f7179o = 3;
                    if (c0848wp.m5408k(obj, true, this) == enumC0513nn) {
                        return enumC0513nn;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0700sp(C0848wp c0848wp, InterfaceC0180en interfaceC0180en, v60 v60Var, InterfaceC0808vm interfaceC0808vm) {
        super(1, interfaceC0808vm);
        this.f7180p = c0848wp;
        this.f7182r = interfaceC0180en;
        this.f7183s = v60Var;
    }
}
