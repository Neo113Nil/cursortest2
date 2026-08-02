package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1", f = "MakeAPaymentScreen.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentScreenKt$EffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1$1", f = "MakeAPaymentScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> getHighSpeedVideoSizes;
        int getInputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect makeAPaymentUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (kotlin.jvm.internal.Intrinsics.areEqual(makeAPaymentUiEffect, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.Back.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (makeAPaymentUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess) {
                com.paypal.oslo.core.commonui.utils.RefText successText = ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToPaymentSuccess) makeAPaymentUiEffect).getUiModel().getSuccessText();
                java.lang.String value = successText != null ? com.paypal.oslo.core.commonui.utils.RefTextKt.value(successText, this.getHighSpeedVideoFpsRangesFor) : null;
                if (value == null) {
                    value = "";
                }
                final com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult paymentSuccessNavResult = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult(value);
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!(makeAPaymentUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.NavigateToChangePaymentMethod)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(makeAPaymentUiEffect, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.ShowPaymentError.INSTANCE)) {
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke();
                } else {
                    if (!(makeAPaymentUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoSizes.invoke(((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect.OpenPaymentAuthorization) makeAPaymentUiEffect).getModel());
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult paymentSuccessNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(paymentSuccessNavResult);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect makeAPaymentUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1) create(makeAPaymentUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = context;
            this.getHighResolutionOutputSizeshNQ4ISI = function0;
            this.getHighSpeedVideoSizes = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes, new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MakeAPaymentScreenKt$EffectHandler$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiEffect> flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentScreenKt$EffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = flow;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.Camera2StreamConfigurationMap = context;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
