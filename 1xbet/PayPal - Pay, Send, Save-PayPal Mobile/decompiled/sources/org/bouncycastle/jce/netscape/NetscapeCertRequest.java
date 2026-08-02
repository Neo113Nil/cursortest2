package org.bouncycastle.jce.netscape;

/* loaded from: classes17.dex */
public class NetscapeCertRequest extends org.bouncycastle.asn1.ASN1Object {
    java.security.PublicKey Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.DERBitString getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;
    byte[] getHighSpeedVideoSizesFor;

    public NetscapeCertRequest(byte[] bArr) throws java.io.IOException {
        this(org.bouncycastle.asn1.ASN1Sequence.getInstance(new org.bouncycastle.asn1.ASN1InputStream(new java.io.ByteArrayInputStream(bArr)).readObject()));
    }

    public boolean verify(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException {
        if (!str.equals(this.getHighSpeedVideoFpsRangesFor)) {
            return false;
        }
        java.security.Signature signature = java.security.Signature.getInstance(this.getHighSpeedVideoFpsRanges.getAlgorithm().getId(), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        signature.initVerify(this.Camera2StreamConfigurationMap);
        signature.update(this.getHighResolutionOutputSizeshNQ4ISI.getBytes());
        return signature.verify(this.getHighSpeedVideoSizesFor);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector();
        try {
            aSN1EncodableVector2.add(getHighSpeedVideoFpsRangesFor());
        } catch (java.lang.Exception unused) {
        }
        aSN1EncodableVector2.add(new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoFpsRangesFor));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERBitString(this.getHighSpeedVideoSizesFor));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public void sign(java.security.PrivateKey privateKey, java.security.SecureRandom secureRandom) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
        java.security.Signature signature = java.security.Signature.getInstance(this.getHighSpeedVideoFpsRanges.getAlgorithm().getId(), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME);
        if (secureRandom != null) {
            signature.initSign(privateKey, secureRandom);
        } else {
            signature.initSign(privateKey);
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(getHighSpeedVideoFpsRangesFor());
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERIA5String(this.getHighSpeedVideoFpsRangesFor));
        try {
            signature.update(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
            this.getHighSpeedVideoSizesFor = signature.sign();
        } catch (java.io.IOException e) {
            throw new java.security.SignatureException(e.getMessage());
        }
    }

    public void sign(java.security.PrivateKey privateKey) throws java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.spec.InvalidKeySpecException {
        sign(privateKey, null);
    }

    public void setSigningAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
    }

    public void setPublicKey(java.security.PublicKey publicKey) {
        this.Camera2StreamConfigurationMap = publicKey;
    }

    public void setKeyAlgorithm(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier) {
        this.getHighSpeedVideoSizes = algorithmIdentifier;
    }

    public void setChallenge(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getSigningAlgorithm() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.security.PublicKey getPublicKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getKeyAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getChallenge() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private org.bouncycastle.asn1.ASN1Primitive getHighSpeedVideoFpsRangesFor() throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(this.Camera2StreamConfigurationMap.getEncoded());
            byteArrayOutputStream.close();
            return new org.bouncycastle.asn1.ASN1InputStream(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (java.io.IOException e) {
            throw new java.security.spec.InvalidKeySpecException(e.getMessage());
        }
    }

    public NetscapeCertRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        try {
            if (aSN1Sequence.size() != 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid SPKAC (size):");
                sb.append(aSN1Sequence.size());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
            this.getHighSpeedVideoSizesFor = ((org.bouncycastle.asn1.DERBitString) aSN1Sequence.getObjectAt(2)).getOctets();
            org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(0);
            if (aSN1Sequence2.size() != 2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid PKAC (len): ");
                sb2.append(aSN1Sequence2.size());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.asn1.ASN1IA5String) aSN1Sequence2.getObjectAt(1)).getString();
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERBitString(aSN1Sequence2);
            org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(aSN1Sequence2.getObjectAt(0));
            java.security.spec.X509EncodedKeySpec x509EncodedKeySpec = new java.security.spec.X509EncodedKeySpec(new org.bouncycastle.asn1.DERBitString(subjectPublicKeyInfo).getBytes());
            org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
            this.getHighSpeedVideoSizes = algorithm;
            this.Camera2StreamConfigurationMap = java.security.KeyFactory.getInstance(algorithm.getAlgorithm().getId(), org.bouncycastle.jce.provider.BouncyCastleProvider.PROVIDER_NAME).generatePublic(x509EncodedKeySpec);
        } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException(e.toString());
        }
    }

    public NetscapeCertRequest(java.lang.String str, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PublicKey publicKey) throws java.security.NoSuchAlgorithmException, java.security.spec.InvalidKeySpecException, java.security.NoSuchProviderException {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = publicKey;
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        aSN1EncodableVector.add(getHighSpeedVideoFpsRangesFor());
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERIA5String(str));
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERBitString(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception encoding key: ");
            sb.append(e.toString());
            throw new java.security.spec.InvalidKeySpecException(sb.toString());
        }
    }
}
