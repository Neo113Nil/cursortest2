package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 {

    /* JADX INFO: renamed from: a */
    public final a81 f887a;

    /* JADX INFO: renamed from: b */
    public final String f888b;

    public bj0(a81 a81Var, String str) {
        this.f887a = a81Var;
        this.f888b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0)) {
            return false;
        }
        bj0 bj0Var = (bj0) obj;
        return this.f887a == bj0Var.f887a && this.f888b.equals(bj0Var.f888b);
    }

    public final int hashCode() {
        return this.f888b.hashCode() + (System.identityHashCode(this.f887a) * 31);
    }
}
