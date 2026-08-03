package z1;

/* renamed from: z1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f8582a;

    /* renamed from: b, reason: collision with root package name */
    public final s1.l f8583b;

    public C1062o(java.lang.Object obj, s1.l lVar) {
        this.f8582a = obj;
        this.f8583b = lVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1.C1062o)) {
            return false;
        }
        z1.C1062o c1062o = (z1.C1062o) obj;
        return kotlin.jvm.internal.i.a(this.f8582a, c1062o.f8582a) && kotlin.jvm.internal.i.a(this.f8583b, c1062o.f8583b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f8582a;
        return this.f8583b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return "CompletedWithCancellation(result=" + this.f8582a + ", onCancellation=" + this.f8583b + ')';
    }
}
