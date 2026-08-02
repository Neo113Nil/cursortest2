package io.ktor.client.plugins;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt", f = "HttpRedirect.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {97}, m = "HttpRedirect$lambda$2$handleCall", n = {"$this$HttpRedirect_u24lambda_u242_u24handleCall", "context", "client", androidx.core.app.NotificationCompat.CATEGORY_CALL, "requestBuilder", "originProtocol", "originAuthority", "allowHttpsDowngrade"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0"})
/* loaded from: classes17.dex */
final class HttpRedirectKt$HttpRedirect$2$handleCall$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return io.ktor.client.plugins.HttpRedirectKt.access$HttpRedirect$lambda$2$handleCall(null, null, null, false, null, this);
    }

    HttpRedirectKt$HttpRedirect$2$handleCall$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1> continuation) {
        super(continuation);
    }
}
