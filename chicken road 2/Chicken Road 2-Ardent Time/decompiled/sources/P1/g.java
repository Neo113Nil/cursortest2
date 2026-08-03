package P1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final V1.j f1479a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f1480b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f1481c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f1482d;

    static {
        V1.j jVar = V1.j.f1765d;
        f1479a = m0.j.j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f1480b = new java.lang.String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f1481c = new java.lang.String[64];
        java.lang.String[] strArr = new java.lang.String[256];
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            java.lang.String binaryString = java.lang.Integer.toBinaryString(i3);
            kotlin.jvm.internal.i.d(binaryString, "toBinaryString(it)");
            java.lang.String replace = J1.b.i("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.i.d(replace, "replace(...)");
            strArr[i3] = replace;
        }
        f1482d = strArr;
        java.lang.String[] strArr2 = f1481c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = kotlin.jvm.internal.i.h("|PADDED", strArr2[i4]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr2[i5];
            i5++;
            int i7 = iArr[0];
            java.lang.String[] strArr3 = f1481c;
            int i8 = i7 | i6;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) strArr3[i7]);
            sb.append('|');
            sb.append((java.lang.Object) strArr3[i6]);
            strArr3[i8] = sb.toString();
            strArr3[i8 | 8] = ((java.lang.Object) strArr3[i7]) + '|' + ((java.lang.Object) strArr3[i6]) + "|PADDED";
        }
        int length = f1481c.length;
        while (i2 < length) {
            int i9 = i2 + 1;
            java.lang.String[] strArr4 = f1481c;
            if (strArr4[i2] == null) {
                strArr4[i2] = f1482d[i2];
            }
            i2 = i9;
        }
    }

    public static java.lang.String a(boolean z2, int i2, int i3, int i4, int i5) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String[] strArr = f1480b;
        java.lang.String i6 = i4 < strArr.length ? strArr[i4] : J1.b.i("0x%02x", java.lang.Integer.valueOf(i4));
        if (i5 == 0) {
            str = "";
        } else {
            java.lang.String[] strArr2 = f1482d;
            if (i4 != 2 && i4 != 3) {
                if (i4 == 4 || i4 == 6) {
                    str = i5 == 1 ? "ACK" : strArr2[i5];
                } else if (i4 != 7 && i4 != 8) {
                    java.lang.String[] strArr3 = f1481c;
                    if (i5 < strArr3.length) {
                        str2 = strArr3[i5];
                        kotlin.jvm.internal.i.b(str2);
                    } else {
                        str2 = strArr2[i5];
                    }
                    str = (i4 != 5 || (i5 & 4) == 0) ? (i4 != 0 || (i5 & 32) == 0) ? str2 : y1.o.I(str2, "PRIORITY", "COMPRESSED") : y1.o.I(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[i5];
        }
        return J1.b.i("%s 0x%08x %5d %-13s %s", z2 ? "<<" : ">>", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), i6, str);
    }
}
