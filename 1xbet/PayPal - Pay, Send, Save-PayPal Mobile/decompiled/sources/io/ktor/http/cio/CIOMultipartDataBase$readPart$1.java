package io.ktor.http.cio;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.cio.CIOMultipartDataBase", f = "CIOMultipartDataBase.kt", i = {}, l = {39, 45}, m = "readPart", n = {}, s = {})
/* loaded from: classes17.dex */
final class CIOMultipartDataBase$readPart$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.http.cio.CIOMultipartDataBase getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.readPart(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOMultipartDataBase$readPart$1(io.ktor.http.cio.CIOMultipartDataBase cIOMultipartDataBase, kotlin.coroutines.Continuation<? super io.ktor.http.cio.CIOMultipartDataBase$readPart$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = cIOMultipartDataBase;
    }
}
