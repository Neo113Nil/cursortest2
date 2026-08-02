package com.google.zxing.qrcode;

import androidx.collection.g;
import com.bumptech.glide.request.e;
import com.google.zxing.c;
import com.google.zxing.common.b;
import com.google.zxing.qrcode.decoder.b;
import com.google.zxing.qrcode.encoder.d;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import kotlin.UByte;

/* loaded from: classes4.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06d4, code lost:
    
        r1 = new com.google.zxing.common.reedsolomon.b[]{r6, r5}[1].b;
        r2 = r7 - r1.length;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06e2, code lost:
    
        if (r13 >= r2) goto L630;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06e4, code lost:
    
        r10[r14 + r13] = 0;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06ec, code lost:
    
        java.lang.System.arraycopy(r1, 0, r10, r14 + r2, r1.length);
        r1 = new byte[r7];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06f5, code lost:
    
        if (r2 >= r7) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06f7, code lost:
    
        r1[r2] = (byte) r10[r3 + r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0701, code lost:
    
        r4.add(new com.google.zxing.qrcode.encoder.a(r0, r1));
        r12 = java.lang.Math.max(r12, r3);
        r13 = java.lang.Math.max(r35, r7);
        r9 = r34 + r15[0];
        r7 = r24 + 1;
        r10 = r45;
        r0 = r21;
        r8 = r25;
        r1 = r26;
        r3 = r27;
        r2 = r28;
        r5 = r29;
        r6 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08b5, code lost:
    
        if (r7 != false) goto L473;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:683:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188 A[LOOP:1: B:62:0x015a->B:70:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x039d A[LOOP:3: B:98:0x039b->B:99:0x039d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(String str, com.google.zxing.a aVar, EnumMap enumMap) throws c {
        int i;
        boolean equals;
        com.google.zxing.qrcode.decoder.a aVar2;
        byte[] bytes;
        int i2;
        int length;
        int i3;
        com.google.zxing.qrcode.decoder.a aVar3;
        com.google.zxing.b bVar;
        int i4;
        int ordinal;
        int i5;
        com.google.zxing.b bVar2;
        com.google.zxing.qrcode.decoder.b bVar3;
        int i6;
        int i7;
        int e;
        int i8;
        int i9;
        int i10;
        byte[][] bArr;
        int i11;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        char c;
        int i14;
        com.google.zxing.common.reedsolomon.b bVar4;
        com.google.zxing.common.reedsolomon.b bVar5;
        com.google.zxing.common.reedsolomon.b bVar6;
        int i15;
        int i16;
        int i17;
        char c2;
        com.google.zxing.common.reedsolomon.a aVar4;
        com.google.zxing.common.reedsolomon.b bVar7;
        int i18;
        com.google.zxing.common.c cVar;
        int i19;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        com.google.zxing.b bVar8 = com.google.zxing.b.a;
        if (enumMap.containsKey(bVar8)) {
            String obj = enumMap.get(bVar8).toString();
            if (obj == null) {
                throw new NullPointerException("Name is null");
            }
            if (!obj.equals("L")) {
                if (obj.equals("M")) {
                    i = 2;
                } else if (obj.equals("Q")) {
                    i = 3;
                } else {
                    if (!obj.equals("H")) {
                        throw new IllegalArgumentException("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(obj));
                    }
                    i = 4;
                }
                com.google.zxing.b bVar9 = com.google.zxing.b.c;
                int parseInt = !enumMap.containsKey(bVar9) ? Integer.parseInt(enumMap.get(bVar9).toString()) : 4;
                com.google.zxing.b bVar10 = com.google.zxing.b.b;
                boolean containsKey = enumMap.containsKey(bVar10);
                String obj2 = !containsKey ? enumMap.get(bVar10).toString() : "ISO-8859-1";
                equals = "Shift_JIS".equals(obj2);
                int[] iArr = com.google.zxing.qrcode.encoder.c.a;
                aVar2 = com.google.zxing.qrcode.decoder.a.BYTE;
                if (equals) {
                    try {
                        bytes = str.getBytes("Shift_JIS");
                        i2 = 0;
                        length = bytes.length;
                    } catch (UnsupportedEncodingException unused) {
                    }
                    if (length % 2 == 0) {
                        for (0; i3 < length; i3 + 2) {
                            int i20 = bytes[i3] & UByte.MAX_VALUE;
                            i3 = ((i20 >= 129 && i20 <= 159) || (i20 >= 224 && i20 <= 235)) ? i3 + 2 : 0;
                        }
                        aVar3 = com.google.zxing.qrcode.decoder.a.KANJI;
                        int[] iArr2 = aVar3.a;
                        com.google.zxing.common.a aVar5 = new com.google.zxing.common.a();
                        if (aVar3 != aVar2 && containsKey && (cVar = (com.google.zxing.common.c) com.google.zxing.common.c.d.get(obj2)) != null) {
                            aVar5.b(7, 4);
                            aVar5.b(cVar.a[i2], 8);
                        }
                        bVar = com.google.zxing.b.e;
                        if (enumMap.containsKey(bVar) || !Boolean.valueOf(enumMap.get(bVar).toString()).booleanValue()) {
                            i4 = 4;
                        } else {
                            i4 = 4;
                            aVar5.b(5, 4);
                        }
                        aVar5.b(aVar3.b, i4);
                        com.google.zxing.common.a aVar6 = new com.google.zxing.common.a();
                        ordinal = aVar3.ordinal();
                        int i21 = 2;
                        int i22 = 8;
                        int i23 = 10;
                        if (ordinal == 1) {
                            if (ordinal == 2) {
                                int length2 = str.length();
                                int i24 = i2;
                                while (i24 < length2) {
                                    char charAt = str.charAt(i24);
                                    int i25 = charAt < '`' ? iArr[charAt] : -1;
                                    int i26 = i21;
                                    if (i25 == -1) {
                                        throw new c();
                                    }
                                    int i27 = i24 + 1;
                                    if (i27 < length2) {
                                        char charAt2 = str.charAt(i27);
                                        int i28 = charAt2 < '`' ? iArr[charAt2] : -1;
                                        if (i28 == -1) {
                                            throw new c();
                                        }
                                        aVar6.b((i25 * 45) + i28, 11);
                                        i24 += 2;
                                        i21 = i26;
                                    } else {
                                        aVar6.b(i25, 6);
                                        i24 = i27;
                                        i21 = i26;
                                    }
                                }
                            } else if (ordinal == i4) {
                                try {
                                    byte[] bytes2 = str.getBytes(obj2);
                                    int length3 = bytes2.length;
                                    int i29 = i2;
                                    while (i29 < length3) {
                                        aVar6.b(bytes2[i29], i22);
                                        i29++;
                                        i22 = 8;
                                    }
                                } catch (UnsupportedEncodingException e2) {
                                    throw new c(e2);
                                }
                            } else {
                                if (ordinal != 6) {
                                    throw new c("Invalid mode: ".concat(String.valueOf(aVar3)));
                                }
                                try {
                                    byte[] bytes3 = str.getBytes("Shift_JIS");
                                    int length4 = bytes3.length;
                                    for (int i30 = i2; i30 < length4; i30 += 2) {
                                        int i31 = ((bytes3[i30] & UByte.MAX_VALUE) << 8) | (bytes3[i30 + 1] & UByte.MAX_VALUE);
                                        int i32 = 33088;
                                        if (i31 < 33088 || i31 > 40956) {
                                            if (i31 < 57408 || i31 > 60351) {
                                                i18 = -1;
                                                if (i18 != -1) {
                                                    throw new c("Invalid byte sequence");
                                                }
                                                aVar6.b(((i18 >> 8) * 192) + (i18 & 255), 13);
                                            } else {
                                                i32 = 49472;
                                            }
                                        }
                                        i18 = i31 - i32;
                                        if (i18 != -1) {
                                        }
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    throw new c(e3);
                                }
                            }
                            i5 = i21;
                        } else {
                            i5 = 2;
                            int length5 = str.length();
                            int i33 = i2;
                            while (i33 < length5) {
                                int charAt3 = str.charAt(i33) - '0';
                                int i34 = i33 + 2;
                                if (i34 < length5) {
                                    aVar6.b(((str.charAt(i33 + 1) - '0') * 10) + (charAt3 * 100) + (str.charAt(i34) - '0'), i23);
                                    i33 += 3;
                                } else {
                                    i33++;
                                    if (i33 < length5) {
                                        aVar6.b((charAt3 * 10) + (str.charAt(i33) - '0'), 7);
                                        i33 = i34;
                                    } else {
                                        aVar6.b(charAt3, 4);
                                    }
                                }
                                i23 = 10;
                            }
                        }
                        bVar2 = com.google.zxing.b.d;
                        if (enumMap.containsKey(bVar2)) {
                            com.google.zxing.qrcode.decoder.b a = com.google.zxing.qrcode.decoder.b.a(1);
                            int i35 = aVar5.b;
                            int i36 = a.a;
                            int i37 = iArr2[i36 <= 9 ? i2 : i36 <= 26 ? 1 : i5] + i35 + aVar6.b;
                            for (int i38 = 1; i38 <= 40; i38++) {
                                com.google.zxing.qrcode.decoder.b a2 = com.google.zxing.qrcode.decoder.b.a(i38);
                                int i39 = a2.c;
                                b.C0144b c0144b = a2.b[e.a(i)];
                                int i40 = c0144b.a;
                                b.a[] aVarArr = c0144b.b;
                                int length6 = aVarArr.length;
                                int i41 = i2;
                                int i42 = i41;
                                while (i41 < length6) {
                                    int i43 = i41;
                                    i42 += aVarArr[i43].a;
                                    i41 = i43 + 1;
                                }
                                if (i39 - (i42 * i40) >= (i37 + 7) / 8) {
                                    int i44 = aVar5.b;
                                    int i45 = a2.a;
                                    int i46 = iArr2[i45 <= 9 ? i2 : i45 <= 26 ? 1 : i5] + i44 + aVar6.b;
                                    for (int i47 = 1; i47 <= 40; i47++) {
                                        com.google.zxing.qrcode.decoder.b a3 = com.google.zxing.qrcode.decoder.b.a(i47);
                                        int i48 = a3.c;
                                        b.C0144b c0144b2 = a3.b[e.a(i)];
                                        int i49 = c0144b2.a;
                                        b.a[] aVarArr2 = c0144b2.b;
                                        int length7 = aVarArr2.length;
                                        int i50 = i2;
                                        int i51 = i50;
                                        while (i50 < length7) {
                                            int i52 = i50;
                                            i51 += aVarArr2[i52].a;
                                            i50 = i52 + 1;
                                        }
                                        if (i48 - (i51 * i49) >= (i46 + 7) / 8) {
                                            bVar3 = a3;
                                        }
                                    }
                                    throw new c("Data too big");
                                }
                            }
                            throw new c("Data too big");
                        }
                        bVar3 = com.google.zxing.qrcode.decoder.b.a(Integer.parseInt(enumMap.get(bVar2).toString()));
                        int i53 = aVar5.b;
                        int i54 = bVar3.a;
                        int i55 = iArr2[i54 <= 9 ? i2 : i54 <= 26 ? 1 : i5] + i53 + aVar6.b;
                        int i56 = bVar3.c;
                        b.C0144b c0144b3 = bVar3.b[e.a(i)];
                        int i57 = c0144b3.a;
                        b.a[] aVarArr3 = c0144b3.b;
                        int length8 = aVarArr3.length;
                        int i58 = i2;
                        int i59 = i58;
                        while (i58 < length8) {
                            i59 += aVarArr3[i58].a;
                            i58++;
                        }
                        if ((i56 - (i59 * i57) >= (i55 + 7) / 8 ? 1 : i2) == 0) {
                            throw new c("Data too big for requested version");
                        }
                        int i60 = bVar3.a;
                        int i61 = bVar3.c;
                        com.google.zxing.common.a aVar7 = new com.google.zxing.common.a();
                        i6 = aVar5.b;
                        aVar7.c(aVar7.b + i6);
                        for (i7 = i2; i7 < i6; i7++) {
                            aVar7.a(aVar5.d(i7));
                        }
                        e = aVar3 != aVar2 ? aVar6.e() : str.length();
                        int i62 = iArr2[i60 > 9 ? i2 : i60 <= 26 ? 1 : i5];
                        i8 = 1 << i62;
                        if (e < i8) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e);
                            sb.append(" is bigger than ");
                            sb.append(i8 - 1);
                            throw new c(sb.toString());
                        }
                        aVar7.b(e, i62);
                        int i63 = aVar6.b;
                        aVar7.c(aVar7.b + i63);
                        for (int i64 = i2; i64 < i63; i64++) {
                            aVar7.a(aVar6.d(i64));
                        }
                        b.C0144b c0144b4 = bVar3.b[e.a(i)];
                        int i65 = c0144b4.a;
                        b.a[] aVarArr4 = c0144b4.b;
                        int length9 = aVarArr4.length;
                        int i66 = i2;
                        int i67 = i66;
                        while (i66 < length9) {
                            i67 += aVarArr4[i66].a;
                            i66++;
                        }
                        int i68 = i61 - (i67 * i65);
                        int i69 = i68 << 3;
                        if (aVar7.b > i69) {
                            throw new c("data bits cannot fit in the QR Code" + aVar7.b + " > " + i69);
                        }
                        for (int i70 = i2; i70 < 4 && aVar7.b < i69; i70++) {
                            aVar7.a(i2);
                        }
                        boolean z5 = i2;
                        int i71 = aVar7.b & 7;
                        if (i71 > 0) {
                            while (i71 < 8) {
                                aVar7.a(z5);
                                i71++;
                                z5 = 0;
                            }
                        }
                        int e4 = i68 - aVar7.e();
                        for (int i72 = 0; i72 < e4; i72++) {
                            aVar7.b((i72 & 1) == 0 ? 236 : 17, 8);
                        }
                        if (aVar7.b != i69) {
                            throw new c("Bits size does not equal capacity");
                        }
                        int i73 = 0;
                        for (b.a aVar8 : aVarArr4) {
                            i73 += aVar8.a;
                        }
                        if (aVar7.e() != i68) {
                            throw new c("Number of bits and data bytes does not match");
                        }
                        ArrayList arrayList = new ArrayList(i73);
                        int i74 = 0;
                        int i75 = 0;
                        int i76 = 0;
                        int i77 = 0;
                        com.google.zxing.common.a aVar9 = aVar7;
                        while (i74 < i73) {
                            int[] iArr3 = new int[1];
                            int[] iArr4 = new int[1];
                            if (i74 >= i73) {
                                throw new c("Block ID too large");
                            }
                            int i78 = i61 % i73;
                            int i79 = i60;
                            int i80 = i73 - i78;
                            int i81 = i61 / i73;
                            int i82 = i68 / i73;
                            int i83 = i82 + 1;
                            int i84 = parseInt;
                            int i85 = i81 - i82;
                            int i86 = (i81 + 1) - i83;
                            if (i85 != i86) {
                                throw new c("EC bytes mismatch");
                            }
                            if (i73 != i80 + i78) {
                                throw new c("RS blocks mismatch");
                            }
                            if (i61 != ((i83 + i86) * i78) + ((i82 + i85) * i80)) {
                                throw new c("Total bytes mismatch");
                            }
                            if (i74 < i80) {
                                c = 0;
                                iArr3[0] = i82;
                                iArr4[0] = i85;
                            } else {
                                c = 0;
                                iArr3[0] = i83;
                                iArr4[0] = i86;
                            }
                            int i87 = iArr3[c];
                            byte[] bArr2 = new byte[i87];
                            int i88 = i75 << 3;
                            int i89 = 0;
                            while (i89 < i87) {
                                int i90 = i74;
                                int i91 = i73;
                                int i92 = i89;
                                int i93 = i88;
                                int i94 = 0;
                                for (int i95 = 0; i95 < 8; i95++) {
                                    if (aVar9.d(i93)) {
                                        i94 |= 1 << (7 - i95);
                                    }
                                    i93++;
                                }
                                bArr2[i92] = (byte) i94;
                                i89 = i92 + 1;
                                i88 = i93;
                                i74 = i90;
                                i73 = i91;
                            }
                            int i96 = i74;
                            int i97 = i73;
                            int i98 = iArr4[0];
                            int[] iArr5 = new int[i87 + i98];
                            for (int i99 = 0; i99 < i87; i99++) {
                                iArr5[i99] = bArr2[i99] & UByte.MAX_VALUE;
                            }
                            com.google.zxing.common.reedsolomon.c cVar2 = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.g);
                            if (i98 == 0) {
                                throw new IllegalArgumentException("No error correction bytes");
                            }
                            int length10 = iArr5.length - i98;
                            if (length10 <= 0) {
                                throw new IllegalArgumentException("No data bytes provided");
                            }
                            ArrayList arrayList2 = cVar2.b;
                            com.google.zxing.common.a aVar10 = aVar9;
                            int size = arrayList2.size();
                            com.google.zxing.qrcode.decoder.b bVar11 = bVar3;
                            com.google.zxing.common.reedsolomon.a aVar11 = cVar2.a;
                            int i100 = i;
                            int i101 = i61;
                            if (i98 >= size) {
                                com.google.zxing.common.reedsolomon.b bVar12 = (com.google.zxing.common.reedsolomon.b) androidx.constraintlayout.motion.widget.a.a(1, arrayList2);
                                int size2 = arrayList2.size();
                                while (size2 <= i98) {
                                    int i102 = size2;
                                    int[] iArr6 = {1, aVar11.a[(size2 - 1) + aVar11.f]};
                                    if (iArr6[0] == 0) {
                                        i15 = i68;
                                        int i103 = 1;
                                        while (i103 < 2 && iArr6[i103] == 0) {
                                            i103++;
                                        }
                                        if (i103 == 2) {
                                            iArr6 = new int[]{0};
                                        } else {
                                            int i104 = 2 - i103;
                                            i17 = i75;
                                            int[] iArr7 = new int[i104];
                                            i16 = i77;
                                            c2 = 0;
                                            System.arraycopy(iArr6, i103, iArr7, 0, i104);
                                            iArr6 = iArr7;
                                            aVar4 = bVar12.a;
                                            if (aVar4.equals(aVar11)) {
                                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                                            }
                                            int[] iArr8 = bVar12.b;
                                            if (iArr8[c2] == 0 || iArr6[c2] == 0) {
                                                bVar7 = aVar4.c;
                                            } else {
                                                int length11 = iArr8.length;
                                                int length12 = iArr6.length;
                                                int[] iArr9 = new int[(length11 + length12) - 1];
                                                int[] iArr10 = iArr6;
                                                int i105 = 0;
                                                while (i105 < length11) {
                                                    int i106 = i105;
                                                    int i107 = iArr8[i106];
                                                    int[] iArr11 = iArr8;
                                                    int i108 = 0;
                                                    while (i108 < length12) {
                                                        int i109 = i106 + i108;
                                                        int i110 = i108;
                                                        iArr9[i109] = iArr9[i109] ^ aVar4.a(i107, iArr10[i110]);
                                                        i108 = i110 + 1;
                                                    }
                                                    i105 = i106 + 1;
                                                    iArr8 = iArr11;
                                                }
                                                bVar7 = new com.google.zxing.common.reedsolomon.b(aVar4, iArr9);
                                            }
                                            bVar12 = bVar7;
                                            arrayList2.add(bVar12);
                                            size2 = i102 + 1;
                                            i68 = i15;
                                            i75 = i17;
                                            i77 = i16;
                                        }
                                    } else {
                                        i15 = i68;
                                    }
                                    i17 = i75;
                                    i16 = i77;
                                    c2 = 0;
                                    aVar4 = bVar12.a;
                                    if (aVar4.equals(aVar11)) {
                                    }
                                }
                            }
                            int i111 = i68;
                            int i112 = i75;
                            int i113 = i77;
                            com.google.zxing.common.reedsolomon.b bVar13 = (com.google.zxing.common.reedsolomon.b) arrayList2.get(i98);
                            int[] iArr12 = new int[length10];
                            System.arraycopy(iArr5, 0, iArr12, 0, length10);
                            if (length10 == 0) {
                                throw new IllegalArgumentException();
                            }
                            if (length10 > 1 && iArr12[0] == 0) {
                                int i114 = 1;
                                while (i114 < length10 && iArr12[i114] == 0) {
                                    i114++;
                                }
                                if (i114 == length10) {
                                    iArr12 = new int[]{0};
                                } else {
                                    int i115 = length10 - i114;
                                    int[] iArr13 = new int[i115];
                                    System.arraycopy(iArr12, i114, iArr13, 0, i115);
                                    iArr12 = iArr13;
                                }
                            }
                            if (i98 < 0) {
                                throw new IllegalArgumentException();
                            }
                            int length13 = iArr12.length;
                            int[] iArr14 = new int[length13 + i98];
                            for (int i116 = 0; i116 < length13; i116++) {
                                iArr14[i116] = aVar11.a(iArr12[i116], 1);
                            }
                            com.google.zxing.common.reedsolomon.b bVar14 = new com.google.zxing.common.reedsolomon.b(aVar11, iArr14);
                            com.google.zxing.common.reedsolomon.a aVar12 = bVar13.a;
                            int[] iArr15 = bVar13.b;
                            boolean equals2 = aVar11.equals(aVar12);
                            com.google.zxing.common.reedsolomon.b bVar15 = aVar11.c;
                            if (!equals2) {
                                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                            }
                            if (iArr15[0] == 0) {
                                throw new IllegalArgumentException("Divide by 0");
                            }
                            if (iArr15[(iArr15.length - 1) - bVar13.b()] == 0) {
                                throw new ArithmeticException();
                            }
                            int i117 = aVar11.a[(aVar11.d - aVar11.b[r1]) - 1];
                            com.google.zxing.common.reedsolomon.b bVar16 = bVar15;
                            while (true) {
                                int[] iArr16 = bVar14.b;
                                com.google.zxing.common.reedsolomon.b bVar17 = bVar15;
                                if (bVar14.b() < bVar13.b() || iArr16[0] == 0) {
                                    break;
                                }
                                int b = bVar14.b() - bVar13.b();
                                int a4 = aVar11.a(iArr16[(iArr16.length - 1) - bVar14.b()], i117);
                                com.google.zxing.common.reedsolomon.a aVar13 = bVar13.a;
                                if (b < 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (a4 == 0) {
                                    bVar5 = aVar13.c;
                                    i14 = i117;
                                    bVar4 = bVar13;
                                } else {
                                    int length14 = iArr15.length;
                                    i14 = i117;
                                    int[] iArr17 = new int[length14 + b];
                                    bVar4 = bVar13;
                                    int i118 = 0;
                                    while (i118 < length14) {
                                        int i119 = i118;
                                        iArr17[i119] = aVar13.a(iArr15[i119], a4);
                                        i118 = i119 + 1;
                                    }
                                    bVar5 = new com.google.zxing.common.reedsolomon.b(aVar13, iArr17);
                                }
                                if (b < 0) {
                                    throw new IllegalArgumentException();
                                }
                                if (a4 == 0) {
                                    bVar6 = bVar17;
                                } else {
                                    int[] iArr18 = new int[b + 1];
                                    iArr18[0] = a4;
                                    bVar6 = new com.google.zxing.common.reedsolomon.b(aVar11, iArr18);
                                }
                                bVar16 = bVar16.a(bVar6);
                                bVar14 = bVar14.a(bVar5);
                                bVar15 = bVar17;
                                i117 = i14;
                                bVar13 = bVar4;
                            }
                        }
                        int i120 = i60;
                        com.google.zxing.qrcode.decoder.b bVar18 = bVar3;
                        int i121 = i;
                        int i122 = parseInt;
                        int i123 = i61;
                        int i124 = i77;
                        if (i68 != i75) {
                            throw new c("Data bytes does not match offset");
                        }
                        com.google.zxing.common.a aVar14 = new com.google.zxing.common.a();
                        for (int i125 = 0; i125 < i76; i125++) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                byte[] bArr3 = ((com.google.zxing.qrcode.encoder.a) it.next()).a;
                                if (i125 < bArr3.length) {
                                    aVar14.b(bArr3[i125], 8);
                                }
                            }
                        }
                        for (int i126 = 0; i126 < i124; i126++) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                byte[] bArr4 = ((com.google.zxing.qrcode.encoder.a) it2.next()).b;
                                if (i126 < bArr4.length) {
                                    aVar14.b(bArr4[i126], 8);
                                }
                            }
                        }
                        if (i123 != aVar14.e()) {
                            StringBuilder c3 = g.c(i123, "Interleaving error: ", " and ");
                            c3.append(aVar14.e());
                            c3.append(" differ.");
                            throw new c(c3.toString());
                        }
                        int i127 = (i120 * 4) + 17;
                        com.google.zxing.qrcode.encoder.b bVar19 = new com.google.zxing.qrcode.encoder.b(i127, i127);
                        int i128 = Integer.MAX_VALUE;
                        int i129 = 0;
                        int i130 = -1;
                        while (true) {
                            i9 = bVar19.c;
                            i10 = bVar19.b;
                            if (i129 >= 8) {
                                break;
                            }
                            com.google.zxing.qrcode.decoder.b bVar20 = bVar18;
                            int i131 = i121;
                            d.a(aVar14, i131, bVar20, i129, bVar19);
                            int a5 = com.amplitude.core.utilities.a.a(bVar19, false) + com.amplitude.core.utilities.a.a(bVar19, true);
                            int i132 = 0;
                            int i133 = 0;
                            while (true) {
                                int i134 = i9 - 1;
                                bArr = bVar19.a;
                                if (i132 >= i134) {
                                    break;
                                }
                                byte[] bArr5 = bArr[i132];
                                int i135 = i133;
                                int i136 = 0;
                                while (i136 < i10 - 1) {
                                    byte b2 = bArr5[i136];
                                    int i137 = i136 + 1;
                                    int i138 = i132;
                                    if (b2 == bArr5[i137]) {
                                        byte[] bArr6 = bArr[i138 + 1];
                                        if (b2 == bArr6[i136] && b2 == bArr6[i137]) {
                                            i135++;
                                        }
                                    }
                                    i136 = i137;
                                    i132 = i138;
                                }
                                i132++;
                                i133 = i135;
                            }
                            int i139 = (i133 * 3) + a5;
                            int i140 = 0;
                            int i141 = 0;
                            while (i140 < i9) {
                                int i142 = 0;
                                while (i142 < i10) {
                                    byte[] bArr7 = bArr[i140];
                                    int i143 = i142 + 6;
                                    int i144 = i139;
                                    if (i143 < i10) {
                                        i11 = i141;
                                        byte b3 = 1;
                                        if (bArr7[i142] == 1 && bArr7[i142 + 1] == 0 && bArr7[i142 + 2] == 1 && bArr7[i142 + 3] == 1 && bArr7[i142 + 4] == 1 && bArr7[i142 + 5] == 0 && bArr7[i143] == 1) {
                                            int max = Math.max(i142 - 4, 0);
                                            int min = Math.min(i142, bArr7.length);
                                            while (true) {
                                                if (max >= min) {
                                                    z3 = true;
                                                    break;
                                                }
                                                int i145 = max;
                                                if (bArr7[i145] == b3) {
                                                    z3 = false;
                                                    break;
                                                }
                                                max = i145 + 1;
                                                b3 = 1;
                                            }
                                            if (!z3) {
                                                int max2 = Math.max(i142 + 7, 0);
                                                int min2 = Math.min(i142 + 11, bArr7.length);
                                                while (true) {
                                                    if (max2 >= min2) {
                                                        z4 = true;
                                                        break;
                                                    }
                                                    int i146 = max2;
                                                    if (bArr7[max2] == 1) {
                                                        z4 = false;
                                                        break;
                                                    }
                                                    max2 = i146 + 1;
                                                }
                                            }
                                            i141 = i11 + 1;
                                            i12 = i140 + 6;
                                            if (i12 < i9) {
                                                byte b4 = 1;
                                                if (bArr[i140][i142] == 1 && bArr[i140 + 1][i142] == 0 && bArr[i140 + 2][i142] == 1 && bArr[i140 + 3][i142] == 1 && bArr[i140 + 4][i142] == 1 && bArr[i140 + 5][i142] == 0 && bArr[i12][i142] == 1) {
                                                    int max3 = Math.max(i140 - 4, 0);
                                                    int min3 = Math.min(i140, bArr.length);
                                                    while (true) {
                                                        if (max3 >= min3) {
                                                            i13 = i140;
                                                            z = true;
                                                            break;
                                                        }
                                                        i13 = i140;
                                                        if (bArr[max3][i142] == b4) {
                                                            z = false;
                                                            break;
                                                        }
                                                        max3++;
                                                        i140 = i13;
                                                        b4 = 1;
                                                    }
                                                    if (!z) {
                                                        int max4 = Math.max(i13 + 7, 0);
                                                        int min4 = Math.min(i13 + 11, bArr.length);
                                                        while (true) {
                                                            if (max4 >= min4) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                            if (bArr[max4][i142] == 1) {
                                                                z2 = false;
                                                                break;
                                                            }
                                                            max4++;
                                                        }
                                                        if (!z2) {
                                                            i142++;
                                                            i139 = i144;
                                                            i140 = i13;
                                                        }
                                                    }
                                                    i141++;
                                                    i142++;
                                                    i139 = i144;
                                                    i140 = i13;
                                                }
                                            }
                                            i13 = i140;
                                            i142++;
                                            i139 = i144;
                                            i140 = i13;
                                        }
                                    } else {
                                        i11 = i141;
                                    }
                                    i141 = i11;
                                    i12 = i140 + 6;
                                    if (i12 < i9) {
                                    }
                                    i13 = i140;
                                    i142++;
                                    i139 = i144;
                                    i140 = i13;
                                }
                                i140++;
                            }
                            int i147 = (i141 * 40) + i139;
                            int i148 = 0;
                            int i149 = 0;
                            while (i148 < i9) {
                                byte[] bArr8 = bArr[i148];
                                int i150 = 0;
                                while (i150 < i10) {
                                    int i151 = i148;
                                    if (bArr8[i150] == 1) {
                                        i149++;
                                    }
                                    i150++;
                                    i148 = i151;
                                }
                                i148++;
                            }
                            int i152 = i9 * i10;
                            int abs = (((Math.abs((i149 << 1) - i152) * 10) / i152) * 10) + i147;
                            if (abs < i128) {
                                i128 = abs;
                                i130 = i129;
                            }
                            i129++;
                            bVar18 = bVar20;
                            i121 = i131;
                        }
                        d.a(aVar14, i121, bVar18, i130, bVar19);
                        int i153 = i122 << 1;
                        int i154 = i10 + i153;
                        int i155 = i153 + i9;
                        int max5 = Math.max(200, i154);
                        int max6 = Math.max(200, i155);
                        int min5 = Math.min(max5 / i154, max6 / i155);
                        int i156 = (max5 - (i10 * min5)) / 2;
                        int i157 = (max6 - (i9 * min5)) / 2;
                        com.google.zxing.common.b bVar21 = new com.google.zxing.common.b(max5, max6);
                        int i158 = 0;
                        while (i158 < i9) {
                            int i159 = i156;
                            int i160 = 0;
                            while (i160 < i10) {
                                if (bVar19.a(i160, i158) == 1) {
                                    if (i157 < 0 || i159 < 0) {
                                        throw new IllegalArgumentException("Left and top must be nonnegative");
                                    }
                                    if (min5 <= 0 || min5 <= 0) {
                                        throw new IllegalArgumentException("Height and width must be at least 1");
                                    }
                                    int i161 = i159 + min5;
                                    int i162 = i157 + min5;
                                    if (i162 > bVar21.b || i161 > bVar21.a) {
                                        throw new IllegalArgumentException("The region must fit inside the matrix");
                                    }
                                    for (int i163 = i157; i163 < i162; i163++) {
                                        int i164 = bVar21.c * i163;
                                        int i165 = i159;
                                        while (i165 < i161) {
                                            int i166 = (i165 / 32) + i164;
                                            int i167 = min5;
                                            int[] iArr19 = bVar21.d;
                                            iArr19[i166] = iArr19[i166] | (1 << (i165 & 31));
                                            i165++;
                                            min5 = i167;
                                        }
                                    }
                                }
                                int i168 = min5;
                                i160++;
                                i159 += i168;
                                min5 = i168;
                            }
                            i158++;
                            i157 += min5;
                        }
                        return bVar21;
                    }
                    i19 = i2;
                    int i169 = i19;
                    int i170 = i169;
                    while (true) {
                        if (i19 < str.length()) {
                            char charAt4 = str.charAt(i19);
                            if (charAt4 < '0' || charAt4 > '9') {
                                if ((charAt4 < '`' ? iArr[charAt4] : -1) == -1) {
                                    break;
                                }
                                i169 = 1;
                            } else {
                                i170 = 1;
                            }
                            i19++;
                        } else if (i169 != 0) {
                            aVar3 = com.google.zxing.qrcode.decoder.a.ALPHANUMERIC;
                        } else if (i170 != 0) {
                            aVar3 = com.google.zxing.qrcode.decoder.a.NUMERIC;
                        }
                    }
                    aVar3 = aVar2;
                    int[] iArr22 = aVar3.a;
                    com.google.zxing.common.a aVar52 = new com.google.zxing.common.a();
                    if (aVar3 != aVar2) {
                    }
                    bVar = com.google.zxing.b.e;
                    if (enumMap.containsKey(bVar)) {
                    }
                    i4 = 4;
                    aVar52.b(aVar3.b, i4);
                    com.google.zxing.common.a aVar62 = new com.google.zxing.common.a();
                    ordinal = aVar3.ordinal();
                    int i212 = 2;
                    int i222 = 8;
                    int i232 = 10;
                    if (ordinal == 1) {
                    }
                    bVar2 = com.google.zxing.b.d;
                    if (enumMap.containsKey(bVar2)) {
                    }
                    int i602 = bVar3.a;
                    int i612 = bVar3.c;
                    com.google.zxing.common.a aVar72 = new com.google.zxing.common.a();
                    i6 = aVar52.b;
                    aVar72.c(aVar72.b + i6);
                    while (i7 < i6) {
                    }
                    if (aVar3 != aVar2) {
                    }
                    int i622 = iArr22[i602 > 9 ? i2 : i602 <= 26 ? 1 : i5];
                    i8 = 1 << i622;
                    if (e < i8) {
                    }
                }
                i2 = 0;
                i19 = i2;
                int i1692 = i19;
                int i1702 = i1692;
                while (true) {
                    if (i19 < str.length()) {
                    }
                    i19++;
                }
                aVar3 = aVar2;
                int[] iArr222 = aVar3.a;
                com.google.zxing.common.a aVar522 = new com.google.zxing.common.a();
                if (aVar3 != aVar2) {
                }
                bVar = com.google.zxing.b.e;
                if (enumMap.containsKey(bVar)) {
                }
                i4 = 4;
                aVar522.b(aVar3.b, i4);
                com.google.zxing.common.a aVar622 = new com.google.zxing.common.a();
                ordinal = aVar3.ordinal();
                int i2122 = 2;
                int i2222 = 8;
                int i2322 = 10;
                if (ordinal == 1) {
                }
                bVar2 = com.google.zxing.b.d;
                if (enumMap.containsKey(bVar2)) {
                }
                int i6022 = bVar3.a;
                int i6122 = bVar3.c;
                com.google.zxing.common.a aVar722 = new com.google.zxing.common.a();
                i6 = aVar522.b;
                aVar722.c(aVar722.b + i6);
                while (i7 < i6) {
                }
                if (aVar3 != aVar2) {
                }
                int i6222 = iArr222[i6022 > 9 ? i2 : i6022 <= 26 ? 1 : i5];
                i8 = 1 << i6222;
                if (e < i8) {
                }
            }
        }
        i = 1;
        com.google.zxing.b bVar92 = com.google.zxing.b.c;
        if (!enumMap.containsKey(bVar92)) {
        }
        com.google.zxing.b bVar102 = com.google.zxing.b.b;
        boolean containsKey2 = enumMap.containsKey(bVar102);
        if (!containsKey2) {
        }
        equals = "Shift_JIS".equals(obj2);
        int[] iArr20 = com.google.zxing.qrcode.encoder.c.a;
        aVar2 = com.google.zxing.qrcode.decoder.a.BYTE;
        if (equals) {
        }
        i2 = 0;
        i19 = i2;
        int i16922 = i19;
        int i17022 = i16922;
        while (true) {
            if (i19 < str.length()) {
            }
            i19++;
        }
        aVar3 = aVar2;
        int[] iArr2222 = aVar3.a;
        com.google.zxing.common.a aVar5222 = new com.google.zxing.common.a();
        if (aVar3 != aVar2) {
        }
        bVar = com.google.zxing.b.e;
        if (enumMap.containsKey(bVar)) {
        }
        i4 = 4;
        aVar5222.b(aVar3.b, i4);
        com.google.zxing.common.a aVar6222 = new com.google.zxing.common.a();
        ordinal = aVar3.ordinal();
        int i21222 = 2;
        int i22222 = 8;
        int i23222 = 10;
        if (ordinal == 1) {
        }
        bVar2 = com.google.zxing.b.d;
        if (enumMap.containsKey(bVar2)) {
        }
        int i60222 = bVar3.a;
        int i61222 = bVar3.c;
        com.google.zxing.common.a aVar7222 = new com.google.zxing.common.a();
        i6 = aVar5222.b;
        aVar7222.c(aVar7222.b + i6);
        while (i7 < i6) {
        }
        if (aVar3 != aVar2) {
        }
        int i62222 = iArr2222[i60222 > 9 ? i2 : i60222 <= 26 ? 1 : i5];
        i8 = 1 << i62222;
        if (e < i8) {
        }
    }
}
