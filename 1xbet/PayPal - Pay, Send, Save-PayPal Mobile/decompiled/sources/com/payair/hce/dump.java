package com.payair.hce;

/* loaded from: classes4.dex */
public class dump implements com.payair.hce.useDemoMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int[] AlternateContactlessPaymentDataJson;
    private static int getProfileVersion;
    private static long valueOf;
    private static char[] values;
    private static int writeReplace;
    private com.payair.hce.checkPermission DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = 38 - (b * 34);
        int i5 = (s2 * 34) + 1;
        byte[] bArr = $$a;
        int i6 = (s * 653) + 65;
        char[] cArr = new char[i5];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i4 = (i4 + i6) - 2;
            i2 = i7 + 1;
            i = i3;
            i3 = i + 1;
            cArr[i] = (char) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = i2;
            i6 = bArr[i2];
            i4 = (i4 + i6) - 2;
            i2 = i7 + 1;
            i = i3;
            i3 = i + 1;
            cArr[i] = (char) i4;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i4 = i6;
            i2 = i4;
            i3 = i + 1;
            cArr[i] = (char) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, int i, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 33) + 66;
        int i5 = 1 - (b2 * 3);
        byte[] bArr = $$d;
        int i6 = b + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i6++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i4 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i6++;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i6++;
            if (i3 == i5) {
            }
        }
    }

    public dump() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new int[]{958040361, 1835372944, 1605260702, -2068975209}, android.graphics.Color.red(0) + 6, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.dump.class.getName());
        this.DigitizedCardProfile = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
    }

    @Override // com.payair.hce.useDemoMode
    public final com.payair.hce.reInitialize values(com.payair.hce.getDefaultCardForContactlessPayments getdefaultcardforcontactlesspayments, com.payair.hce.removeCard removecard) {
        writeReplace = (getProfileVersion + 121) % 128;
        com.payair.hce.reInitialize valueOf2 = getdefaultcardforcontactlesspayments.valueOf();
        getdefaultcardforcontactlesspayments.DigitizedCardProfile();
        getProfileVersion = (writeReplace + 41) % 128;
        return valueOf2;
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $11 = ($10 + 93) % 128;
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 47, 382 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) -1, 1, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(valueOf), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 3966 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 40222))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 35, 212 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 109) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 69) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj4 == null) {
                obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.alpha(0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.view.KeyEvent.normalizeMetaState(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void a(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AlternateContactlessPaymentDataJson;
        long j = 0;
        int i2 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(iArr3[i3]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.widget.ExpandableListView.getPackedPositionChild(j), 29 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i3] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i3++;
                    j = 0;
                    c = 0;
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
        int[] iArr6 = AlternateContactlessPaymentDataJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            $11 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int i4 = 0;
            while (i4 < length3) {
                $11 = ($10 + 77) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[i2];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i4]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.KeyEvent.normalizeMetaState(0), 29 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i4++;
                iArr6 = iArr2;
                i2 = 1;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 5) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i5 = 0;
            for (int i6 = 16; i5 < i6; i6 = 16) {
                int i7 = $11 + 71;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i5];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 5088 - android.graphics.Color.blue(0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i5 += 56;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr5[i5];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(32 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 5088, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i5++;
                }
            }
            int i8 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i8;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i9 = istransitsupported.DigitizedCardProfile;
            int i10 = istransitsupported.values;
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
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 49, android.graphics.Color.green(0) + 2923, (char) (3038 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d((byte) -1, 0, (byte) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        getProfileVersion = 1;
        AlternateContactlessPaymentDataJson = new int[]{566112093, -1251131569, 1385463748, 440079141, -499752663, 2066518865, 30302525, -1396638560, -696889760, 1930836545, -1877640476, 302783591, -1854807507, -1470999792, 1235902370, -1661292059, 1426803572, -1412811839};
        values = new char[]{24264, 44694, 48739, 36843, 40894, 61184, 64748, 52298, 56360, 11766, 15737, 3386, 6802, 27238, 58925, 5758, 1680, 14122, 10067, 22505, 17408, 29926, 25807, 38175, 34234, 46540, 41593, 53902, 49968, 62214, 58364, 4157, 26, 12488, 8477, 20899, 16847, 32361, 28299, 40661, 36697, 49049, 44082, 56385, 52451, 64781, 60862, 14085, 51035, 55214, 58918, 63091, 34509, 38177, 42375, 46565, 17467, 21683, 25848, 29524, 929, 50076, 13275, 9014, 4854, 653, 29238, 25041, 58739, 5408, 1486, 13428, 9229, 21687, 18270, 30648, 26513, 38465, 34532, 46738, 41255, 53712, 49262, 61528, 57506, 4963, 836, 13206, 8771, 21245, 17041, 32055, 28117, 40331, 35843, 48328, 44900, 57105, 24284, 44698, 48752, 36821, 40894, 61207, 64754, 52313, 56362, 11744, 11879, 56886, 52956, 65394, 61184, 40891};
        valueOf = 2397514527456603891L;
    }

    static void init$1() {
        $$d = new byte[]{117, -82, -100, com.visa.cbp.getEncExpo.onUnminimized};
        $$e = 144;
    }

    static void init$0() {
        $$a = new byte[]{88, -59, 41, 44, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0b4c, code lost:
    
        r3 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r3[0])[0] = r6 == true ? 1 : 0;
        ((int[]) r3[1])[0] = r6 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b66, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), r23, java.lang.Integer.valueOf(((((~(1007791689 | r1)) * (-560)) - 370080480) + ((~((-15224887) | (r6 == true ? 1 : 0))) * (-560))) + (((~((~(r6 == true ? 1 : 0)) | 888700471)) | 134316104) * 560))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0b9e, code lost:
    
        if (r1 != null) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0ba0, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 2712 - android.text.TextUtils.lastIndexOf(r8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getOffsetBefore(r8, 0));
        r4 = com.payair.hce.dump.$$a[14];
        r8 = (byte) (r4 - 1);
        r4 = r4;
        r11 = new java.lang.Object[1];
        b(r8, r4, r4, r11);
        r1 = r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0bfb, code lost:
    
        ((int[]) r3[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0c02, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0c03, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0c04, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0c09, code lost:
    
        if (r3 != null) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0c0b, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0c0c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0c4e, code lost:
    
        r3 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r3[0])[0] = r6 == true ? 1 : 0;
        ((int[]) r3[1])[0] = ~r6 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0c69, code lost:
    
        r4 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), 16, java.lang.Integer.valueOf((((((~((~(r6 == true ? 1 : 0)) | (-134807617))) | (~(1609169528 | (r6 == true ? 1 : 0)))) * (-302)) + 1950109536) + ((~((-134807617) | (r6 == true ? 1 : 0))) * (-604))) + (((~(1474361912 | (r6 == true ? 1 : 0))) | 1187039280) * 302))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0cae, code lost:
    
        if (r1 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0cb0, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 50, (android.os.Process.myPid() >> 22) + 2713, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
        r5 = com.payair.hce.dump.$$a[14];
        r8 = (byte) (r5 - 1);
        r5 = r5;
        r11 = new java.lang.Object[1];
        b(r8, r5, r5, r11);
        r1 = r1.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, r1);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0d0d, code lost:
    
        ((int[]) r3[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r4)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0d14, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0d15, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0d16, code lost:
    
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0d1b, code lost:
    
        if (r3 != null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0d1d, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0d1e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0da1 A[Catch: all -> 0x00d1, TryCatch #10 {all -> 0x00d1, blocks: (B:5:0x0033, B:7:0x0076, B:8:0x00bd, B:15:0x00f7, B:17:0x0150, B:18:0x0198, B:33:0x0223, B:35:0x0269, B:36:0x02b6, B:75:0x0d58, B:77:0x0da1, B:78:0x0dee), top: B:2:0x001b }] */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.nio.Buffer, java.nio.LongBuffer] */
    /* JADX WARN: Type inference failed for: r1v135, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v99, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v91, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v93, types: [int[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.nio.LongBuffer[]] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v81 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] writeReplace(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        java.lang.Object obj;
        int i4;
        java.lang.String str;
        java.nio.LongBuffer[] longBufferArr;
        int i5;
        java.lang.String intern;
        java.lang.String str2;
        java.lang.Class<?> cls;
        java.lang.String intern2;
        java.lang.Throwable th;
        java.lang.Object obj2;
        java.lang.String str3;
        int i6;
        java.lang.String[] strArr2 = strArr;
        int i7 = i;
        int i8 = 0;
        java.lang.String str4 = "";
        int i9 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i7;
                ((int[]) objArr[1])[0] = i7;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((~i7) | (-287478915))) | (~(1609013246 | i7))) * (-272)) + 1238825024 + (((~((-425956543) | i7)) | 138477628) * (-272)) + (((~(i7 | 425956542)) | 1470535618) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj4 = obj3;
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.os.Process.getGidForName("")));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b2, b3, b3, objArr3);
                    java.lang.reflect.Method method = cls2.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method);
                    obj4 = method;
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i7;
                ((int[]) objArr4[1])[0] = i7 ^ 4;
                int i10 = ~i7;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((-610967645) | i10)) | 67796996 | (~((-1285524517) | i10))) * (-1136)) + 1067247744 + (((~((-610967645) | i7)) | (~((-1285524517) | i7)) | (~(1828695164 | i10))) * (-568)) + (((~(i10 | 610967644)) | (~(1285524516 | i10)) | (~(i7 | (-67796997)))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                java.lang.Object obj6 = obj5;
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2713 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    byte b4 = $$a[14];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    b(b5, b6, b6, objArr6);
                    java.lang.reflect.Method method2 = cls3.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method2);
                    obj6 = method2;
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr2.length;
            ?? r7 = new java.nio.LongBuffer[length];
            int i11 = 0;
            ?? r6 = 0;
            while (i11 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i11].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i9];
                a(new int[]{-2085515875, 891195337}, android.graphics.Color.rgb(i8, i8, i8) + 16777217, objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i8]).intern(), str4);
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                java.lang.Object obj7 = r6;
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i8, 16), 16).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    str3 = str4;
                    i6 = length;
                    r7[i11] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i7;
                        ((int[]) objArr8[1])[0] = i7 ^ 3;
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((-208674829) | i7) * (-627)) + 1291135488 + (((~((-848234484) | i7)) | 1048257677) * (-627)) + (((~(i7 | 1048257677)) | (~((~i7) | 848234483))) * 627))};
                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj9 = obj8;
                        if (obj8 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2713 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.view.KeyEvent.keyCodeFromString(str4));
                            byte b7 = $$a[14];
                            byte b8 = (byte) (b7 - 1);
                            byte b9 = b7;
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b(b8, b9, b9, objArr10);
                            java.lang.reflect.Method method3 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method3);
                            obj9 = method3;
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    i6 = length;
                    str3 = str4;
                    r7[i11] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i11++;
                strArr2 = strArr;
                i7 = i;
                r6 = obj7;
                length = i6;
                str4 = str3;
                i8 = 0;
                i9 = 1;
            }
            java.lang.Object obj10 = r6;
            java.lang.String str5 = str4;
            int i12 = length;
            if (context == null) {
                try {
                    java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                    r6 = i;
                    ((int[]) objArr11[0])[0] = r6;
                    ((int[]) objArr11[1])[0] = r6;
                    try {
                        java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), obj10, java.lang.Integer.valueOf(((r3 * 495) - 473681135) + (((~((~r6) | 677317562)) | 134938754) * 495))};
                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        java.lang.Object obj12 = obj11;
                        if (obj11 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                            byte b10 = $$a[14];
                            byte b11 = (byte) (b10 - 1);
                            byte b12 = b10;
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b(b11, b12, b12, objArr13);
                            java.lang.reflect.Method method4 = cls5.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method4);
                            obj12 = method4;
                        }
                        ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr12)).intValue();
                        int i13 = writeReplace + 99;
                        getProfileVersion = i13 % 128;
                        if (i13 % 2 != 0) {
                            return objArr11;
                        }
                        throw null;
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable unused) {
                    r6 = i;
                    r7 = -1347122530;
                    java.lang.Object[] objArr14 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr14[0])[0] = r6;
                    ((int[]) objArr14[1])[0] = r6 ^ 2;
                    int i14 = ~r6;
                    java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i14 | (-862646046))) | 39895580) | (~(1033846115 | i14))) * 464) - 271053984) + (((-822750466) | r6) * (-464)) + (((~(1033846115 | r6)) | 39895580) * 464))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                    java.lang.Object obj13 = obj;
                    if (obj == null) {
                    }
                    ((int[]) objArr14[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj13).invoke(null, objArr15)).intValue();
                    return objArr14;
                }
            }
            r6 = i;
            byte[][] bArr = new byte[i12][];
            int i15 = 0;
            int i16 = 0;
            while (i15 < i12) {
                ?? r11 = r7[i15];
                if (r11.capacity() == 4) {
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                    java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                    long[] array = r11.array();
                    int length3 = array.length;
                    int i17 = 0;
                    while (i17 < length3) {
                        int i18 = length3;
                        getProfileVersion = (writeReplace + 53) % 128;
                        java.lang.Object obj14 = obj10;
                        asLongBuffer.put(array[i17]);
                        i17++;
                        obj10 = obj14;
                        length3 = i18;
                    }
                    obj2 = obj10;
                    bArr[i16] = allocate.array();
                    i16++;
                } else {
                    obj2 = obj10;
                }
                i15++;
                obj10 = obj2;
            }
            java.lang.Object obj15 = obj10;
            if (i16 > 0) {
                int currentTimeMillis = 343337308 ^ ((int) java.lang.System.currentTimeMillis());
                try {
                    java.lang.Object[] objArr16 = {java.lang.Integer.valueOf((r6 == true ? 1 : 0) ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i16)};
                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                    java.lang.Object obj17 = obj16;
                    if (obj16 == null) {
                        try {
                            java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf(str5, str5, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 430, (char) (android.text.TextUtils.lastIndexOf(str5, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31611));
                            byte b13 = $$a[14];
                            byte b14 = (byte) (b13 - 1);
                            java.lang.Object[] objArr17 = new java.lang.Object[1];
                            b(b13, b14, b14, objArr17);
                            java.lang.reflect.Method method5 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, method5);
                            obj17 = method5;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            java.lang.Throwable cause2 = th.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th;
                        }
                    }
                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr16)).longValue();
                    long j = ~longValue3;
                    long j2 = r6 == true ? 1L : 0L;
                    long j3 = ~j2;
                    longBufferArr = r7;
                    i4 = i12;
                    long j4 = (longValue3 * (-1917)) + 100958847360L + (((~(j2 | 105165466)) | (~(j | j3))) * 959) + ((-959) * j) + (((~(j3 | 105165466)) | (~(j | j2))) * 959) + 828735241;
                    int i19 = ~(r6 == true ? 1 : 0);
                    int i20 = currentTimeMillis ^ ((((int) (j4 >> 32)) & (((((~((-735145689) | i19)) | 713042520) * (-160)) + 1219105866) + (((~(2122595196 | i19)) | (-735145689)) * 160))) | (((int) j4) & ((((((~((-16884097) | i19)) | (~((-1646942733) | (r6 == true ? 1 : 0)))) * (-302)) - 1758848185) + ((~((-16884097) | (r6 == true ? 1 : 0))) * (-604))) + (((~((-1663826829) | (r6 == true ? 1 : 0))) | (-1873543151)) * 302))));
                    if ((i2 & 1) == 1) {
                        writeReplace = (getProfileVersion + 59) % 128;
                        if ((i20 ^ (r6 == true ? 1 : 0)) == 15) {
                            try {
                                java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr18[0])[0] = r6 == true ? 1 : 0;
                                ((int[]) objArr18[1])[0] = i20;
                                try {
                                    java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((~(1558853378 | (r6 == true ? 1 : 0))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 9270820 + (((~(i19 | 1558853378)) | 336213250) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                    try {
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        java.lang.Object obj19 = obj18;
                                        if (obj18 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str5, 0, 0) + 50, 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.graphics.Color.red(0));
                                            byte b15 = $$a[14];
                                            byte b16 = (byte) (b15 - 1);
                                            byte b17 = b15;
                                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                                            b(b16, b17, b17, objArr20);
                                            java.lang.reflect.Method method6 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method6);
                                            obj19 = method6;
                                        }
                                        ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj19).invoke(null, objArr19)).intValue();
                                        return objArr18;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        java.lang.Throwable th5 = th;
                                        java.lang.Throwable cause3 = th5.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th5;
                                    }
                                } catch (java.lang.Throwable th6) {
                                    th = th6;
                                }
                            } catch (java.lang.Throwable unused2) {
                                r7 = -1347122530;
                            }
                        }
                    }
                    str = str5;
                    r7 = -1347122530;
                    int i21 = i20 ^ (r6 == true ? 1 : 0);
                    if (i21 == 0) {
                        java.lang.Object[] objArr21 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr21[0])[0] = r6 == true ? 1 : 0;
                        ((int[]) objArr21[1])[0] = i20;
                        try {
                            java.lang.Object[] objArr22 = {java.lang.Integer.valueOf(i3), obj15, java.lang.Integer.valueOf(((((~((-836478434) | i19)) | (~((-1060013728) | (r6 == true ? 1 : 0)))) * 1900) - 179762816) + (((~(1060013727 | i19)) | (~(836478433 | (r6 == true ? 1 : 0)))) * (-950)) + (((~(i19 | 836478433)) | (~(1060013727 | (r6 == true ? 1 : 0)))) * 950))};
                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj21 = obj20;
                            if (obj20 == null) {
                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.Color.argb(0, 0, 0, 0) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                byte b18 = $$a[14];
                                byte b19 = (byte) (b18 - 1);
                                byte b20 = b18;
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                b(b19, b20, b20, objArr23);
                                java.lang.reflect.Method method7 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method7);
                                obj21 = method7;
                            }
                            ((int[]) objArr21[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr22)).intValue();
                            return objArr21;
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause4 = th7.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th7;
                        }
                    }
                    r7 = -1347122530;
                    if (i21 == 11) {
                        writeReplace = (getProfileVersion + 125) % 128;
                        java.lang.Object[] objArr24 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr24[0])[0] = r6 == true ? 1 : 0;
                        ((int[]) objArr24[1])[0] = i20;
                        try {
                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~((-17973762) | i19)) | (-1878518400)) | (~(1192389135 | (r6 == true ? 1 : 0)))) * (-68)) - 1242192248) + ((~((-686129265) | i19)) * (-68)) + (((~(i19 | (-1192389136))) | (-704103026)) * 68))};
                            java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            java.lang.Object obj23 = obj22;
                            if (obj22 == null) {
                                java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.keyCodeFromString(str), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                byte b21 = $$a[14];
                                byte b22 = (byte) (b21 - 1);
                                byte b23 = b21;
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                b(b22, b23, b23, objArr26);
                                java.lang.reflect.Method method8 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, method8);
                                obj23 = method8;
                            }
                            ((int[]) objArr24[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr25)).intValue();
                            return objArr24;
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause5 = th8.getCause();
                            if (cause5 != null) {
                                throw cause5;
                            }
                            throw th8;
                        }
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                }
                java.lang.Object[] objArr142 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr142[0])[0] = r6;
                ((int[]) objArr142[1])[0] = r6 ^ 2;
                int i142 = ~r6;
                java.lang.Object[] objArr152 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i142 | (-862646046))) | 39895580) | (~(1033846115 | i142))) * 464) - 271053984) + (((-822750466) | r6) * (-464)) + (((~(1033846115 | r6)) | 39895580) * 464))};
                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                java.lang.Object obj132 = obj;
                if (obj == null) {
                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2713 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.View.MeasureSpec.getMode(0));
                    byte b24 = $$a[14];
                    byte b25 = (byte) (b24 - 1);
                    byte b26 = b24;
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    b(b25, b26, b26, objArr27);
                    java.lang.reflect.Method method9 = cls10.getMethod((java.lang.String) objArr27[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r7, method9);
                    obj132 = method9;
                }
                ((int[]) objArr142[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj132).invoke(null, objArr152)).intValue();
                return objArr142;
            }
            i4 = i12;
            str = str5;
            longBufferArr = r7;
            r7 = -1347122530;
            try {
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                a(new int[]{-965135022, 691618600, 654415507, 1499597470, -2128259396, 1144142328, 1223736614, -591081358, 1655863264, -248055629, 1731895876, 2030984852}, 24 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr28);
                java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr28[0]).intern());
                java.lang.Object[] objArr29 = new java.lang.Object[1];
                a(new int[]{956562105, 244514798, 1465257396, -1052089505, 922748960, -2140686323, 459871510, -1922444616, -552216555, 541934732}, 17 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr29);
                java.lang.Object invoke = cls11.getMethod(((java.lang.String) objArr29[0]).intern(), null).invoke(context, null);
                getProfileVersion = (writeReplace + 119) % 128;
                try {
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    a(new int[]{-965135022, 691618600, 654415507, 1499597470, -2128259396, 1144142328, 1223736614, -591081358, 1655863264, -248055629, 1731895876, 2030984852}, 23 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr30);
                    java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                    c(android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) android.view.Gravity.getAbsoluteGravity(0, 0), 13 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr31);
                    try {
                        java.lang.Object[] objArr32 = {cls12.getMethod(((java.lang.String) objArr31[0]).intern(), null).invoke(context, null), 64};
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        c(14 - android.graphics.Color.red(0), (char) (47331 - android.view.View.MeasureSpec.getMode(0)), android.text.TextUtils.getOffsetAfter(str, 0) + 33, objArr33);
                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr33[0]).intern());
                        java.lang.Object[] objArr34 = new java.lang.Object[1];
                        c(android.text.TextUtils.indexOf(str, str) + 47, (char) (android.graphics.Color.green(0) + 27085), 15 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr34);
                        java.lang.Object invoke2 = cls13.getMethod(((java.lang.String) objArr34[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr32);
                        int i22 = i4;
                        int i23 = 0;
                        loop3: while (true) {
                            if (i23 >= i22) {
                                break;
                            }
                            java.nio.LongBuffer longBuffer = longBufferArr[i23];
                            if (longBuffer.capacity() == 4) {
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c(62 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.normalizeMetaState(0) + 40288), 6 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr35);
                                intern = ((java.lang.String) objArr35[0]).intern();
                                i5 = 0;
                            } else {
                                i5 = 0;
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                a(new int[]{1428063166, 782002764}, android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 4, objArr36);
                                intern = ((java.lang.String) objArr36[0]).intern();
                            }
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            c(((android.os.Process.getThreadPriority(i5) + 20) >> 6) + 68, (char) (48061 - android.text.TextUtils.indexOf(str, str)), android.view.Gravity.getAbsoluteGravity(i5, i5) + 30, objArr37);
                            java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr37[0]).intern());
                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 98, (char) android.graphics.Color.argb(0, 0, 0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, objArr38);
                            java.lang.Object[] objArr39 = (java.lang.Object[]) cls14.getField(((java.lang.String) objArr38[0]).intern()).get(invoke2);
                            int length4 = objArr39.length;
                            int i24 = 0;
                            while (i24 < length4) {
                                int i25 = writeReplace + 49;
                                getProfileVersion = i25 % 128;
                                if (i25 % 2 == 0) {
                                    java.lang.Object obj24 = objArr39[i24];
                                    throw new java.lang.NullPointerException();
                                }
                                java.lang.Object obj25 = objArr39[i24];
                                try {
                                    java.lang.Object obj26 = invoke2;
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    a(new int[]{1215775643, 507782344, 1784351548, -498233840, -622532426, -2120789397, 1304378165, -917647066, 661196660, -1512258641, 182464923, 1618322774, 798340321, 962721301}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26, objArr40);
                                    java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr40[0]).intern());
                                    int i26 = i22;
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    a(new int[]{-755268307, 242333969, 305080140, 1048413407, -1713873509, 1057046732}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr41);
                                    java.lang.Object invoke3 = cls15.getMethod(((java.lang.String) objArr41[0]).intern(), java.lang.String.class).invoke(null, intern);
                                    int i27 = writeReplace + 71;
                                    getProfileVersion = i27 % 128;
                                    if (i27 % 2 == 0) {
                                        try {
                                            str2 = intern;
                                            java.lang.Object[] objArr42 = new java.lang.Object[1];
                                            a(new int[]{-965135022, 691618600, 654415507, 1499597470, -2128259396, 1144142328, 1223736614, -591081358, -819406645, 874498103, 823245147, -190807881, 821641971, 868416274}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 14, objArr42);
                                            cls = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                                            java.lang.Object[] objArr43 = new java.lang.Object[1];
                                            a(new int[]{-1146839888, -598405265, 1582389719, -1371429681, 915570924, 92537998}, 12 >> android.view.View.combineMeasuredStates(1, 0), objArr43);
                                            intern2 = ((java.lang.String) objArr43[0]).intern();
                                        } catch (java.lang.Throwable th10) {
                                            java.lang.Throwable cause6 = th10.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th10;
                                        }
                                    } else {
                                        str2 = intern;
                                        java.lang.Object[] objArr44 = new java.lang.Object[1];
                                        a(new int[]{-965135022, 691618600, 654415507, 1499597470, -2128259396, 1144142328, 1223736614, -591081358, -819406645, 874498103, 823245147, -190807881, 821641971, 868416274}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 29, objArr44);
                                        cls = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                        java.lang.Object[] objArr45 = new java.lang.Object[1];
                                        a(new int[]{-1146839888, -598405265, 1582389719, -1371429681, 915570924, 92537998}, 11 - android.view.View.combineMeasuredStates(0, 0), objArr45);
                                        intern2 = ((java.lang.String) objArr45[0]).intern();
                                    }
                                    try {
                                        java.lang.Object[] objArr46 = {cls.getMethod(intern2, null).invoke(obj25, null)};
                                        java.lang.Object[] objArr47 = new java.lang.Object[1];
                                        a(new int[]{1215775643, 507782344, 1784351548, -498233840, -622532426, -2120789397, 1304378165, -917647066, 661196660, -1512258641, 182464923, 1618322774, 798340321, 962721301}, 28 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr47);
                                        java.lang.Class<?> cls16 = java.lang.Class.forName(((java.lang.String) objArr47[0]).intern());
                                        int i28 = length4;
                                        java.lang.Object[] objArr48 = new java.lang.Object[1];
                                        c((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 108, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 28844), 6 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr48);
                                        if (java.nio.ByteBuffer.wrap((byte[]) cls16.getMethod(((java.lang.String) objArr48[0]).intern(), byte[].class).invoke(invoke3, objArr46)).asLongBuffer().equals(longBuffer.rewind())) {
                                            break loop3;
                                        }
                                        i24++;
                                        invoke2 = obj26;
                                        intern = str2;
                                        i22 = i26;
                                        length4 = i28;
                                    } catch (java.lang.Throwable th11) {
                                        java.lang.Throwable cause7 = th11.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th11;
                                    }
                                } catch (java.lang.Throwable th12) {
                                    java.lang.Throwable cause8 = th12.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th12;
                                }
                            }
                            i23++;
                            i22 = i22;
                            java.lang.Object[] objArr1422 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr1422[0])[0] = r6;
                            ((int[]) objArr1422[1])[0] = r6 ^ 2;
                            int i1422 = ~r6;
                            java.lang.Object[] objArr1522 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((((~(i1422 | (-862646046))) | 39895580) | (~(1033846115 | i1422))) * 464) - 271053984) + (((-822750466) | r6) * (-464)) + (((~(1033846115 | r6)) | 39895580) * 464))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r7);
                            java.lang.Object obj1322 = obj;
                            if (obj == null) {
                            }
                            ((int[]) objArr1422[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj1322).invoke(null, objArr1522)).intValue();
                            return objArr1422;
                        }
                    } catch (java.lang.Throwable th13) {
                        java.lang.Throwable cause9 = th13.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th13;
                    }
                } catch (java.lang.Throwable th14) {
                    java.lang.Throwable cause10 = th14.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th14;
                }
            } catch (java.lang.Throwable th15) {
                java.lang.Throwable cause11 = th15.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th15;
            }
        } catch (java.lang.Throwable th16) {
            java.lang.Throwable cause12 = th16.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th16;
        }
    }
}
