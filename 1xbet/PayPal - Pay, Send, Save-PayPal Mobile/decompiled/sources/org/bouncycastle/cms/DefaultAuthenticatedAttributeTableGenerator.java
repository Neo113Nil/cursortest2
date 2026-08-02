package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class DefaultAuthenticatedAttributeTableGenerator implements org.bouncycastle.cms.CMSAttributeTableGenerator {
    private final java.util.Hashtable Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
    public org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map map) {
        return new org.bouncycastle.asn1.cms.AttributeTable(createStandardAttributeTable(map));
    }

    protected java.util.Hashtable createStandardAttributeTable(java.util.Map map) {
        java.util.Hashtable hashtable = new java.util.Hashtable();
        java.util.Enumeration keys = this.Camera2StreamConfigurationMap.keys();
        while (keys.hasMoreElements()) {
            java.lang.Object nextElement = keys.nextElement();
            hashtable.put(nextElement, this.Camera2StreamConfigurationMap.get(nextElement));
        }
        if (!hashtable.containsKey(org.bouncycastle.asn1.cms.CMSAttributes.contentType)) {
            org.bouncycastle.asn1.cms.Attribute attribute = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.contentType, new org.bouncycastle.asn1.DERSet(org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE))));
            hashtable.put(attribute.getAttrType(), attribute);
        }
        if (!hashtable.containsKey(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest)) {
            org.bouncycastle.asn1.cms.Attribute attribute2 = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.messageDigest, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DEROctetString((byte[]) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST))));
            hashtable.put(attribute2.getAttrType(), attribute2);
        }
        if (!hashtable.contains(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect)) {
            org.bouncycastle.asn1.cms.Attribute attribute3 = new org.bouncycastle.asn1.cms.Attribute(org.bouncycastle.asn1.cms.CMSAttributes.cmsAlgorithmProtect, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.cms.CMSAlgorithmProtection((org.bouncycastle.asn1.x509.AlgorithmIdentifier) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.DIGEST_ALGORITHM_IDENTIFIER), 2, (org.bouncycastle.asn1.x509.AlgorithmIdentifier) map.get(org.bouncycastle.cms.CMSAttributeTableGenerator.MAC_ALGORITHM_IDENTIFIER))));
            hashtable.put(attribute3.getAttrType(), attribute3);
        }
        return hashtable;
    }

    public DefaultAuthenticatedAttributeTableGenerator(org.bouncycastle.asn1.cms.AttributeTable attributeTable) {
        this.Camera2StreamConfigurationMap = attributeTable != null ? attributeTable.toHashtable() : new java.util.Hashtable();
    }

    public DefaultAuthenticatedAttributeTableGenerator() {
        this.Camera2StreamConfigurationMap = new java.util.Hashtable();
    }
}
