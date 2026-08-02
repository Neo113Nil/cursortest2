package io.ktor.client.statement;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", i = {1, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 165, 166}, m = "fetchResponse", n = {androidx.core.app.NotificationCompat.CATEGORY_CALL, "result"}, s = {"L$0", "L$0"})
/* loaded from: classes17.dex */
final class HttpStatement$fetchResponse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.statement.HttpStatement getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.fetchResponse(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpStatement$fetchResponse$1(io.ktor.client.statement.HttpStatement httpStatement, kotlin.coroutines.Continuation<? super io.ktor.client.statement.HttpStatement$fetchResponse$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = httpStatement;
    }
}
