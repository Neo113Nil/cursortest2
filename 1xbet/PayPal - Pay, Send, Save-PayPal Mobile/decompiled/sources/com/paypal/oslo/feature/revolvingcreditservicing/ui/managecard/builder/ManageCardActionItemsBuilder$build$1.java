package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder", f = "ManageCardActionItemsBuilder.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {63}, m = "build", n = {"manageCardDetails", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "builder", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "$i$a$-mapNotNull-ManageCardActionItemsBuilder$build$2"}, nl = {411}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardActionItemsBuilder$build$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder isOutputSupportedForhNQ4ISI;
    /* synthetic */ java.lang.Object toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.toString = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.isOutputSupportedForhNQ4ISI.build(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardActionItemsBuilder$build$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder manageCardActionItemsBuilder, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.builder.ManageCardActionItemsBuilder$build$1> continuation) {
        super(continuation);
        this.isOutputSupportedForhNQ4ISI = manageCardActionItemsBuilder;
    }
}
