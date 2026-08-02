package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public class X500Name extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private static org.bouncycastle.asn1.x500.X500NameStyle getHighSpeedVideoSizes = org.bouncycastle.asn1.x500.style.BCStyle.INSTANCE;
    private org.bouncycastle.asn1.x500.RDN[] Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.DERSequence getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x500.X500NameStyle getInputFormats;

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getAttributeTypes() {
        int length = this.Camera2StreamConfigurationMap.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.Camera2StreamConfigurationMap[i2].size();
        }
        org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[i];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            org.bouncycastle.asn1.x500.RDN rdn = this.Camera2StreamConfigurationMap[i4];
            int size = rdn.Camera2StreamConfigurationMap.size();
            for (int i5 = 0; i5 < size; i5++) {
                aSN1ObjectIdentifierArr[i3 + i5] = org.bouncycastle.asn1.x500.AttributeTypeAndValue.getInstance(rdn.Camera2StreamConfigurationMap.getObjectAt(i5)).getType();
            }
            i3 += size;
        }
        return aSN1ObjectIdentifierArr;
    }

    public org.bouncycastle.asn1.x500.RDN[] getRDNs(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int length = this.Camera2StreamConfigurationMap.length;
        org.bouncycastle.asn1.x500.RDN[] rdnArr = new org.bouncycastle.asn1.x500.RDN[length];
        int i = 0;
        int i2 = 0;
        while (true) {
            org.bouncycastle.asn1.x500.RDN[] rdnArr2 = this.Camera2StreamConfigurationMap;
            if (i == rdnArr2.length) {
                break;
            }
            org.bouncycastle.asn1.x500.RDN rdn = rdnArr2[i];
            int size = rdn.Camera2StreamConfigurationMap.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (org.bouncycastle.asn1.x500.AttributeTypeAndValue.getInstance(rdn.Camera2StreamConfigurationMap.getObjectAt(i3)).getType().equals((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier)) {
                    rdnArr[i2] = rdn;
                    i2++;
                    break;
                }
                i3++;
            }
            i++;
        }
        if (i2 >= length) {
            return rdnArr;
        }
        org.bouncycastle.asn1.x500.RDN[] rdnArr3 = new org.bouncycastle.asn1.x500.RDN[i2];
        java.lang.System.arraycopy(rdnArr, 0, rdnArr3, 0, i2);
        return rdnArr3;
    }

    public java.lang.String toString() {
        return this.getInputFormats.toString(this);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRanges;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        int calculateHashCode = this.getInputFormats.calculateHashCode(this);
        this.getHighSpeedVideoFpsRanges = calculateHashCode;
        return calculateHashCode;
    }

    public org.bouncycastle.asn1.x500.RDN[] getRDNs() {
        return (org.bouncycastle.asn1.x500.RDN[]) this.Camera2StreamConfigurationMap.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.bouncycastle.asn1.x500.X500Name) && !(obj instanceof org.bouncycastle.asn1.ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.getInputFormats.areEqual(this, new org.bouncycastle.asn1.x500.X500Name(org.bouncycastle.asn1.ASN1Sequence.getInstance(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive())));
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static void setDefaultStyle(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle) {
        if (x500NameStyle == null) {
            throw new java.lang.NullPointerException("cannot set style to null");
        }
        getHighSpeedVideoSizes = x500NameStyle;
    }

    public static org.bouncycastle.asn1.x500.X500Name getInstance(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x500.X500Name) {
            return new org.bouncycastle.asn1.x500.X500Name(x500NameStyle, (org.bouncycastle.asn1.x500.X500Name) obj);
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x500.X500Name(x500NameStyle, org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x500.X500Name getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public static org.bouncycastle.asn1.x500.X500Name getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x500.X500Name) {
            return (org.bouncycastle.asn1.x500.X500Name) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x500.X500Name(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x500.X500NameStyle getDefaultStyle() {
        return getHighSpeedVideoSizes;
    }

    public X500Name(org.bouncycastle.asn1.x500.RDN[] rdnArr) {
        this(getHighSpeedVideoSizes, rdnArr);
    }

    public X500Name(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, org.bouncycastle.asn1.x500.RDN[] rdnArr) {
        this.getInputFormats = x500NameStyle;
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.x500.RDN[]) rdnArr.clone();
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap);
    }

    public X500Name(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getInputFormats = x500NameStyle;
        this.Camera2StreamConfigurationMap = x500Name.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRangesFor = x500Name.getHighSpeedVideoFpsRangesFor;
    }

    private X500Name(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getInputFormats = x500NameStyle;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.x500.RDN[aSN1Sequence.size()];
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        boolean z = true;
        int i = 0;
        while (objects.hasMoreElements()) {
            java.lang.Object nextElement = objects.nextElement();
            org.bouncycastle.asn1.x500.RDN rdn = org.bouncycastle.asn1.x500.RDN.getInstance(nextElement);
            z &= rdn == nextElement;
            this.Camera2StreamConfigurationMap[i] = rdn;
            i++;
        }
        this.getHighSpeedVideoFpsRangesFor = z ? org.bouncycastle.asn1.DERSequence.convert(aSN1Sequence) : new org.bouncycastle.asn1.DERSequence(this.Camera2StreamConfigurationMap);
    }

    public X500Name(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle, java.lang.String str) {
        this(x500NameStyle.fromString(str));
        this.getInputFormats = x500NameStyle;
    }

    private X500Name(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this(getHighSpeedVideoSizes, aSN1Sequence);
    }

    public X500Name(java.lang.String str) {
        this(getHighSpeedVideoSizes, str);
    }
}
