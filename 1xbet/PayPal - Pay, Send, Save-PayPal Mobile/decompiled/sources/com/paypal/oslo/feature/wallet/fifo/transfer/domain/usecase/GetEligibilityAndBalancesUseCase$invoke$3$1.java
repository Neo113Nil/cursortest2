package com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/EligibilityAndBalancesResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1", f = "GetEligibilityAndBalancesUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {65, 66}, m = "invokeSuspend", n = {"$this$coroutineScope", "eligibilityDeferred", "balancesDeferred", "$this$coroutineScope", "eligibilityDeferred", "balancesDeferred", "eligibilityResult"}, nl = {66, 69}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class GetEligibilityAndBalancesUseCase$invoke$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        kotlinx.coroutines.Deferred deferred;
        arrow.core.Ior.Both both;
        arrow.core.Ior.Both both2;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult getEligibilityResult;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$eligibilityDeferred$1(this.getInputSizeshNQ4ISI, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1$balancesDeferred$1(this.getInputSizeshNQ4ISI, null), 3, null);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
            this.getHighSpeedVideoFpsRanges = 1;
            java.lang.Object await = async$default.await(this);
            if (await != coroutine_suspended) {
                deferred = async$default;
                obj = await;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            both = (arrow.core.Ior) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            both2 = (arrow.core.Ior) obj;
            arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> iorRaise = this.getHighSpeedVideoSizes;
            if (!(both instanceof arrow.core.Ior.Left)) {
                both = new arrow.core.Ior.Left(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) ((arrow.core.Ior.Left) both).getValue()));
            } else if (!(both instanceof arrow.core.Ior.Right)) {
                if (!(both instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                both = new arrow.core.Ior.Both(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.EligibilityFailed((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityError) both3.getLeftValue()), both3.getRightValue());
            }
            getEligibilityResult = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult) iorRaise.bind((arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError, ? extends A>) both);
            arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> iorRaise2 = this.getHighSpeedVideoSizes;
            if (!(both2 instanceof arrow.core.Ior.Left)) {
                both2 = new arrow.core.Ior.Left(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError) ((arrow.core.Ior.Left) both2).getValue()));
            } else if (!(both2 instanceof arrow.core.Ior.Right)) {
                if (!(both2 instanceof arrow.core.Ior.Both)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                arrow.core.Ior.Both both4 = (arrow.core.Ior.Both) both2;
                both2 = new arrow.core.Ior.Both(new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.BalancesFailed((com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetAccountBalancesError) both4.getLeftValue()), both4.getRightValue());
            }
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult) iorRaise2.bind((arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError, ? extends A>) both2);
            if (getEligibilityResult.getBalanceAddWithdrawEligibility().getBalanceWithdrawalEligibility()) {
                this.getHighSpeedVideoSizes.raise(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.WithdrawalNotEligible.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (accountBalancesResult.getCurrencies().isEmpty()) {
                this.getHighSpeedVideoSizes.raise(com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError.NoCurrenciesAvailable.INSTANCE);
                throw new kotlin.KotlinNothingValueException();
            }
            return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult(getEligibilityResult, accountBalancesResult);
        }
        async$default2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
        deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
        this.Camera2StreamConfigurationMap = ior;
        this.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object await2 = async$default2.await(this);
        if (await2 != coroutine_suspended) {
            both = ior;
            obj = await2;
            both2 = (arrow.core.Ior) obj;
            arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> iorRaise3 = this.getHighSpeedVideoSizes;
            if (!(both instanceof arrow.core.Ior.Left)) {
            }
            getEligibilityResult = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.GetEligibilityResult) iorRaise3.bind((arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError, ? extends A>) both);
            arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> iorRaise22 = this.getHighSpeedVideoSizes;
            if (!(both2 instanceof arrow.core.Ior.Left)) {
            }
            com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult accountBalancesResult2 = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.AccountBalancesResult) iorRaise22.bind((arrow.core.Ior<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError, ? extends A>) both2);
            if (getEligibilityResult.getBalanceAddWithdrawEligibility().getBalanceWithdrawalEligibility()) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.EligibilityAndBalancesResult> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1 getEligibilityAndBalancesUseCase$invoke$3$1 = new com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, continuation);
        getEligibilityAndBalancesUseCase$invoke$3$1.getOutputMinFrameDuration = obj;
        return getEligibilityAndBalancesUseCase$invoke$3$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetEligibilityAndBalancesUseCase$invoke$3$1(arrow.core.raise.IorRaise<com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.EligibilityAndBalancesError> iorRaise, com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase getEligibilityAndBalancesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.transfer.domain.usecase.GetEligibilityAndBalancesUseCase$invoke$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = iorRaise;
        this.getInputSizeshNQ4ISI = getEligibilityAndBalancesUseCase;
    }
}
