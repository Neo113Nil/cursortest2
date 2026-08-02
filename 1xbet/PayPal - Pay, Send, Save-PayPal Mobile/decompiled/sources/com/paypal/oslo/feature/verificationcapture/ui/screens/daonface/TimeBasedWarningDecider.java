package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/TimeBasedWarningDecider;", "", "<init>", "()V", "", "timeSinceGoodFace", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;", "decideWarning", "(J)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TimeBasedWarningDecider {
    public static final int $stable = 0;

    public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState decideWarning(long timeSinceGoodFace) {
        if (timeSinceGoodFace > 1500) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.ORANGE, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage.CENTER_FACE);
        }
        if (timeSinceGoodFace > 400) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.WHITE, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage.CENTER_FACE);
        }
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.WHITE);
    }
}
