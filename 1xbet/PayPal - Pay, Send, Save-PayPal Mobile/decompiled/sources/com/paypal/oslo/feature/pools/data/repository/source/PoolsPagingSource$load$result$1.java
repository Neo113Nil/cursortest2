package com.paypal.oslo.feature.pools.data.repository.source;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00030\u0001*\u00020\bH\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/pools/domain/error/PoolError;", "Lkotlin/Triple;", "", "Lcom/paypal/oslo/feature/pools/domain/models/Pool;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1", f = "PoolsPagingSource.kt", i = {0, 0, 0, 0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PoolsPagingSource$load$result$1$1"}, nl = {106}, s = {"L$0", "L$1", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class PoolsPagingSource$load$result$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, ? extends kotlin.Triple<? extends java.util.List<? extends com.paypal.oslo.feature.pools.domain.models.Pool>, ? extends java.lang.Boolean, ? extends java.lang.Integer>>>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource getOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [arrow.core.raise.Raise] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise defaultRaise;
        arrow.core.raise.DefaultRaise defaultRaise2;
        dagger.Lazy lazy;
        com.paypal.oslo.feature.pools.domain.models.PoolUserRole poolUserRole;
        com.paypal.oslo.feature.pools.domain.models.PoolStatus poolStatus;
        java.lang.Object execute$default;
        arrow.core.raise.DefaultRaise defaultRaise3;
        arrow.core.raise.Raise raise;
        arrow.core.Either right;
        com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.MoneyPools moneyPools;
        com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Page page;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource poolsPagingSource = this.getOutputSizeshNQ4ISI;
            int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise2 = defaultRaise;
                com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.pools.LoggerKt.log, com.paypal.android.logger.categories.Network.Call.INSTANCE, com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.GET_POOLS_REQUEST_TRIGGERED, null, null, 12, null);
                lazy = poolsPagingSource.getHighSpeedVideoSizes;
                java.lang.Object obj2 = lazy.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
                com.apollographql.apollo.ApolloClient apolloClient = (com.apollographql.apollo.ApolloClient) obj2;
                com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper poolCommonMapper = com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE;
                poolUserRole = poolsPagingSource.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.api.graphql.schema.type.MoneyPoolUserRole graphQLUserRole = poolCommonMapper.toGraphQLUserRole(poolUserRole);
                com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
                poolStatus = poolsPagingSource.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery getMoneyPoolsQuery = new com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery(new com.paypal.oslo.api.graphql.schema.type.MoneyPoolsInput(i2, i3, graphQLUserRole, companion.presentIfNotNull(poolStatus != null ? com.paypal.oslo.feature.pools.data.mapper.PoolCommonMapper.INSTANCE.toGraphQLStatus(poolStatus) : null)));
                this.getInputSizeshNQ4ISI = defaultRaise;
                this.getInputFormats = defaultRaise2;
                this.getHighSpeedVideoSizesFor = defaultRaise2;
                this.Camera2StreamConfigurationMap = 0;
                this.getHighSpeedVideoSizes = 0;
                this.getHighSpeedVideoFpsRanges = 0;
                this.getOutputMinFrameDuration = 0;
                this.getOutputFormats = 1;
                execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, getMoneyPoolsQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, this, 2, (java.lang.Object) null);
                if (execute$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                defaultRaise3 = defaultRaise;
                raise = defaultRaise2;
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            raise = (arrow.core.raise.Raise) this.getHighSpeedVideoSizesFor;
            ?? r1 = (arrow.core.raise.Raise) this.getInputFormats;
            defaultRaise3 = (arrow.core.raise.DefaultRaise) this.getInputSizeshNQ4ISI;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                defaultRaise2 = r1;
                execute$default = obj;
            } catch (arrow.core.raise.RaiseCancellationException e2) {
                e = e2;
                defaultRaise = defaultRaise3;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th2) {
                th = th2;
                defaultRaise = defaultRaise3;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        }
        arrow.core.Either either = ((arrow.core.Ior) execute$default).toEither();
        if (either instanceof arrow.core.Either.Left) {
            right = new arrow.core.Either.Left(com.paypal.oslo.feature.pools.data.error.PoolErrorMapperKt.toPoolError((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Either.Left) either).getValue()));
        } else {
            if (!(either instanceof arrow.core.Either.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
        }
        com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data data = (com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) raise.bind(right)).getData();
        if (data == null || (moneyPools = data.getMoneyPools()) == null || (page = moneyPools.getPage()) == null) {
            defaultRaise2.raise(new com.paypal.oslo.feature.pools.domain.error.PoolError.Business.DataNotFound(null, 1, null));
            throw new kotlin.KotlinNothingValueException();
        }
        java.util.List<com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item> items = page.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.pools.data.mapper.PoolsMapper.INSTANCE.toPool((com.paypal.oslo.feature.pools.graphql.GetMoneyPoolsQuery.Item) it.next()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        boolean hasNextPage = page.getHasNextPage();
        com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.pools.LoggerKt.log, com.paypal.android.logger.categories.Network.Success.INSTANCE, !arrayList2.isEmpty() ? com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.GET_POOLS_RESPONSE_COMPLETE_USER_HAS_POOLS : com.paypal.oslo.feature.pools.logger.PoolsDatadogEvents.GET_POOLS_WILL_START_POOLING, null, null, 12, null);
        kotlin.Triple triple = new kotlin.Triple(arrayList2, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(hasNextPage), kotlin.coroutines.jvm.internal.Boxing.boxInt(page.getLimit()));
        defaultRaise3.complete();
        return new arrow.core.Either.Right(triple);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.pools.domain.error.PoolError, ? extends kotlin.Triple<? extends java.util.List<? extends com.paypal.oslo.feature.pools.domain.models.Pool>, ? extends java.lang.Boolean, ? extends java.lang.Integer>>> continuation) {
        return ((com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1(this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PoolsPagingSource$load$result$1(com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource poolsPagingSource, int i, int i2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.data.repository.source.PoolsPagingSource$load$result$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = poolsPagingSource;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
    }
}
