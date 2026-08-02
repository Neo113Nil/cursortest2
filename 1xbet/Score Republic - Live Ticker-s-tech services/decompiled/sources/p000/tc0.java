package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class tc0 extends kc0 {

    /* JADX INFO: renamed from: d */
    public final ir0 f7430d;

    public tc0() {
        super(4);
        this.f7430d = ir0.f3639j;
    }

    /* JADX INFO: renamed from: d */
    public final x01 m4784d() {
        x01 x01Var;
        Object[] objArrCopyOf = this.f4343a;
        int i = this.f4344b;
        ir0 ir0Var = this.f7430d;
        if (i == 0) {
            x01Var = ir0.f3639j != ir0Var ? new x01(q01.f6303n, ir0Var) : x01.f8733q;
        } else {
            oa2.m3655b(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, ir0Var);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (ir0Var.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            x01Var = new x01(qc0.m4055j(i2, objArrCopyOf), ir0Var);
        }
        this.f4344b = x01Var.f8734p.size();
        this.f4345c = true;
        return x01Var;
    }
}
