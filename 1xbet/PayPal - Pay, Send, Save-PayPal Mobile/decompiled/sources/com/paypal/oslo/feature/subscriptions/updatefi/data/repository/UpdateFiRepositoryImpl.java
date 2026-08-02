package com.paypal.oslo.feature.subscriptions.updatefi.data.repository;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/data/repository/UpdateFiRepositoryImpl;", "Lcom/paypal/oslo/feature/subscriptions/shared/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/repository/UpdateFiRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "", "", "agreementIds", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "agreementType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/ConsumerAgreementFundingInstruments;", "getFundingInstruments", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fundingInstrumentId", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;", "balancePreference", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/BulkUpdateFiResult;", "updatePreferredFundingInstrument", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/domain/BalancePreference;Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpdateFiRepositoryImpl extends com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository implements com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public UpdateFiRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getFundingInstruments(java.util.List<java.lang.String> list, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments>> continuation) {
        com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1 updateFiRepositoryImpl$getFundingInstruments$1;
        int i;
        arrow.core.Ior ior;
        final java.util.List<java.lang.String> list2 = list;
        final com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2 = agreementType;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1) {
            updateFiRepositoryImpl$getFundingInstruments$1 = (com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1) continuation;
            if ((updateFiRepositoryImpl$getFundingInstruments$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                updateFiRepositoryImpl$getFundingInstruments$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1 updateFiRepositoryImpl$getFundingInstruments$12 = updateFiRepositoryImpl$getFundingInstruments$1;
                java.lang.Object obj = updateFiRepositoryImpl$getFundingInstruments$12.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateFiRepositoryImpl$getFundingInstruments$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery getConsumerAgreementFundingInstrumentsQuery = new com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery(new com.paypal.oslo.api.graphql.schema.type.ConsumerAgreementFundingInstrumentsInput(list2));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl.$r8$lambda$Ll7gNwRnFk8B_tYHomCjk2kcmz8(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.this, list2, (com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data) obj2);
                        }
                    };
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.Subscriptions.INSTANCE.getFundingInstruments(), null, 2, null));
                    updateFiRepositoryImpl$getFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI = list2;
                    updateFiRepositoryImpl$getFundingInstruments$12.getHighSpeedVideoFpsRanges = agreementType2;
                    updateFiRepositoryImpl$getFundingInstruments$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getConsumerAgreementFundingInstrumentsQuery);
                    updateFiRepositoryImpl$getFundingInstruments$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.fetchData$default(this, apolloClient, getConsumerAgreementFundingInstrumentsQuery, function1, null, listOf, updateFiRepositoryImpl$getFundingInstruments$12, 4, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType3 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) updateFiRepositoryImpl$getFundingInstruments$12.getHighSpeedVideoFpsRanges;
                    java.util.List<java.lang.String> list3 = (java.util.List) updateFiRepositoryImpl$getFundingInstruments$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    agreementType2 = agreementType3;
                    list2 = list3;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "Fetch consumer agreement funding instruments failed", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementIds", list2)), null, 20, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments = (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments) ((arrow.core.Ior.Right) ior).getValue();
                    if (consumerAgreementFundingInstruments != null) {
                        return new arrow.core.Ior.Right(consumerAgreementFundingInstruments);
                    }
                    return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.UpdateFi.FUNDING_INSTRUMENTS_NOT_FOUND, null, 5, null), "GraphQL response missing funding instruments data", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementIds", list2)), null, 20, null));
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments consumerAgreementFundingInstruments2 = (com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments) both.getRightValue();
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError2 = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) leftValue;
                if (consumerAgreementFundingInstruments2 != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Partial funding instruments data received", null, null, 6, null);
                    return new arrow.core.Ior.Both(subscriptionsError2, consumerAgreementFundingInstruments2);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError2, "GraphQL error with no data available in getting FundingInstruments", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, null, null, 28, null);
                return new arrow.core.Ior.Left(subscriptionsError2);
            }
        }
        updateFiRepositoryImpl$getFundingInstruments$1 = new com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$getFundingInstruments$1 updateFiRepositoryImpl$getFundingInstruments$122 = updateFiRepositoryImpl$getFundingInstruments$1;
        java.lang.Object obj2 = updateFiRepositoryImpl$getFundingInstruments$122.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateFiRepositoryImpl$getFundingInstruments$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updatePreferredFundingInstrument(java.util.List<java.lang.String> list, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.domain.BalancePreference balancePreference, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult>> continuation) {
        com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1 updateFiRepositoryImpl$updatePreferredFundingInstrument$1;
        int i;
        java.lang.Object obj;
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType2;
        arrow.core.Ior ior;
        java.util.List<java.lang.String> list2 = list;
        java.lang.String str2 = str;
        if (continuation instanceof com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1) {
            updateFiRepositoryImpl$updatePreferredFundingInstrument$1 = (com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1) continuation;
            if ((updateFiRepositoryImpl$updatePreferredFundingInstrument$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                updateFiRepositoryImpl$updatePreferredFundingInstrument$1.getOutputMinFrameDuration -= 2147483648;
                com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1 updateFiRepositoryImpl$updatePreferredFundingInstrument$12 = updateFiRepositoryImpl$updatePreferredFundingInstrument$1;
                java.lang.Object obj2 = updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation updatePreferredFundingInstrumentsMutation = new com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation(new com.paypal.oslo.api.graphql.schema.type.UpdatePreferredFundingInstrumentsInput(list2, str2, com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(balancePreference != null ? com.paypal.oslo.feature.subscriptions.updatefi.data.mapper.ConsumerAgreementFundingInstrumentsMapperKt.toGraphQL(balancePreference) : null)));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRanges.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl.$r8$lambda$tIpEpAVCrzczWM7GZT0gzm0xGVE((com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data) obj3);
                        }
                    };
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.core.network.graphql.IncludeClientMetadataIdHeader(com.paypal.oslo.core.network.graphql.RiskSourceId.Subscriptions.INSTANCE.getUpdateFundingInstrument(), null, 2, null));
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighSpeedVideoFpsRanges = list2;
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.Camera2StreamConfigurationMap = str2;
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(balancePreference);
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighResolutionOutputSizeshNQ4ISI = agreementType;
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updatePreferredFundingInstrumentsMutation);
                    updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getOutputMinFrameDuration = 1;
                    java.lang.Object executeMutation$default = com.paypal.oslo.feature.subscriptions.shared.data.repository.BaseRepository.executeMutation$default(this, apolloClient, updatePreferredFundingInstrumentsMutation, function1, null, listOf, updateFiRepositoryImpl$updatePreferredFundingInstrument$12, 4, null);
                    if (executeMutation$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = executeMutation$default;
                    agreementType2 = agreementType;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType3 = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighResolutionOutputSizeshNQ4ISI;
                    str2 = (java.lang.String) updateFiRepositoryImpl$updatePreferredFundingInstrument$12.Camera2StreamConfigurationMap;
                    java.util.List<java.lang.String> list3 = (java.util.List) updateFiRepositoryImpl$updatePreferredFundingInstrument$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj2);
                    agreementType2 = agreementType3;
                    list2 = list3;
                    obj = obj2;
                }
                ior = (arrow.core.Ior) obj;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (ior instanceof arrow.core.Ior.Right) {
                        com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult bulkUpdateFiResult = (com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult) ((arrow.core.Ior.Right) ior).getValue();
                        if (bulkUpdateFiResult != null) {
                            return new arrow.core.Ior.Right(bulkUpdateFiResult);
                        }
                        return new arrow.core.Ior.Left(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.UpdateFi.UPDATE_FI_NO_RESULTS, null, 5, null), "Update preferred funding instrument failed with no results", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementIds", list2)), null, 20, null));
                    }
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    java.lang.Object leftValue = both.getLeftValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult bulkUpdateFiResult2 = (com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult) both.getRightValue();
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) leftValue;
                    if (bulkUpdateFiResult2 != null) {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "Partial update success", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("successfulCount", java.lang.String.valueOf(bulkUpdateFiResult2.getSuccessfulAgreementIds().size())), kotlin.TuplesKt.to("failedCount", java.lang.String.valueOf(bulkUpdateFiResult2.getFailedAgreements().size()))), null, 4, null);
                        return new arrow.core.Ior.Both(subscriptionsError, bulkUpdateFiResult2);
                    }
                    com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError, "GraphQL error with no data available for update preferred funding instrument", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, null, null, 28, null);
                    return new arrow.core.Ior.Left(subscriptionsError);
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError2 = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError) ((arrow.core.Ior.Left) ior).getValue();
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(subscriptionsError2, "Update preferred funding instrument failed", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType2), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementIds", list2), kotlin.TuplesKt.to("fundingInstrumentId", str2)), null, 20, null);
                return new arrow.core.Ior.Left(subscriptionsError2);
            }
        }
        updateFiRepositoryImpl$updatePreferredFundingInstrument$1 = new com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1(this, continuation);
        com.paypal.oslo.feature.subscriptions.updatefi.data.repository.UpdateFiRepositoryImpl$updatePreferredFundingInstrument$1 updateFiRepositoryImpl$updatePreferredFundingInstrument$122 = updateFiRepositoryImpl$updatePreferredFundingInstrument$1;
        java.lang.Object obj22 = updateFiRepositoryImpl$updatePreferredFundingInstrument$122.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateFiRepositoryImpl$updatePreferredFundingInstrument$122.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj;
        if (ior instanceof arrow.core.Ior.Left) {
        }
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments $r8$lambda$Ll7gNwRnFk8B_tYHomCjk2kcmz8(com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, java.util.List list, com.paypal.oslo.feature.subscriptions.graphql.GetConsumerAgreementFundingInstrumentsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.subscriptions.updatefi.domain.model.ConsumerAgreementFundingInstruments domainFundingInstrument = com.paypal.oslo.feature.subscriptions.updatefi.data.mapper.ConsumerAgreementFundingInstrumentsMapperKt.toDomainFundingInstrument(data.getConsumerAgreementFundingInstruments());
        if (domainFundingInstrument.getFundingInstruments().isEmpty()) {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(null, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.UpdateFi.FUNDING_INSTRUMENTS_NOT_FOUND, null, 5, null), "No funding instruments found for agreement IDs", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("agreementIds", list)), null, 20, null);
        }
        return domainFundingInstrument;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult $r8$lambda$tIpEpAVCrzczWM7GZT0gzm0xGVE(com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.Data data) {
        java.util.LinkedHashMap linkedHashMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.UpdatePreferredFundingInstruments updatePreferredFundingInstruments = data.getUpdatePreferredFundingInstruments();
        java.util.List<java.lang.String> updatedConsumerAgreementIds = updatePreferredFundingInstruments.getUpdatedConsumerAgreementIds();
        if (updatedConsumerAgreementIds == null) {
            updatedConsumerAgreementIds = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> failedConsumerAgreements = updatePreferredFundingInstruments.getFailedConsumerAgreements();
        if (failedConsumerAgreements != null) {
            java.util.List<com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement> list = failedConsumerAgreements;
            linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (com.paypal.oslo.feature.subscriptions.graphql.UpdatePreferredFundingInstrumentsMutation.FailedConsumerAgreement failedConsumerAgreement : list) {
                kotlin.Pair pair = kotlin.TuplesKt.to(failedConsumerAgreement.getConsumerAgreementId(), failedConsumerAgreement.getReason().name());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            linkedHashMap = kotlin.collections.MapsKt.emptyMap();
        }
        if (updatedConsumerAgreementIds.isEmpty() && linkedHashMap.isEmpty()) {
            return null;
        }
        return new com.paypal.oslo.feature.subscriptions.shared.domain.model.BulkUpdateFiResult(updatedConsumerAgreementIds, linkedHashMap);
    }
}
