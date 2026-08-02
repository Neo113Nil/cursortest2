package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JceAsymmetricKeyUnwrapper extends org.bouncycastle.operator.AsymmetricKeyUnwrapper {
    private java.security.PrivateKey Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.operator.jcajce.OperatorHelper getHighSpeedVideoFpsRangesFor;
    private java.util.Map getHighSpeedVideoSizes;

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper setMustProduceEncodableUnwrappedKey(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        return this;
    }

    public org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper setAlgorithmMapping(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        this.getHighSpeedVideoSizes.put(aSN1ObjectIdentifier, str);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2.length == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[Catch: BadPaddingException -> 0x0064, IllegalBlockSizeException -> 0x007d, InvalidKeyException -> 0x0096, TRY_ENTER, TryCatch #4 {InvalidKeyException -> 0x0096, BadPaddingException -> 0x0064, IllegalBlockSizeException -> 0x007d, blocks: (B:2:0x0000, B:6:0x001e, B:7:0x0029, B:10:0x0036, B:12:0x003a, B:14:0x0040, B:25:0x0024, B:18:0x0047, B:19:0x005e), top: B:1:0x0000 }] */
    @Override // org.bouncycastle.operator.KeyUnwrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public org.bouncycastle.operator.GenericKey generateUnwrappedKey(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) throws org.bouncycastle.operator.OperatorException {
        java.security.Key unwrap;
        try {
            javax.crypto.Cipher highSpeedVideoSizes = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(getAlgorithmIdentifier().getAlgorithm(), this.getHighSpeedVideoSizes);
            java.security.AlgorithmParameters highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(getAlgorithmIdentifier());
            java.security.Key key = null;
            try {
                if (highSpeedVideoFpsRangesFor != null) {
                    highSpeedVideoSizes.init(4, this.Camera2StreamConfigurationMap, highSpeedVideoFpsRangesFor);
                } else {
                    highSpeedVideoSizes.init(4, this.Camera2StreamConfigurationMap);
                }
                unwrap = highSpeedVideoSizes.unwrap(bArr, org.bouncycastle.operator.jcajce.OperatorHelper.getHighSpeedVideoFpsRangesFor(algorithmIdentifier.getAlgorithm()), 3);
            } catch (java.lang.IllegalStateException | java.lang.UnsupportedOperationException | java.security.GeneralSecurityException | java.security.ProviderException | java.lang.Exception unused) {
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                byte[] encoded = unwrap.getEncoded();
                if (encoded != null) {
                }
                if (key == null) {
                    highSpeedVideoSizes.init(2, this.Camera2StreamConfigurationMap);
                    key = new javax.crypto.spec.SecretKeySpec(highSpeedVideoSizes.doFinal(bArr), algorithmIdentifier.getAlgorithm().getId());
                }
                return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier, key);
            }
            key = unwrap;
            if (key == null) {
            }
            return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier, key);
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("key invalid: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb.toString(), e);
        } catch (javax.crypto.BadPaddingException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("bad padding: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb2.toString(), e2);
        } catch (javax.crypto.IllegalBlockSizeException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("illegal blocksize: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.operator.OperatorException(sb3.toString(), e3);
        }
    }

    public JceAsymmetricKeyUnwrapper(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey) {
        super(algorithmIdentifier);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.operator.jcajce.OperatorHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
        this.getHighSpeedVideoSizes = new java.util.HashMap();
        this.Camera2StreamConfigurationMap = privateKey;
    }
}
