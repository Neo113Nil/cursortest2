package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel", f = "NameViewComponentViewModel.kt", i = {0, 0, 0, 0, 0}, l = {150}, m = "validateName", n = {"name", "nationality", "messages", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "config"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes13.dex */
final class NameViewComponentViewModel$validateName$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel.access$validateName(this.getHighSpeedVideoSizesFor, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameViewComponentViewModel$validateName$1(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel nameViewComponentViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewComponentViewModel$validateName$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = nameViewComponentViewModel;
    }
}
