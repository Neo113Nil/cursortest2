package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/PlanDetailsOverviewRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PlanDetailsOverviewRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "creditAccountId", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PlanDetailsOverview;", "getPlanDetailsOverview", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlanDetailsOverviewRepositoryImpl extends com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public PlanDetailsOverviewRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository
    public final java.lang.Object getPlanDetailsOverview(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PlanDetailsOverview>> continuation) {
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplServicingPlanOverviewQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanDetailsInputMapperKt.toBnplServicingPlanOverviewInput(str), com.paypal.oslo.feature.bnplservicing.data.mapper.plandetails.PlanDetailsInputMapperKt.toBnplAutopayFlowContextInput()), com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl$getPlanDetailsOverview$2.getHighSpeedVideoSizes, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }
}
