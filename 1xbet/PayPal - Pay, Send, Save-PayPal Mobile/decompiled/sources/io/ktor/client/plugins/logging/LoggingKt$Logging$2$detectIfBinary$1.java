package io.ktor.client.plugins.logging;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt", f = "Logging.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {152, 181}, m = "Logging$lambda$16$detectIfBinary", n = {"$this_createClientPlugin", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "contentLength", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "firstChunk", "isBinary", "channel", "isBinary", "firstReadSize"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "I$0", "I$1"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$detectIfBinary$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = io.ktor.client.plugins.logging.LoggingKt.Camera2StreamConfigurationMap(null, null, null, null, null, this);
        return Camera2StreamConfigurationMap;
    }

    LoggingKt$Logging$2$detectIfBinary$1(kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$detectIfBinary$1> continuation) {
        super(continuation);
    }
}
