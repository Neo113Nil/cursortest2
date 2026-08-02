package com.paypal.oslo.feature.dataprivacy.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource", f = "DataPrivacyGraphQLDataSource.kt", i = {0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m = "getIdentityLinks", n = {"partyId", "input", "query", "config"}, nl = {459}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class DataPrivacyGraphQLDataSource$getIdentityLinks$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.getIdentityLinks(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataPrivacyGraphQLDataSource$getIdentityLinks$1(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$getIdentityLinks$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = dataPrivacyGraphQLDataSource;
    }
}
