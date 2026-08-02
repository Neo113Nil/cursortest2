package com.paypal.oslo.feature.userprofile.ui.screens.email;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1", f = "MakePrimaryEmailScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.core.userstore.model.ProfileEmail> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
        if (booleanValue && com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt.access$MakePrimaryEmailScreen$lambda$5(this.getHighSpeedVideoSizes) != null) {
            this.Camera2StreamConfigurationMap.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.setResult(new com.paypal.oslo.feature.userprofile.api.navigation.result.EmailActionNavResult(com.paypal.oslo.feature.userprofile.api.navigation.result.EmailAction.MAKE_PRIMARY, (com.paypal.oslo.core.userstore.model.ProfileEmail) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.api.navigation.EmailBottomSheetDestination.class));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<java.lang.Boolean> state, androidx.compose.runtime.MutableState<com.paypal.oslo.core.userstore.model.ProfileEmail> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.screens.email.MakePrimaryEmailScreenKt$MakePrimaryEmailScreen$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = state;
        this.getHighSpeedVideoSizes = mutableState;
    }
}
