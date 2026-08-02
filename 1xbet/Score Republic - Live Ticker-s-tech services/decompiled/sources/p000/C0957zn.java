package p000;

/* JADX INFO: renamed from: zn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0957zn {

    /* JADX INFO: renamed from: a */
    public final cz0 f9864a;

    /* JADX INFO: renamed from: b */
    public final boolean f9865b;

    public C0957zn(cz0 cz0Var, boolean z) {
        this.f9864a = cz0Var;
        this.f9865b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0957zn) {
            C0957zn c0957zn = (C0957zn) obj;
            if (c0957zn.f9864a.equals(this.f9864a) && c0957zn.f9865b == this.f9865b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f9865b).hashCode() ^ ((this.f9864a.hashCode() ^ 1000003) * 1000003);
    }
}
