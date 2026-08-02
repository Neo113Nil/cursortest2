package org.bouncycastle.jcajce;

/* loaded from: classes17.dex */
public class CompositePrivateKey implements java.security.PrivateKey {
    private final java.util.List<java.security.PrivateKey> getHighSpeedVideoFpsRangesFor;

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public java.util.List<java.security.PrivateKey> getPrivateKeys() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.security.Key
    public java.lang.String getFormat() {
        return "PKCS#8";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        for (int i = 0; i != this.getHighSpeedVideoFpsRangesFor.size(); i++) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(this.getHighSpeedVideoFpsRangesFor.get(i).getEncoded()));
        }
        try {
            return new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_alg_composite), new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector)).getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
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
        if (obj instanceof org.bouncycastle.jcajce.CompositePrivateKey) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.jcajce.CompositePrivateKey) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public CompositePrivateKey(java.security.PrivateKey... privateKeyArr) {
        if (privateKeyArr == null || privateKeyArr.length == 0) {
            throw new java.lang.IllegalArgumentException("at least one public key must be provided");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(privateKeyArr.length);
        for (int i = 0; i != privateKeyArr.length; i++) {
            arrayList.add(privateKeyArr[i]);
        }
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(arrayList);
    }
}
