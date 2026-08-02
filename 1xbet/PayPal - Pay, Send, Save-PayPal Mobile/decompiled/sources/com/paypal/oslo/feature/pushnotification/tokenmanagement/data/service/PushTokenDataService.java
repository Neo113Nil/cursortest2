package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J@\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/service/PushTokenDataService;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "deviceId", "cloudIdentity", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/SubscribeResponse;", "subscribePushToken", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushToken", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/UnsubscribeResponse;", "unSubscribePushToken", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushTokenDataService {
    java.lang.Object subscribePushToken(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse>> continuation);

    java.lang.Object unSubscribePushToken(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.UnsubscribeResponse>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object subscribePushToken$default(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataService pushTokenDataService, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribePushToken");
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        return pushTokenDataService.subscribePushToken(str, z, str2, str3, continuation);
    }
}
