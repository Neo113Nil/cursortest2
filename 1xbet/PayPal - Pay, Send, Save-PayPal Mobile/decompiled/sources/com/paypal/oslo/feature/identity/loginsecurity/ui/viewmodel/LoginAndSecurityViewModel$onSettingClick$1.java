package com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$onSettingClick$1", f = "LoginAndSecurityViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class LoginAndSecurityViewModel$onSettingClick$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
            mutableStateFlow.setValue(new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityUiState.NavigateToSetting(this.getHighResolutionOutputSizeshNQ4ISI.getType()));
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$onSettingClick$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$onSettingClick$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginAndSecurityViewModel$onSettingClick$1(com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel loginAndSecurityViewModel, com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeature loginAndSecurityFeature, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.loginsecurity.ui.viewmodel.LoginAndSecurityViewModel$onSettingClick$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = loginAndSecurityViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = loginAndSecurityFeature;
    }
}
