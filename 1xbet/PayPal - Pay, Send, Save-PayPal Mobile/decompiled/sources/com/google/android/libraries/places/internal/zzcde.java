package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzcde {
    private static final java.lang.String[] zza = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final java.lang.String[] zzb = new java.lang.String[64];
    private static final java.lang.String[] zzc = new java.lang.String[256];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            zzc[i2] = java.lang.String.format("%8s", java.lang.Integer.toBinaryString(i2)).replace(' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        java.lang.String[] strArr = zzb;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[0];
            java.lang.String[] strArr2 = zzb;
            strArr2[i4 | 8] = java.lang.String.valueOf(strArr2[i4]).concat("|PADDED");
        }
        java.lang.String[] strArr3 = zzb;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        while (i5 < 3) {
            int i6 = iArr2[i5];
            for (int i7 = i; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                int i9 = i8 | i6;
                java.lang.String[] strArr4 = zzb;
                java.lang.String str = strArr4[i8];
                java.lang.String str2 = strArr4[i6];
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(str2).length());
                sb.append(str);
                sb.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb.append(str2);
                strArr4[i9] = sb.toString();
                java.lang.String str3 = strArr4[i8];
                java.lang.String str4 = strArr4[i6];
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str4).length() + 7);
                sb2.append(str3);
                sb2.append(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                sb2.append(str4);
                sb2.append("|PADDED");
                strArr4[i9 | 8] = sb2.toString();
            }
            i5++;
            i = 0;
        }
        for (int i10 = 0; i10 < 64; i10++) {
            java.lang.String[] strArr5 = zzb;
            if (strArr5[i10] == null) {
                strArr5[i10] = zzc[i10];
            }
        }
    }

    static java.lang.String zza(boolean z, int i, int i2, byte b, byte b2) {
        java.lang.String str;
        java.lang.String format = b < 10 ? zza[b] : java.lang.String.format("0x%02x", java.lang.Byte.valueOf(b));
        if (b2 == 0) {
            str = "";
        } else {
            if (b != 2 && b != 3) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : zzc[b2];
                } else if (b != 7 && b != 8) {
                    java.lang.String str2 = b2 < 64 ? zzb[b2] : zzc[b2];
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            str = str2.replace("HEADERS", "PUSH_PROMISE");
                        }
                        str = str2;
                    } else {
                        if (b == 0 && (b2 & 32) != 0) {
                            str = str2.replace("PRIORITY", "COMPRESSED");
                        }
                        str = str2;
                    }
                }
            }
            str = zzc[b2];
        }
        return java.lang.String.format(java.util.Locale.US, "%s 0x%08x %5d %-13s %s", true != z ? ">>" : "<<", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), format, str);
    }

    zzcde() {
    }
}
