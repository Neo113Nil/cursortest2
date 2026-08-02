package com.payair.hce;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DigitizedCardProfile' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes10.dex */
public final class isSuccessful {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static com.payair.hce.isSuccessful AlternateContactlessPaymentDataJson;
    public static final com.payair.hce.isSuccessful DigitizedCardProfile;
    private static int RecordsJson;
    private static int getAid;
    private static com.payair.hce.isSuccessful valueOf;
    private static final /* synthetic */ com.payair.hce.isSuccessful[] values;
    private static int[] writeReplace;

    private static void b(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3 = 4 - (s * 2);
        int i4 = i2 * 4;
        byte[] bArr = $$a;
        int i5 = (i * 4) + 66;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 += -i3;
            i3++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i5;
            if (i7 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i8 = i3;
            i5 += -bArr[i3];
            i3 = i8 + 1;
            i6 = i7;
        }
    }

    private isSuccessful(java.lang.String str, int i) {
    }

    public static com.payair.hce.isSuccessful valueOf(java.lang.String str) {
        RecordsJson = (getAid + 105) % 128;
        com.payair.hce.isSuccessful issuccessful = (com.payair.hce.isSuccessful) java.lang.Enum.valueOf(com.payair.hce.isSuccessful.class, str);
        int i = getAid + 41;
        RecordsJson = i % 128;
        if (i % 2 == 0) {
            return issuccessful;
        }
        throw null;
    }

    public static com.payair.hce.isSuccessful[] values() {
        RecordsJson = (getAid + 53) % 128;
        com.payair.hce.isSuccessful[] issuccessfulArr = (com.payair.hce.isSuccessful[]) values.clone();
        getAid = (RecordsJson + 107) % 128;
        return issuccessfulArr;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        RecordsJson = 0;
        getAid = 1;
        AlternateContactlessPaymentDataJson();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{-2113517758, -1539079440, -1679949368, 995373695, -1741802331, -1693085242, 1729671142, -78301875, 1562596280, 520520683, 211097447, -299026255}, android.graphics.Color.alpha(0) + 24, objArr);
        com.payair.hce.isSuccessful issuccessful = new com.payair.hce.isSuccessful(((java.lang.String) objArr[0]).intern(), 0);
        DigitizedCardProfile = issuccessful;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(new int[]{457380921, -677722281, 910189947, 532364537, 1768407614, 734117948, 416051003, 1323388960, -1868066628, -74260913, -1729477050, 1473471125}, android.graphics.Color.alpha(0) + 22, objArr2);
        AlternateContactlessPaymentDataJson = new com.payair.hce.isSuccessful(((java.lang.String) objArr2[0]).intern(), 1);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        a(new int[]{31264101, -2086311830, -929282977, -960783460, -1829310898, 725426280, 960477588, -768000327, 56409894, -1624701020, 966939332, 511961889, -242931541, -1534812050, 937992209, -1425153012, -1106716222, -738622713}, 33 - (android.os.Process.myPid() >> 22), objArr3);
        com.payair.hce.isSuccessful issuccessful2 = new com.payair.hce.isSuccessful(((java.lang.String) objArr3[0]).intern(), 2);
        valueOf = issuccessful2;
        values = new com.payair.hce.isSuccessful[]{issuccessful, AlternateContactlessPaymentDataJson, issuccessful2};
        int i = getAid + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeReplace;
        int i2 = 1;
        int i3 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                $10 = ($11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), android.text.TextUtils.getOffsetBefore("", i3) + 29, (char) (android.view.MotionEvent.axisFromString("") + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    i3 = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = writeReplace;
        float f = 0.0f;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                $11 = ($10 + 81) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[i2];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > f ? 1 : (android.media.AudioTrack.getMinVolume() == f ? 0 : -1)) + 27, 29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
                f = 0.0f;
                i2 = 1;
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
            for (int i6 = 0; i6 < 16; i6++) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 5088 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.graphics.Color.green(0))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
            }
            int i7 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i7;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i8 = istransitsupported.DigitizedCardProfile;
            int i9 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 49, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2923, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 3037));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(0, (short) 0, 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            c = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static void AlternateContactlessPaymentDataJson() {
        writeReplace = new int[]{-510283230, -1997169015, -2061197844, -1853506544, -385553300, -1473825059, 1552618515, -1769046536, 593938426, -603682083, -717589026, 524989300, -804991945, -1397488080, -1714464081, 408526039, -971550960, -1608163723};
    }

    static void init$0() {
        $$a = new byte[]{108, -72, 46, 57};
        $$b = 201;
    }
}
