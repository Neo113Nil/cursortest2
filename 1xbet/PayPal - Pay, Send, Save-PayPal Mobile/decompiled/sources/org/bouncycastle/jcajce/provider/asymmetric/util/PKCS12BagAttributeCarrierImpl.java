package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class PKCS12BagAttributeCarrierImpl implements org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier {
    private java.util.Vector getHighSpeedVideoFpsRanges;
    private java.util.Hashtable getHighSpeedVideoSizes;

    public void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.lang.Object byteArray;
        if (this.getHighSpeedVideoFpsRanges.size() == 0) {
            objectOutputStream.writeObject(new java.util.Hashtable());
            byteArray = new java.util.Vector();
        } else {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            org.bouncycastle.asn1.ASN1OutputStream create = org.bouncycastle.asn1.ASN1OutputStream.create(byteArrayOutputStream);
            java.util.Enumeration bagAttributeKeys = getBagAttributeKeys();
            while (bagAttributeKeys.hasMoreElements()) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(bagAttributeKeys.nextElement());
                create.writeObject((org.bouncycastle.asn1.ASN1Primitive) aSN1ObjectIdentifier);
                create.writeObject((org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes.get(aSN1ObjectIdentifier));
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        objectOutputStream.writeObject(byteArray);
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        if (this.getHighSpeedVideoSizes.containsKey(aSN1ObjectIdentifier)) {
            this.getHighSpeedVideoSizes.put(aSN1ObjectIdentifier, aSN1Encodable);
        } else {
            this.getHighSpeedVideoSizes.put(aSN1ObjectIdentifier, aSN1Encodable);
            this.getHighSpeedVideoFpsRanges.addElement(aSN1ObjectIdentifier);
        }
    }

    public void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        java.lang.Object readObject = objectInputStream.readObject();
        if (readObject instanceof java.util.Hashtable) {
            this.getHighSpeedVideoSizes = (java.util.Hashtable) readObject;
            this.getHighSpeedVideoFpsRanges = (java.util.Vector) objectInputStream.readObject();
        } else {
            org.bouncycastle.asn1.ASN1InputStream aSN1InputStream = new org.bouncycastle.asn1.ASN1InputStream((byte[]) readObject);
            while (true) {
                org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = (org.bouncycastle.asn1.ASN1ObjectIdentifier) aSN1InputStream.readObject();
                if (aSN1ObjectIdentifier == null) {
                    return;
                } else {
                    setBagAttribute(aSN1ObjectIdentifier, aSN1InputStream.readObject());
                }
            }
        }
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public java.util.Enumeration getBagAttributeKeys() {
        return this.getHighSpeedVideoFpsRanges.elements();
    }

    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public org.bouncycastle.asn1.ASN1Encodable getBagAttribute(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoSizes.get(aSN1ObjectIdentifier);
    }

    private PKCS12BagAttributeCarrierImpl(java.util.Hashtable hashtable, java.util.Vector vector) {
        this.getHighSpeedVideoSizes = hashtable;
        this.getHighSpeedVideoFpsRanges = vector;
    }

    public PKCS12BagAttributeCarrierImpl() {
        this(new java.util.Hashtable(), new java.util.Vector());
    }
}
