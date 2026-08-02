package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KEKRecipientId extends org.bouncycastle.cms.RecipientId {
    private byte[] Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        if (obj instanceof byte[]) {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, (byte[]) obj);
        }
        if (obj instanceof org.bouncycastle.cms.KEKRecipientInformation) {
            return ((org.bouncycastle.cms.KEKRecipientInformation) obj).getRID().equals(this);
        }
        return false;
    }

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    public byte[] getKeyIdentifier() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cms.KEKRecipientId) {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, ((org.bouncycastle.cms.KEKRecipientId) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    @Override // org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.KEKRecipientId(this.Camera2StreamConfigurationMap);
    }

    public KEKRecipientId(byte[] bArr) {
        super(1);
        this.Camera2StreamConfigurationMap = bArr;
    }
}
