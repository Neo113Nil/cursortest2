package Y5;

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

/* loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7783a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f7784b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i7) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i7 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        String str3;
        char[] cArr;
        char c3;
        char[] cArr2;
        int i7;
        char c4;
        if (f7784b.matcher(str).matches()) {
            List a2 = a(x509Certificate, 7);
            int size = a2.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (str.equalsIgnoreCase((String) a2.get(i8))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i9 = 2;
        List a4 = a(x509Certificate, 2);
        int size2 = a4.size();
        int i10 = 0;
        boolean z4 = false;
        while (i10 < size2) {
            if (c(lowerCase, (String) a4.get(i10))) {
                return true;
            }
            i10++;
            z4 = true;
        }
        if (!z4) {
            c cVar = new c(x509Certificate.getSubjectX500Principal());
            cVar.f7778c = 0;
            cVar.f7779d = 0;
            cVar.f7780e = 0;
            cVar.f7781f = 0;
            String str4 = cVar.f7776a;
            cVar.f7782g = str4.toCharArray();
            String c7 = cVar.c();
            if (c7 != null) {
                do {
                    int i11 = cVar.f7778c;
                    int i12 = cVar.f7777b;
                    if (i11 != i12) {
                        char c8 = cVar.f7782g[i11];
                        char c9 = '\\';
                        if (c8 == '\"') {
                            int i13 = i11 + 1;
                            cVar.f7778c = i13;
                            cVar.f7779d = i13;
                            cVar.f7780e = i13;
                            while (true) {
                                int i14 = cVar.f7778c;
                                if (i14 == i12) {
                                    throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                                }
                                char[] cArr3 = cVar.f7782g;
                                char c10 = cArr3[i14];
                                if (c10 == '\"') {
                                    cVar.f7778c = i14 + 1;
                                    while (true) {
                                        int i15 = cVar.f7778c;
                                        if (i15 >= i12 || cVar.f7782g[i15] != ' ') {
                                            break;
                                        }
                                        cVar.f7778c = i15 + 1;
                                    }
                                    char[] cArr4 = cVar.f7782g;
                                    int i16 = cVar.f7779d;
                                    str2 = new String(cArr4, i16, cVar.f7780e - i16);
                                } else {
                                    if (c10 == '\\') {
                                        cArr3[cVar.f7780e] = cVar.b();
                                    } else {
                                        cArr3[cVar.f7780e] = c10;
                                    }
                                    cVar.f7778c++;
                                    cVar.f7780e++;
                                    i9 = 2;
                                }
                            }
                        } else if (c8 == '#') {
                            if (i11 + 4 >= i12) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                            }
                            cVar.f7779d = i11;
                            cVar.f7778c = i11 + 1;
                            while (true) {
                                int i17 = cVar.f7778c;
                                if (i17 == i12 || (c3 = (cArr = cVar.f7782g)[i17]) == '+' || c3 == ',' || c3 == ';') {
                                    break;
                                }
                                if (c3 == ' ') {
                                    cVar.f7780e = i17;
                                    cVar.f7778c = i17 + 1;
                                    while (true) {
                                        int i18 = cVar.f7778c;
                                        if (i18 >= i12 || cVar.f7782g[i18] != ' ') {
                                            break;
                                        }
                                        cVar.f7778c = i18 + 1;
                                    }
                                } else {
                                    if (c3 >= 'A' && c3 <= 'F') {
                                        cArr[i17] = (char) (c3 + ' ');
                                    }
                                    cVar.f7778c = i17 + 1;
                                }
                            }
                            int i19 = cVar.f7780e;
                            int i20 = cVar.f7779d;
                            int i21 = i19 - i20;
                            if (i21 < 5 || (i21 & 1) == 0) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                            }
                            int i22 = i21 / 2;
                            byte[] bArr = new byte[i22];
                            int i23 = i20 + 1;
                            for (int i24 = 0; i24 < i22; i24++) {
                                bArr[i24] = (byte) cVar.a(i23);
                                i23 += i9;
                            }
                            str2 = new String(cVar.f7782g, cVar.f7779d, i21);
                        } else if (c8 == '+' || c8 == ',' || c8 == ';') {
                            str2 = "";
                        } else {
                            cVar.f7779d = i11;
                            cVar.f7780e = i11;
                            while (true) {
                                int i25 = cVar.f7778c;
                                if (i25 >= i12) {
                                    char[] cArr5 = cVar.f7782g;
                                    int i26 = cVar.f7779d;
                                    str2 = new String(cArr5, i26, cVar.f7780e - i26);
                                    break;
                                }
                                cArr2 = cVar.f7782g;
                                char c11 = cArr2[i25];
                                if (c11 == ' ') {
                                    int i27 = cVar.f7780e;
                                    cVar.f7781f = i27;
                                    cVar.f7778c = i25 + 1;
                                    cVar.f7780e = i27 + 1;
                                    cArr2[i27] = ' ';
                                    while (true) {
                                        i7 = cVar.f7778c;
                                        if (i7 >= i12) {
                                            break;
                                        }
                                        char[] cArr6 = cVar.f7782g;
                                        if (cArr6[i7] != ' ') {
                                            break;
                                        }
                                        int i28 = cVar.f7780e;
                                        cVar.f7780e = i28 + 1;
                                        cArr6[i28] = ' ';
                                        cVar.f7778c = i7 + 1;
                                    }
                                    if (i7 == i12 || (c4 = cVar.f7782g[i7]) == ',' || c4 == '+' || c4 == ';') {
                                        break;
                                    }
                                    c9 = '\\';
                                } else {
                                    if (c11 == ';') {
                                        break;
                                    }
                                    if (c11 == c9) {
                                        int i29 = cVar.f7780e;
                                        cVar.f7780e = i29 + 1;
                                        cArr2[i29] = cVar.b();
                                        cVar.f7778c++;
                                    } else {
                                        if (c11 == '+' || c11 == ',') {
                                            break;
                                        }
                                        int i30 = cVar.f7780e;
                                        cVar.f7780e = i30 + 1;
                                        cArr2[i30] = c11;
                                        cVar.f7778c = i25 + 1;
                                    }
                                    c9 = '\\';
                                }
                            }
                            int i31 = cVar.f7779d;
                            str2 = new String(cArr2, i31, cVar.f7780e - i31);
                        }
                        if ("cn".equalsIgnoreCase(c7)) {
                            str3 = str2;
                            if (str3 != null) {
                                return c(lowerCase, str3);
                            }
                        } else {
                            int i32 = cVar.f7778c;
                            if (i32 < i12) {
                                char c12 = cVar.f7782g[i32];
                                if (c12 != ',' && c12 != ';' && c12 != '+') {
                                    throw new IllegalStateException("Malformed DN: ".concat(str4));
                                }
                                cVar.f7778c = i32 + 1;
                                c7 = cVar.c();
                            }
                        }
                    }
                } while (c7 != null);
                throw new IllegalStateException("Malformed DN: ".concat(str4));
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
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
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
