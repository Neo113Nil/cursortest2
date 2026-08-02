package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k62 extends d62 {

    /* JADX INFO: renamed from: l */
    public boolean f4296l;

    public k62(x62 x62Var) {
        super(x62Var);
        this.f1566k.f8802A++;
    }

    /* JADX INFO: renamed from: B */
    public final void m2988B() {
        if (this.f4296l) {
            return;
        }
        C0270h1.m2191g("Not initialized");
    }

    /* JADX INFO: renamed from: C */
    public final void m2989C() {
        if (this.f4296l) {
            C0270h1.m2191g("Can't initialize twice");
            return;
        }
        mo34D();
        this.f1566k.f8803B++;
        this.f4296l = true;
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo34D();
}
