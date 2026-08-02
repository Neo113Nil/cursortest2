package com.paypal.oslo.feature.userprofile.ui.screens.address;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1", f = "AddEditAddressScreen.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditAddressScreenKt$AddEditAddressScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.userstore.model.ProfileAddress, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ java.lang.String getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizesFor.setAddressScreenMode(this.getHighSpeedVideoSizes);
            this.getInputFormats = 1;
            if (this.getHighSpeedVideoSizesFor.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.userstore.model.ProfileAddress, kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent addEditAddressEvent = (com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent) obj;
            if (addEditAddressEvent instanceof com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully) {
                this.getHighSpeedVideoSizes.invoke(((com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.AddressSavedSuccessfully) addEditAddressEvent).getAddress());
            } else {
                if (!(addEditAddressEvent instanceof com.paypal.oslo.feature.userprofile.ui.AddEditAddressEvent.RiskDeclined)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighSpeedVideoFpsRanges;
                final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
                final java.lang.String str3 = this.Camera2StreamConfigurationMap;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRanges(str, str2, str3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination("Info", str, str2, str3, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator) obj);
                }
            }));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.userstore.model.ProfileAddress, kotlin.Unit> function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.getHighSpeedVideoSizes = function1;
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.Camera2StreamConfigurationMap = str3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddEditAddressScreenKt$AddEditAddressScreen$3$1(com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel addEditAddressViewModel, com.paypal.oslo.feature.userprofile.ui.screens.address.AddressScreenMode addressScreenMode, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.userstore.model.ProfileAddress, kotlin.Unit> function1, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.address.AddEditAddressScreenKt$AddEditAddressScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = addEditAddressViewModel;
        this.getHighSpeedVideoSizes = addressScreenMode;
        this.getHighSpeedVideoFpsRanges = function1;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighResolutionOutputSizeshNQ4ISI = str3;
    }
}
