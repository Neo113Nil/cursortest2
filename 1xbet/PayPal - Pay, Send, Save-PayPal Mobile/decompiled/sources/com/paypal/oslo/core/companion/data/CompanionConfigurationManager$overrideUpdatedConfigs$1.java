package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionConfigurationManager", f = "CompanionConfigurationManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {323, 130}, m = "overrideUpdatedConfigs", n = {"config", "$this$withLock_u24default$iv", "$i$f$withLock", "config", "configSnapshot", "$this$forEach$iv", "element$iv", "newSection", "currentSection", "$i$f$forEach", "$i$a$-forEach-CompanionConfigurationManager$overrideUpdatedConfigs$2"}, nl = {324, 131}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes10.dex */
final class CompanionConfigurationManager$overrideUpdatedConfigs$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionConfigurationManager getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputSizes.getHighSpeedVideoFpsRangesFor(null, this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionConfigurationManager$overrideUpdatedConfigs$1(com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionConfigurationManager$overrideUpdatedConfigs$1> continuation) {
        super(continuation);
        this.getOutputSizes = companionConfigurationManager;
    }
}
