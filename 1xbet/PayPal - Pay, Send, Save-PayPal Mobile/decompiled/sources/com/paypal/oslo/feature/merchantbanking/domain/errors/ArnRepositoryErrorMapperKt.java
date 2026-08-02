package com.paypal.oslo.feature.merchantbanking.domain.errors;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "toAccountRoutingError", "(Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;)Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ArnRepositoryErrorMapperKt {
    public static final com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError toAccountRoutingError(com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError arnRepositoryError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arnRepositoryError, "");
        if (arnRepositoryError instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network) arnRepositoryError).getError().getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.NoNetwork.INSTANCE;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                int code = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error).getCode();
                if (500 <= code && code < 600) {
                    return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ServerError.INSTANCE;
                }
                if (400 <= code && code < 500) {
                    return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError.INSTANCE;
                }
                return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError.INSTANCE;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (arnRepositoryError instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError) {
            return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError.INSTANCE;
        }
        if (arnRepositoryError instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied) {
            return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.RiskDeclined.INSTANCE;
        }
        if (arnRepositoryError instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Ineligible) {
            return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.Ineligible.INSTANCE;
        }
        if (arnRepositoryError instanceof com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.EnrollmentRequired) {
            return com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.EnrollmentRequired.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
