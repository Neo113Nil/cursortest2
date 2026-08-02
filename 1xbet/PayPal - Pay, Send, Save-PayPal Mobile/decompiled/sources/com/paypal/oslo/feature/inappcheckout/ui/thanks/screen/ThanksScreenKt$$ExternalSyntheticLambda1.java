package com.paypal.oslo.feature.inappcheckout.ui.thanks.screen;

/* loaded from: classes13.dex */
public final /* synthetic */ class ThanksScreenKt$$ExternalSyntheticLambda1 implements kotlin.jvm.functions.Function0 {
    public static int getHighSpeedVideoFpsRangesFor;
    public static int getHighSpeedVideoSizes;
    public final /* synthetic */ com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel f$0;

    public /* synthetic */ ThanksScreenKt$$ExternalSyntheticLambda1(com.paypal.oslo.feature.inappcheckout.ui.thanks.viewmodel.ThanksViewModel thanksViewModel) {
        this.f$0 = thanksViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return com.paypal.oslo.feature.inappcheckout.ui.thanks.screen.ThanksScreenKt.m15578$r8$lambda$WXhuDxzHB0PEETX07zdrp6pIeQ(this.f$0);
    }

    public static int Camera2StreamConfigurationMap() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i % 5211641;
        getHighSpeedVideoFpsRangesFor = i + 1;
        if (i2 != 0) {
            return getHighSpeedVideoSizes;
        }
        int myUid = android.os.Process.myUid();
        getHighSpeedVideoSizes = myUid;
        return myUid;
    }
}
