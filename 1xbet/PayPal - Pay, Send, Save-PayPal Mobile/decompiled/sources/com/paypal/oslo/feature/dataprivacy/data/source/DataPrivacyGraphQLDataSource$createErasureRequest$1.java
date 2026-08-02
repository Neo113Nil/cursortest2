package com.paypal.oslo.feature.dataprivacy.data.source;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource", f = "DataPrivacyGraphQLDataSource.kt", i = {0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m = "createErasureRequest", n = {"partyId", "request", "input", "mutation", "config"}, nl = {459}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes5.dex */
final class DataPrivacyGraphQLDataSource$createErasureRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.createErasureRequest(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataPrivacyGraphQLDataSource$createErasureRequest$1(com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource dataPrivacyGraphQLDataSource, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource$createErasureRequest$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = dataPrivacyGraphQLDataSource;
    }
}
