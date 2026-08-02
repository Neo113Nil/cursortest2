package com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleAuthChallengeContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/contingency/HandleContingencyUseCase;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AuthChallengeContingencyInput;", "<init>", "()V", "contingencyInput", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyResponse;", "invoke", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/contingency/ContingencyInput$AuthChallengeContingencyInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HandleAuthChallengeContingencyUseCase implements com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase<com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public HandleAuthChallengeContingencyUseCase() {
    }

    @Override // com.paypal.oslo.feature.inappcheckout.domain.usecase.contingency.HandleContingencyUseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput authChallengeContingencyInput, kotlin.coroutines.Continuation continuation) {
        return invoke2(authChallengeContingencyInput, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyInput.AuthChallengeContingencyInput authChallengeContingencyInput, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse> continuation) {
        return com.paypal.oslo.feature.inappcheckout.domain.model.contingency.ContingencyResponse.NotHandled.INSTANCE;
    }
}
