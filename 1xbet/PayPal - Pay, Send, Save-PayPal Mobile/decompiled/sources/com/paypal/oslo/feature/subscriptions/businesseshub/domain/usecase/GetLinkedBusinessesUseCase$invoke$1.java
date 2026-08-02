package com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase", f = "GetLinkedBusinessesUseCase.kt", i = {}, l = {53}, m = "invoke", n = {}, nl = {54}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class GetLinkedBusinessesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetLinkedBusinessesUseCase$invoke$1(com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase getLinkedBusinessesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.domain.usecase.GetLinkedBusinessesUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getLinkedBusinessesUseCase;
    }
}
