package com.paypal.oslo.feature.cryptocurrency.data.mapper.receive;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Data;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/error/CryptocurrencyError;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/EvaluationResult;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/EvaluateCryptocurrencyTradeMutation$Data;)Larrow/core/Either;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EvaluationResultMapperKt {
    public static final arrow.core.Either<com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError, com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult> toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.EvaluateCryptocurrencyTradeMutation.EvaluateCryptocurrencyTrade evaluateCryptocurrencyTrade = data.getEvaluateCryptocurrencyTrade();
        if (evaluateCryptocurrencyTrade == null) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        java.lang.String transactionTrackingId = evaluateCryptocurrencyTrade.getTransactionTrackingId();
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyDecisionCode decisionCode = evaluateCryptocurrencyTrade.getDecisionCode();
        if (transactionTrackingId.length() == 0) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.cryptocurrency.domain.error.CryptocurrencyError.Business.DataNotFound.INSTANCE);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.cryptocurrency.domain.model.receive.EvaluationResult(transactionTrackingId, decisionCode.getRawValue(), kotlin.jvm.internal.Intrinsics.areEqual(decisionCode.getRawValue(), "ALLOW")));
    }
}
