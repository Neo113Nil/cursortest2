package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl", f = "BusinessInventoryTaxesRepositoryImpl.kt", i = {0, 0}, l = {159}, m = "deleteTax", n = {"taxId", "mutation"}, nl = {160}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryTaxesRepositoryImpl$deleteTax$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.deleteTax(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryTaxesRepositoryImpl$deleteTax$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl businessInventoryTaxesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$deleteTax$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryTaxesRepositoryImpl;
    }
}
