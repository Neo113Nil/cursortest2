package com.paypal.oslo.feature.bnplservicing.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase", f = "PostSnoozeUseCase.kt", i = {0}, l = {29}, m = "invoke", n = {"request"}, nl = {30}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class PostSnoozeUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke2((java.lang.String) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<?>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSnoozeUseCase$invoke$1(com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase postSnoozeUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = postSnoozeUseCase;
    }
}
