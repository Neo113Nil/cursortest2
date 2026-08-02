package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class or0 extends t22 {

    /* JADX INFO: renamed from: j */
    public final jr0 f5849j;

    public or0(jr0 jr0Var) {
        jr0Var.getClass();
        this.f5849j = jr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && or0.class == obj.getClass() && af0.m187a(this.f5849j, ((or0) obj).f5849j);
    }

    public final int hashCode() {
        return this.f5849j.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f5849j + ", direction=-1)";
    }
}
