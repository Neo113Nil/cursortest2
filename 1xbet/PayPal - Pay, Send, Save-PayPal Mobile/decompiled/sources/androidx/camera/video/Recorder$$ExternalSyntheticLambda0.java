package androidx.camera.video;

/* loaded from: classes6.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ java.util.concurrent.Executor f$0;
    public final /* synthetic */ java.lang.Runnable f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda0(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        this.f$0 = executor;
        this.f$1 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.execute(this.f$1);
    }
}
