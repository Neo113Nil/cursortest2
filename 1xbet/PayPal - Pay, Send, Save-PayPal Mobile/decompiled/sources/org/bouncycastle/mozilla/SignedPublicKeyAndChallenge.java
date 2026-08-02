package org.bouncycastle.mozilla;

/* loaded from: classes17.dex */
public class SignedPublicKeyAndChallenge implements org.bouncycastle.util.Encodable {
    protected final org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge spkacSeq;

    public boolean verify(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        java.lang.String id = this.spkacSeq.getSignatureAlgorithm().getAlgorithm().getId();
        java.security.Signature signature = str == null ? java.security.Signature.getInstance(id) : java.security.Signature.getInstance(id, str);
        signature.initVerify(getPublicKey(str));
        try {
            signature.update(this.spkacSeq.getPublicKeyAndChallenge().getEncoded());
            return signature.verify(this.spkacSeq.getSignature().getBytes());
        } catch (java.lang.Exception unused) {
            throw new java.security.InvalidKeyException("error encoding public key");
        }
    }

    public boolean verify() throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        return verify(null);
    }

    public org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge toASN1Structure() {
        return this.spkacSeq;
    }

    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.spkacSeq.toASN1Primitive();
    }

    public boolean isSignatureValid(org.bouncycastle.operator.ContentVerifierProvider contentVerifierProvider) throws org.bouncycastle.operator.OperatorCreationException, java.io.IOException {
        org.bouncycastle.operator.ContentVerifier contentVerifier = contentVerifierProvider.get(this.spkacSeq.getSignatureAlgorithm());
        java.io.OutputStream outputStream = contentVerifier.getOutputStream();
        this.spkacSeq.getPublicKeyAndChallenge().encodeTo(outputStream, org.bouncycastle.asn1.ASN1Encoding.DER);
        outputStream.close();
        return contentVerifier.verify(this.spkacSeq.getSignature().getOctets());
    }

    public org.bouncycastle.asn1.x509.SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return this.spkacSeq.getPublicKeyAndChallenge().getSubjectPublicKeyInfo();
    }

    public org.bouncycastle.asn1.mozilla.PublicKeyAndChallenge getPublicKeyAndChallenge() {
        return this.spkacSeq.getPublicKeyAndChallenge();
    }

    public java.security.PublicKey getPublicKey(java.lang.String str) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo = this.spkacSeq.getPublicKeyAndChallenge().getSubjectPublicKeyInfo();
        try {
            return java.security.KeyFactory.getInstance(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId(), str).generatePublic(new java.security.spec.X509EncodedKeySpec(new org.bouncycastle.asn1.DERBitString(subjectPublicKeyInfo).getOctets()));
        } catch (java.lang.Exception unused) {
            throw new java.security.InvalidKeyException("error encoding public key");
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return toASN1Structure().getEncoded();
    }

    public java.lang.String getChallenge() {
        return this.spkacSeq.getPublicKeyAndChallenge().getChallenge().getString();
    }

    public SignedPublicKeyAndChallenge(byte[] bArr) {
        this.spkacSeq = org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge.getInstance(bArr);
    }

    public SignedPublicKeyAndChallenge(org.bouncycastle.asn1.mozilla.SignedPublicKeyAndChallenge signedPublicKeyAndChallenge) {
        this.spkacSeq = signedPublicKeyAndChallenge;
    }
}
