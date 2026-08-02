package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 {

    /* JADX INFO: renamed from: a */
    public final Class f1495a;

    /* JADX INFO: renamed from: b */
    public final Class f1496b;

    public cz0(Class cls, Class cls2) {
        this.f1495a = cls;
        this.f1496b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static cz0 m1050a(Class cls) {
        return new cz0(bz0.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cz0.class != obj.getClass()) {
            return false;
        }
        cz0 cz0Var = (cz0) obj;
        if (this.f1496b.equals(cz0Var.f1496b)) {
            return this.f1495a.equals(cz0Var.f1495a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1495a.hashCode() + (this.f1496b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f1496b;
        Class cls2 = this.f1495a;
        if (cls2 == bz0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
