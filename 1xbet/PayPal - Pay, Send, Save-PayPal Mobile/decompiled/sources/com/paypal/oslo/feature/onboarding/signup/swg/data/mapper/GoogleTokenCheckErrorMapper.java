package com.paypal.oslo.feature.onboarding.signup.swg.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckErrorMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "error", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckError;", "map", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;)Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoogleTokenCheckErrorMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GoogleTokenCheckErrorMapper() {
    }

    public final com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError map(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) {
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.NetworkError(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) error).getErrorDetails(), null, true);
        }
        if (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError httpError = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) error;
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.NetworkError(httpError.getErrorDetails(), java.lang.Integer.valueOf(httpError.getStatusCode()), false);
        }
        if ((error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) || (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown)) {
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.NetworkError(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network) error).getErrorDetails(), null, false);
        }
        if (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) {
            java.util.List list = kotlin.collections.CollectionsKt.toList(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) error).getIssues());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList, kotlin.collections.CollectionsKt.listOfNotNull(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue) it.next()).getDescription()));
            }
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.ServerError(arrayList);
        }
        if (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) {
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.DataNotFound(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) error).getErrorDetails());
        }
        if (!(error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.UnknownError(((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) error).getErrorDetails());
    }
}
