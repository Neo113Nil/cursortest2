package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public interface RecipientInfoGenerator {
    org.bouncycastle.asn1.cms.RecipientInfo generate(org.bouncycastle.operator.GenericKey genericKey) throws org.bouncycastle.cms.CMSException;
}
