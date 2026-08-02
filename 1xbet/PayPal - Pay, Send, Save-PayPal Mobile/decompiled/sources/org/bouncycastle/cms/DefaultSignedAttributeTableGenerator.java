package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class DefaultSignedAttributeTableGenerator implements org.bouncycastle.cms.CMSAttributeTableGenerator {
    private final java.util.Hashtable getHighSpeedVideoFpsRanges;

    protected java.util.Hashtable createStandardAttributeTable(java.util.Map map) {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier;
        java.util.Hashtable hashtable = this.getHighSpeedVideoFpsRanges;
        java.util.Hashtable hashtable2 = new java.util.Hashtable();
        java.util.Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        if (!hashtable2.containsKey(org.bouncycastle.asn1.cms.CMSAttributes.contentType) && (aSN1ObjectIdentifier = org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE))) != null) {
            org.bouncycastle.asn1.cms.Attribute attribute = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.contentType, new org.bouncycastle.asn1.DERSet(aSN1ObjectIdentifier));
            hashtable2.put(attribute.getAttrType(), attribute);
        }
        if (!hashtable2.containsKey(org.bouncycastle.asn1.cms.CMSAttributes.signingTime)) {
            org.bouncycastle.asn1.cms.Attribute attribute2 = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.signingTime, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.cms.Time(new java.util.Date())));
            hashtable2.put(attribute2.getAttrType(), attribute2);
        }
        if (!hashtable2.containsKey(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest)) {
            org.bouncycastle.asn1.cms.Attribute attribute3 = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DEROctetString((byte[]) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST))));
            hashtable2.put(attribute3.getAttrType(), attribute3);
        }
        if (!hashtable2.contains(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect)) {
            org.bouncycastle.asn1.cms.Attribute attribute4 = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.cms.CMSAlgorithmProtection((org.bouncycastle.asn1.x509.AlgorithmIdentifier) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER), 1, (org.bouncycastle.asn1.x509.AlgorithmIdentifier) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.SIGNATURE_ALGORITHM_IDENTIFIER))));
            hashtable2.put(attribute4.getAttrType(), attribute4);
        }
        return hashtable2;
    }

    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
    public org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map map) {
        return new org.bouncycastle.asn1.cms.AttributeTable(createStandardAttributeTable(map));
    }

    public DefaultSignedAttributeTableGenerator(org.bouncycastle.asn1.cms.AttributeTable attributeTable) {
        this.getHighSpeedVideoFpsRanges = attributeTable != null ? attributeTable.toHashtable() : new java.util.Hashtable();
    }

    public DefaultSignedAttributeTableGenerator() {
        this.getHighSpeedVideoFpsRanges = new java.util.Hashtable();
    }
}
