package com.visa.cbp;

/* loaded from: classes16.dex */
public class getDeviceModel extends com.visa.cbp.sdk.facade.exception.HookDetectException {
    getDeviceModel() {
    }

    getDeviceModel(com.visa.cbp.setDeviceCerts setdevicecerts) {
        super(setdevicecerts);
    }

    public static void values(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 2090 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 30)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 2090 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.blue(0) + 30)).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2042, 30 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), android.view.KeyEvent.normalizeMetaState(0) + 2090, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30)).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }

    public static void i(java.lang.Object obj, int i, int i2) {
        try {
            java.lang.Object[] objArr = {obj, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            java.lang.Object obj2 = com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.get(-1422457014);
            if (obj2 == null) {
                obj2 = ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 99 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.getTrimmedLength("") + 25)).getMethod("A", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.visa.cbp.setIssuerApplicationDiscretionaryData.getMac.put(-1422457014, obj2);
            }
            ((java.lang.reflect.Method) obj2).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
