package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {352, 355, 371}, m = "invokeSuspend", n = {"$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", androidx.core.app.NotificationCompat.CATEGORY_CALL, "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes17.dex */
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRequestRetryConfig> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> getInputFormats;
    int getInputSizeshNQ4ISI;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    private /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    int isOutputSupportedFor;
    java.lang.Object unwrapAs;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0154, code lost:
    
        if (r0 != r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01fc -> B:19:0x011f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function2;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> function22;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function3;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function32;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2;
        io.ktor.client.plugins.api.Send.Sender sender;
        java.lang.Object obj2;
        int i3;
        int i4;
        io.ktor.client.plugins.HttpRetryEventData httpRetryEventData;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function23;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> function24;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function33;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function34;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3;
        char c;
        io.ktor.client.plugins.api.Send.Sender sender2;
        io.ktor.client.plugins.HttpRetryEventData httpRetryEventData2;
        org.slf4j.Logger logger;
        int i5;
        io.ktor.client.plugins.HttpRetryEventData httpRetryEventData3;
        kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function25;
        java.lang.Long invoke;
        io.ktor.util.AttributeKey attributeKey;
        io.ktor.util.AttributeKey attributeKey2;
        io.ktor.util.AttributeKey attributeKey3;
        io.ktor.util.AttributeKey attributeKey4;
        io.ktor.util.AttributeKey attributeKey5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.isOutputSupportedFor;
        if (i6 != 0) {
            try {
            } catch (java.lang.Throwable th) {
                th = th;
            }
            if (i6 == 1) {
                i = this.getOutputFormats;
                i2 = this.getInputSizeshNQ4ISI;
                httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.getOutputStallDurationlomOqCM;
                function2 = (kotlin.jvm.functions.Function2) this.getOutputStallDuration;
                function22 = (kotlin.jvm.functions.Function2) this.getOutputMinFrameDurationlomOqCM;
                function3 = (kotlin.jvm.functions.Function3) this.getOutputSizes;
                function32 = (kotlin.jvm.functions.Function3) this.getOutputSizeshNQ4ISI;
                httpRequestBuilder2 = (io.ktor.client.request.HttpRequestBuilder) this.getOutputMinFrameDuration;
                sender = (io.ktor.client.plugins.api.Send.Sender) this.getValidOutputFormatsForInputhNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                io.ktor.client.call.HttpClientCall httpClientCall = (io.ktor.client.call.HttpClientCall) obj2;
                if (!io.ktor.client.plugins.HttpRequestRetryKt.access$HttpRequestRetry$lambda$1$shouldRetry(i2, i, function32, httpClientCall)) {
                    io.ktor.client.statement.HttpResponse response = httpClientCall.getResponse();
                    io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = this;
                    this.getValidOutputFormatsForInputhNQ4ISI = sender;
                    this.getOutputMinFrameDuration = httpRequestBuilder2;
                    this.getOutputSizeshNQ4ISI = function32;
                    this.getOutputSizes = function3;
                    this.getOutputMinFrameDurationlomOqCM = function22;
                    this.getOutputStallDuration = function2;
                    this.getOutputStallDurationlomOqCM = httpClientCall;
                    this.unwrapAs = httpRequestBuilder;
                    this.getInputSizeshNQ4ISI = i2;
                    this.getOutputFormats = i;
                    this.isOutputSupportedFor = 2;
                    return io.ktor.client.plugins.HttpRequestRetryKt.access$throwOnInvalidResponseBody(response, httpRequestRetryKt$HttpRequestRetry$2$1) == coroutine_suspended ? coroutine_suspended : httpClientCall;
                }
                try {
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
                i5 = i2 + 1;
                httpRetryEventData3 = new io.ktor.client.plugins.HttpRetryEventData(httpRequestBuilder, i5, httpClientCall.getResponse(), null);
                i3 = i;
                i4 = i5;
                function23 = function2;
                function24 = function22;
                function33 = function3;
                function34 = function32;
                httpRequestBuilder3 = httpRequestBuilder2;
                io.ktor.client.plugins.api.Send.Sender sender3 = sender;
                httpRetryEventData = httpRetryEventData3;
                this.getHighSpeedVideoSizesFor.getClient().getMonitor().raise(io.ktor.client.plugins.HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData);
                io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext = new io.ktor.client.plugins.HttpRetryDelayContext(httpRetryEventData.getRequest(), httpRetryEventData.getResponse(), httpRetryEventData.getCause());
                function25 = this.Camera2StreamConfigurationMap;
                invoke = function24.invoke(httpRetryDelayContext, kotlin.coroutines.jvm.internal.Boxing.boxInt(i4));
                this.getValidOutputFormatsForInputhNQ4ISI = sender3;
                this.getOutputMinFrameDuration = httpRequestBuilder3;
                this.getOutputSizeshNQ4ISI = function34;
                this.getOutputSizes = function33;
                this.getOutputMinFrameDurationlomOqCM = function24;
                this.getOutputStallDuration = function23;
                this.getOutputStallDurationlomOqCM = httpRetryEventData;
                this.unwrapAs = null;
                this.getInputSizeshNQ4ISI = i4;
                this.getOutputFormats = i3;
                c = 3;
                this.isOutputSupportedFor = 3;
                if (function25.invoke(invoke, this) != coroutine_suspended) {
                    sender2 = sender3;
                    httpRequestBuilder2 = httpRequestBuilder3;
                    function32 = function34;
                    function3 = function33;
                    function22 = function24;
                    function2 = function23;
                    int i7 = i4;
                    i = i3;
                    httpRetryEventData2 = httpRetryEventData;
                    i2 = i7;
                    logger = io.ktor.client.plugins.HttpRequestRetryKt.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Retrying request ");
                    sb.append(httpRequestBuilder2.getUrl());
                    sb.append(" attempt: ");
                    sb.append(i2);
                    logger.trace(sb.toString());
                    sender = sender2;
                    httpRequestBuilder = io.ktor.client.plugins.HttpRequestRetryKt.access$HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
                    if (httpRetryEventData2 != null) {
                    }
                    this.getValidOutputFormatsForInputhNQ4ISI = sender;
                    this.getOutputMinFrameDuration = httpRequestBuilder2;
                    this.getOutputSizeshNQ4ISI = function32;
                    this.getOutputSizes = function3;
                    this.getOutputMinFrameDurationlomOqCM = function22;
                    this.getOutputStallDuration = function2;
                    this.getOutputStallDurationlomOqCM = httpRequestBuilder;
                    this.getInputSizeshNQ4ISI = i2;
                    this.getOutputFormats = i;
                    this.isOutputSupportedFor = 1;
                    obj2 = sender.proceed(httpRequestBuilder, this);
                }
                th = th2;
                if (!io.ktor.client.plugins.HttpRequestRetryKt.access$HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i, function3, httpRequestBuilder, th)) {
                    throw th;
                }
                i5 = i2 + 1;
                httpRetryEventData3 = new io.ktor.client.plugins.HttpRetryEventData(httpRequestBuilder, i5, null, th);
                i3 = i;
                i4 = i5;
                function23 = function2;
                function24 = function22;
                function33 = function3;
                function34 = function32;
                httpRequestBuilder3 = httpRequestBuilder2;
                io.ktor.client.plugins.api.Send.Sender sender32 = sender;
                httpRetryEventData = httpRetryEventData3;
                this.getHighSpeedVideoSizesFor.getClient().getMonitor().raise(io.ktor.client.plugins.HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData);
                io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext2 = new io.ktor.client.plugins.HttpRetryDelayContext(httpRetryEventData.getRequest(), httpRetryEventData.getResponse(), httpRetryEventData.getCause());
                function25 = this.Camera2StreamConfigurationMap;
                invoke = function24.invoke(httpRetryDelayContext2, kotlin.coroutines.jvm.internal.Boxing.boxInt(i4));
                this.getValidOutputFormatsForInputhNQ4ISI = sender32;
                this.getOutputMinFrameDuration = httpRequestBuilder3;
                this.getOutputSizeshNQ4ISI = function34;
                this.getOutputSizes = function33;
                this.getOutputMinFrameDurationlomOqCM = function24;
                this.getOutputStallDuration = function23;
                this.getOutputStallDurationlomOqCM = httpRetryEventData;
                this.unwrapAs = null;
                this.getInputSizeshNQ4ISI = i4;
                this.getOutputFormats = i3;
                c = 3;
                this.isOutputSupportedFor = 3;
                if (function25.invoke(invoke, this) != coroutine_suspended) {
                }
            }
            if (i6 == 2) {
                int i8 = this.getOutputFormats;
                int i9 = this.getInputSizeshNQ4ISI;
                io.ktor.client.call.HttpClientCall httpClientCall2 = (io.ktor.client.call.HttpClientCall) this.getOutputStallDurationlomOqCM;
                kotlin.ResultKt.throwOnFailure(obj);
                return httpClientCall2;
            }
            if (i6 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = this.getOutputFormats;
            i4 = this.getInputSizeshNQ4ISI;
            httpRetryEventData = (io.ktor.client.plugins.HttpRetryEventData) this.getOutputStallDurationlomOqCM;
            function23 = (kotlin.jvm.functions.Function2) this.getOutputStallDuration;
            function24 = (kotlin.jvm.functions.Function2) this.getOutputMinFrameDurationlomOqCM;
            function33 = (kotlin.jvm.functions.Function3) this.getOutputSizes;
            function34 = (kotlin.jvm.functions.Function3) this.getOutputSizeshNQ4ISI;
            httpRequestBuilder3 = (io.ktor.client.request.HttpRequestBuilder) this.getOutputMinFrameDuration;
            io.ktor.client.plugins.api.Send.Sender sender4 = (io.ktor.client.plugins.api.Send.Sender) this.getValidOutputFormatsForInputhNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            c = 3;
            sender2 = sender4;
            httpRequestBuilder2 = httpRequestBuilder3;
            function32 = function34;
            function3 = function33;
            function22 = function24;
            function2 = function23;
            int i72 = i4;
            i = i3;
            httpRetryEventData2 = httpRetryEventData;
            i2 = i72;
            logger = io.ktor.client.plugins.HttpRequestRetryKt.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Retrying request ");
            sb2.append(httpRequestBuilder2.getUrl());
            sb2.append(" attempt: ");
            sb2.append(i2);
            logger.trace(sb2.toString());
            sender = sender2;
            httpRequestBuilder = io.ktor.client.plugins.HttpRequestRetryKt.access$HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
            if (httpRetryEventData2 != null) {
                try {
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
                function2.invoke(new io.ktor.client.plugins.HttpRetryModifyRequestContext(httpRequestBuilder2, httpRetryEventData2.getResponse(), httpRetryEventData2.getCause(), httpRetryEventData2.getRetryCount()), httpRequestBuilder);
            }
            this.getValidOutputFormatsForInputhNQ4ISI = sender;
            this.getOutputMinFrameDuration = httpRequestBuilder2;
            this.getOutputSizeshNQ4ISI = function32;
            this.getOutputSizes = function3;
            this.getOutputMinFrameDurationlomOqCM = function22;
            this.getOutputStallDuration = function2;
            this.getOutputStallDurationlomOqCM = httpRequestBuilder;
            this.getInputSizeshNQ4ISI = i2;
            this.getOutputFormats = i;
            this.isOutputSupportedFor = 1;
            obj2 = sender.proceed(httpRequestBuilder, this);
        } else {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender5 = (io.ktor.client.plugins.api.Send.Sender) this.getValidOutputFormatsForInputhNQ4ISI;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder4 = (io.ktor.client.request.HttpRequestBuilder) this.getOutputMinFrameDuration;
            io.ktor.util.Attributes attributes = httpRequestBuilder4.getAttributes();
            attributeKey = io.ktor.client.plugins.HttpRequestRetryKt.getOutputFormats;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function35 = (kotlin.jvm.functions.Function3) attributes.getOrNull(attributeKey);
            if (function35 == null) {
                function35 = this.getHighSpeedVideoSizes;
            }
            io.ktor.util.Attributes attributes2 = httpRequestBuilder4.getAttributes();
            attributeKey2 = io.ktor.client.plugins.HttpRequestRetryKt.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function36 = (kotlin.jvm.functions.Function3) attributes2.getOrNull(attributeKey2);
            if (function36 == null) {
                function36 = this.getInputFormats;
            }
            io.ktor.util.Attributes attributes3 = httpRequestBuilder4.getAttributes();
            attributeKey3 = io.ktor.client.plugins.HttpRequestRetryKt.getHighSpeedVideoFpsRanges;
            java.lang.Integer num = (java.lang.Integer) attributes3.getOrNull(attributeKey3);
            int intValue = num != null ? num.intValue() : this.getHighSpeedVideoFpsRanges;
            io.ktor.util.Attributes attributes4 = httpRequestBuilder4.getAttributes();
            attributeKey4 = io.ktor.client.plugins.HttpRequestRetryKt.Camera2StreamConfigurationMap;
            function22 = (kotlin.jvm.functions.Function2) attributes4.getOrNull(attributeKey4);
            if (function22 == null) {
                function22 = this.getHighSpeedVideoFpsRangesFor;
            }
            io.ktor.util.Attributes attributes5 = httpRequestBuilder4.getAttributes();
            attributeKey5 = io.ktor.client.plugins.HttpRequestRetryKt.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function26 = (kotlin.jvm.functions.Function2) attributes5.getOrNull(attributeKey5);
            if (function26 == null) {
                function26 = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            sender = sender5;
            httpRequestBuilder2 = httpRequestBuilder4;
            i = intValue;
            function2 = function26;
            httpRetryEventData2 = null;
            function3 = function36;
            function32 = function35;
            i2 = 0;
            httpRequestBuilder = io.ktor.client.plugins.HttpRequestRetryKt.access$HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
            if (httpRetryEventData2 != null) {
            }
            this.getValidOutputFormatsForInputhNQ4ISI = sender;
            this.getOutputMinFrameDuration = httpRequestBuilder2;
            this.getOutputSizeshNQ4ISI = function32;
            this.getOutputSizes = function3;
            this.getOutputMinFrameDurationlomOqCM = function22;
            this.getOutputStallDuration = function2;
            this.getOutputStallDurationlomOqCM = httpRequestBuilder;
            this.getInputSizeshNQ4ISI = i2;
            this.getOutputFormats = i;
            this.isOutputSupportedFor = 1;
            obj2 = sender.proceed(httpRequestBuilder, this);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1(this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, continuation);
        httpRequestRetryKt$HttpRequestRetry$2$1.getValidOutputFormatsForInputhNQ4ISI = sender;
        httpRequestRetryKt$HttpRequestRetry$2$1.getOutputMinFrameDuration = httpRequestBuilder;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpRequestRetryKt$HttpRequestRetry$2$1(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> function32, int i, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> function2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function22, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRequestRetryConfig> clientPluginBuilder, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = function3;
        this.getInputFormats = function32;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = function22;
        this.getHighSpeedVideoSizesFor = clientPluginBuilder;
        this.Camera2StreamConfigurationMap = function23;
    }
}
