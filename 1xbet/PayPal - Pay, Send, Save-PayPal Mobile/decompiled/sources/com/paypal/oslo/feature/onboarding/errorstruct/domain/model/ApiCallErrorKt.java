package com.paypal.oslo.feature.onboarding.errorstruct.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Larrow/core/NonEmptyList;", "Lcom/paypal/oslo/core/network/graphql/error/GraphQLError;", "", "", "toOnboardingApiErrors-GZgkXh4", "(Ljava/util/List;)Ljava/util/List;", "toOnboardingApiErrors", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "toErrorDetails", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ApiCallErrorKt {
    public static final java.lang.String toErrorDetails(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError apiCallError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiCallError, "");
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.NoInternet) apiCallError).getErrorDetails();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Timeout) apiCallError).getErrorDetails();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.HttpError) apiCallError).getErrorDetails();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.Network.Unknown) apiCallError).getErrorDetails();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.DataNotFound) apiCallError).getErrorDetails();
        }
        if (apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) {
            return ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.InvalidData) apiCallError).getErrorDetails();
        }
        if (!(apiCallError instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.util.List<com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue> issues = ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) apiCallError).getIssues();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = issues.iterator();
        while (it.hasNext()) {
            java.lang.String description = ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue) it.next()).getDescription();
            if (description != null) {
                arrayList.add(description);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ". ", null, null, 0, null, null, 62, null);
    }

    /* renamed from: toOnboardingApiErrors-GZgkXh4, reason: not valid java name */
    public static final java.util.List<java.lang.String> m16069toOnboardingApiErrorsGZgkXh4(java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        return arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(arrayList));
    }
}
