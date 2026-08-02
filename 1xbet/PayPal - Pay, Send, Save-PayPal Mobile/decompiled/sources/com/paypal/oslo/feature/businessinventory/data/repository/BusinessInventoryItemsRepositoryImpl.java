package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000e\u001a\u0018\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\u0013\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0013\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0018\u0010\u0016J(\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00170\t2\u0006\u0010\u0013\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0019\u0010\u0016J%\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d*\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u001e\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010%R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/data/repository/BusinessInventoryItemsRepositoryImpl;", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryItemsRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "businessInventoryFeatureGateManager", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;)V", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;", "refreshItems", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "getInventoryItems", "()Lkotlinx/coroutines/flow/Flow;", "item", "", "addItem", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "saveItem", "deleteItem", "Lcom/apollographql/apollo/api/Optional;", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;", "Lcom/paypal/oslo/feature/businessinventory/graphql/type/MerchantItemInput;", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItem;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantItemInput;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businessinventory/api/common/BusinessInventoryFeatureGateManager;", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessInventoryItemsRepositoryImpl implements com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository {
    public static final int $stable = 8;
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public BusinessInventoryItemsRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryFeatureGateManager, "");
        this.getHighSpeedVideoSizes = lazy;
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryFeatureGateManager;
        this.Camera2StreamConfigurationMap = "Business Inventory feature is disabled";
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00be, code lost:
    
        if (r9 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object refreshItems(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$refreshItems$1 businessInventoryItemsRepositoryImpl$refreshItems$1;
        int i;
        com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery getBusinessInventoryItemsQuery;
        arrow.core.Ior ior;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$refreshItems$1) {
            businessInventoryItemsRepositoryImpl$refreshItems$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$refreshItems$1) continuation;
            if ((businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = businessInventoryItemsRepositoryImpl$refreshItems$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.Camera2StreamConfigurationMap));
                    }
                    getBusinessInventoryItemsQuery = new com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery(com.apollographql.apollo.api.Optional.INSTANCE.present(new com.paypal.oslo.api.graphql.schema.type.MerchantSortingInput(com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.MerchantCatalogSortBy.NAME), com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.SortOrder.ASC))));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoSizes.get().query(getBusinessInventoryItemsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBusinessInventoryItemsQuery);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, businessInventoryItemsRepositoryImpl$refreshItems$1, 2, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = businessInventoryItemsRepositoryImpl$refreshItems$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = businessInventoryItemsRepositoryImpl$refreshItems$1.Camera2StreamConfigurationMap;
                        int i4 = businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoFpsRangesFor;
                        arrow.core.Either either = (arrow.core.Either) businessInventoryItemsRepositoryImpl$refreshItems$1.getInputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either;
                    }
                    getBusinessInventoryItemsQuery = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery) businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizes;
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
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Fetch items failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Fetch items failed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data data = (com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    if (data != null) {
                        java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> merchantItems = data.getMerchantItems();
                        if (merchantItems == null) {
                            merchantItems = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.util.List<com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem> list = merchantItems;
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toLibraryItem((com.paypal.oslo.feature.businessinventory.graphql.GetBusinessInventoryItemsQuery.MerchantItem) it.next()));
                        }
                        right = arrow.core.EitherKt.right(arrayList);
                    } else {
                        right = arrow.core.EitherKt.left(new java.lang.Exception("Missing data from GraphQL response"));
                    }
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (right.isRight()) {
                    java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem> list2 = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                    kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> mutableStateFlow = this.getHighSpeedVideoFpsRanges;
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getBusinessInventoryItemsQuery);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getInputSizeshNQ4ISI = right;
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoFpsRangesFor = 0;
                    businessInventoryItemsRepositoryImpl$refreshItems$1.Camera2StreamConfigurationMap = 0;
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor = 2;
                    if (mutableStateFlow.emit(list2, businessInventoryItemsRepositoryImpl$refreshItems$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return right;
            }
        }
        businessInventoryItemsRepositoryImpl$refreshItems$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$refreshItems$1(this, continuation);
        java.lang.Object obj2 = businessInventoryItemsRepositoryImpl$refreshItems$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryItemsRepositoryImpl$refreshItems$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (right.isRight()) {
        }
        return right;
    }

    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem>> getInventoryItems() {
        return kotlinx.coroutines.flow.FlowKt.onStart(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$getInventoryItems$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object addItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, java.lang.String>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1 businessInventoryItemsRepositoryImpl$addItem$1;
        int i;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryItemMutation.CreateMerchantItem createMerchantItem;
        java.lang.String id;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1) {
            businessInventoryItemsRepositoryImpl$addItem$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1) continuation;
            if ((businessInventoryItemsRepositoryImpl$addItem$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                businessInventoryItemsRepositoryImpl$addItem$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1 businessInventoryItemsRepositoryImpl$addItem$12 = businessInventoryItemsRepositoryImpl$addItem$1;
                java.lang.Object obj = businessInventoryItemsRepositoryImpl$addItem$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryItemsRepositoryImpl$addItem$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.Camera2StreamConfigurationMap));
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryItemMutation createBusinessInventoryItemMutation = new com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryItemMutation(Camera2StreamConfigurationMap(libraryItem, com.apollographql.apollo.api.Optional.INSTANCE.absent()));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryItemsRepositoryImpl$addItem$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    businessInventoryItemsRepositoryImpl$addItem$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createBusinessInventoryItemMutation);
                    businessInventoryItemsRepositoryImpl$addItem$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createBusinessInventoryItemMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryItemsRepositoryImpl$addItem$12, 2, (java.lang.Object) null);
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
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Add item failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Add item completed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryItemMutation.Data data = (com.paypal.oslo.feature.businessinventory.graphql.CreateBusinessInventoryItemMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    return (data == null || (createMerchantItem = data.getCreateMerchantItem()) == null || (id = createMerchantItem.getId()) == null || (right2 = arrow.core.EitherKt.right(id)) == null) ? arrow.core.EitherKt.left(new java.lang.Exception("Missing data from GraphQL response")) : right2;
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        businessInventoryItemsRepositoryImpl$addItem$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1(this, continuation);
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$addItem$1 businessInventoryItemsRepositoryImpl$addItem$122 = businessInventoryItemsRepositoryImpl$addItem$1;
        java.lang.Object obj2 = businessInventoryItemsRepositoryImpl$addItem$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryItemsRepositoryImpl$addItem$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1 businessInventoryItemsRepositoryImpl$saveItem$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1) {
            businessInventoryItemsRepositoryImpl$saveItem$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1) continuation;
            if ((businessInventoryItemsRepositoryImpl$saveItem$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                businessInventoryItemsRepositoryImpl$saveItem$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1 businessInventoryItemsRepositoryImpl$saveItem$12 = businessInventoryItemsRepositoryImpl$saveItem$1;
                java.lang.Object obj = businessInventoryItemsRepositoryImpl$saveItem$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryItemsRepositoryImpl$saveItem$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.Camera2StreamConfigurationMap));
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation updateBusinessInventoryItemMutation = new com.paypal.oslo.feature.businessinventory.graphql.UpdateBusinessInventoryItemMutation(Camera2StreamConfigurationMap(libraryItem, com.apollographql.apollo.api.Optional.INSTANCE.present(libraryItem.getId())));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryItemsRepositoryImpl$saveItem$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    businessInventoryItemsRepositoryImpl$saveItem$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateBusinessInventoryItemMutation);
                    businessInventoryItemsRepositoryImpl$saveItem$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, updateBusinessInventoryItemMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryItemsRepositoryImpl$saveItem$12, 2, (java.lang.Object) null);
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
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Save item failed", exc);
                    return arrow.core.EitherKt.left(exc);
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Save item completed with partial errors", (java.lang.Exception) leftValue);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        businessInventoryItemsRepositoryImpl$saveItem$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1(this, continuation);
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$saveItem$1 businessInventoryItemsRepositoryImpl$saveItem$122 = businessInventoryItemsRepositoryImpl$saveItem$1;
        java.lang.Object obj2 = businessInventoryItemsRepositoryImpl$saveItem$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryItemsRepositoryImpl$saveItem$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        if (r1 != r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryItemsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteItem(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$deleteItem$1 businessInventoryItemsRepositoryImpl$deleteItem$1;
        int i;
        com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryItemMutation deleteBusinessInventoryItemMutation;
        java.lang.Object execute$default;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$deleteItem$1) {
            businessInventoryItemsRepositoryImpl$deleteItem$1 = (com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$deleteItem$1) continuation;
            if ((businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighResolutionOutputSizeshNQ4ISI.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.Camera2StreamConfigurationMap));
                    }
                    deleteBusinessInventoryItemMutation = new com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryItemMutation(libraryItem.getId());
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighSpeedVideoSizes.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    businessInventoryItemsRepositoryImpl$deleteItem$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteBusinessInventoryItemMutation);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration = 1;
                    execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, deleteBusinessInventoryItemMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, businessInventoryItemsRepositoryImpl$deleteItem$1, 2, (java.lang.Object) null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = businessInventoryItemsRepositoryImpl$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoSizes;
                        arrow.core.Either either = (arrow.core.Either) businessInventoryItemsRepositoryImpl$deleteItem$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either;
                    }
                    com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryItemMutation deleteBusinessInventoryItemMutation2 = (com.paypal.oslo.feature.businessinventory.graphql.DeleteBusinessInventoryItemMutation) businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem2 = (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem) businessInventoryItemsRepositoryImpl$deleteItem$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    deleteBusinessInventoryItemMutation = deleteBusinessInventoryItemMutation2;
                    libraryItem = libraryItem2;
                    execute$default = obj;
                }
                both = (arrow.core.Ior) execute$default;
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
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Delete item failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.feature.businessinventory.LoggerKt.log.e("Delete item completed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (right.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) right).getValue();
                    businessInventoryItemsRepositoryImpl$deleteItem$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(libraryItem);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteBusinessInventoryItemMutation);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getInputFormats = right;
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(right);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoSizes = 0;
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighSpeedVideoFpsRangesFor = 0;
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration = 2;
                    if (refreshItems(businessInventoryItemsRepositoryImpl$deleteItem$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return right;
            }
        }
        businessInventoryItemsRepositoryImpl$deleteItem$1 = new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$deleteItem$1(this, continuation);
        java.lang.Object obj2 = businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = businessInventoryItemsRepositoryImpl$deleteItem$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        both = (arrow.core.Ior) execute$default;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (right.isRight()) {
        }
        return right;
    }

    private static com.paypal.oslo.api.graphql.schema.type.MerchantItemInput Camera2StreamConfigurationMap(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItem libraryItem, com.apollographql.apollo.api.Optional<java.lang.String> optional) {
        com.apollographql.apollo.api.Optional.Absent absent;
        java.lang.String name2 = libraryItem.getName();
        java.lang.String description = libraryItem.getDescription();
        if (description == null || description.length() == 0) {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.absent();
        } else {
            absent = com.apollographql.apollo.api.Optional.INSTANCE.present(libraryItem.getDescription());
        }
        com.apollographql.apollo.api.Optional optional2 = absent;
        com.paypal.oslo.api.graphql.schema.type.MerchantItemType merchantItemType = com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toMerchantItemType(libraryItem.getType());
        com.apollographql.apollo.api.Optional.Present present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.feature.businessinventory.data.utils.GraphQLExtensionsKt.toMoneyInput(libraryItem.getPrice()));
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = libraryItem.getTaxOption();
        return new com.paypal.oslo.api.graphql.schema.type.MerchantItemInput(optional, name2, optional2, merchantItemType, null, present, null, companion.presentIfNotNull(taxOption != null ? kotlin.collections.CollectionsKt.listOf(taxOption.getId()) : null), 80, null);
    }
}
