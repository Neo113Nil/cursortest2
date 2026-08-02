package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g32 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ f32 f2595j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ f32 f2596k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f2597l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean f2598m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ l32 f2599n;

    public g32(l32 l32Var, f32 f32Var, f32 f32Var2, long j, boolean z) {
        this.f2595j = f32Var;
        this.f2596k = f32Var2;
        this.f2597l = j;
        this.f2598m = z;
        this.f2599n = l32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2599n.m3162G(this.f2595j, this.f2596k, this.f2597l, this.f2598m, null);
    }
}
