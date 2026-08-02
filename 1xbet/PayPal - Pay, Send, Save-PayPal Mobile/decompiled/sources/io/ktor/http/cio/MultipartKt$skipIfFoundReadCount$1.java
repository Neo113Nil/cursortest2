package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", i = {0}, l = {144}, m = "skipIfFoundReadCount", n = {"prefix"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class MultipartKt$skipIfFoundReadCount$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = io.ktor.http.cio.MultipartKt.getHighSpeedVideoFpsRanges(null, null, this);
        return highSpeedVideoFpsRanges;
    }

    MultipartKt$skipIfFoundReadCount$1(kotlin.coroutines.Continuation<? super io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1> continuation) {
        super(continuation);
    }
}
