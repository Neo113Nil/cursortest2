package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "otp", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1", f = "ThalesDigitizeCardUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class ThalesDigitizeCardUseCase$handlePendingActivation$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoSizes;
        com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation = this.getHighSpeedVideoFpsRanges;
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        pendingCardActivation.activate(bytes, this.getHighSpeedVideoFpsRangesFor);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1) create(str, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1 thalesDigitizeCardUseCase$handlePendingActivation$1 = new com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        thalesDigitizeCardUseCase$handlePendingActivation$1.getHighSpeedVideoSizes = obj;
        return thalesDigitizeCardUseCase$handlePendingActivation$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesDigitizeCardUseCase$handlePendingActivation$1(com.gemalto.mfs.mwsdk.mobilegateway.enrollment.PendingCardActivation pendingCardActivation, com.gemalto.mfs.mwsdk.mobilegateway.listener.MGDigitizationListener mGDigitizationListener, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.card.ThalesDigitizeCardUseCase$handlePendingActivation$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = pendingCardActivation;
        this.getHighSpeedVideoFpsRangesFor = mGDigitizationListener;
    }
}
