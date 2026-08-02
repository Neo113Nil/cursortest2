package com.paypal.oslo.feature.bnplacquisition.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/repository/ExperienceSessionRepositoryImpl;", "Lcom/paypal/oslo/feature/bnplacquisition/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/repository/ExperienceSessionRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/error/BNPLError;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/ExperienceSession;", "createExperienceSessionId", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/ExperienceSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ldagger/Lazy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExperienceSessionRepositoryImpl extends com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository implements com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository {
    public static final java.lang.String FLOW_ATTRIBUTE_PREFIX = "USAGE_CHANNEL_";
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;
    public static final int $stable = 8;

    @javax.inject.Inject
    public ExperienceSessionRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @Override // com.paypal.oslo.feature.bnplacquisition.domain.repository.ExperienceSessionRepository
    public final java.lang.Object createExperienceSessionId(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.ExperienceSessionRequest experienceSessionRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.bnplacquisition.domain.model.error.BNPLError, com.paypal.oslo.feature.bnplacquisition.domain.model.common.ExperienceSession>> continuation) {
        com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier safeValueOf = com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowSpecifier.INSTANCE.safeValueOf(experienceSessionRequest.getFlowSpecifier().name());
        com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel creditFlowContextChannel = com.paypal.oslo.api.graphql.schema.type.CreditFlowContextChannel.MOBILE_APP;
        com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation createBnplApplicationSessionMutation = new com.paypal.oslo.feature.bnplacquisition.graphql.CreateBnplApplicationSessionMutation(new com.paypal.oslo.api.graphql.schema.type.CreateBNPLApplicationSessionInput(new com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowContextInput(new com.apollographql.apollo.api.Optional.Present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowAttribute.INSTANCE.safeValueOf(FLOW_ATTRIBUTE_PREFIX.concat(java.lang.String.valueOf(experienceSessionRequest.getUsageChannel()))))), creditFlowContextChannel, safeValueOf, new com.apollographql.apollo.api.Optional.Present(com.paypal.oslo.api.graphql.schema.type.BNPLAcquisitionFlowOutcome.INSTANCE.safeValueOf(experienceSessionRequest.getFlowOutcome().name()))), null, 2, null));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.bnplacquisition.data.repository.BaseRepository.fetchData$default(this, apolloClient, createBnplApplicationSessionMutation, com.paypal.oslo.feature.bnplacquisition.data.repository.ExperienceSessionRepositoryImpl$createExperienceSessionId$2.getHighSpeedVideoFpsRangesFor, (com.apollographql.apollo.cache.normalized.FetchPolicy) null, (com.paypal.oslo.core.network.graphql.CallConfig) null, continuation, 12, (java.lang.Object) null);
    }
}
