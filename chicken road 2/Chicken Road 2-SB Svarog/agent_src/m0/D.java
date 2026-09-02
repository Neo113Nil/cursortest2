package m0;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0059p {

    /* renamed from: d, reason: collision with root package name */
    public long f889d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f890e;

    /* renamed from: f, reason: collision with root package name */
    public X.c f891f;

    public final void i() {
        long j2 = this.f889d - 4294967296L;
        this.f889d = j2;
        if (j2 <= 0 && this.f890e) {
            shutdown();
        }
    }

    public abstract Thread j();

    public final void k(boolean z2) {
        this.f889d = (z2 ? 4294967296L : 1L) + this.f889d;
        if (z2) {
            return;
        }
        this.f890e = true;
    }

    public final boolean l() {
        X.c cVar = this.f891f;
        if (cVar == null) {
            return false;
        }
        AbstractC0066x abstractC0066x = (AbstractC0066x) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0066x == null) {
            return false;
        }
        abstractC0066x.run();
        return true;
    }

    public abstract void shutdown();
}
