package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class ArchiveTimeStampSequence extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int size() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStampChain[] getArchiveTimeStampChains() {
        int size = this.getHighResolutionOutputSizeshNQ4ISI.size();
        org.bouncycastle.asn1.tsp.ArchiveTimeStampChain[] archiveTimeStampChainArr = new org.bouncycastle.asn1.tsp.ArchiveTimeStampChain[size];
        for (int i = 0; i != size; i++) {
            archiveTimeStampChainArr[i] = org.bouncycastle.asn1.tsp.ArchiveTimeStampChain.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return archiveTimeStampChainArr;
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence append(org.bouncycastle.asn1.tsp.ArchiveTimeStampChain archiveTimeStampChain) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighResolutionOutputSizeshNQ4ISI.size() + 1);
        for (int i = 0; i != this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        aSN1EncodableVector.add(archiveTimeStampChain);
        return new org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector));
    }

    public static org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.ArchiveTimeStampChain) {
            return (org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ArchiveTimeStampSequence(org.bouncycastle.asn1.tsp.ArchiveTimeStampChain[] archiveTimeStampChainArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(archiveTimeStampChainArr);
    }

    public ArchiveTimeStampSequence(org.bouncycastle.asn1.tsp.ArchiveTimeStampChain archiveTimeStampChain) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(archiveTimeStampChain);
    }

    private ArchiveTimeStampSequence(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) throws java.lang.IllegalArgumentException {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(aSN1Sequence.size());
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            aSN1EncodableVector.add(org.bouncycastle.asn1.tsp.ArchiveTimeStampChain.getInstance(objects.nextElement()));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }
}
