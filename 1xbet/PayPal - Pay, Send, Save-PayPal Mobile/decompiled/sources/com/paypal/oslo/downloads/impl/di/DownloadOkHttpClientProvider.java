package com.paypal.oslo.downloads.impl.di;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadOkHttpClientProvider;", "", "Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;", "dynamicProvider", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/core/network/http/DynamicOkHttpClientProvider;Lkotlinx/coroutines/CoroutineScope;)V", "Lokhttp3/OkHttpClient;", "p0", "getHighSpeedVideoSizes", "(Lokhttp3/OkHttpClient;)Lokhttp3/OkHttpClient;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/StateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/StateFlow;", "Camera2StreamConfigurationMap", "getOkHttpClient$downloads_release", "()Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/Call$Factory;", "callFactory", "Lokhttp3/Call$Factory;", "getCallFactory", "()Lokhttp3/Call$Factory;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DownloadOkHttpClientProvider {
    private static final com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider.Companion Companion = new com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider.Companion(null);
    private final okhttp3.Call.Factory callFactory;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.StateFlow<okhttp3.OkHttpClient> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DownloadOkHttpClientProvider(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicOkHttpClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = coroutineScope;
        final kotlinx.coroutines.flow.Flow drop = kotlinx.coroutines.flow.FlowKt.drop(dynamicOkHttpClientProvider.getOkHttpClientFlow(), 1);
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.flow.FlowKt.stateIn(new kotlinx.coroutines.flow.Flow<okhttp3.OkHttpClient>() { // from class: com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1

            @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector getHighSpeedVideoFpsRanges;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    okhttp3.OkHttpClient highSpeedVideoSizes;
                    if (continuation instanceof com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.getHighSpeedVideoSizesFor -= 2147483648;
                            java.lang.Object obj2 = anonymousClass1.getInputFormats;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.getHighSpeedVideoSizesFor;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.getHighSpeedVideoFpsRanges;
                                com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider downloadOkHttpClientProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                                highSpeedVideoSizes = com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider.getHighSpeedVideoSizes((okhttp3.OkHttpClient) obj);
                                anonymousClass1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(anonymousClass1);
                                anonymousClass1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                                anonymousClass1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = 0;
                                anonymousClass1.getHighSpeedVideoSizesFor = 1;
                                if (flowCollector.emit(highSpeedVideoSizes, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i2 = anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                                java.lang.Object obj3 = anonymousClass1.getHighSpeedVideoSizes;
                                java.lang.Object obj4 = anonymousClass1.getHighSpeedVideoFpsRanges;
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.getInputFormats;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.getHighSpeedVideoSizesFor;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1$2", f = "DownloadOkHttpClientProvider.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$completion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, nl = {49}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
                /* renamed from: com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object getHighSpeedVideoFpsRanges;
                    java.lang.Object getHighSpeedVideoFpsRangesFor;
                    java.lang.Object getHighSpeedVideoSizes;
                    int getHighSpeedVideoSizesFor;
                    /* synthetic */ java.lang.Object getInputFormats;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.getInputFormats = obj;
                        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
                        return com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider downloadOkHttpClientProvider) {
                    this.getHighSpeedVideoFpsRanges = flowCollector;
                    this.getHighResolutionOutputSizeshNQ4ISI = downloadOkHttpClientProvider;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super okhttp3.OkHttpClient> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$special$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, coroutineScope, kotlinx.coroutines.flow.SharingStarted.INSTANCE.getEagerly(), getHighSpeedVideoSizes(dynamicOkHttpClientProvider.getOkHttpClientFlow().getValue()));
        this.callFactory = new com.paypal.oslo.core.network.http.DynamicCallFactory(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                okhttp3.OkHttpClient okHttpClient$downloads_release;
                okHttpClient$downloads_release = com.paypal.oslo.downloads.impl.di.DownloadOkHttpClientProvider.this.getOkHttpClient$downloads_release();
                return okHttpClient$downloads_release;
            }
        });
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadOkHttpClientProvider$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final okhttp3.OkHttpClient getOkHttpClient$downloads_release() {
        return this.Camera2StreamConfigurationMap.getValue();
    }

    public final okhttp3.Call.Factory getCallFactory() {
        return this.callFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static okhttp3.OkHttpClient getHighSpeedVideoSizes(okhttp3.OkHttpClient p0) {
        return p0.newBuilder().connectTimeout(30L, java.util.concurrent.TimeUnit.SECONDS).readTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).writeTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).followRedirects(true).followSslRedirects(true).build();
    }
}
