package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1", f = "ChooseSecondaryPaymentScreen.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, nl = {80}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/taptopay/ui/shared/defaultpayment/model/ChooseSecondaryPaymentEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1$1", f = "ChooseSecondaryPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect chooseSecondaryPaymentEffect = (com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect) this.getHighSpeedVideoFpsRangesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(chooseSecondaryPaymentEffect, com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect.SetupComplete.INSTANCE)) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(chooseSecondaryPaymentEffect, com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect.SetupDismissed.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.model.ChooseSecondaryPaymentEffect chooseSecondaryPaymentEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1.AnonymousClass1) create(chooseSecondaryPaymentEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
            this.getHighSpeedVideoSizes = function02;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getEffects(), new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1(com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentViewModel chooseSecondaryPaymentViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseSecondaryPaymentScreenKt$ChooseSecondaryPaymentScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = chooseSecondaryPaymentViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoSizes = function02;
    }
}
