package com.ingo.sdk.kotlin.common.features.identity_documents;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi", f = "IdentityDocumentsApi.kt", i = {0}, l = {112, 113, 57}, m = "uploadIdentityDocuments", n = {"urlString"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class IdentityDocumentsApi$uploadIdentityDocuments$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.uploadIdentityDocuments(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityDocumentsApi$uploadIdentityDocuments$1(com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi identityDocumentsApi, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.features.identity_documents.IdentityDocumentsApi$uploadIdentityDocuments$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = identityDocumentsApi;
    }
}
