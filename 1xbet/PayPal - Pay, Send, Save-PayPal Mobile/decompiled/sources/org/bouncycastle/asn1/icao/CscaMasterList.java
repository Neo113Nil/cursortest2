package org.bouncycastle.asn1.icao;

/* loaded from: classes17.dex */
public class CscaMasterList extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.Certificate[] getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes;

    public CscaMasterList(org.bouncycastle.asn1.x509.Certificate[] certificateArr) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(0L);
        int length = certificateArr.length;
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[length];
        for (int i = 0; i != length; i++) {
            certificateArr2[i] = certificateArr[i];
        }
        this.getHighSpeedVideoFpsRanges = certificateArr2;
    }

    public org.bouncycastle.asn1.x509.Certificate[] getCertStructs() {
        org.bouncycastle.asn1.x509.Certificate[] certificateArr = this.getHighSpeedVideoFpsRanges;
        int length = certificateArr.length;
        org.bouncycastle.asn1.x509.Certificate[] certificateArr2 = new org.bouncycastle.asn1.x509.Certificate[length];
        for (int i = 0; i != length; i++) {
            certificateArr2[i] = certificateArr[i];
        }
        return certificateArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSet(this.getHighSpeedVideoFpsRanges));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getHighSpeedVideoSizes.intValueExact();
    }

    public static org.bouncycastle.asn1.icao.CscaMasterList getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.icao.CscaMasterList) {
            return (org.bouncycastle.asn1.icao.CscaMasterList) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.icao.CscaMasterList(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private CscaMasterList(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new java.lang.IllegalArgumentException("null or empty sequence passed.");
        }
        if (aSN1Sequence.size() != 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Incorrect sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = 0;
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        org.bouncycastle.asn1.ASN1Set aSN1Set = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.x509.Certificate[aSN1Set.size()];
        while (true) {
            org.bouncycastle.asn1.x509.Certificate[] certificateArr = this.getHighSpeedVideoFpsRanges;
            if (i >= certificateArr.length) {
                return;
            }
            certificateArr[i] = org.bouncycastle.asn1.x509.Certificate.getInstance(aSN1Set.getObjectAt(i));
            i++;
        }
    }
}
