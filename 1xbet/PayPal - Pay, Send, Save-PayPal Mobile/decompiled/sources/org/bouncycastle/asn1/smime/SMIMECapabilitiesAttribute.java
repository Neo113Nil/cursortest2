package org.bouncycastle.asn1.smime;

/* loaded from: classes17.dex */
public class SMIMECapabilitiesAttribute extends org.bouncycastle.asn1.cms.Attribute {
    public SMIMECapabilitiesAttribute(org.bouncycastle.asn1.smime.SMIMECapabilityVector sMIMECapabilityVector) {
        super(org.bouncycastle.asn1.smime.SMIMEAttributes.smimeCapabilities, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERSequence(sMIMECapabilityVector.toASN1EncodableVector())));
    }
}
