package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
public class RespID {
    public static final org.bouncycastle.asn1.x509.AlgorithmIdentifier HASH_SHA1 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1, org.bouncycastle.asn1.DERNull.INSTANCE);
    org.bouncycastle.asn1.ocsp.ResponderID getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.asn1.ocsp.ResponderID toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cert.ocsp.RespID) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(((org.bouncycastle.cert.ocsp.RespID) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public RespID(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.operator.DigestCalculator digestCalculator) throws org.bouncycastle.cert.ocsp.OCSPException {
        try {
            if (!digestCalculator.getAlgorithmIdentifier().equals(HASH_SHA1)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("only SHA-1 can be used with RespID - found: ");
                sb.append(digestCalculator.getAlgorithmIdentifier().getAlgorithm());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            outputStream.close();
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ocsp.ResponderID(new org.bouncycastle.asn1.DEROctetString(digestCalculator.getDigest()));
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.cert.ocsp.OCSPException("problem creating ID: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public RespID(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ocsp.ResponderID(x500Name);
    }

    public RespID(org.bouncycastle.asn1.ocsp.ResponderID responderID) {
        this.getHighResolutionOutputSizeshNQ4ISI = responderID;
    }
}
