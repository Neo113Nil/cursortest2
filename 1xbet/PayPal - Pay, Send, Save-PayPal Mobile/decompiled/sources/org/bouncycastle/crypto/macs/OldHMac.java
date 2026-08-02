package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class OldHMac implements org.bouncycastle.crypto.Mac {
    private org.bouncycastle.crypto.Digest Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRangesFor = new byte[64];
    private byte[] getHighSpeedVideoSizes = new byte[64];

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.Camera2StreamConfigurationMap.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.Camera2StreamConfigurationMap.update(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.Camera2StreamConfigurationMap.reset();
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
        digest.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.Camera2StreamConfigurationMap.reset();
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        if (key.length <= 64) {
            java.lang.System.arraycopy(key, 0, this.getHighSpeedVideoFpsRangesFor, 0, key.length);
            int length = key.length;
            while (true) {
                byte[] bArr = this.getHighSpeedVideoFpsRangesFor;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.Camera2StreamConfigurationMap.update(key, 0, key.length);
            this.Camera2StreamConfigurationMap.doFinal(this.getHighSpeedVideoFpsRangesFor, 0);
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            while (true) {
                byte[] bArr2 = this.getHighSpeedVideoFpsRangesFor;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        }
        byte[] bArr3 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr4 = new byte[bArr3.length];
        this.getHighSpeedVideoSizes = bArr4;
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i2 = 0;
        while (true) {
            byte[] bArr5 = this.getHighSpeedVideoFpsRangesFor;
            if (i2 >= bArr5.length) {
                break;
            }
            bArr5[i2] = (byte) (bArr5[i2] ^ org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE);
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr6 = this.getHighSpeedVideoSizes;
            if (i3 >= bArr6.length) {
                org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
                byte[] bArr7 = this.getHighSpeedVideoFpsRangesFor;
                digest.update(bArr7, 0, bArr7.length);
                return;
            }
            bArr6[i3] = (byte) (bArr6[i3] ^ 92);
            i3++;
        }
    }

    public org.bouncycastle.crypto.Digest getUnderlyingDigest() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap.getAlgorithmName());
        sb.append("/HMAC");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        byte[] bArr2 = new byte[i2];
        this.Camera2StreamConfigurationMap.doFinal(bArr2, 0);
        org.bouncycastle.crypto.Digest digest = this.Camera2StreamConfigurationMap;
        byte[] bArr3 = this.getHighSpeedVideoSizes;
        digest.update(bArr3, 0, bArr3.length);
        this.Camera2StreamConfigurationMap.update(bArr2, 0, i2);
        int doFinal = this.Camera2StreamConfigurationMap.doFinal(bArr, i);
        reset();
        return doFinal;
    }

    public OldHMac(org.bouncycastle.crypto.Digest digest) {
        this.Camera2StreamConfigurationMap = digest;
        this.getHighResolutionOutputSizeshNQ4ISI = digest.getDigestSize();
    }
}
