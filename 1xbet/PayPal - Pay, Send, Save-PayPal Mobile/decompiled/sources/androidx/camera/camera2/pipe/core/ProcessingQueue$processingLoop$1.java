package androidx.camera.camera2.pipe.core;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.camera.camera2.pipe.core.ProcessingQueue", f = "ProcessingQueue.kt", i = {1}, l = {102, 117}, m = "processingLoop", n = {io.ktor.http.ContentDisposition.Parameters.Size}, s = {"I$0"}, v = 1)
/* loaded from: classes6.dex */
final class ProcessingQueue$processingLoop$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.camera.camera2.pipe.core.ProcessingQueue<T> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProcessingQueue$processingLoop$1(androidx.camera.camera2.pipe.core.ProcessingQueue<T> processingQueue, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.core.ProcessingQueue$processingLoop$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = processingQueue;
    }
}
