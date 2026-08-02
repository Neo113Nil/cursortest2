package com.paypal.oslo.feature.balance.ui.autoReload.scheduled;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1", f = "AutoReloadScheduledScreen.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/balance/ui/autoReload/scheduled/AutoReloadScheduledEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1", f = "AutoReloadScheduledScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect autoReloadScheduledEffect = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (autoReloadScheduledEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet) {
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet openScheduledAmountBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledAmountBottomSheet) autoReloadScheduledEffect;
                final com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination = new com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination(openScheduledAmountBottomSheet.getIntent(), openScheduledAmountBottomSheet.getCurrencyCode(), openScheduledAmountBottomSheet.getMinimumAmount(), openScheduledAmountBottomSheet.getMaximumAmount(), openScheduledAmountBottomSheet.getOptions(), openScheduledAmountBottomSheet.getFormattedMinimum(), openScheduledAmountBottomSheet.getFormattedMaximum(), openScheduledAmountBottomSheet.getFormattedOptions());
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges.getAmountScheduledRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.result.AutoReloadAmountNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (autoReloadScheduledEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet) {
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges.getFrequencyScheduledRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.navigation.result.AutoReloadFrequencyNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (autoReloadScheduledEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet) {
                com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet openReviewBottomSheet = (com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenReviewBottomSheet) autoReloadScheduledEffect;
                final com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination = new com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination(openReviewBottomSheet.getStrategy(), openReviewBottomSheet.getCurrencyCode(), openReviewBottomSheet.getFlowType());
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(autoReloadScheduledEffect instanceof com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.TurnOffAutoReloadResult)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.setResult(new com.paypal.oslo.feature.balance.api.navigation.result.AutoReloadFlowNavResult(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.INSTANCE, new com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadTransferSettings.Cancelled(com.paypal.oslo.feature.balance.api.models.autoreload.AutoReloadFlowIntent.ScheduledReload.INSTANCE)));
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.balance.api.navigation.AutoReloadFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.balance.navigation.AutoReloadAmountDestination autoReloadAmountDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(autoReloadAmountDestination);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.balance.navigation.AutoReloadReviewDestination autoReloadReviewDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(autoReloadReviewDestination);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect autoReloadScheduledEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.balance.navigation.AutoReloadFrequencyDestination(((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect.OpenScheduledFrequencyBottomSheet) autoReloadScheduledEffect).getFrequency()));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledEffect autoReloadScheduledEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1) create(autoReloadScheduledEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRanges = autoReloadScheduledViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getEffect(), new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1(com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledViewModel autoReloadScheduledViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.scheduled.AutoReloadScheduledScreenKt$AutoReloadScheduledScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = autoReloadScheduledViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
