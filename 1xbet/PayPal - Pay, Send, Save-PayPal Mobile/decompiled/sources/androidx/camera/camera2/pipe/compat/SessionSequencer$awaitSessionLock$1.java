package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.compat.SessionSequencer", f = "ConcurrentSessionSequencers.kt", i = {}, l = {98}, m = "awaitSessionLock", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SessionSequencer$awaitSessionLock$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.camera.camera2.pipe.compat.SessionSequencer getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.awaitSessionLock(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionSequencer$awaitSessionLock$1(androidx.camera.camera2.pipe.compat.SessionSequencer sessionSequencer, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.compat.SessionSequencer$awaitSessionLock$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = sessionSequencer;
    }
}
