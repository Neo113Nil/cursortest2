package org.bouncycastle.cert.crmf;

/* loaded from: classes17.dex */
public interface Control {
    org.bouncycastle.asn1.ASN1ObjectIdentifier getType();

    org.bouncycastle.asn1.ASN1Encodable getValue();
}
