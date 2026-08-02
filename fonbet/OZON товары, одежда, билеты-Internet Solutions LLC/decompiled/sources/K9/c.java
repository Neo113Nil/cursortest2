package K9;

import I9.h;
import I9.j;
import h9.g;
import h9.v;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import o9.C8659a;
import o9.EnumC8662d;
import q9.C8999a;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15390a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15391a;

        static {
            int[] iArr = new int[h.values().length];
            f15391a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15391a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15391a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15391a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x04ad, code lost:
    
        if ((r3 >= 0 && r3 < 8) != false) goto L252;
     */
    /* JADX WARN: Removed duplicated region for block: B:348:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b A[LOOP:1: B:54:0x0100->B:61:0x012b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f a(String str, I9.f fVar, Map<g, ?> map) throws v {
        byte[] bytes;
        int length;
        int i11;
        h hVar;
        C8659a c8659a;
        int i12;
        int i13;
        int i14;
        j jVar;
        int k11;
        int i15;
        int i16;
        int i17;
        char c11;
        int i18;
        EnumC8662d a11;
        boolean z11 = map != null && map.containsKey(g.CHARACTER_SET);
        String obj = z11 ? map.get(g.CHARACTER_SET).toString() : "ISO-8859-1";
        boolean equals = "Shift_JIS".equals(obj);
        int[] iArr = f15390a;
        if (equals) {
            try {
                bytes = str.getBytes("Shift_JIS");
                length = bytes.length;
            } catch (UnsupportedEncodingException unused) {
            }
            if (length % 2 == 0) {
                while (i11 < length) {
                    int i19 = bytes[i11] & 255;
                    i11 = ((i19 >= 129 && i19 <= 159) || (i19 >= 224 && i19 <= 235)) ? i11 + 2 : 0;
                }
                hVar = h.KANJI;
                c8659a = new C8659a();
                int i21 = 8;
                if (hVar == h.BYTE && z11 && (a11 = EnumC8662d.a(obj)) != null) {
                    c8659a.c(h.ECI.a(), 4);
                    c8659a.c(a11.d(), 8);
                }
                if (map != null) {
                    g gVar = g.GS1_FORMAT;
                    if (map.containsKey(gVar) && Boolean.parseBoolean(map.get(gVar).toString())) {
                        c8659a.c(h.FNC1_FIRST_POSITION.a(), 4);
                    }
                }
                c8659a.c(hVar.a(), 4);
                C8659a c8659a2 = new C8659a();
                i12 = a.f15391a[hVar.ordinal()];
                int i22 = 10;
                char c12 = 7;
                if (i12 == 1) {
                    i13 = 1;
                    if (i12 == 2) {
                        int length2 = str.length();
                        int i23 = 0;
                        while (i23 < length2) {
                            char charAt = str.charAt(i23);
                            int i24 = charAt < '`' ? iArr[charAt] : -1;
                            if (i24 == -1) {
                                throw new v();
                            }
                            int i25 = i23 + 1;
                            if (i25 < length2) {
                                char charAt2 = str.charAt(i25);
                                int i26 = charAt2 < '`' ? iArr[charAt2] : -1;
                                if (i26 == -1) {
                                    throw new v();
                                }
                                c8659a2.c((i24 * 45) + i26, 11);
                                i23 += 2;
                            } else {
                                c8659a2.c(i24, 6);
                                i23 = i25;
                            }
                        }
                    } else if (i12 == 3) {
                        try {
                            for (byte b11 : str.getBytes(obj)) {
                                c8659a2.c(b11, 8);
                            }
                        } catch (UnsupportedEncodingException e11) {
                            throw new v(e11);
                        }
                    } else {
                        if (i12 != 4) {
                            throw new v("Invalid mode: ".concat(String.valueOf(hVar)));
                        }
                        try {
                            byte[] bytes2 = str.getBytes("Shift_JIS");
                            if (bytes2.length % 2 != 0) {
                                throw new v("Kanji byte size not even");
                            }
                            int length3 = bytes2.length - 1;
                            for (int i27 = 0; i27 < length3; i27 += 2) {
                                int i28 = ((bytes2[i27] & 255) << 8) | (bytes2[i27 + 1] & 255);
                                int i29 = 33088;
                                if (i28 < 33088 || i28 > 40956) {
                                    if (i28 < 57408 || i28 > 60351) {
                                        i18 = -1;
                                        if (i18 != -1) {
                                            throw new v("Invalid byte sequence");
                                        }
                                        c8659a2.c(((i18 >> 8) * 192) + (i18 & 255), 13);
                                    } else {
                                        i29 = 49472;
                                    }
                                }
                                i18 = i28 - i29;
                                if (i18 != -1) {
                                }
                            }
                        } catch (UnsupportedEncodingException e12) {
                            throw new v(e12);
                        }
                    }
                } else {
                    i13 = 1;
                    int length4 = str.length();
                    int i31 = 0;
                    while (i31 < length4) {
                        int charAt3 = str.charAt(i31) - '0';
                        int i32 = i31 + 2;
                        if (i32 < length4) {
                            c8659a2.c(((str.charAt(i31 + 1) - '0') * 10) + (charAt3 * 100) + (str.charAt(i32) - '0'), i22);
                            i31 += 3;
                        } else {
                            i31++;
                            if (i31 < length4) {
                                c8659a2.c((charAt3 * 10) + (str.charAt(i31) - '0'), 7);
                                i31 = i32;
                            } else {
                                c8659a2.c(charAt3, 4);
                            }
                        }
                        i22 = 10;
                    }
                }
                if (map != null) {
                    g gVar2 = g.QR_VERSION;
                    if (map.containsKey(gVar2)) {
                        jVar = j.h(Integer.parseInt(map.get(gVar2).toString()));
                        if ((jVar.g() - jVar.f(fVar).d() >= ((c8659a2.j() + (hVar.b(jVar) + c8659a.j())) + 7) / 8 ? i13 : 0) == 0) {
                            throw new v("Data too big for requested version");
                        }
                        C8659a c8659a3 = new C8659a();
                        c8659a3.b(c8659a);
                        k11 = hVar != h.BYTE ? c8659a2.k() : str.length();
                        int b12 = hVar.b(jVar);
                        i15 = i13 << b12;
                        if (k11 < i15) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(k11);
                            sb2.append(" is bigger than ");
                            sb2.append(i15 - 1);
                            throw new v(sb2.toString());
                        }
                        c8659a3.c(k11, b12);
                        c8659a3.b(c8659a2);
                        j.b f7 = jVar.f(fVar);
                        int g10 = jVar.g() - f7.d();
                        int i33 = g10 << 3;
                        if (c8659a3.j() > i33) {
                            throw new v("data bits cannot fit in the QR Code" + c8659a3.j() + " > " + i33);
                        }
                        for (int i34 = 0; i34 < 4 && c8659a3.j() < i33; i34++) {
                            c8659a3.a(false);
                        }
                        boolean z12 = false;
                        int j11 = c8659a3.j() & 7;
                        if (j11 > 0) {
                            while (j11 < i21) {
                                c8659a3.a(z12);
                                j11++;
                                z12 = false;
                            }
                        }
                        int k12 = g10 - c8659a3.k();
                        for (int i35 = 0; i35 < k12; i35++) {
                            c8659a3.c((i35 & 1) == 0 ? 236 : 17, i21);
                        }
                        if (c8659a3.j() != i33) {
                            throw new v("Bits size does not equal capacity");
                        }
                        int g11 = jVar.g();
                        int c13 = f7.c();
                        if (c8659a3.k() != g10) {
                            throw new v("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(c13);
                        int i36 = 0;
                        int i37 = 0;
                        int i38 = 0;
                        int i39 = 0;
                        while (i36 < c13) {
                            int i41 = i13;
                            int[] iArr2 = new int[i41];
                            int[] iArr3 = new int[i41];
                            if (i36 >= c13) {
                                throw new v("Block ID too large");
                            }
                            int i42 = g11 % c13;
                            int i43 = c13 - i42;
                            int i44 = g11 / c13;
                            int i45 = g10 / c13;
                            int i46 = i45 + 1;
                            int i47 = i44 - i45;
                            int i48 = (i44 + 1) - i46;
                            if (i47 != i48) {
                                throw new v("EC bytes mismatch");
                            }
                            if (c13 != i43 + i42) {
                                throw new v("RS blocks mismatch");
                            }
                            if (g11 != ((i46 + i48) * i42) + ((i45 + i47) * i43)) {
                                throw new v("Total bytes mismatch");
                            }
                            if (i36 < i43) {
                                c11 = 0;
                                iArr2[0] = i45;
                                iArr3[0] = i47;
                            } else {
                                c11 = 0;
                                iArr2[0] = i46;
                                iArr3[0] = i48;
                            }
                            int i49 = iArr2[c11];
                            byte[] bArr = new byte[i49];
                            int i51 = i37 << 3;
                            int i52 = c13;
                            int i53 = 0;
                            while (i53 < i49) {
                                int i54 = i53;
                                int i55 = i36;
                                int i56 = 0;
                                for (int i57 = 0; i57 < 8; i57++) {
                                    if (c8659a3.f(i51)) {
                                        i56 = (1 << (7 - i57)) | i56;
                                    }
                                    i51++;
                                }
                                bArr[i54] = (byte) i56;
                                i53 = i54 + 1;
                                i36 = i55;
                            }
                            int i58 = i36;
                            int i59 = iArr3[0];
                            int[] iArr4 = new int[i49 + i59];
                            for (int i61 = 0; i61 < i49; i61++) {
                                iArr4[i61] = bArr[i61] & 255;
                            }
                            new q9.d(C8999a.f81745l).a(iArr4, i59);
                            byte[] bArr2 = new byte[i59];
                            int i62 = 0;
                            while (i62 < i59) {
                                int[] iArr5 = iArr4;
                                bArr2[i62] = (byte) iArr5[i49 + i62];
                                i62++;
                                iArr4 = iArr5;
                            }
                            arrayList.add(new K9.a(bArr, bArr2));
                            i38 = Math.max(i38, i49);
                            i39 = Math.max(i39, i59);
                            i37 += iArr2[0];
                            i36 = i58 + 1;
                            c13 = i52;
                            i13 = 1;
                        }
                        if (g10 != i37) {
                            throw new v("Data bytes does not match offset");
                        }
                        C8659a c8659a4 = new C8659a();
                        for (int i63 = 0; i63 < i38; i63++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] a12 = ((K9.a) it.next()).a();
                                if (i63 < a12.length) {
                                    c8659a4.c(a12[i63], 8);
                                }
                            }
                        }
                        for (int i64 = 0; i64 < i39; i64++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] b13 = ((K9.a) it2.next()).b();
                                if (i64 < b13.length) {
                                    c8659a4.c(b13[i64], 8);
                                }
                            }
                        }
                        if (g11 != c8659a4.k()) {
                            StringBuilder f11 = P4.f.f(g11, "Interleaving error: ", " and ");
                            f11.append(c8659a4.k());
                            f11.append(" differ.");
                            throw new v(f11.toString());
                        }
                        f fVar2 = new f();
                        fVar2.b(fVar);
                        fVar2.e(hVar);
                        fVar2.f(jVar);
                        int e13 = jVar.e();
                        b bVar = new b(e13, e13);
                        if (map != null) {
                            g gVar3 = g.QR_MASK_PATTERN;
                            if (map.containsKey(gVar3)) {
                                i16 = Integer.parseInt(map.get(gVar3).toString());
                            }
                        }
                        i16 = -1;
                        int i65 = -1;
                        if (i16 == -1) {
                            int i66 = Integer.MAX_VALUE;
                            int i67 = 0;
                            while (i67 < 8) {
                                e.a(c8659a4, fVar, jVar, i67, bVar);
                                int a13 = d.a(bVar);
                                byte[][] c14 = bVar.c();
                                int h11 = bVar.h();
                                int e14 = bVar.e();
                                int i68 = 0;
                                int i69 = 0;
                                while (i68 < e14 - 1) {
                                    byte[] bArr3 = c14[i68];
                                    int i71 = a13;
                                    int i72 = 0;
                                    while (i72 < h11 - 1) {
                                        byte b14 = bArr3[i72];
                                        int i73 = i72 + 1;
                                        byte[][] bArr4 = c14;
                                        if (b14 == bArr3[i73]) {
                                            byte[] bArr5 = bArr4[i68 + 1];
                                            if (b14 == bArr5[i72] && b14 == bArr5[i73]) {
                                                i69++;
                                            }
                                        }
                                        c14 = bArr4;
                                        i72 = i73;
                                    }
                                    i68++;
                                    a13 = i71;
                                }
                                int i74 = (i69 * 3) + a13;
                                byte[][] c15 = bVar.c();
                                int h12 = bVar.h();
                                int e15 = bVar.e();
                                int i75 = 0;
                                int i76 = 0;
                                while (i75 < e15) {
                                    int i77 = i76;
                                    int i78 = 0;
                                    while (i78 < h12) {
                                        byte[] bArr6 = c15[i75];
                                        int i79 = i67;
                                        int i81 = i78 + 6;
                                        int i82 = h12;
                                        if (i81 < h12 && bArr6[i78] == 1 && bArr6[i78 + 1] == 0 && bArr6[i78 + 2] == 1 && bArr6[i78 + 3] == 1 && bArr6[i78 + 4] == 1 && bArr6[i78 + 5] == 0 && bArr6[i81] == 1) {
                                            int max = Math.max(i78 - 4, 0);
                                            int min = Math.min(i78, bArr6.length);
                                            while (true) {
                                                if (max >= min) {
                                                    i17 = i65;
                                                    break;
                                                }
                                                int i83 = max;
                                                int i84 = min;
                                                if (bArr6[i83] == 1) {
                                                    i17 = i65;
                                                    int max2 = Math.max(i78 + 7, 0);
                                                    int min2 = Math.min(i78 + 11, bArr6.length);
                                                    while (max2 < min2) {
                                                        int i85 = max2;
                                                        if (bArr6[max2] == 1) {
                                                            break;
                                                        }
                                                        max2 = i85 + 1;
                                                    }
                                                } else {
                                                    max = i83 + 1;
                                                    min = i84;
                                                }
                                            }
                                            i77++;
                                        } else {
                                            i17 = i65;
                                        }
                                        int i86 = i75 + 6;
                                        if (i86 < e15) {
                                            byte b15 = 1;
                                            if (c15[i75][i78] == 1 && c15[i75 + 1][i78] == 0 && c15[i75 + 2][i78] == 1 && c15[i75 + 3][i78] == 1 && c15[i75 + 4][i78] == 1 && c15[i75 + 5][i78] == 0 && c15[i86][i78] == 1) {
                                                int max3 = Math.max(i75 - 4, 0);
                                                int min3 = Math.min(i75, c15.length);
                                                while (true) {
                                                    if (max3 >= min3) {
                                                        break;
                                                    }
                                                    if (c15[max3][i78] == b15) {
                                                        int min4 = Math.min(i75 + 11, c15.length);
                                                        for (int max4 = Math.max(i75 + 7, 0); max4 < min4; max4++) {
                                                            if (c15[max4][i78] == 1) {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        max3++;
                                                        b15 = 1;
                                                    }
                                                }
                                                i77++;
                                            }
                                        }
                                        i78++;
                                        h12 = i82;
                                        i67 = i79;
                                        i65 = i17;
                                    }
                                    i75++;
                                    i76 = i77;
                                }
                                int i87 = i67;
                                int i88 = i65;
                                int i89 = (i76 * 40) + i74;
                                byte[][] c16 = bVar.c();
                                int h13 = bVar.h();
                                int e16 = bVar.e();
                                int i91 = 0;
                                int i92 = 0;
                                while (i91 < e16) {
                                    byte[] bArr7 = c16[i91];
                                    int i93 = i92;
                                    for (int i94 = 0; i94 < h13; i94++) {
                                        if (bArr7[i94] == 1) {
                                            i93++;
                                        }
                                    }
                                    i91++;
                                    i92 = i93;
                                }
                                int h14 = bVar.h() * bVar.e();
                                int abs = (((Math.abs((i92 << 1) - h14) * 10) / h14) * 10) + i89;
                                if (abs < i66) {
                                    i66 = abs;
                                    i65 = i87;
                                } else {
                                    i65 = i88;
                                }
                                i67 = i87 + 1;
                            }
                            i16 = i65;
                        }
                        fVar2.c(i16);
                        e.a(c8659a4, fVar, jVar, i16, bVar);
                        fVar2.d(bVar);
                        return fVar2;
                    }
                }
                int j12 = c8659a2.j() + hVar.b(j.h(i13)) + c8659a.j();
                i14 = i13;
                while (i14 <= 40) {
                    j h15 = j.h(i14);
                    char c17 = c12;
                    if (h15.g() - h15.f(fVar).d() >= (j12 + 7) / 8) {
                        int j13 = c8659a2.j() + hVar.b(h15) + c8659a.j();
                        int i95 = i13;
                        while (i95 <= 40) {
                            j h16 = j.h(i95);
                            if (h16.g() - h16.f(fVar).d() >= (j13 + 7) / i21) {
                                jVar = h16;
                                C8659a c8659a32 = new C8659a();
                                c8659a32.b(c8659a);
                                if (hVar != h.BYTE) {
                                }
                                int b122 = hVar.b(jVar);
                                i15 = i13 << b122;
                                if (k11 < i15) {
                                }
                            } else {
                                i95++;
                                i21 = 8;
                            }
                        }
                        throw new v("Data too big");
                    }
                    i14++;
                    c12 = c17;
                    i21 = 8;
                }
                throw new v("Data too big");
            }
        }
        int i96 = 0;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            if (i96 < str.length()) {
                char charAt4 = str.charAt(i96);
                if (charAt4 < '0' || charAt4 > '9') {
                    if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                        hVar = h.BYTE;
                        break;
                    }
                    z13 = true;
                } else {
                    z14 = true;
                }
                i96++;
            } else {
                hVar = z13 ? h.ALPHANUMERIC : z14 ? h.NUMERIC : h.BYTE;
            }
        }
        c8659a = new C8659a();
        int i212 = 8;
        if (hVar == h.BYTE) {
            c8659a.c(h.ECI.a(), 4);
            c8659a.c(a11.d(), 8);
        }
        if (map != null) {
        }
        c8659a.c(hVar.a(), 4);
        C8659a c8659a22 = new C8659a();
        i12 = a.f15391a[hVar.ordinal()];
        int i222 = 10;
        char c122 = 7;
        if (i12 == 1) {
        }
        if (map != null) {
        }
        int j122 = c8659a22.j() + hVar.b(j.h(i13)) + c8659a.j();
        i14 = i13;
        while (i14 <= 40) {
        }
        throw new v("Data too big");
    }
}
