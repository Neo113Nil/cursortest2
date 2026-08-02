package com.paypal.oslo.core.i18n.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl", f = "DocumentRepositoryImpl.kt", i = {0}, l = {53}, m = "getDocumentMetadata", n = {com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY}, nl = {174}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class DocumentRepositoryImpl$getDocumentMetadata$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getDocumentMetadata(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocumentRepositoryImpl$getDocumentMetadata$1(com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl documentRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.data.repository.DocumentRepositoryImpl$getDocumentMetadata$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = documentRepositoryImpl;
    }
}
