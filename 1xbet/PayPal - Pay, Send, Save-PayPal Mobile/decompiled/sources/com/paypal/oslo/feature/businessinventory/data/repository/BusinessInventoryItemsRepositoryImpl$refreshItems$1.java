package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl", f = "BusinessInventoryItemsRepositoryImpl.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {66, 93}, m = "refreshItems", n = {"query", "query", "result", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-BusinessInventoryItemsRepositoryImpl$refreshItems$7"}, nl = {68, 94}, s = {"L$0", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsRepositoryImpl$refreshItems$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputSizes.refreshItems(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsRepositoryImpl$refreshItems$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl businessInventoryItemsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$refreshItems$1> continuation) {
        super(continuation);
        this.getOutputSizes = businessInventoryItemsRepositoryImpl;
    }
}
