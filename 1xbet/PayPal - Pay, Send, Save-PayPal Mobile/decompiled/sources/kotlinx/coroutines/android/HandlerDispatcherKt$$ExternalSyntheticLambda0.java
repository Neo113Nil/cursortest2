package kotlinx.coroutines.android;

/* loaded from: classes3.dex */
public final /* synthetic */ class HandlerDispatcherKt$$ExternalSyntheticLambda0 implements android.view.Choreographer.FrameCallback {
    public final /* synthetic */ kotlinx.coroutines.CancellableContinuation f$0;

    public /* synthetic */ HandlerDispatcherKt$$ExternalSyntheticLambda0(kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        this.f$0 = cancellableContinuation;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f$0.resumeUndispatched(kotlinx.coroutines.Dispatchers.getMain(), java.lang.Long.valueOf(j));
    }
}
