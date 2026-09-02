package o1;

import java.io.IOException;
import java.util.Locale;
import p.AbstractC0819i;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final s1.h f6281a = s1.h.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f6282b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f6283c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f6284d = new String[256];

    static {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr = f6284d;
            if (i3 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i3)};
            byte[] bArr = j1.d.f6053a;
            strArr[i3] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i3++;
        }
        String[] strArr2 = f6283c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i4 = iArr[0];
        strArr2[i4 | 8] = AbstractC0819i.b(new StringBuilder(), strArr2[i4], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            int i7 = iArr[0];
            String[] strArr3 = f6283c;
            int i8 = i7 | i6;
            strArr3[i8] = strArr3[i7] + '|' + strArr3[i6];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i7]);
            sb.append('|');
            strArr3[i8 | 8] = AbstractC0819i.b(sb, strArr3[i6], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f6283c;
            if (i2 >= strArr4.length) {
                return;
            }
            if (strArr4[i2] == null) {
                strArr4[i2] = f6284d[i2];
            }
            i2++;
        }
    }

    public static String a(boolean z2, int i2, int i3, byte b2, byte b3) {
        String format;
        String str;
        String[] strArr = f6282b;
        if (b2 < strArr.length) {
            format = strArr[b2];
        } else {
            Object[] objArr = {Byte.valueOf(b2)};
            byte[] bArr = j1.d.f6053a;
            format = String.format(Locale.US, "0x%02x", objArr);
        }
        if (b3 == 0) {
            str = "";
        } else {
            String[] strArr2 = f6284d;
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : strArr2[b3];
                } else if (b2 != 7 && b2 != 8) {
                    String[] strArr3 = f6283c;
                    String str2 = b3 < strArr3.length ? strArr3[b3] : strArr2[b3];
                    str = (b2 != 5 || (4 & b3) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[b3];
        }
        Object[] objArr2 = {z2 ? "<<" : ">>", Integer.valueOf(i2), Integer.valueOf(i3), format, str};
        byte[] bArr2 = j1.d.f6053a;
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", objArr2);
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = j1.d.f6053a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) {
        byte[] bArr = j1.d.f6053a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
