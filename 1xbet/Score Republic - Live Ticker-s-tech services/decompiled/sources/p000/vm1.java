package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vm1 {

    /* JADX INFO: renamed from: a */
    public final rn1 f8220a = rn1.f6920b;

    /* JADX INFO: renamed from: b */
    public final String f8221b;

    public vm1(String str) {
        this.f8221b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vm1)) {
            return false;
        }
        vm1 vm1Var = (vm1) obj;
        return this.f8220a.equals(vm1Var.f8220a) && this.f8221b.equals(vm1Var.f8221b);
    }

    public final int hashCode() {
        return this.f8221b.hashCode() ^ this.f8220a.hashCode();
    }
}
