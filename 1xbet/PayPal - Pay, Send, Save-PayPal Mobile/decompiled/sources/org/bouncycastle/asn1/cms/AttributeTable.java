package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class AttributeTable {
    private java.util.Hashtable getHighResolutionOutputSizeshNQ4ISI;

    public java.util.Hashtable toHashtable() {
        return getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.cms.Attributes toASN1Structure() {
        return new org.bouncycastle.asn1.cms.Attributes(toASN1EncodableVector());
    }

    public org.bouncycastle.asn1.ASN1EncodableVector toASN1EncodableVector() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.util.Enumeration elements = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        while (elements.hasMoreElements()) {
            java.lang.Object nextElement = elements.nextElement();
            if (nextElement instanceof java.util.Vector) {
                java.util.Enumeration elements2 = ((java.util.Vector) nextElement).elements();
                while (elements2.hasMoreElements()) {
                    aSN1EncodableVector.add(org.bouncycastle.asn1.cms.Attribute.getInstance(elements2.nextElement()));
                }
            } else {
                aSN1EncodableVector.add(org.bouncycastle.asn1.cms.Attribute.getInstance(nextElement));
            }
        }
        return aSN1EncodableVector;
    }

    public int size() {
        java.util.Enumeration elements = this.getHighResolutionOutputSizeshNQ4ISI.elements();
        int i = 0;
        while (elements.hasMoreElements()) {
            java.lang.Object nextElement = elements.nextElement();
            i = nextElement instanceof java.util.Vector ? i + ((java.util.Vector) nextElement).size() : i + 1;
        }
        return i;
    }

    public org.bouncycastle.asn1.cms.AttributeTable remove(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.cms.AttributeTable attributeTable = new org.bouncycastle.asn1.cms.AttributeTable(this.getHighResolutionOutputSizeshNQ4ISI);
        attributeTable.getHighResolutionOutputSizeshNQ4ISI.remove(aSN1ObjectIdentifier);
        return attributeTable;
    }

    public org.bouncycastle.asn1.ASN1EncodableVector getAll(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        if (obj instanceof java.util.Vector) {
            java.util.Enumeration elements = ((java.util.Vector) obj).elements();
            while (elements.hasMoreElements()) {
                aSN1EncodableVector.add((org.bouncycastle.asn1.cms.Attribute) elements.nextElement());
            }
        } else if (obj != null) {
            aSN1EncodableVector.add((org.bouncycastle.asn1.cms.Attribute) obj);
        }
        return aSN1EncodableVector;
    }

    public org.bouncycastle.asn1.cms.Attribute get(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        return obj instanceof java.util.Vector ? (org.bouncycastle.asn1.cms.Attribute) ((java.util.Vector) obj).elementAt(0) : (org.bouncycastle.asn1.cms.Attribute) obj;
    }

    public org.bouncycastle.asn1.cms.AttributeTable add(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        org.bouncycastle.asn1.cms.AttributeTable attributeTable = new org.bouncycastle.asn1.cms.AttributeTable(this.getHighResolutionOutputSizeshNQ4ISI);
        attributeTable.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier, new org.bouncycastle.asn1.cms.Attribute(aSN1ObjectIdentifier, new org.bouncycastle.asn1.DERSet(aSN1Encodable)));
        return attributeTable;
    }

    private static java.util.Hashtable getHighSpeedVideoSizes(java.util.Hashtable hashtable) {
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.asn1.cms.Attribute attribute) {
        java.util.Vector vector;
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(aSN1ObjectIdentifier);
        if (obj == null) {
            this.getHighResolutionOutputSizeshNQ4ISI.put(aSN1ObjectIdentifier, attribute);
            return;
        }
        if (obj instanceof org.bouncycastle.asn1.cms.Attribute) {
            vector = new java.util.Vector();
            vector.addElement(obj);
        } else {
            vector = (java.util.Vector) obj;
        }
        vector.addElement(attribute);
        this.getHighResolutionOutputSizeshNQ4ISI.put(aSN1ObjectIdentifier, vector);
    }

    public AttributeTable(org.bouncycastle.asn1.cms.Attributes attributes) {
        this(org.bouncycastle.asn1.ASN1Set.getInstance(attributes.toASN1Primitive()));
    }

    public AttributeTable(org.bouncycastle.asn1.cms.Attribute attribute) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
        getHighResolutionOutputSizeshNQ4ISI(attribute.getAttrType(), attribute);
    }

    public AttributeTable(org.bouncycastle.asn1.ASN1Set aSN1Set) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
        for (int i = 0; i != aSN1Set.size(); i++) {
            org.bouncycastle.asn1.cms.Attribute attribute = org.bouncycastle.asn1.cms.Attribute.getInstance(aSN1Set.getObjectAt(i));
            getHighResolutionOutputSizeshNQ4ISI(attribute.getAttrType(), attribute);
        }
    }

    public AttributeTable(org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
        for (int i = 0; i != aSN1EncodableVector.size(); i++) {
            org.bouncycastle.asn1.cms.Attribute attribute = org.bouncycastle.asn1.cms.Attribute.getInstance(aSN1EncodableVector.get(i));
            getHighResolutionOutputSizeshNQ4ISI(attribute.getAttrType(), attribute);
        }
    }

    public AttributeTable(java.util.Hashtable hashtable) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.Hashtable();
        this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoSizes(hashtable);
    }
}
