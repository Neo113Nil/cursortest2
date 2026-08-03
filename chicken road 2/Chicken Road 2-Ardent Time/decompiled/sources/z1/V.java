package z1;

/* loaded from: classes.dex */
public final class V extends z1.C1053f {

    /* renamed from: i, reason: collision with root package name */
    public final z1.C1059l f8542i;

    public V(k1.d dVar, z1.C1059l c1059l) {
        super(1, dVar);
        this.f8542i = c1059l;
    }

    @Override // z1.C1053f
    public final java.lang.Throwable s(z1.Z z2) {
        java.lang.Throwable c2;
        java.lang.Object D2 = this.f8542i.D();
        return (!(D2 instanceof z1.X) || (c2 = ((z1.X) D2).c()) == null) ? D2 instanceof z1.C1061n ? ((z1.C1061n) D2).f8581a : z2.z() : c2;
    }

    @Override // z1.C1053f
    public final java.lang.String z() {
        return "AwaitContinuation";
    }
}
