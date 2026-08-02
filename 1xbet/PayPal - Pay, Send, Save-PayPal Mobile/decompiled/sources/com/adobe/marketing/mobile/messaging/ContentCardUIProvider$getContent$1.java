package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.messaging.ContentCardUIProvider", f = "ContentCardUIProvider.kt", i = {0}, l = {80}, m = "getContent", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class ContentCardUIProvider$getContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.adobe.marketing.mobile.messaging.ContentCardUIProvider getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getContent(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentCardUIProvider$getContent$1(com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = contentCardUIProvider;
    }
}
