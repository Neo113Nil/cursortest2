package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/LegacyWebViewServicingUrlsRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlsRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/LegacyWebViewServicingUrlError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/legacyservicing/ServicingUrls;", "fetchServicingUrls", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegacyWebViewServicingUrlsRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public LegacyWebViewServicingUrlsRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlsRepository
    public final java.lang.Object fetchServicingUrls(final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls>> continuation) {
        return fetchData(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(creditProductIdentifier)), new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$2(this), new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl$fetchServicingUrls$3(this), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkOnly, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl.$r8$lambda$tjXdUF6NS60O7piCMe9uh4qjGxc(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tjXdUF6NS60O7piCMe9uh4qjGxc(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(creditProductIdentifier);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls access$extractUrls(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl legacyWebViewServicingUrlsRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Data data) {
        java.lang.Object viewNotificationsUrl;
        java.lang.Object viewStatementsUrl;
        java.lang.Object managePaymentsUrl;
        java.lang.Object manageAutopayUrl;
        java.lang.Object makePaymentUrl;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.RevolvingCreditServicingContent revolvingCreditServicingContent = data.getRevolvingCreditServicingContent();
        java.lang.String str = null;
        if (revolvingCreditServicingContent == null) {
            return null;
        }
        java.lang.Object servicingHomeUrl = revolvingCreditServicingContent.getServicingHomeUrl();
        java.lang.String obj = servicingHomeUrl != null ? servicingHomeUrl.toString() : null;
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments = revolvingCreditServicingContent.getPayments();
        java.lang.String obj2 = (payments == null || (makePaymentUrl = payments.getMakePaymentUrl()) == null) ? null : makePaymentUrl.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments2 = revolvingCreditServicingContent.getPayments();
        java.lang.String obj3 = (payments2 == null || (manageAutopayUrl = payments2.getManageAutopayUrl()) == null) ? null : manageAutopayUrl.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Payments payments3 = revolvingCreditServicingContent.getPayments();
        java.lang.String obj4 = (payments3 == null || (managePaymentsUrl = payments3.getManagePaymentsUrl()) == null) ? null : managePaymentsUrl.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Statements statements = revolvingCreditServicingContent.getStatements();
        java.lang.String obj5 = (statements == null || (viewStatementsUrl = statements.getViewStatementsUrl()) == null) ? null : viewStatementsUrl.toString();
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetLegacyWebViewServicingUrlsQuery.Notifications notifications = revolvingCreditServicingContent.getNotifications();
        if (notifications != null && (viewNotificationsUrl = notifications.getViewNotificationsUrl()) != null) {
            str = viewNotificationsUrl.toString();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.legacyservicing.ServicingUrls(obj, obj2, obj3, obj4, obj5, str);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError access$mapError(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.LegacyWebViewServicingUrlsRepositoryImpl legacyWebViewServicingUrlsRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.NetworkError(((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError).toString());
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.LegacyWebViewServicingUrlError.GraphQLError(((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9578firstOrNullimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY())).getMessage());
    }
}
