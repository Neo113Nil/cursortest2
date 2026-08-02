package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "result", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/EmailConfirmedNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1", f = "AddEditEmailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class AddEditEmailScreenKt$AddEditEmailScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult emailConfirmedNavResult = (com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.String str = this.getHighSpeedVideoSizes;
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1.getHighSpeedVideoFpsRanges(str, emailConfirmedNavResult, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult emailConfirmedNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.goBackWithResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailSavedNavResult(emailConfirmedNavResult.getEmail(), str == null ? com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.ADD : com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.EDIT));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailConfirmedNavResult emailConfirmedNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1) create(emailConfirmedNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1 addEditEmailScreenKt$AddEditEmailScreen$2$1 = new com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        addEditEmailScreenKt$AddEditEmailScreen$2$1.Camera2StreamConfigurationMap = obj;
        return addEditEmailScreenKt$AddEditEmailScreen$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEditEmailScreenKt$AddEditEmailScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.AddEditEmailScreenKt$AddEditEmailScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoSizes = str;
    }
}
