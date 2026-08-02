package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaEACSignerBuilder {
    private static final java.util.Hashtable getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.eac.operator.jcajce.EACHelper Camera2StreamConfigurationMap = new org.bouncycastle.eac.operator.jcajce.DefaultEACHelper();

    public static int max(int i, int i2) {
        return i > i2 ? i : i2;
    }

    static /* synthetic */ byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr);
        java.math.BigInteger value = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        java.math.BigInteger value2 = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
        byte[] byteArray = value.toByteArray();
        byte[] byteArray2 = value2.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
        }
        int length2 = byteArray2.length;
        if (byteArray2[0] == 0) {
            length2--;
        }
        int max = max(length, length2);
        int i = max * 2;
        byte[] bArr2 = new byte[i];
        java.util.Arrays.fill(bArr2, (byte) 0);
        getHighSpeedVideoFpsRangesFor(byteArray, bArr2, max - length);
        getHighSpeedVideoFpsRangesFor(byteArray2, bArr2, i - length2);
        return bArr2;
    }

    public org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.eac.operator.jcajce.ProviderEACHelper(provider);
        return this;
    }

    public org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.eac.operator.jcajce.NamedEACHelper(str);
        return this;
    }

    public org.bouncycastle.eac.operator.EACSigner build(final org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.security.Signature highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(aSN1ObjectIdentifier);
            highSpeedVideoSizes.initSign(privateKey);
            final org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.SignatureOutputStream signatureOutputStream = new org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.SignatureOutputStream(highSpeedVideoSizes);
            return new org.bouncycastle.eac.operator.EACSigner() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSigner
                public byte[] getSignature() {
                    try {
                        byte[] sign = signatureOutputStream.getHighSpeedVideoFpsRanges.sign();
                        return aSN1ObjectIdentifier.on(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA) ? org.bouncycastle.eac.operator.jcajce.JcaEACSignerBuilder.Camera2StreamConfigurationMap(sign) : sign;
                    } catch (java.security.SignatureException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                        sb.append(e.getMessage());
                        throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                    }
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public org.bouncycastle.asn1.ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }

                @Override // org.bouncycastle.eac.operator.EACSigner
                public java.io.OutputStream getOutputStream() {
                    return signatureOutputStream;
                }
            };
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb.toString(), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to find algorithm: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb2.toString(), e2);
        } catch (java.security.NoSuchProviderException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unable to find provider: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.operator.OperatorCreationException(sb3.toString(), e3);
        }
    }

    class SignatureOutputStream extends java.io.OutputStream {
        java.security.Signature getHighSpeedVideoFpsRanges;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                this.getHighSpeedVideoFpsRanges.update(bArr, i, i2);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            try {
                this.getHighSpeedVideoFpsRanges.update(bArr);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            try {
                this.getHighSpeedVideoFpsRanges.update((byte) i);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        SignatureOutputStream(java.security.Signature signature) {
            this.getHighSpeedVideoFpsRanges = signature;
        }
    }

    public org.bouncycastle.eac.operator.EACSigner build(java.lang.String str, java.security.PrivateKey privateKey) throws org.bouncycastle.operator.OperatorCreationException {
        return build((org.bouncycastle.asn1.ASN1ObjectIdentifier) getHighSpeedVideoFpsRangesFor.get(str), privateKey);
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length;
        int i2 = 0;
        if (bArr[0] == 0) {
            length--;
            i2 = 1;
        }
        java.lang.System.arraycopy(bArr, i2, bArr2, i, length);
    }

    static {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        getHighSpeedVideoFpsRangesFor = hashtable;
        hashtable.put("SHA1withRSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_1);
        hashtable.put("SHA256withRSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_256);
        hashtable.put("SHA1withRSAandMGF1", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_1);
        hashtable.put("SHA256withRSAandMGF1", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_256);
        hashtable.put("SHA512withRSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_v1_5_SHA_512);
        hashtable.put("SHA512withRSAandMGF1", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_RSA_PSS_SHA_512);
        hashtable.put("SHA1withECDSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_1);
        hashtable.put("SHA224withECDSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_224);
        hashtable.put("SHA256withECDSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_256);
        hashtable.put("SHA384withECDSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_384);
        hashtable.put("SHA512withECDSA", org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA_SHA_512);
    }
}
