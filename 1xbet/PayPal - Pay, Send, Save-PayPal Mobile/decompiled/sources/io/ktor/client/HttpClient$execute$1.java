package io.ktor.client;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", i = {}, l = {1418}, m = "execute$ktor_client_core", n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpClient$execute$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.HttpClient getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.execute$ktor_client_core(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClient$execute$1(io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.HttpClient$execute$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = httpClient;
    }
}
