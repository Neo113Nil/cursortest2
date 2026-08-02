package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 {

    /* JADX INFO: renamed from: a */
    public Class f7189a;

    /* JADX INFO: renamed from: b */
    public Class f7190b;

    /* JADX INFO: renamed from: c */
    public Class f7191c;

    public sq0(Class cls, Class cls2, Class cls3) {
        this.f7189a = cls;
        this.f7190b = cls2;
        this.f7191c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sq0.class != obj.getClass()) {
            return false;
        }
        sq0 sq0Var = (sq0) obj;
        return this.f7189a.equals(sq0Var.f7189a) && this.f7190b.equals(sq0Var.f7190b) && zg1.m5892c(this.f7191c, sq0Var.f7191c);
    }

    public final int hashCode() {
        int iHashCode = (this.f7190b.hashCode() + (this.f7189a.hashCode() * 31)) * 31;
        Class cls = this.f7191c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f7189a + ", second=" + this.f7190b + '}';
    }
}
