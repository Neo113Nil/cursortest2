package androidx.media3.container;

/* loaded from: classes7.dex */
public final class ParsableNalUnitBitArray {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
        reset(bArr, i, i2);
    }

    public final void reset(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = bArr;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        getHighSpeedVideoFpsRanges();
    }

    public final void skipBit() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == 8) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 + (getHighResolutionOutputSizeshNQ4ISI(i2 + 1) ? 2 : 1);
        }
        getHighSpeedVideoFpsRanges();
    }

    public final void skipBits(int i) {
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.getHighSpeedVideoSizes = i4;
        int i5 = this.getHighResolutionOutputSizeshNQ4ISI + (i - (i3 * 8));
        this.getHighResolutionOutputSizeshNQ4ISI = i5;
        if (i5 > 7) {
            this.getHighSpeedVideoSizes = i4 + 1;
            this.getHighResolutionOutputSizeshNQ4ISI = i5 - 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 <= this.getHighSpeedVideoSizes) {
                if (getHighResolutionOutputSizeshNQ4ISI(i6)) {
                    this.getHighSpeedVideoSizes++;
                    i2 += 3;
                } else {
                    i2 = i6;
                }
            } else {
                getHighSpeedVideoFpsRanges();
                return;
            }
        }
    }

    public final void byteAlign() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i > 0) {
            skipBits(8 - i);
        }
    }

    public final boolean canReadBits(int i) {
        int i2 = this.getHighSpeedVideoSizes;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.getHighResolutionOutputSizeshNQ4ISI + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            int i6 = i2 + 1;
            if (i6 > i4 || i4 >= this.Camera2StreamConfigurationMap) {
                break;
            }
            if (getHighResolutionOutputSizeshNQ4ISI(i6)) {
                i4++;
                i2 += 3;
            } else {
                i2 = i6;
            }
        }
        int i7 = this.Camera2StreamConfigurationMap;
        if (i4 >= i7) {
            return i4 == i7 && i5 == 0;
        }
        return true;
    }

    public final boolean readBit() {
        boolean z = (this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoSizes] & (128 >> this.getHighResolutionOutputSizeshNQ4ISI)) != 0;
        skipBit();
        return z;
    }

    public final int readBits(int i) {
        int i2;
        this.getHighResolutionOutputSizeshNQ4ISI += i;
        int i3 = 0;
        while (true) {
            i2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.getHighResolutionOutputSizeshNQ4ISI = i4;
            byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
            int i5 = this.getHighSpeedVideoSizes;
            i3 |= (bArr[i5] & 255) << i4;
            if (getHighResolutionOutputSizeshNQ4ISI(i5 + 1)) {
                r3 = 2;
            }
            this.getHighSpeedVideoSizes = i5 + r3;
        }
        byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
        int i6 = this.getHighSpeedVideoSizes;
        byte b = bArr2[i6];
        if (i2 == 8) {
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoSizes = i6 + (getHighResolutionOutputSizeshNQ4ISI(i6 + 1) ? 2 : 1);
        }
        getHighSpeedVideoFpsRanges();
        return ((-1) >>> (32 - i)) & (((b & 255) >> (8 - i2)) | i3);
    }

    public final boolean canReadExpGolombCodedNum() {
        int i = this.getHighSpeedVideoSizes;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = 0;
        while (this.getHighSpeedVideoSizes < this.Camera2StreamConfigurationMap && !readBit()) {
            i3++;
        }
        boolean z = this.getHighSpeedVideoSizes == this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        return !z && canReadBits((i3 * 2) + 1);
    }

    public final int readUnsignedExpGolombCodedInt() {
        return Camera2StreamConfigurationMap();
    }

    public final int readSignedExpGolombCodedInt() {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        return (Camera2StreamConfigurationMap % 2 == 0 ? -1 : 1) * ((Camera2StreamConfigurationMap + 1) / 2);
    }

    private int Camera2StreamConfigurationMap() {
        int i = 0;
        while (!readBit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? readBits(i) : 0);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        if (2 > i || i >= this.Camera2StreamConfigurationMap) {
            return false;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private void getHighSpeedVideoFpsRanges() {
        int i;
        int i2 = this.getHighSpeedVideoSizes;
        com.google.common.base.Preconditions.checkState(i2 >= 0 && (i2 < (i = this.Camera2StreamConfigurationMap) || (i2 == i && this.getHighResolutionOutputSizeshNQ4ISI == 0)));
    }
}
