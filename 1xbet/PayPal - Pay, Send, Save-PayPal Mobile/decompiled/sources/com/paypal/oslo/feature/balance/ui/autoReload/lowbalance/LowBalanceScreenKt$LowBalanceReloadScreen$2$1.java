package com.paypal.oslo.feature.balance.ui.autoReload.lowbalance;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1", f = "LowBalanceScreen.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, nl = {140}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class LowBalanceScreenKt$LowBalanceReloadScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/balance/ui/autoReload/lowbalance/LowBalanceEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1", f = "LowBalanceScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect lowBalanceEffect = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (lowBalanceEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenThresholdAmountBottomSheet) {
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenThresholdAmountBottomSheet openThresholdAmountBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenThresholdAmountBottomSheet) lowBalanceEffect;
                final com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination = new com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination(openThresholdAmountBottomSheet.getIntent(), openThresholdAmountBottomSheet.getCurrencyCode(), openThresholdAmountBottomSheet.getMinimumAmount(), openThresholdAmountBottomSheet.getMaximumAmount(), openThresholdAmountBottomSheet.getOptions(), openThresholdAmountBottomSheet.getFormattedMinimum(), openThresholdAmountBottomSheet.getFormattedMaximum(), openThresholdAmountBottomSheet.getFormattedOptions());
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (lowBalanceEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenRechargeAmountBottomSheet) {
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenRechargeAmountBottomSheet openRechargeAmountBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenRechargeAmountBottomSheet) lowBalanceEffect;
                final com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination2 = new com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination(openRechargeAmountBottomSheet.getIntent(), openRechargeAmountBottomSheet.getCurrencyCode(), openRechargeAmountBottomSheet.getMinimumAmount(), openRechargeAmountBottomSheet.getMaximumAmount(), openRechargeAmountBottomSheet.getOptions(), openRechargeAmountBottomSheet.getFormattedMinimum(), openRechargeAmountBottomSheet.getFormattedMaximum(), openRechargeAmountBottomSheet.getFormattedOptions());
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (lowBalanceEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenReviewBottomSheet) {
                com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenReviewBottomSheet openReviewBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.OpenReviewBottomSheet) lowBalanceEffect;
                final com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination = new com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination(openReviewBottomSheet.getStrategy(), openReviewBottomSheet.getCurrencyCode(), openReviewBottomSheet.getFlowType());
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(lowBalanceEffect, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.GoBackWithTurnOffResult.INSTANCE)) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lowBalanceEffect, com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect.NavigateBack.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.setResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.INSTANCE, new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.LowBalanceReload.INSTANCE)));
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.AutoReloadFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(autoReloadReviewDestination);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(autoReloadAmountDestination);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(autoReloadAmountDestination);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceEffect lowBalanceEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1) create(lowBalanceEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getEffect(), new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LowBalanceScreenKt$LowBalanceReloadScreen$2$1(com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceViewModel lowBalanceViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.lowbalance.LowBalanceScreenKt$LowBalanceReloadScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lowBalanceViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
