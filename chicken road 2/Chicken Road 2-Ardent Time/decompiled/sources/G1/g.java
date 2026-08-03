package G1;

/* loaded from: classes.dex */
public abstract class g extends z1.I {

    /* renamed from: c, reason: collision with root package name */
    public final G1.b f581c;

    public g(int i2, int i3, long j2, java.lang.String str) {
        this.f581c = new G1.b(i2, i3, j2, str);
    }

    @Override // z1.AbstractC1065s
    public final void l(k1.i iVar, java.lang.Runnable runnable) {
        G1.b bVar = this.f581c;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = G1.b.f566h;
        bVar.b(runnable, G1.k.f592g, false);
    }
}
