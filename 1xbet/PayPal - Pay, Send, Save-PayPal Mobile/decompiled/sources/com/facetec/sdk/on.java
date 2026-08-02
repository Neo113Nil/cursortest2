package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class on {
    static final com.facetec.sdk.pq e = com.facetec.sdk.pq.d("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final java.lang.String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: a, reason: collision with root package name */
    private static java.lang.String[] f3725a = new java.lang.String[64];
    private static java.lang.String[] c = new java.lang.String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            java.lang.String[] strArr = c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = com.facetec.sdk.nh.c("%8s", java.lang.Integer.toBinaryString(i2)).replace(' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            i2++;
        }
        java.lang.String[] strArr2 = f3725a;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(f3725a[i4]);
            sb.append("|PADDED");
            f3725a[i4 | 8] = sb.toString();
        }
        java.lang.String[] strArr3 = f3725a;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                java.lang.String[] strArr4 = f3725a;
                int i9 = i8 | i6;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(f3725a[i8]);
                sb2.append('|');
                sb2.append(f3725a[i6]);
                strArr4[i9] = sb2.toString();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(f3725a[i8]);
                sb3.append('|');
                sb3.append(f3725a[i6]);
                sb3.append("|PADDED");
                f3725a[i9 | 8] = sb3.toString();
            }
        }
        while (true) {
            java.lang.String[] strArr5 = f3725a;
            if (i >= strArr5.length) {
                return;
            }
            if (strArr5[i] == null) {
                strArr5[i] = c[i];
            }
            i++;
        }
    }

    private on() {
    }

    static java.lang.IllegalArgumentException c(java.lang.String str, java.lang.Object... objArr) {
        throw new java.lang.IllegalArgumentException(com.facetec.sdk.nh.c(str, objArr));
    }

    static java.io.IOException a(java.lang.String str, java.lang.Object... objArr) throws java.io.IOException {
        throw new java.io.IOException(com.facetec.sdk.nh.c(str, objArr));
    }

    static java.lang.String d(boolean z, int i, int i2, byte b2, byte b3) {
        java.lang.String str;
        java.lang.String[] strArr = b;
        java.lang.String c2 = b2 < strArr.length ? strArr[b2] : com.facetec.sdk.nh.c("0x%02x", java.lang.Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : c[b3];
                } else if (b2 != 7 && b2 != 8) {
                    java.lang.String[] strArr2 = f3725a;
                    java.lang.String str2 = b3 < strArr2.length ? strArr2[b3] : c[b3];
                    if (b2 == 5 && (b3 & 4) != 0) {
                        str = str2.replace("HEADERS", "PUSH_PROMISE");
                    } else {
                        str = (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str = c[b3];
        }
        return com.facetec.sdk.nh.c("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), c2, str);
    }
}
