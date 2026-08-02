package com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1", f = "CancelCardReasonSelectionScreen.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, nl = {102}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.feature.debitcard.shared.analytics.DebitCardScreenTrackerKt.trackDebitCardScreen$default(com.paypal.oslo.feature.debitcard.shared.analytics.CancelCardReasonSelectionAnalytics.SCREEN_ID, this.getHighSpeedVideoFpsRangesFor, null, null, 12, null);
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/cancelcard/mvi/CancelCardReasonSelectionEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1$1", f = "CancelCardReasonSelectionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect cancelCardReasonSelectionEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect) this.getHighSpeedVideoFpsRanges;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (cancelCardReasonSelectionEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateToConfirmation) {
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel = this.getHighSpeedVideoSizes;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.this, cancelCardReasonSelectionViewModel, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(cancelCardReasonSelectionEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect cancelCardReasonSelectionEffect, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.debitcard.servicing.di.CancelCardConfirmationDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect.NavigateToConfirmation) cancelCardReasonSelectionEffect).getReason().name(), cancelCardReasonSelectionViewModel.getCancelCardInfo()));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.mvi.CancelCardReasonSelectionEffect cancelCardReasonSelectionEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1) create(cancelCardReasonSelectionEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoSizes = cancelCardReasonSelectionViewModel;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1(com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext userIntentContext, com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.viewmodel.CancelCardReasonSelectionViewModel cancelCardReasonSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.cancelcard.CancelCardReasonSelectionScreenKt$CancelCardReasonSelectionScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = userIntentContext;
        this.getHighResolutionOutputSizeshNQ4ISI = cancelCardReasonSelectionViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
    }
}
