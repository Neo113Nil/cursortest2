package com.adobe.marketing.mobile.messaging;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.messaging.ContentCardUIProvider", f = "ContentCardUIProvider.kt", i = {0}, l = {58}, m = "getContentCardUI", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class ContentCardUIProvider$getContentCardUI$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.adobe.marketing.mobile.messaging.ContentCardUIProvider Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getContentCardUI(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentCardUIProvider$getContentCardUI$1(com.adobe.marketing.mobile.messaging.ContentCardUIProvider contentCardUIProvider, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.messaging.ContentCardUIProvider$getContentCardUI$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = contentCardUIProvider;
    }
}
