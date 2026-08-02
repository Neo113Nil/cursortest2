package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1", f = "SavingsHomeActionHandlers.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    final /* synthetic */ java.lang.String getOutputStallDurationlomOqCM;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1$1", f = "SavingsHomeActionHandlers.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType, kotlin.Unit> getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getOutputMinFrameDuration;
        /* synthetic */ java.lang.Object getOutputMinFrameDurationlomOqCM;
        final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel getOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getOutputStallDuration;
        int getOutputStallDurationlomOqCM;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect savingsHomeEffect = (com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect) this.getOutputMinFrameDurationlomOqCM;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputStallDurationlomOqCM != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast)) {
                if ((savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToTransferMoney) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoney) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToSmartRoute) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSave) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAutoSaveManage) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToInterestEarnings) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToCreateGoal) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToGoalDetails) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToEducationalDetails) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyGeneralSavings) || (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.NavigateToAddMoneyWithFiType)) {
                    com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt.m18857access$handleNavigationEffectsj8EdedY(savingsHomeEffect, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputFormats);
                } else if (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowSavingsStatementsInfo) {
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowFdicInsurance) {
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else if (savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference) {
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getOutputStallDuration, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.TaxStatementPreferenceNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(savingsHomeEffect instanceof com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.TriggerTileRetry)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt.access$handleTriggerTileRetry();
                }
            } else {
                this.getOutputMinFrameDuration.invoke(((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowToast) savingsHomeEffect).getMessage());
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect savingsHomeEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            java.lang.Boolean currentPreference = ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect.ShowTaxStatementDeliveryPreference) savingsHomeEffect).getCurrentPreference();
            navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.TaxStatementDeliveryPreferenceSheetDestination(currentPreference != null ? currentPreference.booleanValue() : false));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.savings.di.navigation.FdicInsuranceSheetDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.savings.di.navigation.SavingsStatementsSheetDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.savings.ui.home.SavingsHomeEffect savingsHomeEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1) create(savingsHomeEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1(this.getOutputMinFrameDuration, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizesFor, this.getInputSizeshNQ4ISI, this.getInputFormats, this.getOutputFormats, this.getOutputStallDuration, continuation);
            anonymousClass1.getOutputMinFrameDurationlomOqCM = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str6, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getOutputMinFrameDuration = function1;
            this.getOutputSizeshNQ4ISI = savingsHomeViewModel;
            this.getHighSpeedVideoSizes = appNavigator;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighResolutionOutputSizeshNQ4ISI = str3;
            this.Camera2StreamConfigurationMap = str4;
            this.getHighSpeedVideoSizesFor = str5;
            this.getInputSizeshNQ4ISI = function12;
            this.getInputFormats = function0;
            this.getOutputFormats = function02;
            this.getOutputStallDuration = str6;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputStallDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputSizeshNQ4ISI.getUiEffect(), new com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1.AnonymousClass1(this.getInputFormats, this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1(this.getOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getOutputStallDurationlomOqCM, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType, kotlin.Unit> function12, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str6, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt$SavingsHomeEffectHandler$4$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = savingsHomeViewModel;
        this.getInputFormats = function1;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighResolutionOutputSizeshNQ4ISI = str4;
        this.getHighSpeedVideoSizesFor = str5;
        this.getOutputFormats = function12;
        this.getOutputMinFrameDuration = function0;
        this.getInputSizeshNQ4ISI = function02;
        this.getOutputStallDurationlomOqCM = str6;
    }
}
