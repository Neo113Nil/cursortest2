package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzccl implements javax.net.ssl.HostnameVerifier {
    public static final com.google.android.libraries.places.internal.zzccl zza = new com.google.android.libraries.places.internal.zzccl();
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static java.util.List zza(java.security.cert.X509Certificate x509Certificate, int i) {
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

    private static final boolean zzb(java.lang.String str, java.lang.String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str2);
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

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        java.lang.String zza2;
        if (com.google.common.base.Utf8.encodedLength(str) == str.length()) {
            try {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0];
                if (zzb.matcher(str).matches()) {
                    java.util.List zza3 = zza(x509Certificate, 7);
                    int size = zza3.size();
                    for (int i = 0; i < size; i++) {
                        if (str.equalsIgnoreCase((java.lang.String) zza3.get(i))) {
                            return true;
                        }
                    }
                    return false;
                }
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
                java.util.List zza4 = zza(x509Certificate, 2);
                int size2 = zza4.size();
                int i2 = 0;
                boolean z = false;
                while (i2 < size2) {
                    if (zzb(lowerCase, (java.lang.String) zza4.get(i2))) {
                        return true;
                    }
                    i2++;
                    z = true;
                }
                if (!z && (zza2 = new com.google.android.libraries.places.internal.zzcci(x509Certificate.getSubjectX500Principal()).zza("cn")) != null) {
                    return zzb(lowerCase, zza2);
                }
            } catch (javax.net.ssl.SSLException unused) {
            }
        }
        return false;
    }

    private zzccl() {
    }
}
