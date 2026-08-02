package io.ktor.client.engine;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8BX\u0082\u0004¨\u0006\""}, d2 = {"Lio/ktor/client/engine/HttpClientEngine;", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/request/HttpRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/HttpClient;", "client", "", "install", "(Lio/ktor/client/HttpClient;)V", "requestData", "executeWithinCallContext", "(Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpResponseData;", "checkExtensions", "(Lio/ktor/client/request/HttpRequestData;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lio/ktor/client/engine/HttpClientEngineConfig;", "getConfig", "()Lio/ktor/client/engine/HttpClientEngineConfig;", "config", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "getSupportedCapabilities", "()Ljava/util/Set;", "supportedCapabilities", "", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HttpClientEngine extends kotlinx.coroutines.CoroutineScope, java.io.Closeable {
    java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation);

    io.ktor.client.engine.HttpClientEngineConfig getConfig();

    kotlinx.coroutines.CoroutineDispatcher getDispatcher();

    java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities();

    void install(io.ktor.client.HttpClient client);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r12 != r1) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final /* synthetic */ java.lang.Object access$executeWithinCallContext(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation continuation) {
            io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1 httpClientEngine$executeWithinCallContext$1;
            int i;
            kotlinx.coroutines.Deferred async$default;
            if (continuation instanceof io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) {
                httpClientEngine$executeWithinCallContext$1 = (io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1) continuation;
                if ((httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = httpClientEngine$executeWithinCallContext$1.Camera2StreamConfigurationMap;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.Job executionContext = httpRequestData.getExecutionContext();
                        httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoFpsRanges = httpClientEngine;
                        httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoSizes = httpRequestData;
                        httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = io.ktor.client.engine.HttpClientEngineKt.createCallContext(httpClientEngine, executionContext, httpClientEngine$executeWithinCallContext$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        httpRequestData = (io.ktor.client.request.HttpRequestData) httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoSizes;
                        httpClientEngine = (io.ktor.client.engine.HttpClientEngine) httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) obj;
                    async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(httpClientEngine, coroutineContext.plus(new io.ktor.client.engine.KtorCallContextElement(coroutineContext)), null, new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2, null);
                    httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoFpsRanges = null;
                    httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoSizes = null;
                    httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    java.lang.Object await = async$default.await(httpClientEngine$executeWithinCallContext$1);
                    return await != coroutine_suspended ? coroutine_suspended : await;
                }
            }
            httpClientEngine$executeWithinCallContext$1 = new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$1(continuation);
            java.lang.Object obj2 = httpClientEngine$executeWithinCallContext$1.Camera2StreamConfigurationMap;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
            }
            kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) obj2;
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(httpClientEngine, coroutineContext2.plus(new io.ktor.client.engine.KtorCallContextElement(coroutineContext2)), null, new io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2(httpClientEngine, httpRequestData, null), 2, null);
            httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoFpsRanges = null;
            httpClientEngine$executeWithinCallContext$1.getHighSpeedVideoSizes = null;
            httpClientEngine$executeWithinCallContext$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            java.lang.Object await2 = async$default.await(httpClientEngine$executeWithinCallContext$1);
            if (await2 != coroutine_suspended2) {
            }
        }

        public static java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities(io.ktor.client.engine.HttpClientEngine httpClientEngine) {
            return kotlin.collections.SetsKt.emptySet();
        }

        public static void install(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.HttpClient httpClient) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            httpClient.getSendPipeline().intercept(io.ktor.client.request.HttpSendPipeline.INSTANCE.getEngine(), new io.ktor.client.engine.HttpClientEngine$install$1(httpClient, httpClientEngine, null));
        }

        public static final /* synthetic */ void access$checkExtensions(io.ktor.client.engine.HttpClientEngine httpClientEngine, io.ktor.client.request.HttpRequestData httpRequestData) {
            for (io.ktor.client.engine.HttpClientEngineCapability<?> httpClientEngineCapability : httpRequestData.getRequiredCapabilities$ktor_client_core()) {
                if (!httpClientEngine.getSupportedCapabilities().contains(httpClientEngineCapability)) {
                    throw new java.lang.IllegalArgumentException("Engine doesn't support ".concat(java.lang.String.valueOf(httpClientEngineCapability)).toString());
                }
            }
        }

        public static final /* synthetic */ boolean access$getClosed(io.ktor.client.engine.HttpClientEngine httpClientEngine) {
            return !(((kotlinx.coroutines.Job) httpClientEngine.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE)) != null ? r1.isActive() : false);
        }
    }
}
