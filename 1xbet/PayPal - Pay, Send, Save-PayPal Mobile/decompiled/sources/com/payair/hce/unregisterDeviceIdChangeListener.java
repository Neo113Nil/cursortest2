package com.payair.hce;

/* loaded from: classes4.dex */
public final class unregisterDeviceIdChangeListener<T> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static char values;
    private static int writeReplace;
    private java.lang.Class valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$a;
        int i4 = i + 102;
        int i5 = i2 * 4;
        int i6 = 4 - (s * 3);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i4;
            i4 = i5;
            i3 = 0;
            i6++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i6];
            i6++;
            i4 += i7;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    public unregisterDeviceIdChangeListener(java.lang.Class cls) {
        this.valueOf = cls;
    }

    public final T valueOf(byte[] bArr) {
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener = new com.payair.hce.setOnItemSelectedListener();
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener2 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener, com.payair.hce.isUiContext.class, new com.payair.hce.createWindowContext()}, -976499511, 976499513, java.lang.System.identityHashCode(setonitemselectedlistener));
        com.payair.hce.setOnItemSelectedListener setonitemselectedlistener3 = (com.payair.hce.setOnItemSelectedListener) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener2, java.lang.Byte.TYPE, new com.payair.hce.isRestricted()}, -976499511, 976499513, java.lang.System.identityHashCode(setonitemselectedlistener2));
        T t = (T) com.payair.hce.setOnItemSelectedListener.values(new java.lang.Object[]{setonitemselectedlistener3, inputStreamReader, this.valueOf}, 509207078, -509207074, java.lang.System.identityHashCode(setonitemselectedlistener3));
        writeReplace = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
        return t;
    }

    public static java.lang.String DigitizedCardProfile(T t) {
        com.payair.hce.setChildDivider setchilddivider = new com.payair.hce.setChildDivider();
        float maxVolume = android.media.AudioTrack.getMaxVolume();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("➕嫡厈濮", "隮\uebf6ꘝ拱ን麺⬀", "ⰼϫ洃\u1c8a", 50588459 + (maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        setchilddivider.valueOf(((java.lang.String) objArr[0]).intern());
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getDisplay(), com.payair.hce.isUiContext.class);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.registerDeviceIdChangeListener(), java.lang.Byte.TYPE);
        setchilddivider.AlternateContactlessPaymentDataJson(new com.payair.hce.getDeviceId(), java.lang.Void.TYPE);
        java.lang.String DigitizedCardProfile2 = setchilddivider.DigitizedCardProfile(t);
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 79;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return DigitizedCardProfile2;
        }
        throw null;
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $11 = ($10 + 61) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        int i2 = $10 + 47;
        $11 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 3;
        }
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 15) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.os.Process.myTid() >> 22), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1179, (char) android.text.TextUtils.indexOf("", "", 0, 0));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(0, 0, (short) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, 3443 - (android.os.Process.myTid() >> 22), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3830))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 26, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1864, (char) (41775 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(3, 0, (short) 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.MeasureSpec.getSize(0), 3133 - android.graphics.Color.green(0), (char) android.view.View.resolveSize(0, 0));
                    byte length4 = (byte) $$a.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    b(length4, b, b, objArr8);
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((int) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)) ^ ((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (DigitizedCardProfile ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    static void init$0() {
        $$a = new byte[]{57, 59, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 75};
        $$b = 57;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        DigitizedCardProfile = 9108413305318273457L;
        AlternateContactlessPaymentDataJson = -804334044;
        values = (char) 54820;
    }

    public static char f(int i, int i2) {
        try {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
            if (obj == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, android.text.TextUtils.getTrimmedLength("") + 3133, (char) ((-1) - android.os.Process.getGidForName("")));
                byte length = (byte) $$a.length;
                byte b = (byte) (length - 4);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(length, b, b, objArr2);
                obj = cls.getMethod((java.lang.String) objArr2[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj);
            }
            return ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr)).charValue();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
