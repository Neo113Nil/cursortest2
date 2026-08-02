package com.paypal.oslo.feature.taptopay.data.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/RiskAuthRepositoryImpl;", "Lcom/paypal/oslo/feature/taptopay/domain/repository/RiskAuthRepository;", "<init>", "()V", "", "stepUpContext", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/risk/StepUpAuthError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/risk/StepUpAuthResult;", "handleStepUpChallenge", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RiskAuthRepositoryImpl implements com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public RiskAuthRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository
    public final java.lang.Object handleStepUpChallenge(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthError, ? extends com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult>> continuation) {
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Using placeholder step-up implementation - auto-succeeding", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("contextId", str)), null, 4, null);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Placeholder step-up succeeded", null, null, 6, null);
        return arrow.core.EitherKt.right(com.paypal.oslo.feature.taptopay.domain.model.risk.StepUpAuthResult.Success.INSTANCE);
    }
}
