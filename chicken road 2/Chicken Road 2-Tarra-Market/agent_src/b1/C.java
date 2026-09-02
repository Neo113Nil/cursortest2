package b1;

/* loaded from: classes.dex */
public abstract class C extends AbstractC0028p {

    /* renamed from: c, reason: collision with root package name */
    public long f623c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f624d;

    /* renamed from: e, reason: collision with root package name */
    public L0.b f625e;

    public final void n() {
        long j2 = this.f623c - 4294967296L;
        this.f623c = j2;
        if (j2 <= 0 && this.f624d) {
            r();
        }
    }

    public abstract Thread o();

    public final void p(boolean z2) {
        this.f623c = (z2 ? 4294967296L : 1L) + this.f623c;
        if (z2) {
            return;
        }
        this.f624d = true;
    }

    public final boolean q() {
        L0.b bVar = this.f625e;
        if (bVar == null) {
            return false;
        }
        AbstractC0034w abstractC0034w = (AbstractC0034w) (bVar.isEmpty() ? null : bVar.removeFirst());
        if (abstractC0034w == null) {
            return false;
        }
        abstractC0034w.run();
        return true;
    }

    public abstract void r();
}
