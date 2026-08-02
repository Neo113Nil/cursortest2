package com.paypal.oslo.core.remoteconfig.cdn;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0011X\u0090D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnFetcher;", "", "Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;", "cdnService", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/remoteconfig/cdn/ConfigSpecResponse;", "fetchConfigSpecs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/cdn/StatsigCdnService;", "", "cdnUrl", "Ljava/lang/String;", "getCdnUrl$remote_config_release", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class StatsigCdnFetcher {
    private final java.lang.String cdnUrl;
    private final com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public StatsigCdnFetcher(com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService statsigCdnService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigCdnService, "");
        this.getHighResolutionOutputSizeshNQ4ISI = statsigCdnService;
        this.cdnUrl = "https://api.statsigcdn.com/v1/download_config_specs/client-C9HGzwbJSBx7mkfVEgM1Xxtopw49vEaoKCZyBON9mIT.json";
    }

    /* renamed from: getCdnUrl$remote_config_release, reason: from getter */
    public java.lang.String getCdnUrl() {
        return this.cdnUrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchConfigSpecs(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse>> continuation) {
        com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher$fetchConfigSpecs$1 statsigCdnFetcher$fetchConfigSpecs$1;
        int i;
        retrofit2.Response response;
        try {
            if (continuation instanceof com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher$fetchConfigSpecs$1) {
                statsigCdnFetcher$fetchConfigSpecs$1 = (com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher$fetchConfigSpecs$1) continuation;
                if ((statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Fetching config specs from CDN", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", getCdnUrl())), null, 4, null);
                        com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService statsigCdnService = this.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String cdnUrl = getCdnUrl();
                        statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = statsigCdnService.fetchConfigSpecs(cdnUrl, statsigCdnFetcher$fetchConfigSpecs$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    response = (retrofit2.Response) obj;
                    com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse configSpecResponse = (com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse) response.body();
                    if (!response.isSuccessful() && configSpecResponse != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Successfully fetched config specs from CDN", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("featureGates", kotlin.coroutines.jvm.internal.Boxing.boxInt(configSpecResponse.getFeatureGates().size())), kotlin.TuplesKt.to("dynamicConfigs and experiments", kotlin.coroutines.jvm.internal.Boxing.boxInt(configSpecResponse.getDynamicConfigs().size()))), null, 4, null);
                        return arrow.core.EitherKt.right(configSpecResponse);
                    }
                    com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(response.code(), response.message(), null, null, 12, null);
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Failed to fetch config specs from CDN", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", httpError.toString())), null, null, 12, null);
                    return arrow.core.EitherKt.left(httpError);
                }
            }
            if (i != 0) {
            }
            response = (retrofit2.Response) obj;
            com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse configSpecResponse2 = (com.paypal.oslo.core.remoteconfig.cdn.ConfigSpecResponse) response.body();
            if (!response.isSuccessful()) {
            }
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError2 = new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(response.code(), response.message(), null, null, 12, null);
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Failed to fetch config specs from CDN", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", httpError2.toString())), null, null, 12, null);
            return arrow.core.EitherKt.left(httpError2);
        } catch (java.io.IOException e) {
            com.paypal.oslo.core.network.http.error.NetworkError.UnknownError unknownError = new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(e);
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Failed to fetch config specs from CDN", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", unknownError.toString())), null, null, 12, null);
            return arrow.core.EitherKt.left(unknownError);
        }
        statsigCdnFetcher$fetchConfigSpecs$1 = new com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher$fetchConfigSpecs$1(this, continuation);
        java.lang.Object obj2 = statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statsigCdnFetcher$fetchConfigSpecs$1.getHighSpeedVideoFpsRangesFor;
    }
}
