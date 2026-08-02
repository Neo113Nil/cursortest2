package com.zettle.sdk.feature.taptopay.core.configuration.init;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepositoryImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/commons/network/NetworkClient;", "p0", "Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;", "p1", "Lcom/zettle/sdk/commons/network/ResponseParser;", "p2", "<init>", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;Lcom/zettle/sdk/commons/network/ResponseParser;)V", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitRepository$Result;", "getConfigurationInit", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/network/NetworkClient;", "Lcom/zettle/sdk/commons/network/ResponseParser;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConfigurationInitRepositoryImpl implements com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.network.ResponseParser getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.commons.network.NetworkClient getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching getHighSpeedVideoFpsRanges;

    public ConfigurationInitRepositoryImpl(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching runTimeCaching, com.zettle.sdk.commons.network.ResponseParser responseParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runTimeCaching, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseParser, "");
        this.getHighResolutionOutputSizeshNQ4ISI = networkClient;
        this.getHighSpeedVideoFpsRanges = runTimeCaching;
        this.getHighSpeedVideoFpsRangesFor = responseParser;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository
    public final kotlinx.coroutines.flow.Flow<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> getConfigurationInit(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl$getConfigurationInit$1(this, p0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object Camera2StreamConfigurationMap(final java.lang.String str, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.zettle.sdk.core.log.LogKt.debug(this, "App -> Backend");
        this.getHighResolutionOutputSizeshNQ4ISI.request("/softspace/config/init", new java.util.LinkedHashMap(), new com.zettle.sdk.commons.network.NetworkClient.Callback() { // from class: com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl$getRemote$2$1
            @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
            public final void onFailure(java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                com.zettle.sdk.core.log.LogKt.warn(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this, "onFailure", e);
                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError.INSTANCE)));
            }

            @Override // com.zettle.sdk.commons.network.NetworkClient.Callback
            public final void onResponse(com.zettle.sdk.commons.network.NetworkClient.Response response) {
                com.zettle.sdk.commons.network.ResponseParser responseParser;
                com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching runTimeCaching;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                try {
                    if (!response.getIsSuccessful()) {
                        com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this, "onResponse::!response.isSuccessful");
                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.UnsuccessfulResponse.INSTANCE)));
                        return;
                    }
                    java.lang.String body = response.body();
                    java.lang.String str2 = body;
                    if (str2 != null && str2.length() != 0) {
                        responseParser = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this.getHighSpeedVideoFpsRangesFor;
                        com.zettle.sdk.commons.network.Response parse = responseParser.parse(body);
                        int getHighSpeedVideoSizes = parse.getGetHighSpeedVideoSizes();
                        if (500 <= getHighSpeedVideoSizes && getHighSpeedVideoSizes < 600) {
                            response.invalidateUrl();
                            kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation2 = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.TechnicalError.INSTANCE)));
                            return;
                        }
                        int getHighSpeedVideoSizes2 = parse.getGetHighSpeedVideoSizes();
                        if (200 > getHighSpeedVideoSizes2 || getHighSpeedVideoSizes2 >= 300) {
                            kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation3 = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                            cancellableContinuation3.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.UnsuccessfulResponse.INSTANCE)));
                            return;
                        } else {
                            if (!parse.getGetHighResolutionOutputSizeshNQ4ISI()) {
                                com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this, "onResponse::invalid payload");
                                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation4 = cancellableContinuationImpl2;
                                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                                cancellableContinuation4.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyPayload.INSTANCE)));
                                return;
                            }
                            com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote configurationInitRemote = (com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote) parse.payload(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitResponseParser());
                            runTimeCaching = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this.getHighSpeedVideoFpsRanges;
                            runTimeCaching.save(str, "cachingInitConfiguration", configurationInitRemote);
                            kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation5 = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                            cancellableContinuation5.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Success(configurationInitRemote, false)));
                            return;
                        }
                    }
                    com.zettle.sdk.core.log.LogKt.debug(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this, "onResponse::empty json");
                    kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation6 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
                    cancellableContinuation6.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.EmptyResponse.INSTANCE)));
                } catch (java.lang.Exception e) {
                    com.zettle.sdk.core.log.LogKt.warn(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl.this, "Error while parsing response", e);
                    kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result> cancellableContinuation7 = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion7 = kotlin.Result.INSTANCE;
                    cancellableContinuation7.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Failed(com.zettle.sdk.feature.taptopay.core.FailureReason.ParsingError.INSTANCE)));
                }
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ java.lang.Object getHighSpeedVideoSizes(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImpl configurationInitRepositoryImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote configurationInitRemote = (com.zettle.sdk.feature.taptopay.core.models.ConfigurationInitRemote) configurationInitRepositoryImpl.getHighSpeedVideoFpsRanges.get(str, "cachingInitConfiguration");
        if (configurationInitRemote != null) {
            return new com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result.Success(configurationInitRemote, true);
        }
        return configurationInitRepositoryImpl.Camera2StreamConfigurationMap(str, (kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.Result>) continuation);
    }
}
