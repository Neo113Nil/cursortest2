package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$5", f = "SignatureFragment.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class SignatureFragment$onViewCreated$5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(java.util.concurrent.TimeUnit.MINUTES.toMillis(3L), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment.access$getViewModel(this.getHighResolutionOutputSizeshNQ4ISI).cancelTransaction();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$5) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$5(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SignatureFragment$onViewCreated$5(com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment signatureFragment, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.payment.SignatureFragment$onViewCreated$5> continuation) {
        super(1, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = signatureFragment;
    }
}
