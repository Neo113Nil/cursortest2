package com.paypal.oslo.feature.settings.ui.screens;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1", f = "SettingsScreen.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class SettingsScreenKt$SettingsScreenWithEffects$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/settings/ui/mvi/SettingsEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1", f = "SettingsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getInputFormats;
        int getInputSizeshNQ4ISI;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect settingsEffect = (com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect) this.getInputFormats;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getInputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (settingsEffect instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.TurnOnPushNotificationsTapped) {
                this.getHighResolutionOutputSizeshNQ4ISI.requestPermissionOrOpenSettings();
            } else if (settingsEffect instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination) {
                if (((com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination) settingsEffect).getDestination() instanceof com.paypal.oslo.feature.identity.api.navigation.ChangePasswordDestination) {
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.ChangePasswordNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1.Camera2StreamConfigurationMap(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            } else if (!(settingsEffect instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.LogoutSuccessful)) {
                if (settingsEffect instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToFingerprintConfirmation) {
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRangesFor, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.navigation.result.FingerprintConfirmationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(settingsEffect instanceof com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToLLSConfirmation)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoSizes.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoFpsRanges, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.settings.navigation.result.LLSConfirmationNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect settingsEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination) settingsEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.settings.api.navigation.LLSConfirmationDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect settingsEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(((com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect.NavigateToDestination) settingsEffect).getDestination());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.push(com.paypal.oslo.feature.settings.api.navigation.FingerprintConfirmationDestination.INSTANCE);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.settings.ui.mvi.SettingsEffect settingsEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1) create(settingsEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getInputFormats = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = pushOptInState;
            this.getHighSpeedVideoSizes = appNavigator;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getHighSpeedVideoFpsRanges = str3;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizesFor.getEffects(), new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsScreenKt$SettingsScreenWithEffects$2$1(com.paypal.oslo.feature.settings.ui.viewmodel.SettingsViewModel settingsViewModel, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.settings.ui.screens.SettingsScreenKt$SettingsScreenWithEffects$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = settingsViewModel;
        this.getHighSpeedVideoFpsRangesFor = pushOptInState;
        this.getHighSpeedVideoSizes = appNavigator;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = str3;
    }
}
