package com.paypal.oslo.feature.activity.domain.usecase.search;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase", f = "ActivitySuggestionUseCase.kt", i = {0, 0}, l = {31}, m = "invoke", n = {"queryInput", "suggestionQuery"}, nl = {32}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class ActivitySuggestionUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivitySuggestionUseCase$invoke$1(com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase activitySuggestionUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.usecase.search.ActivitySuggestionUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = activitySuggestionUseCase;
    }
}
