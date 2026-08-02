package com.paypal.oslo.feature.dataprivacy.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource", f = "DataPrivacyGraphQLDataSource.kt", i = {0, 0, 0, 0}, l = {84}, m = "getExistingRequests", n = {"partyId", "input", "query", "config"}, nl = {459}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DataPrivacyGraphQLDataSource$getExistingRequests$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputFormats.getExistingRequests(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataPrivacyGraphQLDataSource$getExistingRequests$1(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getExistingRequests$1> continuation) {
        super(continuation);
        this.getInputFormats = dataPrivacyGraphQLDataSource;
    }
}
