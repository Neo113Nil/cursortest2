package com.paypal.oslo.feature.merchantbanking.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/domain/errors/ArnRepositoryError;", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1", f = "MerchantAccountRoutingNumberRepositoryImpl.kt", i = {0, 0, 1, 1, 1}, l = {125, 141}, m = "invokeSuspend", n = {"$this$flow", "query", "$this$flow", "query", "result"}, nl = {126, 142}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, ? extends java.lang.Boolean>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        if (r0.emit(r3, r8) == r1) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.apollographql.apollo.ApolloClient apolloClient;
        com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery virtualBankAccountEligibilityQuery;
        arrow.core.Either.Left eligibilityErrorWithData$merchant_banking_prodRelease;
        com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError network;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery virtualBankAccountEligibilityQuery2 = new com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery(new com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountEligibilityInput(com.paypal.oslo.api.graphql.schema.type.VirtualBankAccountType.BUSINESS_VIRTUAL_BANK_ACCOUNT));
            apolloClient = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(virtualBankAccountEligibilityQuery2);
            this.getHighSpeedVideoFpsRangesFor = 1;
            java.lang.Object execute$default = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default((com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(apolloClient.query(virtualBankAccountEligibilityQuery2), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst), null, this, 2, null);
            if (execute$default != coroutine_suspended) {
                virtualBankAccountEligibilityQuery = virtualBankAccountEligibilityQuery2;
                obj = execute$default;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        virtualBankAccountEligibilityQuery = (com.paypal.oslo.feature.merchantbanking.graphql.VirtualBankAccountEligibilityQuery) this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl merchantAccountRoutingNumberRepositoryImpl = this.getHighSpeedVideoSizes;
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
                    network = new com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError.GraphQLError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
                }
                defaultRaise2.raise(network);
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                eligibilityErrorWithData$merchant_banking_prodRelease = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } else if (ior instanceof arrow.core.Ior.Right) {
            eligibilityErrorWithData$merchant_banking_prodRelease = merchantAccountRoutingNumberRepositoryImpl.eligibilityDataResponse$merchant_banking_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue());
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            eligibilityErrorWithData$merchant_banking_prodRelease = merchantAccountRoutingNumberRepositoryImpl.eligibilityErrorWithData$merchant_banking_prodRelease((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue(), (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue());
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(virtualBankAccountEligibilityQuery);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eligibilityErrorWithData$merchant_banking_prodRelease);
        this.getHighSpeedVideoFpsRangesFor = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.domain.errors.ArnRepositoryError, ? extends java.lang.Boolean>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1 merchantAccountRoutingNumberRepositoryImpl$checkEligibility$1 = new com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1(this.getHighSpeedVideoSizes, continuation);
        merchantAccountRoutingNumberRepositoryImpl$checkEligibility$1.Camera2StreamConfigurationMap = obj;
        return merchantAccountRoutingNumberRepositoryImpl$checkEligibility$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1(com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl merchantAccountRoutingNumberRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.data.repository.MerchantAccountRoutingNumberRepositoryImpl$checkEligibility$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = merchantAccountRoutingNumberRepositoryImpl;
    }
}
