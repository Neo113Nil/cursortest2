package com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J<\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0014\u001a\u00020\b2\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!J5\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b$\u0010%J7\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\t\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\f2\b\u0010'\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/repository/LinkAgreementsRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/repository/LinkAgreementsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/SearchType;", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "", "searchText", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/domain/model/ConsumerAgreementMerchant;", "getAvailableMerchants", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/SearchType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;", "Lcom/paypal/oslo/feature/subscriptions/graphql/type/SuggestedMerchantsSearchType;", "p1", "p2", "p3", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lcom/paypal/oslo/api/graphql/schema/type/SuggestedMerchantsSearchType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getMerchantPage$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/graphql/GetSuggestedMerchantsQuery$ConsumerAgreementIncentives;)Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;", "page", "callError", "errorWithData$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;)Larrow/core/Ior;", "cursor", "merchantsPage", "dataResponse$subscriptions_prodRelease", "(Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/linkagreements/hub/data/model/MerchantsPage;)Larrow/core/Ior;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkAgreementsRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public LinkAgreementsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.repository.LinkAgreementsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAvailableMerchants(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.feature.subscriptions.shared.domain.model.SearchType searchType, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, ? extends java.util.List<com.paypal.oslo.feature.subscriptions.linkagreements.hub.domain.model.ConsumerAgreementMerchant>>> continuation) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1 linkAgreementsRepositoryImpl$getAvailableMerchants$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1) {
            linkAgreementsRepositoryImpl$getAvailableMerchants$1 = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1) continuation;
            if ((linkAgreementsRepositoryImpl$getAvailableMerchants$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                linkAgreementsRepositoryImpl$getAvailableMerchants$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1 linkAgreementsRepositoryImpl$getAvailableMerchants$12 = linkAgreementsRepositoryImpl$getAvailableMerchants$1;
                java.lang.Object obj = linkAgreementsRepositoryImpl$getAvailableMerchants$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAgreementsRepositoryImpl$getAvailableMerchants$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType graphQL = com.paypal.oslo.feature.subscriptions.shared.data.mappers.SearchTypeMappersKt.toGraphQL(searchType);
                    linkAgreementsRepositoryImpl$getAvailableMerchants$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(agreementType);
                    linkAgreementsRepositoryImpl$getAvailableMerchants$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchType);
                    linkAgreementsRepositoryImpl$getAvailableMerchants$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    linkAgreementsRepositoryImpl$getAvailableMerchants$12.getHighSpeedVideoSizes = 1;
                    obj = getHighSpeedVideoFpsRanges(agreementType, graphQL, str, null, linkAgreementsRepositoryImpl$getAvailableMerchants$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    if (both instanceof arrow.core.Ior.Right) {
                        both = new arrow.core.Ior.Right(((com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage) ((arrow.core.Ior.Right) both).getValue()).getItems());
                    } else {
                        if (!(both instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                        both = new arrow.core.Ior.Both(both2.getLeftValue(), ((com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage) both2.getRightValue()).getItems());
                    }
                }
                return both.toEither();
            }
        }
        linkAgreementsRepositoryImpl$getAvailableMerchants$1 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getAvailableMerchants$1 linkAgreementsRepositoryImpl$getAvailableMerchants$122 = linkAgreementsRepositoryImpl$getAvailableMerchants$1;
        java.lang.Object obj2 = linkAgreementsRepositoryImpl$getAvailableMerchants$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAgreementsRepositoryImpl$getAvailableMerchants$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        return both.toEither();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage>> continuation) {
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1;
        int i;
        com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType consumerAgreementType;
        char c;
        java.lang.Object fetchData$default;
        arrow.core.Ior ior;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2 = agreementType;
        com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType2 = suggestedMerchantsSearchType;
        java.lang.String str3 = str;
        java.lang.String str4 = str2;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1) {
            linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 = (com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1) continuation;
            if ((linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12 = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1;
                java.lang.Object obj = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str3);
                    com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(agreementType2, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.SUBSCRIPTION;
                    } else {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(agreementType2, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        consumerAgreementType = com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementType.VAULTED;
                    }
                    com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput suggestedMerchantsInput = new com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsInput(suggestedMerchantsSearchType2, presentIfNotNull, companion.present(consumerAgreementType));
                    com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput consumerAgreementIncentivesInput = new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementIncentivesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(suggestedMerchantsInput), com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(str4));
                    com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery getSuggestedMerchantsQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery(consumerAgreementIncentivesInput);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery getSuggestedMerchantsQuery2 = getSuggestedMerchantsQuery;
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl.$r8$lambda$JGKN7GkCxM43YBE_yeGM0PcG__s(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl.this, (com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data) obj2);
                        }
                    };
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoFpsRanges = agreementType2;
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoFpsRangesFor = suggestedMerchantsSearchType2;
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.Camera2StreamConfigurationMap = str3;
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoSizes = str4;
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(suggestedMerchantsInput);
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(consumerAgreementIncentivesInput);
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getSuggestedMerchantsQuery);
                    linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getOutputFormats = 1;
                    c = 1;
                    fetchData$default = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getSuggestedMerchantsQuery2, function1, null, null, linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12, 12, null);
                    if (fetchData$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.String str5 = (java.lang.String) linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoSizes;
                    java.lang.String str6 = (java.lang.String) linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.Camera2StreamConfigurationMap;
                    com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType suggestedMerchantsSearchType3 = (com.paypal.oslo.api.graphql.schema.type.SuggestedMerchantsSearchType) linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType3 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    fetchData$default = obj;
                    c = 1;
                    str4 = str5;
                    agreementType2 = agreementType3;
                    str3 = str6;
                    suggestedMerchantsSearchType2 = suggestedMerchantsSearchType3;
                }
                ior = (arrow.core.Ior) fetchData$default;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement linkAgreement = new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement(agreementType2);
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("agreementType", agreementType2.toString());
                    pairArr[c] = kotlin.TuplesKt.to(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, suggestedMerchantsSearchType2.toString());
                    if (str3 == null) {
                        str3 = "null";
                    }
                    pairArr[2] = kotlin.TuplesKt.to("searchText", str3);
                    if (str4 == null) {
                        str4 = "null";
                    }
                    pairArr[3] = kotlin.TuplesKt.to("cursor", str4);
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "Fetch consumer agreement incentives failed", linkAgreement, null, kotlin.collections.MapsKt.mapOf(pairArr), null, 20, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return dataResponse$subscriptions_prodRelease(agreementType2, str4, (com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage) ((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    return errorWithData$subscriptions_prodRelease((com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage) both.getRightValue(), (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) both.getLeftValue(), agreementType2);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 = new com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1 linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$122 = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$1;
        java.lang.Object obj2 = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$122.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = linkAgreementsRepositoryImpl$getConsumerAgreementIncentives$122.getOutputFormats;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) fetchData$default;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    public final com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage getMerchantPage$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.ConsumerAgreementIncentives data) {
        com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Page page;
        if (data == null || (page = data.getPage()) == null) {
            return null;
        }
        return com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImplKt.toMerchantsPage(page);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage> errorWithData$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage page, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError callError, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (page != null) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Partial consumer agreement incentives data received", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("itemCount", java.lang.String.valueOf(page.getItems().size())), kotlin.TuplesKt.to("hasNextPage", java.lang.String.valueOf(page.getHasNextPage()))), null, 4, null);
            return new arrow.core.Ior.Both(callError, page);
        }
        com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(callError, "GraphQL error with no data available", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement(agreementType), null, null, null, 28, null);
        return new arrow.core.Ior.Left(callError);
    }

    public final arrow.core.Ior<com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage> dataResponse$subscriptions_prodRelease(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.lang.String cursor, com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage merchantsPage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agreementType, "");
        if (merchantsPage != null) {
            return new arrow.core.Ior.Right(merchantsPage);
        }
        return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.LinkAgreements.DATA_NOT_FOUND, null, 5, null), "GraphQL response missing consumer agreement incentives data", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("cursor", cursor == null ? "null" : cursor)), null, 20, null));
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.model.MerchantsPage $r8$lambda$JGKN7GkCxM43YBE_yeGM0PcG__s(com.paypal.oslo.feature.subscriptions.linkagreements.hub.data.repository.LinkAgreementsRepositoryImpl linkAgreementsRepositoryImpl, com.paypal.oslo.feature.subscriptions.graphql.GetSuggestedMerchantsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return linkAgreementsRepositoryImpl.getMerchantPage$subscriptions_prodRelease(data.getConsumerAgreementIncentives());
    }
}
