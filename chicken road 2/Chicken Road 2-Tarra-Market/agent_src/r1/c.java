package r1;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f6488a = new c();

    public static ArrayList a(X509Certificate x509Certificate) {
        List b2 = b(x509Certificate, 7);
        List b3 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b3.size() + b2.size());
        arrayList.addAll(b2);
        arrayList.addAll(b3);
        return arrayList;
    }

    public static List b(X509Certificate x509Certificate, int i2) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:1: B:15:0x003d->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z2;
        int length;
        if (j1.d.f6060h.matcher(str).matches()) {
            List b2 = b(x509Certificate, 7);
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (str.equalsIgnoreCase((String) b2.get(i2))) {
                    return true;
                }
            }
        } else {
            String lowerCase = str.toLowerCase(Locale.US);
            for (String str2 : b(x509Certificate, 2)) {
                if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
                    String concat = !lowerCase.endsWith(".") ? lowerCase.concat(".") : lowerCase;
                    if (!str2.endsWith(".")) {
                        str2 = str2.concat(".");
                    }
                    String lowerCase2 = str2.toLowerCase(Locale.US);
                    if (!lowerCase2.contains("*")) {
                        z2 = concat.equals(lowerCase2);
                    } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && concat.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                        String substring = lowerCase2.substring(1);
                        if (concat.endsWith(substring) && ((length = concat.length() - substring.length()) <= 0 || concat.lastIndexOf(46, length - 1) == -1)) {
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
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
