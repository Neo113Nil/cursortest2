package com.paypal.oslo.feature.settings.closeaccount.domain.mapper;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t0\u0003¢\u0006\u0004\b\u0006\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0004*\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000b\u0010\u000f\u001a)\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/apollographql/apollo/api/ApolloResponse;", "Lcom/paypal/oslo/feature/settings/graphql/CloseAccountEligibilityQuery$Data;", "response", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountEligibilityResult;", "toCloseAccountEligibilityIor", "(Lcom/apollographql/apollo/api/ApolloResponse;)Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "(Larrow/core/Ior;)Larrow/core/Ior;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "", "(Lcom/paypal/oslo/core/network/http/error/NetworkError;)Ljava/lang/String;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;)Larrow/core/Ior;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CloseAccountEligibilityMapperKt {
    public static final arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult> toCloseAccountEligibilityIor(com.apollographql.apollo.api.ApolloResponse<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data> apolloResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloResponse, "");
        if (apolloResponse.hasErrors()) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.closeaccount.domain.mapper.CloseAccountErrorMapperKt.extractCloseAccountError(apolloResponse));
        }
        com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data data = apolloResponse.data;
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility = data != null ? data.getCloseAccountEligibility() : null;
        if (closeAccountEligibility != null) {
            java.lang.String name2 = closeAccountEligibility.getDecisionCode().name();
            java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> ineligibilityReasons = closeAccountEligibility.getIneligibilityReasons();
            if (ineligibilityReasons != null) {
                java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> list = ineligibilityReasons;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason ineligibilityReason : list) {
                    arrayList2.add(new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason(ineligibilityReason.getCode().name(), ineligibilityReason.getMessage()));
                }
                arrayList = arrayList2;
            }
            return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult(name2, arrayList));
        }
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError("No data returned from server", kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
    }

    public static final arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult> toCloseAccountEligibilityIor(arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data>> ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Left) {
            return arrow.core.IorKt.leftIor(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
        }
        if (ior instanceof arrow.core.Ior.Right) {
            return getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
        }
        if (!(ior instanceof arrow.core.Ior.Both)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
        arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue());
        return highResolutionOutputSizeshNQ4ISI instanceof arrow.core.Ior.Right ? highResolutionOutputSizeshNQ4ISI : arrow.core.IorKt.leftIor(Camera2StreamConfigurationMap((com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue()));
    }

    private static final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError Camera2StreamConfigurationMap(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        java.util.List emptyList;
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(Camera2StreamConfigurationMap(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError()), kotlin.collections.CollectionsKt.emptyList(), null, 4, null);
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.lang.String message = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getMessage();
        java.util.List<java.lang.Object> path = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(graphQL.m11659getErrors1X0FAY())).getPath();
        if (path == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = path.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                java.lang.String obj = next != null ? next.toString() : null;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, emptyList, null, 4, null);
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
            java.lang.String message = ((com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) networkError).getCause().getMessage();
            return message == null ? com.paypal.oslo.feature.qrc.ui.utils.Constants.INTERNET_ERROR : message;
        }
        if (networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
            com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) networkError;
            java.lang.String message2 = httpError.getMessage();
            return message2 == null ? "HTTP error: ".concat(java.lang.String.valueOf(httpError.getCode())) : message2;
        }
        if (!(networkError instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String message3 = ((com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) networkError).getCause().getMessage();
        return message3 == null ? "Unknown network error" : message3;
    }

    private static final arrow.core.Ior<com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError, com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult> getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data> graphQLData) {
        com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.Data data = graphQLData.getData();
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.CloseAccountEligibility closeAccountEligibility = data != null ? data.getCloseAccountEligibility() : null;
        if (closeAccountEligibility != null) {
            java.lang.String name2 = closeAccountEligibility.getDecisionCode().name();
            java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> ineligibilityReasons = closeAccountEligibility.getIneligibilityReasons();
            if (ineligibilityReasons != null) {
                java.util.List<com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason> list = ineligibilityReasons;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.settings.graphql.CloseAccountEligibilityQuery.IneligibilityReason ineligibilityReason : list) {
                    arrayList2.add(new com.paypal.oslo.feature.settings.closeaccount.domain.model.IneligibilityReason(ineligibilityReason.getCode().name(), ineligibilityReason.getMessage()));
                }
                arrayList = arrayList2;
            }
            return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountEligibilityResult(name2, arrayList));
        }
        return arrow.core.IorKt.leftIor(new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError("No data returned from server", kotlin.collections.CollectionsKt.emptyList(), null, 4, null));
    }
}
