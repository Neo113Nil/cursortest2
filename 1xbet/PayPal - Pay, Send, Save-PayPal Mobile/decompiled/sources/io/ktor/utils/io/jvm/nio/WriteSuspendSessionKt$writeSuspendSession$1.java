package io.ktor.utils.io.jvm.nio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, 45, 45}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class WriteSuspendSessionKt$writeSuspendSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt.writeSuspendSession(null, null, this);
    }

    WriteSuspendSessionKt$writeSuspendSession$1(kotlin.coroutines.Continuation<? super io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt$writeSuspendSession$1> continuation) {
        super(continuation);
    }
}
