package p000;

import java.util.List;

/* JADX INFO: renamed from: wp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0848wp implements InterfaceC0921yo {

    /* JADX INFO: renamed from: j */
    public final l00 f8606j;

    /* JADX INFO: renamed from: k */
    public final jg0 f8607k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0476mn f8608l;

    /* JADX INFO: renamed from: o */
    public int f8611o;

    /* JADX INFO: renamed from: p */
    public x91 f8612p;

    /* JADX INFO: renamed from: r */
    public final f71 f8614r;

    /* JADX INFO: renamed from: u */
    public final f71 f8617u;

    /* JADX INFO: renamed from: m */
    public final jg0 f8609m = new jg0(12, new C0764uf(this, null));

    /* JADX INFO: renamed from: n */
    public final br0 f8610n = new br0();

    /* JADX INFO: renamed from: q */
    public final nu1 f8613q = new nu1(14);

    /* JADX INFO: renamed from: s */
    public final jc1 f8615s = new jc1(new C0145dp(this, 1));

    /* JADX INFO: renamed from: t */
    public final jc1 f8616t = new jc1(new C0145dp(this, 0));

    public C0848wp(l00 l00Var, List list, jg0 jg0Var, InterfaceC0476mn interfaceC0476mn) {
        this.f8606j = l00Var;
        this.f8607k = jg0Var;
        this.f8608l = interfaceC0476mn;
        this.f8614r = new f71(this, list);
        this.f8617u = new f71(interfaceC0476mn, new C0737tp(this), new C0662ro(this, null, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m5400a(C0848wp c0848wp, AbstractC0882xm abstractC0882xm) {
        C0404kp c0404kp;
        br0 br0Var;
        if (abstractC0882xm instanceof C0404kp) {
            c0404kp = (C0404kp) abstractC0882xm;
            int i = c0404kp.f4492q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0404kp.f4492q = i - Integer.MIN_VALUE;
            } else {
                c0404kp = new C0404kp(c0848wp, abstractC0882xm);
            }
        } else {
            c0404kp = new C0404kp(c0848wp, abstractC0882xm);
        }
        Object obj = c0404kp.f4490o;
        int i2 = c0404kp.f4492q;
        if (i2 == 0) {
            wo1.m5395v(obj);
            br0Var = c0848wp.f8610n;
            c0404kp.f4488m = c0848wp;
            c0404kp.f4489n = br0Var;
            c0404kp.f4492q = 1;
            Object objM745d = br0Var.m745d(c0404kp);
            EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
            if (objM745d == enumC0513nn) {
                return enumC0513nn;
            }
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            br0 br0Var2 = c0404kp.f4489n;
            C0848wp c0848wp2 = c0404kp.f4488m;
            wo1.m5395v(obj);
            br0Var = br0Var2;
            c0848wp = c0848wp2;
        }
        try {
            int i3 = c0848wp.f8611o - 1;
            c0848wp.f8611o = i3;
            if (i3 == 0) {
                x91 x91Var = c0848wp.f8612p;
                if (x91Var != null) {
                    x91Var.mo204e(null);
                }
                c0848wp.f8612p = null;
            }
            return kf1.f4365a;
        } finally {
            br0Var.m748g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r9 == r6) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [wp] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [ig0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [wp] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5401b(C0848wp c0848wp, io0 io0Var, AbstractC0882xm abstractC0882xm) {
        C0441lp c0441lp;
        C0324ij c0324ij;
        ?? r9;
        v60 v60Var;
        InterfaceC0180en interfaceC0180en;
        Object objM1997b;
        ?? r10;
        if (abstractC0882xm instanceof C0441lp) {
            c0441lp = (C0441lp) abstractC0882xm;
            int i = c0441lp.f4878r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0441lp.f4878r = i - Integer.MIN_VALUE;
            } else {
                c0441lp = new C0441lp(c0848wp, abstractC0882xm);
            }
        } else {
            c0441lp = new C0441lp(c0848wp, abstractC0882xm);
        }
        Object o21Var = c0441lp.f4876p;
        int i2 = c0441lp.f4878r;
        boolean z = true;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i2 != 0) {
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            C0324ij c0324ij2 = c0441lp.f4875o;
                            C0848wp c0848wp2 = c0441lp.f4874n;
                            io0 io0Var2 = (io0) c0441lp.f4873m;
                            wo1.m5395v(o21Var);
                            c0324ij = c0324ij2;
                            r9 = c0848wp2;
                            io0Var = io0Var2;
                        } else if (i2 != 3) {
                            C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    C0324ij c0324ij3 = (C0324ij) c0441lp.f4873m;
                    wo1.m5395v(o21Var);
                    r10 = c0324ij3;
                } catch (Throwable th) {
                    th = th;
                    o21Var = new o21(th);
                    r10 = c0848wp;
                }
                Throwable thM3843a = p21.m3843a(o21Var);
                if (thM3843a == null) {
                    r10.m2611K(o21Var);
                } else {
                    r10.getClass();
                    r10.m2611K(new C0657rj(thM3843a, false));
                }
                return kf1.f4365a;
            }
            wo1.m5395v(o21Var);
            c0324ij = io0Var.f3627b;
            try {
                aa1 aa1VarM3591l = c0848wp.f8613q.m3591l();
                if (aa1VarM3591l instanceof C0329io) {
                    v60 v60Var2 = io0Var.f3626a;
                    InterfaceC0180en interfaceC0180en2 = io0Var.f3629d;
                    c0441lp.f4873m = c0324ij;
                    c0441lp.f4878r = 1;
                    try {
                        objM1997b = c0848wp.m5405h().m1997b(new C0700sp((C0848wp) c0848wp, interfaceC0180en2, v60Var2, (InterfaceC0808vm) null), c0441lp);
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        c0848wp = c0324ij;
                        o21Var = new o21(th);
                        r10 = c0848wp;
                    }
                } else {
                    if (!(aa1VarM3591l instanceof a01)) {
                        z = aa1VarM3591l instanceof ef1;
                    }
                    if (!z) {
                        if (aa1VarM3591l instanceof r00) {
                            throw ((r00) aa1VarM3591l).f6647b;
                        }
                        throw new C0694sj(5);
                    }
                    if (aa1VarM3591l != io0Var.f3628c) {
                        aa1VarM3591l.getClass();
                        throw ((a01) aa1VarM3591l).f6b;
                    }
                    c0441lp.f4873m = io0Var;
                    c0441lp.f4874n = c0848wp;
                    c0441lp.f4875o = c0324ij;
                    c0441lp.f4878r = 2;
                    if (c0848wp.m5406i(c0441lp) == enumC0513nn) {
                        r9 = c0848wp;
                    }
                }
                return enumC0513nn;
            } catch (Throwable th3) {
                th = th3;
                c0848wp = c0324ij;
                o21Var = new o21(th);
                r10 = c0848wp;
            }
            objM1997b = r9.m5405h().m1997b(new C0700sp((C0848wp) r9, interfaceC0180en, v60Var, (InterfaceC0808vm) null), c0441lp);
        } catch (Throwable th4) {
            th = th4;
            th = th;
            c0848wp = c0324ij;
            o21Var = new o21(th);
            r10 = c0848wp;
        }
        r9 = c0848wp;
        v60Var = io0Var.f3626a;
        interfaceC0180en = io0Var.f3629d;
        c0441lp.f4873m = c0324ij;
        c0441lp.f4874n = null;
        c0441lp.f4875o = null;
        c0441lp.f4878r = 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m5402c(C0848wp c0848wp, AbstractC0882xm abstractC0882xm) {
        C0478mp c0478mp;
        br0 br0Var;
        if (abstractC0882xm instanceof C0478mp) {
            c0478mp = (C0478mp) abstractC0882xm;
            int i = c0478mp.f5125q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0478mp.f5125q = i - Integer.MIN_VALUE;
            } else {
                c0478mp = new C0478mp(c0848wp, abstractC0882xm);
            }
        } else {
            c0478mp = new C0478mp(c0848wp, abstractC0882xm);
        }
        Object obj = c0478mp.f5123o;
        int i2 = c0478mp.f5125q;
        int i3 = 1;
        InterfaceC0808vm interfaceC0808vm = null;
        if (i2 == 0) {
            wo1.m5395v(obj);
            br0Var = c0848wp.f8610n;
            c0478mp.f5121m = c0848wp;
            c0478mp.f5122n = br0Var;
            c0478mp.f5125q = 1;
            Object objM745d = br0Var.m745d(c0478mp);
            EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
            if (objM745d == enumC0513nn) {
                return enumC0513nn;
            }
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            br0 br0Var2 = c0478mp.f5122n;
            C0848wp c0848wp2 = c0478mp.f5121m;
            wo1.m5395v(obj);
            br0Var = br0Var2;
            c0848wp = c0848wp2;
        }
        try {
            int i4 = c0848wp.f8611o + 1;
            c0848wp.f8611o = i4;
            if (i4 == 1) {
                c0848wp.f8612p = AbstractC0959zp.m5983l(c0848wp.f8608l, new C0182ep(c0848wp, interfaceC0808vm, i3));
            }
            return kf1.f4365a;
        } finally {
            br0Var.m748g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m5403e(C0848wp c0848wp, boolean z, InterfaceC0808vm interfaceC0808vm) throws Throwable {
        C0552op c0552op;
        C0848wp c0848wp2;
        aa1 aa1Var;
        C0848wp c0848wp3;
        kv0 kv0Var;
        aa1 aa1Var2;
        if (interfaceC0808vm instanceof C0552op) {
            c0552op = (C0552op) interfaceC0808vm;
            int i = c0552op.f5826r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0552op.f5826r = i - Integer.MIN_VALUE;
            } else {
                c0552op = new C0552op(c0848wp, interfaceC0808vm);
            }
        } else {
            c0552op = new C0552op(c0848wp, interfaceC0808vm);
        }
        Object objM1998c = c0552op.f5824p;
        int i2 = c0552op.f5826r;
        InterfaceC0808vm interfaceC0808vm2 = null;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        if (i2 == 0) {
            wo1.m5395v(objM1998c);
            aa1 aa1VarM3591l = c0848wp.f8613q.m3591l();
            if (aa1VarM3591l instanceof ef1) {
                C0270h1.m2191g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            g81 g81VarM5405h = c0848wp.m5405h();
            c0552op.f5821m = c0848wp;
            c0552op.f5822n = aa1VarM3591l;
            c0552op.f5823o = z;
            c0552op.f5826r = 1;
            Integer numM1996a = g81VarM5405h.m1996a();
            if (numM1996a != enumC0513nn) {
                c0848wp2 = c0848wp;
                aa1Var = aa1VarM3591l;
                objM1998c = numM1996a;
            }
            return enumC0513nn;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                c0848wp3 = c0552op.f5821m;
                wo1.m5395v(objM1998c);
                kv0Var = (kv0) objM1998c;
                aa1Var2 = (aa1) kv0Var.f4582j;
                if (((Boolean) kv0Var.f4583k).booleanValue()) {
                    c0848wp3.f8613q.m3593q(aa1Var2);
                }
                return aa1Var2;
            }
            if (i2 != 3) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0848wp3 = c0552op.f5821m;
            wo1.m5395v(objM1998c);
            kv0Var = (kv0) objM1998c;
            aa1Var2 = (aa1) kv0Var.f4582j;
            if (((Boolean) kv0Var.f4583k).booleanValue()) {
                c0848wp3.f8613q.m3593q(aa1Var2);
            }
            return aa1Var2;
        }
        z = c0552op.f5823o;
        aa1Var = c0552op.f5822n;
        c0848wp2 = c0552op.f5821m;
        wo1.m5395v(objM1998c);
        int iIntValue = ((Number) objM1998c).intValue();
        boolean z2 = aa1Var instanceof C0329io;
        int i3 = z2 ? aa1Var.f115a : -1;
        if (z2 && iIntValue == i3) {
            return aa1Var;
        }
        if (z) {
            g81 g81VarM5405h2 = c0848wp2.m5405h();
            C0589pp c0589pp = new C0589pp(c0848wp2, null);
            c0552op.f5821m = c0848wp2;
            c0552op.f5822n = null;
            c0552op.f5826r = 2;
            objM1998c = g81VarM5405h2.m1997b(c0589pp, c0552op);
            if (objM1998c != enumC0513nn) {
                c0848wp3 = c0848wp2;
                kv0Var = (kv0) objM1998c;
                aa1Var2 = (aa1) kv0Var.f4582j;
                if (((Boolean) kv0Var.f4583k).booleanValue()) {
                    c0848wp3.f8613q.m3593q(aa1Var2);
                }
                return aa1Var2;
            }
        } else {
            g81 g81VarM5405h3 = c0848wp2.m5405h();
            C0626qp c0626qp = new C0626qp(c0848wp2, i3, interfaceC0808vm2, 0);
            c0552op.f5821m = c0848wp2;
            c0552op.f5822n = null;
            c0552op.f5826r = 3;
            objM1998c = g81VarM5405h3.m1998c(c0626qp, c0552op);
            if (objM1998c != enumC0513nn) {
                c0848wp3 = c0848wp2;
                kv0Var = (kv0) objM1998c;
                aa1Var2 = (aa1) kv0Var.f4582j;
                if (((Boolean) kv0Var.f4583k).booleanValue()) {
                    c0848wp3.f8613q.m3593q(aa1Var2);
                }
                return aa1Var2;
            }
        }
        return enumC0513nn;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d A[Catch: rn -> 0x005e, TryCatch #1 {rn -> 0x005e, blocks: (B:19:0x0059, B:54:0x00fc, B:24:0x0067, B:51:0x00de, B:32:0x0084, B:40:0x009d, B:42:0x00a3, B:36:0x008d, B:48:0x00cb), top: B:80:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d A[Catch: all -> 0x0169, TryCatch #2 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:81:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #2 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:81:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m5404g(C0848wp c0848wp, boolean z, AbstractC0882xm abstractC0882xm) {
        C0663rp c0663rp;
        k01 k01Var;
        C0661rn c0661rn;
        C0848wp c0848wp2;
        boolean z2;
        k01 k01Var2;
        j01 j01Var;
        C0661rn c0661rn2;
        C0700sp c0700sp;
        Object objM1997b;
        j01 j01Var2;
        k01 k01Var3;
        int iHashCode;
        Integer numM1996a;
        C0848wp c0848wp3;
        int i;
        Object obj;
        if (abstractC0882xm instanceof C0663rp) {
            c0663rp = (C0663rp) abstractC0882xm;
            int i2 = c0663rp.f6936u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0663rp.f6936u = i2 - Integer.MIN_VALUE;
            } else {
                c0663rp = new C0663rp(c0848wp, abstractC0882xm);
            }
        } else {
            c0663rp = new C0663rp(c0848wp, abstractC0882xm);
        }
        Object objM1996a = c0663rp.f6934s;
        int i3 = c0663rp.f6936u;
        int i4 = 1;
        InterfaceC0808vm interfaceC0808vm = null;
        Object c0329io = EnumC0513nn.f5459j;
        try {
            switch (i3) {
                case 0:
                    wo1.m5395v(objM1996a);
                    if (z) {
                        c0663rp.f6928m = c0848wp;
                        c0663rp.f6932q = z;
                        c0663rp.f6936u = 1;
                        objM1996a = c0848wp.m5407j(c0663rp);
                        if (objM1996a != c0329io) {
                            if (objM1996a != null) {
                                iHashCode = objM1996a.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            g81 g81VarM5405h = c0848wp.m5405h();
                            c0663rp.f6928m = c0848wp;
                            c0663rp.f6929n = objM1996a;
                            c0663rp.f6932q = z;
                            c0663rp.f6933r = iHashCode;
                            c0663rp.f6936u = 2;
                            numM1996a = g81VarM5405h.m1996a();
                            if (numM1996a != c0329io) {
                                c0848wp3 = c0848wp;
                                i = iHashCode;
                                obj = objM1996a;
                                objM1996a = numM1996a;
                                return new C0329io(obj, i, ((Number) objM1996a).intValue());
                            }
                        }
                    } else {
                        g81 g81VarM5405h2 = c0848wp.m5405h();
                        c0663rp.f6928m = c0848wp;
                        c0663rp.f6932q = z;
                        c0663rp.f6936u = 3;
                        objM1996a = g81VarM5405h2.m1996a();
                        if (objM1996a != c0329io) {
                            int iIntValue = ((Number) objM1996a).intValue();
                            g81 g81VarM5405h3 = c0848wp.m5405h();
                            C0626qp c0626qp = new C0626qp(c0848wp, iIntValue, interfaceC0808vm, i4);
                            c0663rp.f6928m = c0848wp;
                            c0663rp.f6932q = z;
                            c0663rp.f6936u = 4;
                            objM1996a = g81VarM5405h3.m1998c(c0626qp, c0663rp);
                            if (objM1996a == c0329io) {
                            }
                            return (C0329io) objM1996a;
                        }
                    }
                    return c0329io;
                case 1:
                    z = c0663rp.f6932q;
                    c0848wp = (C0848wp) c0663rp.f6928m;
                    wo1.m5395v(objM1996a);
                    if (objM1996a != null) {
                        iHashCode = objM1996a.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    g81 g81VarM5405h4 = c0848wp.m5405h();
                    c0663rp.f6928m = c0848wp;
                    c0663rp.f6929n = objM1996a;
                    c0663rp.f6932q = z;
                    c0663rp.f6933r = iHashCode;
                    c0663rp.f6936u = 2;
                    numM1996a = g81VarM5405h4.m1996a();
                    if (numM1996a != c0329io) {
                        c0848wp3 = c0848wp;
                        i = iHashCode;
                        obj = objM1996a;
                        objM1996a = numM1996a;
                        return new C0329io(obj, i, ((Number) objM1996a).intValue());
                    }
                    return c0329io;
                case 2:
                    i = c0663rp.f6933r;
                    z = c0663rp.f6932q;
                    obj = c0663rp.f6929n;
                    c0848wp3 = (C0848wp) c0663rp.f6928m;
                    try {
                        wo1.m5395v(objM1996a);
                        return new C0329io(obj, i, ((Number) objM1996a).intValue());
                    } catch (C0661rn e) {
                        e = e;
                        c0848wp = c0848wp3;
                        k01Var = new k01();
                        jg0 jg0Var = c0848wp.f8607k;
                        c0663rp.f6928m = c0848wp;
                        c0663rp.f6929n = e;
                        c0663rp.f6930o = k01Var;
                        c0663rp.f6931p = k01Var;
                        c0663rp.f6932q = z;
                        c0663rp.f6936u = 5;
                        Object objMo170i = ((tf0) jg0Var.f3922k).mo170i(e);
                        if (objMo170i != c0329io) {
                            c0661rn = e;
                            objM1996a = objMo170i;
                            c0848wp2 = c0848wp;
                            z2 = z;
                            k01Var2 = k01Var;
                            k01Var2.f4243j = objM1996a;
                            j01Var = new j01();
                            try {
                                c0700sp = new C0700sp(k01Var, c0848wp2, j01Var, (InterfaceC0808vm) null);
                                c0663rp.f6928m = c0661rn;
                                c0663rp.f6929n = k01Var;
                                c0663rp.f6930o = j01Var;
                                c0663rp.f6931p = null;
                                c0663rp.f6936u = 6;
                                if (z2) {
                                    c0848wp2.getClass();
                                    objM1997b = c0700sp.mo170i(c0663rp);
                                } else {
                                    objM1997b = c0848wp2.m5405h().m1997b(new C0736to(c0700sp, interfaceC0808vm, i4), c0663rp);
                                }
                                if (objM1997b != c0329io) {
                                    j01Var2 = j01Var;
                                    k01Var3 = k01Var;
                                    Object obj2 = k01Var3.f4243j;
                                    c0329io = new C0329io(obj2, obj2 != null ? obj2.hashCode() : 0, j01Var2.f3764j);
                                }
                            } catch (Throwable th) {
                                th = th;
                                c0661rn2 = c0661rn;
                                vt1.m5190a(c0661rn2, th);
                                throw c0661rn2;
                            }
                        }
                        return c0329io;
                    }
                case 3:
                    z = c0663rp.f6932q;
                    c0848wp = (C0848wp) c0663rp.f6928m;
                    wo1.m5395v(objM1996a);
                    int iIntValue2 = ((Number) objM1996a).intValue();
                    g81 g81VarM5405h5 = c0848wp.m5405h();
                    C0626qp c0626qp2 = new C0626qp(c0848wp, iIntValue2, interfaceC0808vm, i4);
                    c0663rp.f6928m = c0848wp;
                    c0663rp.f6932q = z;
                    c0663rp.f6936u = 4;
                    objM1996a = g81VarM5405h5.m1998c(c0626qp2, c0663rp);
                    if (objM1996a == c0329io) {
                        return c0329io;
                    }
                    return (C0329io) objM1996a;
                case 4:
                    boolean z3 = c0663rp.f6932q;
                    wo1.m5395v(objM1996a);
                    return (C0329io) objM1996a;
                case 5:
                    z2 = c0663rp.f6932q;
                    k01Var2 = c0663rp.f6931p;
                    k01Var = (k01) c0663rp.f6930o;
                    c0661rn = (C0661rn) c0663rp.f6929n;
                    c0848wp2 = (C0848wp) c0663rp.f6928m;
                    wo1.m5395v(objM1996a);
                    k01Var2.f4243j = objM1996a;
                    j01Var = new j01();
                    c0700sp = new C0700sp(k01Var, c0848wp2, j01Var, (InterfaceC0808vm) null);
                    c0663rp.f6928m = c0661rn;
                    c0663rp.f6929n = k01Var;
                    c0663rp.f6930o = j01Var;
                    c0663rp.f6931p = null;
                    c0663rp.f6936u = 6;
                    if (z2) {
                        c0848wp2.getClass();
                        objM1997b = c0700sp.mo170i(c0663rp);
                    } else {
                        objM1997b = c0848wp2.m5405h().m1997b(new C0736to(c0700sp, interfaceC0808vm, i4), c0663rp);
                    }
                    if (objM1997b != c0329io) {
                        j01Var2 = j01Var;
                        k01Var3 = k01Var;
                        Object obj3 = k01Var3.f4243j;
                        c0329io = new C0329io(obj3, obj3 != null ? obj3.hashCode() : 0, j01Var2.f3764j);
                    }
                    return c0329io;
                case 6:
                    j01Var2 = (j01) c0663rp.f6930o;
                    k01Var3 = (k01) c0663rp.f6929n;
                    c0661rn2 = (C0661rn) c0663rp.f6928m;
                    try {
                        wo1.m5395v(objM1996a);
                        Object obj4 = k01Var3.f4243j;
                        c0329io = new C0329io(obj4, obj4 != null ? obj4.hashCode() : 0, j01Var2.f3764j);
                        return c0329io;
                    } catch (Throwable th2) {
                        th = th2;
                        vt1.m5190a(c0661rn2, th);
                        throw c0661rn2;
                    }
                default:
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (C0661rn e2) {
            e = e2;
        }
    }

    @Override // p000.InterfaceC0921yo
    /* JADX INFO: renamed from: d */
    public final Object mo2853d(v60 v60Var, xb1 xb1Var) {
        InterfaceC0180en interfaceC0180en = xb1Var.f8992k;
        interfaceC0180en.getClass();
        ig1 ig1Var = (ig1) interfaceC0180en.mo1466j(wa0.f8476p);
        if (ig1Var != null) {
            ig1Var.m2636b(this);
        }
        return AbstractC0959zp.m5973B(new ig1(ig1Var, this), new C0764uf(this, v60Var, null, 2), xb1Var);
    }

    @Override // p000.InterfaceC0921yo
    /* JADX INFO: renamed from: f */
    public final t10 mo2854f() {
        return this.f8609m;
    }

    /* JADX INFO: renamed from: h */
    public final g81 m5405h() {
        return (g81) this.f8616t.m2847a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r1.m1675v(r0) == r4) goto L26;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5406i(AbstractC0882xm abstractC0882xm) throws Throwable {
        C0515np c0515np;
        int iIntValue;
        C0848wp c0848wp;
        int i;
        Throwable th;
        if (abstractC0882xm instanceof C0515np) {
            c0515np = (C0515np) abstractC0882xm;
            int i2 = c0515np.f5483q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0515np.f5483q = i2 - Integer.MIN_VALUE;
            } else {
                c0515np = new C0515np(this, abstractC0882xm);
            }
        } else {
            c0515np = new C0515np(this, abstractC0882xm);
        }
        Object objM1996a = c0515np.f5481o;
        int i3 = c0515np.f5483q;
        Object obj = EnumC0513nn.f5459j;
        try {
            if (i3 == 0) {
                wo1.m5395v(objM1996a);
                g81 g81VarM5405h = m5405h();
                c0515np.f5479m = this;
                c0515np.f5483q = 1;
                objM1996a = g81VarM5405h.m1996a();
                if (objM1996a != obj) {
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = c0515np.f5480n;
                c0848wp = c0515np.f5479m;
                try {
                    wo1.m5395v(objM1996a);
                    return kf1.f4365a;
                } catch (Throwable th2) {
                    th = th2;
                    c0848wp.f8613q.m3593q(new a01(th, i));
                    throw th;
                }
            }
            this = c0515np.f5479m;
            wo1.m5395v(objM1996a);
            f71 f71Var = this.f8614r;
            c0515np.f5479m = this;
            c0515np.f5480n = iIntValue;
            c0515np.f5483q = 2;
        } catch (Throwable th3) {
            c0848wp = this;
            i = iIntValue;
            th = th3;
            c0848wp.f8613q.m3593q(new a01(th, i));
            throw th;
        }
        iIntValue = ((Number) objM1996a).intValue();
    }

    /* JADX INFO: renamed from: j */
    public final Object m5407j(AbstractC0882xm abstractC0882xm) {
        return ((o00) this.f8615s.m2847a()).m3610a(new C0294hp(3, (InterfaceC0808vm) null), abstractC0882xm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public final Object m5408k(Object obj, boolean z, AbstractC0882xm abstractC0882xm) {
        C0774up c0774up;
        j01 j01Var;
        if (abstractC0882xm instanceof C0774up) {
            c0774up = (C0774up) abstractC0882xm;
            int i = c0774up.f7882p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0774up.f7882p = i - Integer.MIN_VALUE;
            } else {
                c0774up = new C0774up(this, abstractC0882xm);
            }
        } else {
            c0774up = new C0774up(this, abstractC0882xm);
        }
        Object obj2 = c0774up.f7880n;
        int i2 = c0774up.f7882p;
        if (i2 == 0) {
            wo1.m5395v(obj2);
            j01 j01Var2 = new j01();
            o00 o00Var = (o00) this.f8615s.m2847a();
            C0811vp c0811vp = new C0811vp(j01Var2, this, obj, z, null);
            c0774up.f7879m = j01Var2;
            c0774up.f7882p = 1;
            Object objM3611b = o00Var.m3611b(c0811vp, c0774up);
            EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
            if (objM3611b == enumC0513nn) {
                return enumC0513nn;
            }
            j01Var = j01Var2;
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j01Var = c0774up.f7879m;
            wo1.m5395v(obj2);
        }
        return new Integer(j01Var.f3764j);
    }
}
