package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\n\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\f*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AutopayRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AutopayRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "dynamicConfigManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverview;", "fetchAutopayOverview", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayResult;", "updateAutopay", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/UpdateAutopayRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/AutopayOverviewError;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutopayRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository {
    public static final int $stable = 8;
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AutopayRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager dynamicConfigManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigManager, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.getHighSpeedVideoSizes = dynamicConfigManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchAutopayOverview(final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest autopayOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1 autopayRepositoryImpl$fetchAutopayOverview$1;
        int i;
        arrow.core.Ior ior;
        arrow.core.Ior rightIor;
        arrow.core.Ior rightIor2;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1) {
            autopayRepositoryImpl$fetchAutopayOverview$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1) continuation;
            if ((autopayRepositoryImpl$fetchAutopayOverview$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                autopayRepositoryImpl$fetchAutopayOverview$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1 autopayRepositoryImpl$fetchAutopayOverview$12 = autopayRepositoryImpl$fetchAutopayOverview$1;
                java.lang.Object obj = autopayRepositoryImpl$fetchAutopayOverview$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayRepositoryImpl$fetchAutopayOverview$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoSizes.shouldRequestAppUpdate()) {
                        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError.UpdateNeeded.INSTANCE);
                    }
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery getRevolvingCreditAutopayOverviewQuery = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(autopayOverviewRequest.getCreditProductIdentifier()));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.$r8$lambda$xhSEM5fMBMGZ6KFUfFcFcOgiPFI(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.$r8$lambda$ON405dB3hiMPgGdUIKjT3QOj1e0((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data) obj2);
                        }
                    };
                    com.apollographql.apollo.cache.normalized.FetchPolicy fetchPolicy = com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst;
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope, kotlin.Unit> function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.$r8$lambda$rmT4hRI1lIRmTHrqWy4VNI3uvP4(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    autopayRepositoryImpl$fetchAutopayOverview$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autopayOverviewRequest);
                    autopayRepositoryImpl$fetchAutopayOverview$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getRevolvingCreditAutopayOverviewQuery);
                    autopayRepositoryImpl$fetchAutopayOverview$12.getHighSpeedVideoFpsRanges = 1;
                    obj = fetchData(this.getHighSpeedVideoFpsRanges, getRevolvingCreditAutopayOverviewQuery, function1, function12, fetchPolicy, function13, autopayRepositoryImpl$fetchAutopayOverview$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError) ((arrow.core.Ior.Left) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) ((arrow.core.Ior.Right) ior).getValue();
                    return (autopayOverview == null || (rightIor2 = arrow.core.IorKt.rightIor(autopayOverview)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError.Default.INSTANCE) : rightIor2;
                }
                if (!(ior instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                java.lang.Object leftValue = both.getLeftValue();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview autopayOverview2 = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview) both.getRightValue();
                return (autopayOverview2 == null || (rightIor = arrow.core.IorKt.rightIor(autopayOverview2)) == null) ? arrow.core.IorKt.leftIor((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError) leftValue) : rightIor;
            }
        }
        autopayRepositoryImpl$fetchAutopayOverview$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$fetchAutopayOverview$1 autopayRepositoryImpl$fetchAutopayOverview$122 = autopayRepositoryImpl$fetchAutopayOverview$1;
        java.lang.Object obj2 = autopayRepositoryImpl$fetchAutopayOverview$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayRepositoryImpl$fetchAutopayOverview$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AutopayRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAutopay(final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult>> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1 autopayRepositoryImpl$updateAutopay$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1) {
            autopayRepositoryImpl$updateAutopay$1 = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1) continuation;
            if ((autopayRepositoryImpl$updateAutopay$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                autopayRepositoryImpl$updateAutopay$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1 autopayRepositoryImpl$updateAutopay$12 = autopayRepositoryImpl$updateAutopay$1;
                java.lang.Object obj = autopayRepositoryImpl$updateAutopay$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = autopayRepositoryImpl$updateAutopay$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation updateRevolvingCreditAutopayMutation = new com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation(com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.UpdateAutopayMapperKt.toGraphQLInput(updateAutopayRequest));
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.m18029$r8$lambda$zWA_nomnd4qYT3SWkbAjneyiE(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.$r8$lambda$TX3rHAYlksNWUErkTvpg5ndkVxs((com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl.$r8$lambda$7dyYinGO_zcK_A6zfO3Jwp3SukU(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj2);
                        }
                    };
                    autopayRepositoryImpl$updateAutopay$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateAutopayRequest);
                    autopayRepositoryImpl$updateAutopay$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateRevolvingCreditAutopayMutation);
                    autopayRepositoryImpl$updateAutopay$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.executeMutation$default(this, this.getHighSpeedVideoFpsRanges, updateRevolvingCreditAutopayMutation, function1, function12, null, function13, autopayRepositoryImpl$updateAutopay$12, 8, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = ((arrow.core.Ior) obj).toEither();
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult updateAutopayResult = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult) ((arrow.core.Either.Right) either).getValue();
                    return updateAutopayResult != null ? new arrow.core.Ior.Right(updateAutopayResult) : new arrow.core.Ior.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError.Default.INSTANCE);
                }
                if (either instanceof arrow.core.Either.Left) {
                    return new arrow.core.Ior.Left((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError) ((arrow.core.Either.Left) either).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        autopayRepositoryImpl$updateAutopay$1 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1(this, continuation);
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl$updateAutopay$1 autopayRepositoryImpl$updateAutopay$122 = autopayRepositoryImpl$updateAutopay$1;
        java.lang.Object obj2 = autopayRepositoryImpl$updateAutopay$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = autopayRepositoryImpl$updateAutopay$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = ((arrow.core.Ior) obj2).toEither();
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError.Default.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7dyYinGO_zcK_A6zfO3Jwp3SukU(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayRequest updateAutopayRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(updateAutopayRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverview $r8$lambda$ON405dB3hiMPgGdUIKjT3QOj1e0(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetRevolvingCreditAutopayOverviewQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.AutopayOverviewMapperKt.toAutopayOverview(data);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.UpdateAutopayResult $r8$lambda$TX3rHAYlksNWUErkTvpg5ndkVxs(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditAutopayMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.autopay.UpdateAutopayMapperKt.toUpdateAutopayResult(data);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rmT4hRI1lIRmTHrqWy4VNI3uvP4(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewRequest autopayOverviewRequest, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(autopayOverviewRequest.getCreditProductIdentifier());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError $r8$lambda$xhSEM5fMBMGZ6KFUfFcFcOgiPFI(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl autopayRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoFpsRangesFor(callError);
    }

    /* renamed from: $r8$lambda$zWA_nomnd4qYT-3-SWkbAjneyiE, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.AutopayOverviewError m18029$r8$lambda$zWA_nomnd4qYT3SWkbAjneyiE(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AutopayRepositoryImpl autopayRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return getHighSpeedVideoFpsRangesFor(callError);
    }
}
