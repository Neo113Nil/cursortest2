package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5", f = "ManageCardActionItemsBuilder.kt", i = {0, 1}, l = {152, 153}, m = "build", n = {"details", "details"}, nl = {153, 150}, s = {"L$0", "L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5 getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.build(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5 manageCardActionItemsBuilder$getCardItemBuilders$5, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$getCardItemBuilders$5$build$1> continuation) {
        super(continuation);
        this.getInputFormats = manageCardActionItemsBuilder$getCardItemBuilders$5;
    }
}
