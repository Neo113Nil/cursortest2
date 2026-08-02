package com.paypal.oslo.feature.merchantbanking.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", "Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1", f = "MerchantAccountRoutingNumberRepositoryImpl.kt", i = {0, 0, 1, 1, 1}, l = {82, 105}, m = "invokeSuspend", n = {"$this$flow", "query", "$this$flow", "query", "result"}, nl = {83, 106}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0145, code lost:
    
        if (r0.emit(r4, r13) == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
    
        if (r14 != r1) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery virtualBankAccountsQuery;
        com.apollographql.apollo.ApolloClient apolloClient;
        arrow.core.Either.Left errorWithData$merchant_banking_prodRelease;
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError network;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            virtualBankAccountsQuery = new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountsInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType.BUSINESS_VIRTUAL_BANK_ACCOUNT, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountStatus.ACTIVE)), null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(1)), 12, null));
            apolloClient = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(virtualBankAccountsQuery);
            this.getHighSpeedVideoSizes = 1;
            obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(virtualBankAccountsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst), null, this, 2, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            virtualBankAccountsQuery = (com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountsQuery) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl merchantAccountRoutingNumberRepositoryImpl = this.getHighSpeedVideoFpsRanges;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
                if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.Network((com.paypal.oslo.core.network.graphql.error.CallError.Network) callError);
                } else {
                    if (!(callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (com.paypal.oslo.feature.merchantbanking.data.repository.VirtualBankAccountExtensionsKt.isRiskDeniedError((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9583getHeadimpl(((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError).m11659getErrors1X0FAY()))) {
                        network = com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.RiskDenied.INSTANCE;
                    } else {
                        network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
                    }
                }
                defaultRaise2.raise(network);
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                errorWithData$merchant_banking_prodRelease = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } else if (ior instanceof arrow.core.Ior.Right) {
            errorWithData$merchant_banking_prodRelease = merchantAccountRoutingNumberRepositoryImpl.dataResponse$merchant_banking_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            errorWithData$merchant_banking_prodRelease = merchantAccountRoutingNumberRepositoryImpl.errorWithData$merchant_banking_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue(), (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(virtualBankAccountsQuery);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(errorWithData$merchant_banking_prodRelease);
        this.getHighSpeedVideoSizes = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, ? extends com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1 merchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1 = new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1(this.getHighSpeedVideoFpsRanges, continuation);
        merchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1.Camera2StreamConfigurationMap = obj;
        return merchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1(com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl merchantAccountRoutingNumberRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$getAccountRoutingNumbers$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = merchantAccountRoutingNumberRepositoryImpl;
    }
}
