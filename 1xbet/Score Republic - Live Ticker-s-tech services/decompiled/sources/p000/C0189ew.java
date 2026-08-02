package p000;

/* JADX INFO: renamed from: ew */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0189ew implements md0 {

    /* JADX INFO: renamed from: a */
    public final boolean f2187a;

    public C0189ew(boolean z) {
        this.f2187a = z;
    }

    @Override // p000.md0
    /* JADX INFO: renamed from: a */
    public final boolean mo1410a() {
        return this.f2187a;
    }

    @Override // p000.md0
    /* JADX INFO: renamed from: d */
    public final gs0 mo1412d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f2187a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
