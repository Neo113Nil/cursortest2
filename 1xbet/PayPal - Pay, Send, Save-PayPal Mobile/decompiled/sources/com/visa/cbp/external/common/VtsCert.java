package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class VtsCert {
    private java.lang.String certUsage;
    private java.lang.String vCertificateID;

    public void init(java.lang.String str, java.lang.String str2) {
        this.vCertificateID = str;
        this.certUsage = str2;
    }

    public java.lang.String getVCertificateID() {
        return this.vCertificateID;
    }

    public void setVCertificateID(java.lang.String str) {
        this.vCertificateID = str;
    }

    public java.lang.String getCertUsage() {
        return this.certUsage;
    }

    public void setCertUsage(java.lang.String str) {
        this.certUsage = str;
    }

    public static void ReplenishAckRequest(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2090, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 2090 - android.graphics.Color.red(0), android.graphics.Color.alpha(0) + 30)).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), 2090 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31)).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.graphics.Color.alpha(0), 2090 - android.text.TextUtils.getOffsetAfter("", 0), 29 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
