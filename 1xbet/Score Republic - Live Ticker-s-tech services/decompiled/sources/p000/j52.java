package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j52 {

    /* JADX INFO: renamed from: a */
    public final p42 f3824a;

    /* JADX INFO: renamed from: b */
    public final vr0 f3825b;

    public j52(p42 p42Var, vr0 vr0Var) {
        this.f3824a = p42Var;
        this.f3825b = vr0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j52) {
            j52 j52Var = (j52) obj;
            p42 p42Var = j52Var.f3824a;
            p42 p42Var2 = this.f3824a;
            if (p42Var2 != null ? p42Var2 == p42Var : p42Var == null) {
                return this.f3825b == j52Var.f3825b;
            }
        }
        return false;
    }

    public final int hashCode() {
        p42 p42Var = this.f3824a;
        return this.f3825b.hashCode() ^ (((p42Var == null ? 0 : p42Var.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3824a);
        String string = this.f3825b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        sb.append("SnapshotBlobAndResult{snapshotBlob=");
        sb.append(strValueOf);
        sb.append(", snapshotResult=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
