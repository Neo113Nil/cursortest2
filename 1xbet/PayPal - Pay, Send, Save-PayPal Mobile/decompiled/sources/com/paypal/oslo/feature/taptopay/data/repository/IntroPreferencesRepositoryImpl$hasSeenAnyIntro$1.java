package com.paypal.oslo.feature.taptopay.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl", f = "IntroPreferencesRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {29}, m = "hasSeenAnyIntro", n = {"$this$any$iv", "element$iv", "key", "$i$f$any", "$i$a$-any-IntroPreferencesRepositoryImpl$hasSeenAnyIntro$2"}, nl = {48}, s = {"L$0", "L$2", "L$3", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.hasSeenAnyIntro(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1(com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl introPreferencesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.IntroPreferencesRepositoryImpl$hasSeenAnyIntro$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = introPreferencesRepositoryImpl;
    }
}
