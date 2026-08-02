package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1", f = "CashInBalanceLandingViewModel.kt", i = {0, 0}, l = {83}, m = "invokeSuspend", n = {"hasLocationPermission", "isLocationEnabled"}, nl = {85}, s = {"Z$0", "Z$1"}, v = 2)
/* loaded from: classes11.dex */
final class CashInBalanceLandingViewModel$onContinueClicked$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    boolean Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase;
        final boolean invoke;
        com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase;
        com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCase setHasSeenLandingUseCase;
        final boolean z;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            checkLocationPermissionUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges;
            invoke = checkLocationPermissionUseCase.invoke(this.getHighSpeedVideoFpsRangesFor);
            checkLocationEnabledUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor;
            boolean invoke2 = checkLocationEnabledUseCase.invoke(this.getHighSpeedVideoFpsRangesFor);
            setHasSeenLandingUseCase = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = invoke;
            this.getHighResolutionOutputSizeshNQ4ISI = invoke2;
            this.getHighSpeedVideoFpsRanges = 1;
            if (setHasSeenLandingUseCase.invoke(true, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = invoke2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.getHighResolutionOutputSizeshNQ4ISI;
            invoke = this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        appNavigator = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
        final java.lang.String str = this.getHighSpeedVideoSizes;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1.getHighSpeedVideoSizes(invoke, str, z, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(boolean z, java.lang.String str, boolean z2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        if (!z) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination(str));
        } else if (!z2) {
            navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination(str));
        } else {
            navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination(0, str, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInBalanceLandingViewModel$onContinueClicked$1(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel cashInBalanceLandingViewModel, android.content.Context context, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInBalanceLandingViewModel$onContinueClicked$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = cashInBalanceLandingViewModel;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighSpeedVideoSizes = str;
    }
}
