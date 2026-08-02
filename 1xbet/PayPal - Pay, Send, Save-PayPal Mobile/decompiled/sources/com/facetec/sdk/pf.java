package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class pf implements javax.net.ssl.HostnameVerifier {
    public static final com.facetec.sdk.pf d = new com.facetec.sdk.pf();

    private pf() {
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        try {
            return a(str, (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }

    public final boolean a(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        if (com.facetec.sdk.nh.b(str)) {
            return d(str, x509Certificate);
        }
        return c(str, x509Certificate);
    }

    private static boolean d(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> c = c(x509Certificate, 7);
        int size = c.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(c.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        java.util.Iterator<java.lang.String> it = c(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (d(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static java.util.List<java.lang.String> a(java.security.cert.X509Certificate x509Certificate) {
        java.util.List<java.lang.String> c = c(x509Certificate, 7);
        java.util.List<java.lang.String> c2 = c(x509Certificate, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(c.size() + c2.size());
        arrayList.addAll(c);
        arrayList.addAll(c2);
        return arrayList;
    }

    private static java.util.List<java.lang.String> c(java.security.cert.X509Certificate x509Certificate, int i) {
        java.lang.Integer num;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return java.util.Collections.emptyList();
            }
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (java.lang.Integer) list.get(0)) != null && num.intValue() == i && (str = (java.lang.String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return java.util.Collections.emptyList();
        }
    }

    private static boolean d(java.lang.String str, java.lang.String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                str = sb.toString();
            }
            if (!str2.endsWith(".")) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str2);
                sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                str2 = sb2.toString();
            }
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            java.lang.String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
