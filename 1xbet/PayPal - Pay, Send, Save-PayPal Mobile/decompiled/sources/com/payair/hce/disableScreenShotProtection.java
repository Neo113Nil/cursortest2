package com.payair.hce;

/* loaded from: classes4.dex */
public final class disableScreenShotProtection extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static long getAid;
    private static int getPaymentFci;
    private static long getProfileVersion;
    private static char[] valueOf;
    private final int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        return ((((i * (-919)) + (i2 * (-919))) + (((~(i6 | i3)) | (~((i5 | i7) | i))) * 920)) + (((~i6) | (~(i4 | i7))) * 920)) + (((~((i | i5) | i3)) | ((~((i2 | i4) | i3)) | (~(i6 | i7)))) * 920) != 1 ? writeReplace(objArr) : DigitizedCardProfile(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = 99 - (b * 4);
        int i6 = 3 - (i2 * 2);
        int i7 = 1 - (i * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5 += -i6;
            i6 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i6 + 1;
            i8 = i9;
            i6 = bArr[i9];
            i5 += -i6;
            i6 = i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        com.payair.hce.disableScreenShotProtection.getPaymentFci = (r1 + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if ((r0 >>> 4) == 0) goto L9;
     */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void valueOf() {
        int i = getPaymentFci + 93;
        int i2 = i % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        if (i % 2 != 0) {
            int i3 = IccPrivateKeyCrtComponentsJson * 2;
            RecordsJson = i3 >> 12309;
        } else {
            int i4 = IccPrivateKeyCrtComponentsJson + 93;
            RecordsJson = i4 % 128;
        }
        super.valueOf();
        int i5 = RecordsJson + 55;
        IccPrivateKeyCrtComponentsJson = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        int i6 = getPaymentFci + 63;
        SdkCoreBusinessLogicModuleImpl = i6 % 128;
        if (i6 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((r1 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if ((r1 << 4) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        com.payair.hce.disableScreenShotProtection.getPaymentFci = (r0 + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        com.payair.hce.disableScreenShotProtection.getPaymentFci = (r0 + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        return;
     */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void values() {
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 73) % 128;
        super.values();
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i + 113;
        getPaymentFci = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = RecordsJson >>> 1;
            IccPrivateKeyCrtComponentsJson = i3 * 23160;
        } else {
            int i4 = RecordsJson + 23;
            IccPrivateKeyCrtComponentsJson = i4 % 128;
        }
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ boolean writeReplace() {
        int i = (getPaymentFci + 91) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        int i2 = IccPrivateKeyCrtComponentsJson + 99;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            super.writeReplace();
            throw null;
        }
        int i3 = (i + 55) % 128;
        getPaymentFci = i3;
        SdkCoreBusinessLogicModuleImpl = (i3 + 125) % 128;
        boolean writeReplace = super.writeReplace();
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 47) % 128;
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 121) % 128;
        return writeReplace;
    }

    public disableScreenShotProtection(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful, int i) {
        super(ongetcertoperationunsuccessful);
        this.writeReplace = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        float f;
        char c2;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (true) {
            int i3 = getcvmmodel.valueOf;
            f = 0.0f;
            c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            if (i3 >= i2) {
                break;
            }
            $10 = ($11 + 47) % 128;
            int i4 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 48, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 380, (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 3966 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (40223 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 34, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.text.TextUtils.getOffsetAfter("", 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            } catch (java.lang.Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i5 = $10 + 69;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 34, 211 - android.text.TextUtils.lastIndexOf("", c2), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == f ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 34, android.os.Process.getGidForName("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
            f = 0.0f;
            c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.disableScreenShotProtection disablescreenshotprotection = (com.payair.hce.disableScreenShotProtection) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int i = SdkCoreBusinessLogicModuleImpl + 103;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 2;
        }
        disablescreenshotprotection.DigitizedCardProfile();
        android.database.Cursor rawQuery = disablescreenshotprotection.DigitizedCardProfile.getReadableDatabase().rawQuery(DigitizedCardProfile(91, (char) 52010, 0).intern(), new java.lang.String[]{str, java.lang.String.valueOf(intValue)});
        if (rawQuery.moveToFirst()) {
            com.payair.hce.Initializer initializer = new com.payair.hce.Initializer(rawQuery.getBlob(rawQuery.getColumnIndex(DigitizedCardProfile(16, (char) 27730, 91).intern())));
            rawQuery.close();
            return disablescreenshotprotection.writeReplace(initializer);
        }
        int i3 = getPaymentFci + 3;
        int i4 = i3 % 128;
        SdkCoreBusinessLogicModuleImpl = i4;
        if (i3 % 2 != 0) {
            int i5 = 3 / 4;
        }
        int i6 = RecordsJson + 105;
        IccPrivateKeyCrtComponentsJson = i6 % 128;
        if (i6 % 2 != 0) {
            rawQuery.close();
            throw null;
        }
        getPaymentFci = (i4 + 95) % 128;
        getPaymentFci = (i4 + 117) % 128;
        getPaymentFci = (i4 + 45) % 128;
        rawQuery.close();
        int i7 = IccPrivateKeyCrtComponentsJson + 29;
        RecordsJson = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private java.util.List<com.payair.hce.registerMastercard> SdkCoreAlternateContactlessPaymentDataImpl() {
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(DigitizedCardProfile(30, (char) 27502, 129).intern(), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rawQuery.moveToFirst()) {
            int i = SdkCoreBusinessLogicModuleImpl + 39;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                while (!rawQuery.isAfterLast()) {
                    com.payair.hce.registerMastercard registermastercard = new com.payair.hce.registerMastercard();
                    java.lang.String string = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(7, (char) 0, 159).intern()));
                    java.lang.String string2 = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(18, (char) 60659, 166).intern()));
                    java.lang.String string3 = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(14, (char) 61543, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE).intern()));
                    java.lang.String string4 = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(10, (char) 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE).intern()));
                    java.lang.String string5 = rawQuery.getString(rawQuery.getColumnIndex(DigitizedCardProfile(11, (char) 63383, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE).intern()));
                    byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(DigitizedCardProfile(16, (char) 27730, 91).intern()));
                    byte[] blob2 = rawQuery.getBlob(rawQuery.getColumnIndex(DigitizedCardProfile(8, (char) 1175, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE).intern()));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, string}, -512329661, 512329661, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, string2}, 298765696, -298765688, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, string3}, 1958972968, -1958972967, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, string4}, 982699150, -982699137, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, string5}, -555420558, 555420563, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, blob}, -329554701, 329554708, java.lang.System.identityHashCode(registermastercard));
                    com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard, blob2}, -1228736057, 1228736066, java.lang.System.identityHashCode(registermastercard));
                    arrayList.add(registermastercard);
                    rawQuery.moveToNext();
                    RecordsJson = (IccPrivateKeyCrtComponentsJson + 71) % 128;
                }
            }
        }
        rawQuery.close();
        int i2 = IccPrivateKeyCrtComponentsJson + 73;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 85) % 128;
            return arrayList;
        }
        int i3 = getPaymentFci + 53;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = 4 / 5;
        throw null;
    }

    public final void DigitizedCardProfile(java.lang.String str, java.lang.String str2) {
        android.database.sqlite.SQLiteStatement compileStatement;
        int i = (SdkCoreBusinessLogicModuleImpl + 39) % 128;
        getPaymentFci = i;
        int i2 = (i + 17) % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        int i3 = RecordsJson + 15;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = i2 + 107;
            getPaymentFci = i4 % 128;
            if (i4 % 2 != 0) {
                compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(DigitizedCardProfile(46, (char) 29519, 29355).intern());
                compileStatement.bindString(0, str);
                compileStatement.bindString(4, str2);
                compileStatement.executeUpdateDelete();
                compileStatement.clearBindings();
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 83) % 128;
            }
        } else {
            getPaymentFci = (i2 + 95) % 128;
        }
        compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(DigitizedCardProfile(75, (char) 29519, 227).intern());
        compileStatement.bindString(1, str);
        compileStatement.bindString(2, str2);
        compileStatement.executeUpdateDelete();
        compileStatement.clearBindings();
        RecordsJson = (IccPrivateKeyCrtComponentsJson + 83) % 128;
    }

    public final void writeReplace(java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 13) % 128;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        if (android.database.DatabaseUtils.queryNumEntries(writableDatabase, DigitizedCardProfile(16, (char) 0, 302).intern(), DigitizedCardProfile(12, (char) 20359, 318).intern(), new java.lang.String[]{str}) != 0) {
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 53) % 128;
            android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(DigitizedCardProfile(48, (char) 34835, com.visa.cbp.getCertUsage.setAucAID).intern());
            compileStatement.bindString(1, str);
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            if (executeUpdateDelete != 0) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            c((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.text.TextUtils.getCapsMode("", 0, 0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 30, objArr);
            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
        }
        int i = (SdkCoreBusinessLogicModuleImpl + 15) % 128;
        getPaymentFci = i;
        int i2 = IccPrivateKeyCrtComponentsJson + 83;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = i + 121;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    public final java.util.List<java.lang.Integer> AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 27;
        getPaymentFci = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 3;
        }
        DigitizedCardProfile();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(DigitizedCardProfile(91, (char) 52794, 378).intern(), new java.lang.String[]{str});
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        while (true) {
            arrayList.add(java.lang.Integer.valueOf(rawQuery.getInt(rawQuery.getColumnIndex(DigitizedCardProfile(18, (char) 60659, 166).intern()))));
            if (!rawQuery.moveToNext()) {
                RecordsJson = (IccPrivateKeyCrtComponentsJson + 125) % 128;
                rawQuery.close();
                SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 73) % 128;
                IccPrivateKeyCrtComponentsJson = (RecordsJson + 29) % 128;
                return arrayList;
            }
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 57) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0339 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeReplace(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr) {
        java.lang.CharSequence charSequence;
        java.lang.String str5;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        com.payair.hce.registerMastercard registermastercard;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        android.database.Cursor rawQuery = writableDatabase.rawQuery(DigitizedCardProfile(66, (char) 0, 469).intern(), new java.lang.String[]{str});
        if (rawQuery.getCount() < this.writeReplace) {
            rawQuery.close();
            com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(bArr);
            android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(DigitizedCardProfile(137, (char) 0, 753).intern());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            sb.append(str4);
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))).writeReplace());
            byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
            compileStatement.bindString(1, str);
            if (str2 != null) {
                compileStatement.bindString(2, str2);
            } else {
                SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 47) % 128;
            }
            compileStatement.bindBlob(3, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
            compileStatement.bindString(4, str4);
            compileStatement.bindString(5, str3);
            compileStatement.bindBlob(6, DigitizedCardProfile2);
            long executeInsert = compileStatement.executeInsert();
            compileStatement.clearBindings();
            if (executeInsert != -1) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            c(android.text.TextUtils.getCapsMode("", 0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 29, objArr);
            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
        }
        IccPrivateKeyCrtComponentsJson = (RecordsJson + 65) % 128;
        rawQuery.close();
        android.database.Cursor rawQuery2 = writableDatabase.rawQuery(DigitizedCardProfile(90, (char) 32546, 535).intern(), new java.lang.String[]{str});
        if (!rawQuery2.moveToFirst()) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 117) % 128;
            rawQuery2.close();
            return;
        }
        java.lang.String string = rawQuery2.getString(rawQuery2.getColumnIndex(DigitizedCardProfile(18, (char) 60659, 166).intern()));
        rawQuery2.close();
        com.payair.hce.Initializer DigitizedCardProfile3 = DigitizedCardProfile(bArr);
        DigitizedCardProfile();
        android.database.Cursor rawQuery3 = this.DigitizedCardProfile.getReadableDatabase().rawQuery(DigitizedCardProfile(59, (char) 56673, 890).intern(), new java.lang.String[]{string});
        if (!rawQuery3.moveToFirst()) {
            int i = SdkCoreBusinessLogicModuleImpl + 85;
            int i2 = i % 128;
            getPaymentFci = i2;
            if (i % 2 != 0) {
                int i3 = IccPrivateKeyCrtComponentsJson + 111;
                RecordsJson = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = i2 + 103;
                    SdkCoreBusinessLogicModuleImpl = i4 % 128;
                    if (i4 % 2 == 0) {
                        rawQuery3.close();
                        registermastercard = null;
                        sQLiteDatabase = writableDatabase;
                        str5 = string;
                        charSequence = "";
                        if (registermastercard == null) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append(str);
                            sb2.append(str2);
                            sb2.append((java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard}, 1921665819, -1921665815, java.lang.System.identityHashCode(registermastercard)));
                            sb2.append(str4);
                            sb2.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile3}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile3))).writeReplace());
                            byte[] DigitizedCardProfile4 = DigitizedCardProfile(sb2.toString());
                            android.database.sqlite.SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(DigitizedCardProfile(128, (char) 25664, 625).intern());
                            compileStatement2.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile3}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile3)));
                            if (str2 != null) {
                                RecordsJson = (IccPrivateKeyCrtComponentsJson + 91) % 128;
                                compileStatement2.bindString(2, str2);
                            }
                            compileStatement2.bindString(3, str4);
                            compileStatement2.bindBlob(4, DigitizedCardProfile4);
                            compileStatement2.bindString(5, str5);
                            int executeUpdateDelete = compileStatement2.executeUpdateDelete();
                            compileStatement2.clearBindings();
                            if (executeUpdateDelete != 0) {
                                return;
                            }
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            c(android.view.ViewConfiguration.getTouchSlop() >> 8, (char) ((-1) - android.text.TextUtils.lastIndexOf(charSequence, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 28 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
                            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr2[0]).intern());
                        }
                        return;
                    }
                }
                rawQuery3.close();
                throw new java.lang.ArithmeticException();
            }
        }
        com.payair.hce.registerMastercard registermastercard2 = new com.payair.hce.registerMastercard();
        java.lang.String string2 = rawQuery3.getString(rawQuery3.getColumnIndex(DigitizedCardProfile(18, (char) 60659, 166).intern()));
        java.lang.String string3 = rawQuery3.getString(rawQuery3.getColumnIndex(DigitizedCardProfile(14, (char) 61543, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE).intern()));
        java.lang.String string4 = rawQuery3.getString(rawQuery3.getColumnIndex(DigitizedCardProfile(10, (char) 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_UP_VALUE).intern()));
        java.lang.String string5 = rawQuery3.getString(rawQuery3.getColumnIndex(DigitizedCardProfile(11, (char) 63383, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE).intern()));
        charSequence = "";
        byte[] blob = rawQuery3.getBlob(rawQuery3.getColumnIndex(DigitizedCardProfile(16, (char) 27730, 91).intern()));
        str5 = string;
        byte[] blob2 = rawQuery3.getBlob(rawQuery3.getColumnIndex(DigitizedCardProfile(8, (char) 1175, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE).intern()));
        sQLiteDatabase = writableDatabase;
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, string2}, 298765696, -298765688, java.lang.System.identityHashCode(registermastercard2));
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, string3}, 1958972968, -1958972967, java.lang.System.identityHashCode(registermastercard2));
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, string4}, 982699150, -982699137, java.lang.System.identityHashCode(registermastercard2));
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, string5}, -555420558, 555420563, java.lang.System.identityHashCode(registermastercard2));
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, blob}, -329554701, 329554708, java.lang.System.identityHashCode(registermastercard2));
        com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2, blob2}, -1228736057, 1228736066, java.lang.System.identityHashCode(registermastercard2));
        rawQuery3.close();
        registermastercard = registermastercard2;
        if (registermastercard == null) {
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.disableScreenShotProtection disablescreenshotprotection = (com.payair.hce.disableScreenShotProtection) objArr[0];
        int i = (getPaymentFci + 101) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        int i2 = RecordsJson + 19;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            getPaymentFci = (i + 67) % 128;
            disablescreenshotprotection.DigitizedCardProfile.getWritableDatabase().delete(DigitizedCardProfile(114, (char) 0, 32436).intern(), null, null);
        } else {
            disablescreenshotprotection.DigitizedCardProfile.getWritableDatabase().delete(DigitizedCardProfile(16, (char) 0, 302).intern(), null, null);
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 93) % 128;
        }
        int i3 = IccPrivateKeyCrtComponentsJson + 111;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = getPaymentFci;
        int i5 = i4 + 17;
        SdkCoreBusinessLogicModuleImpl = i5 % 128;
        int i6 = i5 % 2;
        SdkCoreBusinessLogicModuleImpl = (i4 + 23) % 128;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        r1 = SdkCoreAlternateContactlessPaymentDataImpl();
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ((r1 >>> 3) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        r2 = r2 + 93;
        com.payair.hce.disableScreenShotProtection.getPaymentFci = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        r1 = SdkCoreAlternateContactlessPaymentDataImpl();
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        java.util.List<com.payair.hce.registerMastercard> SdkCoreAlternateContactlessPaymentDataImpl2;
        int i;
        int i2 = getPaymentFci + 65;
        int i3 = i2 % 128;
        SdkCoreBusinessLogicModuleImpl = i3;
        if (i2 % 2 != 0) {
            int i4 = IccPrivateKeyCrtComponentsJson * 58;
            RecordsJson = i4 % 18914;
        } else {
            int i5 = IccPrivateKeyCrtComponentsJson + 103;
            RecordsJson = i5 % 128;
        }
        while (i < SdkCoreAlternateContactlessPaymentDataImpl2.size()) {
            com.payair.hce.registerMastercard registermastercard = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            java.lang.String str = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard}, -1296112071, 1296112073, java.lang.System.identityHashCode(registermastercard));
            com.payair.hce.registerMastercard registermastercard2 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            java.lang.String str2 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2}, 1921665819, -1921665815, java.lang.System.identityHashCode(registermastercard2));
            com.payair.hce.registerMastercard registermastercard3 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            java.lang.String str3 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard3}, 504468253, -504468242, java.lang.System.identityHashCode(registermastercard3));
            com.payair.hce.registerMastercard registermastercard4 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            java.lang.String str4 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard4}, 1064259332, -1064259326, java.lang.System.identityHashCode(registermastercard4));
            com.payair.hce.registerMastercard registermastercard5 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            byte[] bArr = (byte[]) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard5}, 1487453280, -1487453268, java.lang.System.identityHashCode(registermastercard5));
            com.payair.hce.registerMastercard registermastercard6 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i);
            java.lang.String str5 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard6}, 1610043325, -1610043322, java.lang.System.identityHashCode(registermastercard6));
            byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), bArr);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str3);
            sb.append(str2);
            sb.append(str4);
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace());
            byte[] AlternateContactlessPaymentDataJson2 = this.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), sb.toString().getBytes());
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2).writeReplace();
            android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(DigitizedCardProfile(111, (char) 0, 949).intern());
            compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson);
            compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson2);
            compileStatement.bindString(3, str);
            compileStatement.bindString(4, str5);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            i++;
        }
        int i6 = IccPrivateKeyCrtComponentsJson + 87;
        RecordsJson = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 51) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012c  */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson() {
        int i;
        int i2;
        java.util.List<com.payair.hce.registerMastercard> SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
        int size = SdkCoreAlternateContactlessPaymentDataImpl2.size();
        if (size > 0) {
            SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 35) % 128;
            boolean z = false;
            int i3 = 0;
            while (i3 < size) {
                com.payair.hce.registerMastercard registermastercard = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                java.lang.String str = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard}, -1296112071, 1296112073, java.lang.System.identityHashCode(registermastercard));
                com.payair.hce.registerMastercard registermastercard2 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                java.lang.String str2 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard2}, 1921665819, -1921665815, java.lang.System.identityHashCode(registermastercard2));
                com.payair.hce.registerMastercard registermastercard3 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                java.lang.String str3 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard3}, 504468253, -504468242, java.lang.System.identityHashCode(registermastercard3));
                com.payair.hce.registerMastercard registermastercard4 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                java.lang.String str4 = (java.lang.String) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard4}, 1064259332, -1064259326, java.lang.System.identityHashCode(registermastercard4));
                com.payair.hce.registerMastercard registermastercard5 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                java.lang.String writeReplace = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard5}, 1487453280, -1487453268, java.lang.System.identityHashCode(registermastercard5))).writeReplace();
                com.payair.hce.registerMastercard registermastercard6 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i3);
                byte[] bArr = (byte[]) com.payair.hce.registerMastercard.DigitizedCardProfile(new java.lang.Object[]{registermastercard6}, -2034627625, 2034627635, java.lang.System.identityHashCode(registermastercard6));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str3);
                sb.append(str2);
                sb.append(str4);
                sb.append(writeReplace);
                z = valueOf(DigitizedCardProfile(22, (char) 0, 107).intern(), bArr, sb.toString().getBytes());
                if (z) {
                    break;
                }
                i3++;
                int i4 = (getPaymentFci + 39) % 128;
                SdkCoreBusinessLogicModuleImpl = i4;
                int i5 = RecordsJson + 81;
                IccPrivateKeyCrtComponentsJson = i5 % 128;
                if (i5 % 2 == 0) {
                    getPaymentFci = (i4 + 43) % 128;
                }
            }
            if (z) {
                i = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
                if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
                    com.payair.hce.checkPermission checkpermission = this.AlternateContactlessPaymentDataJson;
                    android.view.View.MeasureSpec.getMode(0);
                    android.view.View.combineMeasuredStates(0, 0);
                    android.widget.ExpandableListView.getPackedPositionChild(0L);
                }
                i2 = RecordsJson + 101;
                IccPrivateKeyCrtComponentsJson = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        i = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
        if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
        }
        i2 = RecordsJson + 101;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
        }
    }

    private static java.lang.String DigitizedCardProfile(int i, char c, int i2) {
        int i3 = IccPrivateKeyCrtComponentsJson + 37;
        RecordsJson = i3 % 128;
        if (i3 % 2 == 0) {
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 53) % 128;
        }
        char[] cArr = new char[i];
        int i4 = 0;
        while (i4 < i) {
            int i5 = RecordsJson + 101;
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            if (i5 % 2 == 0) {
                getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 91) % 128;
                cArr[i4] = (char) ((valueOf[i2 + i4] ^ (i4 * getProfileVersion)) ^ c);
                i4++;
            } else {
                cArr[i4] = (char) ((valueOf[i2 * i4] - (i4 % getProfileVersion)) / c);
                i4 += 67;
            }
        }
        return new java.lang.String(cArr);
    }

    static void IccPrivateKeyCrtComponentsJson() {
        char[] cArr = new char[2192];
        java.nio.ByteBuffer.wrap("^úî\u0018?|LF\u009d§*÷{\u0099\u008b4Ø\bi.¶ Ç\u008c\u0014ç¥Ëõ\u0005\u0002}S\u001fà²1\u0085~Ñ\u008e{ß\u0006lh½¤Ê\u0096\u001bü¨Äø?\tvâ¿R@\u00838ð\u000e!ü\u0096·Ç\u009e7pdJÕ%\nÿ{\u0098¨\u008b\u0019\u0081IR¾/ï[\\Ö\u008dÈÂ\u00922scCÐm\u0001èv\u0093§\u008e\u0014 DEµ\u0007ê;[×\u0088éù\u008fÃ'sL¢\"Ñ\u0098\u0000,·\u0097æ\u0017\u0016ÜE1ôd+ÈZ\u0011\u0089F8\u0083hý\u009fõÎ\u000b}]¬\u0011ã¬\u0013øBÅñb úWå\u0086V5\u007fe\u0016\u0094\u0092ËÇz\u0088©\u0098Ø~\bP¿Åî\u0093\u001dKLä\u0083\u008e2\u001db\u0098\u0091&À³w\u0011¦\u00adÕâ\u0005¤´Áë¢\u001a\u0089I¨ø¿/\u0097_Ä\u008e½=$lL£wÒÆ\u0001á±yàá\u0017\u0093F°õ\u0095$±T|\u008bî:âiú\u0098iÏ:~ÿ®\u0013Ý\u001a\fìCtò\u008c!ÏQ¯\u0080Y7°fÃ\u0095áÄ\u000e{\u0004«\u0014Ú.\t3¸\u0004ï)\u001e\u0095N ý¤,:cy\u0092,Áºp\u0017 ï×9\u0006>µÀä\u0019\u001bFJäúý)ÄX\u0013\u008f±>vmE\u009dðÌÐ\u0003Z²Äáå\u0010/Go÷\t&\u009aUª\u0084ð;õjO\u009aìÉÅx1¯CÞÞ\r\u008e¼\u0013ì\u0090#\u001fR»\u008190\u00adgÓ\u0097¤Æ·uº¤BÛ\u0091\no¹\u0097éÜ\u0018½O,þ\\-H\\Æ\u008c}Ã\u0081rÞ¡\u009bÐ\u009a\u0007ö¶]æl\u0015.DÚûÓ*aY\u0012\u0088ï8\\o\u0012\u009e¦Ít|®³Ïã\u0081\u0012AA#ð8'\\V\u000e\u0085o5\u0014dR\u009b;Ê+yÆ¨ÕØÏ\u000f\u008d¾Eí|\u001cúSU\u0082P2jaÕ\u0090\u0096Ç¿vö¥ ÕÇ\u0004ê»øê|\u0019 H\u0091ÿc/\u008f^\u0014\u008d\u0084<ms\u0082¢¦Ñ\u008b\u0001ñ°õç\"\u0016\u008aE\u0087ôC$ÿ[I\u008a\u000e9¶hg\u009f\u001cÎØ~\u0099\u00adäÜ3\u0013\u0084B¬ñu!¦PÊ\u008706\u0012e\u009d\u0094\u0011Ë\u0003{\u0019ªÈÙ×\bÎ¿\u009aîÇ\u001e\u0090MùüB3\u0013b\u0093\u0091äÀ\u0019pî§nÖï\u0005K´õëç\u001aâJ\u0080ù5(Z_T\u008ej=þm\u0001\u009ciÓÖ\u0002#±Òà>\u0017\u0003G\u0014öu%\u0013T1\u008by:9j\u0007\u0099\u0019È\n\u007f\u000f®<ÝÌ\f\u0017¼ìói\"gQà\u0080Q7fgy\u0096,ÅHt3«!ÚY\tÞ¹ðè\u0092\u001fJNÒýÅ,\u0003\\¿\u0093\\ÂJq\u0094 Ð×W\u0006~¶ åå\u0014ÑK£ú\u008c)¾X&\u0088\u0090?\u0014nb\u009dèÌ\u001b\u0003\u0004³qâu\u0011n@E÷d&ÜUq\u0085´4\u001bk{\u009alÉ.x©¨\nß¿\u000e÷½¤ì\u009a#êR!\u0082s1\u0011`Õ\u0097mÆNu¸¥@Ô#\u000bÚºçéK\u0018èOñÿ\u009b.^].\u008c$Ãor!¡\u0099Ñ\u001b\u0000\u0083·õæ\u0013\u0015\u000eDüôì+6Z\t\u0089\u00128'oç\u009e<Î\u008a}z¬)ãã\u0012yAMñ} ÖW¨\u0086 5;dZ\u009bÿËÓzø©iØ\u008b\u000fÎ¾\u0003î´\u001dlL@\u0083\u001d2\u0005a\"\u0090\u0093ÀHw\b¦¢ÕF\u0004¾»_ë°\u001ayIIøb/\u001e^l\u008d\u0014=vlK£»Òn\u0001þ°¯çp\u0017áF\u008bõ\u001b$\u00ad[\f\u008a\u0094:=i\u009a\u0098ÌÏa~¯\u00ad\u0097Ü\u009b\f\u008dC¿ò¤!ØP®\u0087\u00077§fR\u0095-Ä½{\u0092ª\u009dÙ8\t·¸½ïA\u001e×M%üÈ,\u001bcI\u0092HÁ p\u0017§ÊÖÜ\u0006Uµ\u0093äß\u001bÀJZù\u001f(ÐX8\u008f/>\u0098mE\u009cNÓó\u0003\r²~áí\u0010\u0000Gæö+%\u0010U-\u00848;\u0004jI\u0099\u001aÈ x\u0010¯\u001fÞ\u0007\rÓ¼-óÓ\"\fR\u0082\u0081v0\u001dgá\u0096UÅ{uV¤6Û¡\n,¹\u0010èJ\u001fÍOÑþ§-_\\\u0095\u0093ÂÂdqT¡}Ð¯\u0007\u0080¶Áå«\u0014{D\u001eûþ*×Y\u0084\u0088ð?«nu\u009e\u0091Í5|\u0088³hââ\u0011¼A\u009dðÁ'\u0097V5\u0085¡4æk\u0088\u009bÀÊöy;¨}ß\u0004\u000eû¾5í¶\u001cÈS¨\u0082Ï1Â`â\u0090UÇ¶vß¥ÐÔB\u000bB»(êF\u0019/H\u009bÿE.\u0096]ä\u008dÍ<~sÝ¢8Ñ\u0081\u0000#·tç\r\u0016OE\u0014ôk+bZ\u0084\u008a\u00199×h\u0017\u009fÂÎ-}ã¬\fÜµ\u0013vBOñù ?WC\u0087p66eú\u0094,Ë¥zC©~ÙÙ\b£¿_îâ\u001dÚL\u001bü\u00103Mbõ\u0091\u0089Àãw\u0094¦ØÖÙ\u0005ö´Bë\u000f\u001a\u0012I\u0089øî(2_Û\u008eÜ=`l¦£\u0084Ó7\u0002ë±\u00adàø\u0017\"Fmõ¸%\fT]\u008bú:Gi¬\u0098¿Èý\u007fÚ®=ÝL\f`C·ò´\"\u0099QÉ\u0080 7½f¦\u0095NÅ]th«³ÚS\t\u0089¸lï\u0098\u001f\u001dN\u0082ýà,\u0010cö\u0092õÂÕqÓ \"×È\u0006iµ\u0086äþ\u0014\u001fK\u00adú\u0089)ÆX2\u008fb>Ünð\u009d¦Ì/\u0003'²Sá\u009d\u0011\u001c@2÷î&HU\u008a\u0084];wkG\u009aZÉ\u0089xá¯\u0012Þ\u0011\u000et½mìQ#¸Ro\u0081ã0d`§\u0097bÆhuk¤\u001bÛu\u000bîº_é/\u0018HOYþ\u0002-¯]\u009b\u008cÚÃ1r\u008f¡¶Ð~\u0007\\·\u0011æ\"\u0015 D«û\u0015*\u001dZ\u000e\u0089¶8\u008foÈ\u009e\u008bÍÍ|Z¬»ãB\u0012\u0000A;ð\u008e'\u000bWô\u0086D5Ñdþ\u009bëÊÁyä©úØ\u009e\u000f\u0007¾ïív\u001cõLO\u0083ö2(a\u0013\u0090\\Çuv«¦îÕà\u0004`» êù\u0019uHoøO/\u0094^Ù\u008dú<\u0019s@£HÒÁ\u0001¹°»çÆ\u0016\u0094Erõ®$R[»\u008a+9¡hÔ\u0098¯Ït~´\u00adWÜ\u0092\u0013\u0098B·òé!ÉPl\u0087B6&eÄ\u0095\u0010Ä\u008d{äª\u0093Ùo\bù¿éïn\u001eñMäüÇ3}b|\u0092\u0017Á\u001cp\u0010§\u009fÖz\u0005é´ÄäI\u001bMJ¸ù;(É_\u0010\u008e\u0016>.mB\u009c+Ó\u0002\u0002]±Ûá&\u0010\u0084G(öD%\u0012T\u0087\u008b7;ÈjM\u0099\u0019ÈÂ\u007f<®xÞ\u0016\r\t¼ìó\u0013\"ÝQ}\u0080\u008c0æg±\u0096`ÅÂtù«\u0017Û\u0097\n\u0006¹\u008cè¡\u001fúNìý_-¬\\Á\u0093¹Â\u008bqí \u009c×(\u0007¶¶<å«\u0014\u0017K¡ú±*¦YÂ\u0088¬?ýn\u0092\u009dÄÌ¿|¹³ÉâG\u0011B@j÷ü'1V\u0095\u0085å4\u0093kª\u009aøÉ\u007fyf¨Ëßì\u000eë½eì\u000e\u001c\u001fS\u0015\u0082ð1ç`J\u0097ØÆßv²¥EÔX\u000b\u000bºÄé\u0010\u0019ÊH6ÿ3.+]d\u008c%Ãîs>¢±Ñ(\u0000ï·\u0011æI\u0015?EÎôE+\u001aZÂ\u0089t8öhL\u009f\u0097Î\u009c}ý¬×ãú\u0012\u0010BÐñT íW\u0005\u0086ç5³e\u0010\u0094¹Ëúz\u009d©ÄØ¨\u000fÉ¿ÅîÏ\u001d6L\u0004\u0083\u00062\u009ab\"\u00913À×w¥¦\u0094Õ¯\u0004\u0090´0ë×\u001a\u009aIäø#/\u0019^¹\u008e\u0018=VlÖ£LÒì\u0001\u0089±\u0084à\u0013\u0017«F}õ\u0089$f[\r\u008bP:7im\u0098\bÏc~ì®\u0098Ýã\f~CiòD!\u00adPI\u0080ø73f5\u0095\u0084Äf{\u001e«6Ú¿\tò¸Uï§\u001e\"Mdý¨,Àc\u0016\u0092çÁ¿p4§9×i\u0006ÒµÈäÌ\u001bæJ\u0001ú\u0090)\u0097X\u001d\u008fý>èmâ\u009c1Ìè\u0003>²íág\u0010çGò÷\u0018&ÑUò\u0084\u0090;ÛjL\u0099ÁÉýx\u008f¯\rÞ\u0014\rT¼\u0082ìL#;Rã\u0081Õ0Ág®\u0096>Æ(u}¤\u0092Û \n;¹yém\u0018JO\u0094þ\u0092-\u009e\\\u0099\u0093¡ÃÖr\u008b¡RÐ~\u0007\u001b¶ôå\u008d\u0015KDÿû¡*[Y§\u0088¦8JoË\u009eÔÍð|_³@âÉ\u0012\u001cA ðÉ'>V\u0092\u0085ô5Vds\u009b\u0099Êùyê¨8ß\u001f\u000f\"¾^í\u0005\u001c\bS\u001f\u0082Ò2\u0012a\u0082\u0090\bÇ\u00adv\u001e¥ÇÔ%\u0004Ã»\u000bê1\u0019öH\u000eÿp.Ò^Ë\u008d½<%s¯¢_Ñ«\u0001Ê°öçP\u0016ûEßô +E[0\u008a¬9ìhÆ\u009f\u0099Îy~¢\u00adóÜ\u0086\u0013uBéñ¼ :P¢\u0087/6\u0089e\u000e\u0094\u009fËØ{\u0092ª\u008eÙ\u008c\b\u001b¿¦î®\u001d¡Mÿü\u008b30bv\u0091aÀüp4§KÖ\u008f\u0005¡´®ëÀ\u001aJJZùû(ì_Ã\u008eW=\u001alÙ\u009cJÓ \u0002å±Fàÿ\u0017ýGàös%;T\t\u008b¦:8iw\u0099\"Èu\u007f\r®\\Ý\u0017\fÃ¼\u0012ó\u008b\"\bQh\u0080'7Yf=\u0096\u0089Å\u000bt\u0005«îÚ|\tp¹#è;\u001fÕN-ý\u0096,DcP\u0093ÚÂ\u001eqP æ××\u0006\u0004µ]åA\u0014¤K\u0092úÎ)ÜXy\u0088\u009f?ón-\u009d\u008eÌ*\u0003¤²\u001aâ¢\u0011$@\u001a÷\u0092&{Uq\u0085\u00114\u0007k\u0006\u009aÜÉ\fx\u008b¯\u0011ßÜ\u000e{½{ìü#aR\u0016\u0082¥1(`p\u0097%Æ=uS¤þÔø\u000bÎºFéê\u0018ÏO\u001fþI.l]C\u008cHÃÜro¡vÑ<\u0000ß·Ñæ¥\u0015ÐDªû\u001e+\u0090Z\b\u0089e8\u0015oÿ\u009edÎ\u0091}4¬\u008aã'\u0012\u008cA\u008dð\u0091 ûWÿ\u0086\u001b5ddj\u009b\u0092ËKz¨©tØ¥\u000f\u0000¾ßíà\u001dxL©\u0083Â2öaC\u00906ÀIwu¦ÎÕ\u008a\u0004D»sêú\u001a0ISøç/%^¬\u008d.<Ol\u0010£tÒý\u0001\u000b°{çú\u0017\u0011FKõ\u000e$a[\u0004\u008a×9\u0011i\u008f\u0098{Ï\u001e~ä\u00adWÜ.\fHC7ò\u0094!-P\u0014\u0087c6Åfø\u0095ÚÄ^{\u0082ªÇÙ!\tÉ¸vïR\u001e¢MÄü\u00813~cg\u0092×Á\u009cp\u00ad§ãÖª\u0005\"µ\u0090äs\u001b}J9ù\u0087(¯X\u0090\u008fü>\u008am:\u009c\u0084Óô\u0002\u0081²\u008cá÷\u0010~G\u009cö[%¢Uh\u0084«;\u0086j\u00ad\u0099õÈç\u007f\u0087¯xÞ¼\rÒ¼ÜóC\"\u0011RI\u0081\u001f0Ög\u009a\u0096|Å\u0093tù¤ÐÛS\nÔ¹-è\u009a\u001f&O\u0080þ\u0010-X\\õ\u0093bÂ\u001bqÉ¡\u0000Ð¶\u00076¶\u009aå\f\u0014§K\u0001ûÁ*{YT\u0088\u001c?\u0015n&\u009eZÍ/|\u008b³ÕâÞ\u0011b@uðø'ãVV\u0085£4Ïkr\u009bÉÊ#yR¨\u009cßü\u000e¨½YíÈ\u001cßS1\u0082µ1\u008e`ª\u0090®ÇàvM¥uÔ\"\u000b\u009fº\u0093ê\u0080\u0019ÖH\u008aÿÜ.\u008b]*\u008c\u0081<\u009esÿ¢UÑ\u0094\u0000\u0013·¢çP\u0016«EïôU+\u0096Zþ\u0089k9xh^\u009f~ÎÎ}\u001f¬/Üu\u0013PBbñ\u0098 hWÍ\u0086u6\u008de\u001f\u0094;Ë\u0098z\u001c©rÙÙ\bL¿\u0005îA\u001d\\L7\u0083í3\u009cb\u009b\u0091\"À»w«¦JÕ-\u0005+´'ë\u0014\u001a¸I ø\u0012(@_»\u008e\u0089=Ál\u0096£ÎÒV\u0002ô±Uà\u0001\u0017*F\u009bõ\u001b%õT^\u008bî:Tiè\u0098\u009eÏõ\u007fï®\u009bÝ\u0001\f\u0000Ckòö\"\u0006QÌ\u0080&7ÁfS\u0095»Ä§t\u001c«ÂÚ¦\t¶¸'ï}\u001f-N{ýª,¹c \u0092wÁ\u009eqe 7×¡\u0006AµìäJ\u001bAKtúz)\u0099X\n\u008f\u001f>ænu\u009dSÌj\u0003h²`á\u008c\u0010u@Ó÷\u001f&`U\u0080\u0084\u0010;Jk\u001f\u009aSÉ\u0095xI¯\u001bÞ\u0007\rÑ½\u009cì\u0087#:Rß\u0081£0n`\u00ad\u0097\u0007Æ6uø¤ ÛÄ\n\u001aºdé³\u0018\u0095OÉþê-Î\\2\u008côÃqr\u0019¡\u0006Ðã\u0007ÿ·ôæ´\u0015îDcûà*°Yå\u0089³8\u0093oa\u009eøÍO|Æ¬=ãÏ\u0012ÂAÉð¨'\u0083V\u0082\u0086\u001c5\u009ed¶\u009bÐÊ'y\t©-Ø\u001e\u000f²¾Ôí\u0018\u001cËS\u009d\u0083Õ27aÛ\u0090IÇ\u0091vB¦ßÕt\u0004\u0002»\u0091ê(\u0019\u007fHöød/½^R\u008d\u0080<hsµ¢eÒÒ\u0001\u001f°*çx\u0016rEBõ1$K[¹\u008a±9÷h\u0006\u009f5Ï\u009c~´\u00ad2Üù\u0013«B6ò\u00ad!nP6\u0087Ä6\u0098eú\u0094=Ä\u009e{»ªhÙÑ\b\u0087¿Îï¨\u001e\u0084MCü\u00113\u001dbû\u0091éÁäp¸§îÖ·\u0005ï´`ëå\u001bòJ\u009bù\"(ð_S\u008eÆ>\u0005mÏ\u009c°Ó1\u0002Å±\u009aà4\u0010\u001cG\tö¶%¸T×\u008bM;-j<\u0099ªÈñ\u007f\u0010® Ý½\rõ¼Gó$\"PQ|\u0080J0¬gå\u0096sÅ\u0000t\u0007«fÚð\ný¹»ès\u001fûNêý.,|\\\u0014\u0093\u0087ÂÜqé \u0010×S\u00074¶ÒåÞ\u0014¨K¡ú\u0087)\u0005Y½\u0088J?¨np\u009d²Ì\u0094|¼³!â§\u0011\f@\u0081÷ï&¤V¿\u0085Ú4;kQ\u009anÉ×y}¨\u009eß¹\u000e\u0080½>ìê#ÍS}\u0082\u00801÷`¡\u0097nÆ\u000fv\u0004¥yÔ\u0003\u000bÄºié\u0091\u0018×H(ÿ^.Ç](\u008c®Ã\u0003r{¢=ÑX\u00008·NæN\u0015\u0086E5ô×+;Z\u001e\u0089\u00018Áo$\u009f\u00adÎ^}M¬Ñã|\u0012kBCñ\u001a «W\u0000\u0086È5ndß\u0094õËÎzs©³Øê\u000fy¿\u0084îG\u001d\u009fL³\u0083é2°aL\u0091¶ÀÒw\u00ad¦\u0098Õò\u0004\u008f»\u0013ë6\u001a\nI×øI/½^\u009f\u008e:=Ôl\u0090£\u0083Ò-\u0001T°§às\u0017PFùõ:$][\u0084\u008bh:\ti\u0085\u0098\u008fÏö~D\u00adFÝZ\fbCsò\u0017!ePÔ\u0080o7Pfp\u0095\u0097ÄZ{¤ªcÚÙ\ty¸Xï\u0096\u001e\u0016M\fý\u0000,Ic\u008d\u0092SÁ\\p=§¬×¦\u0006ßµ\u0010ä\u0085\u001b\u00adJsù#)\u0013XØ\u008fâ>¾m³\u009c\u0004Ìl\u0003\u0089²¸áó\u0010øGÄö!&ÞU~\u0084ÿ;>j\u0095\u0099ýÉâx\u0092¯èÞ\u008b\rÖ¼¨óÿ#ßRù\u0081$0\u0012gG\u0096\u008cÆ|uÁ¤\u0083Û×\nÂ¹½èÓ\u0018\"O\u0099þ¨-Ø\\-\u0093\u001dÂ§r\u0012¡XÐÒ\u00072¶Øå\u009b\u0015\u009eD\u0001ûº*OYÄ\u0088T?koB\u009eXÍ{|g³\u0015â\u009e\u0012nAãðh'=VR\u0085\u00884{dÑ\u009b\u0001Ê\u001ey\u0096¨Gß\f\u000f\u0012¾Aí±\u001c[Só\u0082<1na¦\u0090ÎÇ(vû¥\u00adÔ\u000f\u000b+»Zê \u0019ÎH¾ÿå.\u0017^Ã\u008d\u0081<\u0000sË¢\u009fÑÔ\u0000F°þç[\u0016ÿEtô\u0095+ù[ê\u008aµ9àhÓ\u009fÕÎY}ÿ\u00adýÜ\u0081\u0013\bB\nñe \u008cPV\u0087É6æeÇ\u0094\u0082Ë¼zwª\u001aÙ4\b ¿ðî-\u001d7MWüD3 b¹\u0091:Àøw\u0093§¶Ö\t\u0005L´Në$\u001aTI\u000bùz(i_c\u008e\u0016=\u0015lå\u009cnÓØ\u0002`±úàe\u0017\u0003ï\u0090_S\u008e$ý\u007f,\u0085\u009bÜÊú:\u000fi<ØI".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2192);
        SdkCoreAlternateContactlessPaymentDataImpl = cArr;
        getAid = -5264368745405026698L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getPaymentFci = 1;
        IccPrivateKeyCrtComponentsJson();
        IccPrivateKeyCrtComponentsJson = 0;
        RecordsJson = 1;
        char[] cArr = new char[1060];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(62 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (40259 - (android.view.ViewConfiguration.getTouchSlop() >> 8)), 2120 - android.view.View.MeasureSpec.getMode(0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(android.text.TextUtils.getOffsetAfter("", 0) + 2182, (char) (android.view.KeyEvent.getDeadChar(0, 0) + 45430), 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 1060);
        valueOf = cArr;
        getProfileVersion = 1697923990766729104L;
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 27) % 128;
    }

    public final void getProfileVersion() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1545492321, 1545492322, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$d = new byte[]{82, -59, -67, 97};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE;
    }

    public final byte[] valueOf(java.lang.String str, int i) {
        return (byte[]) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, str, java.lang.Integer.valueOf(i)}, 1073821533, -1073821533, i);
    }
}
