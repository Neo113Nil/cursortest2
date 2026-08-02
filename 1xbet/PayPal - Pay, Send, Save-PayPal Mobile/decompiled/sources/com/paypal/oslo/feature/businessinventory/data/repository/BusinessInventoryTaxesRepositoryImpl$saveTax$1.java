package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl", f = "BusinessInventoryTaxesRepositoryImpl.kt", i = {0, 0}, l = {138}, m = "saveTax", n = {"tax", "mutation"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryTaxesRepositoryImpl$saveTax$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.saveTax(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryTaxesRepositoryImpl$saveTax$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl businessInventoryTaxesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$saveTax$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = businessInventoryTaxesRepositoryImpl;
    }
}
