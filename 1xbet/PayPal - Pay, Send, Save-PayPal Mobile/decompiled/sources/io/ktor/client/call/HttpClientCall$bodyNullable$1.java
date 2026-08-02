package io.ktor.client.call;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {0, 1}, l = {96, 99}, m = "bodyNullable", n = {"info", "info"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class HttpClientCall$bodyNullable$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.call.HttpClientCall getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.bodyNullable(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCall$bodyNullable$1(io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall$bodyNullable$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = httpClientCall;
    }
}
