package com.visa.cbp.external.aam;

/* loaded from: classes5.dex */
public class Signature {
    private java.lang.String mac;

    public java.lang.String getMac() {
        return this.mac;
    }

    public void setMac(java.lang.String str) {
        this.mac = str;
    }

    public static void ConfirmReplenishRequest(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.getCapsMode("", 0, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2091, 30 - android.text.TextUtils.indexOf("", "", 0))).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.indexOf("", "", 0), 2090 - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30)).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2090 - android.graphics.Color.blue(0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31)).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2090 - android.view.KeyEvent.getDeadChar(0, 0), android.graphics.Color.argb(0, 0, 0, 0) + 30)).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
