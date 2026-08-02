package com.payair.hce;

/* loaded from: classes4.dex */
final class setSubtitleTextColor implements java.util.Enumeration {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int DigitizedCardProfile;
    private static int[] valueOf;
    private static int values;
    private com.payair.hce.setMinHeight AlternateContactlessPaymentDataJson;
    private java.lang.Object writeReplace = DigitizedCardProfile();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 3 - (s3 * 3);
        int i4 = 66 - (s * 3);
        int i5 = (s2 * 2) + 1;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            int i6 = i3;
            i2 = 0;
            i4 += -i3;
            i3 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i6 = i7;
            i3 = bArr[i7];
            i4 += -i3;
            i3 = i6;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public setSubtitleTextColor(byte[] bArr) {
        this.AlternateContactlessPaymentDataJson = new com.payair.hce.setMinHeight(bArr, (byte) 0);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        int i = values + 121;
        int i2 = i % 128;
        DigitizedCardProfile = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (this.writeReplace == null) {
            return false;
        }
        values = (i2 + 45) % 128;
        return true;
    }

    @Override // java.util.Enumeration
    public final java.lang.Object nextElement() {
        int i = values + 117;
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            java.lang.Object obj = this.writeReplace;
            this.writeReplace = DigitizedCardProfile();
            int i2 = values + 29;
            DigitizedCardProfile = i2 % 128;
            if (i2 % 2 == 0) {
                return obj;
            }
            throw null;
        }
        this.writeReplace = DigitizedCardProfile();
        throw null;
    }

    private java.lang.Object DigitizedCardProfile() {
        values = (DigitizedCardProfile + 125) % 128;
        try {
            com.payair.hce.setEms DigitizedCardProfile2 = this.AlternateContactlessPaymentDataJson.DigitizedCardProfile();
            int i = DigitizedCardProfile + 77;
            values = i % 128;
            if (i % 2 != 0) {
                return DigitizedCardProfile2;
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new int[]{-655692517, -1442170194, -2035405219, 304059559, -772750204, -857978605, 1338997942, -1605637868, 1929204401, -531364464, -1225230358, 2104792121, 1521795787, -911702138}, 27 - android.view.MotionEvent.axisFromString(""), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new com.payair.hce.setLines(sb.toString(), e);
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        java.lang.String str;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = valueOf;
        java.lang.String str2 = "";
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $11 + 83;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[i5] = java.lang.Integer.valueOf(iArr4[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.alpha(i5), android.os.Process.getGidForName("") + 30, (char) android.view.View.MeasureSpec.makeMeasureSpec(i5, i5));
                            java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                            clsArr[i5] = java.lang.Integer.TYPE;
                            obj = cls.getMethod("z", clsArr);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                        }
                        iArr5[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                        i6 %= 1;
                        i3 = 2;
                        i4 = 1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i5] = java.lang.Integer.valueOf(iArr4[i6]);
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 28, 30 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr5[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i6++;
                    i3 = 2;
                    i4 = 1;
                    i5 = 0;
                }
            }
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = valueOf;
        if (iArr7 != null) {
            int i8 = $10 + 17;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr7[i2])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj3 == null) {
                    iArr3 = iArr7;
                    str = str2;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 21, android.text.TextUtils.lastIndexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 30, (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                } else {
                    iArr3 = iArr7;
                    str = str2;
                }
                iArr2[i2] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                i2++;
                iArr7 = iArr3;
                str2 = str;
            }
            iArr7 = iArr2;
        }
        char c = 0;
        java.lang.System.arraycopy(iArr7, 0, iArr6, 0, length3);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr6);
            int i9 = 0;
            while (i9 < 16) {
                int i10 = $11 + 103;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i9];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 5088 - android.view.View.resolveSize(0, 0), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i9 += 28;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr6[i9];
                    java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj5 == null) {
                        obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.green(0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 5088, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj5);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i9++;
                }
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr6[16];
            istransitsupported.DigitizedCardProfile ^= iArr6[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr6);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj6 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 50, 2923 - android.graphics.Color.red(0), (char) (3037 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b((short) 0, (short) 0, (short) 0, objArr8);
                obj6 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
            c = 0;
        }
        java.lang.String str3 = new java.lang.String(cArr2, 0, i);
        $11 = ($10 + 3) % 128;
        objArr[0] = str3;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        DigitizedCardProfile = 0;
        values = 1;
        valueOf = new int[]{80440180, 126534650, -1301778721, -725732509, -571671351, 113234057, 1168404463, -15610602, -1266143935, 1109897945, 618251446, 782435063, 806811873, 125077318, -1188591491, 304041210, 681903804, 14633558};
    }

    static void init$0() {
        $$a = new byte[]{125, -89, 109, 76};
        $$b = 34;
    }
}
