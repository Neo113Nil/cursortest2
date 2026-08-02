package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0, 1, 1}, l = {75, 82}, m = "partToData", n = {"part", "part", "headers"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class CIOMultipartDataBase$partToData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.http.cio.CIOMultipartDataBase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$partToData$1(io.ktor.http.cio.CIOMultipartDataBase cIOMultipartDataBase, kotlin.coroutines.Continuation<? super io.ktor.http.cio.CIOMultipartDataBase$partToData$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cIOMultipartDataBase;
    }
}
