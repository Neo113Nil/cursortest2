package io.ktor.client.engine.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", i = {0}, l = {60, 67, 68, 69}, m = "execute", n = {com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE}, s = {"L$0"})
/* loaded from: classes17.dex */
final class OkHttpEngine$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.engine.okhttp.OkHttpEngine getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OkHttpEngine$execute$1(io.ktor.client.engine.okhttp.OkHttpEngine okHttpEngine, kotlin.coroutines.Continuation<? super io.ktor.client.engine.okhttp.OkHttpEngine$execute$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = okHttpEngine;
    }
}
