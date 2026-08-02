package com.ingo.sdk.kotlin.common.features.legal_documents;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi", f = "LegalDocumentsApi.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 48}, m = "doAction", n = {"urlString", "urlString", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes9.dex */
final class LegalDocumentsApi$doAction$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(null, null, false, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDocumentsApi$doAction$1(com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi legalDocumentsApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.legal_documents.LegalDocumentsApi$doAction$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = legalDocumentsApi;
    }
}
