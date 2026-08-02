package com.payair.hce;

/* loaded from: classes4.dex */
public final class isVisaOfflinePaymentsSupported extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static long RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char[] getAid;
    private static int getCiacDecline;
    private static int getProfileVersion;
    private static char[] valueOf;
    private final com.payair.hce.onGeneratePublicKeyUnsuccessful writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = i * 3;
        byte[] bArr = $$d;
        int i6 = 3 - (i2 * 3);
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            int i8 = i7;
            i4 = i6;
            i3 = 0;
            i6 += i8;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i8 = bArr[i4];
            i6 += i8;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i6 = (b * 2) + 99;
            i4 = i6;
            bArr2[i3] = (byte) i6;
            i4++;
            if (i3 == i7) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if ((r2 / 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.getCiacDecline = (r1 + 121) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
    
        if ((r2 % 2) != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = (~(i4 | (~i2))) | (~(i4 | i3));
        int i6 = (i * (-495)) + (i2 * (-495)) + (i5 * 992) + (((~(i | (~i3) | i2)) | i5) * (-496)) + ((i2 | i3) * 496);
        if (i6 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        int i7 = 0;
        if (i6 == 2) {
            com.payair.hce.isVisaOfflinePaymentsSupported isvisaofflinepaymentssupported = (com.payair.hce.isVisaOfflinePaymentsSupported) objArr[0];
            int i8 = getCiacDecline + 67;
            SdkCoreBusinessLogicModuleImpl = i8 % 128;
            getProfileVersion = i8 % 2 != 0 ? IccPrivateKeyCrtComponentsJson >> 31 : (IccPrivateKeyCrtComponentsJson + 55) % 128;
            boolean writeReplace = super.writeReplace();
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 109) % 128;
            int i9 = getProfileVersion + 117;
            IccPrivateKeyCrtComponentsJson = i9 % 128;
            int i10 = i9 % 2;
            return java.lang.Boolean.valueOf(writeReplace);
        }
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        int intValue2 = ((java.lang.Number) objArr[1]).intValue();
        char charValue = ((java.lang.Character) objArr[2]).charValue();
        int i11 = SdkCoreBusinessLogicModuleImpl;
        int i12 = i11 + 43;
        getCiacDecline = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 2 / 5;
        }
        int i14 = i11 + 87;
        getCiacDecline = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = IccPrivateKeyCrtComponentsJson % 103;
            getProfileVersion = i15 + 13607;
        } else {
            int i16 = IccPrivateKeyCrtComponentsJson + 71;
            getProfileVersion = i16 % 128;
        }
        char[] cArr = new char[intValue2];
        while (i7 < intValue2) {
            int i17 = getCiacDecline;
            SdkCoreBusinessLogicModuleImpl = (i17 + 85) % 128;
            int i18 = IccPrivateKeyCrtComponentsJson + 53;
            getProfileVersion = i18 % 128;
            if (i18 % 2 != 0) {
                SdkCoreBusinessLogicModuleImpl = (i17 + 25) % 128;
                cArr[i7] = (char) ((valueOf[intValue >>> i7] - (i7 + SdkCoreAlternateContactlessPaymentDataImpl)) / charValue);
                i7 += 111;
            } else {
                cArr[i7] = (char) ((valueOf[intValue + i7] ^ (i7 * SdkCoreAlternateContactlessPaymentDataImpl)) ^ charValue);
                i7++;
            }
        }
        return new java.lang.String(cArr);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.isVisaOfflinePaymentsSupported isvisaofflinepaymentssupported = (com.payair.hce.isVisaOfflinePaymentsSupported) objArr[0];
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 3) % 128;
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 55) % 128;
        super.valueOf();
        int i = getProfileVersion + 61;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        int i2 = SdkCoreBusinessLogicModuleImpl + 47;
        getCiacDecline = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void values() {
        int i = getProfileVersion + 77;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 63) % 128;
            super.values();
            throw null;
        }
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 55) % 128;
        super.values();
        int i2 = getProfileVersion + 73;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 71) % 128;
        throw new java.lang.ArithmeticException();
    }

    public isVisaOfflinePaymentsSupported(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        super(ongetcertoperationunsuccessful);
        this.writeReplace = new com.payair.hce.onGeneratePublicKeyUnsuccessful();
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        int i3 = $11 + 119;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 5 / 2;
        }
        while (getcvmmodel.valueOf < i2) {
            int i5 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(getAid[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 48, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 382, (char) (62388 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(RecordsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 35, 3966 - (android.os.Process.myPid() >> 22), (char) (40223 - android.text.TextUtils.indexOf("", "", 0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, 212 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $10 = ($11 + 23) % 128;
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
            $10 = ($11 + 17) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.text.TextUtils.indexOf("", "") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.combineMeasuredStates(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00da, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.getCiacDecline = (r1 + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00e0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d8, code lost:
    
        if ((r9 % 2) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00cc, code lost:
    
        if ((r10 << 5) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00e1, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.SdkCoreBusinessLogicModuleImpl = (r11 + 77) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ec, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(java.lang.String str, byte[] bArr, java.lang.String str2) {
        com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(bArr);
        android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{0, 126, (char) 0}, -1531123642, 1531123642, 0)).intern());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(java.lang.String.valueOf(com.payair.hce.component1.DigitizedCardProfile.AlternateContactlessPaymentDataJson()));
        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))));
        byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
        compileStatement.bindString(1, str);
        compileStatement.bindBlob(2, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
        compileStatement.bindLong(3, com.payair.hce.component1.DigitizedCardProfile.AlternateContactlessPaymentDataJson());
        compileStatement.bindString(4, str2);
        compileStatement.bindBlob(5, DigitizedCardProfile2);
        long executeInsert = compileStatement.executeInsert();
        compileStatement.clearBindings();
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        if (executeInsert == -1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, (char) (25861 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 28 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
        }
        int i = getCiacDecline;
        int i2 = i + 79;
        int i3 = i2 % 128;
        SdkCoreBusinessLogicModuleImpl = i3;
        if (i2 % 2 != 0) {
            int i4 = IccPrivateKeyCrtComponentsJson + 20;
            getProfileVersion = i4 << 29668;
        } else {
            int i5 = IccPrivateKeyCrtComponentsJson + 81;
            getProfileVersion = i5 % 128;
        }
    }

    private void getAid() {
        synchronized (this) {
            com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
            if (((java.lang.Boolean) com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 544213311, -544213311, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful))).booleanValue()) {
                synchronized (this.writeReplace) {
                    android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{126, 33, (char) 0}, -1531123642, 1531123642, 126)).intern(), null);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    if (rawQuery.moveToFirst()) {
                        while (!rawQuery.isAfterLast()) {
                            com.payair.hce.registerPayair registerpayair = new com.payair.hce.registerPayair();
                            com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{159, 7, (char) 31162}, -1531123642, 1531123642, 159)).intern()))}, -83317337, 83317337, java.lang.System.identityHashCode(registerpayair));
                            int i = rawQuery.getInt(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{166, 10, (char) 7306}, -1531123642, 1531123642, 166)).intern()));
                            com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair, java.lang.Integer.valueOf(i)}, -309577604, 309577605, i);
                            com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{176, 20, (char) 19701}, -1531123642, 1531123642, 176)).intern()))}, -1888488445, 1888488451, java.lang.System.identityHashCode(registerpayair));
                            com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair, rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), 8, (char) 21077}, -1531123642, 1531123642, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)).intern()))}, 776859341, -776859336, java.lang.System.identityHashCode(registerpayair));
                            com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair, rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{204, 12, (char) 41930}, -1531123642, 1531123642, 204)).intern()))}, 1593165757, -1593165749, java.lang.System.identityHashCode(registerpayair));
                            arrayList.add(registerpayair);
                            rawQuery.moveToNext();
                        }
                    }
                    rawQuery.close();
                    this.writeReplace.valueOf(arrayList);
                }
            }
        }
    }

    public final void valueOf(java.lang.String str, byte[] bArr, java.lang.String str2) {
        int AlternateContactlessPaymentDataJson;
        int i = IccPrivateKeyCrtComponentsJson + 99;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = getCiacDecline + 33;
            SdkCoreBusinessLogicModuleImpl = i2 % 128;
            if (i2 % 2 == 0) {
                this.DigitizedCardProfile.getWritableDatabase();
                DigitizedCardProfile(bArr);
                DigitizedCardProfile();
                getAid();
                this.writeReplace.writeReplace(str);
                throw null;
            }
        } else {
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 9) % 128;
        }
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(bArr);
        DigitizedCardProfile();
        getAid();
        com.payair.hce.registerPayair writeReplace = this.writeReplace.writeReplace(str);
        if (writeReplace != null) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 85) % 128;
            AlternateContactlessPaymentDataJson = ((java.lang.Integer) com.payair.hce.registerPayair.values(new java.lang.Object[]{writeReplace}, 1854844923, -1854844914, java.lang.System.identityHashCode(writeReplace))).intValue();
        } else {
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 65) % 128;
            AlternateContactlessPaymentDataJson = com.payair.hce.component1.writeReplace.AlternateContactlessPaymentDataJson();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(java.lang.String.valueOf(AlternateContactlessPaymentDataJson));
        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))));
        byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
        android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE), 109, (char) 61540}, -1531123642, 1531123642, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE)).intern());
        compileStatement.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
        compileStatement.bindString(2, str2);
        compileStatement.bindBlob(3, DigitizedCardProfile2);
        compileStatement.bindString(4, str);
        compileStatement.executeUpdateDelete();
        compileStatement.clearBindings();
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 83) % 128;
    }

    public final int values(java.lang.String str) {
        int i = (SdkCoreBusinessLogicModuleImpl + 37) % 128;
        getCiacDecline = i;
        SdkCoreBusinessLogicModuleImpl = (i + 3) % 128;
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 99) % 128;
        DigitizedCardProfile();
        getAid();
        com.payair.hce.registerPayair writeReplace = this.writeReplace.writeReplace(str);
        if (writeReplace == null) {
            return com.payair.hce.component1.writeReplace.AlternateContactlessPaymentDataJson();
        }
        int intValue = ((java.lang.Integer) com.payair.hce.registerPayair.values(new java.lang.Object[]{writeReplace}, 1854844923, -1854844914, java.lang.System.identityHashCode(writeReplace))).intValue();
        int i2 = IccPrivateKeyCrtComponentsJson + 97;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = SdkCoreBusinessLogicModuleImpl;
        getCiacDecline = (i3 + 107) % 128;
        getCiacDecline = (i3 + 99) % 128;
        return intValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r5 = com.payair.hce.isVisaOfflinePaymentsSupported.getCiacDecline + 79;
        com.payair.hce.isVisaOfflinePaymentsSupported.SdkCoreBusinessLogicModuleImpl = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if ((r5 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r5 = writeReplace(new com.payair.hce.Initializer((byte[]) com.payair.hce.registerPayair.values(new java.lang.Object[]{r5}, -916738047, 916738054, java.lang.System.identityHashCode(r5))));
        r0 = com.payair.hce.isVisaOfflinePaymentsSupported.getCiacDecline + 63;
        com.payair.hce.isVisaOfflinePaymentsSupported.SdkCoreBusinessLogicModuleImpl = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if ((r0 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.IccPrivateKeyCrtComponentsJson = (com.payair.hce.isVisaOfflinePaymentsSupported.getProfileVersion * 61) >> 2459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.IccPrivateKeyCrtComponentsJson = (com.payair.hce.isVisaOfflinePaymentsSupported.getProfileVersion + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if ((r1 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((r1 * 3) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x008c, code lost:
    
        DigitizedCardProfile();
        getAid();
        r4.writeReplace.writeReplace(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002e, code lost:
    
        com.payair.hce.isVisaOfflinePaymentsSupported.getCiacDecline = (r0 + 67) % 128;
        DigitizedCardProfile();
        getAid();
        r5 = r4.writeReplace.writeReplace(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r5 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = (getCiacDecline + 35) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        int i2 = i + 43;
        getCiacDecline = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = getProfileVersion / 111;
            IccPrivateKeyCrtComponentsJson = i3 >> 18476;
        } else {
            int i4 = getProfileVersion + 41;
            IccPrivateKeyCrtComponentsJson = i4 % 128;
        }
    }

    public final java.lang.String valueOf(java.lang.String str) {
        int i = getCiacDecline;
        SdkCoreBusinessLogicModuleImpl = (i + 19) % 128;
        int i2 = IccPrivateKeyCrtComponentsJson + 119;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            SdkCoreBusinessLogicModuleImpl = (i + 5) % 128;
            int i3 = i + 113;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            if (i3 % 2 == 0) {
                DigitizedCardProfile();
                getAid();
                this.writeReplace.writeReplace(str);
                throw new java.lang.ArithmeticException();
            }
        } else {
            SdkCoreBusinessLogicModuleImpl = (i + 21) % 128;
        }
        DigitizedCardProfile();
        getAid();
        com.payair.hce.registerPayair writeReplace = this.writeReplace.writeReplace(str);
        if (writeReplace != null) {
            return (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{writeReplace}, -1495057075, 1495057077, java.lang.System.identityHashCode(writeReplace));
        }
        int i4 = (getCiacDecline + 37) % 128;
        SdkCoreBusinessLogicModuleImpl = i4;
        int i5 = IccPrivateKeyCrtComponentsJson + 45;
        getProfileVersion = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        getCiacDecline = (i4 + 65) % 128;
        return null;
    }

    public final void DigitizedCardProfile(java.lang.String str, int i) {
        java.lang.String str2;
        byte[] bArr;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 63) % 128;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{343, 81, (char) 42690}, -1531123642, 1531123642, 343)).intern());
        android.database.Cursor rawQuery = writableDatabase.rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET), 51, (char) 0}, -1531123642, 1531123642, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET)).intern(), new java.lang.String[]{str});
        if (rawQuery.moveToFirst()) {
            int i2 = IccPrivateKeyCrtComponentsJson + 119;
            getProfileVersion = i2 % 128;
            if (i2 % 2 != 0) {
                SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 119) % 128;
            }
            str2 = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{176, 20, (char) 19701}, -1531123642, 1531123642, 176)).intern()));
            bArr = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{204, 12, (char) 41930}, -1531123642, 1531123642, 204)).intern()));
        } else {
            str2 = null;
            bArr = null;
        }
        rawQuery.close();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(java.lang.String.valueOf(i));
        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr));
        byte[] DigitizedCardProfile = DigitizedCardProfile(sb.toString());
        compileStatement.bindLong(1, i);
        compileStatement.bindBlob(2, DigitizedCardProfile);
        compileStatement.bindString(3, str);
        compileStatement.executeUpdateDelete();
        compileStatement.clearBindings();
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 97) % 128;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 57) % 128;
    }

    public final java.util.List<java.lang.String> IccPrivateKeyCrtComponentsJson() {
        SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 31) % 128;
        DigitizedCardProfile();
        getAid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.payair.hce.registerPayair registerpayair : this.writeReplace.AlternateContactlessPaymentDataJson()) {
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 119) % 128;
            arrayList.add((java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1662831895, -1662831892, java.lang.System.identityHashCode(registerpayair)));
            IccPrivateKeyCrtComponentsJson = (getProfileVersion + 41) % 128;
        }
        int i = SdkCoreBusinessLogicModuleImpl + 113;
        getCiacDecline = i % 128;
        if (i % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    public final void writeReplace(java.lang.String str) {
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 89) % 128;
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 107) % 128;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        if (android.database.DatabaseUtils.queryNumEntries(writableDatabase, ((java.lang.String) writeReplace(new java.lang.Object[]{487, 19, (char) 0}, -1531123642, 1531123642, 487)).intern(), ((java.lang.String) writeReplace(new java.lang.Object[]{475, 12, (char) 0}, -1531123642, 1531123642, 475)).intern(), new java.lang.String[]{str}) == 0) {
            return;
        }
        android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X), 51, (char) 0}, -1531123642, 1531123642, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X)).intern());
        compileStatement.bindString(1, str);
        int executeUpdateDelete = compileStatement.executeUpdateDelete();
        compileStatement.clearBindings();
        if (executeUpdateDelete == 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c((-1) - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 25861), 29 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
            throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
        }
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 7) % 128;
        IccPrivateKeyCrtComponentsJson = (getProfileVersion + 47) % 128;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.sqlite.SQLiteDatabase, int] */
    public final void AlternateContactlessPaymentDataJson(java.util.HashMap<java.lang.String, byte[]> hashMap) {
        int i = getCiacDecline + 85;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        int i2 = i % 2;
        int i3 = getProfileVersion + 57;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        ?? r0 = i3 % 2;
        try {
            if (r0 == 0) {
                this.DigitizedCardProfile.getWritableDatabase().beginTransaction();
                hashMap.entrySet().iterator();
                throw new java.lang.NullPointerException();
            }
            android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
            writableDatabase.beginTransaction();
            getProfileVersion = (IccPrivateKeyCrtComponentsJson + 17) % 128;
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 71) % 128;
            for (java.util.Map.Entry<java.lang.String, byte[]> entry : hashMap.entrySet()) {
                IccPrivateKeyCrtComponentsJson = (getProfileVersion + 11) % 128;
                com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(entry.getValue());
                android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS), 83, (char) 0}, -1531123642, 1531123642, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS)).intern());
                java.lang.String key = entry.getKey();
                DigitizedCardProfile();
                getAid();
                com.payair.hce.registerPayair writeReplace = this.writeReplace.writeReplace(key);
                if (writeReplace != null) {
                    int intValue = ((java.lang.Integer) com.payair.hce.registerPayair.values(new java.lang.Object[]{writeReplace}, 1854844923, -1854844914, java.lang.System.identityHashCode(writeReplace))).intValue();
                    java.lang.String str = (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{writeReplace}, -1495057075, 1495057077, java.lang.System.identityHashCode(writeReplace));
                    byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile));
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(key);
                    sb.append(str);
                    sb.append(java.lang.String.valueOf(intValue));
                    sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace());
                    byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
                    compileStatement.bindBlob(1, bArr);
                    compileStatement.bindBlob(2, DigitizedCardProfile2);
                    compileStatement.bindString(3, key);
                    compileStatement.executeUpdateDelete();
                    compileStatement.clearBindings();
                }
                int i4 = SdkCoreBusinessLogicModuleImpl + 39;
                getCiacDecline = i4 % 128;
                if (i4 % 2 == 0) {
                    IccPrivateKeyCrtComponentsJson = (getProfileVersion >>> 108) - 27239;
                } else {
                    IccPrivateKeyCrtComponentsJson = (getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                }
            }
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 23) % 128;
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
            com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        } catch (java.lang.Throwable th) {
            r0.endTransaction();
            com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful2 = this.writeReplace;
            com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful2}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful2));
            throw th;
        }
    }

    public final void getProfileVersion() {
        int i = SdkCoreBusinessLogicModuleImpl + 11;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            int i2 = 2 / 2;
        }
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + 115) % 128;
        this.DigitizedCardProfile.getWritableDatabase().delete(((java.lang.String) writeReplace(new java.lang.Object[]{487, 19, (char) 0}, -1531123642, 1531123642, 487)).intern(), null, null);
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
        int i3 = getProfileVersion + 103;
        IccPrivateKeyCrtComponentsJson = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = getCiacDecline + 81;
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    public final void valueOf(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        int i = (SdkCoreBusinessLogicModuleImpl + 67) % 128;
        getCiacDecline = i;
        int i2 = getProfileVersion + 15;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = i + 121;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            int i4 = i3 % 2;
        }
        getAid();
        getProfileVersion = (IccPrivateKeyCrtComponentsJson + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        for (com.payair.hce.registerPayair registerpayair : this.writeReplace.AlternateContactlessPaymentDataJson()) {
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 29) % 128;
            java.lang.String str = (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1662831895, -1662831892, java.lang.System.identityHashCode(registerpayair));
            int intValue = ((java.lang.Integer) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1854844923, -1854844914, java.lang.System.identityHashCode(registerpayair))).intValue();
            java.lang.String str2 = (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, -1495057075, 1495057077, java.lang.System.identityHashCode(registerpayair));
            byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, -916738047, 916738054, java.lang.System.identityHashCode(registerpayair)));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(java.lang.String.valueOf(intValue));
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace());
            byte[] AlternateContactlessPaymentDataJson2 = this.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), sb.toString().getBytes());
            com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2).writeReplace();
            android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS), 83, (char) 0}, -1531123642, 1531123642, com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.CHANGE_PIN_CANNOT_BE_SAME_AS_PREVIOUS_PINS)).intern());
            compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson);
            compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson2);
            compileStatement.bindString(3, str);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            getCiacDecline = (SdkCoreBusinessLogicModuleImpl + 31) % 128;
        }
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 1257172694, -1257172693, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful));
    }

    @Override // com.payair.hce.isLvtAllowed
    public final void AlternateContactlessPaymentDataJson() {
        int i;
        int i2 = (getCiacDecline + 61) % 128;
        SdkCoreBusinessLogicModuleImpl = i2;
        getCiacDecline = (i2 + 93) % 128;
        com.payair.hce.onGeneratePublicKeyUnsuccessful ongeneratepublickeyunsuccessful = this.writeReplace;
        if (((java.lang.Boolean) com.payair.hce.onGeneratePublicKeyUnsuccessful.values(new java.lang.Object[]{ongeneratepublickeyunsuccessful}, 544213311, -544213311, java.lang.System.identityHashCode(ongeneratepublickeyunsuccessful))).booleanValue()) {
            int i3 = IccPrivateKeyCrtComponentsJson + 41;
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                getAid();
                throw null;
            }
            getAid();
        }
        java.util.List<com.payair.hce.registerPayair> AlternateContactlessPaymentDataJson = this.writeReplace.AlternateContactlessPaymentDataJson();
        com.payair.hce.registerPayair[] registerpayairArr = (com.payair.hce.registerPayair[]) AlternateContactlessPaymentDataJson.toArray(new com.payair.hce.registerPayair[AlternateContactlessPaymentDataJson.size()]);
        int length = registerpayairArr.length;
        boolean z = false;
        int i4 = 0;
        while (i4 < length) {
            com.payair.hce.registerPayair registerpayair = registerpayairArr[i4];
            java.lang.String str = (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1662831895, -1662831892, java.lang.System.identityHashCode(registerpayair));
            int intValue = ((java.lang.Integer) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1854844923, -1854844914, java.lang.System.identityHashCode(registerpayair))).intValue();
            java.lang.String str2 = (java.lang.String) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, -1495057075, 1495057077, java.lang.System.identityHashCode(registerpayair));
            byte[] bArr = (byte[]) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, -916738047, 916738054, java.lang.System.identityHashCode(registerpayair));
            byte[] bArr2 = (byte[]) com.payair.hce.registerPayair.values(new java.lang.Object[]{registerpayair}, 1305982290, -1305982286, java.lang.System.identityHashCode(registerpayair));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(java.lang.String.valueOf(intValue));
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace());
            z = valueOf(((java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE), 18, (char) 33551}, -1531123642, 1531123642, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE)).intern(), bArr2, sb.toString().getBytes());
            if (z) {
                break;
            }
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 17) % 128;
            int i5 = getProfileVersion + 75;
            IccPrivateKeyCrtComponentsJson = i5 % 128;
            i4 = i5 % 2 == 0 ? i4 + 90 : i4 + 1;
        }
        if (z) {
            i = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
        } else {
            i = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
            SdkCoreBusinessLogicModuleImpl = (getCiacDecline + 41) % 128;
        }
        if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
            int i6 = SdkCoreBusinessLogicModuleImpl + 41;
            getCiacDecline = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 5;
            }
            com.payair.hce.checkPermission checkpermission = this.AlternateContactlessPaymentDataJson;
            android.os.SystemClock.currentThreadTimeMillis();
            android.view.View.combineMeasuredStates(0, 0);
            android.view.ViewConfiguration.getScrollFriction();
        }
    }

    static void SdkCoreAlternateContactlessPaymentDataImpl() {
        char[] cArr = new char[1352];
        java.nio.ByteBuffer.wrap(";ÿ§\u009f\u0003}îÙJª6\b\u0091¨}£Ù\u001dD¹ Q\u008c3o\u008aËT·$\u0012\u009aþ:YÕÅ¤¡\u000e\f\u0096è¹T\u00197ó\u0093C\u007f+ÚõF@\";\u0094I\b0¬ÎA\u007få6\u0099¿>GÒ\u0011v»ëU\u008fá#ÃÀ\ndô\u0018\u0084½>Q\u009aöUj\r\u000e©£zG\u0018ûø\u0098[<¢Ð½uuéÞ\u008d®\"\u0000Æò{J\u001f.q\"í0I×¤å\u0000É|\u0086ÛÊ7Ò\u0093ô\u000e#jýÆg%ó\u0081\rý\u0001X\u0016´\u008e\u0013§\u008f$ëïF\u009d¢ê\u001e\u0017}§Ù\u00815\u0082\u0090r\fbhdÇO#}\u009e«ú{VFµI\u0011;\u008d.èÇD¤ Ø\u001f]{7×G2z®I\n¡ijÅZ d\u009czø}W\u0084³\u0083/é\u008a1æÎB®¡²\u001d\u0014y\u0097Ô\u009d0.¯\u0007\u000b\u000fg\u0091Â\u0011>â\u009aKùôUö±ý,¶\u0088;äÃC¨¿\u0017\u001a.v²ÒÔ1v\u00adÝ\tMd×ÀÛ<è\u009bÉ÷êSgÎô*Ñ\u0086=å±A³¼\u0012\u0018 tiÓ®O°«\u0004\u0006gb\u009dÞ\u0010=\u0017\u0099¨õ`PõÌr+2\u0087\u0004ãù^½º\u009e\u0016;uiÑ¨M7¨N\u0004å`Dß\u0004;]\u0096àògnÑÍh)ù\u0085Jà0\\D¸\u008a\u0017=s_ï£J4¦0\u0002ca\u008eÝ\u00948\u001b\u0094\u0093ð\u009do\u0081Ëç'ÿ\u0082\u0010þ\u0019Z\u0082¹I\u00157qJì½Ha§;\u0003\b\u007fÈÚï6Î\u0092ØñÓm\u0010ÉÝ$ý\u0080×üª[È·A\u0012Ê\u008eVê·I\u008e¥=\u0001å|³Ø(4\u0000\u0093Í\u000f\u008ekúÆ\u001b\"2\u009e\u001dýjY\u0097´I\u0010\u0000\u008caë²GO£'\u001eýz½ÖÌ5;\u0091Ñ\rHh\u008eÄn#v\u009fcû<V]²B.F\u008d\u0086éHE\u0000 *\u001c¿x§×\u00803=®[\n\u0082fEÅp!\u0091\u009dnø`T\u009b°\u000f/\u001d\u008b¨ç\u0086BÊ¾\u0010\u001a\ny¢Õ«07¬Ý\b½gHÃú?=\u009aèöìRî±!-Ó\u0089@äÝ@å¿Ö\u001b¤w¨ÒiN*ªØ\t·e(Áý<\u0018\u0098¶ô\u009eS+ÏZ*¥\u0086\u0005â^A¾½@\u0019ÆtQÐóLo«¡\u0007ucÉÞz:]\u0096¸õiQ1Ì\u008b(£\u0084$ã\u0015_8»\u009e\u0016\u0097r\u0018îòMé©2\u0005ï`\u009fÜõ;[\u0097\u0082óvn0Êk&©\u0085\u0097á+]è¸Õ\u0014ÇpÞïªKÐ§ñ\u0002á~*Ýï9J\u0095ÅðTl:È9'¸\u0083þÿ!ZÂ¶\u0093\u0012Çq\u0005íþHQ¤\u009e\u0000Ø\u007fzÛª7\u000b\u0092½\u000e³j·É\u009a%\u0092\u0081úü\u0080XÅ·:\u0013\u0094\u008fÇêDFÉ¢!\u0001Ò}\u0085Ùì4 \u0090ý\fÎkãÇï#\u0019\u009e¸ú\u0096Y\u0013µ4\u0011P\u008cNèÜDû£\f\u001fe{oÖæ2ä®\u0098\r\u008di\u0091ÄJ \u009f\u009c\u009dû\u00adWÕ³¢.X\u008a\u0088æ\u000fEñ¡Ä\u001d{xsÔí3«¯^\u000b fÈÂ\u008d>Q\u009dhù×Uÿ°%,7\u0088BçOCÈ¿\f\u001a(v§Õ=1î\u00ad3\b=dÀÀ\t?N\u009b÷÷ÇR½Îy*e\u0089ûå\u009f@\u0089¼û\u0018|w\u001bÓrOxªa\u0006ÃboÁÚ=F\u0099\u008dôXPºÏZ+Â\u0087%â_^\u008fº\u0018\u0019\u0006u\u0013Ñ¼L4¨1\u0004\u0085c¤ßu;Ú\u00968òÙQ\u008cÍÇ)®\u0084îàÜ\\à»à\u0017òs\u008fîýJ\u0010¦7\u0005Ma®Ü¶8$\u0094}ó\u0092o^Ë\u0001&È\u0082\u0097þÃ]n¹2\u0015hp\u008aìzKQ§\u008e\u0003¤~\u0083Úã6\u009d\u0095\u0011ñfm\u0016Èè$ý\u0080iÿ¾[ç·\r\u0012]\u008e¼íÂI\u0080¥p\u0000q|\tØ\u00017\u001b\u0093\u0018\u000f\u001dj)Æ&\"y\u00810ýÒX!´©\u0010W\u008f¸ëÝGÿ¢:\u001e\u0010z\bÙD5\u0001\u0091\u0016\f\u0013h÷Ç\u001d#d\u009fvú\u008cVè²µ\u0011i\u008d\u0090é×D% }\u001cô{ò×<3\u0080®\u007f\n\u0089i½Å\u009b!\u009f\u009c½øCT¶³\u009c/ \u008bóæÑB~¾§\u001d\u0005y¼ÔÞ0º¬2\u000b\u0088g{Ã\u0091>À\u009a\u0083ö·Uü±D-f\u0088§äè@¤¿i\u001bkvçÒBN|\u00ad¯\t\u0002e=À\u0010<ó\u0098\t÷ÅS;Ï\u0085*<\u0086få&A=½P\u0018$t!ÐSO7«ä\u0007<büÞ\u001a:¡\u0099\bõ\u0086P\u0001ÌÍ(s\u0087\nãü_\u0002ºV\u0016ÙrèÑ\u0014Mi©A\u0004÷`¦Ü\u009c;¾\u0097\u0092òFn\u008fÊ\u0015)\u0089\u0085\u008dá»\\b¸\\\u0014AsÖï¼K£¦Å\u0002±aëÝ§9ù\u0094\u009cðèl\u009aËU'\u008f\u0083*þñZ2¶C\u0015xqÜì\u0086Hf¤Â\u0003ë\u007f¤Ûi6;\u0092ç\u000e°m\u001cÉ_%\u0002\u0080~ü\u000fXC·I\u0013Ò\u008eÛêoF\\¥¼\u0001&}ùØ34X\u0090!\u000fOk\u0017Ç\u0091\"\u001c\u009e\u0010ý:YtµO\u0010å\u008cÁè\u008dGR£d\u001fÜz\u0084Öv2û\u0091ë\r\u0001hiÄ~ \u0096\u009f\u0085ûüW8²r.9\u008a^é\u0080EW¡Ã\u001cEx5Ô²3>¯8\nÙf½Â\u009e!\u000f\u009d)ù\u0089T\u0084°\u0012,¤\u008b¤çQCÑ¾%\u001aÏy0ÕÍ1\r¬ò\bYdøÃö?õ\u009b±ö\u0087R\u009cÎ\t-ß\u0089âä4@Ü¼l\u001bÑw2ÓÇN×ª5\u0006@e¢Á´=8\u0098\u0091ô½P°Ï\u000f+\u0001\u0086©âÜ^\"½\u0018\u0019Tu_ÐAL\u0099¨O\u0007Ôcmßt:b\u0096¡õxQÕÍ\u0005(`\u0084wà>_h»ï\u0017Rr(î\\JS©A\u0005à`WÜÃ8$\u0097<ó²o\u008fÊ8&\u0082\u0082½áK]/¹y\u0014¨p»ìÒK\u0015§Ä\u0002\u0090~ÑÚù9ï\u0095ºñìlNÈò$\u0010\u0083øÿ\u001a[õ¶r\u0012çqÈíèI£¤Â\u0000Ü|ÜÛï7Ñ\u0093¢\u000e§jkÆ4%Y\u0081\u0082ý X8´\u001d\u0013½\u008fVë/F£¢H\u001eº}BÙ-5[\u00908\fahèÇo#\u0015\u009e\u008cú!V\u0002µü\u0011{\u008d¨èeD\u008b w\u001fÝ{H×\u00962R®9\r[ihÅ! U\u009cRøºWG³~/y\u008aiæzBB¡d\u001d¢y\u008dÔ×0\u0003¯\u009d\u000b\u0091gåÂ\u001e>¹\u009a\u0094ù\rU\r±g,\u0087\u0088xäñC\u001c¿â\u001a³vôÒ®1Í\u00adÞ\tËdûÀÙ<¿\u009bÞ÷ZSÔÎW*Í\u0089³å÷A\u008c¼ù\u0018;túÓÆOô«Õ\u0006\u008db\u000eÞ\u0013=f\u0099¡õ\u0088P\u001eÌ]+\u0084\u0087\u001aã\r^\u009eºw\u0016ëuaÑÚMr¨Û\u0004D`²ßM;\u000f\u0096«òdnXÍ\u0091)^\u00858àD\\¯¸M\u0017ºsgïêJx¦\u0007\u0005za\u0093Ý\u00048N\u0094\u00adð:o#Ëi'\u0090\u0082ßþ\u001eZt¹\u0094\u0015»qíìúH\u0090§L\u0003\t\u007f\u0018Ú»6\u0019\u0092<ñ¡m¦Éø$3\u0080(üA[\u0087·W\u0012-\u008e\\êbIZ¥)\u0001O|ÄØA4U\u0093\u0018\u000fÔk\u0091Æ\u0090\"\u0003\u0081aý´Y9´>\u0010p\u008c»ë\u0089GÉ£\u0019\u001eÏzêÖÔ5Á\u0091â\rèh×Ä\u000f#É\u009f¨ûËVl²4.\u0016\u008d¾é\u0097E3 \u009c\u001c\u0081x$×\u000f3å®ä\n\u0080f\u009eÅq!\u0013\u009d2ø\u008dTÝ°6/\u0096\u008b¸çùB9¾:\u001d·yÉÕM0]¬R\bwg`ÃH?Y\u009a¬öKRc±M-þ\u0089¶ä®@ ¿\u000b\u001b±woÒ\u0007N\u008aª\u008d\tgejÁ\u0003<\u0018\u0098\u009cô\u0091SëÏ\u0003*6\u0086\u008dâåA&½\u009e\u0019¸t6Ð9Lx«Ç\u0007\u00adcíÞ\n:â\u0096\u000eõÐQÛÌÙ(ê\u0084ËãK_-»¢\u0016¦r\u007fî0M\u0014©\u0081\u0005A`÷Ü¨;ì\u0097\u009fóênÊÊ\u0018&º\u0085\u0081á\u0017]\u0013¸#\u0014¬p~ï6Kj¦¸\u00029~yÝ¯9w\u0095\u0084ðllkÈR'ª\u0083@ÿ÷ZY¶\n\u0012Üq.íÕHå¤Ï\u0000\u0093\u007fÈÛÐ7ú\u0092'\u000eÿjxÉõ%\u000f\u0081\u0003ü:X\u0090·\u008a\u0013&\u008f·ê\u009bFÃ¢\u0015\u0001Þ}\u008fÙ\u00934p\u0090\u007f\fbkPÇ\u007f\"¯\u009eEúrYKµ9\u0011(\u008cÒè¦DÂ£S\u001f\f{EÖq2O®¦\rhiJÄz \u007f\u009c\u007fû\u0096W\u0085³§.3\u008aòæ E\u0086¡\u0016\u001d¹x\u009bÔ\u007f3\u0005¯Y\u000bïfIÂà>\u001a\u009dòùñUÿ°¸,5\u0088ßçªC\u0018¾(\u001a°vÖÕ}1Ã\u00adJ\bÕdqÀî?\u0086\u009bè÷aRúÎ\u009e*?\u0089íåµ@@¼\"\u0018%w\u0090ÓûO\u0006ªv\u0006\u009bb\u001fÁ\u0015=\u0094\u0099nôðPpÏ6+\u0002\u0087üâ¿^\u008cº%\u0019&uªÑ\u0005LH¨ú\u0004FcAßS:¼\u0096eò\u008dQnÍ¿)H\u0084>àº\\³»?\u0017ps¥î\u0005J2¦T\u0005\u0080aÓÜ\u00198\u009d\u0094\u009bóÌoåË¸&\u000e\u0082\u0019þ\u0080]!¹1\u0015xp¿ìhK5§\u0007\u0003Ê~\u00adÚÈ6\u0082\u0095ÑñimãÈ¤$Õ\u0080õÿÎ[\fAáÝ yQ\u0094\u00940üLWë¿\u0007ì£]>ª".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1352);
        getAid = cArr;
        RecordsJson = 6854342040663278324L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getCiacDecline = 1;
        SdkCoreAlternateContactlessPaymentDataImpl();
        getProfileVersion = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        char[] cArr = new char[640];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(62 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12174), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1280, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(android.view.View.combineMeasuredStates(0, 0) + 1342, (char) (7943 - (android.os.Process.myTid() >> 22)), 10 - android.graphics.Color.blue(0), objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 640);
        valueOf = cArr;
        SdkCoreAlternateContactlessPaymentDataImpl = 8689836270362641304L;
        int i = SdkCoreBusinessLogicModuleImpl + 121;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static java.lang.String writeReplace(int i, int i2, char c) {
        return (java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Character.valueOf(c)}, -1531123642, 1531123642, i);
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void valueOf() {
        writeReplace(new java.lang.Object[]{this}, 1778952402, -1778952401, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$d = new byte[]{64, -23, -58, -30};
        $$e = 109;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ boolean writeReplace() {
        return ((java.lang.Boolean) writeReplace(new java.lang.Object[]{this}, 69983918, -69983916, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
