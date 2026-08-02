package p000;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: jo */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0366jo implements InterfaceC0625qo, InterfaceC0514no {

    /* JADX INFO: renamed from: j */
    public final List f4044j;

    /* JADX INFO: renamed from: k */
    public final C0071bq f4045k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC0588po f4046l;

    /* JADX INFO: renamed from: m */
    public int f4047m = -1;

    /* JADX INFO: renamed from: n */
    public xg0 f4048n;

    /* JADX INFO: renamed from: o */
    public List f4049o;

    /* JADX INFO: renamed from: p */
    public int f4050p;

    /* JADX INFO: renamed from: q */
    public volatile gq0 f4051q;

    /* JADX INFO: renamed from: r */
    public File f4052r;

    public C0366jo(List list, C0071bq c0071bq, InterfaceC0588po interfaceC0588po) {
        this.f4044j = list;
        this.f4045k = c0071bq;
        this.f4046l = interfaceC0588po;
    }

    @Override // p000.InterfaceC0625qo
    /* JADX INFO: renamed from: b */
    public final boolean mo903b() {
        while (true) {
            List list = this.f4049o;
            boolean z = false;
            if (list != null && this.f4050p < list.size()) {
                this.f4051q = null;
                while (!z && this.f4050p < this.f4049o.size()) {
                    List list2 = this.f4049o;
                    int i = this.f4050p;
                    this.f4050p = i + 1;
                    hq0 hq0Var = (hq0) list2.get(i);
                    File file = this.f4052r;
                    C0071bq c0071bq = this.f4045k;
                    this.f4051q = hq0Var.mo640b(file, c0071bq.f946e, c0071bq.f947f, c0071bq.f950i);
                    if (this.f4051q != null && this.f4045k.m742c(this.f4051q.f2848c.mo1071a()) != null) {
                        this.f4051q.f2848c.mo1073e(this.f4045k.f956o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f4047m + 1;
            this.f4047m = i2;
            if (i2 >= this.f4044j.size()) {
                return false;
            }
            xg0 xg0Var = (xg0) this.f4044j.get(this.f4047m);
            C0071bq c0071bq2 = this.f4045k;
            File fileMo2338f = c0071bq2.f949h.m3879a().mo2338f(new C0403ko(xg0Var, c0071bq2.f955n));
            this.f4052r = fileMo2338f;
            if (fileMo2338f != null) {
                this.f4048n = xg0Var;
                this.f4049o = this.f4045k.f944c.m4041a().m3819f(fileMo2338f);
                this.f4050p = 0;
            }
        }
    }

    @Override // p000.InterfaceC0625qo
    public final void cancel() {
        gq0 gq0Var = this.f4051q;
        if (gq0Var != null) {
            gq0Var.f2848c.cancel();
        }
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: f */
    public final void mo82f(Exception exc) {
        this.f4046l.mo902a(this.f4048n, exc, this.f4051q.f2848c, 3);
    }

    @Override // p000.InterfaceC0514no
    /* JADX INFO: renamed from: h */
    public final void mo84h(Object obj) {
        this.f4046l.mo904c(this.f4048n, obj, this.f4051q.f2848c, 3, this.f4048n);
    }
}
