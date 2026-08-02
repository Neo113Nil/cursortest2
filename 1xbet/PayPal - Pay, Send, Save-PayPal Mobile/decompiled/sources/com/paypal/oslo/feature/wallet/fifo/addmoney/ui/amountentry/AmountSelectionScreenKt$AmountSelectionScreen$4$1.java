package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1", f = "AmountSelectionScreen.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AmountSelectionScreenKt$AmountSelectionScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats.getAddMoneyEligibility();
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputFormats.getUiEvent(), new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/amountentry/AmountSelectionEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1$1", f = "AmountSelectionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
        int getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent amountSelectionEvent = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent) this.getHighSpeedVideoSizesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(amountSelectionEvent instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(amountSelectionEvent, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.NavigateToCIP.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.wallet.LoggerKt.log, "navigating to CIP flow", null, null, 6, null);
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                this.Camera2StreamConfigurationMap.setValue(((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount) amountSelectionEvent).getAmount());
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
                java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                final com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig = this.getHighSpeedVideoSizes;
                final androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.Camera2StreamConfigurationMap;
                appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.AddMoneyNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.this, amountSelectionEvent, mutableState, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent amountSelectionEvent, androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.wallet.wallet.ui.Destination.AddMoneyReviewDestination(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt.access$AmountSelectionScreen$lambda$1(mutableState), com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig.copy$default(addMoneyConfig, null, null, false, false, ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent.SubmitAmount) amountSelectionEvent).getAddFIFlowType(), 15, null), (java.util.List) null, (java.util.List) null, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination(new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AddFunds(new com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext("wallet_add_funds", (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null))));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionEvent amountSelectionEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1) create(amountSelectionEvent, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, androidx.compose.runtime.MutableState<java.lang.String> mutableState, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = str2;
            this.Camera2StreamConfigurationMap = mutableState;
            this.getHighSpeedVideoSizes = addMoneyConfig;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1(this.getOutputFormats, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmountSelectionScreenKt$AmountSelectionScreen$4$1(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionViewModel amountSelectionViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, androidx.compose.runtime.MutableState<java.lang.String> mutableState, com.paypal.oslo.feature.wallet.api.ui.addmoney.AddMoneyConfig addMoneyConfig, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.fifo.addmoney.ui.amountentry.AmountSelectionScreenKt$AmountSelectionScreen$4$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = amountSelectionViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.Camera2StreamConfigurationMap = addMoneyConfig;
    }
}
