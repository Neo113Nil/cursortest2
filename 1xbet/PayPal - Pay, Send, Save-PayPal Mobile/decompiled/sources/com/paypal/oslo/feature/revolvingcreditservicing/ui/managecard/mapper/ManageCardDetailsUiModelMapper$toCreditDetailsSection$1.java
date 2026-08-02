package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper", f = "ManageCardDetailsUiModelMapper.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "toCreditDetailsSection", n = {"manageCardDetails"}, nl = {165}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardDetailsUiModelMapper$toCreditDetailsSection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.toCreditDetailsSection(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardDetailsUiModelMapper$toCreditDetailsSection$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$toCreditDetailsSection$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = manageCardDetailsUiModelMapper;
    }
}
