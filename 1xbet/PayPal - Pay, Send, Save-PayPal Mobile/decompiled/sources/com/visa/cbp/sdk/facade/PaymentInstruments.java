package com.visa.cbp.sdk.facade;

/* loaded from: classes16.dex */
public class PaymentInstruments {
    private java.util.List<com.visa.cbp.sdk.facade.PanInformation> panInformation = new java.util.ArrayList();

    public java.util.List<com.visa.cbp.sdk.facade.PanInformation> getPanInformation() {
        return this.panInformation;
    }

    public void setPanInformation(java.util.List<com.visa.cbp.sdk.facade.PanInformation> list) {
        this.panInformation = list;
    }
}
