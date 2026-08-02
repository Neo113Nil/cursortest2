package com.payair.hce;

/* loaded from: classes10.dex */
public final class WalletCardIDAndTokenDataDao_Impl implements com.payair.hce.WalletCardIDAndTokenDataDao {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setScrollbarFadingEnabled> __deletionAdapterOfWalletCardIDAndTokenData;
    private final androidx.room.EntityInsertionAdapter<com.payair.hce.setScrollbarFadingEnabled> __insertionAdapterOfWalletCardIDAndTokenData;

    public WalletCardIDAndTokenDataDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWalletCardIDAndTokenData = new androidx.room.EntityInsertionAdapter<com.payair.hce.setScrollbarFadingEnabled>(roomDatabase) { // from class: com.payair.hce.WalletCardIDAndTokenDataDao_Impl.4
            private static int values = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                int i6 = ~i3;
                int i7 = (i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
                if (i7 != 1) {
                    return i7 != 2 ? valueOf(objArr) : writeReplace(objArr);
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i8 = values;
                int i9 = i8 & 103;
                int i10 = i8 | 103;
                writeReplace = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                values(new java.lang.Object[]{supportSQLiteStatement, (com.payair.hce.setScrollbarFadingEnabled) obj}, 183108254, -183108254, (int) java.lang.System.currentTimeMillis());
                int i11 = values;
                writeReplace = ((i11 & 103) + (i11 | 103)) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                int i = values;
                int i2 = i & 29;
                int i3 = -(-((i ^ 29) | i2));
                int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
                int i5 = i4 % 128;
                writeReplace = i5;
                if (i4 % 2 == 0) {
                    throw new java.lang.ArithmeticException();
                }
                values = (i5 + 15) % 128;
                return "INSERT OR REPLACE INTO `walletCardIDAndTokenData` (`id`,`walletCardID`,`tokenID`,`tokenUniqueReference`,`tokenStatus`) VALUES (?,?,?,?,?)";
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled = (com.payair.hce.setScrollbarFadingEnabled) objArr[1];
                int i = values;
                int i2 = i & 21;
                int i3 = (i | 21) & (~i2);
                int i4 = i2 << 1;
                writeReplace = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                supportSQLiteStatement.bindLong(1, ((java.lang.Integer) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -349124660, 349124662, java.lang.System.identityHashCode(setscrollbarfadingenabled))).intValue());
                if (((java.lang.Long) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -2107487391, 2107487398, java.lang.System.identityHashCode(setscrollbarfadingenabled))) == null) {
                    int i5 = values;
                    int i6 = (((i5 & (-68)) | ((~i5) & 67)) - (~((i5 & 67) << 1))) - 1;
                    writeReplace = i6 % 128;
                    if (i6 % 2 == 0) {
                        supportSQLiteStatement.bindNull(3);
                    } else {
                        supportSQLiteStatement.bindNull(2);
                    }
                    int i7 = writeReplace;
                    int i8 = i7 ^ 23;
                    int i9 = ((i7 & 23) | i8) << 1;
                    int i10 = -i8;
                    values = ((i9 & i10) + (i9 | i10)) % 128;
                } else {
                    supportSQLiteStatement.bindLong(2, ((java.lang.Long) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -2107487391, 2107487398, java.lang.System.identityHashCode(setscrollbarfadingenabled))).longValue());
                    int i11 = writeReplace;
                    int i12 = i11 & 37;
                    int i13 = i11 | 37;
                    values = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                }
                if (((java.lang.Long) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -453108960, 453108964, java.lang.System.identityHashCode(setscrollbarfadingenabled))) == null) {
                    writeReplace = (values + 21) % 128;
                    supportSQLiteStatement.bindNull(3);
                    int i14 = writeReplace;
                    int i15 = i14 & 109;
                    values = (i15 + ((i14 ^ 109) | i15)) % 128;
                } else {
                    supportSQLiteStatement.bindLong(3, ((java.lang.Long) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -453108960, 453108964, java.lang.System.identityHashCode(setscrollbarfadingenabled))).longValue());
                    int i16 = writeReplace;
                    int i17 = i16 & 81;
                    int i18 = -(-((i16 ^ 81) | i17));
                    values = ((i17 & i18) + (i18 | i17)) % 128;
                }
                if (((java.lang.String) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -1163059905, 1163059913, java.lang.System.identityHashCode(setscrollbarfadingenabled))) == null) {
                    int i19 = values + 16;
                    writeReplace = ((~i19) + (i19 << 1)) % 128;
                    supportSQLiteStatement.bindNull(4);
                    int i20 = values;
                    int i21 = i20 ^ 119;
                    int i22 = -(-((i20 & 119) << 1));
                    writeReplace = ((i21 & i22) + (i22 | i21)) % 128;
                } else {
                    supportSQLiteStatement.bindString(4, (java.lang.String) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -1163059905, 1163059913, java.lang.System.identityHashCode(setscrollbarfadingenabled)));
                    writeReplace = (values + 51) % 128;
                }
                if (((java.lang.String) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -1725237431, 1725237440, java.lang.System.identityHashCode(setscrollbarfadingenabled))) != null) {
                    supportSQLiteStatement.bindString(5, (java.lang.String) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -1725237431, 1725237440, java.lang.System.identityHashCode(setscrollbarfadingenabled)));
                    int i23 = values;
                    int i24 = ((i23 ^ 84) + ((i23 & 84) << 1)) - 1;
                    writeReplace = i24 % 128;
                    if (i24 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                int i25 = writeReplace + 21;
                values = i25 % 128;
                if (i25 % 2 != 0) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindNull(5);
                }
                int i26 = values;
                int i27 = i26 & 93;
                int i28 = i26 | 93;
                writeReplace = ((i27 & i28) + (i28 | i27)) % 128;
                return null;
            }

            @Override // androidx.room.EntityInsertionAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled) {
                values(new java.lang.Object[]{this, supportSQLiteStatement, setscrollbarfadingenabled}, -92596621, 92596622, java.lang.System.identityHashCode(this));
            }

            private static void writeReplace(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled) {
                values(new java.lang.Object[]{supportSQLiteStatement, setscrollbarfadingenabled}, 183108254, -183108254, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) values(new java.lang.Object[]{this}, 104740607, -104740605, java.lang.System.identityHashCode(this));
            }
        };
        this.__deletionAdapterOfWalletCardIDAndTokenData = new androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setScrollbarFadingEnabled>(roomDatabase) { // from class: com.payair.hce.WalletCardIDAndTokenDataDao_Impl.3
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int DigitizedCardProfile = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                int i6 = ~(i | i3);
                int i7 = (i * 881) + (i2 * 881) + (((~(i5 | i4)) | (~(i4 | i3)) | (~(i5 | i3))) * (-880)) + ((i2 | (~((~i3) | i4)) | i6) * (-880)) + (i6 * 880);
                if (i7 == 1) {
                    androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                    com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled = (com.payair.hce.setScrollbarFadingEnabled) objArr[1];
                    int i8 = DigitizedCardProfile;
                    int i9 = i8 & 63;
                    int i10 = ((i8 | 63) & (~i9)) + (i9 << 1);
                    AlternateContactlessPaymentDataJson = i10 % 128;
                    int i11 = i10 % 2;
                    supportSQLiteStatement.bindLong(1, ((java.lang.Integer) com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled}, -349124660, 349124662, java.lang.System.identityHashCode(setscrollbarfadingenabled))).intValue());
                    int i12 = DigitizedCardProfile;
                    int i13 = i12 & 101;
                    int i14 = (i12 | 101) & (~i13);
                    int i15 = -(-(i13 << 1));
                    AlternateContactlessPaymentDataJson = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
                    return null;
                }
                if (i7 != 2) {
                    return DigitizedCardProfile(objArr);
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement2 = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i16 = DigitizedCardProfile;
                int i17 = i16 ^ 111;
                int i18 = -(-((i16 & 111) << 1));
                AlternateContactlessPaymentDataJson = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                DigitizedCardProfile(new java.lang.Object[]{supportSQLiteStatement2, (com.payair.hce.setScrollbarFadingEnabled) obj}, 403272846, -403272845, (int) java.lang.System.currentTimeMillis());
                int i19 = AlternateContactlessPaymentDataJson;
                DigitizedCardProfile = ((((i19 ^ 23) | (i19 & 23)) << 1) - ((i19 & (-24)) | ((~i19) & 23))) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                int i = DigitizedCardProfile;
                int i2 = i & 119;
                int i3 = (i ^ 119) | i2;
                int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
                AlternateContactlessPaymentDataJson = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                int i5 = i & 89;
                int i6 = (i5 - (~(-(-((i ^ 89) | i5))))) - 1;
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 == 0) {
                    return "DELETE FROM `walletCardIDAndTokenData` WHERE `id` = ?";
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled) {
                DigitizedCardProfile(new java.lang.Object[]{this, supportSQLiteStatement, setscrollbarfadingenabled}, 505777594, -505777592, java.lang.System.identityHashCode(this));
            }

            private static void AlternateContactlessPaymentDataJson(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled) {
                DigitizedCardProfile(new java.lang.Object[]{supportSQLiteStatement, setscrollbarfadingenabled}, 403272846, -403272845, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -795973665, 795973665, java.lang.System.identityHashCode(this));
            }
        };
    }

    @Override // com.payair.hce.WalletCardIDAndTokenDataDao
    public final void insert(com.payair.hce.setScrollbarFadingEnabled... setscrollbarfadingenabledArr) {
        int i = DigitizedCardProfile;
        int i2 = i & 117;
        AlternateContactlessPaymentDataJson = (i2 + ((i ^ 117) | i2)) % 128;
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWalletCardIDAndTokenData.insert(setscrollbarfadingenabledArr);
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            int i3 = AlternateContactlessPaymentDataJson;
            int i4 = i3 & 83;
            int i5 = i4 + ((i3 ^ 83) | i4);
            DigitizedCardProfile = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (java.lang.Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    @Override // com.payair.hce.WalletCardIDAndTokenDataDao
    public final void delete(com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled) {
        int i = AlternateContactlessPaymentDataJson + 89;
        DigitizedCardProfile = i % 128;
        try {
            if (i % 2 == 0) {
                this.__db.assertNotSuspendingTransaction();
                this.__db.beginTransaction();
                this.__deletionAdapterOfWalletCardIDAndTokenData.handle(setscrollbarfadingenabled);
                this.__db.setTransactionSuccessful();
                return;
            }
            this.__db.assertNotSuspendingTransaction();
            this.__db.beginTransaction();
            this.__deletionAdapterOfWalletCardIDAndTokenData.handle(setscrollbarfadingenabled);
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            throw null;
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.payair.hce.WalletCardIDAndTokenDataDao
    public final java.util.List<com.payair.hce.setScrollbarFadingEnabled> getAll() {
        java.lang.Long valueOf;
        java.lang.Long valueOf2;
        java.lang.String string;
        java.lang.String string2;
        char c = 0;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM walletCardIDAndTokenData", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "walletCardID");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "tokenID");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY);
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo);
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            int i = AlternateContactlessPaymentDataJson;
            int i2 = i & 35;
            DigitizedCardProfile = ((i2 - (~(-(-((i ^ 35) | i2))))) - 1) % 128;
            while (query.moveToNext()) {
                com.payair.hce.setScrollbarFadingEnabled setscrollbarfadingenabled = new com.payair.hce.setScrollbarFadingEnabled();
                int i3 = query.getInt(columnIndexOrThrow);
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[c] = setscrollbarfadingenabled;
                objArr[1] = java.lang.Integer.valueOf(i3);
                com.payair.hce.setScrollbarFadingEnabled.writeReplace(objArr, -1956499791, 1956499791, i3);
                if (query.isNull(columnIndexOrThrow2)) {
                    int i4 = AlternateContactlessPaymentDataJson;
                    DigitizedCardProfile = (((i4 & 20) + (i4 | 20)) - 1) % 128;
                    DigitizedCardProfile = (i4 + 25) % 128;
                    valueOf = null;
                } else {
                    valueOf = java.lang.Long.valueOf(query.getLong(columnIndexOrThrow2));
                    int i5 = DigitizedCardProfile;
                    int i6 = (i5 | 21) << 1;
                    int i7 = -(((~i5) & 21) | (i5 & (-22)));
                    AlternateContactlessPaymentDataJson = ((i6 & i7) + (i7 | i6)) % 128;
                }
                com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled, valueOf}, -1244407114, 1244407115, java.lang.System.identityHashCode(setscrollbarfadingenabled));
                if (query.isNull(columnIndexOrThrow3)) {
                    int i8 = DigitizedCardProfile;
                    int i9 = (i8 & (-68)) | ((~i8) & 67);
                    int i10 = -(-((i8 & 67) << 1));
                    int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
                    AlternateContactlessPaymentDataJson = i11;
                    int i12 = i11 & 87;
                    DigitizedCardProfile = ((i12 - (~(-(-((i11 ^ 87) | i12))))) - 1) % 128;
                    valueOf2 = null;
                } else {
                    valueOf2 = java.lang.Long.valueOf(query.getLong(columnIndexOrThrow3));
                    int i13 = AlternateContactlessPaymentDataJson;
                    int i14 = i13 & 53;
                    int i15 = -(-(i13 | 53));
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    DigitizedCardProfile = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i17 = 2 / 3;
                    }
                }
                com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled, valueOf2}, 1201767116, -1201767110, java.lang.System.identityHashCode(setscrollbarfadingenabled));
                if (query.isNull(columnIndexOrThrow4)) {
                    int i18 = DigitizedCardProfile;
                    int i19 = ((i18 ^ 115) + ((i18 & 115) << 1)) % 128;
                    AlternateContactlessPaymentDataJson = i19;
                    int i20 = i19 ^ 87;
                    int i21 = -(-((i19 & 87) << 1));
                    DigitizedCardProfile = ((i20 & i21) + (i20 | i21)) % 128;
                    string = null;
                } else {
                    string = query.getString(columnIndexOrThrow4);
                    int i22 = AlternateContactlessPaymentDataJson;
                    int i23 = (i22 ^ 95) + ((i22 & 95) << 1);
                    DigitizedCardProfile = i23 % 128;
                    int i24 = i23 % 2;
                }
                com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled, string}, 1823847262, -1823847259, java.lang.System.identityHashCode(setscrollbarfadingenabled));
                if (query.isNull(columnIndexOrThrow5)) {
                    int i25 = DigitizedCardProfile;
                    int i26 = ((i25 | 93) << 1) - (i25 ^ 93);
                    AlternateContactlessPaymentDataJson = i26 % 128;
                    if (i26 % 2 == 0) {
                        throw new java.lang.NullPointerException();
                    }
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow5);
                    DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 105) % 128;
                }
                com.payair.hce.setScrollbarFadingEnabled.writeReplace(new java.lang.Object[]{setscrollbarfadingenabled, string2}, -1239823180, 1239823185, java.lang.System.identityHashCode(setscrollbarfadingenabled));
                arrayList.add(setscrollbarfadingenabled);
                int i27 = AlternateContactlessPaymentDataJson;
                int i28 = i27 & 21;
                int i29 = -(-((i27 ^ 21) | i28));
                DigitizedCardProfile = ((i28 & i29) + (i29 | i28)) % 128;
                c = 0;
            }
            query.close();
            acquire.release();
            int i30 = AlternateContactlessPaymentDataJson;
            int i31 = i30 ^ 107;
            int i32 = ((i30 & 107) | i31) << 1;
            int i33 = -i31;
            DigitizedCardProfile = (((i32 | i33) << 1) - (i32 ^ i33)) % 128;
            return arrayList;
        } catch (java.lang.Throwable th) {
            query.close();
            acquire.release();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i & (-16)) | ((~i) & 15);
        int i3 = (i & 15) << 1;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        java.util.List<java.lang.Class<?>> emptyList = java.util.Collections.emptyList();
        int i4 = DigitizedCardProfile;
        int i5 = ((((i4 ^ 125) | (i4 & 125)) << 1) - (~(-((i4 & (-126)) | ((~i4) & 125))))) - 1;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return emptyList;
        }
        throw null;
    }
}
