package com.paypal.oslo.feature.debitcard.servicing.ui.debitpin;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1", f = "DebitPinScreen.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, nl = {136}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitPinScreenKt$DebitPinScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect debitPinEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect) obj;
            if (debitPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBack) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (debitPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.NavigateBackWithSuccess) {
                    com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState access$DebitPinScreen$lambda$1 = com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt.access$DebitPinScreen$lambda$1(this.getHighSpeedVideoFpsRangesFor);
                    com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success success = access$DebitPinScreen$lambda$1 instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success ? (com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState.Success) access$DebitPinScreen$lambda$1 : null;
                    java.lang.String pin = success != null ? success.getPin() : null;
                    if (pin == null) {
                        pin = "";
                    }
                    this.Camera2StreamConfigurationMap.invoke(pin);
                    if (!this.getHighSpeedVideoSizes.getIsOnboardingFlow()) {
                        final java.lang.String str = this.getHighSpeedVideoSizes.getPinMode() == com.paypal.oslo.feature.debitcard.servicing.domain.debitpin.model.DebitPinMode.COLLECT_PIN ? pin : null;
                        this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(str, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                            }
                        });
                    }
                } else if (debitPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(debitPinEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.FocusConfirmPinField)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    kotlin.coroutines.jvm.internal.Boxing.boxBoolean(androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighResolutionOutputSizeshNQ4ISI, 0, 1, null));
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult(false, (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult(true, (java.lang.String) null, str, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect debitPinEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.debitcard.servicing.navigation.result.DebitPinNavResult(false, ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinEffect.ShowError) debitPinEffect).getMessage(), (java.lang.String) null, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel debitPinViewModel, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState> state) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.Camera2StreamConfigurationMap = function1;
            this.getHighSpeedVideoSizes = debitPinViewModel;
            this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
            this.getHighSpeedVideoFpsRangesFor = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitPinScreenKt$DebitPinScreen$3$1(com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.viewmodel.DebitPinViewModel debitPinViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.mvi.DebitPinState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.debitpin.DebitPinScreenKt$DebitPinScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = debitPinViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = focusRequester;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
