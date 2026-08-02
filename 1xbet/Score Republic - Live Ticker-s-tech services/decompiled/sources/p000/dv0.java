package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dv0 extends o80 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ o80 f1852n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ fv0 f1853o;

    public dv0(fv0 fv0Var, o80 o80Var) {
        this.f1853o = fv0Var;
        this.f1852n = o80Var;
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: A */
    public final void mo1308A(ja1 ja1Var) {
        yu0 yu0Var = this.f1853o.f2506a;
        boolean zM2838f = ja1Var.m2838f();
        cv0 cv0Var = yu0Var.f9467a;
        if (cv0Var.f1466e != null || cv0Var.f1467f != null) {
            f50 f50Var = yu0Var.f9468b;
            if (zM2838f) {
                ((AtomicLong) f50Var.f2313k).getAndIncrement();
            } else {
                ((AtomicLong) f50Var.f2314l).getAndIncrement();
            }
        }
        this.f1852n.mo1308A(ja1Var);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: B */
    public final void mo1309B(C0831w8 c0831w8, np0 np0Var) {
        this.f1852n.mo1309B(c0831w8, np0Var);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: i */
    public final void mo1310i() {
        this.f1852n.mo1310i();
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: m */
    public final void mo1311m() {
        this.f1852n.mo1311m();
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: n */
    public final void mo1312n(int i) {
        this.f1852n.mo1312n(i);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: o */
    public final void mo1313o(int i, long j) {
        this.f1852n.mo1313o(i, j);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: p */
    public final void mo1314p(np0 np0Var) {
        this.f1852n.mo1314p(np0Var);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: q */
    public final void mo1315q(long j) {
        this.f1852n.mo1315q(j);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: r */
    public final void mo1316r(long j) {
        this.f1852n.mo1316r(j);
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f1852n, "delegate");
        return c0809vnM5362k.toString();
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: v */
    public final void mo1317v() {
        this.f1852n.mo1317v();
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: w */
    public final void mo1318w(int i) {
        this.f1852n.mo1318w(i);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: x */
    public final void mo1319x(int i, long j, long j2) {
        this.f1852n.mo1319x(i, j, j2);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: y */
    public final void mo1320y(long j) {
        this.f1852n.mo1320y(j);
    }

    @Override // p000.o80
    /* JADX INFO: renamed from: z */
    public final void mo586z(long j) {
        this.f1852n.mo586z(j);
    }
}
