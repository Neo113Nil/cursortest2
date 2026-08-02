package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public class PanInformation {
    private java.lang.String last4;
    private java.lang.String panId;
    private java.lang.String status;

    public java.lang.String getPanId() {
        return this.panId;
    }

    public void setPanId(java.lang.String str) {
        this.panId = str;
    }

    public java.lang.String getLast4() {
        return this.last4;
    }

    public void setLast4(java.lang.String str) {
        this.last4 = str;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String str) {
        this.status = str;
    }

    public static void BuildConfig(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.Process.getThreadPriority(0) + 20) >> 6), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2089, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 2091 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.text.TextUtils.indexOf("", "", 0) + 30)).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), android.view.Gravity.getAbsoluteGravity(0, 0) + 2090, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 30)).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2090 - android.view.View.MeasureSpec.getMode(0), 31 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
