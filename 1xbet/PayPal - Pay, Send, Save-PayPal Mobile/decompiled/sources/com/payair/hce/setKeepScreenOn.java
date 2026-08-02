package com.payair.hce;

/* loaded from: classes4.dex */
public final class setKeepScreenOn implements com.payair.hce.checkUriPermissions {
    private static int RecordsJson = 0;
    private static int getAid = 1;
    private static int getProfileVersion;
    private int AlternateContactlessPaymentDataJson;
    private final com.payair.hce.ResponseCompleteTokenizeDto DigitizedCardProfile;
    private com.payair.hce.setLabelFor valueOf;
    private static char[] values = {13750, 39620, 27489, 15244, 34870, 22853, 10653, 65082, 20132, 7955, 60521, 48374, 3388, 56725, 41661, 29461, 50053, 36898, 24716, 12795, 34385, 22158, 10009, 62584, 17649, 5440, 58861, 19013, 6965, 60370, 47164, 2187, 55553, 44638, 32478, 53053, 40852, 27877, 15704, 36345, 21097, 8897, 62446, 16456, 4263, 57621, 46658, 1737, 55116, 42927, 29746, 50554, 38337, 31280, 51849, 39932, 26661, 14567, 35103, 22950, 11992, 65297, 20414, 7192, 60567, 48613, 626, 53945, 41735, 28798, 49371, 37168, 25001, 13828, 34686, 22518, 9273, 62616, 17902, 10829, 59141, 18531, 47580, 59694, 23209, 35835, 64346, 599, 44337, 23694, 3196, 49147, 28324, 7693, 51708, 31093, 'c', 44805, 24250, 3656, 48591, 27783, 7212, 52189, 31572, 10977, 'c', 44805, 24250, 3656, 48591, 27780, 7217, 52178, 31615, 10999, 55708, 35117, 14532, 59505, 'c', 44805, 24250, 3656, 48591, 27780, 7210, 52179, 31558, 10989, 55684, 35113, 14531, 59467, 38676, 18101, 63027, 42448, 25499, 52472, 15689, 28091, 56848, 3954, 32682, 43047, 6332, 18690, 47733, 60094, 23297, 35751, 62680, 9578, 38349, 50694, 13992, 26577, 53348, 143, 28966, 41547, 4801, 17225, 45974, 7223, 19793, 48626, 61002, 24294, 36722, 63573, 10491, 39180, 51622, 15097, 27491, 56202, 1106, 29946, 42394, 5757, 18051, 46900, 57422, 20689, 33142, 61847, 8750, 37727, 50082, 11338, 40170, 52685, 15955, 28388, 57118, 3969, 30929, 43378, 6539, 19002, 47799, 60310, 21558, 34014, 62753, 9799, 38648, 50954, 14253, 24614, 53587, 496, 29245, 41653, 5086, 31855, 44262, 7443, 19962, 48791, 61218, 24518, 34844, 63855, 10750, 39491, 51903, 15117, 25602, 54446, 1365, 30178, 42605, 5914, 18341, 45138, 57597, 20879, 33329, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 44810, 24233, 3662, 48636, 27793, 7288, 52168, 31567, 10916, 55709, 35132, 14548, 59509, 38668, 18105, 63072, 42448, 21856, 1033, 46064, 25424, 4857, 49544, 28929, 8358, 53321, 32767, 11925};
    private static long writeReplace = 6252531299881037668L;
    private static int SdkCoreAlternateContactlessPaymentDataImpl = 121;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i;
        int i6 = ~i3;
        return ((((i * 495) + (i2 * (-493))) + ((i | i4) * (-988))) + (((i2 | i5) | i6) * 494)) + (((~(i | i2)) | ((~(i2 | i6)) | (~(i4 | i5)))) * 494) != 1 ? writeReplace(objArr) : valueOf(objArr);
    }

    public setKeepScreenOn(int i, com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        this.AlternateContactlessPaymentDataJson = i;
        this.DigitizedCardProfile = responseCompleteTokenizeDto;
    }

    /* renamed from: com.payair.hce.setKeepScreenOn$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int AlternateContactlessPaymentDataJson = 1;
        private static int DigitizedCardProfile;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[((int[]) com.payair.hce.setFadingEdgeLength.values(new java.lang.Object[0], 923408680, -923408680, (int) java.lang.System.currentTimeMillis())).length];
            values = iArr;
            try {
                int i = com.payair.hce.setFadingEdgeLength.writeReplace;
                iArr[0] = 1;
                int i2 = AlternateContactlessPaymentDataJson;
                int i3 = i2 & 19;
                int i4 = (i2 ^ 19) | i3;
                DigitizedCardProfile = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = values;
                int i5 = com.payair.hce.setFadingEdgeLength.valueOf;
                iArr2[1] = 2;
                int i6 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = (((i6 ^ 114) + ((i6 & 114) << 1)) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x031c, code lost:
    
        if ((r7 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0634, code lost:
    
        if ((r1 * 3) == 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0674, code lost:
    
        r0 = ((r4 ^ 119) | (r4 & 119)) << 1;
        r1 = -((r4 & (-120)) | ((~r4) & 119));
        r4 = (r0 & r1) + (r0 | r1);
        com.payair.hce.setKeepScreenOn.SdkCoreAlternateContactlessPaymentDataImpl = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x068c, code lost:
    
        if ((r4 % 2) != 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x068e, code lost:
    
        r0 = 4 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x064b, code lost:
    
        r1 = r0 & 25;
        r4 = -(-((r0 ^ 25) | r1));
        com.payair.hce.setKeepScreenOn.RecordsJson = ((r1 ^ r4) + ((r1 & r4) << 1)) % 128;
        r1 = r0 & 63;
        r0 = r0 | 63;
        com.payair.hce.setKeepScreenOn.RecordsJson = (((r1 | r0) << 1) - (r0 ^ r1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0649, code lost:
    
        if ((r1 % 2) == 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0737 A[LOOP:0: B:7:0x0166->B:20:0x0737, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03b0 A[EDGE_INSN: B:21:0x03b0->B:22:0x03b0 BREAK  A[LOOP:0: B:7:0x0166->B:20:0x0737], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        java.lang.Integer num;
        long executeInsert;
        java.lang.String string;
        byte[] DigitizedCardProfile;
        long j;
        long j2;
        int[] iArr;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        byte[] bArr2;
        int i4;
        com.payair.hce.setKeepScreenOn setkeepscreenon = (com.payair.hce.setKeepScreenOn) objArr[0];
        char c = 1;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = (android.database.sqlite.SQLiteDatabase) objArr[1];
        android.content.Context context = (android.content.Context) objArr[2];
        com.payair.hce.getDetailedMessage getdetailedmessage = (com.payair.hce.getDetailedMessage) objArr[3];
        int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i6 = i5 & 93;
        int i7 = ((i5 ^ 93) | i6) << 1;
        int i8 = -((i5 | 93) & (~i6));
        int i9 = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
        RecordsJson = i9;
        int i10 = i9 ^ 7;
        int i11 = -(-((i9 & 7) << 1));
        SdkCoreAlternateContactlessPaymentDataImpl = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
        int i12 = i9 & 61;
        SdkCoreAlternateContactlessPaymentDataImpl = ((i12 - (~((i9 ^ 61) | i12))) - 1) % 128;
        setkeepscreenon.valueOf = new com.payair.hce.setLabelFor(context, setkeepscreenon.DigitizedCardProfile, getdetailedmessage);
        java.lang.Integer num2 = 80;
        android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{num2, (char) 13797, 0}, -1796669726, 1796669727, 80)).intern(), null);
        int count = rawQuery.getCount();
        com.payair.hce.setOnScrollChangeListener[] setonscrollchangelistenerArr = new com.payair.hce.setOnScrollChangeListener[count];
        if (!rawQuery.moveToFirst()) {
            return null;
        }
        int identityHashCode = java.lang.System.identityHashCode(setkeepscreenon);
        int i13 = identityHashCode ^ 1618598892;
        int i14 = ~identityHashCode;
        int i15 = identityHashCode & 1618598892;
        int i16 = ~((i13 ^ i15) | (i13 & i15));
        int i17 = i14 & (-195734476);
        int i18 = (~i17) & (i14 | (-195734476));
        int i19 = (i18 ^ i17) | (i18 & i17);
        int i20 = ~((i19 ^ (-1618598893)) | (i19 & (-1618598893)));
        int i21 = i16 & i20;
        int i22 = (i20 | i16) & (~i21);
        int i23 = ((i21 ^ i22) | (i22 & i21)) * (-406);
        int i24 = 323298289 & i23;
        int i25 = i24 + ((i23 ^ 323298289) | i24);
        int i26 = ((~i14) & 1618598892) | (i14 & (-1618598893)) | (i14 & 1618598892);
        int i27 = i26 ^ (-195734476);
        int i28 = i26 & (-195734476);
        int i29 = (~((i28 ^ i27) | (i28 & i27))) * (-406);
        int i30 = i25 & i29;
        int i31 = (i29 ^ i25) | i30;
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        int i33 = (195734475 & i14) | (identityHashCode & (-195734476));
        int i34 = 195734475 & identityHashCode;
        int i35 = (i33 ^ i34) | (i34 & i33);
        int i36 = ~i35;
        int i37 = (i35 | i36) & i36;
        int i38 = (identityHashCode | i14) & i14;
        int i39 = ~((i38 ^ (-1618598893)) | (i38 & (-1618598893)));
        int i40 = i37 & i39;
        int i41 = -(~(-(-((((i39 | i37) & (~i40)) | i40) * 406))));
        int identityHashCode2 = java.lang.System.identityHashCode(setkeepscreenon);
        int i42 = ~identityHashCode2;
        int i43 = i42 & (i42 | identityHashCode2);
        int i44 = (-403523850) & i43;
        int i45 = (i43 | (-403523850)) & (~i44);
        int i46 = ((i45 ^ i44) | (i45 & i44)) * (-490);
        int i47 = ((i46 ^ (-1399068066)) | (i46 & (-1399068066))) << 1;
        int i48 = -(((~i46) & (-1399068066)) | (1399068065 & i46));
        int i49 = 600975026 ^ identityHashCode2;
        int i50 = identityHashCode2 & 600975026;
        int i51 = ~((i50 ^ i49) | (i50 & i49));
        int i52 = (((i32 | i41) << 1) - (i41 ^ i32)) - 1 > (((i47 ^ i48) + ((i48 & i47) << 1)) - (~(((i51 ^ (-1004498876)) | ((-1004498876) & i51)) * 490))) - 672314565 ? 1 : 0;
        int i53 = 3;
        while (true) {
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[i53];
                objArr2[0] = 7;
                objArr2[c] = (char) 59238;
                objArr2[2] = num2;
                string = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(objArr2, -1796669726, 1796669727, 7)).intern()));
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                objArr3[0] = 9;
                objArr3[c] = (char) 564;
                objArr3[2] = 87;
                byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(objArr3, -1796669726, 1796669727, 9)).intern()));
                com.payair.hce.setLabelFor setlabelfor = setkeepscreenon.valueOf;
                DigitizedCardProfile = com.payair.hce.setLabelFor.DigitizedCardProfile(blob, (byte[]) com.payair.hce.setLabelFor.writeReplace(new java.lang.Object[]{setlabelfor}, -812843981, 812843981, java.lang.System.identityHashCode(setlabelfor)));
                java.lang.Object[] objArr4 = new java.lang.Object[3];
                objArr4[0] = 10;
                objArr4[c] = (char) 0;
                objArr4[2] = 96;
                j = rawQuery.getLong(rawQuery.getColumnIndex(((java.lang.String) writeReplace(objArr4, -1796669726, 1796669727, 10)).intern()));
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[0] = 14;
                objArr5[c] = (char) 0;
                objArr5[2] = 106;
                j2 = rawQuery.getLong(rawQuery.getColumnIndex(((java.lang.String) writeReplace(objArr5, -1796669726, 1796669727, 14)).intern()));
                iArr = com.payair.hce.setKeepScreenOn.AnonymousClass2.values;
                int i54 = setkeepscreenon.AlternateContactlessPaymentDataJson;
                int identityHashCode3 = java.lang.System.identityHashCode(setkeepscreenon);
                int i55 = ~i54;
                int i56 = ~identityHashCode3;
                int i57 = ((~i55) & i56) | ((~i56) & i55);
                int i58 = i55 & i56;
                int i59 = ~((i57 ^ i58) | (i57 & i58));
                int i60 = i59 & i56;
                num = num2;
                int i61 = (i59 | i56) & (~i60);
                int i62 = ((i54 * 371) - 371) + (((i60 & i61) | (i61 ^ i60)) * (-370));
                int i63 = ~((i56 | identityHashCode3) & i56);
                int i64 = i55 ^ identityHashCode3;
                int i65 = identityHashCode3 & i55;
                int i66 = ~((i65 ^ i64) | (i65 & i64));
                int i67 = i63 & i66;
                int i68 = (i63 | i66) & (~i67);
                int i69 = (i68 ^ i67) | (i68 & i67);
                int i70 = ~((i55 & i54) | (i55 ^ i54));
                int i71 = ((i69 ^ i70) | (i69 & i70)) * (-370);
                int i72 = i62 & i71;
                int i73 = (i71 ^ i62) | i72;
                i = (i72 ^ i73) + ((i73 & i72) << 1);
                int i74 = i55 | i54;
                int i75 = ~i74;
                i2 = ((i74 | i75) & i75) * com.knotapi.knot.utilities.Constants.ID_KROGER;
            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e) {
                e = e;
                num = num2;
            }
            try {
                i3 = iArr[(i ^ i2) + ((i2 & i) << 1)];
            } catch (com.payair.hce.getTokenInfo e2) {
                e = e2;
                e.printStackTrace();
                if (rawQuery.moveToNext()) {
                }
            } catch (java.security.GeneralSecurityException e3) {
                e = e3;
                e.printStackTrace();
                if (rawQuery.moveToNext()) {
                }
            }
            if (i3 == 1) {
                com.payair.hce.setImportantForAutofill setimportantforautofill = new com.payair.hce.setImportantForAutofill(com.payair.hce.createDeviceContext.values(com.mastercard.upgrade.profile.DigitizedCardProfile.valueOf(DigitizedCardProfile)));
                bArr = (byte[]) com.payair.hce.setImportantForAutofill.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setimportantforautofill}, -542880274, 542880275, java.lang.System.identityHashCode(setimportantforautofill));
            } else if (i3 != 2) {
                bArr2 = null;
                setonscrollchangelistenerArr[i52] = new com.payair.hce.setOnScrollChangeListener(string, bArr2, j, j2);
                int i76 = i52 & (-92);
                int i77 = -(-((i52 ^ (-92)) | i76));
                int i78 = (i76 & i77) + (i76 | i77) + 94;
                i52 = (~i78) + (i78 << 1);
                if (rawQuery.moveToNext()) {
                    break;
                }
                int i79 = SdkCoreAlternateContactlessPaymentDataImpl;
                RecordsJson = (((i79 & 53) - (~(i79 | 53))) - 1) % 128;
                RecordsJson = ((i79 & 85) + (i79 | 85)) % 128;
                i53 = 3;
                c = 1;
                num2 = num;
            } else {
                com.payair.hce.setImportantForAutofill setimportantforautofill2 = new com.payair.hce.setImportantForAutofill(com.payair.hce.createDeviceProtectedStorageContext.DigitizedCardProfile(com.mastercard.mpsdk.card.profile.SdkCoreDigitizedCardProfileImpl.build(DigitizedCardProfile)));
                bArr = (byte[]) com.payair.hce.setImportantForAutofill.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setimportantforautofill2}, -542880274, 542880275, java.lang.System.identityHashCode(setimportantforautofill2));
                int i80 = RecordsJson;
                int i81 = i80 & 65;
                int i82 = -(-((i80 ^ 65) | i81));
                int i83 = ((i81 | i82) << 1) - (i82 ^ i81);
                int i84 = i83 % 128;
                SdkCoreAlternateContactlessPaymentDataImpl = i84;
                if (i83 % 2 == 0) {
                    int i85 = getProfileVersion % 51;
                    getAid = i85 >>> 11959;
                    int i86 = (i85 & 2) | ((~i85) & (-3));
                    int i87 = -(-((i85 & (-3)) << 1));
                    if ((i86 & i87) + (i87 | i86) == 0) {
                        i4 = 1;
                        RecordsJson = (((i84 | 57) << i4) - (i84 ^ 57)) % 128;
                        RecordsJson = (((i84 | 11) << i4) - (i84 ^ 11)) % 128;
                    }
                    int i88 = (i84 & (-80)) | ((~i84) & 79);
                    int i89 = -(-((i84 & 79) << 1));
                    int i90 = (((i88 | i89) << 1) - (i89 ^ i88)) % 128;
                    RecordsJson = i90;
                    int i91 = (i90 & (-56)) | ((~i90) & 55);
                    int i92 = -(-((i90 & 55) << 1));
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i91 | i92) << 1) - (i91 ^ i92)) % 128;
                } else {
                    int i93 = getProfileVersion;
                    i4 = 1;
                    int i94 = ((i93 & (-64)) | ((~i93) & 63)) + ((i93 & 63) << 1);
                    getAid = i94 % 128;
                }
            }
            bArr2 = bArr;
            setonscrollchangelistenerArr[i52] = new com.payair.hce.setOnScrollChangeListener(string, bArr2, j, j2);
            int i762 = i52 & (-92);
            int i772 = -(-((i52 ^ (-92)) | i762));
            int i782 = (i762 & i772) + (i762 | i772) + 94;
            i52 = (~i782) + (i782 << 1);
            if (rawQuery.moveToNext()) {
            }
        }
        int i95 = RecordsJson;
        int i96 = i95 & 59;
        SdkCoreAlternateContactlessPaymentDataImpl = (i96 + ((i95 ^ 59) | i96)) % 128;
        rawQuery.close();
        sQLiteDatabase.delete(((java.lang.String) writeReplace(new java.lang.Object[]{18, (char) 0, 120}, -1796669726, 1796669727, 18)).intern(), null, null);
        int i97 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i98 = i97 & 27;
        int i99 = ((((i97 ^ 27) | i98) << 1) - (~(-((~i98) & (i97 | 27))))) - 1;
        RecordsJson = i99 % 128;
        if (i99 % 2 != 0) {
            int i100 = 3 / 3;
        }
        RecordsJson = (((i97 | 31) << 1) - (i97 ^ 31)) % 128;
        int i101 = 0;
        while (true) {
            if (i101 < count) {
                int i102 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i103 = i102 ^ 91;
                int i104 = -(-((i102 & 91) << 1));
                RecordsJson = (((i103 | i104) << 1) - (i104 ^ i103)) % 128;
                int identityHashCode4 = java.lang.System.identityHashCode(setkeepscreenon);
                int i105 = ~identityHashCode4;
                int i106 = (i105 | identityHashCode4) & i105;
                int i107 = (1946007391 & i106) | ((~i106) & (-1946007392));
                int i108 = i106 & (-1946007392);
                int i109 = -(-(((i108 ^ i107) | (i108 & i107)) * (-192)));
                int i110 = ((1715824892 | i109) << 1) - (i109 ^ 1715824892);
                int i111 = i105 & (-1371083611);
                int i112 = -(-(((~((i105 ^ (-1371083611)) | i111)) | 1362694146) * (-384)));
                int i113 = i110 & i112;
                int i114 = ((i110 ^ i112) | i113) << 1;
                int i115 = -((i110 | i112) & (~i113));
                int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                int i117 = ~((-1362694147) | identityHashCode4);
                int i118 = (i105 | (-1371083611)) & (~i111);
                int i119 = (i118 ^ i111) | (i118 & i111);
                int i120 = (583313245 & i119) | ((~i119) & (-583313246));
                int i121 = i119 & (-583313246);
                int i122 = ~((i121 ^ i120) | (i121 & i120));
                int i123 = i117 & i122;
                int i124 = (i122 | i117) & (~i123);
                int i125 = (i124 ^ i123) | (i124 & i123);
                int i126 = (-574923782) ^ identityHashCode4;
                int i127 = identityHashCode4 & (-574923782);
                int i128 = ~((i127 ^ i126) | (i127 & i126));
                int i129 = i125 & i128;
                int i130 = (((i128 | i125) & (~i129)) | i129) * 192;
                int i131 = i116 & i130;
                int i132 = -(-(i131 << 1));
                int identityHashCode5 = java.lang.System.identityHashCode(setkeepscreenon);
                int i133 = ~identityHashCode5;
                int i134 = i133 & (-1550570757);
                int i135 = (1550570756 & identityHashCode5) | i134;
                int i136 = identityHashCode5 & (-1550570757);
                int i137 = ~((i136 ^ i135) | (i135 & i136));
                int i138 = 1281971204 & i137;
                int i139 = (i137 | 1281971204) & (~i138);
                int i140 = ((i139 ^ i138) | (i139 & i138)) * 576;
                int i141 = i140 & (-1942846567);
                int i142 = (((i140 ^ (-1942846567)) | i141) << 1) - ((i140 | (-1942846567)) & (~i141));
                int i143 = i133 ^ (-1550570757);
                int i144 = (i143 ^ i134) | (i134 & i143);
                int i145 = (815180074 & i144) | ((~i144) & (-815180075));
                int i146 = i144 & (-815180075);
                int i147 = ~((i146 ^ i145) | (i146 & i145));
                int i148 = ((i147 & 2097151278) | ((~i147) & (-2097151279)) | ((-2097151279) & i147)) * 576;
                int i149 = i142 & i148;
                int i150 = (i148 | i142) & (~i149);
                int i151 = i149 << 1;
                int i152 = (i150 ^ i151) + ((i150 & i151) << 1);
                int i153 = (-318961408) & i152;
                if ((((i130 | i116) & (~i131)) - (~i132)) - 1 <= (i153 - (~(-(-(((-318961408) ^ i152) | i153))))) - 1) {
                    int i154 = 5 / 3;
                }
            } else {
                int i155 = RecordsJson;
                int i156 = i155 + 61;
                SdkCoreAlternateContactlessPaymentDataImpl = i156 % 128;
                char c2 = i156 % 2 == 0 ? '\"' : (char) 26;
                int i157 = i155 ^ 17;
                int i158 = ((i155 & 17) | i157) << 1;
                int i159 = -i157;
                SdkCoreAlternateContactlessPaymentDataImpl = ((i158 ^ i159) + ((i158 & i159) << 1)) % 128;
                if (c2 == 26) {
                    return null;
                }
            }
            com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = setonscrollchangelistenerArr[i101];
            try {
                java.lang.Object[] objArr6 = new java.lang.Object[3];
                try {
                    try {
                        objArr6[0] = 103;
                        objArr6[1] = (char) 25554;
                        try {
                            objArr6[2] = 138;
                            try {
                                android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(((java.lang.String) writeReplace(objArr6, -1796669726, 1796669727, 103)).intern());
                                compileStatement.bindString(1, (java.lang.String) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, -1445857330, 1445857331, java.lang.System.identityHashCode(setonscrollchangelistener)));
                                compileStatement.bindBlob(2, setkeepscreenon.valueOf.values((byte[]) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, -121646331, 121646331, java.lang.System.identityHashCode(setonscrollchangelistener))));
                                try {
                                    compileStatement.bindLong(3, ((java.lang.Long) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, 1490473312, -1490473309, java.lang.System.identityHashCode(setonscrollchangelistener))).longValue());
                                    compileStatement.bindLong(4, ((java.lang.Long) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, 542292993, -542292991, java.lang.System.identityHashCode(setonscrollchangelistener))).longValue());
                                    executeInsert = compileStatement.executeInsert();
                                    compileStatement.clearBindings();
                                } catch (com.payair.hce.getTokenInfo e4) {
                                    e = e4;
                                    e.printStackTrace();
                                    int i160 = i101 & 1;
                                    int i161 = -(-((i101 ^ 1) | i160));
                                    i101 = (i160 ^ i161) + ((i160 & i161) << 1);
                                    int i162 = RecordsJson;
                                    SdkCoreAlternateContactlessPaymentDataImpl = (((i162 & 78) + (i162 | 78)) - 1) % 128;
                                } catch (java.security.GeneralSecurityException e5) {
                                    e = e5;
                                    e.printStackTrace();
                                    int i1602 = i101 & 1;
                                    int i1612 = -(-((i101 ^ 1) | i1602));
                                    i101 = (i1602 ^ i1612) + ((i1602 & i1612) << 1);
                                    int i1622 = RecordsJson;
                                    SdkCoreAlternateContactlessPaymentDataImpl = (((i1622 & 78) + (i1622 | 78)) - 1) % 128;
                                }
                            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e6) {
                                e = e6;
                            }
                        } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e7) {
                            e = e7;
                        }
                    } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e8) {
                        e = e8;
                    }
                } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e9) {
                    e = e9;
                }
            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e10) {
                e = e10;
            }
            if (executeInsert != -1) {
                int i163 = SdkCoreAlternateContactlessPaymentDataImpl;
                RecordsJson = ((i163 & 29) + (i163 | 29)) % 128;
                int i164 = (((i163 | 100) << 1) - (i163 ^ 100)) - 1;
                int i165 = i164 % 128;
                RecordsJson = i165;
                if (i164 % 2 != 0) {
                    int i166 = getProfileVersion % 15;
                    getAid = i166 >>> 1603;
                } else {
                    int i167 = getProfileVersion;
                    int i168 = (i167 ^ 38) + ((i167 & 38) << 1);
                    int i169 = (~i168) + (i168 << 1);
                    getAid = i169 % 128;
                }
                int i16022 = i101 & 1;
                int i16122 = -(-((i101 ^ 1) | i16022));
                i101 = (i16022 ^ i16122) + ((i16022 & i16122) << 1);
                int i16222 = RecordsJson;
                SdkCoreAlternateContactlessPaymentDataImpl = (((i16222 & 78) + (i16222 | 78)) - 1) % 128;
            } else {
                int i170 = SdkCoreAlternateContactlessPaymentDataImpl;
                int i171 = (i170 & (-114)) | ((~i170) & 113);
                int i172 = -(-((i170 & 113) << 1));
                RecordsJson = ((i171 & i172) + (i172 | i171)) % 128;
                java.lang.Object[] objArr7 = new java.lang.Object[3];
                try {
                    objArr7[0] = 29;
                    objArr7[1] = (char) 0;
                } catch (com.payair.hce.getTokenInfo e11) {
                    e = e11;
                    e.printStackTrace();
                    int i160222 = i101 & 1;
                    int i161222 = -(-((i101 ^ 1) | i160222));
                    i101 = (i160222 ^ i161222) + ((i160222 & i161222) << 1);
                    int i162222 = RecordsJson;
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i162222 & 78) + (i162222 | 78)) - 1) % 128;
                } catch (java.security.GeneralSecurityException e12) {
                    e = e12;
                    e.printStackTrace();
                    int i1602222 = i101 & 1;
                    int i1612222 = -(-((i101 ^ 1) | i1602222));
                    i101 = (i1602222 ^ i1612222) + ((i1602222 & i1612222) << 1);
                    int i1622222 = RecordsJson;
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i1622222 & 78) + (i1622222 | 78)) - 1) % 128;
                }
                try {
                    objArr7[2] = 241;
                } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e13) {
                    e = e13;
                    e.printStackTrace();
                    int i16022222 = i101 & 1;
                    int i16122222 = -(-((i101 ^ 1) | i16022222));
                    i101 = (i16022222 ^ i16122222) + ((i16022222 & i16122222) << 1);
                    int i16222222 = RecordsJson;
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i16222222 & 78) + (i16222222 | 78)) - 1) % 128;
                }
                try {
                    throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) writeReplace(objArr7, -1796669726, 1796669727, 29)).intern());
                } catch (com.payair.hce.getTokenInfo e14) {
                    e = e14;
                    e.printStackTrace();
                    int i160222222 = i101 & 1;
                    int i161222222 = -(-((i101 ^ 1) | i160222222));
                    i101 = (i160222222 ^ i161222222) + ((i160222222 & i161222222) << 1);
                    int i162222222 = RecordsJson;
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i162222222 & 78) + (i162222222 | 78)) - 1) % 128;
                } catch (java.security.GeneralSecurityException e15) {
                    e = e15;
                    e.printStackTrace();
                    int i1602222222 = i101 & 1;
                    int i1612222222 = -(-((i101 ^ 1) | i1602222222));
                    i101 = (i1602222222 ^ i1612222222) + ((i1602222222 & i1612222222) << 1);
                    int i1622222222 = RecordsJson;
                    SdkCoreAlternateContactlessPaymentDataImpl = (((i1622222222 & 78) + (i1622222222 | 78)) - 1) % 128;
                }
            }
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        char[] cArr;
        int i = 0;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        char charValue = ((java.lang.Character) objArr[1]).charValue();
        int i2 = 2;
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i4 = i3 + 71;
        RecordsJson = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = i3 & 83;
        int i6 = ((i3 ^ 83) | i5) << 1;
        int i7 = -((i3 | 83) & (~i5));
        int i8 = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        RecordsJson = i8;
        int i9 = i8 & 41;
        int i10 = (i8 | 41) & (~i9);
        int i11 = i9 << 1;
        int i12 = ((i10 ^ i11) + ((i11 & i10) << 1)) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i12;
        int i13 = getAid;
        int i14 = -(-(i13 * (-661)));
        int i15 = i14 & (-78659);
        int i16 = -(-((i14 ^ (-78659)) | i15));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = ~intValue;
        int i19 = ~i13;
        int i20 = (i19 | i13) & i19;
        int i21 = (i20 ^ (-120)) | (i20 & (-120));
        int i22 = ~i21;
        int i23 = (i21 | i22) & i22;
        int i24 = i18 & i23;
        int i25 = (((i23 | i18) & (~i24)) | i24) * 1324;
        int i26 = (i17 ^ i25) + ((i17 & i25) << 1);
        int i27 = intValue | 119;
        int i28 = ~i27;
        int i29 = (i27 | i28) & i28;
        int i30 = i13 ^ intValue;
        int i31 = i13 & intValue;
        int i32 = ~((i30 & i31) | (i30 ^ i31));
        int i33 = -(-(((i29 & i32) | (i29 ^ i32)) * (-1324)));
        int i34 = ((~i26) & i33) | ((~i33) & i26);
        int i35 = (i33 & i26) << 1;
        int i36 = (i34 & i35) + (i35 | i34);
        int i37 = ~((i13 & (-120)) | (i13 ^ (-120)));
        int i38 = ~((i19 & (-120)) | ((~i19) & 119) | (i19 & 119));
        int i39 = -(-((((~i37) & i38) | ((~i38) & i37) | (i37 & i38)) * 662));
        int i40 = i36 & i39;
        int i41 = (i39 ^ i36) | i40;
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        getProfileVersion = i42 % 128;
        if (i42 % 2 != 0) {
            RecordsJson = ((((i12 | 86) << 1) - (i12 ^ 86)) - 1) % 128;
            int i43 = i12 & 89;
            int i44 = -(-((i12 ^ 89) | i43));
            int i45 = ((i43 & i44) + (i43 | i44)) % 128;
            RecordsJson = i45;
            cArr = new char[intValue];
            SdkCoreAlternateContactlessPaymentDataImpl = ((i45 ^ 31) + ((i45 & 31) << 1)) % 128;
        } else {
            int i46 = i12 ^ 37;
            RecordsJson = ((((i12 & 37) | i46) << 1) - i46) % 128;
            RecordsJson = (((i12 & 30) + (i12 | 30)) - 1) % 128;
            int i47 = i12 ^ 33;
            int i48 = (((((i12 & 33) | i47) << 1) - (~(-i47))) - 1) % 128;
            RecordsJson = i48;
            cArr = new char[intValue];
            int i49 = i48 & 93;
            int i50 = -(-((i48 ^ 93) | i49));
            SdkCoreAlternateContactlessPaymentDataImpl = (((i49 | i50) << 1) - (i50 ^ i49)) % 128;
        }
        int i51 = RecordsJson;
        int i52 = i51 & 21;
        SdkCoreAlternateContactlessPaymentDataImpl = ((i52 - (~(-(-((i51 ^ 21) | i52))))) - 1) % 128;
        while (i < intValue) {
            int i53 = RecordsJson;
            int i54 = i53 & 7;
            int i55 = -(-((i53 ^ 7) | i54));
            int i56 = ((i54 & i55) + (i55 | i54)) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i56;
            int i57 = (((i56 | 68) << 1) - (i56 ^ 68)) - 1;
            RecordsJson = i57 % 128;
            if (i57 % i2 != 0) {
                int i58 = getAid;
                int i59 = (i58 & 65) | ((~i58) & (-66));
                int i60 = -(-((i58 & (-66)) << 1));
                int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                getProfileVersion = i61 % 23700;
                if (i61 % i2 == 0) {
                    char[] cArr2 = values;
                    int i62 = i * 1773;
                    int i63 = intValue2 * (-885);
                    int i64 = (i62 & i63) + (i62 | i63);
                    int i65 = ~i;
                    int i66 = ~intValue2;
                    int i67 = i65 & i66;
                    int i68 = (~i67) & (i65 | i66);
                    int i69 = ~((i67 & i68) | (i67 ^ i68));
                    int i70 = i66 & intValue;
                    int i71 = (~i70) & (i66 | intValue);
                    int i72 = ~((i71 ^ i70) | (i71 & i70));
                    int i73 = (i72 & (~i69)) | ((~i72) & i69) | (i69 & i72);
                    int i74 = i18 & i;
                    int i75 = (~i74) & (i18 | i);
                    int i76 = (i75 & i74) | (i75 ^ i74);
                    int i77 = i76 & intValue2;
                    int i78 = (~i77) & (i76 | intValue2);
                    int i79 = ~((i78 ^ i77) | (i78 & i77));
                    int i80 = ((i79 & (~i73)) | ((~i79) & i73) | (i73 & i79)) * 886;
                    int i81 = i64 ^ i80;
                    int i82 = ((i80 & i64) | i81) << 1;
                    int i83 = -i81;
                    int i84 = (i82 ^ i83) + ((i82 & i83) << 1);
                    int i85 = i18 ^ intValue2;
                    int i86 = i18 & intValue2;
                    int i87 = ~((i85 ^ i86) | (i85 & i86));
                    int i88 = ((~i87) & i) | (i65 & i87);
                    int i89 = i87 & i;
                    int i90 = -(~(((i89 ^ i88) | (i89 & i88)) * (-1772)));
                    int i91 = (((i84 ^ i90) + ((i90 & i84) << 1)) - 1) | (-(-((~((i18 ^ i) | i74)) * 886)));
                    cArr[i] = (char) ((cArr2[(i91 << 1) - ((~(r4 & r8)) & i91)] ^ (i * writeReplace)) ^ charValue);
                    int i92 = i & 1;
                    int i93 = ((i ^ 1) | i92) << 1;
                    int i94 = -((i | 1) & (~i92));
                    i = (i94 | i93) + (i93 & i94);
                    int i95 = i56 & 13;
                    int i96 = -(-(i56 | 13));
                    RecordsJson = ((i95 & i96) + (i95 | i96)) % 128;
                    RecordsJson = ((((i56 | 80) << 1) - (i56 ^ 80)) - 1) % 128;
                    i2 = 2;
                }
                RecordsJson = ((i56 & 71) + (i56 | 71)) % 128;
                char[] cArr22 = values;
                int i622 = i * 1773;
                int i632 = intValue2 * (-885);
                int i642 = (i622 & i632) + (i622 | i632);
                int i652 = ~i;
                int i662 = ~intValue2;
                int i672 = i652 & i662;
                int i682 = (~i672) & (i652 | i662);
                int i692 = ~((i672 & i682) | (i672 ^ i682));
                int i702 = i662 & intValue;
                int i712 = (~i702) & (i662 | intValue);
                int i722 = ~((i712 ^ i702) | (i712 & i702));
                int i732 = (i722 & (~i692)) | ((~i722) & i692) | (i692 & i722);
                int i742 = i18 & i;
                int i752 = (~i742) & (i18 | i);
                int i762 = (i752 & i742) | (i752 ^ i742);
                int i772 = i762 & intValue2;
                int i782 = (~i772) & (i762 | intValue2);
                int i792 = ~((i782 ^ i772) | (i782 & i772));
                int i802 = ((i792 & (~i732)) | ((~i792) & i732) | (i732 & i792)) * 886;
                int i812 = i642 ^ i802;
                int i822 = ((i802 & i642) | i812) << 1;
                int i832 = -i812;
                int i842 = (i822 ^ i832) + ((i822 & i832) << 1);
                int i852 = i18 ^ intValue2;
                int i862 = i18 & intValue2;
                int i872 = ~((i852 ^ i862) | (i852 & i862));
                int i882 = ((~i872) & i) | (i652 & i872);
                int i892 = i872 & i;
                int i902 = -(~(((i892 ^ i882) | (i892 & i882)) * (-1772)));
                int i912 = (((i842 ^ i902) + ((i902 & i842) << 1)) - 1) | (-(-((~((i18 ^ i) | i742)) * 886)));
                cArr[i] = (char) ((cArr22[(i912 << 1) - ((~(r4 & r8)) & i912)] ^ (i * writeReplace)) ^ charValue);
                int i922 = i & 1;
                int i932 = ((i ^ 1) | i922) << 1;
                int i942 = -((i | 1) & (~i922));
                i = (i942 | i932) + (i932 & i942);
                int i952 = i56 & 13;
                int i962 = -(-(i56 | 13));
                RecordsJson = ((i952 & i962) + (i952 | i962)) % 128;
                RecordsJson = ((((i56 | 80) << 1) - (i56 ^ 80)) - 1) % 128;
                i2 = 2;
            } else {
                int i97 = getAid;
                int i98 = ((i97 & (-82)) | ((~i97) & 81)) + ((i97 & 81) << 1);
                getProfileVersion = i98 % 128;
                if (i98 % i2 == 0) {
                    char[] cArr222 = values;
                    int i6222 = i * 1773;
                    int i6322 = intValue2 * (-885);
                    int i6422 = (i6222 & i6322) + (i6222 | i6322);
                    int i6522 = ~i;
                    int i6622 = ~intValue2;
                    int i6722 = i6522 & i6622;
                    int i6822 = (~i6722) & (i6522 | i6622);
                    int i6922 = ~((i6722 & i6822) | (i6722 ^ i6822));
                    int i7022 = i6622 & intValue;
                    int i7122 = (~i7022) & (i6622 | intValue);
                    int i7222 = ~((i7122 ^ i7022) | (i7122 & i7022));
                    int i7322 = (i7222 & (~i6922)) | ((~i7222) & i6922) | (i6922 & i7222);
                    int i7422 = i18 & i;
                    int i7522 = (~i7422) & (i18 | i);
                    int i7622 = (i7522 & i7422) | (i7522 ^ i7422);
                    int i7722 = i7622 & intValue2;
                    int i7822 = (~i7722) & (i7622 | intValue2);
                    int i7922 = ~((i7822 ^ i7722) | (i7822 & i7722));
                    int i8022 = ((i7922 & (~i7322)) | ((~i7922) & i7322) | (i7322 & i7922)) * 886;
                    int i8122 = i6422 ^ i8022;
                    int i8222 = ((i8022 & i6422) | i8122) << 1;
                    int i8322 = -i8122;
                    int i8422 = (i8222 ^ i8322) + ((i8222 & i8322) << 1);
                    int i8522 = i18 ^ intValue2;
                    int i8622 = i18 & intValue2;
                    int i8722 = ~((i8522 ^ i8622) | (i8522 & i8622));
                    int i8822 = ((~i8722) & i) | (i6522 & i8722);
                    int i8922 = i8722 & i;
                    int i9022 = -(~(((i8922 ^ i8822) | (i8922 & i8822)) * (-1772)));
                    int i9122 = (((i8422 ^ i9022) + ((i9022 & i8422) << 1)) - 1) | (-(-((~((i18 ^ i) | i7422)) * 886)));
                    cArr[i] = (char) ((cArr222[(i9122 << 1) - ((~(r4 & r8)) & i9122)] ^ (i * writeReplace)) ^ charValue);
                    int i9222 = i & 1;
                    int i9322 = ((i ^ 1) | i9222) << 1;
                    int i9422 = -((i | 1) & (~i9222));
                    i = (i9422 | i9322) + (i9322 & i9422);
                    int i9522 = i56 & 13;
                    int i9622 = -(-(i56 | 13));
                    RecordsJson = ((i9522 & i9622) + (i9522 | i9622)) % 128;
                    RecordsJson = ((((i56 | 80) << 1) - (i56 ^ 80)) - 1) % 128;
                    i2 = 2;
                }
                RecordsJson = ((i56 & 71) + (i56 | 71)) % 128;
                char[] cArr2222 = values;
                int i62222 = i * 1773;
                int i63222 = intValue2 * (-885);
                int i64222 = (i62222 & i63222) + (i62222 | i63222);
                int i65222 = ~i;
                int i66222 = ~intValue2;
                int i67222 = i65222 & i66222;
                int i68222 = (~i67222) & (i65222 | i66222);
                int i69222 = ~((i67222 & i68222) | (i67222 ^ i68222));
                int i70222 = i66222 & intValue;
                int i71222 = (~i70222) & (i66222 | intValue);
                int i72222 = ~((i71222 ^ i70222) | (i71222 & i70222));
                int i73222 = (i72222 & (~i69222)) | ((~i72222) & i69222) | (i69222 & i72222);
                int i74222 = i18 & i;
                int i75222 = (~i74222) & (i18 | i);
                int i76222 = (i75222 & i74222) | (i75222 ^ i74222);
                int i77222 = i76222 & intValue2;
                int i78222 = (~i77222) & (i76222 | intValue2);
                int i79222 = ~((i78222 ^ i77222) | (i78222 & i77222));
                int i80222 = ((i79222 & (~i73222)) | ((~i79222) & i73222) | (i73222 & i79222)) * 886;
                int i81222 = i64222 ^ i80222;
                int i82222 = ((i80222 & i64222) | i81222) << 1;
                int i83222 = -i81222;
                int i84222 = (i82222 ^ i83222) + ((i82222 & i83222) << 1);
                int i85222 = i18 ^ intValue2;
                int i86222 = i18 & intValue2;
                int i87222 = ~((i85222 ^ i86222) | (i85222 & i86222));
                int i88222 = ((~i87222) & i) | (i65222 & i87222);
                int i89222 = i87222 & i;
                int i90222 = -(~(((i89222 ^ i88222) | (i89222 & i88222)) * (-1772)));
                int i91222 = (((i84222 ^ i90222) + ((i90222 & i84222) << 1)) - 1) | (-(-((~((i18 ^ i) | i74222)) * 886)));
                cArr[i] = (char) ((cArr2222[(i91222 << 1) - ((~(r4 & r8)) & i91222)] ^ (i * writeReplace)) ^ charValue);
                int i92222 = i & 1;
                int i93222 = ((i ^ 1) | i92222) << 1;
                int i94222 = -((i | 1) & (~i92222));
                i = (i94222 | i93222) + (i93222 & i94222);
                int i95222 = i56 & 13;
                int i96222 = -(-(i56 | 13));
                RecordsJson = ((i95222 & i96222) + (i95222 | i96222)) % 128;
                RecordsJson = ((((i56 | 80) << 1) - (i56 ^ 80)) - 1) % 128;
                i2 = 2;
            }
        }
        int i99 = SdkCoreAlternateContactlessPaymentDataImpl;
        int i100 = i99 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i101 = -(-(i99 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE));
        int i102 = (i100 ^ i101) + ((i101 & i100) << 1);
        RecordsJson = i102 % 128;
        if (i102 % 2 != 0) {
            int i103 = 2 / 2;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i104 = SdkCoreAlternateContactlessPaymentDataImpl;
        RecordsJson = ((i104 & 11) + (i104 | 11)) % 128;
        RecordsJson = (i104 + 125) % 128;
        int i105 = getAid;
        int i106 = ((((i105 ^ 89) | (i105 & 89)) << 1) - (~(-((i105 & (-90)) | ((~i105) & 89))))) - 1;
        getProfileVersion = i106 % 128;
        if (i106 % 2 != 0) {
            RecordsJson = ((((i104 & (-48)) | ((~i104) & 47)) - (~((i104 & 47) << 1))) - 1) % 128;
            int i107 = i104 & 19;
            RecordsJson = (((i104 | 19) & (~i107)) + (i107 << 1)) % 128;
            throw new java.lang.ArithmeticException();
        }
        int i108 = i104 ^ 87;
        int i109 = (i104 & 87) << 1;
        RecordsJson = ((i108 ^ i109) + ((i108 & i109) << 1)) % 128;
        int i110 = (((i104 | 19) << 1) - (~(-((i104 & (-20)) | ((~i104) & 19))))) - 1;
        RecordsJson = i110 % 128;
        if (i110 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 121 % 2;
    }

    private static java.lang.String AlternateContactlessPaymentDataJson(int i, char c, int i2) {
        return (java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i2)}, -1796669726, 1796669727, i);
    }

    @Override // com.payair.hce.checkUriPermissions
    public final void x_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage) {
        writeReplace(new java.lang.Object[]{this, sQLiteDatabase, context, getdetailedmessage}, -1885408829, 1885408829, java.lang.System.identityHashCode(this));
    }
}
