package com.payair.hce;

/* loaded from: classes10.dex */
public final class TemporaryDataDao_Impl implements com.payair.hce.TemporaryDataDao {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int valueOf;
    private static char[] values;
    final androidx.room.RoomDatabase __db;
    final androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setZ> __deletionAdapterOfTemporaryData;
    final androidx.room.EntityInsertionAdapter<com.payair.hce.setZ> __insertionAdapterOfTemporaryData;
    final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;

    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2 = s * 34;
        int i3 = 37 - (b * 34);
        byte[] bArr = $$a;
        int i4 = (i * 653) + 65;
        char[] cArr = new char[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 = (i2 + (-i4)) - 2;
        }
        while (true) {
            i5++;
            cArr[i5] = (char) i4;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(cArr);
                return;
            } else {
                i3++;
                i4 = (i4 + (-bArr[i3])) - 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = s2 * 2;
        byte[] bArr = $$d;
        int i5 = 4 - (i * 4);
        int i6 = (s * 4) + 99;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i7 = i5;
            int i8 = 0;
            i5 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i7 = i3;
            i6 = bArr[i3];
            i8 = i9;
            i5 += i6;
            i3 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i5 = i6;
            i3 = i5;
            bArr2[i2] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public TemporaryDataDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfTemporaryData = new androidx.room.EntityInsertionAdapter<com.payair.hce.setZ>(roomDatabase) { // from class: com.payair.hce.TemporaryDataDao_Impl.5
            private static int DigitizedCardProfile = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                int i6 = (i * 567) + (i2 * (-565)) + (((~(i2 | i4)) | (~(i4 | i3))) * (-566)) + ((~(i | i5)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST) + ((~(i4 | i5 | i3)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST);
                return i6 != 1 ? i6 != 2 ? values(objArr) : valueOf(objArr) : writeReplace(objArr);
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i = DigitizedCardProfile;
                int i2 = (((i | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1) - (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1;
                writeReplace = i2 % 128;
                java.lang.Object[] objArr2 = {supportSQLiteStatement, (com.payair.hce.setZ) obj};
                if (i2 % 2 == 0) {
                    DigitizedCardProfile(objArr2, -278408584, 278408585, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
                DigitizedCardProfile(objArr2, -278408584, 278408585, (int) java.lang.System.currentTimeMillis());
                int i3 = DigitizedCardProfile;
                writeReplace = ((i3 & 59) + (i3 | 59)) % 128;
                return null;
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                int i = writeReplace;
                int i2 = i & 27;
                int i3 = (i | 27) & (~i2);
                int i4 = -(-(i2 << 1));
                int i5 = (i3 & i4) + (i3 | i4);
                DigitizedCardProfile = i5 % 128;
                if (i5 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `temporaryData` (`id`,`authenticationReference`,`authenticationReferenceForCheckout`) VALUES (?,?,?)";
                }
                throw new java.lang.ArithmeticException();
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
            
                r0 = com.payair.hce.TemporaryDataDao_Impl.AnonymousClass5.DigitizedCardProfile;
                r4 = r0 & 1;
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass5.writeReplace = (r4 + ((r0 ^ 1) | r4)) % 128;
                r1.bindNull(2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
            
                if (((java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{r11}, -302657026, 302657028, java.lang.System.identityHashCode(r11))) == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x004a, code lost:
            
                if (((java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{r11}, -302657026, 302657028, java.lang.System.identityHashCode(r11))) == null) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0082, code lost:
            
                r1.bindString(2, (java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{r11}, -302657026, 302657028, java.lang.System.identityHashCode(r11)));
                r0 = com.payair.hce.TemporaryDataDao_Impl.AnonymousClass5.DigitizedCardProfile;
                r4 = r0 & 53;
                r4 = (r4 - (~(-(-((r0 ^ 53) | r4))))) - 1;
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass5.writeReplace = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x00a4, code lost:
            
                if ((r4 % 2) != 0) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x00a6, code lost:
            
                r0 = 4 / 3;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[1];
                int i = writeReplace + 36;
                int i2 = (~i) + (i << 1);
                DigitizedCardProfile = i2 % 128;
                if (i2 % 2 != 0) {
                    supportSQLiteStatement.bindLong(0, ((java.lang.Integer) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -2076611405, 2076611409, java.lang.System.identityHashCode(setz))).intValue());
                } else {
                    supportSQLiteStatement.bindLong(1, ((java.lang.Integer) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -2076611405, 2076611409, java.lang.System.identityHashCode(setz))).intValue());
                }
                if (((java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -978270362, 978270363, java.lang.System.identityHashCode(setz))) != null) {
                    supportSQLiteStatement.bindString(3, (java.lang.String) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -978270362, 978270363, java.lang.System.identityHashCode(setz)));
                    int i3 = writeReplace;
                    int i4 = ((i3 ^ 39) | (i3 & 39)) << 1;
                    int i5 = -((i3 & (-40)) | ((~i3) & 39));
                    DigitizedCardProfile = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                    return null;
                }
                int i6 = writeReplace;
                int i7 = (i6 & 112) + (i6 | 112);
                DigitizedCardProfile = ((~i7) + (i7 << 1)) % 128;
                supportSQLiteStatement.bindNull(3);
                int i8 = DigitizedCardProfile;
                int i9 = (((i8 | 27) << 1) - (~(-((i8 & (-28)) | ((~i8) & 27))))) - 1;
                writeReplace = i9 % 128;
                if (i9 % 2 != 0) {
                    return null;
                }
                throw null;
            }

            @Override // androidx.room.EntityInsertionAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setZ setz) {
                DigitizedCardProfile(new java.lang.Object[]{this, supportSQLiteStatement, setz}, 456672518, -456672518, java.lang.System.identityHashCode(this));
            }

            private static void DigitizedCardProfile(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setZ setz) {
                DigitizedCardProfile(new java.lang.Object[]{supportSQLiteStatement, setz}, -278408584, 278408585, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 572735936, -572735934, java.lang.System.identityHashCode(this));
            }
        };
        this.__deletionAdapterOfTemporaryData = new androidx.room.EntityDeletionOrUpdateAdapter<com.payair.hce.setZ>(roomDatabase) { // from class: com.payair.hce.TemporaryDataDao_Impl.2
            private static int values = 1;
            private static int writeReplace;

            public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                int i6 = i4 | i5;
                int i7 = ~i3;
                int i8 = (i * (-167)) + (i2 * (-167)) + (((~i6) | (~(i5 | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + ((~(i6 | i3)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(i | i5 | i3)) | (~(i2 | i4)) | (~(i4 | i7))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                if (i8 != 1) {
                    if (i8 == 2) {
                        return DigitizedCardProfile(objArr);
                    }
                    int i9 = writeReplace;
                    values = ((((i9 & (-124)) | ((~i9) & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) - (~((i9 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1))) - 1) % 128;
                    values = (i9 + 7) % 128;
                    return "DELETE FROM `temporaryData` WHERE `id` = ?";
                }
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[0];
                com.payair.hce.setZ setz = (com.payair.hce.setZ) objArr[1];
                int i10 = values;
                int i11 = i10 ^ 101;
                int i12 = ((((i10 & 101) | i11) << 1) - (~(-i11))) - 1;
                writeReplace = i12 % 128;
                if (i12 % 2 != 0) {
                    supportSQLiteStatement.bindLong(0, ((java.lang.Integer) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -2076611405, 2076611409, java.lang.System.identityHashCode(setz))).intValue());
                    return null;
                }
                supportSQLiteStatement.bindLong(1, ((java.lang.Integer) com.payair.hce.setZ.values(new java.lang.Object[]{setz}, -2076611405, 2076611409, java.lang.System.identityHashCode(setz))).intValue());
                return null;
            }

            private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
                androidx.database.db.SupportSQLiteStatement supportSQLiteStatement = (androidx.database.db.SupportSQLiteStatement) objArr[1];
                java.lang.Object obj = objArr[2];
                int i = writeReplace + 29;
                values = i % 128;
                java.lang.Object[] objArr2 = {supportSQLiteStatement, (com.payair.hce.setZ) obj};
                if (i % 2 == 0) {
                    writeReplace(objArr2, -956559688, 956559689, (int) java.lang.System.currentTimeMillis());
                    throw null;
                }
                writeReplace(objArr2, -956559688, 956559689, (int) java.lang.System.currentTimeMillis());
                int i2 = writeReplace + 1;
                values = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                throw null;
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public final /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setZ setz) {
                writeReplace(new java.lang.Object[]{this, supportSQLiteStatement, setz}, -1576626159, 1576626161, java.lang.System.identityHashCode(this));
            }

            private static void writeReplace(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, com.payair.hce.setZ setz) {
                writeReplace(new java.lang.Object[]{supportSQLiteStatement, setz}, -956559688, 956559689, (int) java.lang.System.currentTimeMillis());
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 1265014472, -1265014472, java.lang.System.identityHashCode(this));
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(roomDatabase) { // from class: com.payair.hce.TemporaryDataDao_Impl.1
            private static int valueOf = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                return values(objArr);
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                int i = values;
                int i2 = ((i & 7) + (i | 7)) % 128;
                valueOf = i2;
                int i3 = (i2 & (-56)) | ((~i2) & 55);
                int i4 = (i2 & 55) << 1;
                int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
                values = i5 % 128;
                if (i5 % 2 != 0) {
                    return "DELETE FROM temporaryData";
                }
                throw new java.lang.ArithmeticException();
            }

            @Override // androidx.room.SharedSQLiteStatement
            public final java.lang.String createQuery() {
                return (java.lang.String) valueOf(new java.lang.Object[]{this}, 855985723, -855985723, java.lang.System.identityHashCode(this));
            }
        };
    }

    private static void a(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 23) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.View.MeasureSpec.getMode(0), android.graphics.Color.green(0) + 381, (char) (62388 - (android.view.ViewConfiguration.getEdgeSlop() >> 16)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c((short) 0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(DigitizedCardProfile), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.alpha(0), 3966 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 212 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $11 + 113;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.graphics.ImageFormat.getBitsPerPixel(0), 213 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 35, 212 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.text.TextUtils.indexOf("", ""))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.TemporaryDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> insert(final com.payair.hce.setZ... setzArr) {
        com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Long>> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.util.List<java.lang.Long>>() { // from class: com.payair.hce.TemporaryDataDao_Impl.4
            private static int DigitizedCardProfile = 0;
            private static int valueOf = 1;

            public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                int i6 = i4 | i5;
                int i7 = ~i3;
                if ((i * (-919)) + (i2 * (-919)) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 920) + (((~i6) | (~(i4 | i7))) * 920) + (((~(i | i5 | i3)) | (~(i2 | i4 | i3)) | (~(i6 | i7))) * 920) != 1) {
                    return writeReplace(objArr);
                }
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass4 anonymousClass4 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass4) objArr[0];
                int i8 = valueOf;
                DigitizedCardProfile = ((i8 ^ 35) + ((i8 & 35) << 1)) % 128;
                java.util.List list = (java.util.List) DigitizedCardProfile(new java.lang.Object[]{anonymousClass4}, -2107532781, 2107532781, java.lang.System.identityHashCode(anonymousClass4));
                int i9 = valueOf;
                int i10 = i9 & 89;
                int i11 = (i9 ^ 89) | i10;
                DigitizedCardProfile = (((i10 | i11) << 1) - (i11 ^ i10)) % 128;
                return list;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass4 anonymousClass4 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass4) objArr[0];
                int i = valueOf;
                int i2 = i & 23;
                int i3 = (i2 - (~((i ^ 23) | i2))) - 1;
                DigitizedCardProfile = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        com.payair.hce.TemporaryDataDao_Impl.this.__db.beginTransaction();
                        java.util.List<java.lang.Long> insertAndReturnIdsList = com.payair.hce.TemporaryDataDao_Impl.this.__insertionAdapterOfTemporaryData.insertAndReturnIdsList(setzArr);
                        com.payair.hce.TemporaryDataDao_Impl.this.__db.setTransactionSuccessful();
                        com.payair.hce.TemporaryDataDao_Impl.this.__db.endTransaction();
                        int i4 = DigitizedCardProfile;
                        int i5 = i4 & 51;
                        int i6 = (i4 | 51) & (~i5);
                        int i7 = -(-(i5 << 1));
                        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                        valueOf = i8 % 128;
                        if (i8 % 2 != 0) {
                            return insertAndReturnIdsList;
                        }
                        throw null;
                    }
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.beginTransaction();
                    com.payair.hce.TemporaryDataDao_Impl.this.__insertionAdapterOfTemporaryData.insertAndReturnIdsList(setzArr);
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.setTransactionSuccessful();
                    throw null;
                } finally {
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.endTransaction();
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<java.lang.Long>] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.util.List<java.lang.Long> call() throws java.lang.Exception {
                ?? DigitizedCardProfile2 = DigitizedCardProfile(new java.lang.Object[]{this}, -1781523430, 1781523431, java.lang.System.identityHashCode(this));
                return DigitizedCardProfile2;
            }

            private java.util.List<java.lang.Long> DigitizedCardProfile() throws java.lang.Exception {
                return (java.util.List) DigitizedCardProfile(new java.lang.Object[]{this}, -2107532781, 2107532781, java.lang.System.identityHashCode(this));
            }
        });
        int i = valueOf;
        int i2 = (i & 2) + (i | 2);
        int i3 = (~i2) + (i2 << 1);
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return createListenableFuture;
        }
        throw null;
    }

    @Override // com.payair.hce.TemporaryDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> delete(final com.payair.hce.setZ setz) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.lang.Integer>() { // from class: com.payair.hce.TemporaryDataDao_Impl.3
            private static int DigitizedCardProfile = 0;
            private static int writeReplace = 1;

            public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i;
                int i5 = ~i2;
                return ((((i * 592) + (i2 * (-590))) + ((~(i4 | i2)) * (-1182))) + (((~(i | i2)) | (~((i4 | i5) | (~i3)))) * (-591))) + (((i3 | i4) | i5) * 591) != 1 ? values(objArr) : valueOf(objArr);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass3 anonymousClass3 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass3) objArr[0];
                int i = DigitizedCardProfile;
                int i2 = ((i ^ 89) | (i & 89)) << 1;
                int i3 = -((i & (-90)) | ((~i) & 89));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                writeReplace = i4 % 128;
                int i5 = i4 % 2;
                java.lang.Integer num = (java.lang.Integer) valueOf(new java.lang.Object[]{anonymousClass3}, -726604181, 726604181, java.lang.System.identityHashCode(anonymousClass3));
                if (i5 != 0) {
                    return num;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass3 anonymousClass3 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass3) objArr[0];
                int i = DigitizedCardProfile;
                int i2 = i & 119;
                int i3 = (i | 119) & (~i2);
                int i4 = i2 << 1;
                writeReplace = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
                com.payair.hce.TemporaryDataDao_Impl.this.__db.beginTransaction();
                try {
                    int handle = com.payair.hce.TemporaryDataDao_Impl.this.__deletionAdapterOfTemporaryData.handle(setz);
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.setTransactionSuccessful();
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.endTransaction();
                    DigitizedCardProfile = (writeReplace + 81) % 128;
                    return java.lang.Integer.valueOf((handle << 1) - handle);
                } catch (java.lang.Throwable th) {
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.endTransaction();
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
                ?? valueOf2 = valueOf(new java.lang.Object[]{this}, -1291077673, 1291077674, java.lang.System.identityHashCode(this));
                return valueOf2;
            }

            private java.lang.Integer valueOf() throws java.lang.Exception {
                return (java.lang.Integer) valueOf(new java.lang.Object[]{this}, -726604181, 726604181, java.lang.System.identityHashCode(this));
            }
        });
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i | 29;
        valueOf = ((i2 << 1) - ((~(i & 29)) & i2)) % 128;
        return createListenableFuture;
    }

    @Override // com.payair.hce.TemporaryDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> deleteAll() {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, true, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.lang.Integer>() { // from class: com.payair.hce.TemporaryDataDao_Impl.10
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int DigitizedCardProfile;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                return ((((i * 960) + (i2 * (-1917))) + (((~(i4 | i5)) | (~(i | i3))) * 959)) + (i4 * (-959))) + (((~(i | i5)) | (~(i4 | i3))) * 959) != 1 ? writeReplace(objArr) : valueOf(objArr);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass10 anonymousClass10 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass10) objArr[0];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = i & 83;
                int i3 = (i | 83) & (~i2);
                int i4 = i2 << 1;
                DigitizedCardProfile = ((i3 & i4) + (i3 | i4)) % 128;
                java.lang.Integer num = (java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass10}, 1320836654, -1320836654, java.lang.System.identityHashCode(anonymousClass10));
                int i5 = AlternateContactlessPaymentDataJson;
                int i6 = i5 ^ 113;
                int i7 = ((((i5 & 113) | i6) << 1) - (~(-i6))) - 1;
                DigitizedCardProfile = i7 % 128;
                if (i7 % 2 == 0) {
                    return num;
                }
                throw null;
            }

            private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass10 anonymousClass10 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass10) objArr[0];
                int i = DigitizedCardProfile;
                int i2 = i ^ 33;
                int i3 = ((i & 33) | i2) << 1;
                int i4 = -i2;
                AlternateContactlessPaymentDataJson = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                androidx.database.db.SupportSQLiteStatement acquire = com.payair.hce.TemporaryDataDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    com.payair.hce.TemporaryDataDao_Impl.this.__db.beginTransaction();
                    try {
                        int executeUpdateDelete = acquire.executeUpdateDelete();
                        com.payair.hce.TemporaryDataDao_Impl.this.__db.setTransactionSuccessful();
                        com.payair.hce.TemporaryDataDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                        int i5 = DigitizedCardProfile;
                        int i6 = (((i5 ^ 67) | (i5 & 67)) << 1) - ((i5 & (-68)) | ((~i5) & 67));
                        AlternateContactlessPaymentDataJson = i6 % 128;
                        if (i6 % 2 != 0) {
                            return java.lang.Integer.valueOf(executeUpdateDelete);
                        }
                        throw null;
                    } finally {
                        com.payair.hce.TemporaryDataDao_Impl.this.__db.endTransaction();
                    }
                } catch (java.lang.Throwable th) {
                    com.payair.hce.TemporaryDataDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Integer call() throws java.lang.Exception {
                ?? AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1630497526, -1630497525, java.lang.System.identityHashCode(this));
                return AlternateContactlessPaymentDataJson2;
            }

            private java.lang.Integer values() throws java.lang.Exception {
                return (java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1320836654, -1320836654, java.lang.System.identityHashCode(this));
            }
        });
        int i = valueOf;
        int i2 = i & 77;
        int i3 = (i | 77) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return createListenableFuture;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.TemporaryDataDao
    public final com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setZ>> getAll() {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM temporaryData", 0);
        final android.os.CancellationSignal createCancellationSignal = androidx.room.util.DBUtil.createCancellationSignal();
        com.google.common.util.concurrent.ListenableFuture<java.util.List<com.payair.hce.setZ>> createListenableFuture = androidx.room.guava.GuavaRoom.createListenableFuture(this.__db, false, (java.util.concurrent.Callable) new java.util.concurrent.Callable<java.util.List<com.payair.hce.setZ>>() { // from class: com.payair.hce.TemporaryDataDao_Impl.7
            private static int AlternateContactlessPaymentDataJson = 0;
            private static int values = 1;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
                int i4 = ~i2;
                int i5 = ~i3;
                if ((i * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + (i2 * (-987)) + (((~(i4 | i5 | i)) | (~(i | i2 | i3))) * 988) + ((i | i4) * (-988)) + (((~((~i) | i4)) | (~(i3 | i4)) | (~(i2 | i5 | i))) * 988) != 1) {
                    return AlternateContactlessPaymentDataJson(objArr);
                }
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass7 anonymousClass7 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass7) objArr[0];
                int i6 = values;
                int i7 = i6 & 107;
                int i8 = (i6 ^ 107) | i7;
                AlternateContactlessPaymentDataJson = ((i7 ^ i8) + ((i8 & i7) << 1)) % 128;
                java.util.List list = (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{anonymousClass7}, 969929465, -969929465, java.lang.System.identityHashCode(anonymousClass7));
                int i9 = values;
                int i10 = i9 & 89;
                AlternateContactlessPaymentDataJson = (((i9 | 89) & (~i10)) + (i10 << 1)) % 128;
                return list;
            }

            private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
                java.lang.String string;
                com.payair.hce.TemporaryDataDao_Impl.AnonymousClass7 anonymousClass7 = (com.payair.hce.TemporaryDataDao_Impl.AnonymousClass7) objArr[0];
                android.database.Cursor query = androidx.room.util.DBUtil.query(com.payair.hce.TemporaryDataDao_Impl.this.__db, acquire, false, createCancellationSignal);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "authenticationReference");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "authenticationReferenceForCheckout");
                    java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                    AlternateContactlessPaymentDataJson = (values + 103) % 128;
                    while (query.moveToNext()) {
                        com.payair.hce.setZ setz = new com.payair.hce.setZ();
                        int i = query.getInt(columnIndexOrThrow);
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, java.lang.Integer.valueOf(i)}, 1948378219, -1948378219, i);
                        java.lang.String str = null;
                        if (query.isNull(columnIndexOrThrow2)) {
                            int i2 = AlternateContactlessPaymentDataJson + 29;
                            int i3 = i2 % 128;
                            values = i3;
                            if (i2 % 2 == 0) {
                                throw new java.lang.NullPointerException();
                            }
                            int i4 = i3 ^ 23;
                            int i5 = -(-((i3 & 23) << 1));
                            AlternateContactlessPaymentDataJson = ((i4 ^ i5) + ((i4 & i5) << 1)) % 128;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow2);
                            int i6 = values;
                            int i7 = ((i6 ^ 105) - (~((i6 & 105) << 1))) - 1;
                            AlternateContactlessPaymentDataJson = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 4 / 2;
                            }
                        }
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, string}, 1625632204, -1625632201, java.lang.System.identityHashCode(setz));
                        if (query.isNull(columnIndexOrThrow3)) {
                            int i9 = (values + 47) % 128;
                            AlternateContactlessPaymentDataJson = i9;
                            values = ((((i9 & (-116)) | ((~i9) & 115)) - (~(-(-((i9 & 115) << 1))))) - 1) % 128;
                        } else {
                            str = query.getString(columnIndexOrThrow3);
                            int i10 = values;
                            int i11 = i10 & 91;
                            int i12 = ((i10 ^ 91) | i11) << 1;
                            int i13 = -((i10 | 91) & (~i11));
                            AlternateContactlessPaymentDataJson = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                        }
                        com.payair.hce.setZ.values(new java.lang.Object[]{setz, str}, 12451017, -12451012, java.lang.System.identityHashCode(setz));
                        arrayList.add(setz);
                        int i14 = AlternateContactlessPaymentDataJson;
                        values = (((i14 & 6) + (i14 | 6)) - 1) % 128;
                    }
                    query.close();
                    int i15 = values;
                    int i16 = (i15 | 53) << 1;
                    int i17 = -((i15 & (-54)) | ((~i15) & 53));
                    AlternateContactlessPaymentDataJson = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    query.close();
                    throw th;
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<com.payair.hce.setZ>] */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.util.List<com.payair.hce.setZ> call() throws java.lang.Exception {
                ?? AlternateContactlessPaymentDataJson2 = AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1191105548, -1191105547, java.lang.System.identityHashCode(this));
                return AlternateContactlessPaymentDataJson2;
            }

            private java.util.List<com.payair.hce.setZ> values() throws java.lang.Exception {
                return (java.util.List) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 969929465, -969929465, java.lang.System.identityHashCode(this));
            }
        }, acquire, true, createCancellationSignal);
        int i = valueOf;
        int i2 = (i | 67) << 1;
        int i3 = -((i & (-68)) | ((~i) & 67));
        AlternateContactlessPaymentDataJson = ((i2 & i3) + (i3 | i2)) % 128;
        return createListenableFuture;
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        java.util.List<java.lang.Class<?>> emptyList = java.util.Collections.emptyList();
        int i = valueOf;
        int i2 = ((i & 86) + (i | 86)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            return emptyList;
        }
        throw null;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        valueOf = 1;
        values = new char[]{18011, 39001, 64070, 56351, 15920, 4159, 29381, 21757, 46743, 34968, 60033, 52565, 12156, 356, 25351, 17721, 42950, 63951, 56294, 24280, 32982, 58102, 50323, 9894, 2233, 27224, 19521, 44544, 36869, 61979, 54722, 14317, 6626, 31640, 23968, 48970, 57669, 24270, 32985, 58107, 50325, 9888, 2238, 27227, 19497, 44544, 36868, 62065, 54755, 14314, 6645, 31626, 23968, 7124, 50576, 42930, 33216, 25524, 19944, 12046, 2337, 60245, 54598, 46951, 37084, 29375, 23718, 16073, 6374, 64028, 42060, 34367, 24641, 17018, 11360, 3458, 61373, 51676, 43916, 38376, 30470, 20777, 13105, 7502, 65405, 55439, 47804, 25791, 18113, 8442, 736, 60430, 52769, 24257, 32984, 58095, 24192, 32967, 58093, 50312, 9900, 2296, 27212, 19582, 44572, 36952, 62004, 54722, 14333, 6649, 31642, 23979, 48896, 57681, 50027, 9493, 1838, 26932, 18650, 43736, 35978, 61081, 53438, 12869, 5219, 30322, 22555, 26031, 31048, 42764, 50478, 58204, 296, 12148, 19858, 27581, 35273, 47066, 54779, 62016, 4131, 15930, 23637, 31354, 39040, 50896, 58531, 733, 8422, 20220, 28446, 36129, 43840, 51472, 63331, 5533, 13222, 20924, 32734, 40417, 47616, 55328, 1592, 9281};
        DigitizedCardProfile = -2802909595584855881L;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.ESC, -102, com.google.common.base.Ascii.SI, 46};
        $$e = 192;
    }

    static void init$0() {
        $$a = new byte[]{16, 120, -82, 58, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 150;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:(2:42|43)|(1:45)(4:96|97|98|(11:100|101|47|48|(1:50)(5:61|62|63|64|(2:66|(1:68)(6:69|70|71|72|73|(2:75|(1:(6:78|79|(1:81)|82|83|84))(2:85|86)))))|51|52|(1:54)|55|56|(1:58)(2:59|60))(1:102))|46|47|48|(0)(0)|51|52|(0)|55|56|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x041f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0420 A[Catch: all -> 0x0c7e, TRY_ENTER, TryCatch #8 {all -> 0x0c7e, blocks: (B:26:0x0420, B:28:0x042f, B:29:0x0470, B:33:0x0510, B:35:0x055f, B:36:0x05b3, B:79:0x0ad2, B:81:0x0b1d, B:82:0x0b72, B:52:0x0bb2, B:54:0x0c00, B:55:0x0c55, B:109:0x05e1, B:111:0x0624, B:112:0x0674, B:139:0x036a, B:141:0x03af, B:142:0x0401, B:3:0x0010, B:7:0x010b, B:12:0x0187, B:20:0x0254, B:116:0x025e, B:118:0x0264, B:119:0x0265, B:122:0x0275, B:130:0x032f, B:134:0x0345, B:136:0x034b, B:137:0x034c, B:125:0x0293, B:127:0x02d3, B:128:0x0321, B:15:0x01a7, B:17:0x01f8, B:18:0x0246), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0c00 A[Catch: all -> 0x0c7e, TryCatch #8 {all -> 0x0c7e, blocks: (B:26:0x0420, B:28:0x042f, B:29:0x0470, B:33:0x0510, B:35:0x055f, B:36:0x05b3, B:79:0x0ad2, B:81:0x0b1d, B:82:0x0b72, B:52:0x0bb2, B:54:0x0c00, B:55:0x0c55, B:109:0x05e1, B:111:0x0624, B:112:0x0674, B:139:0x036a, B:141:0x03af, B:142:0x0401, B:3:0x0010, B:7:0x010b, B:12:0x0187, B:20:0x0254, B:116:0x025e, B:118:0x0264, B:119:0x0265, B:122:0x0275, B:130:0x032f, B:134:0x0345, B:136:0x034b, B:137:0x034c, B:125:0x0293, B:127:0x02d3, B:128:0x0321, B:15:0x01a7, B:17:0x01f8, B:18:0x0246), top: B:2:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0c7b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x07fb A[Catch: Exception -> 0x0b9a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0b9a, blocks: (B:48:0x07b6, B:61:0x07fb, B:64:0x092c, B:66:0x0934, B:69:0x09f2, B:72:0x0a9b, B:89:0x0b8b, B:90:0x0b91, B:93:0x0b93, B:94:0x0b99, B:63:0x0805, B:71:0x09fc), top: B:47:0x07b6, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(int i, int i2) {
        int i3;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        char c;
        java.lang.String str;
        java.lang.Object obj;
        int i4;
        java.io.File file;
        java.io.File file2;
        java.lang.String[] strArr;
        int i5;
        int i6;
        valueOf = (AlternateContactlessPaymentDataJson + 15) % 128;
        int i7 = 2;
        int i8 = 0;
        try {
            try {
                int i9 = -(-android.graphics.ImageFormat.getBitsPerPixel(0));
                int i10 = -android.widget.ExpandableListView.getPackedPositionType(0L);
                int i11 = -(android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i12 = i11 * 85;
                int i13 = ~i11;
                int i14 = ~(i13 | (-6303));
                i5 = ~i;
                int i15 = ~((i13 ^ i5) | (i13 & i5));
                int i16 = (i14 ^ i15) | (i15 & i14);
                int i17 = ~((i5 ^ (-6303)) | (i5 & (-6303)));
                int i18 = (i16 & i17) | (i16 ^ i17);
                int i19 = (i11 ^ 6302) | (i11 & 6302);
                int i20 = ~((i19 ^ i) | (i19 & i));
                int i21 = ~((i & (-6303)) | (i ^ (-6303)));
                int i22 = (i21 ^ i11) | (i21 & i11);
                int i23 = ~((i5 ^ 6302) | (i5 & 6302));
                int i24 = ((((((535670 | i12) << 1) - (i12 ^ 535670)) - (~(((i18 & i20) | (i18 ^ i20)) * (-84)))) - 1) - (~(-(-(((i22 & i23) | (i22 ^ i23)) * (-84)))))) - 1;
                int i25 = ~i19;
                int i26 = ((i25 ^ i23) | (i23 & i25)) * 84;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(((i9 | 1) << 1) - (i9 ^ 1), 18 - (~i10), (char) (((i24 | i26) << 1) - (i26 ^ i24)), objArr3);
                int i27 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                int i28 = (i27 * 236) + 8949;
                int i29 = ~i27;
                int i30 = ~((i29 ^ i5) | (i29 & i5));
                int i31 = ((i30 ^ 19) | (i30 & 19)) * (-235);
                int i32 = (i28 & i31) + (i28 | i31);
                int i33 = ((~((i29 ^ i) | (i29 & i))) | 19) * (-470);
                int i34 = ~((i27 ^ (-20)) | (i27 & (-20)));
                int i35 = ~((i29 & 19) | (i29 ^ 19) | i);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a((((i32 ^ i33) + ((i33 & i32) << 1)) - (~(-(-(((i34 ^ i35) | (i34 & i35)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))))) - 1, android.view.View.resolveSize(0, 0) + 18, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                strArr = new java.lang.String[]{(java.lang.String) objArr3[0], (java.lang.String) objArr4[0]};
                i6 = 0;
            } catch (java.lang.Exception unused) {
                int i36 = ~i;
                java.lang.Object[] objArr5 = {new int[]{i}, new int[]{(i & (-3)) | (i36 & 2)}, null, new int[1]};
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(873339034 | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1986026120) + (((-64087845) | i36) * (-216)) + (((~(i36 | 873339034)) | 131589950) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), android.view.View.MeasureSpec.getMode(0) + 2713, (char) ((-1) - android.os.Process.getGidForName("")));
                    byte b = (byte) (-$$a[14]);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b, b, (byte) (b - 1), objArr7);
                    obj2 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                i3 = 0;
                ((int[]) objArr5[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr6)).intValue();
                objArr = objArr5;
            }
            try {
                while (i6 < i7) {
                    int i37 = valueOf;
                    AlternateContactlessPaymentDataJson = ((i37 ^ 117) + ((i37 & 117) << 1)) % 128;
                    java.lang.String str2 = strArr[i6];
                    int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                    int i38 = (maximumFlingVelocity * (-523)) + 9731;
                    int i39 = ~maximumFlingVelocity;
                    int i40 = ~((maximumFlingVelocity & (-38)) | (maximumFlingVelocity ^ (-38)));
                    int i41 = ((~((i39 ^ 37) | (i39 & 37))) | i40 | (~((i ^ (-38)) | (i & (-38))))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
                    int i42 = ~((i5 ^ (-38)) | (i5 & (-38)));
                    int offsetAfter = android.text.TextUtils.getOffsetAfter("", i8);
                    char deadChar = (char) android.view.KeyEvent.getDeadChar(i8, i8);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((((((i38 & i41) + (i38 | i41)) - (~(-(-(i40 * (-786)))))) - 1) - (~((i40 | ((i42 & r9) | (r9 ^ i42))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) - 1, 16 - offsetAfter, deadChar, objArr8);
                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr8[0]);
                    if (((java.lang.Boolean) cls2.getMethod(str2, new java.lang.Class[0]).invoke(cls2, null)).booleanValue()) {
                        AlternateContactlessPaymentDataJson = (valueOf + 121) % 128;
                        objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                        try {
                            java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((583099648 | i5) * (-192)) + 677765592 + (((~((-354720429) | i5)) | 67108908) * (-384)) + (((~((-67108909) | i)) | (~(i5 | (-287611521))) | (~(937820076 | i))) * 192))};
                            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj3 == null) {
                                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) android.view.KeyEvent.normalizeMetaState(0));
                                byte b2 = (byte) (-$$a[14]);
                                java.lang.Object[] objArr10 = new java.lang.Object[1];
                                b(b2, b2, (byte) (b2 - 1), objArr10);
                                obj3 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                            }
                            ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr9)).intValue();
                            i3 = 0;
                            if (i == ((int[]) objArr[1])[i3]) {
                                return objArr;
                            }
                            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(218021890);
                            if (obj4 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", i3, i3) + 28, android.view.View.getDefaultSize(i3, i3) + 2391, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i3, i3) + 29421));
                                byte b3 = $$a[14];
                                byte b4 = (byte) (b3 + 1);
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                b(b4, b4, (byte) (-b3), objArr11);
                                obj4 = cls4.getMethod((java.lang.String) objArr11[0], null);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(218021890, obj4);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, null)).longValue();
                            long j = ~((-242799164) | longValue);
                            long j2 = ~longValue;
                            long j3 = ~(242799163 | j2);
                            long j4 = i;
                            long j5 = ((longValue * 263) - 126983962249L) + (((~(j2 | j4)) | j | j3) * 262) + ((-786) * j3) + (((~((~j4) | j2)) | j | j3) * 262) + 39284933;
                            int i43 = (int) (j5 >> 32);
                            int i44 = ~i;
                            if (((i43 & (((((~(370397678 | i44)) | (-1807624090)) * (-983)) - 1420008420) + (((~((-1807624090) | i44)) | 34734472) * 983))) | (((int) j5) & (((r4 * 495) - 1763596226) + (((~(666110970 | i44)) | 44042842) * 495)))) == 1) {
                                int i45 = valueOf;
                                AlternateContactlessPaymentDataJson = (((i45 | 117) << 1) - (i45 ^ 117)) % 128;
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{(i & (-11)) | (i44 & 10)}, null, new int[1]};
                                java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((901166264 | i) * 140) - 571642856) + (((~(901166264 | i44)) | 34163456) * (-280)) + (((~(103762720 | i44)) | 831567000 | (~((-34163457) | i))) * 140))};
                                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj5 == null) {
                                    java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                                    byte b5 = (byte) (-$$a[14]);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    b(b5, b5, (byte) (b5 - 1), objArr13);
                                    obj5 = cls5.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                                }
                                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr12)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue;
                            } else {
                                objArr2 = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                                java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-435011790) | i)) | 31981577) * 104) - 428470248) + ((~(972947407 | i44)) * (-104)) + ((569917195 | i) * 104))};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj6 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 2713 - android.text.TextUtils.indexOf("", ""), (char) android.text.TextUtils.indexOf("", "", 0));
                                    byte b6 = (byte) (-$$a[14]);
                                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                                    b(b6, b6, (byte) (b6 - 1), objArr15);
                                    obj6 = cls6.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                }
                                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr14)).intValue();
                                c = 0;
                                ((int[]) objArr2[3])[0] = intValue2;
                            }
                            if (i != ((int[]) objArr2[1])[c]) {
                                int i46 = AlternateContactlessPaymentDataJson;
                                valueOf = ((i46 ^ 7) + ((i46 & 7) << 1)) % 128;
                                return objArr2;
                            }
                            try {
                                long currentThreadTimeMillis = android.os.SystemClock.currentThreadTimeMillis();
                                int i47 = -android.os.Process.getGidForName("");
                                int i48 = (i47 * 615) - 23907;
                                int i49 = ~i47;
                                int i50 = ~((i49 & 39) | (i49 ^ 39));
                                int i51 = -(-(((i50 & i) | (i ^ i50) | (~(i47 | (-40)))) * 614));
                                int i52 = ((i48 | i51) << 1) - (i48 ^ i51);
                                int i53 = (~(i49 | i44)) | i50;
                                int i54 = ~((i44 & 39) | (i44 ^ 39));
                                int i55 = -(-(((i53 ^ i54) | (i54 & i53)) * (-1228)));
                                int i56 = (i52 ^ i55) + ((i55 & i52) << 1);
                                int i57 = (i47 ^ i44) | (i47 & i44);
                                int i58 = -(-(((~((i57 ^ 39) | (i57 & 39))) | (~(i49 | (-40) | i44))) * 614));
                                java.lang.Object[] objArr16 = new java.lang.Object[1];
                                a((currentThreadTimeMillis > (-1L) ? 1 : (currentThreadTimeMillis == (-1L) ? 0 : -1)) + 52, ((i56 | i58) << 1) - (i58 ^ i56), (char) (17746 - (~(-((byte) android.view.KeyEvent.getModifierMetaStateMask())))), objArr16);
                                file2 = new java.io.File((java.lang.String) objArr16[0]);
                            } catch (java.lang.Exception unused2) {
                            }
                            if (file2.canRead()) {
                                java.io.FileReader fileReader = new java.io.FileReader(file2);
                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(fileReader);
                                try {
                                    str = bufferedReader.readLine();
                                    int i59 = -(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int i60 = ~i59;
                                    int i61 = ~(i60 | (-95));
                                    int i62 = ~((i44 ^ (-95)) | (i44 & (-95)));
                                    int i63 = ((i59 * (-167)) - 15698) + (((i61 ^ i62) | (i61 & i62)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                                    int i64 = -(-((~((i60 ^ (-95)) | (i60 & (-95)) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE));
                                    int i65 = ~(i60 | i44);
                                    int i66 = ~((i60 ^ 94) | (i60 & 94));
                                    int i67 = (i66 ^ i65) | (i65 & i66);
                                    int i68 = ~((i59 ^ (-95)) | (i59 & (-95)) | i);
                                    int i69 = -(-android.text.TextUtils.indexOf("", ""));
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a((((i63 ^ i64) + ((i64 & i63) << 1)) - (~(((i68 ^ i67) | (i68 & i67)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))) - 1, (i69 ^ 3) + ((i69 & 3) << 1), (char) android.graphics.Color.argb(0, 0, 0, 0), objArr17);
                                    if (!str.equals((java.lang.String) objArr17[0])) {
                                        AlternateContactlessPaymentDataJson = (valueOf + 49) % 128;
                                        fileReader.close();
                                        bufferedReader.close();
                                        int maxKeyCode = android.view.KeyEvent.getMaxKeyCode() >> 16;
                                        int i70 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                                        a((maxKeyCode ^ 96) + ((maxKeyCode & 96) << 1), (i70 & 31) + (i70 | 31), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr18);
                                        file = new java.io.File((java.lang.String) objArr18[0]);
                                        if (file.canRead()) {
                                            int i71 = AlternateContactlessPaymentDataJson;
                                            valueOf = ((i71 ^ 13) + ((i71 & 13) << 1)) % 128;
                                        } else {
                                            try {
                                                java.lang.String readLine = new java.io.BufferedReader(new java.io.FileReader(file)).readLine();
                                                int i72 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                int i73 = ~i72;
                                                int i74 = (i73 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i73 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                int i75 = ((((i72 * (-317)) + 40513) + (((~((i74 ^ i) | (i74 & i))) | (~((i44 | i72) | 127))) * (-318))) - (~(-(-(((~((i72 ^ i) | (i72 & i))) | (~(i72 | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * (-318)))))) - 1;
                                                int i76 = -(-(((~((i73 ^ i) | (i73 & i))) | androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) * 318));
                                                int indexOf = android.text.TextUtils.indexOf("", "");
                                                int i77 = indexOf * (-1529);
                                                int i78 = ~indexOf;
                                                int i79 = (i78 ^ (-2)) | (i78 & (-2));
                                                int i80 = ~(i79 | i44);
                                                int i81 = ~((i78 ^ 1) | (i78 & 1) | i);
                                                int i82 = (i80 ^ i81) | (i80 & i81);
                                                int i83 = (indexOf ^ (-2)) | (indexOf & (-2));
                                                int i84 = ~((i83 ^ i) | (i83 & i));
                                                int i85 = (i77 ^ (-764)) + ((i77 & (-764)) << 1) + (((i82 ^ i84) | (i82 & i84)) * 765);
                                                int i86 = ~i79;
                                                int i87 = ~((i78 & i44) | (i78 ^ i44));
                                                int i88 = ((i86 ^ i87) | (i87 & i86)) * 1530;
                                                int i89 = (i85 ^ i88) + ((i88 & i85) << 1);
                                                int i90 = ~((i78 ^ i) | (i78 & i));
                                                int i91 = (i44 ^ (-2)) | (i44 & (-2));
                                                int i92 = ~((indexOf ^ i91) | (indexOf & i91));
                                                int i93 = ((i92 ^ i90) | (i92 & i90)) * 765;
                                                int i94 = -(android.view.ViewConfiguration.getScrollBarSize() >> 8);
                                                int i95 = i94 * 569;
                                                int i96 = ~i94;
                                                java.lang.String str3 = str;
                                                int i97 = (8622057 ^ i95) + ((i95 & 8622057) << 1) + (((~((i44 & (-15154)) | (i44 ^ (-15154)))) | (~((i96 & (-15154)) | (i96 ^ (-15154)))) | (~((i96 ^ i44) | (i96 & i44)))) * (-1136));
                                                int i98 = ~((i96 ^ i) | (i96 & i));
                                                int i99 = ~((i ^ (-15154)) | (i & (-15154)));
                                                int i100 = (i98 ^ i99) | (i98 & i99);
                                                int i101 = ~(i44 | i94 | 15153);
                                                int i102 = -(-(((i100 ^ i101) | (i100 & i101)) * (-568)));
                                                int i103 = ~((i94 ^ i44) | (i94 & i44));
                                                int i104 = ~((i44 ^ 15153) | (i44 & 15153));
                                                int i105 = (i103 ^ i104) | (i103 & i104);
                                                int i106 = i96 | (-15154);
                                                int i107 = ~((i106 ^ i) | (i106 & i));
                                                char c2 = (char) ((i97 & i102) + (i102 | i97) + (((i105 & i107) | (i105 ^ i107)) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION));
                                                java.lang.Object[] objArr19 = new java.lang.Object[1];
                                                a((i75 ^ i76) + ((i76 & i75) << 1), (i89 ^ i93) + ((i93 & i89) << 1), c2, objArr19);
                                                if (readLine.equals((java.lang.String) objArr19[0])) {
                                                    int i108 = -android.view.MotionEvent.axisFromString("");
                                                    int i109 = i108 * 628;
                                                    int i110 = (79756 & i109) + (i109 | 79756);
                                                    int i111 = (i ^ 127) | (i & 127);
                                                    int i112 = ~i108;
                                                    int i113 = ((i111 ^ i112) | (i111 & i112)) * (-627);
                                                    int i114 = ~((i ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                    int i115 = (((i110 & i113) + (i113 | i110)) - (~(((i114 & i108) | (i108 ^ i114)) * (-627)))) - 1;
                                                    int i116 = ((~((i108 ^ i) | (i108 & i))) | (~((i44 ^ 127) | (i44 & 127)))) * 627;
                                                    int i117 = -(-android.graphics.Color.argb(0, 0, 0, 0));
                                                    int offsetAfter2 = android.text.TextUtils.getOffsetAfter("", 0);
                                                    int i118 = offsetAfter2 * 70;
                                                    int i119 = ((-692512) ^ i118) + ((i118 & (-692512)) << 1);
                                                    int i120 = ~offsetAfter2;
                                                    int i121 = i120 | (-10185);
                                                    int i122 = (offsetAfter2 ^ 10184) | (offsetAfter2 & 10184);
                                                    int i123 = -(-(((~((i121 ^ i) | (i121 & i))) | (~((i122 ^ i) | (i122 & i)))) * 69));
                                                    int i124 = ~((i120 ^ 10184) | (i120 & 10184));
                                                    int i125 = ~((i120 ^ i) | (i120 & i));
                                                    int i126 = (i125 ^ i124) | (i125 & i124);
                                                    int i127 = ~((i ^ 10184) | (i & 10184));
                                                    int i128 = (i119 ^ i123) + ((i119 & i123) << 1) + (((i126 ^ i127) | (i126 & i127)) * (-69));
                                                    int i129 = (~(offsetAfter2 | (-10185))) * 69;
                                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                    a(((i115 | i116) << 1) - (i116 ^ i115), (i117 ^ 36) + ((i117 & 36) << 1), (char) (((i128 | i129) << 1) - (i129 ^ i128)), objArr20);
                                                    java.io.File file3 = new java.io.File((java.lang.String) objArr20[0]);
                                                    if (file3.canRead()) {
                                                        try {
                                                            java.lang.String readLine2 = new java.io.BufferedReader(new java.io.FileReader(file3)).readLine();
                                                            int maximumFlingVelocity2 = android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16;
                                                            int i130 = maximumFlingVelocity2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE;
                                                            int i131 = (((-35814) | i130) << 1) - (i130 ^ (-35814));
                                                            int i132 = ~maximumFlingVelocity2;
                                                            int i133 = ~((i132 ^ 127) | (i132 & 127));
                                                            int i134 = ~(i132 | i);
                                                            int i135 = ((i133 ^ i134) | (i133 & i134)) * (-283);
                                                            int i136 = (((i131 ^ i135) + ((i131 & i135) << 1)) - (~((~((maximumFlingVelocity2 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (maximumFlingVelocity2 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT))) * 283))) - 1;
                                                            int i137 = -(-((~((i132 ^ androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i132 & androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | i)) * 283));
                                                            int mode = android.view.View.MeasureSpec.getMode(0);
                                                            int i138 = ~mode;
                                                            int i139 = ~(i44 | i138);
                                                            int i140 = ~((i138 ^ 1) | (i138 & 1));
                                                            int i141 = (i140 ^ i139) | (i139 & i140);
                                                            int i142 = (mode ^ (-2)) | (mode & (-2));
                                                            int i143 = ~((i142 ^ i) | (i142 & i));
                                                            int i144 = ((mode * 714) - 712) + (((i141 ^ i143) | (i141 & i143)) * (-713)) + (i143 * 1426);
                                                            int i145 = (~((i44 ^ (-2)) | (i44 & (-2)))) * 713;
                                                            int i146 = -(android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                                            a((i136 & i137) + (i137 | i136), (i144 ^ i145) + ((i145 & i144) << 1), (char) ((i146 ^ 15153) + ((i146 & 15153) << 1)), objArr21);
                                                            boolean equals = readLine2.equals((java.lang.String) objArr21[0]);
                                                            int i147 = (AlternateContactlessPaymentDataJson + 39) % 128;
                                                            valueOf = i147;
                                                            if (equals) {
                                                                int i148 = i147 + 65;
                                                                AlternateContactlessPaymentDataJson = i148 % 128;
                                                                if (i148 % 2 != 0) {
                                                                    throw null;
                                                                }
                                                                if (str3 != null) {
                                                                    java.lang.Object[] objArr22 = {new int[]{i}, new int[]{i ^ 20}, str3, new int[1]};
                                                                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~((-576764453) | i44)) | (~(803471294 | i))) * 988) + 181288372 + (((~(i | (-778222143))) | 201457690 | (~(i44 | 803471294))) * 988))};
                                                                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj7 == null) {
                                                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) android.text.TextUtils.indexOf("", ""));
                                                                        byte b7 = (byte) (-$$a[14]);
                                                                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                                                                        b(b7, b7, (byte) (b7 - 1), objArr24);
                                                                        obj7 = cls7.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                                                    }
                                                                    ((int[]) objArr22[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr23)).intValue();
                                                                    return objArr22;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                }
                                            } finally {
                                            }
                                        }
                                        java.lang.Object[] objArr25 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                        java.lang.Object[] objArr26 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(488480045 | i44)) | 516448939) * (-1042)) - 1603146426) + ((488480045 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | (-516448940))) | 470286377 | (~(i44 | 534642607))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, android.text.TextUtils.getCapsMode("", 0, 0) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                            byte b8 = (byte) (-$$a[14]);
                                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                                            b(b8, b8, (byte) (b8 - 1), objArr27);
                                            obj = cls8.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                                        }
                                        ((int[]) objArr25[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr26)).intValue();
                                        int i149 = AlternateContactlessPaymentDataJson;
                                        i4 = ((i149 | 41) << 1) - (i149 ^ 41);
                                        valueOf = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            return objArr25;
                                        }
                                        throw null;
                                    }
                                    fileReader.close();
                                    bufferedReader.close();
                                } finally {
                                }
                            }
                            str = null;
                            int maxKeyCode2 = android.view.KeyEvent.getMaxKeyCode() >> 16;
                            int i702 = -(android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                            a((maxKeyCode2 ^ 96) + ((maxKeyCode2 & 96) << 1), (i702 & 31) + (i702 | 31), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr182);
                            file = new java.io.File((java.lang.String) objArr182[0]);
                            if (file.canRead()) {
                            }
                            java.lang.Object[] objArr252 = {new int[]{i}, new int[]{i}, null, new int[1]};
                            java.lang.Object[] objArr262 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(488480045 | i44)) | 516448939) * (-1042)) - 1603146426) + ((488480045 | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(i | (-516448940))) | 470286377 | (~(i44 | 534642607))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj == null) {
                            }
                            ((int[]) objArr252[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr262)).intValue();
                            int i1492 = AlternateContactlessPaymentDataJson;
                            i4 = ((i1492 | 41) << 1) - (i1492 ^ 41);
                            valueOf = i4 % 128;
                            if (i4 % 2 == 0) {
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        i6++;
                        valueOf = (AlternateContactlessPaymentDataJson + 45) % 128;
                        i7 = 2;
                        i8 = 0;
                    }
                }
                java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(867385238 | i5)) | (-1001652183)) * (-160)) - 1688314952) + (((~((-137543747) | i5)) | 867385238) * 160))};
                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj8 == null) {
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777266, 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) android.graphics.Color.alpha(0));
                    byte b9 = (byte) (-$$a[14]);
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    b(b9, b9, (byte) (b9 - 1), objArr29);
                    obj8 = cls9.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
                int i150 = AlternateContactlessPaymentDataJson;
                valueOf = ((i150 & 101) + (i150 | 101)) % 128;
                i3 = 0;
                if (i == ((int[]) objArr[1])[i3]) {
                }
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
            objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
        } catch (java.lang.Throwable th3) {
            java.lang.Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }
}
