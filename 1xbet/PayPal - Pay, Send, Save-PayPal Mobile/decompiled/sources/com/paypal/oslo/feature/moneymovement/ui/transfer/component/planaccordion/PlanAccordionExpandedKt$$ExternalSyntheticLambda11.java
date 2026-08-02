package com.paypal.oslo.feature.moneymovement.ui.transfer.component.planaccordion;

/* loaded from: classes13.dex */
public final /* synthetic */ class PlanAccordionExpandedKt$$ExternalSyntheticLambda11 implements kotlin.jvm.functions.Function0 {
    public static int getHighSpeedVideoFpsRanges;
    public static int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        androidx.compose.runtime.MutableState mutableStateOf$default;
        mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
        return mutableStateOf$default;
    }

    public static int getHighSpeedVideoSizes() {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i % 6112066;
        getHighSpeedVideoFpsRangesFor = i + 1;
        if (i2 != 0) {
            return getHighSpeedVideoFpsRanges;
        }
        int myPid = android.os.Process.myPid();
        getHighSpeedVideoFpsRanges = myPid;
        return myPid;
    }
}
