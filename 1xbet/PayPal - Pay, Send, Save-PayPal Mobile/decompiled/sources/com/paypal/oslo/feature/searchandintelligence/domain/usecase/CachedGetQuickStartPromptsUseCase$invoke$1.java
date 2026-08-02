package com.paypal.oslo.feature.searchandintelligence.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase", f = "CachedGetQuickStartPromptsUseCase.kt", i = {0}, l = {40}, m = "invoke", n = {"$i$a$-ifEmpty-CachedGetQuickStartPromptsUseCase$invoke$2"}, nl = {41}, s = {"I$0"}, v = 2)
/* loaded from: classes14.dex */
final class CachedGetQuickStartPromptsUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.invoke(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedGetQuickStartPromptsUseCase$invoke$1(com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase cachedGetQuickStartPromptsUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.domain.usecase.CachedGetQuickStartPromptsUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = cachedGetQuickStartPromptsUseCase;
    }
}
