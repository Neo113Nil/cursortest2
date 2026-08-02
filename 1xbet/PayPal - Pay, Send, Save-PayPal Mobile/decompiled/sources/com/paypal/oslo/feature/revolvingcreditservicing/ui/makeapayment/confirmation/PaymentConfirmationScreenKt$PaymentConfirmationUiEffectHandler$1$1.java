package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1", f = "PaymentConfirmationScreen.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, nl = {100}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/confirmation/viewmodel/PaymentConfirmationUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1$1", f = "PaymentConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect paymentConfirmationUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(paymentConfirmationUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect.NavigateToAccountSummary)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighResolutionOutputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect.NavigateToAccountSummary) paymentConfirmationUiEffect).getCreditProductIdentifier());
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationUiEffect paymentConfirmationUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1.AnonymousClass1) create(paymentConfirmationUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationViewModel paymentConfirmationViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.PaymentConfirmationScreenKt$PaymentConfirmationUiEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = paymentConfirmationViewModel;
        this.Camera2StreamConfigurationMap = function1;
    }
}
