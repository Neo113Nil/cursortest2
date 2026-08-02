package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class PasswordRecipientId extends org.bouncycastle.cms.RecipientId {
    public int hashCode() {
        return 3;
    }

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.cms.PasswordRecipientInformation;
    }

    public boolean equals(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.cms.PasswordRecipientId;
    }

    @Override // org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.PasswordRecipientId();
    }

    public PasswordRecipientId() {
        super(3);
    }
}
