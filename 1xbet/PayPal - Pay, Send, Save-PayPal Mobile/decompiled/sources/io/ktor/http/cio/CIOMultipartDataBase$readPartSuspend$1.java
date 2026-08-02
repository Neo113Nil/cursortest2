package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {51, 52}, m = "readPartSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class CIOMultipartDataBase$readPartSuspend$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.http.cio.CIOMultipartDataBase Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$readPartSuspend$1(io.ktor.http.cio.CIOMultipartDataBase cIOMultipartDataBase, kotlin.coroutines.Continuation<? super io.ktor.http.cio.CIOMultipartDataBase$readPartSuspend$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cIOMultipartDataBase;
    }
}
