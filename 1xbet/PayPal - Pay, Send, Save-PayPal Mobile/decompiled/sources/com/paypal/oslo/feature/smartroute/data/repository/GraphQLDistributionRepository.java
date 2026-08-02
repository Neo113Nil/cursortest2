package com.paypal.oslo.feature.smartroute.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/data/repository/GraphQLDistributionRepository;", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Lcom/apollographql/apollo/ApolloClient;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "loadConfiguration", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "saveConfiguration", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCryptocurrencyPreferences", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GraphQLDistributionRepository implements com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GraphQLDistributionRepository(com.apollographql.apollo.ApolloClient apolloClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        this.Camera2StreamConfigurationMap = apolloClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object loadConfiguration(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1 graphQLDistributionRepository$loadConfiguration$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1) {
            graphQLDistributionRepository$loadConfiguration$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1) continuation;
            if ((graphQLDistributionRepository$loadConfiguration$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                graphQLDistributionRepository$loadConfiguration$1.Camera2StreamConfigurationMap -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1 graphQLDistributionRepository$loadConfiguration$12 = graphQLDistributionRepository$loadConfiguration$1;
                java.lang.Object obj = graphQLDistributionRepository$loadConfiguration$12.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLDistributionRepository$loadConfiguration$12.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery getSmartRoutePreferencesQuery = new com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery(new com.paypal.oslo.api.graphql.schema.type.SmartRoutePreferencesInput(com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getSMART_ROUTE_TYPE()), new com.paypal.oslo.api.graphql.schema.type.SavingsAccountFeaturesInput(com.apollographql.apollo.api.Optional.INSTANCE.present("US")), new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyPreferencesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceIntentInput(com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getCRYPTO_ASSET_SYMBOL(), com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getCRYPTO_PREFERENCE_TYPE())), null, 2, null), new com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadInput(com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getAUTO_RELOAD_SCHEDULE_TYPE()));
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$2 graphQLDistributionRepository$loadConfiguration$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$2(this, getSmartRoutePreferencesQuery, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.m19674$r8$lambda$CO86rC9WZvIiDhrQfIci8O36CI((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.m19675$r8$lambda$tDaFH7iwi2MWWFlSbC9z93hN8((com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLDistributionRepository$loadConfiguration$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getSmartRoutePreferencesQuery);
                    graphQLDistributionRepository$loadConfiguration$12.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation$default("Load distribution config", graphQLDistributionRepository$loadConfiguration$2, function1, null, null, function12, graphQLDistributionRepository$loadConfiguration$12, 24, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.GET_PREFERENCES, "query", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$5$1.getHighResolutionOutputSizeshNQ4ISI);
                return obj;
            }
        }
        graphQLDistributionRepository$loadConfiguration$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$1 graphQLDistributionRepository$loadConfiguration$122 = graphQLDistributionRepository$loadConfiguration$1;
        java.lang.Object obj2 = graphQLDistributionRepository$loadConfiguration$122.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLDistributionRepository$loadConfiguration$122.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.GET_PREFERENCES, "query", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$loadConfiguration$5$1.getHighResolutionOutputSizeshNQ4ISI);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveConfiguration(final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1 graphQLDistributionRepository$saveConfiguration$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1) {
            graphQLDistributionRepository$saveConfiguration$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1) continuation;
            if ((graphQLDistributionRepository$saveConfiguration$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                graphQLDistributionRepository$saveConfiguration$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1 graphQLDistributionRepository$saveConfiguration$12 = graphQLDistributionRepository$saveConfiguration$1;
                java.lang.Object obj = graphQLDistributionRepository$saveConfiguration$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLDistributionRepository$saveConfiguration$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation updateSmartRoutePreferencesMutation = new com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateSmartRoutePreferencesInput(new com.paypal.oslo.api.graphql.schema.type.SmartRouteDistributionInput(com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getFUNDING_SOURCE(), com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getDISTRIBUTION_METHOD(), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput[]{new com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.SAVINGS, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Integer.valueOf((int) distributionConfiguration.getSavingsPercentage())), null, 4, null), new com.paypal.oslo.api.graphql.schema.type.SmartRouteTargetInput(com.paypal.oslo.api.graphql.schema.type.SmartRouteAccountType.CRYPTO_PYUSD, com.apollographql.apollo.api.Optional.INSTANCE.present(java.lang.Integer.valueOf((int) distributionConfiguration.getCryptoPercentage())), null, 4, null)})), com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.toGraphQLStatus(distributionConfiguration.getStatus()), com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getSMART_ROUTE_TYPE(), distributionConfiguration.getVersion()));
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$2 graphQLDistributionRepository$saveConfiguration$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$2(this, updateSmartRoutePreferencesMutation, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.m19676$r8$lambda$vwPSjvyTAeVESFKAiy9wvBoDc((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.$r8$lambda$lLG14I7IjWiGEPf8cULtI8WjL8c(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLDistributionRepository$saveConfiguration$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    graphQLDistributionRepository$saveConfiguration$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateSmartRoutePreferencesMutation);
                    graphQLDistributionRepository$saveConfiguration$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation("Save distribution config", graphQLDistributionRepository$saveConfiguration$2, function1, "Mutation failed or returned null", "Partial success with mutation failure", function12, graphQLDistributionRepository$saveConfiguration$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.UPDATE_PREFERENCES, "mutation", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$5$1.getHighSpeedVideoSizes);
                return obj;
            }
        }
        graphQLDistributionRepository$saveConfiguration$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$1 graphQLDistributionRepository$saveConfiguration$122 = graphQLDistributionRepository$saveConfiguration$1;
        java.lang.Object obj2 = graphQLDistributionRepository$saveConfiguration$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLDistributionRepository$saveConfiguration$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.UPDATE_PREFERENCES, "mutation", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$saveConfiguration$5$1.getHighSpeedVideoSizes);
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCryptocurrencyPreferences(final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration>> continuation) {
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1 graphQLDistributionRepository$updateCryptocurrencyPreferences$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1) {
            graphQLDistributionRepository$updateCryptocurrencyPreferences$1 = (com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1) continuation;
            if ((graphQLDistributionRepository$updateCryptocurrencyPreferences$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                graphQLDistributionRepository$updateCryptocurrencyPreferences$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1 graphQLDistributionRepository$updateCryptocurrencyPreferences$12 = graphQLDistributionRepository$updateCryptocurrencyPreferences$1;
                java.lang.Object obj = graphQLDistributionRepository$updateCryptocurrencyPreferences$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = graphQLDistributionRepository$updateCryptocurrencyPreferences$12.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation updateCryptocurrencyPreferencesMutation = new com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation(new com.paypal.oslo.api.graphql.schema.type.UpdateCryptocurrencyPreferencesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.CryptocurrencyAssetPreferenceInput(com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getCRYPTO_ASSET_SYMBOL(), com.paypal.oslo.feature.smartroute.data.constants.SmartRouteQueryConstants.INSTANCE.getCRYPTO_PREFERENCE_TYPE(), com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.toGraphQLStatus(distributionConfiguration.getCryptoOptInStatus()), null, 8, null)), null, 2, null));
                    com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$2 graphQLDistributionRepository$updateCryptocurrencyPreferences$2 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$2(this, updateCryptocurrencyPreferencesMutation, null);
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.$r8$lambda$4mv4i2wSE6ZzJYEb9SrIuoRV_LE((java.lang.String) obj2);
                        }
                    };
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository.$r8$lambda$IXVK5sQ5BwQIy8Cvb_3_iDoc1js(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration.this, (com.paypal.oslo.core.network.graphql.GraphQLData) obj2);
                        }
                    };
                    graphQLDistributionRepository$updateCryptocurrencyPreferences$12.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    graphQLDistributionRepository$updateCryptocurrencyPreferences$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateCryptocurrencyPreferencesMutation);
                    graphQLDistributionRepository$updateCryptocurrencyPreferences$12.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.feature.smartroute.data.util.GraphQLOperationUtilsKt.handleGraphQLOperation("Update crypto preferences", graphQLDistributionRepository$updateCryptocurrencyPreferences$2, function1, "Mutation returned null", com.paypal.oslo.feature.checkcapture.domain.error.CheckCaptureError.PARTIAL_SUCCESS_NULL_DATA, function12, graphQLDistributionRepository$updateCryptocurrencyPreferences$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.UPDATE_CRYPTO_PREFERENCES, "mutation", (arrow.core.Either) obj, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$5$1.getHighSpeedVideoFpsRangesFor);
                return obj;
            }
        }
        graphQLDistributionRepository$updateCryptocurrencyPreferences$1 = new com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1(this, continuation);
        com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$1 graphQLDistributionRepository$updateCryptocurrencyPreferences$122 = graphQLDistributionRepository$updateCryptocurrencyPreferences$1;
        java.lang.Object obj2 = graphQLDistributionRepository$updateCryptocurrencyPreferences$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = graphQLDistributionRepository$updateCryptocurrencyPreferences$122.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.feature.smartroute.analytics.SmartRouteApiTrackerKt.trackApiResult(com.paypal.oslo.feature.smartroute.analytics.SmartRouteAnalyticsConstants.Api.UPDATE_CRYPTO_PREFERENCES, "mutation", (arrow.core.Either) obj2, com.paypal.oslo.feature.smartroute.data.repository.GraphQLDistributionRepository$updateCryptocurrencyPreferences$5$1.getHighSpeedVideoFpsRangesFor);
        return obj2;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError $r8$lambda$4mv4i2wSE6ZzJYEb9SrIuoRV_LE(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError(str);
    }

    /* renamed from: $r8$lambda$CO86rC9WZvIiDhr-QfIci8O36CI, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError m19674$r8$lambda$CO86rC9WZvIiDhrQfIci8O36CI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError(str);
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration $r8$lambda$IXVK5sQ5BwQIy8Cvb_3_iDoc1js(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data data = (com.paypal.oslo.feature.smartroute.graphql.UpdateCryptocurrencyPreferencesMutation.Data) graphQLData.getData();
        if ((data != null ? data.getUpdateCryptocurrencyPreferences() : null) != null) {
            return distributionConfiguration;
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration $r8$lambda$lLG14I7IjWiGEPf8cULtI8WjL8c(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.UpdateSmartRoutePreferences updateSmartRoutePreferences;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data data = (com.paypal.oslo.feature.smartroute.graphql.UpdateSmartRoutePreferencesMutation.Data) graphQLData.getData();
        if (data == null || (updateSmartRoutePreferences = data.getUpdateSmartRoutePreferences()) == null || !updateSmartRoutePreferences.getSuccess()) {
            return null;
        }
        return com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.toUpdatedConfiguration(data.getUpdateSmartRoutePreferences().getPreferences(), distributionConfiguration);
    }

    /* renamed from: $r8$lambda$tDaFH7iwi2-MWWFl-SbC9z93hN8, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration m19675$r8$lambda$tDaFH7iwi2MWWFlSbC9z93hN8(com.paypal.oslo.core.network.graphql.GraphQLData graphQLData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLData, "");
        com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data data = (com.paypal.oslo.feature.smartroute.graphql.GetSmartRoutePreferencesQuery.Data) graphQLData.getData();
        if (data != null) {
            return com.paypal.oslo.feature.smartroute.data.mapper.SmartRoutePreferencesMapperKt.toDistributionConfiguration(data);
        }
        return null;
    }

    /* renamed from: $r8$lambda$v-wPS-jvyTAeVESFKAiy9wvBoDc, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError m19676$r8$lambda$vwPSjvyTAeVESFKAiy9wvBoDc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError(str);
    }
}
