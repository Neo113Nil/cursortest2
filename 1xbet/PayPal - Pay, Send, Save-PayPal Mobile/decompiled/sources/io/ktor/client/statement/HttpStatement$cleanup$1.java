package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {}, l = {185}, m = "cleanup", n = {}, s = {})
/* loaded from: classes17.dex */
final class HttpStatement$cleanup$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.client.statement.HttpStatement Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.cleanup(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$cleanup$1(io.ktor.client.statement.HttpStatement httpStatement, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement$cleanup$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = httpStatement;
    }
}
