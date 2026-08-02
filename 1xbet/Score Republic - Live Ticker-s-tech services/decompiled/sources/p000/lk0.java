package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class lk0 implements jw0 {

    /* JADX INFO: renamed from: a */
    public final mk0 f4816a;

    /* JADX INFO: renamed from: b */
    public int f4817b;

    /* JADX INFO: renamed from: c */
    public Class f4818c;

    public lk0(mk0 mk0Var) {
        this.f4816a = mk0Var;
    }

    @Override // p000.jw0
    /* JADX INFO: renamed from: a */
    public final void mo2969a() {
        this.f4816a.m4576l(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lk0) {
            lk0 lk0Var = (lk0) obj;
            if (this.f4817b == lk0Var.f4817b && this.f4818c == lk0Var.f4818c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f4817b * 31;
        Class cls = this.f4818c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f4817b + "array=" + this.f4818c + '}';
    }
}
