package io.ktor.client.plugins.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/logging/ResponseAfterEncodingHook$Context;", "response", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.logging.LoggingKt$Logging$2$2", f = "Logging.kt", i = {0, 0, 0}, l = {577, 584}, m = "invokeSuspend", n = {"$this$on", "response", "responseLogLines"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes17.dex */
final class LoggingKt$Logging$2$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context, io.ktor.client.statement.HttpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.client.plugins.logging.LogLevel getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.client.plugins.logging.Logger getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    private /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
    
        if (r6.proceedWith(r4, r17) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object access$Logging$lambda$16$logResponseOkHttpFormat;
        io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context context;
        io.ktor.client.statement.HttpResponse httpResponse;
        java.util.List list;
        io.ktor.client.statement.HttpResponse httpResponse2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context context2 = (io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context) this.getInputFormats;
            io.ktor.client.statement.HttpResponse httpResponse3 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizesFor;
            if (this.Camera2StreamConfigurationMap) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.getInputFormats = context2;
                this.getHighSpeedVideoSizesFor = httpResponse3;
                this.getInputSizeshNQ4ISI = arrayList;
                this.getOutputMinFrameDuration = 1;
                access$Logging$lambda$16$logResponseOkHttpFormat = io.ktor.client.plugins.logging.LoggingKt.access$Logging$lambda$16$logResponseOkHttpFormat(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, httpResponse3, arrayList, this);
                if (access$Logging$lambda$16$logResponseOkHttpFormat != coroutine_suspended) {
                    context = context2;
                    httpResponse = httpResponse3;
                    list = arrayList;
                    httpResponse2 = (io.ktor.client.statement.HttpResponse) access$Logging$lambda$16$logResponseOkHttpFormat;
                    if (list.size() > 0) {
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse2, httpResponse)) {
                    }
                }
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        list = (java.util.List) this.getInputSizeshNQ4ISI;
        io.ktor.client.statement.HttpResponse httpResponse4 = (io.ktor.client.statement.HttpResponse) this.getHighSpeedVideoSizesFor;
        io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context context3 = (io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context) this.getInputFormats;
        kotlin.ResultKt.throwOnFailure(obj);
        context = context3;
        httpResponse = httpResponse4;
        access$Logging$lambda$16$logResponseOkHttpFormat = obj;
        httpResponse2 = (io.ktor.client.statement.HttpResponse) access$Logging$lambda$16$logResponseOkHttpFormat;
        if (list.size() > 0) {
            this.getHighSpeedVideoSizes.log(kotlin.collections.CollectionsKt.joinToString$default(list, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null));
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(httpResponse2, httpResponse)) {
            this.getInputFormats = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.logging.ResponseAfterEncodingHook.Context context, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.logging.LoggingKt$Logging$2$2 loggingKt$Logging$2$2 = new io.ktor.client.plugins.logging.LoggingKt$Logging$2$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        loggingKt$Logging$2$2.getInputFormats = context;
        loggingKt$Logging$2$2.getHighSpeedVideoSizesFor = httpResponse;
        return loggingKt$Logging$2$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoggingKt$Logging$2$2(boolean z, io.ktor.client.plugins.logging.Logger logger, java.util.List<io.ktor.client.plugins.logging.SanitizedHeader> list, io.ktor.client.plugins.logging.LogLevel logLevel, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.logging.LoggingConfig> clientPluginBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.logging.LoggingKt$Logging$2$2> continuation) {
        super(3, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoSizes = logger;
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoFpsRanges = logLevel;
        this.getHighResolutionOutputSizeshNQ4ISI = clientPluginBuilder;
    }
}
