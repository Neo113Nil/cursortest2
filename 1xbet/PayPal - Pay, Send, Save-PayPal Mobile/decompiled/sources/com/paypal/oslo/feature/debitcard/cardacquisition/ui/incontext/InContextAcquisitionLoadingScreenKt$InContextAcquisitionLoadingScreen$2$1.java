package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1", f = "InContextAcquisitionLoadingScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.Camera2StreamConfigurationMap.provisionCard(this.getHighSpeedVideoFpsRanges, false, this.getHighSpeedVideoFpsRangesFor, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName.DIGITIZATION_TOKEN_PAYPAL);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.viewmodel.DebitCardApplyAndCreateViewModel debitCardApplyAndCreateViewModel, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.InContextAcquisitionLoadingScreenKt$InContextAcquisitionLoadingScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = debitCardApplyAndCreateViewModel;
        this.getHighSpeedVideoFpsRanges = debitCardProductName;
        this.getHighSpeedVideoFpsRangesFor = str;
    }
}
