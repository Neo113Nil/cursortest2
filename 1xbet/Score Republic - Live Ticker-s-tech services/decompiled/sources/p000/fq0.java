package p000;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 {

    /* JADX INFO: renamed from: b */
    public static final ArrayDeque f2473b = new ArrayDeque(0);

    /* JADX INFO: renamed from: a */
    public Object f2474a;

    /* JADX INFO: renamed from: a */
    public static fq0 m1884a(Object obj) {
        fq0 fq0Var;
        ArrayDeque arrayDeque = f2473b;
        synchronized (arrayDeque) {
            fq0Var = (fq0) arrayDeque.poll();
        }
        if (fq0Var == null) {
            fq0Var = new fq0();
        }
        fq0Var.f2474a = obj;
        return fq0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fq0) && this.f2474a.equals(((fq0) obj).f2474a);
    }

    public final int hashCode() {
        return this.f2474a.hashCode();
    }
}
