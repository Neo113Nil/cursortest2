package org.bouncycastle.crypto.macs;

/* loaded from: classes17.dex */
public class HMac implements org.bouncycastle.crypto.Mac {
    private static java.util.Hashtable getHighSpeedVideoFpsRanges;
    private int Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.crypto.Digest getHighSpeedVideoFpsRangesFor;
    private byte[] getHighSpeedVideoSizes;
    private org.bouncycastle.util.Memoable getInputSizeshNQ4ISI;
    private org.bouncycastle.util.Memoable getOutputFormats;
    private byte[] getOutputMinFrameDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HMac(org.bouncycastle.crypto.Digest digest) {
        this(digest, r0);
        int intValue;
        if (digest instanceof org.bouncycastle.crypto.ExtendedDigest) {
            intValue = ((org.bouncycastle.crypto.ExtendedDigest) digest).getByteLength();
        } else {
            java.lang.Integer num = (java.lang.Integer) getHighSpeedVideoFpsRanges.get(digest.getAlgorithmName());
            if (num == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown digest passed: ");
                sb.append(digest.getAlgorithmName());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            intValue = num.intValue();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        byte[] bArr;
        this.getHighSpeedVideoFpsRangesFor.reset();
        byte[] key = ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
        int length = key.length;
        if (length > this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoFpsRangesFor.update(key, 0, length);
            this.getHighSpeedVideoFpsRangesFor.doFinal(this.getHighSpeedVideoSizes, 0);
            length = this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            java.lang.System.arraycopy(key, 0, this.getHighSpeedVideoSizes, 0, length);
        }
        while (true) {
            bArr = this.getHighSpeedVideoSizes;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        java.lang.System.arraycopy(bArr, 0, this.getOutputMinFrameDuration, 0, this.Camera2StreamConfigurationMap);
        byte[] bArr2 = this.getHighSpeedVideoSizes;
        int i = this.Camera2StreamConfigurationMap;
        for (int i2 = 0; i2 < i; i2++) {
            bArr2[i2] = (byte) (bArr2[i2] ^ org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE);
        }
        byte[] bArr3 = this.getOutputMinFrameDuration;
        int i3 = this.Camera2StreamConfigurationMap;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr3[i4] ^ 92);
        }
        org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRangesFor;
        if (digest instanceof org.bouncycastle.util.Memoable) {
            org.bouncycastle.util.Memoable copy = ((org.bouncycastle.util.Memoable) digest).copy();
            this.getOutputFormats = copy;
            ((org.bouncycastle.crypto.Digest) copy).update(this.getOutputMinFrameDuration, 0, this.Camera2StreamConfigurationMap);
        }
        org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr4 = this.getHighSpeedVideoSizes;
        digest2.update(bArr4, 0, bArr4.length);
        org.bouncycastle.crypto.Digest digest3 = this.getHighSpeedVideoFpsRangesFor;
        if (digest3 instanceof org.bouncycastle.util.Memoable) {
            this.getInputSizeshNQ4ISI = ((org.bouncycastle.util.Memoable) digest3).copy();
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor.update(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.getHighSpeedVideoFpsRangesFor.update(b);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.getHighSpeedVideoFpsRangesFor.reset();
        org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr = this.getHighSpeedVideoSizes;
        digest.update(bArr, 0, bArr.length);
    }

    public org.bouncycastle.crypto.Digest getUnderlyingDigest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.bouncycastle.crypto.Mac
    public java.lang.String getAlgorithmName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor.getAlgorithmName());
        sb.append("/HMAC");
        return sb.toString();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        this.getHighSpeedVideoFpsRangesFor.doFinal(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap);
        org.bouncycastle.util.Memoable memoable = this.getOutputFormats;
        if (memoable != null) {
            ((org.bouncycastle.util.Memoable) this.getHighSpeedVideoFpsRangesFor).reset(memoable);
            org.bouncycastle.crypto.Digest digest = this.getHighSpeedVideoFpsRangesFor;
            digest.update(this.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap, digest.getDigestSize());
        } else {
            org.bouncycastle.crypto.Digest digest2 = this.getHighSpeedVideoFpsRangesFor;
            byte[] bArr2 = this.getOutputMinFrameDuration;
            digest2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.getHighSpeedVideoFpsRangesFor.doFinal(bArr, i);
        int i2 = this.Camera2StreamConfigurationMap;
        while (true) {
            byte[] bArr3 = this.getOutputMinFrameDuration;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        org.bouncycastle.util.Memoable memoable2 = this.getInputSizeshNQ4ISI;
        if (memoable2 != null) {
            ((org.bouncycastle.util.Memoable) this.getHighSpeedVideoFpsRangesFor).reset(memoable2);
            return doFinal;
        }
        org.bouncycastle.crypto.Digest digest3 = this.getHighSpeedVideoFpsRangesFor;
        byte[] bArr4 = this.getHighSpeedVideoSizes;
        digest3.update(bArr4, 0, bArr4.length);
        return doFinal;
    }

    private HMac(org.bouncycastle.crypto.Digest digest, int i) {
        this.getHighSpeedVideoFpsRangesFor = digest;
        int digestSize = digest.getDigestSize();
        this.getHighResolutionOutputSizeshNQ4ISI = digestSize;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoSizes = new byte[i];
        this.getOutputMinFrameDuration = new byte[i + digestSize];
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRanges = hashtable;
        hashtable.put("GOST3411", org.bouncycastle.util.Integers.valueOf(32));
        getHighSpeedVideoFpsRanges.put("MD2", org.bouncycastle.util.Integers.valueOf(16));
        getHighSpeedVideoFpsRanges.put("MD4", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("MD5", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("RIPEMD128", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("RIPEMD160", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("SHA-1", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("SHA-224", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("SHA-256", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("SHA-384", org.bouncycastle.util.Integers.valueOf(128));
        getHighSpeedVideoFpsRanges.put("SHA-512", org.bouncycastle.util.Integers.valueOf(128));
        getHighSpeedVideoFpsRanges.put("Tiger", org.bouncycastle.util.Integers.valueOf(64));
        getHighSpeedVideoFpsRanges.put("Whirlpool", org.bouncycastle.util.Integers.valueOf(64));
    }
}
