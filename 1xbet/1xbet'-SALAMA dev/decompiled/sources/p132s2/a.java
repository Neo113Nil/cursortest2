package p132s2;

import C1.C0095a;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f16103c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f16104d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0095a f16105a = new C0095a(4, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f16106b = new StringBuilder();

    public static String a(C0095a c0095a, StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int i7 = c0095a.f1463a;
        int i8 = c0095a.f1464b;
        while (i7 < i8 && !z4) {
            char c3 = (char) ((byte[]) c0095a.f1465c)[i7];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z4 = true;
            } else {
                i7++;
                sb.append(c3);
            }
        }
        c0095a.E(i7 - c0095a.f1463a);
        return sb.toString();
    }

    public static String b(C0095a c0095a, StringBuilder sb) {
        c(c0095a);
        if (c0095a.d() == 0) {
            return null;
        }
        String strA = a(c0095a, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) c0095a.t());
    }

    public static void c(C0095a c0095a) {
        while (true) {
            for (boolean z4 = true; c0095a.d() > 0 && z4; z4 = false) {
                int i7 = c0095a.f1463a;
                byte[] bArr = (byte[]) c0095a.f1465c;
                byte b7 = bArr[i7];
                char c3 = (char) b7;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    c0095a.E(1);
                } else {
                    int i8 = c0095a.f1464b;
                    int i9 = i7 + 2;
                    if (i9 <= i8) {
                        int i10 = i7 + 1;
                        if (b7 == 47 && bArr[i10] == 42) {
                            while (true) {
                                int i11 = i9 + 1;
                                if (i11 >= i8) {
                                    break;
                                }
                                if (((char) bArr[i9]) == '*' && ((char) bArr[i11]) == '/') {
                                    i9 += 2;
                                    i8 = i9;
                                } else {
                                    i9 = i11;
                                }
                            }
                            c0095a.E(i8 - c0095a.f1463a);
                        }
                    }
                }
            }
            return;
        }
    }
}
