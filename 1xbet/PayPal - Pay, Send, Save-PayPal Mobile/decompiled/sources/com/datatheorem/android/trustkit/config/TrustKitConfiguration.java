package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
public class TrustKitConfiguration {
    private final boolean Camera2StreamConfigurationMap;
    private final java.util.Set<java.security.cert.Certificate> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<com.datatheorem.android.trustkit.config.DomainPinningPolicy> getHighSpeedVideoSizes;

    public static com.datatheorem.android.trustkit.config.TrustKitConfiguration fromXmlPolicy(android.content.Context context, org.xmlpull.v1.XmlPullParser xmlPullParser) throws java.security.cert.CertificateException, org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return com.datatheorem.android.trustkit.config.TrustKitConfigurationParser.getHighSpeedVideoSizes(context, xmlPullParser);
    }

    protected TrustKitConfiguration(java.util.Set<com.datatheorem.android.trustkit.config.DomainPinningPolicy> set) {
        this(set, false, null);
    }

    protected TrustKitConfiguration(java.util.Set<com.datatheorem.android.trustkit.config.DomainPinningPolicy> set, boolean z, java.util.Set<java.security.cert.Certificate> set2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (com.datatheorem.android.trustkit.config.DomainPinningPolicy domainPinningPolicy : set) {
            if (hashSet.contains(domainPinningPolicy.getHostname())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Policy contains the same domain defined twice: ");
                sb.append(domainPinningPolicy.getHostname());
                throw new com.datatheorem.android.trustkit.config.ConfigurationException(sb.toString());
            }
            hashSet.add(domainPinningPolicy.getHostname());
        }
        this.getHighSpeedVideoSizes = set;
        this.Camera2StreamConfigurationMap = z;
        this.getHighResolutionOutputSizeshNQ4ISI = set2;
    }

    public boolean shouldOverridePins() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.util.Set<java.security.cert.Certificate> getDebugCaCertificates() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Set<com.datatheorem.android.trustkit.config.DomainPinningPolicy> getAllPolicies() {
        return this.getHighSpeedVideoSizes;
    }

    public com.datatheorem.android.trustkit.config.DomainPinningPolicy getPolicyForHostname(java.lang.String str) {
        if (!com.datatheorem.android.trustkit.config.DomainValidator.getHighSpeedVideoSizes().getHighSpeedVideoFpsRanges(str)) {
            throw new java.lang.IllegalArgumentException("Invalid domain supplied: ".concat(java.lang.String.valueOf(str)));
        }
        com.datatheorem.android.trustkit.config.DomainPinningPolicy domainPinningPolicy = null;
        for (com.datatheorem.android.trustkit.config.DomainPinningPolicy domainPinningPolicy2 : this.getHighSpeedVideoSizes) {
            if (domainPinningPolicy2.getHostname().equals(str)) {
                return domainPinningPolicy2;
            }
            if (domainPinningPolicy2.shouldIncludeSubdomains()) {
                if (str.endsWith(domainPinningPolicy2.getHostname()) && str.charAt((str.length() - r3.length()) - 1) == '.' && (domainPinningPolicy == null || domainPinningPolicy2.getHostname().length() > domainPinningPolicy.getHostname().length())) {
                    domainPinningPolicy = domainPinningPolicy2;
                }
            }
        }
        return domainPinningPolicy;
    }
}
