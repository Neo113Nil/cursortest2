package com.paypal.oslo.feature.identity.stepup.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/data/mapper/StepupChallengeErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupChallengeError;", "mapCallError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupChallengeError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StepupChallengeErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public StepupChallengeErrorMapper() {
    }

    public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError mapCallError(com.paypal.oslo.core.network.graphql.error.CallError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (!(error instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network)) {
            if (!(error instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) error).m11659getErrors1X0FAY());
            if (!m9567boximpl.isEmpty()) {
                return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Server(((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) m9567boximpl)).getMessage());
            }
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Unknown("Server error occurred with no error details");
        }
        com.paypal.oslo.core.network.http.error.NetworkError error2 = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) error).getError();
        if (error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Network(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_DESCRIPTION);
        }
        if (error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error2).getMessage();
            if (message == null) {
                message = com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.NETWORK_ERROR;
            }
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Network(message);
        }
        if (!(error2 instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message2 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) error2).getCause().getMessage();
        if (message2 == null) {
            message2 = "Unknown error occurred";
        }
        return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupChallengeError.Unknown(message2);
    }
}
