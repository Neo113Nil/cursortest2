package com.paypal.oslo.feature.subscriptions.hub.data.repository;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0014J-\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000e\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0015R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/hub/data/repository/SubscriptionsHubRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsHubRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsWithIncentives;", "getSubscriptions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p1", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Ljava/lang/String;)Larrow/core/Ior;", "(Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsWithIncentives;)Larrow/core/Ior;", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Lcom/paypal/oslo/feature/subscriptions/hub/domain/repository/SubscriptionsWithIncentives;)Larrow/core/Ior;", "Ldagger/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsHubRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public SubscriptionsHubRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoSizes = lazy;
    }

    @Override // com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsHubRepository
    public final java.lang.Object getSubscriptions(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives>> continuation) {
        return getHighSpeedVideoFpsRangesFor((java.lang.String) null, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives>> continuation) {
        com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1 subscriptionsHubRepositoryImpl$getConsumerAgreements$1;
        int i;
        arrow.core.Ior ior;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1) {
            subscriptionsHubRepositoryImpl$getConsumerAgreements$1 = (com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1) continuation;
            if ((subscriptionsHubRepositoryImpl$getConsumerAgreements$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                subscriptionsHubRepositoryImpl$getConsumerAgreements$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1 subscriptionsHubRepositoryImpl$getConsumerAgreements$12 = subscriptionsHubRepositoryImpl$getConsumerAgreements$1;
                java.lang.Object obj = subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsInput consumerAgreementsInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementsInput(com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementStatus.ACTIVE)), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.SUBSCRIPTION), null, null, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str2), 12, null);
                    com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput suggestedMerchantsInput = new com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput(com.paypal.oslo.feature.subscriptions.shared.data.mappers.SearchTypeMappersKt.toGraphQL(com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType.ALL), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.SUBSCRIPTION));
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(suggestedMerchantsInput), null, null, 6, null);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery getConsumerAgreementsQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery(consumerAgreementsInput, consumerAgreementIncentivesInput);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl.$r8$lambda$aNf49TnhvGGmugYh4aD2Fxvzxcs((com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Data) obj2);
                        }
                    };
                    subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoFpsRangesFor = str2;
                    subscriptionsHubRepositoryImpl$getConsumerAgreements$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementsInput);
                    subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(suggestedMerchantsInput);
                    subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementIncentivesInput);
                    subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getConsumerAgreementsQuery, function1, null, null, subscriptionsHubRepositoryImpl$getConsumerAgreements$12, 12, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (java.lang.String) subscriptionsHubRepositoryImpl$getConsumerAgreements$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return getHighSpeedVideoSizes((com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue(), str2);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return getHighSpeedVideoSizes((com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) both.getLeftValue(), (com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives) both.getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        subscriptionsHubRepositoryImpl$getConsumerAgreements$1 = new com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1 subscriptionsHubRepositoryImpl$getConsumerAgreements$122 = subscriptionsHubRepositoryImpl$getConsumerAgreements$1;
        java.lang.Object obj2 = subscriptionsHubRepositoryImpl$getConsumerAgreements$122.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscriptionsHubRepositoryImpl$getConsumerAgreements$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives> getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError p0, java.lang.String p1) {
        com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub hub = new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE);
        if (p1 == null) {
            p1 = "null";
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(p0, "Fetch consumer agreements failed", hub, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cursor", p1)), null, 20, null);
        return new arrow.core.Ior.Left(p0);
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives> getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives p0) {
        if (p0 != null) {
            return new arrow.core.Ior.Right(p0);
        }
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.SubscriptionsHub.DATA_NOT_FOUND, null, 5, null), "GraphQL response missing data", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE), null, null, null, 28, null));
    }

    private static arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError p0, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives p1) {
        if (p1 != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Partial consumer agreements data received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("itemCount", java.lang.String.valueOf(p1.getSubscriptions().size())), kotlin.TuplesKt.to("incentivesCount", java.lang.String.valueOf(p1.getIncentivesCount()))), null, 4, null);
            return new arrow.core.Ior.Both(p0, p1);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(p0, "GraphQL error with no data available", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE), null, null, null, 28, null);
        return new arrow.core.Ior.Left(p0);
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives $r8$lambda$aNf49TnhvGGmugYh4aD2Fxvzxcs(com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.Data data) {
        java.lang.Integer totalCount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.subscriptions.hub.domain.SubscriptionItem> items = com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImplKt.toSubscriptionsPage(data.getConsumerAgreements().getPage()).getItems();
        com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementsQuery.ConsumerAgreementIncentives consumerAgreementIncentives = data.getConsumerAgreementIncentives();
        return new com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives(items, (consumerAgreementIncentives == null || (totalCount = consumerAgreementIncentives.getTotalCount()) == null) ? 0 : totalCount.intValue());
    }
}
