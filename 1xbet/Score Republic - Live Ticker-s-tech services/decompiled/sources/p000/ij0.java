package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ij0 {

    /* JADX INFO: renamed from: e */
    public static final ij0 f3585e = new ij0(null, null, ja1.f3875e, false);

    /* JADX INFO: renamed from: a */
    public final AbstractC0959zp f3586a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0618qh f3587b;

    /* JADX INFO: renamed from: c */
    public final ja1 f3588c;

    /* JADX INFO: renamed from: d */
    public final boolean f3589d;

    public ij0(AbstractC0959zp abstractC0959zp, AbstractC0618qh abstractC0618qh, ja1 ja1Var, boolean z) {
        this.f3586a = abstractC0959zp;
        this.f3587b = abstractC0618qh;
        a90.m127k(ja1Var, "status");
        this.f3588c = ja1Var;
        this.f3589d = z;
    }

    /* JADX INFO: renamed from: a */
    public static ij0 m2652a(ja1 ja1Var) {
        a90.m122f("error status shouldn't be OK", !ja1Var.m2838f());
        return new ij0(null, null, ja1Var, false);
    }

    /* JADX INFO: renamed from: b */
    public static ij0 m2653b(AbstractC0959zp abstractC0959zp, fv0 fv0Var) {
        a90.m127k(abstractC0959zp, "subchannel");
        return new ij0(abstractC0959zp, fv0Var, ja1.f3875e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        return AbstractC0875xf.m5649f(this.f3586a, ij0Var.f3586a) && AbstractC0875xf.m5649f(this.f3588c, ij0Var.f3588c) && AbstractC0875xf.m5649f(this.f3587b, ij0Var.f3587b) && this.f3589d == ij0Var.f3589d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3586a, this.f3588c, this.f3587b, Boolean.valueOf(this.f3589d)});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f3586a, "subchannel");
        c0809vnM5362k.m5172c(this.f3587b, "streamTracerFactory");
        c0809vnM5362k.m5172c(this.f3588c, "status");
        c0809vnM5362k.m5174e("drop", this.f3589d);
        return c0809vnM5362k.toString();
    }
}
