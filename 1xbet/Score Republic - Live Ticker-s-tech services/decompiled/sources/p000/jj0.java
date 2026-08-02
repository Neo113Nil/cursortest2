package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jj0 {

    /* JADX INFO: renamed from: a */
    public final List f3946a;

    /* JADX INFO: renamed from: b */
    public final C0831w8 f3947b;

    /* JADX INFO: renamed from: c */
    public final Object f3948c;

    public jj0(List list, C0831w8 c0831w8, Object obj) {
        a90.m127k(list, "addresses");
        this.f3946a = Collections.unmodifiableList(new ArrayList(list));
        a90.m127k(c0831w8, "attributes");
        this.f3947b = c0831w8;
        this.f3948c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj0)) {
            return false;
        }
        jj0 jj0Var = (jj0) obj;
        return AbstractC0875xf.m5649f(this.f3946a, jj0Var.f3946a) && AbstractC0875xf.m5649f(this.f3947b, jj0Var.f3947b) && AbstractC0875xf.m5649f(this.f3948c, jj0Var.f3948c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3946a, this.f3947b, this.f3948c});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f3946a, "addresses");
        c0809vnM5362k.m5172c(this.f3947b, "attributes");
        c0809vnM5362k.m5172c(this.f3948c, "loadBalancingPolicyConfig");
        return c0809vnM5362k.toString();
    }
}
