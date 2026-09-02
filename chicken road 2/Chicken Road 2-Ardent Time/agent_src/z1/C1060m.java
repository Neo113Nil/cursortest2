package z1;

/* renamed from: z1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1060m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f8575a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.D f8576b;

    /* renamed from: c, reason: collision with root package name */
    public final s1.l f8577c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f8578d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f8579e;

    public C1060m(java.lang.Object obj, z1.D d2, s1.l lVar, java.lang.Object obj2, java.lang.Throwable th) {
        this.f8575a = obj;
        this.f8576b = d2;
        this.f8577c = lVar;
        this.f8578d = obj2;
        this.f8579e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static z1.C1060m a(z1.C1060m c1060m, z1.D d2, java.util.concurrent.CancellationException cancellationException, int i2) {
        java.lang.Object obj = c1060m.f8575a;
        if ((i2 & 2) != 0) {
            d2 = c1060m.f8576b;
        }
        z1.D d3 = d2;
        s1.l lVar = c1060m.f8577c;
        java.lang.Object obj2 = c1060m.f8578d;
        java.util.concurrent.CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = c1060m.f8579e;
        }
        c1060m.getClass();
        return new z1.C1060m(obj, d3, lVar, obj2, cancellationException2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1.C1060m)) {
            return false;
        }
        z1.C1060m c1060m = (z1.C1060m) obj;
        return kotlin.jvm.internal.i.a(this.f8575a, c1060m.f8575a) && kotlin.jvm.internal.i.a(this.f8576b, c1060m.f8576b) && kotlin.jvm.internal.i.a(this.f8577c, c1060m.f8577c) && kotlin.jvm.internal.i.a(this.f8578d, c1060m.f8578d) && kotlin.jvm.internal.i.a(this.f8579e, c1060m.f8579e);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f8575a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        z1.D d2 = this.f8576b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        s1.l lVar = this.f8577c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.lang.Object obj2 = this.f8578d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th = this.f8579e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f8575a + ", cancelHandler=" + this.f8576b + ", onCancellation=" + this.f8577c + ", idempotentResume=" + this.f8578d + ", cancelCause=" + this.f8579e + ')';
    }

    public /* synthetic */ C1060m(java.lang.Object obj, z1.D d2, s1.l lVar, java.util.concurrent.CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : d2, (i2 & 4) != 0 ? null : lVar, (java.lang.Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
