package org.bouncycastle.est.jcajce;

/* loaded from: classes17.dex */
public class JsseDefaultHostnameAuthorizer implements org.bouncycastle.est.jcajce.JsseHostnameAuthorizer {
    private static java.util.logging.Logger Camera2StreamConfigurationMap = java.util.logging.Logger.getLogger(org.bouncycastle.est.jcajce.JsseDefaultHostnameAuthorizer.class.getName());
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public boolean verify(java.lang.String str, java.security.cert.X509Certificate x509Certificate) throws java.io.IOException {
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                if (x509Certificate.getSubjectX500Principal() == null) {
                    return false;
                }
                org.bouncycastle.asn1.x500.RDN[] rDNs = org.bouncycastle.asn1.x500.X500Name.getInstance(x509Certificate.getSubjectX500Principal().getEncoded()).getRDNs();
                for (int length = rDNs.length - 1; length >= 0; length--) {
                    org.bouncycastle.asn1.x500.AttributeTypeAndValue[] typesAndValues = rDNs[length].getTypesAndValues();
                    for (int i = 0; i != typesAndValues.length; i++) {
                        org.bouncycastle.asn1.x500.AttributeTypeAndValue attributeTypeAndValue = typesAndValues[i];
                        if (attributeTypeAndValue.getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.x500.style.BCStyle.CN)) {
                            return isValidNameMatch(str, attributeTypeAndValue.getValue().toString(), this.getHighSpeedVideoFpsRangesFor);
                        }
                    }
                }
                return false;
            }
            for (java.util.List<?> list : subjectAlternativeNames) {
                int intValue = ((java.lang.Number) list.get(0)).intValue();
                if (intValue == 2) {
                    if (isValidNameMatch(str, list.get(1).toString(), this.getHighSpeedVideoFpsRangesFor)) {
                        return true;
                    }
                } else if (intValue == 7) {
                    if (java.net.InetAddress.getByName(str).equals(java.net.InetAddress.getByName(list.get(1).toString()))) {
                        return true;
                    }
                } else if (Camera2StreamConfigurationMap.isLoggable(java.util.logging.Level.INFO)) {
                    java.lang.String hexString = list.get(1) instanceof byte[] ? org.bouncycastle.util.encoders.Hex.toHexString((byte[]) list.get(1)) : list.get(1).toString();
                    java.util.logging.Logger logger = Camera2StreamConfigurationMap;
                    java.util.logging.Level level = java.util.logging.Level.INFO;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append("ignoring type ");
                    sb.append(intValue);
                    sb.append(" value = ");
                    sb.append(hexString);
                    logger.log(level, sb.toString());
                }
            }
            return false;
        } catch (java.lang.Exception e) {
            throw new org.bouncycastle.est.ESTException(e.getMessage(), e);
        }
    }

    @Override // org.bouncycastle.est.jcajce.JsseHostnameAuthorizer
    public boolean verified(java.lang.String str, javax.net.ssl.SSLSession sSLSession) throws java.io.IOException {
        try {
            return verify(str, (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(new java.io.ByteArrayInputStream(sSLSession.getPeerCertificates()[0].getEncoded())));
        } catch (java.lang.Exception e) {
            if (e instanceof org.bouncycastle.est.ESTException) {
                throw ((org.bouncycastle.est.ESTException) e);
            }
            throw new org.bouncycastle.est.ESTException(e.getMessage(), e);
        }
    }

    public static boolean isValidNameMatch(java.lang.String str, java.lang.String str2, java.util.Set<java.lang.String> set) throws java.io.IOException {
        if (!str2.contains("*")) {
            return str.equalsIgnoreCase(str2);
        }
        int indexOf = str2.indexOf(42);
        if (indexOf != str2.lastIndexOf("*") || str2.contains("..") || str2.charAt(str2.length() - 1) == '*') {
            return false;
        }
        int indexOf2 = str2.indexOf(46, indexOf);
        if (set != null && set.contains(org.bouncycastle.util.Strings.toLowerCase(str2.substring(indexOf2)))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Wildcard `");
            sb.append(str2);
            sb.append("` matches known public suffix.");
            throw new java.io.IOException(sb.toString());
        }
        java.lang.String lowerCase = org.bouncycastle.util.Strings.toLowerCase(str2.substring(indexOf + 1));
        java.lang.String lowerCase2 = org.bouncycastle.util.Strings.toLowerCase(str);
        if (lowerCase2.equals(lowerCase) || lowerCase.length() > lowerCase2.length()) {
            return false;
        }
        if (indexOf > 0) {
            return lowerCase2.startsWith(str2.substring(0, indexOf)) && lowerCase2.endsWith(lowerCase) && lowerCase2.substring(indexOf, lowerCase2.length() - lowerCase.length()).indexOf(46) < 0;
        }
        if (lowerCase2.substring(0, lowerCase2.length() - lowerCase.length()).indexOf(46) > 0) {
            return false;
        }
        return lowerCase2.endsWith(lowerCase);
    }

    public JsseDefaultHostnameAuthorizer(java.util.Set<java.lang.String> set) {
        this.getHighSpeedVideoFpsRangesFor = set;
    }
}
