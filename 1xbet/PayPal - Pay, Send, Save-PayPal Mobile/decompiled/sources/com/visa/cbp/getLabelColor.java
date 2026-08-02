package com.visa.cbp;

/* loaded from: classes16.dex */
public final class getLabelColor extends com.visa.cbp.getContactWebsite {
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int[] Camera2StreamConfigurationMap = null;
    private int[] getHighSpeedVideoSizes = null;
    private int[] getHighSpeedVideoFpsRangesFor = null;

    @Override // com.visa.cbp.getContactWebsite, com.visa.cbp.CardDatum
    public final void valueOf() {
    }

    @Override // com.visa.cbp.getContactWebsite, com.visa.cbp.CardDatum
    public final int values() {
        return 8;
    }

    @Override // com.visa.cbp.getContactWebsite, com.visa.cbp.CardDatum
    public final void ReplenishAckRequest(boolean z, com.visa.cbp.setContent setcontent) {
        if (!(setcontent instanceof com.visa.cbp.getContactNumber)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid parameter passed to DESede init - ");
            sb.append(setcontent.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        byte[] bArr = ((com.visa.cbp.getContactNumber) setcontent).BuildConfig;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new java.lang.IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        byte[] bArr2 = new byte[8];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 8);
        this.Camera2StreamConfigurationMap = valueOf(z, bArr2);
        byte[] bArr3 = new byte[8];
        java.lang.System.arraycopy(bArr, 8, bArr3, 0, 8);
        this.getHighSpeedVideoSizes = valueOf(!z, bArr3);
        if (bArr.length == 24) {
            byte[] bArr4 = new byte[8];
            java.lang.System.arraycopy(bArr, 16, bArr4, 0, 8);
            this.getHighSpeedVideoFpsRangesFor = valueOf(z, bArr4);
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
    }

    @Override // com.visa.cbp.getContactWebsite, com.visa.cbp.CardDatum
    public final java.lang.String BuildConfig() {
        return "DESede";
    }

    @Override // com.visa.cbp.getContactWebsite, com.visa.cbp.CardDatum
    public final int ReplenishAckRequest(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.Camera2StreamConfigurationMap;
        if (iArr == null) {
            throw new java.lang.IllegalStateException("DESede engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new com.visa.cbp.setContentType("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new com.visa.cbp.getBackgroundColor("output buffer too short");
        }
        byte[] bArr3 = new byte[8];
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            ConfirmReplenishRequest(iArr, bArr, i, bArr3, 0);
            ConfirmReplenishRequest(this.getHighSpeedVideoSizes, bArr3, 0, bArr3, 0);
            ConfirmReplenishRequest(this.getHighSpeedVideoFpsRangesFor, bArr3, 0, bArr2, i2);
        } else {
            ConfirmReplenishRequest(this.getHighSpeedVideoFpsRangesFor, bArr, i, bArr3, 0);
            ConfirmReplenishRequest(this.getHighSpeedVideoSizes, bArr3, 0, bArr3, 0);
            ConfirmReplenishRequest(this.Camera2StreamConfigurationMap, bArr3, 0, bArr2, i2);
        }
        return 8;
    }
}
