package com.payair.hce;

/* loaded from: classes4.dex */
public final class setContentDescription implements com.payair.hce.checkUriPermissions {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] DigitizedCardProfile;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private static long valueOf;
    private static int writeReplace;
    private com.payair.hce.setLabelFor AlternateContactlessPaymentDataJson;
    private final com.payair.hce.ResponseCompleteTokenizeDto values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b + 4;
        int i4 = 99 - (s * 4);
        int i5 = i * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = i6;
            int i9 = 0;
            int i10 = i3 + i8;
            i2 = i9;
            int i11 = i7;
            i4 = i10;
            i3 = i11;
            int i12 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i4;
            i7 = i12;
            i3 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = i3 + i8;
            i2 = i9;
            int i112 = i7;
            i4 = i102;
            i3 = i112;
            int i122 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i3 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    public setContentDescription(com.payair.hce.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
        this.values = responseCompleteTokenizeDto;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0391, code lost:
    
        com.payair.hce.setLabelFor.DigitizedCardProfile(r9, r31.AlternateContactlessPaymentDataJson.values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x039f, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03fe, code lost:
    
        com.payair.hce.setLabelFor.DigitizedCardProfile(r9, r31.AlternateContactlessPaymentDataJson.values());
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x040c, code lost:
    
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x06b2 A[LOOP:2: B:49:0x0335->B:62:0x06b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.payair.hce.checkUriPermissions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x_(android.database.sqlite.SQLiteDatabase sQLiteDatabase, android.content.Context context, com.payair.hce.getDetailedMessage getdetailedmessage) {
        ?? r6;
        java.lang.String writeReplace2;
        int i;
        android.database.sqlite.SQLiteStatement compileStatement;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        java.lang.Throwable e;
        long executeInsert;
        byte[] blob;
        java.lang.String string;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] blob2;
        int i2;
        int i3;
        long executeInsert2;
        this.AlternateContactlessPaymentDataJson = new com.payair.hce.setLabelFor(context, this.values, getdetailedmessage);
        int i4 = 87;
        char c = 0;
        writeReplace(87, (char) 0, 0).intern();
        android.database.Cursor rawQuery = sQLiteDatabase.rawQuery(writeReplace(87, (char) 0, 0).intern(), null);
        int i5 = 6;
        char c2 = 4972;
        int i6 = 2;
        if (rawQuery.moveToFirst()) {
            int count = rawQuery.getCount();
            com.payair.hce.setOnLongClickListener[] setonlongclicklistenerArr = new com.payair.hce.setOnLongClickListener[count];
            int i7 = 0;
            while (true) {
                try {
                    setonlongclicklistenerArr[i7] = new com.payair.hce.setOnLongClickListener(rawQuery.getString(rawQuery.getColumnIndex(writeReplace(7, c2, i4).intern())), rawQuery.getString(rawQuery.getColumnIndex(writeReplace(16, (char) 16273, 94).intern())), rawQuery.getString(rawQuery.getColumnIndex(writeReplace(15, (char) 0, 110).intern())), com.payair.hce.setLabelFor.DigitizedCardProfile(rawQuery.getBlob(rawQuery.getColumnIndex(writeReplace(16, (char) 54624, 125).intern())), this.AlternateContactlessPaymentDataJson.values()));
                    i7++;
                } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e2) {
                    e2.printStackTrace();
                }
                if (!rawQuery.moveToNext()) {
                    break;
                }
                i4 = 87;
                i5 = 6;
                c2 = 4972;
            }
            int i8 = SdkCoreAlternateContactlessPaymentDataImpl + 111;
            writeReplace = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = getAid + 7;
                getProfileVersion = i9 % 128;
                if (i9 % 2 != 0) {
                    rawQuery.close();
                    writeReplace2 = writeReplace(i5, (char) 0, 4860);
                    r6 = 0;
                } else {
                    rawQuery.close();
                    sQLiteDatabase.delete(writeReplace(12, (char) 0, 13314).intern(), null, null);
                    i = 1;
                    while (i < count) {
                        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 51) % 128;
                        com.payair.hce.setOnLongClickListener setonlongclicklistener = setonlongclicklistenerArr[i];
                        try {
                            compileStatement = sQLiteDatabase.compileStatement(writeReplace(110, (char) 0, 152).intern());
                            compileStatement.bindBlob(1, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnLongClickListener.values(new java.lang.Object[]{setonlongclicklistener}, -2088075802, 2088075802, java.lang.System.identityHashCode(setonlongclicklistener))));
                            compileStatement.bindString(2, setonlongclicklistener.AlternateContactlessPaymentDataJson());
                            compileStatement.bindString(3, setonlongclicklistener.valueOf());
                            compileStatement.bindString(4, setonlongclicklistener.DigitizedCardProfile());
                        } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e3) {
                            e3.printStackTrace();
                        }
                        if (compileStatement.executeInsert() == -1) {
                            throw new com.payair.hce.getAuthenticationMethods(writeReplace(30, (char) 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE).intern());
                        }
                        SdkCoreAlternateContactlessPaymentDataImpl = (writeReplace + 15) % 128;
                        i++;
                    }
                }
            } else {
                r6 = 0;
                rawQuery.close();
                writeReplace2 = writeReplace(11, (char) 0, 141);
            }
            sQLiteDatabase.delete(writeReplace2.intern(), r6, r6);
            i = 0;
            while (i < count) {
            }
        } else {
            int i10 = writeReplace + 51;
            SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
            if (i10 % 2 == 0) {
                rawQuery.close();
                throw null;
            }
            rawQuery.close();
        }
        android.database.Cursor rawQuery2 = sQLiteDatabase.rawQuery(writeReplace(80, (char) 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE).intern(), null);
        int count2 = rawQuery2.getCount();
        com.payair.hce.setOnScrollChangeListener[] setonscrollchangelistenerArr = new com.payair.hce.setOnScrollChangeListener[count2];
        if (rawQuery2.moveToFirst()) {
            int i11 = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getAid = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 0;
                do {
                    try {
                        setonscrollchangelistenerArr[i12] = new com.payair.hce.setOnScrollChangeListener(rawQuery2.getString(rawQuery2.getColumnIndex(writeReplace(7, (char) 4972, 87).intern())), com.payair.hce.setLabelFor.DigitizedCardProfile(rawQuery2.getBlob(rawQuery2.getColumnIndex(writeReplace(9, (char) 2897, 372).intern())), this.AlternateContactlessPaymentDataJson.values()), rawQuery2.getLong(rawQuery2.getColumnIndex(writeReplace(10, (char) 29429, 381).intern())), rawQuery2.getLong(rawQuery2.getColumnIndex(writeReplace(14, (char) 6851, 391).intern())));
                        i12++;
                    } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e4) {
                        e4.printStackTrace();
                    }
                } while (rawQuery2.moveToNext());
                int i13 = writeReplace + 51;
                SdkCoreAlternateContactlessPaymentDataImpl = i13 % 128;
                if (i13 % 2 == 0) {
                    rawQuery2.close();
                    i2 = 11619;
                    i3 = 101;
                } else {
                    rawQuery2.close();
                    i2 = com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED;
                    i3 = 18;
                }
                sQLiteDatabase.delete(writeReplace(i3, (char) 50857, i2).intern(), null, null);
                for (int i14 = 0; i14 < count2; i14++) {
                    com.payair.hce.setOnScrollChangeListener setonscrollchangelistener = setonscrollchangelistenerArr[i14];
                    try {
                        android.database.sqlite.SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(writeReplace(103, (char) 34580, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD).intern());
                        compileStatement2.bindString(1, (java.lang.String) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, -1445857330, 1445857331, java.lang.System.identityHashCode(setonscrollchangelistener)));
                        compileStatement2.bindBlob(2, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, -121646331, 121646331, java.lang.System.identityHashCode(setonscrollchangelistener))));
                        compileStatement2.bindLong(3, ((java.lang.Long) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, 1490473312, -1490473309, java.lang.System.identityHashCode(setonscrollchangelistener))).longValue());
                        compileStatement2.bindLong(4, ((java.lang.Long) com.payair.hce.setOnScrollChangeListener.values(new java.lang.Object[]{setonscrollchangelistener}, 542292993, -542292991, java.lang.System.identityHashCode(setonscrollchangelistener))).longValue());
                        executeInsert2 = compileStatement2.executeInsert();
                        compileStatement2.clearBindings();
                    } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e5) {
                        e5.printStackTrace();
                    }
                    if (executeInsert2 == -1) {
                        throw new com.payair.hce.getAuthenticationMethods(writeReplace(29, (char) 17405, 526).intern());
                    }
                }
            }
        }
        writeReplace(108, (char) 22572, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED).intern();
        android.database.Cursor rawQuery3 = sQLiteDatabase.rawQuery(writeReplace(108, (char) 22572, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CARD_ACTIVATION_ACT_CODE_TRY_LIMIT_EXCEEDED).intern(), null);
        if (!rawQuery3.moveToFirst()) {
            return;
        }
        int count3 = rawQuery3.getCount();
        com.payair.hce.setOnTouchListener[] setontouchlistenerArr = new com.payair.hce.setOnTouchListener[count3];
        int i15 = 0;
        while (true) {
            try {
                blob = rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(8, (char) 47759, 663).intern()));
                string = rawQuery3.getString(rawQuery3.getColumnIndex(writeReplace(6, c, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.MIGRATION_SYSTEM_ERROR).intern()));
                byte[] blob3 = rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(10, c, 677).intern()));
                if (blob3 != null) {
                    getProfileVersion = (getAid + 7) % 128;
                    int i16 = SdkCoreAlternateContactlessPaymentDataImpl + 91;
                    writeReplace = i16 % 128;
                    if (i16 % i6 != 0) {
                        break;
                    }
                    try {
                        blob3 = com.payair.hce.setLabelFor.DigitizedCardProfile(blob3, this.AlternateContactlessPaymentDataJson.values());
                    } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e6) {
                        th = e6;
                        th.printStackTrace();
                        if (rawQuery3.moveToNext()) {
                        }
                    }
                }
                bArr = blob3;
                byte[] blob4 = rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(9, (char) 36519, 687).intern()));
                if (blob4 != null) {
                    blob4 = com.payair.hce.setLabelFor.DigitizedCardProfile(blob4, this.AlternateContactlessPaymentDataJson.values());
                }
                bArr2 = blob4;
                byte[] blob5 = rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(10, c, 696).intern()));
                if (blob5 != null) {
                    int i17 = SdkCoreAlternateContactlessPaymentDataImpl + 97;
                    writeReplace = i17 % 128;
                    if (i17 % i6 != 0) {
                        break;
                    } else {
                        blob5 = com.payair.hce.setLabelFor.DigitizedCardProfile(blob5, this.AlternateContactlessPaymentDataJson.values());
                    }
                }
                bArr3 = blob5;
                blob2 = rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(9, c, androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED).intern()));
                if (blob2 != null) {
                    SdkCoreAlternateContactlessPaymentDataImpl = (writeReplace + 23) % 128;
                    blob2 = com.payair.hce.setLabelFor.DigitizedCardProfile(blob2, this.AlternateContactlessPaymentDataJson.values());
                }
            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e7) {
                e = e7;
            }
            try {
                setontouchlistenerArr[i15] = new com.payair.hce.setOnTouchListener(blob, string, bArr, bArr2, bArr3, blob2, rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(3, (char) 29559, 715).intern())), rawQuery3.getBlob(rawQuery3.getColumnIndex(writeReplace(3, c, 718).intern())), rawQuery3.getString(rawQuery3.getColumnIndex(writeReplace(4, c, 721).intern())), rawQuery3.getString(rawQuery3.getColumnIndex(writeReplace(7, (char) 4972, 87).intern())));
                i15++;
            } catch (com.payair.hce.getTokenInfo e8) {
                e = e8;
                th = e;
                th.printStackTrace();
                if (rawQuery3.moveToNext()) {
                }
            } catch (java.security.GeneralSecurityException e9) {
                e = e9;
                th = e;
                th.printStackTrace();
                if (rawQuery3.moveToNext()) {
                }
            }
            if (rawQuery3.moveToNext()) {
                rawQuery3.close();
                sQLiteDatabase.delete(writeReplace(8, (char) 1443, 725).intern(), null, null);
                int i18 = c;
                while (i18 < count3) {
                    writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 11) % 128;
                    com.payair.hce.setOnTouchListener setontouchlistener = setontouchlistenerArr[i18];
                    try {
                        android.database.sqlite.SQLiteStatement compileStatement3 = sQLiteDatabase.compileStatement(writeReplace(152, c, 733).intern());
                        compileStatement3.bindBlob(1, (byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 1793919299, -1793919291, java.lang.System.identityHashCode(setontouchlistener)));
                        compileStatement3.bindString(i6, (java.lang.String) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 937872726, -937872717, java.lang.System.identityHashCode(setontouchlistener)));
                        if (((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 574365312, -574365311, java.lang.System.identityHashCode(setontouchlistener))) != null) {
                            writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 53) % 128;
                            try {
                            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e10) {
                                e = e10;
                            }
                            try {
                                compileStatement3.bindBlob(3, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 574365312, -574365311, java.lang.System.identityHashCode(setontouchlistener))));
                            } catch (com.payair.hce.getTokenInfo e11) {
                                e = e11;
                                th2 = e;
                                th2.printStackTrace();
                                i18++;
                                c = 0;
                                i6 = 2;
                            } catch (java.security.GeneralSecurityException e12) {
                                e = e12;
                                th2 = e;
                                th2.printStackTrace();
                                i18++;
                                c = 0;
                                i6 = 2;
                            }
                        }
                        if (((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 437433430, -437433430, java.lang.System.identityHashCode(setontouchlistener))) != null) {
                            try {
                                compileStatement3.bindBlob(4, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 437433430, -437433430, java.lang.System.identityHashCode(setontouchlistener))));
                            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e13) {
                                e = e13;
                                th2 = e;
                                th2.printStackTrace();
                                i18++;
                                c = 0;
                                i6 = 2;
                            }
                        }
                        if (((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 65618716, -65618709, java.lang.System.identityHashCode(setontouchlistener))) != null) {
                            compileStatement3.bindBlob(5, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 65618716, -65618709, java.lang.System.identityHashCode(setontouchlistener))));
                        }
                        if (((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, -1124956721, 1124956723, java.lang.System.identityHashCode(setontouchlistener))) != null) {
                            getAid = (getProfileVersion + 55) % 128;
                            try {
                                compileStatement3.bindBlob(6, this.AlternateContactlessPaymentDataJson.values((byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, -1124956721, 1124956723, java.lang.System.identityHashCode(setontouchlistener))));
                            } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e14) {
                                e = e14;
                                th2 = e;
                                th2.printStackTrace();
                                i18++;
                                c = 0;
                                i6 = 2;
                            }
                        }
                        try {
                            compileStatement3.bindBlob(7, (byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 1136670693, -1136670688, java.lang.System.identityHashCode(setontouchlistener)));
                            compileStatement3.bindBlob(8, (byte[]) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, -788066723, 788066727, java.lang.System.identityHashCode(setontouchlistener)));
                        } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e15) {
                            e = e15;
                        }
                        try {
                            compileStatement3.bindString(9, (java.lang.String) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, 285050262, -285050259, java.lang.System.identityHashCode(setontouchlistener)));
                            compileStatement3.bindString(10, (java.lang.String) com.payair.hce.setOnTouchListener.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setontouchlistener}, -266878927, 266878933, java.lang.System.identityHashCode(setontouchlistener)));
                            executeInsert = compileStatement3.executeInsert();
                            compileStatement3.clearBindings();
                        } catch (com.payair.hce.getTokenInfo e16) {
                            e = e16;
                            th2 = e;
                            th2.printStackTrace();
                            i18++;
                            c = 0;
                            i6 = 2;
                        } catch (java.security.GeneralSecurityException e17) {
                            e = e17;
                            th2 = e;
                            th2.printStackTrace();
                            i18++;
                            c = 0;
                            i6 = 2;
                        }
                    } catch (com.payair.hce.getTokenInfo | java.security.GeneralSecurityException e18) {
                        e = e18;
                    }
                    if (executeInsert != -1) {
                        continue;
                        i18++;
                        c = 0;
                        i6 = 2;
                    } else {
                        try {
                            throw new com.payair.hce.getAuthenticationMethods(writeReplace(25, (char) 49557, 885).intern());
                        } catch (com.payair.hce.getTokenInfo e19) {
                            e = e19;
                            th2 = e;
                            th2.printStackTrace();
                            i18++;
                            c = 0;
                            i6 = 2;
                        } catch (java.security.GeneralSecurityException e20) {
                            e = e20;
                            th2 = e;
                            th2.printStackTrace();
                            i18++;
                            c = 0;
                            i6 = 2;
                        }
                    }
                }
                return;
            }
            getAid = (getProfileVersion + 63) % 128;
            c = 0;
            i6 = 2;
        }
    }

    private static void a(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 33) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 380, (char) (62388 - android.text.TextUtils.indexOf("", "", 0)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) -1, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 35, 3966 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (40223 - (android.view.KeyEvent.getMaxKeyCode() >> 16)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 34, android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
        $10 = ($11 + 17) % 128;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        r0 = new char[r8];
        com.payair.hce.setContentDescription.getProfileVersion = (r1 + 77) % 128;
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
    
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if ((r0 / 4) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r0 = new char[r8];
        r1 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String writeReplace(int i, char c, int i2) {
        char[] cArr;
        int i3;
        int i4 = getProfileVersion;
        int i5 = i4 + 43;
        getAid = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 57;
        int i8 = i7 % 128;
        getAid = i8;
        if (i7 % 2 == 0) {
            int i9 = writeReplace << 69;
            SdkCoreAlternateContactlessPaymentDataImpl = i9 * 15346;
        } else {
            int i10 = writeReplace + 95;
            SdkCoreAlternateContactlessPaymentDataImpl = i10 % 128;
        }
        while (i3 < i) {
            int i11 = SdkCoreAlternateContactlessPaymentDataImpl + 37;
            writeReplace = i11 % 128;
            if (i11 % 2 != 0) {
                cArr[i3] = (char) ((DigitizedCardProfile[i2 >>> i3] | i3 | valueOf) * c);
                i3 += 48;
            } else {
                getAid = (getProfileVersion + 33) % 128;
                cArr[i3] = (char) ((DigitizedCardProfile[i2 + i3] ^ (i3 * valueOf)) ^ c);
                i3++;
            }
        }
        return new java.lang.String(cArr);
    }

    static void DigitizedCardProfile() {
        char[] cArr = new char[1830];
        java.nio.ByteBuffer.wrap("Oá\u008d¯Ë©\t\u008aGq\u0085ÎÃ\u0018\u0001\u0004_À\u009cCÚÿ\u0018×V\u0013\u0094nÒV\u0010~n¢¬¥éí'õeÝ£^át?\u0016}\u0004»ñùÃ6¯t\u008f²\u0016ð2ÎY\ffJì\u0088¡Ær\u0003ùA=\u009fÑÝ\u0013\u001b\u0098YY\u0097@Õ¿\u0013ËPû®\u009fì2**h_¦fä\u0092\"¥\u007fÓ½íûj9<wÍµ\u0084ó\u008f1G\u000fyL;\u008a\fÈî\u0006øDZ\u0082ÏÀa\u001e\u000e\\©\u0099A×Ð\u0015ÍS\b\u0091\u008cï\u0080-ÌkG©\u0014æ\u0013$Hbþ \u0082þ¢<Åze¸\u0002öµ3]qÌO\u0092\u008d\u001cË\u0089\tCGa\u0085wÃÕ\u0000\u0012^\u008f\u009cîÚW\u0018¡Vq\u0094iÒ¼/PmÓ«øéS'\u0000eâ£[á6?w|~º*ø¦6Þt\u001c²\u00adðWÎu\f°IT\u0087ãÅ\u008c\u0003<Aÿ\u009fcÝK\u001bùY\u0096\u0096£Ô:\u0012mPá®5ì\u0099*¦hp¦.ãH!\u001b\u007f\u0083½ÖûÏ9\u0088w3µ·ó\u00960©\u000e\"L5\u008aýÈd\u0006\u00adD\u0094\u0082TßÜ\u001d\u0004[`\u0099\u0083×º\u0015ßSÍ\u00912ïZ,fj\u0015¨¡æê$éb\u00ad Dþ=<py\u0098·<õJ3Áq\u0003O¥\u008d\u008dË\u0016\tLFN\u0084\u0010Â\u0092\u0000t^*\u009cÅÚú\u0018=Vs\u0093eÑ#/©m\u008c«ÃéØ'<e\u001d£«àQ>ä|\u008eº;ø66\u0014tÿ²Á\u008f\u0087Í\u0089\u000b0IQ\u0087äÅ\u0012\u0003ÙAÌ\u009f\rÜ\u0085\u001aµX´\u0096eÔ\f\u0012,PT®üì\u0098)Ógò¥\u0007ã\r!B\u007fZ½Îû\u00959\u0011vÊ´©òI0`\u000e!L\u0018\u008aõÈï\u0006OC»\u0081/ßf\u001d\u0083[Ê\u0099>×\u0016\u0015òRc\u0090\u009eîÇ,^j|¨(æ4$Ãbý¿ ý\u0085;\u0013yn·ÀõÚ3×q\u000fO)\u008ccÊk\b F©\u0084\bÂñ\u00009^&\u009c\u0013Ù\u0083\u0017¿U¾\u0093cÑò/\u0016m^«òé\u009e&Édè¢\u0001à\u0003>H|`º°ø\u00936\u001bsÀ±¯\u008f{Í\u0091\u000b%I9\u0087\u0011Åá\u0002A@¨\u009eôÜp\u001a\"XO\u0096GÔ\u0083\u0012þoÆ\u00adÄë2):g\u009d¥cã-!Å\u007fä¼ùú\u00948evS´Ôò?0¤\u000e\u0082Ll\u0089ÖÇ0\u00051Cê\u0081iß\u009d\u001d![ª\u0099èÖå\u0014°R:\u0090[î},\u000fjÝ¨ºæl#Öa'¿\u0015ý·;}yæ·¬õZ2\u0014p\"N·\u008cúÊK\b°F\u001e\u0084SÂÊ\u001f\u0014]ñ\u009b×Ù\u0019\u0017hU`\u0093\u000fÑ¸/\u0005l\u0010ª_è×&\u0081d\u0083¢áà\u000e>2|Ò¹\n÷õ5Õs%±\u0088\u008f\\Ív\u000b¬IÉ\u0086óÄ\u0087\u0002Ç@U\u009e\u0082Ü\u0003\u001a~XÇ\u0096ÑÓ¾\u0011\u0099oK\u00ad ë\u0006)hg×¥\u0090ân Ë~Á¼Çú\u00138\u009ave´Nò\u0080Ï=\rüKå\u0089KÇ$\u0005\u001aC|\u0081Õß\u008f\u001cÏZÛ\u0098~Ö\u0006\u0014 R\u008a\u0090\u0095îQ,oi)§:åà#úaØ¿íý\u0013;\u0018y¿¶WôÃ2'p\u0006Nv\u008c²Êª\bmF\u0012\u0083\u001dÁj\u001fä] \u009b´ÙÃ\u0017\u0013U$\u0092OÐg.Âløª\u0016è\u009f&Qdw¢yÿ7= {Í¹Ø÷a5·sg±\u000b\u008f³Ì^\néH\u008a\u0086ØÄö\u0002Ý@U\u009e\u0017Üm\u0019YW<\u0095\u0099ÓÔ\u0011úo\u0097\u00ad!ë{)ñfN¤¸â\u009a \f~ñ¼Rú)8\u0092u`³øñ(Ï(\róKF\u0089\u0097Ç\u0086\u0005BBÁ\u0080~Þ`\u001c½ZÍ\u0098\u0005ÖE\u0014ÕR\u009f¯¼íÏ+li\b§£åB#÷aÂ¿2üÕ:^x\u000f¶\u0081ô\u000329p\u0095NÐ\u008cQÉ¨\u0007\u0013E\u007f\u0083ÝÁ+\u001f¿]\u0096\u009b\tÙ:\u0016\u001cTM\u0092ÓÐ\u009d.\u008bl5ªýèô%ùc\u009c¡Xÿo=\u0090{;¹ø÷\u00965<rÊ°v\u008e\u0001ÌÖ\n\u0089HÞ\u0086ÐÄi\u0002ø_&\u009dÉÛ÷\u0019ñW¢\u0095\u0099Óæ\u0011`o<¬8êk(\u0097f\u008f¤Ëâ¶ ~~\u0016¼\u008aù]7Õu\u009d³õñ¶Ï¬\rNK\\\u0089ÙÆ+\u0004\u0097B÷\u0080.ÞÚ\u001cqZ\u000e\u0098´Õy\u0013\u0094QÑ¯[íé+ûi §<åh\"T`\u0013¾¢ü÷:$xÂ¶xô\u001e2¾\u000fMM¢\u008bµÉm\u0007äE`\u0083¬Áà\u001f\u007f\\¿\u009a\u0013Ø\u007f\u0016ÆT \u0092\u0082Ð\u0098.\tly©Qç-%¨cé¡àÿO=Ø{\u0093¹oöµ4;rp°Æ\u008e/Ì\u008a\n\u0091H=\u0085ÐÃm\u0001b_¤\u009d·Ûä\u0019±W+\u0095MÒ\u009f\u0010\u001dnJ¬ùêÆ(\u0085f\u0099¤ZâQ?\f}x»Êù 7\u0092uè³Àñ3ÏL\f\u008fJy\u0088BÆ°\u0004\u0006Bî\u0080õÞ-\u001c]Y\u0003\u0097lÕ\u009d\u0013¤QÌ¯×í\u0016+\u0013iÃ¦~äµ\"B`I¾\u0019ü\u001a:ñxôµ¨ó°1`\u000f\\M«\u008b\u0010É÷\u0007ÊE\u001b\u0082aÀN\u001e\u008e\\z\u009a\u001cØ\u0015\u0016ZTÕ\u0092½ï¼-ék¢©¶ç\u001a%7c²¡éÿK<¬z\u0013¸Fö¼4\u000erà°Æ\u008e\u0015Ìp\taG,\u0085ÁÃ\u0018\u0001m_¥\u009d±Ûw\u0018ÄV\u0006\u0094`Òø\u0010Ûn«¬\u0093ê}(Ze?£\"á\u0097?É}I»mùò7Yu×²\u0015ð\u0085Îè\fLJL\u0088\u0002Æ\u007f\u0004ÚB§\u009f\u0092Ýö\u001bJY\u000e\u00976Õ]\u0013\u00adQY¯\u001bì\u0004*Ahè¦\u0091ä£\"Ç`å¾ôü©9Iwõµ\u009bó\u00001Ê\u000fDM4\u008bÿÈd\u0006\u0097D×\u0082^À\u001d\u001e&\\I\u009aíØ\u0089\u0015YS½\u0091\u008cïC-\u0000k\u0000©Cçã%\u008bb± ºþs<bzÔ¸!ö\u008c4°rOO\u0004\u008dïËÈ\t3Gµ\u0085zÃ\u0011\u0001\u0098_¢\u009céÚú\u0018LV+\u0094zÒS\u0010°n\u0080¬\u001dé\u0004'7eÙ£\u0097áµ?\u0091}~»Tø&6\u0006tï²ßð7Î©\fLJA\u0088\u0080Å\u0002\u0003<A \u009fÉÝ\u009c\u001b\u009dYÄ\u0097bÕ\u0010\u0012\"Pf®\u009bì½*Ëhæ¦|ä\u0004\"\u0080\u007fN½Íûñ9ùw±µ®óD1f\u000f\u0083L?\u008aÆÈ÷\u0006bDØ\u0082!À\u0004\u001eí\\\u0081\u0099\u008e×Õ\u0015\u0082Sé\u0091åïº-7kb¨>æ\u0013$\u0085bû xþÈ<tz\u0004¸³õq3çqµOp\u008d\u001eË\u0004\t¦Gò\u0085\u007fÂ°\u0000\u0017^d\u009cÌÚ\u000e\u0018¸Vú\u0094\rÒ!/Qm|«½é\u0000'êeO£Úá«?s|ìº3ø\u00186ÜtQ²\u0088ð\u0091Î=\f%IQ\u0087\u007fÅ®\u0003£Aæ\u009fÁÝ/\u001b\fX\u0097\u0096_Ô0\u0012éPÄ®\u009cì\u0099*^h5¥\u0017ãr!á\u007f¢½yûê9Ñw;µ\u0019ò\u00930m\u000e@L\u0086\u008a\u0004ÈÀ\u0006\u0089D\u001a\u0082UßB\u001dn[\u0094\u0099¦×\u0090\u0015ßS&\u00917ï\u009a,|jÍ¨@æj$\rb\u0002 ùþÂ;ªy¬·bõm3£q4Oë\u008dbË\u001b\b-FL\u0084\u009bÂ@\u0000G^\u001d\u009c\u0019Úé\u0018íU¾\u0093¿Ñf/sm¯«\u0015é÷'´e\b¢÷à\u008e>\u0000|¶º\u0088øæ62t/²â\u008f\u007fÍ¥\u000bÐIO\u0087\u0084ÅO\u0003AAø\u009fÍÜ¢\u001a\u0092X.\u0096ªÔ^\u0012ãP\u0098®\u001bëÕ)lgc¥¸ã\u0083!\u0085\u007fÁ½IûE8>vB´îò«0¦\u000e\u0015Lç\u008a\u0099È/\u0005\u009eC\\\u0081^ß\u0088\u001dÈ[\u0085\u0099\u009c×Y\u0015\\R\u0012\u0090\u001aîú,Ëj£¨äæ\u0007$Eb3¿äýo;<y\u0082·jõÖ3©qeO9\u008c\rÊ\f\bÌF\u0080\u0084¤ÂÛ\u0000w^\u0002\u009bÃÙ7\u0017nUÎ\u0093\u0092Ñ\u009c/ÙmC«\u0011è;&(d·¢Àà\u0006>»|\u0002ºgøÕ5Ëst±\u000e\u008f\u0085ÍZ\u000bÔIÕ\u0087\u0018Å\u0005\u0002/@,\u009eþÜü\u001aêX»\u0096MÔw\u0012\u009co*\u00ad\u009dë\u001e)vgY¥(ã¡!Ô\u007f\b¼\u0083ú@8lvÿ´4ò³0£\u000eFKê\u0089\u0012Çþ\u0005\u001eC9\u0081]ßx\u001d\u0095[\u0091\u0098äÖê\u0014<R$\u0090ÿîX,£j¿¨Våá#\u0002a\u0018¿Ùý[;Qyµ·\u0088õd2ðp+N;\u008càÊ\u007f\b\u0088FÊ\u0084mÂf\u001f\u0003]\u001a\u009b\u0016ÙÝ\u0017SUm\u0093\u009dÑ´/tlÄª7è;&\u0091do¢ÀàÊ>\u000f{\u0096¹t÷\u00195¤sÑ±\u0091\u008f\u0088Ío\u000b H\u0002\u0086÷ÄÎ\u0002\u0003@\u0001\u009enÜL\u001aÒXÚ\u0095\u0085Ó\u008a\u0011UoG\u00ad-ë\u0084)\u008cgG¥´âS ç~\u0091¼3ú÷8Nvw´¢òÆÏ\u0099\rÙKA\u0089\u0001Ç(\u0005,Cð\u0081òÞ»\u001cÑZ÷\u0098\u001cÖ*\u0014 RN\u0090ÿî\u009d+«i¥§\u001cåT#èa\f¿kýü;±x»¶¤ô\u00872\rp*Nd\u008c^Ê\u008e\b\u0099EÝ\u0083ÑÁo\u001fh]y\u009b0Ù¸\u0017ÿUg\u0092£Ð\f.vlâªÂè &\u001dd{¢\u009dÿ3=m{N¹Y÷ï5\u0015s0±è\u008e[Ì\u008c\nØH?\u0086(Äg\u0002q@¶\u009e§Ûç\u0019±WÓ\u0095°Ó\u007f\u0011ïo\u0002\u00ad\u0004ëÆ(gfõ¤\u009dâ\u0083 í~\u000f¼TúÓ8\u008bu¦³øñbÏ\u0001\rYKq\u0089ñÇ³\u00058BÎ\u0080@Þ\u000b\u001c\u008bZM\u0098ÉÖö\u0014ýR·¯\u0091íè+li\u0003§(åj#\u009ba\u0092¾ÃüÐ:rx=¶\u008aôy2Qp_Ny\u008bêÉ!\u00079Eè\u0083®Á°\u001fÂ]\u000f\u009b#ØC\u0016AT\u0086\u0092¸Ðò.Ùl]ª\u0013è\u0015%\u0083c½¡¦ÿm=ý{\u0014¹j÷ô5\u008erË°ÿ\u008e\u001fÌ\u0005\nJHd\u0086¶Ä¬\u0002l_ä\u009dØÛÞ\u0019\u0004W\u0085\u0095MÓI\u0011unï¬%êM(»fþ¤\u0007âH Ë~\u008b»¾ùÇ7¦un³êñ×Ï¶\r\bKC\u0088{Æ\u0007\u0004\u008dB¼\u0080÷ÞÔ\u001c\\Z\u001d\u0098\u008cÕó\u0013\u0087Qß¯¿í\u0083+ãiv§\u0012åÒ\"@`é¾¹ü!:\u009cxh¶\"ô\u00902\u0098\u000fûMÍ\u008bÏÉg\u0007\u009aE_\u0083vÁÙ\u001e5\\\u0090\u009a\u009dØO\u0016,T<\u0092tÐÒ.\u0097k\u0088©ËçS%ÿc\u0013¡\u008aÿ\u0002=V{Õ¸9ö\u008c4ár(°Ø\u008eSÌp\n\u0082H·\u0085çÃÃ\u0001\u0006_\u000e\u009d4Û²\u0019óWU\u0095[Ò%\u0010Snü¬\u0082ê¬(ñf\u0013¤cáG?\u0002}Â»Ùù\u001e7Ru²³µñyÎï\f!J\u0016\u0088èÆÕ\u0004°B¨\u0080\u000bÞ,\u001bGY\u007f\u0097ºÕ®\u0013\u000eQ\u009b¯]í`+eh2¦$äÞ\"Ü`µ¾\u008fü*:{xæµFóý1\u008a\u000f Mþ\u008b\u009bÉ)\u00075Ea\u0082|À8\u001e³\\ð\u009aÐØ\u009f\u0016\u0019TC\u0091YïF-Ëk\u0092©>çí%jc=¡\u0091þd<ÜzT¸7öó4!r\u008f°Ø\u008eBË\u0097\tvGt\u0085±Ãä\u0001Ù_©\u009d!Û·\u0018xVÊ\u0094PÒ\u0007\u0010\u000bnA¬¿êÄ(Je\u008f£\u0016á^?µ}R»íù\u00957\u001cuL²tð=Î·\fÏJ\u001b\u0088\u009cÆÎ\u0004DAº\u009f\u000bÝ\u0011\u001bÍY©\u0097ØÕà\u0013\u0003Q(®ºìP*<h·¦\u0090ä\u0003\"Ý`Þ¾Nû²9=wuµðó%1Ö\u000fìM\u0006\u008b<È.\u0006SD¼\u0082\u0087Àç\u001eÂ\\V\u009aÎØÑ\u0015\u0091S©\u0091iïl- k\"©\u0098ç¥%0b( {þã<\u0087zý¸Êö 4þqrO\u00ad\u008dãËe\t\u001dG$\u0085tÃì\u0001¨^ß\u009cÛÚ\u000b\u0018/V\u0086\u0094iÒÚ\u0010¸n\u0011«\u0099é¹'{e`£9á(?\u0081}ó»VøÏ6\u001dt\u0003²QðFÎ\u0018\f²Jè\u0088\u001dÅ¾\u0003\u00adAR\u009fdÝ\u0010\u001b\u0014YÔ\u0097ÓÕz\u0012¿P&®\u0002ì\u0084*VhÀ¦±ä\u0006!é\u007fZ½ û\u00889hwÜµ7ó\u00121Û\u000e^L\u008e\u008a\u008cÈ:\u0006ØDV\u0082\u008eÀ\u0095\u001eB[ý\u0099\u0005×,\u0015àS¢\u0091¾ïî-ºk2¨ôæG$0b\u0083 {þ¸<\u008dzP¸yõ\u00193zqáO¼\u008dªË¼\t\u009eGX\u0084ËÂ*\u0000G^ë\u009c\u0084Ú¡\u0018ÌVU\u0094}Ñ\u0003/%mû«æé`'ºe$£\u008eá\u0016>Û|Fº\u0007ø\u009a6\u0088tè²Ðð\rÎi\u000bFÝß\u001fØYã\u009bìÕÚ\u0017?Q\r\u0093dÍS\u000e¢".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1830);
        IccPrivateKeyCrtComponentsJson = cArr;
        RecordsJson = -378941802291880782L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        getAid = 1;
        DigitizedCardProfile();
        writeReplace = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        char[] cArr = new char[910];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(android.graphics.Color.green(0), (char) (4429 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), 1820 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(android.graphics.Color.alpha(0) + 1820, (char) (33592 - android.graphics.ImageFormat.getBitsPerPixel(0)), 10 - android.graphics.Color.blue(0), objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 910);
        DigitizedCardProfile = cArr;
        valueOf = -2665695350333214087L;
        getProfileVersion = (getAid + 105) % 128;
    }

    static void init$0() {
        $$a = new byte[]{7, -84, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FF};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
    }
}
