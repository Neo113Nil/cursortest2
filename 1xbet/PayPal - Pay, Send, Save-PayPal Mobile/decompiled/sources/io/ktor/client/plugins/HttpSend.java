package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0004\u0018\u0017\u0019\u001aB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000f\u001a\u00020\u000e23\u0010\r\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0004\b\u0001`\u000b¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012RG\u0010\u0016\u001a5\u00121\u0012/\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0004\b\u0001`\u000b¢\u0006\u0002\b\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpSend;", "", "", "p0", "<init>", "(I)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/HttpSendInterceptor;", "Lkotlin/ExtensionFunctionType;", "block", "", "intercept", "(Lkotlin/jvm/functions/Function3;)V", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Plugin", "Config", "InterceptedSender", "DefaultSender"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpSend {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.HttpSend.Companion INSTANCE = new io.ktor.client.plugins.HttpSend.Companion(0 == true ? 1 : 0);
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpSend> key;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function3<io.ktor.client.plugins.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes;

    private HttpSend(int i) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    }

    @io.ktor.utils.io.KtorDsl
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Config;", "", "<init>", "()V", "", "maxSendCount", com.visa.cbp.getEncExpo.warmup, "getMaxSendCount", "()I", "setMaxSendCount", "(I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }

        public final void setMaxSendCount(int i) {
            this.maxSendCount = i;
        }
    }

    public final void intercept(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.Sender, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighResolutionOutputSizeshNQ4ISI.add(block);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpSend$Config;", "Lio/ktor/client/plugins/HttpSend;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "prepare", "(Lkotlin/jvm/functions/Function1;)Lio/ktor/client/plugins/HttpSend;", "plugin", "Lio/ktor/client/HttpClient;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "install", "(Lio/ktor/client/plugins/HttpSend;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.HttpSend$Plugin, reason: from kotlin metadata */
    public static final class Companion implements io.ktor.client.plugins.HttpClientPlugin<io.ktor.client.plugins.HttpSend.Config, io.ktor.client.plugins.HttpSend> {
        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpSend> getKey() {
            return io.ktor.client.plugins.HttpSend.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final io.ktor.client.plugins.HttpSend prepare(kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpSend.Config, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            io.ktor.client.plugins.HttpSend.Config config = new io.ktor.client.plugins.HttpSend.Config();
            block.invoke(config);
            return new io.ktor.client.plugins.HttpSend(config.getMaxSendCount(), null);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public final void install(io.ktor.client.plugins.HttpSend plugin, io.ktor.client.HttpClient scope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plugin, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            scope.getRequestPipeline().intercept(io.ktor.client.request.HttpRequestPipeline.INSTANCE.getSend(), new io.ktor.client.plugins.HttpSend$Plugin$install$1(plugin, scope, null));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001BD\u00123\u0010\t\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0004\b\u0001`\u0007¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\r\u0010\u000eRA\u0010\u000f\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0004\b\u0001`\u0007¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpSend$InterceptedSender;", "Lio/ktor/client/plugins/Sender;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/coroutines/Continuation;", "Lio/ktor/client/call/HttpClientCall;", "", "Lio/ktor/client/plugins/HttpSendInterceptor;", "Lkotlin/ExtensionFunctionType;", "p0", "p1", "<init>", "(Lkotlin/jvm/functions/Function3;Lio/ktor/client/plugins/Sender;)V", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function3;", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/client/plugins/Sender;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class InterceptedSender implements io.ktor.client.plugins.Sender {
        private final io.ktor.client.plugins.Sender getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.jvm.functions.Function3<io.ktor.client.plugins.Sender, io.ktor.client.request.HttpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, java.lang.Object> getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Multi-variable type inference failed */
        public InterceptedSender(kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.Sender, ? super io.ktor.client.request.HttpRequestBuilder, ? super kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall>, ? extends java.lang.Object> function3, io.ktor.client.plugins.Sender sender) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sender, "");
            this.getHighSpeedVideoFpsRangesFor = function3;
            this.getHighResolutionOutputSizeshNQ4ISI = sender;
        }

        @Override // io.ktor.client.plugins.Sender
        public final java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
            return this.getHighSpeedVideoFpsRangesFor.invoke(this.getHighResolutionOutputSizeshNQ4ISI, httpRequestBuilder, continuation);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpSend$DefaultSender;", "Lio/ktor/client/plugins/Sender;", "", "p0", "Lio/ktor/client/HttpClient;", "p1", "<init>", "(ILio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/call/HttpClientCall;", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Lio/ktor/client/HttpClient;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lio/ktor/client/call/HttpClientCall;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DefaultSender implements io.ktor.client.plugins.Sender {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private io.ktor.client.call.HttpClientCall getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final io.ktor.client.HttpClient getHighSpeedVideoFpsRangesFor;

        public DefaultSender(int i, io.ktor.client.HttpClient httpClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = httpClient;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // io.ktor.client.plugins.Sender
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
            io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 httpSend$DefaultSender$execute$1;
            int i;
            io.ktor.client.call.HttpClientCall httpClientCall;
            if (continuation instanceof io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) {
                httpSend$DefaultSender$execute$1 = (io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) continuation;
                if ((httpSend$DefaultSender$execute$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    httpSend$DefaultSender$execute$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = httpSend$DefaultSender$execute$1.getHighSpeedVideoFpsRangesFor;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpSend$DefaultSender$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        io.ktor.client.call.HttpClientCall httpClientCall2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (httpClientCall2 != null) {
                            kotlinx.coroutines.CoroutineScopeKt.cancel$default(httpClientCall2, null, 1, null);
                        }
                        int i2 = this.Camera2StreamConfigurationMap;
                        if (i2 >= this.getHighSpeedVideoSizes) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Max send count ");
                            sb.append(this.getHighSpeedVideoSizes);
                            sb.append(" exceeded. Consider increasing the property maxSendCount if more is required.");
                            throw new io.ktor.client.plugins.SendCountExceedException(sb.toString());
                        }
                        this.Camera2StreamConfigurationMap = i2 + 1;
                        io.ktor.client.request.HttpSendPipeline sendPipeline = this.getHighSpeedVideoFpsRangesFor.getSendPipeline();
                        java.lang.Object body = httpRequestBuilder.getBody();
                        httpSend$DefaultSender$execute$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = sendPipeline.execute(httpRequestBuilder, body, httpSend$DefaultSender$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    httpClientCall = obj instanceof io.ktor.client.call.HttpClientCall ? (io.ktor.client.call.HttpClientCall) obj : null;
                    if (httpClientCall != null) {
                        throw new java.lang.IllegalStateException("Failed to execute send pipeline. Expected [HttpClientCall], but received ".concat(java.lang.String.valueOf(obj)).toString());
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = httpClientCall;
                    return httpClientCall;
                }
            }
            httpSend$DefaultSender$execute$1 = new io.ktor.client.plugins.HttpSend$DefaultSender$execute$1(this, continuation);
            java.lang.Object obj2 = httpSend$DefaultSender$execute$1.getHighSpeedVideoFpsRangesFor;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = httpSend$DefaultSender$execute$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            if (obj2 instanceof io.ktor.client.call.HttpClientCall) {
            }
            if (httpClientCall != null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.HttpSend.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpSend.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("HttpSend", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public /* synthetic */ HttpSend(int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
