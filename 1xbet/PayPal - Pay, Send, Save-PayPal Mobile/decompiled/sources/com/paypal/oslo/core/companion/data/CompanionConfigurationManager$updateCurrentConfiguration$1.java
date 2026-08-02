package com.paypal.oslo.core.companion.data;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.companion.data.CompanionConfigurationManager", f = "CompanionConfigurationManager.kt", i = {0, 0, 0}, l = {323}, m = "updateCurrentConfiguration", n = {"newConfig", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {324}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes10.dex */
final class CompanionConfigurationManager$updateCurrentConfiguration$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.core.companion.data.CompanionConfigurationManager getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanionConfigurationManager$updateCurrentConfiguration$1(com.paypal.oslo.core.companion.data.CompanionConfigurationManager companionConfigurationManager, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.companion.data.CompanionConfigurationManager$updateCurrentConfiguration$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = companionConfigurationManager;
    }
}
