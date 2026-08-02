package com.paypal.oslo.core.network.http;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BT\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001f\u0010\u001e\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0011\u0010*\u001a\u00020\u00158G¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150+8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00101\u001a\u0002008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104"}, d2 = {"Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "httpConfig", "", "Lokhttp3/Interceptor;", "Lkotlin/jvm/JvmSuppressWildcards;", "authTypeInterceptors", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "cronetEngineFactory", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "cronetInterceptorFactory", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function0;", "", "isOnline", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/core/network/http/config/HttpConfig;Ljava/util/Set;Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "Lokhttp3/OkHttpClient;", "getHighSpeedVideoFpsRangesFor", "()Lokhttp3/OkHttpClient;", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "getInputFormats", "Lcom/paypal/oslo/core/network/http/config/HttpConfig;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "getOutputMinFrameDuration", "Lkotlinx/coroutines/CoroutineScope;", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getOkHttpClient", "okHttpClient", "Lkotlinx/coroutines/flow/StateFlow;", "okHttpClientFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getOkHttpClientFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "Lokhttp3/Call$Factory;", "callFactory", "Lokhttp3/Call$Factory;", "getCallFactory", "()Lokhttp3/Call$Factory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DynamicOkHttpClientProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<okhttp3.OkHttpClient> getInputFormats;
    private final okhttp3.Call.Factory callFactory;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.cronet.CronetEngineFactory getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Set<okhttp3.Interceptor> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.http.config.HttpConfig getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;
    private final kotlinx.coroutines.flow.StateFlow<okhttp3.OkHttpClient> okHttpClientFlow;

    @javax.inject.Inject
    public DynamicOkHttpClientProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.core.network.http.config.HttpConfig httpConfig, java.util.Set<okhttp3.Interceptor> set, com.paypal.oslo.core.network.http.cronet.CronetEngineFactory cronetEngineFactory, com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory cronetInterceptorFactory, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetEngineFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetInterceptorFactory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = httpConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.getHighSpeedVideoFpsRanges = cronetEngineFactory;
        this.getHighSpeedVideoFpsRangesFor = cronetInterceptorFactory;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getOutputMinFrameDuration = function0;
        kotlinx.coroutines.flow.MutableStateFlow<okhttp3.OkHttpClient> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getHighSpeedVideoFpsRangesFor());
        this.getInputFormats = MutableStateFlow;
        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(kotlinx.coroutines.flow.FlowKt.drop(httpConfig.getVerifySslCert(), 1), new com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.AnonymousClass1(null)), coroutineScope);
        this.okHttpClientFlow = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.callFactory = new com.paypal.oslo.core.network.http.DynamicCallFactory(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                okhttp3.OkHttpClient okHttpClient;
                okHttpClient = com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this.getOkHttpClient();
                return okHttpClient;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider$1", f = "DynamicOkHttpClientProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighSpeedVideoFpsRanges;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object m23436constructorimpl;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                okhttp3.OkHttpClient okHttpClient = (okhttp3.OkHttpClient) com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this.getInputFormats.getValue();
                com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this.getInputFormats.setValue(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this.getHighSpeedVideoFpsRangesFor());
                com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider = com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.access$cleanupClient(dynamicOkHttpClientProvider, okHttpClient);
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                }
                java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
                if (m23439exceptionOrNullimpl != null) {
                    com.paypal.oslo.core.network.http.LoggerKt.log.e("Failed to cleanup old OkHttpClient", m23439exceptionOrNullimpl);
                }
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.AnonymousClass1) create(java.lang.Boolean.valueOf(bool.booleanValue()), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider.AnonymousClass1> continuation) {
            super(2, continuation);
        }
    }

    public final okhttp3.OkHttpClient getOkHttpClient() {
        return this.getInputFormats.getValue();
    }

    public final kotlinx.coroutines.flow.StateFlow<okhttp3.OkHttpClient> getOkHttpClientFlow() {
        return this.okHttpClientFlow;
    }

    public final okhttp3.Call.Factory getCallFactory() {
        return this.callFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final okhttp3.OkHttpClient getHighSpeedVideoFpsRangesFor() {
        return com.paypal.oslo.core.network.http.OkHttpClientFactory.INSTANCE.create(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getOutputMinFrameDuration);
    }

    public static final /* synthetic */ void access$cleanupClient(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, okhttp3.OkHttpClient okHttpClient) {
        okHttpClient.connectionPool().evictAll();
        okHttpClient.dispatcher().executorService().shutdown();
        okhttp3.Cache cache = okHttpClient.cache();
        if (cache != null) {
            cache.close();
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.http.LoggerKt.log, "Cleaned up old OkHttpClient resources", null, null, 6, null);
    }
}
