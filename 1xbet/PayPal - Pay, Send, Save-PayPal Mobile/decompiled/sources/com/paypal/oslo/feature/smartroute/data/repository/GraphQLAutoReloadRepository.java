package com.paypal.oslo.feature.smartroute.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/data/repository/GraphQLAutoReloadRepository;", "Lcom/paypal/oslo/feature/smartroute/domain/repository/AutoReloadRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupDetails;", "getSetupDetails", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupRequest;", "request", "", "setupAutoReload", "(Lcom/paypal/oslo/feature/smartroute/domain/model/AutoReloadSetupRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "balanceId", "deactivateAutoReload", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphQLAutoReloadRepository implements com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GraphQLAutoReloadRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getSetupDetails(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError, com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1 graphQLAutoReloadRepository$getSetupDetails$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1) {
            graphQLAutoReloadRepository$getSetupDetails$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1) continuation;
            if ((graphQLAutoReloadRepository$getSetupDetails$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                graphQLAutoReloadRepository$getSetupDetails$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1 graphQLAutoReloadRepository$getSetupDetails$12 = graphQLAutoReloadRepository$getSetupDetails$1;
                java.lang.Object obj = graphQLAutoReloadRepository$getSetupDetails$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLAutoReloadRepository$getSetupDetails$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery getSmartRouteSavingsAutoReloadSetupDetailsQuery = new com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery();
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2 graphQLAutoReloadRepository$getSetupDetails$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$2(this, getSmartRouteSavingsAutoReloadSetupDetailsQuery, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.$r8$lambda$6j8X2yqQmKxwoP7Jxz79olSvE1k((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.$r8$lambda$eiFOb_fiqVpA1eZL2bnDeF9SlLQ((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLAutoReloadRepository$getSetupDetails$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getSmartRouteSavingsAutoReloadSetupDetailsQuery);
                    graphQLAutoReloadRepository$getSetupDetails$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation$default("Get auto-reload setup details", graphQLAutoReloadRepository$getSetupDetails$2, function1, null, null, function12, graphQLAutoReloadRepository$getSetupDetails$12, 24, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.GET_AUTO_RELOAD_DETAILS, "query", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$5$1.getHighSpeedVideoSizes);
                return obj;
            }
        }
        graphQLAutoReloadRepository$getSetupDetails$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$1 graphQLAutoReloadRepository$getSetupDetails$122 = graphQLAutoReloadRepository$getSetupDetails$1;
        java.lang.Object obj2 = graphQLAutoReloadRepository$getSetupDetails$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLAutoReloadRepository$getSetupDetails$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.GET_AUTO_RELOAD_DETAILS, "query", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$getSetupDetails$5$1.getHighSpeedVideoSizes);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setupAutoReload(com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupRequest autoReloadSetupRequest, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1 graphQLAutoReloadRepository$setupAutoReload$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1) {
            graphQLAutoReloadRepository$setupAutoReload$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1) continuation;
            if ((graphQLAutoReloadRepository$setupAutoReload$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                graphQLAutoReloadRepository$setupAutoReload$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1 graphQLAutoReloadRepository$setupAutoReload$12 = graphQLAutoReloadRepository$setupAutoReload$1;
                java.lang.Object obj = graphQLAutoReloadRepository$setupAutoReload$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLAutoReloadRepository$setupAutoReload$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.SetupLowBalanceAutoReloadMutation setupLowBalanceAutoReloadMutation = new com.paypal.oslo.feature.smartroute.graphql.SetupLowBalanceAutoReloadMutation(new com.paypal.oslo.api.graphql.schema.type.CreateBalanceAutoReloadInput(autoReloadSetupRequest.getBalanceId(), com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD, new com.paypal.oslo.api.graphql.schema.type.MoneyInput(autoReloadSetupRequest.getCurrencyCode(), autoReloadSetupRequest.getReloadAmount()), autoReloadSetupRequest.getFinancialInstrumentId(), com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(autoReloadSetupRequest.getCurrencyCode(), autoReloadSetupRequest.getThresholdAmount())), null, null, null, null, null, 992, null));
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$2 graphQLAutoReloadRepository$setupAutoReload$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$2(this, setupLowBalanceAutoReloadMutation, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.$r8$lambda$9RQObKnjXHMRRXszUlJA2XZdLfc((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.$r8$lambda$2AJtbX5A_ileFUusvOFt7XyQM7E((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLAutoReloadRepository$setupAutoReload$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(autoReloadSetupRequest);
                    graphQLAutoReloadRepository$setupAutoReload$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(setupLowBalanceAutoReloadMutation);
                    graphQLAutoReloadRepository$setupAutoReload$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation("Setup auto-reload", graphQLAutoReloadRepository$setupAutoReload$2, function1, "Mutation failed or returned null", "Partial success with mutation failure", function12, graphQLAutoReloadRepository$setupAutoReload$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.SETUP_AUTO_RELOAD, "mutation", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$5$1.getHighSpeedVideoFpsRangesFor);
                return obj;
            }
        }
        graphQLAutoReloadRepository$setupAutoReload$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$1 graphQLAutoReloadRepository$setupAutoReload$122 = graphQLAutoReloadRepository$setupAutoReload$1;
        java.lang.Object obj2 = graphQLAutoReloadRepository$setupAutoReload$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLAutoReloadRepository$setupAutoReload$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.SETUP_AUTO_RELOAD, "mutation", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$setupAutoReload$5$1.getHighSpeedVideoFpsRangesFor);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.AutoReloadRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deactivateAutoReload(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1 graphQLAutoReloadRepository$deactivateAutoReload$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1) {
            graphQLAutoReloadRepository$deactivateAutoReload$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1) continuation;
            if ((graphQLAutoReloadRepository$deactivateAutoReload$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                graphQLAutoReloadRepository$deactivateAutoReload$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1 graphQLAutoReloadRepository$deactivateAutoReload$12 = graphQLAutoReloadRepository$deactivateAutoReload$1;
                java.lang.Object obj = graphQLAutoReloadRepository$deactivateAutoReload$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLAutoReloadRepository$deactivateAutoReload$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.DeactivateAutoReloadMutation deactivateAutoReloadMutation = new com.paypal.oslo.feature.smartroute.graphql.DeactivateAutoReloadMutation(new com.paypal.oslo.api.graphql.schema.type.DisableBalanceAutoReloadInput(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD));
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$2 graphQLAutoReloadRepository$deactivateAutoReload$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$2(this, deactivateAutoReloadMutation, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.$r8$lambda$3m1oksKVWvxXeQ9uVRsYYkjv_S0((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository.m19673$r8$lambda$qzQlPoEpQRLbI9wI8qYEgbI3z0((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLAutoReloadRepository$deactivateAutoReload$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    graphQLAutoReloadRepository$deactivateAutoReload$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deactivateAutoReloadMutation);
                    graphQLAutoReloadRepository$deactivateAutoReload$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation("Deactivate auto-reload", graphQLAutoReloadRepository$deactivateAutoReload$2, function1, "Mutation failed or returned null", "Partial success with mutation failure", function12, graphQLAutoReloadRepository$deactivateAutoReload$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.DEACTIVATE_AUTO_RELOAD, "mutation", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$5$1.Camera2StreamConfigurationMap);
                return obj;
            }
        }
        graphQLAutoReloadRepository$deactivateAutoReload$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$1 graphQLAutoReloadRepository$deactivateAutoReload$122 = graphQLAutoReloadRepository$deactivateAutoReload$1;
        java.lang.Object obj2 = graphQLAutoReloadRepository$deactivateAutoReload$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLAutoReloadRepository$deactivateAutoReload$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.DEACTIVATE_AUTO_RELOAD, "mutation", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLAutoReloadRepository$deactivateAutoReload$5$1.Camera2StreamConfigurationMap);
        return obj2;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2AJtbX5A_ileFUusvOFt7XyQM7E(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.smartroute.graphql.SetupLowBalanceAutoReloadMutation.CreateBalanceAutoReload createBalanceAutoReload;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.SetupLowBalanceAutoReloadMutation.Data data = (com.paypal.oslo.feature.smartroute.graphql.SetupLowBalanceAutoReloadMutation.Data) graphQLData.getData();
        if (data == null || (createBalanceAutoReload = data.getCreateBalanceAutoReload()) == null || !createBalanceAutoReload.getSuccess()) {
            return null;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.DeactivateError $r8$lambda$3m1oksKVWvxXeQ9uVRsYYkjv_S0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.DeactivateError(str);
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.FetchError $r8$lambda$6j8X2yqQmKxwoP7Jxz79olSvE1k(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.FetchError(str);
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.SetupError $r8$lambda$9RQObKnjXHMRRXszUlJA2XZdLfc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.AutoReloadError.SetupError(str);
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.AutoReloadSetupDetails $r8$lambda$eiFOb_fiqVpA1eZL2bnDeF9SlLQ(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data data = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRouteSavingsAutoReloadSetupDetailsQuery.Data) graphQLData.getData();
        if (data != null) {
            return com.paypal.oslo.feature.smartroute.data.mapper.AutoReloadMapperKt.toAutoReloadSetupDetails(data);
        }
        return null;
    }

    /* renamed from: $r8$lambda$qzQlPoEpQRLbI9wI8qYEgbI-3z0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19673$r8$lambda$qzQlPoEpQRLbI9wI8qYEgbI3z0(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.smartroute.graphql.DeactivateAutoReloadMutation.DisableBalanceAutoReload disableBalanceAutoReload;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.DeactivateAutoReloadMutation.Data data = (com.paypal.oslo.feature.smartroute.graphql.DeactivateAutoReloadMutation.Data) graphQLData.getData();
        if (data == null || (disableBalanceAutoReload = data.getDisableBalanceAutoReload()) == null || !disableBalanceAutoReload.getSuccess()) {
            return null;
        }
        return kotlin.Unit.INSTANCE;
    }
}
