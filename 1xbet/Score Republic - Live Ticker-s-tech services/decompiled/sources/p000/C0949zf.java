package p000;

/* JADX INFO: renamed from: zf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949zf extends C0017ag {

    /* JADX INFO: renamed from: a */
    public final Throwable f9751a;

    public C0949zf(Throwable th) {
        this.f9751a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0949zf) {
            return af0.m187a(this.f9751a, ((C0949zf) obj).f9751a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f9751a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // p000.C0017ag
    public final String toString() {
        return "Closed(" + this.f9751a + ')';
    }
}
