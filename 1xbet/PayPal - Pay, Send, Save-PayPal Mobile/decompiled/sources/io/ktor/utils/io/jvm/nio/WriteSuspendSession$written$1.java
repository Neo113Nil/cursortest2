package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {}, l = {30, 32}, m = "written", n = {}, s = {})
/* loaded from: classes3.dex */
final class WriteSuspendSession$written$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.utils.io.jvm.nio.WriteSuspendSession getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.written(0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteSuspendSession$written$1(io.ktor.utils.io.jvm.nio.WriteSuspendSession writeSuspendSession, kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSession$written$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = writeSuspendSession;
    }
}
