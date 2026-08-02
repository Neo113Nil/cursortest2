package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder", f = "ManageCardActionItemsBuilder.kt", i = {0}, l = {361}, m = "getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease", n = {"manageCardDetails"}, nl = {362}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getAutopayAccessibilityDescription$revolvingcredit_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getAutopayAccessibilityDescription$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = manageCardActionItemsBuilder;
    }
}
