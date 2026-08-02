package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mx1 extends pw1 {

    /* JADX INFO: renamed from: k */
    public boolean f5182k;

    public mx1(f02 f02Var) {
        super(f02Var);
        ((f02) this.f7192j).f2237J++;
    }

    /* JADX INFO: renamed from: B */
    public final void m3446B() {
        if (this.f5182k) {
            return;
        }
        C0270h1.m2191g("Not initialized");
    }

    /* JADX INFO: renamed from: C */
    public final void m3447C() {
        if (this.f5182k) {
            C0270h1.m2191g("Can't initialize twice");
        } else {
            if (mo533D()) {
                return;
            }
            ((f02) this.f7192j).f2239L.incrementAndGet();
            this.f5182k = true;
        }
    }

    /* JADX INFO: renamed from: D */
    public abstract boolean mo533D();
}
