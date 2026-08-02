package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class IetfAttrSyntax extends org.bouncycastle.asn1.ASN1Object {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    org.bouncycastle.asn1.x509.GeneralNames Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.util.Vector getHighSpeedVideoFpsRanges = new java.util.Vector();

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.Camera2StreamConfigurationMap;
        if (generalNames != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(0, generalNames));
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector2 = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighSpeedVideoFpsRanges.size());
        java.util.Enumeration elements = this.getHighSpeedVideoFpsRanges.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector2.add((org.bouncycastle.asn1.ASN1Encodable) elements.nextElement());
        }
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector2));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.lang.Object[] getValues() {
        int i = 0;
        if (getValueType() == 1) {
            int size = this.getHighSpeedVideoFpsRanges.size();
            org.bouncycastle.asn1.ASN1OctetString[] aSN1OctetStringArr = new org.bouncycastle.asn1.ASN1OctetString[size];
            while (i != size) {
                aSN1OctetStringArr[i] = (org.bouncycastle.asn1.ASN1OctetString) this.getHighSpeedVideoFpsRanges.elementAt(i);
                i++;
            }
            return aSN1OctetStringArr;
        }
        if (getValueType() == 2) {
            int size2 = this.getHighSpeedVideoFpsRanges.size();
            org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[size2];
            while (i != size2) {
                aSN1ObjectIdentifierArr[i] = (org.bouncycastle.asn1.ASN1ObjectIdentifier) this.getHighSpeedVideoFpsRanges.elementAt(i);
                i++;
            }
            return aSN1ObjectIdentifierArr;
        }
        int size3 = this.getHighSpeedVideoFpsRanges.size();
        org.bouncycastle.asn1.ASN1UTF8String[] aSN1UTF8StringArr = new org.bouncycastle.asn1.ASN1UTF8String[size3];
        while (i != size3) {
            aSN1UTF8StringArr[i] = (org.bouncycastle.asn1.ASN1UTF8String) this.getHighSpeedVideoFpsRanges.elementAt(i);
            i++;
        }
        return aSN1UTF8StringArr;
    }

    public int getValueType() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getPolicyAuthority() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.x509.IetfAttrSyntax getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.IetfAttrSyntax) {
            return (org.bouncycastle.asn1.x509.IetfAttrSyntax) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.IetfAttrSyntax(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private IetfAttrSyntax(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        org.bouncycastle.asn1.x509.GeneralNames generalNames;
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        int i2 = 0;
        if (!(aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
            generalNames = aSN1Sequence.size() == 2 ? org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1Sequence.getObjectAt(0)) : generalNames;
            if (aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1Sequence) {
                throw new java.lang.IllegalArgumentException("Non-IetfAttrSyntax encoding");
            }
            java.util.Enumeration objects = ((org.bouncycastle.asn1.ASN1Sequence) aSN1Sequence.getObjectAt(i2)).getObjects();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) objects.nextElement();
                if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1ObjectIdentifier) {
                    i = 2;
                } else if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1UTF8String) {
                    i = 3;
                } else {
                    if (!(aSN1Primitive instanceof org.bouncycastle.asn1.DEROctetString)) {
                        throw new java.lang.IllegalArgumentException("Bad value type encoding IetfAttrSyntax");
                    }
                    i = 1;
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
                    this.getHighResolutionOutputSizeshNQ4ISI = i;
                }
                if (i != this.getHighResolutionOutputSizeshNQ4ISI) {
                    throw new java.lang.IllegalArgumentException("Mix of value types in IetfAttrSyntax");
                }
                this.getHighSpeedVideoFpsRanges.addElement(aSN1Primitive);
            }
            return;
        }
        generalNames = org.bouncycastle.asn1.x509.GeneralNames.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(0), false);
        this.Camera2StreamConfigurationMap = generalNames;
        i2 = 1;
        if (aSN1Sequence.getObjectAt(i2) instanceof org.bouncycastle.asn1.ASN1Sequence) {
        }
    }
}
