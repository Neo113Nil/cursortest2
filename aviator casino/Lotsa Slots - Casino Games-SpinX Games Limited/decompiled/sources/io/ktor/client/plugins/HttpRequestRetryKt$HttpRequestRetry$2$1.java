package io.ktor.client.plugins;

/* compiled from: HttpRequestRetry.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {352, 355, 371}, m = "invokeSuspend", n = {"$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "call", "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes6.dex */
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<io.ktor.client.plugins.api.Send.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $delay;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> $modifyRequest;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> $shouldRetry;
    final /* synthetic */ kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> $shouldRetryOnException;
    final /* synthetic */ io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRequestRetryConfig> $this_createClientPlugin;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpRequestRetryKt$HttpRequestRetry$2$1(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> function32, int i, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryDelayContext, ? super java.lang.Integer, java.lang.Long> function2, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.HttpRetryModifyRequestContext, ? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function22, io.ktor.client.plugins.api.ClientPluginBuilder<io.ktor.client.plugins.HttpRequestRetryConfig> clientPluginBuilder, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function23, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1> continuation) {
        super(3, continuation);
        this.$shouldRetry = function3;
        this.$shouldRetryOnException = function32;
        this.$maxRetries = i;
        this.$delayMillis = function2;
        this.$modifyRequest = function22;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$delay = function23;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, this.$this_createClientPlugin, this.$delay, continuation);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = sender;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = httpRequestBuilder;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0123 A[Catch: all -> 0x00a6, TRY_ENTER, TryCatch #1 {all -> 0x00a6, blocks: (B:12:0x0123, B:13:0x0137, B:17:0x0155, B:19:0x015d, B:40:0x0073, B:42:0x009f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015d A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #1 {all -> 0x00a6, blocks: (B:12:0x0123, B:13:0x0137, B:17:0x0155, B:19:0x015d, B:40:0x0073, B:42:0x009f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01f4 -> B:8:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        io.ktor.client.plugins.HttpRetryEventData httpRetryEventData;
        kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2;
        java.lang.Long invoke;
        boolean HttpRequestRetry$lambda$1$shouldRetryOnException;
        io.ktor.client.call.HttpClientCall httpClientCall;
        io.ktor.client.plugins.api.Send.Sender sender;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3;
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function32;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> function22;
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function23;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2;
        int i2;
        int i3;
        java.lang.Object obj2;
        boolean HttpRequestRetry$lambda$1$shouldRetry;
        java.lang.Object throwOnInvalidResponseBody;
        io.ktor.client.plugins.HttpRetryEventData httpRetryEventData2;
        org.slf4j.Logger logger;
        io.ktor.util.AttributeKey attributeKey;
        io.ktor.util.AttributeKey attributeKey2;
        io.ktor.util.AttributeKey attributeKey3;
        io.ktor.util.AttributeKey attributeKey4;
        io.ktor.util.AttributeKey attributeKey5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        try {
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender2 = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder3 = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            io.ktor.util.Attributes attributes = httpRequestBuilder3.getAttributes();
            attributeKey = io.ktor.client.plugins.HttpRequestRetryKt.ShouldRetryPerRequestAttributeKey;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function33 = (kotlin.jvm.functions.Function3) attributes.getOrNull(attributeKey);
            if (function33 == null) {
                function33 = this.$shouldRetry;
            }
            io.ktor.util.Attributes attributes2 = httpRequestBuilder3.getAttributes();
            attributeKey2 = io.ktor.client.plugins.HttpRequestRetryKt.ShouldRetryOnExceptionPerRequestAttributeKey;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function34 = (kotlin.jvm.functions.Function3) attributes2.getOrNull(attributeKey2);
            if (function34 == null) {
                function34 = this.$shouldRetryOnException;
            }
            io.ktor.util.Attributes attributes3 = httpRequestBuilder3.getAttributes();
            attributeKey3 = io.ktor.client.plugins.HttpRequestRetryKt.MaxRetriesPerRequestAttributeKey;
            java.lang.Integer num = (java.lang.Integer) attributes3.getOrNull(attributeKey3);
            int intValue = num != null ? num.intValue() : this.$maxRetries;
            io.ktor.util.Attributes attributes4 = httpRequestBuilder3.getAttributes();
            attributeKey4 = io.ktor.client.plugins.HttpRequestRetryKt.RetryDelayPerRequestAttributeKey;
            function22 = (kotlin.jvm.functions.Function2) attributes4.getOrNull(attributeKey4);
            if (function22 == null) {
                function22 = this.$delayMillis;
            }
            io.ktor.util.Attributes attributes5 = httpRequestBuilder3.getAttributes();
            attributeKey5 = io.ktor.client.plugins.HttpRequestRetryKt.ModifyRequestPerRequestAttributeKey;
            kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function24 = (kotlin.jvm.functions.Function2) attributes5.getOrNull(attributeKey5);
            if (function24 == null) {
                function24 = this.$modifyRequest;
            }
            sender = sender2;
            httpRequestBuilder = httpRequestBuilder3;
            function3 = function33;
            i3 = intValue;
            function23 = function24;
            httpRetryEventData2 = null;
            i2 = 0;
            function32 = function34;
            httpRequestBuilder2 = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData2 != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function22;
            this.L$5 = function23;
            this.L$6 = httpRequestBuilder2;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder2, this);
            if (obj2 == coroutine_suspended) {
            }
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i3, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
            th = th;
            HttpRequestRetry$lambda$1$shouldRetryOnException = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i3, function32, httpRequestBuilder2, th);
            if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
            }
        } else if (i4 == 1) {
            i3 = this.I$1;
            i2 = this.I$0;
            httpRequestBuilder2 = (io.ktor.client.request.HttpRequestBuilder) this.L$6;
            function23 = (kotlin.jvm.functions.Function2) this.L$5;
            function22 = (kotlin.jvm.functions.Function2) this.L$4;
            function32 = (kotlin.jvm.functions.Function3) this.L$3;
            function3 = (kotlin.jvm.functions.Function3) this.L$2;
            httpRequestBuilder = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            sender = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i3, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
            th = th;
            HttpRequestRetry$lambda$1$shouldRetryOnException = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i3, function32, httpRequestBuilder2, th);
            if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
            }
        } else {
            if (i4 == 2) {
                int i5 = this.I$1;
                int i6 = this.I$0;
                httpClientCall = (io.ktor.client.call.HttpClientCall) this.L$6;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$1;
            int i8 = this.I$0;
            io.ktor.client.plugins.HttpRetryEventData httpRetryEventData3 = (io.ktor.client.plugins.HttpRetryEventData) this.L$6;
            kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function25 = (kotlin.jvm.functions.Function2) this.L$5;
            kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> function26 = (kotlin.jvm.functions.Function2) this.L$4;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> function35 = (kotlin.jvm.functions.Function3) this.L$3;
            kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> function36 = (kotlin.jvm.functions.Function3) this.L$2;
            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder4 = (io.ktor.client.request.HttpRequestBuilder) this.L$1;
            io.ktor.client.plugins.api.Send.Sender sender3 = (io.ktor.client.plugins.api.Send.Sender) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.client.plugins.api.Send.Sender sender4 = sender3;
            httpRequestBuilder = httpRequestBuilder4;
            function3 = function36;
            function32 = function35;
            function22 = function26;
            function23 = function25;
            int i9 = i8;
            i3 = i7;
            httpRetryEventData2 = httpRetryEventData3;
            i2 = i9;
            logger = io.ktor.client.plugins.HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            sender = sender4;
            httpRequestBuilder2 = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData2 != null) {
                function23.invoke(new io.ktor.client.plugins.HttpRetryModifyRequestContext(httpRequestBuilder, httpRetryEventData2.getResponse(), httpRetryEventData2.getCause(), httpRetryEventData2.getRetryCount()), httpRequestBuilder2);
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function22;
            this.L$5 = function23;
            this.L$6 = httpRequestBuilder2;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder2, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i3, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
                io.ktor.client.statement.HttpResponse response = httpClientCall.getResponse();
                io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = this;
                this.L$0 = sender;
                this.L$1 = httpRequestBuilder;
                this.L$2 = function3;
                this.L$3 = function32;
                this.L$4 = function22;
                this.L$5 = function23;
                this.L$6 = httpClientCall;
                this.L$7 = httpRequestBuilder2;
                this.I$0 = i2;
                this.I$1 = i3;
                this.label = 2;
                throwOnInvalidResponseBody = io.ktor.client.plugins.HttpRequestRetryKt.throwOnInvalidResponseBody(response, httpRequestRetryKt$HttpRequestRetry$2$1);
                return throwOnInvalidResponseBody == coroutine_suspended ? coroutine_suspended : httpClientCall;
            }
            try {
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            i = i2 + 1;
            httpRetryEventData = new io.ktor.client.plugins.HttpRetryEventData(httpRequestBuilder2, i, httpClientCall.getResponse(), null);
            i7 = i3;
            i8 = i;
            function25 = function23;
            function26 = function22;
            function35 = function32;
            function36 = function3;
            httpRequestBuilder4 = httpRequestBuilder;
            io.ktor.client.plugins.api.Send.Sender sender5 = sender;
            httpRetryEventData3 = httpRetryEventData;
            this.$this_createClientPlugin.getClient().getMonitor().raise(io.ktor.client.plugins.HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData3);
            io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext = new io.ktor.client.plugins.HttpRetryDelayContext(httpRetryEventData3.getRequest(), httpRetryEventData3.getResponse(), httpRetryEventData3.getCause());
            function2 = this.$delay;
            invoke = function26.invoke(httpRetryDelayContext, kotlin.coroutines.jvm.internal.Boxing.boxInt(i8));
            this.L$0 = sender5;
            this.L$1 = httpRequestBuilder4;
            this.L$2 = function36;
            this.L$3 = function35;
            this.L$4 = function26;
            this.L$5 = function25;
            this.L$6 = httpRetryEventData3;
            this.L$7 = null;
            this.I$0 = i8;
            this.I$1 = i7;
            this.label = 3;
            if (function2.invoke(invoke, this) != coroutine_suspended) {
                return coroutine_suspended;
            }
            sender4 = sender5;
            httpRequestBuilder = httpRequestBuilder4;
            function3 = function36;
            function32 = function35;
            function22 = function26;
            function23 = function25;
            int i92 = i8;
            i3 = i7;
            httpRetryEventData2 = httpRetryEventData3;
            i2 = i92;
            logger = io.ktor.client.plugins.HttpRequestRetryKt.LOGGER;
            logger.trace("Retrying request " + httpRequestBuilder.getUrl() + " attempt: " + i2);
            sender = sender4;
            httpRequestBuilder2 = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder);
            if (httpRetryEventData2 != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder;
            this.L$2 = function3;
            this.L$3 = function32;
            this.L$4 = function22;
            this.L$5 = function23;
            this.L$6 = httpRequestBuilder2;
            this.I$0 = i2;
            this.I$1 = i3;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder2, this);
            if (obj2 == coroutine_suspended) {
            }
            httpClientCall = (io.ktor.client.call.HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i3, function3, httpClientCall);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
            th = th2;
            HttpRequestRetry$lambda$1$shouldRetryOnException = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i3, function32, httpRequestBuilder2, th);
            if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
                throw th;
            }
            i = i2 + 1;
            httpRetryEventData = new io.ktor.client.plugins.HttpRetryEventData(httpRequestBuilder2, i, null, th);
            i7 = i3;
            i8 = i;
            function25 = function23;
            function26 = function22;
            function35 = function32;
            function36 = function3;
            httpRequestBuilder4 = httpRequestBuilder;
            io.ktor.client.plugins.api.Send.Sender sender52 = sender;
            httpRetryEventData3 = httpRetryEventData;
            this.$this_createClientPlugin.getClient().getMonitor().raise(io.ktor.client.plugins.HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData3);
            io.ktor.client.plugins.HttpRetryDelayContext httpRetryDelayContext2 = new io.ktor.client.plugins.HttpRetryDelayContext(httpRetryEventData3.getRequest(), httpRetryEventData3.getResponse(), httpRetryEventData3.getCause());
            function2 = this.$delay;
            invoke = function26.invoke(httpRetryDelayContext2, kotlin.coroutines.jvm.internal.Boxing.boxInt(i8));
            this.L$0 = sender52;
            this.L$1 = httpRequestBuilder4;
            this.L$2 = function36;
            this.L$3 = function35;
            this.L$4 = function26;
            this.L$5 = function25;
            this.L$6 = httpRetryEventData3;
            this.L$7 = null;
            this.I$0 = i8;
            this.I$1 = i7;
            this.label = 3;
            if (function2.invoke(invoke, this) != coroutine_suspended) {
            }
        }
    }
}
