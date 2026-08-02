package com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1", f = "AllTransactionsMviViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AllTransactionsMviViewModel$load$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore2;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.GetStatementAvailabilityUseCase getStatementAvailabilityUseCase;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore3;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore4;
        com.paypal.oslo.core.mvi.MviStateStore mviStateStore5;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mviStateStore = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
            mviStateStore.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadRequested.INSTANCE);
            try {
                getStatementAvailabilityUseCase = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult invoke = getStatementAvailabilityUseCase.invoke();
                if (invoke instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.Success) {
                    mviStateStore5 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    mviStateStore5.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadSucceeded(((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.Success) invoke).getYears()));
                } else if (invoke instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.NoStatementsYet) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "No statements available yet for user", null, null, 6, null);
                    mviStateStore4 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    mviStateStore4.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadEmpty.INSTANCE);
                } else {
                    if (!(invoke instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.alltransactions.StatementAvailabilityResult.AccountCreationUnavailable)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Account creation date unavailable - statements cannot be determined", null, null, 6, null);
                    mviStateStore3 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                    mviStateStore3.onEvent(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadAccountCreationUnavailable.INSTANCE);
                }
            } catch (java.util.concurrent.CancellationException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                pairArr[0] = kotlin.TuplesKt.to("errorType", e2.getClass().getSimpleName());
                java.lang.String message = e2.getMessage();
                if (message == null) {
                    message = "";
                }
                pairArr[1] = kotlin.TuplesKt.to("errorMessage", message);
                com.paypal.android.logger.Logger.e$default(logger, "All transactions load failed", kotlin.collections.MapsKt.mapOf(pairArr), null, e2, 4, null);
                mviStateStore2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
                mviStateStore2.onEvent(new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsEvent.LoadFailed(e2.getMessage()));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllTransactionsMviViewModel$load$1(com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel allTransactionsMviViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.ui.alltransactions.mvi.AllTransactionsMviViewModel$load$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = allTransactionsMviViewModel;
    }
}
