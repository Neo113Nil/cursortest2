package g4;

/* renamed from: g4.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1144q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f13221a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f13222b;

    public C1144q(Class cls, Class cls2) {
        this.f13221a = cls;
        this.f13222b = cls2;
    }

    public static C1144q a(Class cls) {
        return new C1144q(InterfaceC1143p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1144q.class != obj.getClass()) {
            return false;
        }
        C1144q c1144q = (C1144q) obj;
        if (this.f13222b.equals(c1144q.f13222b)) {
            return this.f13221a.equals(c1144q.f13221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13221a.hashCode() + (this.f13222b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f13222b;
        Class cls2 = this.f13221a;
        if (cls2 == InterfaceC1143p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
