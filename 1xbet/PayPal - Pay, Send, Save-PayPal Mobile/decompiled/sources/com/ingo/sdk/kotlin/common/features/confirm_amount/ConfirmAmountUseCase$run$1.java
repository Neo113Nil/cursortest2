package com.ingo.sdk.kotlin.common.features.confirm_amount;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase", f = "ConfirmAmountUseCase.kt", i = {}, l = {16}, m = "run", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConfirmAmountUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.run((kotlin.Pair<java.lang.Long, java.lang.String>) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfirmAmountUseCase$run$1(com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase confirmAmountUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.confirm_amount.ConfirmAmountUseCase$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = confirmAmountUseCase;
    }
}
