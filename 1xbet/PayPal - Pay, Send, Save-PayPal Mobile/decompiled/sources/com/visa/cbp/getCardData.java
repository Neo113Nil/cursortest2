package com.visa.cbp;

/* loaded from: classes5.dex */
public final class getCardData implements com.visa.cbp.getLongDescription {
    private static final java.util.List getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(new java.util.ArrayList());
    public java.lang.String BuildConfig;
    public java.util.List ConfirmReplenishRequest;
    public byte[] ReplenishAckRequest;

    @Override // com.visa.cbp.getLongDescription
    public final com.visa.cbp.getCardData valueOf() throws com.visa.cbp.setTermsAndConditionsID {
        return this;
    }

    public getCardData(java.lang.String str, byte[] bArr) {
        this(str, getHighSpeedVideoFpsRanges, bArr);
    }

    private getCardData(java.lang.String str, java.util.List list, byte[] bArr) {
        this.BuildConfig = str;
        this.ConfirmReplenishRequest = java.util.Collections.unmodifiableList(list);
        this.ReplenishAckRequest = bArr;
    }
}
