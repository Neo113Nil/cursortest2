package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class PreSharedKeyRecipientInfo extends org.bouncycastle.oer.its.HashedId {
    public static org.bouncycastle.oer.its.PreSharedKeyRecipientInfo getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.oer.its.PreSharedKeyRecipientInfo ? (org.bouncycastle.oer.its.PreSharedKeyRecipientInfo) obj : new org.bouncycastle.oer.its.PreSharedKeyRecipientInfo(org.bouncycastle.asn1.ASN1OctetString.getInstance(obj).getOctets());
    }

    public PreSharedKeyRecipientInfo(byte[] bArr) {
        super(bArr);
    }
}
