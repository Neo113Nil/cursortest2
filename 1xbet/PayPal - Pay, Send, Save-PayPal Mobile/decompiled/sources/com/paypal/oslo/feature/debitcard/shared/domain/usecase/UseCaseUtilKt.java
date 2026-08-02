package com.paypal.oslo.feature.debitcard.shared.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError$GraphQLError;", "error", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;", "mapGraphQLError", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError$GraphQLError;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult$Error;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UseCaseUtilKt {
    public static final com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error mapGraphQLError(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError graphQLError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLError, "");
        com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.GraphQLErrorDetail errorDetail = graphQLError.getErrorDetail();
        if (graphQLError instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.AlreadyActivated) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.AlreadyActivatedError(errorDetail);
        }
        if (graphQLError instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.AlreadyDeactivated) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.AlreadyDeactivatedError(errorDetail);
        }
        if (graphQLError instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.RiskDenied) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.RiskDeniedError(errorDetail);
        }
        if (graphQLError instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.InvalidCVV) {
            return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.InvalidCVVError(errorDetail);
        }
        if (!(graphQLError instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.GenericError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult.Error.GenericGraphQLError(errorDetail);
    }
}
