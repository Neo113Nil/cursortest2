package n1;

/* renamed from: n1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1321h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11385a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11386b;

    public C1321h(Object obj, String str) {
        this.f11385a = obj;
        this.f11386b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321h)) {
            return false;
        }
        C1321h c1321h = (C1321h) obj;
        return this.f11385a == c1321h.f11385a && this.f11386b.equals(c1321h.f11386b);
    }

    public final int hashCode() {
        return this.f11386b.hashCode() + (System.identityHashCode(this.f11385a) * 31);
    }
}
