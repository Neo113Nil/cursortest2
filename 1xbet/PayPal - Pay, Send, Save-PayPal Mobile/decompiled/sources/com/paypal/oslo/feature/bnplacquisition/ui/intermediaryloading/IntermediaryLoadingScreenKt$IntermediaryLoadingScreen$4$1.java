package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1", f = "IntermediaryLoadingScreen.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, nl = {96}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect intermediaryLoadingUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect) obj;
            if (intermediaryLoadingUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (intermediaryLoadingUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToEnterAmount) {
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (intermediaryLoadingUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToRequireScreenLock) {
                this.getHighSpeedVideoFpsRangesFor.m11575navigateForResultInternaluBl809w(this.getHighResolutionOutputSizeshNQ4ISI, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.screenlock.RequireScreenLockNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(intermediaryLoadingUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.CloseAcquisition)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.closeAcquisition$bnpl_acquisition_prodRelease();
                this.getHighSpeedVideoFpsRangesFor.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect intermediaryLoadingUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(new com.paypal.oslo.feature.bnplacquisition.api.navigation.VirtualCardOverviewDestination(((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiEffect.NavigateToVirtualCardOverview) intermediaryLoadingUiEffect).getCreditAccountId()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination(com.paypal.oslo.feature.taptopay.api.navigation.RequireScreenLockDestination.EntryPoint.PL2GO, (com.paypal.oslo.feature.taptopay.api.domain.model.topbar.TopBarConfig) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.replaceTop(new com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination((java.lang.String) null, (com.paypal.oslo.feature.bnplacquisition.api.navigation.EnterAmountDestination.EntryPoint) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel) {
            this.getHighSpeedVideoFpsRangesFor = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizes = bnplAcquisitionSharedViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighSpeedVideoFpsRanges.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1(com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingViewModel intermediaryLoadingViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingScreenKt$IntermediaryLoadingScreen$4$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = intermediaryLoadingViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = bnplAcquisitionSharedViewModel;
    }
}
