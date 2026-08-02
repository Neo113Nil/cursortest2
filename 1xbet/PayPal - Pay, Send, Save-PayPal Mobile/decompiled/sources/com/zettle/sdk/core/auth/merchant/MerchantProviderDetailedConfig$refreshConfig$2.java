package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/zettle/sdk/core/network/HttpPayload;", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2", f = "MerchantProviderDetailedConfig.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class MerchantProviderDetailedConfig$refreshConfig$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.network.HttpPayload<com.zettle.sdk.core.user.userconfig.DetailedUserConfig>>, java.lang.Object> {
    final /* synthetic */ okhttp3.Request Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ okhttp3.OkHttpClient getHighSpeedVideoSizes;
    final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig getInputFormats;
    int getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        okhttp3.OkHttpClient okHttpClient = this.getHighSpeedVideoSizes;
        okhttp3.Request request = this.Camera2StreamConfigurationMap;
        final com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig = this.getInputFormats;
        this.getHighSpeedVideoFpsRangesFor = okHttpClient;
        this.getHighSpeedVideoFpsRanges = request;
        this.getHighResolutionOutputSizeshNQ4ISI = merchantProviderDetailedConfig;
        this.getInputSizeshNQ4ISI = 1;
        com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2 merchantProviderDetailedConfig$refreshConfig$2 = this;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(merchantProviderDetailedConfig$refreshConfig$2), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        okhttp3.Callback callback = new okhttp3.Callback() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2$1$callback$1
            @Override // okhttp3.Callback
            public final void onFailure(okhttp3.Call call, java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
                com.zettle.sdk.core.log.LogKt.log(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.this, "onFailure");
                kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.network.HttpPayload<com.zettle.sdk.core.user.userconfig.DetailedUserConfig>> cancellableContinuation = cancellableContinuationImpl2;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public final void onResponse(okhttp3.Call call, okhttp3.Response response) {
                java.lang.Object obj2;
                java.lang.Object decodeFromString;
                com.zettle.sdk.core.network.HttpPayload httpPayload;
                int code;
                java.lang.Object m23436constructorimpl;
                java.lang.String string;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.zettle.sdk.core.log.LogKt.log(com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig.this, "onResponse");
                okhttp3.ResponseBody body = response.body();
                java.lang.String str = (body == null || (string = body.string()) == null) ? "" : string;
                int code2 = response.code();
                java.lang.String message = response.message();
                java.util.List<kotlin.Pair> list = kotlin.collections.CollectionsKt.toList(response.headers());
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (kotlin.Pair pair : list) {
                    java.lang.Object first = pair.getFirst();
                    java.lang.Object second = pair.getSecond();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(first);
                    sb.append(": ");
                    sb.append(second);
                    arrayList.add(sb.toString());
                }
                java.util.ArrayList arrayList2 = arrayList;
                int code3 = response.code();
                if (200 <= code3 && code3 < 300) {
                    decodeFromString = com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.user.shadow.UserConfigJsonShadow.INSTANCE.serializer(), str);
                } else if (code3 == 499) {
                    decodeFromString = com.zettle.sdk.core.network.HttpPayloadKt.getHighResolutionOutputSizeshNQ4ISI.decodeFromString(com.zettle.sdk.core.user.shadow.UserConfigJsonShadow.INSTANCE.serializer(), str);
                } else {
                    obj2 = null;
                    httpPayload = new com.zettle.sdk.core.network.HttpPayload(code2, message, arrayList2, str, obj2);
                    code = httpPayload.getCode();
                    if (200 > code && code < 300) {
                        com.zettle.sdk.core.user.shadow.UserConfigMapper userConfigMapper = new com.zettle.sdk.core.user.shadow.UserConfigMapper(null, null, 3, null);
                        com.zettle.sdk.core.user.shadow.UserConfigJsonShadow userConfigJsonShadow = (com.zettle.sdk.core.user.shadow.UserConfigJsonShadow) httpPayload.getBody();
                        com.zettle.sdk.core.user.shadow.UserConfigShadow payload = userConfigJsonShadow != null ? userConfigJsonShadow.getPayload() : null;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(payload);
                        com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig(userConfigMapper.map(payload));
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(httpPayload.transform$core_publicRelease(detailedUserConfig));
                    } else {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException(httpPayload.getRawBody())));
                    }
                    cancellableContinuationImpl2.resumeWith(m23436constructorimpl);
                }
                obj2 = decodeFromString;
                httpPayload = new com.zettle.sdk.core.network.HttpPayload(code2, message, arrayList2, str, obj2);
                code = httpPayload.getCode();
                if (200 > code) {
                }
                kotlin.Result.Companion companion22 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException(httpPayload.getRawBody())));
                cancellableContinuationImpl2.resumeWith(m23436constructorimpl);
            }
        };
        final okhttp3.Call newCall = okHttpClient.newCall(request);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2$1$1
            public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
                okhttp3.Call.this.cancel();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoSizes(th);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
        newCall.enqueue(callback);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(merchantProviderDetailedConfig$refreshConfig$2);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.network.HttpPayload<com.zettle.sdk.core.user.userconfig.DetailedUserConfig>> continuation) {
        return ((com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantProviderDetailedConfig$refreshConfig$2(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig merchantProviderDetailedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderDetailedConfig$refreshConfig$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = okHttpClient;
        this.Camera2StreamConfigurationMap = request;
        this.getInputFormats = merchantProviderDetailedConfig;
    }
}
