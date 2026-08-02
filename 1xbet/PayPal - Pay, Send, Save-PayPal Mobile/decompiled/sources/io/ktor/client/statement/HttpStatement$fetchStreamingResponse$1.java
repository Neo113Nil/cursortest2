package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {150}, m = "fetchStreamingResponse", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpStatement$fetchStreamingResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.statement.HttpStatement getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchStreamingResponse(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$fetchStreamingResponse$1(io.ktor.client.statement.HttpStatement httpStatement, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement$fetchStreamingResponse$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = httpStatement;
    }
}
