package Z5;

import java.util.Locale;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7906a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f7907b = new String[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f7908c = new String[256];

    static {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            String[] strArr = f7908c;
            if (i8 >= strArr.length) {
                break;
            }
            strArr[i8] = String.format("%8s", Integer.toBinaryString(i8)).replace(' ', '0');
            i8++;
        }
        String[] strArr2 = f7907b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i9 = iArr[0];
        strArr2[i9 | 8] = k.i(new StringBuilder(), strArr2[i9], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr2[i10];
            int i12 = iArr[0];
            String[] strArr3 = f7907b;
            int i13 = i12 | i11;
            strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i12]);
            sb.append('|');
            strArr3[i13 | 8] = k.i(sb, strArr3[i11], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f7907b;
            if (i7 >= strArr4.length) {
                return;
            }
            if (strArr4[i7] == null) {
                strArr4[i7] = f7908c[i7];
            }
            i7++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static String a(boolean z4, int i7, int i8, byte b7, byte b8) {
        String strReplace;
        String str = b7 < 10 ? f7906a[b7] : String.format("0x%02x", Byte.valueOf(b7));
        if (b8 == 0) {
            strReplace = "";
        } else {
            String[] strArr = f7908c;
            if (b7 == 2 || b7 == 3) {
                strReplace = strArr[b8];
            } else if (b7 == 4 || b7 == 6) {
                strReplace = b8 == 1 ? "ACK" : strArr[b8];
            } else if (b7 == 7 || b7 == 8) {
                strReplace = strArr[b8];
            } else {
                String str2 = b8 < 64 ? f7907b[b8] : strArr[b8];
                if (b7 != 5 || (b8 & 4) == 0) {
                    strReplace = (b7 != 0 || (b8 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                } else {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z4 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), str, strReplace);
    }
}
