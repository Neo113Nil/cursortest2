package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/CLIApprovalNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt$CLIManageUiEffectHandler$2$1", f = "CLIManageScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class CLIManageScreenKt$CLIManageUiEffectHandler$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult cLIApprovalNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult) this.Camera2StreamConfigurationMap;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toastMessage = cLIApprovalNavResult.getToastMessage();
        if (toastMessage != null) {
            this.getHighSpeedVideoSizes.processEvent(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageEvent.OnCompletedFlow(toastMessage));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CLIApprovalNavResult cLIApprovalNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt$CLIManageUiEffectHandler$2$1) create(cLIApprovalNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt$CLIManageUiEffectHandler$2$1 cLIManageScreenKt$CLIManageUiEffectHandler$2$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt$CLIManageUiEffectHandler$2$1(this.getHighSpeedVideoSizes, continuation);
        cLIManageScreenKt$CLIManageUiEffectHandler$2$1.Camera2StreamConfigurationMap = obj;
        return cLIManageScreenKt$CLIManageUiEffectHandler$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CLIManageScreenKt$CLIManageUiEffectHandler$2$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.viewmodel.CLIManageViewModel cLIManageViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.CLIManageScreenKt$CLIManageUiEffectHandler$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = cLIManageViewModel;
    }
}
