package org.bouncycastle.openssl;

/* loaded from: classes17.dex */
public class CertificateTrustBlock {
    org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes;

    public java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> getUses() {
        return getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> getProhibitions() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
    }

    public java.lang.String getAlias() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private static java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighSpeedVideoSizes(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return java.util.Collections.EMPTY_SET;
        }
        java.util.HashSet hashSet = new java.util.HashSet(aSN1Sequence.size());
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            hashSet.add(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(objects.nextElement()));
        }
        return hashSet;
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges(java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> set) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Iterator<org.bouncycastle.asn1.ASN1ObjectIdentifier> it = set.iterator();
        while (it.hasNext()) {
            aSN1EncodableVector.add(it.next());
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    CertificateTrustBlock(byte[] bArr) {
        java.util.Enumeration objects = org.bouncycastle.asn1.ASN1Sequence.getInstance(bArr).getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Encodable aSN1Encodable = (org.bouncycastle.asn1.ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1Sequence) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Encodable);
            } else if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Sequence.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Encodable, false);
            } else if (aSN1Encodable instanceof org.bouncycastle.asn1.ASN1UTF8String) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Encodable).getString();
            }
        }
    }

    public CertificateTrustBlock(java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> set) {
        this(null, set, null);
    }

    public CertificateTrustBlock(java.lang.String str, java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> set, java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> set2) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(set);
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(set2);
    }

    public CertificateTrustBlock(java.lang.String str, java.util.Set<org.bouncycastle.asn1.ASN1ObjectIdentifier> set) {
        this(str, set, null);
    }
}
