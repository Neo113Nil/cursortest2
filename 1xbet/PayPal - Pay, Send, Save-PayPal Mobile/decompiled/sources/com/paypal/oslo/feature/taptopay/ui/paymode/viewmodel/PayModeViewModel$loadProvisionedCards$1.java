package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$loadProvisionedCards$1", f = "PayModeViewModel.kt", i = {2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4}, l = {150, 154, 161, 163, 157}, m = "invokeSuspend", n = {"this_$iv", "paypalCardList", "$i$f$fold", "$i$a$-fold-PayModeViewModel$loadProvisionedCards$1$2", "this_$iv", "paypalCardList", "sortedPayPalCards", "$i$f$fold", "$i$a$-fold-PayModeViewModel$loadProvisionedCards$1$2", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-PayModeViewModel$loadProvisionedCards$1$1"}, nl = {151, 710, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, s = {"L$0", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$loadProvisionedCards$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0107, code lost:
    
        if (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$handleCardsLoaded(r7, r3, r6, r17) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0143, code lost:
    
        if (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$handleCardLoadError(r7, r2, r17) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        if (r2 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        if (r2 != r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object access$performDeviceValidation;
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase;
        java.lang.Object invoke$default;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel;
        com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState;
        int i;
        com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter cardPrioritySorter;
        java.lang.Object sortCardsByPriority;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list;
        int i2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getOutputFormats;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            access$performDeviceValidation = com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$performDeviceValidation(this.getHighSpeedVideoSizesFor, this);
        } else if (i3 == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            access$performDeviceValidation = obj;
        } else {
            if (i3 == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
                invoke$default = obj;
                either = (arrow.core.Either) invoke$default;
                payModeViewModel = this.getHighSpeedVideoSizesFor;
                paymentState = this.getHighSpeedVideoSizes;
                i = 0;
                if (either instanceof arrow.core.Either.Right) {
                    java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list2 = (java.util.List) ((arrow.core.Either.Right) either).getValue();
                    cardPrioritySorter = payModeViewModel.getOutputFormats;
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighResolutionOutputSizeshNQ4ISI = payModeViewModel;
                    this.getInputFormats = paymentState;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getOutputFormats = 3;
                    sortCardsByPriority = cardPrioritySorter.sortCardsByPriority(list2, this);
                    if (sortCardsByPriority != coroutine_suspended) {
                        list = list2;
                        i2 = 0;
                        java.util.List list3 = (java.util.List) sortCardsByPriority;
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        int size = list3.size();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Loaded and sorted ");
                        sb.append(size);
                        sb.append(" cards");
                        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), null, null, 6, null);
                        this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                        this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                        this.getInputSizeshNQ4ISI = null;
                        this.getHighSpeedVideoFpsRanges = i;
                        this.getHighSpeedVideoFpsRangesFor = i2;
                        this.getOutputFormats = 4;
                    }
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError payPalGetAllCardsError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalGetAllCardsError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Failed to load cards: ".concat(java.lang.String.valueOf(payPalGetAllCardsError)), null, null, null, 14, null);
                    this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(payPalGetAllCardsError);
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    this.getOutputFormats = 5;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            if (i3 == 3) {
                i2 = this.getHighSpeedVideoFpsRangesFor;
                int i4 = this.getHighSpeedVideoFpsRanges;
                list = (java.util.List) this.getInputSizeshNQ4ISI;
                paymentState = (com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) this.getInputFormats;
                payModeViewModel = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) this.getHighResolutionOutputSizeshNQ4ISI;
                either = (arrow.core.Either) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                i = i4;
                sortCardsByPriority = obj;
                java.util.List list32 = (java.util.List) sortCardsByPriority;
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                int size2 = list32.size();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Loaded and sorted ");
                sb2.append(size2);
                sb2.append(" cards");
                com.paypal.android.logger.Logger.d$default(logger2, sb2.toString(), null, null, 6, null);
                this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list32);
                this.getInputSizeshNQ4ISI = null;
                this.getHighSpeedVideoFpsRanges = i;
                this.getHighSpeedVideoFpsRangesFor = i2;
                this.getOutputFormats = 4;
            } else {
                if (i3 == 4) {
                } else {
                    if (i3 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
        }
        if (((java.lang.Boolean) access$performDeviceValidation).booleanValue()) {
            payPalGetAllCardsUseCase = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
            this.getOutputFormats = 2;
            invoke$default = com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase.invoke$default(payPalGetAllCardsUseCase, true, false, this, 2, null);
        } else {
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$loadProvisionedCards$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$loadProvisionedCards$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$loadProvisionedCards$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState paymentState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$loadProvisionedCards$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = payModeViewModel;
        this.getHighSpeedVideoSizes = paymentState;
    }
}
