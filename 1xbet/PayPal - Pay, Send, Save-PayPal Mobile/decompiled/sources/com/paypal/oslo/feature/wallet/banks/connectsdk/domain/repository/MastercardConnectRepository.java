package com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J6\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u0010\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/repository/MastercardConnectRepository;", "", "Landroid/app/Activity;", "activity", "", "connectUrl", "redirectUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/model/MastercardConnectError;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectResult;", "initiateConnect", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "", "saveConnectUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedConnectUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MastercardConnectRepository {
    java.lang.Object getSavedConnectUrl(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object initiateConnect(android.app.Activity activity, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError, com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult>> continuation);

    java.lang.Object saveConnectUrl(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object initiateConnect$default(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository mastercardConnectRepository, android.app.Activity activity, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initiateConnect");
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return mastercardConnectRepository.initiateConnect(activity, str, str2, continuation);
    }
}
