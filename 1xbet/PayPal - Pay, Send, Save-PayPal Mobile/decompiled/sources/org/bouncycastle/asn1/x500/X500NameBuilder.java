package org.bouncycastle.asn1.x500;

/* loaded from: classes17.dex */
public class X500NameBuilder {
    private java.util.Vector Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x500.X500NameStyle getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.asn1.x500.X500Name build() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.x500.RDN[] rdnArr = new org.bouncycastle.asn1.x500.RDN[size];
        for (int i = 0; i != size; i++) {
            rdnArr[i] = (org.bouncycastle.asn1.x500.RDN) this.Camera2StreamConfigurationMap.elementAt(i);
        }
        return new org.bouncycastle.asn1.x500.X500Name(this.getHighSpeedVideoFpsRangesFor, rdnArr);
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addRDN(org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue) {
        this.Camera2StreamConfigurationMap.addElement(new org.bouncycastle.asn1.x500.RDN(attributeTypeAndValue));
        return this;
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addRDN(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        this.Camera2StreamConfigurationMap.addElement(new org.bouncycastle.asn1.x500.RDN(aSN1ObjectIdentifier, aSN1Encodable));
        return this;
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addRDN(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        addRDN(aSN1ObjectIdentifier, this.getHighSpeedVideoFpsRangesFor.stringToValue(aSN1ObjectIdentifier, str));
        return this;
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addMultiValuedRDN(org.bouncycastle.asn1.x500.AttributeTypeAndValue[] attributeTypeAndValueArr) {
        this.Camera2StreamConfigurationMap.addElement(new org.bouncycastle.asn1.x500.RDN(attributeTypeAndValueArr));
        return this;
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addMultiValuedRDN(org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr) {
        org.bouncycastle.asn1.x500.AttributeTypeAndValue[] attributeTypeAndValueArr = new org.bouncycastle.asn1.x500.AttributeTypeAndValue[aSN1ObjectIdentifierArr.length];
        for (int i = 0; i != aSN1ObjectIdentifierArr.length; i++) {
            attributeTypeAndValueArr[i] = new org.bouncycastle.asn1.x500.AttributeTypeAndValue(aSN1ObjectIdentifierArr[i], aSN1EncodableArr[i]);
        }
        return addMultiValuedRDN(attributeTypeAndValueArr);
    }

    public org.bouncycastle.asn1.x500.X500NameBuilder addMultiValuedRDN(org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, java.lang.String[] strArr) {
        int length = strArr.length;
        org.bouncycastle.asn1.ASN1Encodable[] aSN1EncodableArr = new org.bouncycastle.asn1.ASN1Encodable[length];
        for (int i = 0; i != length; i++) {
            aSN1EncodableArr[i] = this.getHighSpeedVideoFpsRangesFor.stringToValue(aSN1ObjectIdentifierArr[i], strArr[i]);
        }
        return addMultiValuedRDN(aSN1ObjectIdentifierArr, aSN1EncodableArr);
    }

    public X500NameBuilder(org.bouncycastle.asn1.x500.X500NameStyle x500NameStyle) {
        this.Camera2StreamConfigurationMap = new java.util.Vector();
        this.getHighSpeedVideoFpsRangesFor = x500NameStyle;
    }

    public X500NameBuilder() {
        this(org.bouncycastle.asn1.x500.style.BCStyle.INSTANCE);
    }
}
