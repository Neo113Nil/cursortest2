package org.bouncycastle.crypto.digests;

/* loaded from: classes17.dex */
public abstract class GeneralDigest implements org.bouncycastle.crypto.ExtendedDigest, org.bouncycastle.util.Memoable {
    private long Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;
    private final byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long j);

    protected abstract void processWord(byte[] bArr, int i);

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = java.lang.Math.max(0, i2);
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            int i4 = 0;
            while (true) {
                if (i4 >= max) {
                    i3 = i4;
                    break;
                }
                byte[] bArr2 = this.getHighSpeedVideoSizes;
                int i5 = this.getHighSpeedVideoFpsRangesFor;
                int i6 = i5 + 1;
                this.getHighSpeedVideoFpsRangesFor = i6;
                int i7 = i4 + 1;
                bArr2[i5] = bArr[i4 + i];
                if (i6 == 4) {
                    processWord(bArr2, 0);
                    this.getHighSpeedVideoFpsRangesFor = 0;
                    i3 = i7;
                    break;
                }
                i4 = i7;
            }
        }
        int i8 = i3;
        while (i8 < ((max - i3) & (-4)) + i3) {
            processWord(bArr, i + i8);
            i8 += 4;
        }
        while (i8 < max) {
            byte[] bArr3 = this.getHighSpeedVideoSizes;
            int i9 = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = i9 + 1;
            bArr3[i9] = bArr[i8 + i];
            i8++;
        }
        this.Camera2StreamConfigurationMap += max;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b) {
        byte[] bArr = this.getHighSpeedVideoSizes;
        int i = this.getHighSpeedVideoFpsRangesFor;
        int i2 = i + 1;
        this.getHighSpeedVideoFpsRangesFor = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            processWord(bArr, 0);
            this.getHighSpeedVideoFpsRangesFor = 0;
        }
        this.Camera2StreamConfigurationMap++;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.Camera2StreamConfigurationMap = 0L;
        this.getHighSpeedVideoFpsRangesFor = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoSizes;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    protected void populateState(byte[] bArr) {
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, 0, bArr, 0, this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.util.Pack.intToBigEndian(this.getHighSpeedVideoFpsRangesFor, bArr, 4);
        org.bouncycastle.util.Pack.longToBigEndian(this.Camera2StreamConfigurationMap, bArr, 8);
    }

    public void finish() {
        long j = this.Camera2StreamConfigurationMap;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.getHighSpeedVideoFpsRangesFor == 0) {
                processLength(j << 3);
                processBlock();
                return;
            }
            b = 0;
        }
    }

    protected void copyIn(org.bouncycastle.crypto.digests.GeneralDigest generalDigest) {
        byte[] bArr = generalDigest.getHighSpeedVideoSizes;
        java.lang.System.arraycopy(bArr, 0, this.getHighSpeedVideoSizes, 0, bArr.length);
        this.getHighSpeedVideoFpsRangesFor = generalDigest.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = generalDigest.Camera2StreamConfigurationMap;
    }

    protected GeneralDigest(byte[] bArr) {
        byte[] bArr2 = new byte[4];
        this.getHighSpeedVideoSizes = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, 4);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Pack.bigEndianToInt(bArr, 4);
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Pack.bigEndianToLong(bArr, 8);
    }

    protected GeneralDigest(org.bouncycastle.crypto.digests.GeneralDigest generalDigest) {
        this.getHighSpeedVideoSizes = new byte[4];
        copyIn(generalDigest);
    }

    protected GeneralDigest() {
        this.getHighSpeedVideoSizes = new byte[4];
        this.getHighSpeedVideoFpsRangesFor = 0;
    }
}
