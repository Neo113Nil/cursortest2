package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1", f = "PYUSDRewardsSettingsScreen.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.res.Resources getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputFormats;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.res.Resources getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> getOutputFormats;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect pYUSDRewardsSettingsEffect = (com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(pYUSDRewardsSettingsEffect, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowUnEnrollBottomSheet.INSTANCE)) {
                this.getHighSpeedVideoSizesFor.showSheet();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(pYUSDRewardsSettingsEffect, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowEnableToast.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.setValue(this.getHighResolutionOutputSizeshNQ4ISI.getString(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_rewards_settings_toast_enable, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt.access$PYUSDRewardsSettingsScreen$lambda$0(this.getOutputFormats).getPyusdRewardsFormattedRate()));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(pYUSDRewardsSettingsEffect, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowDisableToast.INSTANCE)) {
                this.getHighSpeedVideoFpsRangesFor.setValue(this.Camera2StreamConfigurationMap);
            } else {
                if (!(pYUSDRewardsSettingsEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowProvisioningFlow)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.getHighSpeedVideoSizes, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoProvisioningNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect pYUSDRewardsSettingsEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.cryptocurrency.navigation.CryptoProvisioningDestination(((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsEffect.ShowProvisioningFlow) pYUSDRewardsSettingsEffect).getIntent()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState<java.lang.String> mutableState, android.content.res.Resources resources, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> state) {
            this.getHighSpeedVideoSizesFor = bottomSheetController;
            this.getHighSpeedVideoFpsRangesFor = mutableState;
            this.getHighResolutionOutputSizeshNQ4ISI = resources;
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighSpeedVideoSizes = str2;
            this.getOutputFormats = state;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getInputSizeshNQ4ISI.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1.AnonymousClass1(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1(this.getInputSizeshNQ4ISI, this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsViewModel pYUSDRewardsSettingsViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.MutableState<java.lang.String> mutableState, android.content.res.Resources resources, java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str2, androidx.compose.runtime.State<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsSettingsUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.PYUSDRewardsSettingsScreenKt$PYUSDRewardsSettingsScreen$2$1> continuation) {
        super(2, continuation);
        this.getInputSizeshNQ4ISI = pYUSDRewardsSettingsViewModel;
        this.getOutputFormats = bottomSheetController;
        this.Camera2StreamConfigurationMap = mutableState;
        this.getHighSpeedVideoFpsRanges = resources;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizesFor = state;
    }
}
