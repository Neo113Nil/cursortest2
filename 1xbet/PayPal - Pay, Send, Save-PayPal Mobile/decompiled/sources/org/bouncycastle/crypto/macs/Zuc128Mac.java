package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public final class Zuc128Mac implements org.bouncycastle.crypto.Mac {
    private int Camera2StreamConfigurationMap;
    private final org.bouncycastle.crypto.macs.Zuc128Mac.InternalZuc128Engine getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.crypto.macs.Zuc128Mac.InternalZuc128Engine(0);
    private final int[] getHighSpeedVideoFpsRanges = new int[2];
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.crypto.engines.Zuc128CoreEngine getHighSpeedVideoSizes;
    private int getInputFormats;

    @Override // org.bouncycastle.crypto.Mac
    public final int getMacSize() {
        return 4;
    }

    @Override // org.bouncycastle.crypto.Mac
    public final int doFinal(byte[] bArr, int i) {
        int i2;
        getHighSpeedVideoSizes();
        int Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor ^ Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap * 8);
        this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap;
        if (this.Camera2StreamConfigurationMap != 0) {
            i2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
        } else {
            int i3 = this.getInputFormats;
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            int length = (i3 + 1) % iArr.length;
            this.getInputFormats = length;
            i2 = iArr[length];
        }
        int i4 = Camera2StreamConfigurationMap ^ i2;
        this.getHighSpeedVideoFpsRangesFor = i4;
        org.bouncycastle.crypto.engines.Zuc128CoreEngine.encode32be(i4, bArr, i);
        reset();
        return getMacSize();
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void update(byte b) {
        getHighSpeedVideoSizes();
        int i = this.Camera2StreamConfigurationMap;
        int i2 = 128;
        int i3 = 0;
        while (i2 > 0) {
            if ((b & i2) != 0) {
                this.getHighSpeedVideoFpsRangesFor = Camera2StreamConfigurationMap((i * 8) + i3) ^ this.getHighSpeedVideoFpsRangesFor;
            }
            i2 >>= 1;
            i3++;
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
        org.bouncycastle.crypto.engines.Zuc128CoreEngine zuc128CoreEngine = this.getHighSpeedVideoSizes;
        if (zuc128CoreEngine != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.reset(zuc128CoreEngine);
        }
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.crypto.Mac
    public final void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighResolutionOutputSizeshNQ4ISI.init(true, cipherParameters);
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.engines.Zuc128CoreEngine) this.getHighResolutionOutputSizeshNQ4ISI.copy();
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.crypto.Mac
    public final java.lang.String getAlgorithmName() {
        return "Zuc128Mac";
    }

    static class InternalZuc128Engine extends org.bouncycastle.crypto.engines.Zuc128CoreEngine {
        final int getHighSpeedVideoSizes() {
            return super.makeKeyStreamWord();
        }

        /* synthetic */ InternalZuc128Engine(byte b) {
            this();
        }

        private InternalZuc128Engine() {
        }
    }

    private void getHighSpeedVideoSizes() {
        int i = (this.Camera2StreamConfigurationMap + 1) % 4;
        this.Camera2StreamConfigurationMap = i;
        if (i == 0) {
            this.getHighSpeedVideoFpsRanges[this.getInputFormats] = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
            this.getInputFormats = (this.getInputFormats + 1) % this.getHighSpeedVideoFpsRanges.length;
        }
    }

    private void Camera2StreamConfigurationMap() {
        int i = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoFpsRanges;
            if (i >= iArr.length - 1) {
                this.getInputFormats = iArr.length - 1;
                this.Camera2StreamConfigurationMap = 3;
                return;
            } else {
                iArr[i] = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes();
                i++;
            }
        }
    }

    private int Camera2StreamConfigurationMap(int i) {
        int[] iArr = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getInputFormats;
        int i3 = iArr[i2];
        if (i == 0) {
            return i3;
        }
        return (i3 << i) | (iArr[(i2 + 1) % iArr.length] >>> (32 - i));
    }
}
