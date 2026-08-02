package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class isOpenannotations implements com.payair.hce.getAutoMigrationSpecs, com.payair.hce.isUserRecoverableError {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;
    private int valueOf;
    private long values;
    private final byte[] writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i5 | i);
        int i7 = (i * (-711)) + (i2 * 713) + (((~(i4 | i)) | i6) * (-712)) + (((~(i | i4 | i5)) | (~(i2 | i | i3))) * (-712)) + ((i4 | i6) * 712);
        if (i7 == 1) {
            return values(objArr);
        }
        if (i7 == 2) {
            return writeReplace(objArr);
        }
        if (i7 != 3) {
            if (i7 != 4) {
                return AlternateContactlessPaymentDataJson(objArr);
            }
            int i8 = DigitizedCardProfile;
            int i9 = i8 & 81;
            AlternateContactlessPaymentDataJson = (i9 + ((i8 ^ 81) | i9)) % 128;
            AlternateContactlessPaymentDataJson = ((i8 & 7) + (i8 | 7)) % 128;
            return 64;
        }
        com.payair.hce.isOpenannotations isopenannotations = (com.payair.hce.isOpenannotations) objArr[0];
        com.payair.hce.isOpenannotations isopenannotations2 = (com.payair.hce.isOpenannotations) objArr[1];
        int i10 = AlternateContactlessPaymentDataJson;
        DigitizedCardProfile = ((i10 ^ 63) + ((i10 & 63) << 1)) % 128;
        byte[] bArr = isopenannotations2.writeReplace;
        java.lang.System.arraycopy(bArr, 0, isopenannotations.writeReplace, 0, bArr.length);
        isopenannotations.valueOf = isopenannotations2.valueOf;
        isopenannotations.values = isopenannotations2.values;
        int i11 = DigitizedCardProfile;
        int i12 = i11 ^ 37;
        int i13 = ((i11 & 37) | i12) << 1;
        int i14 = -i12;
        AlternateContactlessPaymentDataJson = ((i13 & i14) + (i13 | i14)) % 128;
        return null;
    }

    protected abstract void IccPrivateKeyCrtComponentsJson();

    protected abstract void valueOf(long j);

    protected abstract void values(byte[] bArr, int i);

    protected isOpenannotations() {
        this.writeReplace = new byte[4];
        this.valueOf = 0;
    }

    protected isOpenannotations(com.payair.hce.isOpenannotations isopenannotations) {
        this.writeReplace = new byte[4];
        DigitizedCardProfile(new java.lang.Object[]{this, isopenannotations}, 39418888, -39418885, java.lang.System.identityHashCode(this));
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.isOpenannotations isopenannotations = (com.payair.hce.isOpenannotations) objArr[0];
        byte byteValue = ((java.lang.Byte) objArr[1]).byteValue();
        int i = DigitizedCardProfile;
        int i2 = i ^ 9;
        int i3 = (i & 9) << 1;
        AlternateContactlessPaymentDataJson = ((i2 & i3) + (i3 | i2)) % 128;
        byte[] bArr = isopenannotations.writeReplace;
        int i4 = isopenannotations.valueOf;
        int identityHashCode = java.lang.System.identityHashCode(isopenannotations);
        int i5 = -(-(i4 * (-163)));
        int i6 = i5 & 165;
        int i7 = ((i5 ^ 165) | i6) << 1;
        int i8 = -((i5 | 165) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = ~identityHashCode;
        int i11 = (i10 | identityHashCode) & i10;
        int i12 = i11 ^ i4;
        int i13 = ~i4;
        int i14 = i11 & i4;
        int i15 = ~((i14 ^ i12) | (i14 & i12));
        int i16 = i15 & 1;
        int i17 = (i15 | 1) & (~i16);
        int i18 = -(~(-(-(((i17 ^ i16) | (i17 & i16)) * (-328)))));
        int i19 = ((i9 ^ i18) + ((i9 & i18) << 1)) - 1;
        int i20 = i10 & 1;
        int i21 = -(~(-(-(((identityHashCode & (-2)) | i20 | (identityHashCode & 1)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))));
        int i22 = (-2) - (~((i19 ^ i21) + ((i21 & i19) << 1)));
        int i23 = i13 & (-2);
        int i24 = ~(i23 | ((i13 | (-2)) & (~i23)));
        int i25 = (i10 & i13) | ((~i13) & identityHashCode);
        int i26 = identityHashCode & i13;
        int i27 = ~((i26 ^ i25) | (i25 & i26));
        int i28 = ((~i27) & i24) | ((~i24) & i27);
        int i29 = i27 & i24;
        int i30 = (i29 ^ i28) | (i29 & i28);
        int i31 = ((~i10) & 1) | (i10 & (-2)) | i20;
        int i32 = i31 & i4;
        int i33 = (i31 | i4) & (~i32);
        int i34 = (i33 ^ i32) | (i33 & i32);
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = ((~i36) & i30) | ((~i30) & i36);
        int i38 = i30 & i36;
        int i39 = -(-(((i38 ^ i37) | (i38 & i37)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE));
        int i40 = i22 & i39;
        int i41 = ((i22 ^ i39) | i40) << 1;
        int i42 = -((i39 | i22) & (~i40));
        int i43 = (i41 & i42) + (i42 | i41);
        isopenannotations.valueOf = i43;
        bArr[i4] = byteValue;
        byte[] bArr2 = isopenannotations.writeReplace;
        if (i43 == bArr2.length) {
            int i44 = DigitizedCardProfile;
            int i45 = ((i44 ^ 59) - (~(-(-((i44 & 59) << 1))))) - 1;
            AlternateContactlessPaymentDataJson = i45 % 128;
            if (i45 % 2 != 0) {
                isopenannotations.values(bArr2, 1);
            } else {
                isopenannotations.values(bArr2, 0);
            }
            isopenannotations.valueOf = 0;
        }
        isopenannotations.values++;
        int i46 = DigitizedCardProfile;
        int i47 = i46 ^ 107;
        int i48 = (i46 & 107) << 1;
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        AlternateContactlessPaymentDataJson = i49 % 128;
        if (i49 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e5, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e6, code lost:
    
        if (r6 >= r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        r7 = com.payair.hce.isOpenannotations.DigitizedCardProfile;
        com.payair.hce.isOpenannotations.AlternateContactlessPaymentDataJson = ((-2) - (~(((r7 | 2) << r2) - (r7 ^ 2)))) % 128;
        r8 = r1.writeReplace;
        r10 = r1.valueOf;
        r13 = r10 & 1;
        r14 = -(-(r10 | 1));
        r15 = (r13 & r14) + (r13 | r14);
        r1.valueOf = r15;
        r13 = (r6 ^ 1) + ((r6 & 1) << r2);
        r14 = r6 * 592;
        r0 = -(-(r5 * (-590)));
        r16 = r14 & r0;
        r0 = (r0 ^ r14) | r16;
        r14 = ((r16 | r0) << r2) - (r16 ^ r0);
        r0 = ~r6;
        r2 = (r0 ^ r5) | (r0 & r5);
        r16 = r4;
        r4 = -(-((~r2) * (-1182)));
        r17 = ((r14 ^ r4) | (r14 & r4)) << 1;
        r4 = -(((~r4) & r14) | ((~r14) & r4));
        r13 = r0 ^ r12;
        r0 = r0 & r12;
        r0 = (r0 & r13) | (r13 ^ r0);
        r13 = r0 & r12;
        r0 = ~(((r0 | r12) & (~r13)) | r13);
        r13 = r6 ^ r5;
        r6 = r6 & r5;
        r6 = (r6 ^ r13) | (r13 & r6);
        r13 = ~r6;
        r6 = (r6 | r13) & r13;
        r13 = (((r17 & r4) + (r17 | r4)) - (~(((r0 ^ r6) | (r0 & r6)) * (-591)))) - 1;
        r0 = ((r2 & r9) | (r2 ^ r9)) * 591;
        r8[r10] = r3[(((~r0) & r13) | ((~r13) & r0)) + ((r0 & r13) << 1)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0179, code lost:
    
        if (r15 != 4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ab, code lost:
    
        r6 = r13;
        r4 = r16;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x017b, code lost:
    
        r0 = r7 & 31;
        r2 = (r7 ^ 31) | r0;
        r4 = r0 ^ r2;
        r0 = r0 & r2;
        r2 = 1;
        r4 = r4 + (r0 << 1);
        com.payair.hce.isOpenannotations.AlternateContactlessPaymentDataJson = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x018c, code lost:
    
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x018e, code lost:
    
        r1.values(r8, 1);
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0197, code lost:
    
        r1.valueOf = r0;
        r0 = com.payair.hce.isOpenannotations.AlternateContactlessPaymentDataJson;
        com.payair.hce.isOpenannotations.DigitizedCardProfile = ((((r0 | 28) << 1) - (r0 ^ 28)) - 1) % 128;
        r0 = r13;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0193, code lost:
    
        r0 = 0;
        r1.values(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01b3, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e3, code lost:
    
        if (r1.valueOf != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x00da, code lost:
    
        if (r1.valueOf != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int max;
        int i = 0;
        com.payair.hce.isOpenannotations isopenannotations = (com.payair.hce.isOpenannotations) objArr[0];
        int i2 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int i3 = intValue ^ (-519336214);
        int i4 = ~intValue;
        int i5 = intValue & (-519336214);
        int i6 = (-59060395) - (~(-(-((~((i3 ^ i5) | (i3 & i5))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))));
        int i7 = ((i6 ^ 101180020) | (i6 & 101180020)) << 1;
        int i8 = -((101180020 & (~i6)) | (i6 & (-101180021)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        int i10 = i4 & (-519336214);
        int i11 = ~((((-519336214) | i4) & (~i10)) | i10);
        int i12 = i11 & 1610680896;
        int i13 = (i11 | 1610680896) & (~i12);
        int i14 = -(-(((i13 ^ i12) | (i13 & i12)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING));
        int i15 = i9 & i14;
        int i16 = (i14 ^ i9) | i15;
        int i17 = (intValue | 21233668) * 988;
        int i18 = i17 & 1754638348;
        int i19 = ((i17 ^ 1754638348) | i18) << 1;
        int i20 = -((i17 | 1754638348) & (~i18));
        int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
        int i22 = ~((1498886773 ^ i4) | (i4 & 1498886773));
        int i23 = ((i22 ^ (-1565995638)) | (i22 & (-1565995638))) * (-1976);
        int i24 = ((i21 & i23) - (~(-(-(i23 | i21))))) - 1;
        int i25 = intValue & 88342532;
        int i26 = (88342532 | intValue) & (~i25);
        int i27 = ~((i26 ^ i25) | (i26 & i25));
        int i28 = (21233668 ^ i27) | (i27 & 21233668);
        int i29 = i4 | intValue;
        int i30 = i4 & i29;
        int i31 = i30 & (-88342533);
        int i32 = ((~i31) & ((-88342533) | i30)) | i31;
        int i33 = ~i32;
        int i34 = (i32 | i33) & i33;
        int i35 = -(-(((i34 ^ i28) | (i34 & i28)) * 988));
        int i36 = i24 & i35;
        int i37 = ((i24 ^ i35) | i36) << 1;
        int i38 = -((i35 | i24) & (~i36));
        if ((i15 ^ i16) + ((i16 & i15) << 1) > ((i37 | i38) << 1) - (i38 ^ i37)) {
            max = java.lang.Math.max(0, intValue2);
        } else {
            max = java.lang.Math.max(0, intValue2);
        }
        int i39 = -i;
        int i40 = (((((max ^ i39) | (max & i39)) << i2) - (~(-(((~i39) & max) | ((~max) & i39))))) - i2) & (-4);
        int i41 = i * 567;
        int i42 = i40 * (-565);
        int i43 = i41 & i42;
        int i44 = ((((i41 ^ i42) | i43) << i2) - (~(-((i41 | i42) & (~i43))))) - i2;
        int i45 = ~i;
        int i46 = ~i40;
        int i47 = i45 & i46;
        int i48 = ((~i45) & i40) | i47;
        int i49 = i40 & i45;
        int i50 = ~((i49 ^ i48) | (i48 & i49));
        int i51 = i45 & intValue;
        int i52 = (i45 | intValue) & (~i51);
        int i53 = ~((i51 ^ i52) | (i52 & i51));
        int i54 = i50 & i53;
        int i55 = (i50 | i53) & (~i54);
        int i56 = -(-(((i55 ^ i54) | (i55 & i54)) * (-566)));
        int i57 = i44 ^ i56;
        int i58 = ((i56 & i44) | i57) << 1;
        int i59 = -i57;
        int i60 = ((~i46) & i) | i47;
        int i61 = i46 & i;
        int i62 = (-2) - (~((((i58 & i59) + (i58 | i59)) - (~(-(~(-(-((~((i61 & i60) | (i60 ^ i61))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))))))) - 1));
        int i63 = (i45 | i46) & (~i47);
        int i64 = (i63 ^ i47) | (i63 & i47);
        int i65 = -(-((~(((~i64) & intValue) | (i64 & i4) | (i64 & intValue))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST));
        int i66 = DigitizedCardProfile;
        int i67 = ((i66 & (-34)) | ((~i66) & 33)) + ((i66 & 33) << 1);
        AlternateContactlessPaymentDataJson = i67 % 128;
        int i68 = i67 % 2;
        while (i < (i62 & i65) + (i62 | i65)) {
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 59) % 128;
            int i69 = i * 624;
            int i70 = intValue * (-622);
            int i71 = ((i69 | i70) << 1) - ((i69 & (~i70)) | ((~i69) & i70));
            int i72 = i30 ^ i;
            int i73 = ~i;
            int i74 = i30 & i;
            int i75 = (i72 ^ i74) | (i72 & i74);
            int i76 = (i75 & i4) | ((~i75) & intValue);
            int i77 = i75 & intValue;
            int i78 = (i77 ^ i76) | (i77 & i76);
            int i79 = ~i78;
            int i80 = -(-(((i78 | i79) & i79) * 623));
            int i81 = i71 & i80;
            int i82 = (i80 | i71) & (~i81);
            int i83 = -(-(i81 << 1));
            int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
            int i85 = i73 & intValue;
            int i86 = (i73 | intValue) & (~i85);
            int i87 = (i85 ^ i86) | (i85 & i86);
            int i88 = ~i87;
            int i89 = (i87 | i88) & i88;
            int i90 = i30 & i89;
            int i91 = (i89 | i30) & (~i90);
            int i92 = ((i91 ^ i90) | (i91 & i90)) * (-623);
            int i93 = i84 ^ i92;
            int i94 = (((i92 & i84) | i93) << 1) - i93;
            int i95 = ~(((i30 | i) & (~i74)) | i74);
            int i96 = i4 & intValue;
            int i97 = (~i96) & i29;
            int i98 = ~((i96 ^ i97) | (i96 & i97));
            int i99 = ((~i98) & i95) | ((~i95) & i98);
            int i100 = i95 & i98;
            int i101 = (i100 ^ i99) | (i100 & i99);
            int i102 = i ^ intValue;
            int i103 = i & intValue;
            int i104 = ~((i102 ^ i103) | (i102 & i103));
            int i105 = i101 ^ i104;
            int i106 = i101 & i104;
            int i107 = ((i106 ^ i105) | (i106 & i105)) * 623;
            int i108 = i94 ^ i107;
            int i109 = ((i94 & i107) | i108) << 1;
            int i110 = -i108;
            isopenannotations.values(bArr, ((i109 | i110) << 1) - (i109 ^ i110));
            i = (((i | 5) << 1) - (i ^ 5)) - 1;
            AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 11) % 128;
        }
        while (i < max) {
            int i111 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((((i111 & (-80)) | ((~i111) & 79)) - (~(-(-((i111 & 79) << 1))))) - 1) % 128;
            byte[] bArr2 = isopenannotations.writeReplace;
            int i112 = isopenannotations.valueOf;
            isopenannotations.valueOf = i112 + 1;
            int i113 = i & 41;
            int i114 = i113 + ((i ^ 41) | i113);
            int i115 = (i114 | (-40)) << 1;
            int i116 = -((i114 & 39) | ((~i114) & (-40)));
            int i117 = ((intValue ^ i) | (intValue & i)) << 1;
            int i118 = -(((~i) & intValue) | (i & i4));
            bArr2[i112] = bArr[(i117 ^ i118) + ((i118 & i117) << 1)];
            DigitizedCardProfile = (i111 + 81) % 128;
            i = ((i115 | i116) << 1) - (i116 ^ i115);
        }
        isopenannotations.values += max;
        int i119 = AlternateContactlessPaymentDataJson;
        int i120 = ((i119 | 31) << 1) - (i119 ^ 31);
        DigitizedCardProfile = i120 % 128;
        if (i120 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        long j;
        com.payair.hce.isOpenannotations isopenannotations = (com.payair.hce.isOpenannotations) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = i & 99;
        int i3 = i | 99;
        int i4 = (i2 & i3) + (i3 | i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 != 0) {
            j = isopenannotations.values >> 2;
            DigitizedCardProfile(new java.lang.Object[]{isopenannotations, (byte) 43}, 1558247241, -1558247240, java.lang.System.identityHashCode(isopenannotations));
        } else {
            j = isopenannotations.values << 3;
            DigitizedCardProfile(new java.lang.Object[]{isopenannotations, Byte.MIN_VALUE}, 1558247241, -1558247240, java.lang.System.identityHashCode(isopenannotations));
        }
        while (isopenannotations.valueOf != 0) {
            int i5 = DigitizedCardProfile;
            int i6 = i5 & 33;
            int i7 = (i5 | 33) & (~i6);
            int i8 = -(-(i6 << 1));
            AlternateContactlessPaymentDataJson = ((i7 & i8) + (i7 | i8)) % 128;
            DigitizedCardProfile(new java.lang.Object[]{isopenannotations, (byte) 0}, 1558247241, -1558247240, java.lang.System.identityHashCode(isopenannotations));
            int i9 = DigitizedCardProfile;
            AlternateContactlessPaymentDataJson = (((i9 | 87) << 1) - (i9 ^ 87)) % 128;
        }
        isopenannotations.valueOf(j);
        isopenannotations.IccPrivateKeyCrtComponentsJson();
        int i10 = DigitizedCardProfile;
        int i11 = (((i10 | 48) << 1) - (i10 ^ 48)) - 1;
        AlternateContactlessPaymentDataJson = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.getTransactionExecutor
    public void valueOf() {
        int i;
        int i2 = AlternateContactlessPaymentDataJson;
        int i3 = ((i2 | 15) << 1) - ((i2 & (-16)) | ((~i2) & 15));
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        if (i3 % 2 == 0) {
            this.values = 1L;
            this.valueOf = 0;
            i = 1;
        } else {
            this.values = 0L;
            this.valueOf = 0;
            i = 0;
        }
        AlternateContactlessPaymentDataJson = (i4 + 13) % 128;
        while (true) {
            byte[] bArr = this.writeReplace;
            if (i >= bArr.length) {
                break;
            }
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = i5 + 59;
            DigitizedCardProfile = i6 % 128;
            if (i6 % 2 == 0) {
                bArr[i] = 0;
                i = ((i | 110) << 1) - (i ^ 110);
            } else {
                bArr[i] = 0;
                int i7 = ((i ^ 1) | (i & 1)) << 1;
                int i8 = -((i & (-2)) | ((~i) & 1));
                i = (i7 ^ i8) + ((i7 & i8) << 1);
            }
            DigitizedCardProfile = ((-2) - (~(i5 + 34))) % 128;
        }
        int i9 = DigitizedCardProfile;
        int i10 = (((i9 | 7) << 1) - (~(-(i9 ^ 7)))) - 1;
        AlternateContactlessPaymentDataJson = i10 % 128;
        if (i10 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // com.payair.hce.getAutoMigrationSpecs
    public final int DigitizedCardProfile() {
        return ((java.lang.Integer) DigitizedCardProfile(new java.lang.Object[]{this}, 1519558903, -1519558899, java.lang.System.identityHashCode(this))).intValue();
    }

    public final void writeReplace() {
        DigitizedCardProfile(new java.lang.Object[]{this}, -855747308, 855747310, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final void DigitizedCardProfile(byte[] bArr, int i, int i2) {
        DigitizedCardProfile(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -1373183168, 1373183168, i);
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final void DigitizedCardProfile(byte b) {
        DigitizedCardProfile(new java.lang.Object[]{this, java.lang.Byte.valueOf(b)}, 1558247241, -1558247240, java.lang.System.identityHashCode(this));
    }

    protected final void valueOf(com.payair.hce.isOpenannotations isopenannotations) {
        DigitizedCardProfile(new java.lang.Object[]{this, isopenannotations}, 39418888, -39418885, java.lang.System.identityHashCode(this));
    }
}
