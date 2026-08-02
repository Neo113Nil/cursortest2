package com.paypal.android.taptopay.data.thales.init;

@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.android.taptopay.data.thales.init.ThalesInitializer", f = "ThalesInitializer.kt", i = {0, 0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE}, m = "initCps", n = {"this", "retries", "this", "retries"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes4.dex */
final class ThalesInitializer$initCps$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.android.taptopay.data.thales.init.ThalesInitializer getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return com.paypal.android.taptopay.data.thales.init.ThalesInitializer.access$initCps(this.getHighSpeedVideoFpsRanges, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThalesInitializer$initCps$1(com.paypal.android.taptopay.data.thales.init.ThalesInitializer thalesInitializer, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.data.thales.init.ThalesInitializer$initCps$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = thalesInitializer;
    }
}
