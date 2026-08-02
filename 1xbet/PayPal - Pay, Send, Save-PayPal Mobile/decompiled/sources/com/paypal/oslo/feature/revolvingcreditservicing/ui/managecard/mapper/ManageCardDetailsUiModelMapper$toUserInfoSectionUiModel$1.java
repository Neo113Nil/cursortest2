package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper", f = "ManageCardDetailsUiModelMapper.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {63}, m = "toUserInfoSectionUiModel", n = {"manageCardDetails", "email", "phoneNumber", "phone", "address", "it", "$i$a$-let-ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$formattedAddress$1"}, nl = {63}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.toUserInfoSectionUiModel(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toUserInfoSectionUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = manageCardDetailsUiModelMapper;
    }
}
