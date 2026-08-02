package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class se0 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ te0 f7101j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f7102k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ xe0 f7103l;

    public se0(xe0 xe0Var, te0 te0Var, boolean z) {
        this.f7103l = xe0Var;
        this.f7101j = te0Var;
        this.f7102k = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7103l.f8930t.m4577m(this.f7101j, this.f7102k);
    }
}
