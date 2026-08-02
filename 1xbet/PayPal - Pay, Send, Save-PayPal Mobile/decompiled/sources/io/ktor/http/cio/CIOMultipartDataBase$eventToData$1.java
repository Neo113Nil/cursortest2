package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {0}, l = {62}, m = "eventToData", n = {"event"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class CIOMultipartDataBase$eventToData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.http.cio.CIOMultipartDataBase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$eventToData$1(io.ktor.http.cio.CIOMultipartDataBase cIOMultipartDataBase, kotlin.coroutines.Continuation<? super io.ktor.http.cio.CIOMultipartDataBase$eventToData$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cIOMultipartDataBase;
    }
}
