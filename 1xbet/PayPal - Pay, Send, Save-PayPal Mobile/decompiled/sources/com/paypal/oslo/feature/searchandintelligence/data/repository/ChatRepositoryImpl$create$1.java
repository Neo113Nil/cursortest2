package com.paypal.oslo.feature.searchandintelligence.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl", f = "ChatRepositoryImpl.kt", i = {}, l = {44}, m = "create", n = {}, nl = {46}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ChatRepositoryImpl$create$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.create(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatRepositoryImpl$create$1(com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl chatRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.data.repository.ChatRepositoryImpl$create$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = chatRepositoryImpl;
    }
}
