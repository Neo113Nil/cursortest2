package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JX\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\"\b\b\u0000\u0010\u0018*\u00020\u0017*\b\u0012\u0004\u0012\u00028\u00000\u00192\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010\u001f\u001a\u00020\u0013*\u00020$2\u0006\u0010\u001c\u001a\u00020%H\u0002¢\u0006\u0004\b\u001f\u0010&R\u0014\u0010\"\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010."}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/AccountSummaryRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/BaseRepository;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/AccountSummaryRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "dynamicConfigManager", "Ljavax/inject/Provider;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductConfigurationsRepository;", "productConfigurationsRepositoryProvider", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "webEnvironmentProvider", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;Ljavax/inject/Provider;Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/ServicingOverviewRequest;", "request", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryError;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;", "fetchAccountSummary", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/request/ServicingOverviewRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/apollographql/apollo/api/Query$Data;", "D", "Lcom/apollographql/apollo/api/Query;", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/data/network/PartialErrorHandler;", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/apollographql/apollo/api/Query;Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryOverView;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/accountsummary/AccountSummaryError;", "getHighSpeedVideoFpsRangesFor", "Lcom/apollographql/apollo/ApolloClient;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "Camera2StreamConfigurationMap", "Ljavax/inject/Provider;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/webview/config/WebEnvironmentProvider;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/featureFlags/FeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AccountSummaryRepositoryImpl extends com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.webview.config.WebEnvironmentProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AccountSummaryRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig.DynamicConfigManager dynamicConfigManager, javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository> provider, com.paypal.oslo.core.webview.config.WebEnvironmentProvider webEnvironmentProvider, com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfigManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighSpeedVideoFpsRanges = apolloClient;
        this.Camera2StreamConfigurationMap = dynamicConfigManager;
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = webEnvironmentProvider;
        this.getHighSpeedVideoFpsRangesFor = featureGateManager;
        com.paypal.oslo.feature.revolvingcreditservicing.data.criticalfields.AccountSummaryCriticalFields.INSTANCE.registerAll();
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository
    public final java.lang.Object fetchAccountSummary(com.paypal.oslo.feature.revolvingcreditservicing.domain.request.ServicingOverviewRequest servicingOverviewRequest, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView>> continuation) {
        java.util.ArrayList arrayList;
        if (this.Camera2StreamConfigurationMap.shouldRequestAppUpdate()) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.UpdateNeeded.INSTANCE);
        }
        com.paypal.oslo.api.graphql.schema.type.RevolvingCreditProductIdentifier graphql = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.common.CreditProductIdentifierMapperKt.toGraphql(servicingOverviewRequest.getCreditProductIdentifier());
        com.apollographql.apollo.api.Optional presentIfNotNull = com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(servicingOverviewRequest.getCreditAccountId());
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken> externalWalletTokens = servicingOverviewRequest.getExternalWalletTokens();
        if (externalWalletTokens != null) {
            java.util.List<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken> list = externalWalletTokens;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletTokenKt.toGraphqlInput((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.WalletToken) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion.presentIfNotNull(arrayList);
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[servicingOverviewRequest.getCreditProductIdentifier().ordinal()];
        if (i == 1) {
            return getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery(graphql, presentIfNotNull, !this.getHighSpeedVideoFpsRangesFor.isPayPalPlusCbmcEnabled(), presentIfNotNull2), new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.$r8$lambda$t9iSmQhDzcBLRioJnodBAf9GiCA(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.this, (com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Data) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2);
                }
            }, servicingOverviewRequest.getCreditProductIdentifier(), continuation);
        }
        if (i == 2) {
            return getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery(graphql, presentIfNotNull, presentIfNotNull2), new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.$r8$lambda$NdaiXLfENF5XX1z8IngxeM8bJTc((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2);
                }
            }, servicingOverviewRequest.getCreditProductIdentifier(), continuation);
        }
        if (i == 3) {
            return getHighResolutionOutputSizeshNQ4ISI(new com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery(graphql, presentIfNotNull), new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.$r8$lambda$pqdBZQHtWbIgrWTPZdv7c3mJd78((com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Data) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2);
                }
            }, servicingOverviewRequest.getCreditProductIdentifier(), continuation);
        }
        return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Default.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D extends com.apollographql.apollo.api.Query.Data> java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.apollographql.apollo.api.Query<D> query, final kotlin.jvm.functions.Function2<? super D, ? super com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView> function2, final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView>> continuation) {
        return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.BaseRepository.fetchDataHandlingPartialErrors$default(this, this.getHighSpeedVideoFpsRanges, query, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.$r8$lambda$qpSJHTE30swP47JLeM4QkbKOKCk(kotlin.jvm.functions.Function2.this, this, creditProductIdentifier, (com.apollographql.apollo.api.Query.Data) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.$r8$lambda$5WXngxGOspnRTQp86fnkT6xblPc(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.this, (com.paypal.oslo.core.network.graphql.error.CallError) obj);
            }
        }, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.m18028$r8$lambda$qx1JzcLhvk0wh3r3w6ELbVqP50(kotlin.jvm.functions.Function2.this, this, creditProductIdentifier, (com.paypal.oslo.core.network.graphql.error.CallError) obj, (com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler) obj2, (com.apollographql.apollo.api.Query.Data) obj3);
            }
        }, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl.m18027$r8$lambda$_7GZ8_OVmBs0IijhMd0IzqzUY(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.this, (com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope) obj);
            }
        }, continuation, 16, null);
    }

    private final void getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView p0, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier p1) {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations productConfigurations;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductConfigurationsRepository productConfigurationsRepository = this.getHighSpeedVideoSizes.get();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductConfigurations getHighResolutionOutputSizeshNQ4ISI = productConfigurationsRepository.getGetHighResolutionOutputSizeshNQ4ISI();
        if ((getHighResolutionOutputSizeshNQ4ISI != null ? getHighResolutionOutputSizeshNQ4ISI.getCreditProductIdentifier() : null) == p1 || p0 == null || (productConfigurations = p0.getProductConfigurations()) == null || productConfigurations.getCreditCapabilities().isEmpty()) {
            return;
        }
        productConfigurationsRepository.cacheProductConfigurations(productConfigurations);
    }

    private static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.network.graphql.error.CallError callError, boolean z) {
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Network.INSTANCE;
        }
        if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL = (com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError;
        if (graphQL.isCritical() || !z) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.CriticalFieldsMissing(graphQL.getAffectedCriticalPaths());
        }
        return !arrow.core.NonEmptyList.m9567boximpl(graphQL.m11659getErrors1X0FAY()).isEmpty() ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.PartialDataAvailable.INSTANCE : com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Default.INSTANCE;
    }

    /* renamed from: $r8$lambda$-_7GZ8_OVmBs0-IijhMd0IzqzUY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18027$r8$lambda$_7GZ8_OVmBs0IijhMd0IzqzUY(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.data.observability.NetworkObservabilityAttributesScope networkObservabilityAttributesScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkObservabilityAttributesScope, "");
        networkObservabilityAttributesScope.addCpi(creditProductIdentifier);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$5WXngxGOspnRTQp86fnkT6xblPc(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl accountSummaryRepositoryImpl, com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        return arrow.core.IorKt.leftIor(getHighResolutionOutputSizeshNQ4ISI(callError, false));
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView $r8$lambda$NdaiXLfENF5XX1z8IngxeM8bJTc(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        if (data != null) {
            return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCCAccountSummaryMapperKt.toDomain(data, partialErrorHandler);
        }
        return null;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView $r8$lambda$pqdBZQHtWbIgrWTPZdv7c3mJd78(com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetPPCUKServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        if (data != null) {
            return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.PPCUKAccountSummaryMapperKt.toDomain(data, partialErrorHandler);
        }
        return null;
    }

    public static /* synthetic */ arrow.core.Ior $r8$lambda$qpSJHTE30swP47JLeM4QkbKOKCk(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl accountSummaryRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.apollographql.apollo.api.Query.Data data) {
        arrow.core.Ior rightIor;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) function2.invoke(data, null);
        accountSummaryRepositoryImpl.getHighSpeedVideoFpsRanges(accountSummaryOverView, creditProductIdentifier);
        return (accountSummaryOverView == null || (rightIor = arrow.core.IorKt.rightIor(accountSummaryOverView)) == null) ? arrow.core.IorKt.leftIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.Default.INSTANCE) : rightIor;
    }

    /* renamed from: $r8$lambda$qx1JzcLhvk0wh3r3w6ELb-VqP50, reason: not valid java name */
    public static /* synthetic */ arrow.core.Ior m18028$r8$lambda$qx1JzcLhvk0wh3r3w6ELbVqP50(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl accountSummaryRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler, com.apollographql.apollo.api.Query.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partialErrorHandler, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView accountSummaryOverView = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView) function2.invoke(data, partialErrorHandler);
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(callError, accountSummaryOverView != null);
        if ((highResolutionOutputSizeshNQ4ISI instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryError.CriticalFieldsMissing) || accountSummaryOverView == null) {
            return arrow.core.IorKt.leftIor(highResolutionOutputSizeshNQ4ISI);
        }
        accountSummaryRepositoryImpl.getHighSpeedVideoFpsRanges(accountSummaryOverView, creditProductIdentifier);
        return new arrow.core.Ior.Both(highResolutionOutputSizeshNQ4ISI, accountSummaryOverView);
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.accountsummary.AccountSummaryOverView $r8$lambda$t9iSmQhDzcBLRioJnodBAf9GiCA(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl accountSummaryRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.graphql.GetCBMCServicingOverviewQuery.Data data, com.paypal.oslo.feature.revolvingcreditservicing.data.network.PartialErrorHandler partialErrorHandler) {
        if (data != null) {
            return com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.accounts.CBMCAccountSummaryMapperKt.toDomain(data, partialErrorHandler, accountSummaryRepositoryImpl.getHighResolutionOutputSizeshNQ4ISI.getWebBaseUrl());
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PP_UK_PPC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
