package com.paypal.oslo.feature.cardconnect.api;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ<\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/CardConnectApi;", "", "", "cardProduct", "instrumentId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectError;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEligibility;", "checkEligibility", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "merchantId", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSession;", "createSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "eventDispatcher", "launchKnotSdk", "(Landroid/content/Context;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CardConnectApi {
    java.lang.Object checkEligibility(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError, ? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectEligibility>> continuation);

    java.lang.Object createSession(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectError, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSession>> continuation);

    void launchKnotSdk(android.content.Context context, com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration configuration, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent, kotlin.Unit> eventDispatcher);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object checkEligibility$default(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkEligibility");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return cardConnectApi.checkEligibility(str, str2, continuation);
    }

    static /* synthetic */ java.lang.Object createSession$default(com.paypal.oslo.feature.cardconnect.api.CardConnectApi cardConnectApi, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSession");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return cardConnectApi.createSession(str, str2, str3, continuation);
    }
}
