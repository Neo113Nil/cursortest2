package p000;

/* JADX INFO: renamed from: ha */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0279ha extends yr0 {

    /* JADX INFO: renamed from: a */
    public final xr0 f3135a;

    /* JADX INFO: renamed from: b */
    public final wr0 f3136b;

    public C0279ha(xr0 xr0Var, wr0 wr0Var) {
        this.f3135a = xr0Var;
        this.f3136b = wr0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yr0) {
            yr0 yr0Var = (yr0) obj;
            xr0 xr0Var = this.f3135a;
            if (xr0Var != null ? xr0Var.equals(((C0279ha) yr0Var).f3135a) : ((C0279ha) yr0Var).f3135a == null) {
                wr0 wr0Var = this.f3136b;
                if (wr0Var != null ? wr0Var.equals(((C0279ha) yr0Var).f3136b) : ((C0279ha) yr0Var).f3136b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xr0 xr0Var = this.f3135a;
        int iHashCode = ((xr0Var == null ? 0 : xr0Var.hashCode()) ^ 1000003) * 1000003;
        wr0 wr0Var = this.f3136b;
        return iHashCode ^ (wr0Var != null ? wr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f3135a + ", mobileSubtype=" + this.f3136b + "}";
    }
}
