package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u000f2\u0006\u0010\u000e\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/FinancialActivityRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/FinancialActivityRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/FinancialActivitiesRequestError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/FinancialActivitiesRequestError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/activities/FinancialActivitiesOverview;", "getActivitiesOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/activities/FinancialActivitiesPage;", "getActivitiesPage", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/activities/ActivitiesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/apollographql/apollo/ApolloClient;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinancialActivityRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository {
    public static final int INITIAL_OFFSET = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public FinancialActivityRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.getHighResolutionOutputSizeshNQ4ISI = apolloClient;
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (partialErrorHandler != null && partialErrorHandler.containsAny("revolvingCreditActivities", "revolvingCreditPayments")) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.PartialError.INSTANCE;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.Default.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository
    public final java.lang.Object getActivitiesOverview(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview>> continuation) {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchDataHandlingPartialErrors$default(this, this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(activitiesOverviewRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(activitiesOverviewRequest.getCreditAccountId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(kotlin.coroutines.jvm.internal.Boxing.boxInt(0))), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$q7na_9Gd1XaSsZLRThzeeXSslak((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$SWmjs4jdLt6F3CKUIWoVb7r1xp0(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj);
            }
        }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$NYai9zTJontZQCQV_OpSowyN7o4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data) obj3);
            }
        }, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$yIazkWiWKOA5TfVebwU8e7ljIpg(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation, 16, null);
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository
    public final java.lang.Object getActivitiesPage(final com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage>> continuation) {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchDataHandlingPartialErrors$default(this, this.getHighResolutionOutputSizeshNQ4ISI, new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(activitiesRequest.getCreditProductIdentifier()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(activitiesRequest.getCreditAccountId()), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(kotlin.coroutines.jvm.internal.Boxing.boxInt(activitiesRequest.getOffset()))), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$tMpBpFKLjRyDHUkJJD99KMsEV5Q(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.m18035$r8$lambda$sY56wWnxu0u2NJNsS2vk77G2QU(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj);
            }
        }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$JKzD8Nl8rtN8CXLB0ZytSq5O3fQ(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest.this, this, (com.paypal.oslo.core.network.graphql.error.CallError) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data) obj3);
            }
        }, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl.$r8$lambda$YGOcMOFictSvIZdjVhdYqo3D0aE(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation, 16, null);
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$JKzD8Nl8rtN8CXLB0ZytSq5O3fQ(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl financialActivityRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage;
        arrow.core.Ior rightIor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorHandler, "");
        return (data == null || (financialActivityPage = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage(data, activitiesRequest.getOffset(), partialErrorHandler.contains("revolvingCreditActivities"))) == null || (rightIor = arrow.core.IorKt.rightIor(financialActivityPage)) == null) ? arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRangesFor(callError, partialErrorHandler)) : rightIor;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$NYai9zTJontZQCQV_OpSowyN7o4(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl financialActivityRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview financialActivitiesOverview;
        arrow.core.Ior rightIor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorHandler, "");
        return (data == null || (financialActivitiesOverview = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivitiesOverviewMapperKt.toFinancialActivitiesOverview(data, 0, partialErrorHandler.contains("revolvingCreditPayments"), partialErrorHandler.contains("revolvingCreditActivities"))) == null || (rightIor = arrow.core.IorKt.rightIor(financialActivitiesOverview)) == null) ? arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRangesFor(callError, null)) : rightIor;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$SWmjs4jdLt6F3CKUIWoVb7r1xp0(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl financialActivityRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRangesFor(callError, null));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YGOcMOFictSvIZdjVhdYqo3D0aE(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(activitiesRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$q7na_9Gd1XaSsZLRThzeeXSslak(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesOverviewQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.activities.FinancialActivitiesOverview financialActivitiesOverview$default;
        arrow.core.Ior rightIor;
        return (data == null || (financialActivitiesOverview$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivitiesOverviewMapperKt.toFinancialActivitiesOverview$default(data, 0, false, false, 6, null)) == null || (rightIor = arrow.core.IorKt.rightIor(financialActivitiesOverview$default)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.Default.INSTANCE) : rightIor;
    }

    /* renamed from: $r8$lambda$sY56wWnxu0u2NJNsS2vk77G2-QU, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m18035$r8$lambda$sY56wWnxu0u2NJNsS2vk77G2QU(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl financialActivityRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return arrow.core.IorKt.leftIor(getHighSpeedVideoFpsRangesFor(callError, null));
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$tMpBpFKLjRyDHUkJJD99KMsEV5Q(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesRequest activitiesRequest, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditActivitiesQuery.Data data) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.activities.FinancialActivitiesPage financialActivityPage$default;
        arrow.core.Ior rightIor;
        return (data == null || (financialActivityPage$default = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.activity.FinancialActivityPageMapperKt.toFinancialActivityPage$default(data, activitiesRequest.getOffset(), false, 2, (java.lang.Object) null)) == null || (rightIor = arrow.core.IorKt.rightIor(financialActivityPage$default)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.FinancialActivitiesRequestError.Default.INSTANCE) : rightIor;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yIazkWiWKOA5TfVebwU8e7ljIpg(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.activities.ActivitiesOverviewRequest activitiesOverviewRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(activitiesOverviewRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }
}
