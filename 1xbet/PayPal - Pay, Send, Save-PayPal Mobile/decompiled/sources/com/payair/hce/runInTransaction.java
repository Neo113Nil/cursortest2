package com.payair.hce;

/* loaded from: classes4.dex */
public final class runInTransaction implements com.payair.hce.getMDatabaseannotations {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static boolean RecordsJson;
    private static boolean SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int getAid;
    private static int getPaymentFci;
    private com.payair.hce.getMDatabaseannotations AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private boolean getProfileVersion;
    private byte[] valueOf;
    private byte[] values;
    private int writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.runInTransaction runintransaction = (com.payair.hce.runInTransaction) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        int intValue2 = ((java.lang.Number) objArr[4]).intValue();
        int i4 = (getPaymentFci + 29) % 128;
        SdkCoreBusinessLogicModuleImpl = i4;
        if (runintransaction.writeReplace + intValue > bArr.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(128 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), null, null, "\u0083\u008c\u0087\u0090\u0086\u0088\u0087\u0087\u0083\u0088\u008c\u008a\u009c\u009c\u008e\u008f\u0088\u0083\u008e\u0095\u0082\u0081", objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        getPaymentFci = (i4 + 1) % 128;
        for (int i5 = 0; i5 < runintransaction.writeReplace; i5++) {
            byte[] bArr3 = runintransaction.values;
            bArr3[i5] = (byte) (bArr3[i5] ^ bArr[intValue + i5]);
        }
        int AlternateContactlessPaymentDataJson = runintransaction.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(runintransaction.values, 0, bArr2, intValue2);
        byte[] bArr4 = runintransaction.values;
        java.lang.System.arraycopy(bArr2, intValue2, bArr4, 0, bArr4.length);
        return java.lang.Integer.valueOf(AlternateContactlessPaymentDataJson);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 4) + 99;
        byte[] bArr = $$a;
        int i6 = b + 4;
        int i7 = (i * 3) + 28;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            int i10 = 0;
            int i11 = (i8 + i6) - 1;
            i3 = i10;
            int i12 = i9;
            i5 = i11;
            i6 = i12;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i13 = i6 + 1;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i14 = i5;
            i9 = i13;
            i6 = bArr[i13];
            i10 = i4;
            i8 = i14;
            int i112 = (i8 + i6) - 1;
            i3 = i10;
            int i122 = i9;
            i5 = i112;
            i6 = i122;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i132 = i6 + 1;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            int i1322 = i6 + 1;
            if (i4 == i7) {
            }
        }
    }

    private static void c(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2 = (b2 * 2) + 118;
        int i3 = 3 - (i * 4);
        byte[] bArr = $$d;
        int i4 = b * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == 0 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i2 = (-bArr[i7]) + i2;
            i3 = i7;
            i5 = i6;
        }
    }

    public runInTransaction(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        this.AlternateContactlessPaymentDataJson = getmdatabaseannotations;
        int AlternateContactlessPaymentDataJson = getmdatabaseannotations.AlternateContactlessPaymentDataJson();
        this.writeReplace = AlternateContactlessPaymentDataJson;
        this.DigitizedCardProfile = new byte[AlternateContactlessPaymentDataJson];
        this.values = new byte[AlternateContactlessPaymentDataJson];
        this.valueOf = new byte[AlternateContactlessPaymentDataJson];
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final void writeReplace(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) throws java.lang.IllegalArgumentException {
        boolean z2 = this.getProfileVersion;
        this.getProfileVersion = z;
        byte b = $$a[30];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, r1[1], b, objArr);
        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getmcallbacksannotations)) {
            com.payair.hce.inTransaction intransaction = (com.payair.hce.inTransaction) getmcallbacksannotations;
            byte[] writeReplace = intransaction.writeReplace();
            if (writeReplace.length != this.writeReplace) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), null, null, "\u008a\u0093\u0081\u0086\u0088\u0092\u008b\u0087\u0085\u008f\u0088\u0086\u0084\u0088\u0090\u0083\u0091\u0082\u008a\u0085\u0088\u008a\u008d\u0084\u0086\u0088\u008a\u0090\u0083\u0088\u008a\u008f\u0088\u0083\u0086\u008e\u008d\u0088\u008c\u0087\u0083\u008b\u008a\u0089\u0088\u0082\u0087\u0081\u0083\u0084\u0086\u0081\u0085\u0084\u0081\u0083\u0081\u0082\u0081", objArr2);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
            }
            java.lang.System.arraycopy(writeReplace, 0, this.DigitizedCardProfile, 0, writeReplace.length);
            DigitizedCardProfile();
            if (intransaction.valueOf() == null) {
                if (z2 == z) {
                    return;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                b(android.view.View.MeasureSpec.getMode(0) + 127, null, null, "\u0098\u0094\u008a\u0092\u0088\u0091\u0082\u0081\u0097\u0081\u0089\u0087\u008c\u0095\u0088\u0083\u008e\u0087\u0090\u0083\u0081\u0096\u0088\u008a\u0083\u0084\u0083\u0086\u0088\u0091\u0082\u0081\u0083\u0095\u0094\u008c\u008b\u0082\u008a\u0088\u008a\u0091\u0082\u0084\u0090\u008b\u0088\u0083\u0087\u0082\u0082\u0084\u008b", objArr3);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
            }
            this.AlternateContactlessPaymentDataJson.writeReplace(z, intransaction.valueOf());
            int i = SdkCoreBusinessLogicModuleImpl + 55;
            getPaymentFci = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        DigitizedCardProfile();
        if (getmcallbacksannotations != null) {
            this.AlternateContactlessPaymentDataJson.writeReplace(z, getmcallbacksannotations);
            getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 101) % 128;
        } else {
            if (z2 == z) {
                return;
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b(128 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), null, null, "\u0098\u0094\u008a\u0092\u0088\u0091\u0082\u0081\u0097\u0081\u0089\u0087\u008c\u0095\u0088\u0083\u008e\u0087\u0090\u0083\u0081\u0096\u0088\u008a\u0083\u0084\u0083\u0086\u0088\u0091\u0082\u0081\u0083\u0095\u0094\u008c\u008b\u0082\u008a\u0088\u008a\u0091\u0082\u0084\u0090\u008b\u0088\u0083\u0087\u0082\u0082\u0084\u008b", objArr4);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
        }
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final java.lang.String writeReplace() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson.writeReplace());
        java.lang.Object[] objArr = new java.lang.Object[1];
        b(android.graphics.Color.green(0) + 127, null, null, "\u009a\u009b\u009a\u0099", objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.String obj = sb.toString();
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 29) % 128;
        return obj;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson() {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 23) % 128;
        int AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson();
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 61) % 128;
        return AlternateContactlessPaymentDataJson;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson(byte[] bArr, int i, byte[] bArr2, int i2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        int i3 = SdkCoreBusinessLogicModuleImpl + 57;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!this.getProfileVersion) {
            return DigitizedCardProfile(bArr, i, bArr2, i2);
        }
        int intValue = ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), bArr2, java.lang.Integer.valueOf(i2)}, 138997722, -138997722, i)).intValue();
        int i4 = getPaymentFci + 25;
        SdkCoreBusinessLogicModuleImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return intValue;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final void DigitizedCardProfile() {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 111) % 128;
        byte[] bArr = this.DigitizedCardProfile;
        java.lang.System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        com.payair.hce.getClientVersion.writeReplace(this.valueOf);
        this.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
        int i = getPaymentFci + 115;
        SdkCoreBusinessLogicModuleImpl = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static void b(int i, int[] iArr, java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        int i2 = $11 + 9;
        $10 = i2 % 128;
        byte[] bArr = str3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = IccPrivateKeyCrtComponentsJson;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), 286 - android.widget.ExpandableListView.getPackedPositionGroup(j), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(getAid)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj2 == null) {
            obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode("", 0, 0) + 46, 287 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 46337))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj2);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
        if (RecordsJson) {
            $10 = ($11 + 87) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            int i4 = $10 + 73;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr4 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 1629 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte b = (byte) ($$d[2] - 1);
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    c(b, b, b, objArr5);
                    obj3 = cls.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr4);
            }
            objArr[0] = new java.lang.String(cArr3);
            return;
        }
        if (!SdkCoreAlternateContactlessPaymentDataImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr6 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj4 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1629, (char) android.text.TextUtils.getOffsetAfter("", 0));
                byte b2 = (byte) ($$d[2] - 1);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                c(b2, b2, b2, objArr7);
                obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    private int DigitizedCardProfile(byte[] bArr, int i, byte[] bArr2, int i2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 113) % 128;
        int i3 = this.writeReplace;
        int i4 = 0;
        if (i + i3 > bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(127 - (android.os.Process.myPid() >> 22), null, null, "\u0083\u008c\u0087\u0090\u0086\u0088\u0087\u0087\u0083\u0088\u008c\u008a\u009c\u009c\u008e\u008f\u0088\u0083\u008e\u0095\u0082\u0081", objArr);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr[0]).intern());
        }
        java.lang.System.arraycopy(bArr, i, this.valueOf, 0, i3);
        int AlternateContactlessPaymentDataJson = this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(bArr, i, bArr2, i2);
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 21) % 128;
        while (i4 < this.writeReplace) {
            int i5 = SdkCoreBusinessLogicModuleImpl + 79;
            getPaymentFci = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = i2 / i4;
                bArr2[i6] = (byte) (bArr2[i6] ^ this.values[i4]);
                i4 += 37;
            } else {
                int i7 = i2 + i4;
                bArr2[i7] = (byte) (bArr2[i7] ^ this.values[i4]);
                i4++;
            }
        }
        byte[] bArr3 = this.values;
        this.values = this.valueOf;
        this.valueOf = bArr3;
        return AlternateContactlessPaymentDataJson;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        IccPrivateKeyCrtComponentsJson = new char[]{10755, 10758, 10780, 10763, 10756, 10781, 10777, 10824, 10782, 10767, 10765, 10778, 10759, 10783, 10762, 10752, 10753, 10757, 10770, 10771, 10776, 10769, 10764, 10822, 10841, 10797, 10794, 10766};
        getAid = -143185304;
        SdkCoreAlternateContactlessPaymentDataImpl = true;
        RecordsJson = true;
    }

    static void init$1() {
        $$d = new byte[]{8, -42, 1, 71};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{126, -1, -74, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, 60, 6, -25, com.google.common.base.Ascii.US, com.visa.cbp.getEncExpo.onUnminimized, 14, 6, -17, 3, 18, -10, 7, 0};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE;
    }

    private int writeReplace(byte[] bArr, int i, byte[] bArr2, int i2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        return ((java.lang.Integer) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), bArr2, java.lang.Integer.valueOf(i2)}, 138997722, -138997722, i)).intValue();
    }
}
