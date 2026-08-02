package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl", f = "BusinessInventoryTaxesRepositoryImpl.kt", i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {66, 77, 83}, m = "syncTaxes", n = {"query", "query", "result", "this_$iv", "graphQLData", "$i$f$fold", "$i$a$-fold-BusinessInventoryTaxesRepositoryImpl$syncTaxes$4", "query", "result", "this_$iv", "error", "graphQLData", "$i$f$fold", "$i$a$-fold-BusinessInventoryTaxesRepositoryImpl$syncTaxes$5"}, nl = {67, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryTaxesRepositoryImpl$syncTaxes$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.syncTaxes(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryTaxesRepositoryImpl$syncTaxes$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl businessInventoryTaxesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl$syncTaxes$1> continuation) {
        super(continuation);
        this.getOutputFormats = businessInventoryTaxesRepositoryImpl;
    }
}
