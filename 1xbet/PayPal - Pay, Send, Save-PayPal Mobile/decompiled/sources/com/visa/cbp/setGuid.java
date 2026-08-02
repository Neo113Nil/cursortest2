package com.visa.cbp;

/* loaded from: classes16.dex */
public class setGuid {
    protected boolean BuildConfig;
    protected com.visa.cbp.CardDatum ConfirmReplenishRequest;
    protected byte[] ReplenishAckRequest;
    private boolean getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizes;
    protected int valueOf;

    public setGuid() {
    }

    public setGuid(com.visa.cbp.CardDatum cardDatum) {
        this.ConfirmReplenishRequest = cardDatum;
        this.ReplenishAckRequest = new byte[cardDatum.values()];
        boolean z = false;
        this.valueOf = 0;
        java.lang.String BuildConfig = cardDatum.BuildConfig();
        int indexOf = BuildConfig.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && BuildConfig.startsWith("PGP", indexOf);
        this.getHighSpeedVideoFpsRanges = z2;
        if (z2 || (indexOf > 0 && BuildConfig.startsWith("OpenPGP", indexOf))) {
            z = true;
        }
        this.getHighSpeedVideoSizes = z;
    }

    public final void values(boolean z, com.visa.cbp.setContent setcontent) throws java.lang.IllegalArgumentException {
        this.BuildConfig = z;
        ConfirmReplenishRequest();
        this.ConfirmReplenishRequest.ReplenishAckRequest(z, setcontent);
    }

    public final int BuildConfig() {
        return this.ConfirmReplenishRequest.values();
    }

    public int ConfirmReplenishRequest(int i) {
        int length;
        int i2 = i + this.valueOf;
        if (this.getHighSpeedVideoFpsRanges) {
            if (this.BuildConfig) {
                length = (i2 % this.ReplenishAckRequest.length) - (this.ConfirmReplenishRequest.values() + 2);
            } else {
                length = i2 % this.ReplenishAckRequest.length;
            }
        } else {
            length = i2 % this.ReplenishAckRequest.length;
        }
        return i2 - length;
    }

    public int BuildConfig(int i) {
        return i + this.valueOf;
    }

    public int ConfirmReplenishRequest(byte[] bArr, int i) throws com.visa.cbp.setContentType, java.lang.IllegalStateException, com.visa.cbp.CardMetaData {
        try {
            int i2 = this.valueOf;
            if (i + i2 > bArr.length) {
                throw new com.visa.cbp.getBackgroundColor("output buffer too short for doFinal()");
            }
            int i3 = 0;
            if (i2 != 0) {
                if (!this.getHighSpeedVideoSizes) {
                    throw new com.visa.cbp.setContentType("data not block size aligned");
                }
                com.visa.cbp.CardDatum cardDatum = this.ConfirmReplenishRequest;
                byte[] bArr2 = this.ReplenishAckRequest;
                cardDatum.ReplenishAckRequest(bArr2, 0, bArr2, 0);
                int i4 = this.valueOf;
                this.valueOf = 0;
                java.lang.System.arraycopy(this.ReplenishAckRequest, 0, bArr, i, i4);
                i3 = i4;
            }
            return i3;
        } finally {
            ConfirmReplenishRequest();
        }
    }

    public final void ConfirmReplenishRequest() {
        int i = 0;
        while (true) {
            byte[] bArr = this.ReplenishAckRequest;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.valueOf = 0;
                this.ConfirmReplenishRequest.valueOf();
                return;
            }
        }
    }

    public int valueOf(byte[] bArr, int i, int i2, byte[] bArr2) throws com.visa.cbp.setContentType, java.lang.IllegalStateException {
        int i3;
        int i4;
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int values = this.ConfirmReplenishRequest.values();
        int ConfirmReplenishRequest = ConfirmReplenishRequest(i2);
        if (ConfirmReplenishRequest > 0 && ConfirmReplenishRequest > bArr2.length) {
            throw new com.visa.cbp.getBackgroundColor("output buffer too short");
        }
        byte[] bArr3 = this.ReplenishAckRequest;
        int length = bArr3.length;
        int i5 = this.valueOf;
        int i6 = length - i5;
        if (i2 > i6) {
            java.lang.System.arraycopy(bArr, 0, bArr3, i5, i6);
            int ReplenishAckRequest = this.ConfirmReplenishRequest.ReplenishAckRequest(this.ReplenishAckRequest, 0, bArr2, 0);
            this.valueOf = 0;
            int i7 = i2 - i6;
            while (i7 > this.ReplenishAckRequest.length) {
                ReplenishAckRequest += this.ConfirmReplenishRequest.ReplenishAckRequest(bArr, i6, bArr2, ReplenishAckRequest);
                i7 -= values;
                i6 += values;
            }
            i3 = i7;
            i4 = ReplenishAckRequest;
            i = i6;
        } else {
            i3 = i2;
            i4 = 0;
        }
        java.lang.System.arraycopy(bArr, i, this.ReplenishAckRequest, this.valueOf, i3);
        int i8 = this.valueOf + i3;
        this.valueOf = i8;
        byte[] bArr4 = this.ReplenishAckRequest;
        if (i8 != bArr4.length) {
            return i4;
        }
        int ReplenishAckRequest2 = i4 + this.ConfirmReplenishRequest.ReplenishAckRequest(bArr4, 0, bArr2, i4);
        this.valueOf = 0;
        return ReplenishAckRequest2;
    }
}
