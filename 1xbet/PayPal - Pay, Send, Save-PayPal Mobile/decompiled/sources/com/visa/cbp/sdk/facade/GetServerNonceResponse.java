package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class GetServerNonceResponse {
    private java.lang.String jwsServerData;

    public java.lang.String getJwsServerData() {
        return this.jwsServerData;
    }

    public void setJwsServerData(java.lang.String str) {
        this.jwsServerData = str;
    }

    public static void ReplenishAckRequest(com.visa.cbp.getIssuerApplicationDiscretionaryData getissuerapplicationdiscretionarydata) {
        try {
            if (getissuerapplicationdiscretionarydata.ConfirmReplenishRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) android.text.TextUtils.indexOf("", ""), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2089, 30 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getField("ConfirmReplenishRequest").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.values()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 2090, 30 - android.graphics.Color.green(0))).getField("BuildConfig").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.ReplenishAckRequest()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) (android.os.Process.myPid() >> 22), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2090, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 30)).getField("values").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
            if (getissuerapplicationdiscretionarydata.BuildConfig()) {
                ((java.lang.Class) com.visa.cbp.setIssuerApplicationDiscretionaryData.valueOf((char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.text.TextUtils.getOffsetAfter("", 0) + 2090, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.google.common.base.Ascii.US)).getField("valueOf").setInt(null, (int) getissuerapplicationdiscretionarydata.valueOf());
            }
        } catch (com.visa.cbp.sdk.facade.exception.VisaPaymentSDKException unused) {
        }
    }
}
