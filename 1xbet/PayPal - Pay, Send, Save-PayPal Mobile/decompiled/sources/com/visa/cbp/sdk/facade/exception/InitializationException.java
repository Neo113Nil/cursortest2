package com.visa.cbp.sdk.facade.exception;

/* loaded from: classes5.dex */
public class InitializationException extends com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException {
    public InitializationException(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public static void ReplenishAckRequest(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), (android.os.Process.myPid() >> 22) + 2090, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 30)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 2090 - android.text.TextUtils.indexOf("", ""), 'N' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2090, 30 - android.view.KeyEvent.normalizeMetaState(0))).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.view.KeyEvent.getDeadChar(0, 0), 2090 - android.graphics.Color.green(0), (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 29)).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
