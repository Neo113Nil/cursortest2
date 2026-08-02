package com.paypal.oslo.feature.taptopay.data.observer.auth;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver", f = "TapToPaySwitchUserObserver.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {84, 85, 87}, m = "handleSwitchUser", n = {"this_$iv", "operation$iv", "$completion", "$i$f$runCatchingAndLog", "$i$a$-runCatchingAndLog-TapToPaySwitchUserObserver$handleSwitchUser$2", "this_$iv", "operation$iv", "$completion", "$i$f$runCatchingAndLog", "$i$a$-runCatchingAndLog-TapToPaySwitchUserObserver$handleSwitchUser$3", "this_$iv", "operation$iv", "$completion", "$i$f$runCatchingAndLog", "$i$a$-runCatchingAndLog-TapToPaySwitchUserObserver$handleSwitchUser$5"}, nl = {107, 119, 143}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes5.dex */
final class TapToPaySwitchUserObserver$handleSwitchUser$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getInputFormats.Camera2StreamConfigurationMap(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPaySwitchUserObserver$handleSwitchUser$1(com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver tapToPaySwitchUserObserver, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.observer.auth.TapToPaySwitchUserObserver$handleSwitchUser$1> continuation) {
        super(continuation);
        this.getInputFormats = tapToPaySwitchUserObserver;
    }
}
