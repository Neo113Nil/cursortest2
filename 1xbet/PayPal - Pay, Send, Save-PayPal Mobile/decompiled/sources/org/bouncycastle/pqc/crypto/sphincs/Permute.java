package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes17.dex */
class Permute {
    static void getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = org.bouncycastle.util.Pack.littleEndianToInt(bArr2, i * 4);
        }
        int i2 = 12 % 2;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i7 = iArr[4];
        int i8 = iArr[5];
        int i9 = iArr[6];
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = iArr[9];
        int i13 = iArr[10];
        int i14 = iArr[11];
        int i15 = iArr[12];
        int i16 = iArr[13];
        int i17 = iArr[14];
        int i18 = iArr[15];
        for (int i19 = 12; i19 > 0; i19 -= 2) {
            int i20 = i3 + i7;
            int i21 = i15 ^ i20;
            int i22 = (i21 >>> (-16)) | (i21 << 16);
            int i23 = i11 + i22;
            int i24 = i7 ^ i23;
            int i25 = (i24 >>> (-12)) | (i24 << 12);
            int i26 = i20 + i25;
            int i27 = i22 ^ i26;
            int i28 = (i27 >>> (-8)) | (i27 << 8);
            int i29 = i23 + i28;
            int i30 = i25 ^ i29;
            int i31 = (i30 >>> (-7)) | (i30 << 7);
            int i32 = i4 + i8;
            int i33 = i16 ^ i32;
            int i34 = (i33 >>> (-16)) | (i33 << 16);
            int i35 = i12 + i34;
            int i36 = i8 ^ i35;
            int i37 = (i36 >>> (-12)) | (i36 << 12);
            int i38 = i32 + i37;
            int i39 = i34 ^ i38;
            int i40 = (i39 >>> (-8)) | (i39 << 8);
            int i41 = i35 + i40;
            int i42 = i37 ^ i41;
            int i43 = (i42 >>> (-7)) | (i42 << 7);
            int i44 = i5 + i9;
            int i45 = i17 ^ i44;
            int i46 = (i45 >>> (-16)) | (i45 << 16);
            int i47 = i13 + i46;
            int i48 = i9 ^ i47;
            int i49 = (i48 >>> (-12)) | (i48 << 12);
            int i50 = i44 + i49;
            int i51 = i46 ^ i50;
            int i52 = (i51 >>> (-8)) | (i51 << 8);
            int i53 = i47 + i52;
            int i54 = i49 ^ i53;
            int i55 = (i54 >>> (-7)) | (i54 << 7);
            int i56 = i6 + i10;
            int i57 = i18 ^ i56;
            int i58 = (i57 >>> (-16)) | (i57 << 16);
            int i59 = i14 + i58;
            int i60 = i10 ^ i59;
            int i61 = (i60 >>> (-12)) | (i60 << 12);
            int i62 = i56 + i61;
            int i63 = i58 ^ i62;
            int i64 = (i63 >>> (-8)) | (i63 << 8);
            int i65 = i59 + i64;
            int i66 = i61 ^ i65;
            int i67 = (i66 >>> (-7)) | (i66 << 7);
            int i68 = i26 + i43;
            int i69 = i64 ^ i68;
            int i70 = (i69 >>> (-16)) | (i69 << 16);
            int i71 = i53 + i70;
            int i72 = i43 ^ i71;
            int i73 = (i72 >>> (-12)) | (i72 << 12);
            i3 = i68 + i73;
            int i74 = i70 ^ i3;
            i18 = (i74 >>> (-8)) | (i74 << 8);
            i13 = i71 + i18;
            int i75 = i73 ^ i13;
            i8 = (i75 >>> (-7)) | (i75 << 7);
            int i76 = i38 + i55;
            int i77 = i28 ^ i76;
            int i78 = (i77 >>> (-16)) | (i77 << 16);
            int i79 = i65 + i78;
            int i80 = i55 ^ i79;
            int i81 = (i80 >>> (-12)) | (i80 << 12);
            i4 = i76 + i81;
            int i82 = i78 ^ i4;
            i15 = (i82 >>> (-8)) | (i82 << 8);
            i14 = i79 + i15;
            int i83 = i81 ^ i14;
            i9 = (i83 >>> (-7)) | (i83 << 7);
            int i84 = i50 + i67;
            int i85 = i40 ^ i84;
            int i86 = (i85 >>> (-16)) | (i85 << 16);
            int i87 = i29 + i86;
            int i88 = i67 ^ i87;
            int i89 = (i88 >>> (-12)) | (i88 << 12);
            i5 = i84 + i89;
            int i90 = i86 ^ i5;
            i16 = (i90 >>> (-8)) | (i90 << 8);
            i11 = i87 + i16;
            int i91 = i89 ^ i11;
            i10 = (i91 >>> (-7)) | (i91 << 7);
            int i92 = i62 + i31;
            int i93 = i52 ^ i92;
            int i94 = (i93 >>> (-16)) | (i93 << 16);
            int i95 = i41 + i94;
            int i96 = i31 ^ i95;
            int i97 = (i96 >>> (-12)) | (i96 << 12);
            i6 = i92 + i97;
            int i98 = i94 ^ i6;
            i17 = (i98 >>> (-8)) | (i98 << 8);
            i12 = i95 + i17;
            int i99 = i97 ^ i12;
            i7 = (i99 >>> (-7)) | (i99 << 7);
        }
        iArr[0] = i3;
        iArr[1] = i4;
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[4] = i7;
        iArr[5] = i8;
        iArr[6] = i9;
        iArr[7] = i10;
        iArr[8] = i11;
        iArr[9] = i12;
        iArr[10] = i13;
        iArr[11] = i14;
        iArr[12] = i15;
        iArr[13] = i16;
        iArr[14] = i17;
        iArr[15] = i18;
        for (int i100 = 0; i100 < 16; i100++) {
            org.bouncycastle.util.Pack.intToLittleEndian(iArr[i100], bArr, i100 * 4);
        }
    }

    Permute() {
    }
}
