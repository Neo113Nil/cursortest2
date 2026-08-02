package com.ingo.sdk.kotlin.common.features.customer;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase", f = "GetCustomerUseCase.kt", i = {}, l = {18}, m = "run", n = {}, s = {})
/* loaded from: classes9.dex */
final class GetCustomerUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.run((com.ingo.sdk.kotlin.common.core.interactor.UseCase.None) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer.model.CustomerResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetCustomerUseCase$run$1(com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase getCustomerUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.customer.GetCustomerUseCase$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = getCustomerUseCase;
    }
}
