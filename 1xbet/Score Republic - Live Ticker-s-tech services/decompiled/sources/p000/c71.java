package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c71 {

    /* JADX INFO: renamed from: a */
    public final nj0 f1156a;

    /* JADX INFO: renamed from: b */
    public final Object f1157b;

    public c71(nj0 nj0Var, Object obj) {
        this.f1156a = nj0Var;
        this.f1157b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c71.class == obj.getClass()) {
            c71 c71Var = (c71) obj;
            if (AbstractC0875xf.m5649f(this.f1156a, c71Var.f1156a) && AbstractC0875xf.m5649f(this.f1157b, c71Var.f1157b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1156a, this.f1157b});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f1156a, "provider");
        c0809vnM5362k.m5172c(this.f1157b, "config");
        return c0809vnM5362k.toString();
    }
}
