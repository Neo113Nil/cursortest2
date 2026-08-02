package com.payair.hce;

/* loaded from: classes4.dex */
public final class setAuthenticationAquirer extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static byte[] IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getCiacDecline;
    private static char getCvrMaskAnd;
    private static char getGpoResponse;
    private static char getPaymentFci;
    private static int getProfileVersion;
    private static int valueOf;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i3;
        if ((i * (-665)) + (i2 * com.visa.cbp.getCertUsage.setODAData) + (i4 * (-333)) + (((~(i4 | i5)) | (~(i2 | i3))) * com.visa.cbp.getCertUsage.getODAData) + (((~(i2 | i5)) | (~(i3 | i4))) * com.visa.cbp.getCertUsage.getODAData) != 1) {
            return valueOf(objArr);
        }
        com.payair.hce.setAuthenticationAquirer setauthenticationaquirer = (com.payair.hce.setAuthenticationAquirer) objArr[0];
        com.payair.hce.sign signVar = (com.payair.hce.sign) objArr[1];
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 107) % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 49) % 128;
        java.util.List<com.payair.hce.onDeviceAuthenticationUnsuccessful> profileVersion = setauthenticationaquirer.getProfileVersion();
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 85) % 128;
        int i6 = 0;
        while (i6 < profileVersion.size()) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 89) % 128;
            com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = profileVersion.get(i6);
            byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.onDeviceAuthenticationUnsuccessful.writeReplace(new java.lang.Object[]{ondeviceauthenticationunsuccessful}, -830821527, 830821527, java.lang.System.identityHashCode(ondeviceauthenticationunsuccessful)));
            byte[] AlternateContactlessPaymentDataJson2 = setauthenticationaquirer.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace().getBytes());
            android.database.sqlite.SQLiteStatement compileStatement = setauthenticationaquirer.DigitizedCardProfile.getWritableDatabase().compileStatement(values((byte) 0, 1244456641, -3, (short) 5, -1957468144).intern());
            compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson);
            compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson2);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            i6++;
            int i7 = getCiacDecline + 19;
            SdkCoreBusinessLogicModuleImpl = i7 % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = i7 % 2 == 0 ? (r2 >>> com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) - 24612 : (getProfileVersion + 107) % 128;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$d;
        int i3 = s * 4;
        int i4 = 4 - (i * 2);
        int i5 = 110 - (s2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i6 = 0 - i3;
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i4++;
            i5 = (-i5) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i5;
            i5 = bArr[i4];
            i4++;
            i5 = (-i5) + i7;
            i2 = i8;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setAuthenticationAquirer setauthenticationaquirer = (com.payair.hce.setAuthenticationAquirer) objArr[0];
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 71;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 87) % 128;
            super.valueOf();
            return null;
        }
        int i2 = SdkCoreBusinessLogicModuleImpl + 105;
        getCiacDecline = i2 % 128;
        int i3 = i2 % 2;
        super.valueOf();
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 77;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = SdkCoreBusinessLogicModuleImpl + 55;
            getCiacDecline = i2 % 128;
            int i3 = i2 % 2;
            super.values();
            throw new java.lang.ArithmeticException();
        }
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        super.values();
        int i4 = getProfileVersion + 53;
        SdkCoreAlternateContactlessPaymentDataImpl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = SdkCoreBusinessLogicModuleImpl + 39;
            getCiacDecline = i5 % 128;
            if (i5 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if ((r1 >> 22) != 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        com.payair.hce.setAuthenticationAquirer.SdkCoreBusinessLogicModuleImpl = (r2 + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004b, code lost:
    
        throw null;
     */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean writeReplace() {
        int i = getCiacDecline;
        SdkCoreBusinessLogicModuleImpl = (i + 69) % 128;
        int i2 = getProfileVersion + 59;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            super.writeReplace();
            throw new java.lang.ArithmeticException();
        }
        SdkCoreBusinessLogicModuleImpl = (i + 79) % 128;
        boolean writeReplace2 = super.writeReplace();
        int i3 = SdkCoreBusinessLogicModuleImpl + 111;
        int i4 = i3 % 128;
        getCiacDecline = i4;
        if (i3 % 2 != 0) {
            int i5 = getProfileVersion;
            SdkCoreAlternateContactlessPaymentDataImpl = (i5 >> 49) % 31818;
        } else {
            int i6 = getProfileVersion + 27;
            SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
        }
    }

    public setAuthenticationAquirer(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        super(ongetcertoperationunsuccessful);
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        $11 = ($10 + 121) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            int i3 = $11 + 103;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson >>> 1];
                i2 = 1;
            } else {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                i2 = 0;
            }
            $10 = ($11 + 69) % 128;
            int i4 = 58224;
            while (i2 < 16) {
                $11 = ($10 + 65) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (getPaymentFci ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getGpoResponse)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 63, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 1336, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (short) 0, (short) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(getCvrMaskAnd)};
                    int i5 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1335 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(0, (short) 0, (short) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                    i2++;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 53, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3543, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0116, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0117, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0119, code lost:
    
        r12 = DigitizedCardProfile(r12.getBytes());
        r2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{r12}, -1877837077, 1877837077, java.lang.System.identityHashCode(r12))).writeReplace();
        r0.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{r12}, -1877837077, 1877837077, java.lang.System.identityHashCode(r12)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0156, code lost:
    
        r0.bindBlob(2, DigitizedCardProfile(r2));
        r12 = r0.executeUpdateDelete();
        r0.clearBindings();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0164, code lost:
    
        if (r12 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0166, code lost:
    
        r12 = com.payair.hce.setAuthenticationAquirer.getProfileVersion + 91;
        com.payair.hce.setAuthenticationAquirer.SdkCoreAlternateContactlessPaymentDataImpl = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016f, code lost:
    
        if ((r12 % 2) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0171, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0173, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0174, code lost:
    
        r0 = new java.lang.Object[1];
        c("\uf87a䫉ᄿ\ue4ba蕗륯⺥〢泣ꆓ販莾㜽婨鹅㙩⺥〢䜋쁯퇻曐\uee6d뀔ᄿ\ue4ba\uf3c8\u0ea4ň蜈", 29 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018e, code lost:
    
        throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) r0[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0149, code lost:
    
        r2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(new byte[0]).writeReplace();
        r0.bindNull(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        r2 = com.payair.hce.setAuthenticationAquirer.SdkCoreBusinessLogicModuleImpl + 37;
        com.payair.hce.setAuthenticationAquirer.getCiacDecline = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0112, code lost:
    
        if ((r2 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0114, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if (android.text.TextUtils.isEmpty(r12) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(java.lang.String str) {
        android.database.sqlite.SQLiteStatement compileStatement;
        java.lang.String str2;
        int i = getCiacDecline + 63;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            int i2 = 4 / 4;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        if (android.database.DatabaseUtils.queryNumEntries(writableDatabase, values((byte) 0, 1244456657, -3, (short) 55, -1957468399).intern()) == 0) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 11) % 128;
            android.database.sqlite.SQLiteStatement compileStatement2 = writableDatabase.compileStatement(values((byte) 0, 1244456629, -3, (short) -76, -1957468373).intern());
            if (android.text.TextUtils.isEmpty(str)) {
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 41) % 128;
                str2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(new byte[0]).writeReplace();
                compileStatement2.bindNull(1);
            } else {
                com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(str.getBytes());
                java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))).writeReplace();
                compileStatement2.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
                str2 = writeReplace2;
            }
            compileStatement2.bindBlob(2, DigitizedCardProfile(str2));
            long executeInsert = compileStatement2.executeInsert();
            compileStatement2.clearBindings();
            if (executeInsert != -1) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            c("\uf87a䫉ᄿ\ue4ba蕗륯⺥〢泣ꆓ販莾㜽婨鹅㙩⺥〢䜋쁯퇻曐\uee6d뀔ᄿ\ue4ba\uf3c8\u0ea4ň蜈", 29 - android.graphics.Color.red(0), objArr);
            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
        }
        int i3 = getCiacDecline + 115;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 == 0) {
            compileStatement = writableDatabase.compileStatement(values((byte) 0, 1244456641, 2, (short) 67, -1957468294).intern());
        } else {
            compileStatement = writableDatabase.compileStatement(values((byte) 0, 1244456641, -3, (short) 33, -1957468294).intern());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r0.moveToFirst() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String IccPrivateKeyCrtComponentsJson() {
        android.database.Cursor rawQuery;
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 79) % 128;
        int i = getProfileVersion + 29;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            DigitizedCardProfile();
            rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(values((byte) 1, 1244456639, 118, (short) 68, -1957468224).intern(), null);
            if (!rawQuery.moveToFirst()) {
                getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 43) % 128;
                int i2 = getProfileVersion + 35;
                SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                if (i2 % 2 == 0) {
                    getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 1) % 128;
                }
                rawQuery.close();
                return null;
            }
            byte[] writeReplace2 = writeReplace(new com.payair.hce.Initializer(rawQuery.getBlob(rawQuery.getColumnIndex(values((byte) 0, 1244456670, -3, (short) -16, -1957468184).intern()))));
            rawQuery.close();
            java.lang.String values = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(writeReplace2).values();
            int i3 = SdkCoreBusinessLogicModuleImpl + 87;
            getCiacDecline = i3 % 128;
            if (i3 % 2 == 0) {
                return values;
            }
            throw null;
        }
        DigitizedCardProfile();
        rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(values((byte) 0, 1244456639, -3, (short) 99, -1957468224).intern(), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00af, code lost:
    
        if ((r2 << 5) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00c5, code lost:
    
        com.payair.hce.setAuthenticationAquirer.getCiacDecline = (r0 + 57) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d0, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
    
        com.payair.hce.setAuthenticationAquirer.getCiacDecline = (r0 + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00bc, code lost:
    
        if ((r2 % 2) == 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.List<com.payair.hce.onDeviceAuthenticationUnsuccessful> getProfileVersion() {
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(values((byte) 0, 1244456639, -3, (short) 99, -1957468224).intern(), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rawQuery.moveToFirst()) {
            while (!rawQuery.isAfterLast()) {
                com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = new com.payair.hce.onDeviceAuthenticationUnsuccessful();
                byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(values((byte) 0, 1244456670, -3, (short) -16, -1957468184).intern()));
                byte[] blob2 = rawQuery.getBlob(rawQuery.getColumnIndex(values((byte) 0, 1244456655, -3, (short) -83, -1957468152).intern()));
                com.payair.hce.onDeviceAuthenticationUnsuccessful.writeReplace(new java.lang.Object[]{ondeviceauthenticationunsuccessful, blob}, 1804796914, -1804796911, java.lang.System.identityHashCode(ondeviceauthenticationunsuccessful));
                com.payair.hce.onDeviceAuthenticationUnsuccessful.writeReplace(new java.lang.Object[]{ondeviceauthenticationunsuccessful, blob2}, 318470703, -318470702, java.lang.System.identityHashCode(ondeviceauthenticationunsuccessful));
                arrayList.add(ondeviceauthenticationunsuccessful);
                rawQuery.moveToNext();
            }
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 97) % 128;
        }
        rawQuery.close();
        int i = SdkCoreBusinessLogicModuleImpl;
        int i2 = i + 23;
        getCiacDecline = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl / 85;
            getProfileVersion = i3 << 848;
        } else {
            int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 85;
            getProfileVersion = i4 % 128;
        }
    }

    public final void getAid() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getCiacDecline = (i + 11) % 128;
        int i2 = (i + 63) % 128;
        getCiacDecline = i2;
        int i3 = getProfileVersion + 47;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 == 0) {
            SdkCoreBusinessLogicModuleImpl = (i2 + 81) % 128;
        }
        this.DigitizedCardProfile.getWritableDatabase().delete(values((byte) 0, 1244456657, -3, (short) 55, -1957468399).intern(), null, null);
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 67;
        getProfileVersion = i4 % 128;
        if (i4 % 2 == 0) {
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 69) % 128;
        } else {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 91) % 128;
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson() {
        int i;
        int i2 = SdkCoreBusinessLogicModuleImpl;
        getCiacDecline = (i2 + 67) % 128;
        int i3 = getProfileVersion + 91;
        SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
        if (i3 % 2 == 0) {
            getProfileVersion().size();
            throw new java.lang.ArithmeticException();
        }
        int i4 = i2 + 29;
        getCiacDecline = i4 % 128;
        if (i4 % 2 != 0) {
            getProfileVersion().size();
            throw null;
        }
        java.util.List<com.payair.hce.onDeviceAuthenticationUnsuccessful> profileVersion = getProfileVersion();
        int size = profileVersion.size();
        if (size > 0) {
            int i5 = 0;
            boolean z = false;
            while (true) {
                if (i5 >= size) {
                    break;
                }
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 83) % 128;
                com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful = profileVersion.get(i5);
                byte[] bArr = (byte[]) com.payair.hce.onDeviceAuthenticationUnsuccessful.writeReplace(new java.lang.Object[]{ondeviceauthenticationunsuccessful}, -830821527, 830821527, java.lang.System.identityHashCode(ondeviceauthenticationunsuccessful));
                com.payair.hce.onDeviceAuthenticationUnsuccessful ondeviceauthenticationunsuccessful2 = profileVersion.get(i5);
                z = valueOf(values((byte) 0, 1244456625, -3, (short) 33, -1957468174).intern(), (byte[]) com.payair.hce.onDeviceAuthenticationUnsuccessful.writeReplace(new java.lang.Object[]{ondeviceauthenticationunsuccessful2}, 113848216, -113848214, java.lang.System.identityHashCode(ondeviceauthenticationunsuccessful2)), com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace().getBytes());
                if (z) {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 13) % 128;
                    break;
                }
                int i6 = SdkCoreAlternateContactlessPaymentDataImpl + 17;
                getProfileVersion = i6 % 128;
                if (i6 % 2 != 0) {
                    SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 57) % 128;
                } else {
                    int i7 = getCiacDecline;
                    int i8 = i7 + 105;
                    SdkCoreBusinessLogicModuleImpl = i8 % 128;
                    if (i8 % 2 != 0) {
                        i5++;
                        SdkCoreBusinessLogicModuleImpl = (i7 + 83) % 128;
                    }
                }
                i5 += 26;
            }
            if (z) {
                i = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
                if (i != com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
                    int i9 = SdkCoreBusinessLogicModuleImpl + 45;
                    getCiacDecline = i9 % 128;
                    if (i9 % 2 == 0) {
                        return;
                    }
                }
                com.payair.hce.checkPermission checkpermission = this.AlternateContactlessPaymentDataJson;
                android.view.KeyEvent.getMaxKeyCode();
            }
        }
        i = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
        if (i != com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
        }
        com.payair.hce.checkPermission checkpermission2 = this.AlternateContactlessPaymentDataJson;
        android.view.KeyEvent.getMaxKeyCode();
    }

    private static java.lang.String values(byte b, int i, int i2, short s, int i3) {
        int i4;
        int i5;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = writeReplace;
        int i7 = i2 + i6;
        int i8 = 0;
        boolean z = i7 == -1;
        if (z) {
            i7 = (byte) (IccPrivateKeyCrtComponentsJson[valueOf + i3] + i6);
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 53) % 128;
        }
        if (i7 > 0) {
            int i9 = valueOf;
            if (z) {
                int i10 = SdkCoreAlternateContactlessPaymentDataImpl + 119;
                getProfileVersion = i10 % 128;
                if (i10 % 2 == 0) {
                    i8 = 1;
                }
            }
            int i11 = ((i3 + i7) - 2) + i9 + i8;
            char c = (char) (i + getAid);
            sb.append(c);
            for (int i12 = 1; i12 < i7; i12++) {
                int i13 = SdkCoreBusinessLogicModuleImpl + 63;
                int i14 = i13 % 128;
                getCiacDecline = i14;
                if (i13 % 2 == 0) {
                    SdkCoreBusinessLogicModuleImpl = (i14 + 83) % 128;
                    int i15 = SdkCoreAlternateContactlessPaymentDataImpl + 17;
                    getProfileVersion = i15 % 128;
                    if (i15 % 2 == 0) {
                        SdkCoreBusinessLogicModuleImpl = (i14 + 33) % 128;
                        i4 = i11 - 1;
                        i5 = c + (((byte) (IccPrivateKeyCrtComponentsJson[i11] + s)) ^ b);
                    } else {
                        i4 = i11 + 127;
                        i5 = c << (((byte) (IccPrivateKeyCrtComponentsJson[i11] % s)) ^ b);
                    }
                    i11 = i4;
                    c = (char) i5;
                    sb.append(c);
                } else {
                    throw null;
                }
            }
        }
        java.lang.String obj = sb.toString();
        int i16 = SdkCoreBusinessLogicModuleImpl + 17;
        getCiacDecline = i16 % 128;
        if (i16 % 2 == 0) {
            return obj;
        }
        throw new java.lang.ArithmeticException();
    }

    static void RecordsJson() {
        RecordsJson = (char) 13795;
        getCvrMaskAnd = (char) 25073;
        getPaymentFci = (char) 40646;
        getGpoResponse = (char) 36315;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getCiacDecline = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        RecordsJson();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        valueOf = 1957468399;
        writeReplace = 2;
        IccPrivateKeyCrtComponentsJson = new byte[]{com.google.common.base.Ascii.CAN, -42, com.visa.cbp.getEncExpo.startTransaction, -50, -47, -74, com.visa.cbp.getEncExpo.kernelVersion, -56, -43, -51, -57, -74, -36, -58, -50, -76, com.visa.cbp.getEncExpo.kernelVersion, -46, -63, -56, -56, -58, -46, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -47, -46, 77, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 57, 99, 84, com.google.common.base.Ascii.EM, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 60, 85, 87, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -126, 76, 67, 85, -1, 68, 78, 84, 84, 74, 73, 81, -113, 64, 88, 0, 70, 73, 98, 70, kotlin.io.encoding.Base64.padSymbol, 81, 78, 84, 63, -98, 68, 84, -6, 89, 67, 81, 84, 57, 82, 75, 88, 80, 74, 57, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 73, 81, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 82, 85, 68, 75, 75, 73, 85, 63, 84, 85, -111, com.google.common.base.Ascii.GS, 71, 82, 81, 117, com.google.common.base.Ascii.CAN, 78, 89, 62, 81, 81, 68, -6, com.visa.cbp.getEncExpo.startTransaction, -2, -62, -4, -110, -41, -31, -25, -25, -35, -36, -28, 34, -45, -21, -33, com.visa.cbp.getEncExpo.startTransaction, -2, -62, -4, -109, -39, -36, -11, -39, -48, -28, -31, -25, -46, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -85, -18, -47, 18, -115, -20, -42, -28, -25, -52, -27, -34, -21, -29, -35, -52, -14, -36, -28, -54, -27, -24, -41, -34, -34, -36, -24, -46, -25, -24, 36, -70, -48, -14, -36, -45, -38, 38, -86, -108, -94, -91, -118, -93, -100, -87, -95, -101, -118, -80, -102, -94, -120, -93, -90, -107, -100, -100, -102, -90, -112, -91, -90, -30, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -101, -102, -87, -61, -109, -89, 105, -82, -101, -106, -92, -113, 8, 10, 13, 38, 10, 1, com.google.common.base.Ascii.NAK, 18, com.google.common.base.Ascii.CAN, 3, com.google.common.base.Ascii.DC4, -40, -23, -32, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -98, -52, -14, -36, 35, -117, -27, -24, -41, -34, -34, -36, -24, -46, -25, 8, 6, 75, 85, 91, 91, 81, 80, 88, 66, com.google.common.base.Ascii.SYN, -36, com.google.common.base.Ascii.SUB, -34, com.google.common.base.Ascii.CAN, -82, -13, -3, 3, 3, -7, -8, 0, 62, -17, -24, com.google.common.base.Ascii.SUB, -34, com.google.common.base.Ascii.CAN, -81, -11, -8, 17, -11, -20, 0, -3, 3, -18, 77, -57, 10, -19, 46, -87, 8, -14, 0, 3, -24, 1, -6, 7, -1, -7, -24, 14, -8, 0, -26, 1, 4, -13, -6, -6, -8, 4, -18, 3, 4, 64, -42, -20, 14, -8, -17, -10};
        getAid = -1244456556;
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 111) % 128;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void valueOf() {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 947407740, -947407740, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$d = new byte[]{125, com.google.common.base.Ascii.SI, -77, -54};
        $$e = 149;
    }

    public final void values(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, signVar}, 2050070223, -2050070222, java.lang.System.identityHashCode(this));
    }
}
