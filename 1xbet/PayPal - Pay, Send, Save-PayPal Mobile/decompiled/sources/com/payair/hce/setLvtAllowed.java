package com.payair.hce;

/* loaded from: classes4.dex */
public class setLvtAllowed extends android.database.sqlite.SQLiteOpenHelper {
    private static int DigitizedCardProfile = 0;
    private static int RecordsJson = 1;
    private static int values = 1;
    private static com.payair.hce.setLvtAllowed writeReplace;
    private com.payair.hce.insert valueOf;
    private static int[] AlternateContactlessPaymentDataJson = {1471669815, 763598720, -2103018747, 1148667784, 1667404942, -2133782053, 588742689, -523036655, -1463590654, -980695847, 898867770, -1859499801, 557825780, -1389247414, 1492201535, 1119716813, -1620693537, 1630432172};
    private static int getAid = 52;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | (~i2));
        int i5 = i | i2;
        int i6 = (i * (-755)) + (i2 * (-755)) + (i4 * 1512) + (((~(i5 | i3)) | i4) * (-756)) + (((~i3) | i5) * 756);
        return i6 != 1 ? i6 != 2 ? valueOf(objArr) : DigitizedCardProfile(objArr) : values(objArr);
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        if (writeReplace == null) {
            synchronized (com.payair.hce.setLvtAllowed.class) {
                if (writeReplace == null) {
                    writeReplace = new com.payair.hce.setLvtAllowed(context.getApplicationContext());
                }
            }
        }
        return writeReplace;
    }

    private setLvtAllowed(android.content.Context context) {
        super(context, ((java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{new int[]{827081936, 1839986753, -1564344623, -1303968898}}, 1430857407, -1430857406, (int) java.lang.System.currentTimeMillis())).intern(), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        int i = getAid;
        int i2 = i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = -(-((i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i2));
        RecordsJson = ((i2 & i3) + (i2 | i3)) % 128;
        int i4 = (-2) - (~(i + 74));
        int i5 = i4 % 128;
        RecordsJson = i5;
        if (i4 % 2 == 0) {
            int i6 = 2 / 5;
        }
        int i7 = i5 & 111;
        getAid = (((((i5 ^ 111) | i7) << 1) - (~(-((~i7) & (i5 | 111))))) - 1) % 128;
        int i8 = DigitizedCardProfile;
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i9 = -(-(i8 * (-271)));
        int i10 = i9 & 25389;
        int i11 = (i9 ^ 25389) | i10;
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        int i13 = ~i8;
        int i14 = i13 | (-94);
        int i15 = ~identityHashCode;
        int i16 = ((~i15) & i14) | ((~i14) & i15);
        int i17 = i14 & i15;
        int i18 = ~((i17 ^ i16) | (i17 & i16));
        int i19 = i8 & 93;
        int i20 = (~i19) & (i8 | 93);
        int i21 = (i19 ^ i20) | (i19 & i20);
        int i22 = i21 & identityHashCode;
        int i23 = ~(((i21 | identityHashCode) & (~i22)) | i22);
        int i24 = ((i18 ^ i23) | (i18 & i23)) * (-272);
        int i25 = ((~i24) & i12) | ((~i12) & i24);
        int i26 = (i24 & i12) << 1;
        int i27 = i8 & (-94);
        int i28 = (~i27) & (i8 | (-94));
        int i29 = ~((i27 ^ i28) | (i27 & i28));
        int i30 = ~((identityHashCode & (-94)) | (identityHashCode ^ (-94)));
        int i31 = ((~i30) & i29) | ((~i29) & i30);
        int i32 = i29 & i30;
        int i33 = (((i25 & i26) + (i26 | i25)) - (~(((i32 & i31) | (i32 ^ i31)) * (-272)))) - 1;
        int i34 = identityHashCode ^ 93;
        int i35 = identityHashCode & 93;
        int i36 = ~((i35 ^ i34) | (i35 & i34));
        int i37 = (i13 & i36) | ((~i36) & i8);
        int i38 = i8 & i36;
        int i39 = -(~(-(-(((i38 ^ i37) | (i38 & i37)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))));
        int i40 = (((i33 | i39) << 1) - (i39 ^ i33)) - 1;
        values = i40 % 128;
        int i41 = getAid;
        if (i40 % 2 == 0) {
            RecordsJson = ((((i41 ^ 17) | (i41 & 17)) << 1) - ((i41 & (-18)) | ((~i41) & 17))) % 128;
            int i42 = (i41 ^ 5) + ((i41 & 5) << 1);
            RecordsJson = i42 % 128;
            boolean z = i42 % 2 == 0;
            int i43 = i41 & 89;
            int i44 = -(-(i41 | 89));
            RecordsJson = (((i43 | i44) << 1) - (i44 ^ i43)) % 128;
            if (!z) {
                this.valueOf.h_(sQLiteDatabase);
                throw null;
            }
        } else {
            int i45 = i41 + 81;
            int i46 = i45 % 128;
            RecordsJson = i46;
            if (i45 % 2 == 0) {
                int i47 = 3 / 4;
            }
            getAid = (i46 + 19) % 128;
        }
        this.valueOf.h_(sQLiteDatabase);
        int i48 = RecordsJson;
        int i49 = i48 & 9;
        int i50 = (i48 | 9) & (~i49);
        int i51 = i49 << 1;
        getAid = ((i50 & i51) + (i50 | i51)) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0109, code lost:
    
        if ((r11 >>> 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x012c, code lost:
    
        r10 = (-2) - (~(r10 + 36));
        com.payair.hce.setLvtAllowed.RecordsJson = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0137, code lost:
    
        if ((r10 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0139, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x013a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x011b, code lost:
    
        r10 = r12 ^ 59;
        r11 = (r12 & 59) << 1;
        com.payair.hce.setLvtAllowed.getAid = ((r10 ^ r11) + ((r10 & r11) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0119, code lost:
    
        if ((r0 % 2) == 0) goto L15;
     */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = getAid;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        int i5 = i4 % 128;
        RecordsJson = i5;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i6 = ((i5 ^ 13) + ((i5 & 13) << 1)) % 128;
        getAid = i6;
        int i7 = ((((i6 | 44) << 1) - (i6 ^ 44)) - 1) % 128;
        RecordsJson = i7;
        int i8 = DigitizedCardProfile;
        int i9 = 28118 - (~(-(~(i8 * (-271)))));
        int i10 = (~i9) + (i9 << 1);
        int i11 = ~i8;
        int i12 = (i11 ^ (-104)) | (i11 & (-104));
        int i13 = ~i;
        int i14 = ~(((~i12) & i13) | ((~i13) & i12) | (i12 & i13));
        int i15 = (i8 ^ 103) | (i8 & 103);
        int i16 = i15 & i;
        int i17 = ~(((i15 | i) & (~i16)) | i16);
        int i18 = i14 & i17;
        int i19 = (i14 | i17) & (~i18);
        int i20 = ((i19 ^ i18) | (i19 & i18)) * (-272);
        int i21 = (i10 ^ i20) + ((i20 & i10) << 1);
        int i22 = i8 ^ (-104);
        int i23 = i8 & (-104);
        int i24 = ~((i22 ^ i23) | (i22 & i23));
        int i25 = i & (-104);
        int i26 = (i | (-104)) & (~i25);
        int i27 = ~((i26 ^ i25) | (i25 & i26));
        int i28 = i24 & i27;
        int i29 = (i24 | i27) & (~i28);
        int i30 = -(-(((i29 ^ i28) | (i29 & i28)) * (-272)));
        int i31 = ((i21 | i30) << 1) - (i30 ^ i21);
        int i32 = (i13 & 103) | i25;
        int i33 = i & 103;
        int i34 = (i32 ^ i33) | (i32 & i33);
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = -(-(((i8 ^ i36) | (i8 & i36)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE));
        int i38 = i31 ^ i37;
        int i39 = (i37 & i31) << 1;
        int i40 = (i38 & i39) + (i39 | i38);
        values = i40 % 128;
        if (i40 % 2 != 0) {
            int i41 = i6 ^ 45;
            int i42 = ((i6 & 45) | i41) << 1;
            int i43 = -i41;
            RecordsJson = ((i42 ^ i43) + ((i43 & i42) << 1)) % 128;
            int i44 = i6 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            int i45 = -(-(i6 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
            int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
            RecordsJson = i46 % 128;
            if (i46 % 2 != 0) {
                this.valueOf.i_(sQLiteDatabase, i);
                int i47 = getAid;
                int i48 = (i47 ^ 42) + ((i47 & 42) << 1);
                RecordsJson = ((~i48) + (i48 << 1)) % 128;
                int i49 = ((i47 ^ 126) + ((i47 & 126) << 1)) - 1;
                int i50 = i49 % 128;
                RecordsJson = i50;
                if (i49 % 2 == 0) {
                    int i51 = DigitizedCardProfile * 119;
                    values = i51 >>> 7619;
                } else {
                    int i52 = DigitizedCardProfile;
                    int i53 = (i52 & 69) + (i52 | 69);
                    values = i53 % 128;
                }
            }
        } else {
            int i54 = (i7 ^ 81) + ((i7 & 81) << 1);
            getAid = i54 % 128;
            int i55 = i54 % 2;
        }
        this.valueOf.i_(sQLiteDatabase, i);
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        boolean z = false;
        com.payair.hce.setLvtAllowed setlvtallowed = (com.payair.hce.setLvtAllowed) objArr[0];
        com.payair.hce.insert insertVar = (com.payair.hce.insert) objArr[1];
        int i = getAid;
        int i2 = i + 113;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = ((i ^ 55) | (i & 55)) << 1;
        int i4 = -((i & (-56)) | ((~i) & 55));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        RecordsJson = i5 % 128;
        int i6 = i5 % 2;
        int i7 = DigitizedCardProfile;
        int identityHashCode = java.lang.System.identityHashCode(setlvtallowed);
        int i8 = i7 * (-495);
        int i9 = i8 & (-39105);
        int i10 = ((i8 ^ (-39105)) | i9) << 1;
        int i11 = -((i8 | (-39105)) & (~i9));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = ~i7;
        int i14 = i13 ^ (-80);
        int i15 = i13 & (-80);
        int i16 = (i15 ^ i14) | (i15 & i14);
        int i17 = ~i16;
        int i18 = (i16 | i17) & i17;
        int i19 = identityHashCode ^ (-80);
        int i20 = identityHashCode & (-80);
        int i21 = (i19 ^ i20) | (i19 & i20);
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = -(-(((i18 ^ i23) | (i18 & i23)) * 992));
        int i25 = ((i12 | i24) << 1) - (((~i24) & i12) | ((~i12) & i24));
        int i26 = ~identityHashCode;
        int i27 = (i26 & (-80)) | (identityHashCode & 79);
        int i28 = ~((i27 ^ i20) | (i27 & i20));
        int i29 = ((~i28) & i17) | ((~i17) & i28);
        int i30 = i28 & i17;
        int i31 = (i30 ^ i29) | (i30 & i29);
        int i32 = (i26 ^ 79) | (i26 & 79);
        int i33 = i32 & i7;
        int i34 = (i32 | i7) & (~i33);
        int i35 = (i34 ^ i33) | (i34 & i33);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = ((i37 ^ i31) | (i31 & i37)) * (-496);
        int i39 = ((i25 | i38) << 1) - (i38 ^ i25);
        int i40 = i7 & identityHashCode;
        int i41 = (i7 | identityHashCode) & (~i40);
        int i42 = -(-(((i41 ^ i40) | (i41 & i40)) * 496));
        int i43 = i39 & i42;
        int i44 = i43 + ((i42 ^ i39) | i43);
        values = i44 % 128;
        if (i44 % 2 == 0) {
            int i45 = RecordsJson;
            int i46 = i45 & 21;
            int i47 = ((i45 ^ 21) | i46) << 1;
            int i48 = -((i45 | 21) & (~i46));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            int i50 = i49 % 128;
            getAid = i50;
            if (i49 % 2 != 0) {
                int i51 = 5 / 5;
            }
            int i52 = (((i50 & (-10)) | ((~i50) & 9)) - (~((i50 & 9) << 1))) - 1;
            RecordsJson = i52 % 128;
            if (i52 % 2 != 0) {
                z = true;
            }
        } else {
            int i53 = getAid;
            int i54 = i53 & 53;
            int i55 = (i54 + ((i53 ^ 53) | i54)) % 128;
            RecordsJson = i55;
            int i56 = i55 & 41;
            int i57 = i55 | 41;
            getAid = (((i56 | i57) << 1) - (i56 ^ i57)) % 128;
            int i58 = i55 & 71;
            getAid = ((i58 - (~((i55 ^ 71) | i58))) - 1) % 128;
        }
        setlvtallowed.valueOf = insertVar;
        if (z) {
            throw null;
        }
        int i59 = RecordsJson;
        getAid = ((i59 & 105) + (i59 | 105)) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r4 = (int) java.lang.System.currentTimeMillis();
        r8 = r4 & 2144779004;
        r7 = ((2144779004 | r4) & (~r8)) | r8;
        r8 = ~r7;
        r7 = -(~(((r7 | r8) & r8) * 623));
        r7 = (-2) - (~((r7 & (-1341130538)) + (r7 | (-1341130538))));
        r8 = ~r4;
        r9 = ((-591401633) & r8) | ((~r8) & 591401632);
        r10 = 591401632 & r8;
        r9 = ((r9 ^ r10) | (r10 & r9)) * (-623);
        r10 = r7 & r9;
        r7 = r7 | r9;
        r9 = ((r10 | r7) << 1) - (r7 ^ r10);
        r7 = ~((1807915756 & r4) | ((r8 & 1807915756) | ((-1807915757) & r4)));
        r8 = (-2144779005) & r7;
        r7 = (r7 | (-2144779005)) & (~r8);
        r7 = (r7 ^ r8) | (r7 & r8);
        r8 = 928264880 ^ r4;
        r4 = r4 & 928264880;
        r4 = (r4 ^ r8) | (r4 & r8);
        r8 = ~r4;
        r4 = (r4 | r8) & r8;
        r8 = r7 & r4;
        r4 = (r4 | r7) & (~r8);
        r4 = -(-(((r4 ^ r8) | (r4 & r8)) * 623));
        r7 = ((~r4) & r9) | ((~r9) & r4);
        r4 = (r4 & r9) << 1;
        r8 = (int) java.lang.System.currentTimeMillis();
        r9 = ~r8;
        r10 = 75540562 & r9;
        r11 = (75540562 | r9) & (~r10);
        r10 = ((r10 ^ r11) | (r11 & r10)) * 1324;
        r11 = (((-1738286245) | r10) << 1) - (r10 ^ (-1738286245));
        r10 = ((-1786450862) & r9) | (1786450861 & r8);
        r12 = (-1786450862) & r8;
        r10 = ~((r10 ^ r12) | (r12 & r10));
        r9 = (r9 & 749451647) | ((-749451648) & r8);
        r8 = r8 & 749451647;
        r8 = ~((r8 ^ r9) | (r8 & r9));
        r9 = r10 ^ r8;
        r8 = r8 & r10;
        r8 = -(-(((r8 ^ r9) | (r8 & r9)) * (-1324)));
        r9 = (r11 ^ r8) + ((r8 & r11) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0136, code lost:
    
        if ((((r7 | r4) << 1) - (r4 ^ r7)) > ((((-530169249) & r9) + ((-530169249) | r9)) - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0138, code lost:
    
        r4 = 4 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
    
        if ((r8 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if ((r4 >>> 21) == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = 0;
        int[] iArr = (int[]) objArr[0];
        int i2 = getAid;
        int i3 = i2 | 51;
        int i4 = (i3 << 1) - (i3 & (~(i2 & 51)));
        RecordsJson = i4 % 128;
        int i5 = 2;
        if (i4 % 2 == 0) {
            int i6 = 4 / 4;
        }
        int i7 = (i2 + 31) % 128;
        RecordsJson = i7;
        int i8 = 1;
        int i9 = ((i7 | 97) << 1) - (i7 ^ 97);
        getAid = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = DigitizedCardProfile;
            int i11 = i10 >>> 82;
            values = (((i11 | 24766) << 1) - (i11 ^ 24766)) - 1;
        } else {
            int i12 = DigitizedCardProfile;
            int i13 = i12 ^ 105;
            int i14 = ((i12 & 105) | i13) << 1;
            int i15 = -i13;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            values = i16 % 128;
        }
        char[] cArr = new char[4];
        int length = iArr.length;
        char[] cArr2 = new char[8];
        int[] iArr2 = (int[]) AlternateContactlessPaymentDataJson.clone();
        int i17 = RecordsJson;
        int i18 = i17 & 91;
        int i19 = ((i17 ^ 91) | i18) << 1;
        int i20 = -((i17 | 91) & (~i18));
        getAid = ((i19 & i20) + (i20 | i19)) % 128;
        int i21 = 0;
        while (i21 < iArr.length) {
            int i22 = getAid;
            RecordsJson = ((-2) - (~(((i22 | 84) << i8) - (i22 ^ 84)))) % 128;
            int i23 = values;
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i24 = i23 * 832;
            int i25 = ((i24 & (-10790)) - (~(i24 | (-10790)))) - i8;
            int i26 = ~i23;
            int i27 = ~currentTimeMillis;
            int i28 = (i27 | currentTimeMillis) & i27;
            int i29 = (i28 & i26) | (i26 ^ i28);
            int i30 = ~i29;
            int i31 = (i29 | i30) & i30;
            int i32 = i23 & 13;
            int i33 = (~i32) & (i23 | 13);
            int i34 = (i33 ^ i32) | (i33 & i32);
            int i35 = i34 ^ currentTimeMillis;
            int i36 = i34 & currentTimeMillis;
            int i37 = ~((i35 ^ i36) | (i36 & i35));
            int i38 = -(~(-(-(((i37 ^ i31) | (i31 & i37)) * (-831)))));
            int i39 = (((i25 | i38) << i8) - (i38 ^ i25)) - i8;
            int i40 = -(-((~((i26 & 13) | (i26 ^ 13) | currentTimeMillis)) * (-1662)));
            int i41 = i39 ^ i40;
            int i42 = (((i40 & i39) | i41) << i8) - i41;
            int i43 = ((~i27) & (-14)) | (i27 & 13);
            int i44 = i27 & (-14);
            int i45 = currentTimeMillis & 13;
            int i46 = (~i45) & (currentTimeMillis | 13);
            int i47 = (~((i46 ^ i45) | (i45 & i46))) | (~((i43 & i44) | (i43 ^ i44)));
            int i48 = (i26 & currentTimeMillis) | (i23 & i27);
            int i49 = i23 & currentTimeMillis;
            int i50 = ~((i49 ^ i48) | (i48 & i49));
            int i51 = i47 & i50;
            int i52 = -(-((((i47 | i50) & (~i51)) | i51) * 831));
            int i53 = i42 & i52;
            int i54 = (i53 - (~(-(-((i52 ^ i42) | i53))))) - i8;
            DigitizedCardProfile = i54 % 128;
            if (i54 % i5 != 0) {
                int i55 = getAid;
                RecordsJson = ((((i55 & (-62)) | ((~i55) & 61)) - (~((i55 & 61) << i8))) - i8) % 128;
            }
            int i56 = iArr[i21];
            char c = (char) (i56 >> 16);
            cArr[0] = c;
            char c2 = (char) i56;
            cArr[i8] = c2;
            int i57 = i21 & 1;
            int i58 = ((i21 ^ 1) | i57) << i8;
            int i59 = -((~i57) & (i21 | 1));
            int i60 = iArr[(i58 ^ i59) + ((i59 & i58) << i8)];
            int i61 = 16;
            char c3 = (char) (i60 >> 16);
            cArr[i5] = c3;
            char c4 = (char) iArr[i21 + 1];
            cArr[3] = c4;
            int i62 = c << 16;
            int i63 = -(~(-(-c2)));
            int i64 = (-2) - (~((i62 ^ i63) + ((i63 & i62) << i8)));
            int i65 = c3 << 16;
            int i66 = -(~c4);
            int i67 = ((i65 | i66) << i8) - (i65 ^ i66);
            int i68 = (~i67) + (i67 << 1);
            com.payair.hce.AlternateContactlessPaymentDataJson.writeReplace(iArr2);
            getAid = (RecordsJson + 93) % 128;
            int i69 = 0;
            while (i69 < i61) {
                int i70 = getAid;
                int i71 = i70 & 101;
                int i72 = -(-((i70 ^ 101) | i71));
                RecordsJson = ((i71 & i72) + (i72 | i71)) % 128;
                int i73 = i64 ^ iArr2[i69];
                com.payair.hce.writeReplace writereplace = com.payair.hce.writeReplace.writeReplace;
                int i74 = writereplace.valueOf[0][i73 >>> 24];
                int i75 = writereplace.valueOf[i8][(i73 >>> 16) & 255];
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i76 = i75 * 677;
                int i77 = -(-(i74 * (-675)));
                int i78 = i76 ^ i77;
                int i79 = -(-((i77 & i76) << i8));
                int i80 = (i78 ^ i79) + ((i78 & i79) << i8);
                int i81 = ~currentTimeMillis2;
                int i82 = ~i75;
                int i83 = i75 & i81;
                int i84 = i83 | (currentTimeMillis2 & i82);
                int i85 = i75 & currentTimeMillis2;
                int i86 = (i84 ^ i85) | (i84 & i85);
                int i87 = ~i74;
                int[] iArr3 = iArr;
                int i88 = ((i86 ^ i87) | (i86 & i87)) * (-676);
                char[] cArr3 = cArr2;
                int i89 = i21;
                int i90 = ((~i80) & i88) | ((~i88) & i80);
                int i91 = -(-((i88 & i80) << 1));
                int i92 = (i90 & i91) + (i91 | i90);
                int i93 = (i87 | i74) & i87;
                int i94 = i93 ^ i75;
                int i95 = i93 & i75;
                int i96 = (i95 & i94) | (i94 ^ i95);
                int i97 = ~i96;
                int i98 = (i96 | i97) & i97;
                int i99 = (i81 ^ i75) | i83;
                int i100 = ~i99;
                int i101 = (i99 | i100) & i100;
                int i102 = i98 ^ i101;
                int i103 = i98 & i101;
                int i104 = ((i103 & i102) | (i102 ^ i103)) * 676;
                int i105 = i92 & i104;
                int i106 = (i82 | i75) & i82;
                int i107 = i106 ^ i87;
                int i108 = i106 & i87;
                int i109 = (i107 ^ i108) | (i108 & i107);
                char[] cArr4 = cArr;
                int i110 = ~i109;
                int i111 = i110 & (i109 | i110);
                int i112 = i81 & (i81 | currentTimeMillis2);
                int i113 = (i112 ^ i87) | (i87 & i112);
                int i114 = ~i113;
                int i115 = (i113 | i114) & i114;
                int i116 = i111 & i115;
                int i117 = (i111 | i115) & (~i116);
                int i118 = (i117 ^ i116) | (i117 & i116);
                int i119 = (i82 & i74) | (i87 & i75);
                int i120 = i74 & i75;
                int i121 = (i119 ^ i120) | (i119 & i120);
                int i122 = i121 & currentTimeMillis2;
                int i123 = (i121 | currentTimeMillis2) & (~i122);
                int i124 = ~((i123 ^ i122) | (i123 & i122));
                int i125 = (((((i104 | i92) & (~i105)) - (~(i105 << 1))) - 1) - (~(((i124 ^ i118) | (i118 & i124)) * 676))) - 1;
                int i126 = writereplace.valueOf[2][(i73 >>> 8) & 255];
                int i127 = i125 & i126;
                int i128 = ((i125 ^ i126) | i127) & (~i127);
                int i129 = writereplace.valueOf[3][i73 & 255];
                int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                int i130 = i129 * (-109);
                int i131 = i128 * 111;
                int i132 = i130 & i131;
                int i133 = ((i130 ^ i131) | i132) << 1;
                int i134 = -((i130 | i131) & (~i132));
                int i135 = (i133 ^ i134) + ((i134 & i133) << 1);
                int i136 = ~i129;
                int i137 = i128 & currentTimeMillis3;
                int i138 = (i128 ^ currentTimeMillis3) | i137;
                int i139 = ~i138;
                int i140 = (i138 | i139) & i139;
                int i141 = (~i140) & i136;
                int i142 = ~i136;
                int i143 = i141 | (i142 & i140);
                int i144 = i140 & i136;
                int i145 = -(~(((i144 ^ i143) | (i144 & i143)) * (-220)));
                int i146 = (((i135 | i145) << 1) - (i135 ^ i145)) - 1;
                int i147 = ~i128;
                int i148 = (currentTimeMillis3 | i128) & (~i137);
                int i149 = (i148 ^ i137) | (i148 & i137);
                int i150 = ~i149;
                int i151 = (i149 | i150) & i150;
                int i152 = i129 & i147;
                int i153 = i128 & i136;
                int i154 = (i151 | (~(i152 | i153 | (i129 & i128)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                int i155 = i146 & i154;
                int i156 = ((i146 ^ i154) | i155) << 1;
                int i157 = -((i154 | i146) & (~i155));
                int i158 = (i156 & i157) + (i157 | i156);
                int i159 = i136 & i147;
                int i160 = (i128 & i142) | i159;
                int i161 = ~((i160 ^ i153) | (i153 & i160));
                int i162 = ~((i129 & (~i147)) | i159 | i152);
                int i163 = -(~(-(-(((i161 ^ i162) | (i161 & i162)) * 110))));
                int i164 = (-2) - (~((i158 & i163) + (i163 | i158)));
                int i165 = ((~i164) & i68) | ((~i68) & i164);
                int i166 = (i69 & (-82)) | ((~i69) & 81);
                int i167 = (i69 & 81) << 1;
                int i168 = (i166 ^ i167) + ((i166 & i167) << 1);
                int i169 = i168 & (-80);
                int i170 = -(-((i168 ^ (-80)) | i169));
                i69 = (i169 & i170) + (i169 | i170);
                int i171 = getAid;
                int i172 = (i171 ^ 40) + ((i171 & 40) << 1);
                RecordsJson = ((~i172) + (i172 << 1)) % 128;
                i68 = i73;
                i64 = i165;
                cArr = cArr4;
                cArr2 = cArr3;
                i21 = i89;
                iArr = iArr3;
                i8 = 1;
                i61 = 16;
            }
            int[] iArr4 = iArr;
            char[] cArr5 = cArr;
            char[] cArr6 = cArr2;
            int i173 = i21;
            int i174 = iArr2[i61];
            int i175 = (i64 & (~i174)) | ((~i64) & i174);
            int i176 = iArr2[17] ^ i68;
            cArr5[0] = (char) (i176 >>> 16);
            cArr5[1] = (char) i176;
            cArr5[2] = (char) (i175 >>> 16);
            cArr5[3] = (char) i175;
            com.payair.hce.AlternateContactlessPaymentDataJson.writeReplace(iArr2);
            int i177 = i173 << 1;
            cArr6[i177] = cArr5[0];
            int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
            int i178 = i177 * (-885);
            int i179 = (i178 | 1773) << 1;
            int i180 = -(i178 ^ 1773);
            int i181 = ((i179 | i180) << 1) - (i180 ^ i179);
            int i182 = ~i177;
            int i183 = (i182 | i177) & i182;
            int i184 = ((~i183) & (-2)) | (i183 & 1);
            int i185 = i183 & (-2);
            int i186 = ~((i185 ^ i184) | (i185 & i184));
            int i187 = (i182 ^ currentTimeMillis4) | (i182 & currentTimeMillis4);
            int i188 = ~i187;
            int i189 = (i187 | i188) & i188;
            int i190 = i186 ^ i189;
            int i191 = i186 & i189;
            int i192 = (i191 ^ i190) | (i191 & i190);
            int i193 = ~currentTimeMillis4;
            int i194 = i193 & 1;
            int i195 = ((~i194) & (i193 | 1)) | i194;
            int i196 = i195 & i177;
            int i197 = (i195 | i177) & (~i196);
            int i198 = ~((i197 ^ i196) | (i197 & i196));
            int i199 = ((i192 ^ i198) | (i192 & i198)) * 886;
            int i200 = i181 & i199;
            int i201 = -(-(i199 | i181));
            int i202 = ((i200 | i201) << 1) - (i201 ^ i200);
            int i203 = (currentTimeMillis4 | i193) & i193;
            int i204 = (i203 ^ i177) | (i203 & i177);
            int i205 = ~i204;
            int i206 = (i204 | i205) & i205;
            int i207 = ((~i206) & 1) | (i206 & (-2));
            int i208 = i206 & 1;
            int i209 = -(~(((i208 ^ i207) | (i208 & i207)) * (-1772)));
            int i210 = (((i202 | i209) << 1) - (i209 ^ i202)) - 1;
            int i211 = -(-((~((i193 & (-2)) | ((~i193) & 1) | i194)) * 886));
            cArr6[(((i210 ^ i211) | (i210 & i211)) << 1) - (((~i211) & i210) | ((~i210) & i211))] = cArr5[1];
            int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
            int i212 = -(-(i177 * (-864)));
            int i213 = i212 & 1732;
            int i214 = -(-((i212 ^ 1732) | i213));
            int i215 = ((i213 | i214) << 1) - (i214 ^ i213);
            int i216 = ~currentTimeMillis5;
            int i217 = ~(i216 | (-3));
            int i218 = i182 & i217;
            int i219 = (i217 | i182) & (~i218);
            int i220 = -(~(-(-(((i219 ^ i218) | (i219 & i218)) * (-865)))));
            int i221 = (-2) - (~((i215 & i220) + (i220 | i215)));
            int i222 = i216 & 2;
            int i223 = (currentTimeMillis5 & (-3)) | i222;
            int i224 = currentTimeMillis5 & 2;
            int i225 = -(-((~((i224 ^ i223) | (i223 & i224))) * 865));
            int i226 = i221 & i225;
            int i227 = ((i221 ^ i225) | i226) << 1;
            int i228 = -((i225 | i221) & (~i226));
            int i229 = (i227 & i228) + (i228 | i227);
            int i230 = ((~i216) & i182) | ((~i182) & i216);
            int i231 = i182 & i216;
            int i232 = ~((i230 ^ i231) | (i231 & i230));
            int i233 = i216 ^ 2;
            int i234 = ~((i233 & i222) | (i233 ^ i222));
            int i235 = -(-(((i232 ^ i234) | (i232 & i234)) * 865));
            cArr6[(i229 ^ i235) + ((i235 & i229) << 1)] = cArr5[2];
            cArr6[i177 + 3] = cArr5[3];
            int i236 = ((i173 ^ 110) - (~(-(-((i173 & 110) << 1))))) - 1;
            int i237 = i236 ^ (-108);
            int i238 = (i236 & (-108)) << 1;
            i21 = (i237 ^ i238) + ((i238 & i237) << 1);
            getAid = (RecordsJson + 47) % 128;
            i = 0;
            i8 = 1;
            cArr = cArr5;
            cArr2 = cArr6;
            iArr = iArr4;
            i5 = 2;
        }
        int i239 = getAid;
        int i240 = (i239 & 34) + (i239 | 34);
        RecordsJson = ((~i240) + (i240 << i8)) % 128;
        int i241 = i239 & 115;
        int i242 = ((((i239 | 115) & (~i241)) - (~(i241 << i8))) - i8) % 128;
        RecordsJson = i242;
        int i243 = i242 & 101;
        getAid = ((i243 - (~(-(-((i242 ^ 101) | i243))))) - i8) % 128;
        java.lang.String str = new java.lang.String(cArr2, i, 7);
        int i244 = getAid;
        int i245 = (i244 + 85) % 128;
        RecordsJson = i245;
        int i246 = DigitizedCardProfile;
        int i247 = (((i246 ^ 101) | (i246 & 101)) << i8) - ((i246 & (-102)) | ((~i246) & 101));
        values = i247 % 128;
        if (i247 % i5 == 0) {
            int i248 = i244 & 11;
            int i249 = (i244 ^ 11) | i248;
            int i250 = ((i248 | i249) << i8) - (i249 ^ i248);
            RecordsJson = i250 % 128;
            int i251 = i250 % i5;
            throw null;
        }
        int i252 = (i245 & (-108)) | ((~i245) & 107);
        int i253 = -(-((i245 & 107) << i8));
        int i254 = ((i252 ^ i253) + ((i252 & i253) << i8)) % 128;
        getAid = i254;
        int i255 = i254 & 57;
        int i256 = (((((i254 ^ 57) | i255) << i8) - (~(-((~i255) & (i254 | 57))))) - i8) % 128;
        RecordsJson = i256;
        getAid = (i256 + 35) % 128;
        return str;
    }

    private static java.lang.String values(int[] iArr) {
        return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{iArr}, 1430857407, -1430857406, (int) java.lang.System.currentTimeMillis());
    }

    public final void DigitizedCardProfile(com.payair.hce.insert insertVar) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, insertVar}, 1365343633, -1365343631, java.lang.System.identityHashCode(this));
    }

    public static com.payair.hce.setLvtAllowed writeReplace(android.content.Context context) {
        return (com.payair.hce.setLvtAllowed) AlternateContactlessPaymentDataJson(new java.lang.Object[]{context}, -33691970, 33691970, (int) java.lang.System.currentTimeMillis());
    }
}
