package p000;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gt0 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final gt0 f2869a = new gt0();

    /* JADX INFO: renamed from: b */
    public static final Pattern f2870b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: a */
    public static List m2143a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX INFO: renamed from: b */
    public static boolean m2144b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (f2870b.matcher(str).matches()) {
            List listM2143a = m2143a(x509Certificate, 7);
            int size = listM2143a.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (str.equalsIgnoreCase((String) listM2143a.get(i2))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List listM2143a2 = m2143a(x509Certificate, 2);
        int size2 = listM2143a2.size();
        int i3 = 0;
        boolean z5 = false;
        while (i3 < size2) {
            if (m2145c(lowerCase, (String) listM2143a2.get(i3))) {
                return true;
            }
            i3++;
            z5 = true;
        }
        if (!z5) {
            C0334iu c0334iu = new C0334iu(x509Certificate.getSubjectX500Principal());
            c0334iu.f3662c = 0;
            c0334iu.f3663d = 0;
            c0334iu.f3664e = 0;
            c0334iu.f3665f = 0;
            String str3 = c0334iu.f3660a;
            c0334iu.f3666g = str3.toCharArray();
            String strM2700c = c0334iu.m2700c();
            String str4 = null;
            if (strM2700c == null) {
                z = z3;
            } else {
                while (true) {
                    int i4 = c0334iu.f3662c;
                    int i5 = c0334iu.f3661b;
                    if (i4 == i5) {
                        break;
                    }
                    char c4 = c0334iu.f3666g[i4];
                    char c5 = c3;
                    z = z3;
                    if (c4 == '\"') {
                        z2 = z4;
                        int i6 = i4 + 1;
                        c0334iu.f3662c = i6;
                        c0334iu.f3663d = i6;
                        c0334iu.f3664e = i6;
                        while (true) {
                            int i7 = c0334iu.f3662c;
                            if (i7 == i5) {
                                C0270h1.m2191g("Unexpected end of DN: ".concat(str3));
                                return z;
                            }
                            char[] cArr2 = c0334iu.f3666g;
                            char c6 = cArr2[i7];
                            if (c6 == '\"') {
                                c0334iu.f3662c = i7 + 1;
                                while (true) {
                                    int i8 = c0334iu.f3662c;
                                    if (i8 >= i5 || c0334iu.f3666g[i8] != ' ') {
                                        break;
                                    }
                                    c0334iu.f3662c = i8 + 1;
                                }
                                char[] cArr3 = c0334iu.f3666g;
                                int i9 = c0334iu.f3663d;
                                str2 = new String(cArr3, i9, c0334iu.f3664e - i9);
                                break;
                            }
                            int i10 = c0334iu.f3664e;
                            if (c6 == '\\') {
                                cArr2[i10] = c0334iu.m2699b();
                            } else {
                                cArr2[i10] = c6;
                            }
                            c0334iu.f3662c++;
                            c0334iu.f3664e++;
                        }
                    } else if (c4 == '#') {
                        z2 = z4;
                        if (i4 + 4 >= i5) {
                            C0270h1.m2191g("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        c0334iu.f3663d = i4;
                        c0334iu.f3662c = i4 + 1;
                        while (true) {
                            int i11 = c0334iu.f3662c;
                            if (i11 == i5 || (c = (cArr = c0334iu.f3666g)[i11]) == '+' || c == ',' || c == ';') {
                                c0334iu.f3664e = i11;
                                break;
                            }
                            if (c == ' ') {
                                c0334iu.f3664e = i11;
                                c0334iu.f3662c = i11 + 1;
                                while (true) {
                                    int i12 = c0334iu.f3662c;
                                    if (i12 >= i5 || c0334iu.f3666g[i12] != ' ') {
                                        break;
                                    }
                                    c0334iu.f3662c = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ' ');
                                }
                                c0334iu.f3662c = i11 + 1;
                            }
                        }
                        int i13 = c0334iu.f3664e;
                        int i14 = c0334iu.f3663d;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            C0270h1.m2191g("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (?? r12 = z; r12 < i16; r12++) {
                            bArr[r12] = (byte) c0334iu.m2698a(i17);
                            i17 += 2;
                        }
                        str2 = new String(c0334iu.f3666g, c0334iu.f3663d, i15);
                    } else if (c4 == '+' || c4 == ',' || c4 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        c0334iu.f3663d = i4;
                        c0334iu.f3664e = i4;
                        while (true) {
                            int i18 = c0334iu.f3662c;
                            char[] cArr4 = c0334iu.f3666g;
                            if (i18 >= i5) {
                                int i19 = c0334iu.f3663d;
                                str2 = new String(cArr4, i19, c0334iu.f3664e - i19);
                                z2 = z4;
                            } else {
                                char c7 = cArr4[i18];
                                if (c7 != ' ') {
                                    if (c7 != ';') {
                                        if (c7 == '\\') {
                                            z2 = z4;
                                            int i20 = c0334iu.f3664e;
                                            c0334iu.f3664e = i20 + 1;
                                            cArr4[i20] = c0334iu.m2699b();
                                            c0334iu.f3662c++;
                                        } else if (c7 != '+' && c7 != ',') {
                                            int i21 = c0334iu.f3664e;
                                            z2 = z4;
                                            c0334iu.f3664e = i21 + 1;
                                            cArr4[i21] = c7;
                                            c0334iu.f3662c = i18 + 1;
                                        }
                                        z4 = z2;
                                    }
                                    z2 = z4;
                                    int i22 = c0334iu.f3663d;
                                    str2 = new String(cArr4, i22, c0334iu.f3664e - i22);
                                } else {
                                    z2 = z4;
                                    int i23 = c0334iu.f3664e;
                                    c0334iu.f3665f = i23;
                                    c0334iu.f3662c = i18 + 1;
                                    c0334iu.f3664e = i23 + 1;
                                    cArr4[i23] = ' ';
                                    while (true) {
                                        i = c0334iu.f3662c;
                                        if (i >= i5) {
                                            break;
                                        }
                                        char[] cArr5 = c0334iu.f3666g;
                                        if (cArr5[i] != ' ') {
                                            break;
                                        }
                                        int i24 = c0334iu.f3664e;
                                        c0334iu.f3664e = i24 + 1;
                                        cArr5[i24] = ' ';
                                        c0334iu.f3662c = i + 1;
                                    }
                                    if (i == i5 || (c2 = c0334iu.f3666g[i]) == ',' || c2 == '+' || c2 == ';') {
                                        char[] cArr6 = c0334iu.f3666g;
                                        int i25 = c0334iu.f3663d;
                                        str2 = new String(cArr6, i25, c0334iu.f3665f - i25);
                                    } else {
                                        z4 = z2;
                                    }
                                }
                            }
                        }
                    }
                    if ("cn".equalsIgnoreCase(strM2700c)) {
                        str4 = str2;
                    } else {
                        int i26 = c0334iu.f3662c;
                        if (i26 < i5) {
                            char c8 = c0334iu.f3666g[i26];
                            if (c8 != ',' && c8 != ';' && c8 != '+') {
                                C0270h1.m2191g("Malformed DN: ".concat(str3));
                                return z;
                            }
                            c0334iu.f3662c = i26 + 1;
                            strM2700c = c0334iu.m2700c();
                            if (strM2700c == null) {
                                C0270h1.m2191g("Malformed DN: ".concat(str3));
                                return z;
                            }
                            c3 = c5;
                            z3 = z;
                            z4 = z2;
                        }
                    }
                }
                z = z3;
            }
            return str4 != null ? m2145c(lowerCase, str4) : z;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2145c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String strSubstring = lowerCase.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return m2144b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
