package com.paypal.oslo.feature.businessinventory.domain.validator;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl", f = "TaxEntityValidator.kt", i = {0, 0, 0, 0}, l = {32}, m = "validateName", n = {"name", "id", "$this$validateName_u24lambda_u240", "$i$a$-buildSet-TaxEntityValidatorImpl$validateName$2"}, nl = {33}, s = {"L$0", "L$1", "L$3", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class TaxEntityValidatorImpl$validateName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.validateName(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TaxEntityValidatorImpl$validateName$1(com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl taxEntityValidatorImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidatorImpl$validateName$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = taxEntityValidatorImpl;
    }
}
