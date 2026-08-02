package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", i = {0, 0}, l = {61}, m = "close", n = {"chatId", "reason"}, nl = {69}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class ChatRepositoryImpl$close$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.close(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatRepositoryImpl$close$1(com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl chatRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$close$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = chatRepositoryImpl;
    }
}
