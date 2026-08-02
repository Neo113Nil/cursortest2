package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 {

    /* JADX INFO: renamed from: a */
    public final List f2169a;

    /* JADX INFO: renamed from: b */
    public final C0831w8 f2170b;

    /* JADX INFO: renamed from: c */
    public final dr0 f2171c;

    public er0(List list, C0831w8 c0831w8, dr0 dr0Var) {
        this.f2169a = Collections.unmodifiableList(new ArrayList(list));
        a90.m127k(c0831w8, "attributes");
        this.f2170b = c0831w8;
        this.f2171c = dr0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof er0)) {
            return false;
        }
        er0 er0Var = (er0) obj;
        return AbstractC0875xf.m5649f(this.f2169a, er0Var.f2169a) && AbstractC0875xf.m5649f(this.f2170b, er0Var.f2170b) && AbstractC0875xf.m5649f(this.f2171c, er0Var.f2171c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2169a, this.f2170b, this.f2171c});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f2169a, "addresses");
        c0809vnM5362k.m5172c(this.f2170b, "attributes");
        c0809vnM5362k.m5172c(this.f2171c, "serviceConfig");
        return c0809vnM5362k.toString();
    }
}
