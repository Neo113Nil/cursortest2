package org.bouncycastle.pqc.crypto.gmss;

/* loaded from: classes17.dex */
public class GMSSLeaf {
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom getHighSpeedVideoFpsRanges;
    private byte[] getHighSpeedVideoFpsRangesFor;
    byte[] getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private byte[] getInputFormats;
    private org.bouncycastle.crypto.Digest getInputSizeshNQ4ISI;
    private byte[] getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;

    GMSSLeaf(org.bouncycastle.crypto.Digest digest, int i, int i2) {
        this.getOutputStallDuration = i;
        this.getInputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(digest);
        this.getOutputMinFrameDuration = this.getInputSizeshNQ4ISI.getDigestSize();
        double d = i;
        int ceil = (int) java.lang.Math.ceil((r7 << 3) / d);
        int i3 = 2;
        int i4 = 1;
        while (i3 < (ceil << i) + 1) {
            i3 <<= 1;
            i4++;
        }
        this.getHighSpeedVideoSizesFor = ceil + ((int) java.lang.Math.ceil(i4 / d));
        this.getOutputSizes = 1 << i;
        this.getOutputSizeshNQ4ISI = (int) java.lang.Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i2);
        int i5 = this.getOutputMinFrameDuration;
        this.getInputFormats = new byte[i5];
        this.getOutputFormats = new byte[i5];
        this.getHighSpeedVideoSizes = new byte[i5];
        this.getHighSpeedVideoFpsRangesFor = new byte[i5 * this.getHighSpeedVideoSizesFor];
    }

    public GMSSLeaf(org.bouncycastle.crypto.Digest digest, int i, int i2, byte[] bArr) {
        this.getOutputStallDuration = i;
        this.getInputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(digest);
        this.getOutputMinFrameDuration = this.getInputSizeshNQ4ISI.getDigestSize();
        double d = i;
        int ceil = (int) java.lang.Math.ceil((r7 << 3) / d);
        int i3 = 2;
        int i4 = 1;
        while (i3 < (ceil << i) + 1) {
            i3 <<= 1;
            i4++;
        }
        this.getHighSpeedVideoSizesFor = ceil + ((int) java.lang.Math.ceil(i4 / d));
        this.getOutputSizes = 1 << i;
        this.getOutputSizeshNQ4ISI = (int) java.lang.Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i2);
        int i5 = this.getOutputMinFrameDuration;
        this.getInputFormats = new byte[i5];
        this.getOutputFormats = new byte[i5];
        this.getHighSpeedVideoSizes = new byte[i5];
        this.getHighSpeedVideoFpsRangesFor = new byte[i5 * this.getHighSpeedVideoSizesFor];
        Camera2StreamConfigurationMap(bArr);
    }

    public GMSSLeaf(org.bouncycastle.crypto.Digest digest, byte[][] bArr, int[] iArr) {
        this.Camera2StreamConfigurationMap = iArr[0];
        this.getHighResolutionOutputSizeshNQ4ISI = iArr[1];
        this.getOutputSizeshNQ4ISI = iArr[2];
        this.getOutputStallDuration = iArr[3];
        this.getInputSizeshNQ4ISI = digest;
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom(digest);
        this.getOutputMinFrameDuration = this.getInputSizeshNQ4ISI.getDigestSize();
        int ceil = (int) java.lang.Math.ceil((r9 << 3) / this.getOutputStallDuration);
        int i = 1;
        int i2 = 2;
        while (i2 < (ceil << this.getOutputStallDuration) + 1) {
            i2 <<= 1;
            i++;
        }
        this.getHighSpeedVideoSizesFor = ceil + ((int) java.lang.Math.ceil(i / this.getOutputStallDuration));
        this.getOutputSizes = 1 << this.getOutputStallDuration;
        this.getHighSpeedVideoSizes = bArr[0];
        this.getInputFormats = bArr[1];
        this.getHighSpeedVideoFpsRangesFor = bArr[2];
        this.getOutputFormats = bArr[3];
    }

    final org.bouncycastle.pqc.crypto.gmss.GMSSLeaf getHighSpeedVideoFpsRanges() {
        org.bouncycastle.pqc.crypto.gmss.GMSSLeaf gMSSLeaf = new org.bouncycastle.pqc.crypto.gmss.GMSSLeaf(this);
        byte[] bArr = new byte[gMSSLeaf.getInputSizeshNQ4ISI.getDigestSize()];
        for (int i = 0; i < gMSSLeaf.getOutputSizeshNQ4ISI + 10000; i++) {
            int i2 = gMSSLeaf.Camera2StreamConfigurationMap;
            if (i2 == gMSSLeaf.getHighSpeedVideoSizesFor && gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI == gMSSLeaf.getOutputSizes - 1) {
                org.bouncycastle.crypto.Digest digest = gMSSLeaf.getInputSizeshNQ4ISI;
                byte[] bArr2 = gMSSLeaf.getHighSpeedVideoFpsRangesFor;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[gMSSLeaf.getInputSizeshNQ4ISI.getDigestSize()];
                gMSSLeaf.getOutputFormats = bArr3;
                gMSSLeaf.getInputSizeshNQ4ISI.doFinal(bArr3, 0);
                return gMSSLeaf;
            }
            if (i2 == 0 || gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI == gMSSLeaf.getOutputSizes - 1) {
                gMSSLeaf.Camera2StreamConfigurationMap = i2 + 1;
                gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI = 0;
                gMSSLeaf.getHighSpeedVideoSizes = gMSSLeaf.getHighSpeedVideoFpsRanges.nextSeed(gMSSLeaf.getInputFormats);
            } else {
                org.bouncycastle.crypto.Digest digest2 = gMSSLeaf.getInputSizeshNQ4ISI;
                byte[] bArr4 = gMSSLeaf.getHighSpeedVideoSizes;
                digest2.update(bArr4, 0, bArr4.length);
                gMSSLeaf.getHighSpeedVideoSizes = bArr;
                gMSSLeaf.getInputSizeshNQ4ISI.doFinal(bArr, 0);
                int i3 = gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI + 1;
                gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI = i3;
                if (i3 == gMSSLeaf.getOutputSizes - 1) {
                    byte[] bArr5 = gMSSLeaf.getHighSpeedVideoSizes;
                    byte[] bArr6 = gMSSLeaf.getHighSpeedVideoFpsRangesFor;
                    int i4 = gMSSLeaf.getOutputMinFrameDuration;
                    java.lang.System.arraycopy(bArr5, 0, bArr6, (gMSSLeaf.Camera2StreamConfigurationMap - 1) * i4, i4);
                }
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to updateLeaf in steps: ");
        sb.append(gMSSLeaf.getOutputSizeshNQ4ISI);
        sb.append(" ");
        sb.append(gMSSLeaf.Camera2StreamConfigurationMap);
        sb.append(" ");
        sb.append(gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str = "";
        for (int i = 0; i < 4; i++) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(getStatInt()[i]);
            sb2.append(" ");
            str = sb2.toString();
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(" ");
        sb3.append(this.getOutputMinFrameDuration);
        sb3.append(" ");
        sb3.append(this.getHighSpeedVideoSizesFor);
        sb3.append(" ");
        sb3.append(this.getOutputSizes);
        sb3.append(" ");
        java.lang.String obj = sb3.toString();
        byte[][] statByte = getStatByte();
        for (int i2 = 0; i2 < 4; i2++) {
            if (statByte[i2] != null) {
                sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append(new java.lang.String(org.bouncycastle.util.encoders.Hex.encode(statByte[i2])));
                sb.append(" ");
            } else {
                sb = new java.lang.StringBuilder();
                sb.append(obj);
                sb.append("null ");
            }
            obj = sb.toString();
        }
        return obj;
    }

    final void Camera2StreamConfigurationMap(byte[] bArr) {
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        byte[] bArr2 = new byte[this.getOutputMinFrameDuration];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, this.getInputFormats.length);
        this.getInputFormats = this.getHighSpeedVideoFpsRanges.nextSeed(bArr2);
    }

    public int[] getStatInt() {
        return new int[]{this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.getOutputStallDuration};
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.getHighSpeedVideoSizes, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getOutputFormats};
    }

    public byte[] getLeaf() {
        return org.bouncycastle.util.Arrays.clone(this.getOutputFormats);
    }

    private GMSSLeaf(org.bouncycastle.pqc.crypto.gmss.GMSSLeaf gMSSLeaf) {
        this.getInputSizeshNQ4ISI = gMSSLeaf.getInputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = gMSSLeaf.getOutputMinFrameDuration;
        this.getHighSpeedVideoSizesFor = gMSSLeaf.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoFpsRanges = gMSSLeaf.getHighSpeedVideoFpsRanges;
        this.getOutputFormats = org.bouncycastle.util.Arrays.clone(gMSSLeaf.getOutputFormats);
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(gMSSLeaf.getHighSpeedVideoFpsRangesFor);
        this.Camera2StreamConfigurationMap = gMSSLeaf.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI = gMSSLeaf.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputSizes = gMSSLeaf.getOutputSizes;
        this.getOutputStallDuration = gMSSLeaf.getOutputStallDuration;
        this.getOutputSizeshNQ4ISI = gMSSLeaf.getOutputSizeshNQ4ISI;
        this.getInputFormats = org.bouncycastle.util.Arrays.clone(gMSSLeaf.getInputFormats);
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(gMSSLeaf.getHighSpeedVideoSizes);
    }
}
