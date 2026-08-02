package com.payair.hce;

/* loaded from: classes4.dex */
public final class sdkTooOldNeedReset implements com.payair.hce.postInitializationCleanup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static long DigitizedCardProfile;
    private static int[] valueOf;
    private static int writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 38 - (b3 * 34);
        int i4 = (b2 * 653) + 65;
        int i5 = 35 - (b * 34);
        char[] cArr = new char[i5];
        if (bArr == null) {
            i4 = i5;
            int i6 = i3;
            i2 = 0;
            i3++;
            i4 = (i4 + i6) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i6 = bArr[i3];
            i3++;
            i4 = (i4 + i6) - 2;
            i = i2;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            cArr[i] = (char) i4;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (s * 3);
        int i5 = i + 66;
        int i6 = (s2 * 4) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i5 = i6;
            i6++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i6];
            i6++;
            i5 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void DigitizedCardProfile(com.payair.hce.setSelectedCard setselectedcard) {
        AlternateContactlessPaymentDataJson = (writeReplace + 83) % 128;
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void writeReplace(com.payair.hce.replenishToken replenishtoken, java.lang.Exception exc) {
        writeReplace = (AlternateContactlessPaymentDataJson + 105) % 128;
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void DigitizedCardProfile(java.lang.Exception exc) {
        writeReplace = (AlternateContactlessPaymentDataJson + 115) % 128;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        $11 = (i2 + 35) % 128;
        if (str != null) {
            $11 = (i2 + 75) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace2 = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace2.length) {
            $11 = ($10 + 73) % 128;
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i3 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace2[getcardholdervalidator.valueOf] ^ writeReplace2[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1921 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((short) 0, (short) 0, 51, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.red(0), 429 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (31610 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    d((short) 0, (short) 0, 53, objArr5);
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

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        int i2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        int i3 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = valueOf;
        int i4 = 1;
        int i5 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 75;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[i4];
                        objArr2[i5] = java.lang.Integer.valueOf(iArr3[i6]);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 28, 28 - (android.widget.ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)), (char) android.view.View.getDefaultSize(i5, i5));
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
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 'M' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                    }
                    iArr4[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                    i6++;
                    i5 = 0;
                }
                i3 = 2;
                i4 = 1;
            }
            iArr3 = iArr4;
        }
        int length2 = iArr3.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = valueOf;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 45;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(iArr6[i8])};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.widget.ExpandableListView.getPackedPositionChild(0L), 30 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj3);
                    }
                    iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    throw new java.lang.ArithmeticException();
                }
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(iArr6[i8])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj4 == null) {
                    iArr2 = iArr6;
                    i2 = length3;
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 27, 28 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj4);
                } else {
                    iArr2 = iArr6;
                    i2 = length3;
                }
                iArr7[i8] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                i8++;
                iArr6 = iArr2;
                length3 = i2;
            }
            iArr6 = iArr7;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            $10 = ($11 + 49) % 128;
            cArr[0] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                $10 = ($11 + 59) % 128;
                istransitsupported.DigitizedCardProfile ^= iArr5[i10];
                java.lang.Object[] objArr6 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.view.KeyEvent.getDeadChar(0, 0), 5088 - android.graphics.Color.red(0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj5);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr6)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i10++;
                $11 = ($10 + 3) % 128;
            }
            int i12 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i12;
            istransitsupported.values ^= iArr5[16];
            istransitsupported.DigitizedCardProfile ^= iArr5[17];
            int i13 = istransitsupported.DigitizedCardProfile;
            int i14 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr5);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr7 = {istransitsupported, istransitsupported};
            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj6 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.widget.ExpandableListView.getPackedPositionChild(0L), 2923 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (3038 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                d((short) 0, (short) 0, 0, objArr8);
                obj6 = cls2.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj6);
            }
            ((java.lang.reflect.Method) obj6).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        writeReplace = 0;
        AlternateContactlessPaymentDataJson = 1;
        valueOf = new int[]{-2041979471, -1008729081, 1519523254, 519404002, 506761709, -1715165528, 453492080, -50821651, -923501231, -1509540257, -811857364, -160571850, 1845992280, -202776158, -1792750253, 2127901318, 1988385159, -388985020};
        DigitizedCardProfile = -8051729535478612877L;
    }

    static void init$1() {
        $$d = new byte[]{82, -59, -67, 97};
        $$e = 205;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0a59, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r6;
        ((int[]) r0[1])[0] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0a72, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r30), 0, java.lang.Integer.valueOf(((((~(736870511 | r6)) | (-1879043200)) * 305) + 506016610) + (((~(736870511 | (~r6))) | (-1159621650)) * 305))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0aa7, code lost:
    
        if (r1 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0aa9, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
        r3 = com.payair.hce.sdkTooOldNeedReset.$$a[14];
        r5 = (byte) (r3 - 1);
        r9 = new java.lang.Object[1];
        a(r5, r5, r3, r9);
        r1 = r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0b03, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0b0a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0b0b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0b0c, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0b10, code lost:
    
        if (r1 != null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0b12, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0b13, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0b47, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r6;
        ((int[]) r0[1])[0] = r6 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0b62, code lost:
    
        r2 = new java.lang.Object[]{java.lang.Integer.valueOf(r30), r8, java.lang.Integer.valueOf((((((~((-839922833) | r6)) | (~((~r6) | 1056569328))) * (-318)) + 629631424) + (((~(909719440 | r6)) | 146849888) * (-318))) + (((~((-909719441) | r6)) | (-986772721)) * 318))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0ba5, code lost:
    
        if (r1 != null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0ba7, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
        r3 = com.payair.hce.sdkTooOldNeedReset.$$a[14];
        r5 = (byte) (r3 - 1);
        r9 = new java.lang.Object[1];
        a(r5, r5, r3, r9);
        r1 = r1.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0c01, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r2)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0c08, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0c09, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0c0a, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0c0e, code lost:
    
        if (r1 != null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0c10, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0c11, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0c85 A[Catch: all -> 0x00d9, TryCatch #17 {all -> 0x00d9, blocks: (B:5:0x0040, B:7:0x0082, B:8:0x00c6, B:15:0x00f8, B:17:0x012f, B:18:0x0171, B:33:0x01fc, B:35:0x0241, B:36:0x0289, B:69:0x0c48, B:71:0x0c85, B:72:0x0cce), top: B:2:0x0020 }] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v112, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v16, types: [long] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[][]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        ?? r4;
        java.lang.Object obj;
        int i4;
        java.lang.String str;
        java.lang.Object obj2;
        java.nio.LongBuffer[] longBufferArr;
        long[] array;
        int length;
        java.nio.LongBuffer longBuffer;
        java.nio.ByteBuffer byteBuffer;
        java.lang.Integer num;
        java.lang.String[] strArr2 = strArr;
        int i5 = i;
        java.lang.Integer num2 = 16;
        int i6 = 0;
        int i7 = 1;
        try {
            if (context == null) {
                AlternateContactlessPaymentDataJson = (writeReplace + 25) % 128;
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i5;
                ((int[]) objArr[1])[0] = i5;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf((((~((-67928066) | (~i5))) | (~(1828564095 | i5))) * (-272)) + 1764728160 + (((~((-79536216) | i5)) | 11608150) * (-272)) + (((~(i5 | 79536215)) | 1816955945) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b2, b2, b, objArr3);
                    obj3 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i5;
                ((int[]) objArr4[1])[0] = i5 ^ 4;
                int i8 = ~i5;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((~(515390399 | i8)) * (-560)) + 1363550432 + ((~(i5 | (-1078050881))) * (-560)) + (((~(i8 | 1381101761)) | 212339518) * 560))};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2713 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.KeyEvent.getDeadChar(0, 0));
                    byte b3 = $$a[14];
                    byte b4 = (byte) (b3 - 1);
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b4, b4, b3, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length2 = strArr2.length;
            java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length2];
            int i9 = 0;
            while (i9 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i9].toLowerCase();
                java.lang.Object[] objArr7 = new java.lang.Object[i7];
                b(new int[]{1164091998, 382879124}, 1 - android.view.KeyEvent.getDeadChar(i6, i6), objArr7);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr7[i6]).intern(), "");
                int i10 = length2;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                long longValue2 = new java.math.BigInteger(replaceAll.substring(i6, 16), 16).longValue();
                int length3 = replaceAll.length();
                if (length3 == 32) {
                    num = num2;
                    longBufferArr2[i9] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length3 != 64) {
                        java.lang.Object[] objArr8 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr8[0])[0] = i5;
                        ((int[]) objArr8[1])[0] = i5 ^ 3;
                        int i11 = ~i5;
                        java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i3), num2, java.lang.Integer.valueOf(((i5 | 1895147646) * 614) + 2017214748 + (((~((-276818558) | i11)) | 276146300 | (~(1619673603 | i11))) * (-1228)) + (((~(i11 | (-672258))) | (~(1895819903 | i11))) * 614))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) android.view.View.combineMeasuredStates(0, 0));
                            byte b5 = $$a[14];
                            byte b6 = (byte) (b5 - 1);
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            a(b6, b6, b5, objArr10);
                            obj5 = cls3.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr8[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr9)).intValue();
                        return objArr8;
                    }
                    num = num2;
                    longBufferArr2[i9] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i9++;
                strArr2 = strArr;
                i5 = i;
                num2 = num;
                length2 = i10;
                i6 = 0;
                i7 = 1;
            }
            java.lang.Integer num3 = num2;
            int i12 = length2;
            if (context == null) {
                writeReplace = (AlternateContactlessPaymentDataJson + 93) % 128;
                try {
                    java.lang.Object[] objArr11 = {new int[1], new int[1], new int[1]};
                    i6 = i;
                    ((int[]) objArr11[0])[0] = i6;
                    ((int[]) objArr11[1])[0] = i6;
                    try {
                        java.lang.Object[] objArr12 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((~(1606528301 | i6)) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 1031829076 + (((~(1606528301 | (~i6))) | 289418497) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                        java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj6 == null) {
                            java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 51, 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf("", ""));
                            byte b7 = $$a[14];
                            byte b8 = (byte) (b7 - 1);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            a(b8, b8, b7, objArr13);
                            obj6 = cls4.getMethod((java.lang.String) objArr13[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                        }
                        ((int[]) objArr11[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr12)).intValue();
                        return objArr11;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable unused) {
                    i6 = i;
                    r4 = -1347122530;
                    java.lang.Object[] objArr14 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr14[0])[0] = i6;
                    ((int[]) objArr14[1])[0] = i6 ^ 2;
                    java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf(((((~(1193171918 | i6)) | (-703320243)) * (-465)) - 278227246) + (((~((-703320243) | i6)) | 1193171918) * 930) + (((-685867057) | i6) * 465))};
                    obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
                    if (obj == null) {
                    }
                    ((int[]) objArr14[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr15)).intValue();
                    return objArr14;
                }
            }
            i6 = i;
            r4 = new byte[i12][];
            int i13 = 0;
            int i14 = 0;
            while (i13 < i12) {
                java.nio.LongBuffer longBuffer2 = longBufferArr2[i13];
                if (longBuffer2.capacity() == 4) {
                    int i15 = writeReplace + 27;
                    AlternateContactlessPaymentDataJson = i15 % 128;
                    if (i15 % 2 == 0) {
                        byteBuffer = java.nio.ByteBuffer.allocate(59);
                        longBuffer = byteBuffer.asLongBuffer();
                        array = longBuffer2.array();
                        length = array.length;
                    } else {
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                        array = longBuffer2.array();
                        length = array.length;
                        longBuffer = asLongBuffer;
                        byteBuffer = allocate;
                    }
                    int i16 = 0;
                    while (i16 < length) {
                        int i17 = length;
                        writeReplace = (AlternateContactlessPaymentDataJson + 105) % 128;
                        java.nio.LongBuffer[] longBufferArr3 = longBufferArr2;
                        longBuffer.put(array[i16]);
                        i16++;
                        longBufferArr2 = longBufferArr3;
                        length = i17;
                    }
                    longBufferArr = longBufferArr2;
                    r4[i14] = byteBuffer.array();
                    writeReplace = (AlternateContactlessPaymentDataJson + 115) % 128;
                    i14++;
                } else {
                    longBufferArr = longBufferArr2;
                }
                i13++;
                longBufferArr2 = longBufferArr;
            }
            java.nio.LongBuffer[] longBufferArr4 = longBufferArr2;
            if (i14 > 0) {
                int currentTimeMillis = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                try {
                    ?? r11 = {java.lang.Integer.valueOf(i6 ^ currentTimeMillis), r4, java.lang.Integer.valueOf(i14)};
                    java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                    if (obj7 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), android.view.KeyEvent.keyCodeFromString("") + 429, (char) (31610 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)));
                        byte b9 = $$a[14];
                        java.lang.Object[] objArr16 = new java.lang.Object[1];
                        a(b9, b9, (byte) (b9 - 1), objArr16);
                        obj7 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj7);
                    }
                    r4 = ((java.lang.Long) ((java.lang.reflect.Method) obj7).invoke(null, r11)).longValue();
                    long j = ~r4;
                    long j2 = (~i6) | (-782590795);
                    i4 = i12;
                    long j3 = (242 * r4) + 377991353502L + (((~j2) | (~(j | (-782590795)))) * (-241)) + ((782590794 | r4) * (-482)) + (((~(782590794 | j)) | (~(r4 | j2))) * 241) + 151309913;
                    int i18 = ~i6;
                    int i19 = currentTimeMillis ^ ((((int) j3) & (((((~((-1141002241) | i18)) | (~(1999372237 | i6))) * 988) - 1435892611) + ((((~((-1999370889) | i6)) | 858368648) | (~(1999372237 | i18))) * 988))) | (((int) (j3 >> 32)) & ((((~((-268470341) | i18)) * 130) + 171107106) + (((~((-268470341) | i6)) | 1095835648) * 130))));
                    if ((i2 & 1) != 1 || (i19 ^ i6) != 15) {
                        r4 = -1347122530;
                        int i20 = i19 ^ i6;
                        if (i20 == 0) {
                            java.lang.Object[] objArr17 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr17[0])[0] = i6;
                            ((int[]) objArr17[1])[0] = i19;
                            try {
                                java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i3), 0, java.lang.Integer.valueOf(((((-1610681393) | i18) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 236837104) + (((~(277127246 | i18)) | (-1879125117)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE))};
                                java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj8 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf("", "", 0), 2712 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.graphics.Color.green(0));
                                    byte b10 = $$a[14];
                                    byte b11 = (byte) (b10 - 1);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(b11, b11, b10, objArr19);
                                    obj8 = cls6.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                }
                                ((int[]) objArr17[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr18)).intValue();
                                return objArr17;
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        }
                        str = "";
                        r4 = -1347122530;
                        if (i20 == 11) {
                            java.lang.Object[] objArr20 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr20[0])[0] = i6;
                            ((int[]) objArr20[1])[0] = i19;
                            int i21 = 656674751 | i18;
                            try {
                                java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((i21 * 495) + 1012269312 + (((~i21) | 19139713) * 495))};
                                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj9 == null) {
                                    java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(str, str) + 2713, (char) android.graphics.Color.green(0));
                                    byte b12 = $$a[14];
                                    byte b13 = (byte) (b12 - 1);
                                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                                    a(b13, b13, b12, objArr22);
                                    obj9 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                }
                                ((int[]) objArr20[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr21)).intValue();
                                int i22 = AlternateContactlessPaymentDataJson + 3;
                                writeReplace = i22 % 128;
                                if (i22 % 2 == 0) {
                                    return objArr20;
                                }
                                throw null;
                            } catch (java.lang.Throwable th3) {
                                java.lang.Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        }
                        java.lang.Object[] objArr142 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr142[0])[0] = i6;
                        ((int[]) objArr142[1])[0] = i6 ^ 2;
                        java.lang.Object[] objArr152 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf(((((~(1193171918 | i6)) | (-703320243)) * (-465)) - 278227246) + (((~((-703320243) | i6)) | 1193171918) * 930) + (((-685867057) | i6) * 465))};
                        obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
                        if (obj == null) {
                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, 2713 - android.view.View.combineMeasuredStates(0, 0), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            byte b14 = $$a[14];
                            byte b15 = (byte) (b14 - 1);
                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                            a(b15, b15, b14, objArr23);
                            obj = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r4, obj);
                        }
                        ((int[]) objArr142[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr152)).intValue();
                        return objArr142;
                    }
                    try {
                        java.lang.Object[] objArr24 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr24[0])[0] = i6;
                        ((int[]) objArr24[1])[0] = i19;
                        try {
                            java.lang.Object[] objArr25 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~((-623068422) | i18)) | (~((-1273423740) | i18))) * (-867)) + 1182720512 + (((~((-623068422) | i6)) | 19023105 | (~((-1273423740) | i6))) * (-1734)) + (((~((-19023106) | i18)) | (~((-604045317) | i6)) | (~((-1254400635) | i6))) * 867))};
                            try {
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                if (obj10 == null) {
                                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) android.text.TextUtils.getTrimmedLength(""));
                                    byte b16 = $$a[14];
                                    byte b17 = (byte) (b16 - 1);
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a(b17, b17, b16, objArr26);
                                    obj10 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj10);
                                }
                                ((int[]) objArr24[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj10).invoke(null, objArr25)).intValue();
                                return objArr24;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                java.lang.Throwable cause4 = th.getCause();
                                if (cause4 != null) {
                                    throw cause4;
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    } catch (java.lang.Throwable unused2) {
                        r4 = -1347122530;
                    }
                } catch (java.lang.Throwable th6) {
                    java.lang.Throwable cause5 = th6.getCause();
                    if (cause5 != null) {
                        throw cause5;
                    }
                    throw th6;
                }
            } else {
                i4 = i12;
                r4 = -1347122530;
                str = "";
            }
            try {
                java.lang.Object[] objArr27 = new java.lang.Object[1];
                b(new int[]{-1649882994, 1396462466, -1371122363, -833075580, -1532275949, -1929391682, 466271725, -1677308610, 124707877, -603253483, -982277765, -1096788555}, 23 - (android.os.Process.myTid() >> 22), objArr27);
                java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr27[0]).intern());
                java.lang.Object[] objArr28 = new java.lang.Object[1];
                b(new int[]{-1595870994, 1250783717, 2111847269, -171492149, 1135686612, 1049064463, 2083927706, 1770764877, 604714437, 1367618235}, (android.view.ViewConfiguration.getTouchSlop() >> 8) + 17, objArr28);
                java.lang.Object invoke = cls10.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(context, null);
                AlternateContactlessPaymentDataJson = (writeReplace + 23) % 128;
                try {
                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                    b(new int[]{-1649882994, 1396462466, -1371122363, -833075580, -1532275949, -1929391682, 466271725, -1677308610, 124707877, -603253483, -982277765, -1096788555}, 23 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr29);
                    java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr29[0]).intern());
                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                    b(new int[]{-1595870994, 1250783717, 2111847269, -171492149, 1354182007, 1414111199, -942101052, 2001873588}, 14 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr30);
                    java.lang.Object invoke2 = cls11.getMethod(((java.lang.String) objArr30[0]).intern(), null).invoke(context, null);
                    writeReplace = (AlternateContactlessPaymentDataJson + 61) % 128;
                    try {
                        java.lang.Object[] objArr31 = {invoke2, 64};
                        java.lang.Object[] objArr32 = new java.lang.Object[1];
                        c("וֹᨯு￡שׁ틱髅ꖃ\ud9e4\uf136뾅茟뺨ᑰ\udd4f怅鍮⪱\uf215㶟瀻䧲ត᪡囪氼㒊\uf850⮬荺橬픐ࡥꆾ輆닔\ued39", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr32);
                        java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                        java.lang.Object[] objArr33 = new java.lang.Object[1];
                        b(new int[]{-1595870994, 1250783717, 2111847269, -171492149, 764719818, 81635641, -1377652081, -1487573216}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, objArr33);
                        java.lang.Object invoke3 = cls12.getMethod(((java.lang.String) objArr33[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr31);
                        int i23 = i4;
                        int i24 = 0;
                        loop3: while (true) {
                            if (i24 >= i23) {
                                break;
                            }
                            java.nio.LongBuffer longBuffer3 = longBufferArr4[i24];
                            if (longBuffer3.capacity() == 4) {
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                b(new int[]{2131944585, -53286979, -1858908952, -789393959}, 8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr34);
                                obj2 = objArr34[0];
                            } else {
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c("롻സ祖䙿렶엌欅", (-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr35);
                                obj2 = objArr35[0];
                            }
                            java.lang.String intern = ((java.lang.String) obj2).intern();
                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                            b(new int[]{-1649882994, 1396462466, -1371122363, -833075580, -1532275949, -1929391682, 466271725, -1677308610, -246120596, -1573536338, 2111847269, -171492149, 764719818, 81635641, -1377652081, -1487573216}, 29 - android.os.Process.getGidForName(str), objArr36);
                            java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr36[0]).intern());
                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                            c("॔ᴬ⺬씾ध헵뾫齀⯵\uf628髹릜䲱፯", android.graphics.Color.blue(0), objArr37);
                            java.lang.Object[] objArr38 = (java.lang.Object[]) cls13.getField(((java.lang.String) objArr37[0]).intern()).get(invoke3);
                            int length4 = objArr38.length;
                            int i25 = 0;
                            while (i25 < length4) {
                                writeReplace = (AlternateContactlessPaymentDataJson + 29) % 128;
                                java.lang.Object obj11 = objArr38[i25];
                                try {
                                    java.lang.Object[] objArr39 = {intern};
                                    java.lang.Object obj12 = invoke3;
                                    int i26 = i23;
                                    java.lang.String str2 = intern;
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    b(new int[]{-1239219526, -453329253, 1413103332, -901037739, -1855112778, 987288245, -30627684, -1234914243, 1741775622, -754425877, -1532067840, -1509713816, -296810335, 1580959910}, (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27, objArr40);
                                    java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr40[0]).intern());
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    c("蟁鰒삎뻿螦哇冚\ue4a6ꕯ眑瓚쉎숯鉁ᘋ", (-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr41);
                                    java.lang.Object invoke4 = cls14.getMethod(((java.lang.String) objArr41[0]).intern(), java.lang.String.class).invoke(null, objArr39);
                                    try {
                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                        c("螹㝫낧ꅬ蟘ﾵ↣\ufb0eꔖ\udc72ӣ\udd92쉚㤴昩㺈\uef9cߵ䥳挒\u0cc9撶곩䐯⨐䅼迩ꛝ坍긮턵讙", android.view.ViewConfiguration.getEdgeSlop() >> 16, objArr42);
                                        java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr42[0]).intern());
                                        java.lang.Object[] objArr43 = new java.lang.Object[1];
                                        c("\uec3d쨷짆\uf2a1\uec49˨壤\ua8c8캉™綧踃ꧏ쑦Ὗ", android.view.Gravity.getAbsoluteGravity(0, 0), objArr43);
                                        try {
                                            java.lang.Object[] objArr44 = {cls15.getMethod(((java.lang.String) objArr43[0]).intern(), null).invoke(obj11, null)};
                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                            b(new int[]{-1239219526, -453329253, 1413103332, -901037739, -1855112778, 987288245, -30627684, -1234914243, 1741775622, -754425877, -1532067840, -1509713816, -296810335, 1580959910}, 27 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr45);
                                            java.lang.Class<?> cls16 = java.lang.Class.forName(((java.lang.String) objArr45[0]).intern());
                                            java.lang.Object[] objArr46 = objArr38;
                                            java.lang.Object[] objArr47 = new java.lang.Object[1];
                                            b(new int[]{994770007, 826458612, -1803516693, 170122218}, 5 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr47);
                                            if (java.nio.ByteBuffer.wrap((byte[]) cls16.getMethod(((java.lang.String) objArr47[0]).intern(), byte[].class).invoke(invoke4, objArr44)).asLongBuffer().equals(longBuffer3.rewind())) {
                                                break loop3;
                                            }
                                            i25++;
                                            invoke3 = obj12;
                                            intern = str2;
                                            objArr38 = objArr46;
                                            i23 = i26;
                                        } catch (java.lang.Throwable th7) {
                                            java.lang.Throwable cause6 = th7.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th7;
                                        }
                                    } catch (java.lang.Throwable th8) {
                                        java.lang.Throwable cause7 = th8.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th8;
                                    }
                                } catch (java.lang.Throwable th9) {
                                    java.lang.Throwable cause8 = th9.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th9;
                                }
                            }
                            i24++;
                            java.lang.Object[] objArr1422 = {new int[1], new int[1], new int[1]};
                            ((int[]) objArr1422[0])[0] = i6;
                            ((int[]) objArr1422[1])[0] = i6 ^ 2;
                            java.lang.Object[] objArr1522 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf(((((~(1193171918 | i6)) | (-703320243)) * (-465)) - 278227246) + (((~((-703320243) | i6)) | 1193171918) * 930) + (((-685867057) | i6) * 465))};
                            obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r4);
                            if (obj == null) {
                            }
                            ((int[]) objArr1422[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr1522)).intValue();
                            return objArr1422;
                        }
                    } catch (java.lang.Throwable th10) {
                        java.lang.Throwable cause9 = th10.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th10;
                    }
                } catch (java.lang.Throwable th11) {
                    java.lang.Throwable cause10 = th11.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th11;
                }
            } catch (java.lang.Throwable th12) {
                java.lang.Throwable cause11 = th12.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th12;
            }
        } catch (java.lang.Throwable th13) {
            java.lang.Throwable cause12 = th13.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th13;
        }
    }

    static void init$0() {
        $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    }
}
