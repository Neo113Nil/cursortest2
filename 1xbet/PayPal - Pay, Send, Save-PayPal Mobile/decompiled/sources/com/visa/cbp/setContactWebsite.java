package com.visa.cbp;

/* loaded from: classes16.dex */
public final class setContactWebsite implements com.visa.cbp.CardDatum {
    private boolean Camera2StreamConfigurationMap;
    private com.visa.cbp.CardDatum getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;

    public setContactWebsite(com.visa.cbp.CardDatum cardDatum) {
        this.getHighResolutionOutputSizeshNQ4ISI = cardDatum;
        int values = cardDatum.values();
        this.getHighSpeedVideoSizesFor = values;
        this.getHighSpeedVideoFpsRangesFor = new byte[values];
        this.getHighSpeedVideoFpsRanges = new byte[values];
        this.getHighSpeedVideoSizes = new byte[values];
    }

    @Override // com.visa.cbp.CardDatum
    public final void ReplenishAckRequest(boolean z, com.visa.cbp.setContent setcontent) throws java.lang.IllegalArgumentException {
        boolean z2 = this.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = z;
        if (!(setcontent instanceof com.visa.cbp.getContactEmail)) {
            valueOf();
            if (setcontent != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.ReplenishAckRequest(z, setcontent);
                return;
            } else {
                if (z2 != z) {
                    throw new java.lang.IllegalArgumentException("cannot change encrypting state without providing key.");
                }
                return;
            }
        }
        byte[] bArr = ((com.visa.cbp.getContactEmail) setcontent).valueOf;
        throw null;
    }

    @Override // com.visa.cbp.CardDatum
    public final java.lang.String BuildConfig() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.BuildConfig());
        sb.append("/CBC");
        return sb.toString();
    }

    @Override // com.visa.cbp.CardDatum
    public final int values() {
        return this.getHighResolutionOutputSizeshNQ4ISI.values();
    }

    @Override // com.visa.cbp.CardDatum
    public final int ReplenishAckRequest(byte[] bArr, int i, byte[] bArr2, int i2) throws com.visa.cbp.setContentType, java.lang.IllegalStateException {
        if (this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoSizesFor + i > bArr.length) {
                throw new com.visa.cbp.setContentType("input buffer too short");
            }
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizesFor; i3++) {
                byte[] bArr3 = this.getHighSpeedVideoFpsRanges;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i + i3]);
            }
            int ReplenishAckRequest = this.getHighResolutionOutputSizeshNQ4ISI.ReplenishAckRequest(this.getHighSpeedVideoFpsRanges, 0, bArr2, i2);
            byte[] bArr4 = this.getHighSpeedVideoFpsRanges;
            java.lang.System.arraycopy(bArr2, i2, bArr4, 0, bArr4.length);
            return ReplenishAckRequest;
        }
        int i4 = this.getHighSpeedVideoSizesFor;
        if (i + i4 > bArr.length) {
            throw new com.visa.cbp.setContentType("input buffer too short");
        }
        java.lang.System.arraycopy(bArr, i, this.getHighSpeedVideoSizes, 0, i4);
        int ReplenishAckRequest2 = this.getHighResolutionOutputSizeshNQ4ISI.ReplenishAckRequest(bArr, i, bArr2, i2);
        for (int i5 = 0; i5 < this.getHighSpeedVideoSizesFor; i5++) {
            int i6 = i2 + i5;
            bArr2[i6] = (byte) (bArr2[i6] ^ this.getHighSpeedVideoFpsRanges[i5]);
        }
        byte[] bArr5 = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
        this.getHighSpeedVideoSizes = bArr5;
        return ReplenishAckRequest2;
    }

    @Override // com.visa.cbp.CardDatum
    public final void valueOf() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoFpsRanges, 0, bArr.length);
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        for (int i = 0; i < bArr2.length; i++) {
            bArr2[i] = 0;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.valueOf();
    }
}
