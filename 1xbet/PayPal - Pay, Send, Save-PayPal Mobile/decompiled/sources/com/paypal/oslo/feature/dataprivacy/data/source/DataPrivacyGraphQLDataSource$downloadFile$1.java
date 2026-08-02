package com.paypal.oslo.feature.dataprivacy.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource", f = "DataPrivacyGraphQLDataSource.kt", i = {0, 0, 0}, l = {433}, m = "downloadFile", n = {"fileId", "partyId", "headers"}, nl = {459}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class DataPrivacyGraphQLDataSource$downloadFile$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.downloadFile(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataPrivacyGraphQLDataSource$downloadFile$1(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$downloadFile$1> continuation) {
        super(continuation);
        this.getInputFormats = dataPrivacyGraphQLDataSource;
    }
}
