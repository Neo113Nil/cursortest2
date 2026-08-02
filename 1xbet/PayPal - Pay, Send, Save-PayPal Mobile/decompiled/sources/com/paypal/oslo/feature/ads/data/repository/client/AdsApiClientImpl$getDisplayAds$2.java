package com.paypal.oslo.feature.ads.data.repository.client;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/ads/data/models/smithy/GetDisplayAdsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl$getDisplayAds$2", f = "AdsApiClientImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class AdsApiClientImpl$getDisplayAds$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration;
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration2;
        com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer smithyJsonSerializer;
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration3;
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration4;
        com.paypal.oslo.feature.ads.api.config.AdsConfiguration adsConfiguration5;
        okhttp3.Call.Factory factory;
        com.paypal.oslo.feature.ads.data.repository.serialization.SmithyJsonSerializer smithyJsonSerializer2;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                adsConfiguration = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                if (!kotlin.text.StringsKt.isBlank(adsConfiguration.getApiKey())) {
                    adsConfiguration2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(adsConfiguration2.getApiKey(), "PLACEHOLDER")) {
                        okhttp3.RequestBody.Companion companion = okhttp3.RequestBody.INSTANCE;
                        smithyJsonSerializer = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                        okhttp3.RequestBody create = companion.create(smithyJsonSerializer.serializeRequest(this.getHighSpeedVideoFpsRanges), okhttp3.MediaType.INSTANCE.get("application/json"));
                        okhttp3.Request.Builder builder = new okhttp3.Request.Builder();
                        adsConfiguration3 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                        okhttp3.Request.Builder addHeader = builder.url(adsConfiguration3.getDisplayAdsEndpoint()).post(create).addHeader("Content-Type", "application/json");
                        adsConfiguration4 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                        okhttp3.Request.Builder addHeader2 = addHeader.addHeader("X-Activation-Code", adsConfiguration4.getApiKey());
                        adsConfiguration5 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                        okhttp3.Request build = addHeader2.addHeader("X-Client-Id", adsConfiguration5.getClientId()).tag((java.lang.Class<? super java.lang.Class>) com.paypal.oslo.core.identity.NoAuthTag.class, (java.lang.Class) com.paypal.oslo.core.identity.NoAuthTag.INSTANCE).build();
                        factory = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                        okhttp3.Response execute = factory.newCall(build).execute();
                        com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl adsApiClientImpl = this.Camera2StreamConfigurationMap;
                        try {
                            okhttp3.Response response = execute;
                            okhttp3.ResponseBody body = response.body();
                            java.lang.String string = body != null ? body.string() : null;
                            if (string == null) {
                                string = "";
                            }
                            if (response.getIsSuccessful()) {
                                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.ads.LoggerKt.log, "Ads API request successful", null, null, 6, null);
                                smithyJsonSerializer2 = adsApiClientImpl.getHighResolutionOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse deserializeResponse = smithyJsonSerializer2.deserializeResponse(string);
                                kotlin.io.CloseableKt.closeFinally(execute, null);
                                return deserializeResponse;
                            }
                            int code = response.code();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ads API failed: HTTP ");
                            sb.append(code);
                            sb.append(" - ");
                            sb.append(string);
                            throw new java.io.IOException(sb.toString());
                        } finally {
                        }
                    }
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.ads.LoggerKt.log, "Using mock response for ads API", null, null, 6, null);
                return com.paypal.oslo.feature.ads.data.repository.client.MockAdsDataKt.createMockResponse();
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.IllegalArgumentException e2) {
                throw new java.io.IOException("Ads API request failed", e2);
            } catch (java.util.concurrent.CancellationException e3) {
                throw e3;
            } catch (java.lang.IllegalStateException e4) {
                throw new java.io.IOException("Ads API request failed", e4);
            }
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsResponse> continuation) {
        return ((com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl$getDisplayAds$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl$getDisplayAds$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdsApiClientImpl$getDisplayAds$2(com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl adsApiClientImpl, com.paypal.oslo.feature.ads.data.models.smithy.GetDisplayAdsRequest getDisplayAdsRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.ads.data.repository.client.AdsApiClientImpl$getDisplayAds$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = adsApiClientImpl;
        this.getHighSpeedVideoFpsRanges = getDisplayAdsRequest;
    }
}
