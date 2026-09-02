package z1;

/* loaded from: classes.dex */
public abstract class H extends z1.AbstractC1065s {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8528f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f8529c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8530d;

    /* renamed from: e, reason: collision with root package name */
    public i1.C0188g f8531e;

    public final void o(boolean z2) {
        long j2 = this.f8529c - (z2 ? 4294967296L : 1L);
        this.f8529c = j2;
        if (j2 <= 0 && this.f8530d) {
            t();
        }
    }

    public abstract java.lang.Thread p();

    public final void q(boolean z2) {
        this.f8529c = (z2 ? 4294967296L : 1L) + this.f8529c;
        if (z2) {
            return;
        }
        this.f8530d = true;
    }

    public abstract long r();

    public final boolean s() {
        i1.C0188g c0188g = this.f8531e;
        if (c0188g == null) {
            return false;
        }
        z1.A a2 = (z1.A) (c0188g.isEmpty() ? null : c0188g.removeFirst());
        if (a2 == null) {
            return false;
        }
        a2.run();
        return true;
    }

    public abstract void t();
}
