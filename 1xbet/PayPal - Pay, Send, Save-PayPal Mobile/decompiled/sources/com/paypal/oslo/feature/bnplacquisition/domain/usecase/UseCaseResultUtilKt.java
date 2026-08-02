package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;", "error", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;", "mapGraphQLError", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError$GraphQL;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/UseCaseResult$Error;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UseCaseResultUtilKt {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error mapGraphQLError(com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL graphQL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.GraphQLErrorDetail errorDetail = graphQL.getErrorDetail();
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FeatureNotAvailable) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FeatureNotAvailableError(errorDetail);
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DeviceTokenPendingActiveError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DeviceTokenPendingActive) graphQL).getPendingActiveToken());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidVirtualCard) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidVirtualCardError(errorDetail);
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.IssuerDigitizationDataNotFound) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.IssuerDigitizationDataNotFoundError(errorDetail);
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.AddressNormalizationError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.AddressNormalizationError) graphQL).getAddress());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.RepaymentAuthenticationFailure) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.RepaymentAuthenticationFailureError(errorDetail);
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.DownpaymentAuthorizationError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.DownpaymentAuthorizationError) graphQL).getReason());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.FetchVccFailedError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.FetchVccFailed) graphQL).getCreditAccountId());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidPhoneNumber) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidPhoneNumberError(errorDetail);
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidDateOfBirthError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidDateOfBirth) graphQL).getReason());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidAgeError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidAge) graphQL).getReason());
        }
        if (graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification) {
            return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.InvalidNationalIdentificationError(errorDetail, ((com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.InvalidNationalIdentification) graphQL).getReason());
        }
        if (!(graphQL instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError.GraphQL.Unknown)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.UseCaseResult.Error.UnknownGraphQLError(errorDetail);
    }
}
