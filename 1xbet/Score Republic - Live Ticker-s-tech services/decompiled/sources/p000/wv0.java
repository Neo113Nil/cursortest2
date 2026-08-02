package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 extends mj0 {

    /* JADX INFO: renamed from: f */
    public final AbstractC0477mo f8707f;

    /* JADX INFO: renamed from: g */
    public AbstractC0959zp f8708g;

    /* JADX INFO: renamed from: h */
    public EnumC0474ml f8709h = EnumC0474ml.f5074m;

    public wv0(AbstractC0477mo abstractC0477mo) {
        this.f8707f = abstractC0477mo;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: a */
    public final ja1 mo1387a(jj0 jj0Var) {
        Boolean bool;
        List list = jj0Var.f3946a;
        if (list.isEmpty()) {
            ja1 ja1VarM2840h = ja1.f3883m.m2840h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + jj0Var.f3947b);
            mo1388c(ja1VarM2840h);
            return ja1VarM2840h;
        }
        Object obj = jj0Var.f3948c;
        if ((obj instanceof uv0) && (bool = ((uv0) obj).f7913a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        AbstractC0959zp abstractC0959zp = this.f8708g;
        if (abstractC0959zp == null) {
            hj0 hj0VarM2270d = hj0.m2270d();
            hj0VarM2270d.m2274e(list);
            hj0 hj0VarM2272b = hj0VarM2270d.m2272b();
            AbstractC0477mo abstractC0477mo = this.f8707f;
            AbstractC0959zp abstractC0959zpMo960a = abstractC0477mo.mo960a(hj0VarM2272b);
            abstractC0959zpMo960a.mo2158u(new ta0(2, this, abstractC0959zpMo960a));
            this.f8708g = abstractC0959zpMo960a;
            vv0 vv0Var = new vv0(ij0.m2653b(abstractC0959zpMo960a, null));
            EnumC0474ml enumC0474ml = EnumC0474ml.f5071j;
            this.f8709h = enumC0474ml;
            abstractC0477mo.mo965o(enumC0474ml, vv0Var);
            abstractC0959zpMo960a.mo2660q();
        } else {
            abstractC0959zp.mo2159z(list);
        }
        return ja1.f3875e;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: c */
    public final void mo1388c(ja1 ja1Var) {
        AbstractC0959zp abstractC0959zp = this.f8708g;
        if (abstractC0959zp != null) {
            abstractC0959zp.mo2157s();
            this.f8708g = null;
        }
        vv0 vv0Var = new vv0(ij0.m2652a(ja1Var));
        EnumC0474ml enumC0474ml = EnumC0474ml.f5073l;
        this.f8709h = enumC0474ml;
        this.f8707f.mo965o(enumC0474ml, vv0Var);
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: e */
    public final void mo3397e() {
        AbstractC0959zp abstractC0959zp = this.f8708g;
        if (abstractC0959zp != null) {
            abstractC0959zp.mo2660q();
        }
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: f */
    public final void mo1390f() {
        AbstractC0959zp abstractC0959zp = this.f8708g;
        if (abstractC0959zp != null) {
            abstractC0959zp.mo2157s();
        }
    }
}
