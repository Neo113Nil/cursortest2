package org.bouncycastle.jcajce.provider.symmetric.util;

/* loaded from: classes17.dex */
public class BCPBEKey implements javax.crypto.interfaces.PBEKey, javax.security.auth.Destroyable {
    int Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private final int getHighSpeedVideoSizesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
    int getInputSizeshNQ4ISI;
    private final org.bouncycastle.crypto.CipherParameters getOutputFormats;
    boolean getOutputMinFrameDuration;
    private final char[] getOutputSizes;
    private final byte[] getOutputSizeshNQ4ISI;

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        org.bouncycastle.crypto.CipherParameters cipherParameters = this.getOutputFormats;
        if (cipherParameters == null) {
            int i = this.getInputSizeshNQ4ISI;
            return i == 2 ? org.bouncycastle.crypto.PBEParametersGenerator.PKCS12PasswordToBytes(this.getOutputSizes) : i == 5 ? org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.getOutputSizes) : org.bouncycastle.crypto.PBEParametersGenerator.PKCS5PasswordToBytes(this.getOutputSizes);
        }
        if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithIV) {
            cipherParameters = ((org.bouncycastle.crypto.params.ParametersWithIV) cipherParameters).getParameters();
        }
        return ((org.bouncycastle.crypto.params.KeyParameter) cipherParameters).getKey();
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return this.getHighSpeedVideoSizesFor;
    }

    public int getIvSize() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getOID() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.crypto.CipherParameters getParam() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return this.getOutputFormats;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        char[] cArr = this.getOutputSizes;
        if (cArr != null) {
            return org.bouncycastle.util.Arrays.clone(cArr);
        }
        throw new java.lang.IllegalStateException("no password available");
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        if (isDestroyed()) {
            throw new java.lang.IllegalStateException("key has been destroyed");
        }
        return org.bouncycastle.util.Arrays.clone(this.getOutputSizeshNQ4ISI);
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.getInputFormats.get();
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "RAW";
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.getInputFormats.getAndSet(true)) {
            return;
        }
        char[] cArr = this.getOutputSizes;
        if (cArr != null) {
            org.bouncycastle.util.Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.getOutputSizeshNQ4ISI;
        if (bArr != null) {
            org.bouncycastle.util.Arrays.fill(bArr, (byte) 0);
        }
    }

    public BCPBEKey(java.lang.String str, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputMinFrameDuration = false;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getOutputFormats = cipherParameters;
        this.getOutputSizes = null;
        this.getHighSpeedVideoSizesFor = -1;
        this.getOutputSizeshNQ4ISI = null;
    }

    public BCPBEKey(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, int i2, int i3, int i4, javax.crypto.spec.PBEKeySpec pBEKeySpec, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputMinFrameDuration = false;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRangesFor = i4;
        this.getOutputSizes = pBEKeySpec.getPassword();
        this.getHighSpeedVideoSizesFor = pBEKeySpec.getIterationCount();
        this.getOutputSizeshNQ4ISI = pBEKeySpec.getSalt();
        this.getOutputFormats = cipherParameters;
    }
}
