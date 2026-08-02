package org.bouncycastle.asn1.microsoft;

/* loaded from: classes17.dex */
public interface MicrosoftObjectIdentifiers {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoft;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftAppPolicies;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftCaVersion;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftCertTemplateV1;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftCertTemplateV2;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftCrlNextPublish;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier microsoftPrevCaCertHash;

    static {
        org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.4.1.311");
        microsoft = aSN1ObjectIdentifier;
        microsoftCertTemplateV1 = aSN1ObjectIdentifier.branch("20.2");
        microsoftCaVersion = aSN1ObjectIdentifier.branch("21.1");
        microsoftPrevCaCertHash = aSN1ObjectIdentifier.branch("21.2");
        microsoftCrlNextPublish = aSN1ObjectIdentifier.branch("21.4");
        microsoftCertTemplateV2 = aSN1ObjectIdentifier.branch("21.7");
        microsoftAppPolicies = aSN1ObjectIdentifier.branch("21.10");
    }
}
