package org.bouncycastle.eac.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaEACSignatureVerifierBuilder {
    private org.bouncycastle.eac.operator.jcajce.EACHelper getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.eac.operator.jcajce.DefaultEACHelper();

    static /* synthetic */ byte[] Camera2StreamConfigurationMap(byte[] bArr) throws java.io.IOException {
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        java.lang.System.arraycopy(bArr, length, bArr3, 0, length);
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(new java.math.BigInteger(1, bArr2)));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(new java.math.BigInteger(1, bArr3)));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded();
    }

    class SignatureOutputStream extends java.io.OutputStream {
        java.security.Signature Camera2StreamConfigurationMap;

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            try {
                this.Camera2StreamConfigurationMap.update(bArr, i, i2);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws java.io.IOException {
            try {
                this.Camera2StreamConfigurationMap.update(bArr);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            try {
                this.Camera2StreamConfigurationMap.update((byte) i);
            } catch (java.security.SignatureException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("exception in content signer: ");
                sb.append(e.getMessage());
                throw new org.bouncycastle.operator.OperatorStreamException(sb.toString(), e);
            }
        }

        SignatureOutputStream(java.security.Signature signature) {
            this.Camera2StreamConfigurationMap = signature;
        }
    }

    public org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.eac.operator.jcajce.ProviderEACHelper(provider);
        return this;
    }

    public org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.eac.operator.jcajce.NamedEACHelper(str);
        return this;
    }

    public org.bouncycastle.eac.operator.EACSignatureVerifier build(final org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.PublicKey publicKey) throws org.bouncycastle.operator.OperatorCreationException {
        try {
            java.security.Signature highSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(aSN1ObjectIdentifier);
            highSpeedVideoSizes.initVerify(publicKey);
            final org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.SignatureOutputStream signatureOutputStream = new org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.SignatureOutputStream(highSpeedVideoSizes);
            return new org.bouncycastle.eac.operator.EACSignatureVerifier() { // from class: org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.1
                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
                public boolean verify(byte[] bArr) {
                    try {
                        if (!aSN1ObjectIdentifier.on(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA)) {
                            return signatureOutputStream.Camera2StreamConfigurationMap.verify(bArr);
                        }
                        try {
                            return signatureOutputStream.Camera2StreamConfigurationMap.verify(org.bouncycastle.eac.operator.jcajce.JcaEACSignatureVerifierBuilder.Camera2StreamConfigurationMap(bArr));
                        } catch (java.lang.Exception unused) {
                            return false;
                        }
                    } catch (java.security.SignatureException e) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("exception obtaining signature: ");
                        sb.append(e.getMessage());
                        throw new org.bouncycastle.operator.RuntimeOperatorException(sb.toString(), e);
                    }
                }

                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
                public org.bouncycastle.asn1.ASN1ObjectIdentifier getUsageIdentifier() {
                    return aSN1ObjectIdentifier;
                }

                @Override // org.bouncycastle.eac.operator.EACSignatureVerifier
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
}
