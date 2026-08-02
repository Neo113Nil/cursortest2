package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1", f = "AddEditPhoneScreen.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditPhoneScreenKt$AddEditPhoneScreen$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getInputFormats;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel getOutputMinFrameDuration;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> getHighSpeedVideoSizes;
        final /* synthetic */ java.lang.String getInputFormats;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent addEditPhoneEvent = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent) obj;
            if (addEditPhoneEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (addEditPhoneEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!(addEditPhoneEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired)) {
                if (!(addEditPhoneEvent instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.RiskDeclined)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                final java.lang.String str = this.getInputFormats;
                final java.lang.String str2 = this.Camera2StreamConfigurationMap;
                final java.lang.String str3 = this.getHighSpeedVideoFpsRanges;
                appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.Camera2StreamConfigurationMap(str, str2, str3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                this.getHighSpeedVideoSizes.setValue(((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired) addEditPhoneEvent).getAction());
                this.getHighResolutionOutputSizeshNQ4ISI.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent addEditPhoneEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult(((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully) addEditPhoneEvent).getPhone(), com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.ADD));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.FullScreenErrorDestination("Info", str, str2, str3, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator) obj);
                }
            }));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent addEditPhoneEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired phoneConfirmationRequired = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired) addEditPhoneEvent;
            navigationScope.push(new com.paypal.oslo.feature.userprofile.api.navigation.ConfirmPhoneDestination(phoneConfirmationRequired.getPhone().getId(), phoneConfirmationRequired.getPhone().getMaskedPhoneNumber()));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(com.paypal.oslo.feature.settings.api.navigation.SettingsDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent addEditPhoneEvent, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneSavedNavResult(((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully) addEditPhoneEvent).getPhone(), com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction.EDIT));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> mutableState, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoSizes = mutableState;
            this.getInputFormats = str2;
            this.Camera2StreamConfigurationMap = str3;
            this.getHighSpeedVideoFpsRanges = str4;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputFormats = 1;
            if (this.getOutputMinFrameDuration.getEvents().collect(new com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditPhoneScreenKt$AddEditPhoneScreen$5$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel addEditPhoneViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.runtime.MutableState<com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction> mutableState, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.phone.AddEditPhoneScreenKt$AddEditPhoneScreen$5$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = addEditPhoneViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getInputFormats = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.Camera2StreamConfigurationMap = str4;
    }
}
