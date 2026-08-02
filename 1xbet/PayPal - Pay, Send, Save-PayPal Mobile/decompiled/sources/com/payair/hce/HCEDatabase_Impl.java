package com.payair.hce;

/* loaded from: classes10.dex */
public final class HCEDatabase_Impl extends com.payair.hce.HCEDatabase {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int writeReplace = 1;
    private volatile com.payair.hce.PayairUserDataDao _payairUserDataDao;
    private volatile com.payair.hce.SignDataDao _signDataDao;
    private volatile com.payair.hce.TemporaryDataDao _temporaryDataDao;
    private volatile com.payair.hce.WalletCardIDAndTokenDataDao _walletCardIDAndTokenDataDao;

    static /* synthetic */ java.util.List access$000(com.payair.hce.HCEDatabase_Impl hCEDatabase_Impl) {
        writeReplace = (AlternateContactlessPaymentDataJson + 73) % 128;
        java.util.List<? extends androidx.room.RoomDatabase.Callback> list = hCEDatabase_Impl.mCallbacks;
        int i = writeReplace;
        int i2 = i & 73;
        int i3 = -(-((i ^ 73) | i2));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AlternateContactlessPaymentDataJson = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static /* synthetic */ java.util.List access$100(com.payair.hce.HCEDatabase_Impl hCEDatabase_Impl) {
        int i = writeReplace;
        int i2 = i & 61;
        int i3 = (i ^ 61) | i2;
        AlternateContactlessPaymentDataJson = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        java.util.List<? extends androidx.room.RoomDatabase.Callback> list = hCEDatabase_Impl.mCallbacks;
        int i4 = writeReplace;
        int i5 = ((i4 | 88) << 1) - (i4 ^ 88);
        AlternateContactlessPaymentDataJson = ((~i5) + (i5 << 1)) % 128;
        return list;
    }

    static /* synthetic */ androidx.database.db.SupportSQLiteDatabase access$202(com.payair.hce.HCEDatabase_Impl hCEDatabase_Impl, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = (((i & (-50)) | ((~i) & 49)) + ((i & 49) << 1)) % 128;
        hCEDatabase_Impl.mDatabase = supportSQLiteDatabase;
        int i2 = writeReplace;
        int i3 = ((i2 ^ 87) | (i2 & 87)) << 1;
        int i4 = -((i2 & (-88)) | ((~i2) & 87));
        AlternateContactlessPaymentDataJson = ((i3 & i4) + (i4 | i3)) % 128;
        return supportSQLiteDatabase;
    }

    static /* synthetic */ void access$300(com.payair.hce.HCEDatabase_Impl hCEDatabase_Impl, androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = ((i ^ 7) + ((i & 7) << 1)) % 128;
        hCEDatabase_Impl.internalInitInvalidationTracker(supportSQLiteDatabase);
        int i2 = writeReplace;
        int i3 = ((i2 & (-32)) | ((~i2) & 31)) + ((i2 & 31) << 1);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ java.util.List access$400(com.payair.hce.HCEDatabase_Impl hCEDatabase_Impl) {
        java.util.List<? extends androidx.room.RoomDatabase.Callback> list = hCEDatabase_Impl.mCallbacks;
        int i = writeReplace;
        int i2 = i & 5;
        int i3 = ((((i ^ 5) | i2) << 1) - (~(-((i | 5) & (~i2))))) - 1;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return list;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.database.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration) {
        androidx.database.db.SupportSQLiteOpenHelper create = databaseConfiguration.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new androidx.room.RoomOpenHelper(databaseConfiguration, new androidx.room.RoomOpenHelper.Delegate() { // from class: com.payair.hce.HCEDatabase_Impl.1
            private static int values = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                int i6 = i5 | i;
                switch ((i * 1773) + (i2 * (-885)) + (((~(i3 | i4)) | (~((~i) | i4)) | (~(i6 | i2))) * 886) + ((i | (~(i2 | i5))) * (-1772)) + ((~i6) * 886)) {
                    case 1:
                        return values(objArr);
                    case 2:
                        return writeReplace(objArr);
                    case 3:
                        return valueOf(objArr);
                    case 4:
                        return DigitizedCardProfile(objArr);
                    case 5:
                        androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                        int i7 = writeReplace;
                        int i8 = i7 ^ 99;
                        int i9 = ((i7 & 99) | i8) << 1;
                        int i10 = -i8;
                        values = ((i9 & i10) + (i9 | i10)) % 128;
                        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `payairUserData` (`personId` INTEGER NOT NULL, `km` TEXT, `kd` TEXT, `applicationId` INTEGER NOT NULL, `languageId` INTEGER NOT NULL, `version` TEXT, `msisdn` TEXT, `btMacId` TEXT, `btServerPort` INTEGER NOT NULL, `privateSshKey` TEXT, `serverAddress` TEXT, `screenWidth` INTEGER NOT NULL, `screenHeight` INTEGER NOT NULL, `userCountry` TEXT, `appVersion` TEXT, `sdkVersion` TEXT, `mpWalletId` INTEGER NOT NULL, `bankApplicationId` TEXT, PRIMARY KEY(`personId`))");
                        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `temporaryData` (`id` INTEGER NOT NULL, `authenticationReference` TEXT, `authenticationReferenceForCheckout` TEXT, PRIMARY KEY(`id`))");
                        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `walletCardIDAndTokenData` (`id` INTEGER NOT NULL, `walletCardID` INTEGER, `tokenID` INTEGER, `tokenUniqueReference` TEXT, `tokenStatus` TEXT, PRIMARY KEY(`id`))");
                        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `signData` (`signId` INTEGER NOT NULL, `data` TEXT, `timestamp` TEXT, `keyType` TEXT, `base64Signature` TEXT, PRIMARY KEY(`signId`))");
                        supportSQLiteDatabase.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
                        supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5e01b3e609f0db71f4957adb2dd17de6')");
                        int i11 = writeReplace;
                        values = (((i11 & (-30)) | ((~i11) & 29)) + ((i11 & 29) << 1)) % 128;
                        return null;
                    case 6:
                        return AlternateContactlessPaymentDataJson(objArr);
                    default:
                        int i12 = values;
                        int i13 = i12 & 111;
                        int i14 = (i12 ^ 111) | i13;
                        writeReplace = ((i13 & i14) + (i14 | i13)) % 128;
                        return null;
                }
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                com.payair.hce.HCEDatabase_Impl.AnonymousClass1 anonymousClass1 = (com.payair.hce.HCEDatabase_Impl.AnonymousClass1) objArr[0];
                androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                int i = writeReplace;
                int i2 = i & 59;
                int i3 = (i ^ 59) | i2;
                values = ((i2 & i3) + (i3 | i2)) % 128;
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `payairUserData`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `temporaryData`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `walletCardIDAndTokenData`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `signData`");
                java.util.List access$000 = com.payair.hce.HCEDatabase_Impl.access$000(com.payair.hce.HCEDatabase_Impl.this);
                if (access$000 != null) {
                    int i4 = writeReplace + 25;
                    values = i4 % 128;
                    if (i4 % 2 == 0) {
                        java.util.Iterator it = access$000.iterator();
                        while (it.hasNext()) {
                            int i5 = writeReplace;
                            int i6 = (i5 & (-98)) | ((~i5) & 97);
                            int i7 = -(-((i5 & 97) << 1));
                            int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                            values = i8 % 128;
                            if (i8 % 2 == 0) {
                                ((androidx.room.RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                                int i9 = writeReplace;
                                int i10 = i9 & 47;
                                int i11 = (i9 | 47) & (~i10);
                                int i12 = i10 << 1;
                                int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
                                values = i13 % 128;
                                int i14 = i13 % 2;
                            } else {
                                ((androidx.room.RoomDatabase.Callback) it.next()).onDestructiveMigration(supportSQLiteDatabase);
                                throw null;
                            }
                        }
                    } else {
                        access$000.iterator();
                        throw null;
                    }
                }
                int i15 = writeReplace;
                int i16 = i15 & 65;
                int i17 = -(-(i15 | 65));
                values = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.HCEDatabase_Impl.AnonymousClass1 anonymousClass1 = (com.payair.hce.HCEDatabase_Impl.AnonymousClass1) objArr[0];
                androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                int i = values;
                int i2 = i & 119;
                int i3 = ((i ^ 119) | i2) << 1;
                int i4 = -((i | 119) & (~i2));
                int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
                writeReplace = i5 % 128;
                if (i5 % 2 == 0) {
                    com.payair.hce.HCEDatabase_Impl.access$100(com.payair.hce.HCEDatabase_Impl.this);
                    throw null;
                }
                java.util.List access$100 = com.payair.hce.HCEDatabase_Impl.access$100(com.payair.hce.HCEDatabase_Impl.this);
                if (access$100 != null) {
                    java.util.Iterator it = access$100.iterator();
                    int i6 = writeReplace;
                    int i7 = i6 & 27;
                    int i8 = -(-(i6 | 27));
                    values = (((i7 | i8) << 1) - (i8 ^ i7)) % 128;
                    while (it.hasNext()) {
                        int i9 = writeReplace;
                        int i10 = (i9 & 8) + (i9 | 8);
                        int i11 = (~i10) + (i10 << 1);
                        values = i11 % 128;
                        if (i11 % 2 != 0) {
                            ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                            throw null;
                        }
                        ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(supportSQLiteDatabase);
                        int i12 = values;
                        int i13 = i12 & 31;
                        writeReplace = (i13 + ((i12 ^ 31) | i13)) % 128;
                    }
                }
                int i14 = values;
                writeReplace = (((i14 & 60) + (i14 | 60)) - 1) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.HCEDatabase_Impl.AnonymousClass1 anonymousClass1 = (com.payair.hce.HCEDatabase_Impl.AnonymousClass1) objArr[0];
                androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                int identityHashCode = java.lang.System.identityHashCode(anonymousClass1);
                int i = ~identityHashCode;
                int i2 = (1953953471 & i) | ((-1953953472) & identityHashCode) | (identityHashCode & 1953953471);
                int i3 = ~i2;
                int i4 = (i2 | i3) & i3;
                int i5 = identityHashCode & (-70665253);
                int i6 = ((-70665253) | identityHashCode) & (~i5);
                int i7 = ~((i6 ^ i5) | (i6 & i5));
                int i8 = ((i4 ^ i7) | (i4 & i7)) * 69;
                int i9 = (i8 | 141248184) << 1;
                int i10 = -(((~i8) & 141248184) | ((-141248185) & i8));
                int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                int i12 = (i & 1681319605) | ((-1681319606) & identityHashCode);
                int i13 = 1681319605 & identityHashCode;
                int i14 = ~((i13 ^ i12) | (i13 & i12));
                int i15 = i14 & 272633866;
                int i16 = (i14 | 272633866) & (~i15);
                int i17 = (i16 ^ i15) | (i16 & i15);
                int i18 = (i & (-343299119)) | (343299118 & identityHashCode);
                int i19 = identityHashCode & (-343299119);
                int i20 = (i19 ^ i18) | (i19 & i18);
                int i21 = ~i20;
                int i22 = (i20 | i21) & i21;
                int i23 = i17 ^ i22;
                int i24 = i22 & i17;
                int i25 = -(~(-(-(((i24 ^ i23) | (i24 & i23)) * (-69)))));
                int i26 = ((i11 ^ i25) + ((i25 & i11) << 1)) - 1;
                int i27 = i26 & (-533999339);
                int i28 = -(-(((-533999339) ^ i26) | i27));
                int identityHashCode2 = java.lang.System.identityHashCode(anonymousClass1);
                int i29 = ~identityHashCode2;
                int i30 = ((~i29) & 1820975614) | (i29 & (-1820975615));
                int i31 = 1820975614 & i29;
                int i32 = ~((i30 ^ i31) | (i30 & i31));
                int i33 = identityHashCode2 & (-1275699609);
                int i34 = ((-1275699609) | identityHashCode2) & (~i33);
                int i35 = (i34 ^ i33) | (i34 & i33);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                int i38 = i32 & i37;
                int i39 = (i32 | i37) & (~i38);
                int i40 = ((i39 ^ i38) | (i39 & i38)) * (-831);
                int i41 = i40 & (-276932274);
                int i42 = (i41 - (~((i40 ^ (-276932274)) | i41))) - 1;
                int i43 = (i29 & (-52562945)) | (52562944 & identityHashCode2);
                int i44 = (-52562945) & identityHashCode2;
                int i45 = -(-((~((i44 ^ i43) | (i44 & i43))) * (-1662)));
                int i46 = i29 & (i29 | identityHashCode2);
                int i47 = ~((i46 ^ 1328262552) | (i46 & 1328262552));
                int i48 = identityHashCode2 & (-1328262553);
                int i49 = ((-1328262553) | identityHashCode2) & (~i48);
                int i50 = ~((i49 ^ i48) | (i49 & i48));
                int i51 = (i47 ^ i50) | (i47 & i50);
                int i52 = identityHashCode2 & (-1820975615);
                int i53 = (identityHashCode2 | (-1820975615)) & (~i52);
                int i54 = ~((i53 ^ i52) | (i53 & i52));
                int i55 = i51 ^ i54;
                int i56 = i54 & i51;
                if ((i27 & i28) + (i28 | i27) > (-2) - (~((((((i42 ^ i45) | (i42 & i45)) << 1) - (((~i42) & i45) | ((~i45) & i42))) - (~(-(~(((i56 ^ i55) | (i56 & i55)) * 831))))) - 1))) {
                    com.payair.hce.HCEDatabase_Impl.access$202(com.payair.hce.HCEDatabase_Impl.this, supportSQLiteDatabase);
                    com.payair.hce.HCEDatabase_Impl.access$300(com.payair.hce.HCEDatabase_Impl.this, supportSQLiteDatabase);
                    com.payair.hce.HCEDatabase_Impl.access$400(com.payair.hce.HCEDatabase_Impl.this);
                    throw null;
                }
                com.payair.hce.HCEDatabase_Impl.access$202(com.payair.hce.HCEDatabase_Impl.this, supportSQLiteDatabase);
                com.payair.hce.HCEDatabase_Impl.access$300(com.payair.hce.HCEDatabase_Impl.this, supportSQLiteDatabase);
                java.util.List access$400 = com.payair.hce.HCEDatabase_Impl.access$400(com.payair.hce.HCEDatabase_Impl.this);
                if (access$400 != null) {
                    int i57 = writeReplace;
                    values = (((i57 ^ 21) - (~((i57 & 21) << 1))) - 1) % 128;
                    java.util.Iterator it = access$400.iterator();
                    int i58 = writeReplace;
                    int i59 = i58 & 5;
                    int i60 = -(-((i58 ^ 5) | i59));
                    values = ((i59 & i60) + (i60 | i59)) % 128;
                    while (it.hasNext()) {
                        int i61 = values;
                        int i62 = i61 ^ 13;
                        int i63 = -(-((i61 & 13) << 1));
                        writeReplace = (((i62 | i63) << 1) - (i63 ^ i62)) % 128;
                        ((androidx.room.RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                        int i64 = values;
                        int i65 = i64 & 113;
                        writeReplace = ((i65 - (~(-(-((i64 ^ 113) | i65))))) - 1) % 128;
                    }
                }
                int i66 = writeReplace;
                int i67 = i66 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                int i68 = -(-((i66 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i67));
                int i69 = (i67 & i68) + (i68 | i67);
                values = i69 % 128;
                if (i69 % 2 == 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                int i = values;
                int i2 = i & 43;
                int i3 = ((i | 43) & (~i2)) + (i2 << 1);
                writeReplace = i3 % 128;
                if (i3 % 2 != 0) {
                    androidx.room.util.DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                    return null;
                }
                androidx.room.util.DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
                throw null;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
                java.util.HashMap hashMap = new java.util.HashMap(18);
                hashMap.put("personId", new androidx.room.util.TableInfo.Column("personId", "INTEGER", true, 1, null, 1));
                hashMap.put("km", new androidx.room.util.TableInfo.Column("km", "TEXT", false, 0, null, 1));
                hashMap.put("kd", new androidx.room.util.TableInfo.Column("kd", "TEXT", false, 0, null, 1));
                hashMap.put(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, new androidx.room.util.TableInfo.Column(com.datadog.android.sessionreplay.internal.processor.EnrichedResource.APPLICATION_ID_KEY, "INTEGER", true, 0, null, 1));
                hashMap.put("languageId", new androidx.room.util.TableInfo.Column("languageId", "INTEGER", true, 0, null, 1));
                hashMap.put("version", new androidx.room.util.TableInfo.Column("version", "TEXT", false, 0, null, 1));
                hashMap.put("msisdn", new androidx.room.util.TableInfo.Column("msisdn", "TEXT", false, 0, null, 1));
                hashMap.put("btMacId", new androidx.room.util.TableInfo.Column("btMacId", "TEXT", false, 0, null, 1));
                hashMap.put("btServerPort", new androidx.room.util.TableInfo.Column("btServerPort", "INTEGER", true, 0, null, 1));
                hashMap.put("privateSshKey", new androidx.room.util.TableInfo.Column("privateSshKey", "TEXT", false, 0, null, 1));
                hashMap.put("serverAddress", new androidx.room.util.TableInfo.Column("serverAddress", "TEXT", false, 0, null, 1));
                hashMap.put("screenWidth", new androidx.room.util.TableInfo.Column("screenWidth", "INTEGER", true, 0, null, 1));
                hashMap.put("screenHeight", new androidx.room.util.TableInfo.Column("screenHeight", "INTEGER", true, 0, null, 1));
                hashMap.put("userCountry", new androidx.room.util.TableInfo.Column("userCountry", "TEXT", false, 0, null, 1));
                hashMap.put("appVersion", new androidx.room.util.TableInfo.Column("appVersion", "TEXT", false, 0, null, 1));
                hashMap.put("sdkVersion", new androidx.room.util.TableInfo.Column("sdkVersion", "TEXT", false, 0, null, 1));
                hashMap.put("mpWalletId", new androidx.room.util.TableInfo.Column("mpWalletId", "INTEGER", true, 0, null, 1));
                hashMap.put("bankApplicationId", new androidx.room.util.TableInfo.Column("bankApplicationId", "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("payairUserData", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "payairUserData");
                if (!tableInfo.equals(read)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("payairUserData(com.payair.hce.model.PayairUserData).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    androidx.room.RoomOpenHelper.ValidationResult validationResult = new androidx.room.RoomOpenHelper.ValidationResult(false, sb.toString());
                    int i = values;
                    int i2 = i & 87;
                    int i3 = i2 + ((i ^ 87) | i2);
                    writeReplace = i3 % 128;
                    if (i3 % 2 != 0) {
                        return validationResult;
                    }
                    throw null;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap(3);
                hashMap2.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap2.put("authenticationReference", new androidx.room.util.TableInfo.Column("authenticationReference", "TEXT", false, 0, null, 1));
                hashMap2.put("authenticationReferenceForCheckout", new androidx.room.util.TableInfo.Column("authenticationReferenceForCheckout", "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo2 = new androidx.room.util.TableInfo("temporaryData", hashMap2, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read2 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "temporaryData");
                if (!tableInfo2.equals(read2)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("temporaryData(com.payair.hce.TemporaryData).\n Expected:\n");
                    sb2.append(tableInfo2);
                    sb2.append("\n Found:\n");
                    sb2.append(read2);
                    androidx.room.RoomOpenHelper.ValidationResult validationResult2 = new androidx.room.RoomOpenHelper.ValidationResult(false, sb2.toString());
                    int i4 = writeReplace;
                    int i5 = ((i4 | 97) << 1) - (i4 ^ 97);
                    values = i5 % 128;
                    if (i5 % 2 == 0) {
                        return validationResult2;
                    }
                    throw null;
                }
                java.util.HashMap hashMap3 = new java.util.HashMap(5);
                hashMap3.put("id", new androidx.room.util.TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                hashMap3.put("walletCardID", new androidx.room.util.TableInfo.Column("walletCardID", "INTEGER", false, 0, null, 1));
                hashMap3.put("tokenID", new androidx.room.util.TableInfo.Column("tokenID", "INTEGER", false, 0, null, 1));
                hashMap3.put(com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, new androidx.room.util.TableInfo.Column(com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, "TEXT", false, 0, null, 1));
                hashMap3.put(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, new androidx.room.util.TableInfo.Column(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo3 = new androidx.room.util.TableInfo("walletCardIDAndTokenData", hashMap3, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read3 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "walletCardIDAndTokenData");
                if (!tableInfo3.equals(read3)) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("walletCardIDAndTokenData(com.payair.hce.WalletCardIDAndTokenData).\n Expected:\n");
                    sb3.append(tableInfo3);
                    sb3.append("\n Found:\n");
                    sb3.append(read3);
                    androidx.room.RoomOpenHelper.ValidationResult validationResult3 = new androidx.room.RoomOpenHelper.ValidationResult(false, sb3.toString());
                    int i6 = values;
                    int i7 = (i6 ^ 125) + ((i6 & 125) << 1);
                    writeReplace = i7 % 128;
                    if (i7 % 2 != 0) {
                        return validationResult3;
                    }
                    throw null;
                }
                java.util.HashMap hashMap4 = new java.util.HashMap(5);
                hashMap4.put("signId", new androidx.room.util.TableInfo.Column("signId", "INTEGER", true, 1, null, 1));
                hashMap4.put(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, new androidx.room.util.TableInfo.Column(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "TEXT", false, 0, null, 1));
                hashMap4.put("timestamp", new androidx.room.util.TableInfo.Column("timestamp", "TEXT", false, 0, null, 1));
                hashMap4.put("keyType", new androidx.room.util.TableInfo.Column("keyType", "TEXT", false, 0, null, 1));
                hashMap4.put("base64Signature", new androidx.room.util.TableInfo.Column("base64Signature", "TEXT", false, 0, null, 1));
                androidx.room.util.TableInfo tableInfo4 = new androidx.room.util.TableInfo("signData", hashMap4, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read4 = androidx.room.util.TableInfo.read(supportSQLiteDatabase, "signData");
                if (tableInfo4.equals(read4)) {
                    androidx.room.RoomOpenHelper.ValidationResult validationResult4 = new androidx.room.RoomOpenHelper.ValidationResult(true, null);
                    writeReplace = (values + 101) % 128;
                    return validationResult4;
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("signData(com.payair.hce.SignData).\n Expected:\n");
                sb4.append(tableInfo4);
                sb4.append("\n Found:\n");
                sb4.append(read4);
                androidx.room.RoomOpenHelper.ValidationResult validationResult5 = new androidx.room.RoomOpenHelper.ValidationResult(false, sb4.toString());
                values = (writeReplace + 97) % 128;
                return validationResult5;
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                return (androidx.room.RoomOpenHelper.ValidationResult) values(new java.lang.Object[]{this, supportSQLiteDatabase}, 546159961, -546159959, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPostMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, -1106779689, 1106779689, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onPreMigrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, 558904321, -558904317, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onOpen(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, -1896860950, 1896860953, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void onCreate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, -1936768218, 1936768219, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void dropAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, 1313838396, -1313838390, java.lang.System.identityHashCode(this));
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public final void createAllTables(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
                values(new java.lang.Object[]{this, supportSQLiteDatabase}, -1029711221, 1029711226, java.lang.System.identityHashCode(this));
            }
        }, "5e01b3e609f0db71f4957adb2dd17de6", "7b07447adbda2ccef357f3c768f5c50a")).build());
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i ^ 91) | (i & 91)) << 1;
        int i3 = -((i & (-92)) | ((~i) & 91));
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return create;
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.room.InvalidationTracker createInvalidationTracker() {
        androidx.room.InvalidationTracker invalidationTracker = new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), "payairUserData", "temporaryData", "walletCardIDAndTokenData", "signData");
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 105;
        int i3 = i2 << 1;
        int i4 = -((~(i & 105)) & i2);
        int i5 = (i3 & i4) + (i4 | i3);
        writeReplace = i5 % 128;
        if (i5 % 2 != 0) {
            return invalidationTracker;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        int i = writeReplace;
        int i2 = i & 27;
        AlternateContactlessPaymentDataJson = (i2 + ((i ^ 27) | i2)) % 128;
        super.assertNotMainThread();
        androidx.database.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `payairUserData`");
            writableDatabase.execSQL("DELETE FROM `temporaryData`");
            writableDatabase.execSQL("DELETE FROM `walletCardIDAndTokenData`");
            writableDatabase.execSQL("DELETE FROM `signData`");
            super.setTransactionSuccessful();
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                int i3 = AlternateContactlessPaymentDataJson;
                int i4 = i3 & 113;
                int i5 = -(-((i3 ^ 113) | i4));
                int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
                writeReplace = i6 % 128;
                if (i6 % 2 != 0) {
                    writableDatabase.execSQL("VACUUM");
                    return;
                } else {
                    writableDatabase.execSQL("VACUUM");
                    throw null;
                }
            }
            int i7 = writeReplace;
            AlternateContactlessPaymentDataJson = ((((i7 | 30) << 1) - (i7 ^ 30)) - 1) % 128;
        } catch (java.lang.Throwable th) {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
                writeReplace = (AlternateContactlessPaymentDataJson + 3) % 128;
            }
            throw th;
        }
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.payair.hce.PayairUserDataDao.class, com.payair.hce.PayairUserDataDao_Impl.getRequiredConverters());
        hashMap.put(com.payair.hce.SignDataDao.class, com.payair.hce.SignDataDao_Impl.getRequiredConverters());
        hashMap.put(com.payair.hce.TemporaryDataDao.class, com.payair.hce.TemporaryDataDao_Impl.getRequiredConverters());
        hashMap.put(com.payair.hce.WalletCardIDAndTokenDataDao.class, com.payair.hce.WalletCardIDAndTokenDataDao_Impl.getRequiredConverters());
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 103;
        int i3 = (i ^ 103) | i2;
        writeReplace = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        java.util.HashSet hashSet = new java.util.HashSet();
        int i = AlternateContactlessPaymentDataJson;
        writeReplace = ((-2) - (~((i ^ 126) + ((i & 126) << 1)))) % 128;
        return hashSet;
    }

    @Override // androidx.room.RoomDatabase
    public final java.util.List<androidx.room.migration.Migration> getAutoMigrations(java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> map) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = writeReplace;
        AlternateContactlessPaymentDataJson = ((i & 93) + (i | 93)) % 128;
        return arrayList;
    }

    @Override // com.payair.hce.HCEDatabase
    public final com.payair.hce.PayairUserDataDao payairUserDataDao() {
        com.payair.hce.PayairUserDataDao payairUserDataDao;
        if (this._payairUserDataDao != null) {
            return this._payairUserDataDao;
        }
        synchronized (this) {
            if (this._payairUserDataDao == null) {
                this._payairUserDataDao = new com.payair.hce.PayairUserDataDao_Impl(this);
            }
            payairUserDataDao = this._payairUserDataDao;
        }
        return payairUserDataDao;
    }

    @Override // com.payair.hce.HCEDatabase
    public final com.payair.hce.SignDataDao signDataDao() {
        com.payair.hce.SignDataDao signDataDao;
        if (this._signDataDao != null) {
            return this._signDataDao;
        }
        synchronized (this) {
            if (this._signDataDao == null) {
                this._signDataDao = new com.payair.hce.SignDataDao_Impl(this);
            }
            signDataDao = this._signDataDao;
        }
        return signDataDao;
    }

    @Override // com.payair.hce.HCEDatabase
    public final com.payair.hce.TemporaryDataDao temporaryDataDao() {
        com.payair.hce.TemporaryDataDao temporaryDataDao;
        if (this._temporaryDataDao != null) {
            return this._temporaryDataDao;
        }
        synchronized (this) {
            if (this._temporaryDataDao == null) {
                this._temporaryDataDao = new com.payair.hce.TemporaryDataDao_Impl(this);
            }
            temporaryDataDao = this._temporaryDataDao;
        }
        return temporaryDataDao;
    }

    @Override // com.payair.hce.HCEDatabase
    public final com.payair.hce.WalletCardIDAndTokenDataDao walletCardIDAndTokenDataDao() {
        com.payair.hce.WalletCardIDAndTokenDataDao walletCardIDAndTokenDataDao;
        if (this._walletCardIDAndTokenDataDao != null) {
            return this._walletCardIDAndTokenDataDao;
        }
        synchronized (this) {
            if (this._walletCardIDAndTokenDataDao == null) {
                this._walletCardIDAndTokenDataDao = new com.payair.hce.WalletCardIDAndTokenDataDao_Impl(this);
            }
            walletCardIDAndTokenDataDao = this._walletCardIDAndTokenDataDao;
        }
        return walletCardIDAndTokenDataDao;
    }
}
