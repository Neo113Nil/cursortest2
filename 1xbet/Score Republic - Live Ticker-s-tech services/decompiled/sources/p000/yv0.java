package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class yv0 {

    /* JADX INFO: renamed from: a */
    public final C0095ce f9511a;

    /* JADX INFO: renamed from: b */
    public final np0 f9512b;

    /* JADX INFO: renamed from: c */
    public final wp0 f9513c;

    public yv0(wp0 wp0Var, np0 np0Var, C0095ce c0095ce) {
        a90.m127k(wp0Var, "method");
        this.f9513c = wp0Var;
        a90.m127k(np0Var, "headers");
        this.f9512b = np0Var;
        a90.m127k(c0095ce, "callOptions");
        this.f9511a = c0095ce;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yv0.class == obj.getClass()) {
            yv0 yv0Var = (yv0) obj;
            if (AbstractC0875xf.m5649f(this.f9511a, yv0Var.f9511a) && AbstractC0875xf.m5649f(this.f9512b, yv0Var.f9512b) && AbstractC0875xf.m5649f(this.f9513c, yv0Var.f9513c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9511a, this.f9512b, this.f9513c});
    }

    public final String toString() {
        return "[method=" + this.f9513c + " headers=" + this.f9512b + " callOptions=" + this.f9511a + "]";
    }
}
