package com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1", f = "CIPTaxStepScreenContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        booleanValue = ((java.lang.Boolean) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).booleanValue();
        if (booleanValue && !this.getHighSpeedVideoFpsRangesFor.getVisible()) {
            androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoFpsRanges, 0, 1, null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRangesFor.getVisible()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1(com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.steps.ciptax.ui.CIPTaxStepScreenContentKt$CIPTaxStepScreenContent$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = focusRequester;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
