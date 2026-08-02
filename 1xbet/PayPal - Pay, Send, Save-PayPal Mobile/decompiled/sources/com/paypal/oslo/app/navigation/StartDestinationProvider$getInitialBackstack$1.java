package com.paypal.oslo.app.navigation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.navigation.StartDestinationProvider", f = "StartDestinationProvider.kt", i = {0, 0, 1, 1}, l = {127, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "getInitialBackstack", n = {"intent", "parseResult", "intent", "parseResult"}, nl = {129, 136}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class StartDestinationProvider$getInitialBackstack$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.app.navigation.StartDestinationProvider getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.getInitialBackstack(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartDestinationProvider$getInitialBackstack$1(com.paypal.oslo.app.navigation.StartDestinationProvider startDestinationProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.navigation.StartDestinationProvider$getInitialBackstack$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = startDestinationProvider;
    }
}
