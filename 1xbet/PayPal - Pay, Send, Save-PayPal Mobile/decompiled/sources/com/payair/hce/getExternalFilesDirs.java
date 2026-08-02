package com.payair.hce;

/* loaded from: classes4.dex */
public final class getExternalFilesDirs {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static int getPaymentFci;
    private static char getProfileVersion;
    private static int values;
    private static long writeReplace;
    private com.payair.hce.deleteFile AlternateContactlessPaymentDataJson;
    private final com.payair.hce.checkPermission DigitizedCardProfile = com.payair.hce.checkPermission.DigitizedCardProfile(com.payair.hce.registerReceiver.values);
    private int valueOf;

    private static void a(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i = 718 - (s2 * 653);
        int i2 = b + 4;
        int i3 = s * 34;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - i3];
        int i4 = 34 - i3;
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i2 + i4) - 2;
            i2 = i2;
            i = i6;
        }
        while (true) {
            i5++;
            cArr[i5] = (char) i;
            int i7 = i2 + 1;
            if (i5 == i4) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i2 = i7;
            i = (i + bArr[i7]) - 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3 = b2 * 2;
        int i4 = 110 - b;
        byte[] bArr = $$d;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            int i9 = i5 + i6;
            i2 = i7;
            int i10 = i8;
            i4 = i9;
            i5 = i10;
            bArr2[i2] = (byte) i4;
            int i11 = i5 + 1;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i11;
            i5 = bArr[i11];
            i7 = i2 + 1;
            i6 = i12;
            int i92 = i5 + i6;
            i2 = i7;
            int i102 = i8;
            i4 = i92;
            i5 = i102;
            bArr2[i2] = (byte) i4;
            int i112 = i5 + 1;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            int i1122 = i5 + 1;
            if (i2 == i3) {
            }
        }
    }

    public getExternalFilesDirs(int i, com.payair.hce.deleteFile deletefile) {
        this.valueOf = i;
        this.AlternateContactlessPaymentDataJson = deletefile;
    }

    public getExternalFilesDirs(int i) {
        this.valueOf = i;
    }

    public final int values() {
        int i = SdkCoreBusinessLogicModuleImpl;
        getPaymentFci = (i + 81) % 128;
        int i2 = this.valueOf;
        getPaymentFci = (i + 33) % 128;
        return i2;
    }

    public final com.payair.hce.deleteFile DigitizedCardProfile() {
        int i = getPaymentFci;
        SdkCoreBusinessLogicModuleImpl = (i + 65) % 128;
        com.payair.hce.deleteFile deletefile = this.AlternateContactlessPaymentDataJson;
        SdkCoreBusinessLogicModuleImpl = (i + 113) % 128;
        return deletefile;
    }

    public final java.lang.String toString() {
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 15) % 128;
        java.lang.String simpleName = getClass().getSimpleName();
        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 55) % 128;
        return simpleName;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = $10;
        int i3 = i2 + 37;
        $11 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i2 + 75) % 128;
            cArr = str.toCharArray();
            $10 = ($11 + 13) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr3 = new char[cArr2.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr4 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < cArr2.length) {
            cArr4[0] = cArr2[getproducttype.AlternateContactlessPaymentDataJson];
            cArr4[1] = cArr2[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r15), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i6 = c2 + i4;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.MotionEvent.axisFromString("") + 63, 1334 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(-1, (byte) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr4[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r14), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    int i7 = charValue + i4;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1335, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(-1, (byte) 0, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr4[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i4 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3[getproducttype.AlternateContactlessPaymentDataJson] = cArr4[0];
            cArr3[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr4[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 52, 3542 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr3, 0, i);
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char c2;
        int i2 = $11 + 111;
        $10 = i2 % 128;
        char c3 = 2;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != null) {
            $10 = ($11 + 87) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            $10 = ($11 + 111) % 128;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        byte b = 0;
        java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
        java.lang.System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        getwalletdata.writeReplace = 0;
        int i3 = $11 + 67;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (getwalletdata.writeReplace < length3) {
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 71, (android.os.Process.myTid() >> 22) + 1179, (char) android.view.View.resolveSize(b, b));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(-1, (byte) 8, b, objArr3);
                    java.lang.String str4 = (java.lang.String) objArr3[b];
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[b] = java.lang.Object.class;
                    obj2 = cls.getMethod(str4, clsArr);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 30, 3442 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, b, b), (char) (android.view.Gravity.getAbsoluteGravity(b, b) + 3831));
                    java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                    clsArr2[b] = java.lang.Object.class;
                    obj3 = cls2.getMethod("g", clsArr2);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                char c4 = cArr5[getwalletdata.writeReplace % 4];
                java.lang.Object[] objArr5 = new java.lang.Object[3];
                objArr5[c3] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr5[1] = java.lang.Integer.valueOf(c4 * 32718);
                objArr5[b] = getwalletdata;
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.view.View.combineMeasuredStates(b, b), (android.util.TypedValue.complexToFloat(b) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(b) == 0.0f ? 0 : -1)) + 1864, (char) (41775 - android.view.KeyEvent.normalizeMetaState(b)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(-1, (byte) 5, b, objArr6);
                    java.lang.String str5 = (java.lang.String) objArr6[b];
                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                    clsArr3[b] = java.lang.Object.class;
                    clsArr3[1] = java.lang.Integer.TYPE;
                    clsArr3[2] = java.lang.Integer.TYPE;
                    obj4 = cls3.getMethod(str5, clsArr3);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                char c5 = cArr5[intValue2];
                java.lang.Object[] objArr7 = new java.lang.Object[2];
                objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                objArr7[b] = java.lang.Integer.valueOf(c5 * 32718);
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.KeyEvent.normalizeMetaState(b), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3132, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(-1, length4, (byte) (length4 - 4), objArr8);
                    java.lang.String str6 = (java.lang.String) objArr8[b];
                    c2 = 2;
                    java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                    clsArr4[b] = java.lang.Integer.TYPE;
                    clsArr4[1] = java.lang.Integer.TYPE;
                    obj5 = cls4.getMethod(str6, clsArr4);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr5[intValue2] = getwalletdata.values;
                cArr7[getwalletdata.writeReplace] = (char) ((((int) (values ^ 1263759066225628708L)) ^ ((cArr3[getwalletdata.writeReplace] ^ cArr5[intValue2]) ^ (writeReplace ^ 1263759066225628708L))) ^ ((char) (getAid ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                c3 = c2;
                obj = null;
                b = 0;
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
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getPaymentFci = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        writeReplace = 1263759066225628708L;
        values = -804334044;
        getAid = (char) 61087;
        getProfileVersion = (char) 12672;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 39951;
        RecordsJson = (char) 40815;
        IccPrivateKeyCrtComponentsJson = (char) 13676;
    }

    static void init$1() {
        $$d = new byte[]{34, -102, -7, com.visa.cbp.getEncExpo.addOnTrimMemoryListener};
        $$e = 71;
    }

    static void init$0() {
        $$a = new byte[]{7, -8, -91, 32, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
        $$b = 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0ab5, code lost:
    
        com.payair.hce.getExternalFilesDirs.SdkCoreBusinessLogicModuleImpl = (com.payair.hce.getExternalFilesDirs.getPaymentFci + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0abe, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r11;
        ((int[]) r0[1])[0] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0ad6, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r42), r26, java.lang.Integer.valueOf((((((~r11) | 69217409) * 1324) + 549132672) + (((~(745090471 | r11)) | (~(1151401689 | r11))) * (-1324))) - 102176812)};
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0b0c, code lost:
    
        if (r2 != null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0b0e, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", "", 0, 0) + 50, (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
        r6 = com.payair.hce.getExternalFilesDirs.$$a[14];
        r7 = (byte) (r6 - 1);
        r6 = r6;
        r12 = new java.lang.Object[1];
        a(r7, r6, (byte) (-r6), r12);
        r2 = r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0b6a, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0b71, code lost:
    
        r1 = com.payair.hce.getExternalFilesDirs.getPaymentFci + 111;
        com.payair.hce.getExternalFilesDirs.SdkCoreBusinessLogicModuleImpl = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0b7b, code lost:
    
        if ((r1 % 2) == 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0b7d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0b83, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0b84, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0b85, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0b89, code lost:
    
        if (r2 != null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0b8b, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0b8c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0928, code lost:
    
        if (r6.capacity() == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0bbd, code lost:
    
        r0 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r0[0])[0] = r11;
        ((int[]) r0[1])[0] = r11 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0bd7, code lost:
    
        r2 = ~r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0bde, code lost:
    
        r7 = new java.lang.Object[]{java.lang.Integer.valueOf(r42), r8, java.lang.Integer.valueOf((((((~((-1027129659) | r2)) | 823148802) | r5) * (-502)) - 1494636948) + (((~(r2 | (-203980857))) | (~(1073343358 | r11))) * 502))};
        r2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0c10, code lost:
    
        if (r2 != null) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0c12, code lost:
    
        r2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2712 - android.view.MotionEvent.axisFromString(""), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
        r5 = com.payair.hce.getExternalFilesDirs.$$a[14];
        r6 = (byte) (r5 - 1);
        r5 = r5;
        r12 = new java.lang.Object[1];
        a(r6, r5, (byte) (-r5), r12);
        r2 = r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0c6d, code lost:
    
        ((int[]) r0[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r2).invoke(null, r7)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0c74, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0c75, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0c76, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0c7a, code lost:
    
        if (r2 != null) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0c7c, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0c7d, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] values(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        java.nio.LongBuffer[] longBufferArr;
        java.nio.LongBuffer longBuffer;
        boolean z;
        java.lang.Object obj;
        java.lang.Integer num;
        int i4;
        java.lang.Integer num2;
        java.lang.String[] strArr2 = strArr;
        int i5 = i;
        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 37) % 128;
        java.lang.Integer num3 = 16;
        int i6 = 0;
        java.lang.Integer num4 = 0;
        float f = 0.0f;
        int i7 = 1;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[1], new int[1], new int[1]};
                ((int[]) objArr[0])[0] = i5;
                ((int[]) objArr[1])[0] = i5;
                int i8 = ~i5;
                int i9 = ~(1600218983 | i8);
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i3), num4, java.lang.Integer.valueOf((((~(i8 | 296273177)) | (~((-1600218984) | i5)) | i9) * (-516)) + 422662584 + (((~(i8 | (-8945689))) | (~(i5 | (-287327490)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((8945688 | i9) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a(b2, b3, (byte) (-b3), objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).intValue();
                return objArr;
            }
            if (strArr2.length == 0) {
                java.lang.Object[] objArr4 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr4[0])[0] = i5;
                ((int[]) objArr4[1])[0] = i5 ^ 4;
                java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((~(i5 | (-929443644))) | 824323329) * 336) + 1113389184 + (((~(i5 | 967048517)) | (-1072168832)) * (-168)) + (((~((~i5) | 967048517)) | (-929443644)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, 2713 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                    byte b4 = $$a[14];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a(b5, b6, (byte) (-b6), objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                }
                ((int[]) objArr4[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            int length = strArr2.length;
            java.nio.LongBuffer[] longBufferArr2 = new java.nio.LongBuffer[length];
            int i10 = 0;
            while (true) {
                int i11 = 48;
                if (i10 >= strArr2.length) {
                    java.lang.Integer num5 = num3;
                    java.lang.Integer num6 = num4;
                    try {
                        if (context == null) {
                            try {
                                java.lang.Object[] objArr7 = {new int[1], new int[1], new int[1]};
                                i11 = i;
                                ((int[]) objArr7[0])[0] = i11;
                                ((int[]) objArr7[1])[0] = i11;
                                int i12 = ~i11;
                                try {
                                    java.lang.Object[] objArr8 = {java.lang.Integer.valueOf(i3), num6, java.lang.Integer.valueOf((((~((-1302005983) | i12)) | (~(1878993918 | i11))) * (-831)) + 1434929732 + ((~((-1284507741) | i11)) * (-1662)) + (((~(i12 | (-594486179))) | (~(594486178 | i11)) | (~(1302005982 | i11))) * 831))};
                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj4 == null) {
                                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.view.View.resolveSize(0, 0), (char) android.view.KeyEvent.getDeadChar(0, 0));
                                        byte b7 = $$a[14];
                                        byte b8 = (byte) (b7 - 1);
                                        byte b9 = b7;
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        a(b8, b9, (byte) (-b9), objArr9);
                                        obj4 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                    }
                                    ((int[]) objArr7[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr8)).intValue();
                                    int i13 = getPaymentFci + 15;
                                    SdkCoreBusinessLogicModuleImpl = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        return objArr7;
                                    }
                                    throw null;
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable unused) {
                                i11 = i;
                            }
                        } else {
                            i11 = i;
                            byte[][] bArr = new byte[length][];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < length) {
                                java.nio.LongBuffer longBuffer2 = longBufferArr2[i14];
                                if (longBuffer2.capacity() == 4) {
                                    SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 57) % 128;
                                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                                    java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                                    long[] array = longBuffer2.array();
                                    int length2 = array.length;
                                    int i16 = 0;
                                    while (true) {
                                        num = num6;
                                        i4 = length;
                                        if (i16 >= length2) {
                                            break;
                                        }
                                        asLongBuffer.put(array[i16]);
                                        i16++;
                                        getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 121) % 128;
                                        length = i4;
                                        num6 = num;
                                    }
                                    bArr[i15] = allocate.array();
                                    i15++;
                                } else {
                                    num = num6;
                                    i4 = length;
                                }
                                i14++;
                                length = i4;
                                num6 = num;
                            }
                            java.lang.Integer num7 = num6;
                            int i17 = length;
                            if (i15 > 0) {
                                SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 13) % 128;
                                int currentTimeMillis = 343337308 ^ ((int) java.lang.System.currentTimeMillis());
                                try {
                                    java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(i11 ^ currentTimeMillis), bArr, java.lang.Integer.valueOf(i15)};
                                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                                    if (obj5 == null) {
                                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.green(0), 429 - android.graphics.Color.red(0), (char) (31609 - android.os.Process.getGidForName("")));
                                        byte[] bArr2 = $$a;
                                        byte b10 = bArr2[14];
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        a(b10, (byte) (b10 - 1), (byte) (-bArr2[23]), objArr11);
                                        obj5 = cls4.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj5);
                                    }
                                    long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr10)).longValue();
                                    long j = i11;
                                    long j2 = ~j;
                                    long j3 = ~(longValue | (-217663688));
                                    longBufferArr = longBufferArr2;
                                    long j4 = ((-396) * longValue) + 86630147426L + (((~(j2 | longValue)) | (~(j2 | (-217663688))) | j3) * (-397)) + ((-397) * j3) + ((j | j3 | (((~longValue) | 217663687) ^ (-1))) * 397) + 716237020;
                                    int i18 = ~i11;
                                    int i19 = ((((int) j4) & ((((((-1111861290) | i18) * 1444) + 1153123995) + ((((~((-1236491978) | i11)) | 162682560) | (~((-200734433) | i11))) * (-1444))) - 395033694)) | (((int) (j4 >> 32)) & ((((((~(888821030 | i11)) | (-1979405615)) * 336) + 501358106) + (((~((-1968919855) | i11)) | 878335270) * (-168))) + (((~((-1968919855) | i18)) | 888821030) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) ^ currentTimeMillis;
                                    if ((i2 & 1) == 1 && (i19 ^ i11) == 15) {
                                        java.lang.Object[] objArr12 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr12[0])[0] = i11;
                                        ((int[]) objArr12[1])[0] = i19;
                                        int i20 = ~(1330795166 | i18);
                                        try {
                                            java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((((((~((-565696995) | i18)) | 17977474) | (~(i18 | (-1330795167)))) | (~(1878514686 | i11))) * (-84)) - 2006923648) + (((~((-1330795167) | i11)) | 565696994 | i20) * (-84)) + ((i20 | (-1878514687)) * 84))};
                                            java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj6 == null) {
                                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, android.text.TextUtils.indexOf("", "") + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                byte b11 = $$a[14];
                                                byte b12 = (byte) (b11 - 1);
                                                byte b13 = b11;
                                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                                a(b12, b13, (byte) (-b13), objArr14);
                                                obj6 = cls5.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                                            }
                                            ((int[]) objArr12[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr13)).intValue();
                                            return objArr12;
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 != null) {
                                                throw cause2;
                                            }
                                            throw th2;
                                        }
                                    }
                                    int i21 = i19 ^ i11;
                                    if (i21 == 0) {
                                        java.lang.Object[] objArr15 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr15[0])[0] = i11;
                                        ((int[]) objArr15[1])[0] = i19;
                                        try {
                                            java.lang.Object[] objArr16 = {java.lang.Integer.valueOf(i3), num7, java.lang.Integer.valueOf((((-2165279) | i11) * (-676)) + 1240232648 + (((~(1020825953 | i18)) | 2165278) * 676) + (((~(i18 | (-875666208))) | 873500929 | (~(1022991231 | i11))) * 676))};
                                            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj7 == null) {
                                                java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 51, android.text.TextUtils.indexOf("", "", 0, 0) + 2713, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                                byte b14 = $$a[14];
                                                byte b15 = (byte) (b14 - 1);
                                                byte b16 = b14;
                                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                                a(b15, b16, (byte) (-b16), objArr17);
                                                obj7 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj7);
                                            }
                                            ((int[]) objArr15[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr16)).intValue();
                                            return objArr15;
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (i21 == 11) {
                                        SdkCoreBusinessLogicModuleImpl = (getPaymentFci + 81) % 128;
                                        java.lang.Object[] objArr18 = {new int[1], new int[1], new int[1]};
                                        ((int[]) objArr18[0])[0] = i11;
                                        ((int[]) objArr18[1])[0] = i19;
                                        try {
                                            java.lang.Object[] objArr19 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf(((((~((-840184322) | i18)) | (-1056307840)) * (-591)) - 1278455394) + (((-840184322) | i11) * 591))};
                                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj8 == null) {
                                                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 50, 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                byte b17 = $$a[14];
                                                byte b18 = (byte) (b17 - 1);
                                                byte b19 = b17;
                                                java.lang.Object[] objArr20 = new java.lang.Object[1];
                                                a(b18, b19, (byte) (-b19), objArr20);
                                                obj8 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
                                            }
                                            ((int[]) objArr18[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr19)).intValue();
                                            return objArr18;
                                        } catch (java.lang.Throwable th4) {
                                            java.lang.Throwable cause4 = th4.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th4;
                                        }
                                    }
                                } catch (java.lang.Throwable th5) {
                                    java.lang.Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                            } else {
                                longBufferArr = longBufferArr2;
                            }
                            try {
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                c("뫯訳飽梪㍠\uee42閾粆뀃ݞ䪉핣趿᷏崗푳눅塺䪉핣遏襢\uda85븠", android.graphics.Color.green(0) + 23, objArr21);
                                java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr21[0]).intern());
                                java.lang.Object[] objArr22 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "ࡌ\uf074\u09d6삽婌ℇ枍サ쎋硴펇⻃뮟丩抲⩽눽", "樶뢹彝ĩ", 1572387178 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 10591), objArr22);
                                java.lang.Object invoke = cls8.getMethod(((java.lang.String) objArr22[0]).intern(), null).invoke(context, null);
                                try {
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    c("뫯訳飽梪㍠\uee42閾粆뀃ݞ䪉핣趿᷏崗푳눅塺䪉핣遏襢\uda85븠", 23 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), objArr23);
                                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr23[0]).intern());
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    b("\u0000\u0000\u0000\u0000", "찰꾙鿛鍅뜃ጐ←㨂\ue65d崲뇣뺤瓣헧", "♴༆ꂡ﹊", android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (19104 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), objArr24);
                                    try {
                                        java.lang.Object[] objArr25 = {cls9.getMethod(((java.lang.String) objArr24[0]).intern(), null).invoke(context, null), 64};
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        c("뫯訳飽梪㍠\uee42閾粆뀃ݞ䪉핣趿᷏崗푳遃瓫\uec6fꏔ쉅鞨鿆稜땳\uddb6뀛䎃㫙ᝒ땳\uddb6㶗觙", android.view.KeyEvent.getDeadChar(0, 0) + 33, objArr26);
                                        java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                                        c("땳\uddb6鼩띜쉅鞨鿆稜땳\uddb6\ueafb⢭钚\ue1f0", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 14, objArr27);
                                        java.lang.Object invoke2 = cls10.getMethod(((java.lang.String) objArr27[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr25);
                                        int i22 = i17;
                                        int i23 = 0;
                                        loop3: while (true) {
                                            if (i23 >= i22) {
                                                break;
                                            }
                                            int i24 = getPaymentFci + 61;
                                            SdkCoreBusinessLogicModuleImpl = i24 % 128;
                                            if (i24 % 2 == 0) {
                                                longBuffer = longBufferArr[i23];
                                                z = longBuffer.capacity() == 3;
                                            } else {
                                                longBuffer = longBufferArr[i23];
                                            }
                                            if (z) {
                                                try {
                                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                    b("\u0000\u0000\u0000\u0000", "鯴냔뭀\uf4a6勋\ue053\uf004", "\ufb3f겷篾\udbab", (-22235141) - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr28);
                                                    obj = objArr28[0];
                                                } catch (java.lang.Throwable unused2) {
                                                }
                                            } else {
                                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                                c("퉆措Ү↛", 3 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr29);
                                                obj = objArr29[0];
                                            }
                                            java.lang.String intern = ((java.lang.String) obj).intern();
                                            java.lang.Object[] objArr30 = new java.lang.Object[1];
                                            c("뫯訳飽梪㍠\uee42閾粆뀃ݞ䪉핣趿᷏崗푳遃瓫\uec6fꏔ쉅鞨鿆稜땳\uddb6\ueafb⢭钚\ue1f0", 30 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr30);
                                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                                            c("䁎Ϋ铫愊\u0dbe廵\uf501엶췴㢢", 10 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr31);
                                            java.lang.Object[] objArr32 = (java.lang.Object[]) cls11.getField(((java.lang.String) objArr31[0]).intern()).get(invoke2);
                                            int length3 = objArr32.length;
                                            int i25 = 0;
                                            while (i25 < length3) {
                                                java.lang.Object obj9 = objArr32[i25];
                                                getPaymentFci = (SdkCoreBusinessLogicModuleImpl + 55) % 128;
                                                try {
                                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                    java.lang.Object obj10 = invoke2;
                                                    c("ᓱⷽ屐中쁸譢쩐ᾡ\uf501엶\ue6c2醱钡ᘦ볊誖ᄳ嶸⼱㲷⹔ᬲ솊摔췴㢢\uda85븠", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 27, objArr33);
                                                    java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr33[0]).intern());
                                                    int i26 = i22;
                                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                    c("땳\uddb6댪\udf47급쵤䅿俞煱\uea4e萜㙝", 10 - android.view.MotionEvent.axisFromString(""), objArr34);
                                                    java.lang.String str = intern;
                                                    java.lang.Object invoke3 = cls12.getMethod(((java.lang.String) objArr34[0]).intern(), java.lang.String.class).invoke(null, intern);
                                                    try {
                                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                                        c("뫯訳飽梪㍠\uee42閾粆뀃ݞ䪉핣趿᷏崗푳遃瓫\udada欧솊摔㫙ᝒ暜≖蟦\u0c71", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, objArr35);
                                                        java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr35[0]).intern());
                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                        c("㷧黡ᕃꓼ\u000e瑰\uf268\ue334篙녰♏䣤", 11 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr36);
                                                        try {
                                                            java.lang.Object[] objArr37 = {cls13.getMethod(((java.lang.String) objArr36[0]).intern(), null).invoke(obj9, null)};
                                                            java.lang.Object[] objArr38 = new java.lang.Object[1];
                                                            c("ᓱⷽ屐中쁸譢쩐ᾡ\uf501엶\ue6c2醱钡ᘦ볊誖ᄳ嶸⼱㲷⹔ᬲ솊摔췴㢢\uda85븠", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, objArr38);
                                                            java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr38[0]).intern());
                                                            java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                            c("ࣶ剓땳\uddb6춻翜", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 6, objArr39);
                                                            if (java.nio.ByteBuffer.wrap((byte[]) cls14.getMethod(((java.lang.String) objArr39[0]).intern(), byte[].class).invoke(invoke3, objArr37)).asLongBuffer().equals(longBuffer.rewind())) {
                                                                break loop3;
                                                            }
                                                            i25++;
                                                            invoke2 = obj10;
                                                            intern = str;
                                                            i22 = i26;
                                                        } catch (java.lang.Throwable th6) {
                                                            java.lang.Throwable cause6 = th6.getCause();
                                                            if (cause6 != null) {
                                                                throw cause6;
                                                            }
                                                            throw th6;
                                                        }
                                                    } catch (java.lang.Throwable th7) {
                                                        java.lang.Throwable cause7 = th7.getCause();
                                                        if (cause7 != null) {
                                                            throw cause7;
                                                        }
                                                        throw th7;
                                                    }
                                                } catch (java.lang.Throwable th8) {
                                                    java.lang.Throwable cause8 = th8.getCause();
                                                    if (cause8 != null) {
                                                        throw cause8;
                                                    }
                                                    throw th8;
                                                }
                                            }
                                            i23++;
                                        }
                                    } catch (java.lang.Throwable th9) {
                                        java.lang.Throwable cause9 = th9.getCause();
                                        if (cause9 != null) {
                                            throw cause9;
                                        }
                                        throw th9;
                                    }
                                } catch (java.lang.Throwable th10) {
                                    java.lang.Throwable cause10 = th10.getCause();
                                    if (cause10 != null) {
                                        throw cause10;
                                    }
                                    throw th10;
                                }
                            } catch (java.lang.Throwable th11) {
                                java.lang.Throwable cause11 = th11.getCause();
                                if (cause11 != null) {
                                    throw cause11;
                                }
                                throw th11;
                            }
                        }
                    } catch (java.lang.Throwable unused3) {
                    }
                    java.lang.Object[] objArr40 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr40[0])[0] = i11;
                    ((int[]) objArr40[1])[0] = i11 ^ 2;
                    int i27 = ~i11;
                    java.lang.Object[] objArr41 = {java.lang.Integer.valueOf(i3), num5, java.lang.Integer.valueOf((((~(782066773 | i11)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1173491728) + (((-1080068139) | i27) * (-216)) + (((~(i27 | 782066773)) | 1114425387) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj11 == null) {
                        java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49, 2713 - android.text.TextUtils.getTrimmedLength(""), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b20 = $$a[14];
                        byte b21 = (byte) (b20 - 1);
                        byte b22 = b20;
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        a(b21, b22, (byte) (-b22), objArr42);
                        obj11 = cls15.getMethod((java.lang.String) objArr42[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                    }
                    ((int[]) objArr40[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr41)).intValue();
                    return objArr40;
                }
                java.lang.String lowerCase = strArr2[i10].toLowerCase();
                java.lang.Object[] objArr43 = new java.lang.Object[i7];
                b("\u0000\u0000\u0000\u0000", "\uab27", "\udfffḪ씈쯗", 136194784 - (android.media.AudioTrack.getMaxVolume() > f ? 1 : (android.media.AudioTrack.getMaxVolume() == f ? 0 : -1)), (char) (55236 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i6)), objArr43);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr43[i6]).intern(), "");
                long longValue2 = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                java.lang.Integer num8 = num4;
                long longValue3 = new java.math.BigInteger(replaceAll.substring(i6, 16), 16).longValue();
                int length4 = replaceAll.length();
                if (length4 == 32) {
                    num2 = num3;
                    longBufferArr2[i10] = java.nio.LongBuffer.allocate(2).put(longValue3).put(longValue2);
                } else {
                    if (length4 != 64) {
                        java.lang.Object[] objArr44 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr44[0])[0] = i5;
                        ((int[]) objArr44[1])[0] = i5 ^ 3;
                        int i28 = ~i5;
                        java.lang.Object[] objArr45 = {java.lang.Integer.valueOf(i3), num3, java.lang.Integer.valueOf((((((~((-289603586) | i28)) | (~((-42207351) | i5))) | (~((-1275077641) | i5))) * 765) - 1948326299) + (((~((-331810936) | i28)) | 289603585) * 1530) + (((~(i5 | (-331810936))) | (~(i28 | (-1275077641)))) * 765))};
                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj12 == null) {
                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) android.text.TextUtils.indexOf("", "", 0));
                            byte b23 = $$a[14];
                            byte b24 = (byte) (b23 - 1);
                            byte b25 = b23;
                            java.lang.Object[] objArr46 = new java.lang.Object[1];
                            a(b24, b25, (byte) (-b25), objArr46);
                            obj12 = cls16.getMethod((java.lang.String) objArr46[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj12);
                        }
                        ((int[]) objArr44[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr45)).intValue();
                        return objArr44;
                    }
                    long longValue4 = new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue();
                    java.math.BigInteger bigInteger = new java.math.BigInteger(replaceAll.substring(48), 16);
                    num2 = num3;
                    longBufferArr2[i10] = java.nio.LongBuffer.allocate(4).put(longValue3).put(longValue2).put(longValue4).put(bigInteger.longValue());
                }
                i10++;
                strArr2 = strArr;
                i5 = i;
                num3 = num2;
                num4 = num8;
                i6 = 0;
                f = 0.0f;
                i7 = 1;
            }
        } catch (java.lang.Throwable th12) {
            java.lang.Throwable cause12 = th12.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th12;
        }
    }
}
