package org.bouncycastle.oer;

/* loaded from: classes17.dex */
public class BitBuilder {
    private static final byte[] getHighSpeedVideoSizes = {Byte.MIN_VALUE, 64, 32, 16, 8, 4, 2, 1};
    byte[] Camera2StreamConfigurationMap = new byte[1];
    int getHighSpeedVideoFpsRangesFor = 0;

    public void zero() {
        org.bouncycastle.util.Arrays.clear(this.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor = 0;
    }

    public org.bouncycastle.oer.BitBuilder writeBits(long j, int i, int i2) {
        for (int i3 = i - 1; i3 >= i - i2; i3--) {
            writeBit(((1 << i3) & j) != 0 ? 1 : 0);
        }
        return this;
    }

    public org.bouncycastle.oer.BitBuilder writeBits(long j, int i) {
        while (true) {
            i--;
            if (i < 0) {
                return this;
            }
            writeBit(((1 << i) & j) > 0 ? 1 : 0);
        }
    }

    public org.bouncycastle.oer.BitBuilder writeBit(int i) {
        int i2 = this.getHighSpeedVideoFpsRangesFor / 8;
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (i2 >= bArr.length) {
            byte[] bArr2 = new byte[bArr.length + 4];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
            org.bouncycastle.util.Arrays.clear(this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap = bArr2;
        }
        if (i == 0) {
            byte[] bArr3 = this.Camera2StreamConfigurationMap;
            int i3 = this.getHighSpeedVideoFpsRangesFor;
            int i4 = i3 / 8;
            bArr3[i4] = (byte) ((~getHighSpeedVideoSizes[i3 % 8]) & bArr3[i4]);
        } else {
            byte[] bArr4 = this.Camera2StreamConfigurationMap;
            int i5 = this.getHighSpeedVideoFpsRangesFor;
            int i6 = i5 / 8;
            bArr4[i6] = (byte) (getHighSpeedVideoSizes[i5 % 8] | bArr4[i6]);
        }
        this.getHighSpeedVideoFpsRangesFor++;
        return this;
    }

    public int writeAndClear(java.io.OutputStream outputStream) throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = (i + (i % 8)) / 8;
        outputStream.write(this.Camera2StreamConfigurationMap, 0, i2);
        outputStream.flush();
        zero();
        return i2;
    }

    public void write7BitBytes(java.math.BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + (bigInteger.bitLength() % 8)) / 8;
        java.math.BigInteger shiftLeft = java.math.BigInteger.valueOf(254L).shiftLeft(bitLength * 8);
        boolean z = false;
        while (bitLength >= 0) {
            if (!z && bigInteger.and(shiftLeft).compareTo(java.math.BigInteger.ZERO) != 0) {
                z = true;
            }
            if (z) {
                writeBit(bitLength).writeBits(bigInteger.and(shiftLeft).shiftRight(r3 - 8).intValue(), 8, 7);
            }
            bigInteger = bigInteger.shiftLeft(7);
            bitLength--;
        }
    }

    public void write7BitBytes(int i) {
        boolean z = false;
        for (int i2 = 4; i2 >= 0; i2--) {
            if (!z && ((-33554432) & i) != 0) {
                z = true;
            }
            if (z) {
                writeBit(i2).writeBits(i, 32, 7);
            }
            i <<= 7;
        }
    }

    public int write(java.io.OutputStream outputStream) throws java.io.IOException {
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = (i + (i % 8)) / 8;
        outputStream.write(this.Camera2StreamConfigurationMap, 0, i2);
        outputStream.flush();
        return i2;
    }

    public void pad() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoFpsRangesFor = i + (i % 8);
    }

    protected void finalize() throws java.lang.Throwable {
        zero();
        super.finalize();
    }
}
