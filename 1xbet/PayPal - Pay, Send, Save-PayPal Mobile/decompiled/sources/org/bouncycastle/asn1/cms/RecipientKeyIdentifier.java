package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class RecipientKeyIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.cms.OtherKeyAttribute Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1GeneralizedTime != null) {
            aSN1EncodableVector.add(aSN1GeneralizedTime);
        }
        org.bouncycastle.asn1.cms.OtherKeyAttribute otherKeyAttribute = this.Camera2StreamConfigurationMap;
        if (otherKeyAttribute != null) {
            aSN1EncodableVector.add(otherKeyAttribute);
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1OctetString getSubjectKeyIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cms.OtherKeyAttribute getOtherKeyAttribute() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static org.bouncycastle.asn1.cms.RecipientKeyIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.RecipientKeyIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.RecipientKeyIdentifier) {
            return (org.bouncycastle.asn1.cms.RecipientKeyIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.RecipientKeyIdentifier(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RecipientKeyIdentifier(byte[] bArr, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.cms.OtherKeyAttribute otherKeyAttribute) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.DEROctetString(bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.Camera2StreamConfigurationMap = otherKeyAttribute;
    }

    public RecipientKeyIdentifier(byte[] bArr) {
        this(bArr, (org.bouncycastle.asn1.ASN1GeneralizedTime) null, (org.bouncycastle.asn1.cms.OtherKeyAttribute) null);
    }

    private RecipientKeyIdentifier(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0));
        int size = aSN1Sequence.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    throw new java.lang.IllegalArgumentException("Invalid RecipientKeyIdentifier");
                }
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
                return;
            }
            if (aSN1Sequence.getObjectAt(1) instanceof org.bouncycastle.asn1.ASN1GeneralizedTime) {
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(1));
            } else {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.OtherKeyAttribute.getInstance(aSN1Sequence.getObjectAt(2));
            }
        }
    }

    public RecipientKeyIdentifier(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime, org.bouncycastle.asn1.cms.OtherKeyAttribute otherKeyAttribute) {
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1GeneralizedTime;
        this.Camera2StreamConfigurationMap = otherKeyAttribute;
    }
}
