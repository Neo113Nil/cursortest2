package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gc0 extends zc0 {

    /* JADX INFO: renamed from: c */
    public cc0 f2692c;

    /* JADX INFO: renamed from: d */
    public C0047b2 f2693d;

    @Override // p000.zc0
    /* JADX INFO: renamed from: a */
    public final cc0 mo1147a() {
        return this.f2692c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gc0)) {
            return false;
        }
        gc0 gc0Var = (gc0) obj;
        C0047b2 c0047b2 = gc0Var.f2693d;
        if (hashCode() != gc0Var.hashCode()) {
            return false;
        }
        C0047b2 c0047b3 = this.f2693d;
        return (c0047b3 != null || c0047b2 == null) && (c0047b3 == null || c0047b3.equals(c0047b2)) && this.f2692c.equals(gc0Var.f2692c);
    }

    public final int hashCode() {
        C0047b2 c0047b2 = this.f2693d;
        return this.f2692c.f1215a.hashCode() + (c0047b2 != null ? c0047b2.hashCode() : 0);
    }
}
