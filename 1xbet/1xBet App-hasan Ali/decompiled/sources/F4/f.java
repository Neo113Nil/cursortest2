package F4;

import L4.C0229l;
import n.AbstractC2107A;
import o4.AbstractC2234l;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0229l f1590a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1591b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1592c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1593d;

    static {
        C0229l c0229l = C0229l.f3092n;
        f1590a = j3.i.q("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1591b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1592c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            kotlin.jvm.internal.l.e("toBinaryString(it)", binaryString);
            String replace = z4.b.h("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.l.e("replace(...)", replace);
            strArr[i] = replace;
        }
        f1593d = strArr;
        String[] strArr2 = f1592c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i5 = iArr[0];
        strArr2[i5 | 8] = AbstractC2107A.u(new StringBuilder(), strArr2[i5], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i6 = 0; i6 < 3; i6++) {
            int i7 = iArr2[i6];
            int i8 = iArr[0];
            String[] strArr3 = f1592c;
            int i9 = i8 | i7;
            strArr3[i9] = strArr3[i8] + '|' + strArr3[i7];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i8]);
            sb.append('|');
            strArr3[i9 | 8] = AbstractC2107A.u(sb, strArr3[i7], "|PADDED");
        }
        int length = f1592c.length;
        for (int i10 = 0; i10 < length; i10++) {
            String[] strArr4 = f1592c;
            if (strArr4[i10] == null) {
                strArr4[i10] = f1593d[i10];
            }
        }
    }

    public static String a(boolean z3, int i, int i5, int i6, int i7) {
        String str;
        String str2;
        String[] strArr = f1591b;
        String h3 = i6 < strArr.length ? strArr[i6] : z4.b.h("0x%02x", Integer.valueOf(i6));
        if (i7 == 0) {
            str = "";
        } else {
            String[] strArr2 = f1593d;
            if (i6 != 2 && i6 != 3) {
                if (i6 == 4 || i6 == 6) {
                    str = i7 == 1 ? "ACK" : strArr2[i7];
                } else if (i6 != 7 && i6 != 8) {
                    String[] strArr3 = f1592c;
                    if (i7 < strArr3.length) {
                        str2 = strArr3[i7];
                        kotlin.jvm.internal.l.c(str2);
                    } else {
                        str2 = strArr2[i7];
                    }
                    str = (i6 != 5 || (i7 & 4) == 0) ? (i6 != 0 || (i7 & 32) == 0) ? str2 : AbstractC2234l.v0(str2, "PRIORITY", "COMPRESSED") : AbstractC2234l.v0(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i7];
        }
        return z4.b.h("%s 0x%08x %5d %-13s %s", z3 ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i5), h3, str);
    }
}
