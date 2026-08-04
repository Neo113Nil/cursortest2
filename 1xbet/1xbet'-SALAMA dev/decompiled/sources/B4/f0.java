package B4;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1158b;

    public f0(boolean z4, boolean z7) {
        this.f1157a = z4;
        this.f1158b = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f1157a == f0Var.f1157a && this.f1158b == f0Var.f1158b;
    }

    public final int hashCode() {
        return ((this.f1157a ? 1 : 0) * 31) + (this.f1158b ? 1 : 0);
    }

    public final String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f1157a + ", isFromCache=" + this.f1158b + '}';
    }
}
