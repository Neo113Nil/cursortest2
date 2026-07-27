package X4;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final x f3648a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3649b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f3650c;

    public w(x xVar, x xVar2, Throwable th) {
        this.f3648a = xVar;
        this.f3649b = xVar2;
        this.f3650c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.i.a(this.f3648a, wVar.f3648a) && kotlin.jvm.internal.i.a(this.f3649b, wVar.f3649b) && kotlin.jvm.internal.i.a(this.f3650c, wVar.f3650c);
    }

    public final int hashCode() {
        int hashCode = this.f3648a.hashCode() * 31;
        x xVar = this.f3649b;
        int hashCode2 = (hashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Throwable th = this.f3650c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f3648a + ", nextPlan=" + this.f3649b + ", throwable=" + this.f3650c + ')';
    }

    public /* synthetic */ w(x xVar, Throwable th, int i2) {
        this(xVar, (x) null, (i2 & 4) != 0 ? null : th);
    }
}
