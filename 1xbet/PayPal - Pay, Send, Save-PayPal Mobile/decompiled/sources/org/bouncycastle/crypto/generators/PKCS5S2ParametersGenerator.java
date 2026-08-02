package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class PKCS5S2ParametersGenerator extends org.bouncycastle.crypto.PBEParametersGenerator {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Mac getHighSpeedVideoFpsRanges;

    private byte[] getHighSpeedVideoFpsRangesFor(int i) {
        int macSize = this.getHighSpeedVideoFpsRanges.getMacSize();
        int i2 = ((i + macSize) - 1) / macSize;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[i2 * macSize];
        this.getHighSpeedVideoFpsRanges.init(new org.bouncycastle.crypto.params.KeyParameter(this.password));
        int i3 = 0;
        for (int i4 = 1; i4 <= i2; i4++) {
            int i5 = 3;
            while (true) {
                byte b = (byte) (bArr[i5] + 1);
                bArr[i5] = b;
                if (b != 0) {
                    break;
                }
                i5--;
            }
            byte[] bArr3 = this.salt;
            int i6 = this.iterationCount;
            if (i6 == 0) {
                throw new java.lang.IllegalArgumentException("iteration count must be at least 1.");
            }
            if (bArr3 != null) {
                this.getHighSpeedVideoFpsRanges.update(bArr3, 0, bArr3.length);
            }
            this.getHighSpeedVideoFpsRanges.update(bArr, 0, 4);
            this.getHighSpeedVideoFpsRanges.doFinal(this.getHighResolutionOutputSizeshNQ4ISI, 0);
            byte[] bArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.System.arraycopy(bArr4, 0, bArr2, i3, bArr4.length);
            for (int i7 = 1; i7 < i6; i7++) {
                org.bouncycastle.crypto.Mac mac = this.getHighSpeedVideoFpsRanges;
                byte[] bArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                mac.update(bArr5, 0, bArr5.length);
                this.getHighSpeedVideoFpsRanges.doFinal(this.getHighResolutionOutputSizeshNQ4ISI, 0);
                int i8 = 0;
                while (true) {
                    byte[] bArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i8 != bArr6.length) {
                        int i9 = i3 + i8;
                        bArr2[i9] = (byte) (bArr6[i8] ^ bArr2[i9]);
                        i8++;
                    }
                }
            }
            i3 += macSize;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i, int i2) {
        int i3 = i / 8;
        int i4 = i2 / 8;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i3 + i4);
        return new org.bouncycastle.crypto.params.ParametersWithIV(new org.bouncycastle.crypto.params.KeyParameter(highSpeedVideoFpsRangesFor, 0, i3), highSpeedVideoFpsRangesFor, i3, i4);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedParameters(int i) {
        int i2 = i / 8;
        return new org.bouncycastle.crypto.params.KeyParameter(getHighSpeedVideoFpsRangesFor(i2), 0, i2);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public org.bouncycastle.crypto.CipherParameters generateDerivedMacParameters(int i) {
        return generateDerivedParameters(i);
    }

    public PKCS5S2ParametersGenerator(org.bouncycastle.crypto.Digest digest) {
        org.bouncycastle.crypto.macs.HMac hMac = new org.bouncycastle.crypto.macs.HMac(digest);
        this.getHighSpeedVideoFpsRanges = hMac;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[hMac.getMacSize()];
    }

    public PKCS5S2ParametersGenerator() {
        this(org.bouncycastle.crypto.util.DigestFactory.createSHA1());
    }
}
