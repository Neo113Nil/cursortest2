package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper", f = "ManageCardDetailsUiModelMapper.kt", i = {0, 0, 0}, l = {127}, m = "formatAddress", n = {"address", "i18nAddress", "config"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class ManageCardDetailsUiModelMapper$formatAddress$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageCardDetailsUiModelMapper$formatAddress$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper manageCardDetailsUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.mapper.ManageCardDetailsUiModelMapper$formatAddress$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = manageCardDetailsUiModelMapper;
    }
}
