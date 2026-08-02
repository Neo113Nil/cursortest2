package org.bouncycastle.asn1.util;

/* loaded from: classes17.dex */
public class DERDump extends org.bouncycastle.asn1.util.ASN1Dump {
    public static java.lang.String dumpAsString(org.bouncycastle.asn1.ASN1Primitive aSN1Primitive) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        getHighSpeedVideoSizes("", false, aSN1Primitive, stringBuffer);
        return stringBuffer.toString();
    }

    public static java.lang.String dumpAsString(org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        return dumpAsString(aSN1Encodable.toASN1Primitive());
    }
}
