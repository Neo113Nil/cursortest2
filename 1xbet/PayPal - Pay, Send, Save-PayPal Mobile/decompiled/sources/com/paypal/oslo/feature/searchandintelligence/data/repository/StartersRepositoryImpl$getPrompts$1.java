package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl", f = "StartersRepositoryImpl.kt", i = {0}, l = {44}, m = "getPrompts", n = {"surfaces"}, nl = {50}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class StartersRepositoryImpl$getPrompts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getPrompts(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartersRepositoryImpl$getPrompts$1(com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl startersRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.repository.StartersRepositoryImpl$getPrompts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = startersRepositoryImpl;
    }
}
