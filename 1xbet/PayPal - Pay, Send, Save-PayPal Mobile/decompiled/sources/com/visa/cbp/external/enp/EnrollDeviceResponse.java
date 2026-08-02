package com.visa.cbp.external.enp;

/* loaded from: classes16.dex */
public class EnrollDeviceResponse {
    private java.lang.String clientDeviceID;
    private java.lang.String deviceID;
    private java.lang.String requestID;
    private java.lang.String vClientID;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String vServerNonce;

    public java.lang.String getRequestID() {
        return this.requestID;
    }

    public void setRequestID(java.lang.String str) {
        this.requestID = str;
    }

    public java.lang.String getClientDeviceID() {
        return this.clientDeviceID;
    }

    public void setClientDeviceID(java.lang.String str) {
        this.clientDeviceID = str;
    }

    public java.lang.String getDeviceID() {
        return this.deviceID;
    }

    public void setDeviceID(java.lang.String str) {
        this.deviceID = str;
    }

    public java.lang.String getVClientID() {
        return this.vClientID;
    }

    public void setVClientID(java.lang.String str) {
        this.vClientID = str;
    }

    public java.lang.String getVServerNonce() {
        return this.vServerNonce;
    }

    public void setVServerNonce(java.lang.String str) {
        this.vServerNonce = str;
    }

    public static void ConfirmReplenishRequest(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2090 - (android.os.Process.myTid() >> 22), android.text.TextUtils.indexOf("", "") + 30)).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1), android.text.TextUtils.indexOf("", "") + 2090, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31)).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2090, 31 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), 2090 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 30 - (android.os.Process.myTid() >> 22))).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
