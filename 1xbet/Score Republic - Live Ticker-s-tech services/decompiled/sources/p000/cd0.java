package p000;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cd0 implements InterfaceC0254gm, r60, nw0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1221j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ hd0 f1222k;

    public /* synthetic */ cd0(hd0 hd0Var, int i) {
        this.f1221j = i;
        this.f1222k = hd0Var;
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        int i = this.f1221j;
        int i2 = 2;
        hd0 hd0Var = this.f1222k;
        int i3 = 1;
        C0599pz c0599pz = (C0599pz) obj;
        switch (i) {
            case 0:
                yc0 yc0Var = hd0Var.f3171g;
                yc0Var.getClass();
                HashSet hashSet = new HashSet();
                for (C0948ze c0948ze : c0599pz.m4013q()) {
                    hashSet.add(AbstractC0024an.m278a(c0948ze.m5884r(), 1) ? c0948ze.m5887u().m184o() : c0948ze.m5882p().m5626o());
                }
                n80.m3496e("Potential impressions to clear: " + hashSet.toString());
                hm0 hm0VarM5754a = yc0Var.m5754a();
                C0800ve c0800ve = yc0.f9271c;
                zg1.m5905p(c0800ve, "defaultItem is null");
                new C0288hj(i2, hm0VarM5754a.m2295d(hm0.m2292a(c0800ve)), new C0615qe(7, yc0Var, hashSet)).m1873b();
                break;
            default:
                C0652re c0652re = hd0Var.f3167c;
                by0 by0Var = c0652re.f6826a;
                by0Var.getClass();
                new C0288hj(i3, new C0509nj(new C0398kj(i3, new CallableC0340iz(i2, by0Var, c0599pz)).m1872a(new C0615qe(0, c0652re, c0599pz)).m1872a(new C0042ay(27)), new C0042ay(28), t22.f7259d), new C0042ay(29)).m1873b();
                break;
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        int i4 = 1;
        switch (this.f1221j) {
            case 1:
                final String str = (String) obj;
                final hd0 hd0Var = this.f1222k;
                C0652re c0652re = hd0Var.f3167c;
                c0652re.getClass();
                rm0 rm0Var = new rm0(new CallableC0541oe(0, c0652re));
                rm0 rm0VarM798a = c0652re.f6826a.m798a(C0599pz.m4011s());
                C0578pe c0578pe = new C0578pe(c0652re, 0);
                nc1 nc1Var = t22.f7260e;
                qm0 qm0Var = new qm0(new ym0(new ym0(new ym0(new nm0(rm0Var.m2295d(new ym0(rm0VarM798a, c0578pe, nc1Var)), new C0578pe(c0652re, 1), 0), nc1Var, new C0578pe(c0652re, 2)), new dd0(2), nc1Var), nc1Var, new dd0(3)), new CallableC0445lt(i4, lm0.f4838j), 2);
                cd0 cd0Var = new cd0(hd0Var, i);
                int i5 = 4;
                final cd0 cd0Var2 = new cd0(hd0Var, i5);
                final ed0 ed0Var = new ed0(hd0Var, str, i4);
                final dd0 dd0Var = new dd0(4);
                r60 r60Var = new r60() { // from class: gd0
                    @Override // p000.r60
                    public final Object apply(Object obj2) {
                        hd0 hd0Var2 = hd0Var;
                        hd0Var2.getClass();
                        de0 de0VarM4013q = ((C0599pz) obj2).m4013q();
                        int i6 = g20.f2582j;
                        zg1.m5905p(de0VarM4013q, "source is null");
                        int i7 = 0;
                        c30 c30Var = new c30(new r20(2, de0VarM4013q), new cd0(hd0Var2, 2), i7);
                        String str2 = str;
                        g30 g30VarM1971b = new c30(c30Var, new C0468mf(6, str2), i7).m1971b(cd0Var2).m1971b(ed0Var).m1971b(dd0Var);
                        c40 c40Var = new c40(1);
                        c30 c30Var2 = new c30(new c30(g30VarM1971b), new b90(25, c40Var), 1);
                        int i8 = g20.f2582j;
                        zg1.m5906q("bufferSize", i8);
                        return new qm0(new y20(new g30(c30Var2, i8)), new ed0(hd0Var2, str2, i7), 0);
                    }
                };
                ym0 ym0Var = new ym0(hd0Var.f3171g.m5754a(), nc1Var, new dd0(5));
                C0800ve c0800veM5150p = C0800ve.m5150p();
                zg1.m5905p(c0800veM5150p, "defaultItem is null");
                qm0 qm0Var2 = new qm0(ym0Var.m2295d(hm0.m2292a(c0800veM5150p)), new CallableC0445lt(i4, hm0.m2292a(C0800ve.m5150p())), 2);
                l10 l10Var = (l10) hd0Var.f3177m;
                v92 v92VarM3141c = l10Var.m3141c();
                Executor executor = hd0Var.f3179o;
                int i6 = 9;
                om0 om0Var = new om0(i4, new hm0[]{new km0(i3, new C0615qe(i6, v92VarM3141c, executor)), new km0(i3, new C0615qe(i6, l10Var.m3142d(), executor))}, new wa0(27, new C0042ay(21)));
                g51 g51Var = hd0Var.f3170f.f5991a;
                zg1.m5905p(g51Var, "scheduler is null");
                C0615qe c0615qe = new C0615qe(8, hd0Var, new nm0(om0Var, g51Var, 1));
                wc1 wc1Var = hd0Var.f3175k;
                if (!(wc1Var.f8508c ? str.equals("ON_FOREGROUND") : wc1Var.f8507b)) {
                    n80.m3496e("Attempting to fetch campaigns using cache");
                    return new r20(i5, new qm0(qm0Var.m2295d(new ym0(new qm0(qm0Var2, c0615qe, 0), cd0Var, nc1Var)), r60Var, 0));
                }
                n80.m3497f("Forcing fetch from service rather than cache. Test Device: " + wc1Var.f8507b + " | App Fresh Install: " + wc1Var.f8508c);
                return new r20(i5, new qm0(new qm0(qm0Var2, c0615qe, 0), r60Var, 0));
            default:
                C0948ze c0948ze = (C0948ze) obj;
                hd0 hd0Var2 = this.f1222k;
                hd0Var2.getClass();
                if (c0948ze.m5883q()) {
                    return hm0.m2292a(c0948ze);
                }
                yc0 yc0Var = hd0Var2.f3171g;
                yc0Var.getClass();
                String strM184o = AbstractC0024an.m278a(c0948ze.m5884r(), 1) ? c0948ze.m5887u().m184o() : c0948ze.m5882p().m5626o();
                zs0 zs0Var = new zs0(new pm0(new qm0(yc0Var.m5754a(), new C0042ay(17), 1), new C0042ay(18)), new C0042ay(19), 1);
                zg1.m5905p(strM184o, "element is null");
                return new qm0(new om0(i3, new xs0(i2, new xs0(i, new xs0(i4, new xs0(i3, zs0Var, new g72(strM184o, 1)), new dd0(0)), new CallableC0445lt(i4, new b81())), new bd0(c0948ze)), new dd0(1)), new bd0(c0948ze), 1);
        }
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        long jM5628q;
        long jM5625n;
        C0948ze c0948ze = (C0948ze) obj;
        hd0 hd0Var = this.f1222k;
        if (!hd0Var.f3175k.f8507b) {
            kc1 kc1Var = hd0Var.f3168d;
            if (AbstractC0024an.m278a(c0948ze.m5884r(), 1)) {
                jM5628q = c0948ze.m5887u().m186q();
                jM5625n = c0948ze.m5887u().m183n();
            } else {
                if (!AbstractC0024an.m278a(c0948ze.m5884r(), 2)) {
                    return false;
                }
                jM5628q = c0948ze.m5882p().m5628q();
                jM5625n = c0948ze.m5882p().m5625n();
            }
            kc1Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis <= jM5628q || jCurrentTimeMillis >= jM5625n) {
                return false;
            }
        }
        return true;
    }
}
