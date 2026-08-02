package com.payair.hce;

/* loaded from: classes4.dex */
public final class PayairUserDataDao_Impl implements com.payair.hce.PayairUserDataDao {
    private static int values = 0;
    private static int writeReplace = 1;
    final androidx.room.RoomDatabase __db;
    final androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setPointerIcon> __deletionAdapterOfPayairUserData;
    final androidx.room.EntityInsertionAdapter<com.payair.hce.setPointerIcon> __insertionAdapterOfPayairUserData;
    final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;

    public PayairUserDataDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfPayairUserData = new androidx.room.EntityInsertionAdapter<com.payair.hce.setPointerIcon>(roomDatabase) { // from class: com.payair.hce.PayairUserDataDao_Impl.2
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int valueOf;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = i2 | i3;
                int i6 = (i * (-464)) + (i2 * (-929)) + (((~i5) | i4) * (-465)) + ((i2 | (~(i3 | i4))) * 930) + ((i4 | i5) * 465);
                if (i6 == 1) {
                    return writeReplace(objArr);
                }
                if (i6 == 2) {
                    return AlternateContactlessPaymentDataJson(objArr);
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i7 = valueOf;
                int i8 = i7 & 67;
                int i9 = ((i7 ^ 67) | i8) << 1;
                int i10 = -((i7 | 67) & (~i8));
                AlternateContactlessPaymentDataJson = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                valueOf(new java.lang.Object[]{supportSQLiteStatement, (com.payair.hce.setPointerIcon) obj}, 1345616370, -1345616369, (int) java.lang.System.currentTimeMillis());
                int i11 = AlternateContactlessPaymentDataJson;
                int i12 = i11 ^ 113;
                valueOf = ((((i11 & 113) | i12) << 1) - i12) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                int i = valueOf + 102;
                int i2 = (~i) + (i << 1);
                int i3 = i2 % 128;
                AlternateContactlessPaymentDataJson = i3;
                if (i2 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                int i4 = ((i3 & 59) - (~(-(-(i3 | 59))))) - 1;
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `payairUserData` (`personId`,`km`,`kd`,`applicationId`,`languageId`,`version`,`msisdn`,`btMacId`,`btServerPort`,`privateSshKey`,`serverAddress`,`screenWidth`,`screenHeight`,`userCountry`,`appVersion`,`sdkVersion`,`mpWalletId`,`bankApplicationId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                int i;
                int i2;
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setPointerIcon setpointericon = (com.payair.hce.setPointerIcon) objArr[1];
                int i3 = AlternateContactlessPaymentDataJson;
                valueOf = ((i3 ^ 83) + ((i3 & 83) << 1)) % 128;
                supportSQLiteStatement.bindLong(1, ((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1208058698, -1208058665, java.lang.System.identityHashCode(setpointericon))).longValue());
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -833491071, 833491076, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i4 = valueOf;
                    int i5 = i4 & 105;
                    AlternateContactlessPaymentDataJson = (((i4 | 105) & (~i5)) + (i5 << 1)) % 128;
                    supportSQLiteStatement.bindNull(2);
                    int i6 = AlternateContactlessPaymentDataJson;
                    int i7 = i6 ^ 55;
                    valueOf = ((((i6 & 55) | i7) << 1) - i7) % 128;
                } else {
                    supportSQLiteStatement.bindString(2, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -833491071, 833491076, java.lang.System.identityHashCode(setpointericon)));
                    int i8 = valueOf;
                    int i9 = i8 & 35;
                    int i10 = ((i8 ^ 35) | i9) << 1;
                    int i11 = -((i8 | 35) & (~i9));
                    int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
                    AlternateContactlessPaymentDataJson = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 2 / 4;
                    }
                }
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -68969111, 68969137, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i14 = AlternateContactlessPaymentDataJson;
                    int i15 = i14 & 25;
                    int i16 = (((i14 ^ 25) | i15) << 1) - ((i14 | 25) & (~i15));
                    valueOf = i16 % 128;
                    if (i16 % 2 != 0) {
                        supportSQLiteStatement.bindNull(5);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                } else {
                    supportSQLiteStatement.bindString(3, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -68969111, 68969137, java.lang.System.identityHashCode(setpointericon)));
                    int i17 = valueOf;
                    AlternateContactlessPaymentDataJson = (((i17 ^ 119) - (~(-(-((i17 & 119) << 1))))) - 1) % 128;
                }
                supportSQLiteStatement.bindLong(4, ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 516081132, -516081113, java.lang.System.identityHashCode(setpointericon))).intValue());
                supportSQLiteStatement.bindLong(5, ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -603563677, 603563709, java.lang.System.identityHashCode(setpointericon))).intValue());
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 542017361, -542017332, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i18 = AlternateContactlessPaymentDataJson;
                    int i19 = ((i18 ^ 61) | (i18 & 61)) << 1;
                    int i20 = -((i18 & (-62)) | ((~i18) & 61));
                    int i21 = (i19 & i20) + (i20 | i19);
                    valueOf = i21 % 128;
                    supportSQLiteStatement.bindNull(i21 % 2 != 0 ? 59 : 6);
                } else {
                    supportSQLiteStatement.bindString(6, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 542017361, -542017332, java.lang.System.identityHashCode(setpointericon)));
                    int i22 = valueOf;
                    int i23 = i22 & 93;
                    int i24 = ((i22 | 93) & (~i23)) + (i23 << 1);
                    AlternateContactlessPaymentDataJson = i24 % 128;
                    if (i24 % 2 == 0) {
                        int i25 = 5 / 3;
                    }
                }
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 535536029, -535536005, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i26 = AlternateContactlessPaymentDataJson;
                    int i27 = i26 & 99;
                    int i28 = -(-((i26 ^ 99) | i27));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    valueOf = i29 % 128;
                    supportSQLiteStatement.bindNull(i29 % 2 != 0 ? 43 : 7);
                } else {
                    supportSQLiteStatement.bindString(7, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 535536029, -535536005, java.lang.System.identityHashCode(setpointericon)));
                    int i30 = AlternateContactlessPaymentDataJson;
                    valueOf = (((i30 ^ 104) + ((i30 & 104) << 1)) - 1) % 128;
                }
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -1040835125, 1040835136, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i31 = AlternateContactlessPaymentDataJson;
                    int i32 = i31 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    int i33 = ((i31 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i32)) + (i32 << 1);
                    valueOf = i33 % 128;
                    if (i33 % 2 != 0) {
                        supportSQLiteStatement.bindNull(15);
                    } else {
                        supportSQLiteStatement.bindNull(8);
                    }
                } else {
                    supportSQLiteStatement.bindString(8, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -1040835125, 1040835136, java.lang.System.identityHashCode(setpointericon)));
                    int i34 = AlternateContactlessPaymentDataJson;
                    int i35 = i34 & 1;
                    valueOf = ((((i34 | 1) & (~i35)) - (~(i35 << 1))) - 1) % 128;
                }
                supportSQLiteStatement.bindLong(9, ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1151287730, -1151287715, java.lang.System.identityHashCode(setpointericon))).intValue());
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 566506569, -566506541, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i36 = valueOf;
                    AlternateContactlessPaymentDataJson = (((i36 & 112) + (i36 | 112)) - 1) % 128;
                    supportSQLiteStatement.bindNull(10);
                    AlternateContactlessPaymentDataJson = (valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                } else {
                    supportSQLiteStatement.bindString(10, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 566506569, -566506541, java.lang.System.identityHashCode(setpointericon)));
                    int i37 = valueOf;
                    int i38 = i37 ^ 35;
                    int i39 = ((i37 & 35) | i38) << 1;
                    int i40 = -i38;
                    AlternateContactlessPaymentDataJson = (((i39 | i40) << 1) - (i39 ^ i40)) % 128;
                }
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1375844396, -1375844369, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i41 = AlternateContactlessPaymentDataJson;
                    int i42 = i41 & 13;
                    int i43 = -(-((i41 ^ 13) | i42));
                    valueOf = ((i42 ^ i43) + ((i43 & i42) << 1)) % 128;
                    supportSQLiteStatement.bindNull(11);
                    int i44 = AlternateContactlessPaymentDataJson;
                    int i45 = i44 & 51;
                    int i46 = (i44 | 51) & (~i45);
                    int i47 = i45 << 1;
                    int i48 = (i46 ^ i47) + ((i46 & i47) << 1);
                    valueOf = i48 % 128;
                    int i49 = i48 % 2;
                } else {
                    supportSQLiteStatement.bindString(11, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1375844396, -1375844369, java.lang.System.identityHashCode(setpointericon)));
                    AlternateContactlessPaymentDataJson = (valueOf + 81) % 128;
                }
                supportSQLiteStatement.bindLong(12, ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 910429342, -910429335, java.lang.System.identityHashCode(setpointericon))).intValue());
                supportSQLiteStatement.bindLong(13, ((java.lang.Integer) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1724855729, -1724855723, java.lang.System.identityHashCode(setpointericon))).intValue());
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 2058263324, -2058263290, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i50 = AlternateContactlessPaymentDataJson;
                    int i51 = i50 & 75;
                    int i52 = i51 + ((i50 ^ 75) | i51);
                    valueOf = i52 % 128;
                    supportSQLiteStatement.bindNull(i52 % 2 != 0 ? 60 : 14);
                } else {
                    supportSQLiteStatement.bindString(14, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 2058263324, -2058263290, java.lang.System.identityHashCode(setpointericon)));
                    int i53 = valueOf;
                    int i54 = i53 ^ 17;
                    AlternateContactlessPaymentDataJson = (((((i53 & 17) | i54) << 1) - (~(-i54))) - 1) % 128;
                }
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 54879881, -54879877, java.lang.System.identityHashCode(setpointericon))) == null) {
                    AlternateContactlessPaymentDataJson = (valueOf + 61) % 128;
                    supportSQLiteStatement.bindNull(15);
                    int i55 = valueOf;
                    int i56 = i55 & 109;
                    int i57 = -(-((i55 ^ 109) | i56));
                    i = i56 ^ i57;
                    i2 = (i57 & i56) << 1;
                } else {
                    supportSQLiteStatement.bindString(15, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 54879881, -54879877, java.lang.System.identityHashCode(setpointericon)));
                    int i58 = valueOf;
                    int i59 = i58 ^ 29;
                    int i60 = ((i58 & 29) | i59) << 1;
                    int i61 = -i59;
                    i = i60 & i61;
                    i2 = i60 | i61;
                }
                AlternateContactlessPaymentDataJson = (i + i2) % 128;
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -2060421759, 2060421784, java.lang.System.identityHashCode(setpointericon))) == null) {
                    int i62 = AlternateContactlessPaymentDataJson;
                    int i63 = i62 | 27;
                    int i64 = i63 << 1;
                    int i65 = -((~(i62 & 27)) & i63);
                    int i66 = (i64 & i65) + (i65 | i64);
                    valueOf = i66 % 128;
                    supportSQLiteStatement.bindNull(i66 % 2 != 0 ? 73 : 16);
                    int i67 = AlternateContactlessPaymentDataJson;
                    valueOf = ((i67 ^ 107) + ((i67 & 107) << 1)) % 128;
                } else {
                    supportSQLiteStatement.bindString(16, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -2060421759, 2060421784, java.lang.System.identityHashCode(setpointericon)));
                    int i68 = valueOf;
                    int i69 = ((i68 | 100) << 1) - (i68 ^ 100);
                    AlternateContactlessPaymentDataJson = ((~i69) + (i69 << 1)) % 128;
                }
                supportSQLiteStatement.bindLong(17, ((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, -222327993, 222328014, java.lang.System.identityHashCode(setpointericon))).longValue());
                if (((java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1170827164, -1170827126, java.lang.System.identityHashCode(setpointericon))) != null) {
                    supportSQLiteStatement.bindString(18, (java.lang.String) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1170827164, -1170827126, java.lang.System.identityHashCode(setpointericon)));
                    return null;
                }
                int i70 = AlternateContactlessPaymentDataJson + 37;
                valueOf = i70 % 128;
                supportSQLiteStatement.bindNull(i70 % 2 != 0 ? 120 : 18);
                int i71 = AlternateContactlessPaymentDataJson;
                int i72 = ((i71 & (-12)) | ((~i71) & 11)) + ((i71 & 11) << 1);
                valueOf = i72 % 128;
                if (i72 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // androidx.room.EntityInsertionAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setPointerIcon setpointericon) {
                valueOf(new java.lang.Object[]{this, supportSQLiteStatement, setpointericon}, 1429931256, -1429931256, java.lang.System.identityHashCode(this));
            }

            private static void writeReplace(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setPointerIcon setpointericon) {
                valueOf(new java.lang.Object[]{supportSQLiteStatement, setpointericon}, 1345616370, -1345616369, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) valueOf(new java.lang.Object[]{this}, 1292262484, -1292262482, java.lang.System.identityHashCode(this));
            }
        };
        this.__deletionAdapterOfPayairUserData = new androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setPointerIcon>(roomDatabase) { // from class: com.payair.hce.PayairUserDataDao_Impl.3
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i3;
                int i6 = (i * 784) + (i2 * (-782)) + ((~i2) * (-783)) + ((~(i4 | i5 | i2)) * (-783)) + (((~(i2 | i5)) | i4) * 783);
                if (i6 == 1) {
                    return DigitizedCardProfile(objArr);
                }
                if (i6 == 2) {
                    return AlternateContactlessPaymentDataJson(objArr);
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setPointerIcon setpointericon = (com.payair.hce.setPointerIcon) objArr[1];
                int i7 = valueOf;
                int i8 = (((i7 | 53) << 1) - (~(-(i7 ^ 53)))) - 1;
                values = i8 % 128;
                if (i8 % 2 != 0) {
                    supportSQLiteStatement.bindLong(0, ((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1208058698, -1208058665, java.lang.System.identityHashCode(setpointericon))).longValue());
                    return null;
                }
                supportSQLiteStatement.bindLong(1, ((java.lang.Long) com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon}, 1208058698, -1208058665, java.lang.System.identityHashCode(setpointericon))).longValue());
                return null;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i = values + 37;
                valueOf = i % 128;
                java.lang.Object[] objArr2 = {supportSQLiteStatement, (com.payair.hce.setPointerIcon) obj};
                if (i % 2 != 0) {
                    writeReplace(objArr2, 1526225344, -1526225344, (int) java.lang.System.currentTimeMillis());
                    return null;
                }
                writeReplace(objArr2, 1526225344, -1526225344, (int) java.lang.System.currentTimeMillis());
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                int i = valueOf;
                int i2 = (i | 105) << 1;
                int i3 = -((i & (-106)) | ((~i) & 105));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    return "DELETE FROM `payairUserData` WHERE `personId` = ?";
                }
                throw null;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setPointerIcon setpointericon) {
                writeReplace(new java.lang.Object[]{this, supportSQLiteStatement, setpointericon}, 80770840, -80770838, java.lang.System.identityHashCode(this));
            }

            private static void writeReplace(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setPointerIcon setpointericon) {
                writeReplace(new java.lang.Object[]{supportSQLiteStatement, setpointericon}, 1526225344, -1526225344, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) writeReplace(new java.lang.Object[]{this}, -1333633114, 1333633115, java.lang.System.identityHashCode(this));
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(roomDatabase) { // from class: com.payair.hce.PayairUserDataDao_Impl.4
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = values;
                valueOf = ((i4 & 47) + (i4 | 47)) % 128;
                valueOf = (i4 + 43) % 128;
                return "DELETE FROM payairUserData";
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1889238689, 1889238689, java.lang.System.identityHashCode(this));
            }
        };
    }

    /* renamed from: com.payair.hce.PayairUserDataDao_Impl$8, reason: invalid class name */
    public final class AnonymousClass8 implements java.util.concurrent.Callable<java.lang.Integer> {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AlternateContactlessPaymentDataJson;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        private static long getAid;
        private static int getProfileVersion;
        private static char valueOf;
        private static char values;
        private static char writeReplace;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(byte b, short s, int i, java.lang.Object[] objArr) {
            int i2;
            int i3;
            int i4 = s * 2;
            int i5 = b + 4;
            byte[] bArr = $$a;
            char[] cArr = new char[35 - i4];
            int i6 = 34 - i4;
            if (bArr == null) {
                i3 = i5;
                int i7 = i6;
                int i8 = 0;
                i5 = (i5 + (-i7)) - 2;
                i2 = i8;
                cArr[i2] = (char) i5;
                i3++;
                i8 = i2 + 1;
                if (i2 == i6) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i7 = bArr[i3];
                i5 = (i5 + (-i7)) - 2;
                i2 = i8;
                cArr[i2] = (char) i5;
                i3++;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            } else {
                int i9 = i + 65;
                i2 = 0;
                i3 = i5;
                i5 = i9;
                cArr[i2] = (char) i5;
                i3++;
                i8 = i2 + 1;
                if (i2 == i6) {
                }
            }
        }

        private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
            int i2 = b2 * 2;
            int i3 = 113 - b;
            int i4 = (i * 3) + 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = -1;
            if (bArr == null) {
                i4++;
                i3 += i4;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i3;
                if (i5 == 0 - i2) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                } else {
                    byte b3 = bArr[i4];
                    i4++;
                    i3 += b3;
                }
            }
        }

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            int i4 = ~((~i) | i2);
            int i5 = ~i3;
            int i6 = ~i2;
            int i7 = ~(i5 | i);
            return ((((i * 595) + (i2 * (-1187))) + (((~(i2 | i5)) | i4) * (-1188))) + ((((~(i3 | i6)) | i4) | i7) * 594)) + ((((~(i | i6)) | (~(i6 | i5))) | i7) * 594) != 1 ? DigitizedCardProfile(objArr) : AlternateContactlessPaymentDataJson(objArr);
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                cArr = str.toCharArray();
                $10 = ($11 + 69) % 128;
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
            getdsrpdata.values = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                $11 = ($10 + 39) % 128;
                int i2 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 31, 1890 - (android.os.Process.myTid() >> 22), (char) (android.view.View.MeasureSpec.getMode(0) + 3600));
                        byte b = $$d[3];
                        byte b2 = b;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i2] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getAid ^ (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 64, (android.os.Process.myTid() >> 22) + 1443, (char) (29683 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                        byte b3 = $$d[3];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(b3, (byte) (b3 + 1), b3, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr3 = new char[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < cArr2.length) {
                cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 1443 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (29682 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    byte b4 = $$d[3];
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(b4, (byte) (b4 + 1), b4, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
            char[] cArr;
            if (str != null) {
                int i2 = $11 + 93;
                $10 = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
            char[] cArr3 = new char[cArr2.length];
            getproducttype.AlternateContactlessPaymentDataJson = 0;
            char[] cArr4 = new char[2];
            while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
                $11 = ($10 + 3) % 128;
                cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
                cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
                int i3 = 58224;
                for (int i4 = 0; i4 < 16; i4++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i3) ^ ((c2 << 4) + ((char) (values ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(valueOf)};
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.graphics.Color.alpha(0), 1335 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                            byte b = $$d[3];
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(b, (byte) (b + 3), b, objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        cArr4[1] = charValue;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(writeReplace)};
                        int i5 = charValue + i3;
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 62, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1334, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                            byte b2 = $$d[3];
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d(b2, (byte) (b2 + 3), b2, objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                        }
                        cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i3 -= 40503;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
                cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
                java.lang.Object[] objArr6 = {getproducttype, getproducttype};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 53, android.view.MotionEvent.axisFromString("") + 3544, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr3, 0, i);
        }

        AnonymousClass8() {
        }

        private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
            com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8 anonymousClass8 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            int i2 = (((i ^ 21) | (i & 21)) << 1) - ((i & (-22)) | ((~i) & 21));
            getProfileVersion = i2 % 128;
            if (i2 % 2 == 0) {
                return (java.lang.Integer) values(new java.lang.Object[]{anonymousClass8}, 1314592770, -1314592770, java.lang.System.identityHashCode(anonymousClass8));
            }
            throw null;
        }

        private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
            com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8 anonymousClass8 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8) objArr[0];
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            getProfileVersion = ((((i ^ 101) | (i & 101)) << 1) - ((i & (-102)) | ((~i) & 101))) % 128;
            androidx.database.db.SupportSQLiteStatement acquire = com.payair.hce.PayairUserDataDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
            try {
                com.payair.hce.PayairUserDataDao_Impl.this.__db.beginTransaction();
                try {
                    int executeUpdateDelete = acquire.executeUpdateDelete();
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.setTransactionSuccessful();
                    com.payair.hce.PayairUserDataDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                    int i2 = (-2) - (~(getProfileVersion + 100));
                    SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        return java.lang.Integer.valueOf(executeUpdateDelete);
                    }
                    throw new java.lang.ArithmeticException();
                } finally {
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                }
            } catch (java.lang.Throwable th) {
                com.payair.hce.PayairUserDataDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                throw th;
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getProfileVersion = 0;
            SdkCoreAlternateContactlessPaymentDataImpl = 1;
            AlternateContactlessPaymentDataJson = (char) 12212;
            writeReplace = (char) 64337;
            values = (char) 25262;
            valueOf = (char) 32165;
            getAid = -3829414820821771866L;
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v1199 ?? I:??[int, boolean, short, byte, char]), method size: 17223
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public static java.lang.Object[] writeReplace$5f5b6fcf(int r57, java.lang.Object r58, int r59) {
            /*
                Method dump skipped, instructions count: 17223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8.writeReplace$5f5b6fcf(int, java.lang.Object, int):java.lang.Object[]");
        }

        static void init$1() {
            $$d = new byte[]{125, 17, -56, 0};
            $$e = 154;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
            ?? values2 = values(new java.lang.Object[]{this}, -1996578688, 1996578689, java.lang.System.identityHashCode(this));
            return values2;
        }

        static void init$0() {
            $$a = new byte[]{34, -102, -7, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
            $$b = 3;
        }

        private java.lang.Integer writeReplace() throws java.lang.Exception {
            return (java.lang.Integer) values(new java.lang.Object[]{this}, 1314592770, -1314592770, java.lang.System.identityHashCode(this));
        }
    }

    @Override // com.payair.hce.PayairUserDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> insert(final com.payair.hce.setPointerIcon... setpointericonArr) {
        com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.util.List<java.lang.Long>>() { // from class: com.payair.hce.PayairUserDataDao_Impl.1
            private static int values = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~(i | i3);
                int i6 = ~i;
                int i7 = ~(i6 | i2);
                return ((((i * (-813)) + (i2 * 408)) + (((~(i | i4)) | i5) * (-814))) + ((((~((~i3) | i4)) | i7) | i5) * 407)) + ((((~(i6 | i3)) | i7) | (~(i2 | i3))) * 407) != 1 ? writeReplace(objArr) : DigitizedCardProfile(objArr);
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                com.payair.hce.PayairUserDataDao_Impl.AnonymousClass1 anonymousClass1 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass1) objArr[0];
                int i = values;
                int i2 = i & 97;
                int i3 = ((i ^ 97) | i2) << 1;
                int i4 = -((i | 97) & (~i2));
                writeReplace = ((i3 & i4) + (i4 | i3)) % 128;
                java.util.List list = (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass1}, -1876601784, 1876601784, java.lang.System.identityHashCode(anonymousClass1));
                int i5 = values + 43;
                writeReplace = i5 % 128;
                if (i5 % 2 == 0) {
                    return list;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.PayairUserDataDao_Impl.AnonymousClass1 anonymousClass1 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass1) objArr[0];
                int i = values + 28;
                int i2 = (~i) + (i << 1);
                writeReplace = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        com.payair.hce.PayairUserDataDao_Impl.this.__db.beginTransaction();
                        java.util.List<java.lang.Long> insertAndReturnIdsList = com.payair.hce.PayairUserDataDao_Impl.this.__insertionAdapterOfPayairUserData.insertAndReturnIdsList(setpointericonArr);
                        com.payair.hce.PayairUserDataDao_Impl.this.__db.setTransactionSuccessful();
                        com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                        int i3 = values;
                        int i4 = (((i3 | 118) << 1) - (i3 ^ 118)) - 1;
                        writeReplace = i4 % 128;
                        if (i4 % 2 == 0) {
                            return insertAndReturnIdsList;
                        }
                        throw null;
                    }
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.beginTransaction();
                    com.payair.hce.PayairUserDataDao_Impl.this.__insertionAdapterOfPayairUserData.insertAndReturnIdsList(setpointericonArr);
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.setTransactionSuccessful();
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                    throw new java.lang.ArithmeticException();
                } catch (java.lang.Throwable th) {
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<java.lang.Long>] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.util.List<java.lang.Long> call() throws java.lang.Exception {
                ?? AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 143258828, -143258827, java.lang.System.identityHashCode(this));
                return AlternateContactlessPaymentDataJson;
            }

            private java.util.List<java.lang.Long> valueOf() throws java.lang.Exception {
                return (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1876601784, 1876601784, java.lang.System.identityHashCode(this));
            }
        });
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = i & (-877714446);
        int i3 = ~((identityHashCode & 877714445) | i2 | (identityHashCode & (-877714446)));
        int i4 = i3 ^ (-1270319844);
        int i5 = i3 & (-1270319844);
        int i6 = -(~(((i5 ^ i4) | (i5 & i4)) * (-964)));
        int i7 = ((i6 & 1633551700) + (i6 | 1633551700)) - 1;
        int i8 = ((~i) & (-877714446)) | (i & 877714445);
        int i9 = ~((i8 ^ i2) | (i8 & i2));
        int i10 = -(-(((i9 ^ 876631052) | (i9 & 876631052)) * (-964)));
        int identityHashCode2 = java.lang.System.identityHashCode(this);
        int i11 = ~identityHashCode2;
        int i12 = i11 & 389244286;
        int i13 = (~((identityHashCode2 & (-389244287)) | i12 | (identityHashCode2 & 389244286))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
        int i14 = (i13 ^ 436938268) + ((i13 & 436938268) << 1);
        int i15 = i14 ^ (-1814386268);
        int i16 = (((-1814386268) & i14) | i15) << 1;
        int i17 = -i15;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        int i19 = (i11 | 389244286) & (~i12);
        int i20 = (i19 ^ i12) | (i12 & i19);
        int i21 = ~i20;
        int i22 = (i20 | i21) & i21;
        int i23 = ((i22 & (-336732447)) | (336732446 & (~i22)) | (i22 & 336732446)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING;
        int i24 = ((~i23) & i18) | ((~i18) & i23);
        int i25 = -(-((i23 & i18) << 1));
        if (((((~i10) & i7) | ((~i7) & i10)) - (~((i10 & i7) << 1))) - 1 <= (i24 & i25) + (i25 | i24)) {
            return createListenableFuture;
        }
        throw null;
    }

    @Override // com.payair.hce.PayairUserDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> delete(final com.payair.hce.setPointerIcon setpointericon) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.lang.Integer>() { // from class: com.payair.hce.PayairUserDataDao_Impl.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int AlternateContactlessPaymentDataJson;
            private static final byte[] IccPrivateKeyCrtComponentsJson = null;
            private static int RecordsJson;
            private static int SdkCoreAlternateContactlessPaymentDataImpl;
            private static short[] getAid;
            private static final int getCvrMaskAnd = 0;
            private static byte[] getProfileVersion;
            private static int valueOf;
            private static int values;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void c(int i, short s, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4 = 36 - (i * 33);
                int i5 = s * 27;
                byte[] bArr = $$a;
                int i6 = (i2 * 19) + 99;
                byte[] bArr2 = new byte[i5 + 7];
                int i7 = i5 + 6;
                if (bArr == null) {
                    int i8 = i7;
                    i3 = 0;
                    i6 += -i8;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i7) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i4++;
                    i8 = bArr[i4];
                    i6 += -i8;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i7) {
                    }
                } else {
                    i3 = 0;
                    bArr2[i3] = (byte) i6;
                    if (i3 == i7) {
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void d(byte b, int i, short s, java.lang.Object[] objArr) {
                int i2;
                int i3 = i * 2;
                int i4 = 104 - (s * 4);
                byte[] bArr = $$d;
                int i5 = (b * 4) + 4;
                byte[] bArr2 = new byte[1 - i3];
                int i6 = 0 - i3;
                if (bArr == null) {
                    int i7 = i5;
                    int i8 = i6;
                    int i9 = 0;
                    int i10 = i5 + i8;
                    int i11 = i7 + 1;
                    i2 = i9;
                    i4 = i10;
                    i5 = i11;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    int i12 = i4;
                    i7 = i5;
                    i5 = bArr[i5];
                    i9 = i2 + 1;
                    i8 = i12;
                    int i102 = i5 + i8;
                    int i112 = i7 + 1;
                    i2 = i9;
                    i4 = i102;
                    i5 = i112;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                    }
                } else {
                    i2 = 0;
                    bArr2[i2] = (byte) i4;
                    if (i2 == i6) {
                    }
                }
            }

            @Override // java.util.concurrent.Callable
            public /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
                int i = RecordsJson + 113;
                SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
                if (i % 2 == 0) {
                    return values();
                }
                values();
                throw null;
            }

            private static void b(int i, int i2, int i3, byte b, short s, java.lang.Object[] objArr) {
                boolean z;
                com.payair.hce.getTrack2ConstructionData gettrack2constructiondata = new com.payair.hce.getTrack2ConstructionData();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(values)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 29 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    int i4 = intValue == -1 ? 1 : 0;
                    if (i4 != 0) {
                        int i5 = $11 + 7;
                        $10 = i5 % 128;
                        if (i5 % 2 != 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        byte[] bArr = getProfileVersion;
                        if (bArr != null) {
                            int length = bArr.length;
                            byte[] bArr2 = new byte[length];
                            for (int i6 = 0; i6 < length; i6++) {
                                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(bArr[i6])};
                                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609478628);
                                if (obj2 == null) {
                                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 5089 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1))).getMethod("e", java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609478628, obj2);
                                }
                                bArr2[i6] = ((java.lang.Byte) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).byteValue();
                            }
                            bArr = bArr2;
                        }
                        if (bArr != null) {
                            byte[] bArr3 = getProfileVersion;
                            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(valueOf)};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(745676488);
                            if (obj3 == null) {
                                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 29 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod(util.h.xy.cb.b.f1091, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(745676488, obj3);
                            }
                            intValue = (byte) (((byte) (bArr3[((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue()] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                        } else {
                            intValue = (short) (((short) (getAid[i2 + ((int) (valueOf ^ (-4897270311952305750L)))] ^ (-4897270311952305750L))) + ((int) (values ^ (-4897270311952305750L))));
                            int i7 = $11 + 125;
                            $10 = i7 % 128;
                            int i8 = i7 % 2;
                        }
                    }
                    if (intValue > 0) {
                        $10 = ($11 + 87) % 128;
                        gettrack2constructiondata.writeReplace = ((i2 + intValue) - 2) + ((int) (valueOf ^ (-4897270311952305750L))) + i4;
                        java.lang.Object[] objArr5 = {gettrack2constructiondata, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson), sb};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-500696024);
                        if (obj4 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 27, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2364, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                            java.lang.Object[] objArr6 = new java.lang.Object[1];
                            d((byte) 0, 0, (short) 0, objArr6);
                            obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-500696024, obj4);
                        }
                        ((java.lang.StringBuilder) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).append(gettrack2constructiondata.values);
                        gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                        byte[] bArr4 = getProfileVersion;
                        if (bArr4 != null) {
                            $10 = ($11 + 3) % 128;
                            int length2 = bArr4.length;
                            byte[] bArr5 = new byte[length2];
                            for (int i9 = 0; i9 < length2; i9++) {
                                $11 = ($10 + 111) % 128;
                                bArr5[i9] = (byte) (bArr4[i9] ^ (-4897270311952305750L));
                            }
                            bArr4 = bArr5;
                        }
                        if (bArr4 != null) {
                            $10 = ($11 + 113) % 128;
                            z = true;
                        } else {
                            z = false;
                        }
                        gettrack2constructiondata.DigitizedCardProfile = 1;
                        while (gettrack2constructiondata.DigitizedCardProfile < intValue) {
                            if (z) {
                                byte[] bArr6 = getProfileVersion;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((byte) (((byte) (bArr6[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                            } else {
                                short[] sArr = getAid;
                                gettrack2constructiondata.writeReplace = gettrack2constructiondata.writeReplace - 1;
                                gettrack2constructiondata.values = (char) (gettrack2constructiondata.AlternateContactlessPaymentDataJson + (((short) (((short) (sArr[r7] ^ (-4897270311952305750L))) + s)) ^ b));
                                $10 = ($11 + 57) % 128;
                            }
                            sb.append(gettrack2constructiondata.values);
                            gettrack2constructiondata.AlternateContactlessPaymentDataJson = gettrack2constructiondata.values;
                            gettrack2constructiondata.DigitizedCardProfile++;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }

            private java.lang.Integer values() throws java.lang.Exception {
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 1) % 128;
                com.payair.hce.PayairUserDataDao_Impl.this.__db.beginTransaction();
                try {
                    int handle = com.payair.hce.PayairUserDataDao_Impl.this.__deletionAdapterOfPayairUserData.handle(setpointericon);
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.setTransactionSuccessful();
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 81) % 128;
                    return java.lang.Integer.valueOf(handle);
                } catch (java.lang.Throwable th) {
                    com.payair.hce.PayairUserDataDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x06ac  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static void DigitizedCardProfile(long j, long j2) {
                java.lang.Class<?>[] clsArr;
                int i;
                char c;
                java.lang.Object obj;
                int i2;
                java.lang.Object method;
                int i3;
                java.lang.Object obj2;
                java.lang.Object invoke;
                java.lang.Object[] objArr;
                java.lang.Class<?> cls;
                java.lang.Object[] objArr2;
                char c2;
                java.lang.Object[] objArr3;
                java.lang.Class<?> cls2;
                java.lang.String str;
                java.lang.Object[] objArr4;
                com.payair.hce.setOutlineProvider setoutlineprovider = new com.payair.hce.setOutlineProvider(j, j2);
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                char c3 = '+';
                short s = bArr[43];
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(s, (short) (s | 602), bArr[358], objArr5);
                java.lang.String str2 = (java.lang.String) objArr5[0];
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                short s2 = 307;
                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, (short) 307, (byte) (bArr[358] + 1), objArr6);
                try {
                    java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                    char c4 = ')';
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (short) 307, bArr[41], objArr8);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_CHECK_LOGO_NAVBAR_LIGHT_APPEARANCE_VALUE, (short) 292, bArr[210], objArr9);
                    java.lang.String str3 = (java.lang.String) objArr9[0];
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (short) 307, bArr[41], objArr10);
                    java.lang.Object[] objArr11 = (java.lang.Object[]) cls3.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr10[0])).invoke(str2, objArr7);
                    int[] iArr = new int[objArr11.length];
                    int i4 = 0;
                    while (true) {
                        clsArr = null;
                        if (i4 >= objArr11.length) {
                            break;
                        }
                        java.lang.Object[] objArr12 = {objArr11[i4]};
                        byte[] bArr2 = IccPrivateKeyCrtComponentsJson;
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, (short) 288, bArr2[41], objArr13);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr13[0]);
                        byte b = bArr2[c3];
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, (short) 272, b, objArr14);
                        java.lang.String str4 = (java.lang.String) objArr14[0];
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (short) 307, bArr2[41], objArr15);
                        java.lang.Object invoke2 = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr15[0])).invoke(null, objArr12);
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, (short) 288, bArr2[41], objArr16);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr16[0]);
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, (short) 266, bArr2[26], objArr17);
                        iArr[i4] = ((java.lang.Integer) cls5.getMethod((java.lang.String) objArr17[0], null).invoke(invoke2, null)).intValue();
                        i4++;
                        c3 = '+';
                    }
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        try {
                            c = 23;
                        } catch (java.lang.Throwable th) {
                            th = th;
                        }
                        switch (setoutlineprovider.values(iArr[i5])) {
                            case -38:
                                i5 = 32;
                                clsArr = null;
                            case -37:
                                i5 = 88;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -36:
                                setoutlineprovider.values(35);
                                if (setoutlineprovider.writeReplace == 0) {
                                    i5 = 87;
                                    clsArr = null;
                                    c4 = ')';
                                    s2 = 307;
                                }
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -35:
                                i5 = 63;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -34:
                                i5 = 76;
                                clsArr = null;
                            case -33:
                                setoutlineprovider.values(35);
                                if (setoutlineprovider.writeReplace == 0) {
                                    i5 = 75;
                                    clsArr = null;
                                    c4 = ')';
                                    s2 = 307;
                                }
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -32:
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(13);
                                SdkCoreAlternateContactlessPaymentDataImpl = setoutlineprovider.writeReplace;
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -31:
                                setoutlineprovider.AlternateContactlessPaymentDataJson = RecordsJson;
                                setoutlineprovider.values(1);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -30:
                                return;
                            case -29:
                                i5 = 1;
                                clsArr = null;
                            case -28:
                                i5 = 65;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -27:
                                byte b2 = $$a[23];
                                byte b3 = (byte) (b2 - 1);
                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                c(b3, b3, b2, objArr18);
                                obj = (java.lang.String) objArr18[0];
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj;
                                i2 = 2;
                                try {
                                    setoutlineprovider.values(i2);
                                    i5 = i6;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -26:
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(4);
                                obj = java.lang.Class.forName((java.lang.String) setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl);
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj;
                                i2 = 2;
                                setoutlineprovider.values(i2);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -25:
                                byte b4 = $$a[23];
                                byte b5 = b4;
                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                c(b4, b5, (byte) (b5 - 1), objArr19);
                                obj = (java.lang.String) objArr19[0];
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj;
                                i2 = 2;
                                setoutlineprovider.values(i2);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -24:
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 3;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(4);
                                    java.lang.Object obj3 = setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                    setoutlineprovider.values(4);
                                    java.lang.Object obj4 = setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                    setoutlineprovider.values(4);
                                    try {
                                        java.lang.Object[] objArr20 = {obj4, setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl};
                                        byte[] bArr3 = IccPrivateKeyCrtComponentsJson;
                                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, (short) 28, bArr3[c4], objArr21);
                                        java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr21[0]);
                                        try {
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, bArr3[5], bArr3[26], objArr22);
                                            java.lang.String str5 = (java.lang.String) objArr22[0];
                                            short s3 = bArr3[472];
                                            byte b6 = bArr3[c4];
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, s3, b6, objArr23);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, bArr3[43], (byte) (-bArr3[327]), objArr24);
                                            try {
                                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = cls6.getMethod(str5, java.lang.Class.forName((java.lang.String) objArr23[0]), java.lang.Class.forName((java.lang.String) objArr24[0])).invoke(obj3, objArr20);
                                                i2 = 2;
                                                setoutlineprovider.values(i2);
                                                i5 = i6;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                i = 32;
                                                if (i6 >= i) {
                                                }
                                                throw th;
                                            }
                                        } catch (java.lang.Throwable th4) {
                                            th = th4;
                                            java.lang.Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -23:
                                c = 292;
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 3;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(4);
                                java.lang.Class cls7 = (java.lang.Class) setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                setoutlineprovider.values(4);
                                java.lang.String str6 = (java.lang.String) setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                setoutlineprovider.values(4);
                                method = cls7.getMethod(str6, (java.lang.Class[]) setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl);
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = method;
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -22:
                                c = 292;
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                try {
                                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (short) 307, IccPrivateKeyCrtComponentsJson[c4], objArr25);
                                    method = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                    setoutlineprovider.IccPrivateKeyCrtComponentsJson = method;
                                    i3 = 2;
                                    setoutlineprovider.values(i3);
                                    i5 = i6;
                                } catch (java.lang.Throwable th7) {
                                    th = th7;
                                    i = 32;
                                    if ((i6 >= i || i6 > 50) && (i6 < 50 || i6 > 59)) {
                                        throw th;
                                    }
                                    setoutlineprovider.IccPrivateKeyCrtComponentsJson = th;
                                    setoutlineprovider.values(39);
                                    i5 = 22;
                                    clsArr = null;
                                    c4 = ')';
                                    s2 = 307;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -21:
                                c = 292;
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(13);
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = new java.lang.Class[setoutlineprovider.writeReplace];
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -20:
                                c = 292;
                                obj2 = "valueOf";
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj2;
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                c = 292;
                                obj2 = com.payair.hce.setLongClickable.class;
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj2;
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                c = 292;
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(13);
                                int i7 = setoutlineprovider.writeReplace;
                                byte[] bArr4 = IccPrivateKeyCrtComponentsJson;
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, bArr4[472], bArr4[c4], objArr26);
                                obj2 = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr26[0]), i7);
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj2;
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -17:
                                setoutlineprovider.values(18);
                                throw ((java.lang.Throwable) setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl);
                            case -16:
                                i5 = 30;
                                s2 = 307;
                            case -15:
                                i5 = 28;
                                s2 = 307;
                            case -14:
                                try {
                                    c = 292;
                                    setoutlineprovider.values(16);
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                if (setoutlineprovider.writeReplace == 0) {
                                    i5 = 27;
                                    s2 = 307;
                                }
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -13:
                                c = 292;
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(4);
                                    java.lang.Object obj5 = setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                    try {
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, (short) (-IccPrivateKeyCrtComponentsJson[587]), r6[c4], objArr27);
                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                                        try {
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, (short) (getCvrMaskAnd >>> 2), r6[330], objArr28);
                                            obj2 = cls8.getMethod((java.lang.String) objArr28[0], clsArr).invoke(obj5, clsArr);
                                            setoutlineprovider.IccPrivateKeyCrtComponentsJson = obj2;
                                            i3 = 2;
                                            setoutlineprovider.values(i3);
                                            i5 = i6;
                                        } catch (java.lang.Throwable th9) {
                                            th = th9;
                                            java.lang.Throwable cause2 = th.getCause();
                                            if (cause2 == null) {
                                                throw th;
                                            }
                                            throw cause2;
                                        }
                                    } catch (java.lang.Throwable th10) {
                                        th = th10;
                                    }
                                } catch (java.lang.Throwable th11) {
                                    th = th11;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -12:
                                i5 = 77;
                                s2 = 307;
                            case -11:
                                c = 292;
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(4);
                                    java.lang.Object obj6 = setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl;
                                    try {
                                        byte[] bArr5 = IccPrivateKeyCrtComponentsJson;
                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, (short) 307, bArr5[c4], objArr29);
                                        java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                                        try {
                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, bArr5[358], bArr5[26], objArr30);
                                            invoke = cls9.getMethod((java.lang.String) objArr30[0], clsArr).invoke(obj6, clsArr);
                                            setoutlineprovider.IccPrivateKeyCrtComponentsJson = invoke;
                                            i3 = 2;
                                            setoutlineprovider.values(i3);
                                            i5 = i6;
                                        } catch (java.lang.Throwable th12) {
                                            th = th12;
                                            java.lang.Throwable cause3 = th.getCause();
                                            if (cause3 == null) {
                                                throw th;
                                            }
                                            throw cause3;
                                        }
                                    } catch (java.lang.Throwable th13) {
                                        th = th13;
                                    }
                                } catch (java.lang.Throwable th14) {
                                    th = th14;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -10:
                                c = 292;
                                setoutlineprovider.AlternateContactlessPaymentDataJson = 5;
                                setoutlineprovider.values(3);
                                setoutlineprovider.values(13);
                                int i8 = setoutlineprovider.writeReplace;
                                setoutlineprovider.values(13);
                                int i9 = setoutlineprovider.writeReplace;
                                setoutlineprovider.values(13);
                                int i10 = setoutlineprovider.writeReplace;
                                setoutlineprovider.values(13);
                                byte b7 = (byte) setoutlineprovider.writeReplace;
                                setoutlineprovider.values(13);
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                b(i8, i9, i10, b7, (short) setoutlineprovider.writeReplace, objArr31);
                                invoke = (java.lang.String) objArr31[0];
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = invoke;
                                i3 = 2;
                                setoutlineprovider.values(i3);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -9:
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(13);
                                    try {
                                        objArr = new java.lang.Object[]{java.lang.Integer.valueOf(setoutlineprovider.writeReplace)};
                                        byte[] bArr6 = IccPrivateKeyCrtComponentsJson;
                                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, (short) 97, bArr6[301], objArr32);
                                        cls = java.lang.Class.forName((java.lang.String) objArr32[0]);
                                        objArr2 = new java.lang.Object[1];
                                        c = 292;
                                        try {
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, (short) 76, bArr6[423], objArr2);
                                        } catch (java.lang.Throwable th15) {
                                            th = th15;
                                            java.lang.Throwable cause4 = th.getCause();
                                            if (cause4 == null) {
                                                throw th;
                                            }
                                            throw cause4;
                                        }
                                    } catch (java.lang.Throwable th16) {
                                        th = th16;
                                    }
                                } catch (java.lang.Throwable th17) {
                                    th = th17;
                                    c = 292;
                                }
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls.getMethod((java.lang.String) objArr2[0], java.lang.Integer.TYPE).invoke(clsArr, objArr)).intValue();
                                    setoutlineprovider.values(1);
                                    i5 = i6;
                                } catch (java.lang.Throwable th18) {
                                    th = th18;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -8:
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(7);
                                    try {
                                        java.lang.Object[] objArr33 = {java.lang.Long.valueOf(setoutlineprovider.DigitizedCardProfile)};
                                        short s4 = (short) (getCvrMaskAnd | 23);
                                        byte[] bArr7 = IccPrivateKeyCrtComponentsJson;
                                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                                        a(263, s4, bArr7[301], objArr34);
                                        java.lang.Class<?> cls10 = java.lang.Class.forName((java.lang.String) objArr34[0]);
                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, (short) 118, bArr7[330], objArr35);
                                        setoutlineprovider.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls10.getMethod((java.lang.String) objArr35[0], java.lang.Long.TYPE).invoke(clsArr, objArr33)).intValue();
                                        c = 292;
                                        setoutlineprovider.values(1);
                                        i5 = i6;
                                    } catch (java.lang.Throwable th19) {
                                        java.lang.Throwable cause5 = th19.getCause();
                                        if (cause5 == null) {
                                            throw th19;
                                        }
                                        throw cause5;
                                    }
                                } catch (java.lang.Throwable th20) {
                                    th = th20;
                                    c = 292;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -7:
                                try {
                                    byte[] bArr8 = IccPrivateKeyCrtComponentsJson;
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, (short) 171, bArr8[301], objArr36);
                                    java.lang.Class<?> cls11 = java.lang.Class.forName((java.lang.String) objArr36[0]);
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE, (short) 142, bArr8[330], objArr37);
                                    setoutlineprovider.valueOf = ((java.lang.Long) cls11.getMethod((java.lang.String) objArr37[0], clsArr).invoke(clsArr, clsArr)).longValue();
                                    setoutlineprovider.values(8);
                                    i5 = i6;
                                    clsArr = null;
                                    c4 = ')';
                                    s2 = 307;
                                } catch (java.lang.Throwable th21) {
                                    java.lang.Throwable cause6 = th21.getCause();
                                    if (cause6 == null) {
                                        throw th21;
                                    }
                                    throw cause6;
                                }
                            case -6:
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(7);
                                } catch (java.lang.Throwable th22) {
                                    th = th22;
                                    i = 32;
                                    if (i6 >= i) {
                                        break;
                                    }
                                    throw th;
                                }
                                try {
                                    java.lang.Object[] objArr38 = {java.lang.Long.valueOf(setoutlineprovider.DigitizedCardProfile)};
                                    short s5 = (short) (getCvrMaskAnd | 23);
                                    byte[] bArr9 = IccPrivateKeyCrtComponentsJson;
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    a(263, s5, bArr9[301], objArr39);
                                    java.lang.Class<?> cls12 = java.lang.Class.forName((java.lang.String) objArr39[0]);
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, (short) 191, bArr9[330], objArr40);
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls12.getMethod((java.lang.String) objArr40[0], java.lang.Long.TYPE).invoke(clsArr, objArr38)).intValue();
                                    setoutlineprovider.values(1);
                                    i5 = i6;
                                    clsArr = null;
                                    c4 = ')';
                                    s2 = 307;
                                } catch (java.lang.Throwable th23) {
                                    java.lang.Throwable cause7 = th23.getCause();
                                    if (cause7 == null) {
                                        throw th23;
                                    }
                                    throw cause7;
                                }
                            case -5:
                                c2 = 279;
                                setoutlineprovider.AlternateContactlessPaymentDataJson = -704320125;
                                setoutlineprovider.values(1);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -4:
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = 1;
                                    setoutlineprovider.values(3);
                                    setoutlineprovider.values(4);
                                    try {
                                        objArr3 = new java.lang.Object[]{setoutlineprovider.SdkCoreAlternateContactlessPaymentDataImpl};
                                        byte[] bArr10 = IccPrivateKeyCrtComponentsJson;
                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                        a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, (short) 259, bArr10[301], objArr41);
                                        cls2 = java.lang.Class.forName((java.lang.String) objArr41[0]);
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        c2 = 279;
                                        try {
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, (short) (getCvrMaskAnd | 39), bArr10[29], objArr42);
                                            str = (java.lang.String) objArr42[0];
                                            objArr4 = new java.lang.Object[1];
                                            a(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE, s2, bArr10[c4], objArr4);
                                        } catch (java.lang.Throwable th24) {
                                            th = th24;
                                            java.lang.Throwable cause8 = th.getCause();
                                            if (cause8 == null) {
                                                throw th;
                                            }
                                            throw cause8;
                                        }
                                    } catch (java.lang.Throwable th25) {
                                        th = th25;
                                    }
                                } catch (java.lang.Throwable th26) {
                                    th = th26;
                                    c2 = 279;
                                }
                                try {
                                    setoutlineprovider.AlternateContactlessPaymentDataJson = ((java.lang.Integer) cls2.getMethod(str, java.lang.Class.forName((java.lang.String) objArr4[0])).invoke(clsArr, objArr3)).intValue();
                                    setoutlineprovider.values(1);
                                    i5 = i6;
                                } catch (java.lang.Throwable th27) {
                                    th = th27;
                                    i = 32;
                                    if (i6 >= i) {
                                    }
                                    throw th;
                                }
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                                break;
                            case -3:
                                setoutlineprovider.IccPrivateKeyCrtComponentsJson = "";
                                i2 = 2;
                                setoutlineprovider.values(i2);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -2:
                                setoutlineprovider.AlternateContactlessPaymentDataJson = -513178693;
                                setoutlineprovider.values(1);
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                            case -1:
                                i5 = 59;
                            default:
                                i5 = i6;
                                clsArr = null;
                                c4 = ')';
                                s2 = 307;
                        }
                    }
                } catch (java.lang.Throwable th28) {
                    java.lang.Throwable cause9 = th28.getCause();
                    if (cause9 == null) {
                        throw th28;
                    }
                    throw cause9;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
                int i3;
                int i4;
                byte[] bArr = IccPrivateKeyCrtComponentsJson;
                int i5 = 296 - i;
                int i6 = 606 - s;
                int i7 = 118 - i2;
                byte[] bArr2 = new byte[i5];
                if (bArr == null) {
                    int i8 = i5;
                    i4 = 0;
                    i6++;
                    i7 += -i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i4 == i5) {
                        objArr[0] = new java.lang.String(bArr2, 0);
                        return;
                    }
                    i8 = bArr[i6];
                    i6++;
                    i7 += -i8;
                    i3 = i4;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i4 == i5) {
                    }
                } else {
                    i3 = 0;
                    i4 = i3 + 1;
                    bArr2[i3] = (byte) i7;
                    if (i4 == i5) {
                    }
                }
            }

            static void init$1() {
                $$d = new byte[]{92, 89, -124, 123};
                $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
            }

            static void writeReplace() {
                byte[] bArr = new byte[624];
                java.lang.System.arraycopy("&¥xcü\u0005ÿû\u0006ÿú\u0007ÿù\b÷\tÿø\tö\nÿ÷\nó\rÿö\u000bö\nû\u0001\u0004÷\tö\nÿõ\fû\u0000\u0005ûÿ\u0006ÿô\rûý\bÿü\u0001\u0004ÿü\u0000\u0005ÿüÿ\u0006ûü\tÿüþ\u0007ûü\tÿüý\bÿüü\tÿüû\nûú\u000bÿüú\u000bûø\rÿüú\u000bú\u0002\u0004ÿüù\fú\u0001\u0005ú\u0000\u0006úÿ\u0007ÿüø\rÿû\u0002\u0004ú\u0002\u0004ÿû\u0001\u0005ûü\tûÿ\u0006ÿû\u0000\u0006úÿ\u0007ÿûÿ\u0007úþ\búý\tÿûþ\bûø\rÿûý\tÿûü\nÿûû\u000búü\nÿûÿ\u0007úû\u000bÿûþ\bûø\rÿûú\fúú\fúú\fúù\rÿûù\rù\u0003\u0004ÿú\u0003\u0004ÿú\u0002\u0005ù\u0002\u0005ù\u0001\u0006ù\u0000\u0007ùÿ\bÿú\u0001\u0006úú\fùÿ\bÿú\u0000\u0007ÿúÿ\bÿúþ\tÿúþ\tÿú\u0002\u0005ùý\nùü\u000bùû\fùÿ\bÿú\u0001\u0006úú\fùÿ\bÿúý\nÿúü\u000bÿúû\fÿúû\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010ó\nò\u0003\u0006\u00056¸\r\u0004îIãæì4Ï\u0011÷ú\u0006ì6Ô\u000bÿ\u001fÔ\u0003\u0002\u001aß\u0002\tû\u0007ó\nò\u0003\u0006\u00056·\u000e\u0005ý\u0002ñFéÍ\b\u000fó\n\u0003ÿö\u0007\u0019ãöÿ\u001eí\u0004î\u0002ñ$ïþø\u0006\u0001\u0014áü\nõ\u000bú\u0001\u001aÛ\t\u000bó\nò\u0003\u0006\u00056¸\r\u0004îIØí\u0004î4Ô\u0001\bý\u0002ò\u0003\u0011í\u000bú\u0001\u0002ñ-Ûý\r\u0001õ+Þï\u000bú\u0001#æì%ëü\böú\u0001\u0002ñ$ïþø\u0006\u0001\u0014áü\nõ\u000bú\u0001'Õ\u0003ú\u0005ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ûú\u000fó\u0004\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ1âì\u0002\u000e\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bûø\u0007\u0004\u0006\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9".getBytes("ISO-8859-1"), 0, bArr, 0, 624);
                IccPrivateKeyCrtComponentsJson = bArr;
                getCvrMaskAnd = 200;
            }

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                writeReplace();
                SdkCoreAlternateContactlessPaymentDataImpl = 0;
                RecordsJson = 1;
                valueOf = 922690519;
                values = 520368634;
                AlternateContactlessPaymentDataJson = 26365395;
                getProfileVersion = new byte[]{com.google.common.base.Ascii.EM, -87, -86};
            }

            static void init$0() {
                $$a = new byte[]{63, 105, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, com.google.common.base.Ascii.SUB, -12, 2, 63, -66, com.google.common.base.Ascii.SI, -24, com.google.common.base.Ascii.CAN, -8, -9, 68, -58, 5, -2, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -69, 14, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -44, 1, -6, com.google.common.base.Ascii.SI, -19, 4, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -41, 3, 6, -8, 10, -1, -10, 7, com.google.common.base.Ascii.NAK, -11, -9, 16, com.google.common.base.Ascii.SYN, -23};
                $$b = 192;
            }
        });
        values = (writeReplace + 103) % 128;
        return createListenableFuture;
    }

    @Override // com.payair.hce.PayairUserDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> deleteAll() {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new com.payair.hce.PayairUserDataDao_Impl.AnonymousClass8());
        int i = values;
        int i2 = (i & 117) + (i | 117);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            return createListenableFuture;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.PayairUserDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setPointerIcon>> getAll() {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM payairUserData", 0);
        final android.os.CancellationSignal createCancellationSignal = androidx.room.util.DBUtil.createCancellationSignal();
        com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setPointerIcon>> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, false, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.util.List<com.payair.hce.setPointerIcon>>() { // from class: com.payair.hce.PayairUserDataDao_Impl.10
            private static int valueOf = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                if (((i * (-963)) - 964) + (i2 * 965) + (((~i) | (~(i4 | i3))) * (-964)) + (((~(i | i4)) | (~((~i3) | i4))) * (-964)) != 1) {
                    return DigitizedCardProfile(objArr);
                }
                com.payair.hce.PayairUserDataDao_Impl.AnonymousClass10 anonymousClass10 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass10) objArr[0];
                int i5 = valueOf;
                int i6 = i5 | 53;
                values = (((i6 << 1) - (~(-((~(i5 & 53)) & i6)))) - 1) % 128;
                java.util.List list = (java.util.List) values(new java.lang.Object[]{anonymousClass10}, 525692474, -525692474, java.lang.System.identityHashCode(anonymousClass10));
                valueOf = (values + 119) % 128;
                return list;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                java.lang.String string;
                java.lang.String string2;
                java.lang.String string3;
                java.lang.String string4;
                java.lang.String string5;
                java.lang.String string6;
                java.lang.String string7;
                java.lang.String str;
                java.lang.String string8;
                java.lang.String string9;
                java.lang.String string10;
                com.payair.hce.PayairUserDataDao_Impl.AnonymousClass10 anonymousClass10 = (com.payair.hce.PayairUserDataDao_Impl.AnonymousClass10) objArr[0];
                android.database.Cursor query = androidx.room.util.DBUtil.query(com.payair.hce.PayairUserDataDao_Impl.this.__db, acquire, false, createCancellationSignal);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "personId");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "km");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "kd");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY);
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "languageId");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "version");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "msisdn");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "btMacId");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "btServerPort");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "privateSshKey");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "serverAddress");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "screenWidth");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "screenHeight");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "userCountry");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "appVersion");
                    int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "sdkVersion");
                    int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "mpWalletId");
                    int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "bankApplicationId");
                    int i = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                    int i2 = valueOf;
                    values = ((i2 & 33) + (i2 | 33)) % 128;
                    while (true) {
                        java.util.ArrayList arrayList2 = arrayList;
                        if (!query.moveToNext()) {
                            query.close();
                            int i3 = values;
                            int i4 = (i3 & (-52)) | ((~i3) & 51);
                            int i5 = (i3 & 51) << 1;
                            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                            valueOf = i6 % 128;
                            if (i6 % 2 != 0) {
                                return arrayList2;
                            }
                            throw new java.lang.ArithmeticException();
                        }
                        com.payair.hce.setPointerIcon setpointericon = new com.payair.hce.setPointerIcon();
                        int i7 = columnIndexOrThrow;
                        int i8 = columnIndexOrThrow13;
                        int i9 = columnIndexOrThrow12;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(query.getLong(columnIndexOrThrow))}, -1124132126, 1124132161, java.lang.System.identityHashCode(setpointericon));
                        if (query.isNull(columnIndexOrThrow2)) {
                            int i10 = valueOf;
                            int i11 = ((i10 | 33) << 1) - (i10 ^ 33);
                            values = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow2);
                            int i12 = values;
                            int i13 = i12 & 47;
                            int i14 = (~i13) & (i12 | 47);
                            int i15 = i13 << 1;
                            valueOf = ((i14 & i15) + (i14 | i15)) % 128;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string}, 65265109, -65265079, java.lang.System.identityHashCode(setpointericon));
                        if (query.isNull(columnIndexOrThrow3)) {
                            int i16 = valueOf;
                            int i17 = i16 & 69;
                            int i18 = -(-((i16 ^ 69) | i17));
                            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                            values = i19 % 128;
                            if (i19 % 2 != 0) {
                                throw null;
                            }
                            string2 = null;
                        } else {
                            string2 = query.getString(columnIndexOrThrow3);
                            values = (valueOf + 59) % 128;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string2}, -818506302, 818506339, java.lang.System.identityHashCode(setpointericon));
                        int i20 = query.getInt(columnIndexOrThrow4);
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i20)}, -7790155, 7790172, i20);
                        int i21 = query.getInt(columnIndexOrThrow5);
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i21)}, -383060247, 383060249, i21);
                        if (query.isNull(columnIndexOrThrow6)) {
                            int i22 = values;
                            int i23 = i22 ^ 105;
                            int i24 = (i22 & 105) << 1;
                            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                            valueOf = i25 % 128;
                            if (i25 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            string3 = null;
                        } else {
                            string3 = query.getString(columnIndexOrThrow6);
                            int i26 = valueOf;
                            values = (((i26 & (-94)) | ((~i26) & 93)) + ((i26 & 93) << 1)) % 128;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string3}, -458764128, 458764151, java.lang.System.identityHashCode(setpointericon));
                        if (query.isNull(columnIndexOrThrow7)) {
                            int i27 = valueOf + 57;
                            values = i27 % 128;
                            if (i27 % 2 != 0) {
                                throw null;
                            }
                            string4 = null;
                        } else {
                            string4 = query.getString(columnIndexOrThrow7);
                            int i28 = values;
                            int i29 = (i28 & (-40)) | ((~i28) & 39);
                            int i30 = (i28 & 39) << 1;
                            valueOf = ((i29 ^ i30) + ((i30 & i29) << 1)) % 128;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string4}, -90143811, 90143811, java.lang.System.identityHashCode(setpointericon));
                        if (query.isNull(columnIndexOrThrow8)) {
                            int i31 = values;
                            int i32 = ((i31 | 105) << 1) - (i31 ^ 105);
                            valueOf = i32 % 128;
                            if (i32 % 2 == 0) {
                                throw new java.lang.ArithmeticException();
                            }
                            string5 = null;
                        } else {
                            string5 = query.getString(columnIndexOrThrow8);
                            int i33 = values + 105;
                            valueOf = i33 % 128;
                            int i34 = i33 % 2;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string5}, -1506935454, 1506935464, java.lang.System.identityHashCode(setpointericon));
                        int i35 = query.getInt(columnIndexOrThrow9);
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i35)}, 618140867, -618140845, i35);
                        if (query.isNull(columnIndexOrThrow10)) {
                            int i36 = valueOf;
                            int i37 = i36 & 59;
                            int i38 = -(-(i36 | 59));
                            int i39 = (i37 & i38) + (i37 | i38);
                            values = i39 % 128;
                            if (i39 % 2 != 0) {
                                throw null;
                            }
                            int i40 = i36 & 67;
                            int i41 = i36 | 67;
                            values = ((i40 & i41) + (i41 | i40)) % 128;
                            string6 = null;
                        } else {
                            string6 = query.getString(columnIndexOrThrow10);
                            int i42 = values;
                            int i43 = (i42 | 111) << 1;
                            int i44 = -(i42 ^ 111);
                            valueOf = ((i43 & i44) + (i44 | i43)) % 128;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string6}, 461600393, -461600357, java.lang.System.identityHashCode(setpointericon));
                        if (query.isNull(columnIndexOrThrow11)) {
                            int i45 = valueOf;
                            int i46 = ((((i45 | 42) << 1) - (i45 ^ 42)) - 1) % 128;
                            values = i46;
                            int i47 = i46 & 33;
                            int i48 = (i46 ^ 33) | i47;
                            valueOf = (((i47 | i48) << 1) - (i47 ^ i48)) % 128;
                            string7 = null;
                        } else {
                            string7 = query.getString(columnIndexOrThrow11);
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string7}, 1364001918, -1364001909, java.lang.System.identityHashCode(setpointericon));
                        int i49 = query.getInt(i9);
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i49)}, 1950333970, -1950333969, i49);
                        int i50 = query.getInt(i8);
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Integer.valueOf(i50)}, 100140492, -100140478, i50);
                        int i51 = i;
                        if (query.isNull(i51)) {
                            int i52 = valueOf;
                            int i53 = i52 & 111;
                            values = (i53 + ((i52 ^ 111) | i53)) % 128;
                            int i54 = i52 & 115;
                            values = (((((i52 ^ 115) | i54) << 1) - (~(-((i52 | 115) & (~i54))))) - 1) % 128;
                            i = i51;
                            str = null;
                        } else {
                            java.lang.String string11 = query.getString(i51);
                            int i55 = valueOf;
                            int i56 = i55 & 1;
                            i = i51;
                            values = (((~i56) & (i55 | 1)) + (i56 << 1)) % 128;
                            str = string11;
                        }
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, str}, -779281337, 779281353, java.lang.System.identityHashCode(setpointericon));
                        int i57 = columnIndexOrThrow15;
                        if (query.isNull(i57)) {
                            int i58 = valueOf;
                            int i59 = ((((i58 ^ 111) | (i58 & 111)) << 1) - (~(-(((~i58) & 111) | (i58 & (-112)))))) - 1;
                            values = i59 % 128;
                            if (i59 % 2 != 0) {
                                throw null;
                            }
                            int i60 = i58 ^ 61;
                            values = (((((i58 & 61) | i60) << 1) - (~(-i60))) - 1) % 128;
                            string8 = null;
                        } else {
                            string8 = query.getString(i57);
                        }
                        columnIndexOrThrow15 = i57;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string8}, -363999224, 363999255, java.lang.System.identityHashCode(setpointericon));
                        int i61 = columnIndexOrThrow16;
                        if (query.isNull(i61)) {
                            int i62 = valueOf;
                            int i63 = ((i62 & 76) + (i62 | 76)) - 1;
                            int i64 = i63 % 128;
                            values = i64;
                            if (i63 % 2 != 0) {
                                throw new java.lang.NullPointerException();
                            }
                            int i65 = (((i64 | 114) << 1) - (i64 ^ 114)) - 1;
                            valueOf = i65 % 128;
                            if (i65 % 2 == 0) {
                                int i66 = 2 / 4;
                            }
                            string9 = null;
                        } else {
                            string9 = query.getString(i61);
                        }
                        columnIndexOrThrow16 = i61;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string9}, 1261895947, -1261895935, java.lang.System.identityHashCode(setpointericon));
                        int i67 = columnIndexOrThrow17;
                        columnIndexOrThrow17 = i67;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, java.lang.Long.valueOf(query.getLong(i67))}, -320800811, 320800831, java.lang.System.identityHashCode(setpointericon));
                        int i68 = columnIndexOrThrow18;
                        if (query.isNull(i68)) {
                            int i69 = valueOf;
                            int i70 = i69 & 71;
                            values = (i70 + ((i69 ^ 71) | i70)) % 128;
                            int i71 = i69 | 41;
                            int i72 = i71 << 1;
                            int i73 = -((~(i69 & 41)) & i71);
                            values = ((i72 & i73) + (i73 | i72)) % 128;
                            string10 = null;
                        } else {
                            string10 = query.getString(i68);
                        }
                        columnIndexOrThrow18 = i68;
                        com.payair.hce.setPointerIcon.values(new java.lang.Object[]{setpointericon, string10}, -1972616230, 1972616243, java.lang.System.identityHashCode(setpointericon));
                        arrayList = arrayList2;
                        arrayList.add(setpointericon);
                        int i74 = values;
                        int i75 = i74 & 57;
                        int i76 = (i74 | 57) & (~i75);
                        int i77 = i75 << 1;
                        valueOf = ((i76 ^ i77) + ((i76 & i77) << 1)) % 128;
                        columnIndexOrThrow13 = i8;
                        columnIndexOrThrow = i7;
                        columnIndexOrThrow12 = i9;
                    }
                } catch (java.lang.Throwable th) {
                    query.close();
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<com.payair.hce.setPointerIcon>] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.util.List<com.payair.hce.setPointerIcon> call() throws java.lang.Exception {
                ?? values2 = values(new java.lang.Object[]{this}, 1214598958, -1214598957, java.lang.System.identityHashCode(this));
                return values2;
            }

            private java.util.List<com.payair.hce.setPointerIcon> valueOf() throws java.lang.Exception {
                return (java.util.List) values(new java.lang.Object[]{this}, 525692474, -525692474, java.lang.System.identityHashCode(this));
            }
        }, acquire, true, createCancellationSignal);
        int i = values;
        int i2 = i & 81;
        int i3 = -(-((i ^ 81) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        writeReplace = i4 % 128;
        if (i4 % 2 != 0) {
            return createListenableFuture;
        }
        throw null;
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        int i = writeReplace;
        int i2 = i & 29;
        int i3 = -(-((i ^ 29) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return java.util.Collections.emptyList();
        }
        java.util.Collections.emptyList();
        throw null;
    }
}
