package com.ingo.sdk.kotlin.common.features.html_content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi", f = "HtmlContentApi.kt", i = {0, 1, 1}, l = {65, 36}, m = "getHtmlContent", n = {"url", "url", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class HtmlContentApi$getHtmlContent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getHtmlContent(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HtmlContentApi$getHtmlContent$1(com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi htmlContentApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.html_content.HtmlContentApi$getHtmlContent$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = htmlContentApi;
    }
}
