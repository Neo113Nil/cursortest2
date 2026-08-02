package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class HKDFBytesGenerator implements org.bouncycastle.crypto.DerivationFunction {
    private int Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.crypto.macs.HMac getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(org.bouncycastle.crypto.DerivationParameters derivationParameters) {
        org.bouncycastle.crypto.macs.HMac hMac;
        org.bouncycastle.crypto.params.KeyParameter keyParameter;
        if (!(derivationParameters instanceof org.bouncycastle.crypto.params.HKDFParameters)) {
            throw new java.lang.IllegalArgumentException("HKDF parameters required for HKDFBytesGenerator");
        }
        org.bouncycastle.crypto.params.HKDFParameters hKDFParameters = (org.bouncycastle.crypto.params.HKDFParameters) derivationParameters;
        if (hKDFParameters.skipExtract()) {
            hMac = this.getHighSpeedVideoFpsRangesFor;
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(hKDFParameters.getIKM());
        } else {
            hMac = this.getHighSpeedVideoFpsRangesFor;
            byte[] salt = hKDFParameters.getSalt();
            byte[] ikm = hKDFParameters.getIKM();
            if (salt == null) {
                this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.KeyParameter(new byte[this.Camera2StreamConfigurationMap]));
            } else {
                this.getHighSpeedVideoFpsRangesFor.init(new org.bouncycastle.crypto.params.KeyParameter(salt));
            }
            this.getHighSpeedVideoFpsRangesFor.update(ikm, 0, ikm.length);
            byte[] bArr = new byte[this.Camera2StreamConfigurationMap];
            this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, 0);
            keyParameter = new org.bouncycastle.crypto.params.KeyParameter(bArr);
        }
        hMac.init(keyParameter);
        this.getHighSpeedVideoSizes = hKDFParameters.getInfo();
        this.getHighSpeedVideoFpsRanges = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = new byte[this.Camera2StreamConfigurationMap];
    }

    public org.bouncycastle.crypto.Digest getDigest() {
        return this.getHighSpeedVideoFpsRangesFor.getUnderlyingDigest();
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i, int i2) throws org.bouncycastle.crypto.DataLengthException, java.lang.IllegalArgumentException {
        int i3 = this.getHighSpeedVideoFpsRanges;
        int i4 = this.Camera2StreamConfigurationMap;
        if (i3 + i2 > i4 * 255) {
            throw new org.bouncycastle.crypto.DataLengthException("HKDF may only be used for 255 * HashLen bytes of output");
        }
        if (i3 % i4 == 0) {
            Camera2StreamConfigurationMap();
        }
        int i5 = this.getHighSpeedVideoFpsRanges;
        int i6 = this.Camera2StreamConfigurationMap;
        int i7 = i5 % i6;
        int min = java.lang.Math.min(i6 - i7, i2);
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, i7, bArr, i, min);
        this.getHighSpeedVideoFpsRanges += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            Camera2StreamConfigurationMap();
            min = java.lang.Math.min(this.Camera2StreamConfigurationMap, i8);
            java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, bArr, i, min);
            this.getHighSpeedVideoFpsRanges += min;
            i8 -= min;
        }
    }

    private void Camera2StreamConfigurationMap() throws org.bouncycastle.crypto.DataLengthException {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            throw new org.bouncycastle.crypto.DataLengthException("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (i != 0) {
            this.getHighSpeedVideoFpsRangesFor.update(this.getHighResolutionOutputSizeshNQ4ISI, 0, i2);
        }
        org.bouncycastle.crypto.macs.HMac hMac = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr = this.getHighSpeedVideoSizes;
        hMac.update(bArr, 0, bArr.length);
        this.getHighSpeedVideoFpsRangesFor.update((byte) i3);
        this.getHighSpeedVideoFpsRangesFor.doFinal(this.getHighResolutionOutputSizeshNQ4ISI, 0);
    }

    public HKDFBytesGenerator(org.bouncycastle.crypto.Digest digest) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.crypto.macs.HMac(digest);
        this.Camera2StreamConfigurationMap = digest.getDigestSize();
    }
}
