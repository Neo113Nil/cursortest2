package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class ArchiveTimeStampChain extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStamp[] getArchiveTimestamps() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.tsp.ArchiveTimeStamp[] archiveTimeStampArr = new org.bouncycastle.asn1.tsp.ArchiveTimeStamp[size];
        for (int i = 0; i != size; i++) {
            archiveTimeStampArr[i] = org.bouncycastle.asn1.tsp.ArchiveTimeStamp.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return archiveTimeStampArr;
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStampChain append(org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.Camera2StreamConfigurationMap.size() + 1);
        for (int i = 0; i != this.Camera2StreamConfigurationMap.size(); i++) {
            aSN1EncodableVector.add(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        aSN1EncodableVector.add(archiveTimeStamp);
        return new org.bouncycastle.asn1.tsp.ArchiveTimeStampChain(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public static org.bouncycastle.asn1.tsp.ArchiveTimeStampChain getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.ArchiveTimeStampChain) {
            return (org.bouncycastle.asn1.tsp.ArchiveTimeStampChain) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.ArchiveTimeStampChain(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ArchiveTimeStampChain(org.bouncycastle.asn1.tsp.ArchiveTimeStamp[] archiveTimeStampArr) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(archiveTimeStampArr);
    }

    public ArchiveTimeStampChain(org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(archiveTimeStamp);
    }

    private ArchiveTimeStampChain(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(aSN1Sequence.size());
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.tsp.ArchiveTimeStamp.getInstance(objects.nextElement()));
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
