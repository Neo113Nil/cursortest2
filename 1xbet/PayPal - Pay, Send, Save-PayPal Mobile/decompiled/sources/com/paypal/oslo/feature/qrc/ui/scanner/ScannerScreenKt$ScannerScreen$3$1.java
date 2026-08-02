package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1", f = "ScannerScreen.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSuspend", n = {}, nl = {236}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$ScannerScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect scannerUiEffect = (com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect) obj;
            if (scannerUiEffect instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview) {
                this.Camera2StreamConfigurationMap.invoke();
                com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.access$triggerHapticFeedback(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (scannerUiEffect instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount) {
                this.Camera2StreamConfigurationMap.invoke();
                com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.access$triggerHapticFeedback(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (scannerUiEffect instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment) {
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.navigation.result.EnrollmentNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (scannerUiEffect instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowLocationMismatch) {
                this.Camera2StreamConfigurationMap.invoke();
                this.getHighSpeedVideoFpsRanges.showSheet();
            } else if (!(scannerUiEffect instanceof com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.ShowValidationError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect scannerUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.QrcEnterAmountDestination(((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnterAmount) scannerUiEffect).getNavArgs()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect scannerUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.QrcEnrollmentDestination(((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToEnrollment) scannerUiEffect).getNavArgs()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect scannerUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.qrc.navigation.QrcPaymentReviewDestination(((com.paypal.oslo.feature.qrc.ui.scanner.ScannerUiEffect.NavigateToReview) scannerUiEffect).getNavArgs()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController) {
            this.Camera2StreamConfigurationMap = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = context;
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = bottomSheetController;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (this.getOutputMinFrameDuration.getUiEffect().collect(new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1(this.getOutputMinFrameDuration, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScannerScreenKt$ScannerScreen$3$1(com.paypal.oslo.feature.qrc.ui.scanner.ScannerViewModel scannerViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$ScannerScreen$3$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = scannerViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
    }
}
