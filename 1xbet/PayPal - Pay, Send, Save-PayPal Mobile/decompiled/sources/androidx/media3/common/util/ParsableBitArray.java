package androidx.media3.common.util;

@com.google.errorprone.annotations.CheckReturnValue
/* loaded from: classes7.dex */
public final class ParsableBitArray {
    private int Camera2StreamConfigurationMap;
    public byte[] data;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRangesFor;

    public ParsableBitArray() {
        this.data = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.data = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public final void reset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        reset(parsableByteArray.getData(), parsableByteArray.limit());
        setPosition(parsableByteArray.getPosition() * 8);
    }

    public final void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final int bitsLeft() {
        return ((this.getHighResolutionOutputSizeshNQ4ISI - this.getHighSpeedVideoFpsRangesFor) * 8) - this.Camera2StreamConfigurationMap;
    }

    public final int getPosition() {
        return (this.getHighSpeedVideoFpsRangesFor * 8) + this.Camera2StreamConfigurationMap;
    }

    public final int getBytePosition() {
        com.google.common.base.Preconditions.checkState(this.Camera2StreamConfigurationMap == 0);
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setPosition(int i) {
        int i2 = i / 8;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.Camera2StreamConfigurationMap = i - (i2 * 8);
        getHighSpeedVideoSizes();
    }

    public final void skipBit() {
        int i = this.Camera2StreamConfigurationMap + 1;
        this.Camera2StreamConfigurationMap = i;
        if (i == 8) {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor++;
        }
        getHighSpeedVideoSizes();
    }

    public final void skipBits(int i) {
        int i2 = i / 8;
        int i3 = this.getHighSpeedVideoFpsRangesFor + i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        int i4 = this.Camera2StreamConfigurationMap + (i - (i2 * 8));
        this.Camera2StreamConfigurationMap = i4;
        if (i4 > 7) {
            this.getHighSpeedVideoFpsRangesFor = i3 + 1;
            this.Camera2StreamConfigurationMap = i4 - 8;
        }
        getHighSpeedVideoSizes();
    }

    public final boolean readBit() {
        boolean z = (this.data[this.getHighSpeedVideoFpsRangesFor] & (128 >> this.Camera2StreamConfigurationMap)) != 0;
        skipBit();
        return z;
    }

    public final int readBits(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.Camera2StreamConfigurationMap += i;
        int i3 = 0;
        while (true) {
            i2 = this.Camera2StreamConfigurationMap;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.Camera2StreamConfigurationMap = i4;
            byte[] bArr = this.data;
            int i5 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.data;
        int i6 = this.getHighSpeedVideoFpsRangesFor;
        byte b = bArr2[i6];
        if (i2 == 8) {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = i6 + 1;
        }
        getHighSpeedVideoSizes();
        return ((-1) >>> (32 - i)) & (((b & 255) >> (8 - i2)) | i3);
    }

    public final long readBitsToLong(int i) {
        if (i <= 32) {
            return androidx.media3.common.util.Util.toUnsignedLong(readBits(i));
        }
        return androidx.media3.common.util.Util.toLong(readBits(i - 32), readBits(32));
    }

    public final void readBits(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.data;
            int i4 = this.getHighSpeedVideoFpsRangesFor;
            int i5 = i4 + 1;
            this.getHighSpeedVideoFpsRangesFor = i5;
            byte b = bArr2[i4];
            int i6 = this.Camera2StreamConfigurationMap;
            byte b2 = (byte) (b << i6);
            bArr[i] = b2;
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i7));
        bArr[i3] = b3;
        int i8 = this.Camera2StreamConfigurationMap;
        if (i8 + i7 > 8) {
            byte[] bArr3 = this.data;
            int i9 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i9 + 1;
            bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
            this.Camera2StreamConfigurationMap = i8 - 8;
        }
        int i10 = this.Camera2StreamConfigurationMap + i7;
        this.Camera2StreamConfigurationMap = i10;
        byte[] bArr4 = this.data;
        int i11 = this.getHighSpeedVideoFpsRangesFor;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
        if (i10 == 8) {
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = i11 + 1;
        }
        getHighSpeedVideoSizes();
    }

    public final void byteAlign() {
        if (this.Camera2StreamConfigurationMap == 0) {
            return;
        }
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor++;
        getHighSpeedVideoSizes();
    }

    public final void readBytes(byte[] bArr, int i, int i2) {
        com.google.common.base.Preconditions.checkState(this.Camera2StreamConfigurationMap == 0);
        java.lang.System.arraycopy(this.data, this.getHighSpeedVideoFpsRangesFor, bArr, i, i2);
        this.getHighSpeedVideoFpsRangesFor += i2;
        getHighSpeedVideoSizes();
    }

    public final void skipBytes(int i) {
        com.google.common.base.Preconditions.checkState(this.Camera2StreamConfigurationMap == 0);
        this.getHighSpeedVideoFpsRangesFor += i;
        getHighSpeedVideoSizes();
    }

    public final java.lang.String readBytesAsString(int i) {
        return readBytesAsString(i, java.nio.charset.StandardCharsets.UTF_8);
    }

    public final java.lang.String readBytesAsString(int i, java.nio.charset.Charset charset) {
        byte[] bArr = new byte[i];
        readBytes(bArr, 0, i);
        return new java.lang.String(bArr, charset);
    }

    public final void putInt(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = java.lang.Math.min(8 - this.Camera2StreamConfigurationMap, i2);
        int i3 = this.Camera2StreamConfigurationMap;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.data;
        int i5 = this.getHighSpeedVideoFpsRangesFor;
        byte b = (byte) (((androidx.core.view.MotionEventCompat.ACTION_POINTER_INDEX_MASK >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = i2 - min;
        bArr[i5] = (byte) (b | ((i >>> i6) << i4));
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.data[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.data;
        byte b2 = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = b2;
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | b2);
        skipBits(i2);
        getHighSpeedVideoSizes();
    }

    private void getHighSpeedVideoSizes() {
        int i;
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        com.google.common.base.Preconditions.checkState(i2 >= 0 && (i2 < (i = this.getHighResolutionOutputSizeshNQ4ISI) || (i2 == i && this.Camera2StreamConfigurationMap == 0)));
    }
}
