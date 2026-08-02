package com.paypal.oslo.feature.merchantbanking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/merchantbanking/api/errors/AccountRoutingError;", "", "<unused var>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase$invoke$2", f = "CheckAccountRoutingNumberEligibilityUseCase.kt", i = {0}, l = {63}, m = "invokeSuspend", n = {"$this$catch"}, nl = {64}, s = {"L$0"}, v = 2)
/* loaded from: classes13.dex */
final class CheckAccountRoutingNumberEligibilityUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends java.lang.Boolean>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
            try {
                defaultRaise.raise(com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError.ClientError.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            } catch (arrow.core.raise.RaiseCancellationException e) {
                defaultRaise.complete();
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (flowCollector.emit(new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (java.lang.Throwable th) {
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.feature.merchantbanking.api.errors.AccountRoutingError, ? extends java.lang.Boolean>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase$invoke$2 checkAccountRoutingNumberEligibilityUseCase$invoke$2 = new com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase$invoke$2(continuation);
        checkAccountRoutingNumberEligibilityUseCase$invoke$2.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
        return checkAccountRoutingNumberEligibilityUseCase$invoke$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    CheckAccountRoutingNumberEligibilityUseCase$invoke$2(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.merchantbanking.domain.usecase.CheckAccountRoutingNumberEligibilityUseCase$invoke$2> continuation) {
        super(3, continuation);
    }
}
