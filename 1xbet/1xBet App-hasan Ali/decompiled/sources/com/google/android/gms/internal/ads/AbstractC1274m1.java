package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1274m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14455a;

    static {
        int i = AbstractC1260lo.f14419a;
        f14455a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    public static C0771aq b(C1617tm c1617tm) {
        long C5;
        long C6;
        c1617tm.j(8);
        if (a(c1617tm.q()) == 0) {
            C5 = c1617tm.D();
            C6 = c1617tm.D();
        } else {
            C5 = c1617tm.C();
            C6 = c1617tm.C();
        }
        return new C0771aq(C5, C6, c1617tm.D());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0334 A[ADDED_TO_REGION, LOOP:14: B:255:0x0334->B:258:0x033f, LOOP_START, PHI: r12
      0x0334: PHI (r12v11 int) = (r12v3 int), (r12v12 int) binds: [B:254:0x0332, B:258:0x033f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0324 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static A1 c(C1768x1 c1768x1, C0859cp c0859cp, N n5) {
        P0.h hVar;
        int i;
        long j5;
        int i5;
        int i6;
        int i7;
        C1216kp e3;
        boolean z3;
        C1617tm c1617tm;
        C1617tm c1617tm2;
        int i8;
        int i9;
        int i10;
        int a5;
        C1617tm c1617tm3;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        long j6;
        C1768x1 c1768x12;
        int i15;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        int i16;
        long[] jArr3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        long j7;
        int i23;
        C1768x1 c1768x13;
        long[] jArr4;
        int i24;
        long j8;
        int i25;
        int[] iArr3;
        long j9;
        int i26;
        int i27;
        int i28;
        long[] jArr5;
        long[] jArr6;
        int i29;
        C1768x1 c1768x14;
        int i30;
        int i31;
        long j10;
        int length;
        long j11;
        C1768x1 c1768x15 = c1768x1;
        C1216kp e5 = c0859cp.e(1937011578);
        C1407p c1407p = c1768x15.f16207g;
        if (e5 != null) {
            C0783b1 c0783b1 = new C0783b1();
            C1617tm c1617tm4 = e5.f14290c;
            c0783b1.f12753m = c1617tm4;
            c1617tm4.j(12);
            int y5 = c1617tm4.y();
            if ("audio/raw".equals(c1407p.f14904m)) {
                int n6 = AbstractC1260lo.n(c1407p.f14888D) * c1407p.f14886B;
                if (y5 == 0 || y5 % n6 != 0) {
                    JB.l("BoxParsers", "Audio sample size mismatch. stsd sample size: " + n6 + ", stsz sample size: " + y5);
                    y5 = n6;
                }
            }
            if (y5 == 0) {
                y5 = -1;
            }
            c0783b1.f12751k = y5;
            c0783b1.f12752l = c1617tm4.y();
            hVar = c0783b1;
        } else {
            C1216kp e6 = c0859cp.e(1937013298);
            if (e6 == null) {
                throw B7.a(null, "Track has no sample table size information");
            }
            hVar = new P0.h(e6);
        }
        int d5 = hVar.d();
        if (d5 == 0) {
            return new A1(c1768x15, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        P0.h hVar2 = hVar;
        if (c1768x15.f16203b == 2) {
            long j12 = c1768x15.f;
            if (j12 > 0) {
                c1407p.getClass();
                C1649uH c1649uH = new C1649uH(c1407p);
                c1649uH.f15857u = d5 / (j12 / 1000000.0f);
                j5 = 0;
                i7 = 0;
                i = d5;
                i5 = 1;
                i6 = -1;
                c1768x15 = new C1768x1(c1768x15.f16202a, c1768x15.f16203b, c1768x15.f16204c, c1768x15.f16205d, c1768x15.f16206e, c1768x15.f, new C1407p(c1649uH), c1768x15.f16208h, c1768x15.f16211l, c1768x15.f16210k, c1768x15.i, c1768x15.f16209j);
                e3 = c0859cp.e(1937007471);
                if (e3 != null) {
                    e3 = c0859cp.e(1668232756);
                    e3.getClass();
                    z3 = i5;
                } else {
                    z3 = i7;
                }
                C1216kp e7 = c0859cp.e(1937011555);
                e7.getClass();
                C1216kp e8 = c0859cp.e(1937011827);
                e8.getClass();
                C1216kp e9 = c0859cp.e(1937011571);
                c1617tm = e9 == null ? e9.f14290c : null;
                C1216kp e10 = c0859cp.e(1668576371);
                c1617tm2 = e10 == null ? e10.f14290c : null;
                C1139j1 c1139j1 = new C1139j1(e7.f14290c, e3.f14290c, z3);
                C1617tm c1617tm5 = e8.f14290c;
                c1617tm5.j(12);
                int y6 = c1617tm5.y() - 1;
                int y7 = c1617tm5.y();
                int y8 = c1617tm5.y();
                if (c1617tm2 == null) {
                    c1617tm2.j(12);
                    i8 = c1617tm2.y();
                } else {
                    i8 = i7;
                }
                if (c1617tm == null) {
                    c1617tm.j(12);
                    i9 = c1617tm.y();
                    if (i9 > 0) {
                        i10 = c1617tm.y() - 1;
                    } else {
                        i10 = i6;
                        c1617tm = null;
                    }
                } else {
                    i9 = i7;
                    i10 = i6;
                }
                a5 = hVar2.a();
                C1407p c1407p2 = c1768x15.f16207g;
                c1617tm3 = c1617tm2;
                if (a5 != i6) {
                    String str = c1407p2.f14904m;
                    if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && y6 == 0) {
                        if (i8 == 0 && i9 == 0) {
                            int i32 = c1139j1.f14045a;
                            long[] jArr7 = new long[i32];
                            int[] iArr4 = new int[i32];
                            while (c1139j1.a()) {
                                int i33 = c1139j1.f14046b;
                                jArr7[i33] = c1139j1.f14048d;
                                iArr4[i33] = c1139j1.f14047c;
                            }
                            long j13 = y8;
                            int i34 = 8192 / a5;
                            int i35 = i7;
                            int i36 = i35;
                            while (i35 < i32) {
                                int i37 = iArr4[i35];
                                int i38 = AbstractC1260lo.f14419a;
                                i36 += ((i37 + i34) - 1) / i34;
                                i35++;
                            }
                            jArr4 = new long[i36];
                            iArr3 = new int[i36];
                            jArr2 = new long[i36];
                            iArr2 = new int[i36];
                            int i39 = i7;
                            int i40 = i39;
                            i25 = i40;
                            int i41 = i25;
                            while (i39 < i32) {
                                int i42 = iArr4[i39];
                                long j14 = jArr7[i39];
                                int i43 = i41;
                                int i44 = i32;
                                int i45 = i25;
                                int i46 = i43;
                                long[] jArr8 = jArr7;
                                int i47 = i42;
                                while (i47 > 0) {
                                    int min = Math.min(i34, i47);
                                    jArr4[i46] = j14;
                                    int i48 = i47;
                                    int i49 = a5 * min;
                                    iArr3[i46] = i49;
                                    i45 = Math.max(i45, i49);
                                    jArr2[i46] = i40 * j13;
                                    iArr2[i46] = i5;
                                    j14 += iArr3[i46];
                                    i40 += min;
                                    i47 = i48 - min;
                                    i46++;
                                    iArr4 = iArr4;
                                }
                                i39++;
                                int i50 = i46;
                                i25 = i45;
                                i32 = i44;
                                i41 = i50;
                                jArr7 = jArr8;
                            }
                            j8 = j13 * i40;
                            i24 = i;
                            c1768x13 = c1768x15;
                            int[] iArr5 = iArr2;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            long u5 = AbstractC1260lo.u(j8, 1000000L, c1768x13.f16204c, roundingMode);
                            long j15 = c1768x13.f16204c;
                            jArr5 = c1768x13.i;
                            if (jArr5 != null) {
                                AbstractC1260lo.b(jArr2, j15);
                                return new A1(c1768x13, jArr4, iArr3, i25, jArr2, iArr5, u5);
                            }
                            long[] jArr9 = jArr4;
                            int[] iArr6 = iArr3;
                            int i51 = i25;
                            int length2 = jArr5.length;
                            int i52 = c1768x13.f16203b;
                            long[] jArr10 = c1768x13.f16209j;
                            if (length2 == 1 && i52 == 1 && (length = jArr2.length) >= 2) {
                                jArr10.getClass();
                                long j16 = jArr10[i7];
                                jArr6 = jArr10;
                                long u6 = j16 + AbstractC1260lo.u(jArr5[i7], c1768x13.f16204c, c1768x13.f16205d, roundingMode);
                                int i53 = length - 1;
                                int i54 = i7;
                                int max = Math.max(i54, Math.min(4, i53));
                                int max2 = Math.max(i54, Math.min(length - 4, i53));
                                long j17 = jArr2[i54];
                                if (j17 <= j16 && j16 < jArr2[max] && jArr2[max2] < u6 && u6 <= j8) {
                                    long u7 = AbstractC1260lo.u(j16 - j17, c1407p2.f14887C, c1768x13.f16204c, roundingMode);
                                    long u8 = AbstractC1260lo.u(j8 - u6, c1407p2.f14887C, c1768x13.f16204c, roundingMode);
                                    if (u7 != j5) {
                                        j11 = u7;
                                    } else if (u8 != j5) {
                                        j11 = j5;
                                    }
                                    if (j11 <= 2147483647L && u8 <= 2147483647L) {
                                        n5.f10758a = (int) j11;
                                        n5.f10759b = (int) u8;
                                        AbstractC1260lo.b(jArr2, j15);
                                        return new A1(c1768x13, jArr9, iArr6, i51, jArr2, iArr5, AbstractC1260lo.u(jArr5[0], 1000000L, c1768x13.f16205d, roundingMode));
                                    }
                                }
                            } else {
                                jArr6 = jArr10;
                            }
                            int length3 = jArr5.length;
                            if (length3 == 1) {
                                i29 = 0;
                                if (jArr5[0] == j5) {
                                    jArr6.getClass();
                                    long j18 = jArr6[0];
                                    for (int i55 = 0; i55 < jArr2.length; i55++) {
                                        jArr2[i55] = AbstractC1260lo.u(jArr2[i55] - j18, 1000000L, c1768x13.f16204c, RoundingMode.DOWN);
                                    }
                                    return new A1(c1768x13, jArr9, iArr6, i51, jArr2, iArr5, AbstractC1260lo.u(j8 - j18, 1000000L, c1768x13.f16204c, RoundingMode.DOWN));
                                }
                                length3 = 1;
                            } else {
                                i29 = 0;
                            }
                            int i56 = i52 == 1 ? 1 : i29;
                            int[] iArr7 = new int[length3];
                            int[] iArr8 = new int[length3];
                            jArr6.getClass();
                            int i57 = i56;
                            int i58 = i29;
                            int i59 = i58;
                            int i60 = i59;
                            int i61 = i60;
                            while (i61 < jArr5.length) {
                                int[] iArr9 = iArr7;
                                long j19 = jArr6[i61];
                                if (j19 != -1) {
                                    int i62 = i60;
                                    i30 = i61;
                                    long u9 = AbstractC1260lo.u(jArr5[i61], c1768x13.f16204c, c1768x13.f16205d, RoundingMode.DOWN);
                                    iArr9[i30] = AbstractC1260lo.j(jArr2, j19, true);
                                    while (true) {
                                        int i63 = iArr9[i30];
                                        if (i63 < 0 || (iArr5[i63] & 1) != 0) {
                                            break;
                                        }
                                        iArr9[i30] = i63 - 1;
                                    }
                                    long j20 = j19 + u9;
                                    int binarySearch = Arrays.binarySearch(jArr2, j20);
                                    if (binarySearch < 0) {
                                        binarySearch = ~binarySearch;
                                        j10 = j20;
                                    } else {
                                        while (true) {
                                            i31 = binarySearch + 1;
                                            j10 = j20;
                                            if (i31 >= jArr2.length || jArr2[i31] != j10) {
                                                break;
                                            }
                                            binarySearch = i31;
                                            j20 = j10;
                                        }
                                        if (i57 == 0) {
                                            binarySearch = i31;
                                        }
                                    }
                                    iArr8[i30] = binarySearch;
                                    if (i52 == 2) {
                                        while (true) {
                                            binarySearch = iArr8[i30];
                                            if (binarySearch >= jArr2.length - 1) {
                                                break;
                                            }
                                            int i64 = binarySearch + 1;
                                            if (jArr2[i64] > j10) {
                                                break;
                                            }
                                            iArr8[i30] = i64;
                                        }
                                    }
                                    int i65 = iArr9[i30];
                                    int i66 = (binarySearch - i65) + i59;
                                    int i67 = binarySearch;
                                    i60 = i62 | (i58 != i65 ? 1 : i29);
                                    i58 = i67;
                                    i59 = i66;
                                } else {
                                    i30 = i61;
                                }
                                i61 = i30 + 1;
                                iArr7 = iArr9;
                            }
                            int[] iArr10 = iArr7;
                            int i68 = i60 | (i59 != i24 ? 1 : i29);
                            long[] jArr11 = i68 != 0 ? new long[i59] : jArr9;
                            int[] iArr11 = i68 != 0 ? new int[i59] : iArr6;
                            if (1 == i68) {
                                i51 = i29;
                            }
                            int[] iArr12 = i68 != 0 ? new int[i59] : iArr5;
                            long[] jArr12 = new long[i59];
                            int i69 = i29;
                            int i70 = i69;
                            int i71 = i70;
                            int i72 = i51;
                            long j21 = j5;
                            while (i71 < jArr5.length) {
                                long j22 = jArr6[i71];
                                int i73 = iArr10[i71];
                                long[] jArr13 = jArr5;
                                int i74 = iArr8[i71];
                                long[] jArr14 = jArr12;
                                if (i68 != 0) {
                                    int i75 = i74 - i73;
                                    System.arraycopy(jArr9, i73, jArr11, i70, i75);
                                    System.arraycopy(iArr6, i73, iArr11, i70, i75);
                                    System.arraycopy(iArr5, i73, iArr12, i70, i75);
                                }
                                int i76 = i72;
                                while (i73 < i74) {
                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                    int i77 = i73;
                                    int i78 = i74;
                                    long u10 = AbstractC1260lo.u(j21, 1000000L, c1768x13.f16205d, roundingMode2);
                                    long u11 = AbstractC1260lo.u(jArr2[i77] - j22, 1000000L, c1768x13.f16204c, roundingMode2);
                                    i69 = ((u11 < j5 ? i29 : 1) ^ 1) | i69;
                                    jArr14[i70] = u10 + u11;
                                    if (i68 != 0 && iArr11[i70] > i76) {
                                        i76 = iArr6[i77];
                                    }
                                    i70++;
                                    i73 = i77 + 1;
                                    i74 = i78;
                                }
                                j21 += jArr13[i71];
                                i71++;
                                i72 = i76;
                                jArr5 = jArr13;
                                jArr12 = jArr14;
                            }
                            long[] jArr15 = jArr12;
                            long u12 = AbstractC1260lo.u(j21, 1000000L, c1768x13.f16205d, RoundingMode.DOWN);
                            if (i69 != 0) {
                                c1407p2.getClass();
                                C1649uH c1649uH2 = new C1649uH(c1407p2);
                                c1649uH2.f15854r = true;
                                c1768x14 = new C1768x1(c1768x13.f16202a, c1768x13.f16203b, c1768x13.f16204c, c1768x13.f16205d, c1768x13.f16206e, c1768x13.f, new C1407p(c1649uH2), c1768x13.f16208h, c1768x13.f16211l, c1768x13.f16210k, c1768x13.i, c1768x13.f16209j);
                            } else {
                                c1768x14 = c1768x13;
                            }
                            return new A1(c1768x14, jArr11, iArr11, i72, jArr15, iArr12, u12);
                        }
                        y6 = i7;
                    }
                }
                i11 = i;
                long[] jArr16 = new long[i11];
                iArr = new int[i11];
                long[] jArr17 = new long[i11];
                int i79 = y6;
                int[] iArr13 = new int[i11];
                int i80 = i79;
                int i81 = y7;
                i12 = i9;
                C1617tm c1617tm6 = c1617tm;
                i13 = i7;
                i14 = i13;
                int i82 = i14;
                int i83 = i82;
                int i84 = i83;
                j6 = j5;
                long j23 = j6;
                while (true) {
                    if (i14 < i11) {
                        int i85 = i11;
                        c1768x12 = c1768x15;
                        i15 = i13;
                        jArr = jArr16;
                        jArr2 = jArr17;
                        iArr2 = iArr13;
                        i14 = i85;
                        break;
                    }
                    j9 = j6;
                    int i86 = i5;
                    i15 = i13;
                    while (true) {
                        if (i15 != 0) {
                            i26 = i11;
                            i27 = i15;
                            i28 = i86;
                            break;
                        }
                        boolean a6 = c1139j1.a();
                        i26 = i11;
                        if (a6 == 0) {
                            i27 = i7;
                            i28 = a6;
                            break;
                        }
                        j9 = c1139j1.f14048d;
                        i15 = c1139j1.f14047c;
                        c1768x15 = c1768x15;
                        i11 = i26;
                        i86 = a6;
                    }
                    c1768x12 = c1768x15;
                    if (i28 == 0) {
                        JB.l("BoxParsers", "Unexpected end of chunk data");
                        jArr = Arrays.copyOf(jArr16, i14);
                        iArr = Arrays.copyOf(iArr, i14);
                        jArr2 = Arrays.copyOf(jArr17, i14);
                        iArr2 = Arrays.copyOf(iArr13, i14);
                        break;
                    }
                    if (c1617tm3 != null) {
                        while (true) {
                            if (i84 != 0) {
                                break;
                            }
                            if (i8 <= 0) {
                                i84 = i7;
                                break;
                            }
                            i8--;
                            i84 = c1617tm3.y();
                            i82 = c1617tm3.q();
                        }
                        i84--;
                    }
                    jArr16[i14] = j9;
                    int i87 = hVar2.i();
                    iArr[i14] = i87;
                    if (i87 > i83) {
                        i83 = i87;
                    }
                    int i88 = i27;
                    jArr17[i14] = j23 + i82;
                    iArr13[i14] = c1617tm6 == null ? i5 : i7;
                    if (i14 == i10) {
                        iArr13[i14] = i5;
                        i12--;
                        if (i12 > 0) {
                            c1617tm6.getClass();
                            i10 = c1617tm6.y() - 1;
                        }
                    }
                    j23 += y8;
                    int i89 = i81 - 1;
                    if (i89 != 0) {
                        i81 = i89;
                    } else if (i80 > 0) {
                        i80--;
                        i81 = c1617tm5.y();
                        y8 = c1617tm5.q();
                    } else {
                        i81 = i7;
                    }
                    j6 = j9 + iArr[i14];
                    i14++;
                    i13 = i88 - 1;
                    c1768x15 = c1768x12;
                    i11 = i26;
                }
                long j24 = j23 + i82;
                if (c1617tm3 != null) {
                    while (i8 > 0) {
                        if (c1617tm3.y() != 0) {
                            i16 = i7;
                            break;
                        }
                        c1617tm3.q();
                        i8--;
                    }
                }
                i16 = i5;
                if (i12 != 0) {
                    if (i81 != 0) {
                        jArr3 = jArr;
                        i17 = i16;
                        j7 = j24;
                        i18 = i7;
                        i19 = i81;
                    } else if (i15 == 0) {
                        if (i80 != 0) {
                            jArr3 = jArr;
                            i17 = i16;
                            j7 = j24;
                            i18 = i7;
                            i19 = i18;
                            i22 = i19;
                            i20 = i80;
                        } else if (i84 != 0) {
                            jArr3 = jArr;
                            i17 = i16;
                            j7 = j24;
                            i18 = i7;
                            i19 = i18;
                            i22 = i19;
                            i20 = i22;
                        } else if (i16 == 0) {
                            jArr3 = jArr;
                            j7 = j24;
                            i17 = i7;
                            i18 = i17;
                            i19 = i18;
                            i22 = i19;
                            i20 = i22;
                            i21 = i20;
                        } else {
                            jArr3 = jArr;
                            j7 = j24;
                            i23 = i14;
                            c1768x13 = c1768x12;
                            jArr4 = jArr3;
                            i24 = i23;
                            j8 = j7;
                            i25 = i83;
                            iArr3 = iArr;
                            int[] iArr52 = iArr2;
                            RoundingMode roundingMode3 = RoundingMode.DOWN;
                            long u52 = AbstractC1260lo.u(j8, 1000000L, c1768x13.f16204c, roundingMode3);
                            long j152 = c1768x13.f16204c;
                            jArr5 = c1768x13.i;
                            if (jArr5 != null) {
                            }
                        }
                        i21 = i84;
                    } else {
                        jArr3 = jArr;
                        i17 = i16;
                        j7 = j24;
                        i18 = i7;
                        i19 = i18;
                    }
                    i20 = i80;
                    i21 = i84;
                    i22 = i15;
                } else {
                    jArr3 = jArr;
                    i17 = i16;
                    i18 = i12;
                    i19 = i81;
                    i20 = i80;
                    i21 = i84;
                    i22 = i15;
                    j7 = j24;
                }
                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                i23 = i14;
                c1768x13 = c1768x12;
                sb.append(c1768x13.f16202a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i18);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i19);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i22);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i20);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i21);
                sb.append(i5 == i17 ? ", ctts invalid" : "");
                JB.l("BoxParsers", sb.toString());
                jArr4 = jArr3;
                i24 = i23;
                j8 = j7;
                i25 = i83;
                iArr3 = iArr;
                int[] iArr522 = iArr2;
                RoundingMode roundingMode32 = RoundingMode.DOWN;
                long u522 = AbstractC1260lo.u(j8, 1000000L, c1768x13.f16204c, roundingMode32);
                long j1522 = c1768x13.f16204c;
                jArr5 = c1768x13.i;
                if (jArr5 != null) {
                }
            }
        }
        i = d5;
        j5 = 0;
        i5 = 1;
        i6 = -1;
        i7 = 0;
        e3 = c0859cp.e(1937007471);
        if (e3 != null) {
        }
        C1216kp e72 = c0859cp.e(1937011555);
        e72.getClass();
        C1216kp e82 = c0859cp.e(1937011827);
        e82.getClass();
        C1216kp e92 = c0859cp.e(1937011571);
        if (e92 == null) {
        }
        C1216kp e102 = c0859cp.e(1668576371);
        if (e102 == null) {
        }
        C1139j1 c1139j12 = new C1139j1(e72.f14290c, e3.f14290c, z3);
        C1617tm c1617tm52 = e82.f14290c;
        c1617tm52.j(12);
        int y62 = c1617tm52.y() - 1;
        int y72 = c1617tm52.y();
        int y82 = c1617tm52.y();
        if (c1617tm2 == null) {
        }
        if (c1617tm == null) {
        }
        a5 = hVar2.a();
        C1407p c1407p22 = c1768x15.f16207g;
        c1617tm3 = c1617tm2;
        if (a5 != i6) {
        }
        i11 = i;
        long[] jArr162 = new long[i11];
        iArr = new int[i11];
        long[] jArr172 = new long[i11];
        int i792 = y62;
        int[] iArr132 = new int[i11];
        int i802 = i792;
        int i812 = y72;
        i12 = i9;
        C1617tm c1617tm62 = c1617tm;
        i13 = i7;
        i14 = i13;
        int i822 = i14;
        int i832 = i822;
        int i842 = i832;
        j6 = j5;
        long j232 = j6;
        while (true) {
            if (i14 < i11) {
            }
            j6 = j9 + iArr[i14];
            i14++;
            i13 = i88 - 1;
            c1768x15 = c1768x12;
            i11 = i26;
        }
        long j242 = j232 + i822;
        if (c1617tm3 != null) {
        }
        i16 = i5;
        if (i12 != 0) {
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
        i23 = i14;
        c1768x13 = c1768x12;
        sb2.append(c1768x13.f16202a);
        sb2.append(": remainingSynchronizationSamples ");
        sb2.append(i18);
        sb2.append(", remainingSamplesAtTimestampDelta ");
        sb2.append(i19);
        sb2.append(", remainingSamplesInChunk ");
        sb2.append(i22);
        sb2.append(", remainingTimestampDeltaChanges ");
        sb2.append(i20);
        sb2.append(", remainingSamplesAtTimestampOffset ");
        sb2.append(i21);
        sb2.append(i5 == i17 ? ", ctts invalid" : "");
        JB.l("BoxParsers", sb2.toString());
        jArr4 = jArr3;
        i24 = i23;
        j8 = j7;
        i25 = i832;
        iArr3 = iArr;
        int[] iArr5222 = iArr2;
        RoundingMode roundingMode322 = RoundingMode.DOWN;
        long u5222 = AbstractC1260lo.u(j8, 1000000L, c1768x13.f16204c, roundingMode322);
        long j15222 = c1768x13.f16204c;
        jArr5 = c1768x13.i;
        if (jArr5 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        if (r7 == 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0a70, code lost:
    
        if (r12 == 1) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0a4c, code lost:
    
        if (r0.f(1) > 0) goto L488;
     */
    /* JADX WARN: Removed duplicated region for block: B:403:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0cf7  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0e63  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0e67  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0ed7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList d(C0859cp c0859cp, N n5, long j5, C1334nG c1334nG, boolean z3, boolean z5, InterfaceC1311mu interfaceC1311mu) {
        long j6;
        long j7;
        int i;
        long j8;
        long j9;
        long u5;
        int a5;
        int i5;
        int i6;
        C1216kp e3;
        ArrayList arrayList;
        String str;
        int i7;
        String str2;
        String str3;
        C0859cp c0859cp2;
        int i8;
        long[] jArr;
        long[] jArr2;
        C1407p c1407p;
        InterfaceC1311mu interfaceC1311mu2;
        C1768x1 c1768x1;
        Pair create;
        C0859cp c0859cp3;
        int i9;
        int i10;
        int i11;
        String str4;
        int i12;
        ArrayList arrayList2;
        C1334nG c1334nG2;
        String str5;
        String str6;
        int i13;
        String str7;
        String str8;
        int i14;
        int i15;
        int i16;
        boolean z6;
        int i17;
        String str9;
        int i18;
        List list;
        M0.e eVar;
        String str10;
        int i19;
        int i20;
        String str11;
        C1071hd c1071hd;
        boolean z7;
        int i21;
        int f;
        String str12;
        int i22;
        int i23;
        boolean z8;
        int i24;
        int i25;
        int i26;
        C1242lE c1242lE;
        int i27;
        int i28;
        int f5;
        C1242lE c1242lE2;
        String str13;
        String str14;
        int i29;
        char c5;
        C1529ro c1529ro;
        int i30;
        int i31;
        boolean z9;
        int i32;
        String str15;
        boolean z10;
        boolean z11;
        boolean z12;
        C1334nG c1334nG3;
        C1334nG a6;
        String str16;
        C1617tm c1617tm;
        int i33;
        int i34;
        String str17;
        String str18;
        int i35;
        int i36;
        C1617tm c1617tm2;
        long j10;
        C1761wv c1761wv;
        ArrayList arrayList3;
        C0859cp c0859cp4 = c0859cp;
        String str19 = "BoxParsers";
        String str20 = "video/x-vnd.on2.vp9";
        String str21 = "video/hevc";
        int i37 = 4;
        int i38 = 16;
        int i39 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i40 = 0;
        int i41 = 6;
        while (true) {
            ArrayList arrayList5 = c0859cp4.f13046e;
            if (i40 >= arrayList5.size()) {
                return arrayList4;
            }
            C0859cp c0859cp5 = (C0859cp) arrayList5.get(i40);
            if (c0859cp5.f15911b != 1953653099) {
                str2 = str20;
                str3 = str21;
                i8 = i39;
                arrayList3 = arrayList4;
                str = str19;
                i7 = i40;
            } else {
                C1216kp e5 = c0859cp4.e(1836476516);
                e5.getClass();
                C0859cp d5 = c0859cp5.d(1835297121);
                d5.getClass();
                C1216kp e6 = d5.e(1751411826);
                e6.getClass();
                C1617tm c1617tm3 = e6.f14290c;
                c1617tm3.j(i38);
                int q5 = c1617tm3.q();
                boolean z13 = true;
                int i42 = q5 == 1936684398 ? 1 : q5 == 1986618469 ? 2 : (q5 == 1952807028 || q5 == 1935832172 || q5 == 1937072756 || q5 == 1668047728) ? 3 : q5 == 1835365473 ? 5 : -1;
                if (i42 == -1) {
                    interfaceC1311mu2 = interfaceC1311mu;
                    str2 = str20;
                    str3 = str21;
                    c0859cp2 = c0859cp5;
                    i8 = i39;
                    arrayList = arrayList4;
                    str = str19;
                    i7 = i40;
                    c1768x1 = null;
                } else {
                    C1216kp e7 = c0859cp5.e(1953196132);
                    e7.getClass();
                    C1617tm c1617tm4 = e7.f14290c;
                    c1617tm4.j(i39);
                    int a7 = a(c1617tm4.q());
                    if (a7 != 0) {
                        i39 = i38;
                    }
                    c1617tm4.k(i39);
                    int q6 = c1617tm4.q();
                    c1617tm4.k(i37);
                    int i43 = c1617tm4.f15725b;
                    int i44 = 0;
                    while (true) {
                        int i45 = a7 == 0 ? 4 : 8;
                        j6 = -9223372036854775807L;
                        if (i44 >= i45) {
                            c1617tm4.k(i45);
                            break;
                        }
                        if (c1617tm4.f15724a[i43 + i44] != -1) {
                            j7 = a7 == 0 ? c1617tm4.D() : c1617tm4.E();
                        } else {
                            i44++;
                        }
                    }
                    j7 = -9223372036854775807L;
                    c1617tm4.k(16);
                    int q7 = c1617tm4.q();
                    int q8 = c1617tm4.q();
                    c1617tm4.k(4);
                    int q9 = c1617tm4.q();
                    int q10 = c1617tm4.q();
                    String str22 = str20;
                    int i46 = 65536;
                    String str23 = str21;
                    if (q7 == 0) {
                        if (q8 == 65536) {
                            if (q9 != -65536) {
                                q8 = 65536;
                            } else if (q10 == 0) {
                                i = 90;
                                j8 = j5 == -9223372036854775807L ? j7 : j5;
                                long j11 = b(e5.f14290c).f12724m;
                                if (j8 == -9223372036854775807L) {
                                    j9 = j11;
                                    u5 = -9223372036854775807L;
                                } else {
                                    j9 = j11;
                                    u5 = AbstractC1260lo.u(j8, 1000000L, j9, RoundingMode.DOWN);
                                }
                                C0859cp d6 = d5.d(1835626086);
                                d6.getClass();
                                char c6 = 25196;
                                C0859cp d7 = d6.d(1937007212);
                                d7.getClass();
                                C1216kp e8 = d5.e(1835296868);
                                e8.getClass();
                                C1617tm c1617tm5 = e8.f14290c;
                                c1617tm5.j(8);
                                a5 = a(c1617tm5.q());
                                c1617tm5.k(a5 == 0 ? 8 : 16);
                                long D5 = c1617tm5.D();
                                int i47 = c1617tm5.f15725b;
                                i5 = 0;
                                while (true) {
                                    i6 = a5 == 0 ? 4 : 8;
                                    if (i5 >= i6) {
                                        c1617tm5.k(i6);
                                        break;
                                    }
                                    if (c1617tm5.f15724a[i47 + i5] != -1) {
                                        long D6 = a5 == 0 ? c1617tm5.D() : c1617tm5.E();
                                        if (D6 != 0) {
                                            j6 = AbstractC1260lo.u(D6, 1000000L, D5, RoundingMode.DOWN);
                                        }
                                    } else {
                                        i5++;
                                    }
                                }
                                int z14 = c1617tm5.z();
                                StringBuilder sb = new StringBuilder();
                                sb.append((char) (((z14 >> 10) & 31) + 96));
                                sb.append((char) (((z14 >> 5) & 31) + 96));
                                sb.append((char) ((z14 & 31) + 96));
                                String sb2 = sb.toString();
                                e3 = d7.e(1937011556);
                                if (e3 == null) {
                                    throw B7.a(null, "Malformed sample table (stbl) missing sample description (stsd)");
                                }
                                C1617tm c1617tm6 = e3.f14290c;
                                c1617tm6.j(12);
                                int q11 = c1617tm6.q();
                                M0.e eVar2 = new M0.e(q11);
                                int i48 = 0;
                                while (i48 < q11) {
                                    C0859cp c0859cp6 = c0859cp5;
                                    int i49 = c1617tm6.f15725b;
                                    int q12 = c1617tm6.q();
                                    String str24 = "childAtomSize must be positive";
                                    AbstractC1668us.G("childAtomSize must be positive", q12 > 0 ? z13 : false);
                                    int q13 = c1617tm6.q();
                                    int i50 = i49;
                                    if (q13 == 1635148593 || q13 == 1635148595 || q13 == 1701733238 || q13 == 1831958048 || q13 == 1836070006 || q13 == 1752589105 || q13 == 1751479857 || q13 == 1932670515 || q13 == 1211250227 || q13 == 1748121139 || q13 == 1987063864 || q13 == 1987063865 || q13 == 1635135537 || q13 == 1685479798 || q13 == 1685479729 || q13 == 1685481573 || q13 == 1685481521) {
                                        c0859cp3 = c0859cp6;
                                        int i51 = q6;
                                        i9 = i42;
                                        i10 = q11;
                                        i11 = i40;
                                        String str25 = str22;
                                        String str26 = str23;
                                        int i52 = 12;
                                        int i53 = 8;
                                        int i54 = i48;
                                        int i55 = q12;
                                        c1617tm6.j(i50 + 16);
                                        c1617tm6.k(16);
                                        int z15 = c1617tm6.z();
                                        int z16 = c1617tm6.z();
                                        str4 = sb2;
                                        c1617tm6.k(50);
                                        int i56 = c1617tm6.f15725b;
                                        i12 = i54;
                                        arrayList2 = arrayList4;
                                        int i57 = q13;
                                        int i58 = 1701733238;
                                        if (i57 == 1701733238) {
                                            Pair f6 = f(c1617tm6, i50, i55);
                                            if (f6 != null) {
                                                i58 = ((Integer) f6.first).intValue();
                                                if (c1334nG == null) {
                                                    i50 = i50;
                                                    a6 = null;
                                                } else {
                                                    i50 = i50;
                                                    a6 = c1334nG.a(((C1813y1) f6.second).f16378b);
                                                }
                                                c1334nG3 = a6;
                                                ((C1813y1[]) eVar2.f3592d)[i12] = (C1813y1) f6.second;
                                            } else {
                                                i50 = i50;
                                                c1334nG3 = c1334nG;
                                            }
                                            c1617tm6.j(i56);
                                            i57 = i58;
                                            c1334nG2 = c1334nG3;
                                        } else {
                                            i50 = i50;
                                            c1334nG2 = c1334nG;
                                        }
                                        if (i57 == 1831958048) {
                                            str5 = "video/mpeg";
                                        } else if (i57 == 1211250227) {
                                            i57 = 1211250227;
                                            str5 = "video/3gpp";
                                        } else {
                                            str5 = null;
                                        }
                                        int i59 = i;
                                        int i60 = i57;
                                        str6 = str25;
                                        String str27 = str5;
                                        String str28 = str19;
                                        int i61 = 8;
                                        int i62 = 8;
                                        float f7 = 1.0f;
                                        List list2 = null;
                                        C1071hd c1071hd2 = null;
                                        int i63 = -1;
                                        int i64 = -1;
                                        int i65 = -1;
                                        int i66 = -1;
                                        ByteBuffer byteBuffer = null;
                                        String str29 = null;
                                        boolean z17 = false;
                                        byte[] bArr = null;
                                        B.N n6 = null;
                                        C1334nG c1334nG4 = c1334nG2;
                                        int i67 = -1;
                                        while (i56 - i50 < i55) {
                                            c1617tm6.j(i56);
                                            int i68 = c1617tm6.f15725b;
                                            int q14 = c1617tm6.q();
                                            int i69 = i56;
                                            if (q14 != 0) {
                                                i15 = q14;
                                            } else {
                                                if (c1617tm6.f15725b - i50 == i55) {
                                                    break;
                                                }
                                                i15 = 0;
                                            }
                                            if (i15 > 0) {
                                                i16 = i55;
                                                z6 = true;
                                            } else {
                                                i16 = i55;
                                                z6 = false;
                                            }
                                            AbstractC1668us.G(str24, z6);
                                            int q15 = c1617tm6.q();
                                            if (q15 == 1635148611) {
                                                int i70 = i68 + 8;
                                                AbstractC1668us.G(null, str27 == null);
                                                c1617tm6.j(i70);
                                                C1631u a8 = C1631u.a(c1617tm6);
                                                eVar2.f3590b = a8.f15747b;
                                                if (z17) {
                                                    z12 = true;
                                                } else {
                                                    f7 = a8.f15754k;
                                                    z12 = false;
                                                }
                                                list2 = a8.f15746a;
                                                String str30 = a8.f15755l;
                                                int i71 = a8.f15753j;
                                                int i72 = a8.f15751g;
                                                int i73 = a8.f15752h;
                                                i64 = a8.i;
                                                i62 = a8.f15750e;
                                                z17 = z12;
                                                str9 = str24;
                                                str29 = str30;
                                                eVar = eVar2;
                                                i17 = i73;
                                                str10 = str26;
                                                str11 = str28;
                                                i61 = a8.f;
                                                c1071hd = c1071hd2;
                                                str27 = "video/avc";
                                                i66 = i71;
                                                i63 = i72;
                                            } else {
                                                if (q15 == 1752589123) {
                                                    int i74 = i68 + 8;
                                                    AbstractC1668us.G(null, str27 == null);
                                                    c1617tm6.j(i74);
                                                    O a9 = O.a(c1617tm6, false, null);
                                                    eVar2.f3590b = a9.f10880b;
                                                    if (z17) {
                                                        z11 = true;
                                                    } else {
                                                        f7 = a9.i;
                                                        z11 = false;
                                                    }
                                                    int i75 = a9.f10885h;
                                                    int i76 = i75 != -1 ? i75 : i65;
                                                    list2 = a9.f10879a;
                                                    int i77 = a9.f10886j;
                                                    String str31 = a9.f10887k;
                                                    int i78 = a9.f10883e;
                                                    int i79 = a9.f;
                                                    i64 = a9.f10884g;
                                                    i62 = a9.f10881c;
                                                    z17 = z11;
                                                    str9 = str24;
                                                    i66 = i77;
                                                    str29 = str31;
                                                    eVar = eVar2;
                                                    i63 = i78;
                                                    i17 = i79;
                                                    str10 = str26;
                                                    i61 = a9.f10882d;
                                                    str11 = str28;
                                                    c1071hd = a9.f10888l;
                                                    i65 = i76;
                                                    str27 = str10;
                                                } else {
                                                    if (q15 == 1818785347) {
                                                        int i80 = i68 + 8;
                                                        AbstractC1668us.G("lhvC must follow hvcC atom", str26.equals(str27));
                                                        if (c1071hd2 != null) {
                                                            z10 = ((AbstractC1044gv) c1071hd2.f13761l).size() >= 2;
                                                        } else {
                                                            z10 = false;
                                                            c1071hd2 = null;
                                                        }
                                                        AbstractC1668us.G("must have at least two layers", z10);
                                                        c1617tm6.j(i80);
                                                        c1071hd2.getClass();
                                                        O a10 = O.a(c1617tm6, true, c1071hd2);
                                                        AbstractC1668us.G("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", eVar2.f3590b == a10.f10880b);
                                                        int i81 = a10.f10883e;
                                                        if (i81 != -1) {
                                                            AbstractC1668us.G("colorSpace must be the same for both views", i63 == i81);
                                                        }
                                                        int i82 = a10.f;
                                                        if (i82 != -1) {
                                                            AbstractC1668us.G("colorRange must be the same for both views", i67 == i82);
                                                        }
                                                        int i83 = a10.f10884g;
                                                        if (i83 != -1) {
                                                            AbstractC1668us.G("colorTransfer must be the same for both views", i64 == i83);
                                                        }
                                                        AbstractC1668us.G("bitdepthLuma must be the same for both views", i62 == a10.f10881c);
                                                        AbstractC1668us.G("bitdepthChroma must be the same for both views", i61 == a10.f10882d);
                                                        if (list2 != null) {
                                                            C0909dv c0909dv = new C0909dv(4);
                                                            c0909dv.c(list2);
                                                            c0909dv.c(a10.f10879a);
                                                            list2 = c0909dv.f();
                                                        } else {
                                                            AbstractC1668us.G("initializationData must be already set from hvcC atom", false);
                                                        }
                                                        str29 = a10.f10887k;
                                                        i17 = i67;
                                                        str9 = str24;
                                                        str27 = "video/mv-hevc";
                                                        eVar = eVar2;
                                                        str10 = str26;
                                                        str11 = str28;
                                                    } else {
                                                        int i84 = 2;
                                                        if (q15 == 1986361461) {
                                                            c1617tm6.j(i68 + 8);
                                                            i17 = i67;
                                                            int i85 = c1617tm6.f15725b;
                                                            U4 u42 = null;
                                                            while (i85 - i68 < i15) {
                                                                c1617tm6.j(i85);
                                                                int q16 = c1617tm6.q();
                                                                if (q16 > 0) {
                                                                    i31 = i85;
                                                                    z9 = true;
                                                                } else {
                                                                    i31 = i85;
                                                                    z9 = false;
                                                                }
                                                                AbstractC1668us.G(str24, z9);
                                                                int i86 = i61;
                                                                if (c1617tm6.q() == 1702454643) {
                                                                    c1617tm6.j(i31 + 8);
                                                                    int i87 = c1617tm6.f15725b;
                                                                    while (true) {
                                                                        if (i87 - i31 >= q16) {
                                                                            i32 = q16;
                                                                            str15 = str24;
                                                                            u42 = null;
                                                                            break;
                                                                        }
                                                                        c1617tm6.j(i87);
                                                                        int q17 = c1617tm6.q();
                                                                        AbstractC1668us.G(str24, q17 > 0);
                                                                        i32 = q16;
                                                                        if (c1617tm6.q() == 1937011305) {
                                                                            c1617tm6.k(4);
                                                                            int v4 = c1617tm6.v();
                                                                            int i88 = v4 & 1;
                                                                            boolean z18 = (v4 & 2) == i84;
                                                                            boolean z19 = (v4 & 8) == i53;
                                                                            boolean z20 = 1 == i88;
                                                                            str15 = str24;
                                                                            J2.s sVar = new J2.s();
                                                                            sVar.f2729a = z20;
                                                                            sVar.f2730b = z18;
                                                                            sVar.f2731c = z19;
                                                                            u42 = new U4(1, sVar);
                                                                        } else {
                                                                            i87 += q17;
                                                                            q16 = i32;
                                                                            i53 = 8;
                                                                            i84 = 2;
                                                                        }
                                                                    }
                                                                } else {
                                                                    i32 = q16;
                                                                    str15 = str24;
                                                                }
                                                                i85 = i31 + i32;
                                                                i61 = i86;
                                                                str24 = str15;
                                                                i53 = 8;
                                                                i84 = 2;
                                                            }
                                                            str9 = str24;
                                                            i18 = i61;
                                                            if (u42 == null) {
                                                                i30 = 2;
                                                                c1529ro = null;
                                                            } else {
                                                                i30 = 2;
                                                                c1529ro = new C1529ro(2, u42);
                                                            }
                                                            if (c1529ro != null) {
                                                                J2.s sVar2 = (J2.s) ((U4) c1529ro.f15382l).f11722l;
                                                                if (c1071hd2 == null) {
                                                                    c1071hd2 = null;
                                                                } else if (((AbstractC1044gv) c1071hd2.f13761l).size() >= i30) {
                                                                    AbstractC1668us.G("both eye views must be marked as available", sVar2.f2729a && sVar2.f2730b);
                                                                    AbstractC1668us.G("for MV-HEVC, eye_views_reversed must be set to false", !sVar2.f2731c);
                                                                }
                                                                if (i65 == -1) {
                                                                    eVar = eVar2;
                                                                    str10 = str26;
                                                                    if (true != sVar2.f2731c) {
                                                                        str11 = str28;
                                                                        i61 = i18;
                                                                        i65 = 4;
                                                                    } else {
                                                                        str11 = str28;
                                                                        i61 = i18;
                                                                        i65 = 5;
                                                                    }
                                                                } else {
                                                                    eVar = eVar2;
                                                                    str10 = str26;
                                                                    str11 = str28;
                                                                    i61 = i18;
                                                                    c1071hd = c1071hd2;
                                                                }
                                                            }
                                                            list = list2;
                                                            eVar = eVar2;
                                                            str10 = str26;
                                                            i19 = i62;
                                                            i20 = i65;
                                                            str11 = str28;
                                                            c1071hd = c1071hd2;
                                                            i62 = i19;
                                                            i61 = i18;
                                                            list2 = list;
                                                            i65 = i20;
                                                        } else {
                                                            i17 = i67;
                                                            str9 = str24;
                                                            i18 = i61;
                                                            if (q15 == 1685480259 || q15 == 1685485123) {
                                                                list = list2;
                                                                eVar = eVar2;
                                                                str10 = str26;
                                                                i19 = i62;
                                                                i20 = i65;
                                                                str11 = str28;
                                                                c1071hd = c1071hd2;
                                                                Dx a11 = Dx.a(c1617tm6);
                                                                if (a11 != null) {
                                                                    str29 = a11.f8430l;
                                                                    str27 = "video/dolby-vision";
                                                                }
                                                            } else if (q15 == 1987076931) {
                                                                AbstractC1668us.G(null, str27 == null);
                                                                c1617tm6.j(i68 + 12);
                                                                byte v5 = (byte) c1617tm6.v();
                                                                byte v6 = (byte) c1617tm6.v();
                                                                int v7 = c1617tm6.v();
                                                                int i89 = v7 >> 4;
                                                                int i90 = v7 >> 1;
                                                                int i91 = i60;
                                                                if (i91 == 1987063864) {
                                                                    str13 = "video/x-vnd.on2.vp8";
                                                                    str14 = str6;
                                                                } else {
                                                                    str13 = str6;
                                                                    str14 = str13;
                                                                }
                                                                if (str13.equals(str14)) {
                                                                    byte[] bArr2 = AbstractC1120ii.f13966a;
                                                                    byte[] bArr3 = new byte[i52];
                                                                    bArr3[0] = 1;
                                                                    bArr3[1] = 1;
                                                                    bArr3[2] = v5;
                                                                    i29 = 1;
                                                                    bArr3[3] = 2;
                                                                    bArr3[4] = 1;
                                                                    c5 = 3;
                                                                    bArr3[5] = v6;
                                                                    bArr3[i41] = 3;
                                                                    bArr3[7] = 1;
                                                                    bArr3[8] = (byte) i89;
                                                                    bArr3[9] = 4;
                                                                    bArr3[10] = 1;
                                                                    bArr3[11] = (byte) (i90 & 7);
                                                                    list2 = AbstractC1044gv.n(bArr3);
                                                                } else {
                                                                    i29 = 1;
                                                                    c5 = 3;
                                                                }
                                                                int i92 = v7 & 1;
                                                                int v8 = c1617tm6.v();
                                                                int v9 = c1617tm6.v();
                                                                int a12 = C1242lE.a(v8);
                                                                i17 = i29 != i92 ? 2 : 1;
                                                                i63 = a12;
                                                                eVar = eVar2;
                                                                i60 = i91;
                                                                str27 = str13;
                                                                str10 = str26;
                                                                str6 = str14;
                                                                str11 = str28;
                                                                c1071hd = c1071hd2;
                                                                i64 = C1242lE.b(v9);
                                                                i61 = i89;
                                                                i62 = i61;
                                                            } else {
                                                                int i93 = i60;
                                                                int i94 = 5;
                                                                int i95 = 7;
                                                                if (q15 == 1635135811) {
                                                                    int i96 = i15 - 8;
                                                                    byte[] bArr4 = new byte[i96];
                                                                    c1617tm6.f(bArr4, 0, i96);
                                                                    C1761wv n7 = AbstractC1044gv.n(bArr4);
                                                                    c1617tm6.j(i68 + 8);
                                                                    byte[] bArr5 = c1617tm6.f15724a;
                                                                    C0826c0 c0826c0 = new C0826c0(bArr5.length, bArr5);
                                                                    c0826c0.s(c1617tm6.f15725b * 8);
                                                                    c0826c0.v(1);
                                                                    int f8 = c0826c0.f(3);
                                                                    c0826c0.u(i41);
                                                                    boolean w5 = c0826c0.w();
                                                                    boolean w6 = c0826c0.w();
                                                                    int i97 = -1;
                                                                    if (f8 == 2) {
                                                                        if (w5) {
                                                                            i21 = true != w6 ? 10 : 12;
                                                                            int i98 = i21;
                                                                            int i99 = 13;
                                                                            c0826c0.u(13);
                                                                            c0826c0.t();
                                                                            f = c0826c0.f(4);
                                                                            if (f == 1) {
                                                                                str12 = str28;
                                                                                JB.i(str12, "Unsupported obu_type: " + f);
                                                                                c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                            } else {
                                                                                str12 = str28;
                                                                                if (c0826c0.w()) {
                                                                                    JB.i(str12, "Unsupported obu_extension_flag");
                                                                                    c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                                } else {
                                                                                    boolean w7 = c0826c0.w();
                                                                                    c0826c0.t();
                                                                                    if (!w7 || c0826c0.f(8) <= 127) {
                                                                                        int f9 = c0826c0.f(3);
                                                                                        c0826c0.t();
                                                                                        if (c0826c0.w()) {
                                                                                            JB.i(str12, "Unsupported reduced_still_picture_header");
                                                                                            c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                                        } else if (c0826c0.w()) {
                                                                                            JB.i(str12, "Unsupported timing_info_present_flag");
                                                                                            c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                                        } else if (c0826c0.w()) {
                                                                                            JB.i(str12, "Unsupported initial_display_delay_present_flag");
                                                                                            c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                                        } else {
                                                                                            int f10 = c0826c0.f(5);
                                                                                            int i100 = 0;
                                                                                            while (i100 <= f10) {
                                                                                                c0826c0.u(12);
                                                                                                if (c0826c0.f(i94) > i95) {
                                                                                                    c0826c0.t();
                                                                                                }
                                                                                                i100++;
                                                                                                i94 = 5;
                                                                                                i95 = 7;
                                                                                            }
                                                                                            int f11 = c0826c0.f(4);
                                                                                            int f12 = c0826c0.f(4);
                                                                                            c0826c0.u(f11 + 1);
                                                                                            c0826c0.u(f12 + 1);
                                                                                            if (c0826c0.w()) {
                                                                                                i22 = 7;
                                                                                                c0826c0.u(7);
                                                                                            } else {
                                                                                                i22 = 7;
                                                                                            }
                                                                                            c0826c0.u(i22);
                                                                                            boolean w8 = c0826c0.w();
                                                                                            if (w8) {
                                                                                                c0826c0.u(2);
                                                                                            }
                                                                                            int i101 = c0826c0.w() ? 1 : 1;
                                                                                            if (!c0826c0.w()) {
                                                                                                c0826c0.u(i101);
                                                                                            }
                                                                                            if (w8) {
                                                                                                i23 = 3;
                                                                                                c0826c0.u(3);
                                                                                            } else {
                                                                                                i23 = 3;
                                                                                            }
                                                                                            c0826c0.u(i23);
                                                                                            boolean w9 = c0826c0.w();
                                                                                            if (f9 == 2) {
                                                                                                if (w9) {
                                                                                                    c0826c0.t();
                                                                                                }
                                                                                            }
                                                                                            if (c0826c0.w()) {
                                                                                                z8 = true;
                                                                                                if (c0826c0.w()) {
                                                                                                    i24 = -1;
                                                                                                    i25 = i98;
                                                                                                    i26 = -1;
                                                                                                } else {
                                                                                                    int f13 = c0826c0.f(8);
                                                                                                    int f14 = c0826c0.f(8);
                                                                                                    int f15 = c0826c0.f(8);
                                                                                                    if (z8) {
                                                                                                        i27 = 1;
                                                                                                    } else {
                                                                                                        i27 = 1;
                                                                                                        if (f13 == 1) {
                                                                                                            if (f14 != 13) {
                                                                                                                i99 = f14;
                                                                                                            } else if (f15 == 0) {
                                                                                                                f5 = 1;
                                                                                                                i28 = 1;
                                                                                                                i24 = C1242lE.a(i28);
                                                                                                                i25 = i98;
                                                                                                                i97 = f5 == i27 ? 1 : 2;
                                                                                                                i26 = C1242lE.b(i99);
                                                                                                            }
                                                                                                            i28 = 1;
                                                                                                            f5 = c0826c0.f(i27);
                                                                                                            i24 = C1242lE.a(i28);
                                                                                                            i25 = i98;
                                                                                                            i97 = f5 == i27 ? 1 : 2;
                                                                                                            i26 = C1242lE.b(i99);
                                                                                                        }
                                                                                                    }
                                                                                                    i99 = f14;
                                                                                                    i28 = f13;
                                                                                                    f5 = c0826c0.f(i27);
                                                                                                    i24 = C1242lE.a(i28);
                                                                                                    i25 = i98;
                                                                                                    i97 = f5 == i27 ? 1 : 2;
                                                                                                    i26 = C1242lE.b(i99);
                                                                                                }
                                                                                                c1242lE = new C1242lE(i24, i97, i26, i21, i25, null);
                                                                                                int i102 = c1242lE.f14336e;
                                                                                                int i103 = c1242lE.f;
                                                                                                i63 = c1242lE.f14332a;
                                                                                                c1071hd = c1071hd2;
                                                                                                eVar = eVar2;
                                                                                                i60 = i93;
                                                                                                i17 = c1242lE.f14333b;
                                                                                                str10 = str26;
                                                                                                i41 = 6;
                                                                                                i64 = c1242lE.f14334c;
                                                                                                i61 = i103;
                                                                                                str27 = "video/av01";
                                                                                                i62 = i102;
                                                                                                list2 = n7;
                                                                                                str11 = str12;
                                                                                            }
                                                                                            z8 = false;
                                                                                            if (c0826c0.w()) {
                                                                                            }
                                                                                            c1242lE = new C1242lE(i24, i97, i26, i21, i25, null);
                                                                                            int i1022 = c1242lE.f14336e;
                                                                                            int i1032 = c1242lE.f;
                                                                                            i63 = c1242lE.f14332a;
                                                                                            c1071hd = c1071hd2;
                                                                                            eVar = eVar2;
                                                                                            i60 = i93;
                                                                                            i17 = c1242lE.f14333b;
                                                                                            str10 = str26;
                                                                                            i41 = 6;
                                                                                            i64 = c1242lE.f14334c;
                                                                                            i61 = i1032;
                                                                                            str27 = "video/av01";
                                                                                            i62 = i1022;
                                                                                            list2 = n7;
                                                                                            str11 = str12;
                                                                                        }
                                                                                    } else {
                                                                                        JB.i(str12, "Excessive obu_size");
                                                                                        c1242lE2 = new C1242lE(-1, -1, -1, i21, i98, null);
                                                                                    }
                                                                                }
                                                                            }
                                                                            c1242lE = c1242lE2;
                                                                            int i10222 = c1242lE.f14336e;
                                                                            int i10322 = c1242lE.f;
                                                                            i63 = c1242lE.f14332a;
                                                                            c1071hd = c1071hd2;
                                                                            eVar = eVar2;
                                                                            i60 = i93;
                                                                            i17 = c1242lE.f14333b;
                                                                            str10 = str26;
                                                                            i41 = 6;
                                                                            i64 = c1242lE.f14334c;
                                                                            i61 = i10322;
                                                                            str27 = "video/av01";
                                                                            i62 = i10222;
                                                                            list2 = n7;
                                                                            str11 = str12;
                                                                        } else {
                                                                            f8 = 2;
                                                                            w5 = false;
                                                                        }
                                                                    }
                                                                    i21 = f8 <= 2 ? true != w5 ? 8 : 10 : -1;
                                                                    int i982 = i21;
                                                                    int i992 = 13;
                                                                    c0826c0.u(13);
                                                                    c0826c0.t();
                                                                    f = c0826c0.f(4);
                                                                    if (f == 1) {
                                                                    }
                                                                    c1242lE = c1242lE2;
                                                                    int i102222 = c1242lE.f14336e;
                                                                    int i103222 = c1242lE.f;
                                                                    i63 = c1242lE.f14332a;
                                                                    c1071hd = c1071hd2;
                                                                    eVar = eVar2;
                                                                    i60 = i93;
                                                                    i17 = c1242lE.f14333b;
                                                                    str10 = str26;
                                                                    i41 = 6;
                                                                    i64 = c1242lE.f14334c;
                                                                    i61 = i103222;
                                                                    str27 = "video/av01";
                                                                    i62 = i102222;
                                                                    list2 = n7;
                                                                    str11 = str12;
                                                                } else {
                                                                    str11 = str28;
                                                                    if (q15 == 1668050025) {
                                                                        if (byteBuffer == null) {
                                                                            byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                        }
                                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                                        byteBuffer2.position(21);
                                                                        byteBuffer2.putShort(c1617tm6.d());
                                                                        byteBuffer2.putShort(c1617tm6.d());
                                                                        c1071hd = c1071hd2;
                                                                        byteBuffer = byteBuffer2;
                                                                        eVar = eVar2;
                                                                        i60 = i93;
                                                                        str10 = str26;
                                                                        i61 = i18;
                                                                    } else {
                                                                        if (q15 == 1835295606) {
                                                                            if (byteBuffer == null) {
                                                                                byteBuffer = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                                                            }
                                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                                            short d8 = c1617tm6.d();
                                                                            short d9 = c1617tm6.d();
                                                                            c1071hd = c1071hd2;
                                                                            short d10 = c1617tm6.d();
                                                                            i60 = i93;
                                                                            short d11 = c1617tm6.d();
                                                                            str10 = str26;
                                                                            short d12 = c1617tm6.d();
                                                                            i19 = i62;
                                                                            short d13 = c1617tm6.d();
                                                                            eVar = eVar2;
                                                                            short d14 = c1617tm6.d();
                                                                            list = list2;
                                                                            short d15 = c1617tm6.d();
                                                                            long D7 = c1617tm6.D();
                                                                            long D8 = c1617tm6.D();
                                                                            i20 = i65;
                                                                            byteBuffer3.position(1);
                                                                            byteBuffer3.putShort(d12);
                                                                            byteBuffer3.putShort(d13);
                                                                            byteBuffer3.putShort(d8);
                                                                            byteBuffer3.putShort(d9);
                                                                            byteBuffer3.putShort(d10);
                                                                            byteBuffer3.putShort(d11);
                                                                            byteBuffer3.putShort(d14);
                                                                            byteBuffer3.putShort(d15);
                                                                            byteBuffer3.putShort((short) (D7 / 10000));
                                                                            byteBuffer3.putShort((short) (D8 / 10000));
                                                                            byteBuffer = byteBuffer3;
                                                                        } else {
                                                                            list = list2;
                                                                            c1071hd = c1071hd2;
                                                                            eVar = eVar2;
                                                                            i60 = i93;
                                                                            str10 = str26;
                                                                            i19 = i62;
                                                                            i20 = i65;
                                                                            if (q15 == 1681012275) {
                                                                                AbstractC1668us.G(null, str27 == null);
                                                                                str27 = "video/3gpp";
                                                                            } else if (q15 == 1702061171) {
                                                                                AbstractC1668us.G(null, str27 == null);
                                                                                B.N g5 = g(i68, c1617tm6);
                                                                                String str32 = (String) g5.f655m;
                                                                                byte[] bArr6 = (byte[]) g5.f656n;
                                                                                if (bArr6 != null) {
                                                                                    n6 = g5;
                                                                                    str27 = str32;
                                                                                    list2 = AbstractC1044gv.n(bArr6);
                                                                                    i62 = i19;
                                                                                    i61 = i18;
                                                                                    i65 = i20;
                                                                                } else {
                                                                                    n6 = g5;
                                                                                    str27 = str32;
                                                                                }
                                                                            } else if (q15 == 1885434736) {
                                                                                c1617tm6.j(i68 + 8);
                                                                                f7 = c1617tm6.y() / c1617tm6.y();
                                                                                i62 = i19;
                                                                                i61 = i18;
                                                                                list2 = list;
                                                                                i65 = i20;
                                                                                z17 = true;
                                                                            } else if (q15 == 1937126244) {
                                                                                int i104 = i68 + 8;
                                                                                while (i104 - i68 < i15) {
                                                                                    c1617tm6.j(i104);
                                                                                    int q18 = c1617tm6.q() + i104;
                                                                                    if (c1617tm6.q() == 1886547818) {
                                                                                        bArr = Arrays.copyOfRange(c1617tm6.f15724a, i104, q18);
                                                                                    } else {
                                                                                        i104 = q18;
                                                                                    }
                                                                                }
                                                                                i62 = i19;
                                                                                i61 = i18;
                                                                                list2 = list;
                                                                                i65 = i20;
                                                                                bArr = null;
                                                                            } else if (q15 == 1936995172) {
                                                                                int v10 = c1617tm6.v();
                                                                                c1617tm6.k(3);
                                                                                if (v10 == 0) {
                                                                                    int v11 = c1617tm6.v();
                                                                                    if (v11 == 0) {
                                                                                        i62 = i19;
                                                                                        i61 = i18;
                                                                                        list2 = list;
                                                                                        i65 = 0;
                                                                                    } else if (v11 == 1) {
                                                                                        i62 = i19;
                                                                                        i61 = i18;
                                                                                        list2 = list;
                                                                                        i65 = 1;
                                                                                    } else if (v11 == 2) {
                                                                                        i62 = i19;
                                                                                        i61 = i18;
                                                                                        list2 = list;
                                                                                        i65 = 2;
                                                                                    } else if (v11 == 3) {
                                                                                        i65 = 3;
                                                                                        i62 = i19;
                                                                                        i61 = i18;
                                                                                        list2 = list;
                                                                                    }
                                                                                }
                                                                            } else if (q15 == 1668246642) {
                                                                                if (i63 == -1) {
                                                                                    if (i64 == -1) {
                                                                                        int q19 = c1617tm6.q();
                                                                                        if (q19 == 1852009592 || q19 == 1852009571) {
                                                                                            int z21 = c1617tm6.z();
                                                                                            int z22 = c1617tm6.z();
                                                                                            c1617tm6.k(2);
                                                                                            if (i15 == 19) {
                                                                                                if ((c1617tm6.v() & 128) != 0) {
                                                                                                    i15 = 19;
                                                                                                    z7 = true;
                                                                                                    int a13 = C1242lE.a(z21);
                                                                                                    int i105 = true == z7 ? 2 : 1;
                                                                                                    i63 = a13;
                                                                                                    i64 = C1242lE.b(z22);
                                                                                                    i17 = i105;
                                                                                                } else {
                                                                                                    i15 = 19;
                                                                                                }
                                                                                            }
                                                                                            z7 = false;
                                                                                            int a132 = C1242lE.a(z21);
                                                                                            if (true == z7) {
                                                                                            }
                                                                                            i63 = a132;
                                                                                            i64 = C1242lE.b(z22);
                                                                                            i17 = i105;
                                                                                        } else {
                                                                                            JB.l(str11, "Unsupported color type: ".concat(AbstractC1665up.b(q19)));
                                                                                            i63 = -1;
                                                                                            i64 = -1;
                                                                                        }
                                                                                    } else {
                                                                                        i63 = -1;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        i62 = i19;
                                                                        i61 = i18;
                                                                        list2 = list;
                                                                        i65 = i20;
                                                                    }
                                                                }
                                                            }
                                                            i62 = i19;
                                                            i61 = i18;
                                                            list2 = list;
                                                            i65 = i20;
                                                        }
                                                        i56 = i69 + i15;
                                                        c1071hd2 = c1071hd;
                                                        i55 = i16;
                                                        str26 = str10;
                                                        str24 = str9;
                                                        eVar2 = eVar;
                                                        i52 = 12;
                                                        i53 = 8;
                                                        str28 = str11;
                                                        i67 = i17;
                                                    }
                                                    c1071hd = c1071hd2;
                                                }
                                                i56 = i69 + i15;
                                                c1071hd2 = c1071hd;
                                                i55 = i16;
                                                str26 = str10;
                                                str24 = str9;
                                                eVar2 = eVar;
                                                i52 = 12;
                                                i53 = 8;
                                                str28 = str11;
                                                i67 = i17;
                                            }
                                            i56 = i69 + i15;
                                            c1071hd2 = c1071hd;
                                            i55 = i16;
                                            str26 = str10;
                                            str24 = str9;
                                            eVar2 = eVar;
                                            i52 = 12;
                                            i53 = 8;
                                            str28 = str11;
                                            i67 = i17;
                                        }
                                        int i106 = i67;
                                        List list3 = list2;
                                        i13 = i55;
                                        M0.e eVar3 = eVar2;
                                        int i107 = i61;
                                        str7 = str26;
                                        int i108 = i62;
                                        int i109 = i65;
                                        str8 = str28;
                                        if (str27 == null) {
                                            i = i59;
                                            i14 = i51;
                                            eVar2 = eVar3;
                                        } else {
                                            C1649uH c1649uH = new C1649uH();
                                            i14 = i51;
                                            c1649uH.b(i14);
                                            c1649uH.c(str27);
                                            c1649uH.i = str29;
                                            c1649uH.f15855s = z15;
                                            c1649uH.f15856t = z16;
                                            c1649uH.f15859w = f7;
                                            i = i59;
                                            c1649uH.f15858v = i;
                                            c1649uH.f15860x = bArr;
                                            c1649uH.f15861y = i109;
                                            c1649uH.f15851o = list3;
                                            c1649uH.f15850n = i66;
                                            c1649uH.f15852p = c1334nG4;
                                            c1649uH.f15862z = new C1242lE(i63, i106, i64, i108, i107, byteBuffer != null ? byteBuffer.array() : null);
                                            B.N n8 = n6;
                                            if (n8 != null) {
                                                c1649uH.f15844g = AbstractC1400ot.T(n8.f653k);
                                                c1649uH.f15845h = AbstractC1400ot.T(n8.f654l);
                                            }
                                            eVar2 = eVar3;
                                            eVar2.f3593e = new C1407p(c1649uH);
                                        }
                                    } else {
                                        if (q13 == 1836069985 || q13 == 1701733217 || q13 == 1633889587 || q13 == 1700998451 || q13 == 1633889588 || q13 == 1835823201 || q13 == 1685353315 || q13 == 1685353317 || q13 == 1685353320 || q13 == 1685353324 || q13 == 1685353336 || q13 == 1935764850 || q13 == 1935767394 || q13 == 1819304813 || q13 == 1936684916 || q13 == 1953984371 || q13 == 778924082 || q13 == 778924083 || q13 == 1835557169 || q13 == 1835560241 || q13 == 1634492771 || q13 == 1634492791 || q13 == 1970037111 || q13 == 1332770163 || q13 == 1716281667) {
                                            str16 = sb2;
                                            c1617tm = c1617tm6;
                                            i33 = q13;
                                            c0859cp3 = c0859cp6;
                                            i34 = q6;
                                            i9 = i42;
                                            i10 = q11;
                                            i11 = i40;
                                            str17 = str22;
                                            str18 = str23;
                                            i35 = i50;
                                            i36 = q12;
                                        } else if (q13 == 1767992678) {
                                            str16 = sb2;
                                            c1617tm = c1617tm6;
                                            i33 = q13;
                                            c0859cp3 = c0859cp6;
                                            i34 = q6;
                                            i9 = i42;
                                            i10 = q11;
                                            i11 = i40;
                                            str17 = str22;
                                            str18 = str23;
                                            i35 = i50;
                                            i36 = q12;
                                        } else if (q13 == 1414810956 || q13 == 1954034535 || q13 == 2004251764 || q13 == 1937010800 || q13 == 1664495672) {
                                            c1617tm6.j(i50 + 16);
                                            String str33 = "application/ttml+xml";
                                            if (q13 != 1414810956) {
                                                if (q13 == 1954034535) {
                                                    int i110 = q12 - 16;
                                                    byte[] bArr7 = new byte[i110];
                                                    c1617tm6.f(bArr7, 0, i110);
                                                    c1761wv = AbstractC1044gv.n(bArr7);
                                                    str33 = "application/x-quicktime-tx3g";
                                                    j10 = Long.MAX_VALUE;
                                                    c1617tm2 = c1617tm6;
                                                    C1649uH c1649uH2 = new C1649uH();
                                                    c1649uH2.b(q6);
                                                    c1649uH2.c(str33);
                                                    c1649uH2.f15842d = sb2;
                                                    c1649uH2.f15853q = j10;
                                                    c1649uH2.f15851o = c1761wv;
                                                    eVar2.f3593e = new C1407p(c1649uH2);
                                                    str4 = sb2;
                                                    i12 = i48;
                                                    c0859cp3 = c0859cp6;
                                                    i14 = q6;
                                                    i9 = i42;
                                                    arrayList2 = arrayList4;
                                                    i10 = q11;
                                                    str8 = str19;
                                                    i11 = i40;
                                                    str6 = str22;
                                                    str7 = str23;
                                                    i13 = q12;
                                                    c1617tm6 = c1617tm2;
                                                } else if (q13 == 2004251764) {
                                                    str33 = "application/x-mp4-vtt";
                                                } else if (q13 == 1937010800) {
                                                    c1617tm2 = c1617tm6;
                                                    j10 = 0;
                                                    c1761wv = null;
                                                    C1649uH c1649uH22 = new C1649uH();
                                                    c1649uH22.b(q6);
                                                    c1649uH22.c(str33);
                                                    c1649uH22.f15842d = sb2;
                                                    c1649uH22.f15853q = j10;
                                                    c1649uH22.f15851o = c1761wv;
                                                    eVar2.f3593e = new C1407p(c1649uH22);
                                                    str4 = sb2;
                                                    i12 = i48;
                                                    c0859cp3 = c0859cp6;
                                                    i14 = q6;
                                                    i9 = i42;
                                                    arrayList2 = arrayList4;
                                                    i10 = q11;
                                                    str8 = str19;
                                                    i11 = i40;
                                                    str6 = str22;
                                                    str7 = str23;
                                                    i13 = q12;
                                                    c1617tm6 = c1617tm2;
                                                } else {
                                                    eVar2.f3591c = z13 ? 1 : 0;
                                                    str33 = "application/x-mp4-cea-608";
                                                }
                                            }
                                            j10 = Long.MAX_VALUE;
                                            c1761wv = null;
                                            c1617tm2 = c1617tm6;
                                            C1649uH c1649uH222 = new C1649uH();
                                            c1649uH222.b(q6);
                                            c1649uH222.c(str33);
                                            c1649uH222.f15842d = sb2;
                                            c1649uH222.f15853q = j10;
                                            c1649uH222.f15851o = c1761wv;
                                            eVar2.f3593e = new C1407p(c1649uH222);
                                            str4 = sb2;
                                            i12 = i48;
                                            c0859cp3 = c0859cp6;
                                            i14 = q6;
                                            i9 = i42;
                                            arrayList2 = arrayList4;
                                            i10 = q11;
                                            str8 = str19;
                                            i11 = i40;
                                            str6 = str22;
                                            str7 = str23;
                                            i13 = q12;
                                            c1617tm6 = c1617tm2;
                                        } else {
                                            if (q13 == 1835365492) {
                                                c1617tm6.j(i50 + 16);
                                                c1617tm6.G();
                                                String G5 = c1617tm6.G();
                                                if (G5 != null) {
                                                    C1649uH c1649uH3 = new C1649uH();
                                                    c1649uH3.b(q6);
                                                    c1649uH3.c(G5);
                                                    eVar2.f3593e = new C1407p(c1649uH3);
                                                }
                                            } else if (q13 == 1667329389) {
                                                C1649uH c1649uH4 = new C1649uH();
                                                c1649uH4.b(q6);
                                                c1649uH4.c("application/x-camera-motion");
                                                eVar2.f3593e = new C1407p(c1649uH4);
                                            }
                                            str4 = sb2;
                                            i12 = i48;
                                            c0859cp3 = c0859cp6;
                                            i14 = q6;
                                            i9 = i42;
                                            arrayList2 = arrayList4;
                                            i10 = q11;
                                            str8 = str19;
                                            i11 = i40;
                                            str6 = str22;
                                            str7 = str23;
                                            i13 = q12;
                                        }
                                        int i111 = i48;
                                        h(c1617tm, i33, i35, i36, i34, str16, z5, c1334nG, eVar2, i111);
                                        c1617tm6 = c1617tm;
                                        i50 = i35;
                                        i13 = i36;
                                        i14 = i34;
                                        str4 = str16;
                                        i12 = i111;
                                        str6 = str17;
                                        arrayList2 = arrayList4;
                                        str7 = str18;
                                        str8 = str19;
                                    }
                                    c1617tm6.j(i50 + i13);
                                    i48 = i12 + 1;
                                    str19 = str8;
                                    q6 = i14;
                                    q11 = i10;
                                    i40 = i11;
                                    arrayList4 = arrayList2;
                                    sb2 = str4;
                                    i42 = i9;
                                    c0859cp5 = c0859cp3;
                                    str22 = str6;
                                    str23 = str7;
                                    c6 = 25196;
                                    z13 = true;
                                }
                                C0859cp c0859cp7 = c0859cp5;
                                int i112 = q6;
                                int i113 = i42;
                                arrayList = arrayList4;
                                str = str19;
                                i7 = i40;
                                str2 = str22;
                                str3 = str23;
                                if (z3) {
                                    c0859cp2 = c0859cp7;
                                } else {
                                    c0859cp2 = c0859cp7;
                                    C0859cp d16 = c0859cp2.d(1701082227);
                                    if (d16 != null) {
                                        C1216kp e9 = d16.e(1701606260);
                                        if (e9 == null) {
                                            create = null;
                                            i8 = 8;
                                        } else {
                                            C1617tm c1617tm7 = e9.f14290c;
                                            i8 = 8;
                                            c1617tm7.j(8);
                                            int a14 = a(c1617tm7.q());
                                            int y5 = c1617tm7.y();
                                            long[] jArr3 = new long[y5];
                                            long[] jArr4 = new long[y5];
                                            for (int i114 = 0; i114 < y5; i114++) {
                                                jArr3[i114] = a14 == 1 ? c1617tm7.E() : c1617tm7.D();
                                                jArr4[i114] = a14 == 1 ? c1617tm7.C() : c1617tm7.q();
                                                if (c1617tm7.d() != 1) {
                                                    throw new IllegalArgumentException("Unsupported media rate.");
                                                }
                                                c1617tm7.k(2);
                                            }
                                            create = Pair.create(jArr3, jArr4);
                                        }
                                        if (create != null) {
                                            long[] jArr5 = (long[]) create.first;
                                            jArr2 = (long[]) create.second;
                                            jArr = jArr5;
                                            c1407p = (C1407p) eVar2.f3593e;
                                            if (c1407p == null) {
                                                interfaceC1311mu2 = interfaceC1311mu;
                                                c1768x1 = null;
                                            } else {
                                                C1768x1 c1768x12 = new C1768x1(i112, i113, D5, j9, u5, j6, c1407p, eVar2.f3591c, (C1813y1[]) eVar2.f3592d, eVar2.f3590b, jArr, jArr2);
                                                interfaceC1311mu2 = interfaceC1311mu;
                                                c1768x1 = c1768x12;
                                            }
                                        }
                                        jArr = null;
                                        jArr2 = null;
                                        c1407p = (C1407p) eVar2.f3593e;
                                        if (c1407p == null) {
                                        }
                                    }
                                }
                                i8 = 8;
                                jArr = null;
                                jArr2 = null;
                                c1407p = (C1407p) eVar2.f3593e;
                                if (c1407p == null) {
                                }
                            } else {
                                q8 = 65536;
                                q9 = -65536;
                            }
                        }
                        q7 = 0;
                    }
                    if (q7 == 0) {
                        if (q8 == -65536) {
                            if (q9 != 65536) {
                                i46 = q9;
                            } else if (q10 == 0) {
                                i = 270;
                                if (j5 == -9223372036854775807L) {
                                }
                                long j112 = b(e5.f14290c).f12724m;
                                if (j8 == -9223372036854775807L) {
                                }
                                C0859cp d62 = d5.d(1835626086);
                                d62.getClass();
                                char c62 = 25196;
                                C0859cp d72 = d62.d(1937007212);
                                d72.getClass();
                                C1216kp e82 = d5.e(1835296868);
                                e82.getClass();
                                C1617tm c1617tm52 = e82.f14290c;
                                c1617tm52.j(8);
                                a5 = a(c1617tm52.q());
                                c1617tm52.k(a5 == 0 ? 8 : 16);
                                long D52 = c1617tm52.D();
                                int i472 = c1617tm52.f15725b;
                                i5 = 0;
                                while (true) {
                                    if (a5 == 0) {
                                    }
                                    if (i5 >= i6) {
                                    }
                                    i5++;
                                }
                                int z142 = c1617tm52.z();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append((char) (((z142 >> 10) & 31) + 96));
                                sb3.append((char) (((z142 >> 5) & 31) + 96));
                                sb3.append((char) ((z142 & 31) + 96));
                                String sb22 = sb3.toString();
                                e3 = d72.e(1937011556);
                                if (e3 == null) {
                                }
                            }
                            q8 = -65536;
                        } else {
                            i46 = q9;
                        }
                        q7 = 0;
                    } else {
                        i46 = q9;
                    }
                    i = (q7 == -65536 && q8 == 0 && i46 == 0 && q10 == -65536) ? 180 : 0;
                    if (j5 == -9223372036854775807L) {
                    }
                    long j1122 = b(e5.f14290c).f12724m;
                    if (j8 == -9223372036854775807L) {
                    }
                    C0859cp d622 = d5.d(1835626086);
                    d622.getClass();
                    char c622 = 25196;
                    C0859cp d722 = d622.d(1937007212);
                    d722.getClass();
                    C1216kp e822 = d5.e(1835296868);
                    e822.getClass();
                    C1617tm c1617tm522 = e822.f14290c;
                    c1617tm522.j(8);
                    a5 = a(c1617tm522.q());
                    c1617tm522.k(a5 == 0 ? 8 : 16);
                    long D522 = c1617tm522.D();
                    int i4722 = c1617tm522.f15725b;
                    i5 = 0;
                    while (true) {
                        if (a5 == 0) {
                        }
                        if (i5 >= i6) {
                        }
                        i5++;
                    }
                    int z1422 = c1617tm522.z();
                    StringBuilder sb32 = new StringBuilder();
                    sb32.append((char) (((z1422 >> 10) & 31) + 96));
                    sb32.append((char) (((z1422 >> 5) & 31) + 96));
                    sb32.append((char) ((z1422 & 31) + 96));
                    String sb222 = sb32.toString();
                    e3 = d722.e(1937011556);
                    if (e3 == null) {
                    }
                }
                C1768x1 c1768x13 = (C1768x1) interfaceC1311mu2.apply(c1768x1);
                if (c1768x13 != null) {
                    C0859cp d17 = c0859cp2.d(1835297121);
                    d17.getClass();
                    C0859cp d18 = d17.d(1835626086);
                    d18.getClass();
                    C0859cp d19 = d18.d(1937007212);
                    d19.getClass();
                    A1 c7 = c(c1768x13, d19, n5);
                    arrayList3 = arrayList;
                    arrayList3.add(c7);
                } else {
                    arrayList3 = arrayList;
                }
            }
            i40 = i7 + 1;
            c0859cp4 = c0859cp;
            arrayList4 = arrayList3;
            str19 = str;
            i39 = i8;
            str20 = str2;
            str21 = str3;
            i37 = 4;
            i38 = 16;
        }
    }

    public static int e(C1617tm c1617tm) {
        int v4 = c1617tm.v();
        int i = v4 & 127;
        while ((v4 & 128) == 128) {
            v4 = c1617tm.v();
            i = (i << 7) | (v4 & 127);
        }
        return i;
    }

    public static Pair f(C1617tm c1617tm, int i, int i5) {
        Integer num;
        C1813y1 c1813y1;
        Pair create;
        int i6;
        int i7;
        Integer num2;
        boolean z3;
        int i8 = c1617tm.f15725b;
        while (i8 - i < i5) {
            c1617tm.j(i8);
            int q5 = c1617tm.q();
            AbstractC1668us.G("childAtomSize must be positive", q5 > 0);
            if (c1617tm.q() == 1936289382) {
                int i9 = i8 + 8;
                int i10 = 0;
                int i11 = -1;
                Integer num3 = null;
                String str = null;
                while (i9 - i8 < q5) {
                    c1617tm.j(i9);
                    int q6 = c1617tm.q();
                    int q7 = c1617tm.q();
                    if (q7 == 1718775137) {
                        num3 = Integer.valueOf(c1617tm.q());
                    } else if (q7 == 1935894637) {
                        c1617tm.k(4);
                        str = c1617tm.b(4, StandardCharsets.UTF_8);
                    } else if (q7 == 1935894633) {
                        i11 = i9;
                        i10 = q6;
                    }
                    i9 += q6;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC1668us.G("frma atom is mandatory", num3 != null);
                    AbstractC1668us.G("schi atom is mandatory", i11 != -1);
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num3;
                            c1813y1 = null;
                            break;
                        }
                        c1617tm.j(i12);
                        int q8 = c1617tm.q();
                        if (c1617tm.q() == 1952804451) {
                            int a5 = a(c1617tm.q());
                            c1617tm.k(1);
                            if (a5 == 0) {
                                c1617tm.k(1);
                                i7 = 0;
                                i6 = 0;
                            } else {
                                int v4 = c1617tm.v();
                                i6 = v4 & 15;
                                i7 = (v4 & 240) >> 4;
                            }
                            if (c1617tm.v() == 1) {
                                num2 = num3;
                                z3 = true;
                            } else {
                                num2 = num3;
                                z3 = false;
                            }
                            int v5 = c1617tm.v();
                            byte[] bArr2 = new byte[16];
                            c1617tm.f(bArr2, 0, 16);
                            if (z3 && v5 == 0) {
                                int v6 = c1617tm.v();
                                byte[] bArr3 = new byte[v6];
                                c1617tm.f(bArr3, 0, v6);
                                bArr = bArr3;
                            }
                            num = num2;
                            c1813y1 = new C1813y1(z3, str, v5, bArr2, i7, i6, bArr);
                        } else {
                            i12 += q8;
                        }
                    }
                    AbstractC1668us.G("tenc atom is mandatory", c1813y1 != null);
                    int i13 = AbstractC1260lo.f14419a;
                    create = Pair.create(num, c1813y1);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i8 += q5;
        }
        return null;
    }

    public static B.N g(int i, C1617tm c1617tm) {
        c1617tm.j(i + 12);
        c1617tm.k(1);
        e(c1617tm);
        c1617tm.k(2);
        int v4 = c1617tm.v();
        if ((v4 & 128) != 0) {
            c1617tm.k(2);
        }
        if ((v4 & 64) != 0) {
            c1617tm.k(c1617tm.v());
        }
        if ((v4 & 32) != 0) {
            c1617tm.k(2);
        }
        c1617tm.k(1);
        e(c1617tm);
        String d5 = AbstractC1593t6.d(c1617tm.v());
        if ("audio/mpeg".equals(d5) || "audio/vnd.dts".equals(d5) || "audio/vnd.dts.hd".equals(d5)) {
            return new B.N(d5, null, -1L, -1L);
        }
        c1617tm.k(4);
        long D5 = c1617tm.D();
        long D6 = c1617tm.D();
        c1617tm.k(1);
        int e3 = e(c1617tm);
        long j5 = D6;
        byte[] bArr = new byte[e3];
        c1617tm.f(bArr, 0, e3);
        if (j5 <= 0) {
            j5 = -1;
        }
        return new B.N(d5, bArr, j5, D5 > 0 ? D5 : -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0165, code lost:
    
        if (r10 == (-1)) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(C1617tm c1617tm, int i, int i5, int i6, int i7, String str, boolean z3, C1334nG c1334nG, M0.e eVar, int i8) {
        int i9;
        int i10;
        int z5;
        int q5;
        int i11;
        int i12;
        String str2;
        String str3;
        int i13;
        int i14;
        String str4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C1761wv c1761wv;
        int i20;
        int i21;
        int i22;
        String str5;
        String str6;
        String format;
        C1617tm c1617tm2 = c1617tm;
        int i23 = i6;
        C1334nG c1334nG2 = c1334nG;
        c1617tm2.j(i5 + 16);
        if (z3) {
            int z6 = c1617tm2.z();
            c1617tm2.k(6);
            i9 = z6;
        } else {
            c1617tm2.k(8);
            i9 = 0;
        }
        int i24 = 0;
        if (i9 == 0 || i9 == 1) {
            i10 = 2;
            z5 = c1617tm2.z();
            c1617tm2.k(6);
            int w5 = c1617tm2.w();
            c1617tm2.j(c1617tm2.f15725b - 4);
            q5 = c1617tm2.q();
            if (i9 == 1) {
                c1617tm2.k(16);
            }
            i11 = w5;
            i12 = -1;
        } else {
            if (i9 != 2) {
                return;
            }
            c1617tm2.k(16);
            i10 = 2;
            i11 = (int) Math.round(Double.longBitsToDouble(c1617tm2.C()));
            z5 = c1617tm2.y();
            c1617tm2.k(4);
            int y5 = c1617tm2.y();
            int y6 = c1617tm2.y();
            int i25 = y6 & 1;
            int i26 = y6 & 2;
            if (i25 == 0) {
                if (y5 == 8) {
                    i12 = 3;
                } else if (y5 == 16) {
                    i12 = i26 != 0 ? 268435456 : 2;
                } else if (y5 == 24) {
                    i12 = i26 != 0 ? 1342177280 : 21;
                } else {
                    if (y5 == 32) {
                        i12 = i26 != 0 ? 1610612736 : 22;
                    }
                    i12 = -1;
                }
                c1617tm2.k(8);
                q5 = 0;
            } else {
                if (y5 == 32) {
                    i12 = 4;
                    c1617tm2.k(8);
                    q5 = 0;
                }
                i12 = -1;
                c1617tm2.k(8);
                q5 = 0;
            }
        }
        if (i == 1767992678) {
            i11 = -1;
        }
        if (i == 1767992678) {
            z5 = -1;
        }
        int i27 = 8;
        int i28 = c1617tm2.f15725b;
        int i29 = 1701733217;
        if (i == 1701733217) {
            Pair f = f(c1617tm2, i5, i23);
            if (f != null) {
                i29 = ((Integer) f.first).intValue();
                c1334nG2 = c1334nG2 == null ? null : c1334nG2.a(((C1813y1) f.second).f16378b);
                ((C1813y1[]) eVar.f3592d)[i8] = (C1813y1) f.second;
            }
            c1617tm2.j(i28);
        } else {
            i29 = i;
        }
        String str7 = "audio/mhm1";
        String str8 = "audio/ac3";
        if (i29 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i29 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i29 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i29 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i29 == 1685353320 || i29 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i29 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i29 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i29 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i29 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i29 != 1936684916) {
                if (i29 == 1953984371) {
                    i12 = 268435456;
                } else if (i29 != 1819304813) {
                    str2 = (i29 == 778924082 || i29 == 778924083) ? "audio/mpeg" : i29 == 1835557169 ? "audio/mha1" : i29 == 1835560241 ? "audio/mhm1" : i29 == 1634492771 ? "audio/alac" : i29 == 1634492791 ? "audio/g711-alaw" : i29 == 1970037111 ? "audio/g711-mlaw" : i29 == 1332770163 ? "audio/opus" : i29 == 1716281667 ? "audio/flac" : i29 == 1835823201 ? "audio/true-hd" : i29 == 1767992678 ? "audio/iamf" : null;
                }
                str2 = "audio/raw";
            }
            i12 = i10;
            str2 = "audio/raw";
        }
        int i30 = i12;
        List list = null;
        String str9 = null;
        B.N n5 = null;
        while (i28 - i5 < i23) {
            c1617tm2.j(i28);
            int q6 = c1617tm2.q();
            int i31 = i11;
            AbstractC1668us.G("childAtomSize must be positive", q6 > 0 ? 1 : i24);
            int q7 = c1617tm2.q();
            int i32 = z5;
            if (q7 == 1835557187) {
                c1617tm2.j(i28 + 8);
                c1617tm2.k(1);
                int v4 = c1617tm2.v();
                c1617tm2.k(1);
                if (Objects.equals(str2, str7)) {
                    Object[] objArr = new Object[1];
                    objArr[i24] = Integer.valueOf(v4);
                    format = String.format("mhm1.%02X", objArr);
                } else {
                    Object[] objArr2 = new Object[1];
                    objArr2[i24] = Integer.valueOf(v4);
                    format = String.format("mha1.%02X", objArr2);
                }
                int z7 = c1617tm2.z();
                byte[] bArr = new byte[z7];
                str3 = str7;
                i13 = i24;
                c1617tm2.f(bArr, i13, z7);
                list = list == null ? AbstractC1044gv.n(bArr) : AbstractC1044gv.o(bArr, (byte[]) list.get(i13));
                z5 = i32;
                str4 = str8;
                str9 = format;
            } else {
                str3 = str7;
                i13 = i24;
                if (q7 == 1835557200) {
                    c1617tm2.j(i28 + 8);
                    int v5 = c1617tm2.v();
                    if (v5 > 0) {
                        byte[] bArr2 = new byte[v5];
                        c1617tm2.f(bArr2, i13, v5);
                        if (list == null) {
                            list = AbstractC1044gv.n(bArr2);
                            z5 = i32;
                            str4 = str8;
                        } else {
                            list = AbstractC1044gv.o((byte[]) list.get(i13), bArr2);
                            z5 = i32;
                            str4 = str8;
                            i15 = q6;
                            i16 = i28;
                            i11 = i31;
                            i20 = 0;
                            i28 = i16 + i15;
                            i23 = i6;
                            str7 = str3;
                            i24 = i20;
                            str8 = str4;
                            c1617tm2 = c1617tm;
                        }
                    } else {
                        i14 = i32;
                        str4 = str8;
                        i15 = q6;
                        i20 = i13;
                        i16 = i28;
                        i17 = i31;
                    }
                } else {
                    if (q7 == 1702061171) {
                        i14 = i32;
                        str4 = str8;
                        i15 = q6;
                        i16 = i28;
                        i17 = i31;
                        i18 = i16;
                        i19 = -1;
                    } else if (z3 && q7 == 2002876005) {
                        int i33 = c1617tm2.f15725b;
                        AbstractC1668us.G(null, i33 >= i28);
                        while (true) {
                            if (i33 - i28 >= q6) {
                                i14 = i32;
                                str4 = str8;
                                i15 = q6;
                                i16 = i28;
                                i17 = i31;
                                i18 = -1;
                                break;
                            }
                            c1617tm2.j(i33);
                            int q8 = c1617tm2.q();
                            AbstractC1668us.G("childAtomSize must be positive", q8 > 0);
                            int i34 = i33;
                            if (c1617tm2.q() == 1702061171) {
                                i14 = i32;
                                str4 = str8;
                                i15 = q6;
                                i16 = i28;
                                i17 = i31;
                                i18 = i34;
                                break;
                            }
                            i33 = i34 + q8;
                        }
                        i19 = -1;
                    } else {
                        int[] iArr = JB.f9893d;
                        int[] iArr2 = JB.f9891b;
                        if (q7 == 1684103987) {
                            c1617tm2.j(i28 + 8);
                            String num = Integer.toString(i7);
                            C0826c0 c0826c0 = new C0826c0();
                            c0826c0.q(c1617tm2);
                            int i35 = iArr2[c0826c0.f(i10)];
                            i15 = q6;
                            c0826c0.u(i27);
                            int i36 = iArr[c0826c0.f(3)];
                            if (c0826c0.f(1) != 0) {
                                i36++;
                            }
                            int i37 = JB.f9894e[c0826c0.f(5)] * 1000;
                            c0826c0.j();
                            c1617tm2.j(c0826c0.c());
                            C1649uH c1649uH = new C1649uH();
                            c1649uH.f15839a = num;
                            c1649uH.c(str8);
                            c1649uH.f15831A = i36;
                            c1649uH.f15832B = i35;
                            c1649uH.f15852p = c1334nG2;
                            c1649uH.f15842d = str;
                            c1649uH.f15844g = i37;
                            c1649uH.f15845h = i37;
                            eVar.f3593e = new C1407p(c1649uH);
                            i14 = i32;
                            str4 = str8;
                            i16 = i28;
                        } else {
                            i15 = q6;
                            if (q7 == 1684366131) {
                                c1617tm2.j(i28 + 8);
                                String num2 = Integer.toString(i7);
                                C0826c0 c0826c02 = new C0826c0();
                                c0826c02.q(c1617tm2);
                                int f5 = c0826c02.f(13) * 1000;
                                c0826c02.u(3);
                                int i38 = iArr2[c0826c02.f(2)];
                                str4 = str8;
                                c0826c02.u(10);
                                int i39 = iArr[c0826c02.f(3)];
                                if (c0826c02.f(1) != 0) {
                                    i39++;
                                }
                                c0826c02.u(3);
                                int f6 = c0826c02.f(4);
                                c0826c02.u(1);
                                int i40 = i39;
                                if (f6 > 0) {
                                    c0826c02.u(6);
                                    int i41 = c0826c02.f(1) != 0 ? i40 + 2 : i40;
                                    c0826c02.u(1);
                                    i39 = i41;
                                }
                                i16 = i28;
                                if (c0826c02.a() > 7) {
                                    c0826c02.u(7);
                                    if (c0826c02.f(1) != 0) {
                                        str6 = "audio/eac3-joc";
                                        c0826c02.j();
                                        c1617tm2.j(c0826c02.c());
                                        C1649uH c1649uH2 = new C1649uH();
                                        c1649uH2.f15839a = num2;
                                        c1649uH2.c(str6);
                                        c1649uH2.f15831A = i39;
                                        c1649uH2.f15832B = i38;
                                        c1649uH2.f15852p = c1334nG2;
                                        c1649uH2.f15842d = str;
                                        c1649uH2.f15845h = f5;
                                        eVar.f3593e = new C1407p(c1649uH2);
                                        i14 = i32;
                                    }
                                }
                                str6 = "audio/eac3";
                                c0826c02.j();
                                c1617tm2.j(c0826c02.c());
                                C1649uH c1649uH22 = new C1649uH();
                                c1649uH22.f15839a = num2;
                                c1649uH22.c(str6);
                                c1649uH22.f15831A = i39;
                                c1649uH22.f15832B = i38;
                                c1649uH22.f15852p = c1334nG2;
                                c1649uH22.f15842d = str;
                                c1649uH22.f15845h = f5;
                                eVar.f3593e = new C1407p(c1649uH22);
                                i14 = i32;
                            } else {
                                str4 = str8;
                                i16 = i28;
                                if (q7 == 1684103988) {
                                    c1617tm2.j(i16 + 8);
                                    String num3 = Integer.toString(i7);
                                    c1617tm2.k(1);
                                    int v6 = c1617tm2.v() & 32;
                                    C1649uH c1649uH3 = new C1649uH();
                                    c1649uH3.f15839a = num3;
                                    c1649uH3.c("audio/ac4");
                                    c1649uH3.f15831A = 2;
                                    c1649uH3.f15832B = 1 != (v6 >> 5) ? 44100 : 48000;
                                    c1649uH3.f15852p = c1334nG2;
                                    c1649uH3.f15842d = str;
                                    eVar.f3593e = new C1407p(c1649uH3);
                                    i14 = i32;
                                    i17 = i31;
                                    i20 = 0;
                                    i27 = 8;
                                    i10 = 2;
                                    z5 = i14;
                                    i11 = i17;
                                    i28 = i16 + i15;
                                    i23 = i6;
                                    str7 = str3;
                                    i24 = i20;
                                    str8 = str4;
                                    c1617tm2 = c1617tm;
                                } else {
                                    if (q7 != 1684892784) {
                                        if (q7 == 1684305011 || q7 == 1969517683) {
                                            i27 = 8;
                                            i10 = 2;
                                            C1649uH c1649uH4 = new C1649uH();
                                            c1649uH4.b(i7);
                                            c1649uH4.c(str2);
                                            i14 = i32;
                                            c1649uH4.f15831A = i14;
                                            i17 = i31;
                                            c1649uH4.f15832B = i17;
                                            c1649uH4.f15852p = c1334nG2;
                                            c1649uH4.f15842d = str;
                                            eVar.f3593e = new C1407p(c1649uH4);
                                        } else if (q7 == 1682927731) {
                                            i27 = 8;
                                            int i42 = i15 - 8;
                                            byte[] bArr3 = f14455a;
                                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i42);
                                            c1617tm2.j(i16 + 8);
                                            c1617tm2.f(copyOf, bArr3.length, i42);
                                            list = AbstractC1803xs.T(copyOf);
                                            z5 = i32;
                                            i11 = i31;
                                            i20 = 0;
                                        } else {
                                            i27 = 8;
                                            if (q7 == 1684425825) {
                                                byte[] bArr4 = new byte[i15 - 8];
                                                bArr4[0] = 102;
                                                bArr4[1] = 76;
                                                i10 = 2;
                                                bArr4[2] = 97;
                                                bArr4[3] = 67;
                                                c1617tm2.j(i16 + 12);
                                                c1617tm2.f(bArr4, 4, i15 - 12);
                                                list = AbstractC1044gv.n(bArr4);
                                                z5 = i32;
                                                i11 = i31;
                                                i20 = 0;
                                            } else {
                                                i10 = 2;
                                                if (q7 == 1634492771) {
                                                    int i43 = i15 - 12;
                                                    byte[] bArr5 = new byte[i43];
                                                    c1617tm2.j(i16 + 12);
                                                    c1617tm2.f(bArr5, 0, i43);
                                                    byte[] bArr6 = AbstractC1120ii.f13966a;
                                                    C1617tm c1617tm3 = new C1617tm(bArr5);
                                                    c1617tm3.j(9);
                                                    int v7 = c1617tm3.v();
                                                    c1617tm3.j(20);
                                                    Pair create = Pair.create(Integer.valueOf(c1617tm3.y()), Integer.valueOf(v7));
                                                    int intValue = ((Integer) create.first).intValue();
                                                    int intValue2 = ((Integer) create.second).intValue();
                                                    c1761wv = AbstractC1044gv.n(bArr5);
                                                    z5 = intValue2;
                                                    i11 = intValue;
                                                    i20 = 0;
                                                    list = c1761wv;
                                                } else if (q7 == 1767990114) {
                                                    c1617tm2.j(i16 + 9);
                                                    long j5 = 0;
                                                    int i44 = 0;
                                                    while (i44 < 9) {
                                                        if (c1617tm2.f15725b == c1617tm2.f15726c) {
                                                            throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                        }
                                                        int i45 = i44;
                                                        long v8 = c1617tm2.v();
                                                        j5 |= (v8 & 127) << (i45 * 7);
                                                        if ((v8 & 128) == 0) {
                                                            break;
                                                        } else {
                                                            i44 = i45 + 1;
                                                        }
                                                    }
                                                    int t5 = AbstractC1400ot.t(j5);
                                                    byte[] bArr7 = new byte[t5];
                                                    c1617tm2.f(bArr7, 0, t5);
                                                    list = AbstractC1044gv.n(bArr7);
                                                    z5 = i32;
                                                    i11 = i31;
                                                    i20 = 0;
                                                } else {
                                                    i14 = i32;
                                                    i17 = i31;
                                                }
                                            }
                                            i28 = i16 + i15;
                                            i23 = i6;
                                            str7 = str3;
                                            i24 = i20;
                                            str8 = str4;
                                            c1617tm2 = c1617tm;
                                        }
                                        i20 = 0;
                                        z5 = i14;
                                        i11 = i17;
                                        i28 = i16 + i15;
                                        i23 = i6;
                                        str7 = str3;
                                        i24 = i20;
                                        str8 = str4;
                                        c1617tm2 = c1617tm;
                                    } else {
                                        if (q5 <= 0) {
                                            throw B7.a(null, "Invalid sample rate for Dolby TrueHD MLP stream: " + q5);
                                        }
                                        i11 = q5;
                                        i20 = 0;
                                        z5 = 2;
                                        i27 = 8;
                                    }
                                    i10 = 2;
                                    i28 = i16 + i15;
                                    i23 = i6;
                                    str7 = str3;
                                    i24 = i20;
                                    str8 = str4;
                                    c1617tm2 = c1617tm;
                                }
                            }
                        }
                        i17 = i31;
                        i20 = 0;
                        i27 = 8;
                        i10 = 2;
                    }
                    if (i18 != i19) {
                        B.N g5 = g(i18, c1617tm2);
                        String str10 = (String) g5.f655m;
                        byte[] bArr8 = (byte[]) g5.f656n;
                        if (bArr8 == null) {
                            i20 = 0;
                        } else if ("audio/vorbis".equals(str10)) {
                            C1617tm c1617tm4 = new C1617tm(bArr8);
                            c1617tm4.k(1);
                            int i46 = 0;
                            while (c1617tm4.o() > 0 && (c1617tm4.f15724a[c1617tm4.f15725b] & 255) == 255) {
                                c1617tm4.k(1);
                                i46 += 255;
                            }
                            int v9 = c1617tm4.v() + i46;
                            int i47 = 0;
                            while (c1617tm4.o() > 0 && (c1617tm4.f15724a[c1617tm4.f15725b] & 255) == 255) {
                                c1617tm4.k(1);
                                i47 += 255;
                            }
                            int v10 = c1617tm4.v() + i47;
                            byte[] bArr9 = new byte[v9];
                            int i48 = c1617tm4.f15725b;
                            i20 = 0;
                            System.arraycopy(bArr8, i48, bArr9, 0, v9);
                            int i49 = i48 + v9 + v10;
                            int length = bArr8.length - i49;
                            byte[] bArr10 = new byte[length];
                            System.arraycopy(bArr8, i49, bArr10, 0, length);
                            list = AbstractC1044gv.o(bArr9, bArr10);
                        } else {
                            i20 = 0;
                            if ("audio/mp4a-latm".equals(str10)) {
                                C1541s c5 = AbstractC1561sb.c(new C0826c0(bArr8.length, bArr8), false);
                                i22 = c5.f15400b;
                                i21 = c5.f15401c;
                                str5 = c5.f15399a;
                            } else {
                                i21 = i14;
                                i22 = i17;
                                str5 = str9;
                            }
                            c1761wv = AbstractC1044gv.n(bArr8);
                            n5 = g5;
                            str2 = str10;
                            i11 = i22;
                            z5 = i21;
                            str9 = str5;
                            list = c1761wv;
                            i28 = i16 + i15;
                            i23 = i6;
                            str7 = str3;
                            i24 = i20;
                            str8 = str4;
                            c1617tm2 = c1617tm;
                        }
                        n5 = g5;
                        str2 = str10;
                        z5 = i14;
                        i11 = i17;
                        i28 = i16 + i15;
                        i23 = i6;
                        str7 = str3;
                        i24 = i20;
                        str8 = str4;
                        c1617tm2 = c1617tm;
                    }
                    i20 = 0;
                    z5 = i14;
                    i11 = i17;
                    i28 = i16 + i15;
                    i23 = i6;
                    str7 = str3;
                    i24 = i20;
                    str8 = str4;
                    c1617tm2 = c1617tm;
                }
                z5 = i14;
                i11 = i17;
                i28 = i16 + i15;
                i23 = i6;
                str7 = str3;
                i24 = i20;
                str8 = str4;
                c1617tm2 = c1617tm;
            }
            i15 = q6;
            i20 = i13;
            i16 = i28;
            i11 = i31;
            i28 = i16 + i15;
            i23 = i6;
            str7 = str3;
            i24 = i20;
            str8 = str4;
            c1617tm2 = c1617tm;
        }
        int i50 = i11;
        int i51 = z5;
        if (((C1407p) eVar.f3593e) != null || str2 == null) {
            return;
        }
        C1649uH c1649uH5 = new C1649uH();
        c1649uH5.b(i7);
        c1649uH5.c(str2);
        c1649uH5.i = str9;
        c1649uH5.f15831A = i51;
        c1649uH5.f15832B = i50;
        c1649uH5.f15833C = i30;
        c1649uH5.f15851o = list;
        c1649uH5.f15852p = c1334nG2;
        c1649uH5.f15842d = str;
        B.N n6 = n5;
        if (n6 != null) {
            c1649uH5.f15844g = AbstractC1400ot.T(n6.f653k);
            c1649uH5.f15845h = AbstractC1400ot.T(n6.f654l);
        }
        eVar.f3593e = new C1407p(c1649uH5);
    }
}
