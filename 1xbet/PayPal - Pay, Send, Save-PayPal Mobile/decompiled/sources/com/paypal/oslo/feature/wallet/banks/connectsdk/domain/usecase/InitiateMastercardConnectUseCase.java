package com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/usecase/InitiateMastercardConnectUseCase;", "", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/repository/MastercardConnectRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/repository/MastercardConnectRepository;)V", "Landroid/app/Activity;", "activity", "", "connectUrl", "redirectUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/model/MastercardConnectError;", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/model/ConnectResult;", "invoke", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/banks/connectsdk/domain/repository/MastercardConnectRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InitiateMastercardConnectUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public InitiateMastercardConnectUseCase(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.repository.MastercardConnectRepository mastercardConnectRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mastercardConnectRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mastercardConnectRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.wallet.banks.connectsdk.domain.usecase.InitiateMastercardConnectUseCase initiateMastercardConnectUseCase, android.app.Activity activity, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return initiateMastercardConnectUseCase.invoke(activity, str, str2, continuation);
    }

    public final java.lang.Object invoke(android.app.Activity activity, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.wallet.banks.connectsdk.domain.model.MastercardConnectError, com.paypal.oslo.feature.wallet.banks.connectsdk.model.ConnectResult>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.initiateConnect(activity, str, str2, continuation);
    }
}
