package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class setMobilePinInitialConfiguration implements com.payair.hce.onIdentify {
    private static final byte[] $$j = null;
    private static final int $$k = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int RecordsJson;
    private static char[] values;
    private static long writeReplace;
    private final byte[] AlternateContactlessPaymentDataJson;
    private com.payair.hce.setPinIvCvc3Track2 valueOf;

    private static void g(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2 = b + 4;
        byte[] bArr = $$j;
        int i3 = (s * 4) + 99;
        int i4 = i * 2;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i5 = -1;
            i3 = (-i2) + i4;
            i2 = i2;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i6;
            i3 = (-bArr[i7]) + i3;
            i2 = i7;
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setMobilePinInitialConfiguration setmobilepininitialconfiguration = (com.payair.hce.setMobilePinInitialConfiguration) objArr[0];
        RecordsJson = (DigitizedCardProfile + 59) % 128;
        byte b = setmobilepininitialconfiguration.AlternateContactlessPaymentDataJson[com.payair.hce.setPpseFci.writeReplace];
        RecordsJson = (DigitizedCardProfile + 107) % 128;
        return java.lang.Byte.valueOf(b);
    }

    protected abstract void AlternateContactlessPaymentDataJson();

    public setMobilePinInitialConfiguration(byte[] bArr) throws com.payair.hce.digitize {
        if (bArr == null || bArr.length < 4) {
            throw new com.payair.hce.digitize(com.payair.hce.requestTaskStatusUpdate.getMppLiteModule);
        }
        this.AlternateContactlessPaymentDataJson = bArr;
        this.valueOf = com.payair.hce.setMaximumPinTry.valueOf();
        AlternateContactlessPaymentDataJson();
    }

    public final byte getAid() {
        int i = RecordsJson + 25;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            byte b = this.AlternateContactlessPaymentDataJson[com.payair.hce.setPpseFci.DigitizedCardProfile];
            throw null;
        }
        byte b2 = this.AlternateContactlessPaymentDataJson[com.payair.hce.setPpseFci.DigitizedCardProfile];
        int i2 = DigitizedCardProfile + 29;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return b2;
        }
        throw null;
    }

    private static void f(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 27) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i / getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 48, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 381, (char) (android.graphics.Color.rgb(0, 0, 0) + 16839604));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        g((byte) -1, (short) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 3965 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - android.view.MotionEvent.axisFromString(""), 212 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, 381 - android.graphics.Color.alpha(0), (char) (62388 - android.view.KeyEvent.getDeadChar(0, 0)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    g((byte) -1, (short) 0, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.Process.myPid() >> 22), android.view.View.MeasureSpec.getSize(0) + 3966, (char) (40223 - android.view.View.resolveSizeAndState(0, 0, 0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 34, android.text.TextUtils.getOffsetAfter("", 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.os.Process.getGidForName("")))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 111) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 212 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    public final byte RecordsJson() {
        DigitizedCardProfile = (RecordsJson + 51) % 128;
        byte b = this.AlternateContactlessPaymentDataJson[com.payair.hce.setPpseFci.AlternateContactlessPaymentDataJson];
        RecordsJson = (DigitizedCardProfile + 107) % 128;
        return b;
    }

    public final byte IccPrivateKeyCrtComponentsJson() {
        int i = RecordsJson + 53;
        DigitizedCardProfile = i % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        return i % 2 != 0 ? bArr[3] : bArr[4];
    }

    public final byte getProfileVersion() {
        int i = DigitizedCardProfile;
        int i2 = i + 33;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            int length = this.AlternateContactlessPaymentDataJson.length;
            throw new java.lang.ArithmeticException();
        }
        byte b = this.AlternateContactlessPaymentDataJson[r1.length - 1];
        int i3 = i + 71;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            return b;
        }
        throw null;
    }

    public final int SdkCoreBusinessLogicModuleImpl() {
        int i = DigitizedCardProfile;
        RecordsJson = (i + 17) % 128;
        int length = this.AlternateContactlessPaymentDataJson.length;
        int i2 = i + 61;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return length;
        }
        throw null;
    }

    public final byte[] getCvrMaskAnd() {
        RecordsJson = (DigitizedCardProfile + 37) % 128;
        int IccPrivateKeyCrtComponentsJson = IccPrivateKeyCrtComponentsJson() & 255;
        byte[] bArr = new byte[IccPrivateKeyCrtComponentsJson];
        java.lang.System.arraycopy(this.AlternateContactlessPaymentDataJson, 5, bArr, 0, IccPrivateKeyCrtComponentsJson);
        int i = RecordsJson + 83;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    @Override // com.payair.hce.onIdentify
    public void values() {
        DigitizedCardProfile = (RecordsJson + 99) % 128;
        com.payair.hce.onAuthenticationFailed.writeReplace(this.AlternateContactlessPaymentDataJson);
        RecordsJson = (DigitizedCardProfile + 21) % 128;
    }

    public java.lang.String toString() {
        android.view.ViewConfiguration.getScrollBarSize();
        android.os.SystemClock.elapsedRealtimeNanos();
        android.text.TextUtils.getOffsetAfter("", 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        f(10 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (android.graphics.Color.blue(0) + 54795), 4 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson).writeReplace());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        f(android.graphics.Color.red(0) + 15, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), -android.graphics.ImageFormat.getBitsPerPixel(0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        f((android.os.Process.myPid() >> 22) + 16, (char) (62745 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25, objArr3);
        sb.append(java.lang.String.format(((java.lang.String) objArr3[0]).intern(), java.lang.Byte.valueOf(RecordsJson()), java.lang.Byte.valueOf(((java.lang.Byte) valueOf(new java.lang.Object[]{this}, 1301847775, -1301847775, java.lang.System.identityHashCode(this))).byteValue()), java.lang.Byte.valueOf(IccPrivateKeyCrtComponentsJson())));
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        f(41 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 6567), android.graphics.Color.green(0) + 1, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        new java.lang.Object[]{sb.toString()};
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        f(41 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 12, objArr5);
        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
        int i = RecordsJson + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return intern;
        }
        throw new java.lang.ArithmeticException();
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        RecordsJson = 1;
        values = new char[]{24300, 9129, 42168, 10622, 43591, 12077, 45463, 12962, 47058, 14431, 35071, 62941, 29331, 65362, 31797, 24229, 44006, 54956, 20957, 56338, 24362, 55891, 17644, 51127, 17102, 52581, 18474, 52050, 30103, 61609, 29662, 65131, 31018, 58445, 26364, 57828, 27863, 61204, 27188, 38233, 6118, 18261, 24300, 9195, 42132, 10563, 43618, 12054, 45513, 12995, 46983, 14408, 48500};
        writeReplace = -5601402561997364348L;
    }

    static void init$0() {
        $$j = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$k = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE;
    }

    public final byte SdkCoreAlternateContactlessPaymentDataImpl() {
        return ((java.lang.Byte) valueOf(new java.lang.Object[]{this}, 1301847775, -1301847775, java.lang.System.identityHashCode(this))).byteValue();
    }
}
