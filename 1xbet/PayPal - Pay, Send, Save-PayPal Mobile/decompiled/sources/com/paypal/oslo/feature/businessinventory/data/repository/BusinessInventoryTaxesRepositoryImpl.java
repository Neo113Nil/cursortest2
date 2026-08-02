package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u001a\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010 \u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b \u0010!J.\u0010%\u001a\u0012\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\u0004\u0012\u00020\u00100\u000e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0082@¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010-R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010/"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/repository/BusinessInventoryTaxesRepositoryImpl;", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "businessInventoryFeatureGateManager", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;)V", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getTaxes", "()Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "", "", "syncTaxes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/businessinventory/domain/usecase/SaveTaxOptionException;", "addTax", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tax", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "saveTax", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "taxId", "deleteTax", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/network/graphql/GraphQLData;", "Lcom/paypal/oslo/feature/businessinventory/graphql/GetBusinessInventoryTaxesQuery$Data;", "p0", "getHighSpeedVideoFpsRanges", "(Lcom/paypal/oslo/core/network/graphql/GraphQLData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryTaxesRepositoryImpl implements com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public BusinessInventoryTaxesRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryFeatureGateManager, "");
        this.getHighSpeedVideoFpsRangesFor = lazy;
        this.Camera2StreamConfigurationMap = businessInventoryFeatureGateManager;
        this.getHighResolutionOutputSizeshNQ4ISI = "Business Inventory feature is disabled";
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> getTaxes() {
        return kotlinx.coroutines.flow.FlowKt.asSharedFlow(this.getHighSpeedVideoFpsRanges);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0160, code lost:
    
        if (r12 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01aa, code lost:
    
        if (r12 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        if (r12 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object syncTaxes(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Throwable, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$syncTaxes$1 businessInventoryTaxesRepositoryImpl$syncTaxes$1;
        int i;
        com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery getBusinessInventoryTaxesQuery;
        arrow.core.Ior ior;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$syncTaxes$1) {
            businessInventoryTaxesRepositoryImpl$syncTaxes$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$syncTaxes$1) continuation;
            if ((businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    getBusinessInventoryTaxesQuery = new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput(com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy.NAME), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.SortOrder.ASC))));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRangesFor.get().query(getBusinessInventoryTaxesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBusinessInventoryTaxesQuery);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, businessInventoryTaxesRepositoryImpl$syncTaxes$1, 2, null);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            int i2 = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighResolutionOutputSizeshNQ4ISI;
                            int i3 = businessInventoryTaxesRepositoryImpl$syncTaxes$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                            return (arrow.core.Either) obj;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i4 = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i5 = businessInventoryTaxesRepositoryImpl$syncTaxes$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    getBusinessInventoryTaxesQuery = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery) businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue()));
                } else if (ior instanceof arrow.core.Ior.Right) {
                    both = ior;
                } else {
                    if (!(ior instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) ior;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Fetch taxes failed", exc);
                    return arrow.core.EitherKt.left(exc);
                }
                if (both instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data> graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue();
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBusinessInventoryTaxesQuery);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(both);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor = 2;
                    obj = getHighSpeedVideoFpsRanges(graphQLData, businessInventoryTaxesRepositoryImpl$syncTaxes$1);
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data> graphQLData2 = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    java.lang.Exception exc2 = (java.lang.Exception) leftValue;
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Fetch taxes completed with partial errors", exc2);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBusinessInventoryTaxesQuery);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(both);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(exc2);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData2);
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor = 3;
                    obj = getHighSpeedVideoFpsRanges(graphQLData2, businessInventoryTaxesRepositoryImpl$syncTaxes$1);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
        }
        businessInventoryTaxesRepositoryImpl$syncTaxes$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$syncTaxes$1(this, continuation);
        java.lang.Object obj2 = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryTaxesRepositoryImpl$syncTaxes$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addTax(java.lang.String str, double d, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1 businessInventoryTaxesRepositoryImpl$addTax$1;
        int i;
        java.lang.String str2;
        double d2;
        arrow.core.Ior.Both both;
        com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryTaxMutation.CreateMerchantTax createMerchantTax;
        java.lang.String id;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1) {
            businessInventoryTaxesRepositoryImpl$addTax$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1) continuation;
            if ((businessInventoryTaxesRepositoryImpl$addTax$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                businessInventoryTaxesRepositoryImpl$addTax$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1 businessInventoryTaxesRepositoryImpl$addTax$12 = businessInventoryTaxesRepositoryImpl$addTax$1;
                java.lang.Object obj = businessInventoryTaxesRepositoryImpl$addTax$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryTaxesRepositoryImpl$addTax$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.FeatureDisabled.INSTANCE);
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryTaxMutation createBusinessInventoryTaxMutation = new com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryTaxMutation(new com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput(null, str, com.apollographql.apollo.api.Optional.INSTANCE.absent(), java.lang.String.valueOf(d), 1, null));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryTaxesRepositoryImpl$addTax$12.getHighSpeedVideoFpsRangesFor = str;
                    businessInventoryTaxesRepositoryImpl$addTax$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createBusinessInventoryTaxMutation);
                    businessInventoryTaxesRepositoryImpl$addTax$12.Camera2StreamConfigurationMap = d;
                    businessInventoryTaxesRepositoryImpl$addTax$12.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createBusinessInventoryTaxMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryTaxesRepositoryImpl$addTax$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    d2 = d;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 = businessInventoryTaxesRepositoryImpl$addTax$12.Camera2StreamConfigurationMap;
                    str2 = (java.lang.String) businessInventoryTaxesRepositoryImpl$addTax$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Add tax failed", (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue());
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Unknown.INSTANCE);
                }
                if (!(both instanceof arrow.core.Ior.Right)) {
                    if (both instanceof arrow.core.Ior.Both) {
                        arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                        java.lang.Object leftValue = both3.getLeftValue();
                        com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Add tax completed with partial errors", (java.lang.Exception) leftValue);
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Unknown.INSTANCE);
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryTaxMutation.Data data = (com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryTaxMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue()).getData();
                if (data == null || (createMerchantTax = data.getCreateMerchantTax()) == null || (id = createMerchantTax.getId()) == null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businessinventory.domain.usecase.SaveTaxOptionException.Unknown.INSTANCE);
                }
                return arrow.core.EitherKt.right(new com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption(id, str2, d2));
            }
        }
        businessInventoryTaxesRepositoryImpl$addTax$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1(this, continuation);
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1 businessInventoryTaxesRepositoryImpl$addTax$122 = businessInventoryTaxesRepositoryImpl$addTax$1;
        java.lang.Object obj2 = businessInventoryTaxesRepositoryImpl$addTax$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryTaxesRepositoryImpl$addTax$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveTax(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1 businessInventoryTaxesRepositoryImpl$saveTax$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1) {
            businessInventoryTaxesRepositoryImpl$saveTax$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1) continuation;
            if ((businessInventoryTaxesRepositoryImpl$saveTax$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryTaxesRepositoryImpl$saveTax$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1 businessInventoryTaxesRepositoryImpl$saveTax$12 = businessInventoryTaxesRepositoryImpl$saveTax$1;
                java.lang.Object obj = businessInventoryTaxesRepositoryImpl$saveTax$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryTaxesRepositoryImpl$saveTax$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryTaxMutation updateBusinessInventoryTaxMutation = new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryTaxMutation(new com.paypal.oslo.api.graphql.schema.type.MerchantTaxInput(com.apollographql.apollo.api.Optional.INSTANCE.present(taxOption.getId()), taxOption.getLabel(), com.apollographql.apollo.api.Optional.INSTANCE.absent(), java.lang.String.valueOf(taxOption.getValue())));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryTaxesRepositoryImpl$saveTax$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxOption);
                    businessInventoryTaxesRepositoryImpl$saveTax$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateBusinessInventoryTaxMutation);
                    businessInventoryTaxesRepositoryImpl$saveTax$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, updateBusinessInventoryTaxMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryTaxesRepositoryImpl$saveTax$12, 2, (java.lang.Object) null);
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Save tax failed", exc);
                    return arrow.core.EitherKt.left(exc);
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Save tax completed with partial errors", (java.lang.Exception) leftValue);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        businessInventoryTaxesRepositoryImpl$saveTax$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1(this, continuation);
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1 businessInventoryTaxesRepositoryImpl$saveTax$122 = businessInventoryTaxesRepositoryImpl$saveTax$1;
        java.lang.Object obj2 = businessInventoryTaxesRepositoryImpl$saveTax$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryTaxesRepositoryImpl$saveTax$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteTax(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1 businessInventoryTaxesRepositoryImpl$deleteTax$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1) {
            businessInventoryTaxesRepositoryImpl$deleteTax$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1) continuation;
            if ((businessInventoryTaxesRepositoryImpl$deleteTax$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryTaxesRepositoryImpl$deleteTax$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1 businessInventoryTaxesRepositoryImpl$deleteTax$12 = businessInventoryTaxesRepositoryImpl$deleteTax$1;
                java.lang.Object obj = businessInventoryTaxesRepositoryImpl$deleteTax$12.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryTaxesRepositoryImpl$deleteTax$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.Camera2StreamConfigurationMap.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighResolutionOutputSizeshNQ4ISI));
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryTaxMutation deleteBusinessInventoryTaxMutation = new com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryTaxMutation(str);
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoFpsRangesFor.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryTaxesRepositoryImpl$deleteTax$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    businessInventoryTaxesRepositoryImpl$deleteTax$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteBusinessInventoryTaxMutation);
                    businessInventoryTaxesRepositoryImpl$deleteTax$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, deleteBusinessInventoryTaxMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryTaxesRepositoryImpl$deleteTax$12, 2, (java.lang.Object) null);
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
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toBusinessInventoryException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Delete tax failed", exc);
                    return arrow.core.EitherKt.left(exc);
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Delete tax completed with partial errors", (java.lang.Exception) leftValue);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        businessInventoryTaxesRepositoryImpl$deleteTax$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1(this, continuation);
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1 businessInventoryTaxesRepositoryImpl$deleteTax$122 = businessInventoryTaxesRepositoryImpl$deleteTax$1;
        java.lang.Object obj2 = businessInventoryTaxesRepositoryImpl$deleteTax$122.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryTaxesRepositoryImpl$deleteTax$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.core.network.graphql.GraphQLData<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data> graphQLData, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$handleSyncResponse$1 businessInventoryTaxesRepositoryImpl$handleSyncResponse$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$handleSyncResponse$1) {
            businessInventoryTaxesRepositoryImpl$handleSyncResponse$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$handleSyncResponse$1) continuation;
            if ((businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.Data data = graphQLData.getData();
                    if (data != null) {
                        java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> merchantTaxes = data.getMerchantTaxes();
                        if (merchantTaxes == null) {
                            merchantTaxes = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax> list = merchantTaxes;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toTaxOption((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryTaxesQuery.MerchantTax) it.next()));
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        kotlinx.coroutines.flow.MutableSharedFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> mutableSharedFlow = this.getHighSpeedVideoFpsRanges;
                        businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(graphQLData);
                        businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                        businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList2);
                        businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRanges = 1;
                        if (mutableSharedFlow.emit(arrayList2, businessInventoryTaxesRepositoryImpl$handleSyncResponse$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        return arrow.core.EitherKt.left(new java.lang.Exception("Missing data from GraphQL response"));
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
        }
        businessInventoryTaxesRepositoryImpl$handleSyncResponse$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$handleSyncResponse$1(this, continuation);
        java.lang.Object obj2 = businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryTaxesRepositoryImpl$handleSyncResponse$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
    }
}
