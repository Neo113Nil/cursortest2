package com.payair.hce;

/* loaded from: classes4.dex */
public final class getKeyCreationTimestamp extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static final java.lang.Object writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 99 - (b2 * 4);
        int i5 = (b * 3) + 4;
        byte[] bArr = $$d;
        int i6 = (i * 3) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i5;
            i3 = 0;
            int i9 = (-i5) + i7;
            int i10 = i8 + 1;
            i2 = i3;
            i4 = i9;
            i5 = i10;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i4;
            i8 = i5;
            i5 = bArr[i5];
            i7 = i11;
            int i92 = (-i5) + i7;
            int i102 = i8 + 1;
            i2 = i3;
            i4 = i92;
            i5 = i102;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void valueOf() {
        int i = getCvrMaskAnd;
        SdkCoreBusinessLogicModuleImpl = (i + 71) % 128;
        SdkCoreBusinessLogicModuleImpl = (i + 107) % 128;
        int i2 = getProfileVersion + 25;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            SdkCoreBusinessLogicModuleImpl = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        super.valueOf();
        int i3 = getCvrMaskAnd;
        int i4 = (i3 + 37) % 128;
        SdkCoreBusinessLogicModuleImpl = i4;
        int i5 = getProfileVersion + 65;
        getAid = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        SdkCoreBusinessLogicModuleImpl = i4;
        SdkCoreBusinessLogicModuleImpl = (i3 + 7) % 128;
        throw null;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void values() {
        int i = getCvrMaskAnd;
        SdkCoreBusinessLogicModuleImpl = (i + 69) % 128;
        int i2 = getProfileVersion + 91;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            SdkCoreBusinessLogicModuleImpl = (i + 1) % 128;
            SdkCoreBusinessLogicModuleImpl = (i + 21) % 128;
            super.values();
            throw new java.lang.ArithmeticException();
        }
        super.values();
        int i3 = getProfileVersion + 27;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        super.writeReplace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if ((r0 >> 3) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0035, code lost:
    
        com.payair.hce.getKeyCreationTimestamp.SdkCoreBusinessLogicModuleImpl = (r1 + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r1 = r1 + 5;
        com.payair.hce.getKeyCreationTimestamp.SdkCoreBusinessLogicModuleImpl = r1 % 128;
     */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ boolean writeReplace() {
        int i = SdkCoreBusinessLogicModuleImpl + 69;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        if (i % 2 == 0) {
            int i3 = getProfileVersion / 10;
            getAid = i3 * 31173;
        } else {
            int i4 = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getAid = i4 % 128;
        }
        return super.writeReplace();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        SdkCoreBusinessLogicModuleImpl = 0;
        getCvrMaskAnd = 1;
        RecordsJson();
        getProfileVersion = 0;
        getAid = 1;
        getAid();
        writeReplace = new java.lang.Object();
        int i = getAid + 37;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 75) % 128;
            return;
        }
        int i2 = SdkCoreBusinessLogicModuleImpl + 3;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public getKeyCreationTimestamp(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        super(ongetcertoperationunsuccessful);
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $11 = ($10 + 115) % 128;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 11) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(RecordsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 48, android.view.KeyEvent.getDeadChar(0, 0) + 381, (char) (62387 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, (byte) 0, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(IccPrivateKeyCrtComponentsJson), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 3967 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 40224))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 211, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
            $10 = ($11 + 109) % 128;
        }
        java.lang.String str = new java.lang.String(cArr);
        $10 = ($11 + 23) % 128;
        objArr[0] = str;
    }

    public final void valueOf(java.lang.String str, int i, int i2, java.lang.String str2) {
        synchronized (this) {
            synchronized (writeReplace) {
                DigitizedCardProfile();
                com.payair.hce.authenticateRequest c_ = c_(this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{73, (char) 19093, 127}, 820116184, -820116184, 73)).intern(), new java.lang.String[]{str, java.lang.String.valueOf(i)}));
                java.lang.String str3 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, -644474221, 644474232, java.lang.System.identityHashCode(c_));
                java.lang.String str4 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, -46203677, 46203689, java.lang.System.identityHashCode(c_));
                java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, 1379316894, -1379316880, java.lang.System.identityHashCode(c_))).writeReplace();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str3);
                sb.append(java.lang.String.valueOf(i2));
                sb.append(java.lang.String.valueOf(i));
                sb.append(str2);
                sb.append(str4);
                sb.append(writeReplace2);
                byte[] DigitizedCardProfile = DigitizedCardProfile(sb.toString());
                android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{127, (char) 0, 0}, 820116184, -820116184, 127)).intern());
                compileStatement.bindLong(1, i2);
                compileStatement.bindBlob(2, DigitizedCardProfile);
                compileStatement.bindString(3, str2);
                compileStatement.bindString(4, str);
                compileStatement.bindLong(5, i);
                compileStatement.executeUpdateDelete();
                compileStatement.clearBindings();
            }
        }
    }

    private static com.payair.hce.authenticateRequest c_(android.database.Cursor cursor) {
        int i = SdkCoreBusinessLogicModuleImpl + 27;
        getCvrMaskAnd = i % 128;
        int i2 = i % 2;
        com.payair.hce.authenticateRequest authenticaterequest = new com.payair.hce.authenticateRequest();
        if (cursor.moveToFirst()) {
            int i3 = getCvrMaskAnd + 71;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            if (i3 % 2 == 0) {
                getProfileVersion = (getAid + 125) % 128;
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, cursor.getString(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{7, (char) 14081, 200}, 820116184, -820116184, 7)).intern()))}, -670662141, 670662144, java.lang.System.identityHashCode(authenticaterequest));
                int i4 = (int) cursor.getLong(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{3, (char) 13398, 207}, 820116184, -820116184, 3)).intern()));
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, java.lang.Integer.valueOf(i4)}, 1662771544, -1662771536, i4);
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, cursor.getBlob(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)}, 820116184, -820116184, 10)).intern()))}, 53758373, -53758367, java.lang.System.identityHashCode(authenticaterequest));
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, cursor.getString(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 35799, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)}, 820116184, -820116184, 10)).intern()))}, -596054695, 596054708, java.lang.System.identityHashCode(authenticaterequest));
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, cursor.getString(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{13, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)}, 820116184, -820116184, 13)).intern()))}, -314831615, 314831630, java.lang.System.identityHashCode(authenticaterequest));
                int i5 = (int) cursor.getLong(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{17, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE)}, 820116184, -820116184, 17)).intern()));
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, java.lang.Integer.valueOf(i5)}, -406755341, 406755341, i5);
                com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, cursor.getString(cursor.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{23, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE)}, 820116184, -820116184, 23)).intern()))}, -1704088603, 1704088613, java.lang.System.identityHashCode(authenticaterequest));
                getProfileVersion = (getAid + 61) % 128;
            }
        }
        cursor.close();
        int i6 = SdkCoreBusinessLogicModuleImpl + 3;
        getCvrMaskAnd = i6 % 128;
        if (i6 % 2 != 0) {
            return authenticaterequest;
        }
        throw new java.lang.ArithmeticException();
    }

    private int getProfileVersion() {
        synchronized (this) {
            getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 69) % 128;
            int i = getProfileVersion + 69;
            getAid = i % 128;
            if (i % 2 == 0) {
                SdkCoreAlternateContactlessPaymentDataImpl().size();
                throw new java.lang.NullPointerException();
            }
            java.util.List<com.payair.hce.authenticateRequest> SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
            int size = SdkCoreAlternateContactlessPaymentDataImpl2.size();
            if (size <= 0) {
                int i2 = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
                int i3 = getCvrMaskAnd + 61;
                SdkCoreBusinessLogicModuleImpl = i3 % 128;
                if (i3 % 2 == 0) {
                    return i2;
                }
                throw null;
            }
            SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 33) % 128;
            int i4 = 0;
            boolean z = false;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                com.payair.hce.authenticateRequest authenticaterequest = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                java.lang.String str = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest}, -387090980, 387090981, java.lang.System.identityHashCode(authenticaterequest));
                com.payair.hce.authenticateRequest authenticaterequest2 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                java.lang.String str2 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest2}, -582095923, 582095927, java.lang.System.identityHashCode(authenticaterequest2));
                com.payair.hce.authenticateRequest authenticaterequest3 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                java.lang.String str3 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest3}, -644474221, 644474232, java.lang.System.identityHashCode(authenticaterequest3));
                com.payair.hce.authenticateRequest authenticaterequest4 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                int intValue = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest4}, 2027571488, -2027571479, java.lang.System.identityHashCode(authenticaterequest4))).intValue();
                com.payair.hce.authenticateRequest authenticaterequest5 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                int intValue2 = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest5}, 119915555, -119915553, java.lang.System.identityHashCode(authenticaterequest5))).intValue();
                com.payair.hce.authenticateRequest authenticaterequest6 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                java.lang.String str4 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest6}, -46203677, 46203689, java.lang.System.identityHashCode(authenticaterequest6));
                com.payair.hce.authenticateRequest authenticaterequest7 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                java.lang.String writeReplace2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest7}, 1379316894, -1379316880, java.lang.System.identityHashCode(authenticaterequest7))).writeReplace();
                com.payair.hce.authenticateRequest authenticaterequest8 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i4);
                byte[] bArr = (byte[]) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest8}, -2130549654, 2130549661, java.lang.System.identityHashCode(authenticaterequest8));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str3);
                sb.append(java.lang.String.valueOf(intValue2));
                sb.append(java.lang.String.valueOf(intValue));
                sb.append(str2);
                sb.append(str4);
                sb.append(writeReplace2);
                z = valueOf(((java.lang.String) valueOf(new java.lang.Object[]{28, (char) 0, 283}, 820116184, -820116184, 28)).intern(), bArr, sb.toString().getBytes());
                if (z) {
                    getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 97) % 128;
                    break;
                }
                i4++;
            }
            if (z) {
                return com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
            }
            SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 39) % 128;
            int i5 = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
            getAid = (getProfileVersion + 7) % 128;
            return i5;
        }
    }

    private java.util.List<com.payair.hce.authenticateRequest> SdkCoreAlternateContactlessPaymentDataImpl() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            int i = getCvrMaskAnd + 107;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            int i2 = i % 2;
            android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{42, (char) 0, 311}, 820116184, -820116184, 42)).intern(), null);
            arrayList = new java.util.ArrayList();
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    com.payair.hce.authenticateRequest authenticaterequest = new com.payair.hce.authenticateRequest();
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{7, (char) 14081, 200}, 820116184, -820116184, 7)).intern()))}, -670662141, 670662144, java.lang.System.identityHashCode(authenticaterequest));
                    int i3 = (int) rawQuery.getLong(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{3, (char) 13398, 207}, 820116184, -820116184, 3)).intern()));
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, java.lang.Integer.valueOf(i3)}, 1662771544, -1662771536, i3);
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)}, 820116184, -820116184, 10)).intern()))}, 53758373, -53758367, java.lang.System.identityHashCode(authenticaterequest));
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 35799, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)}, 820116184, -820116184, 10)).intern()))}, -596054695, 596054708, java.lang.System.identityHashCode(authenticaterequest));
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{13, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)}, 820116184, -820116184, 13)).intern()))}, -314831615, 314831630, java.lang.System.identityHashCode(authenticaterequest));
                    int i4 = (int) rawQuery.getLong(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{17, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE)}, 820116184, -820116184, 17)).intern()));
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, java.lang.Integer.valueOf(i4)}, -406755341, 406755341, i4);
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{23, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE)}, 820116184, -820116184, 23)).intern()))}, -1704088603, 1704088613, java.lang.System.identityHashCode(authenticaterequest));
                    com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest, rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{8, (char) 0, 353}, 820116184, -820116184, 8)).intern()))}, 1077348826, -1077348821, java.lang.System.identityHashCode(authenticaterequest));
                    arrayList.add(authenticaterequest);
                    rawQuery.moveToNext();
                }
            } else {
                int i5 = getCvrMaskAnd;
                SdkCoreBusinessLogicModuleImpl = (i5 + 83) % 128;
                SdkCoreBusinessLogicModuleImpl = (i5 + 61) % 128;
            }
            rawQuery.close();
            getAid = (getProfileVersion + 117) % 128;
        }
        return arrayList;
    }

    public final java.util.List<java.lang.String> values(java.lang.String str) {
        synchronized (this) {
            DigitizedCardProfile();
            synchronized (writeReplace) {
                android.database.sqlite.SQLiteDatabase readableDatabase = this.DigitizedCardProfile.getReadableDatabase();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.database.Cursor rawQuery = readableDatabase.rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{72, (char) 16166, 361}, 820116184, -820116184, 72)).intern(), new java.lang.String[]{str});
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    return arrayList;
                }
                do {
                    arrayList.add(rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{13, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)}, 820116184, -820116184, 13)).intern())));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                java.lang.Integer.valueOf(arrayList.size());
                return arrayList;
            }
        }
    }

    public final java.lang.String valueOf(java.lang.String str, int i) {
        java.lang.String string;
        synchronized (this) {
            DigitizedCardProfile();
            synchronized (writeReplace) {
                android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{98, (char) 0, 433}, 820116184, -820116184, 98)).intern(), new java.lang.String[]{str, java.lang.String.valueOf(i)});
                string = rawQuery.moveToFirst() ? rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{13, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE)}, 820116184, -820116184, 13)).intern())) : null;
                rawQuery.close();
            }
        }
        return string;
    }

    public final int writeReplace(java.lang.String str, java.lang.String str2) {
        int i;
        synchronized (this) {
            DigitizedCardProfile();
            synchronized (writeReplace) {
                android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{98, (char) 25924, 531}, 820116184, -820116184, 98)).intern(), new java.lang.String[]{str, str2});
                try {
                    if (!rawQuery.moveToFirst()) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        c(android.view.ViewConfiguration.getJumpTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 31 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                    i = rawQuery.getInt(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{17, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE)}, 820116184, -820116184, 17)).intern()));
                } finally {
                    rawQuery.close();
                }
            }
        }
        return i;
    }

    public final java.lang.String values(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        synchronized (this) {
            DigitizedCardProfile();
            synchronized (writeReplace) {
                android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{91, (char) 0, 629}, 820116184, -820116184, 91)).intern(), new java.lang.String[]{str, str2});
                string = rawQuery.moveToFirst() ? rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 35799, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)}, 820116184, -820116184, 10)).intern())) : null;
                rawQuery.close();
            }
        }
        return string;
    }

    private void d_(java.lang.String str, java.lang.String str2, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        synchronized (this) {
            int i = SdkCoreBusinessLogicModuleImpl + 21;
            getCvrMaskAnd = i % 128;
            int i2 = i % 2;
            int i3 = getAid + 45;
            getProfileVersion = i3 % 128;
            int i4 = i3 % 2;
            if (android.database.DatabaseUtils.queryNumEntries(sQLiteDatabase, ((java.lang.String) valueOf(new java.lang.Object[]{28, (char) 0, java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)}, 820116184, -820116184, 28)).intern(), ((java.lang.String) valueOf(new java.lang.Object[]{35, (char) 35132, 748}, 820116184, -820116184, 35)).intern(), new java.lang.String[]{str, str2}) == 0) {
                return;
            }
            android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{83, (char) 15412, 783}, 820116184, -820116184, 83)).intern());
            compileStatement.bindString(1, str);
            compileStatement.bindString(2, str2);
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            if (executeUpdateDelete != 0) {
                getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 43) % 128;
                getProfileVersion = (getAid + 125) % 128;
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                c((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, (char) (android.view.View.MeasureSpec.getMode(0) + 52045), android.view.KeyEvent.keyCodeFromString("") + 29, objArr);
                throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if ((r8 % 2) != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b5 A[Catch: all -> 0x0206, SQLiteConstraintException -> 0x0208, TRY_LEAVE, TryCatch #2 {SQLiteConstraintException -> 0x0208, blocks: (B:5:0x0014, B:13:0x005a, B:15:0x007d, B:17:0x00b5, B:23:0x0126, B:24:0x0152, B:25:0x0153, B:31:0x01cd, B:32:0x01fd, B:34:0x0068, B:35:0x006d), top: B:4:0x0014, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0153 A[Catch: all -> 0x0206, SQLiteConstraintException -> 0x0208, TRY_LEAVE, TryCatch #2 {SQLiteConstraintException -> 0x0208, blocks: (B:5:0x0014, B:13:0x005a, B:15:0x007d, B:17:0x00b5, B:23:0x0126, B:24:0x0152, B:25:0x0153, B:31:0x01cd, B:32:0x01fd, B:34:0x0068, B:35:0x006d), top: B:4:0x0014, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e_(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.String str3, byte[] bArr, java.lang.String str4, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.lang.String str5;
        synchronized (this) {
            try {
                try {
                    com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(bArr);
                    byte[] AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(str, str2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    sb.append(java.lang.String.valueOf(i));
                    sb.append(java.lang.String.valueOf(i2));
                    if (str3 != null) {
                        int i3 = getProfileVersion + 125;
                        getAid = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i4 = getCvrMaskAnd + 25;
                            SdkCoreBusinessLogicModuleImpl = i4 % 128;
                            if (i4 % 2 != 0) {
                                str5 = java.lang.String.valueOf(str3);
                                int i5 = getCvrMaskAnd + 99;
                                SdkCoreBusinessLogicModuleImpl = i5 % 128;
                                int i6 = i5 % 2;
                                sb.append(str5);
                                sb.append(str4);
                                sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))).writeReplace());
                                byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
                                if (AlternateContactlessPaymentDataJson != null) {
                                    android.database.sqlite.SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE), (char) 983, 866}, 820116184, -820116184, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)).intern());
                                    compileStatement.bindString(1, str);
                                    compileStatement.bindString(2, str2);
                                    compileStatement.bindLong(3, i);
                                    compileStatement.bindLong(4, i2);
                                    compileStatement.bindString(5, str3);
                                    compileStatement.bindBlob(6, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
                                    compileStatement.bindString(7, str4);
                                    compileStatement.bindBlob(8, DigitizedCardProfile2);
                                    long executeInsert = compileStatement.executeInsert();
                                    compileStatement.clearBindings();
                                    if (executeInsert != -1) {
                                        return;
                                    }
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    c(61 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (27053 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), android.graphics.Color.red(0) + 32, objArr);
                                    throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
                                }
                                android.database.sqlite.SQLiteStatement compileStatement2 = sQLiteDatabase.compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{160, (char) 32779, java.lang.Integer.valueOf(org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES)}, 820116184, -820116184, 160)).intern());
                                compileStatement2.bindLong(1, i);
                                compileStatement2.bindLong(2, i2);
                                compileStatement2.bindString(3, str3);
                                compileStatement2.bindBlob(4, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile)));
                                compileStatement2.bindBlob(5, DigitizedCardProfile2);
                                compileStatement2.bindString(6, str);
                                compileStatement2.bindString(7, str2);
                                int executeUpdateDelete = compileStatement2.executeUpdateDelete();
                                compileStatement2.clearBindings();
                                if (executeUpdateDelete != -1) {
                                    getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 107) % 128;
                                    getProfileVersion = (getAid + 59) % 128;
                                    return;
                                } else {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    c(31 - android.view.KeyEvent.keyCodeFromString(""), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52044), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, objArr2);
                                    throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr2[0]).intern());
                                }
                            }
                            throw new java.lang.NullPointerException();
                        }
                        int i7 = SdkCoreBusinessLogicModuleImpl + 5;
                        getCvrMaskAnd = i7 % 128;
                    } else {
                        int i8 = getCvrMaskAnd + 39;
                        SdkCoreBusinessLogicModuleImpl = i8 % 128;
                        if (i8 % 2 != 0) {
                            throw new java.lang.NullPointerException();
                        }
                        str5 = "";
                        sb.append(str5);
                        sb.append(str4);
                        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile))).writeReplace());
                        byte[] DigitizedCardProfile22 = DigitizedCardProfile(sb.toString());
                        if (AlternateContactlessPaymentDataJson != null) {
                        }
                    }
                } catch (android.database.sqlite.SQLiteConstraintException unused) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    c(92 - android.text.TextUtils.getOffsetAfter("", 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.getOffsetAfter("", 0) + 25, objArr3);
                    throw new com.payair.hce.getProductConfig(str, i2, ((java.lang.String) objArr3[0]).intern());
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final byte[] valueOf(java.lang.String str, java.lang.String str2) {
        byte[] AlternateContactlessPaymentDataJson;
        synchronized (this) {
            int i = SdkCoreBusinessLogicModuleImpl;
            int i2 = i + 51;
            int i3 = i2 % 128;
            getCvrMaskAnd = i3;
            int i4 = i2 % 2;
            int i5 = getAid + 85;
            getProfileVersion = i5 % 128;
            if (i5 % 2 != 0) {
                SdkCoreBusinessLogicModuleImpl = (i3 + 121) % 128;
            } else {
                int i6 = i + 53;
                getCvrMaskAnd = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 5;
                }
            }
            DigitizedCardProfile();
            AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(str, str2);
            int i8 = getProfileVersion + 89;
            getAid = i8 % 128;
            if (i8 % 2 == 0) {
                getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 79) % 128;
                throw new java.lang.NullPointerException();
            }
        }
        return AlternateContactlessPaymentDataJson;
    }

    private byte[] AlternateContactlessPaymentDataJson(java.lang.String str, java.lang.String str2) {
        byte[] bArr;
        synchronized (writeReplace) {
            android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) valueOf(new java.lang.Object[]{91, (char) 42508, 1210}, 820116184, -820116184, 91)).intern(), new java.lang.String[]{str, str2});
            if (rawQuery.moveToFirst()) {
                com.payair.hce.Initializer initializer = new com.payair.hce.Initializer(rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) valueOf(new java.lang.Object[]{10, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)}, 820116184, -820116184, 10)).intern())));
                com.payair.hce.startService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{initializer}, -1877837077, 1877837077, java.lang.System.identityHashCode(initializer)));
                bArr = writeReplace(initializer);
            } else {
                bArr = null;
            }
            rawQuery.close();
        }
        return bArr;
    }

    public final void valueOf(java.lang.String str) {
        synchronized (this) {
            synchronized (writeReplace) {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
                if (android.database.DatabaseUtils.queryNumEntries(writableDatabase, ((java.lang.String) valueOf(new java.lang.Object[]{28, (char) 0, java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)}, 820116184, -820116184, 28)).intern(), ((java.lang.String) valueOf(new java.lang.Object[]{12, (char) 0, 1301}, 820116184, -820116184, 12)).intern(), new java.lang.String[]{str}) == 0) {
                    return;
                }
                android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{60, (char) 0, 1313}, 820116184, -820116184, 60)).intern());
                compileStatement.bindString(1, str);
                int executeUpdateDelete = compileStatement.executeUpdateDelete();
                compileStatement.clearBindings();
                if (executeUpdateDelete != 0) {
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                c((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, (char) (52045 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), android.widget.ExpandableListView.getPackedPositionType(0L) + 29, objArr);
                throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01f2: INVOKE (r3 I:android.database.sqlite.SQLiteDatabase) VIRTUAL call: android.database.sqlite.SQLiteDatabase.endTransaction():void A[Catch: all -> 0x01f6, MD:():void (c), TRY_ENTER] (LINE:702), block:B:37:0x01f2 */
    public final void DigitizedCardProfile(java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> hashMap) {
        android.database.sqlite.SQLiteDatabase endTransaction;
        synchronized (this) {
            int i = getAid + 103;
            getProfileVersion = i % 128;
            int i2 = 2;
            try {
                if (i % 2 != 0) {
                    this.DigitizedCardProfile.getWritableDatabase().beginTransaction();
                    hashMap.entrySet().iterator();
                    throw new java.lang.NullPointerException();
                }
                android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
                writableDatabase.beginTransaction();
                for (java.util.Map.Entry<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> entry : hashMap.entrySet()) {
                    int i3 = SdkCoreBusinessLogicModuleImpl + 31;
                    getCvrMaskAnd = i3 % 128;
                    int i4 = i3 % 2;
                    getAid = (getProfileVersion + 55) % 128;
                    java.lang.String key = entry.getKey();
                    int i5 = getCvrMaskAnd + 7;
                    SdkCoreBusinessLogicModuleImpl = i5 % 128;
                    int i6 = i5 % 2;
                    for (java.util.Map.Entry<java.lang.String, byte[]> entry2 : entry.getValue().entrySet()) {
                        java.lang.String key2 = entry2.getKey();
                        com.payair.hce.Initializer DigitizedCardProfile = DigitizedCardProfile(entry2.getValue());
                        java.lang.Object[] objArr = new java.lang.Object[3];
                        objArr[0] = 111;
                        objArr[1] = (char) 0;
                        objArr[i2] = 1373;
                        android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) valueOf(objArr, 820116184, -820116184, 111)).intern());
                        DigitizedCardProfile();
                        android.database.sqlite.SQLiteDatabase readableDatabase = this.DigitizedCardProfile.getReadableDatabase();
                        java.lang.String[] strArr = new java.lang.String[i2];
                        strArr[0] = key;
                        strArr[1] = java.lang.String.valueOf(key2);
                        java.lang.Object[] objArr2 = new java.lang.Object[3];
                        objArr2[0] = 83;
                        objArr2[1] = (char) 0;
                        objArr2[i2] = 1484;
                        com.payair.hce.authenticateRequest c_ = c_(readableDatabase.rawQuery(((java.lang.String) valueOf(objArr2, 820116184, -820116184, 83)).intern(), strArr));
                        java.lang.String str = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, -582095923, 582095927, java.lang.System.identityHashCode(c_));
                        java.lang.String str2 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, -644474221, 644474232, java.lang.System.identityHashCode(c_));
                        int intValue = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, 2027571488, -2027571479, java.lang.System.identityHashCode(c_))).intValue();
                        int intValue2 = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, 119915555, -119915553, java.lang.System.identityHashCode(c_))).intValue();
                        java.lang.String str3 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{c_}, -46203677, 46203689, java.lang.System.identityHashCode(c_));
                        byte[] bArr = (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile));
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(key);
                        sb.append(str2);
                        sb.append(java.lang.String.valueOf(intValue2));
                        sb.append(java.lang.String.valueOf(intValue));
                        sb.append(str);
                        sb.append(str3);
                        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(bArr).writeReplace());
                        byte[] DigitizedCardProfile2 = DigitizedCardProfile(sb.toString());
                        compileStatement.bindBlob(1, bArr);
                        compileStatement.bindBlob(2, DigitizedCardProfile2);
                        compileStatement.bindString(3, key);
                        compileStatement.bindString(4, key2);
                        compileStatement.executeUpdateDelete();
                        compileStatement.clearBindings();
                        i2 = 2;
                    }
                    int i7 = i2;
                    int i8 = getAid + 89;
                    getProfileVersion = i8 % 128;
                    if (i8 % 2 == 0) {
                        SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 45) % 128;
                    }
                    i2 = i7;
                }
                SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 5) % 128;
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (java.lang.Throwable th) {
                endTransaction.endTransaction();
                throw th;
            }
        }
    }

    public final void IccPrivateKeyCrtComponentsJson() {
        synchronized (this) {
            int i = SdkCoreBusinessLogicModuleImpl;
            int i2 = i + 117;
            getCvrMaskAnd = i2 % 128;
            int i3 = i2 % 2;
            int i4 = getProfileVersion + 67;
            getAid = i4 % 128;
            if (i4 % 2 == 0) {
                getCvrMaskAnd = (i + 37) % 128;
            }
            android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
            if (android.database.DatabaseUtils.queryNumEntries(writableDatabase, ((java.lang.String) valueOf(new java.lang.Object[]{28, (char) 0, java.lang.Integer.valueOf(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)}, 820116184, -820116184, 28)).intern()) != 0) {
                android.database.sqlite.SQLiteStatement compileStatement = writableDatabase.compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{41, (char) 10214, 1567}, 820116184, -820116184, 41)).intern());
                int executeUpdateDelete = compileStatement.executeUpdateDelete();
                compileStatement.clearBindings();
                if (executeUpdateDelete != 0) {
                    return;
                }
                getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 37) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, (char) (52045 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 29 - android.text.TextUtils.indexOf("", "", 0), objArr);
                throw new com.payair.hce.getAuthenticationMethods(((java.lang.String) objArr[0]).intern());
            }
            SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 91) % 128;
            getAid = (getProfileVersion + 93) % 128;
        }
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        synchronized (this) {
            int i = getCvrMaskAnd + 39;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            int i2 = i % 2;
            int i3 = getAid + 79;
            getProfileVersion = i3 % 128;
            int i4 = i3 % 2;
            java.util.List<com.payair.hce.authenticateRequest> SdkCoreAlternateContactlessPaymentDataImpl2 = SdkCoreAlternateContactlessPaymentDataImpl();
            int i5 = getProfileVersion + 9;
            getAid = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = getCvrMaskAnd + 55;
                SdkCoreBusinessLogicModuleImpl = i6 % 128;
                int i7 = i6 % 2;
            } else {
                getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 41) % 128;
            }
            for (int i8 = 0; i8 < SdkCoreAlternateContactlessPaymentDataImpl2.size(); i8++) {
                com.payair.hce.authenticateRequest authenticaterequest = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                java.lang.String str = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest}, -387090980, 387090981, java.lang.System.identityHashCode(authenticaterequest));
                com.payair.hce.authenticateRequest authenticaterequest2 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                java.lang.String str2 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest2}, -582095923, 582095927, java.lang.System.identityHashCode(authenticaterequest2));
                com.payair.hce.authenticateRequest authenticaterequest3 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                java.lang.String str3 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest3}, -644474221, 644474232, java.lang.System.identityHashCode(authenticaterequest3));
                com.payair.hce.authenticateRequest authenticaterequest4 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                int intValue = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest4}, 2027571488, -2027571479, java.lang.System.identityHashCode(authenticaterequest4))).intValue();
                com.payair.hce.authenticateRequest authenticaterequest5 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                int intValue2 = ((java.lang.Integer) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest5}, 119915555, -119915553, java.lang.System.identityHashCode(authenticaterequest5))).intValue();
                com.payair.hce.authenticateRequest authenticaterequest6 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                java.lang.String str4 = (java.lang.String) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest6}, -46203677, 46203689, java.lang.System.identityHashCode(authenticaterequest6));
                com.payair.hce.authenticateRequest authenticaterequest7 = SdkCoreAlternateContactlessPaymentDataImpl2.get(i8);
                byte[] AlternateContactlessPaymentDataJson = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.authenticateRequest.DigitizedCardProfile(new java.lang.Object[]{authenticaterequest7}, 1379316894, -1379316880, java.lang.System.identityHashCode(authenticaterequest7)));
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(str3);
                sb.append(java.lang.String.valueOf(intValue2));
                sb.append(java.lang.String.valueOf(intValue));
                sb.append(str2);
                sb.append(str4);
                sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson).writeReplace());
                byte[] AlternateContactlessPaymentDataJson2 = this.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), sb.toString().getBytes());
                android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) valueOf(new java.lang.Object[]{111, (char) 0, 1373}, 820116184, -820116184, 111)).intern());
                compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson);
                compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson2);
                compileStatement.bindString(3, str);
                compileStatement.bindString(4, str3);
                compileStatement.executeUpdateDelete();
                compileStatement.clearBindings();
            }
        }
    }

    @Override // com.payair.hce.isLvtAllowed
    public final void AlternateContactlessPaymentDataJson() {
        synchronized (this) {
            int i = getCvrMaskAnd + 61;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            int i2 = i % 2;
            getAid = (getProfileVersion + 45) % 128;
            if (getProfileVersion() == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
                com.payair.hce.checkPermission checkpermission = this.AlternateContactlessPaymentDataJson;
                android.view.ViewConfiguration.getTapTimeout();
                android.graphics.Color.rgb(0, 0, 0);
                android.view.View.MeasureSpec.getSize(0);
            } else {
                SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 45) % 128;
            }
            int i3 = getAid + 61;
            getProfileVersion = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getCvrMaskAnd + 95;
                SdkCoreBusinessLogicModuleImpl = i4 % 128;
                if (i4 % 2 == 0) {
                    throw new java.lang.NullPointerException();
                }
            }
        }
    }

    public final void values(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2, java.util.List<com.payair.hce.RequestCompleteTokenizeDtoPlatform> list2) {
        synchronized (this) {
            super.values();
            synchronized (this.DigitizedCardProfile) {
                synchronized (writeReplace) {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
                    if (list != null) {
                        java.util.Iterator<java.lang.String> it = list.iterator();
                        while (it.hasNext()) {
                            d_(str, it.next(), writableDatabase);
                        }
                    }
                    for (com.payair.hce.RequestCompleteTokenizeDtoPlatform requestCompleteTokenizeDtoPlatform : list2) {
                        e_(str, requestCompleteTokenizeDtoPlatform.DigitizedCardProfile(), requestCompleteTokenizeDtoPlatform.values(), requestCompleteTokenizeDtoPlatform.writeReplace(), requestCompleteTokenizeDtoPlatform.AlternateContactlessPaymentDataJson(), requestCompleteTokenizeDtoPlatform.valueOf(), str2, writableDatabase);
                    }
                }
            }
            super.valueOf();
            DigitizedCardProfile();
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = 0;
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        char charValue = ((java.lang.Character) objArr[1]).charValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 73) % 128;
        char[] cArr = new char[intValue];
        getAid = (getProfileVersion + 29) % 128;
        while (i < intValue) {
            int i2 = getAid + 65;
            getProfileVersion = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = getCvrMaskAnd + 115;
                SdkCoreBusinessLogicModuleImpl = i3 % 128;
                if (i3 % 2 == 0) {
                    cArr[i] = (char) ((valueOf[intValue2 * i] % (i % SdkCoreAlternateContactlessPaymentDataImpl)) - charValue);
                    i += 29;
                }
            } else {
                SdkCoreBusinessLogicModuleImpl = (getCvrMaskAnd + 17) % 128;
            }
            cArr[i] = (char) ((valueOf[intValue2 + i] ^ (i * SdkCoreAlternateContactlessPaymentDataImpl)) ^ charValue);
            i++;
        }
        java.lang.String str = new java.lang.String(cArr);
        int i4 = getProfileVersion + 31;
        getAid = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static void RecordsJson() {
        char[] cArr = new char[3382];
        java.nio.ByteBuffer.wrap("^üÉ\u007fq\u0086\u00987\u0000J¨èÓW{½ãà\n\u001f²çÚÂEií\u009a\u0014>¼_$\u008eO)÷K\u001fæ\u0086_.½VØÁaiï\u0091à8b \u009aË\u007fsr\u009bó\u0095·\u0002(ºËSlË\u001ec³\u0018\u001a°ê(\u00adÁ\u0006yÿ\u0011\u009e\u008e6&×ßnw\u001bï\u0082\u0084r<\u0002Ô«M\u0012åò\u009d\u009b\n*¢ãZ\u0084ó+kÝ\u0000w7T Ë\u0018(ñ\u008fiýÁPºù\u0012\t\u008aNcåÛ\u0000³c,Â\u00840}\u008bÕéMa&\u008c\u009eçv\rï¥G\u001d?|¨\u009d\u0000\u0005ødQÝÉ,¢\u0093\u001aôòJk¸^ëÉ~q\u0097\u0098/\u0000V¨øÓ\u0016{§ãê\nK²\u0084ÚÂEmí\u009f\u0014w¼z$«Ok÷F\u001fí\u0086\u001b.ûVöÁGi\u008c9\u0006®\u0084\u0016{ÿÐg±Ï\u0007´é\u001cZ\u0084\u001bmùÕT½~\"¡\u008atsÏÛªCw(Ø\u0090®x\u0017áãIJ1j¦º\u000eSö4_\u0096Ç{¬\u0082\u0014ºüJeÚÍ\u0093µ;\u001aÊ\u0082{j\u0010Ó£»Nù nÑÖ¬?ò§8\u000f\u008ctµÜWD\u0011\u00ad\b\u0015\u009e}Oâ\nJÀ³\u0087\u001bÊ\u0083CèÆPO¸³!\\\u0089vñHfUÎu6m\u009fq\u0007\u0099lnÔÄ<\u009a¥ç\ræu\u008bÚãBlªÿ\u0013w{ìà\u0095HØ°\u008e\u0019Õ\u0081Ïéñ^äÆý.»\u0097\u008aÿzg\u0006ÌF4\u0083\u009d\u0091\u0005\u000fmçÒ¼:À¢H\u000bésTÛ\u008f@Q¨B\u0010\u00ady-á:V\u0091¾¦&ü\u008f#÷v_\u009fÄÏ,+\u0094\u008fý¸etÊ42^\u009aÑ\u0003\u0097kÝÓà8Ê =\bÆq\u0082Ù\u0082A©¶\u000f\u001eT\u0087\u009bï\u0004W\b¼§$t\u008cÅõq].Åm*·\u0092YûEcfËH0b\u0098\u000b\u0000\u007fi´Ñk9ë®\u0018\u0016'~\u0094çÒOð´\u0005\u001cý\u0084fíÉUS½Æ\"ú\u008aÂò¼[ÏÃN+;\u0090gø·aJÉ\u00141-¦\u0090\u000eõv-ß·G¹¯ù\u0014&|\u0015å¢MSµ^\u001a\u0014\u0082«êoS7»¸#´\u0088\u0099ð\u0010X¬Á\u009d)Z\u009e\t\u0006\u001cn\u0085×.?Â§\u0010\fÎtëÜÛEÅ\u00ad×\u0012\u0013zôâ#Kð³Y\u001bì\u0080tè\u0099P?¹e!ù\u0089bþÂf~ÏX7k\u009f;\u0004Wl\fÔS=%¥p\rpr|Ú\u008eB\u0089«\u0093\u0013\u0005x*à\u0082HM±\u000e\u0019\u0084\u0081ºöY^7Æj/Ó\u0097\u0080üÐd\u009dÌ¬5\u0015\u009d9\u0005`j¥Ò¼:!£9\u000b\u009es%Ø*@Þ©·\u0011Ðy3îsVP¾\u0004'\\\u008fý÷H\\HÄE-÷\u0095\u0081ýòb\u000eÊ®2\u009a\u009b`\u0003\u0017k\u007fÐó8  ÿ\t\u0011qìæ\u0098NØ¶û\u001få\u0087ÌïáTe¼þ$0\u008dÒõº]®Â:*ª\u0093Éû·c\u008eÈ£02\u0098\u009c\u0001\u0003i\u0098Ñ\rF\u0085®É\u0017±\u007fyçÍLÉ´N\u001c\u0087\u0085Êí4UGºl\"ó\u008a\u0007ó|[\u0089À\u0018(!\u0090\u0014ùèaáÉ±>m¦\u0016\u000eîwJßjD²¬×\u0014\u0083}cå$Mÿ²ì\u001ax\u0082\u0097ë\u0084S0»\u0091 V\u0088\u008dñ©Y\u008eÁä6Ê\u009e#\u0006Foø×Ó?\u009d¤_\f]t8ÝVE4ª¤\u0012!zçã-KÂ³)\u0018È\u0080*è\u0081Q6¹J.#\u0096jþ_g»ÏØ7µ\u009cD\u0004ìl°Õ©=\u008d¥¢\n\u0089roÛ\u008aCV«\u0086\u0010éxsàüIÿ±Ä\u0019[\u008e\u0099öÔ_uÇ`/h\u0094íüddiÍ§5ê\u009d\u0099\u0002\u0016j\u0092Òâ;Õ£\u007f\b$pûØaAD©F\u0011Ð\u0086\u0093îMV÷¿É'I\u008fµô\u009e\\\u0086Åq-\u0092\u0095(ú\u009fbÑÊ»3ê\u009b´\u0003\u008dh Ð\\9¬¡ù\tW~¦æ[N\u0002·O\u001fû\u0087Bì³Tf¼Â%i\u008d\"ò}ZEÂ,+Ë\u0093PûH`TÈ¥00\u0099÷\u0001¼vÀÞ\bFÝ¯\u0085\u0017\u0082\u007f\u0001ä)L\u008e´t\u001dz\u0085¤íwRçºS#Å\u008b_ó®XKÀ\u0007(G\u0091<ùSaRÖ^>\u0084¦º\u000f´w5ÜND¡¬#\u0015,}èå¨J.²$\u001aU\u0083\u0090ë\u0017P\u001c¸  è\u0089}ñåY\"Îá6\u0089\u009eî\u0007ÔoÚ×Ä<×¤\u0007\róu¥ÝÿBNª\f\u0012\u0017{\u0098ã\u009fK\u0005°Ø\u0018x\u0081¿éDQxÆ@.\u0015\u0096]ÿÚgIÏá46\u009c\f\u0004²mlÕ/:¿¢\u009b\n\rs'Û\u0016C¤¨ÿ\u0010 xýá\u00adI ±Ù&s\u008eÖ÷¼_2Ç\u0013,¾\u0094Ïü\u0000e\u0087Í\u008c50\u009a\u0018\u0002Ík\u0095Ó\u0092;q \u0019\b~pDÙjA´©g\u001e÷\u0086cî5Wo¿Þ$|\u008c§ôh]\"Å\u0095-M\u0092\u0011ú®b\u008eËñ3ú\u0098ñ\u0000ÆhòÑÃ9\u0087¡ß\u0016:~ÌæeO¸·µ\u001f5\u0084åì\u0091UÎ½¸%H\u008a\u0004ò¸Z\u0080ÃQ+\u001d\u0093\u0010ø\u0089`·Èö1Ã\u0099ò\u000e;vïÞbGÛ¯E\u0017ç|UääL\u000eµà\u001dî\u0082íê÷R\u0099» #\u0016\u008bmðrXBÀ~)\u0019\u0091Kù\u0004nGÖ¤?D§÷\u000f@t\u0005Ü½Dn\u00ad\t\u0015\u0018}\u0095â\u0002J\u0012³í\u001b®\u0083¸è;Pì¸§!\u000b\u0089Xñof$Îo6 \u009f\u001c\u0007=lÛÔ©<ç¥\u0016\rÖu\u0092ÚXB\u000fª\u001c\u0013»{,ãÇH\u001c°Ä\u0019Ò\u0081Àéá^ÍÆ9.ù\u0097Rÿög\\Ì\u00124t\u009d\u009e\u0005=mkÒä:g¢Ã\u000bds\u001fÛ`@g¨]\u0010VyiáqVu¾9&r\u008fÂ÷\u008e_åÄ\u001b,\u0003\u0094\u0087ý|e\u0004Ê±2À\u009av\u0003Ìk-ÓÙ8È Õ\b\u0088q²Ù\u0003A>¶q\u001e«\u0087²ï'W\u0017¼£$\u001d\u008c õÔ]¼Å\u009f*)\u0092?úUcnËh0¯\u0098t\u0000\u0012ipÑå9M®Í\u0016Y~ÿçFO!´B\u001c]\u0084?í«U\u0097½y\"\u000b\u008aYò\u008f[*Ã2+\r\u0090¦ø±a9Éà1½¦n\u000eÀvCßôGh¯è\u0014\t|ëåÒMÏµ\u009d\u001aÂ\u0082ÌêÖS0»Ù#w\u0088]ðqXQÁ&)D\u009eã\u0006Hnï×k?Ì§o\frtrÜREF\u00ad|\u0015ºz\u000fâ=K÷³¡\u001b¬\u00804è\"P\u0088¹*!\u000b\u0089cþïfJÏã7\r\u009f\u0096\u0004Ñl\u001aÔ\u0089=\u009d¥(\r\u0011rOÚ¤Bg«(\u0013\\x\u008cà+H\u000f±í\u0019s\u0081\u0092öf^?Æz/H\u0097}ü\u0093dAÌV55\u009d\u0016\u0005¨jíÒ,:¿£Ï\u000b<sÃØy@Ö©£\u0011Úy*îÞV\u0001¾Ñ'á\u008fÅ÷ \\ÈÄN,,\u0095Wý¯b²Ê32\t\u009bG\u0003ÄkzÐÝ8~ â\taq\u0007æuN_¶\b\u001f\u0082\u0087\u008cïÎT\u0010¼Ã$£\u008d\u008fõ\u0017]¬Â\u009a*R\u0093\u001eû\tc\u0091Èî0å\u0098\u009f\u0001èi\u001fÑôF¿®ð\u0017L\u007fÍçkLÙ´W\u001cÆ\u0085\u0086íÂU\u0088º¿\"%\u008a\u000bó\u008e[\u0097Ào(\u0014\u00904ù°a{É=>ª¦©\u000eÖw&ß\u0011G¢¬\u0097\u0014.}@å»M\u0005²7\u001a\u0089\u0082\u0094ëªS\u0010»\u0094 \u008d\u00884ñ9Y\u009aÁÅ6i\u009eÂ\u0006\u0011oÞ×Ê?Ë¤Ä\f÷tÌÝôE\u0005ª\u0090\u0012¬z\u001cãkKi³7\u0018e\u0080ïèbQÎ¹n.)\u0096[þ\u0001gWÏº7s\u009cM\u0004pl\u000bÕ\f=ô¥\u0099\nÙr\u0005Û.C\u0082«u\u0010>x°àÊIp±×\u0019\u000b\u008eÓöÙ^0ÇÚ/¼\u0094\u001fü)dEÍ¥5L\u009d!\u0002gj®Ò\u0007;:£Æ\b·p¨ØSA1©P\u0011T\u0086LîoV¸¿\"'\u0005\u008f;ô\u0081\\\u0084Å\u001e-á\u0095\u008aú9b÷Êd3ó\u009b¨\u0003ïh%ÐÜ9é¡è\tÊ~åæ´Ná·o\u001fî\u0087\bì\u009aTù¼\u0016%\\\u008dsòËZ\u007fÂ\u009e+L\u0093ÚûX`dÈE0A\u0099A\u0001\u008ai½Þ\u0013F\n¯È\u0017\u0096\u007f¿ä\u0013L\u000e´¯\u001d:\u0085<í]R¨º\u0093#$\u008b$ó¡XùÀ-(¯\u0091ºù\u001ea6ÖQ>\u0093¦J\u000f\u001fw\u0091Ü\u008bD1¬8\u0015¸}DåëJA²,\u001a]\u0083\u0005ë\u001dPË¸! \u000b\u0089%ñxY8Î¿6,\u009e\u0083\u0007Sor××<|¤J\rñuþÝZBBª[\u0012Á{\u0080ãEK¯°È\u0018~\u0080¼é\"Q³Æå.W\u0096CÿÛg\u0094Ïn4±\u009câ\u0004§maÕn:å¢\u0001\n\u0018sòÛ,CI¨0\u0010\u0081x7á¨I\u000b±\u0098&\u001e\u008eV÷\u0002_%Ç\u0001,ý\u0094\u0085ü\u0016e\u0089Í\u00985\u009c\u009að\u0002\u0090k9Ó·;` »\b\u0007p®ÙÛA¢©c\u001eæ\u0086\u0092îeWõ¿ù$=\u008clô\u0006]ÐÅ!-W\u0092ÇúËbxË?3µ\u009bÂ\u0000òhFÑ)9Å¡\f\u0016I~ÌæüOÇ·p\u001fu\u0084Ôì¶U[½Ó%¯\u008a\u0019ò¢Z\u0010Ã¦+Û\u0093¥ø»`\u0099Èj1m\u0099ä\u000eðvýÞtG8¯\u000b\u00173|\u001fäþL\u0002µ\u0087\u001d\u0006\u00828ê:R\u00ad»\t#Õ\u008b\u001dð\bX\u0010À$)t\u0091ùùûnµÖo?v§ã\u000f\u0088t¦Ü\u0083Dª\u00adD\u0015¹}uâ\u00adJ°²P\u001b\u0097\u0083ÔèBPH¸æ!ÿ\u0089XñCf\rÎÆ6&\u009fZ\u0007ÿlÉÔ\u0084<=¥c\r1uÒÚTB\u0006ªØ\u0013a{oã?Hã°è\u0019f\u0081µéê^YÆ\u009e.Ò\u0097\u00adÿLg±Ì?4´\u009dø\u0005\u0088m±ÒÈ:ÿ¢Ô\u000bßsÐÛ¬@\u00ad¨K\u00109ywá¦V¦¾\"&¨\u008f\u009f÷Ò_+Äõ,·\u0094\u0087ý4eUÍP2a\u009a]\u0003\u0097kIÓö8F 9\b\u0082qûÙ\u000eA¼¶\u009b\u001e\u001a\u0087\u0017ïFWô¼¼$ð\u008cÛõí]\u001fÅÙ*È\u0092åú²câËN0þ\u0098k\u0000ëi¾Ñ\u00179í®\u0094\u0016%~pç\u0081O|´L\u001cI\u0084_íEU\u0003½B\"´\u008aNòÿ[;Ã-+·\u0090\u0086ø\u0013aWÉ\u00901,¦,\u000e\u0003v¹ß²G%¯Þ\u0014¢|\u0019äÞM\u009fµª\u001aH\u00827ê1S³»Ç#\u0010\u0088ºð\u009cXåÁ\t)\t\u009e\u0085\u0006´nA×\u000e?N§\u0003\fZtÚÜWEí\u00ads\u0015Ôzpâ9Kl³ê\u001b\u0098\u0080sèåP?¹á!ö\u0089þþÆfêÏ'7×\u009f\u001f\u0004ÓlHÔÏ=:¥ü\r]r\u0088Ú®B\u0005«\u008b\u0013\u0081xRà\u000eHI±º\u0019h\u00816öX^SÆJ/_\u0097Óÿ¬dÌÌ85\u0001\u009d¥\u0005fj!Ò½:\u009d£x\u000b*s8Ø¶@Ó©3\u0011áyÏî\u0002VÜ¾K'È\u008f»÷Ä\\\fÄ\u0081,f\u0095\rý\u0081b\u009aÊª2\u0016\u009bo\u0003 kpÐ,8P ¸\t)q5æøN\u0091¶¯\u001f\u001e\u0087ëï\u008aT\u0003¼\u0007$J\u008dÃõ]]ÏÂ=*Ü\u0093öûÈcùÈõ0ï\u0098ñ\u0001\biîÑUF\u001a®j\u0016f\u007f\u0001çcLì´\u007f\u001cÜ\u0085lí\u001fUXº\u001d\"U\u008aFóq[sÀ}(\u0001\u0090\nùøa\u0086ÉÛ>\u0003¦\u000b\u000e\u008fwrßÉG{¬Å\u0014_}Ñå&MÜ²î\u001a8\u0082ßë·S?»# X\u0088®ñÂY*Á\u00156¦\u009en\u00065o»×¡?\u009a¤\\\fptXÝgEGª¢\u0012³z\u0016ã\u000fKX³\u008a\u0018ý\u0080\u0016èÆQ\u0085¹\u000f!ñ\u0096Dþüg\u0093ÏØ72\u009cÔ\u0004ölãÕá=ï¥Ï\nêr\bÛæCE«\u0095\u0010\u0099xaà\"I}±¬\u0019x\u008eÏöD^øÇS/A\u0094Oü4d$Í\u008c5X\u009d\u001b\u0002\\jèÒA;¯£U\b\u0004pjØ3An©,\u0011s\u0086\u0084îGV*¿;'á\u008f¸ô¹\\<Åz-±\u0095tú\u0005btÊ\u008a3½\u009bî\u0003\u001châÐÛ8\u0017¡\u009f\t\u009b~'æ\u0018N~·\u009c\u001f\u0099\u0087!ì¹T\u0095¼\u0002%\t\u008dýò\u008eZ»Âr+<\u0093gûq`{È\u009e0x\u0099Å\u0001<i\bÞ°FÈ¯%\u0017»\u007f©äiLÎ´r\u001dÂ\u0085\u0097í×RõºÛ#ü\u008bßóßXÜÀ¿(À\u0091vùÕa\u0018Ö©>¹¦.\u000füw²ÜßDF¬\u0092\u0015{}\u0083å\u007fJ<²|\u001aQ\u0083pë\u0089S\u0085¸Ì \t\u0089àñ\u00adY\u0095Î\"6Y\u009e\u0096\u0007ro\u001b×\f<\u009f¤ß\r\u001cu¸ÝàB±ª\u0014\u0012ô{\u0089ã\u001aK\r°!\u0018²\u0080hé&Q¸Æ».²\u0096?ÿ+gCÏ¬4p\u009cA\u0004dm\u000eÕi:µ¢M\n\u0098sBÛøCV¨+\u0010Zx\u0099áßIB±Ó&+\u008eÀ÷³_ÔÇä,é\u0094¦üíeaÍñ5Ò\u009aÆ\u0002\u0017j:Ó^;¿ ÿ\b³p\u008aÙ?A«©\u008b\u001e¼\u0086\u0006îôW\u0082¿I$\r\u008c\u0019ôù]§Åô-\u0090\u0092Ðú½bÜËÁ3ï\u009bð\u0000ûh!Ñæ9?¡â\u0016Ï~\u001dæ¶Oi·\u0087\u001fu\u0084ÐìpU$½L%l\u008a_ò%ZKÃÒ+F\u0093\u0082ø\u0002`\u0089È\u008e1æ\u0099\u0019\u000e0v\u0095Þ\u0007G0¯:\u0017¼|Åä/L\u008eµÛ\u001d³\u0085'êÃR¢» #>\u008bbð©XÉÀ\u0015)Ü\u0091\u0090ù®n\fÖ·?¸§ä\u000fKt4ÜGDm\u00adB\u0015\u0093}NâýJy²ß\u001bu\u0083¢è\u0011Pê¸\u009c!\u000f\u0089èñsfûÎö6ç\u009f\u008a\u0007âlaÔÞ<ï¥ê\r½uõÚ[BñªN\u0013\u008c{Õã\u0018H\u009c°\u008b\u0019w\u0081\u0007éÐ^CÆñ.N\u0097\u0015ÿZgBÌU4ü\u009c±\u0005\u009bm<ÒV:¨¢*\u000b$s\u0001Û§@O¨#\u0010\u001dy¾á»V*¾®&Õ\u008fu÷Ñ_<ÄÍ,\u0017\u00948ýpe\u0084ÍQ2\u0007\u009aõ\u0003\u0083k¢Ó\u000e8\\ z\b;qvÙ6AQ¶P\u001e]\u0087±ïhWî¼d$¥\u008cgõN]cÅ\u001e*\u001f\u0092Gúêc\u0015Ëö0ó\u0098ñ\u0000\u0094iÍÑ«9Ø®B\u0016Ä~KçÀOq·\u0003\u001c\u0017\u0084\u008fí½U\u001a½ê\"\u0096\u008aHò1[JÃ½+.\u0090)ø(a¤Éy1 ¦¦\u000e£vôß?GC¯ª\u0014u|\u0016äSM\u0092µa\u001a\r\u0082hê¹S\u008f»Ä#ò\u0088ÀðMXÃÁ\u0006)Ï\u009eë\u0006ûn;×ö?x§\u0012\f\u009at\u009dÜÁEi\u00ad\u0007\u0015dzUâ`K³³l\u001bV\u0080_èmPk¹\u0084!v\u0089ÏþrfxÎ\u008d7\u0019\u009f\u0019\u0004ýl\u0084Ôª=\u0000¥\u0084\r¼r\u0083ÚÏBî«Û\u0013\u007fxÖà,H²±ó\u0019=\u0081¸ö©^¬Æ%/ã\u0097 ÿÚd,Ìs5¿\u009d8\u0005+jÔÒV:¸£R\u000b\u0087sNØ\u0083@9©i\u0011\u0085y/î\u0000V2¾\u009c'Ó\u008f\u000f÷\u0088\\ûÄ\u0084,÷\u0095ÒýÒb ÊÞ2\u0000\u009bé\u00032kåÐ\u00818à Â\tìqýÙ\u0018N\u0097¶k\u001f\u001f\u0087wïBTr¼é$N\u008dúõY]´ÂE*\u0088\u0093Aû\u00adc<Èo0\u0088\u0098&\u0001\u001bi\u009fÑ\u0097Fê®2\u0016Ó\u007f¾çþL*´§\u001c¥\u0085Bí!U;º¬\"\u0096\u008a8óÏ[«À:(\u0017\u0090ãù\u0093a®É\u000e>W¦º\u000e\u0012wEß\u008eGA¬Â\u0014ð}\u008aåüM)²È\u001a7\u0082ÅëìSÁ»Ó Î\u0088\u0014ð:Y;Á·6±\u009e\u0013\u0006\u001do\u009f×è?,¤Í\f¸tîÝ%E6ª¡\u0012Bz^ã¿Kª³\u001c\u00186\u0080Ðè³Q·¹\u000f!Ì\u0096\u009cþ.g\bÏU7\u0085\u009c\u0094\u0004Ál\u001fÕÍ=À¥Ú\n¡rÖÛ\u001dCó«*\u0010ÿx\\àìI\u009b±\u0098\u00192\u008edöô^aÇ¹/}\u0094vüjdJÍV5G\u009dS\u0002ÍjOÒ\u0014;{£Ô\u000b\u0088p\u008fØ\u0004A%©\u0081\u0011L\u0086\rî»Vº¿\u0086'6\u008f9ôÒ\\òÅß-\u008f\u0095«ú\u007fb8Ê\\3¤\u009b\u009e\u0003!hõÐ\u009d8\f¡)\tþ~¶æ\u0093N2·P\u001fO\u0087Oì[T\u0090¼H%ü\u008dDò\u0089Z\u0080Â¾+\r\u0093Ýû\u0099`\bÈ\u00160!\u0099ò\u0001ÇiÿÞµFë¯>\u0017ç\u007f\u008dääL\u0090´à\u001d\r\u0085ýí:Réºñ\"\u0016\u008b¤ó\u0092XeÀ\u000e(Ã\u0091{ù)aGÖW>D¦t\u000f@wºÜMDÄ¬9\u0015\u0014}µå\u0086J\u0012²K\u001a\u009e\u00838ë+S~¸§ ½\u0089$ñ\u0087Y ÎL6Ü\u009eÛ\u0007©o\u001a×5<o¤²\rÅu\u000eÝãB\u009bªÞ\u0012\u0007{\u0005ã\u0083K¤°@\u0018O\u0080Lé0QYÆñ.U\u0096ÍÿrgÚÏ~4\f\u009cj\u0004«mgÕ1=ã¢f\nàs¥ÛüC\u0090¨é\u0010exÕá\u0000IÑ±µ&Î\u008er÷ú_\u0002Ç\u0087,à\u0094\u0003üÆe\u0080Í\n5\f\u009at\u0002¸jóÓ5;0 Q\bGp^Ù\u008eAª©\u009b\u001e'\u00862î£WG¿/$l\u008c\u009côQ](Å8-µ\u0092\u0097ú1b¡ËÎ3\b\u009bÚ\u0000thÇÑ\u00ad9Ã¡\u001d\u0016ÿ~,æ\fOÄ·\u0098\u001fã\u0084\u0015ìqTq½&%~\u008aåòjZPÃf+©\u0093cøâ`oÈÓ1|\u0099\u0013\u000ehv\u0001Þ\u0015G¨¯\u0091\u0017\u0007|\räÚLúµ½\u001dÆ\u0085öêÃR#»ß#S\u008bÌð\u0098X8À\u001a)´\u0091Éù\u0011n\u0090Ö\u009d?\u0000§*\u000f't¦Ü\u001dD#\u00adÊ\u0015¯}aâ[J\u0094²¨\u001bõ\u0083Öè\u008bPÚ¸;!î\u00898ñãfïÎç6Ã\u009fè\u0007\u0002o\u001cÔ<<\u0091¥¡\r5u\u001aÚ¹Bëª\n\u0013À{\u009eãÿH\u0003°>\u0019\u0087\u0081Réx^¥Æ\u008c.\u0013\u0097\u0010ÿÔg\u0095Ìþ4)\u009cÒ\u0005ºm\u0018Ò.:o¢£\u000b»sçÛ\\@ë¨Ö\u0010üyºáðV\u000f¾Õ&*\u008fÙ÷I_ÊÄ\u0091,¾\u0094%ýBeØÍG2»\u009a[\u0003wkLÓP8p k\buq\u0089ÙiA2¶]\u001eó\u0086®ï¸W\"¼g$§\u008cFõ+]ºÅ\u009c*\u008d\u0092\u0010ú;côËü0ù\u0098\u0095\u0000\u008diSÑ\u001e9^®\u0082\u0016\u0091~\u0007çíO»· \u001c\u000f\u0084ªí\u0090U·½\u0014\"~\u008aiòy[}Ã°+n\u0090Íøba\u008eÉ¦1ç¦+\u000e\u009bv¿ßBG0¯b\u0014Ô|³äÙMûµÍ\u001a<\u0082ÁêÞSÂ»É#Æ\u0088\nðÛX?ÁÏ)ö\u00910\u0006Ýn´×\f?(§¬\f]t.ÜaEG\u00adb\u0015hzfâµKk³Â\u001b\u001f\u0080)è\u0093P\u009c¹4!L\u0089¸þ7f\rÎu7\u0081\u009f¦\u0004\u0002lÿÔ\u0086=\u001f¥ú\r\u0098r\u008fÚ\u0002B\u0013«u\u0013\u0094xÎà(Hû±È\u0019Ï\u0081Ôöû^ÐÆ\u0092/\u00ad\u0097jÿ9dkÌ¦5\u009b\u009d\"\u0005ìj\u009fÒ\u0086:+£¡\u000b·sÊØ4@\u000f¨P\u0011\u001eyhî\u0088Vt¾?'p\u008fÌ÷M\\ëÄY,À\u0095Fý\u0017bBÊ\b2?\u009b\u0080\u0003\u008bk.Ð\u00178Å \u0094\t\u009dq0Ù¾N½¶0\u001f)\u0087Pï¦T\u0099¼\"$\u0018\u008d®õß];Â»*·\u0093\u0003û\u0014c:È\u00900]\u0098\r\u0001\u009di¹Ñ&FE®ù\u0016B\u007f¿ç^L\u0018´K\u001cU\u0085wíZUtº\u0081\"\u0010\u008a,ó\u009c[ìÃé(¿\u0090åùmaâÉV>î¦³\u000eÛw±ß×G8¬ó\u0014û}ðå\u009bM\u008c²r\u001a\u0019\u0082\u001cë\u0085S\u009d»\u0002 Ø\u0088¾ð\u001bYJÁÖ6W\u009e§\u0006So\u0018×°?U¤<\f\u008dt©ÝèE%ªÄ\u0012¡zÑã.K\u009d³º\u0018V\u00807è(QÓ¹Û!Ð\u0096¼þÌg\u0095Ï87Ð\u009c\u0085\u0004Ål\bÕ¹=\u0094¥\n\n\u0010räÚmC\u008f«y\u0010 xfàwIb±è\u0019_\u008e\u0092ök^.Çw/Ë\u0094tü\u009ed\u0010Í\r5\u009d\u009dE\u0002\tj¡Ò\u0086;ì£Â\u000b?pÎØãAÛ©\u0094\u0011×\u0086\u001fî4VM¿°'¦\u008f-ô÷\\\u0099ÅÌ-%\u0095ãú¢b\u0092Ê>3>\u009b«\u0003yhWÐ¿8T¡è\t0~Ñæ¼N§·\t\u001f\u009a\u0087\u0085ìET\u0002¼i%\u008e\u008d\u0094õûZ®Â÷+ç\u0093Óû·`ÐÈ\\0ì\u0099\u0006\u0001ùi\u007fÞåF\u0098¯â\u0017Õ\u007f\u009eäÚLj´\u0081\u001dw\u0085lísR,ºP\"\u007f\u008b\\ó\u00adXIÀÖ(E\u0091 ù\u0081aÓÖ\u000e>4¦\u009a\u000fmw\u0017ÜÄD³¬æ\u00150}ßå¬Jâ²Ø\u001aµ\u0083¥ë}S!¸/ ¾\u0089\u0091ñ*YÍÎ\u00976Û\u009e\u0013\u0007Lo\u008f×ç<<¤\u0000\fHuqÝEBÔªA\u0012\u0092{Nã\u001fKz°.\u0018v\u0080\u0099é\u0093QxÆ\u001f.5\u0096ìÿÞgøÏ\u00844å\u009c!\u0004ámyÕÝ=¤¢ê\nhsöÛ%Có¨©\u0010\u000fxÊá\u009cIt±\b&/\u008e\u0084÷\b_AÇ9,M\u0094\\üZe\u008bÍV5Þ\u009a3\u0002\u001aj¿Ó$;+ A\b\u0098p\nÙ$A\u0013©¡\u001eÈ\u0086=îÿWª¿\u000e'Ö\u008czôÒ]]ÅÏ-\u0013\u0092»úäb\bËù3\u0084\u009bõ\u0000\u0001h\u000eÑ\u008d9\u0010¡y\u0016\u0003~væDOR·½\u001f_\u0084øì@Tw½L%G\u008aXò$ZUÃó+±\u0093ÿø>`>Èª1 \u0099'\u000eôv£Þ4G/¯4\u0017¼|êä(LÉµÕ\u001d!\u0085Ñê:RÎ»¤#:\u008b\u001cð\u0086X%À\u0003)Ì\u0091\u009fùûn\fÖ7>x§\u007f\u000fut¾ÜQD\t\u00ad]\u0015Ñ}jâÚJf²Í\u001bc\u0083;èoPT¸\u001c!©\u0089èñ\u001efôÎÕ6ñ\u009f \u0007Ío\u0090ÔÚ<+¥Æ\rIuÃÚ\u009aB?ª\u000f\u0013\u008b{õã\u0018H¬°\u0094\u0019w\u00811é'^½ÆF.*\u0097Øÿ¦g\u0011Ì\"4ä\u009c¯\u0005\u009fm;ÒB:¨¢k\u000b\u0014s$Û\u0091@\u0081¨\r\u0010)y¹áäIÆ¾¸&Â\u008fU÷ß_IÄË,\u009a\u0094øýÔeôÍo2\u0010\u009a¸\u0003\u009dkÙÓi8, f\b{qbÙ¾Ao¶Ê\u001e[\u0086\u0084ïWWá¼t$\u009a\u008cpõS]\u008dÅX*\u0019\u0092\u008fú\u0086cîË\u00020*\u0098¾\u0000ýiËÑ\u00939×®T\u0016Ô~Yç°O\u0085·=\u001cþ\u0084©ípU%½Ó\"¢\u008aäò.[\u001dÃ»+(\u0090¿øÞ`ÃÉI1Ç¦º\u000eÚvýßÎGV¯ñ\u0014a|õä~MèµÖ\u001aÜ\u0082xê S³»##ë\u0088§ð(X*Á&)\u009e\u0091&\u0006\u0011nï×u?N§y\f\u0089t\u008cÜÍE\u0000\u00adu\u0015\u0083z,â\u0007KË³º\u001bë\u0080\u000eèPP\u0092¹¯!\u0015\u0089éþéfnÎü7#\u009fà\u0004ÌlãÔ\u0097=§¥Z\r+r\u009aÚ¾Bé«2\u0013;{Uà HY±Å\u0019L\u0081§ö@^®ÆD/\u008d\u0097Gÿíd[Ì$5N\u009dQ^æÉXq¨\u0098n\u0000\u0007¨£ÓB{êã¢\nZ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 3382);
        RecordsJson = cArr;
        IccPrivateKeyCrtComponentsJson = -7285618318290007797L;
    }

    private static void getAid() {
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 59) % 128;
        char[] cArr = new char[1608];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 157, (char) ((android.os.Process.myPid() >> 22) + 42895), 3216 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(3373 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 10, objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, 1608);
        valueOf = cArr;
        SdkCoreAlternateContactlessPaymentDataImpl = -7575783935210699666L;
        getCvrMaskAnd = (SdkCoreBusinessLogicModuleImpl + 17) % 128;
    }

    private static java.lang.String DigitizedCardProfile(int i, char c, int i2) {
        return (java.lang.String) valueOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i2)}, 820116184, -820116184, i);
    }

    static void init$0() {
        $$d = new byte[]{com.google.common.base.Ascii.EM, -31, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.google.common.base.Ascii.DC4};
        $$e = 141;
    }
}
