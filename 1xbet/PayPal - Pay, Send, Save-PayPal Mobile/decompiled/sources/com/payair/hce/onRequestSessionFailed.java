package com.payair.hce;

/* loaded from: classes4.dex */
public final class onRequestSessionFailed {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] DigitizedCardProfile;
    private static int getAid;
    private static int writeReplace;
    private int AlternateContactlessPaymentDataJson;
    private int valueOf;
    private int values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.onRequestSessionFailed onrequestsessionfailed = (com.payair.hce.onRequestSessionFailed) objArr[0];
        getAid = (writeReplace + 99) % 128;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.clear();
        int values = onrequestsessionfailed.values() + 2000;
        if (values > 2000) {
            getAid = (writeReplace + 19) % 128;
            calendar.set(1, values);
            int i4 = onrequestsessionfailed.valueOf;
            if (i4 > 0 && i4 <= 12) {
                calendar.set(2, i4 - 1);
                int actualMaximum = calendar.getActualMaximum(5);
                int actualMinimum = calendar.getActualMinimum(5);
                int i5 = onrequestsessionfailed.values;
                if (actualMinimum <= i5 && i5 <= actualMaximum) {
                    return java.lang.Boolean.TRUE;
                }
            }
        }
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2 = (s * 3) + 66;
        int i3 = 4 - (s2 * 4);
        byte[] bArr = $$a;
        int i4 = b * 2;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            i2 = i3;
            int i5 = i4;
            i = 0;
            i3++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i3];
            i3++;
            i2 += i5;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i4) {
            }
        }
    }

    public onRequestSessionFailed(int i, int i2, int i3) {
        this.AlternateContactlessPaymentDataJson = i;
        this.valueOf = i2;
        this.values = i3;
    }

    public onRequestSessionFailed() {
        valueOf();
    }

    private void valueOf() {
        writeReplace = (getAid + 71) % 128;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.AlternateContactlessPaymentDataJson = calendar.get(1);
        this.valueOf = calendar.get(2) + 1;
        this.values = calendar.get(5);
        getAid = (writeReplace + 37) % 128;
    }

    public onRequestSessionFailed(byte[] bArr) {
        if (bArr != null) {
            java.lang.String writeReplace2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(bArr).writeReplace();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(writeReplace2.charAt(0));
            sb.append(writeReplace2.charAt(1));
            this.AlternateContactlessPaymentDataJson = java.lang.Integer.parseInt(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(writeReplace2.charAt(2));
            sb2.append(writeReplace2.charAt(3));
            this.valueOf = java.lang.Integer.parseInt(sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(writeReplace2.charAt(4));
            sb3.append(writeReplace2.charAt(5));
            this.values = java.lang.Integer.parseInt(sb3.toString());
            return;
        }
        valueOf();
    }

    private int values() {
        int i = getAid + 19;
        writeReplace = i % 128;
        if (i % 2 == 0) {
            return this.AlternateContactlessPaymentDataJson;
        }
        throw null;
    }

    private int AlternateContactlessPaymentDataJson() {
        int i = getAid;
        int i2 = i + 13;
        writeReplace = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = this.values;
        writeReplace = (i + 105) % 128;
        return i3;
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int[] iArr2;
        int i3;
        int length;
        int[] iArr3;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = DigitizedCardProfile;
        int i4 = 1;
        if (iArr4 != null) {
            int i5 = $11 + 29;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
            }
            int i6 = 0;
            while (i6 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[i4];
                    objArr2[0] = java.lang.Integer.valueOf(iArr4[i6]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.ImageFormat.getBitsPerPixel(0), 29 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.text.TextUtils.getOffsetBefore("", 0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr3[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i6++;
                    i4 = 1;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 93) % 128;
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = DigitizedCardProfile;
        if (iArr6 != null) {
            $11 = ($10 + 103) % 128;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(iArr6[i7])};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    i3 = length3;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777189) - android.graphics.Color.rgb(0, 0, 0), android.view.MotionEvent.axisFromString("") + 30, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                    i3 = length3;
                }
                iArr7[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i7++;
                iArr6 = iArr2;
                length3 = i3;
            }
            $11 = ($10 + 23) % 128;
            iArr6 = iArr7;
            i2 = 0;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr6, i2, iArr5, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 57;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.KeyEvent.keyCodeFromString(""), 5088 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i8 += 23;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i8];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 32, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 5088, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 49, android.graphics.Color.red(0) + 2923, (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3036));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b((short) 0, (short) 0, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private int RecordsJson() {
        int i = writeReplace + 99;
        getAid = i % 128;
        if (i % 2 != 0) {
            return this.valueOf;
        }
        throw null;
    }

    public final java.lang.String DigitizedCardProfile() {
        int values = values() + 2000;
        java.lang.String str = "";
        if (values < 2010) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-1667179336, -660207751}, 1 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            str = sb.toString();
            getAid = (writeReplace + 83) % 128;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append(values % 2000);
        java.lang.String obj = sb2.toString();
        if (RecordsJson() < 10) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(obj);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new int[]{-1667179336, -660207751}, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr2);
            sb3.append(((java.lang.String) objArr2[0]).intern());
            obj = sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(obj);
        sb4.append(RecordsJson());
        java.lang.String obj2 = sb4.toString();
        if (AlternateContactlessPaymentDataJson() < 10) {
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(obj2);
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a(new int[]{-1667179336, -660207751}, 1 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr3);
            sb5.append(((java.lang.String) objArr3[0]).intern());
            obj2 = sb5.toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(obj2);
        sb6.append(AlternateContactlessPaymentDataJson());
        java.lang.String obj3 = sb6.toString();
        writeReplace = (getAid + 73) % 128;
        return obj3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        writeReplace = 0;
        getAid = 1;
        DigitizedCardProfile = new int[]{2071232302, -1761903151, 1321934874, 1342220243, 1642013488, -1154777199, -1092079779, -165485222, -108621038, 198540725, -1523542717, 1356532294, -757165297, 135996178, -2058432995, 2093791472, -1529724974, 1903248091};
    }

    static void init$0() {
        $$a = new byte[]{118, 40, com.google.common.base.Ascii.SYN, 126};
        $$b = 163;
    }

    public final boolean writeReplace() {
        return ((java.lang.Boolean) DigitizedCardProfile(new java.lang.Object[]{this}, 1900086275, -1900086275, java.lang.System.identityHashCode(this))).booleanValue();
    }
}
