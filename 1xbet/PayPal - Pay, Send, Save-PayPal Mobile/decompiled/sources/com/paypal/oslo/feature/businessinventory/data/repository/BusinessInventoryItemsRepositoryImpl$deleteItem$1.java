package com.paypal.oslo.feature.businessinventory.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl", f = "BusinessInventoryItemsRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {157, 171}, m = "deleteItem", n = {"item", "mutation", "item", "mutation", "this_$iv", "it$iv", "it", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-BusinessInventoryItemsRepositoryImpl$deleteItem$6"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$4", "L$5", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes11.dex */
final class BusinessInventoryItemsRepositoryImpl$deleteItem$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDuration.deleteItem(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessInventoryItemsRepositoryImpl$deleteItem$1(com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl businessInventoryItemsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl$deleteItem$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = businessInventoryItemsRepositoryImpl;
    }
}
