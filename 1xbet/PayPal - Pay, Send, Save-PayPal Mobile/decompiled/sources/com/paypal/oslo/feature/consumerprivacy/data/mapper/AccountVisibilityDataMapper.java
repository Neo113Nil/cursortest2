package com.paypal.oslo.feature.consumerprivacy.data.mapper;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/mapper/AccountVisibilityDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "mapQueryToDomain", "(Lcom/paypal/oslo/feature/consumerprivacy/graphql/GetSearchPrivacySettingsQuery$Data;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "", "success", "mapMutationSuccess", "(Ljava/lang/Boolean;)Z", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "callError", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "mapError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccountVisibilityDataMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AccountVisibilityDataMapper() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData mapQueryToDomain(com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Data data) {
        com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.PrivacySetting privacySetting;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.SearchPrivacy searchPrivacy = (data == null || (privacySetting = data.getPrivacySetting()) == null) ? null : privacySetting.getSearchPrivacy();
        com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Simplified simplified = searchPrivacy != null ? searchPrivacy.getSimplified() : null;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Common common2 = searchPrivacy != null ? searchPrivacy.getCommon() : null;
        com.paypal.oslo.feature.consumerprivacy.graphql.GetSearchPrivacySettingsQuery.Granular granular = searchPrivacy != null ? searchPrivacy.getGranular() : null;
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData(searchPrivacy != null ? searchPrivacy.getSearchPolicy() : null, simplified != null ? simplified.getAllowFindByIdentifiers() : null, simplified != null ? simplified.getAllowPaymentRequests() : null, simplified != null ? simplified.getPaymentRequestsFrom() : null, common2 != null ? common2.getAllowVenmoDiscovery() : null, common2 != null ? common2.getAllowFindViaPayPalMe() : null, common2 != null ? common2.getPaypalMePersonalProfileId() : null, granular != null ? granular.getAllowSendMoneyByEmail() : null, granular != null ? granular.getAllowSendMoneyByPhone() : null, granular != null ? granular.getAllowSendMoneyByName() : null, granular != null ? granular.getAllowSendMoneyByUsername() : null, granular != null ? granular.getAllowRequestMoneyByEmail() : null, granular != null ? granular.getAllowRequestMoneyByPhone() : null, granular != null ? granular.getAllowRequestMoneyByName() : null, granular != null ? granular.getAllowRequestMoneyByUsername() : null);
    }

    public final boolean mapMutationSuccess(java.lang.Boolean success) {
        if (success != null) {
            return success.booleanValue();
        }
        return false;
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError mapError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            com.paypal.oslo.core.network.http.error.NetworkError error = ((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).getError();
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.HttpError) {
                com.paypal.oslo.core.network.http.error.NetworkError.HttpError httpError = (com.paypal.oslo.core.network.http.error.NetworkError.HttpError) error;
                return new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError(httpError.getCode(), httpError.getMessage(), httpError.getBody(), null, 8, null);
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.UnknownError) {
                return com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown.INSTANCE;
            }
            if (error instanceof com.paypal.oslo.core.network.http.error.NetworkError.NoInternet) {
                return com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet.INSTANCE;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        java.util.List<com.paypal.oslo.core.network.graphql.error.GraphQLError> m11659getErrors1X0FAY = graphQL.m11659getErrors1X0FAY();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(m11659getErrors1X0FAY, 10));
        java.util.Iterator<T> it = m11659getErrors1X0FAY.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.core.network.graphql.error.GraphQLError) it.next()).getMessage());
        }
        java.util.List m9570constructorimpl = arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
        arrow.core.NonEmptyList m9567boximpl = arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<E> it2 = m9567boximpl.iterator();
        while (it2.hasNext()) {
            java.util.List<java.lang.Object> path = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) it2.next()).getPath();
            java.lang.String joinToString$default = path != null ? kotlin.collections.CollectionsKt.joinToString$default(path, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.data.mapper.AccountVisibilityDataMapper$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.CharSequence valueOf;
                    valueOf = java.lang.String.valueOf(obj);
                    return valueOf;
                }
            }, 30, null) : null;
            if (joinToString$default != null) {
                arrayList2.add(joinToString$default);
            }
        }
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError(arrow.core.NonEmptyList.m9567boximpl(m9570constructorimpl), arrayList2, graphQL.isCritical(), ((com.paypal.oslo.core.network.graphql.error.GraphQLError) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()))).getCorrelationId());
    }
}
