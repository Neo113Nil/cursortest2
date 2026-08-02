package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public final class Zuc256Mac implements org.bouncycastle.crypto.Mac {
    private final int[] Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.macs.Zuc256Mac.InternalZuc256Engine getHighResolutionOutputSizeshNQ4ISI;
    private final int[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private org.bouncycastle.crypto.engines.Zuc256CoreEngine getInputFormats;
    private int getInputSizeshNQ4ISI;

    private void Camera2StreamConfigurationMap(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            int i4 = this.getInputSizeshNQ4ISI + i2;
            int i5 = iArr2[i4 % iArr2.length];
            if (i != 0) {
                i5 = (iArr2[(i4 + 1) % iArr2.length] >>> (32 - i)) | (i5 << i);
            }
            iArr[i2] = i3 ^ i5;
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public final int doFinal(byte[] bArr, int i) {
        int i2 = (this.getHighSpeedVideoFpsRangesFor + 1) % 4;
        this.getHighSpeedVideoFpsRangesFor = i2;
        if (i2 == 0) {
            this.getInputSizeshNQ4ISI = (this.getInputSizeshNQ4ISI + 1) % this.getHighSpeedVideoFpsRanges.length;
        }
        Camera2StreamConfigurationMap(i2 * 8);
        int i3 = 0;
        while (true) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i3 >= iArr.length) {
                reset();
                return getMacSize();
            }
            org.bouncycastle.crypto.engines.Zuc256CoreEngine.encode32be(iArr[i3], bArr, (i3 * 4) + i);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void update(byte b) {
        int i = (this.getHighSpeedVideoFpsRangesFor + 1) % 4;
        this.getHighSpeedVideoFpsRangesFor = i;
        if (i == 0) {
            this.getHighSpeedVideoFpsRanges[this.getInputSizeshNQ4ISI] = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            this.getInputSizeshNQ4ISI = (this.getInputSizeshNQ4ISI + 1) % this.getHighSpeedVideoFpsRanges.length;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        int i3 = 128;
        int i4 = 0;
        while (i3 > 0) {
            if ((b & i3) != 0) {
                Camera2StreamConfigurationMap((i2 * 8) + i4);
            }
            i3 >>= 1;
            i4++;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void reset() {
        org.bouncycastle.crypto.engines.Zuc256CoreEngine zuc256CoreEngine = this.getInputFormats;
        if (zuc256CoreEngine != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.reset(zuc256CoreEngine);
        }
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, cipherParameters);
        this.getInputFormats = (org.bouncycastle.crypto.engines.Zuc256CoreEngine) this.getHighResolutionOutputSizeshNQ4ISI.copy();
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.crypto.Mac
    public final int getMacSize() {
        return this.getHighSpeedVideoSizes / 8;
    }

    static class InternalZuc256Engine extends org.bouncycastle.crypto.engines.Zuc256CoreEngine {
        final int getHighResolutionOutputSizeshNQ4ISI() {
            return super.makeKeyStreamWord();
        }

        public InternalZuc256Engine(int i) {
            super(i);
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public final java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Zuc256Mac-");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }

    private void Camera2StreamConfigurationMap() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.Camera2StreamConfigurationMap;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
            i2++;
        }
        while (true) {
            int[] iArr2 = this.getHighSpeedVideoFpsRanges;
            if (i >= iArr2.length - 1) {
                this.getInputSizeshNQ4ISI = iArr2.length - 1;
                this.getHighSpeedVideoFpsRangesFor = 3;
                return;
            } else {
                iArr2[i] = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI();
                i++;
            }
        }
    }

    public Zuc256Mac(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.macs.Zuc256Mac.InternalZuc256Engine(i);
        this.getHighSpeedVideoSizes = i;
        int i2 = i / 32;
        this.Camera2StreamConfigurationMap = new int[i2];
        this.getHighSpeedVideoFpsRanges = new int[i2 + 1];
    }
}
