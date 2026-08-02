package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl", f = "BusinessInventoryTaxesRepositoryImpl.kt", i = {0, 0, 0}, l = {102}, m = "addTax", n = {"label", "mutation", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, nl = {103}, s = {"L$0", "L$1", "D$0"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryTaxesRepositoryImpl$addTax$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    double Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.addTax(null, 0.0d, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryTaxesRepositoryImpl$addTax$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl businessInventoryTaxesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$addTax$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = businessInventoryTaxesRepositoryImpl;
    }
}
