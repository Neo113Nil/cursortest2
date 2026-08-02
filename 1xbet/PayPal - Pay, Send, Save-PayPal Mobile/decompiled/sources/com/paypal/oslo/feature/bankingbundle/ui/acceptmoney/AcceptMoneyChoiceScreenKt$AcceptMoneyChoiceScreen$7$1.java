package com.paypal.oslo.feature.bankingbundle.ui.acceptmoney;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1", f = "AcceptMoneyChoiceScreen.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, nl = {161}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bankingbundle/ui/acceptmoney/mvi/AcceptMoneyChoiceEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1$1", f = "AcceptMoneyChoiceScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect acceptMoneyChoiceEffect = (com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (acceptMoneyChoiceEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.invoke();
            } else if (acceptMoneyChoiceEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateToKeepInPayPal) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (acceptMoneyChoiceEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.NavigateToTransferToBank) {
                this.getHighSpeedVideoFpsRangesFor.invoke();
            } else {
                if (!(acceptMoneyChoiceEffect instanceof com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect.ShowTerms)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.mvi.AcceptMoneyChoiceEffect acceptMoneyChoiceEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1.AnonymousClass1) create(acceptMoneyChoiceEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = function0;
            this.Camera2StreamConfigurationMap = function02;
            this.getHighSpeedVideoFpsRangesFor = function03;
            this.getHighSpeedVideoSizes = function04;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collect(kotlinx.coroutines.flow.FlowKt.onEach(this.getHighResolutionOutputSizeshNQ4ISI.getEffect(), new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, null)), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1(com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.viewmodel.AcceptMoneyChoiceViewModel acceptMoneyChoiceViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bankingbundle.ui.acceptmoney.AcceptMoneyChoiceScreenKt$AcceptMoneyChoiceScreen$7$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = acceptMoneyChoiceViewModel;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = function02;
        this.getHighSpeedVideoFpsRangesFor = function03;
        this.getHighSpeedVideoFpsRanges = function04;
    }
}
