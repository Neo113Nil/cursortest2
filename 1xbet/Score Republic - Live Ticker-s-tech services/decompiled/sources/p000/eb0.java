package p000;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class eb0 {

    /* JADX INFO: renamed from: a */
    public final int f2051a;

    /* JADX INFO: renamed from: b */
    public final long f2052b;

    /* JADX INFO: renamed from: c */
    public final sc0 f2053c;

    public eb0(int i, long j, Set set) {
        this.f2051a = i;
        this.f2052b = j;
        this.f2053c = sc0.m4515p(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || eb0.class != obj.getClass()) {
            return false;
        }
        eb0 eb0Var = (eb0) obj;
        return this.f2051a == eb0Var.f2051a && this.f2052b == eb0Var.f2052b && AbstractC0875xf.m5649f(this.f2053c, eb0Var.f2053c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2051a), Long.valueOf(this.f2052b), this.f2053c});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5175f("maxAttempts", String.valueOf(this.f2051a));
        c0809vnM5362k.m5173d("hedgingDelayNanos", this.f2052b);
        c0809vnM5362k.m5172c(this.f2053c, "nonFatalStatusCodes");
        return c0809vnM5362k.toString();
    }
}
