package m1;

import i1.C0071b;
import i1.j;
import i1.m;
import i1.o;
import i1.y;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p1.g;
import s1.h;

/* loaded from: classes.dex */
public abstract class d {
    static {
        h.c("\"\\");
        h.c("\t ,=");
    }

    public static long a(y yVar) {
        String a2 = yVar.f1453f.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(y yVar) {
        if (yVar.f1448a.f1431b.equals("HEAD")) {
            return false;
        }
        int i2 = yVar.f1450c;
        return (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && a(yVar) == -1 && !"chunked".equalsIgnoreCase(yVar.a("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i2, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x035f, code lost:
    
        if (r0 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x021e, code lost:
    
        if (j1.d.f6060h.matcher(r0).matches() == false) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(C0071b c0071b, o oVar, m mVar) {
        List list;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        String substring;
        j jVar;
        String str;
        String str2;
        String str3;
        String[] split;
        int i8;
        int length;
        int length2;
        String sb;
        String str4;
        if (c0071b == C0071b.f1290b) {
            return;
        }
        Pattern pattern = j.f1348j;
        int d2 = mVar.d();
        int i9 = 0;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < d2; i10++) {
            if ("Set-Cookie".equalsIgnoreCase(mVar.b(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mVar.e(i10));
            }
        }
        List unmodifiableList = arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
        int size = unmodifiableList.size();
        int i11 = 0;
        ArrayList arrayList2 = null;
        while (i11 < size) {
            String str5 = (String) unmodifiableList.get(i11);
            long currentTimeMillis = System.currentTimeMillis();
            int length3 = str5.length();
            int g2 = j1.d.g(str5, i9, length3, ';');
            int g3 = j1.d.g(str5, i9, g2, '=');
            if (g3 == g2) {
                list = unmodifiableList;
                i2 = size;
                i3 = i9;
            } else {
                int p2 = j1.d.p(str5, i9, g3);
                String substring2 = str5.substring(p2, j1.d.q(str5, p2, g3));
                if (substring2.isEmpty()) {
                    list = unmodifiableList;
                } else {
                    int length4 = substring2.length();
                    int i12 = 0;
                    while (i12 < length4) {
                        char charAt = substring2.charAt(i12);
                        list = unmodifiableList;
                        if (charAt <= 31 || charAt >= 127) {
                            i4 = 1;
                            i5 = -1;
                            break;
                        } else {
                            i12++;
                            unmodifiableList = list;
                        }
                    }
                    list = unmodifiableList;
                    i4 = 1;
                    i5 = -1;
                    i12 = -1;
                    if (i12 == i5) {
                        int p3 = j1.d.p(str5, g3 + i4, g2);
                        String substring3 = str5.substring(p3, j1.d.q(str5, p3, g2));
                        int length5 = substring3.length();
                        for (int i13 = 0; i13 < length5; i13++) {
                            char charAt2 = substring3.charAt(i13);
                            if (charAt2 <= 31 || charAt2 >= 127) {
                                i6 = 1;
                                i7 = i13;
                                break;
                            }
                        }
                        i6 = 1;
                        i7 = -1;
                        if (i7 != -1) {
                            i2 = size;
                        } else {
                            int i14 = g2 + i6;
                            long j3 = 253402300799999L;
                            String str6 = null;
                            String str7 = null;
                            long j4 = -1;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = true;
                            boolean z5 = false;
                            while (true) {
                                if (i14 < length3) {
                                    int g4 = j1.d.g(str5, i14, length3, ';');
                                    int g5 = j1.d.g(str5, i14, g4, '=');
                                    int p4 = j1.d.p(str5, i14, g5);
                                    String substring4 = str5.substring(p4, j1.d.q(str5, p4, g5));
                                    if (g5 < g4) {
                                        int p5 = j1.d.p(str5, g5 + 1, g4);
                                        str4 = str5.substring(p5, j1.d.q(str5, p5, g4));
                                    } else {
                                        str4 = "";
                                    }
                                    if (substring4.equalsIgnoreCase("expires")) {
                                        try {
                                            j3 = j.b(str4.length(), str4);
                                            z5 = true;
                                        } catch (NumberFormatException | IllegalArgumentException unused) {
                                        }
                                        i14 = g4 + 1;
                                    } else if (substring4.equalsIgnoreCase("max-age")) {
                                        try {
                                            long parseLong = Long.parseLong(str4);
                                            j4 = parseLong > 0 ? parseLong : Long.MIN_VALUE;
                                        } catch (NumberFormatException e2) {
                                            if (!str4.matches("-?\\d+")) {
                                                throw e2;
                                            }
                                            j4 = str4.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
                                        }
                                        z5 = true;
                                        i14 = g4 + 1;
                                    } else {
                                        if (substring4.equalsIgnoreCase("domain")) {
                                            if (str4.endsWith(".")) {
                                                throw new IllegalArgumentException();
                                            }
                                            if (str4.startsWith(".")) {
                                                str4 = str4.substring(1);
                                            }
                                            String b2 = j1.d.b(str4);
                                            if (b2 == null) {
                                                throw new IllegalArgumentException();
                                            }
                                            str6 = b2;
                                            z4 = false;
                                        } else if (substring4.equalsIgnoreCase("path")) {
                                            str7 = str4;
                                        } else if (substring4.equalsIgnoreCase("secure")) {
                                            z2 = true;
                                        } else if (substring4.equalsIgnoreCase("httponly")) {
                                            z3 = true;
                                        }
                                        i14 = g4 + 1;
                                    }
                                } else {
                                    if (j4 == Long.MIN_VALUE) {
                                        j2 = Long.MIN_VALUE;
                                    } else if (j4 != -1) {
                                        long j5 = currentTimeMillis + (j4 <= 9223372036854775L ? j4 * 1000 : Long.MAX_VALUE);
                                        j2 = (j5 < currentTimeMillis || j5 > 253402300799999L) ? 253402300799999L : j5;
                                    } else {
                                        j2 = j3;
                                    }
                                    String str8 = oVar.f1379d;
                                    if (str6 == null) {
                                        str6 = str8;
                                    } else if (!str8.equals(str6)) {
                                        if (str8.endsWith(str6)) {
                                            if (str8.charAt((str8.length() - str6.length()) - 1) == '.') {
                                            }
                                        }
                                    }
                                    if (str8.length() != str6.length()) {
                                        PublicSuffixDatabase publicSuffixDatabase = PublicSuffixDatabase.f6386h;
                                        publicSuffixDatabase.getClass();
                                        String[] split2 = IDN.toUnicode(str6).split("\\.");
                                        if (publicSuffixDatabase.f6387a.get() || !publicSuffixDatabase.f6387a.compareAndSet(false, true)) {
                                            try {
                                                publicSuffixDatabase.f6388b.await();
                                            } catch (InterruptedException unused2) {
                                                Thread.currentThread().interrupt();
                                            }
                                        } else {
                                            boolean z6 = false;
                                            while (true) {
                                                try {
                                                    try {
                                                        publicSuffixDatabase.b();
                                                        break;
                                                    } finally {
                                                        if (z6) {
                                                            Thread.currentThread().interrupt();
                                                        }
                                                    }
                                                } catch (InterruptedIOException unused3) {
                                                    Thread.interrupted();
                                                    z6 = true;
                                                } catch (IOException e3) {
                                                    g.f6437a.l(5, "Failed to read public suffix list", e3);
                                                    if (z6) {
                                                    }
                                                }
                                            }
                                        }
                                        synchronized (publicSuffixDatabase) {
                                            if (publicSuffixDatabase.f6389c == null) {
                                                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                                            }
                                        }
                                        int length6 = split2.length;
                                        byte[][] bArr = new byte[length6][];
                                        for (int i15 = 0; i15 < split2.length; i15++) {
                                            bArr[i15] = split2[i15].getBytes(j1.d.f6056d);
                                        }
                                        int i16 = 0;
                                        while (true) {
                                            if (i16 >= length6) {
                                                str = null;
                                                break;
                                            }
                                            str = PublicSuffixDatabase.a(publicSuffixDatabase.f6389c, bArr, i16);
                                            if (str != null) {
                                                break;
                                            } else {
                                                i16++;
                                            }
                                        }
                                        if (length6 > 1) {
                                            byte[][] bArr2 = (byte[][]) bArr.clone();
                                            i2 = size;
                                            for (int i17 = 0; i17 < bArr2.length - 1; i17++) {
                                                bArr2[i17] = PublicSuffixDatabase.f6383e;
                                                str2 = PublicSuffixDatabase.a(publicSuffixDatabase.f6389c, bArr2, i17);
                                                if (str2 != null) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            i2 = size;
                                        }
                                        str2 = null;
                                        if (str2 != null) {
                                            for (int i18 = 0; i18 < length6 - 1; i18++) {
                                                str3 = PublicSuffixDatabase.a(publicSuffixDatabase.f6390d, bArr, i18);
                                                if (str3 != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        str3 = null;
                                        if (str3 != null) {
                                            split = "!".concat(str3).split("\\.");
                                        } else if (str == null && str2 == null) {
                                            split = PublicSuffixDatabase.f6385g;
                                        } else {
                                            split = str != null ? str.split("\\.") : PublicSuffixDatabase.f6384f;
                                            String[] split3 = str2 != null ? str2.split("\\.") : PublicSuffixDatabase.f6384f;
                                            if (split.length <= split3.length) {
                                                split = split3;
                                            }
                                        }
                                        if (split2.length == split.length) {
                                            i8 = 0;
                                            if (split[0].charAt(0) != '!') {
                                                sb = null;
                                            }
                                        } else {
                                            i8 = 0;
                                        }
                                        if (split[i8].charAt(i8) == '!') {
                                            length = split2.length;
                                            length2 = split.length;
                                        } else {
                                            length = split2.length;
                                            length2 = split.length + 1;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        String[] split4 = str6.split("\\.");
                                        for (int i19 = length - length2; i19 < split4.length; i19++) {
                                            sb2.append(split4[i19]);
                                            sb2.append('.');
                                        }
                                        sb2.deleteCharAt(sb2.length() - 1);
                                        sb = sb2.toString();
                                    } else {
                                        i2 = size;
                                    }
                                    if (str7 == null || !str7.startsWith("/")) {
                                        int length7 = oVar.f1376a.length() + 3;
                                        String str9 = oVar.f1383h;
                                        int indexOf = str9.indexOf(47, length7);
                                        String substring5 = str9.substring(indexOf, j1.d.h(str9, indexOf, str9.length(), "?#"));
                                        int lastIndexOf = substring5.lastIndexOf(47);
                                        i3 = 0;
                                        substring = lastIndexOf != 0 ? substring5.substring(0, lastIndexOf) : "/";
                                    } else {
                                        substring = str7;
                                        i3 = 0;
                                    }
                                    jVar = new j(substring2, substring3, j2, str6, substring, z2, z3, z4, z5);
                                }
                            }
                        }
                        jVar = null;
                        i3 = 0;
                        if (jVar != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(jVar);
                        }
                        i11++;
                        i9 = i3;
                        unmodifiableList = list;
                        size = i2;
                    }
                }
                i2 = size;
                i3 = 0;
            }
            jVar = null;
            if (jVar != null) {
            }
            i11++;
            i9 = i3;
            unmodifiableList = list;
            size = i2;
        }
        if ((arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.emptyList()).isEmpty()) {
            return;
        }
        c0071b.getClass();
    }

    public static int e(int i2, String str, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }
}
