package org.bouncycastle.jcajce.provider.config;

/* loaded from: classes17.dex */
public interface ConfigurableProvider {
    public static final java.lang.String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";
    public static final java.lang.String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";
    public static final java.lang.String DH_DEFAULT_PARAMS = "DhDefaultParams";
    public static final java.lang.String EC_IMPLICITLY_CA = "ecImplicitlyCa";
    public static final java.lang.String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
    public static final java.lang.String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";

    void addAlgorithm(java.lang.String str, java.lang.String str2);

    void addAlgorithm(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str2);

    void addAttributes(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    void addKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter);

    org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier);

    boolean hasAlgorithm(java.lang.String str, java.lang.String str2);

    void setParameter(java.lang.String str, java.lang.Object obj);
}
