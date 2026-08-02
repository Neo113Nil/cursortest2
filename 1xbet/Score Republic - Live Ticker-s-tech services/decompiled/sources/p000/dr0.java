package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 {

    /* JADX INFO: renamed from: a */
    public final ja1 f1802a;

    /* JADX INFO: renamed from: b */
    public final Object f1803b;

    public dr0(ja1 ja1Var) {
        this.f1803b = null;
        a90.m127k(ja1Var, "status");
        this.f1802a = ja1Var;
        a90.m121e(ja1Var, "cannot use OK status: %s", !ja1Var.m2838f());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dr0.class == obj.getClass()) {
            dr0 dr0Var = (dr0) obj;
            if (AbstractC0875xf.m5649f(this.f1802a, dr0Var.f1802a) && AbstractC0875xf.m5649f(this.f1803b, dr0Var.f1803b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1802a, this.f1803b});
    }

    public final String toString() {
        Object obj = this.f1803b;
        if (obj != null) {
            C0809vn c0809vnM5362k = wm1.m5362k(this);
            c0809vnM5362k.m5172c(obj, "config");
            return c0809vnM5362k.toString();
        }
        C0809vn c0809vnM5362k2 = wm1.m5362k(this);
        c0809vnM5362k2.m5172c(this.f1802a, "error");
        return c0809vnM5362k2.toString();
    }

    public dr0(Object obj) {
        this.f1803b = obj;
        this.f1802a = null;
    }
}
