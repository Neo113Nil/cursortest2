package com.payair.hce;

/* loaded from: classes10.dex */
public final class SignDataDao_Impl implements com.payair.hce.SignDataDao {
    private static int valueOf = 1;
    private static int writeReplace;
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setX> __deletionAdapterOfSignData;
    private final androidx.room.EntityInsertionAdapter<com.payair.hce.setX> __insertionAdapterOfSignData;

    public SignDataDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfSignData = new androidx.room.EntityInsertionAdapter<com.payair.hce.setX>(roomDatabase) { // from class: com.payair.hce.SignDataDao_Impl.2
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                int i6 = i4 | i5;
                int i7 = (i * 51) + (i2 * (-49)) + ((i | i3) * (-50)) + (((~((~i) | i4 | i3)) | (~(i6 | i))) * 50) + (((~(i | i4)) | (~i6) | (~(i | i5))) * 50);
                if (i7 != 1) {
                    return i7 != 2 ? AlternateContactlessPaymentDataJson(objArr) : valueOf(objArr);
                }
                int i8 = AlternateContactlessPaymentDataJson;
                int i9 = i8 & 37;
                int i10 = (i9 + ((i8 ^ 37) | i9)) % 128;
                values = i10;
                AlternateContactlessPaymentDataJson = ((i10 & 1) + (1 | i10)) % 128;
                return "INSERT OR REPLACE INTO `signData` (`signId`,`data`,`timestamp`,`keyType`,`base64Signature`) VALUES (?,?,?,?,?)";
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = i ^ 107;
                int i3 = ((i & 107) | i2) << 1;
                int i4 = -i2;
                int i5 = (i3 & i4) + (i3 | i4);
                values = i5 % 128;
                java.lang.Object[] objArr2 = {supportSQLiteStatement, (com.payair.hce.setX) obj};
                if (i5 % 2 != 0) {
                    AlternateContactlessPaymentDataJson(objArr2, 127436431, -127436431, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
                AlternateContactlessPaymentDataJson(objArr2, 127436431, -127436431, (int) java.lang.System.currentTimeMillis());
                int i6 = AlternateContactlessPaymentDataJson;
                values = (((i6 & (-78)) | ((~i6) & 77)) + ((i6 & 77) << 1)) % 128;
                return null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
            
                r1.bindNull(2);
                r0 = (-2) - (~(com.payair.hce.SignDataDao_Impl.AnonymousClass2.values + 26));
                com.payair.hce.SignDataDao_Impl.AnonymousClass2.AlternateContactlessPaymentDataJson = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
            
                if (((java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{r12}, -27764403, 27764407, java.lang.System.identityHashCode(r12))) == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
            
                if (((java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{r12}, -27764403, 27764407, java.lang.System.identityHashCode(r12))) == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x007e, code lost:
            
                r1.bindString(2, (java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{r12}, -27764403, 27764407, java.lang.System.identityHashCode(r12)));
                r0 = com.payair.hce.SignDataDao_Impl.AnonymousClass2.AlternateContactlessPaymentDataJson;
                r3 = r0 ^ 5;
                com.payair.hce.SignDataDao_Impl.AnonymousClass2.values = ((((r0 & 5) | r3) << 1) - r3) % 128;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setX setx = (com.payair.hce.setX) objArr[1];
                int i = AlternateContactlessPaymentDataJson + 3;
                values = i % 128;
                if (i % 2 != 0) {
                    supportSQLiteStatement.bindLong(0, ((java.lang.Long) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -917622246, 917622247, java.lang.System.identityHashCode(setx))).longValue());
                } else {
                    supportSQLiteStatement.bindLong(1, ((java.lang.Long) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -917622246, 917622247, java.lang.System.identityHashCode(setx))).longValue());
                }
                if (((java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -1301129804, 1301129809, java.lang.System.identityHashCode(setx))) == null) {
                    int i2 = AlternateContactlessPaymentDataJson + 41;
                    values = i2 % 128;
                    if (i2 % 2 != 0) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                } else {
                    supportSQLiteStatement.bindString(3, (java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -1301129804, 1301129809, java.lang.System.identityHashCode(setx)));
                    int i3 = AlternateContactlessPaymentDataJson;
                    values = (((i3 ^ 51) - (~(-(-((i3 & 51) << 1))))) - 1) % 128;
                }
                if (((java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -2035211089, 2035211092, java.lang.System.identityHashCode(setx))) == null) {
                    int i4 = values + 109;
                    AlternateContactlessPaymentDataJson = i4 % 128;
                    if (i4 % 2 == 0) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindNull(4);
                    }
                } else {
                    supportSQLiteStatement.bindString(4, (java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -2035211089, 2035211092, java.lang.System.identityHashCode(setx)));
                    int i5 = values;
                    int i6 = (i5 & 10) + (i5 | 10);
                    AlternateContactlessPaymentDataJson = ((~i6) + (i6 << 1)) % 128;
                }
                if (((java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, 1339334850, -1339334848, java.lang.System.identityHashCode(setx))) != null) {
                    supportSQLiteStatement.bindString(5, (java.lang.String) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, 1339334850, -1339334848, java.lang.System.identityHashCode(setx)));
                    int i7 = values;
                    int i8 = i7 ^ 111;
                    int i9 = (((i7 & 111) | i8) << 1) - i8;
                    AlternateContactlessPaymentDataJson = i9 % 128;
                    if (i9 % 2 != 0) {
                        return null;
                    }
                    throw new java.lang.ArithmeticException();
                }
                int i10 = AlternateContactlessPaymentDataJson;
                int i11 = i10 & 11;
                int i12 = ((i10 ^ 11) | i11) << 1;
                int i13 = -((i10 | 11) & (~i11));
                int i14 = (i12 & i13) + (i13 | i12);
                values = i14 % 128;
                if (i14 % 2 != 0) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindNull(5);
                }
                int i15 = (-2) - (~(values + 76));
                AlternateContactlessPaymentDataJson = i15 % 128;
                if (i15 % 2 != 0) {
                    return null;
                }
                throw null;
            }

            @Override // androidx.room.EntityInsertionAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setX setx) {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, supportSQLiteStatement, setx}, -732999765, 732999767, java.lang.System.identityHashCode(this));
            }

            private static void valueOf(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setX setx) {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{supportSQLiteStatement, setx}, 127436431, -127436431, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1915484144, 1915484145, java.lang.System.identityHashCode(this));
            }
        };
        this.__deletionAdapterOfSignData = new androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setX>(roomDatabase) { // from class: com.payair.hce.SignDataDao_Impl.3
            private static int DigitizedCardProfile = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ((i * (-963)) - 964) + (i2 * 965) + (((~i) | (~(i4 | i3))) * (-964)) + (((~(i | i4)) | (~((~i3) | i4))) * (-964));
                if (i5 == 1) {
                    return valueOf(objArr);
                }
                if (i5 == 2) {
                    return DigitizedCardProfile(objArr);
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setX setx = (com.payair.hce.setX) objArr[1];
                int i6 = DigitizedCardProfile;
                int i7 = (i6 | 91) << 1;
                int i8 = -((i6 & (-92)) | ((~i6) & 91));
                int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                writeReplace = i9 % 128;
                int i10 = i9 % 2;
                supportSQLiteStatement.bindLong(1, ((java.lang.Long) com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx}, -917622246, 917622247, java.lang.System.identityHashCode(setx))).longValue());
                return null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i = DigitizedCardProfile;
                int i2 = i & 69;
                int i3 = i | 69;
                int i4 = (i2 & i3) + (i3 | i2);
                writeReplace = i4 % 128;
                java.lang.Object[] objArr2 = {supportSQLiteStatement, (com.payair.hce.setX) obj};
                if (i4 % 2 != 0) {
                    values(objArr2, 443580147, -443580147, (int) java.lang.System.currentTimeMillis());
                    throw new java.lang.ArithmeticException();
                }
                values(objArr2, 443580147, -443580147, (int) java.lang.System.currentTimeMillis());
                int i5 = writeReplace;
                int i6 = (i5 | 67) << 1;
                int i7 = -((i5 & (-68)) | ((~i5) & 67));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                DigitizedCardProfile = i8 % 128;
                if (i8 % 2 != 0) {
                    return null;
                }
                throw new java.lang.ArithmeticException();
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                int i = DigitizedCardProfile;
                int i2 = i & 119;
                int i3 = -(-((i ^ 119) | i2));
                writeReplace = ((i2 & i3) + (i2 | i3)) % 128;
                int i4 = i + 41;
                writeReplace = i4 % 128;
                if (i4 % 2 == 0) {
                    return "DELETE FROM `signData` WHERE `signId` = ?";
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setX setx) {
                values(new java.lang.Object[]{this, supportSQLiteStatement, setx}, 167785071, -167785069, java.lang.System.identityHashCode(this));
            }

            private static void valueOf(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setX setx) {
                values(new java.lang.Object[]{supportSQLiteStatement, setx}, 443580147, -443580147, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) values(new java.lang.Object[]{this}, 654140773, -654140772, java.lang.System.identityHashCode(this));
            }
        };
    }

    @Override // com.payair.hce.SignDataDao
    public final void insert(com.payair.hce.setX... setxArr) {
        int i = writeReplace;
        int i2 = i & 27;
        int i3 = ((((i ^ 27) | i2) << 1) - (~(-((i | 27) & (~i2))))) - 1;
        valueOf = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.__db.assertNotSuspendingTransaction();
                this.__db.beginTransaction();
                this.__insertionAdapterOfSignData.insert(setxArr);
                this.__db.setTransactionSuccessful();
                return;
            }
            this.__db.assertNotSuspendingTransaction();
            this.__db.beginTransaction();
            this.__insertionAdapterOfSignData.insert(setxArr);
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            throw new java.lang.ArithmeticException();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // com.payair.hce.SignDataDao
    public final void delete(com.payair.hce.setX setx) {
        int i = valueOf;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        writeReplace = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                this.__db.assertNotSuspendingTransaction();
                this.__db.beginTransaction();
                this.__deletionAdapterOfSignData.handle(setx);
                this.__db.setTransactionSuccessful();
                this.__db.endTransaction();
                throw null;
            }
            this.__db.assertNotSuspendingTransaction();
            this.__db.beginTransaction();
            this.__deletionAdapterOfSignData.handle(setx);
            this.__db.setTransactionSuccessful();
            this.__db.endTransaction();
            int i4 = writeReplace;
            int i5 = (i4 & (-52)) | ((~i4) & 51);
            int i6 = (i4 & 51) << 1;
            valueOf = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
        } catch (java.lang.Throwable th) {
            this.__db.endTransaction();
            throw th;
        }
    }

    @Override // com.payair.hce.SignDataDao
    public final java.util.List<com.payair.hce.setX> getAll() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM signData", 0);
        this.__db.assertNotSuspendingTransaction();
        java.lang.String str = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "signId");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "keyType");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "base64Signature");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            int i = writeReplace;
            int i2 = (i & (-22)) | ((~i) & 21);
            int i3 = 1;
            int i4 = -(-((i & 21) << 1));
            valueOf = (((i2 | i4) << 1) - (i4 ^ i2)) % 128;
            while (query.moveToNext()) {
                int i5 = valueOf;
                int i6 = (i5 | 11) << i3;
                int i7 = -((i5 & (-12)) | ((~i5) & 11));
                writeReplace = (((i6 | i7) << i3) - (i7 ^ i6)) % 128;
                if (query.isNull(columnIndexOrThrow2)) {
                    int i8 = writeReplace;
                    int i9 = ((((i8 | 8) << i3) - (i8 ^ 8)) - i3) % 128;
                    valueOf = i9;
                    int i10 = i9 + 63;
                    writeReplace = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 3 / 3;
                    }
                    string = str;
                } else {
                    string = query.getString(columnIndexOrThrow2);
                    int i12 = valueOf & 5;
                    writeReplace = ((i12 - (~(-(-((r15 ^ 5) | i12))))) - 1) % 128;
                }
                if (query.isNull(columnIndexOrThrow3)) {
                    int i13 = writeReplace + 87;
                    valueOf = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw new java.lang.NullPointerException();
                    }
                    string2 = null;
                } else {
                    string2 = query.getString(columnIndexOrThrow3);
                    int i14 = writeReplace + 103;
                    valueOf = i14 % 128;
                    int i15 = i14 % 2;
                }
                if (query.isNull(columnIndexOrThrow4)) {
                    int i16 = writeReplace;
                    int i17 = i16 & 9;
                    int i18 = -(-(i16 | 9));
                    int i19 = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                    valueOf = i19;
                    writeReplace = (((i19 | 115) << i3) - (i19 ^ 115)) % 128;
                    string3 = null;
                } else {
                    string3 = query.getString(columnIndexOrThrow4);
                    int i20 = writeReplace;
                    valueOf = ((i20 ^ 53) + ((i20 & 53) << i3)) % 128;
                }
                if (query.isNull(columnIndexOrThrow5)) {
                    int i21 = writeReplace;
                    int i22 = (i21 ^ 71) + ((i21 & 71) << i3);
                    valueOf = i22 % 128;
                    if (i22 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    string4 = null;
                } else {
                    string4 = query.getString(columnIndexOrThrow5);
                    int i23 = valueOf;
                    int i24 = i23 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                    writeReplace = (i24 + ((i23 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i24)) % 128;
                }
                com.payair.hce.setX setx = new com.payair.hce.setX(string, string3, string4, string2);
                com.payair.hce.setX.DigitizedCardProfile(new java.lang.Object[]{setx, java.lang.Long.valueOf(query.getLong(columnIndexOrThrow))}, -355328371, 355328371, java.lang.System.identityHashCode(setx));
                arrayList.add(setx);
                int i25 = writeReplace;
                valueOf = (((i25 & (-4)) | ((~i25) & 3)) + ((i25 & 3) << 1)) % 128;
                i3 = 1;
                str = null;
            }
            query.close();
            acquire.release();
            int i26 = writeReplace + 57;
            valueOf = i26 % 128;
            if (i26 % 2 != 0) {
                return arrayList;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.lang.Throwable th) {
            query.close();
            acquire.release();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        int i = valueOf;
        int i2 = (i & 109) + (i | 109);
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            java.util.Collections.emptyList();
            throw null;
        }
        java.util.List<java.lang.Class<?>> emptyList = java.util.Collections.emptyList();
        int i3 = valueOf & 27;
        writeReplace = ((((r1 | 27) & (~i3)) - (~(-(-(i3 << 1))))) - 1) % 128;
        return emptyList;
    }
}
