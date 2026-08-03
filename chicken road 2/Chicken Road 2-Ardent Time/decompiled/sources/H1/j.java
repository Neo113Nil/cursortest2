package H1;

/* loaded from: classes.dex */
public final class j extends E1.u {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f641e;

    public j(long j2, H1.j jVar, int i2) {
        super(j2, jVar, i2);
        this.f641e = new java.util.concurrent.atomic.AtomicReferenceArray(H1.i.f640f);
    }

    @Override // E1.u
    public final int f() {
        return H1.i.f640f;
    }

    @Override // E1.u
    public final void g(int i2, k1.i iVar) {
        this.f641e.set(i2, H1.i.f639e);
        h();
    }

    public final java.lang.String toString() {
        return "SemaphoreSegment[id=" + this.f303c + ", hashCode=" + hashCode() + ']';
    }
}
