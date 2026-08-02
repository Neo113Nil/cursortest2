package p000;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class en1 extends sq1 {

    /* JADX INFO: renamed from: k */
    public final Level f2147k;

    /* JADX INFO: renamed from: l */
    public final Set f2148l;

    /* JADX INFO: renamed from: m */
    public final vb2 f2149m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en1(String str) {
        super(str);
        Level level = Level.ALL;
        Set set = fn1.f2452o;
        this.f2147k = level;
        this.f2148l = fn1.f2452o;
        this.f2149m = fn1.f2453p;
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: r */
    public final boolean mo727r(Level level) {
        return true;
    }

    @Override // p000.sq1
    /* JADX INFO: renamed from: u */
    public final void mo728u(ra2 ra2Var) {
        String strMo5614a = (String) ra2Var.m4284d().mo1129x(lb2.f4757a);
        if (strMo5614a == null) {
            strMo5614a = (String) this.f7192j;
        }
        if (strMo5614a == null) {
            za2 za2Var = ra2Var.f6773d;
            if (za2Var == null) {
                C0270h1.m2191g("cannot request log site information prior to postProcess()");
                return;
            }
            strMo5614a = za2Var.mo5614a();
            int iIndexOf = strMo5614a.indexOf(36, strMo5614a.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strMo5614a = strMo5614a.substring(0, iIndexOf);
            }
        }
        fn1.m1883B(ra2Var, o80.m3640C(strMo5614a), this.f2147k, this.f2148l, this.f2149m);
    }
}
