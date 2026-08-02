package com.paypal.oslo.feature.pools.data.repository.source;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BO\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/pools/data/repository/source/PoolsPagingSource;", "Landroidx/paging/PagingSource;", "", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "userRole", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "poolStatus", "initialLimit", "Lkotlin/Function1;", "", "onLimitChanged", "<init>", "(Ldagger/Lazy;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;ILkotlin/jvm/functions/Function1;)V", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "getHighResolutionOutputSizeshNQ4ISI", "Ldagger/Lazy;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/pools/domain/models/PoolUserRole;", "Lcom/paypal/oslo/feature/pools/domain/models/PoolStatus;", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PoolsPagingSource extends androidx.paging.PagingSource<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.domain.models.PoolStatus getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.pools.domain.models.PoolUserRole getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public PoolsPagingSource(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(poolUserRole, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = lazy;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
        this.getHighSpeedVideoFpsRangesFor = poolUserRole;
        this.getHighResolutionOutputSizeshNQ4ISI = poolStatus;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizesFor = i;
    }

    public /* synthetic */ PoolsPagingSource(dagger.Lazy lazy, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole, com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus, int i, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lazy, coroutineDispatcher, poolUserRole, poolStatus, (i2 & 16) != 0 ? 10 : i, (i2 & 32) != 0 ? new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit unit;
                ((java.lang.Integer) obj).intValue();
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:11:0x002f, B:12:0x006f, B:14:0x0075, B:16:0x00a6, B:17:0x00ad, B:21:0x00b3, B:23:0x00b7, B:25:0x00ce, B:26:0x00d3, B:30:0x003e, B:32:0x0046, B:33:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[Catch: Exception -> 0x00d4, TryCatch #0 {Exception -> 0x00d4, blocks: (B:11:0x002f, B:12:0x006f, B:14:0x0075, B:16:0x00a6, B:17:0x00ad, B:21:0x00b3, B:23:0x00b7, B:25:0x00ce, B:26:0x00d3, B:30:0x003e, B:32:0x0046, B:33:0x004c), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object load(androidx.paging.PagingSource.LoadParams<java.lang.Integer> loadParams, kotlin.coroutines.Continuation<? super androidx.paging.PagingSource.LoadResult<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool>> continuation) {
        com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$1 poolsPagingSource$load$1;
        int i;
        int i2;
        arrow.core.Either either;
        try {
            if (continuation instanceof com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$1) {
                poolsPagingSource$load$1 = (com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$1) continuation;
                if ((poolsPagingSource$load$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                    poolsPagingSource$load$1.getHighSpeedVideoFpsRanges -= 2147483648;
                    java.lang.Object obj = poolsPagingSource$load$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = poolsPagingSource$load$1.getHighSpeedVideoFpsRanges;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.Integer key = loadParams.getKey();
                        int intValue = key != null ? key.intValue() : 1;
                        int i3 = this.getHighSpeedVideoSizesFor;
                        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1 poolsPagingSource$load$result$1 = new com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1(this, intValue, i3, null);
                        poolsPagingSource$load$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loadParams);
                        poolsPagingSource$load$1.getHighSpeedVideoFpsRangesFor = intValue;
                        poolsPagingSource$load$1.getHighResolutionOutputSizeshNQ4ISI = i3;
                        poolsPagingSource$load$1.getHighSpeedVideoFpsRanges = 1;
                        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, poolsPagingSource$load$result$1, poolsPagingSource$load$1);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        int i4 = intValue;
                        obj = withContext;
                        i2 = i4;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i5 = poolsPagingSource$load$1.getHighResolutionOutputSizeshNQ4ISI;
                        i2 = poolsPagingSource$load$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    either = (arrow.core.Either) obj;
                    if (!(either instanceof arrow.core.Either.Right)) {
                        kotlin.Triple triple = (kotlin.Triple) ((arrow.core.Either.Right) either).getValue();
                        java.util.List list = (java.util.List) triple.component1();
                        boolean booleanValue = ((java.lang.Boolean) triple.component2()).booleanValue();
                        int intValue2 = ((java.lang.Number) triple.component3()).intValue();
                        this.getHighSpeedVideoSizesFor = intValue2;
                        this.getHighSpeedVideoFpsRanges.invoke(kotlin.coroutines.jvm.internal.Boxing.boxInt(intValue2));
                        return new androidx.paging.PagingSource.LoadResult.Page(list, null, booleanValue ? kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 1) : null);
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return new androidx.paging.PagingSource.LoadResult.Error(new com.paypal.oslo.feature.pools.domain.error.PoolsLoadException((com.paypal.oslo.feature.pools.domain.error.PoolError) ((arrow.core.Either.Left) either).getValue()));
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            if (i != 0) {
            }
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Right)) {
            }
        } catch (java.lang.Exception e) {
            return new androidx.paging.PagingSource.LoadResult.Error(e);
        }
        poolsPagingSource$load$1 = new com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$1(this, continuation);
        java.lang.Object obj2 = poolsPagingSource$load$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = poolsPagingSource$load$1.getHighSpeedVideoFpsRanges;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public final java.lang.Integer getRefreshKey(androidx.paging.PagingState<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool> state) {
        androidx.paging.PagingSource.LoadResult.Page<java.lang.Integer, com.paypal.oslo.feature.pools.domain.models.Pool> closestPageToPosition;
        java.lang.Integer nextKey;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        java.lang.Integer anchorPosition = state.getAnchorPosition();
        if (anchorPosition == null || (closestPageToPosition = state.closestPageToPosition(anchorPosition.intValue())) == null || (nextKey = closestPageToPosition.getNextKey()) == null) {
            return null;
        }
        return java.lang.Integer.valueOf(nextKey.intValue() - 1);
    }
}
