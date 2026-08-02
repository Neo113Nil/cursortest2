package com.visa.cbp.external.common;

/* loaded from: classes5.dex */
public class DigitalTicket {

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String ticketMetaData;

    @com.visa.cbp.external.common.NullValueValidate
    java.lang.String vdtContainer;

    public java.lang.String getTicketMetaData() {
        return this.ticketMetaData;
    }

    public void setTicketMetaData(java.lang.String str) {
        this.ticketMetaData = str;
    }

    public java.lang.String getVdtContainer() {
        return this.vdtContainer;
    }

    public void setVdtContainer(java.lang.String str) {
        this.vdtContainer = str;
    }
}
