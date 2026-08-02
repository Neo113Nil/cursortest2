package com.visa.cbp.sdk.facade.data;

/* loaded from: classes5.dex */
public class ApduResponse {
    byte[] apduData;
    com.visa.cbp.sdk.facade.error.CbpError cbpError;

    public ApduResponse(byte[] bArr, com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        this.apduData = bArr;
        this.cbpError = cbpError;
    }

    public byte[] getApduData() {
        return this.apduData;
    }

    public com.visa.cbp.sdk.facade.error.CbpError getCbpError() {
        return this.cbpError;
    }

    public void setApduData(byte[] bArr) {
        this.apduData = bArr;
    }

    public void setCbpError(com.visa.cbp.sdk.facade.error.CbpError cbpError) {
        this.cbpError = cbpError;
    }
}
