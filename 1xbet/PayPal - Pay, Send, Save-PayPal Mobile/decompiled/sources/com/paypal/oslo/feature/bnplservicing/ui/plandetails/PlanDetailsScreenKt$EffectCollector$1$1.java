package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1", f = "PlanDetailsScreen.kt", i = {}, l = {327}, m = "invokeSuspend", n = {}, nl = {357}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class PlanDetailsScreenKt$EffectCollector$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel, kotlin.Unit> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel, kotlin.Unit> getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs, kotlin.Unit> getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> getInputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel, kotlin.Unit> getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel, kotlin.Unit> getOutputFormats;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect planDetailsUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect) obj;
            if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule) {
                this.getHighSpeedVideoFpsRangesFor.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPaymentSchedule) planDetailsUiEffect).getPaymentScheduleUiModel());
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment) {
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip) {
                this.getInputFormats.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTooltip) planDetailsUiEffect).getItem());
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet) {
                this.Camera2StreamConfigurationMap.invoke(planDetailsUiEffect);
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet) {
                this.getInputSizeshNQ4ISI.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowUsedVccHalfSheet) planDetailsUiEffect).getModel());
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet) {
                this.getHighSpeedVideoFpsRanges.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowDocumentsHalfSheet) planDetailsUiEffect).getModel());
            } else if (planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet) {
                this.getOutputFormats.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowTurnOffAutopaySheet) planDetailsUiEffect).getModel());
            } else {
                if (!(planDetailsUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizesFor.invoke(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowSnoozeHalfSheet) planDetailsUiEffect).getArgs());
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect planDetailsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplservicing.navigation.MakeAPaymentDestination(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.NavigateToMakePayment) planDetailsUiEffect).getPlanId(), com.paypal.oslo.feature.bnplservicing.common.PayLaterSource.PlanDetails.INSTANCE.getValue()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect planDetailsUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.bnplservicing.ui.makepayment.navigation.result.PaymentSuccessNavResult(((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.SendPaymentSuccessResult) planDetailsUiEffect).getMessage()));
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel, kotlin.Unit> function1, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function15, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel, kotlin.Unit> function16, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs, kotlin.Unit> function17) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getHighSpeedVideoSizes = str;
            this.getInputFormats = function12;
            this.Camera2StreamConfigurationMap = function13;
            this.getInputSizeshNQ4ISI = function14;
            this.getHighSpeedVideoFpsRanges = function15;
            this.getOutputFormats = function16;
            this.getHighSpeedVideoSizesFor = function17;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputSizeshNQ4ISI = 1;
            if (this.getInputSizeshNQ4ISI.collect(new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PlanDetailsScreenKt$EffectCollector$1$1(kotlinx.coroutines.flow.Flow<? extends com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect> flow, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.paymentschedule.PaymentScheduleUiModel, kotlin.Unit> function1, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanSummaryItem, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsUiEffect.ShowPayIn30InfoSheet, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.VirtualCardModel, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.document.DocumentsHalfSheetModel, kotlin.Unit> function15, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel, kotlin.Unit> function16, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.snooze.SnoozeHalfSheetArgs, kotlin.Unit> function17, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.PlanDetailsScreenKt$EffectCollector$1$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = flow;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = str;
        this.getOutputFormats = function12;
        this.getHighSpeedVideoFpsRangesFor = function13;
        this.getHighSpeedVideoSizesFor = function14;
        this.getHighResolutionOutputSizeshNQ4ISI = function15;
        this.getOutputMinFrameDuration = function16;
        this.getInputFormats = function17;
    }
}
