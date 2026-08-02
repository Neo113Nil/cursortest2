package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSPrivateKeyParameters extends org.bouncycastle.pqc.crypto.lms.LMSKeyParameters implements org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner {
    private static org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey Camera2StreamConfigurationMap;
    private static org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey[] getHighSpeedVideoFpsRanges;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final byte[] getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.pqc.crypto.lms.LMSigParameters getHighSpeedVideoSizesFor;
    private final int getInputFormats;
    private org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getInputSizeshNQ4ISI;
    private final int getOutputFormats;
    private final org.bouncycastle.pqc.crypto.lms.LMOtsParameters getOutputMinFrameDuration;
    private final org.bouncycastle.crypto.Digest getOutputMinFrameDurationlomOqCM;
    private final java.util.Map<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey, byte[]> getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext() {
        int h = getSigParameters().getH();
        int index = getIndex();
        org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey highSpeedVideoSizes = getHighSpeedVideoSizes();
        byte[][] bArr = new byte[h][];
        for (int i = 0; i < h; i++) {
            bArr[i] = getHighSpeedVideoFpsRangesFor(1 ^ (((1 << h) + index) / (1 << i)));
        }
        org.bouncycastle.pqc.crypto.lms.LMSigParameters sigParameters = getSigParameters();
        byte[] bArr2 = new byte[32];
        org.bouncycastle.pqc.crypto.lms.SeedDerive highSpeedVideoFpsRanges = highSpeedVideoSizes.getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -3;
        highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(bArr2, 0);
        org.bouncycastle.crypto.Digest highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.Camera2StreamConfigurationMap.getDigestOID());
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.getHighSpeedVideoSizes, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -32383, highSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(bArr2, highSpeedVideoFpsRangesFor);
        return new org.bouncycastle.pqc.crypto.lms.LMSContext(highSpeedVideoSizes, sigParameters, highSpeedVideoFpsRangesFor, bArr2, bArr);
    }

    org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey getHighSpeedVideoSizes() {
        synchronized (this) {
            int i = this.getOutputStallDuration;
            if (i >= this.getInputFormats) {
                throw new org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException("ots private key exhausted");
            }
            org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey lMOtsPrivateKey = new org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, i, this.getHighResolutionOutputSizeshNQ4ISI);
            synchronized (this) {
                this.getOutputStallDuration++;
            }
            return lMOtsPrivateKey;
        }
        return lMOtsPrivateKey;
    }

    public int hashCode() {
        int i = this.getOutputStallDuration;
        int hashCode = org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoFpsRangesFor);
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = this.getHighSpeedVideoSizesFor;
        int hashCode2 = lMSigParameters != null ? lMSigParameters.hashCode() : 0;
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.getOutputMinFrameDuration;
        int hashCode3 = lMOtsParameters != null ? lMOtsParameters.hashCode() : 0;
        int i2 = this.getInputFormats;
        int hashCode4 = org.bouncycastle.util.Arrays.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters = this.getInputSizeshNQ4ISI;
        return (((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + hashCode4) * 31) + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.getInputFormats - this.getOutputStallDuration;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSigParameters getSigParameters() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters getPublicKey() {
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = new org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters(this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap), this.getHighSpeedVideoFpsRangesFor);
            }
            lMSPublicKeyParameters = this.getInputSizeshNQ4ISI;
        }
        return lMSPublicKeyParameters;
    }

    public org.bouncycastle.pqc.crypto.lms.LMOtsParameters getOtsParameters() {
        return this.getOutputMinFrameDuration;
    }

    public byte[] getMasterSecret() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public int getIndex() {
        int i;
        synchronized (this) {
            i = this.getOutputStallDuration;
        }
        return i;
    }

    public byte[] getI() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(0).u32str(this.getHighSpeedVideoSizesFor.getType()).u32str(this.getOutputMinFrameDuration.getType()).bytes(this.getHighSpeedVideoFpsRangesFor).u32str(this.getOutputStallDuration).u32str(this.getInputFormats).u32str(this.getHighResolutionOutputSizeshNQ4ISI.length).bytes(this.getHighResolutionOutputSizeshNQ4ISI).build();
    }

    final org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey getHighSpeedVideoFpsRangesFor() {
        org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            int i = this.getOutputStallDuration;
            if (i >= this.getInputFormats) {
                throw new org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException("ots private keys expired");
            }
            lMOtsPrivateKey = new org.bouncycastle.pqc.crypto.lms.LMOtsPrivateKey(this.getOutputMinFrameDuration, this.getHighSpeedVideoFpsRangesFor, i, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        try {
            return org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoFpsRangesFor(lMSContext).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString(), e);
        }
    }

    private byte[] getHighSpeedVideoFpsRangesFor(int i) {
        if (i >= this.getOutputFormats) {
            return getHighSpeedVideoFpsRanges(i);
        }
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey[] cacheKeyArr = getHighSpeedVideoFpsRanges;
        return getHighResolutionOutputSizeshNQ4ISI(i < cacheKeyArr.length ? cacheKeyArr[i] : new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey(i));
    }

    public org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters extractKeyShard(int i) {
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            int i2 = this.getOutputStallDuration;
            int i3 = i2 + i;
            if (i3 >= this.getInputFormats) {
                throw new java.lang.IllegalArgumentException("usageCount exceeds usages remaining");
            }
            lMSPrivateKeyParameters = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters(this, i2, i3);
            this.getOutputStallDuration += i;
        }
        return lMSPrivateKeyParameters;
    }

    public boolean equals(java.lang.Object obj) {
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) obj;
        if (this.getOutputStallDuration != lMSPrivateKeyParameters.getOutputStallDuration || this.getInputFormats != lMSPrivateKeyParameters.getInputFormats || !org.bouncycastle.util.Arrays.areEqual(this.getHighSpeedVideoFpsRangesFor, lMSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = this.getHighSpeedVideoSizesFor;
        if (lMSigParameters == null ? lMSPrivateKeyParameters.getHighSpeedVideoSizesFor != null : !lMSigParameters.equals(lMSPrivateKeyParameters.getHighSpeedVideoSizesFor)) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters = this.getOutputMinFrameDuration;
        if (lMOtsParameters == null ? lMSPrivateKeyParameters.getOutputMinFrameDuration != null : !lMOtsParameters.equals(lMSPrivateKeyParameters.getOutputMinFrameDuration)) {
            return false;
        }
        if (!org.bouncycastle.util.Arrays.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, lMSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters lMSPublicKeyParameters2 = this.getInputSizeshNQ4ISI;
        if (lMSPublicKeyParameters2 == null || (lMSPublicKeyParameters = lMSPrivateKeyParameters.getInputSizeshNQ4ISI) == null) {
            return true;
        }
        return lMSPublicKeyParameters2.equals(lMSPublicKeyParameters);
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws java.io.IOException {
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.getInputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }

    public static org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters getInstance(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters)) {
            if (obj instanceof java.io.DataInputStream) {
                java.io.DataInputStream dataInputStream2 = (java.io.DataInputStream) obj;
                if (dataInputStream2.readInt() != 0) {
                    throw new java.lang.IllegalStateException("expected version 0 lms private key");
                }
                org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap2 = org.bouncycastle.pqc.crypto.lms.LMSigParameters.Camera2StreamConfigurationMap(dataInputStream2.readInt());
                org.bouncycastle.pqc.crypto.lms.LMOtsParameters parametersForType = org.bouncycastle.pqc.crypto.lms.LMOtsParameters.getParametersForType(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 < 0) {
                    throw new java.lang.IllegalStateException("secret length less than zero");
                }
                if (readInt3 <= dataInputStream2.available()) {
                    byte[] bArr2 = new byte[readInt3];
                    dataInputStream2.readFully(bArr2);
                    return new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters(Camera2StreamConfigurationMap2, parametersForType, readInt, bArr, readInt2, bArr2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("secret length exceeded ");
                sb.append(dataInputStream2.available());
                throw new java.io.IOException(sb.toString());
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream);
                        dataInputStream.close();
                        return lMSPrivateKeyParameters;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof java.io.InputStream)) {
                    throw new java.lang.IllegalArgumentException("cannot parse ".concat(java.lang.String.valueOf(obj)));
                }
                obj = org.bouncycastle.util.io.Streams.readAll((java.io.InputStream) obj);
            }
        }
        return (org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) obj;
    }

    static class CacheKey {
        private final int getHighSpeedVideoSizes;

        public int hashCode() {
            return this.getHighSpeedVideoSizes;
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey) && ((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey) obj).getHighSpeedVideoSizes == this.getHighSpeedVideoSizes;
        }

        CacheKey(int i) {
            this.getHighSpeedVideoSizes = i;
        }
    }

    private byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey cacheKey) {
        byte[] bArr;
        synchronized (this.getOutputSizeshNQ4ISI) {
            bArr = this.getOutputSizeshNQ4ISI.get(cacheKey);
            if (bArr == null) {
                bArr = getHighSpeedVideoFpsRanges(cacheKey.getHighSpeedVideoSizes);
                this.getOutputSizeshNQ4ISI.put(cacheKey, bArr);
            }
        }
        return bArr;
    }

    private byte[] getHighSpeedVideoFpsRanges(int i) {
        int h = 1 << getSigParameters().getH();
        if (i >= h) {
            org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(getI(), this.getOutputMinFrameDurationlomOqCM);
            org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i, this.getOutputMinFrameDurationlomOqCM);
            org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -32126, this.getOutputMinFrameDurationlomOqCM);
            org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(org.bouncycastle.pqc.crypto.lms.LM_OTS.getHighSpeedVideoFpsRangesFor(getOtsParameters(), getI(), i - h, getMasterSecret()), this.getOutputMinFrameDurationlomOqCM);
            byte[] bArr = new byte[this.getOutputMinFrameDurationlomOqCM.getDigestSize()];
            this.getOutputMinFrameDurationlomOqCM.doFinal(bArr, 0);
            return bArr;
        }
        int i2 = i * 2;
        byte[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2);
        byte[] highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(i2 + 1);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(getI(), this.getOutputMinFrameDurationlomOqCM);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoFpsRangesFor(i, this.getOutputMinFrameDurationlomOqCM);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighResolutionOutputSizeshNQ4ISI((short) -31869, this.getOutputMinFrameDurationlomOqCM);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, this.getOutputMinFrameDurationlomOqCM);
        org.bouncycastle.pqc.crypto.lms.LmsUtils.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor2, this.getOutputMinFrameDurationlomOqCM);
        byte[] bArr2 = new byte[this.getOutputMinFrameDurationlomOqCM.getDigestSize()];
        this.getOutputMinFrameDurationlomOqCM.doFinal(bArr2, 0);
        return bArr2;
    }

    public LMSPrivateKeyParameters(org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters, org.bouncycastle.pqc.crypto.lms.LMOtsParameters lMOtsParameters, int i, byte[] bArr, int i2, byte[] bArr2) {
        super(true);
        this.getHighSpeedVideoSizesFor = lMSigParameters;
        this.getOutputMinFrameDuration = lMOtsParameters;
        this.getOutputStallDuration = i;
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.util.Arrays.clone(bArr);
        this.getInputFormats = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr2);
        this.getOutputFormats = 1 << (lMSigParameters.getH() + 1);
        this.getOutputSizeshNQ4ISI = new java.util.WeakHashMap();
        this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMSigParameters.getDigestOID());
    }

    private LMSPrivateKeyParameters(org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters, int i, int i2) {
        super(true);
        org.bouncycastle.pqc.crypto.lms.LMSigParameters lMSigParameters = lMSPrivateKeyParameters.getHighSpeedVideoSizesFor;
        this.getHighSpeedVideoSizesFor = lMSigParameters;
        this.getOutputMinFrameDuration = lMSPrivateKeyParameters.getOutputMinFrameDuration;
        this.getOutputStallDuration = i;
        this.getHighSpeedVideoFpsRangesFor = lMSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor;
        this.getInputFormats = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = lMSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = 1 << lMSigParameters.getH();
        this.getOutputSizeshNQ4ISI = lMSPrivateKeyParameters.getOutputSizeshNQ4ISI;
        this.getOutputMinFrameDurationlomOqCM = org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMSigParameters.getDigestOID());
        this.getInputSizeshNQ4ISI = lMSPrivateKeyParameters.getInputSizeshNQ4ISI;
    }

    static {
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey cacheKey = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey(1);
        Camera2StreamConfigurationMap = cacheKey;
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey[] cacheKeyArr = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey[129];
        getHighSpeedVideoFpsRanges = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i = 2;
        while (true) {
            org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey[] cacheKeyArr2 = getHighSpeedVideoFpsRanges;
            if (i >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i] = new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.CacheKey(i);
            i++;
        }
    }
}
