package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cu0 {

    /* JADX INFO: renamed from: a */
    public final l50 f1456a;

    /* JADX INFO: renamed from: b */
    public final yh0 f1457b;

    public cu0(l50 l50Var, yh0 yh0Var) {
        l50Var.getClass();
        this.f1456a = l50Var;
        this.f1457b = yh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        return af0.m187a(this.f1456a, cu0Var.f1456a) && af0.m187a(this.f1457b, cu0Var.f1457b);
    }

    public final int hashCode() {
        int iHashCode = this.f1456a.hashCode() * 31;
        yh0 yh0Var = this.f1457b;
        return iHashCode + (yh0Var == null ? 0 : yh0Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f1456a + ", owner=" + this.f1457b + ')';
    }
}
