package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 implements fh1 {

    /* JADX INFO: renamed from: a */
    public boolean f4226a = false;

    /* JADX INFO: renamed from: b */
    public boolean f4227b = false;

    /* JADX INFO: renamed from: c */
    public C0895xz f4228c;

    /* JADX INFO: renamed from: d */
    public final iy0 f4229d;

    public jy0(iy0 iy0Var) {
        this.f4229d = iy0Var;
    }

    @Override // p000.fh1
    /* JADX INFO: renamed from: b */
    public final fh1 mo1791b(String str) {
        if (this.f4226a) {
            throw new C0855ww("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4226a = true;
        this.f4229d.m2746f(this.f4228c, str, this.f4227b);
        return this;
    }

    @Override // p000.fh1
    /* JADX INFO: renamed from: c */
    public final fh1 mo1792c(boolean z) {
        if (this.f4226a) {
            throw new C0855ww("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4226a = true;
        this.f4229d.m2742b(this.f4228c, z ? 1 : 0, this.f4227b);
        return this;
    }
}
