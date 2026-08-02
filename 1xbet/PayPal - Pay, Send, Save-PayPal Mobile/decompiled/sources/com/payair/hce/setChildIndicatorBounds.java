package com.payair.hce;

/* loaded from: classes4.dex */
public final class setChildIndicatorBounds {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static int RecordsJson;
    private static int[] values;
    private java.lang.String[] DigitizedCardProfile;
    private boolean valueOf;
    private boolean writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5 = 66 - (i2 * 4);
        int i6 = 4 - (i3 * 4);
        byte[] bArr = $$a;
        int i7 = i * 4;
        byte[] bArr2 = new byte[1 - i7];
        int i8 = 0 - i7;
        if (bArr == null) {
            int i9 = i8;
            int i10 = 0;
            i5 += -i9;
            i6++;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = bArr[i6];
            i5 += -i9;
            i6++;
            i4 = i10;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i5;
            i10 = i4 + 1;
            if (i4 == i8) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return valueOf(objArr);
    }

    public setChildIndicatorBounds(java.lang.String str, boolean z) {
        this.writeReplace = false;
        this.valueOf = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-1998846205, -1940992015}, 2 - android.text.TextUtils.indexOf("", "", 0), objArr);
        this.DigitizedCardProfile = str.split(((java.lang.String) objArr[0]).intern());
        this.writeReplace = str.indexOf(42) >= 0;
        this.valueOf = z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-848922963, -1182178831}, 1 - android.graphics.Color.blue(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        int i = 0;
        while (true) {
            java.lang.String[] strArr = this.DigitizedCardProfile;
            if (i >= strArr.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{64938321, -478376444}, 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr2);
                sb.append(((java.lang.String) objArr2[0]).intern());
                java.lang.String obj = sb.toString();
                AlternateContactlessPaymentDataJson = (RecordsJson + 83) % 128;
                return obj;
            }
            int i2 = AlternateContactlessPaymentDataJson + 1;
            RecordsJson = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(strArr[i]);
                if (i >= (this.DigitizedCardProfile.length >>> 1)) {
                    i++;
                }
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new int[]{-1090620163, -1698322656}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr3);
                sb.append(((java.lang.String) objArr3[0]).intern());
                i++;
            } else {
                sb.append(strArr[i]);
                if (i >= this.DigitizedCardProfile.length - 1) {
                    i++;
                }
                java.lang.Object[] objArr32 = new java.lang.Object[1];
                a(new int[]{-1090620163, -1698322656}, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr32);
                sb.append(((java.lang.String) objArr32[0]).intern());
                i++;
            }
        }
    }

    public final boolean values(com.payair.hce.setChildIndicator setchildindicator) {
        int i = 0;
        int i2 = 0;
        while (i < setchildindicator.DigitizedCardProfile()) {
            int i3 = RecordsJson + 53;
            AlternateContactlessPaymentDataJson = i3 % 128;
            if (i3 % 2 == 0) {
                java.lang.String str = setchildindicator.valueOf().get(i);
                java.lang.String[] strArr = this.DigitizedCardProfile;
                if (i2 < strArr.length) {
                    java.lang.String str2 = strArr[i2];
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(new int[]{-253082277, 763743102}, (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                    if (str2.equals(((java.lang.String) objArr[0]).intern())) {
                        i2++;
                    }
                }
                java.lang.String[] strArr2 = this.DigitizedCardProfile;
                if (i2 >= strArr2.length || !strArr2[i2].equals(str)) {
                    int i4 = i2 - 1;
                    if (i4 >= 0) {
                        int i5 = AlternateContactlessPaymentDataJson + 5;
                        RecordsJson = i5 % 128;
                        if (i5 % 2 == 0) {
                            java.lang.String str3 = this.DigitizedCardProfile[i2 >> 1];
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            a(new int[]{-253082277, 763743102}, 0 / (android.view.ViewConfiguration.getFadingEdgeLength() / 106), objArr2);
                            if (!str3.equals(((java.lang.String) objArr2[0]).intern())) {
                            }
                            i++;
                        } else {
                            java.lang.String str4 = this.DigitizedCardProfile[i4];
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            a(new int[]{-253082277, 763743102}, 1 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                            if (!str4.equals(((java.lang.String) objArr3[0]).intern())) {
                            }
                            i++;
                        }
                    }
                    return false;
                }
                i++;
                i2++;
            } else {
                setchildindicator.valueOf().get(i);
                int length = this.DigitizedCardProfile.length;
                throw new java.lang.ArithmeticException();
            }
        }
        if (i2 > 0) {
            AlternateContactlessPaymentDataJson = (RecordsJson + 115) % 128;
            java.lang.String str5 = this.DigitizedCardProfile[i2 - 1];
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a(new int[]{-253082277, 763743102}, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
            if (str5.equals(((java.lang.String) objArr4[0]).intern())) {
                return i >= setchildindicator.DigitizedCardProfile() && i2 >= this.DigitizedCardProfile.length;
            }
        }
        return i >= setchildindicator.DigitizedCardProfile() && setchildindicator.DigitizedCardProfile() > 0;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setChildIndicatorBounds setchildindicatorbounds = (com.payair.hce.setChildIndicatorBounds) objArr[0];
        int i = RecordsJson + 59;
        AlternateContactlessPaymentDataJson = i % 128;
        boolean z = setchildindicatorbounds.writeReplace;
        if (i % 2 == 0) {
            return java.lang.Boolean.valueOf(z);
        }
        throw new java.lang.ArithmeticException();
    }

    public final boolean AlternateContactlessPaymentDataJson() {
        int i = RecordsJson;
        AlternateContactlessPaymentDataJson = (i + 47) % 128;
        boolean z = this.valueOf;
        AlternateContactlessPaymentDataJson = (i + 125) % 128;
        return z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            RecordsJson = (AlternateContactlessPaymentDataJson + 19) % 128;
            return true;
        }
        if (obj != null) {
            AlternateContactlessPaymentDataJson = (RecordsJson + 79) % 128;
            return getClass() == obj.getClass() && java.util.Arrays.equals(this.DigitizedCardProfile, ((com.payair.hce.setChildIndicatorBounds) obj).DigitizedCardProfile);
        }
        return false;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = values;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 113;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[i5] = java.lang.Integer.valueOf(iArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(i5) + 27, 29 - (android.util.TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.graphics.Color.alpha(i5));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i5] = java.lang.Integer.TYPE;
                            obj = cls.getMethod("z", clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i5] = java.lang.Integer.valueOf(iArr3[i6]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.widget.ExpandableListView.getPackedPositionType(0L), 29 - android.text.TextUtils.indexOf("", ""), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                }
                i6++;
                i3 = 2;
                i4 = 1;
                i5 = 0;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = values;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                $10 = ($11 + 111) % 128;
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj3 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 27, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                i8++;
                iArr6 = iArr2;
                length3 = i2;
            }
            iArr6 = iArr7;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            $11 = ($10 + 87) % 128;
            int i9 = 0;
            for (int i10 = 16; i9 < i10; i10 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i9];
                java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 5087 - android.view.MotionEvent.axisFromString(""), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i9++;
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
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
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.graphics.Color.alpha(0), 2923 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (3037 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(0, 0, 0, objArr7);
                obj5 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    public final int hashCode() {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (i + 83) % 128;
        RecordsJson = i2;
        java.lang.String[] strArr = this.DigitizedCardProfile;
        if (strArr != null) {
            RecordsJson = (i + 11) % 128;
            return java.util.Arrays.hashCode(strArr);
        }
        int i3 = i2 + 31;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        values = new int[]{1478096772, -1211261354, -1353048922, 1538495708, -1513917022, 1922264582, 1666962625, -1083588483, 1485834988, -1117088265, -454889452, 520445010, -1935331271, -357484366, 31131162, -2019073640, -1820079608, -1070525919};
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.RS, 5, -83, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE};
        $$b = 125;
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[]{this}, 1267174990, -1267174990, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
