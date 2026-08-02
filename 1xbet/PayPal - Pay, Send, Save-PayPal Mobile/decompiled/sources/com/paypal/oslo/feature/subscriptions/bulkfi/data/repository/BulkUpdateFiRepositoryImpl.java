package com.paypal.oslo.feature.subscriptions.bulkfi.data.repository;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJA\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/bulkfi/data/repository/BulkUpdateFiRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/repository/BulkUpdateFiRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/domain/model/BulkUpdateFiData;", "getConsumerAgreementsByFundingInstrument", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "graphQLData", "callError", "errorWithData$subscriptions_prodRelease", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Larrow/core/Ior;", "dataResponse$subscriptions_prodRelease", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Larrow/core/Ior;", "getHighSpeedVideoFpsRanges", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BulkUpdateFiRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository {
    public static final int $stable = 8;
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BulkUpdateFiRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.subscriptions.bulkfi.domain.repository.BulkUpdateFiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConsumerAgreementsByFundingInstrument(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData>>> continuation) {
        com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1) {
            bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 = (com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1) continuation;
            if ((bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12 = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1;
                java.lang.Object obj = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.SUBSCRIPTION;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.VAULTED;
                    }
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput consumerAgreementsByFundingInstrumentInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsByFundingInstrumentInput(companion.present(consumerAgreementType));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery getConsumerAgreementsByFundingInstrumentQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery(consumerAgreementsByFundingInstrumentInput);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl.m19745$r8$lambda$4YL4MgIrGaxbHcbbNlr2hNmHzE((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data) obj2);
                        }
                    };
                    bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.getHighResolutionOutputSizeshNQ4ISI = agreementType;
                    bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementsByFundingInstrumentInput);
                    bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getConsumerAgreementsByFundingInstrumentQuery, function1, null, null, bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    agreementType = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "Fetch consumer agreements by funding instrument failed", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi(agreementType), null, null, null, 28, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return dataResponse$subscriptions_prodRelease((java.util.List) ((arrow.core.Ior.Right) ior).getValue(), agreementType);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return errorWithData$subscriptions_prodRelease((java.util.List) both.getRightValue(), (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) both.getLeftValue(), agreementType);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 = new com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.bulkfi.data.repository.BulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1 bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$122 = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$1;
        java.lang.Object obj2 = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bulkUpdateFiRepositoryImpl$getConsumerAgreementsByFundingInstrument$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData>> errorWithData$subscriptions_prodRelease(java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData> graphQLData, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError callError, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (graphQLData != null) {
            return new arrow.core.Ior.Both(callError, graphQLData);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(callError, "Fetch consumer agreements by funding instrument failed errorWithData", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi(agreementType), null, null, null, 28, null);
        return new arrow.core.Ior.Left(callError);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData>> dataResponse$subscriptions_prodRelease(java.util.List<com.paypal.oslo.feature.subscriptions.bulkfi.domain.model.BulkUpdateFiData> graphQLData, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (graphQLData != null) {
            return new arrow.core.Ior.Right(graphQLData);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound dataNotFound = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BulkFi.DATA_NOT_FOUND, null, 5, null);
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(dataNotFound, "Fetch consumer agreements by funding instrument failed dataResponse", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi(agreementType), null, null, null, 28, null);
        return new arrow.core.Ior.Left(dataNotFound);
    }

    /* renamed from: $r8$lambda$4YL4MgIrGa-xbHcbbNlr2hNmHzE, reason: not valid java name */
    public static /* synthetic */ java.util.List m19745$r8$lambda$4YL4MgIrGaxbHcbbNlr2hNmHzE(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument> consumerAgreementsByFundingInstrument = data.getConsumerAgreementsByFundingInstrument();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(consumerAgreementsByFundingInstrument, 10));
        java.util.Iterator<T> it = consumerAgreementsByFundingInstrument.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.subscriptions.bulkfi.data.mapper.ConsumerAgreementsByFundingInstrumentMapperKt.toBulkUpdateFiData((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsByFundingInstrumentQuery.ConsumerAgreementsByFundingInstrument) it.next()));
        }
        return arrayList;
    }
}
