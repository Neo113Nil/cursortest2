package com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/data/repository/PrepareDigitizationDataRepositoryImpl;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/repository/PrepareDigitizationDataRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationResponse;", "fetchDigitizationData", "(Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DebitDigitizationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PrepareDigitizationDataRepositoryImpl extends com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PrepareDigitizationDataRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }

    @Override // com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository
    public final java.lang.Object fetchDigitizationData(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationRequest debitDigitizationRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DebitDigitizationResponse>> continuation) {
        com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation createDebitInstrumentDigitizationDataMutation = new com.paypal.oslo.feature.debitcard.graphql.CreateDebitInstrumentDigitizationDataMutation(com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.getDebitDigitizationRequestMapper().invoke(debitDigitizationRequest));
        com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
        return com.paypal.oslo.feature.debitcard.shared.data.repository.BaseRepository.executeMutation$default(this, apolloClient, createDebitInstrumentDigitizationDataMutation, com.paypal.oslo.feature.debitcard.pushprovisioning.data.mapper.DebitDigitizationMapperKt.getDigitizationResponseMapper(), null, null, null, null, com.paypal.oslo.core.network.graphql.RiskSourceId.DebitCard.INSTANCE.getCreateDebitInstrumentDigitizationData(), continuation, 60, null);
    }
}
