package io.ktor.client.plugins;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", i = {}, l = {132}, m = "execute", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpSend$DefaultSender$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.HttpSend.DefaultSender getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpSend$DefaultSender$execute$1(io.ktor.client.plugins.HttpSend.DefaultSender defaultSender, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpSend$DefaultSender$execute$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = defaultSender;
    }
}
