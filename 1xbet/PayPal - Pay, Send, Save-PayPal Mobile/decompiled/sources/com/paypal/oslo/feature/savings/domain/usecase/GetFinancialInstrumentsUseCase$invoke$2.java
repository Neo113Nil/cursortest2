package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001*\u00020\u0005H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsError;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/moneymovement/MoneyMovementFiDTO;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2", f = "GetFinancialInstrumentsUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {80, 81}, m = "invokeSuspend", n = {"$this$coroutineScope", "sanitizedAmount", "currencyCode", "amount", "depositInout", "deferredBalanceCall", "deferredFiOptionsCall", "$this$coroutineScope", "sanitizedAmount", "currencyCode", "amount", "depositInout", "deferredBalanceCall", "deferredFiOptionsCall", "balanceResult"}, nl = {81, 85}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"}, v = 2)
/* loaded from: classes14.dex */
final class GetFinancialInstrumentsUseCase$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO>>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0138, code lost:
    
        if (r1 == r8) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput copy$default;
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred deferred;
        kotlinx.coroutines.Deferred deferred2;
        kotlinx.coroutines.Deferred deferred3;
        java.lang.Object await;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money;
        arrow.core.Either either;
        arrow.core.Either either2;
        java.lang.Object await2;
        com.paypal.oslo.feature.savings.domain.model.SavingsError savingsError;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO> emptyList;
        com.paypal.oslo.feature.savings.domain.model.DepositOptionsData depositOptionsData;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDurationlomOqCM;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String replace = new kotlin.text.Regex("[^0-9.]").replace(this.getHighSpeedVideoSizes.getAmount().getValue(), "");
            java.lang.String currencyCode = this.getHighSpeedVideoSizes.getAmount().getCurrencyCode();
            com.paypal.oslo.feature.savings.domain.model.transfers.Money money2 = new com.paypal.oslo.feature.savings.domain.model.transfers.Money(currencyCode, replace);
            copy$default = com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput.copy$default(this.getHighSpeedVideoSizes, money2, null, null, 6, null);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredBalanceCall$1(this.getOutputSizes, null), 3, null);
            if (this.getHighSpeedVideoFpsRanges) {
                deferred = async$default;
                deferred2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2$deferredFiOptionsCall$1(this.getOutputSizes, copy$default, null), 3, null);
            } else {
                deferred = async$default;
                deferred2 = null;
            }
            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(replace);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(currencyCode);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money2);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy$default);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred);
            this.getOutputMinFrameDuration = deferred2;
            this.getInputSizeshNQ4ISI = 1;
            deferred3 = deferred;
            await = deferred3.await(this);
            if (await != coroutine_suspended) {
                str = replace;
                str2 = currencyCode;
                money = money2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrow.core.Either either3 = (arrow.core.Either) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            either = either3;
            await2 = obj;
            either2 = (arrow.core.Either) await2;
            com.paypal.oslo.feature.savings.domain.model.SavingsError[] savingsErrorArr = new com.paypal.oslo.feature.savings.domain.model.SavingsError[2];
            savingsErrorArr[0] = either.leftOrNull();
            savingsErrorArr[1] = either2 == null ? (com.paypal.oslo.feature.savings.domain.model.SavingsError) either2.leftOrNull() : null;
            savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) savingsErrorArr));
            if (savingsError == null) {
                return arrow.core.EitherKt.left(savingsError);
            }
            com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData payPalBalanceData = (com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData) either.getOrNull();
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO moneyMovementFiDTO = payPalBalanceData != null ? com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTOKt.toMoneyMovementFiDTO(payPalBalanceData) : null;
            if (either2 == null || (depositOptionsData = (com.paypal.oslo.feature.savings.domain.model.DepositOptionsData) either2.getOrNull()) == null || (emptyList = com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTOKt.toMoneyMovementFiDTOList(depositOptionsData)) == null) {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            if (moneyMovementFiDTO != null && !emptyList.isEmpty()) {
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.savings.domain.util.FinancialInstrumentOrderingHelper.INSTANCE.orderFinancialInstruments(moneyMovementFiDTO, emptyList));
            }
            if (moneyMovementFiDTO != null) {
                return arrow.core.EitherKt.right(kotlin.collections.CollectionsKt.listOf(moneyMovementFiDTO));
            }
            if (!emptyList.isEmpty()) {
                return arrow.core.EitherKt.right(emptyList);
            }
            return arrow.core.EitherKt.right(kotlin.collections.CollectionsKt.emptyList());
        }
        deferred2 = (kotlinx.coroutines.Deferred) this.getOutputMinFrameDuration;
        kotlinx.coroutines.Deferred deferred4 = (kotlinx.coroutines.Deferred) this.getInputFormats;
        com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput = (com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput) this.getHighSpeedVideoSizesFor;
        money = (com.paypal.oslo.feature.savings.domain.model.transfers.Money) this.getHighResolutionOutputSizeshNQ4ISI;
        str2 = (java.lang.String) this.getHighSpeedVideoFpsRangesFor;
        str = (java.lang.String) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        copy$default = depositOptionsInput;
        deferred3 = deferred4;
        await = obj;
        either = (arrow.core.Either) await;
        if (deferred2 != null) {
            this.getOutputMinFrameDurationlomOqCM = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str2);
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(money);
            this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(copy$default);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred3);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deferred2);
            this.getOutputFormats = either;
            this.getInputSizeshNQ4ISI = 2;
            await2 = deferred2.await(this);
        } else {
            either2 = null;
            com.paypal.oslo.feature.savings.domain.model.SavingsError[] savingsErrorArr2 = new com.paypal.oslo.feature.savings.domain.model.SavingsError[2];
            savingsErrorArr2[0] = either.leftOrNull();
            savingsErrorArr2[1] = either2 == null ? (com.paypal.oslo.feature.savings.domain.model.SavingsError) either2.leftOrNull() : null;
            savingsError = (com.paypal.oslo.feature.savings.domain.model.SavingsError) kotlin.collections.CollectionsKt.firstOrNull(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) savingsErrorArr2));
            if (savingsError == null) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.savings.domain.model.SavingsError, ? extends java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.moneymovement.MoneyMovementFiDTO>>> continuation) {
        return ((com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2 getFinancialInstrumentsUseCase$invoke$2 = new com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getOutputSizes, continuation);
        getFinancialInstrumentsUseCase$invoke$2.getOutputMinFrameDurationlomOqCM = obj;
        return getFinancialInstrumentsUseCase$invoke$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetFinancialInstrumentsUseCase$invoke$2(com.paypal.oslo.feature.savings.domain.model.DepositOptionsInput depositOptionsInput, boolean z, com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase getFinancialInstrumentsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.domain.usecase.GetFinancialInstrumentsUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = depositOptionsInput;
        this.getHighSpeedVideoFpsRanges = z;
        this.getOutputSizes = getFinancialInstrumentsUseCase;
    }
}
