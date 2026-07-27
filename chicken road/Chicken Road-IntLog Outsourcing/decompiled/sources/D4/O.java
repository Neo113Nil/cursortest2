package D4;

import g4.C0463h;

/* loaded from: classes.dex */
public abstract class O extends AbstractC0020u {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f475f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f476c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f477d;

    /* renamed from: e, reason: collision with root package name */
    public C0463h f478e;

    public final void F(boolean z) {
        long j2 = this.f476c - (z ? 4294967296L : 1L);
        this.f476c = j2;
        if (j2 <= 0 && this.f477d) {
            shutdown();
        }
    }

    public final void G(D d6) {
        C0463h c0463h = this.f478e;
        if (c0463h == null) {
            c0463h = new C0463h();
            this.f478e = c0463h;
        }
        c0463h.addLast(d6);
    }

    public abstract Thread H();

    public final void I(boolean z) {
        this.f476c = (z ? 4294967296L : 1L) + this.f476c;
        if (z) {
            return;
        }
        this.f477d = true;
    }

    public final boolean J() {
        return this.f476c >= 4294967296L;
    }

    public abstract long K();

    public final boolean L() {
        C0463h c0463h = this.f478e;
        if (c0463h == null) {
            return false;
        }
        D d6 = (D) (c0463h.isEmpty() ? null : c0463h.removeFirst());
        if (d6 == null) {
            return false;
        }
        d6.run();
        return true;
    }

    public void M(long j2, L l2) {
        RunnableC0025z.f560j.Q(j2, l2);
    }

    public abstract void shutdown();
}
