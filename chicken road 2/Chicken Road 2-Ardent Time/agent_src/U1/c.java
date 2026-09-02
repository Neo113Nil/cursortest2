package U1;

/* loaded from: classes.dex */
public final class c implements javax.net.ssl.HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final U1.c f1742a = new U1.c();

    public static java.util.List a(java.security.cert.X509Certificate x509Certificate, int i2) {
        java.lang.Object obj;
        i1.C0199r c0199r = i1.C0199r.f3325a;
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c0199r;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && kotlin.jvm.internal.i.a(list.get(0), java.lang.Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((java.lang.String) obj);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return c0199r;
        }
    }

    public static boolean b(java.lang.String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new java.lang.IllegalArgumentException(B1.a.g(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            throw new java.lang.IllegalArgumentException(("endIndex > string.length: " + length2 + " > " + str.length()).toString());
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    i2 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i2 = 3;
                } else {
                    int i4 = i3 + 1;
                    char charAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i3 = i4;
                    } else {
                        j2 += 4;
                        i3 += 2;
                    }
                }
                j2 += i2;
            }
            i3++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0073->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(java.lang.String host, java.security.cert.X509Certificate certificate) {
        boolean z2;
        int length;
        kotlin.jvm.internal.i.e(host, "host");
        kotlin.jvm.internal.i.e(certificate, "certificate");
        byte[] bArr = J1.b.f932a;
        y1.f fVar = J1.b.f936e;
        fVar.getClass();
        if (fVar.f8503a.matcher(host).matches()) {
            java.lang.String E2 = u0.AbstractC0995a.E(host);
            java.util.List a2 = a(certificate, 7);
            if (!a2.isEmpty()) {
                java.util.Iterator it = a2.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.i.a(E2, u0.AbstractC0995a.E((java.lang.String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(host)) {
                java.util.Locale US = java.util.Locale.US;
                kotlin.jvm.internal.i.d(US, "US");
                host = host.toLowerCase(US);
                kotlin.jvm.internal.i.d(host, "this as java.lang.String).toLowerCase(locale)");
            }
            java.util.List<java.lang.String> a3 = a(certificate, 2);
            if (!a3.isEmpty()) {
                for (java.lang.String str : a3) {
                    if (host.length() != 0 && !y1.o.K(host, ".", false) && !y1.o.F(host, "..") && str != null && str.length() != 0 && !y1.o.K(str, ".", false) && !y1.o.F(str, "..")) {
                        java.lang.String h2 = !y1.o.F(host, ".") ? kotlin.jvm.internal.i.h(".", host) : host;
                        if (!y1.o.F(str, ".")) {
                            str = kotlin.jvm.internal.i.h(".", str);
                        }
                        if (b(str)) {
                            java.util.Locale US2 = java.util.Locale.US;
                            kotlin.jvm.internal.i.d(US2, "US");
                            str = str.toLowerCase(US2);
                            kotlin.jvm.internal.i.d(str, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!y1.g.M(str, "*")) {
                            z2 = kotlin.jvm.internal.i.a(h2, str);
                        } else if (y1.o.K(str, "*.", false) && y1.g.Q(str, '*', 1, false, 4) == -1 && h2.length() >= str.length() && !"*.".equals(str)) {
                            java.lang.String substring = str.substring(1);
                            kotlin.jvm.internal.i.d(substring, "this as java.lang.String).substring(startIndex)");
                            if (y1.o.F(h2, substring) && ((length = h2.length() - substring.length()) <= 0 || y1.g.U(h2, '.', length - 1, 4) == -1)) {
                                z2 = true;
                            }
                        }
                        if (!z2) {
                            return true;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String host, javax.net.ssl.SSLSession session) {
        kotlin.jvm.internal.i.e(host, "host");
        kotlin.jvm.internal.i.e(session, "session");
        if (!b(host)) {
            return false;
        }
        try {
            java.security.cert.Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return c(host, (java.security.cert.X509Certificate) certificate);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }
}
