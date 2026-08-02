package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1", f = "AccountSwitchLoadingViewModel.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, nl = {341}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AccountSwitchLoadingViewModel$switchAccount$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.SwitchAccountUseCase switchAccountUseCase;
        com.paypal.oslo.core.navigation.AppNavigator appNavigator;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            switchAccountUseCase = this.getOutputMinFrameDuration.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = switchAccountUseCase.invoke(this.Camera2StreamConfigurationMap, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Ior ior = (arrow.core.Ior) obj;
        com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel = this.getOutputMinFrameDuration;
        final java.lang.String str = this.Camera2StreamConfigurationMap;
        final int i2 = this.getHighSpeedVideoSizes;
        final java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
        if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.access$logSwitchAccountError(accountSwitchLoadingViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) ((arrow.core.Ior.Left) ior).getValue(), str);
            appNavigator = accountSwitchLoadingViewModel.Camera2StreamConfigurationMap;
            appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1.getHighSpeedVideoFpsRanges(str, i2, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        } else if (ior instanceof arrow.core.Ior.Right) {
            com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.m14999access$handleSwitchAccountResultaILpJJk(accountSwitchLoadingViewModel, (com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult) ((arrow.core.Ior.Right) ior).getValue(), str, i2, str2, str3);
        } else if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            java.lang.Object leftValue = both.getLeftValue();
            com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult switchAccountResult = (com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult) both.getRightValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError) leftValue).getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            com.paypal.android.logger.Logger.w$default(logger, "Switch account completed with warnings", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorType", simpleName)), null, 4, null);
            com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel.m14999access$handleSwitchAccountResultaILpJJk(accountSwitchLoadingViewModel, switchAccountResult, str, i2, str2, str3);
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(new com.paypal.oslo.feature.identity.api.navigation.AccountSwitchErrorScreenDestination(str, i, str2));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSwitchLoadingViewModel$switchAccount$1(com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel accountSwitchLoadingViewModel, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.AccountSwitchLoadingViewModel$switchAccount$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = accountSwitchLoadingViewModel;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
