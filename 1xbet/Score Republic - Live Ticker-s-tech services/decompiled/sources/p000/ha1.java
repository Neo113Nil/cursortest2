package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ha1 {

    /* JADX INFO: renamed from: a */
    public final o80[] f3140a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f3141b = new AtomicBoolean(false);

    static {
        new ha1(new o80[0]);
    }

    public ha1(o80[] o80VarArr) {
        this.f3140a = o80VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m2244a(long j) {
        for (o80 o80Var : this.f3140a) {
            o80Var.mo1316r(j);
        }
    }
}
