package com.payair.hce;

/* loaded from: classes4.dex */
public final class checkSdkState extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 4 - (b * 2);
        byte[] bArr = $$d;
        int i6 = 1 - (i * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i4 = 0;
            i5++;
            i2 = i7 + (-i8);
            i3 = i4;
            int i9 = i2;
            int i10 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i9;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i7 = i9;
            i5 = i10;
            i5++;
            i2 = i7 + (-i8);
            i3 = i4;
            int i92 = i2;
            int i102 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i92;
            if (i4 == i6) {
            }
        } else {
            i2 = 99 - (s * 2);
            i3 = 0;
            int i922 = i2;
            int i1022 = i5;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i922;
            if (i4 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = (i * (-344)) + (i2 * (-344)) + (((~i6) | (~(i4 | i3))) * 345) + (((~(i | i5)) | (~((~i3) | i4))) * 345) + ((~(i6 | i3)) * 345);
        int i8 = 0;
        if (i7 == 1) {
            com.payair.hce.checkSdkState checksdkstate = (com.payair.hce.checkSdkState) objArr[0];
            int i9 = getAid + 7;
            int i10 = i9 % 128;
            getCvrMaskAnd = i10;
            if (i9 % 2 == 0) {
                int i11 = 4 / 2;
            }
            getAid = (i10 + 7) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 103) % 128;
            super.valueOf();
            getCvrMaskAnd = (getAid + 73) % 128;
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 95) % 128;
            return null;
        }
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        char charValue = ((java.lang.Character) objArr[1]).charValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        getAid = (getCvrMaskAnd + 7) % 128;
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 37) % 128;
        char[] cArr = new char[intValue];
        while (i8 < intValue) {
            cArr[i8] = (char) ((valueOf[intValue2 + i8] ^ (i8 * writeReplace)) ^ charValue);
            i8++;
            getCvrMaskAnd = (getAid + 67) % 128;
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 19) % 128;
        }
        getAid = (getCvrMaskAnd + 19) % 128;
        return new java.lang.String(cArr);
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void values() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 41;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            getAid = (getCvrMaskAnd + 97) % 128;
            super.values();
            throw null;
        }
        int i2 = getAid + 3;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 4;
        }
        super.values();
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ boolean writeReplace() {
        int i = (getCvrMaskAnd + 69) % 128;
        getAid = i;
        getCvrMaskAnd = (i + 27) % 128;
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 109) % 128;
        boolean writeReplace2 = super.writeReplace();
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 101;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return writeReplace2;
        }
        getCvrMaskAnd = (getAid + 119) % 128;
        throw null;
    }

    public checkSdkState(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        super(ongetcertoperationunsuccessful);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String getAid() {
        android.database.Cursor rawQuery;
        int i;
        int i2;
        int i3 = (getAid + 41) % 128;
        getCvrMaskAnd = i3;
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl + 61;
        getProfileVersion = i4 % 128;
        if (i4 % 2 != 0) {
            DigitizedCardProfile();
            rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{109, (char) 0, 0}, 518843466, -518843466, 109)).intern(), null);
            if (!rawQuery.moveToFirst()) {
                getCvrMaskAnd = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                i2 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
                getProfileVersion = i2 % 128;
                if (i2 % 2 != 0) {
                    rawQuery.close();
                    return null;
                }
                rawQuery.close();
                throw null;
            }
            java.lang.String string = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 40}, 518843466, -518843466, 16)).intern()));
            rawQuery.close();
            i = getProfileVersion + 107;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
                return string;
            }
            throw null;
        }
        getAid = (i3 + 21) % 128;
        DigitizedCardProfile();
        rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{40, (char) 0, 0}, 518843466, -518843466, 40)).intern(), null);
        if (rawQuery.moveToFirst()) {
            getAid = (getCvrMaskAnd + 101) % 128;
            java.lang.String string2 = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 40}, 518843466, -518843466, 16)).intern()));
            rawQuery.close();
            i = getProfileVersion + 107;
            SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
            if (i % 2 == 0) {
            }
        }
        i2 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
        }
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 87) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(RecordsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 48, 380 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 62388));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) 0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.graphics.Color.argb(0, 0, 0, 0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3965, (char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.getDefaultSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.view.View.resolveSizeAndState(0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            int i4 = $11 + 99;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.MeasureSpec.getMode(0), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 212 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) android.view.View.getDefaultSize(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private java.util.List<com.payair.hce.setupValuesAfterAuthenticate> getProfileVersion() {
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{25, (char) 38418, 73}, 518843466, -518843466, 25)).intern(), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rawQuery.moveToFirst()) {
            int i = getCvrMaskAnd + 57;
            getAid = i % 128;
            if (i % 2 == 0) {
                while (!rawQuery.isAfterLast()) {
                    com.payair.hce.setupValuesAfterAuthenticate setupvaluesafterauthenticate = new com.payair.hce.setupValuesAfterAuthenticate();
                    java.lang.String string = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 40}, 518843466, -518843466, 16)).intern()));
                    java.lang.String string2 = rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{15, (char) 4940, 98}, 518843466, -518843466, 15)).intern()));
                    byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 113}, 518843466, -518843466, 16)).intern()));
                    byte[] blob2 = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{8, (char) 0, 129}, 518843466, -518843466, 8)).intern()));
                    setupvaluesafterauthenticate.DigitizedCardProfile(string);
                    setupvaluesafterauthenticate.DigitizedCardProfile(blob);
                    setupvaluesafterauthenticate.AlternateContactlessPaymentDataJson(string2);
                    setupvaluesafterauthenticate.writeReplace(blob2);
                    arrayList.add(setupvaluesafterauthenticate);
                    rawQuery.moveToNext();
                    int i2 = getProfileVersion + 83;
                    SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = (getCvrMaskAnd + 111) % 128;
                        getAid = i3;
                        getCvrMaskAnd = (i3 + 1) % 128;
                    }
                }
            }
        }
        rawQuery.close();
        return arrayList;
    }

    public final java.util.List<java.lang.String> valueOf(java.lang.String str) {
        DigitizedCardProfile();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{66, (char) 0, 137}, 518843466, -518843466, 66)).intern(), new java.lang.String[]{str});
        if (!rawQuery.moveToFirst()) {
            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 5) % 128;
            rawQuery.close();
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 117;
            getProfileVersion = i % 128;
            if (i % 2 == 0) {
                return arrayList;
            }
            int i2 = getCvrMaskAnd + 31;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                return arrayList;
            }
            throw new java.lang.ArithmeticException();
        }
        while (true) {
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{15, (char) 4940, 98}, 518843466, -518843466, 15)).intern())));
            if (!rawQuery.moveToNext()) {
                rawQuery.close();
                return arrayList;
            }
            getCvrMaskAnd = (getAid + 125) % 128;
        }
    }

    public final void DigitizedCardProfile(java.lang.String str, java.lang.String str2, com.payair.hce.isSessionAvailable issessionavailable) {
        java.lang.String obj;
        int i = getProfileVersion + 107;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            getCvrMaskAnd = (getAid + 77) % 128;
        }
        com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{issessionavailable}, -1877837077, 1877837077, java.lang.System.identityHashCode(issessionavailable)));
        if (valueOf(str, str2) != null) {
            int i2 = SdkCoreAlternateContactlessPaymentDataImpl;
            int i3 = i2 + 113;
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                getAid = (getCvrMaskAnd + 29) % 128;
            }
            getProfileVersion = (i2 + 83) % 128;
            this.DigitizedCardProfile.getWritableDatabase().delete(((java.lang.String) writeReplace(new java.lang.Object[]{11, (char) 58668, 645}, 518843466, -518843466, 11)).intern(), null, null);
        }
        android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{111, (char) 15988, 203}, 518843466, -518843466, 111)).intern());
        if (DigitizedCardProfile != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str2);
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))));
            obj = sb.toString();
            compileStatement.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 79) % 128;
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(new byte[0]).writeReplace());
            obj = sb2.toString();
            compileStatement.bindNull(1);
        }
        byte[] DigitizedCardProfile2 = DigitizedCardProfile(obj);
        com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(DigitizedCardProfile2).writeReplace();
        compileStatement.bindBlob(2, DigitizedCardProfile2);
        compileStatement.bindString(3, str);
        compileStatement.bindString(4, str2);
        long executeInsert = compileStatement.executeInsert();
        compileStatement.clearBindings();
        if (executeInsert != -1) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, (char) (36695 - android.view.KeyEvent.normalizeMetaState(0)), android.graphics.Color.blue(0) + 30, objArr);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    public final com.payair.hce.isSessionAvailable valueOf(java.lang.String str, java.lang.String str2) {
        int i = getAid + 85;
        getCvrMaskAnd = i % 128;
        getProfileVersion = i % 2 == 0 ? (SdkCoreAlternateContactlessPaymentDataImpl - 96) / 25186 : (SdkCoreAlternateContactlessPaymentDataImpl + 59) % 128;
        DigitizedCardProfile();
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{91, (char) 0, 314}, 518843466, -518843466, 91)).intern(), new java.lang.String[]{str, str2});
        if (rawQuery.moveToFirst()) {
            com.payair.hce.isSessionAvailable issessionavailable = new com.payair.hce.isSessionAvailable(writeReplace(new com.payair.hce.Initializer(rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 113}, 518843466, -518843466, 16)).intern())))));
            rawQuery.close();
            return issessionavailable;
        }
        int i2 = getProfileVersion + 69;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 != 0) {
            getCvrMaskAnd = (getAid + 101) % 128;
            rawQuery.close();
            return null;
        }
        rawQuery.close();
        throw null;
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        android.database.sqlite.SQLiteStatement compileStatement;
        int i;
        int i2 = getProfileVersion + 11;
        SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = (getCvrMaskAnd + 55) % 128;
            getAid = i3;
            getCvrMaskAnd = (i3 + 81) % 128;
            compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{120, (char) 12686, 23561}, 518843466, -518843466, 120)).intern());
            i = 0;
        } else {
            getCvrMaskAnd = (getAid + 83) % 128;
            compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{52, (char) 12686, java.lang.Integer.valueOf(com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED)}, 518843466, -518843466, 52)).intern());
            i = 1;
        }
        compileStatement.bindString(i, str);
        compileStatement.executeUpdateDelete();
        compileStatement.clearBindings();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0015 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(java.lang.String str, java.util.HashMap<java.lang.String, com.payair.hce.isSessionAvailable> hashMap) throws java.security.GeneralSecurityException {
        com.payair.hce.setupValuesAfterAuthenticate setupvaluesafterauthenticate;
        android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            for (java.util.Map.Entry<java.lang.String, com.payair.hce.isSessionAvailable> entry : hashMap.entrySet()) {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 103) % 128;
                com.payair.hce.isSessionAvailable value = entry.getValue();
                com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{value}, -1877837077, 1877837077, java.lang.System.identityHashCode(value)));
                java.lang.String key = entry.getKey();
                DigitizedCardProfile();
                android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{77, (char) 16070, java.lang.Integer.valueOf(com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION)}, 518843466, -518843466, 77)).intern(), new java.lang.String[]{str, key});
                if (rawQuery.moveToFirst()) {
                    int i = getCvrMaskAnd + 95;
                    getAid = i % 128;
                    if (i % 2 == 0) {
                        setupvaluesafterauthenticate = new com.payair.hce.setupValuesAfterAuthenticate();
                        if (rawQuery.moveToFirst()) {
                            getCvrMaskAnd = (getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                            SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 121) % 128;
                            byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{16, (char) 0, 113}, 518843466, -518843466, 16)).intern()));
                            byte[] blob2 = rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{8, (char) 0, 129}, 518843466, -518843466, 8)).intern()));
                            setupvaluesafterauthenticate.DigitizedCardProfile(str);
                            setupvaluesafterauthenticate.DigitizedCardProfile(blob);
                            setupvaluesafterauthenticate.AlternateContactlessPaymentDataJson(key);
                            setupvaluesafterauthenticate.writeReplace(blob2);
                            rawQuery.moveToNext();
                        }
                        rawQuery.close();
                        android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{111, (char) 0, 457}, 518843466, -518843466, 111)).intern());
                        compileStatement.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
                        if (setupvaluesafterauthenticate == null) {
                            java.lang.String DigitizedCardProfile2 = setupvaluesafterauthenticate.DigitizedCardProfile();
                            byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(DigitizedCardProfile2);
                            sb.append(key);
                            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace());
                            compileStatement.bindBlob(2, DigitizedCardProfile(sb.toString()));
                            compileStatement.bindString(3, str);
                            compileStatement.bindString(4, key);
                            long executeUpdateDelete = compileStatement.executeUpdateDelete();
                            compileStatement.clearBindings();
                            if (executeUpdateDelete == -1) {
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                c(android.view.KeyEvent.normalizeMetaState(0), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 36695), 30 - android.view.View.resolveSize(0, 0), objArr);
                                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                            }
                        }
                    }
                }
                rawQuery.close();
                setupvaluesafterauthenticate = null;
                android.database.sqlite.SQLiteStatement compileStatement2 = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{111, (char) 0, 457}, 518843466, -518843466, 111)).intern());
                compileStatement2.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
                if (setupvaluesafterauthenticate == null) {
                }
            }
            getCvrMaskAnd = (getAid + 57) % 128;
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    public final void SdkCoreAlternateContactlessPaymentDataImpl() {
        int i = getCvrMaskAnd;
        getAid = (i + 15) % 128;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 35;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            getAid = (i + 13) % 128;
        }
        this.DigitizedCardProfile.getWritableDatabase().delete(((java.lang.String) writeReplace(new java.lang.Object[]{11, (char) 58668, 645}, 518843466, -518843466, 11)).intern(), null, null);
        getCvrMaskAnd = (getAid + 91) % 128;
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 73;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void valueOf(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        int i = getProfileVersion + 13;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            int i2 = getCvrMaskAnd + 111;
            getAid = i2 % 128;
            int i3 = i2 % 2;
        } else {
            getCvrMaskAnd = (getAid + 25) % 128;
        }
        java.util.List<com.payair.hce.setupValuesAfterAuthenticate> profileVersion = getProfileVersion();
        int i4 = 0;
        while (i4 < profileVersion.size()) {
            java.lang.String values = profileVersion.get(i4).values();
            java.lang.String DigitizedCardProfile = profileVersion.get(i4).DigitizedCardProfile();
            byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), profileVersion.get(i4).AlternateContactlessPaymentDataJson());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(DigitizedCardProfile);
            sb.append(values);
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace());
            byte[] AlternateContactlessPaymentDataJson2 = this.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), sb.toString().getBytes());
            android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{111, (char) 0, 457}, 518843466, -518843466, 111)).intern());
            compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson);
            compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson2);
            compileStatement.bindString(3, DigitizedCardProfile);
            compileStatement.bindString(4, values);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            i4++;
            int i5 = getAid;
            getCvrMaskAnd = (i5 + 83) % 128;
            int i6 = getProfileVersion + 49;
            SdkCoreAlternateContactlessPaymentDataImpl = i6 % 128;
            if (i6 % 2 != 0) {
                getCvrMaskAnd = (i5 + 67) % 128;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AlternateContactlessPaymentDataJson() {
        int i;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 5;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = getAid + 1;
            getCvrMaskAnd = i3 % 128;
            if (i3 % 2 != 0) {
                getProfileVersion().size();
                throw null;
            }
        } else {
            getAid = (getCvrMaskAnd + 73) % 128;
        }
        java.util.List<com.payair.hce.setupValuesAfterAuthenticate> profileVersion = getProfileVersion();
        int size = profileVersion.size();
        if (size > 0) {
            boolean z = false;
            int i4 = 0;
            while (i4 < size) {
                java.lang.String values = profileVersion.get(i4).values();
                java.lang.String DigitizedCardProfile = profileVersion.get(i4).DigitizedCardProfile();
                java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(profileVersion.get(i4).AlternateContactlessPaymentDataJson()).writeReplace();
                byte[] writeReplace3 = profileVersion.get(i4).writeReplace();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(DigitizedCardProfile);
                sb.append(values);
                sb.append(writeReplace2);
                z = valueOf(((java.lang.String) writeReplace(new java.lang.Object[]{17, (char) 0, 56}, 518843466, -518843466, 17)).intern(), writeReplace3, sb.toString().getBytes());
                if (z) {
                    break;
                }
                int i5 = (getCvrMaskAnd + 33) % 128;
                getAid = i5;
                int i6 = i5 + 49;
                getCvrMaskAnd = i6 % 128;
                i4 = i6 % 2 == 0 ? i4 + 98 : i4 + 1;
            }
            if (z) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 21) % 128;
                i = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
                if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
                    getCvrMaskAnd = (getAid + 57) % 128;
                    return;
                }
                getCvrMaskAnd = (getAid + 19) % 128;
                com.payair.hce.checkPermission checkpermission = this.AlternateContactlessPaymentDataJson;
                android.view.KeyEvent.normalizeMetaState(0);
                android.view.ViewConfiguration.getDoubleTapTimeout();
                android.text.TextUtils.indexOf("", "", 0, 0);
                return;
            }
            getAid = (getCvrMaskAnd + 121) % 128;
        }
        i = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
        if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
        }
    }

    static void RecordsJson() {
        char[] cArr = new char[1379];
        java.nio.ByteBuffer.wrap("Ñ\u00ad§i<gµg\nh\u0083f\u0018\"\u0091ufoÿ/t}ÍyBcÛyPo))¾|7\u007f\u008cs\u00055\u009ay\u0013|èpaxö|OzÄ>]vÒy«b¦_Ð\u0082K\u008eÂ\u0086}\u0082ô\u008co£æ\u008e\u0011\u0093\u0088\u0096\u0003Äº³5\u0087¬\u0083'\u008c^\u0086ÉÂ@\u0081ûÜr«í¿d´\u009f¨\u0016¾\u0081¨8°³°ãP\u0095ü\u000eø\u0087½8\u0000±M*¨£\u0013TñÍ°F\tÿXp¡é}bþ\u001b\u009f\u008c\u0012\u0005x¾¶7\"¨ã!\u0080Ú\u000fSrÄ³}.öÔo»à\f\u0099~\u0012¼\u008b/<Õµ¦.5§[X\u009dÑ\u0014JâÃ²t6í|f\u0092\u001f\u0015\u0090ï\t©\u0082C;\u0002¬\u0097%!ÞðW\u0082ÈXAvú\u0080s#äé\u009dû\u0016Q\u008fY\u0000\u0089¹\n2æ«¸\\ZÕ&NÎÇtx\u009bñÄj'ã)\u0094Ë\rx\u0086\u009c?É°4)\u0004¢Ä[aÌàE\u0092þ¨wÇèPa3\u001aø\u0093o\u0004¡½Ï6Y¯9 ñÙRR®ËÉ|Bõ\u0002nÆçI\u0098\u0093\u0011ê\u008a\u007f\u0003\u000b´Ã-O¦¤_ËÐ|I\fÂÌ{^ìÀe\u0092\u001e\u0088\u0097ç\bp\u0081\u0013:Ø³O$\u0081ÝïVyÏ\u0019@Ñù\rr\u008eëé\u009cb\u0015â\u008e&\u0007©¸s1\nª\u009f#®Ô#M¯ÆD\u007f\u0015ð\u009ciçâ,\u009b¶\fE\u0085\n>¨·|(ü¡9Z\u0000ÓÍD¬ý\u009fvùï0`\r\u0019Ü\u0092¡\u000bý¼ú5d®*'\u0097Ø\u0092Q¢ÊÃC\u001bô+mýæ\u009b\u009f¦\u0010ð\u0089`\u0002,»Ø,\u0098¥\u0099^í×=H1ÁÅz\u009dó\u009ddæ\u001d/\u0096>\u000fü\u0080\u00969\u0093²ï+(ÜGU§ÎïGôø\u007fqJê/c\u001f\u0014×\u008dã\u0006w¿¿0.©\u0017\"ÞÛáLvÅ\u0092~1÷\thÝáú\u009aa\u0013±\u00844=6¶Ð/ê lYºÒ\u0003K\u001cüÛuÀîNg \u0018\u001a\u0091q\næ\u0083\u00814J\u00adÑ&\u001fß}PëÉ\u008fBGûàl\u001cåg\u009eì\u0017\u0090\u0088T\u0001ßº\u00053T¤í]\u0086Ö]OÈÀ6ynòêk\u0082\u001c^\u00961\u000f®\u0080Î9ú²\u0096+\u0006ÜfUªÎ;Gÿø\u009aq\u000bêyc§\u0014*\u008dü\u0006\u0081¿¾0î©ê\"«Û\u0016L_Åº~\r÷ïh¢á\u001b\u009aN\u0013·\u0084o=ì¶±/< JY\u0084Ò\u0014KÕü²u=îLg\u008d\u0018\u001c\u0091æ\n\u008d\u0083:4L\u00ad\u008e&\u0001ßûP´É'Baû\u008bl\u0017åð\u009e¡\u0017(\u0088A\u0001\u0080º\u000f3ù¤ÿ]QÖ\nOùÀGy\u0082òék.\u001c\u0006\u0095ò\u000e0\u0087\u00978Ä±#*-£ÿTuÍ\u0094FÝÿ4p1éÜbk\u001b\u008d\u008cì\u00055¾\u00037Õ¨d!\u008eÚÃS\"Ä\u001c}Öö\u001co³àÒ\u0099\u001f\u0012\u001e\u008bã<~µH.Ò§\u0010X\u001cÑèJ\u0012ÃAtêí\u0019f+\u001fñ\u0090O\tZ\u0082÷;\u0006¬/%êÞ]W_ÈÎA\u000bú!sçäZ\u009d\\\u0016\u0015\u008fÌ\u0000Æ¹\u00142£«¥\\\u001fÕÍNïÇ\u001dx ñ¶j\u0006ãÊ\u0094\u0097\r\u001e\u0086é?«°])×¢\u0091[\u0004Ì\u0004EPþXw¤è¸a\b\u001aý\u0093U\u0004C½¡6\u0086¯5 §ÙnReË\u0086|\u009bõ>nÚçg\u0098l\u0011\u008f\u008að\u00037´ä-\\¦U_\u0098Ð\u00adI,Âý{AìQe\u009d\u001e£\u00979\bÄ\u0081B:C³\u0092$¤Ý:V\u009bÏ;@$ù\u0093r\u009cëC\u009cÍ\u00158\u008e~\u0007\u009c¸Þ1@ª\u008f#-Ô;M\u0099ÆÃ\u007f]ð\u0093i6â!\u009b\u008e\fò\u0085f>\u009d·?(.¡\u0087ZáÓoD®ý4v\u0004ï `Æ\u0019T\u0092 \u000b\t¼\u00005¥®Ë'QØãQúÊ\\Cªô\u0089mRæ¹\u009fã\u0010\u0007\u0089»\u0002Ñ»K,¾¥à^\r×´HÈÁXz½óåd\f\u001d±\u0097b\b¥\u0081\u001b:\u001e³¼$vÝ(V®ÏQ@\u0017ùñr\u007fë)\u009c§\u0015U\u008e\f\u0007ï¸h1\u0000ª¼#OÔ\u0011MèÆm\u007f/ðÉiXâ\u0012\u009b\u009d\fb\u0085%>Ê·M(+¡®ZCÓ\bDóý5v(ïâ`L\u0019C\u0092ð\u000b}¼\u001d5¦®I'\u0018ØíQfÊ\u0006C¸ô^m\u0018æö\u009fY\u0010\u000f\u0089°\u0002W»\r,ÿ¥x^\u0004×ýHÐÁcz\u0084ó\u0005dy\u001dÕ\u0096Õ\u000f{\u0080\u00819S²j+\u0089ÜÚU9Î\u0082GJøsqéêËcE\u0014\u009b\u008d!\u0006p¿ã0Ä©N\"¨Û\u000bLuÅ\u0091~Á÷\u001ah\u0095áX\u009aN\u0013 \u0084æ=\n¶\u009e/B GY¼ÒïK\u001cü\u0097uVî<g³\u0018ø\u0091\u0014\nÜ\u0083\u00884\u008c\u00adÉ&tß1PÔÉoB\u008dûÄl}å,\u009eÕ\u0017ñ\u0088r\u0001\u0013º\u009e3ì¤\"]¶ÖwO\u001cÀ\u0093yîò/kº\u001c@\u0095/\u000e\u0098\u0087ò80±£*Y£\u0012T\u0081ÍÃF)ÿ»p^é\u001bb\u008a\u001bû\u008c&\u0005½¾[7$¨Ï!\u008eÚ\u001bSµÄd}\u0016öÌoêà\u001c\u0099¿\u0012u\u008bo<ÅµÍ.\u001d§\u0086XjÑ4JÖÃÒt:í\u0080fo\u001f8\u0090Û\tÕ\u00827;\u008c¬h%=ÞÀW\u0088ÈHAíú\u0011s\u0003ä¹\u009d£\u0016A\u008fÝ\u0000æ¹g2²«\u00ad\\NÕÕNãÇ\u0019x§ñ\u008bjSãä\u0094ü\r^\u0086¤?\u0084°D)ö¢ý[RÌ\u00adE·þEwÊèÂak\u001a®\u0093ª\u0004r½×6Ç¯` £Ù¦R\u007fËð|Ðõin¨ç\u00ad\u0098`\u0011\u0096\u008aÉ\u0003&´±-ì¦\u0019_\u0082ÐÎIJÂº{\u0086ì\u0016eö\u001eË\u0090Õ\t_\u0082\u001e;ë¬.%4ÞûW\\ÈWAìú+s\u0005äó\u009dU\u0016U\u008fí\u0000\u0006¹\u001a2í«F\\NÕêN%Ç\u001fxÒñKjNãç\u0094.\r\u0018\u0086ø?°°d)Ø¢N[!Ì\u008eE\u0089þ$wÑèZa·\u001aO\u0093ã\u0004\u001d½\u001f6é¯³ «ÙöR\u0013Ë\u0002|ùõ®nÉçõ\u0098\f\u0011\u0015\u008aá\u0003\u00ad´¯-ü¦\u0000_\u0014ÐæIÔÂò{¿ì[ec\u001e£\u0097×\bû\u0081²:W³n$\u00adÝÂVÊÏ¹@Uùqr²ëÙ\u009cõ\u0015 \u008eJ\u0007\b¸ú1ÐªÔ#«ÔxM\u0007Æ\u0098\u007fÛðäi\u008eâJ\u009b:\fÄ\u0085æ>Ü·\u008d(m¡=Z\u0089ÓÕDÑý\u0084viï<`«\u0019Ì\u0092ø\u000b\u0097¼w5;®¬'ÏØÓQ\u009aÊ`C6ô¥mÊæÙ\u009fa\u0010¹\u0089É\u0002V»1,0¥\u0098^Á×ÀH\u000fÁ8z{ó\u0093d×\u001dÏ\u0096\u0015\u000f#\u0080e9>²h+jÜ>U\u0096Î×G:ø\u0089qoê5c\u009b\u0014ß\u008d7\u0006ï¿l01©¼\"ÊÛ\u0004L\u0094ÅU~2÷½hÌá\r\u009a\u009c\u0013f\u0084\r=º¶Ì/\u000e \u0081Y{Ò4K§üÍu\u000bîÃgp\u0018\u000b\u0091¨\nô\u0083\u00004¾\u00ady&\u007fßÑP¡ÉyBúû\u0002lDå®\u009e¢\u0017r\u0088ü\u0001\u0017ºL3£¤\u009d]\u007fÖüO\u0014ÀQy´ò¤k\\\u001cÑ\u0095\r\u000eE\u0087µ8\u0089±U*í£\u000eTOÍ¢F\u008aÿVp\u009cé3b8\u001b\u009f\u008cö\u0005c¾\u00847È¨,!\u0090ÚùShÄÑ}Áöoo\u0099à¡\u0099q\u0012Î\u008bÚ<uµ\u0086.°§jXÍÑßJ|Ã\u008btêígf\u0082\u001fÜ\u0091Ì\nL\u0083\n4\u0094\u00adf&%ß¼PMÉxB\u009dû\fl6å°\u009eJ\u0017r\u0088\u009e\u0001tº+3\u0090¤W]AÖûO1À yáòXkM\u001cð\u0095?\u000e)\u0087Ð8A±w*É£\u0000T\u0012ÍÏF~ÿhpÂé\u0005b'\u001bÍ\u008cs\u0005M¾Ï7\u000e¨$!ÀÚdS-ÄÌ}Cö=o\u0083àe\u0099'\u0012Å\u008bQ<>µë.\u0092§QXÆÑHJCÃõtïí\u000bf³\u001fd\u0090X\t²\u0082à;\u0000¬¸%nÞQW²ÈéA+ú¡sväJ\u009d«\u0016ö\u008f\n\u0000\u009a¹w2O«µ\\ûÕ\u0003N\u0097Ç_xLñ\u0099jÜãe\u0094¤\r+\u0086u?Û°Ý)\u007f¢\u00ad[9Ì\u0006EÒþÚw|èþaJ\u001a¶\u0093\u000b\u0004N½û6æ¯¥ ¿Ù\u0006RGËî|ïõËn°çn\u0098\\\u0011a\u008a\u0018\u0003P´M-í¦¡_\u0007Ð\u001dIPÂz{\u0092ì¢e.\u001e\u0012\u0097s\b{\u0081Ë:»³7$\u0013ÝkVlÏÕ@¸ù\nr\u001cëa\u009ca\u0015Þ\u008eÍ\u0007-¸\u00191Bª^#¦ÔöM8Æ.\u007fpðGiÈâÿ\u009b0\f'\u0085v>H·¬(ô¡\u0014Z\u0000ÓADUýõvéï)`\u0005\u0019I\u0092R\u000bÿ¼ú5\u0014®\n'OØSQ\u0084Ê\u0083COô{m,æÔ\u009f\u008d\u0010\u0080\u0089I\u0002t»\r,Ù¥\u008a^\u0085×XHqÁizÆóÃd\u009e\u001d\u0007\u0096v\u000fo\u0080Ï9Õ²\u0097+kÜ\u007fU\u0015ÎÀG°ø¬q1êHc\u000b\u0014ý\u008d \u0006\u0091¿z0M©\u0004\"êÛ®L\u0092Åv~B÷3hëá²\u009a\u008b\u0013k\u0084#=\u000e¶ü/ÿ \u0088YqÒ,K\u0003üñuÛî\u009dga\u0018)\u0092¡\u000b\u000e¼k5f®ß'ÞØ·Q7Ê}CCôäm\u0017æµ\u009fë\u0010E\u0089G\u0002\u0005»\u0002,©¥ö^[×ZH4Á\u0001z£óádT\u001dY\u0096\u001b\u000f\b\u0080¼^æ(\u0003³\u001e:\u007f\u0085k\fl\u0097`\u001eoézpi".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1379);
        RecordsJson = cArr;
        IccPrivateKeyCrtComponentsJson = 3052640663001901136L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getCvrMaskAnd = 1;
        RecordsJson();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        char[] cArr = new char[656];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c((-16777159) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 48639), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1312, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(1369 - (android.os.Process.myTid() >> 22), (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 9, objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 656);
        valueOf = cArr;
        writeReplace = 2667236084761384533L;
        int i = getCvrMaskAnd + 125;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static java.lang.String values(int i, char c, int i2) {
        return (java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i2)}, 518843466, -518843466, i);
    }

    static void init$0() {
        $$d = new byte[]{84, 108, com.google.common.base.Ascii.CAN, -19};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void valueOf() {
        writeReplace(new java.lang.Object[]{this}, -373156082, 373156083, java.lang.System.identityHashCode(this));
    }
}
