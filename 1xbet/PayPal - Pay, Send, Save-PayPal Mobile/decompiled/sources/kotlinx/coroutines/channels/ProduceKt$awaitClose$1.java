package kotlinx.coroutines.channels;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class ProduceKt$awaitClose$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return kotlinx.coroutines.channels.ProduceKt.awaitClose(null, null, this);
    }

    ProduceKt$awaitClose$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ProduceKt$awaitClose$1> continuation) {
        super(continuation);
    }
}
