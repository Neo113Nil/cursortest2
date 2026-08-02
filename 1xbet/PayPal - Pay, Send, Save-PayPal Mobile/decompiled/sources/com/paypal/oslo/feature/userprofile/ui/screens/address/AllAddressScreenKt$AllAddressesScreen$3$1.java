package com.paypal.oslo.feature.userprofile.ui.screens.address;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1", f = "AllAddressScreen.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AllAddressScreenKt$AllAddressesScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesEvent allAddressesEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesEvent) obj;
            if (allAddressesEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesEvent.NavigateToAddressDetails) {
                android.content.Context context = this.getHighSpeedVideoSizes;
                java.lang.String format = java.lang.String.format(this.getHighSpeedVideoFpsRanges, java.util.Arrays.copyOf(new java.lang.Object[]{((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesEvent.NavigateToAddressDetails) allAddressesEvent).getAddressId()}, 1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                android.widget.Toast.makeText(context, format, 0).show();
            } else {
                if (!(allAddressesEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesEvent.NavigateToAddAddress)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.AddressSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.userprofile.api.navigation.AddAddressDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(android.content.Context context, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2) {
            this.getHighSpeedVideoSizes = context;
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.Camera2StreamConfigurationMap = str2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.Camera2StreamConfigurationMap.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AllAddressScreenKt$AllAddressesScreen$3$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllAddressesViewModel allAddressesViewModel, android.content.Context context, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.address.AllAddressScreenKt$AllAddressesScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = allAddressesViewModel;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }
}
