package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class CMSAuthEnvelopedGenerator extends org.bouncycastle.cms.CMSEnvelopedGenerator {
    protected org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo;
    final java.util.List getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    protected org.bouncycastle.cms.CMSAttributeTableGenerator authAttrsGenerator = null;
    protected org.bouncycastle.cms.CMSAttributeTableGenerator unauthAttrsGenerator = null;

    public void setUnauthenticatedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.unauthAttrsGenerator = cMSAttributeTableGenerator;
    }

    @Override // org.bouncycastle.cms.CMSEnvelopedGenerator
    public void setOriginatorInfo(org.bouncycastle.cms.OriginatorInformation originatorInformation) {
        this.originatorInfo = originatorInformation.toASN1Structure();
    }

    public void setAuthenticatedAttributeGenerator(org.bouncycastle.cms.CMSAttributeTableGenerator cMSAttributeTableGenerator) {
        this.authAttrsGenerator = cMSAttributeTableGenerator;
    }

    @Override // org.bouncycastle.cms.CMSEnvelopedGenerator
    public void addRecipientInfoGenerator(org.bouncycastle.cms.RecipientInfoGenerator recipientInfoGenerator) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(recipientInfoGenerator);
    }

    protected CMSAuthEnvelopedGenerator() {
    }
}
