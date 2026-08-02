package com.payair.hce;

/* loaded from: classes4.dex */
public final class openFileOutput extends com.payair.hce.deleteFile {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int RecordsJson;
    private static char[] values;
    private static long writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "transactionCredentialsStatus")
    private com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] valueOf;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2 = 718 - (b2 * 653);
        int i3 = b * 34;
        int i4 = 37 - (s * 34);
        byte[] bArr = $$a;
        char[] cArr = new char[i3 + 1];
        if (bArr == null) {
            int i5 = i3;
            int i6 = i4;
            int i7 = 0;
            int i8 = (i5 + i4) - 2;
            i = i7;
            int i9 = i6;
            i2 = i8;
            i4 = i9;
            cArr[i] = (char) i2;
            if (i == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i10 = i4 + 1;
            int i11 = i2;
            i6 = i10;
            i4 = bArr[i10];
            i7 = i + 1;
            i5 = i11;
            int i82 = (i5 + i4) - 2;
            i = i7;
            int i92 = i6;
            i2 = i82;
            i4 = i92;
            cArr[i] = (char) i2;
            if (i == i3) {
            }
        } else {
            i = 0;
            cArr[i] = (char) i2;
            if (i == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, byte b, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = 3 - (b * 3);
        int i6 = (i2 * 2) + 99;
        int i7 = 1 - (i * 4);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5++;
            i8 = bArr[i5];
            i6 += -i8;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i7) {
            }
        }
    }

    public openFileOutput(java.lang.String str, com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr) {
        super(str);
        this.valueOf = singleUseKeyStatusArr;
    }

    public final com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] values() {
        int i = AlternateContactlessPaymentDataJson + 95;
        RecordsJson = i % 128;
        com.mastercard.mpsdk.componentinterface.SingleUseKeyStatus[] singleUseKeyStatusArr = this.valueOf;
        if (i % 2 != 0) {
            return singleUseKeyStatusArr;
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String toString() {
        RecordsJson = (AlternateContactlessPaymentDataJson + 69) % 128;
        java.lang.String simpleName = getClass().getSimpleName();
        int i = RecordsJson + 9;
        AlternateContactlessPaymentDataJson = i % 128;
        if (i % 2 == 0) {
            return simpleName;
        }
        throw null;
    }

    private static void b(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            int i2 = $11 + 47;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $10 = ($11 + 83) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 1921 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, 9, (byte) 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 28, 429 - android.view.KeyEvent.getDeadChar(0, 0), (char) (31609 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d(0, 10, (byte) 0, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
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
        objArr[0] = new java.lang.String(writeReplace2, 4, writeReplace2.length - 4);
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(values[i + getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 48, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 382, (char) (android.widget.ExpandableListView.getPackedPositionType(0L) + 62388));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 35, 3967 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), 211 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 48, 381 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(writeReplace), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 35, android.view.KeyEvent.getDeadChar(0, 0) + 3966, (char) (40223 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 34, 260 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $10 + 69;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 34, 211 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.View.MeasureSpec.getMode(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.view.View.getDefaultSize(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
        }
        java.lang.String str = new java.lang.String(cArr);
        int i7 = $10 + 79;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AlternateContactlessPaymentDataJson = 0;
        RecordsJson = 1;
        DigitizedCardProfile = 8572085440113210075L;
        values = new char[]{24264, 4422, 49603, 45147, 24830, 54128, 33676, 29210, 8872, 38182, 17818, 13770, 58449, 21714, 1888, 63486, 42525, 60150, 42360, 30205, 1125, 54464, 26446, 14258, 50724, 38550, 8472, 61856, 33275, 20583, 57570, 17671, 2690, 55911, 62466, 48001, 27423, 6837, 51772, 31158, 10575, 55449, 34912, 16352, 61301, 40723, 20118, 65041, 44479, 23929, 3283, 48194, 25493, 4951, 49906, 29308, 8704, 53654, 33060, 12458, 57362, 38857, 18261, 63184, 32108, 13050, 57952, 37845, 17230, 61655, 40994, 20921, 282, 46720, 24261, 4418, 49601, 45162, 24753, 54112, 33666, 29208, 8890, 38193, 17854, 13791, 58438, 21661, 1866, 63486, 42524, 5776, 51478, 47532, 26682, 55447, 35022, 31580, 11242, 39536, 19171, 54918, 39173, 18843, 14385, 59576, 23346, 3019, 64029, 43748, 7524, 52721, 48535, 27666, 56469, 36667, 32765, 11863, 40646, 16657, 12752, 57470, 20732, 129, 62226, 41907, 4670, 49837, 46406, 24283, 4428, 49653, 45170, 24811, 54134, 33702, 29193, 8893, 38178, 17838, 9389, 27436, 48054, 51720, 6794, 43265};
        writeReplace = -825537647267868381L;
    }

    static void init$1() {
        $$d = new byte[]{98, -72, 105, -100};
        $$e = 87;
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0b4c, code lost:
    
        com.payair.hce.openFileOutput.AlternateContactlessPaymentDataJson = (com.payair.hce.openFileOutput.RecordsJson + 55) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0b55, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0b68, code lost:
    
        ((int[]) r2[1])[0] = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0b6c, code lost:
    
        r1 = ~r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0b6e, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), 0, java.lang.Integer.valueOf((((((~((-1857637579) | r1)) | (~((-38854583) | r31))) * 1900) - 179762816) + (((~(38854582 | r1)) | (~(1857637578 | r31))) * (-950))) + (((~(r1 | 1857637578)) | (~(38854582 | r31))) * 950))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0bb4, code lost:
    
        if (r1 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0bb6, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
        r4 = com.payair.hce.openFileOutput.$$a[14];
        r9 = new java.lang.Object[1];
        a(r4, r4, r4, r9);
        r1 = r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0c11, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0c18, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0c19, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0c1a, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0c1f, code lost:
    
        if (r2 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0c21, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0c22, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0c74, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0c87, code lost:
    
        ((int[]) r2[1])[0] = r31 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0c8d, code lost:
    
        r1 = ~(1032175853 | r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0c93, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r33), 16, java.lang.Integer.valueOf(((((((~((-1032175854) | r31)) | 830750849) | (~((-864316308) | r31))) * (-880)) + 67314816) + ((((~((-1032175854) | (~r31))) | 864316307) | r1) * (-880))) + (r1 * 880))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0cd8, code lost:
    
        if (r1 != null) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0cda, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2713, (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
        r4 = com.payair.hce.openFileOutput.$$a[14];
        r9 = new java.lang.Object[1];
        a(r4, r4, r4, r9);
        r1 = r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0d33, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0d3a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0d3b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0d3c, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0d41, code lost:
    
        if (r2 != null) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0d43, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0d44, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0a09 A[Catch: all -> 0x0c6f, TRY_LEAVE, TryCatch #8 {all -> 0x0c6f, blocks: (B:208:0x09a2, B:214:0x09bf, B:219:0x09ef, B:221:0x0a09, B:287:0x097e, B:291:0x0997), top: B:213:0x09bf }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0807 A[Catch: all -> 0x0d63, TryCatch #0 {all -> 0x0d63, blocks: (B:63:0x03e9, B:68:0x03f6, B:70:0x03fd, B:71:0x03fe, B:87:0x0408, B:89:0x0412, B:91:0x041b, B:95:0x043f, B:97:0x0449, B:99:0x0456, B:105:0x045f, B:122:0x05b5, B:130:0x0643, B:134:0x064c, B:136:0x0653, B:137:0x0654, B:145:0x066d, B:153:0x0714, B:157:0x071d, B:159:0x0724, B:160:0x0725, B:167:0x0741, B:175:0x07e6, B:179:0x07ef, B:181:0x07f6, B:182:0x07f7, B:196:0x0948, B:202:0x095e, B:206:0x0965, B:232:0x0b3a, B:238:0x0b68, B:246:0x0c11, B:250:0x0c1a, B:252:0x0c21, B:253:0x0c22, B:234:0x0c23, B:257:0x0c38, B:259:0x0c3f, B:260:0x0c40, B:266:0x0c42, B:268:0x0c4b, B:269:0x0c4c, B:272:0x0c4e, B:274:0x0c57, B:275:0x0c58, B:295:0x0c87, B:303:0x0d33, B:307:0x0d3c, B:309:0x0d43, B:310:0x0d44, B:314:0x0d46, B:316:0x0d4d, B:317:0x0d4e, B:321:0x0d50, B:323:0x0d57, B:324:0x0d58, B:327:0x0d5a, B:329:0x0d61, B:330:0x0d62, B:336:0x0801, B:338:0x0807, B:339:0x0808, B:170:0x0746, B:172:0x078f, B:173:0x07d8, B:298:0x0c93, B:300:0x0cda, B:301:0x0d25, B:225:0x0a63, B:192:0x08dd, B:125:0x05bf, B:127:0x05f1, B:128:0x0635, B:223:0x0a0b, B:190:0x0863, B:318:0x08a2, B:241:0x0b6e, B:243:0x0bb6, B:244:0x0c03, B:185:0x080c, B:148:0x0672, B:150:0x06ba, B:151:0x0706), top: B:46:0x0325, inners: #6, #15, #19, #21, #22, #23, #24, #26, #27, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0808 A[Catch: all -> 0x0d63, TRY_LEAVE, TryCatch #0 {all -> 0x0d63, blocks: (B:63:0x03e9, B:68:0x03f6, B:70:0x03fd, B:71:0x03fe, B:87:0x0408, B:89:0x0412, B:91:0x041b, B:95:0x043f, B:97:0x0449, B:99:0x0456, B:105:0x045f, B:122:0x05b5, B:130:0x0643, B:134:0x064c, B:136:0x0653, B:137:0x0654, B:145:0x066d, B:153:0x0714, B:157:0x071d, B:159:0x0724, B:160:0x0725, B:167:0x0741, B:175:0x07e6, B:179:0x07ef, B:181:0x07f6, B:182:0x07f7, B:196:0x0948, B:202:0x095e, B:206:0x0965, B:232:0x0b3a, B:238:0x0b68, B:246:0x0c11, B:250:0x0c1a, B:252:0x0c21, B:253:0x0c22, B:234:0x0c23, B:257:0x0c38, B:259:0x0c3f, B:260:0x0c40, B:266:0x0c42, B:268:0x0c4b, B:269:0x0c4c, B:272:0x0c4e, B:274:0x0c57, B:275:0x0c58, B:295:0x0c87, B:303:0x0d33, B:307:0x0d3c, B:309:0x0d43, B:310:0x0d44, B:314:0x0d46, B:316:0x0d4d, B:317:0x0d4e, B:321:0x0d50, B:323:0x0d57, B:324:0x0d58, B:327:0x0d5a, B:329:0x0d61, B:330:0x0d62, B:336:0x0801, B:338:0x0807, B:339:0x0808, B:170:0x0746, B:172:0x078f, B:173:0x07d8, B:298:0x0c93, B:300:0x0cda, B:301:0x0d25, B:225:0x0a63, B:192:0x08dd, B:125:0x05bf, B:127:0x05f1, B:128:0x0635, B:223:0x0a0b, B:190:0x0863, B:318:0x08a2, B:241:0x0b6e, B:243:0x0bb6, B:244:0x0c03, B:185:0x080c, B:148:0x0672, B:150:0x06ba, B:151:0x0706), top: B:46:0x0325, inners: #6, #15, #19, #21, #22, #23, #24, #26, #27, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0dbb A[Catch: all -> 0x00d5, TryCatch #25 {all -> 0x00d5, blocks: (B:5:0x0036, B:7:0x0081, B:8:0x00c1, B:15:0x0106, B:17:0x0133, B:18:0x0175, B:33:0x01fe, B:35:0x0248, B:36:0x0292, B:79:0x0d7e, B:81:0x0dbb, B:82:0x0e06), top: B:2:0x001d }] */
    /* JADX WARN: Type inference failed for: r1v111 */
    /* JADX WARN: Type inference failed for: r1v132 */
    /* JADX WARN: Type inference failed for: r1v160 */
    /* JADX WARN: Type inference failed for: r1v209 */
    /* JADX WARN: Type inference failed for: r1v223 */
    /* JADX WARN: Type inference failed for: r1v224 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] DigitizedCardProfile(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        int i4;
        java.lang.Object obj;
        int i5;
        java.lang.Object invoke;
        int i6;
        int i7;
        java.lang.String str;
        int i8;
        java.lang.String intern;
        int length;
        int i9;
        java.lang.Throwable th;
        java.lang.Throwable cause;
        java.lang.String str2;
        java.nio.LongBuffer[] longBufferArr;
        java.lang.Integer num;
        int i10;
        java.lang.String str3;
        java.lang.String[] strArr2 = strArr;
        java.lang.String str4 = "ᗼ뗯ꗛᖝ㎙渺ꦏﰀෳ⯾脯쒼╟͘饅굆岹窹\uf0ff땼琿刘젅鶆汹䩯⎿";
        java.lang.Integer num2 = -1347122530;
        char c = 0;
        java.lang.String str5 = "";
        int i11 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i;
                ((int[]) objArr[1])[0] = i;
                int i12 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~(i12 | 1640960837)) | (~((-255531324) | i))) * (-1808)) - 696305360) + (((~(i12 | 1878989695)) | (~((-17502466) | i))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN) + (((~(i12 | 255531323)) | (~(i | (-1640960838))) | 238028858) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.os.Process.myTid() >> 22));
                    byte b = $$a[14];
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b, b, b, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj2);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                AlternateContactlessPaymentDataJson = (RecordsJson + 43) % 128;
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i;
                ((int[]) objArr4[1])[0] = i ^ 4;
                int i13 = ~(927643502 | i);
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((250987132 | i13) * (-658)) - 2099681768) + ((i13 | 146096144) * 658))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, 2714 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.view.KeyEvent.keyCodeFromString(""));
                    byte b2 = $$a[14];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b2, b2, b2, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj3);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length2 = strArr2.length;
            java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length2];
            int i14 = 0;
            while (i14 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i14].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i11];
                b("횔撣\udf5a횮츣", android.view.ViewConfiguration.getTouchSlop() >> 8, objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[c]).intern(), str5);
                int i15 = length2;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                java.lang.String str6 = str4;
                long longValue2 = new java.math.BigInteger(replaceAll.substring(0, 16), 16).longValue();
                int length3 = replaceAll.length();
                if (length3 == 32) {
                    num = num2;
                    i10 = i15;
                    str3 = str5;
                    longBufferArr2[i14] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length3 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i;
                        ((int[]) objArr8[1])[0] = i ^ 3;
                        int i16 = ~i;
                        int i17 = ~(497083641 | i16);
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1399408519 | i16)) | 209756280) * (-1188)) + 466454470 + (((~(i | (-1399408520))) | 209756280 | i17) * 594) + (((~(i16 | (-1399408520))) | 1112081158 | i17) * 594))};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), android.graphics.ImageFormat.getBitsPerPixel(0) + 2714, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                            byte b3 = $$a[14];
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(b3, b3, b3, objArr10);
                            obj4 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj4);
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr9)).intValue();
                        int i18 = RecordsJson + 23;
                        AlternateContactlessPaymentDataJson = i18 % 128;
                        if (i18 % 2 == 0) {
                            return objArr8;
                        }
                        throw null;
                    }
                    str3 = str5;
                    num = num2;
                    i10 = i15;
                    longBufferArr2[i14] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i14++;
                strArr2 = strArr;
                str4 = str6;
                str5 = str3;
                num2 = num;
                length2 = i10;
                c = 0;
                i11 = 1;
            }
            java.lang.String str7 = str4;
            java.lang.Integer num3 = num2;
            java.lang.String str8 = str5;
            int i19 = length2;
            if (context != null) {
                num2 = num3;
                byte[][] bArr = new byte[i19][];
                int i20 = 0;
                int i21 = 0;
                while (i20 < i19) {
                    java.nio.LongBuffer longBuffer = longBufferArr2[i20];
                    if (longBuffer.capacity() == 4) {
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                        long[] array = longBuffer.array();
                        int length4 = array.length;
                        RecordsJson = (AlternateContactlessPaymentDataJson + 91) % 128;
                        int i22 = 0;
                        while (i22 < length4) {
                            RecordsJson = (AlternateContactlessPaymentDataJson + 71) % 128;
                            java.nio.LongBuffer[] longBufferArr3 = longBufferArr2;
                            asLongBuffer.put(array[i22]);
                            i22++;
                            longBufferArr2 = longBufferArr3;
                        }
                        longBufferArr = longBufferArr2;
                        bArr[i21] = allocate.array();
                        i21++;
                    } else {
                        longBufferArr = longBufferArr2;
                    }
                    i20++;
                    longBufferArr2 = longBufferArr;
                }
                java.nio.LongBuffer[] longBufferArr4 = longBufferArr2;
                if (i21 > 0) {
                    int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                    try {
                        java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i21)};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                        if (obj5 == null) {
                            try {
                                str2 = str8;
                                try {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 429, (char) (31609 - android.text.TextUtils.indexOf(str2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                    byte b4 = (byte) ($$a[14] - 1);
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    a(b4, b4, b4, objArr12);
                                    obj5 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj5);
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                th = th;
                                cause = th.getCause();
                                if (cause != null) {
                                }
                            }
                        } else {
                            str2 = str8;
                        }
                        try {
                            long j = ~((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr11)).longValue();
                            long j2 = i;
                            str8 = str2;
                            long j3 = ~j2;
                            i5 = i19;
                            long j4 = ((r8 * (-978)) - 684381439840L) + ((~(j | j3)) * 979) + (((-698348408) | j2) * (-979)) + (((~(j | j2)) | (~(j3 | (-698348408)))) * 979) + 1632249115;
                            int i23 = ~i;
                            int i24 = ((((int) (j4 >> 32)) & (((((((~(353269535 | i23)) | (-2143223776)) | (~(1790495946 | i23))) * 464) - 288002614) + (((-1789954241) | i) * (-464))) + (((~(1790495946 | i)) | (-2143223776)) * 464))) | (((int) j4) & ((((((-2121252543) | r8) * (-476)) - 1994544639) + ((~((-332821) | i)) * 952)) + ((~((-332821) | i23)) * 476)))) ^ currentTimeMillis;
                            try {
                                if ((i2 & 1) == 1) {
                                    int i25 = RecordsJson + 117;
                                    AlternateContactlessPaymentDataJson = i25 % 128;
                                    if (i25 % 2 == 0 ? (i24 ^ i) == 15 : (i24 ^ i) == 81) {
                                        java.lang.Object[] objArr13 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr13[0])[0] = i;
                                        ((int[]) objArr13[1])[0] = i24;
                                        int i26 = ~(1127919281 | i23);
                                        try {
                                            java.lang.Object[] objArr14 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf(((1110475312 | i26) * (-970)) + 1279972758 + ((i26 | 17443969) * 970))};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                            if (obj6 == null) {
                                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, 2713 - android.graphics.Color.argb(0, 0, 0, 0), (char) android.view.View.combineMeasuredStates(0, 0));
                                                byte b5 = $$a[14];
                                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                                a(b5, b5, b5, objArr15);
                                                obj6 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj6);
                                            }
                                            ((int[]) objArr13[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr14)).intValue();
                                            return objArr13;
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause2 = th4.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th4;
                                        }
                                    }
                                }
                                int i27 = i24 ^ i;
                                if (i27 == 0) {
                                    try {
                                        java.lang.Object[] objArr16 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr16[0])[0] = i;
                                        ((int[]) objArr16[1])[0] = i24;
                                        try {
                                            java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-1521900129) | i23)) | 1218709568) * 98) - 45691936) + (((~(i23 | (-374592033))) | (-1521900129) | (~(374592032 | i))) * (-49)) + (((~((-1521900129) | i)) | (-1593301601)) * 49))};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                            if (obj7 == null) {
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                                byte b6 = $$a[14];
                                                java.lang.Object[] objArr18 = new java.lang.Object[1];
                                                a(b6, b6, b6, objArr18);
                                                obj7 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj7);
                                            }
                                            ((int[]) objArr16[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr17)).intValue();
                                            return objArr16;
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause3 = th5.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th5;
                                        }
                                    } catch (java.lang.Throwable unused) {
                                        i4 = 1;
                                    }
                                } else if (i27 == 11) {
                                    java.lang.Object[] objArr19 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr19[0])[0] = i;
                                    ((int[]) objArr19[1])[0] = i24;
                                    try {
                                        java.lang.Object[] objArr20 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~(1097744916 | i23)) | 798747244) * (-328)) + 105514208 + ((798747244 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE) + (((~(i23 | 1879042684)) | (~((-1097744917) | i)) | 17449476) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE))};
                                        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                        if (obj8 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) android.graphics.Color.green(0));
                                            byte b7 = $$a[14];
                                            java.lang.Object[] objArr21 = new java.lang.Object[1];
                                            a(b7, b7, b7, objArr21);
                                            obj8 = cls7.getMethod((java.lang.String) objArr21[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj8);
                                        }
                                        ((int[]) objArr19[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr20)).intValue();
                                        return objArr19;
                                    } catch (java.lang.Throwable th6) {
                                        java.lang.Throwable cause4 = th6.getCause();
                                        if (cause4 != null) {
                                            throw cause4;
                                        }
                                        throw th6;
                                    }
                                }
                            } catch (java.lang.Throwable unused2) {
                                i4 = 1;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            th = th;
                            cause = th.getCause();
                            if (cause != null) {
                            }
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                    }
                    i4 = 1;
                    java.lang.Object[] objArr22 = {new int[i4], new int[i4], new int[i4]};
                    ((int[]) objArr22[0])[0] = i;
                    ((int[]) objArr22[i4])[0] = i ^ 2;
                    java.lang.Object[] objArr23 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((~i) | 717007276)) | (-1862118397)) * 529) + 118498594 + (((~(i | 717007276)) | (-1179484885)) * 529))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                    if (obj == null) {
                        java.lang.String str9 = str8;
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 51, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2713, (char) android.text.TextUtils.getCapsMode(str9, 0, 0));
                        byte b8 = $$a[14];
                        java.lang.Object[] objArr24 = new java.lang.Object[1];
                        a(b8, b8, b8, objArr24);
                        obj = cls8.getMethod((java.lang.String) objArr24[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num2, obj);
                    }
                    ((int[]) objArr22[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr23)).intValue();
                    return objArr22;
                }
                i5 = i19;
                try {
                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                    b(str7, android.view.View.MeasureSpec.getMode(0), objArr25);
                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr25[0]).intern());
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    c(android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.Process.myPid() >> 22) + 17, objArr26);
                    java.lang.Object invoke2 = cls9.getMethod(((java.lang.String) objArr26[0]).intern(), null).invoke(context, null);
                    int i28 = AlternateContactlessPaymentDataJson + 25;
                    RecordsJson = i28 % 128;
                    try {
                        if (i28 % 2 == 0) {
                            java.lang.Object[] objArr27 = new java.lang.Object[1];
                            b(str7, android.graphics.Color.blue(1), objArr27);
                            java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                            b("絞嵛쪡紹\udb26\u20c7웥닟敟썀\uee5a討䷹\uebe6\uf61f\ue3ae㐓鈆", android.os.Process.myPid() >>> 62, objArr28);
                            i7 = 2;
                            invoke = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                            i6 = 67;
                        } else {
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            b(str7, android.graphics.Color.blue(0), objArr29);
                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            b("絞嵛쪡紹\udb26\u20c7웥닟敟썀\uee5a討䷹\uebe6\uf61f\ue3ae㐓鈆", android.os.Process.myPid() >> 22, objArr30);
                            invoke = cls11.getMethod(((java.lang.String) objArr30[0]).intern(), null).invoke(context, null);
                            i6 = 64;
                            i7 = 2;
                        }
                        try {
                            java.lang.Object[] objArr31 = new java.lang.Object[i7];
                            objArr31[1] = java.lang.Integer.valueOf(i6);
                            objArr31[0] = invoke;
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            b("\ue5d0\ua7eb罢\ue5b1↝怺猶\uf200\ufddf㧺宖쪼핳ᅜ䏼ꍆ겕梽⩆뭼萠䀞ዼ鎢鱑塰酪汳矷뿖\ue15f䓓伞露징岷⚢", android.graphics.Color.blue(0), objArr32);
                            java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                            c((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 17, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 46141), 14 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr33);
                            java.lang.Object invoke3 = cls12.getMethod(((java.lang.String) objArr33[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke2, objArr31);
                            int i29 = i5;
                            int i30 = 0;
                            i4 = invoke3;
                            loop3: while (true) {
                                try {
                                    if (i30 >= i29) {
                                        break;
                                    }
                                    java.nio.LongBuffer longBuffer2 = longBufferArr4[i30];
                                    try {
                                        try {
                                            try {
                                                if (longBuffer2.capacity() == 4) {
                                                    int i31 = AlternateContactlessPaymentDataJson + 87;
                                                    RecordsJson = i31 % 128;
                                                    if (i31 % 2 != 0) {
                                                        try {
                                                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                            b("煭抁᳐焾\ue4d1\uf27eႡ怛椿ﳌ㡶", android.view.View.resolveSizeAndState(0, 0, 0), objArr34);
                                                            intern = ((java.lang.String) objArr34[0]).intern();
                                                            str = str8;
                                                            i8 = 0;
                                                            java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                            c(android.view.View.MeasureSpec.getSize(i8) + 34, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 43724), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, objArr35);
                                                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr35[0]).intern());
                                                            int i32 = i29;
                                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                            c(64 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 9137), 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr36);
                                                            java.lang.Object[] objArr37 = (java.lang.Object[]) cls13.getField(((java.lang.String) objArr36[0]).intern()).get(i4);
                                                            length = objArr37.length;
                                                            i9 = 0;
                                                            java.lang.Object obj9 = i4;
                                                            while (i9 < length) {
                                                                java.lang.Object obj10 = objArr37[i9];
                                                                try {
                                                                    java.lang.Object obj11 = obj9;
                                                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                                    java.lang.Object[] objArr39 = objArr37;
                                                                    c(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 74, (char) android.graphics.Color.blue(0), 27 - android.view.View.resolveSize(0, 0), objArr38);
                                                                    java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                                    b("៰\ue542\uef50ភ挿쭖\ue314套\u0ffe等쮴憟❞叹폅", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr40);
                                                                    java.lang.Object invoke4 = cls14.getMethod(((java.lang.String) objArr40[0]).intern(), java.lang.String.class).invoke(null, intern);
                                                                    try {
                                                                        java.lang.String str10 = intern;
                                                                        int i33 = length;
                                                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                                        c(102 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.os.Process.getGidForName(str) + 34889), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, objArr41);
                                                                        java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr41[0]).intern());
                                                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                                        c(128 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 12, objArr42);
                                                                        java.lang.Object invoke5 = cls15.getMethod(((java.lang.String) objArr42[0]).intern(), null).invoke(obj10, null);
                                                                        AlternateContactlessPaymentDataJson = (RecordsJson + 47) % 128;
                                                                        try {
                                                                            java.lang.Object[] objArr43 = {invoke5};
                                                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                                            c((android.view.KeyEvent.getMaxKeyCode() >> 16) + 74, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27, objArr44);
                                                                            java.lang.Class<?> cls16 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                                                            str8 = str;
                                                                            try {
                                                                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                                                c(140 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 31334), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5, objArr45);
                                                                                if (java.nio.ByteBuffer.wrap((byte[]) cls16.getMethod(((java.lang.String) objArr45[0]).intern(), byte[].class).invoke(invoke4, objArr43)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                                                    break loop3;
                                                                                }
                                                                                i9++;
                                                                                obj9 = obj11;
                                                                                objArr37 = objArr39;
                                                                                intern = str10;
                                                                                length = i33;
                                                                                str = str8;
                                                                            } catch (java.lang.Throwable th9) {
                                                                                th = th9;
                                                                                java.lang.Throwable th10 = th;
                                                                                java.lang.Throwable cause5 = th10.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th10;
                                                                            }
                                                                        } catch (java.lang.Throwable th11) {
                                                                            th = th11;
                                                                        }
                                                                    } catch (java.lang.Throwable th12) {
                                                                        java.lang.Throwable cause6 = th12.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th12;
                                                                    }
                                                                } catch (java.lang.Throwable th13) {
                                                                    java.lang.Throwable cause7 = th13.getCause();
                                                                    if (cause7 != null) {
                                                                        throw cause7;
                                                                    }
                                                                    throw th13;
                                                                }
                                                            }
                                                            str8 = str;
                                                            i30++;
                                                            i29 = i32;
                                                            i4 = obj9;
                                                        } catch (java.lang.Throwable unused3) {
                                                            i4 = 1;
                                                        }
                                                    }
                                                }
                                                java.lang.Object[] objArr362 = new java.lang.Object[1];
                                                c(64 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 9137), 11 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr362);
                                                java.lang.Object[] objArr372 = (java.lang.Object[]) cls13.getField(((java.lang.String) objArr362[0]).intern()).get(i4);
                                                length = objArr372.length;
                                                i9 = 0;
                                                java.lang.Object obj92 = i4;
                                                while (i9 < length) {
                                                }
                                                str8 = str;
                                                i30++;
                                                i29 = i32;
                                                i4 = obj92;
                                            } catch (java.lang.Throwable unused4) {
                                                str8 = str;
                                                i4 = 1;
                                            }
                                            c(android.view.View.MeasureSpec.getSize(i8) + 34, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 43724), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30, objArr35);
                                            java.lang.Class<?> cls132 = java.lang.Class.forName(((java.lang.String) objArr35[0]).intern());
                                            int i322 = i29;
                                        } catch (java.lang.Throwable unused5) {
                                            str8 = str;
                                        }
                                        java.lang.Object[] objArr352 = new java.lang.Object[1];
                                    } catch (java.lang.Throwable unused6) {
                                        str8 = str;
                                        i4 = 1;
                                    }
                                    str = str8;
                                    i8 = 0;
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    c(30 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (7141 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3, objArr46);
                                    intern = ((java.lang.String) objArr46[0]).intern();
                                } catch (java.lang.Throwable unused7) {
                                }
                                i4 = 1;
                                java.lang.Object[] objArr222 = {new int[i4], new int[i4], new int[i4]};
                                ((int[]) objArr222[0])[0] = i;
                                ((int[]) objArr222[i4])[0] = i ^ 2;
                                java.lang.Object[] objArr232 = {java.lang.Integer.valueOf(i3), 16, java.lang.Integer.valueOf((((~((~i) | 717007276)) | (-1862118397)) * 529) + 118498594 + (((~(i | 717007276)) | (-1179484885)) * 529))};
                                obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num2);
                                if (obj == null) {
                                }
                                ((int[]) objArr222[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr232)).intValue();
                                return objArr222;
                            }
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause8 = th14.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th14;
                        }
                    } catch (java.lang.Throwable th15) {
                        java.lang.Throwable cause9 = th15.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th15;
                    }
                } catch (java.lang.Throwable th16) {
                    java.lang.Throwable cause10 = th16.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th16;
                }
            }
            try {
                java.lang.Object[] objArr47 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr47[0])[0] = i;
                try {
                    ((int[]) objArr47[1])[0] = i;
                    int i34 = ~i;
                    try {
                        java.lang.Object[] objArr48 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((~((-738299953) | i)) | r4) * 590) - 1675286264) + (((~((-1123569487) | i34)) | 1088946764 | (~(772922674 | i34))) * (-1180)) + (((~(i34 | (-772922675))) | (~(1123569486 | i34))) * 590))};
                        try {
                            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(num3);
                            if (obj12 == null) {
                                java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2714 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                byte b9 = $$a[14];
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                a(b9, b9, b9, objArr49);
                                obj12 = cls17.getMethod((java.lang.String) objArr49[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(num3, obj12);
                            }
                            ((int[]) objArr47[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr48)).intValue();
                            return objArr47;
                        } catch (java.lang.Throwable th17) {
                            th = th17;
                            java.lang.Throwable th18 = th;
                            java.lang.Throwable cause11 = th18.getCause();
                            if (cause11 != null) {
                                throw cause11;
                            }
                            throw th18;
                        }
                    } catch (java.lang.Throwable th19) {
                        th = th19;
                    }
                } catch (java.lang.Throwable unused8) {
                    num2 = num3;
                }
            } catch (java.lang.Throwable unused9) {
                num2 = num3;
                i4 = 1;
            }
        } catch (java.lang.Throwable th20) {
            java.lang.Throwable cause12 = th20.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th20;
        }
    }

    static void init$0() {
        $$a = new byte[]{5, -77, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -4, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 192;
    }
}
