package androidx.work.impl.background.systemalarm;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class DelayMetCommandHandler$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ androidx.work.impl.background.systemalarm.DelayMetCommandHandler f$0;

    public /* synthetic */ DelayMetCommandHandler$$ExternalSyntheticLambda0(androidx.work.impl.background.systemalarm.DelayMetCommandHandler delayMetCommandHandler) {
        this.f$0 = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.stopWork();
    }
}
