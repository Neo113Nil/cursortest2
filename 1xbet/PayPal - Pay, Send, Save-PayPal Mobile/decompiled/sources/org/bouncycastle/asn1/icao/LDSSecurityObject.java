package org.bouncycastle.asn1.icao;

/* loaded from: classes17.dex */
public class LDSSecurityObject extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.icao.ICAOObjectIdentifiers {
    public static final int ub_DataGroups = 16;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.icao.LDSVersionInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.icao.DataGroupHash[] getHighSpeedVideoSizes;

    private LDSSecurityObject(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(0L);
        if (aSN1Sequence == null || aSN1Sequence.size() == 0) {
            throw new java.lang.IllegalArgumentException("null or empty sequence passed.");
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(objects.nextElement());
        if (this.getHighSpeedVideoFpsRanges.hasValue(1)) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.icao.LDSVersionInfo.getInstance(objects.nextElement());
        }
        int size = aSN1Sequence2.size();
        if (size < 2 || size > 16) {
            throw new java.lang.IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        }
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.icao.DataGroupHash[aSN1Sequence2.size()];
        for (int i = 0; i < aSN1Sequence2.size(); i++) {
            this.getHighSpeedVideoSizes[i] = org.bouncycastle.asn1.icao.DataGroupHash.getInstance(aSN1Sequence2.getObjectAt(i));
        }
    }

    public LDSSecurityObject(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        int length = dataGroupHashArr.length;
        org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr2 = new org.bouncycastle.asn1.icao.DataGroupHash[length];
        java.lang.System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        this.getHighSpeedVideoSizes = dataGroupHashArr2;
        int length2 = dataGroupHashArr.length;
        if (length2 < 2 || length2 > 16) {
            throw new java.lang.IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        }
    }

    public LDSSecurityObject(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr, org.bouncycastle.asn1.icao.LDSVersionInfo lDSVersionInfo) {
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier;
        int length = dataGroupHashArr.length;
        org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr2 = new org.bouncycastle.asn1.icao.DataGroupHash[length];
        java.lang.System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        this.getHighSpeedVideoSizes = dataGroupHashArr2;
        this.getHighSpeedVideoFpsRangesFor = lDSVersionInfo;
        int length2 = dataGroupHashArr.length;
        if (length2 < 2 || length2 > 16) {
            throw new java.lang.IllegalArgumentException("wrong size in DataGroupHashValues : not in (2..16)");
        }
    }

    public org.bouncycastle.asn1.icao.DataGroupHash[] getDatagroupHash() {
        org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr = this.getHighSpeedVideoSizes;
        int length = dataGroupHashArr.length;
        org.bouncycastle.asn1.icao.DataGroupHash[] dataGroupHashArr2 = new org.bouncycastle.asn1.icao.DataGroupHash[length];
        java.lang.System.arraycopy(dataGroupHashArr, 0, dataGroupHashArr2, 0, length);
        return dataGroupHashArr2;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(this.getHighSpeedVideoSizes));
        org.bouncycastle.asn1.icao.LDSVersionInfo lDSVersionInfo = this.getHighSpeedVideoFpsRangesFor;
        if (lDSVersionInfo != null) {
            aSN1EncodableVector.add(lDSVersionInfo);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.icao.LDSVersionInfo getVersionInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getVersion() {
        return this.getHighSpeedVideoFpsRanges.intValueExact();
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.icao.LDSSecurityObject getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.icao.LDSSecurityObject) {
            return (org.bouncycastle.asn1.icao.LDSSecurityObject) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.icao.LDSSecurityObject(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }
}
