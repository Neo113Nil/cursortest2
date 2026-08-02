package com.visa.cbp;

/* loaded from: classes16.dex */
public final class setForegroundColor extends com.visa.cbp.setGuid {
    public setForegroundColor(com.visa.cbp.CardDatum cardDatum) {
        this.ConfirmReplenishRequest = cardDatum;
        this.ReplenishAckRequest = new byte[cardDatum.values()];
        this.valueOf = 0;
    }

    @Override // com.visa.cbp.setGuid
    public final int BuildConfig(int i) {
        int length;
        int i2 = i + this.valueOf;
        int length2 = i2 % this.ReplenishAckRequest.length;
        if (length2 == 0) {
            if (!this.BuildConfig) {
                return i2;
            }
            length = this.ReplenishAckRequest.length;
        } else {
            i2 -= length2;
            length = this.ReplenishAckRequest.length;
        }
        return i2 + length;
    }

    @Override // com.visa.cbp.setGuid
    public final int ConfirmReplenishRequest(int i) {
        int i2 = i + this.valueOf;
        int length = i2 % this.ReplenishAckRequest.length;
        return length == 0 ? i2 - this.ReplenishAckRequest.length : i2 - length;
    }

    @Override // com.visa.cbp.setGuid
    public final int valueOf(byte[] bArr, int i, int i2, byte[] bArr2) throws com.visa.cbp.setContentType, java.lang.IllegalStateException {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Can't have a negative input length!");
        }
        int BuildConfig = BuildConfig();
        int i3 = this.valueOf + i2;
        int length = i3 % this.ReplenishAckRequest.length;
        if (length == 0) {
            length = this.ReplenishAckRequest.length;
        }
        int i4 = i3 - length;
        if (i4 > 0 && i4 > bArr2.length) {
            throw new com.visa.cbp.getBackgroundColor("output buffer too short");
        }
        int length2 = this.ReplenishAckRequest.length - this.valueOf;
        int i5 = 0;
        if (i2 > length2) {
            java.lang.System.arraycopy(bArr, 0, this.ReplenishAckRequest, this.valueOf, length2);
            int ReplenishAckRequest = this.ConfirmReplenishRequest.ReplenishAckRequest(this.ReplenishAckRequest, 0, bArr2, 0);
            this.valueOf = 0;
            i2 -= length2;
            i5 = ReplenishAckRequest;
            i = length2;
            while (i2 > this.ReplenishAckRequest.length) {
                i5 += this.ConfirmReplenishRequest.ReplenishAckRequest(bArr, i, bArr2, i5);
                i2 -= BuildConfig;
                i += BuildConfig;
            }
        }
        java.lang.System.arraycopy(bArr, i, this.ReplenishAckRequest, this.valueOf, i2);
        this.valueOf += i2;
        return i5;
    }

    @Override // com.visa.cbp.setGuid
    public final int ConfirmReplenishRequest(byte[] bArr, int i) throws com.visa.cbp.setContentType, java.lang.IllegalStateException, com.visa.cbp.CardMetaData {
        int i2;
        int i3;
        int values = this.ConfirmReplenishRequest.values();
        if (this.BuildConfig) {
            if (this.valueOf != values) {
                i3 = 0;
            } else {
                if ((values * 2) + i > bArr.length) {
                    throw new com.visa.cbp.getBackgroundColor("output buffer too short");
                }
                i3 = this.ConfirmReplenishRequest.ReplenishAckRequest(this.ReplenishAckRequest, 0, bArr, i);
                this.valueOf = 0;
            }
            byte b = (byte) (values - this.valueOf);
            while (this.valueOf < values) {
                this.ReplenishAckRequest[this.valueOf] = b;
                this.valueOf++;
            }
            i2 = i3 + this.ConfirmReplenishRequest.ReplenishAckRequest(this.ReplenishAckRequest, 0, bArr, i + i3);
        } else if (this.valueOf == values) {
            int ReplenishAckRequest = this.ConfirmReplenishRequest.ReplenishAckRequest(this.ReplenishAckRequest, 0, this.ReplenishAckRequest, 0);
            this.valueOf = 0;
            int i4 = this.ReplenishAckRequest[values - 1] & 255;
            if (i4 > values) {
                throw new com.visa.cbp.CardMetaData("pad block corrupted");
            }
            i2 = ReplenishAckRequest - i4;
            java.lang.System.arraycopy(this.ReplenishAckRequest, 0, bArr, i, i2);
        } else {
            throw new com.visa.cbp.setContentType("last block incomplete in decryption");
        }
        ConfirmReplenishRequest();
        return i2;
    }
}
