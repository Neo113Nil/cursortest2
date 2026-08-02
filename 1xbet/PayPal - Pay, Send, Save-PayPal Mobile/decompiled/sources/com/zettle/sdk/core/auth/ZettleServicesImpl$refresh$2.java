package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.ZettleServicesImpl$refresh$2", f = "ServiceProvider.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class ZettleServicesImpl$refresh$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ okhttp3.Request getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.zettle.sdk.core.auth.ZettleServicesImpl getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ okhttp3.OkHttpClient getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Map map;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.Camera2StreamConfigurationMap = 1;
            obj = com.zettle.sdk.core.auth.ZettleServicesImpl.access$fetchServiceUrls(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.core.network.HttpPayload httpPayload = (com.zettle.sdk.core.network.HttpPayload) obj;
        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRangesFor, "Result from service -> ".concat(java.lang.String.valueOf(httpPayload)));
        int code = httpPayload.getCode();
        if (200 <= code && code < 300) {
            java.util.Map map2 = (java.util.Map) httpPayload.getBody();
            if (map2 != null) {
                com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl = this.getHighSpeedVideoFpsRangesFor;
                for (java.util.Map.Entry entry : map2.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    map = zettleServicesImpl.getOutputFormats;
                    map.put(str, list);
                }
            }
        } else {
            com.zettle.sdk.core.log.LogKt.warn$default(this.getHighSpeedVideoFpsRangesFor, "Error fetching service urls: ".concat(java.lang.String.valueOf(httpPayload.getCode())), null, 2, null);
            com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRangesFor, "Error fetching service urls: ".concat(java.lang.String.valueOf(httpPayload.getRawBody())));
        }
        com.zettle.sdk.core.log.LogKt.debug(this.getHighSpeedVideoFpsRangesFor, "Refreshed base Urls - ".concat(java.lang.String.valueOf(httpPayload)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.auth.ZettleServicesImpl$refresh$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.auth.ZettleServicesImpl$refresh$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZettleServicesImpl$refresh$2(com.zettle.sdk.core.auth.ZettleServicesImpl zettleServicesImpl, okhttp3.Request request, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.ZettleServicesImpl$refresh$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = zettleServicesImpl;
        this.getHighSpeedVideoFpsRanges = request;
        this.getHighSpeedVideoSizes = okHttpClient;
    }
}
