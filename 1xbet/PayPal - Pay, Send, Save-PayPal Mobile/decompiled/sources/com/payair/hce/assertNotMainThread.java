package com.payair.hce;

/* loaded from: classes4.dex */
public final class assertNotMainThread extends com.payair.hce.isOpenInternal {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static int[] getAid;
    private static int getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 66 - (i * 2);
        byte[] bArr = $$a;
        int i4 = s2 * 3;
        int i5 = s + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            int i9 = 0;
            int i10 = (-i5) + i8;
            i2 = i9;
            int i11 = i7;
            i3 = i10;
            i5 = i11;
            int i12 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i3;
            i7 = i12;
            i5 = bArr[i12];
            i9 = i2 + 1;
            i8 = i13;
            int i102 = (-i5) + i8;
            i2 = i9;
            int i112 = i7;
            i3 = i102;
            i5 = i112;
            int i122 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1222 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.assertNotMainThread assertnotmainthread = (com.payair.hce.assertNotMainThread) objArr[0];
        com.payair.hce.isUserRecoverableError isuserrecoverableerror = (com.payair.hce.isUserRecoverableError) objArr[1];
        SdkCoreBusinessLogicModuleImpl = (getProfileVersion + 87) % 128;
        assertnotmainthread.writeReplace((com.payair.hce.assertNotMainThread) isuserrecoverableerror);
        getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 33) % 128;
        return null;
    }

    public assertNotMainThread() {
    }

    private assertNotMainThread(com.payair.hce.assertNotMainThread assertnotmainthread) {
        super(assertnotmainthread);
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final java.lang.String values() {
        getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 109) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{886555623, -454159018, 52752352, 649427156}, 7 - android.view.KeyEvent.keyCodeFromString(""), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i = SdkCoreBusinessLogicModuleImpl + 39;
        getProfileVersion = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final int AlternateContactlessPaymentDataJson() {
        int i = (getProfileVersion + 7) % 128;
        SdkCoreBusinessLogicModuleImpl = i;
        int i2 = i + 91;
        getProfileVersion = i2 % 128;
        if (i2 % 2 == 0) {
            return 64;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getTransactionExecutor
    public final int valueOf(byte[] bArr, int i) {
        getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 59) % 128;
        writeReplace();
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.AlternateContactlessPaymentDataJson), bArr, java.lang.Integer.valueOf(i)}, -2099933895, 2099933896, i);
        int i2 = i + 8;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.values), bArr, java.lang.Integer.valueOf(i2)}, -2099933895, 2099933896, i2);
        int i3 = i + 16;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.writeReplace), bArr, java.lang.Integer.valueOf(i3)}, -2099933895, 2099933896, i3);
        int i4 = i + 24;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.valueOf), bArr, java.lang.Integer.valueOf(i4)}, -2099933895, 2099933896, i4);
        int i5 = i + 32;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.DigitizedCardProfile), bArr, java.lang.Integer.valueOf(i5)}, -2099933895, 2099933896, i5);
        int i6 = i + 40;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.SdkCoreAlternateContactlessPaymentDataImpl), bArr, java.lang.Integer.valueOf(i6)}, -2099933895, 2099933896, i6);
        int i7 = i + 48;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.RecordsJson), bArr, java.lang.Integer.valueOf(i7)}, -2099933895, 2099933896, i7);
        int i8 = i + 56;
        com.payair.hce.honorsDebugCertificates.valueOf(new java.lang.Object[]{java.lang.Long.valueOf(this.IccPrivateKeyCrtComponentsJson), bArr, java.lang.Integer.valueOf(i8)}, -2099933895, 2099933896, i8);
        valueOf();
        int i9 = getProfileVersion + 31;
        SdkCoreBusinessLogicModuleImpl = i9 % 128;
        if (i9 % 2 != 0) {
            return 64;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        int length;
        int[] iArr3;
        int i3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getAid;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int i6 = $11 + 79;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
                i3 = 1;
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                $11 = ($10 + 99) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[i5] = java.lang.Integer.valueOf(iArr4[i3]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 28, (char) (android.text.TextUtils.lastIndexOf("", c, i5) + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i3++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                    i4 = 1;
                    i5 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = getAid;
        if (iArr6 != null) {
            $10 = ($11 + 67) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                $11 = ($10 + 53) % 128;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i7])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.keyCodeFromString(""), android.os.Process.getGidForName("") + 30, (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i7++;
                iArr6 = iArr2;
                length3 = i2;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            $10 = ($11 + 7) % 128;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $11 + 115;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31, 5088 - android.view.View.MeasureSpec.getMode(0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i8 += 4;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 31, 5088 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i8++;
                }
            }
            int i10 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i10;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i11 = istransitsupported.DigitizedCardProfile;
            int i12 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49, 2923 - (android.os.Process.myTid() >> 22), (char) (3037 - android.view.View.combineMeasuredStates(0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) -1, (short) 0, 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            $11 = ($10 + 105) % 128;
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.payair.hce.isOpenInternal, com.payair.hce.getTransactionExecutor
    public final void valueOf() {
        SdkCoreBusinessLogicModuleImpl = (getProfileVersion + 111) % 128;
        super.valueOf();
        this.AlternateContactlessPaymentDataJson = 7640891576956012808L;
        this.values = -4942790177534073029L;
        this.writeReplace = 4354685564936845355L;
        this.valueOf = -6534734903238641935L;
        this.DigitizedCardProfile = 5840696475078001361L;
        this.SdkCoreAlternateContactlessPaymentDataImpl = -7276294671716946913L;
        this.RecordsJson = 2270897969802886507L;
        this.IccPrivateKeyCrtComponentsJson = 6620516959819538809L;
        getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 61) % 128;
    }

    @Override // com.payair.hce.isUserRecoverableError
    public final com.payair.hce.isUserRecoverableError RecordsJson() {
        com.payair.hce.assertNotMainThread assertnotmainthread = new com.payair.hce.assertNotMainThread(this);
        getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 93) % 128;
        return assertnotmainthread;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getProfileVersion = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        getAid = new int[]{1683841225, 1171563087, -274896829, -473096972, 664522115, -100666723, -619115091, -1235078453, -817125059, 46799773, 1611459212, -1599933020, -1833215911, -157472256, -838058678, -1403858233, -101213005, -1808210368};
    }

    static void init$0() {
        $$a = new byte[]{41, 86, 91, 57};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE;
    }

    @Override // com.payair.hce.isUserRecoverableError
    public final void DigitizedCardProfile(com.payair.hce.isUserRecoverableError isuserrecoverableerror) {
        valueOf(new java.lang.Object[]{this, isuserrecoverableerror}, -713176632, 713176632, java.lang.System.identityHashCode(this));
    }
}
