package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0011\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/PrequalifiedAmountRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/PrequalificationSummaryRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "creditProductIdentifiers", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationSummary;", "getPrequalificationSummary", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/prequalifiedamount/PrequalificationAmount;", "getPrequalificationAmount", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PrequalifiedAmountRepositoryImpl extends com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PrequalifiedAmountRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository
    public final java.lang.Object getPrequalificationSummary(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationSummary>> continuation) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery getBnplPrequalificationSummaryQuery = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationSummaryQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.toPrequalificationSummaryInput(list));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, getBnplPrequalificationSummaryQuery, com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationSummary$2.Camera2StreamConfigurationMap, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository
    public final java.lang.Object getPrequalificationAmount(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.prequalifiedamount.PrequalificationAmount>> continuation) {
        com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery getBnplPrequalificationAmountQuery = new com.paypal.oslo.feature.bnplservicing.graphql.GetBnplPrequalificationAmountQuery(com.paypal.oslo.feature.bnplservicing.data.mapper.prequal.PrequalifiedAmountMapperKt.toPrequalificationSummaryInput(list));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, getBnplPrequalificationAmountQuery, com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl$getPrequalificationAmount$2.getHighSpeedVideoSizes, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED), continuation, 4, (java.lang.Object) null);
    }
}
