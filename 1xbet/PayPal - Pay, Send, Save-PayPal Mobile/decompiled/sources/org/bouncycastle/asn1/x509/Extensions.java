package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Extensions extends org.bouncycastle.asn1.ASN1Object {
    private java.util.Hashtable Camera2StreamConfigurationMap;
    private java.util.Vector getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(this.getHighSpeedVideoFpsRanges.size());
        java.util.Enumeration elements = this.getHighSpeedVideoFpsRanges.elements();
        while (elements.hasMoreElements()) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get((org.bouncycastle.asn1.ASN1ObjectIdentifier) elements.nextElement()));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.util.Enumeration oids() {
        return this.getHighSpeedVideoFpsRanges.elements();
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return getHighResolutionOutputSizeshNQ4ISI(false);
    }

    public org.bouncycastle.asn1.ASN1Encodable getExtensionParsedValue(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.x509.Extension extension = getExtension(aSN1ObjectIdentifier);
        if (extension != null) {
            return extension.getParsedValue();
        }
        return null;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getExtensionOIDs() {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    public org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get(aSN1ObjectIdentifier);
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return getHighResolutionOutputSizeshNQ4ISI(true);
    }

    public boolean equivalent(org.bouncycastle.asn1.x509.Extensions extensions) {
        if (this.Camera2StreamConfigurationMap.size() != extensions.Camera2StreamConfigurationMap.size()) {
            return false;
        }
        java.util.Enumeration keys = this.Camera2StreamConfigurationMap.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            if (!this.Camera2StreamConfigurationMap.get(nextElement).equals(extensions.Camera2StreamConfigurationMap.get(nextElement))) {
                return false;
            }
        }
        return true;
    }

    private static org.bouncycastle.asn1.ASN1ObjectIdentifier[] getHighSpeedVideoFpsRanges(java.util.Vector vector) {
        int size = vector.size();
        org.bouncycastle.asn1.ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new org.bouncycastle.asn1.ASN1ObjectIdentifier[size];
        for (int i = 0; i != size; i++) {
            aSN1ObjectIdentifierArr[i] = (org.bouncycastle.asn1.ASN1ObjectIdentifier) vector.elementAt(i);
        }
        return aSN1ObjectIdentifierArr;
    }

    public static org.bouncycastle.asn1.x509.Extensions getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.Extensions getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Extensions) {
            return (org.bouncycastle.asn1.x509.Extensions) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Extensions(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.ASN1Encodable getExtensionParsedValue(org.bouncycastle.asn1.x509.Extensions extensions, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtensionParsedValue(aSN1ObjectIdentifier);
    }

    private org.bouncycastle.asn1.ASN1ObjectIdentifier[] getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        java.util.Vector vector = new java.util.Vector();
        for (int i = 0; i != this.getHighSpeedVideoFpsRanges.size(); i++) {
            java.lang.Object elementAt = this.getHighSpeedVideoFpsRanges.elementAt(i);
            if (((org.bouncycastle.asn1.x509.Extension) this.Camera2StreamConfigurationMap.get(elementAt)).isCritical() == z) {
                vector.addElement(elementAt);
            }
        }
        return getHighSpeedVideoFpsRanges(vector);
    }

    public static org.bouncycastle.asn1.x509.Extension getExtension(org.bouncycastle.asn1.x509.Extensions extensions, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (extensions == null) {
            return null;
        }
        return extensions.getExtension(aSN1ObjectIdentifier);
    }

    public Extensions(org.bouncycastle.asn1.x509.Extension[] extensionArr) {
        this.Camera2StreamConfigurationMap = new java.util.Hashtable();
        this.getHighSpeedVideoFpsRanges = new java.util.Vector();
        for (int i = 0; i != extensionArr.length; i++) {
            org.bouncycastle.asn1.x509.Extension extension = extensionArr[i];
            this.getHighSpeedVideoFpsRanges.addElement(extension.getExtnId());
            this.Camera2StreamConfigurationMap.put(extension.getExtnId(), extension);
        }
    }

    public Extensions(org.bouncycastle.asn1.x509.Extension extension) {
        this.Camera2StreamConfigurationMap = new java.util.Hashtable();
        java.util.Vector vector = new java.util.Vector();
        this.getHighSpeedVideoFpsRanges = vector;
        vector.addElement(extension.getExtnId());
        this.Camera2StreamConfigurationMap.put(extension.getExtnId(), extension);
    }

    private Extensions(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = new java.util.Hashtable();
        this.getHighSpeedVideoFpsRanges = new java.util.Vector();
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.x509.Extension extension = org.bouncycastle.asn1.x509.Extension.getInstance(objects.nextElement());
            if (this.Camera2StreamConfigurationMap.containsKey(extension.getExtnId())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("repeated extension found: ");
                sb.append(extension.getExtnId());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.Camera2StreamConfigurationMap.put(extension.getExtnId(), extension);
            this.getHighSpeedVideoFpsRanges.addElement(extension.getExtnId());
        }
    }
}
