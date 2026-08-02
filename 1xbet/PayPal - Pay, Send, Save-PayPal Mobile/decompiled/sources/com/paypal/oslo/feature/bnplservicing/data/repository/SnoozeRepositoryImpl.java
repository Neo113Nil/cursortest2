package com.paypal.oslo.feature.bnplservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n2\u0006\u0010\t\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/data/repository/SnoozeRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplservicing/domain/repository/SnoozeRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;", "input", "Larrow/core/Ior;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozePreContractOverview;", "createSnoozePreContract", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozePreContractInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozeEnrollInput;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", "enrollInSnooze", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/input/SnoozeEnrollInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SnoozeRepositoryImpl extends com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SnoozeRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository
    public final java.lang.Object createSnoozePreContract(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozePreContractInput snoozePreContractInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozePreContractOverview>> continuation) {
        com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation createSnoozePreContractMutation = new com.paypal.oslo.feature.bnplservicing.graphql.CreateSnoozePreContractMutation(com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozePreContractMapperKt.toGraphQLInput(snoozePreContractInput));
        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, createSnoozePreContractMutation, com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$createSnoozePreContract$2.getHighSpeedVideoFpsRanges, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN), continuation, 4, (java.lang.Object) null);
    }

    @Override // com.paypal.oslo.feature.bnplservicing.domain.repository.SnoozeRepository
    public final java.lang.Object enrollInSnooze(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.input.SnoozeEnrollInput snoozeEnrollInput, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError>, com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult>> continuation) {
        com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation enrollInBnplPlanProgramMutation = new com.paypal.oslo.feature.bnplservicing.graphql.EnrollInBnplPlanProgramMutation(com.paypal.oslo.feature.bnplservicing.data.mapper.snooze.SnoozeEnrollMapperKt.toGraphQLInput(snoozeEnrollInput));
        com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplservicing.data.repository.BaseRepository.fetchData$default(this, apolloClient, enrollInBnplPlanProgramMutation, com.paypal.oslo.feature.bnplservicing.data.repository.SnoozeRepositoryImpl$enrollInSnooze$2.getHighSpeedVideoFpsRangesFor, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, createCallConfig(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN), continuation, 4, (java.lang.Object) null);
    }
}
