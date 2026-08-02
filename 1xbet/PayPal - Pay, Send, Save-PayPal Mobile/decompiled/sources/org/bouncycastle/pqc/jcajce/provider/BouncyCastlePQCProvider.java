package org.bouncycastle.pqc.jcajce.provider;

/* loaded from: classes17.dex */
public class BouncyCastlePQCProvider extends java.security.Provider implements org.bouncycastle.jcajce.provider.config.ConfigurableProvider {
    public static final org.bouncycastle.jcajce.provider.config.ProviderConfiguration CONFIGURATION = null;
    private static java.lang.String Camera2StreamConfigurationMap = "BouncyCastle Post-Quantum Security Provider v1.70";
    public static java.lang.String PROVIDER_NAME = "BCPQC";
    private static final java.util.Map getHighSpeedVideoFpsRanges = new java.util.HashMap();
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    static /* synthetic */ void Camera2StreamConfigurationMap(org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider bouncyCastlePQCProvider) {
        java.lang.String[] strArr = getHighSpeedVideoFpsRangesFor;
        for (int i = 0; i != strArr.length; i++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("org.bouncycastle.pqc.jcajce.provider.");
            sb.append(strArr[i]);
            sb.append("$Mappings");
            java.lang.Class highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.class, sb.toString());
            if (highResolutionOutputSizeshNQ4ISI != null) {
                try {
                    ((org.bouncycastle.jcajce.provider.util.AlgorithmProvider) highResolutionOutputSizeshNQ4ISI.newInstance()).configure(bouncyCastlePQCProvider);
                } catch (java.lang.Exception e) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot create instance of ");
                    sb2.append("org.bouncycastle.pqc.jcajce.provider.");
                    sb2.append(strArr[i]);
                    sb2.append("$Mappings : ");
                    sb2.append(e);
                    throw new java.lang.InternalError(sb2.toString());
                }
            }
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(java.lang.String str, java.lang.Object obj) {
        synchronized (CONFIGURATION) {
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        if (containsKey(sb.toString())) {
            return true;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.");
        sb2.append(str);
        sb2.append(".");
        sb2.append(str2);
        return containsKey(sb2.toString());
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) getHighSpeedVideoFpsRanges.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        java.util.Map map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.lang.String str2 : map.keySet()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            java.lang.String obj = sb.toString();
            if (containsKey(obj)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("duplicate provider attribute key (");
                sb2.append(obj);
                sb2.append(") found");
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            put(obj, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        if (!containsKey(sb.toString())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("primary key (");
            sb2.append(str);
            sb2.append(".");
            sb2.append(str2);
            sb2.append(") not found");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append(".");
        sb3.append(aSN1ObjectIdentifier);
        addAlgorithm(sb3.toString(), str2);
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append(".OID.");
        sb4.append(aSN1ObjectIdentifier);
        addAlgorithm(sb4.toString(), str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(java.lang.String str, java.lang.String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("duplicate provider key (");
        sb.append(str);
        sb.append(") found");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private static java.lang.Class getHighResolutionOutputSizeshNQ4ISI(java.lang.Class cls, final java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (java.lang.Class) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.2
                @Override // java.security.PrivilegedAction
                public final java.lang.Object run() {
                    try {
                        return java.lang.Class.forName(str);
                    } catch (java.lang.Exception unused) {
                        return null;
                    }
                }
            });
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static java.security.PublicKey getPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        return highSpeedVideoFpsRanges.generatePublic(subjectPublicKeyInfo);
    }

    public static java.security.PrivateKey getPrivateKey(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        return highSpeedVideoFpsRanges.generatePrivate(privateKeyInfo);
    }

    private static org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        java.util.Map map = getHighSpeedVideoFpsRanges;
        synchronized (map) {
            asymmetricKeyInfoConverter = (org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter) map.get(aSN1ObjectIdentifier);
        }
        return asymmetricKeyInfoConverter;
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.7d, Camera2StreamConfigurationMap);
        java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.1
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.Camera2StreamConfigurationMap(org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider.this);
                return null;
            }
        });
    }
}
