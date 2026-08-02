package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionConfigurationManager", f = "CompanionConfigurationManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE}, m = "overrideUpdatedSubsections", n = {"newSubsections", "currentSubsections", "parentResolver", "$this$forEach$iv", "element$iv", "newSubsection", "resolverToUse", "currentSubsection", "$i$f$forEach", "$i$a$-forEach-CompanionConfigurationManager$overrideUpdatedSubsections$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class CompanionConfigurationManager$overrideUpdatedSubsections$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionConfigurationManager getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getOutputStallDuration.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionConfigurationManager$overrideUpdatedSubsections$1(com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedSubsections$1> continuation) {
        super(continuation);
        this.getOutputStallDuration = companionConfigurationManager;
    }
}
