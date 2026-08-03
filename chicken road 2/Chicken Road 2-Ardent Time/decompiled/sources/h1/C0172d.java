package h1;

/* renamed from: h1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0172d implements java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f3295a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f3296b;

    public C0172d(java.lang.Object obj, java.lang.Object obj2) {
        this.f3295a = obj;
        this.f3296b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1.C0172d)) {
            return false;
        }
        h1.C0172d c0172d = (h1.C0172d) obj;
        return kotlin.jvm.internal.i.a(this.f3295a, c0172d.f3295a) && kotlin.jvm.internal.i.a(this.f3296b, c0172d.f3296b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f3295a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f3296b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.f3295a + ", " + this.f3296b + ')';
    }
}
