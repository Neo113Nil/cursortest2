package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1", f = "PayModeViewModel.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {715, 430}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$this$launch", "$this$withLock_u24default$iv", "$i$f$withLock", "$i$a$-withLock$default-PayModeViewModel$activateDefaultCard$1$1"}, nl = {716, 433}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$activateDefaultCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00aa A[Catch: all -> 0x0029, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:7:0x0024, B:8:0x00a1, B:11:0x00aa, B:12:0x0111, B:18:0x00c2, B:21:0x00dc, B:23:0x00f4, B:25:0x00fa, B:26:0x0100, B:28:0x010e, B:30:0x011e, B:31:0x0123), top: B:6:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.sync.Mutex mutex;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard;
        kotlinx.coroutines.sync.Mutex mutex2;
        int i;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2;
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard3;
        kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard4;
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel2;
        kotlinx.coroutines.sync.Mutex mutex3;
        arrow.core.Either either;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard5;
        com.paypal.oslo.feature.taptopay.domain.model.card.DigitizedCard digitizedCard;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        try {
            if (i2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                mutex = this.getOutputFormats.coroutineBoundary;
                com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel3 = this.getOutputFormats;
                payPalDigitizedCard = this.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard6 = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = coroutineScope;
                this.Camera2StreamConfigurationMap = mutex;
                this.getInputSizeshNQ4ISI = payModeViewModel3;
                this.getHighSpeedVideoSizesFor = payPalDigitizedCard;
                this.getOutputMinFrameDuration = payPalDigitizedCard6;
                this.getHighSpeedVideoSizes = 0;
                this.getInputFormats = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                    mutex2 = mutex;
                    i = 0;
                    payPalDigitizedCard2 = payPalDigitizedCard6;
                    payModeViewModel = payModeViewModel3;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                payPalDigitizedCard4 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) this.getOutputMinFrameDuration;
                payPalDigitizedCard3 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) this.getHighSpeedVideoSizesFor;
                payModeViewModel2 = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) this.getInputSizeshNQ4ISI;
                mutex3 = (kotlinx.coroutines.sync.Mutex) this.Camera2StreamConfigurationMap;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    either = (arrow.core.Either) obj;
                    kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
                    if (!(either instanceof arrow.core.Either.Right)) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Default card updated in SDK successfully", null, null, 6, null);
                    } else if (either instanceof arrow.core.Either.Left) {
                        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError payPalSetDefaultCardError = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalSetDefaultCardError) ((arrow.core.Either.Left) either).getValue();
                        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(payPalSetDefaultCardError.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "UnknownError";
                        }
                        com.paypal.android.logger.Logger.w$default(logger, "Failed to set default card in SDK", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName)), null, 4, null);
                        payPalDigitizedCard5 = payModeViewModel2.isOutputSupportedForhNQ4ISI;
                        if (kotlin.jvm.internal.Intrinsics.areEqual((payPalDigitizedCard5 == null || (digitizedCard = payPalDigitizedCard5.getDigitizedCard()) == null) ? null : digitizedCard.getCardId(), payPalDigitizedCard3.getDigitizedCard().getCardId())) {
                            com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$revertCardSelection(payModeViewModel2, payPalDigitizedCard4);
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    mutex3.unlock(null);
                    this.getOutputFormats.getHighSpeedVideoSizes((com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) null);
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    th = th;
                    mutex2 = mutex3;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            int i3 = this.getHighSpeedVideoSizes;
            payPalDigitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) this.getOutputMinFrameDuration;
            payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) this.getHighSpeedVideoSizesFor;
            payModeViewModel = (com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel) this.getInputSizeshNQ4ISI;
            mutex2 = (kotlinx.coroutines.sync.Mutex) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            i = i3;
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
            coroutineDispatcher = payModeViewModel.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1$1$result$1 payModeViewModel$activateDefaultCard$1$1$result$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1$1$result$1(payModeViewModel, payPalDigitizedCard3, null);
            this.getOutputSizes = coroutineScope;
            this.Camera2StreamConfigurationMap = mutex2;
            this.getInputSizeshNQ4ISI = payModeViewModel;
            this.getHighSpeedVideoSizesFor = payPalDigitizedCard3;
            this.getOutputMinFrameDuration = payPalDigitizedCard2;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputFormats = 2;
            obj = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, payModeViewModel$activateDefaultCard$1$1$result$1, this);
            if (obj != coroutine_suspended) {
                payPalDigitizedCard4 = payPalDigitizedCard2;
                payModeViewModel2 = payModeViewModel;
                mutex3 = mutex2;
                either = (arrow.core.Either) obj;
                kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
                if (!(either instanceof arrow.core.Either.Right)) {
                }
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                mutex3.unlock(null);
                this.getOutputFormats.getHighSpeedVideoSizes((com.paypal.oslo.feature.taptopay.domain.model.payment.PaymentState) null);
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (java.lang.Throwable th2) {
            th = th2;
            mutex2.unlock(null);
            throw th;
        }
        payPalDigitizedCard3 = payPalDigitizedCard;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1 payModeViewModel$activateDefaultCard$1 = new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1(this.getOutputFormats, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        payModeViewModel$activateDefaultCard$1.getOutputSizes = obj;
        return payModeViewModel$activateDefaultCard$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$activateDefaultCard$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$activateDefaultCard$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = payModeViewModel;
        this.getHighSpeedVideoFpsRanges = payPalDigitizedCard;
        this.getHighResolutionOutputSizeshNQ4ISI = payPalDigitizedCard2;
    }
}
