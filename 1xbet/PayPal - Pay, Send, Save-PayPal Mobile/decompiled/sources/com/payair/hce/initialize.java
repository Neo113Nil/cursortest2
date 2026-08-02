package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class initialize {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static boolean SdkCoreBusinessLogicModuleImpl;
    private static boolean getApplicationLifeCycleData;
    private static int getCvmResetTimeout;
    private static int getCvrMaskAnd;
    private static int getDualTapResetTimeout;
    private static char[] getGpoResponse;
    private static long getPaymentFci;
    protected com.payair.hce.suspendCardForToken AlternateContactlessPaymentDataJson;
    protected com.payair.hce.transactionCanBeResumed DigitizedCardProfile;
    protected com.payair.hce.setPinIvCvc3Track2 IccPrivateKeyCrtComponentsJson = com.payair.hce.setMaximumPinTry.valueOf();
    private com.payair.hce.checkDeviceUnlockKeys RecordsJson;
    private com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private com.payair.hce.transactionCanBeResumed getAid;
    private boolean getCiacDecline;
    private com.payair.hce.isLocallyVerified getProfileVersion;
    protected com.payair.hce.transactionCanBeResumed valueOf;
    protected com.payair.hce.getNumberOfTransactionLogEntries values;
    protected com.payair.hce.transactionCanBeResumed writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void f(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 38 - (i * 34);
        byte[] bArr = $$d;
        int i5 = 35 - (s2 * 2);
        char[] cArr = new char[i5];
        int i6 = 718 - s;
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            int i8 = i4;
            i4++;
            i6 = (i8 + (-i7)) - 2;
            i2 = i3;
            int i9 = i6;
            int i10 = i4;
            i3 = i2 + 1;
            cArr[i2] = (char) i9;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = bArr[i10];
            i8 = i9;
            i4 = i10;
            i4++;
            i6 = (i8 + (-i7)) - 2;
            i2 = i3;
            int i92 = i6;
            int i102 = i4;
            i3 = i2 + 1;
            cArr[i2] = (char) i92;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            int i922 = i6;
            int i1022 = i4;
            i3 = i2 + 1;
            cArr[i2] = (char) i922;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void i(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 4 - (i2 * 4);
        int i6 = 1 - (i * 4);
        byte[] bArr = $$j;
        int i7 = 118 - s;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i7 = i6;
            int i8 = i5;
            i4 = 0;
            i7 += -i5;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i5;
            i5 = bArr[i5];
            i7 += -i5;
            i5 = i8 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.initialize initializeVar = (com.payair.hce.initialize) objArr[0];
        int i4 = getCvmResetTimeout;
        getDualTapResetTimeout = (i4 + 71) % 128;
        com.payair.hce.suspendCardForToken suspendcardfortoken = initializeVar.AlternateContactlessPaymentDataJson;
        getDualTapResetTimeout = (i4 + 49) % 128;
        return suspendcardfortoken;
    }

    public initialize(com.payair.hce.setJWTToken setjwttoken) throws com.payair.hce.updateSukFileName {
        if (setjwttoken.DigitizedCardProfile() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.getAlternateContactlessPaymentData);
        }
        this.SdkCoreAlternateContactlessPaymentDataImpl = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(setjwttoken.DigitizedCardProfile());
        if (setjwttoken.writeReplace() == null) {
            throw new com.payair.hce.updateSukFileName(com.payair.hce.requestTaskStatusUpdate.SdkCoreCardRiskManagementDataImpl);
        }
        java.lang.String writeReplace = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(setjwttoken.writeReplace()).writeReplace();
        java.lang.Object[] objArr = new java.lang.Object[1];
        e("퍢", 51329 - android.graphics.Color.red(0), objArr);
        if (writeReplace.split(((java.lang.String) objArr[0]).intern(), -1).length - 1 > 1) {
            android.os.Process.myPid();
        }
        this.getAid = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(setjwttoken.writeReplace());
        this.getProfileVersion = setjwttoken.AlternateContactlessPaymentDataJson();
        this.RecordsJson = setjwttoken.values();
        this.getCiacDecline = setjwttoken.valueOf();
    }

    public final com.payair.hce.transactionCanBeResumed getAid() {
        int i = (getCvmResetTimeout + 113) % 128;
        getDualTapResetTimeout = i;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 3;
        getCvmResetTimeout = i2 % 128;
        if (i2 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw null;
    }

    public final com.payair.hce.transactionCanBeResumed getCiacDecline() {
        int i = getCvmResetTimeout;
        getDualTapResetTimeout = (i + 121) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.getAid;
        getDualTapResetTimeout = (i + 73) % 128;
        return transactioncanberesumed;
    }

    private static void e(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = ($10 + 79) % 128;
        $11 = i2;
        if (str != null) {
            int i3 = i2 + 67;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
        getdsrpdata.values = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            int i4 = getdsrpdata.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr2[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 31, android.view.View.getDefaultSize(0, 0) + 1890, (char) (android.view.View.combineMeasuredStates(0, 0) + 3600));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    i((short) 5, 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                }
                jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (getPaymentFci ^ (-4761752123935132024L));
                java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 1443, (char) (android.graphics.Color.argb(0, 0, 0, 0) + 29682));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    i((short) 6, 0, 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr3 = new char[length];
        getdsrpdata.valueOf = 0;
        while (getdsrpdata.valueOf < cArr2.length) {
            cArr3[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
            java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
            if (obj3 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 63, android.text.TextUtils.getOffsetAfter("", 0) + 1443, (char) (29683 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                i((short) 6, 0, 0, objArr7);
                obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    public final com.payair.hce.isLocallyVerified getGpoResponse() {
        int i = getDualTapResetTimeout;
        getCvmResetTimeout = (i + 79) % 128;
        com.payair.hce.isLocallyVerified islocallyverified = this.getProfileVersion;
        getCvmResetTimeout = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return islocallyverified;
    }

    public final com.payair.hce.checkDeviceUnlockKeys getCvrMaskAnd() {
        int i = getDualTapResetTimeout;
        getCvmResetTimeout = (i + 45) % 128;
        com.payair.hce.checkDeviceUnlockKeys checkdeviceunlockkeys = this.RecordsJson;
        getCvmResetTimeout = (i + 91) % 128;
        return checkdeviceunlockkeys;
    }

    public final boolean SdkCoreBusinessLogicModuleImpl() {
        int i = (getDualTapResetTimeout + 125) % 128;
        getCvmResetTimeout = i;
        boolean z = this.getCiacDecline;
        getDualTapResetTimeout = (i + 121) % 128;
        return z;
    }

    public final com.payair.hce.transactionCanBeResumed getPaymentFci() {
        int i = getDualTapResetTimeout;
        getCvmResetTimeout = (i + 61) % 128;
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = this.valueOf;
        int i2 = i + 73;
        getCvmResetTimeout = i2 % 128;
        if (i2 % 2 == 0) {
            return transactioncanberesumed;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.getNumberOfTransactionLogEntries getCvmResetTimeout() {
        int i = (getCvmResetTimeout + 49) % 128;
        getDualTapResetTimeout = i;
        com.payair.hce.getNumberOfTransactionLogEntries getnumberoftransactionlogentries = this.values;
        getCvmResetTimeout = (i + 3) % 128;
        return getnumberoftransactionlogentries;
    }

    private static void h(int[] iArr, java.lang.String str, int i, java.lang.String str2, java.lang.Object[] objArr) {
        java.lang.String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getUmdGeneration getumdgeneration = new com.payair.hce.getUmdGeneration();
        char[] cArr = getGpoResponse;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i2 = 2;
        int i3 = 1;
        if (cArr != null) {
            $10 = ($11 + 95) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 75;
                $11 = i5 % 128;
                if (i5 % i2 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i3];
                        objArr2[0] = java.lang.Integer.valueOf(cArr[i4]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                        if (obj == null) {
                            obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.indexOf("", c) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj);
                        }
                        cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr[i4])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54185069);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_DARK_APPEARANCE_VALUE, (char) (android.text.TextUtils.indexOf("", "", 0) + 46337))).getMethod("y", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54185069, obj2);
                    }
                    cArr2[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                i2 = 2;
                i3 = 1;
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(getCvrMaskAnd)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-54214860);
        if (obj3 == null) {
            obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(46 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 287 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (46337 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)))).getMethod("x", java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-54214860, obj3);
        }
        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
        if (getApplicationLifeCycleData) {
            $11 = ($10 + 109) % 128;
            getumdgeneration.values = bArr2.length;
            char[] cArr3 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 71) % 128;
                cArr3[getumdgeneration.valueOf] = (char) (cArr[bArr2[(getumdgeneration.values - 1) - getumdgeneration.valueOf] + i] - intValue);
                java.lang.Object[] objArr5 = {getumdgeneration, getumdgeneration};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
                if (obj4 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 43, 1628 - android.os.Process.getGidForName(""), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    i((short) 0, 0, 0, objArr6);
                    obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            }
            java.lang.String str4 = new java.lang.String(cArr3);
            int i6 = $10 + 115;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            objArr[0] = str4;
            return;
        }
        if (!SdkCoreBusinessLogicModuleImpl) {
            getumdgeneration.values = iArr.length;
            char[] cArr4 = new char[getumdgeneration.values];
            getumdgeneration.valueOf = 0;
            while (getumdgeneration.valueOf < getumdgeneration.values) {
                $11 = ($10 + 49) % 128;
                cArr4[getumdgeneration.valueOf] = (char) (cArr[iArr[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
                getumdgeneration.valueOf++;
            }
            objArr[0] = new java.lang.String(cArr4);
            return;
        }
        $10 = ($11 + 81) % 128;
        getumdgeneration.values = charArray.length;
        char[] cArr5 = new char[getumdgeneration.values];
        getumdgeneration.valueOf = 0;
        while (getumdgeneration.valueOf < getumdgeneration.values) {
            cArr5[getumdgeneration.valueOf] = (char) (cArr[charArray[(getumdgeneration.values - 1) - getumdgeneration.valueOf] - i] - intValue);
            java.lang.Object[] objArr7 = {getumdgeneration, getumdgeneration};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-380447271);
            if (obj5 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.widget.ExpandableListView.getPackedPositionType(0L), 1628 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                i((short) 0, 0, 0, objArr8);
                obj5 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-380447271, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getCvmResetTimeout = 0;
        getDualTapResetTimeout = 1;
        getPaymentFci = -3008159130741987924L;
        getGpoResponse = new char[]{10781, 10776, 10841, 10779, 10767, 10782, 10764, 10783, 10758, 10762, 10777, 10753, 10766, 10780, 10770, 10840, 10754, 10759, 10756, 10822, 10765, 10752, 10844, 10755, 10768, 10778, 10773, 10760, 10769, 10771, 10804, 10843, 10834, 10806, 10820, 10757, 10815};
        getCvrMaskAnd = -143185301;
        SdkCoreBusinessLogicModuleImpl = true;
        getApplicationLifeCycleData = true;
    }

    static void init$1() {
        $$j = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2};
        $$k = 76;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x11cb, code lost:
    
        if (((((int) r2) & ((((((~((-2056390710) | r12)) | 1343227925) * (-245)) + 1105026158) + (r3 * (-245))) + ((r3 | 801350176) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) (r2 >> 32)) & ((((((~(2013192180 | r61)) | (~((-844548705) | r12))) * (-318)) + 1590355842) + (((~((-861851381) | r61)) | android.R.drawable.ic_media_route_connected_light_10_mtrl) * (-318))) + (((~(861851380 | r61)) | 1995889504) * 318)))) == 477111747) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x2673, code lost:
    
        if (r7 == null) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x2461, code lost:
    
        if (r6 == null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x06c8, code lost:
    
        if (((((int) r3) & (((((((~(344356924 | r12)) | 1092715841) | (~((-1092869486) | r12))) * 464) - 854703739) + ((1437072765 | r61) * (-464))) + (((~((-1092869486) | r61)) | 1092715841) * 464))) | (((int) (r3 >> 32)) & ((((~((-1084773515) | r61)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1812676560) + (((~((-1084773515) | r12)) | 151060736) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)))) != (-1032769152)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x07c0, code lost:
    
        if (((((int) (r6 >> 32)) & (((((((~(92314455 | r12)) | (-1605040984)) | r4) * (-713)) + 400584448) + (r4 * 1426)) + ((~((-1529540867) | r12)) * 713))) | (((int) r6) & ((((((~(405444539 | r61)) | (-2113863680)) * (-140)) + 108479311) + ((~((-1708419141) | r61)) * 70)) + (((~((-1842670950) | r61)) | (-1979611871)) * 70)))) == 542074309) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0fa9, code lost:
    
        if (((((int) r2) & (((((~((-1372200363) | r61)) | (-1485540524)) * (-964)) + 972007117) + (((~((-1372200363) | r12)) | 20975872) * (-964)))) | (((((((-17957185) | r61) * (-627)) + 635053320) + (((~(1433650630 | r61)) | (-1424090255)) * (-627))) + (((~((-1433650631) | r12)) | (~((-1424090255) | r61))) * 627)) & ((int) (r2 >> 32)))) != 477111747) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x140b A[Catch: all -> 0x3ca3, TryCatch #0 {all -> 0x3ca3, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x0059, B:11:0x0120, B:13:0x0169, B:14:0x01bc, B:19:0x01e8, B:21:0x01fb, B:22:0x0241, B:32:0x02ac, B:34:0x02bf, B:35:0x0309, B:37:0x0326, B:39:0x0339, B:40:0x0384, B:42:0x038d, B:44:0x03aa, B:45:0x03ff, B:51:0x07e0, B:53:0x07f3, B:54:0x0843, B:60:0x098b, B:62:0x09c4, B:63:0x0a1b, B:67:0x0ced, B:69:0x0d00, B:70:0x0d4b, B:79:0x0db4, B:81:0x0dc7, B:82:0x0e17, B:84:0x0e37, B:86:0x0e4a, B:87:0x0e95, B:89:0x0e9e, B:91:0x0ebc, B:92:0x0f14, B:99:0x11f8, B:101:0x120b, B:102:0x125b, B:114:0x1318, B:116:0x136c, B:117:0x13bf, B:123:0x0fbb, B:125:0x0fd8, B:126:0x102c, B:129:0x10bd, B:131:0x10da, B:132:0x112b, B:138:0x13f8, B:140:0x140b, B:141:0x1456, B:143:0x150b, B:145:0x151e, B:146:0x156d, B:154:0x1644, B:156:0x1680, B:157:0x16d4, B:161:0x1704, B:163:0x1717, B:164:0x1765, B:166:0x180b, B:168:0x181e, B:169:0x186c, B:177:0x192a, B:179:0x197a, B:180:0x19d1, B:187:0x1a93, B:189:0x1aa6, B:190:0x1af6, B:200:0x1ba4, B:202:0x1bf8, B:203:0x1c4b, B:227:0x1e83, B:229:0x1ed7, B:230:0x1f2d, B:234:0x1f5d, B:236:0x1f70, B:237:0x1fbc, B:240:0x1fe0, B:242:0x1ff3, B:243:0x204a, B:250:0x221f, B:252:0x2232, B:253:0x2286, B:261:0x2341, B:263:0x2395, B:264:0x23ea, B:291:0x248a, B:293:0x24cc, B:294:0x2529, B:318:0x25a5, B:320:0x25f3, B:321:0x264c, B:324:0x2678, B:326:0x2687, B:327:0x26cd, B:331:0x2790, B:333:0x27d6, B:334:0x282f, B:338:0x2846, B:340:0x285f, B:341:0x28aa, B:345:0x296a, B:347:0x29bc, B:348:0x2a12, B:351:0x2a28, B:353:0x2a37, B:354:0x2a83, B:358:0x2b25, B:360:0x2b8d, B:361:0x2be8, B:364:0x2bfe, B:366:0x2c0d, B:367:0x2c56, B:371:0x2d03, B:373:0x2d47, B:374:0x2d9a, B:377:0x2db0, B:379:0x2dbf, B:380:0x2e08, B:384:0x2eb3, B:386:0x2f0d, B:387:0x2f5d, B:391:0x2f96, B:393:0x2fc0, B:394:0x3020, B:398:0x30db, B:400:0x3129, B:401:0x3180, B:405:0x31ae, B:407:0x31c1, B:408:0x3215, B:412:0x32b8, B:414:0x3305, B:415:0x3358, B:418:0x336e, B:420:0x337d, B:421:0x33c9, B:425:0x348b, B:427:0x34de, B:428:0x3535, B:431:0x354b, B:433:0x355a, B:434:0x35a9, B:438:0x364a, B:440:0x368b, B:441:0x36df, B:444:0x36f5, B:446:0x3704, B:447:0x3756, B:451:0x3807, B:453:0x385d, B:454:0x38b7, B:457:0x38cd, B:459:0x38dc, B:460:0x3923, B:466:0x39cd, B:468:0x3a1d, B:469:0x3a7a, B:471:0x3a8f, B:473:0x3aa2, B:474:0x3aee, B:476:0x3af6, B:478:0x3b26, B:479:0x3b8c, B:483:0x3be9, B:485:0x3c2c, B:486:0x3c83, B:591:0x08ea, B:593:0x08fd, B:594:0x0948, B:597:0x049b, B:599:0x04b9, B:600:0x050f, B:604:0x05b0, B:606:0x05ce, B:607:0x0622, B:610:0x06cc, B:612:0x06ea, B:613:0x073d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x151e A[Catch: all -> 0x3ca3, TryCatch #0 {all -> 0x3ca3, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x0059, B:11:0x0120, B:13:0x0169, B:14:0x01bc, B:19:0x01e8, B:21:0x01fb, B:22:0x0241, B:32:0x02ac, B:34:0x02bf, B:35:0x0309, B:37:0x0326, B:39:0x0339, B:40:0x0384, B:42:0x038d, B:44:0x03aa, B:45:0x03ff, B:51:0x07e0, B:53:0x07f3, B:54:0x0843, B:60:0x098b, B:62:0x09c4, B:63:0x0a1b, B:67:0x0ced, B:69:0x0d00, B:70:0x0d4b, B:79:0x0db4, B:81:0x0dc7, B:82:0x0e17, B:84:0x0e37, B:86:0x0e4a, B:87:0x0e95, B:89:0x0e9e, B:91:0x0ebc, B:92:0x0f14, B:99:0x11f8, B:101:0x120b, B:102:0x125b, B:114:0x1318, B:116:0x136c, B:117:0x13bf, B:123:0x0fbb, B:125:0x0fd8, B:126:0x102c, B:129:0x10bd, B:131:0x10da, B:132:0x112b, B:138:0x13f8, B:140:0x140b, B:141:0x1456, B:143:0x150b, B:145:0x151e, B:146:0x156d, B:154:0x1644, B:156:0x1680, B:157:0x16d4, B:161:0x1704, B:163:0x1717, B:164:0x1765, B:166:0x180b, B:168:0x181e, B:169:0x186c, B:177:0x192a, B:179:0x197a, B:180:0x19d1, B:187:0x1a93, B:189:0x1aa6, B:190:0x1af6, B:200:0x1ba4, B:202:0x1bf8, B:203:0x1c4b, B:227:0x1e83, B:229:0x1ed7, B:230:0x1f2d, B:234:0x1f5d, B:236:0x1f70, B:237:0x1fbc, B:240:0x1fe0, B:242:0x1ff3, B:243:0x204a, B:250:0x221f, B:252:0x2232, B:253:0x2286, B:261:0x2341, B:263:0x2395, B:264:0x23ea, B:291:0x248a, B:293:0x24cc, B:294:0x2529, B:318:0x25a5, B:320:0x25f3, B:321:0x264c, B:324:0x2678, B:326:0x2687, B:327:0x26cd, B:331:0x2790, B:333:0x27d6, B:334:0x282f, B:338:0x2846, B:340:0x285f, B:341:0x28aa, B:345:0x296a, B:347:0x29bc, B:348:0x2a12, B:351:0x2a28, B:353:0x2a37, B:354:0x2a83, B:358:0x2b25, B:360:0x2b8d, B:361:0x2be8, B:364:0x2bfe, B:366:0x2c0d, B:367:0x2c56, B:371:0x2d03, B:373:0x2d47, B:374:0x2d9a, B:377:0x2db0, B:379:0x2dbf, B:380:0x2e08, B:384:0x2eb3, B:386:0x2f0d, B:387:0x2f5d, B:391:0x2f96, B:393:0x2fc0, B:394:0x3020, B:398:0x30db, B:400:0x3129, B:401:0x3180, B:405:0x31ae, B:407:0x31c1, B:408:0x3215, B:412:0x32b8, B:414:0x3305, B:415:0x3358, B:418:0x336e, B:420:0x337d, B:421:0x33c9, B:425:0x348b, B:427:0x34de, B:428:0x3535, B:431:0x354b, B:433:0x355a, B:434:0x35a9, B:438:0x364a, B:440:0x368b, B:441:0x36df, B:444:0x36f5, B:446:0x3704, B:447:0x3756, B:451:0x3807, B:453:0x385d, B:454:0x38b7, B:457:0x38cd, B:459:0x38dc, B:460:0x3923, B:466:0x39cd, B:468:0x3a1d, B:469:0x3a7a, B:471:0x3a8f, B:473:0x3aa2, B:474:0x3aee, B:476:0x3af6, B:478:0x3b26, B:479:0x3b8c, B:483:0x3be9, B:485:0x3c2c, B:486:0x3c83, B:591:0x08ea, B:593:0x08fd, B:594:0x0948, B:597:0x049b, B:599:0x04b9, B:600:0x050f, B:604:0x05b0, B:606:0x05ce, B:607:0x0622, B:610:0x06cc, B:612:0x06ea, B:613:0x073d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x161a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1717 A[Catch: all -> 0x3ca3, TryCatch #0 {all -> 0x3ca3, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x0059, B:11:0x0120, B:13:0x0169, B:14:0x01bc, B:19:0x01e8, B:21:0x01fb, B:22:0x0241, B:32:0x02ac, B:34:0x02bf, B:35:0x0309, B:37:0x0326, B:39:0x0339, B:40:0x0384, B:42:0x038d, B:44:0x03aa, B:45:0x03ff, B:51:0x07e0, B:53:0x07f3, B:54:0x0843, B:60:0x098b, B:62:0x09c4, B:63:0x0a1b, B:67:0x0ced, B:69:0x0d00, B:70:0x0d4b, B:79:0x0db4, B:81:0x0dc7, B:82:0x0e17, B:84:0x0e37, B:86:0x0e4a, B:87:0x0e95, B:89:0x0e9e, B:91:0x0ebc, B:92:0x0f14, B:99:0x11f8, B:101:0x120b, B:102:0x125b, B:114:0x1318, B:116:0x136c, B:117:0x13bf, B:123:0x0fbb, B:125:0x0fd8, B:126:0x102c, B:129:0x10bd, B:131:0x10da, B:132:0x112b, B:138:0x13f8, B:140:0x140b, B:141:0x1456, B:143:0x150b, B:145:0x151e, B:146:0x156d, B:154:0x1644, B:156:0x1680, B:157:0x16d4, B:161:0x1704, B:163:0x1717, B:164:0x1765, B:166:0x180b, B:168:0x181e, B:169:0x186c, B:177:0x192a, B:179:0x197a, B:180:0x19d1, B:187:0x1a93, B:189:0x1aa6, B:190:0x1af6, B:200:0x1ba4, B:202:0x1bf8, B:203:0x1c4b, B:227:0x1e83, B:229:0x1ed7, B:230:0x1f2d, B:234:0x1f5d, B:236:0x1f70, B:237:0x1fbc, B:240:0x1fe0, B:242:0x1ff3, B:243:0x204a, B:250:0x221f, B:252:0x2232, B:253:0x2286, B:261:0x2341, B:263:0x2395, B:264:0x23ea, B:291:0x248a, B:293:0x24cc, B:294:0x2529, B:318:0x25a5, B:320:0x25f3, B:321:0x264c, B:324:0x2678, B:326:0x2687, B:327:0x26cd, B:331:0x2790, B:333:0x27d6, B:334:0x282f, B:338:0x2846, B:340:0x285f, B:341:0x28aa, B:345:0x296a, B:347:0x29bc, B:348:0x2a12, B:351:0x2a28, B:353:0x2a37, B:354:0x2a83, B:358:0x2b25, B:360:0x2b8d, B:361:0x2be8, B:364:0x2bfe, B:366:0x2c0d, B:367:0x2c56, B:371:0x2d03, B:373:0x2d47, B:374:0x2d9a, B:377:0x2db0, B:379:0x2dbf, B:380:0x2e08, B:384:0x2eb3, B:386:0x2f0d, B:387:0x2f5d, B:391:0x2f96, B:393:0x2fc0, B:394:0x3020, B:398:0x30db, B:400:0x3129, B:401:0x3180, B:405:0x31ae, B:407:0x31c1, B:408:0x3215, B:412:0x32b8, B:414:0x3305, B:415:0x3358, B:418:0x336e, B:420:0x337d, B:421:0x33c9, B:425:0x348b, B:427:0x34de, B:428:0x3535, B:431:0x354b, B:433:0x355a, B:434:0x35a9, B:438:0x364a, B:440:0x368b, B:441:0x36df, B:444:0x36f5, B:446:0x3704, B:447:0x3756, B:451:0x3807, B:453:0x385d, B:454:0x38b7, B:457:0x38cd, B:459:0x38dc, B:460:0x3923, B:466:0x39cd, B:468:0x3a1d, B:469:0x3a7a, B:471:0x3a8f, B:473:0x3aa2, B:474:0x3aee, B:476:0x3af6, B:478:0x3b26, B:479:0x3b8c, B:483:0x3be9, B:485:0x3c2c, B:486:0x3c83, B:591:0x08ea, B:593:0x08fd, B:594:0x0948, B:597:0x049b, B:599:0x04b9, B:600:0x050f, B:604:0x05b0, B:606:0x05ce, B:607:0x0622, B:610:0x06cc, B:612:0x06ea, B:613:0x073d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x181e A[Catch: all -> 0x3ca3, TryCatch #0 {all -> 0x3ca3, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x0059, B:11:0x0120, B:13:0x0169, B:14:0x01bc, B:19:0x01e8, B:21:0x01fb, B:22:0x0241, B:32:0x02ac, B:34:0x02bf, B:35:0x0309, B:37:0x0326, B:39:0x0339, B:40:0x0384, B:42:0x038d, B:44:0x03aa, B:45:0x03ff, B:51:0x07e0, B:53:0x07f3, B:54:0x0843, B:60:0x098b, B:62:0x09c4, B:63:0x0a1b, B:67:0x0ced, B:69:0x0d00, B:70:0x0d4b, B:79:0x0db4, B:81:0x0dc7, B:82:0x0e17, B:84:0x0e37, B:86:0x0e4a, B:87:0x0e95, B:89:0x0e9e, B:91:0x0ebc, B:92:0x0f14, B:99:0x11f8, B:101:0x120b, B:102:0x125b, B:114:0x1318, B:116:0x136c, B:117:0x13bf, B:123:0x0fbb, B:125:0x0fd8, B:126:0x102c, B:129:0x10bd, B:131:0x10da, B:132:0x112b, B:138:0x13f8, B:140:0x140b, B:141:0x1456, B:143:0x150b, B:145:0x151e, B:146:0x156d, B:154:0x1644, B:156:0x1680, B:157:0x16d4, B:161:0x1704, B:163:0x1717, B:164:0x1765, B:166:0x180b, B:168:0x181e, B:169:0x186c, B:177:0x192a, B:179:0x197a, B:180:0x19d1, B:187:0x1a93, B:189:0x1aa6, B:190:0x1af6, B:200:0x1ba4, B:202:0x1bf8, B:203:0x1c4b, B:227:0x1e83, B:229:0x1ed7, B:230:0x1f2d, B:234:0x1f5d, B:236:0x1f70, B:237:0x1fbc, B:240:0x1fe0, B:242:0x1ff3, B:243:0x204a, B:250:0x221f, B:252:0x2232, B:253:0x2286, B:261:0x2341, B:263:0x2395, B:264:0x23ea, B:291:0x248a, B:293:0x24cc, B:294:0x2529, B:318:0x25a5, B:320:0x25f3, B:321:0x264c, B:324:0x2678, B:326:0x2687, B:327:0x26cd, B:331:0x2790, B:333:0x27d6, B:334:0x282f, B:338:0x2846, B:340:0x285f, B:341:0x28aa, B:345:0x296a, B:347:0x29bc, B:348:0x2a12, B:351:0x2a28, B:353:0x2a37, B:354:0x2a83, B:358:0x2b25, B:360:0x2b8d, B:361:0x2be8, B:364:0x2bfe, B:366:0x2c0d, B:367:0x2c56, B:371:0x2d03, B:373:0x2d47, B:374:0x2d9a, B:377:0x2db0, B:379:0x2dbf, B:380:0x2e08, B:384:0x2eb3, B:386:0x2f0d, B:387:0x2f5d, B:391:0x2f96, B:393:0x2fc0, B:394:0x3020, B:398:0x30db, B:400:0x3129, B:401:0x3180, B:405:0x31ae, B:407:0x31c1, B:408:0x3215, B:412:0x32b8, B:414:0x3305, B:415:0x3358, B:418:0x336e, B:420:0x337d, B:421:0x33c9, B:425:0x348b, B:427:0x34de, B:428:0x3535, B:431:0x354b, B:433:0x355a, B:434:0x35a9, B:438:0x364a, B:440:0x368b, B:441:0x36df, B:444:0x36f5, B:446:0x3704, B:447:0x3756, B:451:0x3807, B:453:0x385d, B:454:0x38b7, B:457:0x38cd, B:459:0x38dc, B:460:0x3923, B:466:0x39cd, B:468:0x3a1d, B:469:0x3a7a, B:471:0x3a8f, B:473:0x3aa2, B:474:0x3aee, B:476:0x3af6, B:478:0x3b26, B:479:0x3b8c, B:483:0x3be9, B:485:0x3c2c, B:486:0x3c83, B:591:0x08ea, B:593:0x08fd, B:594:0x0948, B:597:0x049b, B:599:0x04b9, B:600:0x050f, B:604:0x05b0, B:606:0x05ce, B:607:0x0622, B:610:0x06cc, B:612:0x06ea, B:613:0x073d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x1905  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x1a91  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1b8b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x1c61  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1e6a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x1f43  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x1b88 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0d00 A[Catch: all -> 0x3ca3, TryCatch #0 {all -> 0x3ca3, blocks: (B:3:0x0004, B:6:0x001c, B:7:0x0059, B:11:0x0120, B:13:0x0169, B:14:0x01bc, B:19:0x01e8, B:21:0x01fb, B:22:0x0241, B:32:0x02ac, B:34:0x02bf, B:35:0x0309, B:37:0x0326, B:39:0x0339, B:40:0x0384, B:42:0x038d, B:44:0x03aa, B:45:0x03ff, B:51:0x07e0, B:53:0x07f3, B:54:0x0843, B:60:0x098b, B:62:0x09c4, B:63:0x0a1b, B:67:0x0ced, B:69:0x0d00, B:70:0x0d4b, B:79:0x0db4, B:81:0x0dc7, B:82:0x0e17, B:84:0x0e37, B:86:0x0e4a, B:87:0x0e95, B:89:0x0e9e, B:91:0x0ebc, B:92:0x0f14, B:99:0x11f8, B:101:0x120b, B:102:0x125b, B:114:0x1318, B:116:0x136c, B:117:0x13bf, B:123:0x0fbb, B:125:0x0fd8, B:126:0x102c, B:129:0x10bd, B:131:0x10da, B:132:0x112b, B:138:0x13f8, B:140:0x140b, B:141:0x1456, B:143:0x150b, B:145:0x151e, B:146:0x156d, B:154:0x1644, B:156:0x1680, B:157:0x16d4, B:161:0x1704, B:163:0x1717, B:164:0x1765, B:166:0x180b, B:168:0x181e, B:169:0x186c, B:177:0x192a, B:179:0x197a, B:180:0x19d1, B:187:0x1a93, B:189:0x1aa6, B:190:0x1af6, B:200:0x1ba4, B:202:0x1bf8, B:203:0x1c4b, B:227:0x1e83, B:229:0x1ed7, B:230:0x1f2d, B:234:0x1f5d, B:236:0x1f70, B:237:0x1fbc, B:240:0x1fe0, B:242:0x1ff3, B:243:0x204a, B:250:0x221f, B:252:0x2232, B:253:0x2286, B:261:0x2341, B:263:0x2395, B:264:0x23ea, B:291:0x248a, B:293:0x24cc, B:294:0x2529, B:318:0x25a5, B:320:0x25f3, B:321:0x264c, B:324:0x2678, B:326:0x2687, B:327:0x26cd, B:331:0x2790, B:333:0x27d6, B:334:0x282f, B:338:0x2846, B:340:0x285f, B:341:0x28aa, B:345:0x296a, B:347:0x29bc, B:348:0x2a12, B:351:0x2a28, B:353:0x2a37, B:354:0x2a83, B:358:0x2b25, B:360:0x2b8d, B:361:0x2be8, B:364:0x2bfe, B:366:0x2c0d, B:367:0x2c56, B:371:0x2d03, B:373:0x2d47, B:374:0x2d9a, B:377:0x2db0, B:379:0x2dbf, B:380:0x2e08, B:384:0x2eb3, B:386:0x2f0d, B:387:0x2f5d, B:391:0x2f96, B:393:0x2fc0, B:394:0x3020, B:398:0x30db, B:400:0x3129, B:401:0x3180, B:405:0x31ae, B:407:0x31c1, B:408:0x3215, B:412:0x32b8, B:414:0x3305, B:415:0x3358, B:418:0x336e, B:420:0x337d, B:421:0x33c9, B:425:0x348b, B:427:0x34de, B:428:0x3535, B:431:0x354b, B:433:0x355a, B:434:0x35a9, B:438:0x364a, B:440:0x368b, B:441:0x36df, B:444:0x36f5, B:446:0x3704, B:447:0x3756, B:451:0x3807, B:453:0x385d, B:454:0x38b7, B:457:0x38cd, B:459:0x38dc, B:460:0x3923, B:466:0x39cd, B:468:0x3a1d, B:469:0x3a7a, B:471:0x3a8f, B:473:0x3aa2, B:474:0x3aee, B:476:0x3af6, B:478:0x3b26, B:479:0x3b8c, B:483:0x3be9, B:485:0x3c2c, B:486:0x3c83, B:591:0x08ea, B:593:0x08fd, B:594:0x0948, B:597:0x049b, B:599:0x04b9, B:600:0x050f, B:604:0x05b0, B:606:0x05ce, B:607:0x0622, B:610:0x06cc, B:612:0x06ea, B:613:0x073d), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0d56  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] valueOf$4956fc2a(int i, java.lang.Object obj) {
        long j;
        java.lang.String str;
        int i2;
        java.lang.Object obj2;
        java.lang.String str2;
        java.lang.Object obj3;
        long j2;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j3;
        java.lang.Object obj6;
        int i3;
        int i4;
        int i5;
        int i6;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        int i7;
        java.lang.Throwable th2;
        java.io.BufferedInputStream bufferedInputStream3;
        long j4;
        long j5;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int parseInt;
        java.lang.String[] strArr;
        java.lang.Object obj7;
        boolean equals;
        try {
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            int i8 = 1;
            int i9 = 0;
            if (obj8 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.indexOf("", ""), 1838 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b = (byte) (-$$d[14]);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                f(b, (short) (b - 1), r10[16], objArr3);
                obj8 = cls.getMethod((java.lang.String) objArr3[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj8);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, null)).longValue();
            long j6 = ~longValue;
            long j7 = i;
            long j8 = ~(j6 | (-1081496636) | j7);
            long j9 = ~j7;
            long j10 = (((-475) * longValue) - 515873895372L) + (((~(longValue | 1081496635)) | j8) * (-476)) + (j8 * 952) + ((~(j6 | j9 | (-1081496636))) * 476) + 1921575581;
            int i10 = ~i;
            if (((((int) j10) & ((((((~(1402991975 | i)) | (~((-34234435) | i))) * 69) - 1840639194) + ((((~(1126134854 | i)) | 276857121) | (~((-311091556) | i))) * (-69))) - 1968282348)) | (((int) (j10 >> 32)) & (((((-1073745050) | i10) * (-369)) - 802173004) + (((~(i10 | 1778650523)) | (-1079090362)) * (-369)) + (((~(i10 | (-5345313))) | (~((-1778650524) | i)) | 704905474) * 369)))) != 0) {
                java.lang.Object[] objArr4 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr5 = {-2012707582, 16, java.lang.Integer.valueOf((((~(64662481 | i)) | 740299808) * 336) + 1801722615 + (((~(i | 773988001)) | 30974288) * (-168)) + (((~(773988001 | i10)) | 64662481) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj9 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2713, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                    byte b2 = $$d[14];
                    byte b3 = (byte) (-b2);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    f(b3, (short) (b3 | 652), (byte) (b2 + 1), objArr6);
                    obj9 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                }
                ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            e("퍖귐⸼ꢝ⤩꩑ⓢꕮ➝ꀥ⅏", 32412 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr7);
            java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj10 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 40, 1921 - android.view.View.combineMeasuredStates(0, 0), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                byte b4 = (byte) (-$$d[14]);
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                f(b4, (short) (b4 - 1), r7[16], objArr9);
                obj10 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
            }
            java.lang.String str3 = (java.lang.String) ((java.lang.reflect.Method) obj10).invoke(null, objArr8);
            if (str3 != null) {
                getDualTapResetTimeout = (getCvmResetTimeout + 33) % 128;
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                e("퍖泂걄\uedd2ⵐ滲", 49031 - android.graphics.Color.argb(0, 0, 0, 0), objArr10);
                java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                e("퍃냸ᐮ\uf859嶎Ⅎ蕥檩", 25523 - android.text.TextUtils.getOffsetAfter("", 0), objArr11);
                java.lang.String[] strArr2 = {intern, ((java.lang.String) objArr11[0]).intern()};
                int i11 = 0;
                while (i11 < 2) {
                    if (str3.contains(strArr2[i11])) {
                        java.lang.Object[] objArr12 = new java.lang.Object[i8];
                        h(null, null, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0081\u008d\u0081\u0086\u0088\u0087\u008a\u008c\u0086\u008b\u008a\u0089\u0083\u0088\u0087\u0086\u0085\u0082\u0081\u0084\u0083\u0082\u0081", objArr12);
                        java.lang.Object[] objArr13 = {((java.lang.String) objArr12[i9]).intern()};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj11 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(i9, i9, i9) + 40, 1921 - android.text.TextUtils.getTrimmedLength(""), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                            byte b5 = (byte) (-$$d[14]);
                            java.lang.Object[] objArr14 = new java.lang.Object[i8];
                            f(b5, (short) (b5 - 1), r7[16], objArr14);
                            java.lang.String str4 = (java.lang.String) objArr14[0];
                            java.lang.Class<?>[] clsArr = new java.lang.Class[i8];
                            clsArr[0] = java.lang.String.class;
                            obj11 = cls4.getMethod(str4, clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj11);
                        }
                        java.lang.Object invoke = ((java.lang.reflect.Method) obj11).invoke(null, objArr13);
                        java.lang.Object[] objArr15 = new java.lang.Object[i8];
                        h(null, null, 126 - android.view.MotionEvent.axisFromString(""), "\u0081\u008d\u0081\u0086\u0088\u0087\u008a\u008c\u0086\u008b\u008a\u0089\u0083\u0089\u008d\u0088\u008e\u008f\u008e\u0083\u0088\u0087\u0086\u0085\u0082\u0081\u0084\u0083\u0082\u0081", objArr15);
                        java.lang.Object[] objArr16 = {((java.lang.String) objArr15[0]).intern()};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj12 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1921, (char) android.text.TextUtils.getOffsetAfter("", 0));
                            byte b6 = (byte) (-$$d[14]);
                            java.lang.Object[] objArr17 = new java.lang.Object[i8];
                            f(b6, (short) (b6 - 1), r9[16], objArr17);
                            java.lang.String str5 = (java.lang.String) objArr17[0];
                            java.lang.Class<?>[] clsArr2 = new java.lang.Class[i8];
                            clsArr2[0] = java.lang.String.class;
                            obj12 = cls5.getMethod(str5, clsArr2);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                        }
                        java.lang.Object invoke2 = ((java.lang.reflect.Method) obj12).invoke(null, objArr16);
                        if (invoke != null) {
                            java.lang.Object[] objArr18 = new java.lang.Object[2];
                            objArr18[i8] = 42;
                            objArr18[0] = invoke;
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj13 == null) {
                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, 2593 - android.os.Process.getGidForName(""), (char) (android.os.Process.myPid() >> 22));
                                byte b7 = (byte) (-$$d[14]);
                                obj7 = invoke;
                                java.lang.Object[] objArr19 = new java.lang.Object[i8];
                                f(b7, (short) (b7 - 1), r9[16], objArr19);
                                java.lang.String str6 = (java.lang.String) objArr19[0];
                                java.lang.Class<?>[] clsArr3 = new java.lang.Class[2];
                                clsArr3[0] = java.lang.String.class;
                                clsArr3[i8] = java.lang.Integer.TYPE;
                                obj13 = cls6.getMethod(str6, clsArr3);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                            } else {
                                obj7 = invoke;
                            }
                            long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr18)).longValue();
                            long j11 = ~longValue2;
                            j = j9;
                            long j12 = ~(j11 | (-688162366));
                            long j13 = (((-445) * longValue2) - 306232252425L) + (((~(j11 | j)) | j12) * 446) + (((~((-688162366) | longValue2)) | (~(j11 | 688162365 | j7))) * 446) + (j12 * 446) + 568938159;
                            if (((((int) j13) & ((((~((-1594657551) | i10)) | (~((-1263083336) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 2091449223 + (((~((-4265026) | i10)) | (~((-335839241) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (j13 >> 32)) & ((((1450044349 | i10) * 1444) - 1153123274) + (((~(1604199670 | i)) | 6408969 | (~((-166973260) | i))) * (-1444)) + 1039999524))) == 477111747) {
                                str = "";
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    h(null, null, android.graphics.ImageFormat.getBitsPerPixel(0) + 128, "\u0087\u0081\u0083\u008d\u0092\u0095\u008a\u0096\u0096\u0086\u0095\u008d\u0085\u0094\u0085\u0093\u0092\u0092\u0090\u0088\u0091\u008b\u0091\u0090\u0087\u0088\u008d\u0090", objArr20);
                                    java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                                    java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj14 == null) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf(str, str), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3161, (char) (33099 - android.view.View.getDefaultSize(0, 0)));
                                        byte b8 = (byte) (-$$d[14]);
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        f(b8, (short) (b8 - 1), r6[16], objArr22);
                                        obj14 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj14);
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr21)).longValue();
                                    long j14 = ~longValue3;
                                    long j15 = (-688180806) | j14;
                                    long j16 = (((((131 * longValue3) + 88775323974L) + ((~((j14 | j) | (-688180806))) * 130)) + ((~j15) * (-260))) + (((~(longValue3 | 688180805)) | (~(j15 | j7))) * 130)) - 649487302;
                                    i2 = 0;
                                    equals = ((((int) (j16 >> 32)) & (((((-75564289) | i10) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1733560202) + (((~(958974054 | i10)) | (-631850275)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))) | (((int) j16) & (((((~(825486194 | i10)) | (~(611740215 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 330352683) + (((~((-285311297) | i10)) | (~((-71565318) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) == 1;
                                } else {
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    e("퍖鲄䲔㰭\uec7d屍උ\ufdea괻ᴂ쵐뺭滵", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20430, objArr23);
                                    java.lang.Object[] objArr24 = {((java.lang.String) objArr23[0]).intern()};
                                    java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj15 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.blue(0), 1920 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.text.TextUtils.indexOf(str, str));
                                        byte b9 = (byte) (-$$d[14]);
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        f(b9, (short) (b9 - 1), r6[16], objArr25);
                                        obj15 = cls8.getMethod((java.lang.String) objArr25[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj15);
                                    }
                                    java.lang.Object invoke3 = ((java.lang.reflect.Method) obj15).invoke(null, objArr24);
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    e("팕", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 20477, objArr26);
                                    i2 = 0;
                                    equals = invoke3.equals(((java.lang.String) objArr26[0]).intern());
                                }
                                if (equals) {
                                    int[] iArr = new int[1];
                                    int[] iArr2 = new int[1];
                                    iArr[i2] = i;
                                    iArr2[i2] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                    java.lang.Object[] objArr27 = {iArr, iArr2, null, new int[1]};
                                    java.lang.Object[] objArr28 = {-2012707582, 16, java.lang.Integer.valueOf(((r1 * 495) - 866817266) + (((~(245289299 | i10)) | 176718160) * 495))};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj16 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(str));
                                        byte b10 = $$d[14];
                                        byte b11 = (byte) (-b10);
                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                        f(b11, (short) (b11 | 652), (byte) (b10 + 1), objArr29);
                                        obj16 = cls9.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                    }
                                    ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr28)).intValue();
                                    return objArr27;
                                }
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                e("퍅\ueacbꁐ翚㕣쳶訟䆚", 14731 - android.graphics.drawable.Drawable.resolveOpacity(i2, i2), objArr30);
                                java.lang.String intern2 = ((java.lang.String) objArr30[i2]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                h(null, null, 127 - android.graphics.Color.green(i2), "\u0096\u008b\u0091\u0084\u0081\u008a", objArr31);
                                java.lang.String intern3 = ((java.lang.String) objArr31[i2]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                e("퍀㔚ῷ憮䨍곉뚲", 58963 - android.text.TextUtils.getTrimmedLength(str), objArr32);
                                java.lang.String intern4 = ((java.lang.String) objArr32[i2]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                e("퍃线袸\udaaa撽뚭삨ኸ벮", 44543 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr33);
                                java.lang.String intern5 = ((java.lang.String) objArr33[i2]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0091\u0092\u0087\u0092\u0085\u0091", objArr34);
                                java.lang.String intern6 = ((java.lang.String) objArr34[i2]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                e("퍍\uea37ꆷ缧㛽찱讯䄭ᢹ혦\uede8ꬉ抛", 14717 - android.graphics.Color.red(i2), objArr35);
                                java.lang.String intern7 = ((java.lang.String) objArr35[i2]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                h(null, null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0084\u0082\u0088\u0082\u0091", objArr36);
                                java.lang.String intern8 = ((java.lang.String) objArr36[i2]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                h(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0097\u008c\u0081\u008d\u0084\u0091", objArr37);
                                java.lang.String intern9 = ((java.lang.String) objArr37[i2]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                e("퍍ﳸ", android.os.Process.getGidForName(str) + 12204, objArr38);
                                java.lang.String intern10 = ((java.lang.String) objArr38[i2]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                h(null, null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0088\u0081\u008a\u0088\u008e\u0083\u0088\u008e\u0091\u008e\u0081\u008d\u0084\u0096\u0082\u0092", objArr39);
                                java.lang.String intern11 = ((java.lang.String) objArr39[i2]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                h(null, null, 127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0081\u0083\u0085\u0096\u008a\u0088\u0096\u0082\u0092", objArr40);
                                java.lang.String intern12 = ((java.lang.String) objArr40[i2]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0093\u008b\u008a\u0081\u0087\u0082\u0081\u0084", objArr41);
                                java.lang.String intern13 = ((java.lang.String) objArr41[i2]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                e("퍔㝝᭝罣䍫ꝼ謊\uef05\uf319휤㬾Ἱ", android.graphics.Color.blue(i2) + 58379, objArr42);
                                java.lang.String intern14 = ((java.lang.String) objArr42[i2]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                e("퍔픑\udfc5솗쩛차\uf6e2\uf8b9\ue179\ueb38\ued96陊頄苓", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1607, objArr43);
                                java.lang.String intern15 = ((java.lang.String) objArr43[i2]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                e("퍖\u0aca恟忪땽\uecfd쨒", 55691 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr44);
                                java.lang.String intern16 = ((java.lang.String) objArr44[i2]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                h(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u008a\u0089\u0099\u0082\u0098\u008e", objArr45);
                                java.lang.String intern17 = ((java.lang.String) objArr45[i2]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                h(null, null, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0097\u008d\u0088\u0091\u0092\u009a\u008e", objArr46);
                                java.lang.String intern18 = ((java.lang.String) objArr46[i2]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                e("퍗～", 11273 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr47);
                                java.lang.String intern19 = ((java.lang.String) objArr47[i2]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                e("퍗⫍ⁿ㾁㔤㍪૽\u0006Ᾰᗉፙ櫷怗羾痙獶䪓䀬幀嗷", android.view.KeyEvent.getDeadChar(i2, i2) + 63901, objArr48);
                                java.lang.String intern20 = ((java.lang.String) objArr48[i2]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                e("퍗靫嬠ῴ쎫虦", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17467, objArr49);
                                java.lang.String intern21 = ((java.lang.String) objArr49[i2]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                e("퍗֒", 54980 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr50);
                                java.lang.String intern22 = ((java.lang.String) objArr50[i2]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                h(null, null, android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 127, "\u008e\u0086\u0088\u008a\u0088\u008e\u0094\u0081\u008d\u009b\u0091\u0088\u0091\u008b\u008a\u008e", objArr51);
                                java.lang.String intern23 = ((java.lang.String) objArr51[i2]).intern();
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                h(null, null, ((android.os.Process.getThreadPriority(i2) + 20) >> 6) + 127, "\u0098\u0088\u008a\u0084\u008d\u0087\u008a\u0081\u0088", objArr52);
                                java.lang.String intern24 = ((java.lang.String) objArr52[i2]).intern();
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                e("퍐\uf71b鯟뾠䉵曕ઋⵋ\uf124閧", android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 9293, objArr53);
                                java.lang.String intern25 = ((java.lang.String) objArr53[i2]).intern();
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                e("퍐ή䬃뜮\ue3cd⿹ᮙ䞤뉈ﹺ⩌", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 52259, objArr54);
                                java.lang.String intern26 = ((java.lang.String) objArr54[i2]).intern();
                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2) + 128, "\u0082\u008c\u008b\u0091\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr55);
                                java.lang.String intern27 = ((java.lang.String) objArr55[i2]).intern();
                                java.lang.Object[] objArr56 = new java.lang.Object[1];
                                h(null, null, android.view.Gravity.getAbsoluteGravity(i2, i2) + 127, "\u0082\u008c\u008b\u0091\u009c\u0096\u008d\u0081\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr56);
                                java.lang.String intern28 = ((java.lang.String) objArr56[i2]).intern();
                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                h(null, null, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u008e\u0092\u0082\u0095\u0089\u008f\u008e\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr57);
                                java.lang.String[] strArr3 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr57[i2]).intern()};
                                java.lang.Object[] objArr58 = new java.lang.Object[1];
                                e("퍖귐⸼ꢝ⤩꩑ⓢꕮ➝ꀥ⅏", android.text.TextUtils.indexOf(str, str, i2, i2) + 32411, objArr58);
                                java.lang.Object[] objArr59 = {((java.lang.String) objArr58[i2]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 40, android.widget.ExpandableListView.getPackedPositionType(0L) + 1921, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                    byte b12 = (byte) (-$$d[14]);
                                    java.lang.Object[] objArr60 = new java.lang.Object[1];
                                    f(b12, (short) (b12 - 1), r7[16], objArr60);
                                    obj2 = cls10.getMethod((java.lang.String) objArr60[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr59);
                                if (str2 != null) {
                                    java.lang.Object[] objArr61 = new java.lang.Object[1];
                                    e("퍖泂걄\uedd2ⵐ滲", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49031, objArr61);
                                    int i12 = 0;
                                    java.lang.String intern29 = ((java.lang.String) objArr61[0]).intern();
                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                    e("퍃냸ᐮ\uf859嶎Ⅎ蕥檩", 25523 - android.view.View.MeasureSpec.getSize(0), objArr62);
                                    java.lang.String[] strArr4 = {intern29, ((java.lang.String) objArr62[0]).intern()};
                                    int i13 = 0;
                                    int i14 = 2;
                                    while (true) {
                                        if (i13 >= i14) {
                                            break;
                                        }
                                        if (str2.contains(strArr4[i13])) {
                                            java.lang.Object[] objArr63 = new java.lang.Object[1];
                                            h(null, null, ((android.os.Process.getThreadPriority(i12) + 20) >> 6) + 127, "\u0081\u008d\u0081\u0086\u0088\u0087\u008a\u008c\u0086\u008b\u008a\u0089\u0083\u0088\u0087\u0086\u0085\u0082\u0081\u0084\u0083\u0082\u0081", objArr63);
                                            java.lang.Object[] objArr64 = {((java.lang.String) objArr63[i12]).intern()};
                                            java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj17 == null) {
                                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 41, 1921 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                byte b13 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                f(b13, (short) (b13 - 1), r7[16], objArr65);
                                                obj17 = cls11.getMethod((java.lang.String) objArr65[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                            }
                                            java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr64);
                                            java.lang.Object[] objArr66 = new java.lang.Object[1];
                                            h(null, null, 126 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0081\u008d\u0081\u0086\u0088\u0087\u008a\u008c\u0086\u008b\u008a\u0089\u0083\u0089\u008d\u0088\u008e\u008f\u008e\u0083\u0088\u0087\u0086\u0085\u0082\u0081\u0084\u0083\u0082\u0081", objArr66);
                                            java.lang.Object[] objArr67 = {((java.lang.String) objArr66[0]).intern()};
                                            java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj18 == null) {
                                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, 1921 - android.text.TextUtils.getOffsetAfter(str, 0), (char) android.text.TextUtils.indexOf(str, str));
                                                byte b14 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr68 = new java.lang.Object[1];
                                                f(b14, (short) (b14 - 1), r8[16], objArr68);
                                                obj18 = cls12.getMethod((java.lang.String) objArr68[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                            }
                                            java.lang.Object invoke5 = ((java.lang.reflect.Method) obj18).invoke(null, objArr67);
                                            if (invoke4 != null) {
                                                java.lang.Object[] objArr69 = {invoke4, 42};
                                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                if (obj19 == null) {
                                                    java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28, 2593 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                    byte b15 = (byte) (-$$d[14]);
                                                    java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                    f(b15, (short) (b15 - 1), r7[16], objArr70);
                                                    obj19 = cls13.getMethod((java.lang.String) objArr70[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                }
                                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr69)).longValue();
                                                long j17 = ~longValue4;
                                                long j18 = ~(j | 14810832 | longValue4);
                                                strArr = strArr3;
                                                long j19 = (471 * longValue4) + 6975901872L + ((longValue4 | 14810832) * (-470)) + (((~(j17 | j7)) | (~((-14810833) | j17)) | j18) * (-470)) + ((j18 | (~(14810832 | j17 | j7))) * 470) + 1242289692;
                                            } else {
                                                strArr = strArr3;
                                            }
                                            if (invoke5 != null) {
                                                int i15 = getDualTapResetTimeout + 97;
                                                getCvmResetTimeout = i15 % 128;
                                                if (i15 % 2 != 0) {
                                                    java.lang.Object[] objArr71 = {invoke5, 105};
                                                    java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj20 == null) {
                                                        java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0, 0) + 28, 2595 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                        byte b16 = (byte) (-$$d[14]);
                                                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                                                        f(b16, (short) (b16 - 1), r5[16], objArr72);
                                                        obj20 = cls14.getMethod((java.lang.String) objArr72[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                                    }
                                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr71)).longValue();
                                                    long j20 = 960197120 | longValue5;
                                                    long j21 = (829 * longValue5) + 796003412480L + (((~(j | 960197120 | longValue5)) | (~((~longValue5) | (-960197121)))) * (-828)) + ((j20 | j) * (-828)) + ((~j20) * 828) + 296903404;
                                                    if (((((int) (j21 >> 32)) & (((((~((-704816705) | i)) | (~(732409706 | i))) * 69) - 963186772) + (((~((-732341859) | i)) | 27525154 | (~(704884552 | i))) * (-69)) + 4681512)) | (((int) j21) & (((~((-5341193) | i10)) * (-783)) + 1903883542 + (((~((-377350873) | i10)) | 1059875537) * 783)))) == 477111747) {
                                                        int i16 = 0;
                                                        int i17 = 0;
                                                        while (i16 < 28) {
                                                            java.lang.String str7 = strArr[i16];
                                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                            h(null, null, 127 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "\u0090\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr73);
                                                            java.lang.Object[] objArr74 = {((java.lang.String) objArr73[0]).intern().concat(java.lang.String.valueOf(str7))};
                                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                            if (obj21 == null) {
                                                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter(str, 0) + 36, 3161 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.view.View.MeasureSpec.getSize(0) + 33099));
                                                                byte b17 = (byte) ($$d[14] + 1);
                                                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                                                f(b17, (short) (b17 | 618), r7[16], objArr75);
                                                                obj21 = cls15.getMethod((java.lang.String) objArr75[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj21);
                                                            }
                                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr74)).longValue();
                                                            long j22 = ~longValue6;
                                                            int i18 = i16;
                                                            long j23 = ~(j22 | j7);
                                                            java.lang.String[] strArr5 = strArr;
                                                            long j24 = (longValue6 * 246) + 112199343988L + (((~(j22 | (-459833377))) | (~(j22 | j))) * (-245)) + ((-245) * j23) + ((j23 | (-459833377)) * 245) + 1367304115;
                                                            i17 += ((((int) (j24 >> 32)) & (((((~((-1224758409) | i10)) * 433) + (-1264776030)) + (((~((-110428434) | i)) | (-1326797978)) * (-433))) + (((~((-1326797978) | i)) | (-1335186842)) * 433))) | (((int) j24) & (((((889577632 | i) * (-859)) + (-229338914)) + (((~(889577632 | i10)) | (~((-889569441) | i))) * 859)) + (((~((-1968163254) | i10)) | 1078593813) * 859)))) == 0 ? 0 : 1;
                                                            i16 = i18 + 1;
                                                            strArr = strArr5;
                                                        }
                                                        if (i17 >= 25.2d) {
                                                            java.lang.Object[] objArr76 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                            java.lang.Object[] objArr77 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-1011225531) | i10)) | (-301900011)) * (-602)) - 1209648157) + (((~(i | (-1011225531))) | 738202384 | (~((-28876865) | i10))) * (-301)) + ((~((-301900011) | i10)) * 301))};
                                                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj22 == null) {
                                                                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getOffsetAfter(str, 0), 2713 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (char) android.view.View.combineMeasuredStates(0, 0));
                                                                byte b18 = $$d[14];
                                                                byte b19 = (byte) (-b18);
                                                                java.lang.Object[] objArr78 = new java.lang.Object[1];
                                                                f(b19, (short) (b19 | 652), (byte) (b18 + 1), objArr78);
                                                                obj22 = cls16.getMethod((java.lang.String) objArr78[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                            }
                                                            ((int[]) objArr76[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr77)).intValue();
                                                            return objArr76;
                                                        }
                                                    }
                                                } else {
                                                    java.lang.Object[] objArr79 = {invoke5, 42};
                                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj23 == null) {
                                                        java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, 2594 - android.view.KeyEvent.keyCodeFromString(str), (char) android.graphics.Color.alpha(0));
                                                        byte b20 = (byte) (-$$d[14]);
                                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                        f(b20, (short) (b20 - 1), r5[16], objArr80);
                                                        obj23 = cls17.getMethod((java.lang.String) objArr80[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj23);
                                                    }
                                                    long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr79)).longValue();
                                                    long j25 = ~longValue7;
                                                    long j26 = ~(j | (-351354370));
                                                    long j27 = (713 * longValue7) + 249812957070L + (((~(j25 | (-351354370))) | j26) * (-712)) + (((~(j25 | j | (-351354370))) | (~(longValue7 | (-351354370) | j7))) * (-712)) + ((j25 | j26) * 712) + 1608454894;
                                                    int i19 = ~((-2056390710) | i);
                                                }
                                            }
                                        } else {
                                            i13++;
                                            i14 = 2;
                                            i12 = 0;
                                        }
                                    }
                                }
                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 21059, objArr81);
                                java.lang.Object[] objArr82 = {((java.lang.String) objArr81[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str, 0) + 29, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 2807, (char) android.text.TextUtils.indexOf(str, str, 0));
                                    byte b21 = (byte) (-$$d[14]);
                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                    f(b21, (short) (b21 - 1), r6[16], objArr83);
                                    obj3 = cls18.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr82)).longValue();
                                long j28 = ((-271) * longValue8) + 54581774247L + (((~((-199933240) | (~longValue8) | j)) | (~(199933239 | longValue8 | j7))) * (-272)) + (((~((-199933240) | longValue8)) | (~((-199933240) | j7))) * (-272)) + ((longValue8 | (~(199933239 | j7))) * 272) + 1090606828;
                                j2 = (((int) (j28 >> 32)) & ((((~((-1515364929) | i10)) | 78138517 | (~((-632053150) | i))) * (-68)) + 444256962 + ((~((-553914633) | i10)) * (-68)) + (((~(632053149 | i10)) | (-2069279561)) * 68))) | (((int) j28) & (((((~((-139151214) | i)) | 16705) * (-140)) - 957526597) + ((~((-139134509) | i)) * 70) + (((~((-1298075197) | i)) | 1158957393) * 70)));
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                e("팋\u0d99滌伬ꡳ褊\ueb99쓚┠ٷ有䆘ꋌ茬ﱦ\udd52㾇", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 57037, objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2807, (char) android.view.View.getDefaultSize(0, 0));
                                    byte b22 = (byte) (-$$d[14]);
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    f(b22, (short) (b22 - 1), r8[16], objArr86);
                                    obj4 = cls19.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr85)).longValue();
                                long j29 = j | 402386206;
                                long j30 = ~longValue9;
                                long j31 = j30 | j;
                                long j32 = ((-183) * longValue9) + 73636675881L + (((~(j31 | (-402386207))) | (~(j29 | longValue9))) * (-184)) + (((~j31) | (~(402386206 | j30)) | (~j29)) * 184) + (((-402386207) | longValue9) * 184) + 1692926274;
                                long j33 = (((int) j32) & ((((~(1033885093 | i10)) | (~((-605098113) | i)) | (~((-25445666) | i))) * 765) + 133876962 + (((~(428786981 | i10)) | (-1033885094)) * 1530) + (((~(428786981 | i)) | (~((-25445666) | i10))) * 765))) | (((int) (j32 >> 32)) & (((((~((-267925883) | i)) | (~((-1705152294) | i10))) * 959) - 959133175) + (((~((-1705152294) | i)) | (~((-267925883) | i10))) * 959)));
                                if (j2 <= 0 && j33 > 0 && j33 - 3 < j2) {
                                    java.lang.Object[] objArr87 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                    int i20 = ~(422853615 | i10);
                                    java.lang.Object[] objArr88 = {-2012707582, 16, java.lang.Integer.valueOf(((136579343 | i20) * (-970)) + 1534132453 + ((i20 | 286274272) * 970))};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj24 == null) {
                                        java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('b' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2712 - android.view.MotionEvent.axisFromString(str), (char) (android.os.Process.myPid() >> 22));
                                        byte b23 = $$d[14];
                                        byte b24 = (byte) (-b23);
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        f(b24, (short) (b24 | 652), (byte) (b23 + 1), objArr89);
                                        obj24 = cls20.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj24);
                                    }
                                    ((int[]) objArr87[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj24).invoke(null, objArr88)).intValue();
                                    return objArr87;
                                }
                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", 21059 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr90);
                                java.lang.Object[] objArr91 = {((java.lang.String) objArr90[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                    java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 29, android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2759, (char) android.text.TextUtils.getOffsetAfter(str, 0));
                                    byte b25 = (byte) (-$$d[14]);
                                    java.lang.Object[] objArr92 = new java.lang.Object[1];
                                    f(b25, (short) (b25 - 1), r6[16], objArr92);
                                    obj5 = cls21.getMethod((java.lang.String) objArr92[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr91)).longValue();
                                long j34 = ((334 * longValue10) - 404190022231L) + (((~(j | (-1217439828))) | (~(longValue10 | j7))) * 333) + (((~(j | longValue10)) | (~(j7 | (-1217439828)))) * 333) + 73100240;
                                j3 = (((int) (j34 >> 32)) & ((((~((-1445748804) | i)) | (~((-156336421) | i10))) * 497) + 1377888435 + (((~(164858812 | i10)) | (-1610607616) | (~((-156336421) | i))) * 497))) | (((int) j34) & ((((~((-1489049787) | i10)) | (-1368691100) | (~(1489049786 | i))) * (-564)) + 2020563617 + ((~((-18120962) | i)) * 1128) + (((~((-1368691100) | i10)) | (-1507170748)) * 564)));
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                h(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u009d\u008d\u0085\u0090", objArr93);
                                java.lang.Object[] objArr94 = {((java.lang.String) objArr93[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), android.text.TextUtils.indexOf(str, str, 0, 0) + 2807, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                    byte b26 = (byte) (-$$d[14]);
                                    java.lang.Object[] objArr95 = new java.lang.Object[1];
                                    f(b26, (short) (b26 - 1), r8[16], objArr95);
                                    obj6 = cls22.getMethod((java.lang.String) objArr95[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                }
                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr94)).longValue();
                                long j35 = ~longValue11;
                                long j36 = ~(j | 483664983);
                                long j37 = ((713 * longValue11) - 343885802913L) + (((~(j35 | 483664983)) | j36) * (-712)) + (((~(j35 | j | 483664983)) | (~(longValue11 | 483664983 | j7))) * (-712)) + ((j35 | j36) * 712) + 806875084;
                                long j38 = (((int) (j37 >> 32)) & (((~(182787541 | i10)) * (-560)) + 266548650 + ((~((-1073750529) | i)) * (-560)) + (((~(1254438869 | i10)) | 2099200) * 560))) | (((int) j37) & ((((731919918 | i10) * (-757)) - 58365688) + ((~((-1410678786) | i)) * 1514) + (((~((-2125820968) | i10)) | 715142182 | (~(2142598703 | i))) * 757)));
                                if (j3 <= 0 && j38 > 0 && j38 + 100 < j3) {
                                    java.lang.Object[] objArr96 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr97 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-17260548) | i10)) | (~(434597583 | i))) * (-302)) + 1508768177 + ((~((-17260548) | i)) * (-604)) + (((~(i | 417337036)) | 142609100) * 302))};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj25 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2713, (char) (android.os.Process.myTid() >> 22));
                                        byte b27 = $$d[14];
                                        byte b28 = (byte) (-b27);
                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                        f(b28, (short) (b28 | 652), (byte) (b27 + 1), objArr98);
                                        obj25 = cls23.getMethod((java.lang.String) objArr98[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                    }
                                    ((int[]) objArr96[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr97)).intValue();
                                    return objArr96;
                                }
                                java.lang.Object[] objArr99 = new java.lang.Object[1];
                                h(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr99);
                                java.lang.String intern30 = ((java.lang.String) objArr99[0]).intern();
                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr100);
                                java.lang.String intern31 = ((java.lang.String) objArr100[0]).intern();
                                java.lang.Object[] objArr101 = new java.lang.Object[1];
                                h(null, null, 127 - android.text.TextUtils.getTrimmedLength(str), "\u008b\u0091\u0095\u008e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr101);
                                java.lang.String intern32 = ((java.lang.String) objArr101[0]).intern();
                                java.lang.Object[] objArr102 = new java.lang.Object[1];
                                h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008b\u0091\u0095\u009e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr102);
                                java.lang.String intern33 = ((java.lang.String) objArr102[0]).intern();
                                java.lang.Object[] objArr103 = new java.lang.Object[1];
                                e("팋䢙\ue4d7+뱬\ud9bc疔醆ഞꥮ욤", 39883 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr103);
                                java.lang.String intern34 = ((java.lang.String) objArr103[0]).intern();
                                java.lang.Object[] objArr104 = new java.lang.Object[1];
                                h(null, null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u008b\u0091\u0095\u008e\u0090", objArr104);
                                java.lang.String intern35 = ((java.lang.String) objArr104[0]).intern();
                                java.lang.Object[] objArr105 = new java.lang.Object[1];
                                h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0087\u0088\u008d\u0090", objArr105);
                                java.lang.String[] strArr6 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr105[0]).intern()};
                                i3 = 0;
                                while (true) {
                                    if (i3 < 7) {
                                        i4 = 0;
                                        break;
                                    }
                                    java.lang.Object[] objArr106 = {strArr6[i3]};
                                    java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                    if (obj26 == null) {
                                        java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1672, (char) (47940 - android.text.TextUtils.getTrimmedLength(str)));
                                        byte b29 = (byte) (-$$d[14]);
                                        java.lang.Object[] objArr107 = new java.lang.Object[1];
                                        f(b29, (short) (b29 - 1), r8[16], objArr107);
                                        obj26 = cls24.getMethod((java.lang.String) objArr107[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj26);
                                    }
                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr106)).longValue();
                                    long j39 = (((((421 * longValue12) + 582491428460L) + ((~(longValue12 | j7)) * 420)) + ((1390194339 | longValue12) * (-420))) + (((~(j | longValue12)) | (~((~longValue12) | 1390194339))) * 420)) - 235335842;
                                    int i21 = (~(605710562 | i)) | 1506055693;
                                    if (((((int) (j39 >> 32)) & ((i21 * 992) + 1537498186 + ((i21 | (~((-68829283) | i10))) * (-496)) + ((2042936973 | i) * 496))) | (((int) j39) & ((((((~((-1299146534) | i)) | 1281770272) * 1504) + 1320243365) + ((~((-17376262) | i)) * (-1504))) - 2099642960))) != 0) {
                                        int i22 = getDualTapResetTimeout + 69;
                                        getCvmResetTimeout = i22 % 128;
                                        i4 = i22 % 2 != 0 ? i3 >> 58 : i3 + 90;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (i4 == 0) {
                                    java.lang.Object[] objArr108 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                    java.lang.Object[] objArr109 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-248833055) | i10)) | (-460492466) | (~(248833054 | i))) * (-564)) + 1592502003 + ((~(i | (-287443618))) * 1128) + (((~((-460492466) | i10)) | (-536276672)) * 564))};
                                    java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj27 == null) {
                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                                        byte b30 = $$d[14];
                                        byte b31 = (byte) (-b30);
                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                        f(b31, (short) (b31 | 652), (byte) (b30 + 1), objArr110);
                                        obj27 = cls25.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj27);
                                    }
                                    ((int[]) objArr108[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj27).invoke(null, objArr109)).intValue();
                                    return objArr108;
                                }
                                try {
                                    objArr = new java.lang.Object[1];
                                    h(null, null, 127 - android.graphics.Color.alpha(0), "\u0088\u008e\u0082\u0098\u0083\u0085\u0092\u0091\u0086\u0095\u0083\u0082\u0081", objArr);
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    java.lang.Object[] objArr111 = {((java.lang.String) objArr[0]).intern()};
                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj28 == null) {
                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myTid() >> 22), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 1921, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                        byte b32 = (byte) (-$$d[14]);
                                        java.lang.Object[] objArr112 = new java.lang.Object[1];
                                        f(b32, (short) (b32 - 1), r6[16], objArr112);
                                        obj28 = cls26.getMethod((java.lang.String) objArr112[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                    }
                                    java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj28).invoke(null, objArr111);
                                    try {
                                        if (str8 != null) {
                                            java.lang.Object[] objArr113 = new java.lang.Object[1];
                                            h(null, null, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0085\u0082\u0089\u008b\u008d\u0096\u0082\u008b\u008a\u008f\u0087", objArr113);
                                            java.lang.String[] strArr7 = {((java.lang.String) objArr113[0]).intern()};
                                            for (int i23 = 0; i23 <= 0; i23++) {
                                                if (!str8.contains(strArr7[i23])) {
                                                }
                                            }
                                            i5 = 0;
                                            if (i5 != 0) {
                                                java.lang.Object[] objArr114 = {new int[]{i}, new int[]{i5 ^ i}, null, new int[1]};
                                                java.lang.Object[] objArr115 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-764981081) | i10)) | (-55655561)) * (-602)) - 104512739) + (((~(i | (-764981081))) | 747144016 | (~((-37818497) | i10))) * (-301)) + ((~((-55655561) | i10)) * 301))};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj29 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.View.MeasureSpec.getMode(0) + 2713, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                    byte b33 = $$d[14];
                                                    byte b34 = (byte) (-b33);
                                                    java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                    f(b34, (short) (b34 | 652), (byte) (b33 + 1), objArr116);
                                                    obj29 = cls27.getMethod((java.lang.String) objArr116[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj29);
                                                }
                                                ((int[]) objArr114[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj29).invoke(null, objArr115)).intValue();
                                                return objArr114;
                                            }
                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                            h(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u0088\u008e\u0082\u0098\u0083\u0085\u0092\u0091\u0086\u0095\u0083\u0082\u0081", objArr117);
                                            java.lang.Object[] objArr118 = {((java.lang.String) objArr117[0]).intern()};
                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                            if (obj30 == null) {
                                                java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0) + 40, 1921 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.view.View.MeasureSpec.getSize(0));
                                                byte b35 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                f(b35, (short) (b35 - 1), r6[16], objArr119);
                                                obj30 = cls28.getMethod((java.lang.String) objArr119[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj30);
                                            }
                                            java.lang.Object invoke6 = ((java.lang.reflect.Method) obj30).invoke(null, objArr118);
                                            if (invoke6 != null) {
                                                java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                h(null, null, 127 - android.graphics.Color.green(0), "\u0085\u0082\u0089\u008b\u008d\u0096\u0082\u008b\u008a\u008f\u0087", objArr120);
                                                java.lang.Object[] objArr121 = {invoke6, new java.lang.String[]{((java.lang.String) objArr120[0]).intern()}};
                                                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                if (obj31 == null) {
                                                    java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.KeyEvent.getMaxKeyCode() >> 16) + 43, 2880 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                                    byte b36 = (byte) (-$$d[14]);
                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                    f(b36, (short) (b36 - 1), r6[16], objArr122);
                                                    obj31 = cls29.getMethod((java.lang.String) objArr122[0], java.lang.String.class, java.lang.String[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj31);
                                                }
                                                long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj31).invoke(null, objArr121)).longValue();
                                                long j40 = ~longValue13;
                                                long j41 = ~(j | longValue13);
                                                long j42 = (((((971 * longValue13) + 2149931761054L) + (((~((-1108783786) | j40)) | j41) * (-970))) + ((~(longValue13 | 1108783785)) * 1940)) + (((~(1108783785 | j40)) | j41) * 970)) - 919927993;
                                                if (((((int) (j42 >> 32)) & ((((((-1615005716) | i10) * (-490)) - 1288550654) + (((~((-1952910744) | i)) | 337905028) * 490)) - 717747784)) | (((int) j42) & ((((-900281590) | i10) * 1324) + 818885255 + (((~((-606680245) | i)) | (~((-830546166) | i))) * (-1324)) + 10772502))) != 1) {
                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                    e("팋ﶓ軣弩栉㤔쮺钎ꗟ瘮ݶ퀚", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 11987, objArr123);
                                                    java.lang.String intern36 = ((java.lang.String) objArr123[0]).intern();
                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                    e("팋副턛僝ퟹ因푒嬂\uda3f姢\ud89e帎\udd72尮쏘䋊", 33071 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr124);
                                                    java.lang.String intern37 = ((java.lang.String) objArr124[0]).intern();
                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                    h(null, null, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u0090\u008b\u0091\u0095\u009e\u0090\u0092\u008a\u0087\u0082\u0092\u0090\u008a\u0088\u008a\u0085\u0090", objArr125);
                                                    java.lang.String intern38 = ((java.lang.String) objArr125[0]).intern();
                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                    h(null, null, 127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0090\u008b\u0091\u0095\u008e\u0090", objArr126);
                                                    java.lang.String intern39 = ((java.lang.String) objArr126[0]).intern();
                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                    h(null, null, android.widget.ExpandableListView.getPackedPositionType(0L) + 127, "\u0090\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr127);
                                                    java.lang.String intern40 = ((java.lang.String) objArr127[0]).intern();
                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                    e("팋\ued16꿟榔⩔\ue404ꛏ惌ⅎ\ue304뷀翀㠆兀듒皟㜛", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 15937, objArr128);
                                                    java.lang.String intern41 = ((java.lang.String) objArr128[0]).intern();
                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                    h(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0090\u008d\u008c\u008a\u008e\u0092\u0091\u008a\u008c\u0090\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr129);
                                                    java.lang.String intern42 = ((java.lang.String) objArr129[0]).intern();
                                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                    e("팋\ud89c쓋\uf036ﱼ\ue9b6開膆贏륣ꛥ勥廂䨂癐揮", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 3019, objArr130);
                                                    java.lang.String intern43 = ((java.lang.String) objArr130[0]).intern();
                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                    e("팋䦔\ue6db̞로횎珛\ue85eՉꎌ\ud8c8番鉷ࢦꖣ숧罱閲㋶꽰쑪抴龉㓕元", android.os.Process.getGidForName(str) + 39620, objArr131);
                                                    java.lang.String intern44 = ((java.lang.String) objArr131[0]).intern();
                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                    e("팋\ud88a쓧\uf0c0ﰤ\ue810鑧耀趴릃ꗯ儵嵗", 3037 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr132);
                                                    java.lang.String intern45 = ((java.lang.String) objArr132[0]).intern();
                                                    java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                    e("팋踨榥쬽ꛯ\u001b\ue39b崅㣃", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23929, objArr133);
                                                    java.lang.String intern46 = ((java.lang.String) objArr133[0]).intern();
                                                    java.lang.Object[] objArr134 = new java.lang.Object[1];
                                                    h(null, null, 126 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "\u0090\u008b\u0091\u0095\u0090\u0086\u008e\u0090", objArr134);
                                                    java.lang.String[] strArr8 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr134[0]).intern()};
                                                    for (int i24 = 0; i24 < 12; i24++) {
                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                        sb.append(strArr8[i24]);
                                                        java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                        e("퍗֒", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 54979, objArr135);
                                                        sb.append(((java.lang.String) objArr135[0]).intern());
                                                        java.lang.Object[] objArr136 = {sb.toString()};
                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                        if (obj32 == null) {
                                                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 3162 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 33100));
                                                            byte b37 = (byte) (-$$d[14]);
                                                            java.lang.Object[] objArr137 = new java.lang.Object[1];
                                                            f(b37, (short) (b37 - 1), r8[16], objArr137);
                                                            obj32 = cls30.getMethod((java.lang.String) objArr137[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj32);
                                                        }
                                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr136)).longValue();
                                                        long j43 = ~longValue14;
                                                        long j44 = ((((((-493) * longValue14) - 382518528975L) + (((-772764705) | j43) * (-988))) + (((772764704 | longValue14) | j) * 494)) + (((~(longValue14 | (-772764705))) | ((~(j43 | 772764704)) | (~(j | longValue14)))) * 494)) - 564903403;
                                                        if (((((int) (j44 >> 32)) & ((((~(1585870927 | i10)) | (-1271869958)) * (-235)) + 1641286966 + (((~(1585870927 | i)) | (-1271869958)) * (-470)) + (((~((-21561857) | i)) | 335562826) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) j44) & ((((((~((-91279978) | i10)) | android.R.raw.nodomain) | (~((-1528506388) | i10))) * (-397)) - 1114039135) + (((-1584134779) | i) * 397)))) != 0) {
                                                            i6 = i24 + 110;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            i6 = 0;
                                            if (i6 != 0) {
                                                getCvmResetTimeout = (getDualTapResetTimeout + 103) % 128;
                                                java.lang.Object[] objArr138 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                                java.lang.Object[] objArr139 = {-2012707582, 16, java.lang.Integer.valueOf((((((~(i | 71390965)) | 713591040) | (~((-4265521) | i10))) * 886) - 12645937) + (((~((-71390966) | i10)) | 780716485) * (-1772)) + ((~(780716485 | i10)) * 886))};
                                                java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj33 == null) {
                                                    java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1));
                                                    byte b38 = $$d[14];
                                                    byte b39 = (byte) (-b38);
                                                    java.lang.Object[] objArr140 = new java.lang.Object[1];
                                                    f(b39, (short) (b39 | 652), (byte) (b38 + 1), objArr140);
                                                    obj33 = cls31.getMethod((java.lang.String) objArr140[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                }
                                                ((int[]) objArr138[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr139)).intValue();
                                                return objArr138;
                                            }
                                            long[] jArr = {472001035};
                                            java.lang.Object[] objArr141 = new java.lang.Object[1];
                                            h(null, null, 127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u008e\u0088\u008b\u0086\u0082\u0089\u0090\u008c\u0092\u008d\u008e\u0090\u0087\u0082\u0081\u0084\u0090", objArr141);
                                            try {
                                                bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr141[0]).intern()));
                                                j5 = 0;
                                            } catch (java.io.IOException unused2) {
                                                bufferedInputStream2 = null;
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                bufferedInputStream = null;
                                            }
                                            while (true) {
                                                try {
                                                    int read = bufferedInputStream2.read();
                                                    if (read != -1) {
                                                        j5 = ((j5 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                        for (int i25 = 0; i25 <= 0; i25++) {
                                                            if (j5 == jArr[i25]) {
                                                                int i26 = i25 + 1;
                                                                try {
                                                                    bufferedInputStream2.close();
                                                                } catch (java.lang.Exception unused3) {
                                                                }
                                                                if (i26 != 0) {
                                                                    i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (java.io.IOException unused4) {
                                                } catch (java.lang.Throwable th4) {
                                                    th = th4;
                                                    bufferedInputStream = bufferedInputStream2;
                                                    if (bufferedInputStream == null) {
                                                        throw th;
                                                    }
                                                    try {
                                                        bufferedInputStream.close();
                                                        throw th;
                                                    } catch (java.lang.Exception unused5) {
                                                        throw th;
                                                    }
                                                }
                                                try {
                                                    bufferedInputStream2.close();
                                                    break;
                                                } catch (java.lang.Exception unused6) {
                                                }
                                            }
                                            getCvmResetTimeout = (getDualTapResetTimeout + 105) % 128;
                                            i7 = 0;
                                            if (i7 != 0) {
                                                java.lang.Object[] objArr142 = {new int[]{i}, new int[]{i ^ i7}, null, new int[1]};
                                                java.lang.Object[] objArr143 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-270794923) | i10)) * (-783)) - 112756028) + (((~(227671573 | i10)) | (-481653947)) * 783))};
                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj34 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 49, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2712, (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                                    byte b40 = $$d[14];
                                                    byte b41 = (byte) (-b40);
                                                    java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                    f(b41, (short) (b41 | 652), (byte) (b40 + 1), objArr144);
                                                    obj34 = cls32.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                }
                                                ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr143)).intValue();
                                                return objArr142;
                                            }
                                            long[] jArr2 = {472001035};
                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                            h(null, null, 127 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), "\u008f\u0087\u0091\u0092\u0082\u0084\u0090\u009e\u0086\u008b\u0091\u0092\u008d\u008e\u0090\u008e\u008c\u0090\u008e\u008f\u008e\u0090", objArr145);
                                            try {
                                                bufferedInputStream3 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr145[0]).intern()));
                                                j4 = 0;
                                            } catch (java.io.IOException unused7) {
                                                bufferedInputStream3 = null;
                                            } catch (java.lang.Throwable th5) {
                                                th2 = th5;
                                                bufferedInputStream3 = null;
                                            }
                                            while (true) {
                                                try {
                                                    int read2 = bufferedInputStream3.read();
                                                    if (read2 != -1) {
                                                        j4 = ((j4 << 5) ^ read2) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                        for (int i27 = 0; i27 <= 0; i27++) {
                                                            if (j4 == jArr2[i27]) {
                                                                int i28 = i27 + 1;
                                                                try {
                                                                    bufferedInputStream3.close();
                                                                } catch (java.lang.Exception unused8) {
                                                                }
                                                                if (i28 != 0) {
                                                                    java.lang.Object[] objArr146 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                    java.lang.Object[] objArr147 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-10316938) | i)) | (-700411600)) * (-502)) - 1416496591) + ((~((-1403018) | i10)) * (-502)) + (((~(i | (-699008583))) | (-10316938)) * 502))};
                                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj35 == null) {
                                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                                        byte b42 = $$d[14];
                                                                        byte b43 = (byte) (-b42);
                                                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                        f(b43, (short) (b43 | 652), (byte) (b42 + 1), objArr148);
                                                                        obj35 = cls33.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                                    }
                                                                    ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr147)).intValue();
                                                                    return objArr146;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } catch (java.io.IOException unused9) {
                                                } catch (java.lang.Throwable th6) {
                                                    th2 = th6;
                                                    if (bufferedInputStream3 == null) {
                                                        throw th2;
                                                    }
                                                    try {
                                                        bufferedInputStream3.close();
                                                        throw th2;
                                                    } catch (java.lang.Exception unused10) {
                                                        throw th2;
                                                    }
                                                }
                                                try {
                                                    bufferedInputStream3.close();
                                                    break;
                                                } catch (java.lang.Exception unused11) {
                                                }
                                            }
                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                            if (obj36 == null) {
                                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.text.TextUtils.indexOf(str, str, 0), android.view.Gravity.getAbsoluteGravity(0, 0) + 1890, (char) (android.view.View.combineMeasuredStates(0, 0) + 3600));
                                                byte b44 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                f(b44, (short) (b44 - 1), r6[16], objArr149);
                                                obj36 = cls34.getMethod((java.lang.String) objArr149[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj36);
                                            }
                                            long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, null)).longValue();
                                            long j45 = ~longValue15;
                                            long j46 = ((((((-756) * longValue15) - 1158664638286L) + ((j | (-1528581317)) * (-757))) + ((~(((-1528581317) | j45) | j7)) * 1514)) + (((~((longValue15 | (-1528581317)) | j7)) | ((~(j45 | j)) | (~(1528581316 | j45)))) * 757)) - 350667063;
                                            if (((((int) (j46 >> 32)) & ((((~((-437773313) | i)) | (~(999453098 | i10))) * (-1808)) + 484840794 + (((~(999814570 | i10)) | (~((-437411841) | i))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~((-999453099) | i)) | 361472 | (~(437773312 | i10))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) | (((int) j46) & ((((((~(1034276265 | i)) | (~((-402950145) | i))) * 69) + 80408146) + ((((~(956599464 | i)) | 77676801) | (~((-480626946) | i))) * (-69))) - 452902584))) != 0) {
                                                java.lang.Object[] objArr150 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i7}, null, new int[1]};
                                                java.lang.Object[] objArr151 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-558837407) | i)) | 150488113) * (-366)) - 1858256465) + (((~(i | (-554117775))) | 145768481) * 366))};
                                                java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj37 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                                                    byte b45 = $$d[14];
                                                    byte b46 = (byte) (-b45);
                                                    java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                    f(b46, (short) (b46 | 652), (byte) (b45 + 1), objArr152);
                                                    obj37 = cls35.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                }
                                                ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr151)).intValue();
                                                return objArr150;
                                            }
                                            java.lang.Object[] objArr153 = {2};
                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                            if (obj38 == null) {
                                                java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str, 0) + 27, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2364, (char) android.graphics.Color.alpha(0));
                                                byte b47 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                f(b47, (short) (b47 - 1), r6[16], objArr154);
                                                obj38 = cls36.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj38);
                                            }
                                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr153)).longValue();
                                            long j47 = ~longValue16;
                                            long j48 = ((-756) * longValue16) + 1065689950086L + ((j | 1405923417) * (-757)) + ((~(1405923417 | j47 | j7)) * 1514) + (((~(longValue16 | 1405923417 | j7)) | (~(j47 | (-1405923418))) | (~(j47 | j))) * 757) + 1986782;
                                            int i29 = (int) (j48 >> 32);
                                            int i30 = ~(721181599 | i);
                                            if (((i29 & (((1426129952 | i30) * (-280)) + 2021606834 + ((i30 | (~(2136559285 | i))) * 140) + (((~(2147311551 | i)) | (~((-1426129953) | i10)) | (~((-10752267) | i10))) * 140))) | (((int) j48) & ((((-2125856735) | i10) * (-192)) + 1788176917 + (((~((-679868381) | i10)) | 8761944) * (-384)) + (((~((-8761945) | i)) | (~((-671106437) | i10)) | (~((-1445988355) | i))) * 192)))) == 2) {
                                                java.lang.Object[] objArr155 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                                java.lang.Object[] objArr156 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-526465) | i10)) | (~((-707788880) | i10))) * (-184)) - 957551097) + (((~((-1031553) | i10)) | 505088 | (~((-708293968) | i10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 1573940424)};
                                                java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj39 == null) {
                                                    java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) android.graphics.Color.red(0));
                                                    byte b48 = $$d[14];
                                                    byte b49 = (byte) (-b48);
                                                    java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                    f(b49, (short) (b49 | 652), (byte) (b48 + 1), objArr157);
                                                    obj39 = cls37.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                }
                                                ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr156)).intValue();
                                                return objArr155;
                                            }
                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                            if (obj40 == null) {
                                                java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3198, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                byte[] bArr = $$d;
                                                byte b50 = (byte) (bArr[14] + 1);
                                                java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                f(b50, (short) (b50 | 612), (byte) (-bArr[21]), objArr158);
                                                obj40 = cls38.getMethod((java.lang.String) objArr158[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj40);
                                            }
                                            long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                            long j49 = ((530 * longValue17) - 1040065240912L) + (((~(j | (-1962387249))) | (~((-1962387249) | longValue17))) * 529) + (((~longValue17) | (~(j7 | (-1962387249)))) * 529) + 2058632610;
                                            if (((((int) (j49 >> 32)) & ((((~((-1786431123) | i)) | (-2125117046)) * 398) + 576536498 + (((~((-1786431123) | i10)) | (-2125117046)) * 398))) | (((int) j49) & ((((((~((-858435008) | i)) | (~(1999305878 | i10))) | r6) * (-516)) - 1716076295) + (((~((-858434711) | i)) | (~((-1140871169) | i10))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((~(858435007 | i10)) | 1140871168) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) != 0) {
                                                java.lang.Object[] objArr159 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr160 = {-2012707582, 16, java.lang.Integer.valueOf((((((~((-168020250) | i10)) | 231696) | (~((-541305271) | i10))) * (-1136)) - 120705513) + (((~((-168020250) | i)) | (~((-541305271) | i)) | (~(709093823 | i10))) * (-568)) + (((~(i | (-231697))) | (~(168020249 | i10)) | (~(541305270 | i10))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                                java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj41 == null) {
                                                    java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                    byte b51 = $$d[14];
                                                    byte b52 = (byte) (-b51);
                                                    java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                    f(b52, (short) (b52 | 652), (byte) (b51 + 1), objArr161);
                                                    obj41 = cls39.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                }
                                                ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr160)).intValue();
                                                return objArr159;
                                            }
                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                            if (obj42 == null) {
                                                java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getOffsetBefore(str, 0) + 3197, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                byte b53 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                f(b53, (short) (b53 - 1), r5[16], objArr162);
                                                obj42 = cls40.getMethod((java.lang.String) objArr162[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj42);
                                            }
                                            long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                            long j50 = ((-219) * longValue18) + 3923965942L + (((~((-17755503) | (~longValue18))) | (~(j | 17755502 | longValue18))) * 220) + (((~(j | longValue18)) | 17755502) * (-440)) + ((longValue18 | 17755502 | j7) * 220) + 935114388;
                                            if (((((int) (j50 >> 32)) & (((((-269551651) | i) * (-676)) - 1673292542) + (((~((-1024547000) | i10)) | 269551650) * 676) + (((~(1833193885 | i10)) | (-2102745536) | (~((-754995350) | i))) * 676))) | (((int) j50) & ((((696273025 | r6) * (-476)) - 1722116415) + ((~((-2097413) | i)) * 952) + ((~((-2097413) | i10)) * 476)))) != 0) {
                                                java.lang.Object[] objArr163 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                int i31 = ~(i | (-28905473));
                                                java.lang.Object[] objArr164 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-742584053) | i10)) | 738230992 | i31) * (-502)) + 1934096047 + ((i31 | (~((-4353061) | i10))) * 502))};
                                                java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj43 == null) {
                                                    java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, 2713 - android.view.View.resolveSize(0, 0), (char) android.view.KeyEvent.keyCodeFromString(str));
                                                    byte b54 = $$d[14];
                                                    byte b55 = (byte) (-b54);
                                                    java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                    f(b55, (short) (b55 | 652), (byte) (b54 + 1), objArr165);
                                                    obj43 = cls41.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                }
                                                ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr164)).intValue();
                                                return objArr163;
                                            }
                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                            if (obj44 == null) {
                                                java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.MeasureSpec.getMode(0) + 2836, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                byte b56 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                f(b56, (short) (b56 - 1), r5[16], objArr166);
                                                obj44 = cls42.getMethod((java.lang.String) objArr166[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj44);
                                            }
                                            long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, null)).longValue();
                                            long j51 = longValue19 | j7;
                                            long j52 = ((((((-929) * longValue19) - 371105517536L) + (((-799796375) | (~j51)) * (-465))) + ((longValue19 | (~(j7 | (-799796375)))) * 930)) + (((-799796375) | j51) * 465)) - 1606091129;
                                            int i32 = (int) (j52 >> 32);
                                            int i33 = ~((-10829825) | i);
                                            if (((i32 & ((((~(1392339625 | i10)) | 83891458 | i33) * (-713)) + 1990563900 + (i33 * 1426) + ((~(1465401259 | i10)) * 713))) | (((int) j52) & ((((~((-1104197494) | i10)) | 1753543392) * 226) + 2055568080 + (((~((-1753543393) | i)) | 671367296 | (~((-22021398) | i10))) * (-113)) + ((~((-1104197494) | i)) * 113)))) != 0) {
                                                java.lang.Object[] objArr167 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                int i34 = ~(529767602 | i10);
                                                java.lang.Object[] objArr168 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-179557918) | i10)) | 177443856 | (~((-529767603) | i10)) | (~(531881663 | i))) * (-84)) + 163126971 + (((~(i | (-529767603))) | 179557917 | i34) * (-84)) + (((-531881664) | i34) * 84))};
                                                java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj45 == null) {
                                                    java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, 2712 - android.view.MotionEvent.axisFromString(str), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                    byte b57 = $$d[14];
                                                    byte b58 = (byte) (-b57);
                                                    java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                    f(b58, (short) (b58 | 652), (byte) (b57 + 1), objArr169);
                                                    obj45 = cls43.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                }
                                                ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr168)).intValue();
                                                return objArr167;
                                            }
                                            long[] jArr3 = {624887784092251L};
                                            java.lang.Object[] objArr170 = new java.lang.Object[1];
                                            h(null, null, 126 - android.widget.ExpandableListView.getPackedPositionChild(0L), "\u008e\u0088\u008b\u0086\u0082\u0089\u0090\u008c\u0092\u008d\u008e\u0090\u0087\u0082\u0081\u0084\u0090", objArr170);
                                            java.lang.Object[] objArr171 = {((java.lang.String) objArr170[0]).intern(), 3, 2251799813685247L, jArr3};
                                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                            if (obj46 == null) {
                                                java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(38 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 3096 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                byte b59 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                f(b59, (short) (b59 - 1), r5[16], objArr172);
                                                obj46 = cls44.getMethod((java.lang.String) objArr172[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj46);
                                            }
                                            long j53 = ~((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr171)).longValue();
                                            long j54 = j53 | j;
                                            long j55 = (((((r4 * (-49)) - 48064961475L) + ((j7 | (-942450225)) * (-50))) + (((~((942450224 | j53) | j7)) | (~((-942450225) | j54))) * 50)) + ((((~(j53 | (-942450225))) | (~j54)) | (~(j | (-942450225)))) * 50)) - 968197685;
                                            if (((((int) j55) & (((~((-402861374) | i)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 1823578621 + ((i10 | (-1298)) * (-216)) + (((~((-402861374) | i10)) | (-1034365037)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | (((int) (j55 >> 32)) & ((((((~((-1432179984) | i)) | 5046283) | (~(1432180127 | i10))) * 886) - 106552156) + (((~(1432179983 | i10)) | 5046427) * (-1772)) + ((~(5046427 | i10)) * 886)))) != 0) {
                                                getDualTapResetTimeout = (getCvmResetTimeout + 99) % 128;
                                                java.lang.Object[] objArr173 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr174 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-346030373) | i10)) | (~(536867327 | i))) * 988) + 1687675167 + (((~(i | (-518488565))) | 172458192 | (~(536867327 | i10))) * 988))};
                                                java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj47 == null) {
                                                    java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str, 0) + 50, ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 2714, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                    byte b60 = $$d[14];
                                                    byte b61 = (byte) (-b60);
                                                    java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                    f(b61, (short) (b61 | 652), (byte) (b60 + 1), objArr175);
                                                    obj47 = cls45.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                }
                                                ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr174)).intValue();
                                                return objArr173;
                                            }
                                            java.lang.Object[] objArr176 = new java.lang.Object[1];
                                            h(null, null, 126 - android.view.MotionEvent.axisFromString(str), "\u0093\u008e\u0091\u0096\u008f\u009b\u0090\u009d\u008d\u0085\u0090", objArr176);
                                            java.lang.Object[] objArr177 = {((java.lang.String) objArr176[0]).intern()};
                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                            if (obj48 == null) {
                                                java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777180) - android.graphics.Color.rgb(0, 0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3161, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33099));
                                                byte b62 = (byte) ($$d[14] + 1);
                                                java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                f(b62, (short) (b62 | 618), r6[16], objArr178);
                                                obj48 = cls46.getMethod((java.lang.String) objArr178[0], java.lang.String.class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj48);
                                            }
                                            long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr177)).longValue();
                                            long j56 = ~longValue20;
                                            long j57 = ~(j | (-700524654) | longValue20);
                                            long j58 = ((471 * longValue20) - 329947112034L) + ((longValue20 | (-700524654)) * (-470)) + (((~(700524653 | j56)) | (~(j56 | j7)) | j57) * (-470)) + (((~((-700524654) | j56 | j7)) | j57) * 470) + 1607995392;
                                            if (((((int) (j58 >> 32)) & ((((~((-1342177281) | i10)) | (~(1437160286 | i))) * 988) + 725826302 + (((~((-1342243405) | i)) | 66124 | (~(1437160286 | i10))) * 988))) | (((int) j58) & (((~(2147417774 | i10)) * 130) + 1267367211 + (((~(2147417774 | i)) | 705970180) * 130)))) != 0) {
                                                java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr180 = {-2012707582, 16, java.lang.Integer.valueOf((((~((-180425009) | i10)) | 889750528) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1313594899 + (((~((-183581492) | i10)) | 892907011) * (-440)) + ((i | (-180425009)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                                java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj49 == null) {
                                                    java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, 2713 - android.view.View.getDefaultSize(0, 0), (char) android.text.TextUtils.indexOf(str, str, 0));
                                                    byte b63 = $$d[14];
                                                    byte b64 = (byte) (-b63);
                                                    java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                    f(b64, (short) (b64 | 652), (byte) (b63 + 1), objArr181);
                                                    obj49 = cls47.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                }
                                                ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr180)).intValue();
                                                return objArr179;
                                            }
                                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                            if (obj50 == null) {
                                                java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 28, 2186 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 59513));
                                                byte b65 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                f(b65, (short) (b65 - 1), r5[16], objArr182);
                                                obj50 = cls48.getMethod((java.lang.String) objArr182[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj50);
                                            }
                                            long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                            long j59 = longValue21 | j7;
                                            long j60 = ((((((-929) * longValue21) - 288392503552L) + (((-621535569) | (~j59)) * (-465))) + ((longValue21 | (~(j7 | (-621535569)))) * 930)) + (((-621535569) | j59) * 465)) - 1493626154;
                                            if (((((int) (j60 >> 32)) & ((((~(761106742 | i10)) | (-2113771839) | (~(2096634142 | i10))) * (-1136)) + 1738041050 + (((~(761106742 | i)) | (~(2096634142 | i)) | (~((-743969047) | i10))) * (-568)) + (((~((-761106743) | i10)) | (~((-2096634143) | i10)) | (~(2113771838 | i))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))) | (((int) j60) & ((((-365600787) | i10) * (-369)) + 802172634 + (((~(499889558 | i10)) | (-937336852)) * (-369)) + (((~((-499889559) | i)) | 134288772 | (~((-571736066) | i10))) * 369)))) != 0) {
                                                java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr184 = {-2012707582, 16, java.lang.Integer.valueOf(((287784963 | i) * 988) + 601092855 + (((~(1034901763 | i10)) | (-1072693044)) * (-1976)) + (((~(i | 325576243)) | 287784963 | (~((-325576244) | i10))) * 988))};
                                                java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj51 == null) {
                                                    java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myTid() >> 22), 2713 - android.text.TextUtils.getOffsetAfter(str, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                    byte b66 = $$d[14];
                                                    byte b67 = (byte) (-b66);
                                                    java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                    f(b67, (short) (b67 | 652), (byte) (b66 + 1), objArr185);
                                                    obj51 = cls49.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                                }
                                                ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr184)).intValue();
                                                return objArr183;
                                            }
                                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                            if (obj52 == null) {
                                                java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 2972 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                byte b68 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                f(b68, (short) (b68 - 1), r5[16], objArr186);
                                                obj52 = cls50.getMethod((java.lang.String) objArr186[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj52);
                                            }
                                            long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                            long j61 = ~(970248844 | longValue22);
                                            long j62 = ~longValue22;
                                            long j63 = ~((-970248845) | j62);
                                            long j64 = (((((longValue22 * 263) + 507440145935L) + (((~(j62 | j7)) | (j61 | j63)) * 262)) + ((-786) * j63)) + ((((~(j62 | j)) | j61) | j63) * 262)) - 882452919;
                                            if (((((int) (j64 >> 32)) & (((~(485595301 | i)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1347378638 + (((~(485595301 | i10)) | 414226437) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))) | (((int) j64) & (((1789810262 | i10) * 1444) + 1153123995 + (((~((-1617819306) | i)) | 1613518336 | (~(180592895 | i))) * (-1444)) + 542146210))) != 0) {
                                                java.lang.Object[] objArr187 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                int i35 = (~((-44998827) | i)) | 42500128;
                                                java.lang.Object[] objArr188 = {-2012707582, 16, java.lang.Integer.valueOf((i35 * 992) + 1071186367 + ((i35 | (~(666825391 | i10))) * (-496)) + ((i | 664326693) * 496))};
                                                java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj53 == null) {
                                                    java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str, str, 0, 0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.os.Process.myTid() >> 22));
                                                    byte b69 = $$d[14];
                                                    byte b70 = (byte) (-b69);
                                                    java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                    f(b70, (short) (b70 | 652), (byte) (b69 + 1), objArr189);
                                                    obj53 = cls51.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                                }
                                                ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr188)).intValue();
                                                return objArr187;
                                            }
                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                            if (obj54 == null) {
                                                java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 26, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2158, (char) (56400 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                                byte b71 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                f(b71, (short) (b71 - 1), r5[16], objArr190);
                                                obj54 = cls52.getMethod((java.lang.String) objArr190[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj54);
                                            }
                                            long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                            long j65 = ((((192 * longValue23) - 111044906439L) + (((~(longValue23 | j7)) | 584446877) * 191)) + (((~(longValue23 | (-584446878))) | (~(j | longValue23))) * 191)) - 1150264897;
                                            int i36 = ~((-508702719) | i);
                                            int i37 = ~((-377208347) | i);
                                            if (((((int) (j65 >> 32)) & (((((~((-928523693) | i10)) | i36) * 1150) - 334238508) + ((i36 | (~(508702718 | i10))) * (-575)) + (((~((-928523693) | i)) | (~(928523692 | i10))) * 575))) | (((((~(377208346 | i)) | (-1065336736) | (~(1060018063 | i))) * (-880)) + 818884229 + (((~(377208346 | i10)) | (-1060018064) | i37) * (-880)) + (i37 * 880)) & ((int) j65))) != 0) {
                                                getDualTapResetTimeout = (getCvmResetTimeout + 9) % 128;
                                                java.lang.Object[] objArr191 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                java.lang.Object[] objArr192 = {-2012707582, 16, java.lang.Integer.valueOf((((~(243474876 | i10)) | (~((-952800397) | i)) | (~(952800396 | i10))) * 959) + 1248135822 + (((~(i | 243474876)) | (~((-952800397) | i10)) | (~(952800396 | i))) * 959))};
                                                java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj55 == null) {
                                                    java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                                    byte b72 = $$d[14];
                                                    byte b73 = (byte) (-b72);
                                                    java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                    f(b73, (short) (b73 | 652), (byte) (b72 + 1), objArr193);
                                                    obj55 = cls53.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                                }
                                                ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr192)).intValue();
                                                return objArr191;
                                            }
                                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                            if (obj56 == null) {
                                                java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.blue(0) + 838, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                                byte b74 = (byte) (-$$d[14]);
                                                java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                f(b74, (short) (b74 - 1), r5[16], objArr194);
                                                obj56 = cls54.getMethod((java.lang.String) objArr194[0], null);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj56);
                                            }
                                            long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj56).invoke(null, null)).longValue();
                                            long j66 = ~longValue24;
                                            long j67 = ((-282) * longValue24) + 554049185008L + (((~(longValue24 | (-1950877413))) | (~(j7 | (-1950877413)))) * (-283)) + ((~(1950877412 | j66)) * 283) + ((~((-1950877413) | j66 | j7)) * 283) + 9875490;
                                            int i38 = ~((-279581625) | i);
                                            int i39 = ((((int) (j67 >> 32)) & ((((((~((-279581625) | i10)) | 279581192) * (-245)) + 1060116520) + (i38 * (-245))) + ((i38 | 1157644786) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE))) | (((int) j67) & ((((((~((-1073817898) | i10)) | (~((-2654337) | i10))) * (-184)) + 1019428157) + ((((~(183031424 | i10)) | (-1256849322)) | (~(1254194985 | i10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) + 1170353992))) != 0 ? i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : i;
                                            if (i39 != i) {
                                                java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i39}, null, new int[1]};
                                                java.lang.Object[] objArr196 = {-2012707582, 16, java.lang.Integer.valueOf(((((~((-9846787) | i10)) | (~(402577855 | i))) * (-302)) - 809096939) + ((~((-9846787) | i)) * (-604)) + (((~(i | 392731069)) | 85983405) * 302))};
                                                java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj57 == null) {
                                                    java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                                                    byte b75 = $$d[14];
                                                    byte b76 = (byte) (-b75);
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    f(b76, (short) (b76 | 652), (byte) (b75 + 1), objArr197);
                                                    obj57 = cls55.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj57);
                                                }
                                                ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr196)).intValue();
                                                java.lang.Object[] objArr198 = {objArr195};
                                                java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                if (obj58 == null) {
                                                    java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 3237 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                                    byte b77 = $$d[14];
                                                    byte b78 = (byte) (-b77);
                                                    java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                    f(b78, (short) (b78 | 652), (byte) (b77 + 1), objArr199);
                                                    obj58 = cls56.getMethod((java.lang.String) objArr199[0], java.lang.Object[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj58);
                                                }
                                                ((java.lang.reflect.Method) obj58).invoke(obj, objArr198);
                                                return objArr195;
                                            }
                                            java.lang.Object[] objArr200 = {java.lang.Integer.valueOf(i), obj, -2012707582, 0};
                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                            if (obj59 == null) {
                                                obj59 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3289, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 52, 3236 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj59);
                                            }
                                            java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj59).newInstance(objArr200);
                                            try {
                                                java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                h(null, null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0085\u008a\u008d\u0081\u0098¥\u0083\u0096\u008b\u008a\u0092\u0083\u008a\u009d\u008a¤", objArr201);
                                                java.lang.Class<?> cls57 = java.lang.Class.forName(((java.lang.String) objArr201[0]).intern());
                                                java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                e("퍗堇엫煓︌", android.graphics.ImageFormat.getBitsPerPixel(0) + 35672, objArr202);
                                                cls57.getMethod(((java.lang.String) objArr202[0]).intern(), null).invoke(newInstance, null);
                                                java.lang.Object[] objArr203 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                java.lang.Object[] objArr204 = {-2012707582, 0, java.lang.Integer.valueOf((((((-8483841) | i10) * (-490)) - 1837755839) + (((~(i | (-146896078))) | 138412237) * 490)) - 712520126)};
                                                java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj60 == null) {
                                                    java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 2713 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                    byte b79 = $$d[14];
                                                    byte b80 = (byte) (-b79);
                                                    java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                    f(b80, (short) (b80 | 652), (byte) (b79 + 1), objArr205);
                                                    obj60 = cls58.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                                }
                                                ((int[]) objArr203[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr204)).intValue();
                                                return objArr203;
                                            } catch (java.lang.Throwable th7) {
                                                java.lang.Throwable cause = th7.getCause();
                                                if (cause != null) {
                                                    throw cause;
                                                }
                                                throw th7;
                                            }
                                        }
                                        java.lang.Object[] objArr206 = {((java.lang.String) objArr2[0]).intern()};
                                        java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj61 == null) {
                                            java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 40, 1921 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            byte b81 = (byte) (-$$d[14]);
                                            java.lang.Object[] objArr207 = new java.lang.Object[1];
                                            f(b81, (short) (b81 - 1), r6[16], objArr207);
                                            obj61 = cls59.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                        }
                                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj61).invoke(null, objArr206);
                                        if (invoke7 != null) {
                                            java.lang.Object[] objArr208 = new java.lang.Object[1];
                                            e("퍖\udcf0찈ﶩ\uedc9鵯躅", android.os.Process.getGidForName(str) + androidx.media3.common.PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, objArr208);
                                            if (invoke7.equals(((java.lang.String) objArr208[0]).intern())) {
                                                java.lang.Object[] objArr209 = new java.lang.Object[1];
                                                h(null, null, android.os.Process.getGidForName(str) + 128, "\u008e\u008e\u008d\u0087\u0087\u008a\u009c\u0088\u0082\u0082\u0081\u0083\u008e\u008f\u008e\u0083\u0088\u008e\u0091\u008e\u0081\u008d\u0084", objArr209);
                                                try {
                                                    java.lang.Object[] objArr210 = {((java.lang.String) objArr209[0]).intern()};
                                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                    if (obj62 == null) {
                                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.graphics.Color.rgb(0, 0, 0) + 16779137, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                        byte b82 = (byte) (-$$d[14]);
                                                        java.lang.Object[] objArr211 = new java.lang.Object[1];
                                                        f(b82, (short) (b82 - 1), r6[16], objArr211);
                                                        obj62 = cls60.getMethod((java.lang.String) objArr211[0], java.lang.String.class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj62);
                                                    }
                                                    java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj62).invoke(null, objArr210);
                                                    if (str9 != null && (parseInt = java.lang.Integer.parseInt(str9)) != 0) {
                                                        i5 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                        if (i5 != 0) {
                                                        }
                                                    }
                                                } catch (java.lang.Throwable th8) {
                                                    java.lang.Throwable cause2 = th8.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th8;
                                                }
                                            }
                                        }
                                        i5 = 0;
                                        if (i5 != 0) {
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        java.lang.Throwable cause3 = th9.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th9;
                                    }
                                    objArr2 = new java.lang.Object[1];
                                    h(null, null, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, "\u008b\u0082\u0089\u008d\u008a\u0085\u009c\u0086\u008e\u0083\u0087\u009d\u008e\u0083\u0088\u0091\u008b\u0091", objArr2);
                                } catch (java.lang.Throwable th10) {
                                    java.lang.Throwable cause4 = th10.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th10;
                                }
                            }
                        } else {
                            j = j9;
                            obj7 = invoke;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr212 = {invoke2, 42};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj63 == null) {
                                java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2595, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0L)));
                                byte b83 = (byte) (-$$d[14]);
                                java.lang.Object[] objArr213 = new java.lang.Object[1];
                                f(b83, (short) (b83 - 1), r5[16], objArr213);
                                obj63 = cls61.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj63);
                            }
                            long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj63).invoke(null, objArr212)).longValue();
                            long j68 = ~longValue25;
                            str = "";
                            long j69 = j68 | 646660330;
                            long j70 = ((-496) * longValue25) + 320743524176L + ((~j69) * 497) + (((~(j69 | j7)) | (~(j68 | j | (-646660331)))) * 497) + (((~(j | 646660330)) | (~(longValue25 | 646660330)) | (~(j68 | (-646660331) | j7))) * 497) + 1903760855;
                            if (((((int) j70) & (((((~((-2007809514) | i10)) | 849914984) * 446) - 384374209) + (((~((-1157894530) | i)) | 16388) * 446) + 1104960816)) | (((int) (j70 >> 32)) & (((((~((-1729497628) | i10)) | 1125515289) * (-160)) - 1322207542) + (((~(1128243257 | i10)) | (-1729497628)) * 160)))) != 477111747) {
                            }
                            if (android.os.Build.VERSION.SDK_INT <= 33) {
                            }
                            if (equals) {
                            }
                            java.lang.Object[] objArr302 = new java.lang.Object[1];
                            e("퍅\ueacbꁐ翚㕣쳶訟䆚", 14731 - android.graphics.drawable.Drawable.resolveOpacity(i2, i2), objArr302);
                            java.lang.String intern210 = ((java.lang.String) objArr302[i2]).intern();
                            java.lang.Object[] objArr312 = new java.lang.Object[1];
                            h(null, null, 127 - android.graphics.Color.green(i2), "\u0096\u008b\u0091\u0084\u0081\u008a", objArr312);
                            java.lang.String intern310 = ((java.lang.String) objArr312[i2]).intern();
                            java.lang.Object[] objArr322 = new java.lang.Object[1];
                            e("퍀㔚ῷ憮䨍곉뚲", 58963 - android.text.TextUtils.getTrimmedLength(str), objArr322);
                            java.lang.String intern47 = ((java.lang.String) objArr322[i2]).intern();
                            java.lang.Object[] objArr332 = new java.lang.Object[1];
                            e("퍃线袸\udaaa撽뚭삨ኸ벮", 44543 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr332);
                            java.lang.String intern52 = ((java.lang.String) objArr332[i2]).intern();
                            java.lang.Object[] objArr342 = new java.lang.Object[1];
                            h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0091\u0092\u0087\u0092\u0085\u0091", objArr342);
                            java.lang.String intern62 = ((java.lang.String) objArr342[i2]).intern();
                            java.lang.Object[] objArr352 = new java.lang.Object[1];
                            e("퍍\uea37ꆷ缧㛽찱讯䄭ᢹ혦\uede8ꬉ抛", 14717 - android.graphics.Color.red(i2), objArr352);
                            java.lang.String intern72 = ((java.lang.String) objArr352[i2]).intern();
                            java.lang.Object[] objArr362 = new java.lang.Object[1];
                            h(null, null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0084\u0082\u0088\u0082\u0091", objArr362);
                            java.lang.String intern82 = ((java.lang.String) objArr362[i2]).intern();
                            java.lang.Object[] objArr372 = new java.lang.Object[1];
                            h(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0097\u008c\u0081\u008d\u0084\u0091", objArr372);
                            java.lang.String intern92 = ((java.lang.String) objArr372[i2]).intern();
                            java.lang.Object[] objArr382 = new java.lang.Object[1];
                            e("퍍ﳸ", android.os.Process.getGidForName(str) + 12204, objArr382);
                            java.lang.String intern102 = ((java.lang.String) objArr382[i2]).intern();
                            java.lang.Object[] objArr392 = new java.lang.Object[1];
                            h(null, null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0088\u0081\u008a\u0088\u008e\u0083\u0088\u008e\u0091\u008e\u0081\u008d\u0084\u0096\u0082\u0092", objArr392);
                            java.lang.String intern112 = ((java.lang.String) objArr392[i2]).intern();
                            java.lang.Object[] objArr402 = new java.lang.Object[1];
                            h(null, null, 127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0081\u0083\u0085\u0096\u008a\u0088\u0096\u0082\u0092", objArr402);
                            java.lang.String intern122 = ((java.lang.String) objArr402[i2]).intern();
                            java.lang.Object[] objArr412 = new java.lang.Object[1];
                            h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0093\u008b\u008a\u0081\u0087\u0082\u0081\u0084", objArr412);
                            java.lang.String intern132 = ((java.lang.String) objArr412[i2]).intern();
                            java.lang.Object[] objArr422 = new java.lang.Object[1];
                            e("퍔㝝᭝罣䍫ꝼ謊\uef05\uf319휤㬾Ἱ", android.graphics.Color.blue(i2) + 58379, objArr422);
                            java.lang.String intern142 = ((java.lang.String) objArr422[i2]).intern();
                            java.lang.Object[] objArr432 = new java.lang.Object[1];
                            e("퍔픑\udfc5솗쩛차\uf6e2\uf8b9\ue179\ueb38\ued96陊頄苓", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1607, objArr432);
                            java.lang.String intern152 = ((java.lang.String) objArr432[i2]).intern();
                            java.lang.Object[] objArr442 = new java.lang.Object[1];
                            e("퍖\u0aca恟忪땽\uecfd쨒", 55691 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr442);
                            java.lang.String intern162 = ((java.lang.String) objArr442[i2]).intern();
                            java.lang.Object[] objArr452 = new java.lang.Object[1];
                            h(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u008a\u0089\u0099\u0082\u0098\u008e", objArr452);
                            java.lang.String intern172 = ((java.lang.String) objArr452[i2]).intern();
                            java.lang.Object[] objArr462 = new java.lang.Object[1];
                            h(null, null, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0097\u008d\u0088\u0091\u0092\u009a\u008e", objArr462);
                            java.lang.String intern182 = ((java.lang.String) objArr462[i2]).intern();
                            java.lang.Object[] objArr472 = new java.lang.Object[1];
                            e("퍗～", 11273 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr472);
                            java.lang.String intern192 = ((java.lang.String) objArr472[i2]).intern();
                            java.lang.Object[] objArr482 = new java.lang.Object[1];
                            e("퍗⫍ⁿ㾁㔤㍪૽\u0006Ᾰᗉፙ櫷怗羾痙獶䪓䀬幀嗷", android.view.KeyEvent.getDeadChar(i2, i2) + 63901, objArr482);
                            java.lang.String intern202 = ((java.lang.String) objArr482[i2]).intern();
                            java.lang.Object[] objArr492 = new java.lang.Object[1];
                            e("퍗靫嬠ῴ쎫虦", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17467, objArr492);
                            java.lang.String intern212 = ((java.lang.String) objArr492[i2]).intern();
                            java.lang.Object[] objArr502 = new java.lang.Object[1];
                            e("퍗֒", 54980 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr502);
                            java.lang.String intern222 = ((java.lang.String) objArr502[i2]).intern();
                            java.lang.Object[] objArr512 = new java.lang.Object[1];
                            h(null, null, android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 127, "\u008e\u0086\u0088\u008a\u0088\u008e\u0094\u0081\u008d\u009b\u0091\u0088\u0091\u008b\u008a\u008e", objArr512);
                            java.lang.String intern232 = ((java.lang.String) objArr512[i2]).intern();
                            java.lang.Object[] objArr522 = new java.lang.Object[1];
                            h(null, null, ((android.os.Process.getThreadPriority(i2) + 20) >> 6) + 127, "\u0098\u0088\u008a\u0084\u008d\u0087\u008a\u0081\u0088", objArr522);
                            java.lang.String intern242 = ((java.lang.String) objArr522[i2]).intern();
                            java.lang.Object[] objArr532 = new java.lang.Object[1];
                            e("퍐\uf71b鯟뾠䉵曕ઋⵋ\uf124閧", android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 9293, objArr532);
                            java.lang.String intern252 = ((java.lang.String) objArr532[i2]).intern();
                            java.lang.Object[] objArr542 = new java.lang.Object[1];
                            e("퍐ή䬃뜮\ue3cd⿹ᮙ䞤뉈ﹺ⩌", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 52259, objArr542);
                            java.lang.String intern262 = ((java.lang.String) objArr542[i2]).intern();
                            java.lang.Object[] objArr552 = new java.lang.Object[1];
                            h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2) + 128, "\u0082\u008c\u008b\u0091\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr552);
                            java.lang.String intern272 = ((java.lang.String) objArr552[i2]).intern();
                            java.lang.Object[] objArr562 = new java.lang.Object[1];
                            h(null, null, android.view.Gravity.getAbsoluteGravity(i2, i2) + 127, "\u0082\u008c\u008b\u0091\u009c\u0096\u008d\u0081\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr562);
                            java.lang.String intern282 = ((java.lang.String) objArr562[i2]).intern();
                            java.lang.Object[] objArr572 = new java.lang.Object[1];
                            h(null, null, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u008e\u0092\u0082\u0095\u0089\u008f\u008e\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr572);
                            java.lang.String[] strArr32 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr572[i2]).intern()};
                            java.lang.Object[] objArr582 = new java.lang.Object[1];
                            e("퍖귐⸼ꢝ⤩꩑ⓢꕮ➝ꀥ⅏", android.text.TextUtils.indexOf(str, str, i2, i2) + 32411, objArr582);
                            java.lang.Object[] objArr592 = {((java.lang.String) objArr582[i2]).intern()};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj2 == null) {
                            }
                            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr592);
                            if (str2 != null) {
                            }
                            java.lang.Object[] objArr812 = new java.lang.Object[1];
                            e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 21059, objArr812);
                            java.lang.Object[] objArr822 = {((java.lang.String) objArr812[0]).intern()};
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj3 == null) {
                            }
                            long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr822)).longValue();
                            long j282 = ((-271) * longValue82) + 54581774247L + (((~((-199933240) | (~longValue82) | j)) | (~(199933239 | longValue82 | j7))) * (-272)) + (((~((-199933240) | longValue82)) | (~((-199933240) | j7))) * (-272)) + ((longValue82 | (~(199933239 | j7))) * 272) + 1090606828;
                            j2 = (((int) (j282 >> 32)) & ((((~((-1515364929) | i10)) | 78138517 | (~((-632053150) | i))) * (-68)) + 444256962 + ((~((-553914633) | i10)) * (-68)) + (((~(632053149 | i10)) | (-2069279561)) * 68))) | (((int) j282) & (((((~((-139151214) | i)) | 16705) * (-140)) - 957526597) + ((~((-139134509) | i)) * 70) + (((~((-1298075197) | i)) | 1158957393) * 70)));
                            java.lang.Object[] objArr842 = new java.lang.Object[1];
                            e("팋\u0d99滌伬ꡳ褊\ueb99쓚┠ٷ有䆘ꋌ茬ﱦ\udd52㾇", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 57037, objArr842);
                            java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj4 == null) {
                            }
                            long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr852)).longValue();
                            long j292 = j | 402386206;
                            long j302 = ~longValue92;
                            long j312 = j302 | j;
                            long j322 = ((-183) * longValue92) + 73636675881L + (((~(j312 | (-402386207))) | (~(j292 | longValue92))) * (-184)) + (((~j312) | (~(402386206 | j302)) | (~j292)) * 184) + (((-402386207) | longValue92) * 184) + 1692926274;
                            long j332 = (((int) j322) & ((((~(1033885093 | i10)) | (~((-605098113) | i)) | (~((-25445666) | i))) * 765) + 133876962 + (((~(428786981 | i10)) | (-1033885094)) * 1530) + (((~(428786981 | i)) | (~((-25445666) | i10))) * 765))) | (((int) (j322 >> 32)) & (((((~((-267925883) | i)) | (~((-1705152294) | i10))) * 959) - 959133175) + (((~((-1705152294) | i)) | (~((-267925883) | i10))) * 959)));
                            if (j2 <= 0) {
                            }
                            java.lang.Object[] objArr902 = new java.lang.Object[1];
                            e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", 21059 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr902);
                            java.lang.Object[] objArr912 = {((java.lang.String) objArr902[0]).intern()};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj5 == null) {
                            }
                            long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr912)).longValue();
                            long j342 = ((334 * longValue102) - 404190022231L) + (((~(j | (-1217439828))) | (~(longValue102 | j7))) * 333) + (((~(j | longValue102)) | (~(j7 | (-1217439828)))) * 333) + 73100240;
                            j3 = (((int) (j342 >> 32)) & ((((~((-1445748804) | i)) | (~((-156336421) | i10))) * 497) + 1377888435 + (((~(164858812 | i10)) | (-1610607616) | (~((-156336421) | i))) * 497))) | (((int) j342) & ((((~((-1489049787) | i10)) | (-1368691100) | (~(1489049786 | i))) * (-564)) + 2020563617 + ((~((-18120962) | i)) * 1128) + (((~((-1368691100) | i10)) | (-1507170748)) * 564)));
                            java.lang.Object[] objArr932 = new java.lang.Object[1];
                            h(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u009d\u008d\u0085\u0090", objArr932);
                            java.lang.Object[] objArr942 = {((java.lang.String) objArr932[0]).intern()};
                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj6 == null) {
                            }
                            long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr942)).longValue();
                            long j352 = ~longValue112;
                            long j362 = ~(j | 483664983);
                            long j372 = ((713 * longValue112) - 343885802913L) + (((~(j352 | 483664983)) | j362) * (-712)) + (((~(j352 | j | 483664983)) | (~(longValue112 | 483664983 | j7))) * (-712)) + ((j352 | j362) * 712) + 806875084;
                            long j382 = (((int) (j372 >> 32)) & (((~(182787541 | i10)) * (-560)) + 266548650 + ((~((-1073750529) | i)) * (-560)) + (((~(1254438869 | i10)) | 2099200) * 560))) | (((int) j372) & ((((731919918 | i10) * (-757)) - 58365688) + ((~((-1410678786) | i)) * 1514) + (((~((-2125820968) | i10)) | 715142182 | (~(2142598703 | i))) * 757)));
                            if (j3 <= 0) {
                            }
                            java.lang.Object[] objArr992 = new java.lang.Object[1];
                            h(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr992);
                            java.lang.String intern302 = ((java.lang.String) objArr992[0]).intern();
                            java.lang.Object[] objArr1002 = new java.lang.Object[1];
                            h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr1002);
                            java.lang.String intern312 = ((java.lang.String) objArr1002[0]).intern();
                            java.lang.Object[] objArr1012 = new java.lang.Object[1];
                            h(null, null, 127 - android.text.TextUtils.getTrimmedLength(str), "\u008b\u0091\u0095\u008e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr1012);
                            java.lang.String intern322 = ((java.lang.String) objArr1012[0]).intern();
                            java.lang.Object[] objArr1022 = new java.lang.Object[1];
                            h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008b\u0091\u0095\u009e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr1022);
                            java.lang.String intern332 = ((java.lang.String) objArr1022[0]).intern();
                            java.lang.Object[] objArr1032 = new java.lang.Object[1];
                            e("팋䢙\ue4d7+뱬\ud9bc疔醆ഞꥮ욤", 39883 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr1032);
                            java.lang.String intern342 = ((java.lang.String) objArr1032[0]).intern();
                            java.lang.Object[] objArr1042 = new java.lang.Object[1];
                            h(null, null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u008b\u0091\u0095\u008e\u0090", objArr1042);
                            java.lang.String intern352 = ((java.lang.String) objArr1042[0]).intern();
                            java.lang.Object[] objArr1052 = new java.lang.Object[1];
                            h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0087\u0088\u008d\u0090", objArr1052);
                            java.lang.String[] strArr62 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr1052[0]).intern()};
                            i3 = 0;
                            while (true) {
                                if (i3 < 7) {
                                }
                                i3++;
                            }
                            if (i4 == 0) {
                            }
                        } else {
                            str = "";
                        }
                        if (obj7 != null) {
                            java.lang.Object[] objArr214 = {obj7, 42};
                            java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj64 == null) {
                                java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionType(0L), 2594 - android.graphics.Color.green(0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                byte b84 = (byte) (-$$d[14]);
                                java.lang.Object[] objArr215 = new java.lang.Object[1];
                                f(b84, (short) (b84 - 1), r5[16], objArr215);
                                obj64 = cls62.getMethod((java.lang.String) objArr215[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                            }
                            long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr214)).longValue();
                            long j71 = ~longValue26;
                            long j72 = 303617230 | j71;
                            long j73 = ((-764) * longValue26) + 464230746199L + (((~(longValue26 | 303617230 | j7)) | (~(j72 | j)) | (~(j71 | (-303617231) | j7))) * 765) + (((~j72) | (~(j | 303617230))) * 1530) + (((~(303617230 | j7)) | (~(j71 | j | (-303617231)))) * 765) + 1560717755;
                        }
                        if (invoke2 != null) {
                            java.lang.Object[] objArr216 = {invoke2, 42};
                            java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj65 == null) {
                                java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString(str) + 28, 2594 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b85 = (byte) (-$$d[14]);
                                java.lang.Object[] objArr217 = new java.lang.Object[1];
                                f(b85, (short) (b85 - 1), r6[16], objArr217);
                                obj65 = cls63.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                            }
                            long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr216)).longValue();
                            long j74 = ((530 * longValue27) - 260309787792L) + (((~(j | (-491150545))) | (~((-491150545) | longValue27))) * 529) + (((~longValue27) | (~((-491150545) | j7))) * 529) + 1748251069;
                            int i40 = ~((-16814339) | i);
                        }
                        i2 = 0;
                        java.lang.Object[] objArr3022 = new java.lang.Object[1];
                        e("퍅\ueacbꁐ翚㕣쳶訟䆚", 14731 - android.graphics.drawable.Drawable.resolveOpacity(i2, i2), objArr3022);
                        java.lang.String intern2102 = ((java.lang.String) objArr3022[i2]).intern();
                        java.lang.Object[] objArr3122 = new java.lang.Object[1];
                        h(null, null, 127 - android.graphics.Color.green(i2), "\u0096\u008b\u0091\u0084\u0081\u008a", objArr3122);
                        java.lang.String intern3102 = ((java.lang.String) objArr3122[i2]).intern();
                        java.lang.Object[] objArr3222 = new java.lang.Object[1];
                        e("퍀㔚ῷ憮䨍곉뚲", 58963 - android.text.TextUtils.getTrimmedLength(str), objArr3222);
                        java.lang.String intern472 = ((java.lang.String) objArr3222[i2]).intern();
                        java.lang.Object[] objArr3322 = new java.lang.Object[1];
                        e("퍃线袸\udaaa撽뚭삨ኸ벮", 44543 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr3322);
                        java.lang.String intern522 = ((java.lang.String) objArr3322[i2]).intern();
                        java.lang.Object[] objArr3422 = new java.lang.Object[1];
                        h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0091\u0092\u0087\u0092\u0085\u0091", objArr3422);
                        java.lang.String intern622 = ((java.lang.String) objArr3422[i2]).intern();
                        java.lang.Object[] objArr3522 = new java.lang.Object[1];
                        e("퍍\uea37ꆷ缧㛽찱讯䄭ᢹ혦\uede8ꬉ抛", 14717 - android.graphics.Color.red(i2), objArr3522);
                        java.lang.String intern722 = ((java.lang.String) objArr3522[i2]).intern();
                        java.lang.Object[] objArr3622 = new java.lang.Object[1];
                        h(null, null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0084\u0082\u0088\u0082\u0091", objArr3622);
                        java.lang.String intern822 = ((java.lang.String) objArr3622[i2]).intern();
                        java.lang.Object[] objArr3722 = new java.lang.Object[1];
                        h(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0097\u008c\u0081\u008d\u0084\u0091", objArr3722);
                        java.lang.String intern922 = ((java.lang.String) objArr3722[i2]).intern();
                        java.lang.Object[] objArr3822 = new java.lang.Object[1];
                        e("퍍ﳸ", android.os.Process.getGidForName(str) + 12204, objArr3822);
                        java.lang.String intern1022 = ((java.lang.String) objArr3822[i2]).intern();
                        java.lang.Object[] objArr3922 = new java.lang.Object[1];
                        h(null, null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0088\u0081\u008a\u0088\u008e\u0083\u0088\u008e\u0091\u008e\u0081\u008d\u0084\u0096\u0082\u0092", objArr3922);
                        java.lang.String intern1122 = ((java.lang.String) objArr3922[i2]).intern();
                        java.lang.Object[] objArr4022 = new java.lang.Object[1];
                        h(null, null, 127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0081\u0083\u0085\u0096\u008a\u0088\u0096\u0082\u0092", objArr4022);
                        java.lang.String intern1222 = ((java.lang.String) objArr4022[i2]).intern();
                        java.lang.Object[] objArr4122 = new java.lang.Object[1];
                        h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0093\u008b\u008a\u0081\u0087\u0082\u0081\u0084", objArr4122);
                        java.lang.String intern1322 = ((java.lang.String) objArr4122[i2]).intern();
                        java.lang.Object[] objArr4222 = new java.lang.Object[1];
                        e("퍔㝝᭝罣䍫ꝼ謊\uef05\uf319휤㬾Ἱ", android.graphics.Color.blue(i2) + 58379, objArr4222);
                        java.lang.String intern1422 = ((java.lang.String) objArr4222[i2]).intern();
                        java.lang.Object[] objArr4322 = new java.lang.Object[1];
                        e("퍔픑\udfc5솗쩛차\uf6e2\uf8b9\ue179\ueb38\ued96陊頄苓", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1607, objArr4322);
                        java.lang.String intern1522 = ((java.lang.String) objArr4322[i2]).intern();
                        java.lang.Object[] objArr4422 = new java.lang.Object[1];
                        e("퍖\u0aca恟忪땽\uecfd쨒", 55691 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr4422);
                        java.lang.String intern1622 = ((java.lang.String) objArr4422[i2]).intern();
                        java.lang.Object[] objArr4522 = new java.lang.Object[1];
                        h(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u008a\u0089\u0099\u0082\u0098\u008e", objArr4522);
                        java.lang.String intern1722 = ((java.lang.String) objArr4522[i2]).intern();
                        java.lang.Object[] objArr4622 = new java.lang.Object[1];
                        h(null, null, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0097\u008d\u0088\u0091\u0092\u009a\u008e", objArr4622);
                        java.lang.String intern1822 = ((java.lang.String) objArr4622[i2]).intern();
                        java.lang.Object[] objArr4722 = new java.lang.Object[1];
                        e("퍗～", 11273 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr4722);
                        java.lang.String intern1922 = ((java.lang.String) objArr4722[i2]).intern();
                        java.lang.Object[] objArr4822 = new java.lang.Object[1];
                        e("퍗⫍ⁿ㾁㔤㍪૽\u0006Ᾰᗉፙ櫷怗羾痙獶䪓䀬幀嗷", android.view.KeyEvent.getDeadChar(i2, i2) + 63901, objArr4822);
                        java.lang.String intern2022 = ((java.lang.String) objArr4822[i2]).intern();
                        java.lang.Object[] objArr4922 = new java.lang.Object[1];
                        e("퍗靫嬠ῴ쎫虦", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17467, objArr4922);
                        java.lang.String intern2122 = ((java.lang.String) objArr4922[i2]).intern();
                        java.lang.Object[] objArr5022 = new java.lang.Object[1];
                        e("퍗֒", 54980 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr5022);
                        java.lang.String intern2222 = ((java.lang.String) objArr5022[i2]).intern();
                        java.lang.Object[] objArr5122 = new java.lang.Object[1];
                        h(null, null, android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 127, "\u008e\u0086\u0088\u008a\u0088\u008e\u0094\u0081\u008d\u009b\u0091\u0088\u0091\u008b\u008a\u008e", objArr5122);
                        java.lang.String intern2322 = ((java.lang.String) objArr5122[i2]).intern();
                        java.lang.Object[] objArr5222 = new java.lang.Object[1];
                        h(null, null, ((android.os.Process.getThreadPriority(i2) + 20) >> 6) + 127, "\u0098\u0088\u008a\u0084\u008d\u0087\u008a\u0081\u0088", objArr5222);
                        java.lang.String intern2422 = ((java.lang.String) objArr5222[i2]).intern();
                        java.lang.Object[] objArr5322 = new java.lang.Object[1];
                        e("퍐\uf71b鯟뾠䉵曕ઋⵋ\uf124閧", android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 9293, objArr5322);
                        java.lang.String intern2522 = ((java.lang.String) objArr5322[i2]).intern();
                        java.lang.Object[] objArr5422 = new java.lang.Object[1];
                        e("퍐ή䬃뜮\ue3cd⿹ᮙ䞤뉈ﹺ⩌", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 52259, objArr5422);
                        java.lang.String intern2622 = ((java.lang.String) objArr5422[i2]).intern();
                        java.lang.Object[] objArr5522 = new java.lang.Object[1];
                        h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2) + 128, "\u0082\u008c\u008b\u0091\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr5522);
                        java.lang.String intern2722 = ((java.lang.String) objArr5522[i2]).intern();
                        java.lang.Object[] objArr5622 = new java.lang.Object[1];
                        h(null, null, android.view.Gravity.getAbsoluteGravity(i2, i2) + 127, "\u0082\u008c\u008b\u0091\u009c\u0096\u008d\u0081\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr5622);
                        java.lang.String intern2822 = ((java.lang.String) objArr5622[i2]).intern();
                        java.lang.Object[] objArr5722 = new java.lang.Object[1];
                        h(null, null, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u008e\u0092\u0082\u0095\u0089\u008f\u008e\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr5722);
                        java.lang.String[] strArr322 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5722[i2]).intern()};
                        java.lang.Object[] objArr5822 = new java.lang.Object[1];
                        e("퍖귐⸼ꢝ⤩꩑ⓢꕮ➝ꀥ⅏", android.text.TextUtils.indexOf(str, str, i2, i2) + 32411, objArr5822);
                        java.lang.Object[] objArr5922 = {((java.lang.String) objArr5822[i2]).intern()};
                        obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj2 == null) {
                        }
                        str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5922);
                        if (str2 != null) {
                        }
                        java.lang.Object[] objArr8122 = new java.lang.Object[1];
                        e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 21059, objArr8122);
                        java.lang.Object[] objArr8222 = {((java.lang.String) objArr8122[0]).intern()};
                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj3 == null) {
                        }
                        long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr8222)).longValue();
                        long j2822 = ((-271) * longValue822) + 54581774247L + (((~((-199933240) | (~longValue822) | j)) | (~(199933239 | longValue822 | j7))) * (-272)) + (((~((-199933240) | longValue822)) | (~((-199933240) | j7))) * (-272)) + ((longValue822 | (~(199933239 | j7))) * 272) + 1090606828;
                        j2 = (((int) (j2822 >> 32)) & ((((~((-1515364929) | i10)) | 78138517 | (~((-632053150) | i))) * (-68)) + 444256962 + ((~((-553914633) | i10)) * (-68)) + (((~(632053149 | i10)) | (-2069279561)) * 68))) | (((int) j2822) & (((((~((-139151214) | i)) | 16705) * (-140)) - 957526597) + ((~((-139134509) | i)) * 70) + (((~((-1298075197) | i)) | 1158957393) * 70)));
                        java.lang.Object[] objArr8422 = new java.lang.Object[1];
                        e("팋\u0d99滌伬ꡳ褊\ueb99쓚┠ٷ有䆘ꋌ茬ﱦ\udd52㾇", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 57037, objArr8422);
                        java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj4 == null) {
                        }
                        long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr8522)).longValue();
                        long j2922 = j | 402386206;
                        long j3022 = ~longValue922;
                        long j3122 = j3022 | j;
                        long j3222 = ((-183) * longValue922) + 73636675881L + (((~(j3122 | (-402386207))) | (~(j2922 | longValue922))) * (-184)) + (((~j3122) | (~(402386206 | j3022)) | (~j2922)) * 184) + (((-402386207) | longValue922) * 184) + 1692926274;
                        long j3322 = (((int) j3222) & ((((~(1033885093 | i10)) | (~((-605098113) | i)) | (~((-25445666) | i))) * 765) + 133876962 + (((~(428786981 | i10)) | (-1033885094)) * 1530) + (((~(428786981 | i)) | (~((-25445666) | i10))) * 765))) | (((int) (j3222 >> 32)) & (((((~((-267925883) | i)) | (~((-1705152294) | i10))) * 959) - 959133175) + (((~((-1705152294) | i)) | (~((-267925883) | i10))) * 959)));
                        if (j2 <= 0) {
                        }
                        java.lang.Object[] objArr9022 = new java.lang.Object[1];
                        e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", 21059 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr9022);
                        java.lang.Object[] objArr9122 = {((java.lang.String) objArr9022[0]).intern()};
                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj5 == null) {
                        }
                        long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr9122)).longValue();
                        long j3422 = ((334 * longValue1022) - 404190022231L) + (((~(j | (-1217439828))) | (~(longValue1022 | j7))) * 333) + (((~(j | longValue1022)) | (~(j7 | (-1217439828)))) * 333) + 73100240;
                        j3 = (((int) (j3422 >> 32)) & ((((~((-1445748804) | i)) | (~((-156336421) | i10))) * 497) + 1377888435 + (((~(164858812 | i10)) | (-1610607616) | (~((-156336421) | i))) * 497))) | (((int) j3422) & ((((~((-1489049787) | i10)) | (-1368691100) | (~(1489049786 | i))) * (-564)) + 2020563617 + ((~((-18120962) | i)) * 1128) + (((~((-1368691100) | i10)) | (-1507170748)) * 564)));
                        java.lang.Object[] objArr9322 = new java.lang.Object[1];
                        h(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u009d\u008d\u0085\u0090", objArr9322);
                        java.lang.Object[] objArr9422 = {((java.lang.String) objArr9322[0]).intern()};
                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                        if (obj6 == null) {
                        }
                        long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr9422)).longValue();
                        long j3522 = ~longValue1122;
                        long j3622 = ~(j | 483664983);
                        long j3722 = ((713 * longValue1122) - 343885802913L) + (((~(j3522 | 483664983)) | j3622) * (-712)) + (((~(j3522 | j | 483664983)) | (~(longValue1122 | 483664983 | j7))) * (-712)) + ((j3522 | j3622) * 712) + 806875084;
                        long j3822 = (((int) (j3722 >> 32)) & (((~(182787541 | i10)) * (-560)) + 266548650 + ((~((-1073750529) | i)) * (-560)) + (((~(1254438869 | i10)) | 2099200) * 560))) | (((int) j3722) & ((((731919918 | i10) * (-757)) - 58365688) + ((~((-1410678786) | i)) * 1514) + (((~((-2125820968) | i10)) | 715142182 | (~(2142598703 | i))) * 757)));
                        if (j3 <= 0) {
                        }
                        java.lang.Object[] objArr9922 = new java.lang.Object[1];
                        h(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr9922);
                        java.lang.String intern3022 = ((java.lang.String) objArr9922[0]).intern();
                        java.lang.Object[] objArr10022 = new java.lang.Object[1];
                        h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr10022);
                        java.lang.String intern3122 = ((java.lang.String) objArr10022[0]).intern();
                        java.lang.Object[] objArr10122 = new java.lang.Object[1];
                        h(null, null, 127 - android.text.TextUtils.getTrimmedLength(str), "\u008b\u0091\u0095\u008e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr10122);
                        java.lang.String intern3222 = ((java.lang.String) objArr10122[0]).intern();
                        java.lang.Object[] objArr10222 = new java.lang.Object[1];
                        h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008b\u0091\u0095\u009e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr10222);
                        java.lang.String intern3322 = ((java.lang.String) objArr10222[0]).intern();
                        java.lang.Object[] objArr10322 = new java.lang.Object[1];
                        e("팋䢙\ue4d7+뱬\ud9bc疔醆ഞꥮ욤", 39883 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr10322);
                        java.lang.String intern3422 = ((java.lang.String) objArr10322[0]).intern();
                        java.lang.Object[] objArr10422 = new java.lang.Object[1];
                        h(null, null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u008b\u0091\u0095\u008e\u0090", objArr10422);
                        java.lang.String intern3522 = ((java.lang.String) objArr10422[0]).intern();
                        java.lang.Object[] objArr10522 = new java.lang.Object[1];
                        h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0087\u0088\u008d\u0090", objArr10522);
                        java.lang.String[] strArr622 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr10522[0]).intern()};
                        i3 = 0;
                        while (true) {
                            if (i3 < 7) {
                            }
                            i3++;
                        }
                        if (i4 == 0) {
                        }
                    } else {
                        i11++;
                        i8 = 1;
                        i9 = 0;
                    }
                }
                j = j9;
                str = "";
            } else {
                j = j9;
                str = "";
            }
            i2 = i9;
            java.lang.Object[] objArr30222 = new java.lang.Object[1];
            e("퍅\ueacbꁐ翚㕣쳶訟䆚", 14731 - android.graphics.drawable.Drawable.resolveOpacity(i2, i2), objArr30222);
            java.lang.String intern21022 = ((java.lang.String) objArr30222[i2]).intern();
            java.lang.Object[] objArr31222 = new java.lang.Object[1];
            h(null, null, 127 - android.graphics.Color.green(i2), "\u0096\u008b\u0091\u0084\u0081\u008a", objArr31222);
            java.lang.String intern31022 = ((java.lang.String) objArr31222[i2]).intern();
            java.lang.Object[] objArr32222 = new java.lang.Object[1];
            e("퍀㔚ῷ憮䨍곉뚲", 58963 - android.text.TextUtils.getTrimmedLength(str), objArr32222);
            java.lang.String intern4722 = ((java.lang.String) objArr32222[i2]).intern();
            java.lang.Object[] objArr33222 = new java.lang.Object[1];
            e("퍃线袸\udaaa撽뚭삨ኸ벮", 44543 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr33222);
            java.lang.String intern5222 = ((java.lang.String) objArr33222[i2]).intern();
            java.lang.Object[] objArr34222 = new java.lang.Object[1];
            h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0091\u0092\u0087\u0092\u0085\u0091", objArr34222);
            java.lang.String intern6222 = ((java.lang.String) objArr34222[i2]).intern();
            java.lang.Object[] objArr35222 = new java.lang.Object[1];
            e("퍍\uea37ꆷ缧㛽찱讯䄭ᢹ혦\uede8ꬉ抛", 14717 - android.graphics.Color.red(i2), objArr35222);
            java.lang.String intern7222 = ((java.lang.String) objArr35222[i2]).intern();
            java.lang.Object[] objArr36222 = new java.lang.Object[1];
            h(null, null, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 127, "\u0084\u0082\u0088\u0082\u0091", objArr36222);
            java.lang.String intern8222 = ((java.lang.String) objArr36222[i2]).intern();
            java.lang.Object[] objArr37222 = new java.lang.Object[1];
            h(null, null, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 127, "\u0097\u008c\u0081\u008d\u0084\u0091", objArr37222);
            java.lang.String intern9222 = ((java.lang.String) objArr37222[i2]).intern();
            java.lang.Object[] objArr38222 = new java.lang.Object[1];
            e("퍍ﳸ", android.os.Process.getGidForName(str) + 12204, objArr38222);
            java.lang.String intern10222 = ((java.lang.String) objArr38222[i2]).intern();
            java.lang.Object[] objArr39222 = new java.lang.Object[1];
            h(null, null, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, "\u0088\u0081\u008a\u0088\u008e\u0083\u0088\u008e\u0091\u008e\u0081\u008d\u0084\u0096\u0082\u0092", objArr39222);
            java.lang.String intern11222 = ((java.lang.String) objArr39222[i2]).intern();
            java.lang.Object[] objArr40222 = new java.lang.Object[1];
            h(null, null, 127 - (android.view.ViewConfiguration.getTouchSlop() >> 8), "\u0087\u0081\u0083\u0085\u0096\u008a\u0088\u0096\u0082\u0092", objArr40222);
            java.lang.String intern12222 = ((java.lang.String) objArr40222[i2]).intern();
            java.lang.Object[] objArr41222 = new java.lang.Object[1];
            h(null, null, 127 - android.view.View.resolveSizeAndState(i2, i2, i2), "\u0093\u008b\u008a\u0081\u0087\u0082\u0081\u0084", objArr41222);
            java.lang.String intern13222 = ((java.lang.String) objArr41222[i2]).intern();
            java.lang.Object[] objArr42222 = new java.lang.Object[1];
            e("퍔㝝᭝罣䍫ꝼ謊\uef05\uf319휤㬾Ἱ", android.graphics.Color.blue(i2) + 58379, objArr42222);
            java.lang.String intern14222 = ((java.lang.String) objArr42222[i2]).intern();
            java.lang.Object[] objArr43222 = new java.lang.Object[1];
            e("퍔픑\udfc5솗쩛차\uf6e2\uf8b9\ue179\ueb38\ued96陊頄苓", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1607, objArr43222);
            java.lang.String intern15222 = ((java.lang.String) objArr43222[i2]).intern();
            java.lang.Object[] objArr44222 = new java.lang.Object[1];
            e("퍖\u0aca恟忪땽\uecfd쨒", 55691 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr44222);
            java.lang.String intern16222 = ((java.lang.String) objArr44222[i2]).intern();
            java.lang.Object[] objArr45222 = new java.lang.Object[1];
            h(null, null, 127 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0084\u008a\u0089\u0099\u0082\u0098\u008e", objArr45222);
            java.lang.String intern17222 = ((java.lang.String) objArr45222[i2]).intern();
            java.lang.Object[] objArr46222 = new java.lang.Object[1];
            h(null, null, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0097\u008d\u0088\u0091\u0092\u009a\u008e", objArr46222);
            java.lang.String intern18222 = ((java.lang.String) objArr46222[i2]).intern();
            java.lang.Object[] objArr47222 = new java.lang.Object[1];
            e("퍗～", 11273 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr47222);
            java.lang.String intern19222 = ((java.lang.String) objArr47222[i2]).intern();
            java.lang.Object[] objArr48222 = new java.lang.Object[1];
            e("퍗⫍ⁿ㾁㔤㍪૽\u0006Ᾰᗉፙ櫷怗羾痙獶䪓䀬幀嗷", android.view.KeyEvent.getDeadChar(i2, i2) + 63901, objArr48222);
            java.lang.String intern20222 = ((java.lang.String) objArr48222[i2]).intern();
            java.lang.Object[] objArr49222 = new java.lang.Object[1];
            e("퍗靫嬠ῴ쎫虦", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 17467, objArr49222);
            java.lang.String intern21222 = ((java.lang.String) objArr49222[i2]).intern();
            java.lang.Object[] objArr50222 = new java.lang.Object[1];
            e("퍗֒", 54980 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr50222);
            java.lang.String intern22222 = ((java.lang.String) objArr50222[i2]).intern();
            java.lang.Object[] objArr51222 = new java.lang.Object[1];
            h(null, null, android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 127, "\u008e\u0086\u0088\u008a\u0088\u008e\u0094\u0081\u008d\u009b\u0091\u0088\u0091\u008b\u008a\u008e", objArr51222);
            java.lang.String intern23222 = ((java.lang.String) objArr51222[i2]).intern();
            java.lang.Object[] objArr52222 = new java.lang.Object[1];
            h(null, null, ((android.os.Process.getThreadPriority(i2) + 20) >> 6) + 127, "\u0098\u0088\u008a\u0084\u008d\u0087\u008a\u0081\u0088", objArr52222);
            java.lang.String intern24222 = ((java.lang.String) objArr52222[i2]).intern();
            java.lang.Object[] objArr53222 = new java.lang.Object[1];
            e("퍐\uf71b鯟뾠䉵曕ઋⵋ\uf124閧", android.view.View.MeasureSpec.makeMeasureSpec(i2, i2) + 9293, objArr53222);
            java.lang.String intern25222 = ((java.lang.String) objArr53222[i2]).intern();
            java.lang.Object[] objArr54222 = new java.lang.Object[1];
            e("퍐ή䬃뜮\ue3cd⿹ᮙ䞤뉈ﹺ⩌", (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 52259, objArr54222);
            java.lang.String intern26222 = ((java.lang.String) objArr54222[i2]).intern();
            java.lang.Object[] objArr55222 = new java.lang.Object[1];
            h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i2, i2) + 128, "\u0082\u008c\u008b\u0091\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr55222);
            java.lang.String intern27222 = ((java.lang.String) objArr55222[i2]).intern();
            java.lang.Object[] objArr56222 = new java.lang.Object[1];
            h(null, null, android.view.Gravity.getAbsoluteGravity(i2, i2) + 127, "\u0082\u008c\u008b\u0091\u009c\u0096\u008d\u0081\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr56222);
            java.lang.String intern28222 = ((java.lang.String) objArr56222[i2]).intern();
            java.lang.Object[] objArr57222 = new java.lang.Object[1];
            h(null, null, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 128, "\u008e\u0092\u0082\u0095\u0089\u008f\u008e\u009c\u0085\u008b\u0091\u0099\u008b\u0086", objArr57222);
            java.lang.String[] strArr3222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr57222[i2]).intern()};
            java.lang.Object[] objArr58222 = new java.lang.Object[1];
            e("퍖귐⸼ꢝ⤩꩑ⓢꕮ➝ꀥ⅏", android.text.TextUtils.indexOf(str, str, i2, i2) + 32411, objArr58222);
            java.lang.Object[] objArr59222 = {((java.lang.String) objArr58222[i2]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr59222);
            if (str2 != null) {
            }
            java.lang.Object[] objArr81222 = new java.lang.Object[1];
            e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 21059, objArr81222);
            java.lang.Object[] objArr82222 = {((java.lang.String) objArr81222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr82222)).longValue();
            long j28222 = ((-271) * longValue8222) + 54581774247L + (((~((-199933240) | (~longValue8222) | j)) | (~(199933239 | longValue8222 | j7))) * (-272)) + (((~((-199933240) | longValue8222)) | (~((-199933240) | j7))) * (-272)) + ((longValue8222 | (~(199933239 | j7))) * 272) + 1090606828;
            j2 = (((int) (j28222 >> 32)) & ((((~((-1515364929) | i10)) | 78138517 | (~((-632053150) | i))) * (-68)) + 444256962 + ((~((-553914633) | i10)) * (-68)) + (((~(632053149 | i10)) | (-2069279561)) * 68))) | (((int) j28222) & (((((~((-139151214) | i)) | 16705) * (-140)) - 957526597) + ((~((-139134509) | i)) * 70) + (((~((-1298075197) | i)) | 1158957393) * 70)));
            java.lang.Object[] objArr84222 = new java.lang.Object[1];
            e("팋\u0d99滌伬ꡳ褊\ueb99쓚┠ٷ有䆘ꋌ茬ﱦ\udd52㾇", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 57037, objArr84222);
            java.lang.Object[] objArr85222 = {((java.lang.String) objArr84222[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr85222)).longValue();
            long j29222 = j | 402386206;
            long j30222 = ~longValue9222;
            long j31222 = j30222 | j;
            long j32222 = ((-183) * longValue9222) + 73636675881L + (((~(j31222 | (-402386207))) | (~(j29222 | longValue9222))) * (-184)) + (((~j31222) | (~(402386206 | j30222)) | (~j29222)) * 184) + (((-402386207) | longValue9222) * 184) + 1692926274;
            long j33222 = (((int) j32222) & ((((~(1033885093 | i10)) | (~((-605098113) | i)) | (~((-25445666) | i))) * 765) + 133876962 + (((~(428786981 | i10)) | (-1033885094)) * 1530) + (((~(428786981 | i)) | (~((-25445666) | i10))) * 765))) | (((int) (j32222 >> 32)) & (((((~((-267925883) | i)) | (~((-1705152294) | i10))) * 959) - 959133175) + (((~((-1705152294) | i)) | (~((-267925883) | i10))) * 959)));
            if (j2 <= 0) {
            }
            java.lang.Object[] objArr90222 = new java.lang.Object[1];
            e("팋脔矛▞騇䠍㻅\uecde䅏㜚\ue5d6宬\u086e︶곶˦\uf771ꔹ\u1bf4즲빪永슃", 21059 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr90222);
            java.lang.Object[] objArr91222 = {((java.lang.String) objArr90222[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue10222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr91222)).longValue();
            long j34222 = ((334 * longValue10222) - 404190022231L) + (((~(j | (-1217439828))) | (~(longValue10222 | j7))) * 333) + (((~(j | longValue10222)) | (~(j7 | (-1217439828)))) * 333) + 73100240;
            j3 = (((int) (j34222 >> 32)) & ((((~((-1445748804) | i)) | (~((-156336421) | i10))) * 497) + 1377888435 + (((~(164858812 | i10)) | (-1610607616) | (~((-156336421) | i))) * 497))) | (((int) j34222) & ((((~((-1489049787) | i10)) | (-1368691100) | (~(1489049786 | i))) * (-564)) + 2020563617 + ((~((-18120962) | i)) * 1128) + (((~((-1368691100) | i10)) | (-1507170748)) * 564)));
            java.lang.Object[] objArr93222 = new java.lang.Object[1];
            h(null, null, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u009d\u008d\u0085\u0090", objArr93222);
            java.lang.Object[] objArr94222 = {((java.lang.String) objArr93222[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue11222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr94222)).longValue();
            long j35222 = ~longValue11222;
            long j36222 = ~(j | 483664983);
            long j37222 = ((713 * longValue11222) - 343885802913L) + (((~(j35222 | 483664983)) | j36222) * (-712)) + (((~(j35222 | j | 483664983)) | (~(longValue11222 | 483664983 | j7))) * (-712)) + ((j35222 | j36222) * 712) + 806875084;
            long j38222 = (((int) (j37222 >> 32)) & (((~(182787541 | i10)) * (-560)) + 266548650 + ((~((-1073750529) | i)) * (-560)) + (((~(1254438869 | i10)) | 2099200) * 560))) | (((int) j37222) & ((((731919918 | i10) * (-757)) - 58365688) + ((~((-1410678786) | i)) * 1514) + (((~((-2125820968) | i10)) | 715142182 | (~(2142598703 | i))) * 757)));
            if (j3 <= 0) {
            }
            java.lang.Object[] objArr99222 = new java.lang.Object[1];
            h(null, null, (-16777089) - android.graphics.Color.rgb(0, 0, 0), "\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr99222);
            java.lang.String intern30222 = ((java.lang.String) objArr99222[0]).intern();
            java.lang.Object[] objArr100222 = new java.lang.Object[1];
            h(null, null, android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 128, "\u008b\u0091\u0095\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr100222);
            java.lang.String intern31222 = ((java.lang.String) objArr100222[0]).intern();
            java.lang.Object[] objArr101222 = new java.lang.Object[1];
            h(null, null, 127 - android.text.TextUtils.getTrimmedLength(str), "\u008b\u0091\u0095\u008e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr101222);
            java.lang.String intern32222 = ((java.lang.String) objArr101222[0]).intern();
            java.lang.Object[] objArr102222 = new java.lang.Object[1];
            h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u008b\u0091\u0095\u009e\u0090\u0089\u008d\u0088\u008e\u008f\u008e\u0090", objArr102222);
            java.lang.String intern33222 = ((java.lang.String) objArr102222[0]).intern();
            java.lang.Object[] objArr103222 = new java.lang.Object[1];
            e("팋䢙\ue4d7+뱬\ud9bc疔醆ഞꥮ욤", 39883 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr103222);
            java.lang.String intern34222 = ((java.lang.String) objArr103222[0]).intern();
            java.lang.Object[] objArr104222 = new java.lang.Object[1];
            h(null, null, 127 - android.view.Gravity.getAbsoluteGravity(0, 0), "\u008b\u0091\u0095\u008e\u0090", objArr104222);
            java.lang.String intern35222 = ((java.lang.String) objArr104222[0]).intern();
            java.lang.Object[] objArr105222 = new java.lang.Object[1];
            h(null, null, 126 - android.graphics.ImageFormat.getBitsPerPixel(0), "\u0087\u0088\u008d\u0090", objArr105222);
            java.lang.String[] strArr6222 = {intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr105222[0]).intern()};
            i3 = 0;
            while (true) {
                if (i3 < 7) {
                }
                i3++;
            }
            if (i4 == 0) {
            }
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause5 = th11.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th11;
        }
    }

    static void init$0() {
        $$d = new byte[]{65, -108, -120, -80, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$e = 171;
    }

    public final com.payair.hce.suspendCardForToken getCardLayoutDescription() {
        return (com.payair.hce.suspendCardForToken) valueOf(new java.lang.Object[]{this}, -566547452, 566547452, java.lang.System.identityHashCode(this));
    }
}
