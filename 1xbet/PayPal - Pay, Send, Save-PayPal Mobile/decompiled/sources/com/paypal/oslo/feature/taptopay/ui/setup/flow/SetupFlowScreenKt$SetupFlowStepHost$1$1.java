package com.paypal.oslo.feature.taptopay.ui.setup.flow;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1", f = "SetupFlowScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class SetupFlowScreenKt$SetupFlowStepHost$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.Camera2StreamConfigurationMap) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.resetForFlowRestart$taptopay_prodRelease();
        java.util.List<androidx.navigation3.runtime.NavKey> backStack = this.getHighSpeedVideoFpsRangesFor.getBackStack();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : backStack) {
            if (obj2 instanceof com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination) {
                arrayList.add(obj2);
            }
        }
        final com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination = (com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator = this.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                return com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.this, setupFlowCoordinator, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj3);
            }
        });
        if (setupFlowDestination == null) {
            com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinatorViewModelStoreKt.clearSetupFlowCoordinatorViewModelStore();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination setupFlowDestination, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        if (setupFlowDestination != null) {
            navigationScope.popTo(setupFlowDestination);
        } else {
            navigationScope.setResult(setupFlowCoordinator.resolveNavResult$taptopay_prodRelease());
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.SetupDestination.class));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SetupFlowScreenKt$SetupFlowStepHost$1$1(boolean z, com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowCoordinator setupFlowCoordinator, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.setup.flow.SetupFlowScreenKt$SetupFlowStepHost$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = setupFlowCoordinator;
        this.getHighSpeedVideoFpsRangesFor = appNavigator;
    }
}
