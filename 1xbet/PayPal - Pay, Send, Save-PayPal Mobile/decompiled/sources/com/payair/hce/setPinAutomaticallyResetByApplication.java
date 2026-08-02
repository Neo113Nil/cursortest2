package com.payair.hce;

/* loaded from: classes4.dex */
public final class setPinAutomaticallyResetByApplication extends com.payair.hce.setMobilePinInitialConfiguration {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int AlternateContactlessPaymentDataJson;
    private static char DigitizedCardProfile;
    private static final int getAid = 0;
    private static int valueOf;
    private static final byte[] values = null;
    private static char[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 118 - (s * 19);
        int i4 = s2 + 4;
        int i5 = (i * 27) + 7;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            i2 = 0;
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 += i6;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = i + 65;
        int i5 = i2 + 4;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - b];
        int i6 = 34 - b;
        if (bArr == null) {
            i4 = i6;
            int i7 = i5;
            int i8 = 0;
            i4 = (i4 + i5) - 2;
            i5 = i7;
            i3 = i8;
            cArr[i3] = (char) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i9 = i5 + 1;
            i7 = i9;
            i5 = bArr[i9];
            i4 = (i4 + i5) - 2;
            i5 = i7;
            i3 = i8;
            cArr[i3] = (char) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            cArr[i3] = (char) i4;
            i8 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    private static void e(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2 = b2 * 4;
        int i3 = (i * 8) + 65;
        byte[] bArr = $$g;
        int i4 = (b * 2) + 4;
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4++;
            i3 = i2 + (-i4);
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                int i6 = bArr[i4];
                i4++;
                i3 += -i6;
            }
        }
    }

    public setPinAutomaticallyResetByApplication(byte[] bArr) throws com.payair.hce.digitize {
        super(bArr);
    }

    @Override // com.payair.hce.setMobilePinInitialConfiguration
    public final void AlternateContactlessPaymentDataJson() {
        AlternateContactlessPaymentDataJson = (valueOf + 107) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        if (r4.valueOf == r4.writeReplace) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016a, code lost:
    
        r10 = new java.lang.Object[13];
        r10[12] = r4;
        r10[11] = java.lang.Integer.valueOf(r3);
        r10[10] = r4;
        r10[9] = r4;
        r10[r12] = java.lang.Integer.valueOf(r3);
        r10[7] = r4;
        r10[6] = r4;
        r10[5] = java.lang.Integer.valueOf(r3);
        r10[4] = r4;
        r10[3] = r4;
        r10[2] = java.lang.Integer.valueOf(r3);
        r10[1] = r4;
        r10[0] = r4;
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b7, code lost:
    
        if (r2 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b9, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 28, 3596 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) android.graphics.Color.red(0));
        r13 = new java.lang.Class[13];
        r13[0] = java.lang.Object.class;
        r13[1] = java.lang.Object.class;
        r13[2] = java.lang.Integer.TYPE;
        r13[3] = java.lang.Object.class;
        r13[4] = java.lang.Object.class;
        r13[5] = java.lang.Integer.TYPE;
        r13[6] = java.lang.Object.class;
        r13[7] = java.lang.Object.class;
        r13[r12] = java.lang.Integer.TYPE;
        r13[9] = java.lang.Object.class;
        r13[10] = java.lang.Object.class;
        r13[11] = java.lang.Integer.TYPE;
        r13[12] = java.lang.Object.class;
        r2 = r2.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, r13);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0237, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r10)).intValue() != r4.SdkCoreAlternateContactlessPaymentDataImpl) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023b, code lost:
    
        r10 = new java.lang.Object[11];
        r10[10] = r4;
        r10[9] = java.lang.Integer.valueOf(r3);
        r10[r12] = r4;
        r10[7] = java.lang.Integer.valueOf(r3);
        r10[6] = java.lang.Integer.valueOf(r3);
        r10[5] = r4;
        r10[4] = r4;
        r10[3] = java.lang.Integer.valueOf(r3);
        r10[2] = java.lang.Integer.valueOf(r3);
        r10[1] = r4;
        r10[0] = r4;
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0277, code lost:
    
        if (r2 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0279, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 49, (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 2664, (char) (18890 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))));
        r13 = new java.lang.Object[1];
        e((byte) 0, (byte) 0, 1, r13);
        r13 = (java.lang.String) r13[0];
        r14 = new java.lang.Class[11];
        r14[0] = java.lang.Object.class;
        r14[1] = java.lang.Object.class;
        r14[2] = java.lang.Integer.TYPE;
        r14[3] = java.lang.Integer.TYPE;
        r14[4] = java.lang.Object.class;
        r14[5] = java.lang.Object.class;
        r14[6] = java.lang.Integer.TYPE;
        r14[7] = java.lang.Integer.TYPE;
        r14[r12] = java.lang.Object.class;
        r14[9] = java.lang.Integer.TYPE;
        r14[10] = java.lang.Object.class;
        r2 = r2.getMethod(r13, r14);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e9, code lost:
    
        r13 = null;
        r2 = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r10)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02f6, code lost:
    
        r10 = r4.AlternateContactlessPaymentDataJson;
        r14 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r4.values] = r5[r2];
        r6[r4.values + 1] = r5[(r10 * r3) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x035a, code lost:
    
        r4.values += 2;
        r2 = r13;
        r12 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030a, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x030f, code lost:
    
        if (r4.DigitizedCardProfile != r4.AlternateContactlessPaymentDataJson) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0311, code lost:
    
        com.payair.hce.setPinAutomaticallyResetByApplication.$10 = (com.payair.hce.setPinAutomaticallyResetByApplication.$11 + 61) % 128;
        r4.RecordsJson = ((r4.RecordsJson + r3) - 1) % r3;
        r4.SdkCoreAlternateContactlessPaymentDataImpl = ((r4.SdkCoreAlternateContactlessPaymentDataImpl + r3) - 1) % r3;
        r2 = r4.DigitizedCardProfile;
        r10 = r4.RecordsJson;
        r14 = r4.AlternateContactlessPaymentDataJson;
        r15 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r4.values] = r5[(r2 * r3) + r10];
        r6[r4.values + 1] = r5[(r14 * r3) + r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0341, code lost:
    
        r2 = r4.DigitizedCardProfile;
        r10 = r4.SdkCoreAlternateContactlessPaymentDataImpl;
        r12 = r4.AlternateContactlessPaymentDataJson;
        r14 = r4.RecordsJson;
        r6[r4.values] = r5[(r2 * r3) + r10];
        r6[r4.values + 1] = r5[(r12 * r3) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0152, code lost:
    
        r6[r4.values] = (char) (r4.valueOf - r30);
        r6[r4.values + 1] = (char) (r4.writeReplace - r30);
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
    
        if (r4.valueOf == r4.writeReplace) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        char[] cArr;
        int i2;
        int i3 = $11;
        $10 = (i3 + 21) % 128;
        java.lang.Object obj = null;
        if (str != null) {
            int i4 = i3 + 41;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr3 = writeReplace;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i5])};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 49, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 2508, (char) (6802 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((byte) 0, (byte) 0, 0, objArr3);
                        obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                    }
                    cArr4[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(DigitizedCardProfile)};
        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        char c = '\b';
        if (obj3 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.view.KeyEvent.keyCodeFromString("") + 2508, (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6802));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            e((byte) 0, (byte) 0, 0, objArr5);
            obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            $11 = ($10 + 103) % 128;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 53) % 128;
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $10 + 109;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values % 1];
                } else {
                    digitizedCardJson12.valueOf = cArr2[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = cArr2[digitizedCardJson12.values + 1];
                }
            }
        }
        int i7 = 0;
        while (i7 < i) {
            int i8 = $11 + 21;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr5[i7] = (char) (cArr5[i7] ^ 26648);
                i7 += 82;
            } else {
                cArr5[i7] = (char) (cArr5[i7] ^ 13722);
                i7++;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x04fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x051b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void DigitizedCardProfile(long j, long j2) {
        ?? r13;
        int i;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object method;
        java.lang.Object obj3;
        int intValue;
        com.payair.hce.CvmIssuerOptions cvmIssuerOptions = new com.payair.hce.CvmIssuerOptions(j, j2);
        byte[] bArr = values;
        char c = 2;
        short s = bArr[2];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(s, bArr[464], s, objArr);
        java.lang.String str = (java.lang.String) objArr[0];
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        short s2 = 354;
        a((short) 354, (byte) (bArr[464] + 1), (short) 354, objArr2);
        try {
            java.lang.Object[] objArr3 = {(java.lang.String) objArr2[0]};
            char c2 = '2';
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a((short) 339, bArr[50], (short) 354, objArr4);
            java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr4[0]);
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a((short) 350, bArr[41], (short) 369, objArr5);
            java.lang.String str2 = (java.lang.String) objArr5[0];
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a((short) 339, bArr[50], (short) 354, objArr6);
            java.lang.Object[] objArr7 = (java.lang.Object[]) cls.getMethod(str2, java.lang.Class.forName((java.lang.String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i2 = 0;
            while (i2 < objArr7.length) {
                java.lang.Object[] objArr8 = {objArr7[i2]};
                byte[] bArr2 = values;
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) 338, bArr2[50], (short) 373, objArr9);
                java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr9[0]);
                byte b = bArr2[c];
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a((short) 348, b, (short) (b | 389), objArr10);
                java.lang.String str3 = (java.lang.String) objArr10[0];
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                a((short) 339, bArr2[50], (short) 354, objArr11);
                java.lang.Object invoke = cls2.getMethod(str3, java.lang.Class.forName((java.lang.String) objArr11[0])).invoke(null, objArr8);
                java.lang.Object[] objArr12 = new java.lang.Object[1];
                a((short) 338, bArr2[50], (short) 373, objArr12);
                java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                a((short) 347, bArr2[364], (short) 395, objArr13);
                iArr[i2] = ((java.lang.Integer) cls3.getMethod((java.lang.String) objArr13[0], null).invoke(invoke, null)).intValue();
                i2++;
                c = 2;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                    r13 = 34;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (i4 < 25) {
                    }
                    if (i4 >= 70) {
                    }
                    throw th;
                }
                switch (cvmIssuerOptions.values(iArr[i3])) {
                    case -40:
                        i3 = 103;
                        c2 = '2';
                        s2 = 354;
                    case -39:
                        cvmIssuerOptions.values(44);
                        int i5 = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        i3 = (i5 == 30 || i5 != 75) ? 85 : 1;
                        c2 = '2';
                        s2 = 354;
                        break;
                    case -38:
                        i3 = 98;
                        c2 = '2';
                        s2 = 354;
                    case -37:
                        cvmIssuerOptions.values(44);
                        int i6 = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        i3 = (i6 == 0 || i6 != 1) ? 56 : 69;
                        c2 = '2';
                        s2 = 354;
                    case -36:
                        i3 = 104;
                        c2 = '2';
                        s2 = 354;
                    case -35:
                        i3 = 106;
                        c2 = '2';
                        s2 = 354;
                    case -34:
                        cvmIssuerOptions.values(40);
                        if (cvmIssuerOptions.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 84;
                            c2 = '2';
                            s2 = 354;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -33:
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(12);
                        valueOf = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -32:
                        i = AlternateContactlessPaymentDataJson;
                        cvmIssuerOptions.valueOf = i;
                        cvmIssuerOptions.values(3);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -31:
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(11);
                        i = cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl.hashCode();
                        cvmIssuerOptions.valueOf = i;
                        cvmIssuerOptions.values(3);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -30:
                        i3 = 99;
                        c2 = '2';
                        s2 = 354;
                    case -29:
                        i3 = 101;
                        c2 = '2';
                        s2 = 354;
                    case -28:
                        cvmIssuerOptions.values(35);
                        if (cvmIssuerOptions.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 67;
                            c2 = '2';
                            s2 = 354;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -27:
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(12);
                        AlternateContactlessPaymentDataJson = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -26:
                        i = valueOf;
                        cvmIssuerOptions.valueOf = i;
                        cvmIssuerOptions.values(3);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -25:
                        return;
                    case -24:
                        i3 = 74;
                        c2 = '2';
                    case -23:
                        i3 = 58;
                        c2 = '2';
                        s2 = 354;
                    case -22:
                        byte b2 = (byte) ($$d[34] - 1);
                        java.lang.Object[] objArr14 = new java.lang.Object[1];
                        c(b2, (byte) (b2 | 32), b2, objArr14);
                        obj = (java.lang.String) objArr14[0];
                        cvmIssuerOptions.getAid = obj;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -21:
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(11);
                        obj = java.lang.Class.forName((java.lang.String) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl);
                        cvmIssuerOptions.getAid = obj;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -20:
                        try {
                            byte b3 = $$d[34];
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c(b3, r0[23], b3, objArr15);
                            obj = (java.lang.String) objArr15[0];
                            cvmIssuerOptions.getAid = obj;
                            cvmIssuerOptions.values(1);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (i4 < 25) {
                            }
                            if (i4 >= 70) {
                                break;
                            }
                            throw th;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        try {
                            cvmIssuerOptions.valueOf = 3;
                            cvmIssuerOptions.values(8);
                            cvmIssuerOptions.values(11);
                            java.lang.Object obj4 = cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                            cvmIssuerOptions.values(11);
                            java.lang.Object obj5 = cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                            cvmIssuerOptions.values(11);
                            try {
                                java.lang.Object[] objArr16 = {obj5, cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl};
                                byte[] bArr3 = values;
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a((short) 331, bArr3[c2], (short) 551, objArr17);
                                java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                                try {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    a((short) 349, bArr3[364], (short) (getAid | 532), objArr18);
                                    java.lang.String str4 = (java.lang.String) objArr18[0];
                                    byte b4 = bArr3[c2];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a((short) 339, b4, (short) 536, objArr19);
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    a((short) 336, bArr3[386], (short) 579, objArr20);
                                    try {
                                        cvmIssuerOptions.getAid = cls4.getMethod(str4, java.lang.Class.forName((java.lang.String) objArr19[0]), java.lang.Class.forName((java.lang.String) objArr20[0])).invoke(obj4, objArr16);
                                        cvmIssuerOptions.values(1);
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        if (i4 < 25) {
                                        }
                                        if (i4 >= 70) {
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (java.lang.Throwable th5) {
                                th = th5;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                        break;
                    case com.google.android.play.core.integrity.model.StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        obj2 = null;
                        cvmIssuerOptions.valueOf = 3;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(11);
                        java.lang.Class cls5 = (java.lang.Class) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                        cvmIssuerOptions.values(11);
                        java.lang.String str5 = (java.lang.String) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                        cvmIssuerOptions.values(11);
                        method = cls5.getMethod(str5, (java.lang.Class[]) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl);
                        cvmIssuerOptions.getAid = method;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -17:
                        obj2 = null;
                        java.lang.Object[] objArr21 = new java.lang.Object[1];
                        a((short) 339, values[c2], s2, objArr21);
                        method = java.lang.Class.forName((java.lang.String) objArr21[0]);
                        cvmIssuerOptions.getAid = method;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -16:
                        obj2 = null;
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(12);
                        cvmIssuerOptions.getAid = new java.lang.Class[cvmIssuerOptions.AlternateContactlessPaymentDataJson];
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -15:
                        obj2 = null;
                        method = "DigitizedCardProfile";
                        cvmIssuerOptions.getAid = method;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -14:
                        obj2 = null;
                        method = com.payair.hce.setLongClickable.class;
                        cvmIssuerOptions.getAid = method;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -13:
                        obj2 = null;
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(12);
                        int i7 = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                        a((short) 339, values[c2], (short) 536, objArr22);
                        method = java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr22[0]), i7);
                        cvmIssuerOptions.getAid = method;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -12:
                        cvmIssuerOptions.values(18);
                        throw ((java.lang.Throwable) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl);
                    case -11:
                        i3 = 23;
                    case -10:
                        i3 = 20;
                    case -9:
                        try {
                            obj2 = null;
                            cvmIssuerOptions.values(15);
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if ((i4 < 25 && i4 <= 43) || (i4 >= 43 && i4 <= 52)) {
                                i4 = 14;
                            } else {
                                if (i4 >= 70 || i4 > 74) {
                                    throw th;
                                }
                                i4 = 68;
                            }
                            cvmIssuerOptions.getAid = th;
                            cvmIssuerOptions.values(46);
                            i3 = i4;
                            c2 = '2';
                            s2 = 354;
                        }
                        if (cvmIssuerOptions.AlternateContactlessPaymentDataJson == 0) {
                            i3 = 19;
                        } else {
                            i3 = i4;
                            c2 = '2';
                            s2 = 354;
                        }
                        break;
                    case -8:
                        try {
                            cvmIssuerOptions.valueOf = 1;
                            cvmIssuerOptions.values(8);
                            cvmIssuerOptions.values(11);
                            java.lang.Object obj6 = cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                            try {
                                byte b5 = values[c2];
                                java.lang.Object[] objArr23 = new java.lang.Object[1];
                                a((short) 336, b5, (short) (b5 | 499), objArr23);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr23[0]);
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                a((short) 347, r4[436], (short) 529, objArr24);
                                obj2 = null;
                                try {
                                    method = cls6.getMethod((java.lang.String) objArr24[0], null).invoke(obj6, null);
                                    cvmIssuerOptions.getAid = method;
                                    cvmIssuerOptions.values(1);
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    java.lang.Throwable cause2 = th.getCause();
                                    if (cause2 == null) {
                                        throw th;
                                    }
                                    throw cause2;
                                }
                            } catch (java.lang.Throwable th9) {
                                th = th9;
                            }
                        } catch (java.lang.Throwable th10) {
                            th = th10;
                            r13 = 0;
                            if (i4 < 25) {
                            }
                            if (i4 >= 70) {
                            }
                            throw th;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                        break;
                    case -7:
                        i3 = 25;
                    case -6:
                        try {
                            cvmIssuerOptions.valueOf = 1;
                            cvmIssuerOptions.values(8);
                            cvmIssuerOptions.values(11);
                            java.lang.Object obj7 = cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                            try {
                                byte[] bArr4 = values;
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                a((short) 339, bArr4[c2], s2, objArr25);
                                java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr25[0]);
                                try {
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    a((short) 349, bArr4[364], (short) (getAid | 464), objArr26);
                                    obj3 = cls7.getMethod((java.lang.String) objArr26[0], null).invoke(obj7, null);
                                    cvmIssuerOptions.getAid = obj3;
                                    cvmIssuerOptions.values(1);
                                } catch (java.lang.Throwable th11) {
                                    th = th11;
                                    java.lang.Throwable cause3 = th.getCause();
                                    if (cause3 == null) {
                                        throw th;
                                    }
                                    throw cause3;
                                }
                            } catch (java.lang.Throwable th12) {
                                th = th12;
                            }
                        } catch (java.lang.Throwable th13) {
                            th = th13;
                            if (i4 < 25) {
                            }
                            if (i4 >= 70) {
                            }
                            throw th;
                        }
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                        break;
                    case -5:
                        cvmIssuerOptions.valueOf = 3;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(11);
                        java.lang.String str6 = (java.lang.String) cvmIssuerOptions.SdkCoreAlternateContactlessPaymentDataImpl;
                        cvmIssuerOptions.values(12);
                        int i8 = cvmIssuerOptions.AlternateContactlessPaymentDataJson;
                        cvmIssuerOptions.values(12);
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        b(str6, i8, (byte) cvmIssuerOptions.AlternateContactlessPaymentDataJson, objArr27);
                        obj3 = (java.lang.String) objArr27[0];
                        cvmIssuerOptions.getAid = obj3;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -4:
                        cvmIssuerOptions.valueOf = 1;
                        cvmIssuerOptions.values(8);
                        cvmIssuerOptions.values(9);
                        try {
                            java.lang.Object[] objArr28 = {java.lang.Long.valueOf(cvmIssuerOptions.DigitizedCardProfile)};
                            byte[] bArr5 = values;
                            java.lang.Object[] objArr29 = new java.lang.Object[1];
                            a((short) 322, bArr5[359], (short) 453, objArr29);
                            java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr29[0]);
                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                            a((short) 333, bArr5[436], (short) 485, objArr30);
                            intValue = ((java.lang.Integer) cls8.getMethod((java.lang.String) objArr30[0], java.lang.Long.TYPE).invoke(null, objArr28)).intValue();
                            cvmIssuerOptions.valueOf = intValue;
                            cvmIssuerOptions.values(3);
                            i3 = i4;
                            c2 = '2';
                            s2 = 354;
                        } catch (java.lang.Throwable th14) {
                            java.lang.Throwable cause4 = th14.getCause();
                            if (cause4 == null) {
                                throw th14;
                            }
                            throw cause4;
                        }
                    case -3:
                        try {
                            byte[] bArr6 = values;
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            a((short) 325, bArr6[359], (short) 402, objArr31);
                            java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr31[0]);
                            byte b6 = bArr6[436];
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            a((short) 332, b6, (short) (b6 | com.visa.cbp.getEncExpo.IResultReceiver2StubProxy), objArr32);
                            intValue = ((java.lang.Integer) cls9.getMethod((java.lang.String) objArr32[0], null).invoke(null, null)).intValue();
                            cvmIssuerOptions.valueOf = intValue;
                            cvmIssuerOptions.values(3);
                            i3 = i4;
                            c2 = '2';
                            s2 = 354;
                        } catch (java.lang.Throwable th15) {
                            java.lang.Throwable cause5 = th15.getCause();
                            if (cause5 == null) {
                                throw th15;
                            }
                            throw cause5;
                        }
                    case -2:
                        obj3 = "㗈㗈㗌";
                        cvmIssuerOptions.getAid = obj3;
                        cvmIssuerOptions.values(1);
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                    case -1:
                        i3 = 52;
                    default:
                        i3 = i4;
                        c2 = '2';
                        s2 = 354;
                }
            }
        } catch (java.lang.Throwable th16) {
            java.lang.Throwable cause6 = th16.getCause();
            if (cause6 == null) {
                throw th16;
            }
            throw cause6;
        }
    }

    private static void a(short s, int i, short s2, java.lang.Object[] objArr) {
        int i2 = 118 - i;
        int i3 = s2 + 4;
        byte[] bArr = values;
        byte[] bArr2 = new byte[355 - s];
        int i4 = 354 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 += i4;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += bArr[i3];
                i3++;
            }
        }
    }

    static void DigitizedCardProfile() {
        byte[] bArr = new byte[601];
        java.lang.System.arraycopy("u!\u0000|\u0004û\u0001\u0005ú\u0006ú\u0001\u0006ù\bø\t÷\nö\u000bõ\u0001\u0007ø\u0005ÿü\u0005\u0002ù\u0001\b÷\u0001\tö\u0001\nõ\u0005\u0003ø\u0001\u000bô\u0005\u0003ø\u0001\fó\u0001\u0004ÿü\u0001\u0004\u0000û\u0005\u0005ö\u0005\u0006õ\u0001\u0004\u0001ú\u0005\u0006õ\u0001\u0004\u0001ú\u0005\bó\u0001\u0004\u0002ù\u0006þü\u0006ÿû\u0006\u0000ú\u0001\u0004\u0003ø\u0001\u0004\u0004÷\u0005\bó\u0001\u0004\u0005ö\u0005\u0003ø\u0006\u0001ù\u0001\u0004\u0006õ\u0006\u0002ø\u0001\u0004\u0007ô\u0005\u0005ö\u0006\u0003÷\u0001\u0004\bó\u0005\u0006õ\u0001\u0005þü\u0001\u0005ÿû\u0001\u0005\u0000ú\u0006\u0004ö\u0001\u0004\u0007ô\u0006\u0005õ\u0001\u0004\bó\u0005\u0006õ\u0001\u0005\u0001ù\u0006\u0006ô\u0006\u0006ô\u0006\u0007ó\u0001\u0005\u0002ø\u0007ýü\u0001\u0005\u0003÷\u0001\u0005\u0004ö\u0007þû\u0005ÿü\u0007ÿú\u0007\u0000ù\u0001\u0005\u0005õ\u0007\u0001ø\u0001\u0005\u0006ô\u0001\u0005\u0007ó\u0001\u0006ýü\u0001\u0004\u0001ú\u0007ýü\u0006\u0004ö\u0001\u0006þû\u0005\u0006õ\u0001\u0005\u0003÷\u0001\u0006ÿú\u0007\u0003ö\u0007\u0004õ\u0007\u0005ô\u0007\u0006ó\u0001\u0006\u0000ù\u0006\u0006ô\u0007\u0006ó\u0001\u0006\u0001ø\u0001\u0006\u0002÷\u0001\u0006\u0003ö\u0001\u0005ú\u0006\u0006ô\u0001\u0006ù\býû\u0007\u0006ó\bþú\u000bõ\u0001\u0007ø\bÿù\u0005\u0002ù\u0001\b÷\u0001\tö\u0001\nõ\u0001\u0006\u0004õ\u0006\u0001ù\u0001\u0006\u0005ô\u0005\bó\u0001\u0006\u0005ô\u0001\u0006\u0006ó\b\u0001÷\u0001\u0007üü\bþú\u0001\u0007ü÷\u0015ëÍ>õ\rùÇ%!þ÷\u0005ùýüý\u000b÷\u0015ëÍ>õ\rùÇ\u001b%\u0006ñ\u0002þ\rë\u000b\tðê\u0017\u0005\u0006â\u000b\u000b\tð\rö\u000eýúûÊHóü\u0012·(\u0013ü\u0012Ì,ÿø\u0003þ\u000eýï\u0013õ\u0006ÿþ\u000fÜ\"ó\u000e\u0000òÿï!í\u0013ñß1ýï\u0013õ\u0006ÿ\rö\u000eýúûÊIòû\u0003þ\u000fº\u00173øñ\röý\u0001\nùç\u001d\n\u0001â\u0013ü\u0012þ\u000fÜ\u0011\u0002\búÿì\u001f\u0004ö\u000bõ\u0006ÿÙ+ý\u0006û\u0005\u0006ñ\rü÷\u0015ëÍ>õ\rùÇ&\u0014\ný\bê\u0001\nùþ\u000fÏ\u001e\u0014þò÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011÷\u0015ëÍ>õ\rùÇDó\u0001\u0006ùþ\u0011º\u001f\u0018\u000fô\u0007õ\u0005\bùüúñ\u001e÷\u0015ëÍ>õ\rùÇ!\u0013\bûþ\u0011Ç".getBytes("ISO-8859-1"), 0, bArr, 0, 601);
        values = bArr;
        getAid = 42;
    }

    static void init$2() {
        $$g = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63};
        $$h = 46;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        DigitizedCardProfile();
        AlternateContactlessPaymentDataJson = 0;
        valueOf = 1;
        writeReplace = new char[]{12324, 12335, 12346, 12338, 12330, 13269, 12326, 12345, 12329, 12331, 12334, 13268, 13267, 12333, 12389, 12299, 13266, 12391, 12291, 12321, 12388, 12327, 12350, 12328, 13270, 13264, 12323, 12411, 12297, 12344, 12332, 12409, 12325, 12351, 13265, 12413};
        DigitizedCardProfile = (char) 1494;
    }

    static void init$1() {
        $$d = new byte[]{18, 126, 13, 102, com.google.common.base.Ascii.FF, -2, -63, 66, -15, com.google.common.base.Ascii.CAN, -24, 8, 9, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 58, -5, 2, -55, 69, -14, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, 44, -1, 6, -15, 19, -4, com.visa.cbp.getEncExpo.kernelVersion, 41, -3, -6, 8, -10, 1, 10, -7, -21, com.google.common.base.Ascii.VT, 9, com.visa.cbp.getEncExpo.onUnminimized, -22, com.google.common.base.Ascii.ETB};
        $$e = 15;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.CAN, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -20, -99, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x03e6, code lost:
    
        if (r0.contains(r6.getField((java.lang.String) r3[0]).get(null)) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0619, code lost:
    
        if (((((int) r3) & ((((((~((-1090667554) | r25)) | r4) * 590) - 1210276281) + ((((~((-955888411) | r6)) | 144703488) | (~(1901852475 | r6))) * (-1180))) + (((~(955888410 | r6)) | (~(r6 | (-1901852476)))) * 590))) | (((int) (r3 >> 32)) & (((((1391841182 | r6) * (-369)) - 802173004) + (((~((-1387564959) | r6)) | 49661452) * (-369))) + ((((~(1387564958 | r25)) | 4276224) | (~((-1342179731) | r6))) * 369)))) == 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x06d4, code lost:
    
        r4 = new java.lang.Object[]{new int[]{r25}, new int[]{r25 ^ 10}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x06ed, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r26), 16, java.lang.Integer.valueOf(((((~(1002438582 | r25)) * (-301)) + 397866204) + (((~((-330228151) | r25)) | (~((~r25) | 674700834))) * (-301))) + (((~(r25 | (-674700835))) | (-330228151)) * 301))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0736, code lost:
    
        if (r1 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0738, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, 2712 - android.os.Process.getGidForName(""), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))));
        r0 = r0[14];
        r2 = (short) (r0 - 1);
        r8 = new java.lang.Object[1];
        d(r2, (byte) r2, (byte) (-r0), r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0796, code lost:
    
        ((int[]) r4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
        r0 = com.payair.hce.setPinAutomaticallyResetByApplication.valueOf + 33;
        com.payair.hce.setPinAutomaticallyResetByApplication.AlternateContactlessPaymentDataJson = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x07a7, code lost:
    
        if ((r0 % 2) != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x07a9, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x07ab, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x06d2, code lost:
    
        if (r3.equals(((java.lang.String) r6[0]).intern()) != false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        byte[] bArr;
        int i3 = valueOf + 17;
        AlternateContactlessPaymentDataJson = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        try {
            if (context == null) {
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~(35310045 | r2)) | 1040239030) * 226) - 882896512) + (((~((~i) | 1041943039)) | (~((-1040239031) | i)) | 33606036) * (-113)) + ((~(i | 35310045)) * 113))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(51 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.graphics.Color.red(0) + 2713, (char) android.view.View.resolveSize(0, 0));
                    byte b = $$a[14];
                    short s = (short) (b - 1);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    d(s, (byte) s, (byte) (-b), objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("\u0006\u0003\u000b\u001c\u0002 \b\u0016\u000e\u0002\u0004\u0012\u0002\u0001\u0017\u0015\u001a\"\u0004\u0012\u0002\u0004㘰", 23 - android.graphics.Color.argb(0, 0, 0, 0), (byte) (66 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b("\u0013\u0007\u0015\u0010㘵㘵\b\u0018\t\n\u0014\u001c\u001e\u0002\u0018\u0006\u001f!", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 76), objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b("\u0006\u0003\u000b\u001c\u0002 \b\u0016\u000e\u0002\u0004\u0012\u0002\u0001\u0017\u0015\u0003\u0014\u0015\u000e㗷㗷\b\u0018\t\n\u0014\u001c\u001e\u0002\u0018\u0006\u001f!", 35 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (android.text.TextUtils.indexOf("", "", 0) + 13), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b("\u0000\f\u0007\u000f㗹", 5 - android.view.KeyEvent.getDeadChar(0, 0), (byte) (android.view.View.combineMeasuredStates(0, 0) + 16), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    int i4 = (valueOf + 79) % 128;
                    AlternateContactlessPaymentDataJson = i4;
                    int i5 = i4 + 53;
                    valueOf = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 / 2;
                    }
                    valueOf = (i4 + 125) % 128;
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-553707781) | i) * (-627)) - 264790560) + (((~((-377165419) | i)) | 627763566) * (-627)) + (((~((~i) | 377165418)) | (~(627763566 | i))) * 627))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((android.os.Process.getThreadPriority(0) + 20) >> 6) + 50, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2713, (char) android.view.Gravity.getAbsoluteGravity(0, 0));
                        byte b2 = $$a[14];
                        short s2 = (short) (b2 - 1);
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        d(s2, (byte) s2, (byte) (-b2), objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i7 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-983106193) | i7)) | (~(1002438580 | i))) * 988) + 464940980 + (((~(i7 | 1002438580)) | (~((-985596597) | i)) | 2490404) * 988))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2713, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b3 = $$a[14];
                        short s3 = (short) (b3 - 1);
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        d(s3, (byte) s3, (byte) (-b3), objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 34, android.view.View.resolveSizeAndState(0, 0, 0) + 1738, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5827));
                    byte b4 = $$a[14];
                    short s4 = (short) (b4 - 1);
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    d(s4, (byte) s4, (byte) (-b4), objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, 1738 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 5827));
                byte[] bArr2 = $$a;
                byte b5 = bArr2[14];
                short s5 = (short) (b5 - 1);
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                d(s5, (byte) s5, (byte) (-b5), objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    int i8 = valueOf + 9;
                    AlternateContactlessPaymentDataJson = i8 % 128;
                    if (i8 % 2 != 0) {
                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1737, (char) (5826 - android.text.TextUtils.indexOf("", "", 0, 0)));
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        d(53, (byte) ($$b | 17), (byte) (-bArr2[23]), objArr15);
                        set.contains(cls8.getField((java.lang.String) objArr15[0]).get(null));
                        throw null;
                    }
                    java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.View.combineMeasuredStates(0, 0) + 1738, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 5826));
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    d(53, (byte) ($$b | 17), (byte) (-bArr2[23]), objArr16);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    AlternateContactlessPaymentDataJson = (valueOf + 95) % 128;
                    java.lang.Object[] objArr17 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i9 = ~i;
                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~((-1048581) | i9)) | (~((-172323665) | i)) | (~((-830508161) | i))) * 765) + 1547621724 + (((~((-173372245) | i9)) | 1048580) * 1530) + (((~(i | (-173372245))) | (~(i9 | (-830508161)))) * 765))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 50, android.view.View.MeasureSpec.getSize(0) + 2713, (char) (android.view.MotionEvent.axisFromString("") + 1));
                        byte b6 = bArr2[14];
                        short s6 = (short) (b6 - 1);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        d(s6, (byte) s6, (byte) (-b6), objArr19);
                        obj5 = cls10.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr17[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr18)).intValue();
                    return objArr17;
                }
                try {
                    if (android.os.Build.VERSION.SDK_INT > 33) {
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        b("\r\u0002\u0014\n\u0014 \u0002\u0018\u0014\u0010㙉㙉\u0016\u0007\u0010\u000b\u0005\u0013\u001f\u000f\u000f\u0007\u0012\u000b\u0002\u0013\u001a\u000b", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, (byte) (android.text.TextUtils.getOffsetAfter("", 0) + 83), objArr20);
                        try {
                            java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                            if (obj6 == null) {
                                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36, 3160 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33099));
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                d((short) ($$b | 641), (byte) 34, 38, objArr22);
                                obj6 = cls11.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                            }
                            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr21)).longValue();
                            long j = i;
                            long j2 = ~j;
                            bArr = bArr2;
                            long j3 = (((((565 * longValue) + 550087894516L) + ((((~((~longValue) | j2)) | 977065531) | (~(longValue | j))) * (-564))) + ((~((longValue | 977065531) | j)) * 1128)) + (((~(j2 | 977065531)) | (~((-977065532) | longValue))) * 564)) - 360602576;
                            int i10 = ~i;
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        bArr = bArr2;
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        b("\u001a#\u0016\b\u0005\u0013\u001f\u000f\u000f\u0007\u0012\u000b㘾", 13 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (62 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr23);
                        try {
                            java.lang.Object[] objArr24 = {((java.lang.String) objArr23[0]).intern()};
                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj7 == null) {
                                java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1));
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                d((short) ($$b | 641), (byte) 34, 38, objArr25);
                                obj7 = cls12.getMethod((java.lang.String) objArr25[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj7).invoke(null, objArr24);
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            b("㖬", 1 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr26);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 != null) {
                                throw cause2;
                            }
                            throw th2;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Throwable th3) {
                java.lang.Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        } catch (java.lang.Throwable th4) {
            java.lang.Throwable cause4 = th4.getCause();
            if (cause4 != null) {
                throw cause4;
            }
            throw th4;
        }
        java.lang.Object[] objArr27 = {new int[]{i}, new int[]{i}, null, new int[1]};
        java.lang.Object[] objArr28 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(60209931 | r2)) * (-560)) - 1886169032) + ((~(i | (-944325829))) * (-560)) + (((~(944719053 | (~i))) | 59816706) * 560))};
        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
        if (obj8 == null) {
            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 2713 - (android.os.Process.myPid() >> 22), (char) android.view.View.getDefaultSize(0, 0));
            byte b7 = $$a[14];
            short s7 = (short) (b7 - 1);
            java.lang.Object[] objArr29 = new java.lang.Object[1];
            d(s7, (byte) s7, (byte) (-b7), objArr29);
            obj8 = cls13.getMethod((java.lang.String) objArr29[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
        }
        ((int[]) objArr27[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr28)).intValue();
        return objArr27;
    }
}
