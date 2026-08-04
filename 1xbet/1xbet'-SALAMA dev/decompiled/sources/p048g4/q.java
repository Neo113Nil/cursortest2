package p048g4;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f13227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f13228b;

    public q(Class cls, Class cls2) {
        this.f13227a = cls;
        this.f13228b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f13228b.equals(qVar.f13228b)) {
            return this.f13227a.equals(qVar.f13227a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13227a.hashCode() + (this.f13228b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f13228b;
        Class cls2 = this.f13227a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
