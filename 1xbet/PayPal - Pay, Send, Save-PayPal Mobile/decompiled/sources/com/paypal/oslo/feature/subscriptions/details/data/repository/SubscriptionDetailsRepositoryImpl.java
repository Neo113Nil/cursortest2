package com.paypal.oslo.feature.subscriptions.details.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/details/data/repository/SubscriptionDetailsRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/repository/SubscriptionDetailsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "id", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;", "getConsumerAgreement", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "graphQLData", "callError", "errorWithData$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Larrow/core/Ior;", "dataResponse$subscriptions_prodRelease", "(Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/details/domain/model/SubscriptionDetails;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Larrow/core/Ior;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionDetailsRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SubscriptionDetailsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.Camera2StreamConfigurationMap = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.subscriptions.details.domain.repository.SubscriptionDetailsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getConsumerAgreement(java.lang.String str, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails>> continuation) {
        com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1 subscriptionDetailsRepositoryImpl$getConsumerAgreement$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1) {
            subscriptionDetailsRepositoryImpl$getConsumerAgreement$1 = (com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1) continuation;
            if ((subscriptionDetailsRepositoryImpl$getConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                subscriptionDetailsRepositoryImpl$getConsumerAgreement$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1 subscriptionDetailsRepositoryImpl$getConsumerAgreement$12 = subscriptionDetailsRepositoryImpl$getConsumerAgreement$1;
                java.lang.Object obj = subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery getConsumerAgreementQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery(str);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl.$r8$lambda$IRKVodpKLNpt47OAXAxzWbF2PS8((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data) obj2);
                        }
                    };
                    subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighSpeedVideoFpsRanges = str;
                    subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighSpeedVideoSizes = agreementType;
                    subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getConsumerAgreementQuery, function1, null, null, subscriptionDetailsRepositoryImpl$getConsumerAgreement$12, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    agreementType = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighSpeedVideoSizes;
                    str = (java.lang.String) subscriptionDetailsRepositoryImpl$getConsumerAgreement$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "Fetch consumer agreement failed", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementId", str)), null, 20, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return dataResponse$subscriptions_prodRelease(str, (com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) ((arrow.core.Ior.Right) ior).getValue(), agreementType);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return errorWithData$subscriptions_prodRelease((com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails) both.getRightValue(), (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) both.getLeftValue(), agreementType);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        subscriptionDetailsRepositoryImpl$getConsumerAgreement$1 = new com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1 subscriptionDetailsRepositoryImpl$getConsumerAgreement$122 = subscriptionDetailsRepositoryImpl$getConsumerAgreement$1;
        java.lang.Object obj2 = subscriptionDetailsRepositoryImpl$getConsumerAgreement$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionDetailsRepositoryImpl$getConsumerAgreement$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails> errorWithData$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails graphQLData, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError callError, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (graphQLData != null) {
            return new arrow.core.Ior.Both(callError, graphQLData);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(callError, "Fetch consumer agreement error with no data available", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails(agreementType), null, null, null, 28, null);
        return new arrow.core.Ior.Left(callError);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails> dataResponse$subscriptions_prodRelease(java.lang.String id, com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails graphQLData, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (graphQLData != null) {
            return new arrow.core.Ior.Right(graphQLData);
        }
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionDetails.DATA_NOT_FOUND, null, 5, null), "GraphQL response missing consumer agreement data", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementId", id)), null, 20, null));
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.details.domain.model.SubscriptionDetails $r8$lambda$IRKVodpKLNpt47OAXAxzWbF2PS8(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImplKt.toSubscriptionDetails(data.getConsumerAgreement());
    }
}
