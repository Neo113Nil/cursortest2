package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/businesseshub/data/repository/BusinessesHubRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesHubRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesWithIncentives;", "getLinkedBusinesses", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "Larrow/core/Ior;", "getHighSpeedVideoSizes", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscriptionsError", "graphQLData", "handlePartialData$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Lcom/paypal/oslo/feature/subscriptions/businesseshub/domain/repository/BusinessesWithIncentives;)Larrow/core/Ior;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BusinessesHubRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BusinessesHubRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesHubRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getLinkedBusinesses(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives>> continuation) {
        com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getLinkedBusinesses$1 businessesHubRepositoryImpl$getLinkedBusinesses$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getLinkedBusinesses$1) {
            businessesHubRepositoryImpl$getLinkedBusinesses$1 = (com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getLinkedBusinesses$1) continuation;
            if ((businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighSpeedVideoFpsRanges = 1;
                    obj = getHighSpeedVideoSizes(null, businessesHubRepositoryImpl$getLinkedBusinesses$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((arrow.core.Ior) obj).toEither();
            }
        }
        businessesHubRepositoryImpl$getLinkedBusinesses$1 = new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getLinkedBusinesses$1(this, continuation);
        java.lang.Object obj2 = businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessesHubRepositoryImpl$getLinkedBusinesses$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return ((arrow.core.Ior) obj2).toEither();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives>> continuation) {
        com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1 businessesHubRepositoryImpl$getConsumerAgreements$1;
        int i;
        arrow.core.Ior ior;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1) {
            businessesHubRepositoryImpl$getConsumerAgreements$1 = (com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1) continuation;
            if ((businessesHubRepositoryImpl$getConsumerAgreements$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                businessesHubRepositoryImpl$getConsumerAgreements$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1 businessesHubRepositoryImpl$getConsumerAgreements$12 = businessesHubRepositoryImpl$getConsumerAgreements$1;
                java.lang.Object obj = businessesHubRepositoryImpl$getConsumerAgreements$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessesHubRepositoryImpl$getConsumerAgreements$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsInput consumerAgreementsInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus.ACTIVE)), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.VAULTED), null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2), 12, null);
                    com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput suggestedMerchantsInput = new com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput(com.paypal.oslo.feature.subscriptions.shared.data.mappers.SearchTypeMappersKt.toGraphQL(com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.ALL), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.VAULTED));
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(suggestedMerchantsInput), null, null, 6, null);
                    com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery getConsumerAgreementsBusinessesQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery(consumerAgreementsInput, consumerAgreementIncentivesInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl.m19780$r8$lambda$izaqDsfA4WVa89gHSUUTuon1R8((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Data) obj2);
                        }
                    };
                    businessesHubRepositoryImpl$getConsumerAgreements$12.Camera2StreamConfigurationMap = str2;
                    businessesHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementsInput);
                    businessesHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(suggestedMerchantsInput);
                    businessesHubRepositoryImpl$getConsumerAgreements$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementIncentivesInput);
                    businessesHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getConsumerAgreementsBusinessesQuery);
                    businessesHubRepositoryImpl$getConsumerAgreements$12.getOutputFormats = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getConsumerAgreementsBusinessesQuery, function1, null, null, businessesHubRepositoryImpl$getConsumerAgreements$12, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) businessesHubRepositoryImpl$getConsumerAgreements$12.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "Fetch consumer agreements businesses failed", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cursor", str2)), null, 20, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives businessesWithIncentives = (com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives) ((arrow.core.Ior.Right) ior).getValue();
                    if (businessesWithIncentives != null) {
                        return new arrow.core.Ior.Right(businessesWithIncentives);
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.BusinessesHub.DATA_NOT_FOUND, null, 5, null), "GraphQL response missing data", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE), null, null, null, 28, null));
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return handlePartialData$subscriptions_prodRelease((com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) both.getLeftValue(), (com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        businessesHubRepositoryImpl$getConsumerAgreements$1 = new com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1 businessesHubRepositoryImpl$getConsumerAgreements$122 = businessesHubRepositoryImpl$getConsumerAgreements$1;
        java.lang.Object obj2 = businessesHubRepositoryImpl$getConsumerAgreements$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessesHubRepositoryImpl$getConsumerAgreements$122.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives> handlePartialData$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError, com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsError, "");
        if (graphQLData != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Partial consumer agreements businesses data received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("itemCount", java.lang.String.valueOf(graphQLData.getBusinesses().size())), kotlin.TuplesKt.to("incentivesCount", java.lang.String.valueOf(graphQLData.getIncentivesCount()))), null, 4, null);
            return new arrow.core.Ior.Both(subscriptionsError, graphQLData);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "GraphQL error with no data available", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE), null, null, null, 28, null);
        return new arrow.core.Ior.Left(subscriptionsError);
    }

    /* renamed from: $r8$lambda$i-zaqDsfA4WVa89gHSUUTuon1R8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives m19780$r8$lambda$izaqDsfA4WVa89gHSUUTuon1R8(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.Data data) {
        java.lang.Integer totalCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.businesseshub.domain.LinkedBusinessAgreementItem> items = com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImplKt.toBusinessesPage(data.getConsumerAgreements().getPage()).getItems();
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsBusinessesQuery.ConsumerAgreementIncentives consumerAgreementIncentives = data.getConsumerAgreementIncentives();
        return new com.paypal.oslo.feature.subscriptions.businesseshub.domain.repository.BusinessesWithIncentives(items, (consumerAgreementIncentives == null || (totalCount = consumerAgreementIncentives.getTotalCount()) == null) ? 0 : totalCount.intValue());
    }
}
