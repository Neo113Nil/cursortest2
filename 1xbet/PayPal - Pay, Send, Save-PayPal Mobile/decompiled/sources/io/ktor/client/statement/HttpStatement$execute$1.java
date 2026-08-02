package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {0, 1}, l = {54, 57, 59, 59}, m = "execute", n = {"block", "response"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class HttpStatement$execute$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.statement.HttpStatement Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.execute(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$execute$1(io.ktor.client.statement.HttpStatement httpStatement, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement$execute$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = httpStatement;
    }
}
