package com.paypal.oslo.feature.debitcard.servicing.data.provider;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl", f = "DebitInstrumentProductDefinitionProviderImpl.kt", i = {0, 0, 0, 0}, l = {55}, m = "getProductDefinition", n = {com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "countryCode", "request", "includeCardArtImages"}, nl = {-1}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getProductDefinition(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1(com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl debitInstrumentProductDefinitionProviderImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.data.provider.DebitInstrumentProductDefinitionProviderImpl$getProductDefinition$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = debitInstrumentProductDefinitionProviderImpl;
    }
}
