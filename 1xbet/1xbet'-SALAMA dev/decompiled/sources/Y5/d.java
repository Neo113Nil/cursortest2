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

/* JADX INFO: loaded from: classes2.dex */
public final class d implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7783a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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

    public static boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        String str3;
        char[] cArr;
        char c3;
        int i7;
        char c4;
        if (f7784b.matcher(str).matches()) {
            List listA = a(x509Certificate, 7);
            int size = listA.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (str.equalsIgnoreCase((String) listA.get(i8))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        int i9 = 2;
        List listA2 = a(x509Certificate, 2);
        int size2 = listA2.size();
        int i10 = 0;
        boolean z4 = false;
        while (i10 < size2) {
            if (c(lowerCase, (String) listA2.get(i10))) {
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
            String strC = cVar.c();
            if (strC == null) {
                str3 = null;
            } else {
                while (true) {
                    int i11 = cVar.f7778c;
                    int i12 = cVar.f7777b;
                    if (i11 == i12) {
                        break;
                    }
                    char c7 = cVar.f7782g[i11];
                    char c8 = '\\';
                    if (c7 == '\"') {
                        int i13 = i11 + 1;
                        cVar.f7778c = i13;
                        cVar.f7779d = i13;
                        cVar.f7780e = i13;
                        while (true) {
                            int i14 = cVar.f7778c;
                            if (i14 == i12) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                            }
                            char[] cArr2 = cVar.f7782g;
                            char c9 = cArr2[i14];
                            if (c9 == '\"') {
                                cVar.f7778c = i14 + 1;
                                while (true) {
                                    int i15 = cVar.f7778c;
                                    if (i15 >= i12 || cVar.f7782g[i15] != ' ') {
                                        break;
                                    }
                                    cVar.f7778c = i15 + 1;
                                }
                                char[] cArr3 = cVar.f7782g;
                                int i16 = cVar.f7779d;
                                str2 = new String(cArr3, i16, cVar.f7780e - i16);
                                break;
                            }
                            if (c9 == '\\') {
                                cArr2[cVar.f7780e] = cVar.b();
                            } else {
                                cArr2[cVar.f7780e] = c9;
                            }
                            cVar.f7778c++;
                            cVar.f7780e++;
                            i9 = 2;
                        }
                    } else if (c7 == '#') {
                        if (i11 + 4 >= i12) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str4));
                        }
                        cVar.f7779d = i11;
                        cVar.f7778c = i11 + 1;
                        while (true) {
                            int i17 = cVar.f7778c;
                            if (i17 == i12 || (c3 = (cArr = cVar.f7782g)[i17]) == '+' || c3 == ',' || c3 == ';') {
                                cVar.f7780e = i17;
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
                    } else if (c7 == '+' || c7 == ',' || c7 == ';') {
                        str2 = "";
                    } else {
                        cVar.f7779d = i11;
                        cVar.f7780e = i11;
                        while (true) {
                            int i25 = cVar.f7778c;
                            if (i25 >= i12) {
                                char[] cArr4 = cVar.f7782g;
                                int i26 = cVar.f7779d;
                                str2 = new String(cArr4, i26, cVar.f7780e - i26);
                                break;
                            }
                            char[] cArr5 = cVar.f7782g;
                            char c10 = cArr5[i25];
                            if (c10 != ' ') {
                                if (c10 != ';') {
                                    if (c10 == c8) {
                                        int i27 = cVar.f7780e;
                                        cVar.f7780e = i27 + 1;
                                        cArr5[i27] = cVar.b();
                                        cVar.f7778c++;
                                    } else if (c10 != '+' && c10 != ',') {
                                        int i28 = cVar.f7780e;
                                        cVar.f7780e = i28 + 1;
                                        cArr5[i28] = c10;
                                        cVar.f7778c = i25 + 1;
                                    }
                                    c8 = '\\';
                                }
                                int i29 = cVar.f7779d;
                                str2 = new String(cArr5, i29, cVar.f7780e - i29);
                                break;
                            }
                            int i30 = cVar.f7780e;
                            cVar.f7781f = i30;
                            cVar.f7778c = i25 + 1;
                            cVar.f7780e = i30 + 1;
                            cArr5[i30] = ' ';
                            while (true) {
                                i7 = cVar.f7778c;
                                if (i7 >= i12) {
                                    break;
                                }
                                char[] cArr6 = cVar.f7782g;
                                if (cArr6[i7] != ' ') {
                                    break;
                                }
                                int i31 = cVar.f7780e;
                                cVar.f7780e = i31 + 1;
                                cArr6[i31] = ' ';
                                cVar.f7778c = i7 + 1;
                            }
                            if (i7 == i12 || (c4 = cVar.f7782g[i7]) == ',' || c4 == '+' || c4 == ';') {
                                char[] cArr7 = cVar.f7782g;
                                int i32 = cVar.f7779d;
                                str2 = new String(cArr7, i32, cVar.f7781f - i32);
                                break;
                            }
                            c8 = '\\';
                        }
                    }
                    if ("cn".equalsIgnoreCase(strC)) {
                        str3 = str2;
                    } else {
                        int i33 = cVar.f7778c;
                        if (i33 >= i12) {
                            break;
                        }
                        char c11 = cVar.f7782g[i33];
                        if (c11 != ',' && c11 != ';' && c11 != '+') {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                        cVar.f7778c = i33 + 1;
                        strC = cVar.c();
                        if (strC == null) {
                            throw new IllegalStateException("Malformed DN: ".concat(str4));
                        }
                    }
                }
                str3 = null;
            }
            if (str3 != null) {
                return c(lowerCase, str3);
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
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
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
