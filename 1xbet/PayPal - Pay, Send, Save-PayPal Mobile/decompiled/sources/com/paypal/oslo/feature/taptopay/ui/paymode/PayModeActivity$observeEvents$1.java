package com.paypal.oslo.feature.taptopay.ui.paymode;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1", f = "PayModeActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class PayModeActivity$observeEvents$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1$1", f = "PayModeActivity.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighSpeedVideoFpsRanges;

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01511<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity getHighSpeedVideoFpsRangesFor;

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                boolean z;
                boolean z2;
                com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents payModeEvents = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents) obj;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Received event: ".concat(java.lang.String.valueOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(payModeEvents.getClass()).getSimpleName())), null, null, 6, null);
                if (payModeEvents instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.PromptReAuthEvent) {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    z = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.android.logger.Logger.d$default(logger, "PromptReAuthEvent received - isPaymentCardScreenReady=".concat(java.lang.String.valueOf(z)), null, null, 6, null);
                    z2 = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                    if (!z2) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Deferring auth - payment card screen not ready yet", null, null, 6, null);
                        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = true;
                    } else {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Screen ready - handling auth immediately", null, null, 6, null);
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
                    }
                } else if (payModeEvents instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.AuthenticationExpiredEvent) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Authentication expired - showing system auth prompt", null, null, 6, null);
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.LifecycleOwnerKt.getLifecycleScope(r7), null, null, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$handleAuthExpiredEvent$1(this.getHighSpeedVideoFpsRangesFor, null), 3, null);
                } else if (payModeEvents instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DismissPayModeEvent) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Dismiss pay mode event received", null, null, 6, null);
                    this.getHighSpeedVideoFpsRangesFor.finishAndRemoveTask();
                } else if (payModeEvents instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.NoActiveCardsFound) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "No active cards found - navigating to setup flow", null, null, 6, null);
                    this.getHighSpeedVideoFpsRangesFor.getAppNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1.C01511.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                    this.getHighSpeedVideoFpsRangesFor.finishAndRemoveTask();
                } else if (payModeEvents instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PayModeEvents.DeviceCompromisedEvent) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Device compromised - dismissing pay mode", null, null, 6, null);
                    this.getHighSpeedVideoFpsRangesFor.finishAndRemoveTask();
                }
                return kotlin.Unit.INSTANCE;
            }

            public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
                navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination((com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo) null, (com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint) null, (java.lang.String) null, (java.lang.String) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                return kotlin.Unit.INSTANCE;
            }

            C01511(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity) {
                this.getHighSpeedVideoFpsRangesFor = payModeActivity;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.access$getViewModel(this.getHighSpeedVideoFpsRanges).getEvents().collect(new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1.C01511(this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = payModeActivity;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.view.RepeatOnLifecycleKt.repeatOnLifecycle(this.getHighResolutionOutputSizeshNQ4ISI, androidx.lifecycle.Lifecycle.State.STARTED, new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeActivity$observeEvents$1(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity payModeActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity$observeEvents$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = payModeActivity;
    }
}
