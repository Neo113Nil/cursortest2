package com.paypal.oslo.feature.cashin.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1", f = "CashInEntryViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {56}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class CashInEntryViewModel$navigateToAppropriateScreen$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCase getHasSeenLandingUseCase;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getHasSeenLandingUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            obj = getHasSeenLandingUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        final boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        appNavigator = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
        final java.lang.String str = this.Camera2StreamConfigurationMap;
        final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel = this.getHighSpeedVideoFpsRangesFor;
        final android.content.Context context = this.getHighResolutionOutputSizeshNQ4ISI;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1.Camera2StreamConfigurationMap(booleanValue, str, cashInEntryViewModel, context, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(boolean z, java.lang.String str, com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel, android.content.Context context, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationPermissionUseCase checkLocationPermissionUseCase;
        com.paypal.oslo.feature.cashin.domain.usecase.CheckLocationEnabledUseCase checkLocationEnabledUseCase;
        if (z) {
            checkLocationPermissionUseCase = cashInEntryViewModel.getHighSpeedVideoFpsRangesFor;
            if (checkLocationPermissionUseCase.invoke(context)) {
                checkLocationEnabledUseCase = cashInEntryViewModel.getHighResolutionOutputSizeshNQ4ISI;
                if (!checkLocationEnabledUseCase.invoke(context)) {
                    navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination(str));
                } else {
                    navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInMainDestination(0, str, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
            } else {
                navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInLocationPermissionDestination(str));
            }
        } else {
            navigationScope.replaceTop(new com.paypal.oslo.feature.cashin.api.navigation.CashInBalanceLandingDestination(str));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CashInEntryViewModel$navigateToAppropriateScreen$1(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel cashInEntryViewModel, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.ui.viewmodel.CashInEntryViewModel$navigateToAppropriateScreen$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = cashInEntryViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }
}
