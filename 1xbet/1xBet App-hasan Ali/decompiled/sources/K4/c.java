package K4;

import X3.v;
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
import kotlin.jvm.internal.l;
import n.AbstractC2107A;
import o4.AbstractC2227e;
import o4.AbstractC2234l;
import o4.C2226d;
import v.w0;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2895a = new c();

    public static List a(X509Certificate x509Certificate, int i) {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        v vVar = v.f6090k;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return vVar;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && l.a(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(L1.a.l(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder v4 = AbstractC2107A.v(length2, "endIndex > string.length: ", " > ");
            v4.append(str.length());
            throw new IllegalArgumentException(v4.toString().toString());
        }
        long j5 = 0;
        int i5 = 0;
        while (i5 < length2) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                j5++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i6 = i5 + 1;
                    char charAt2 = i6 < length2 ? str.charAt(i6) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j5++;
                        i5 = i6;
                    } else {
                        j5 += 4;
                        i5 += 2;
                    }
                }
                j5 += i;
            }
            i5++;
        }
        return length == ((int) j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:1: B:22:0x006e->B:52:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z3;
        int length;
        l.f("host", str);
        byte[] bArr = z4.b.f21979a;
        C2226d c2226d = z4.b.f;
        c2226d.getClass();
        if (c2226d.f18666k.matcher(str).matches()) {
            String f = w0.f(str);
            List a5 = a(x509Certificate, 7);
            if (!a5.isEmpty()) {
                Iterator it = a5.iterator();
                while (it.hasNext()) {
                    if (l.a(f, w0.f((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(str)) {
            Locale locale = Locale.US;
            l.e("US", locale);
            str = str.toLowerCase(locale);
            l.e("this as java.lang.String).toLowerCase(locale)", str);
        }
        List<String> a6 = a(x509Certificate, 2);
        if (!a6.isEmpty()) {
            for (String str2 : a6) {
                if (str.length() != 0 && !AbstractC2234l.x0(str, ".", false) && !AbstractC2234l.r0(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC2234l.x0(str2, ".", false) && !AbstractC2234l.r0(str2, "..", false)) {
                    String concat = !AbstractC2234l.r0(str, ".", false) ? str.concat(".") : str;
                    if (!AbstractC2234l.r0(str2, ".", false)) {
                        str2 = str2.concat(".");
                    }
                    if (b(str2)) {
                        Locale locale2 = Locale.US;
                        l.e("US", locale2);
                        str2 = str2.toLowerCase(locale2);
                        l.e("this as java.lang.String).toLowerCase(locale)", str2);
                    }
                    if (!AbstractC2227e.B0(str2, "*")) {
                        z3 = l.a(concat, str2);
                    } else if (AbstractC2234l.x0(str2, "*.", false) && AbstractC2227e.F0(str2, '*', 1, 4) == -1 && concat.length() >= str2.length() && !"*.".equals(str2)) {
                        String substring = str2.substring(1);
                        l.e("this as java.lang.String).substring(startIndex)", substring);
                        if (AbstractC2234l.r0(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || AbstractC2227e.I0(concat, '.', length - 1, 4) == -1)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        return true;
                    }
                }
                z3 = false;
                if (!z3) {
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        l.f("host", str);
        l.f("session", sSLSession);
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
