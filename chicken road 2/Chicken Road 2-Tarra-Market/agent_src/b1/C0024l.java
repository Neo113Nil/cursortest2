package b1;

/* renamed from: b1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024l {

    /* renamed from: a, reason: collision with root package name */
    public final Object f669a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.l f670b;

    public C0024l(Object obj, U0.l lVar) {
        this.f669a = obj;
        this.f670b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0024l)) {
            return false;
        }
        C0024l c0024l = (C0024l) obj;
        return kotlin.jvm.internal.j.a(this.f669a, c0024l.f669a) && kotlin.jvm.internal.j.a(this.f670b, c0024l.f670b);
    }

    public final int hashCode() {
        Object obj = this.f669a;
        return this.f670b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f669a + ", onCancellation=" + this.f670b + ')';
    }
}
