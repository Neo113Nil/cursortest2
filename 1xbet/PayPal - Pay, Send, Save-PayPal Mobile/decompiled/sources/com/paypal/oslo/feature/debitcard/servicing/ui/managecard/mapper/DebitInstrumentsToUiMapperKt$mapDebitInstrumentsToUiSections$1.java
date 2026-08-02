package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt", f = "DebitInstrumentsToUiMapper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {93}, m = "mapDebitInstrumentsToUiSections", n = {com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "debitInstrumentsResponse", "currentInstrument", "debitCardI18nFormatter", "context", "fundingOptionsVariant", "it", "isAdditionalCardholderManagementEnabled", "$i$a$-let-DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$fundedBySection$1"}, nl = {92}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "I$0"}, v = 2)
/* loaded from: classes12.dex */
final class DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    boolean getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt.mapDebitInstrumentsToUiSections(null, null, null, null, null, false, this);
    }

    DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mapper.DebitInstrumentsToUiMapperKt$mapDebitInstrumentsToUiSections$1> continuation) {
        super(continuation);
    }
}
