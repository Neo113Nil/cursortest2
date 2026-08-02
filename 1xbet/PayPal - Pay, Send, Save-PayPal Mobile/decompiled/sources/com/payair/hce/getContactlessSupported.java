package com.payair.hce;

/* loaded from: classes4.dex */
public class getContactlessSupported {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static char valueOf;
    private static int writeReplace;
    private com.payair.hce.transactionCanBeResumed values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 3) + 4;
        byte[] bArr = $$d;
        int i5 = (b2 * 2) + 1;
        int i6 = 106 - b;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = 0;
            i6 += i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i4;
            i4 = bArr[i4];
            i8 = i3;
            i6 += i4;
            i4 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i6;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    public getContactlessSupported() {
    }

    public getContactlessSupported(char c) {
        this.values = (com.payair.hce.transactionCanBeResumed) com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{java.lang.Character.valueOf(c)}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis());
    }

    public final void valueOf(com.payair.hce.getWalletIdentificationDataProvider getwalletidentificationdataprovider) throws com.payair.hce.setRegistrationResponseData {
        int i = writeReplace + 59;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.transactionCanBeResumed DigitizedCardProfile2 = getwalletidentificationdataprovider.DigitizedCardProfile();
            if (DigitizedCardProfile2 == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                c((char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 40146), "\u0000\u0000\u0000\u0000", "䅺輏슰⍉偄鏃ᕹ⳱颩笙ো튍ퟙ㬄ᩆ筲", "㊷츢퇒쪜", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, objArr);
                throw new com.payair.hce.setRegistrationResponseData(((java.lang.String) objArr[0]).intern());
            }
            this.values = DigitizedCardProfile2;
            DigitizedCardProfile2.SdkCoreAlternateContactlessPaymentDataImpl();
            int i2 = writeReplace + 87;
            RecordsJson = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        getwalletidentificationdataprovider.DigitizedCardProfile();
        throw new java.lang.ArithmeticException();
    }

    public final void AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed) throws com.payair.hce.setRegistrationResponseData {
        int i = writeReplace + 13;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        if (transactioncanberesumed == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c((char) (40145 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "䅺輏슰⍉偄鏃ᕹ⳱颩笙ো튍ퟙ㬄ᩆ筲", "㊷츢퇒쪜", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
            throw new com.payair.hce.setRegistrationResponseData(((java.lang.String) objArr[0]).intern());
        }
        this.values = transactioncanberesumed;
        transactioncanberesumed.SdkCoreAlternateContactlessPaymentDataImpl();
        int i2 = writeReplace + 67;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void DigitizedCardProfile(com.payair.hce.access300 access300Var) throws com.payair.hce.getAtcCount {
        writeReplace = (RecordsJson + 7) % 128;
    }

    public final byte[] DigitizedCardProfile() {
        int i = RecordsJson + 117;
        writeReplace = i % 128;
        byte[] valueOf2 = this.values.valueOf();
        if (i % 2 == 0) {
            return valueOf2;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void c(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            $10 = ($11 + 7) % 128;
            cArr = str2.toCharArray();
            $11 = ($10 + 21) % 128;
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            cArr2 = str.toCharArray();
            int i2 = $10 + 83;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 / 4;
            }
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - android.view.View.MeasureSpec.getMode(0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1179, (char) android.view.View.MeasureSpec.getSize(0));
                    byte length4 = (byte) $$d.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(length4, b, b, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 31, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 3443, (char) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3831))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr5[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 26, 1864 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (41775 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 1, 0, (byte) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr5[intValue2] * 32718), java.lang.Integer.valueOf(cArr6[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 3133 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d((byte) 0, 0, (byte) 0, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((cArr5[intValue2] ^ cArr3[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L)) ^ ((int) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L))) ^ ((char) (valueOf ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr7);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        RecordsJson = 1;
        DigitizedCardProfile = 1263759066225628708L;
        AlternateContactlessPaymentDataJson = -804334044;
        valueOf = (char) 53301;
    }

    static void init$0() {
        $$d = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99};
        $$e = 36;
    }
}
