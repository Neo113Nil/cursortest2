package androidx.work.impl.background.systemalarm;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ DelayMetCommandHandler a;

    public /* synthetic */ a(DelayMetCommandHandler delayMetCommandHandler) {
        this.a = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.startWork();
    }
}
