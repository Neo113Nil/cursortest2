package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1", f = "AddUserAccountScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class AddUserAccountScreenKt$AddUserAccountScreen$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.navigation3.runtime.NavKey getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        final androidx.navigation3.runtime.NavKey resolvePostLoginDestination = this.getHighResolutionOutputSizeshNQ4ISI.resolvePostLoginDestination(this.getHighSpeedVideoSizes);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.Camera2StreamConfigurationMap;
        final androidx.compose.runtime.State<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> state = this.getHighSpeedVideoFpsRangesFor;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1.getHighSpeedVideoFpsRanges(androidx.navigation3.runtime.NavKey.this, state, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.navigation3.runtime.NavKey navKey, androidx.compose.runtime.State state, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBack();
        navigationScope.goBack();
        navigationScope.push(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation(navKey, (androidx.navigation3.runtime.NavKey) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("link_account", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), com.paypal.oslo.feature.identity.api.Intent.LINK_ACCOUNT, com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt.access$AddUserAccountScreen$lambda$1(state)));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AddUserAccountScreenKt$AddUserAccountScreen$2$1$1(com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountViewModel addUserAccountViewModel, androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.accountswitch.ui.AddUserAccountScreenKt$AddUserAccountScreen$2$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = addUserAccountViewModel;
        this.getHighSpeedVideoSizes = navKey;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = state;
    }
}
