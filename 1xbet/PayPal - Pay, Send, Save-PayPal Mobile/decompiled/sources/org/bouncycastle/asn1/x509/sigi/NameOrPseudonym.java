package org.bouncycastle.asn1.x509.sigi;

/* loaded from: classes17.dex */
public class NameOrPseudonym extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.x500.DirectoryString getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.x500.DirectoryString getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.x500.DirectoryString directoryString = this.getHighResolutionOutputSizeshNQ4ISI;
        if (directoryString != null) {
            return directoryString.toASN1Primitive();
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x500.DirectoryString getSurname() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x500.DirectoryString getPseudonym() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x500.DirectoryString[] getGivenName() {
        org.bouncycastle.asn1.x500.DirectoryString[] directoryStringArr = new org.bouncycastle.asn1.x500.DirectoryString[this.getHighSpeedVideoFpsRangesFor.size()];
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRangesFor.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i] = org.bouncycastle.asn1.x500.DirectoryString.getInstance(objects.nextElement());
            i++;
        }
        return directoryStringArr;
    }

    public static org.bouncycastle.asn1.x509.sigi.NameOrPseudonym getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.x509.sigi.NameOrPseudonym)) {
            return (org.bouncycastle.asn1.x509.sigi.NameOrPseudonym) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1String) {
            return new org.bouncycastle.asn1.x509.sigi.NameOrPseudonym(org.bouncycastle.asn1.x500.DirectoryString.getInstance(obj));
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.x509.sigi.NameOrPseudonym((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public NameOrPseudonym(org.bouncycastle.asn1.x500.DirectoryString directoryString, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = directoryString;
        this.getHighSpeedVideoFpsRangesFor = aSN1Sequence;
    }

    public NameOrPseudonym(org.bouncycastle.asn1.x500.DirectoryString directoryString) {
        this.getHighResolutionOutputSizeshNQ4ISI = directoryString;
    }

    private NameOrPseudonym(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1String) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.x500.DirectoryString.getInstance(aSN1Sequence.getObjectAt(0));
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad object encountered: ");
            sb2.append(aSN1Sequence.getObjectAt(0).getClass());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    public NameOrPseudonym(java.lang.String str) {
        this(new org.bouncycastle.asn1.x500.DirectoryString(str));
    }
}
