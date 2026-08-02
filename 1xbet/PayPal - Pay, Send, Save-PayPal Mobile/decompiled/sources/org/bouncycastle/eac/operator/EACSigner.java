package org.bouncycastle.eac.operator;

/* loaded from: classes17.dex */
public interface EACSigner {
    java.io.OutputStream getOutputStream();

    byte[] getSignature();

    org.bouncycastle.asn1.ASN1ObjectIdentifier getUsageIdentifier();
}
