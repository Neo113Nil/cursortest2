package com.payair.hce;

/* loaded from: classes4.dex */
final class setNavigationIcon {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    private static final long writeReplace = java.lang.Runtime.getRuntime().maxMemory();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01ae, code lost:
    
        if (r9 > 67) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b4, code lost:
    
        r11 = r1 & 105;
        r1 = (r1 ^ 105) | r11;
        com.payair.hce.setNavigationIcon.DigitizedCardProfile = ((r11 & r1) + (r11 | r1)) % 128;
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c1, code lost:
    
        r9 = r9 >>> 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c3, code lost:
    
        if (r9 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c5, code lost:
    
        r1 = com.payair.hce.setNavigationIcon.DigitizedCardProfile;
        r4 = r1 & 51;
        r1 = r1 | 51;
        r6 = ((r4 ^ r1) + ((r1 & r4) << 1)) % 128;
        com.payair.hce.setNavigationIcon.AlternateContactlessPaymentDataJson = r6;
        r1 = r11 & (-105);
        r11 = -(-((r11 ^ (-105)) | r1));
        r4 = ((r1 | r11) << 1) - (r11 ^ r1);
        r11 = r4 ^ 106;
        r1 = (r4 & 106) << 1;
        r11 = (r11 & r1) + (r11 | r1);
        r1 = r6 & 85;
        r4 = (r6 ^ 85) | r1;
        com.payair.hce.setNavigationIcon.DigitizedCardProfile = ((r1 ^ r4) + ((r1 & r4) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01f6, code lost:
    
        r9 = ~r11;
        r9 = ((((r11 | r9) << 1) - (~(-r9))) - 1) << 3;
        r11 = com.payair.hce.setNavigationIcon.DigitizedCardProfile;
        r1 = r11 & 83;
        r11 = -(-((r11 ^ 83) | r1));
        r4 = (r1 ^ r11) + ((r11 & r1) << 1);
        com.payair.hce.setNavigationIcon.AlternateContactlessPaymentDataJson = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0212, code lost:
    
        if ((r4 % 2) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0214, code lost:
    
        r10 = 4 / 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0215, code lost:
    
        if (r9 < 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0217, code lost:
    
        r10 = com.payair.hce.setNavigationIcon.AlternateContactlessPaymentDataJson;
        r11 = r10 & 35;
        com.payair.hce.setNavigationIcon.DigitizedCardProfile = (r11 + ((r10 ^ 35) | r11)) % 128;
        r12 = r12 + 1;
        r9 = r9 - 122;
        r11 = r9 & 114;
        r9 = (r9 | 114) & (~r11);
        r11 = -(-(r11 << 1));
        r9 = (r9 & r11) + (r9 | r11);
        com.payair.hce.setNavigationIcon.DigitizedCardProfile = ((-2) - (~(r10 + 20))) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b2, code lost:
    
        if (r9 > 127) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (i * (-380)) + (i2 * 382) + ((i2 | i3 | i4) * (-381)) + (((~(i | i2)) | (~((~i3) | i2)) | (~((~i2) | i4))) * 381) + ((~(i4 | i2)) * 381);
        int i6 = 4;
        int i7 = 0;
        int i8 = 2;
        if (i5 == 1) {
            int intValue = ((java.lang.Number) objArr[0]).intValue();
            int i9 = DigitizedCardProfile;
            int i10 = (i9 & 19) + (i9 | 19);
            int i11 = i10 % 128;
            AlternateContactlessPaymentDataJson = i11;
            if (i10 % 2 != 0) {
                i7 = 1;
            }
            int i12 = AlternateContactlessPaymentDataJson;
            int i13 = i12 ^ 67;
            DigitizedCardProfile = ((((i12 & 67) | i13) << 1) - i13) % 128;
            return java.lang.Integer.valueOf(i7);
        }
        if (i5 == 2) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int intValue2 = ((java.lang.Number) objArr[0]).intValue();
        int i14 = AlternateContactlessPaymentDataJson;
        int i15 = i14 & 87;
        int i16 = ((i14 ^ 87) | i15) << 1;
        int i17 = -((i14 | 87) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        int i19 = i18 % 128;
        DigitizedCardProfile = i19;
        if (i18 % 2 == 0 ? intValue2 < 31 : intValue2 < 53) {
            i8 = 1;
        } else {
            int i20 = (i19 & (-126)) | ((~i19) & 125);
            int i21 = -(-((i19 & 125) << 1));
            int i22 = ((i20 & i21) + (i20 | i21)) % 128;
            AlternateContactlessPaymentDataJson = i22;
            if (intValue2 < 128) {
                int i23 = i22 & 71;
                int i24 = ((i22 ^ 71) | i23) << 1;
                int i25 = -((~i23) & (i22 | 71));
                DigitizedCardProfile = ((i24 ^ i25) + ((i25 & i24) << 1)) % 128;
                DigitizedCardProfile = ((i22 & 119) + (i22 | 119)) % 128;
            } else {
                byte[] bArr = new byte[5];
                bArr[4] = (byte) (intValue2 & 127);
                int i26 = i19 & 15;
                int i27 = (i19 | 15) & (~i26);
                int i28 = -(-(i26 << 1));
                AlternateContactlessPaymentDataJson = ((i27 & i28) + (i27 | i28)) % 128;
                int i29 = intValue2;
                do {
                    i29 >>= 7;
                    i6--;
                    bArr[i6] = (byte) ((i29 & 127) ^ 128);
                } while (i29 > 127);
                int i30 = AlternateContactlessPaymentDataJson;
                int i31 = ((i30 ^ 17) | (i30 & 17)) << 1;
                int i32 = -((i30 & (-18)) | ((~i30) & 17));
                DigitizedCardProfile = ((i31 ^ i32) + ((i31 & i32) << 1)) % 128;
                int i33 = -i6;
                int i34 = i33 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                int i35 = ~i33;
                int i36 = i35 & (-6);
                int i37 = (i35 | (-6)) & (~i36);
                int i38 = ~((i36 ^ i37) | (i37 & i36));
                int i39 = ~intValue2;
                int i40 = (i39 & i33) | (i39 ^ i33);
                int i41 = i40 ^ 5;
                int i42 = i40 & 5;
                int i43 = (i42 ^ i41) | (i42 & i41);
                int i44 = ~i43;
                int i45 = (i43 | i44) & i44;
                int i46 = i38 & i45;
                int i47 = (i38 | i45) & (~i46);
                int i48 = (i34 ^ (-1095)) + ((i34 & (-1095)) << 1) + (((i47 & i46) | (i47 ^ i46)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
                int i49 = (i39 & (-6)) | ((~i39) & 5);
                int i50 = i39 & 5;
                int i51 = ~((i49 ^ i50) | (i50 & i49));
                int i52 = (i35 & i51) | ((~i51) & i33);
                int i53 = i51 & i33;
                int i54 = ((i53 ^ i52) | (i53 & i52)) * (-440);
                int i55 = (i48 & i54) + (i54 | i48);
                int i56 = (i33 ^ 5) | (i33 & 5);
                int i57 = -(-(((i56 ^ intValue2) | (i56 & intValue2)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE));
                int i58 = ((i55 | i57) << 1) - (i57 ^ i55);
                int i59 = (i58 * 367) + 367;
                int i60 = -(-(((i58 ^ 1) | (i58 & 1)) * (-366)));
                int i61 = (i59 & i60) + (i59 | i60);
                int i62 = intValue2 & (-2);
                int i63 = ~(i62 | ((~i62) & (intValue2 | (-2))));
                int i64 = ~i58;
                int i65 = ((~i63) & i58) | (i63 & i64);
                int i66 = i63 & i58;
                int i67 = -(-(((i66 ^ i65) | (i66 & i65)) * (-366)));
                int i68 = (i61 & i67) + (i67 | i61);
                int i69 = (i64 ^ 1) | (i64 & 1);
                int i70 = ~i69;
                int i71 = (i69 | i70) & i70;
                int i72 = i58 & (-2);
                int i73 = intValue2 | ((i58 | (-2)) & (~i72)) | i72;
                int i74 = ~i73;
                int i75 = (i73 | i74) & i74;
                int i76 = ((~i75) & i71) | ((~i71) & i75);
                int i77 = i75 & i71;
                int i78 = ((i77 ^ i76) | (i77 & i76)) * 366;
                int i79 = i68 & i78;
                int i80 = ((i68 ^ i78) | i79) << 1;
                int i81 = -((i78 | i68) & (~i79));
                DigitizedCardProfile = (((i30 | 5) << 1) - (i30 ^ 5)) % 128;
                i8 = ((i80 | i81) << 1) - (i81 ^ i80);
            }
        }
        AlternateContactlessPaymentDataJson = ((-2) - (~(DigitizedCardProfile + 8))) % 128;
        return java.lang.Integer.valueOf(i8);
    }

    setNavigationIcon() {
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = (((i & (-42)) | ((~i) & 41)) + ((i & 41) << 1)) % 128;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i;
        long j;
        java.io.InputStream inputStream = (java.io.InputStream) objArr[0];
        int i2 = DigitizedCardProfile;
        int i3 = (-2) - (~(i2 + 22));
        int i4 = i3 % 128;
        AlternateContactlessPaymentDataJson = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (inputStream instanceof com.payair.hce.setNavigationOnClickListener) {
            i = ((com.payair.hce.setNavigationOnClickListener) inputStream).values();
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = i5 ^ 97;
            int i7 = -(-((i5 & 97) << 1));
            DigitizedCardProfile = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
        } else if (inputStream instanceof com.payair.hce.setMinHeight) {
            int i8 = i4 ^ 93;
            int i9 = (i4 & 93) << 1;
            int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
            DigitizedCardProfile = i10 % 128;
            if (i10 % 2 != 0) {
                ((com.payair.hce.setMinHeight) inputStream).values();
                throw new java.lang.ArithmeticException();
            }
            i = ((com.payair.hce.setMinHeight) inputStream).values();
            DigitizedCardProfile = ((-2) - (~(AlternateContactlessPaymentDataJson + 44))) % 128;
        } else if (inputStream instanceof java.io.ByteArrayInputStream) {
            int i11 = i2 & 57;
            int i12 = (((i2 | 57) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
            AlternateContactlessPaymentDataJson = i12 % 128;
            if (i12 % 2 == 0) {
                ((java.io.ByteArrayInputStream) inputStream).available();
                throw null;
            }
            i = ((java.io.ByteArrayInputStream) inputStream).available();
            int i13 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = ((i13 & 1) + (i13 | 1)) % 128;
        } else {
            if (inputStream instanceof java.io.FileInputStream) {
                int i14 = ((i4 | 5) << 1) - (i4 ^ 5);
                DigitizedCardProfile = i14 % 128;
                try {
                    if (i14 % 2 != 0) {
                        ((java.io.FileInputStream) inputStream).getChannel();
                        throw new java.lang.NullPointerException();
                    }
                    java.nio.channels.FileChannel channel = ((java.io.FileInputStream) inputStream).getChannel();
                    if (channel != null) {
                        int i15 = DigitizedCardProfile;
                        AlternateContactlessPaymentDataJson = (((i15 ^ 18) + ((i15 & 18) << 1)) - 1) % 128;
                        j = channel.size();
                        int i16 = DigitizedCardProfile + 90;
                        AlternateContactlessPaymentDataJson = ((~i16) + (i16 << 1)) % 128;
                    } else {
                        int i17 = DigitizedCardProfile;
                        int i18 = i17 & 125;
                        int i19 = -(-(i17 | 125));
                        AlternateContactlessPaymentDataJson = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                        j = 2147483647L;
                    }
                    if (j < androidx.collection.SieveCacheKt.NodeLinkMask) {
                        int i20 = DigitizedCardProfile;
                        AlternateContactlessPaymentDataJson = (i20 + 69) % 128;
                        int i21 = (int) j;
                        int i22 = (i20 & 95) + (i20 | 95);
                        AlternateContactlessPaymentDataJson = i22 % 128;
                        if (i22 % 2 != 0) {
                            return java.lang.Integer.valueOf(i21);
                        }
                        throw null;
                    }
                    int i23 = AlternateContactlessPaymentDataJson;
                    int i24 = i23 & 77;
                    int i25 = i23 | 77;
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    DigitizedCardProfile = i26 % 128;
                    int i27 = i26 % 2;
                } catch (java.io.IOException unused) {
                }
            }
            long j2 = writeReplace;
            if (j2 > androidx.collection.SieveCacheKt.NodeLinkMask) {
                int i28 = AlternateContactlessPaymentDataJson;
                int i29 = (((i28 | 66) << 1) - (i28 ^ 66)) - 1;
                DigitizedCardProfile = i29 % 128;
                if (i29 % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                i = Integer.MAX_VALUE;
            } else {
                i = (int) j2;
                int i30 = DigitizedCardProfile;
                int i31 = (i30 & (-8)) | ((~i30) & 7);
                int i32 = -(-((i30 & 7) << 1));
                AlternateContactlessPaymentDataJson = ((i31 ^ i32) + ((i32 & i31) << 1)) % 128;
            }
        }
        return java.lang.Integer.valueOf(i);
    }

    static int valueOf(int i) throws java.io.IOException {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -334301909, 334301909, i)).intValue();
    }

    static int writeReplace(int i) {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, -1174070258, 1174070259, i)).intValue();
    }

    static int valueOf(java.io.InputStream inputStream) {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{inputStream}, -1279936687, 1279936689, (int) java.lang.System.currentTimeMillis())).intValue();
    }
}
