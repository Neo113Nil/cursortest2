package com.google.zxing.qrcode.encoder;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.location.LocationRequestCompat;
import androidx.media3.extractor.ts.TsExtractor;
import java.util.Arrays;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public final class d {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, -1}, new int[]{6, 26, 52, 78, LocationRequestCompat.QUALITY_LOW_POWER, 130, -1}, new int[]{6, 30, 56, 82, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, WebSocketProtocol.PAYLOAD_SHORT, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, TsExtractor.TS_STREAM_TYPE_DTS_HD, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARN: Removed duplicated region for block: B:100:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(com.google.zxing.common.a aVar, int i, com.google.zxing.qrcode.decoder.b bVar, int i2, b bVar2) throws com.google.zxing.c {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = bVar.a;
        byte[][] bArr = bVar2.a;
        int i12 = bVar2.b;
        int i13 = bVar2.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = a[0].length;
        d(0, 0, bVar2);
        int i14 = i12 - length;
        d(i14, 0, bVar2);
        d(0, i14, bVar2);
        c(0, 7, bVar2);
        int i15 = i12 - 8;
        c(i15, 7, bVar2);
        c(0, i15, bVar2);
        e(7, 0, bVar2);
        int i16 = i13 - 8;
        e(i16, 0, bVar2);
        int i17 = i13 - 7;
        e(7, i17, bVar2);
        if (bVar2.a(8, i16) == 0) {
            throw new com.google.zxing.c();
        }
        bVar2.b(8, i16, 1);
        if (i11 < 2) {
            i3 = 0;
            i4 = 1;
        } else {
            i3 = 0;
            int[] iArr = c[i11 - 1];
            i4 = 1;
            int length2 = iArr.length;
            int i18 = 0;
            while (i18 < length2) {
                int i19 = iArr[i18];
                if (i19 >= 0) {
                    int length3 = iArr.length;
                    int i20 = 0;
                    while (i20 < length3) {
                        int i21 = iArr[i20];
                        if (i21 >= 0 && f(bVar2.a(i21, i19))) {
                            int i22 = i21 - 2;
                            int i23 = i19 - 2;
                            i5 = length3;
                            i6 = i12;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= 5) {
                                    break;
                                }
                                int[] iArr2 = b[i24];
                                int i25 = i24;
                                int i26 = 0;
                                for (int i27 = 5; i26 < i27; i27 = 5) {
                                    int i28 = i26;
                                    bVar2.b(i22 + i26, i23 + i25, iArr2[i28]);
                                    i26 = i28 + 1;
                                    iArr = iArr;
                                }
                                i24 = i25 + 1;
                            }
                        } else {
                            i5 = length3;
                            i6 = i12;
                        }
                        i20++;
                        length3 = i5;
                        i12 = i6;
                        iArr = iArr;
                    }
                }
                i18++;
                i12 = i12;
                iArr = iArr;
            }
        }
        int i29 = i12;
        int i30 = 8;
        while (i30 < i15) {
            int i31 = i30 + 1;
            int i32 = i31 % 2;
            if (f(bVar2.a(i30, 6))) {
                bVar2.b(i30, 6, i32);
            }
            if (f(bVar2.a(6, i30))) {
                bVar2.b(6, i30, i32);
            }
            i30 = i31;
        }
        com.google.zxing.common.a aVar2 = new com.google.zxing.common.a();
        if (i2 < 0 || i2 >= 8) {
            throw new com.google.zxing.c("Invalid mask pattern");
        }
        int i33 = 1;
        if (i != 1) {
            i33 = 2;
            if (i == 2) {
                i33 = 0;
            } else if (i == 3) {
                i33 = 3;
            } else if (i != 4) {
                throw null;
            }
        }
        int i34 = (i33 << 3) | i2;
        aVar2.b(i34, 5);
        aVar2.b(b(i34, 1335), 10);
        com.google.zxing.common.a aVar3 = new com.google.zxing.common.a();
        aVar3.b(21522, 15);
        if (aVar2.b != aVar3.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i35 = i3;
        while (true) {
            int[] iArr3 = aVar2.a;
            if (i35 >= iArr3.length) {
                break;
            }
            iArr3[i35] = iArr3[i35] ^ aVar3.a[i35];
            i35++;
        }
        if (aVar2.b != 15) {
            throw new com.google.zxing.c("should not happen but we got: " + aVar2.b);
        }
        int i36 = i3;
        while (true) {
            int i37 = aVar2.b;
            if (i36 >= i37) {
                break;
            }
            boolean d2 = aVar2.d((i37 - 1) - i36);
            int[] iArr4 = d[i36];
            bVar2.c(iArr4[i3], iArr4[i4], d2);
            if (i36 < 8) {
                bVar2.c((i29 - i36) - 1, 8, d2);
            } else {
                bVar2.c(8, (i36 - 8) + i17, d2);
            }
            i36++;
        }
        if (i11 >= 7) {
            com.google.zxing.common.a aVar4 = new com.google.zxing.common.a();
            aVar4.b(i11, 6);
            aVar4.b(b(i11, 7973), 12);
            if (aVar4.b != 18) {
                throw new com.google.zxing.c("should not happen but we got: " + aVar4.b);
            }
            int i38 = 17;
            for (int i39 = i3; i39 < 6; i39++) {
                for (int i40 = i3; i40 < 3; i40++) {
                    boolean d3 = aVar4.d(i38);
                    i38--;
                    int i41 = (i13 - 11) + i40;
                    bVar2.c(i39, i41, d3);
                    bVar2.c(i41, i39, d3);
                }
            }
        }
        int i42 = i29 - 1;
        int i43 = i13 - 1;
        int i44 = i3;
        int i45 = -1;
        while (i42 > 0) {
            if (i42 == 6) {
                i42--;
            }
            while (i43 >= 0 && i43 < i13) {
                for (int i46 = i3; i46 < 2; i46++) {
                    int i47 = i42 - i46;
                    if (f(bVar2.a(i47, i43))) {
                        if (i44 < aVar.b) {
                            z = aVar.d(i44);
                            i44++;
                        } else {
                            z = i3;
                        }
                        if (i2 != -1) {
                            switch (i2) {
                                case 0:
                                    i7 = i43 + i47;
                                    i8 = i7 & 1;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i8 = i43 & 1;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 2:
                                    i8 = i47 % 3;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 3:
                                    i8 = (i43 + i47) % 3;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 4:
                                    i8 = ((i47 / 3) + (i43 / 2)) & 1;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 5:
                                    int i48 = i43 * i47;
                                    i8 = (i48 % 3) + (i48 & 1);
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 6:
                                    int i49 = i43 * i47;
                                    i9 = i49 & 1;
                                    i10 = i49 % 3;
                                    i7 = i10 + i9;
                                    i8 = i7 & 1;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                case 7:
                                    i10 = (i43 * i47) % 3;
                                    i9 = (i43 + i47) & 1;
                                    i7 = i10 + i9;
                                    i8 = i7 & 1;
                                    if ((i8 != 0 ? i4 : i3) != 0) {
                                    }
                                    break;
                                default:
                                    throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i2)));
                            }
                        }
                        bVar2.c(i47, i43, z);
                    }
                }
                i43 += i45;
            }
            i45 = -i45;
            i43 += i45;
            i42 -= 2;
        }
        if (i44 == aVar.b) {
            return;
        }
        throw new com.google.zxing.c("Not all bits consumed: " + i44 + '/' + aVar.b);
    }

    public static int b(int i, int i2) {
        if (i2 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
        int i3 = 32 - numberOfLeadingZeros;
        int i4 = i << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i4) >= i3) {
            i4 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i4)) - i3);
        }
        return i4;
    }

    public static void c(int i, int i2, b bVar) throws com.google.zxing.c {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (!f(bVar.a(i4, i2))) {
                throw new com.google.zxing.c();
            }
            bVar.b(i4, i2, 0);
        }
    }

    public static void d(int i, int i2, b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.b(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void e(int i, int i2, b bVar) throws com.google.zxing.c {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (!f(bVar.a(i, i4))) {
                throw new com.google.zxing.c();
            }
            bVar.b(i, i4, 0);
        }
    }

    public static boolean f(int i) {
        return i == -1;
    }
}
