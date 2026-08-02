package io.ktor.client.call;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.call.SavedCallKt", f = "SavedCall.kt", i = {0}, l = {36}, m = "save", n = {"$this$save"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class SavedCallKt$save$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return io.ktor.client.call.SavedCallKt.save(null, this);
    }

    SavedCallKt$save$1(kotlin.coroutines.Continuation<? super io.ktor.client.call.SavedCallKt$save$1> continuation) {
        super(continuation);
    }
}
