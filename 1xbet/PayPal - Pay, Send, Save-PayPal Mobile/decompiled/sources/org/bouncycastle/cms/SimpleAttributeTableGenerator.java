package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SimpleAttributeTableGenerator implements org.bouncycastle.cms.CMSAttributeTableGenerator {
    private final org.bouncycastle.asn1.cms.AttributeTable getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
    public org.bouncycastle.asn1.cms.AttributeTable getAttributes(java.util.Map map) {
        return this.getHighSpeedVideoFpsRanges;
    }

    public SimpleAttributeTableGenerator(org.bouncycastle.asn1.cms.AttributeTable attributeTable) {
        this.getHighSpeedVideoFpsRanges = attributeTable;
    }
}
