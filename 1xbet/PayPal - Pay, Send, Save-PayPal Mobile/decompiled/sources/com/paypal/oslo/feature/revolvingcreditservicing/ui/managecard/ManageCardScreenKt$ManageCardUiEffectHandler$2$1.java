package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "navResult", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/CreatePinNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$2$1", f = "ManageCardScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardScreenKt$ManageCardUiEffectHandler$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinNavResult createPinNavResult = (com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinNavResult) this.getHighSpeedVideoSizes;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (!(createPinNavResult.getAction() instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinAction.ShowToast)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        this.getHighSpeedVideoFpsRangesFor.setValue(((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinAction.ShowToast) createPinNavResult.getAction()).getMessage());
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.CreatePinNavResult createPinNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$2$1) create(createPinNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$2$1 manageCardScreenKt$ManageCardUiEffectHandler$2$1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$2$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        manageCardScreenKt$ManageCardUiEffectHandler$2$1.getHighSpeedVideoSizes = obj;
        return manageCardScreenKt$ManageCardUiEffectHandler$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardScreenKt$ManageCardUiEffectHandler$2$1(androidx.compose.runtime.MutableState<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.ManageCardScreenKt$ManageCardUiEffectHandler$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
