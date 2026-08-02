package p000;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements oe1 {

    /* JADX INFO: renamed from: a */
    public final Set f6106a;

    /* JADX INFO: renamed from: b */
    public final C0648ra f6107b;

    /* JADX INFO: renamed from: c */
    public final se1 f6108c;

    public pe1(Set set, C0648ra c0648ra, se1 se1Var) {
        this.f6106a = set;
        this.f6107b = c0648ra;
        this.f6108c = se1Var;
    }

    /* JADX INFO: renamed from: a */
    public final n71 m3901a(String str, C0818vw c0818vw, dd0 dd0Var) {
        Set set = this.f6106a;
        if (set.contains(c0818vw)) {
            return new n71(this.f6107b, str, c0818vw, dd0Var, this.f6108c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c0818vw, set));
    }
}
