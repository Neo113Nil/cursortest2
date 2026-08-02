package p000;

import android.graphics.Insets;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ij1 extends oj1 {

    /* JADX INFO: renamed from: c */
    public final WindowInsets.Builder f3590c;

    public ij1(ak1 ak1Var) {
        super(ak1Var);
        WindowInsets windowInsetsM271a = ak1Var.m271a();
        this.f3590c = windowInsetsM271a != null ? new WindowInsets.Builder(windowInsetsM271a) : new WindowInsets.Builder();
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: b */
    public ak1 mo2654b() {
        m3696a();
        ak1 ak1VarM270b = ak1.m270b(this.f3590c.build(), null);
        xj1 xj1Var = ak1VarM270b.f229a;
        xj1Var.mo3943s(null);
        xj1Var.mo3942r(null);
        xj1Var.mo3946v(this.f5759a);
        xj1Var.mo3947w(this.f5760b);
        return ak1VarM270b;
    }

    @Override // p000.oj1
    /* JADX INFO: renamed from: d */
    public void mo2655d(wd0 wd0Var) {
        this.f3590c.setSystemWindowInsets(Insets.of(wd0Var.f8515a, wd0Var.f8516b, wd0Var.f8517c, wd0Var.f8518d));
    }

    public ij1() {
        this.f3590c = new WindowInsets.Builder();
    }
}
