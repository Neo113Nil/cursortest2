package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class CompositePublicKey implements java.security.PublicKey {
    private final java.util.List<java.security.PublicKey> getHighSpeedVideoFpsRanges;

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public java.util.List<java.security.PublicKey> getPublicKeys() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "X.509";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(this.getHighSpeedVideoFpsRanges.get(i).getEncoded()));
        }
        try {
            return new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite), new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode composite key: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // java.security.Key
    public java.lang.String getAlgorithm() {
        return "Composite";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.jcajce.CompositePublicKey) {
            return this.getHighSpeedVideoFpsRanges.equals(((org.bouncycastle.jcajce.CompositePublicKey) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public CompositePublicKey(java.security.PublicKey... publicKeyArr) {
        if (publicKeyArr == null || publicKeyArr.length == 0) {
            throw new java.lang.IllegalArgumentException("at least one public key must be provided");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(publicKeyArr.length);
        for (int i = 0; i != publicKeyArr.length; i++) {
            arrayList.add(publicKeyArr[i]);
        }
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(arrayList);
    }
}
