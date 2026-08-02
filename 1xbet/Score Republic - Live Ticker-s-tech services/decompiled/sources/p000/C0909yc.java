package p000;

/* JADX INFO: renamed from: yc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0909yc {

    /* JADX INFO: renamed from: a */
    public final xc1 f9269a;

    /* JADX INFO: renamed from: b */
    public final String f9270b;

    public C0909yc(xc1 xc1Var, String str) {
        this.f9269a = xc1Var;
        this.f9270b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0909yc)) {
            return false;
        }
        C0909yc c0909yc = (C0909yc) obj;
        return hashCode() == c0909yc.hashCode() && this.f9269a.equals(c0909yc.f9269a) && this.f9270b.equals(c0909yc.f9270b);
    }

    public final int hashCode() {
        return this.f9270b.hashCode() + this.f9269a.hashCode();
    }
}
