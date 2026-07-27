package h5;

import B4.j;
import B4.k;
import B4.r;
import g4.C0471p;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f5827a = new c();

    public static List a(X509Certificate x509Certificate, int i2) {
        Object obj;
        C0471p c0471p = C0471p.f5750a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c0471p;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && i.a(list.get(0), Integer.valueOf(i2)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c0471p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0073->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String host, X509Certificate x509Certificate) {
        boolean z;
        int length;
        i.e(host, "host");
        j jVar = U4.b.f3175a;
        j jVar2 = U4.b.f3175a;
        jVar2.getClass();
        if (jVar2.f314a.matcher(host).matches()) {
            String b6 = U4.b.b(host);
            List a6 = a(x509Certificate, 7);
            if (!a6.isEmpty()) {
                Iterator it = a6.iterator();
                while (it.hasNext()) {
                    if (i.a(b6, U4.b.b((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (host.length() == ((int) j5.b.f(host))) {
                Locale US = Locale.US;
                i.d(US, "US");
                host = host.toLowerCase(US);
                i.d(host, "toLowerCase(...)");
            }
            List<String> a7 = a(x509Certificate, 2);
            if (!a7.isEmpty()) {
                for (String str : a7) {
                    if (host.length() != 0 && !r.O(host, ".", false) && !r.H(host, "..") && str != null && str.length() != 0 && !r.O(str, ".", false) && !r.H(str, "..")) {
                        String concat = !r.H(host, ".") ? host.concat(".") : host;
                        if (!r.H(str, ".")) {
                            str = str.concat(".");
                        }
                        if (str.length() == ((int) j5.b.f(str))) {
                            Locale US2 = Locale.US;
                            i.d(US2, "US");
                            str = str.toLowerCase(US2);
                            i.d(str, "toLowerCase(...)");
                        }
                        if (!k.R(str, "*", false)) {
                            z = i.a(concat, str);
                        } else if (r.O(str, "*.", false) && k.W(str, '*', 1, false, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                            String substring = str.substring(1);
                            i.d(substring, "substring(...)");
                            if (r.H(concat, substring) && ((length = concat.length() - substring.length()) <= 0 || k.b0(concat, '.', length - 1, 4) == -1)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            return true;
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        i.e(host, "host");
        i.e(session, "session");
        if (!(host.length() == ((int) j5.b.f(host)))) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return b(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
