package com.visa.cbp;

/* loaded from: classes16.dex */
public class setPhone {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    public setPhone(java.lang.Object[] objArr) {
        this.getHighSpeedVideoFpsRangesFor = (byte[]) objArr[0];
        this.getHighSpeedVideoSizes = (byte[]) objArr[1];
        this.getHighResolutionOutputSizeshNQ4ISI = (byte[]) objArr[2];
    }

    public setPhone(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = bArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr3;
    }

    public byte[] BuildConfig() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] ReplenishAckRequest() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] ConfirmReplenishRequest() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
