package com.ingo.sdk.kotlin.common.features.configuration;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase", f = "GetConfigurationUseCase.kt", i = {}, l = {18}, m = "run", n = {}, s = {})
/* loaded from: classes9.dex */
final class GetConfigurationUseCase$run$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.run((com.ingo.sdk.kotlin.common.core.interactor.UseCase.None) null, (kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse>>) this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetConfigurationUseCase$run$1(com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase getConfigurationUseCase, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.configuration.GetConfigurationUseCase$run$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getConfigurationUseCase;
    }
}
