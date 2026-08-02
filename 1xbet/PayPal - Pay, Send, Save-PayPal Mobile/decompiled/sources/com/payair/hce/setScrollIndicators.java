package com.payair.hce;

/* loaded from: classes4.dex */
public final class setScrollIndicators {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static char IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int SdkCoreBusinessLogicModuleImpl;
    private static char getAid;
    private static char getProfileVersion;
    private static long values;
    private static int writeReplace;
    private java.lang.String DigitizedCardProfile;
    private byte[] valueOf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 718 - s;
        ?? r6 = 38 - (b * 34);
        byte[] bArr = $$a;
        int i5 = i * 2;
        char[] cArr = new char[35 - i5];
        if (bArr == null) {
            byte b2 = r6;
            i2 = 0;
            int i6 = r6;
            i4 = (i4 + b2) - 2;
            i3 = i6 + 1;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            b2 = bArr[i3];
            i2++;
            i6 = i3;
            i4 = (i4 + b2) - 2;
            i3 = i6 + 1;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i5) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            cArr[i2] = (char) i4;
            if (i2 == 34 - i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (i * 4);
        int i5 = (b2 * 2) + 4;
        byte[] bArr = $$d;
        int i6 = 110 - b;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i6 = i4;
            i3 = 0;
            i6 += i5;
            i5 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i5;
            i5 = bArr[i5];
            i6 += i5;
            i5 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.setScrollIndicators setscrollindicators = (com.payair.hce.setScrollIndicators) objArr[0];
        int i4 = SdkCoreAlternateContactlessPaymentDataImpl;
        SdkCoreBusinessLogicModuleImpl = (i4 + 25) % 128;
        java.lang.String str = setscrollindicators.DigitizedCardProfile;
        SdkCoreBusinessLogicModuleImpl = (i4 + 47) % 128;
        return str;
    }

    public final void values(java.lang.String str) {
        int i = SdkCoreBusinessLogicModuleImpl + 45;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            this.DigitizedCardProfile = str;
        } else {
            this.DigitizedCardProfile = str;
            throw null;
        }
    }

    public final byte[] writeReplace() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl;
        int i2 = i + 77;
        SdkCoreBusinessLogicModuleImpl = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.valueOf;
        int i3 = i + 97;
        SdkCoreBusinessLogicModuleImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final void DigitizedCardProfile(byte[] bArr) {
        int i = SdkCoreBusinessLogicModuleImpl;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 49) % 128;
        this.valueOf = bArr;
        SdkCoreAlternateContactlessPaymentDataImpl = (i + 63) % 128;
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        $11 = ($10 + 105) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        $10 = ($11 + 49) % 128;
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                $11 = ($10 + 35) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf(((c2 << 4) + ((char) (RecordsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(getAid)};
                    int i4 = c2 + i2;
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 62, 1336 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d((byte) 0, (byte) 0, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (getProfileVersion ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson)};
                    int i5 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), android.graphics.Color.alpha(0) + 1335, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d((byte) 0, (byte) 0, 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 53, 3543 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        char c2;
        if (str3 != null) {
            $11 = ($10 + 111) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        java.lang.Object obj = null;
        if (str2 != null) {
            int i2 = $10 + 103;
            $11 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            $10 = ($11 + 65) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        char[] cArr6 = cArr3;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = cArr4.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        java.lang.System.arraycopy(cArr4, 0, cArr7, 0, length);
        java.lang.System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length3 = cArr5.length;
        char[] cArr9 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 21) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 71, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1179, (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d((byte) ($$e & 44), (byte) 0, 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(30 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 3443 - android.view.Gravity.getAbsoluteGravity(0, 0), (char) (3830 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr7[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 26, android.view.View.MeasureSpec.getMode(0) + 1864, (char) (41775 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d((byte) 5, (byte) 0, 0, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr7[intValue2] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 28, 3133 - android.text.TextUtils.indexOf("", ""), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                    byte length4 = (byte) $$d.length;
                    byte b = (byte) (length4 - 4);
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(length4, b, b, objArr8);
                    c2 = 2;
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                } else {
                    c2 = 2;
                }
                cArr8[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr7[intValue2] = getwalletdata.values;
                cArr9[getwalletdata.writeReplace] = (char) ((((int) (writeReplace ^ 1263759066225628708L)) ^ ((cArr7[intValue2] ^ cArr5[getwalletdata.writeReplace]) ^ (values ^ 1263759066225628708L))) ^ ((char) (AlternateContactlessPaymentDataJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                cArr7 = cArr7;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        java.lang.String str4 = new java.lang.String(cArr9);
        $10 = ($11 + 65) % 128;
        objArr[0] = str4;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        SdkCoreBusinessLogicModuleImpl = 1;
        values = 1263759066225628708L;
        writeReplace = -804334044;
        AlternateContactlessPaymentDataJson = (char) 40961;
        getProfileVersion = (char) 16619;
        IccPrivateKeyCrtComponentsJson = (char) 22502;
        RecordsJson = (char) 15829;
        getAid = (char) 37121;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x1555, code lost:
    
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x1559, code lost:
    
        if (r3 >= 28) goto L628;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x155b, code lost:
    
        r2 = r1[r3];
        r6 = new java.lang.Object[1];
        b("\u0000\u0000\u0000\u0000", "頛굩庵\ude17⚆箅ኋ蓀尡嫘拪覆", "\ue916憗残琸", android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x1588, code lost:
    
        r5 = new java.lang.Object[]{((java.lang.String) r6[0]).intern().concat(java.lang.String.valueOf(r2))};
        r6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x1599, code lost:
    
        if (r6 != null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x159b, code lost:
    
        r6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.Gravity.getAbsoluteGravity(0, 0), 3160 - android.text.TextUtils.lastIndexOf(r9, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 33098));
        r11 = new java.lang.Object[1];
        a(612, (byte) (com.payair.hce.setScrollIndicators.$$a[14] - 1), r7[21], r11);
        r6 = r6.getMethod((java.lang.String) r11[0], java.lang.String.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x15ee, code lost:
    
        r5 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x15fb, code lost:
    
        r7 = (int) java.lang.System.currentTimeMillis();
        r10 = ~r7;
        r17 = r3;
        r12 = (((((565 * r5) - 100648429379L) + (((~(r5 | r7)) | ((~((~r5) | r10)) | (-178771634))) * (-564))) + ((~(((-178771634) | r5) | r7)) * 1128)) + (((~(178771633 | r5)) | (~((-178771634) | r10))) * 564)) + 816663270;
        r3 = (int) java.lang.System.currentTimeMillis();
        r6 = (int) java.lang.System.currentTimeMillis();
        r7 = ~r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x1695, code lost:
    
        if (((((int) (r12 >> 32)) & ((((((-26476937) | r3) * (-627)) + 635053320) + (((~(334804461 | r3)) | 1772030872) * (-627))) + (((~((~r3) | (-334804462))) | (~(1772030872 | r3))) * 627))) | (((((((~(659344184 | r7)) | 777882225) * (-865)) - 1981036050) + ((~(r6 | (-659344185))) * 865)) + (((~(777882225 | r7)) | (~(r7 | (-659344185)))) * 865)) & ((int) r12))) != 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x1697, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x169a, code lost:
    
        r4 = r4 + r2;
        r3 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x1699, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x16a7, code lost:
    
        if (r4 < 25.2d) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x16a9, code lost:
    
        r2 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
        r1 = (int) java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x16ce, code lost:
    
        r5 = new java.lang.Object[]{562270524, 16, java.lang.Integer.valueOf((((((~((-632708738) | r1)) | 76551168) | r3) * (-470)) - 1966331185) + (((~(r1 | (-556157570))) | (~((~r1) | 632774351))) * 470))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x1710, code lost:
    
        if (r1 != null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x1712, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 50, 2713 - android.view.KeyEvent.getDeadChar(0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
        r3 = com.payair.hce.setScrollIndicators.$$a[14];
        r7 = new java.lang.Object[1];
        a(653, r3, (byte) (r3 - 1), r7);
        r1 = r1.getMethod((java.lang.String) r7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x1774, code lost:
    
        ((int[]) r2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x177c, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x1321, code lost:
    
        if (((((int) (r12 >> 32)) & ((((((~((~r3) | 1014246685)) | (-2113240384)) * 446) + 384374654) + (((~(r3 | (-1098993699))) | 269746184) * 446)) - 1907373440)) | ((((((~((-1409932379) | r6)) | 1409928282) * (-241)) - 1486126466) + (((~(r6 | (-4097))) | 37880225) * 241)) & ((int) r12))) != 477111747) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x1435, code lost:
    
        if (((((int) (r10 >>> 16)) & (((((~(r3 | (-898767919))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1486717206) + (((-17829897) | r4) * (-216))) + (((~(r4 | (-898767919))) | (-1958972967)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | ((((((~((-204803) | r6)) | (-1437021608)) * (-756)) - 1044005103) + (((~((int) java.lang.System.currentTimeMillis())) | (-204803)) * 756)) & ((int) r10))) == 477111747) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x1553, code lost:
    
        if (((((int) (r14 >> 32)) & (((((~((-17312359) | r3)) * (-301)) + 1429296066) + (((~((-1995675026) | r3)) | (~((~r3) | (-558448615)))) * (-301))) + (((~(r3 | 558448614)) | (-1995675026)) * 301))) | (((((~((-16908582) | r5)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 1275119112) + (((~((~r5) | (-16908582))) | (-1876946944)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) & ((int) r14))) == 477111747) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x2b5a, code lost:
    
        if (r6 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x294d, code lost:
    
        if (r5 == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0626, code lost:
    
        if (((((int) (r14 >> 32)) & ((((((~(602481726 | r5)) | (-2039708138)) * (-865)) + 865595522) + ((~(r3 | (-602481727))) * 865)) + (((~((-2039708138) | r5)) | (~(r5 | (-602481727)))) * 865))) | (((((((~((-1254615608) | r7)) | (~(1607461439 | r8))) * (-406)) - 1198232069) + ((~((-4336162) | r8)) * (-406))) + (((~((-1603125279) | r7)) | (~(1254615607 | r8))) * 406)) & ((int) r14))) != 477111747) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0746, code lost:
    
        if (((((int) (r13 >> 32)) & ((((r3 * 992) + 1537498186) + ((r3 | (~((~r2) | (-1342570593)))) * (-496))) + ((r2 | (-1346839025)) * 496))) | (((((((~(527275703 | r6)) | (-909950707)) * 226) + 2055568080) + (((~((-537929793) | r6)) | ((~(909950706 | r5)) | 155254789)) * (-113))) + ((~(527275703 | r5)) * 113)) & ((int) r13))) != (-1032769152)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x084e, code lost:
    
        if (((r1 & (((((~(1210052423 | r6)) | (~(1647688461 | r5))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 412049258) + (((~(r5 | (-572526601))) | (~((~r5) | (-134890563)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) r3) & (((r4 * 495) - 1434812980) + (((~((~((int) java.lang.System.currentTimeMillis())) | 1630263629)) | 1093259528) * 495)))) == 542074309) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x1218, code lost:
    
        if (((((int) r2) & (((((1992646973 | r3) * (-220)) - 322671581) + (((~(((int) java.lang.System.currentTimeMillis()) | 555420563)) | 1455710252) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) + 1047406798)) | (((int) (r2 >>> 117)) & (((((r6 | 675621458) * 614) + 546408854) + ((((~(1632452625 | r7)) | 134228546) | (~((-1225288260) | r7))) * (-1228))) + (((~(r7 | 1766681171)) | (~((-1091059714) | r7))) * 614)))) != 477111747) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:237:0x22cc  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x2396  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0ac4 A[Catch: all -> 0x4265, TryCatch #4 {all -> 0x4265, blocks: (B:3:0x0002, B:5:0x0018, B:6:0x0055, B:10:0x0143, B:12:0x0181, B:13:0x01cc, B:18:0x0213, B:20:0x0228, B:21:0x0273, B:33:0x0313, B:35:0x0323, B:36:0x036f, B:38:0x038f, B:40:0x039f, B:41:0x03e9, B:43:0x03f2, B:45:0x040b, B:46:0x0455, B:53:0x0871, B:55:0x0884, B:56:0x08d8, B:61:0x0a6c, B:63:0x0ac4, B:64:0x0b17, B:69:0x0ef9, B:71:0x0f0c, B:72:0x0f5a, B:82:0x0ffd, B:84:0x1010, B:85:0x105d, B:87:0x107e, B:89:0x1091, B:90:0x10e1, B:94:0x10f6, B:96:0x1113, B:97:0x1164, B:104:0x1588, B:106:0x159b, B:107:0x15ee, B:119:0x16ce, B:121:0x1712, B:122:0x1767, B:126:0x121d, B:128:0x123a, B:129:0x1290, B:135:0x1331, B:137:0x134e, B:138:0x13a0, B:142:0x143a, B:144:0x1457, B:145:0x14b0, B:150:0x179e, B:152:0x17b2, B:153:0x1800, B:155:0x18c4, B:157:0x18d7, B:158:0x1924, B:166:0x19eb, B:168:0x1a53, B:169:0x1aab, B:173:0x1ada, B:175:0x1aed, B:176:0x1b3b, B:178:0x1bfa, B:180:0x1c0d, B:181:0x1c5a, B:189:0x1d33, B:191:0x1d82, B:192:0x1dd3, B:200:0x1ee3, B:202:0x1ef6, B:203:0x1f48, B:211:0x2017, B:213:0x2058, B:214:0x20ae, B:238:0x22e9, B:240:0x232e, B:241:0x2380, B:245:0x23b0, B:247:0x23c3, B:248:0x2412, B:251:0x2439, B:253:0x244c, B:254:0x24a2, B:261:0x26e8, B:263:0x26fb, B:264:0x274e, B:272:0x2829, B:274:0x2881, B:275:0x28d7, B:302:0x2978, B:304:0x29bf, B:305:0x2a14, B:329:0x2a97, B:331:0x2ae1, B:332:0x2b32, B:335:0x2b5f, B:337:0x2b6e, B:338:0x2bb9, B:342:0x2c8b, B:344:0x2ce7, B:345:0x2d36, B:349:0x2d4d, B:351:0x2d66, B:352:0x2db4, B:356:0x2e72, B:358:0x2ec6, B:359:0x2f1c, B:362:0x2f32, B:364:0x2f41, B:365:0x2f8f, B:369:0x304e, B:371:0x3094, B:372:0x30e7, B:375:0x30fd, B:377:0x310c, B:378:0x3155, B:382:0x3228, B:384:0x326e, B:385:0x32c1, B:388:0x32d7, B:390:0x32e6, B:391:0x3330, B:395:0x33e0, B:397:0x3434, B:398:0x348c, B:402:0x34c5, B:404:0x34ef, B:405:0x354e, B:409:0x3619, B:411:0x365b, B:412:0x36aa, B:416:0x36da, B:418:0x36ed, B:419:0x373e, B:423:0x3804, B:425:0x3848, B:426:0x389d, B:429:0x38b3, B:431:0x38c2, B:432:0x390b, B:436:0x39c5, B:438:0x3a0c, B:439:0x3a60, B:442:0x3a76, B:444:0x3a85, B:445:0x3ad3, B:449:0x3b99, B:451:0x3c01, B:452:0x3c5c, B:455:0x3c72, B:457:0x3c81, B:458:0x3cce, B:462:0x3d8e, B:464:0x3ddb, B:465:0x3e31, B:468:0x3e4f, B:470:0x3e5e, B:471:0x3ea4, B:477:0x3f6f, B:479:0x3fc5, B:480:0x401f, B:482:0x4034, B:484:0x4047, B:485:0x408f, B:487:0x4097, B:489:0x40c6, B:490:0x4125, B:494:0x41a1, B:496:0x41f0, B:497:0x4245, B:603:0x09b1, B:605:0x09c4, B:606:0x0a13, B:612:0x0506, B:614:0x0523, B:615:0x0575, B:620:0x062f, B:622:0x064c, B:623:0x069a, B:628:0x074d, B:630:0x076a, B:631:0x07bc), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$466995e3(java.lang.Object obj) {
        java.lang.String str;
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        java.lang.Throwable th;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        int i4;
        java.lang.Throwable th2;
        java.io.BufferedInputStream bufferedInputStream3;
        java.io.BufferedInputStream bufferedInputStream4;
        long j3;
        long j4;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        int parseInt;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i5;
        int i6;
        java.lang.Object obj4;
        try {
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            int i7 = 0;
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 1837 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                byte[] bArr = $$a;
                byte b = bArr[14];
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a((short) (b - 1), b, (byte) (-bArr[16]), objArr3);
                obj5 = cls.getMethod((java.lang.String) objArr3[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj5);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, null)).longValue();
            long currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            long j5 = ~longValue;
            long j6 = ~currentTimeMillis;
            long j7 = (((-675) * longValue) - 258778341750L) + ((currentTimeMillis | (-382242750) | j5) * (-676)) + (((~(j5 | (-382242750))) | (~(j6 | (-382242750)))) * 676) + (((~(382242749 | j5)) | (~(j5 | j6)) | (~((-382242750) | longValue | currentTimeMillis))) * 676) + 1222321695;
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            int i8 = ~currentTimeMillis3;
            int i9 = 2;
            if (((((int) j7) & (((((~(2011098974 | i8)) | (~((-274353243) | currentTimeMillis3))) * 920) - 2038855459) + (((~((-299519323) | i8)) | 274353242) * 920) + (((~(currentTimeMillis3 | (-25166081))) | (~(i8 | (-274353243))) | (~(2011098974 | currentTimeMillis3))) * 920))) | (((int) (j7 >> 32)) & ((((~((-2119412282) | currentTimeMillis2)) | 1448258097) * 336) + 501358106 + (((~((-682185871) | currentTimeMillis2)) | 11031686) * (-168)) + (((~((~currentTimeMillis2) | (-682185871))) | (-2119412282)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) != 0) {
                java.lang.Object[] objArr4 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                int i10 = ~((int) java.lang.System.currentTimeMillis());
                java.lang.Object[] objArr5 = {562270524, 16, java.lang.Integer.valueOf(((((~((-813264815) | i10)) | 810025760) * (-241)) - 420715778) + (((~(i10 | (-3239055))) | (-913965055)) * 241))};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj6 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.KeyEvent.getDeadChar(0, 0), 2713 - android.text.TextUtils.getOffsetBefore("", 0), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b2 = $$a[14];
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a((short) 653, b2, (byte) (b2 - 1), objArr6);
                    obj6 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj6);
                }
                ((int[]) objArr4[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr5)).intValue();
                return objArr4;
            }
            float f = 0.0f;
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "芄퉊伆ଚﭽ葼\ue334㮈鵗阓ᵰ", "鵽꣨蛦騵", (-425138019) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.os.Process.myPid() >> 22), objArr7);
            java.lang.Object[] objArr8 = {((java.lang.String) objArr7[0]).intern()};
            int i11 = 609763459;
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj7 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1922, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                byte[] bArr2 = $$a;
                byte b3 = bArr2[14];
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a((short) (b3 - 1), b3, (byte) (-bArr2[16]), objArr9);
                obj7 = cls3.getMethod((java.lang.String) objArr9[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
            }
            java.lang.String str2 = (java.lang.String) ((java.lang.reflect.Method) obj7).invoke(null, objArr8);
            int i12 = -1118958177;
            long j8 = 0;
            if (str2 != null) {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "릨蚆\ued7b᫉郞Ꭱ", "䛉䤨㐿Ⱜ", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11315), objArr10);
                java.lang.String intern = ((java.lang.String) objArr10[0]).intern();
                java.lang.Object[] objArr11 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "\uee2fﭾ哓\u0ef5ꩀ\ued07駎烊", "趺\ue423卺呫", android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr11);
                java.lang.String[] strArr = {intern, ((java.lang.String) objArr11[0]).intern()};
                int i13 = 0;
                while (true) {
                    if (i13 >= i9) {
                        break;
                    }
                    if (str2.contains(strArr[i13])) {
                        int i14 = SdkCoreBusinessLogicModuleImpl + 69;
                        SdkCoreAlternateContactlessPaymentDataImpl = i14 % 128;
                        if (i14 % i9 == 0) {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            b("\u0000\u0000\u0000\u0000", "ᄋ濫錝䵸\ufae5釦‘䮈⟚斦ࡒᔪ득䰻ꐠ栚銮옐좠叴耴烊暛", "᮱潂輋▒", android.graphics.drawable.Drawable.resolveOpacity(i7, i7) + 191840795, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr12);
                            java.lang.Object[] objArr13 = {((java.lang.String) objArr12[i7]).intern()};
                            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i11));
                            if (obj8 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 40, 1922 - (android.view.ViewConfiguration.getZoomControlsTimeout() > j8 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == j8 ? 0 : -1)), (char) (android.util.TypedValue.complexToFraction(i7, f, f) > f ? 1 : (android.util.TypedValue.complexToFraction(i7, f, f) == f ? 0 : -1)));
                                byte[] bArr3 = $$a;
                                byte b4 = bArr3[14];
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a((short) (b4 - 1), b4, (byte) (-bArr3[16]), objArr14);
                                java.lang.String str3 = (java.lang.String) objArr14[i7];
                                java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                                clsArr[i7] = java.lang.String.class;
                                obj8 = cls4.getMethod(str3, clsArr);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i11), obj8);
                            }
                            java.lang.Object invoke = ((java.lang.reflect.Method) obj8).invoke(null, objArr13);
                            java.lang.Object[] objArr15 = new java.lang.Object[1];
                            c("≇䃉휢㈘≇䃉\ue354譏湳퐻ꑪ䌰膕㱁쪺㲢拻䤊ꍰﳣ螝䇊㽌튛湳퐻㧢鱡윕睜", 30 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr15);
                            java.lang.Object[] objArr16 = {((java.lang.String) objArr15[i7]).intern()};
                            java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i11));
                            if (obj9 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.keyCodeFromString("") + 40, 1921 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(i7) > j8 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(i7) == j8 ? 0 : -1)));
                                byte[] bArr4 = $$a;
                                byte b5 = bArr4[14];
                                java.lang.Object[] objArr17 = new java.lang.Object[1];
                                a((short) (b5 - 1), b5, (byte) (-bArr4[16]), objArr17);
                                java.lang.String str4 = (java.lang.String) objArr17[i7];
                                java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                                clsArr2[i7] = java.lang.String.class;
                                obj9 = cls5.getMethod(str4, clsArr2);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i11), obj9);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj9).invoke(null, objArr16);
                            if (invoke != null) {
                                java.lang.Object[] objArr18 = new java.lang.Object[i9];
                                objArr18[1] = 42;
                                objArr18[i7] = invoke;
                                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i12));
                                if (obj10 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.view.View.resolveSize(i7, i7), android.view.View.getDefaultSize(i7, i7) + 2594, (char) android.graphics.Color.argb(i7, i7, i7, i7));
                                    byte[] bArr5 = $$a;
                                    byte b6 = bArr5[14];
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a((short) (b6 - 1), b6, (byte) (-bArr5[16]), objArr19);
                                    java.lang.String str5 = (java.lang.String) objArr19[i7];
                                    java.lang.Class<?>[] clsArr3 = new java.lang.Class[i9];
                                    clsArr3[i7] = java.lang.String.class;
                                    clsArr3[1] = java.lang.Integer.TYPE;
                                    obj10 = cls6.getMethod(str5, clsArr3);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i12), obj10);
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, objArr18)).longValue();
                                int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                                long j9 = ~longValue2;
                                long j10 = (~currentTimeMillis4) | (-58418867);
                                long j11 = (242 * longValue2) + 28216312278L + (((~j10) | (~(j9 | (-58418867)))) * (-241)) + ((58418866 | longValue2) * (-482)) + (((~(j10 | longValue2)) | (~(58418866 | j9))) * 241) + 1198681658;
                                int i15 = (int) (j11 >> 32);
                                int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                                int i16 = (int) j11;
                                int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                                if (((i15 & ((((-1342177699) | currentTimeMillis5) * (-381)) + 1607153552 + (((~((~currentTimeMillis5) | (-2099383804))) | (-1343328675)) * 381) + 268594714)) | ((((((~(1935372603 | r7)) | (-2147187644)) * 98) - 2109912562) + (((~((~currentTimeMillis6) | (-498146194))) | 1935372603 | (~(498146193 | currentTimeMillis6))) * (-49)) + (((~(currentTimeMillis6 | 1935372603)) | 1649041450) * 49)) & i16)) == 477111747) {
                                    str = "";
                                    if (android.os.Build.VERSION.SDK_INT > 33) {
                                        java.lang.String str6 = str;
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        c("\uf3c3뼥羊È憌뤶淋魹\uf589❨呱膟伕멆ᬕ\uf46dⱝ䛢탺涏뒤䤲⟈偩涵ぽ\ude02\uda25", android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, objArr20);
                                        java.lang.Object[] objArr21 = {((java.lang.String) objArr20[0]).intern()};
                                        java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                        if (obj11 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3161, (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                            byte[] bArr6 = $$a;
                                            byte b7 = bArr6[14];
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            a((short) (b7 - 1), b7, (byte) (-bArr6[16]), objArr22);
                                            obj11 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj11);
                                        }
                                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr21)).longValue();
                                        int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                                        long j12 = ~longValue3;
                                        long j13 = 192584908 | j12;
                                        long j14 = currentTimeMillis7;
                                        long j15 = ~j14;
                                        str = str6;
                                        long j16 = ((((((-919) * longValue3) + 176985531371L) + (((~(j13 | j14)) | (~((j12 | j15) | (-192584909)))) * 920)) + (((~j13) | (~(192584908 | j15))) * 920)) + ((((~(j13 | j15)) | (~((longValue3 | 192584908) | j14))) | (~((j12 | (-192584909)) | j14))) * 920)) - 1145083199;
                                        int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                                        int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                        int i17 = ~currentTimeMillis9;
                                        if (((((int) (j16 >> 32)) & ((((((~(654372575 | currentTimeMillis8)) | 1487601664) * 1504) - 1320242614) + ((~(currentTimeMillis8 | 2141974239)) * (-1504))) - 1212439712)) | (((((~((-1376714406) | i17)) | 34100229) * 98) + 639568859 + (((~(i17 | (-1481026481))) | (-1376714406) | (~(1481026480 | currentTimeMillis9))) * (-49)) + (((~(currentTimeMillis9 | (-1376714406))) | (-1515126710)) * 49)) & ((int) j16))) == 1) {
                                            i6 = 1;
                                            i5 = 0;
                                            int[] iArr = new int[i6];
                                            int[] iArr2 = new int[i6];
                                            iArr[i5] = i5;
                                            iArr2[i5] = 260;
                                            java.lang.Object[] objArr23 = {iArr, iArr2, null, new int[i6]};
                                            int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                            java.lang.Object[] objArr24 = {562270524, 16, java.lang.Integer.valueOf(((((~((-539365063) | r4)) | 537266886) * 98) - 870715204) + (((~((~currentTimeMillis10) | (-169960458))) | (-539365063) | (~(169960457 | currentTimeMillis10))) * (-49)) + (((~(currentTimeMillis10 | (-539365063))) | (-707227344)) * 49))};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj4 == null) {
                                                java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) android.graphics.Color.green(0));
                                                byte b8 = $$a[14];
                                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                                a((short) 653, b8, (byte) (b8 - 1), objArr25);
                                                obj4 = cls8.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                            }
                                            ((int[]) objArr23[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr24)).intValue();
                                            return objArr23;
                                        }
                                        j = 0;
                                    } else {
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        c("≇䃉恦툠ⱝ䛢탺涏뒤䤲⟈偩ͭ㩍", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13, objArr26);
                                        java.lang.Object[] objArr27 = {((java.lang.String) objArr26[0]).intern()};
                                        java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj12 == null) {
                                            java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.os.Process.myPid() >> 22), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1921, (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                            byte[] bArr7 = $$a;
                                            byte b9 = bArr7[14];
                                            java.lang.Object[] objArr28 = new java.lang.Object[1];
                                            a((short) (b9 - 1), b9, (byte) (-bArr7[16]), objArr28);
                                            obj12 = cls9.getMethod((java.lang.String) objArr28[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                                        }
                                        java.lang.Object invoke3 = ((java.lang.reflect.Method) obj12).invoke(null, objArr27);
                                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                                        b("\u0000\u0000\u0000\u0000", "鸓", "\ue693룒\udf35漎", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 901305062, (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 3807), objArr29);
                                        i5 = 0;
                                        if (invoke3.equals(((java.lang.String) objArr29[0]).intern())) {
                                            i6 = 1;
                                            int[] iArr3 = new int[i6];
                                            int[] iArr22 = new int[i6];
                                            iArr3[i5] = i5;
                                            iArr22[i5] = 260;
                                            java.lang.Object[] objArr232 = {iArr3, iArr22, null, new int[i6]};
                                            int currentTimeMillis102 = (int) java.lang.System.currentTimeMillis();
                                            java.lang.Object[] objArr242 = {562270524, 16, java.lang.Integer.valueOf(((((~((-539365063) | r4)) | 537266886) * 98) - 870715204) + (((~((~currentTimeMillis102) | (-169960458))) | (-539365063) | (~(169960457 | currentTimeMillis102))) * (-49)) + (((~(currentTimeMillis102 | (-539365063))) | (-707227344)) * 49))};
                                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                            if (obj4 == null) {
                                            }
                                            ((int[]) objArr232[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr242)).intValue();
                                            return objArr232;
                                        }
                                        j = 0;
                                    }
                                }
                            }
                            if (invoke2 != null) {
                                java.lang.Object[] objArr30 = {invoke2, 42};
                                java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj13 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.text.TextUtils.getOffsetBefore("", 0) + 2594, (char) android.text.TextUtils.getCapsMode("", 0, 0));
                                    byte[] bArr8 = $$a;
                                    byte b10 = bArr8[14];
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    a((short) (b10 - 1), b10, (byte) (-bArr8[16]), objArr31);
                                    obj13 = cls10.getMethod((java.lang.String) objArr31[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj13);
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj13).invoke(null, objArr30)).longValue();
                                int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                long j17 = ~longValue4;
                                long j18 = currentTimeMillis11;
                                long j19 = ~j18;
                                obj2 = invoke;
                                str = "";
                                long j20 = (407 * longValue4) + 295626510405L + (((~(j17 | j18)) | (~(j19 | (-729942001) | longValue4))) * (-406)) + ((~(j17 | j19 | (-729942001))) * (-406)) + (((~(j18 | 729942000)) | (~(longValue4 | j19))) * 406) + 1987042525;
                                int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                int i18 = ~currentTimeMillis12;
                                int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                int i19 = ~currentTimeMillis13;
                            } else {
                                obj2 = invoke;
                                str = "";
                            }
                            if (obj2 != null) {
                                java.lang.Object[] objArr32 = {obj2, 42};
                                java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj14 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.graphics.Color.alpha(0), android.view.View.MeasureSpec.getSize(0) + 2594, (char) android.view.View.MeasureSpec.getSize(0));
                                    byte[] bArr9 = $$a;
                                    byte b11 = bArr9[14];
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    a((short) (b11 - 1), b11, (byte) (-bArr9[16]), objArr33);
                                    obj14 = cls11.getMethod((java.lang.String) objArr33[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                                }
                                long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr32)).longValue();
                                int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                long j21 = ~longValue5;
                                long j22 = currentTimeMillis14;
                                long j23 = ~j22;
                                obj3 = invoke2;
                                long j24 = ((407 * longValue5) - 131888555775L) + (((~(j21 | j22)) | (~(j23 | 325650755 | longValue5))) * (-406)) + ((~(j21 | j23 | 325650755)) * (-406)) + (((~((-325650756) | j22)) | (~(j23 | longValue5))) * 406) + 931449769;
                                int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                int i20 = (~(1510901860 | currentTimeMillis15)) | (-1515170293);
                                int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                int i21 = ~currentTimeMillis16;
                            } else {
                                obj3 = invoke2;
                            }
                            if (obj3 != null) {
                                java.lang.Object[] objArr34 = {obj3, 42};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj15 == null) {
                                    java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 28, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2595, (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                                    byte[] bArr10 = $$a;
                                    byte b12 = bArr10[14];
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    a((short) (b12 - 1), b12, (byte) (-bArr10[16]), objArr35);
                                    obj15 = cls12.getMethod((java.lang.String) objArr35[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                                }
                                long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr34)).longValue();
                                int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                long j25 = ~longValue6;
                                long j26 = currentTimeMillis17;
                                long j27 = ~j26;
                                long j28 = ~(618587174 | j25);
                                long j29 = (longValue6 * (-463)) + 287643035910L + (((~(j27 | 618587174)) | (~(j25 | j27)) | j28) * 464) + ((j25 | (-618587175) | j26) * (-464)) + (((~(618587174 | j26)) | j28) * 464) + 638513350;
                                int i22 = (int) (j29 >> 32);
                                int currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                            }
                            j = 0;
                        }
                    } else {
                        i13++;
                        f = 0.0f;
                        i12 = -1118958177;
                        i7 = 0;
                        i9 = 2;
                        j8 = 0;
                        i11 = 609763459;
                    }
                }
            }
            str = "";
            j = j8;
            java.lang.Object[] objArr36 = new java.lang.Object[1];
            c("\ue31a䯄⩆낄⿋ꩭ膕㱁", 8 - android.widget.ExpandableListView.getPackedPositionType(j), objArr36);
            java.lang.String intern2 = ((java.lang.String) objArr36[0]).intern();
            java.lang.Object[] objArr37 = new java.lang.Object[1];
            c("枝\uf442鍠ￃ쓝卛", android.view.KeyEvent.normalizeMetaState(0) + 6, objArr37);
            java.lang.String intern3 = ((java.lang.String) objArr37[0]).intern();
            java.lang.Object[] objArr38 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "捻リ蒗諟\ue8e3\ueeb8룕", "\ue8e1⺜蹀鏣", 40216 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.View.combineMeasuredStates(0, 0), objArr38);
            java.lang.String intern4 = ((java.lang.String) objArr38[0]).intern();
            java.lang.Object[] objArr39 = new java.lang.Object[1];
            c("沼ܢ䎡須윕睜曽丳鑓땷", 8 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr39);
            java.lang.String intern5 = ((java.lang.String) objArr39[0]).intern();
            java.lang.Object[] objArr40 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\uf104싀컗駷좀\ue694", "ꮽも䯚⭭", 1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27979), objArr40);
            java.lang.String intern6 = ((java.lang.String) objArr40[0]).intern();
            java.lang.Object[] objArr41 = new java.lang.Object[1];
            c("➇坔ꞡⷛᬕ\uf46dⱝ䛢탺涏ଚ갰⪃ꒇ", android.view.View.MeasureSpec.getSize(0) + 13, objArr41);
            java.lang.String intern7 = ((java.lang.String) objArr41[0]).intern();
            java.lang.Object[] objArr42 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\ue208묫炬\uedd6䳦", "\ue14a跶\ue291腍", (-1852967199) - android.view.View.combineMeasuredStates(0, 0), (char) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19938), objArr42);
            java.lang.String intern8 = ((java.lang.String) objArr42[0]).intern();
            java.lang.Object[] objArr43 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "唌碻隐\ue879\uf883\uef23", "⚎\ude80\ue3e9⧃", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (50147 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr43);
            java.lang.String intern9 = ((java.lang.String) objArr43[0]).intern();
            java.lang.String str7 = str;
            java.lang.Object[] objArr44 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\ueba5ྕ", "浤摇▪뭴", android.view.Gravity.getAbsoluteGravity(0, 0), (char) (29732 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr44);
            java.lang.String intern10 = ((java.lang.String) objArr44[0]).intern();
            java.lang.Object[] objArr45 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "䉼甦ⲡ췘ꝱ煍䮛䱱衏茑㚾અ읒උꇛ၆", "\ue369\ua7f0\uf587壘", android.view.KeyEvent.keyCodeFromString(str7), (char) (19189 - android.view.View.MeasureSpec.getMode(0)), objArr45);
            java.lang.String intern11 = ((java.lang.String) objArr45[0]).intern();
            java.lang.Object[] objArr46 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\udf94⋧酘싖῭퍛둉\uf315鯼왈", "緜᧒銔ꗛ", android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, (char) android.view.View.getDefaultSize(0, 0), objArr46);
            java.lang.String intern12 = ((java.lang.String) objArr46[0]).intern();
            java.lang.Object[] objArr47 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "䙓⤟詜旳뽻⿃陆\ue1ff", "說먖歿떡", android.view.KeyEvent.normalizeMetaState(0), (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), objArr47);
            java.lang.String intern13 = ((java.lang.String) objArr47[0]).intern();
            java.lang.Object[] objArr48 = new java.lang.Object[1];
            c("\u1bfa䬺掘嵜ᴒ帉呱膟嗣覆\uaad4\udae2", 12 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr48);
            java.lang.String intern14 = ((java.lang.String) objArr48[0]).intern();
            java.lang.Object[] objArr49 = new java.lang.Object[1];
            c("\u1bfa䬺掘嵜ᴒ帉呱膟嗣覆羊È蟏ꂹ", 14 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr49);
            java.lang.String intern15 = ((java.lang.String) objArr49[0]).intern();
            java.lang.Object[] objArr50 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "ꎞ䔾ࣘǊ\uf628螁蠌", "\ue881鱊\ueb19\ud82b", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 429673191, (char) android.view.View.combineMeasuredStates(0, 0), objArr50);
            java.lang.String intern16 = ((java.lang.String) objArr50[0]).intern();
            java.lang.Object[] objArr51 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\ue5e1ᑢ\ue0e5Ჿ퉺킏牉", "㻇\uf637䃒ﱥ", (-755615938) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.MotionEvent.axisFromString(str7) + 1), objArr51);
            java.lang.String intern17 = ((java.lang.String) objArr51[0]).intern();
            java.lang.Object[] objArr52 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "\u1a7dￓꡈꈡ眢뻣읺", "㡷緗㉣붬", 1669191480 - android.view.View.getDefaultSize(0, 0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr52);
            java.lang.String intern18 = ((java.lang.String) objArr52[0]).intern();
            java.lang.Object[] objArr53 = new java.lang.Object[1];
            c("趆\udee6", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr53);
            java.lang.String intern19 = ((java.lang.String) objArr53[0]).intern();
            java.lang.Object[] objArr54 = new java.lang.Object[1];
            c("廪죏枝\uf442\uf112\uef1d凚ڋ䘸쯔娱ᗦ鯘\ufdee걍\uf238庯尺ጡ仛", 20 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr54);
            java.lang.String intern20 = ((java.lang.String) objArr54[0]).intern();
            java.lang.Object[] objArr55 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "델仹锜膺⨖餄", "쎨ㄧꇮ玥", android.graphics.Color.red(0), (char) (42402 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), objArr55);
            java.lang.String intern21 = ((java.lang.String) objArr55[0]).intern();
            java.lang.Object[] objArr56 = new java.lang.Object[1];
            c("鹄ᦛ", android.view.KeyEvent.normalizeMetaState(0) + 2, objArr56);
            java.lang.String intern22 = ((java.lang.String) objArr56[0]).intern();
            java.lang.Object[] objArr57 = new java.lang.Object[1];
            c("̖뤌淋魹蟫\uf771퐃Ჹ䑕⥕廪죏\uf4f0敭\uf7c9娛", 17 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr57);
            java.lang.String intern23 = ((java.lang.String) objArr57[0]).intern();
            java.lang.Object[] objArr58 = new java.lang.Object[1];
            c("㞯\ue669秇䡐㈄\ud96c\uf4f0敭⢄뼿", 10 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr58);
            java.lang.String intern24 = ((java.lang.String) objArr58[0]).intern();
            java.lang.Object[] objArr59 = new java.lang.Object[1];
            c("㞯\ue669秇䡐㈄\ud96c\uf4f0敭雮뺦", 10 - android.text.TextUtils.indexOf(str7, str7, 0, 0), objArr59);
            java.lang.String intern25 = ((java.lang.String) objArr59[0]).intern();
            java.lang.Object[] objArr60 = new java.lang.Object[1];
            c("㞯\ue669秇䡐윕睜\uf852\udd65쪺㲢ꖘ頝", 11 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr60);
            java.lang.String intern26 = ((java.lang.String) objArr60[0]).intern();
            java.lang.Object[] objArr61 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "㺑鑙쨠ꣃᛙ쉣鹱잋\uec2dꞫྛ", "皔\ue036⺅禎", (-2048903562) - android.view.Gravity.getAbsoluteGravity(0, 0), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr61);
            java.lang.String intern27 = ((java.lang.String) objArr61[0]).intern();
            java.lang.Object[] objArr62 = new java.lang.Object[1];
            c("ꕮ鏭凚ڋ醗磱젇瘣\uedd5쌅\u0a60ᅿ\uf27f곪ᄲ嚔", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - '!', objArr62);
            java.lang.String intern28 = ((java.lang.String) objArr62[0]).intern();
            java.lang.Object[] objArr63 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "胪Ⱕ\ue3e4ᦽ뗃\ufe1e熌ක⼶ꇃ≌쾢昍ᨤ", "䧑䩍翰烬", android.view.ViewConfiguration.getLongPressTimeout() >> 16, (char) (60543 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr63);
            java.lang.String[] strArr2 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr63[0]).intern()};
            java.lang.Object[] objArr64 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "芄퉊伆ଚﭽ葼\ue334㮈鵗阓ᵰ", "鵽꣨蛦騵", android.widget.ExpandableListView.getPackedPositionChild(0L) - 425138018, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr64);
            java.lang.Object[] objArr65 = {((java.lang.String) objArr64[0]).intern()};
            java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj16 == null) {
                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 40, android.graphics.Color.argb(0, 0, 0, 0) + 1921, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                byte[] bArr11 = $$a;
                byte b13 = bArr11[14];
                java.lang.Object[] objArr66 = new java.lang.Object[1];
                a((short) (b13 - 1), b13, (byte) (-bArr11[16]), objArr66);
                obj16 = cls13.getMethod((java.lang.String) objArr66[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj16);
            }
            java.lang.String str8 = (java.lang.String) ((java.lang.reflect.Method) obj16).invoke(null, objArr65);
            if (str8 != null) {
                java.lang.Object[] objArr67 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "릨蚆\ued7b᫉郞Ꭱ", "䛉䤨㐿Ⱜ", 1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (11316 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr67);
                java.lang.String intern29 = ((java.lang.String) objArr67[0]).intern();
                java.lang.Object[] objArr68 = new java.lang.Object[1];
                b("\u0000\u0000\u0000\u0000", "\uee2fﭾ哓\u0ef5ꩀ\ued07駎烊", "趺\ue423卺呫", android.view.KeyEvent.keyCodeFromString(str7), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr68);
                java.lang.String[] strArr3 = {intern29, ((java.lang.String) objArr68[0]).intern()};
                int i23 = 0;
                while (true) {
                    if (i23 >= 2) {
                        break;
                    }
                    if (str8.contains(strArr3[i23])) {
                        SdkCoreAlternateContactlessPaymentDataImpl = (SdkCoreBusinessLogicModuleImpl + 121) % 128;
                        java.lang.Object[] objArr69 = new java.lang.Object[1];
                        b("\u0000\u0000\u0000\u0000", "ᄋ濫錝䵸\ufae5釦‘䮈⟚斦ࡒᔪ득䰻ꐠ栚銮옐좠叴耴烊暛", "᮱潂輋▒", 191840795 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1), objArr69);
                        java.lang.Object[] objArr70 = {((java.lang.String) objArr69[0]).intern()};
                        java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj17 == null) {
                            java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1921, (char) android.view.KeyEvent.normalizeMetaState(0));
                            byte[] bArr12 = $$a;
                            byte b14 = bArr12[14];
                            java.lang.Object[] objArr71 = new java.lang.Object[1];
                            a((short) (b14 - 1), b14, (byte) (-bArr12[16]), objArr71);
                            obj17 = cls14.getMethod((java.lang.String) objArr71[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                        }
                        java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr70);
                        java.lang.Object[] objArr72 = new java.lang.Object[1];
                        c("≇䃉휢㈘≇䃉\ue354譏湳퐻ꑪ䌰膕㱁쪺㲢拻䤊ꍰﳣ螝䇊㽌튛湳퐻㧢鱡윕睜", 30 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr72);
                        java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj18 == null) {
                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1920, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                            byte[] bArr13 = $$a;
                            byte b15 = bArr13[14];
                            java.lang.Object[] objArr74 = new java.lang.Object[1];
                            a((short) (b15 - 1), b15, (byte) (-bArr13[16]), objArr74);
                            obj18 = cls15.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                        }
                        java.lang.Object invoke5 = ((java.lang.reflect.Method) obj18).invoke(null, objArr73);
                        if (invoke4 != null) {
                            int i24 = SdkCoreAlternateContactlessPaymentDataImpl + 23;
                            SdkCoreBusinessLogicModuleImpl = i24 % 128;
                            if (i24 % 2 == 0) {
                                java.lang.Object[] objArr75 = {invoke4, 11};
                                java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj19 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 28, 2593 - android.view.MotionEvent.axisFromString(str7), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                    byte[] bArr14 = $$a;
                                    byte b16 = bArr14[14];
                                    java.lang.Object[] objArr76 = new java.lang.Object[1];
                                    a((short) (b16 - 1), b16, (byte) (-bArr14[16]), objArr76);
                                    obj19 = cls16.getMethod((java.lang.String) objArr76[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                }
                                long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr75)).longValue();
                                long currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                                long j30 = ~longValue7;
                                long j31 = ~currentTimeMillis19;
                                long j32 = ((-675) * longValue7) + 711638310986L + ((currentTimeMillis19 | 1051164418 | j30) * (-676)) + (((~(j30 | 1051164418)) | (~(j31 | 1051164418))) * 676) + (((~(j30 | (-1051164419))) | (~(j30 | j31)) | (~(longValue7 | 1051164418 | currentTimeMillis19))) * 676) + 205936106;
                                int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                int i25 = ~currentTimeMillis20;
                            } else {
                                java.lang.Object[] objArr77 = {invoke4, 42};
                                java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj20 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str7) + 28, 2594 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                    byte[] bArr15 = $$a;
                                    byte b17 = bArr15[14];
                                    java.lang.Object[] objArr78 = new java.lang.Object[1];
                                    a((short) (b17 - 1), b17, (byte) (-bArr15[16]), objArr78);
                                    obj20 = cls17.getMethod((java.lang.String) objArr78[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr77)).longValue();
                                long currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                                long j33 = ~longValue8;
                                long j34 = ((-282) * longValue8) + 28969781248L + (((~(currentTimeMillis21 | (-102006273))) | (~(longValue8 | (-102006273)))) * (-283)) + ((~(102006272 | j33)) * 283) + ((~((-102006273) | j33 | currentTimeMillis21)) * 283) + 1155094252;
                                int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                                int i26 = ~((int) java.lang.System.currentTimeMillis());
                            }
                        }
                        if (invoke5 != null) {
                            int i27 = SdkCoreBusinessLogicModuleImpl + 115;
                            SdkCoreAlternateContactlessPaymentDataImpl = i27 % 128;
                            if (i27 % 2 != 0) {
                                java.lang.Object[] objArr79 = {invoke5, 16};
                                java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj21 == null) {
                                    java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7, 0, 0) + 28, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2594, (char) android.view.View.combineMeasuredStates(0, 0));
                                    byte[] bArr16 = $$a;
                                    byte b18 = bArr16[14];
                                    java.lang.Object[] objArr80 = new java.lang.Object[1];
                                    a((short) (b18 - 1), b18, (byte) (-bArr16[16]), objArr80);
                                    obj21 = cls18.getMethod((java.lang.String) objArr80[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr79)).longValue();
                                long j35 = 540912087 | longValue9;
                                long currentTimeMillis23 = (int) java.lang.System.currentTimeMillis();
                                long j36 = (~currentTimeMillis23) | (-540912088);
                                long j37 = ~(currentTimeMillis23 | j35);
                                long j38 = (503 * longValue9) + 272078779761L + (j35 * (-502)) + (((~((-540912088) | (~longValue9))) | (~j36) | j37) * (-502)) + (((~(j36 | longValue9)) | j37) * 502) + 716188437;
                                int i28 = ~((int) java.lang.System.currentTimeMillis());
                            } else {
                                java.lang.Object[] objArr81 = {invoke5, 42};
                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj22 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2595 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                                    byte[] bArr17 = $$a;
                                    byte b19 = bArr17[14];
                                    java.lang.Object[] objArr82 = new java.lang.Object[1];
                                    a((short) (b19 - 1), b19, (byte) (-bArr17[16]), objArr82);
                                    obj22 = cls19.getMethod((java.lang.String) objArr82[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj22);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj22).invoke(null, objArr81)).longValue();
                                int currentTimeMillis24 = (int) java.lang.System.currentTimeMillis();
                                long j39 = ~longValue10;
                                long j40 = currentTimeMillis24;
                                long j41 = ~j40;
                                long j42 = ((-67) * longValue10) + 64572888240L + (((~(j39 | (-935838961) | j41)) | (~(longValue10 | 935838960)) | (~(j40 | longValue10))) * (-68)) + ((~((-935838961) | j41 | longValue10)) * (-68)) + (((~(j39 | j41)) | (-935838961)) * 68) + 321261564;
                                int currentTimeMillis25 = (int) java.lang.System.currentTimeMillis();
                                int currentTimeMillis26 = (int) java.lang.System.currentTimeMillis();
                            }
                        }
                    } else {
                        i23++;
                    }
                }
            }
            java.lang.Object[] objArr83 = new java.lang.Object[1];
            c("仳楋膕㱁휆\ue962춬㞓ᘿ멼씞僗螝䇊哔㻽ֵ遈㡀큓\ude02\uda25ͭ㩍", 23 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr83);
            java.lang.Object[] objArr84 = {((java.lang.String) objArr83[0]).intern()};
            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj23 == null) {
                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 2807 - android.text.TextUtils.indexOf(str7, str7), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)));
                byte[] bArr18 = $$a;
                byte b20 = bArr18[14];
                java.lang.Object[] objArr85 = new java.lang.Object[1];
                a((short) (b20 - 1), b20, (byte) (-bArr18[16]), objArr85);
                obj23 = cls20.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj23);
            }
            long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj23).invoke(null, objArr84)).longValue();
            int currentTimeMillis27 = (int) java.lang.System.currentTimeMillis();
            long j43 = ~longValue11;
            long j44 = (-947471005) | j43;
            long j45 = currentTimeMillis27;
            long j46 = ((longValue11 * (-344)) - 325930025376L) + (((~(j45 | (-947471005))) | (~j44)) * 345) + (((~(947471004 | j43)) | (~((-947471005) | (~j45)))) * 345) + ((~(j44 | j45)) * 345) + 343069063;
            int currentTimeMillis28 = (int) java.lang.System.currentTimeMillis();
            int i29 = ~currentTimeMillis28;
            int currentTimeMillis29 = (int) java.lang.System.currentTimeMillis();
            long j47 = (((int) (j46 >> 32)) & ((((~(1309405744 | i29)) | 127820666) * (-1042)) + 11724100 + ((1309405744 | currentTimeMillis28) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~(currentTimeMillis28 | (-127820667))) | 101343792 | (~(i29 | 1335882618))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((((~((~currentTimeMillis29) | (-8399362))) | (~((-1744999859) | currentTimeMillis29))) * (-302)) + 803268427 + ((~((-8399362) | currentTimeMillis29)) * (-604)) + (((~((-1753399220) | currentTimeMillis29)) | (-2061172668)) * 302)) & ((int) j46));
            java.lang.Object[] objArr86 = new java.lang.Object[1];
            c("矩䀺≇䃉䷡ꄺᘿ멼曳\ue9f0仳楋\ue281墛\ue772烴\uf70d\uf561", 18 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr86);
            java.lang.Object[] objArr87 = {((java.lang.String) objArr86[0]).intern()};
            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj24 == null) {
                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 29, 2807 - android.text.TextUtils.getTrimmedLength(str7), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                byte[] bArr19 = $$a;
                byte b21 = bArr19[14];
                java.lang.Object[] objArr88 = new java.lang.Object[1];
                a((short) (b21 - 1), b21, (byte) (-bArr19[16]), objArr88);
                obj24 = cls21.getMethod((java.lang.String) objArr88[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj24);
            }
            long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr87)).longValue();
            long currentTimeMillis30 = (int) java.lang.System.currentTimeMillis();
            long j48 = ~currentTimeMillis30;
            long j49 = ((561 * longValue12) - 517497155682L) + ((~(j48 | 925755198)) * (-560)) + ((~((~longValue12) | 925755198 | currentTimeMillis30)) * (-560)) + (((~(j48 | longValue12)) | (~(longValue12 | (-925755199)))) * 560) + 364784869;
            int currentTimeMillis31 = (int) java.lang.System.currentTimeMillis();
            int i30 = ~(((int) java.lang.System.currentTimeMillis()) | (-531297411));
            long j50 = (((int) (j49 >> 32)) & ((((~(302313603 | currentTimeMillis31)) | (-1134912808)) * (-465)) + 4972013 + (((~((-1134912808) | currentTimeMillis31)) | 302313603) * 930) + ((currentTimeMillis31 | (-1101071653)) * 465))) | ((((905928999 | i30) * (-220)) + 1117542715 + ((i30 | 363487234) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 818302182) & ((int) j49));
            if (j47 > 0 && j50 > 0 && j50 - 3 < j47) {
                java.lang.Object[] objArr89 = {new int[]{0}, new int[]{247}, null, new int[1]};
                int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                int i31 = ~currentTimeMillis32;
                java.lang.Object[] objArr90 = {562270524, 16, java.lang.Integer.valueOf((((((~((-610754933) | i31)) | 73400656) | (~((-98570588) | i31))) * (-1136)) - 120705513) + (((~((-610754933) | currentTimeMillis32)) | (~((-98570588) | currentTimeMillis32)) | (~(635924863 | i31))) * (-568)) + (((~(currentTimeMillis32 | (-73400657))) | (~(i31 | 610754932)) | (~(98570587 | i31))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj25 == null) {
                    java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 2714, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b22 = $$a[14];
                    java.lang.Object[] objArr91 = new java.lang.Object[1];
                    a((short) 653, b22, (byte) (b22 - 1), objArr91);
                    obj25 = cls22.getMethod((java.lang.String) objArr91[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                }
                ((int[]) objArr89[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr90)).intValue();
                return objArr89;
            }
            java.lang.Object[] objArr92 = new java.lang.Object[1];
            c("仳楋膕㱁휆\ue962춬㞓ᘿ멼씞僗螝䇊哔㻽ֵ遈㡀큓\ude02\uda25ͭ㩍", android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 24, objArr92);
            java.lang.Object[] objArr93 = {((java.lang.String) objArr92[0]).intern()};
            java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj26 == null) {
                java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 30, 2808 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getOffsetAfter(str7, 0));
                byte[] bArr20 = $$a;
                byte b23 = bArr20[14];
                java.lang.Object[] objArr94 = new java.lang.Object[1];
                a((short) (b23 - 1), b23, (byte) (-bArr20[16]), objArr94);
                obj26 = cls23.getMethod((java.lang.String) objArr94[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj26);
            }
            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj26).invoke(null, objArr93)).longValue();
            long currentTimeMillis33 = (int) java.lang.System.currentTimeMillis();
            long j51 = (192 * longValue13) + 4442187271L + (((~(longValue13 | currentTimeMillis33)) | (-23379932)) * 191) + (((~(longValue13 | 23379931)) | (~((~currentTimeMillis33) | longValue13))) * 191) + 1313919999;
            int currentTimeMillis34 = (int) java.lang.System.currentTimeMillis();
            int i32 = ~currentTimeMillis34;
            int i33 = ~(currentTimeMillis34 | (-1075941377));
            int currentTimeMillis35 = (int) java.lang.System.currentTimeMillis();
            long j52 = (((int) (j51 >> 32)) & ((((~((-226911070) | i32)) | 92537104 | i33) * (-713)) + 349649722 + (i33 * 1426) + ((~((-1210315342) | i32)) * 713))) | ((((((~(480720083 | r8)) | (~(956506326 | r8))) * (-867)) - 1972008908) + (((~(480720083 | currentTimeMillis35)) | (-1034368216) | (~(956506326 | currentTimeMillis35))) * (-1734)) + (((~((-77861890) | currentTimeMillis35)) | (~(currentTimeMillis35 | (-553648133))) | (~((~currentTimeMillis35) | 1034368215))) * 867)) & ((int) j51));
            java.lang.Object[] objArr95 = new java.lang.Object[1];
            c("ᴩ喹菚᷈", 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr95);
            java.lang.Object[] objArr96 = {((java.lang.String) objArr95[0]).intern()};
            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj27 == null) {
                java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 29, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2807, (char) android.graphics.Color.green(0));
                byte[] bArr21 = $$a;
                byte b24 = bArr21[14];
                java.lang.Object[] objArr97 = new java.lang.Object[1];
                a((short) (b24 - 1), b24, (byte) (-bArr21[16]), objArr97);
                obj27 = cls24.getMethod((java.lang.String) objArr97[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj27);
            }
            long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr96)).longValue();
            int currentTimeMillis36 = (int) java.lang.System.currentTimeMillis();
            long j53 = ~longValue14;
            long j54 = currentTimeMillis36;
            long j55 = (longValue14 * 965) + 573267716576L + (((~(j53 | j54)) | 595293579) * (-964)) + (((~(j53 | (-595293580))) | (~((~j54) | j53))) * (-964)) + 1885833647;
            int currentTimeMillis37 = (int) java.lang.System.currentTimeMillis();
            int i34 = ~currentTimeMillis37;
            int currentTimeMillis38 = (int) java.lang.System.currentTimeMillis();
            int i35 = ~currentTimeMillis38;
            long j56 = (((int) (j55 >> 32)) & ((((~(950365586 | i34)) | (~(1907375298 | currentTimeMillis37))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 957274400 + (((~(currentTimeMillis37 | (-1091571777))) | (~(i34 | (-134562065)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | ((((((~(1425667487 | currentTimeMillis38)) | (~((-1346409857) | i35))) * 920) - 2038855459) + (((~(1357968778 | i35)) | (-1425667488)) * 920) + (((~(currentTimeMillis38 | (-67698710))) | (~(i35 | 1425667487)) | (~((-1346409857) | currentTimeMillis38))) * 920)) & ((int) j55));
            if (j52 > 0) {
                if (j56 > 0) {
                    SdkCoreBusinessLogicModuleImpl = (SdkCoreAlternateContactlessPaymentDataImpl + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                    if (j56 + 100 < j52) {
                        java.lang.Object[] objArr98 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                        int currentTimeMillis39 = (int) java.lang.System.currentTimeMillis();
                        java.lang.Object[] objArr99 = {562270524, 16, java.lang.Integer.valueOf((((~((-764066794) | currentTimeMillis39)) | 747156192) * 345) + 805157336 + (((~((-764066794) | (~currentTimeMillis39))) | (-801897466)) * 345) + ((~(currentTimeMillis39 | (-747156193))) * 345))};
                        java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj28 == null) {
                            java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2712 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getTrimmedLength(str7));
                            byte b25 = $$a[14];
                            java.lang.Object[] objArr100 = new java.lang.Object[1];
                            a((short) 653, b25, (byte) (b25 - 1), objArr100);
                            obj28 = cls25.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                        }
                        ((int[]) objArr98[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr99)).intValue();
                        return objArr98;
                    }
                }
                j2 = 0;
            } else {
                j2 = 0;
            }
            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(j2);
            java.lang.Object[] objArr101 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "矢总Ⅷ\uda6bﲕ풺䬍", "똲ᔼ숃挽", packedPositionType + 51723446, (char) ((-1) - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr101);
            java.lang.String intern30 = ((java.lang.String) objArr101[0]).intern();
            java.lang.Object[] objArr102 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "뾣㤾砛졐鄵垰\u1f1f㼗뢨\ue352ᮌ", "䣶磥葓徳", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1400431944, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr102);
            java.lang.String intern31 = ((java.lang.String) objArr102[0]).intern();
            java.lang.Object[] objArr103 = new java.lang.Object[1];
            c("仳楋膕㱁쪺㲢ぐ孑邀\ude6d➇坔", 13 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr103);
            java.lang.String intern32 = ((java.lang.String) objArr103[0]).intern();
            java.lang.Object[] objArr104 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "痭屄㫄䁢Ⱋ䓀\uefaf웖℘鲍郅骧", "䖽\uef1c炙첤", android.text.TextUtils.getOffsetAfter(str7, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr104);
            java.lang.String intern33 = ((java.lang.String) objArr104[0]).intern();
            java.lang.Object[] objArr105 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "ळ칔錀垇璧鴼꒰铰Ｇ쿒\ue441", "꿭眃ボ皔", android.view.View.MeasureSpec.getSize(0) - 596180049, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), objArr105);
            java.lang.String intern34 = ((java.lang.String) objArr105[0]).intern();
            java.lang.Object[] objArr106 = new java.lang.Object[1];
            c("仳楋\uf462龸崛ꪪ", 5 - android.view.KeyEvent.getDeadChar(0, 0), objArr106);
            java.lang.String intern35 = ((java.lang.String) objArr106[0]).intern();
            java.lang.Object[] objArr107 = new java.lang.Object[1];
            b("\u0000\u0000\u0000\u0000", "䝜趔뢔ࢲ", "\uf879ቅ쒃ࡤ", android.text.TextUtils.indexOf(str7, str7, 0), (char) (25796 - android.text.TextUtils.indexOf(str7, str7, 0)), objArr107);
            java.lang.String[] strArr4 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr107[0]).intern()};
            int i36 = 0;
            while (true) {
                if (i36 >= 7) {
                    i = 0;
                    break;
                }
                java.lang.Object[] objArr108 = {strArr4[i36]};
                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                if (obj29 == null) {
                    java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), 1672 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) (47940 - android.view.Gravity.getAbsoluteGravity(0, 0)));
                    byte[] bArr22 = $$a;
                    byte b26 = bArr22[14];
                    java.lang.Object[] objArr109 = new java.lang.Object[1];
                    a((short) (b26 - 1), b26, (byte) (-bArr22[16]), objArr109);
                    obj29 = cls26.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj29);
                }
                long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj29).invoke(null, objArr108)).longValue();
                int currentTimeMillis40 = (int) java.lang.System.currentTimeMillis();
                long j57 = ~longValue15;
                long j58 = (-1085763881) | j57;
                long j59 = currentTimeMillis40;
                int i37 = i36;
                long j60 = ((((((-622) * longValue15) - 677516661744L) + ((~(j58 | j59)) * 623)) + (((~j59) | (~(longValue15 | 1085763880))) * (-623))) + ((((~j58) | (~(j57 | j59))) | (~((-1085763881) | j59))) * 623)) - 539766301;
                int currentTimeMillis41 = (int) java.lang.System.currentTimeMillis();
                int i38 = ~currentTimeMillis41;
                int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                if (((((int) (j60 >> 32)) & ((((704686160 | i38) * (-192)) - 1788177110) + (((~(1778952400 | i38)) | (-1783474645)) * (-384)) + (((~(currentTimeMillis41 | 1783474644)) | (~(i38 | (-4522245))) | (~((-1074266241) | currentTimeMillis41))) * 192))) | ((((((~(669248993 | currentTimeMillis42)) | 170232361) * 398) - 1741483867) + (((~((~currentTimeMillis42) | 669248993)) | 170232361) * 398)) & ((int) j60))) != 0) {
                    i = i37 + 90;
                    break;
                }
                i36 = i37 + 1;
            }
            if (i != 0) {
                java.lang.Object[] objArr110 = {new int[]{0}, new int[]{i}, null, new int[1]};
                java.lang.Object[] objArr111 = {562270524, 16, java.lang.Integer.valueOf((((((~r1) | 340792320) * (-828)) - 379664301) + (((~((int) java.lang.System.currentTimeMillis())) | 368533199) * (-828))) - 202811584)};
                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj30 == null) {
                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2713 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    byte b27 = $$a[14];
                    java.lang.Object[] objArr112 = new java.lang.Object[1];
                    a((short) 653, b27, (byte) (b27 - 1), objArr112);
                    obj30 = cls27.getMethod((java.lang.String) objArr112[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                }
                ((int[]) objArr110[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr111)).intValue();
                return objArr110;
            }
            try {
                objArr = new java.lang.Object[1];
                c("≇䃉\ud8ebㅛ첤㍏ᡑ\ud873\u1cc8☙罏漈笺⁓", 13 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            } catch (java.lang.Exception unused) {
            }
            try {
                java.lang.Object[] objArr113 = {((java.lang.String) objArr[0]).intern()};
                java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj31 == null) {
                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 40, 1921 - android.view.View.MeasureSpec.getSize(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                    byte[] bArr23 = $$a;
                    byte b28 = bArr23[14];
                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                    a((short) (b28 - 1), b28, (byte) (-bArr23[16]), objArr114);
                    obj31 = cls28.getMethod((java.lang.String) objArr114[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj31);
                }
                java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj31).invoke(null, objArr113);
                try {
                    if (str9 != null) {
                        SdkCoreBusinessLogicModuleImpl = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
                        java.lang.Object[] objArr115 = new java.lang.Object[1];
                        c("ᜧ쮪砱뜾ᛳ成ֵ遈첄⛆ꘀꥈ", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, objArr115);
                        java.lang.String[] strArr5 = {((java.lang.String) objArr115[0]).intern()};
                        for (int i39 = 0; i39 <= 0; i39++) {
                            if (!str9.contains(strArr5[i39])) {
                            }
                        }
                        i2 = 0;
                        if (i2 != 0) {
                            java.lang.Object[] objArr116 = {new int[]{0}, new int[]{i2}, null, new int[1]};
                            java.lang.Object[] objArr117 = {562270524, 16, java.lang.Integer.valueOf(((((~((~r1) | 1005560480)) | 3408) * 529) - 2014595920) + (((~(((int) java.lang.System.currentTimeMillis()) | 1005560480)) | 296234960) * 529))};
                            java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj32 == null) {
                                java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 50, 2713 - android.text.TextUtils.indexOf(str7, str7, 0, 0), (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                                byte b29 = $$a[14];
                                java.lang.Object[] objArr118 = new java.lang.Object[1];
                                a((short) 653, b29, (byte) (b29 - 1), objArr118);
                                obj32 = cls29.getMethod((java.lang.String) objArr118[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj32);
                            }
                            ((int[]) objArr116[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj32).invoke(null, objArr117)).intValue();
                            return objArr116;
                        }
                        java.lang.Object[] objArr119 = new java.lang.Object[1];
                        c("≇䃉\ud8ebㅛ첤㍏ᡑ\ud873\u1cc8☙罏漈笺⁓", android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14, objArr119);
                        java.lang.Object[] objArr120 = {((java.lang.String) objArr119[0]).intern()};
                        java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                        if (obj33 == null) {
                            java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, android.view.View.resolveSizeAndState(0, 0, 0) + 1921, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                            byte[] bArr24 = $$a;
                            byte b30 = bArr24[14];
                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                            a((short) (b30 - 1), b30, (byte) (-bArr24[16]), objArr121);
                            obj33 = cls30.getMethod((java.lang.String) objArr121[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj33);
                        }
                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj33).invoke(null, objArr120);
                        if (invoke6 != null) {
                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                            c("ᜧ쮪砱뜾ᛳ成ֵ遈첄⛆ꘀꥈ", (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, objArr122);
                            java.lang.Object[] objArr123 = {invoke6, new java.lang.String[]{((java.lang.String) objArr122[0]).intern()}};
                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                            if (obj34 == null) {
                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore(str7, 0) + 43, 2880 - android.graphics.Color.red(0), (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                                byte[] bArr25 = $$a;
                                byte b31 = bArr25[14];
                                java.lang.Object[] objArr124 = new java.lang.Object[1];
                                a((short) (b31 - 1), b31, (byte) (-bArr25[16]), objArr124);
                                obj34 = cls31.getMethod((java.lang.String) objArr124[0], java.lang.String.class, java.lang.String[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj34);
                            }
                            long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr123)).longValue();
                            long currentTimeMillis43 = (int) java.lang.System.currentTimeMillis();
                            long j61 = ~currentTimeMillis43;
                            long j62 = (((((603 * longValue16) - 552652725726L) + (((~(1829975912 | j61)) | longValue16) * (-602))) + ((((~((~longValue16) | 1829975912)) | (~(currentTimeMillis43 | 1829975912))) | (~(((-1829975913) | j61) | longValue16))) * (-301))) + ((~(j61 | longValue16)) * 301)) - 198735866;
                            int currentTimeMillis44 = (int) java.lang.System.currentTimeMillis();
                            int currentTimeMillis45 = (int) java.lang.System.currentTimeMillis();
                            if (((((int) (j62 >> 32)) & (((((~((-1368986673) | currentTimeMillis44)) | 1488754212) * (-465)) - 229480223) + (((~(1488754212 | currentTimeMillis44)) | (-1368986673)) * 930) + ((currentTimeMillis44 | (-16842769)) * 465))) | (((((~((~currentTimeMillis45) | 71882779)) | (-1365343631)) * (-235)) + 1383777303 + (((~(71882779 | currentTimeMillis45)) | (-1365343631)) * (-470)) + (((~(currentTimeMillis45 | (-1361126789))) | 67665937) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE)) & ((int) j62))) != 1) {
                                java.lang.Object[] objArr125 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "\u0a29\ue8f6줨ｸ皆䱸㿼䱄脥䦗锥룽", "꠨ᐕ抭Ƙ", android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr125);
                                java.lang.String intern36 = ((java.lang.String) objArr125[0]).intern();
                                java.lang.Object[] objArr126 = new java.lang.Object[1];
                                c("ᴩ喹\uf4f0敭\uef96㸸㉭삣⺲궭輺◼\uf462龸襣鷖", android.graphics.ImageFormat.getBitsPerPixel(0) + 17, objArr126);
                                java.lang.String intern37 = ((java.lang.String) objArr126[0]).intern();
                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                c("ᴩ喹\uf4f0敭\uef96㸸㉭삣⺲궭輺◼師栗➇坔\uf5ce憾", 17 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr127);
                                java.lang.String intern38 = ((java.lang.String) objArr127[0]).intern();
                                java.lang.Object[] objArr128 = new java.lang.Object[1];
                                c("仳楋\uf462龸襣鷖", 6 - android.text.TextUtils.getOffsetBefore(str7, 0), objArr128);
                                java.lang.String intern39 = ((java.lang.String) objArr128[0]).intern();
                                java.lang.Object[] objArr129 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "頛굩庵\ude17⚆箅ኋ蓀尡嫘拪覆", "\ue916憗残琸", android.view.ViewConfiguration.getTouchSlop() >> 8, (char) android.text.TextUtils.indexOf(str7, str7, 0, 0), objArr129);
                                java.lang.String intern40 = ((java.lang.String) objArr129[0]).intern();
                                java.lang.Object[] objArr130 = new java.lang.Object[1];
                                c("仳楋膕㱁쪺㲢ぐ孑\uf462龸襣鷖曋桕ᕴ隢\uf5ce憾", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 18, objArr130);
                                java.lang.String intern41 = ((java.lang.String) objArr130[0]).intern();
                                java.lang.Object[] objArr131 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "\uf718툑恂䏌댯连苹괍ꃃ\ue463퓑襳\udf65豵ᒨ\uea7a\ue8b7䌍뺮軾\uf659", "槷啾ኹ墍", (android.view.ViewConfiguration.getTapTimeout() >> 16) - 1185579415, (char) android.text.TextUtils.getOffsetBefore(str7, 0), objArr131);
                                java.lang.String intern42 = ((java.lang.String) objArr131[0]).intern();
                                java.lang.Object[] objArr132 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "ᅕ淸踀\uee97独寡爪杸迎弨섲쥆\uf098票횅넵", "佢⭹븙ܻ", android.text.TextUtils.getOffsetAfter(str7, 0), (char) (15294 - android.view.View.MeasureSpec.getMode(0)), objArr132);
                                java.lang.String intern43 = ((java.lang.String) objArr132[0]).intern();
                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                c("仳楋膕㱁쪺㲢ぐ孑\uf7c9娛▛壔ᥬ涛裑\ue83f\uf12d廿暀ｌ≇䃉㒀磪\uf5ce憾", 25 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr133);
                                java.lang.String intern44 = ((java.lang.String) objArr133[0]).intern();
                                java.lang.Object[] objArr134 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "䐬畤즬\ue78a\ue9c6趻묹爋秄恬䇗鐳亡", "\udc82袴箷\ue48b", (-1215777572) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (35706 - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr134);
                                java.lang.String intern45 = ((java.lang.String) objArr134[0]).intern();
                                java.lang.Object[] objArr135 = new java.lang.Object[1];
                                b("\u0000\u0000\u0000\u0000", "쭟㯍숹䤱ꗴ貫鈵⨅\uecde", "\uf5a0뜻강瞀", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 364329973, (char) android.view.KeyEvent.normalizeMetaState(0), objArr135);
                                java.lang.String intern46 = ((java.lang.String) objArr135[0]).intern();
                                java.lang.Object[] objArr136 = new java.lang.Object[1];
                                c("仳楋䵪⏋\uf462龸襣鷖", android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9, objArr136);
                                java.lang.String[] strArr6 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr136[0]).intern()};
                                int i40 = 0;
                                while (i40 < 12) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(strArr6[i40]);
                                    java.lang.Object[] objArr137 = new java.lang.Object[1];
                                    c("鹄ᦛ", android.text.TextUtils.getTrimmedLength(str7) + 2, objArr137);
                                    sb.append(((java.lang.String) objArr137[0]).intern());
                                    java.lang.Object[] objArr138 = {sb.toString()};
                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj35 == null) {
                                        java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 37, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 3161, (char) (33099 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                        byte[] bArr26 = $$a;
                                        byte b32 = bArr26[14];
                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                        a((short) (b32 - 1), b32, (byte) (-bArr26[16]), objArr139);
                                        obj35 = cls32.getMethod((java.lang.String) objArr139[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj35);
                                    }
                                    long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr138)).longValue();
                                    int currentTimeMillis46 = (int) java.lang.System.currentTimeMillis();
                                    long j63 = ~longValue17;
                                    long j64 = currentTimeMillis46;
                                    long j65 = (-792105940) | longValue17;
                                    int i41 = i40;
                                    long j66 = (((((longValue17 * (-751)) - 594871560189L) + (((~(j64 | (-792105940))) | (~((-792105940) | j63))) * 1504)) + ((~(j64 | j65)) * (-1504))) + (((~j65) | (~(792105939 | j63))) * 752)) - 2129774047;
                                    int i42 = (int) (j66 >> 32);
                                    int currentTimeMillis47 = (int) java.lang.System.currentTimeMillis();
                                    int i43 = ~currentTimeMillis47;
                                    int currentTimeMillis48 = (int) java.lang.System.currentTimeMillis();
                                    int i44 = ~currentTimeMillis48;
                                    if (((i42 & (((((~(2037624701 | i43)) | (-820116184)) * (-602)) - 1791156588) + (((~(currentTimeMillis47 | 2037624701)) | (-2046033920) | (~((-811706966) | i43))) * (-301)) + ((~((-820116184) | i43)) * 301))) | (((int) j66) & ((((((~(179554625 | i44)) | (~(1257671784 | currentTimeMillis48))) | (~((-1257671785) | i44))) * 959) - 2136986070) + (((~(currentTimeMillis48 | 179554625)) | (~(i44 | 1257671784)) | (~((-1257671785) | currentTimeMillis48))) * 959)))) != 0) {
                                        i3 = i41 + 110;
                                        break;
                                    }
                                    i40 = i41 + 1;
                                }
                            }
                        }
                        i3 = 0;
                        if (i3 != 0) {
                            java.lang.Object[] objArr140 = {new int[]{0}, new int[]{i3}, null, new int[1]};
                            int currentTimeMillis49 = (int) java.lang.System.currentTimeMillis();
                            int i45 = ~currentTimeMillis49;
                            java.lang.Object[] objArr141 = {562270524, 16, java.lang.Integer.valueOf((((~((-522217188) | i45)) | 335569923) * 98) + 1650022421 + (((~(i45 | (-187108333))) | (-522217188) | (~(187108332 | currentTimeMillis49))) * (-49)) + (((~(currentTimeMillis49 | (-522217188))) | (-522678256)) * 49))};
                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj36 == null) {
                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 50, 2713 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.indexOf(str7, str7));
                                byte b33 = $$a[14];
                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                a((short) 653, b33, (byte) (b33 - 1), objArr142);
                                obj36 = cls33.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                            }
                            ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr141)).intValue();
                            return objArr140;
                        }
                        long[] jArr = {472001035};
                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                        c("矩䀺≇䃉䷡ꄺᘿ멼曳\ue9f0砌䑏\uf852\udd65ጡ仛\uf70d\uf561", 17 - android.view.View.resolveSize(0, 0), objArr143);
                        try {
                            bufferedInputStream2 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr143[0]).intern()));
                            j4 = 0;
                        } catch (java.io.IOException unused2) {
                            bufferedInputStream2 = null;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            bufferedInputStream = null;
                        }
                        loop6: while (true) {
                            try {
                                int read = bufferedInputStream2.read();
                                if (read != -1) {
                                    j4 = ((j4 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                    SdkCoreBusinessLogicModuleImpl = (SdkCoreAlternateContactlessPaymentDataImpl + 81) % 128;
                                    for (int i46 = 0; i46 <= 0; i46++) {
                                        if (j4 == jArr[i46]) {
                                            i4 = i46 + 1;
                                            try {
                                                bufferedInputStream2.close();
                                                break loop6;
                                            } catch (java.lang.Exception unused3) {
                                            }
                                        }
                                    }
                                }
                            } catch (java.io.IOException unused4) {
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                bufferedInputStream = bufferedInputStream2;
                                if (bufferedInputStream == null) {
                                    throw th;
                                }
                                try {
                                    bufferedInputStream.close();
                                    throw th;
                                } catch (java.lang.Exception unused5) {
                                    throw th;
                                }
                            }
                            try {
                                bufferedInputStream2.close();
                                break;
                            } catch (java.lang.Exception unused6) {
                            }
                        }
                        i4 = 0;
                        int i47 = i4 != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE : 0;
                        if (i47 != 0) {
                            java.lang.Object[] objArr144 = {new int[]{0}, new int[]{i47}, null, new int[1]};
                            int currentTimeMillis50 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr145 = {562270524, 16, java.lang.Integer.valueOf((((~((-83972683) | currentTimeMillis50)) | 541466757) * 449) + 754453627 + (((~((~currentTimeMillis50) | (-83972683))) | 541466757) * 449))};
                            java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj37 == null) {
                                java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 50, 2713 - android.graphics.Color.alpha(0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                byte b34 = $$a[14];
                                java.lang.Object[] objArr146 = new java.lang.Object[1];
                                a((short) 653, b34, (byte) (b34 - 1), objArr146);
                                obj37 = cls34.getMethod((java.lang.String) objArr146[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                            }
                            ((int[]) objArr144[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr145)).intValue();
                            return objArr144;
                        }
                        long[] jArr2 = {472001035};
                        java.lang.Object[] objArr147 = new java.lang.Object[1];
                        c("仳楋膕㱁휆\ue962춬㞓ᘿ멼씞僗螝䇊哔㻽爓\ueea1씞僗ᜧ쮪", (android.os.Process.myTid() >> 22) + 22, objArr147);
                        try {
                            bufferedInputStream4 = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr147[0]).intern()));
                            j3 = 0;
                        } catch (java.io.IOException unused7) {
                            bufferedInputStream4 = null;
                        } catch (java.lang.Throwable th5) {
                            th2 = th5;
                            bufferedInputStream3 = null;
                        }
                        while (true) {
                            try {
                                int read2 = bufferedInputStream4.read();
                                if (read2 != -1) {
                                    j3 = ((j3 << 5) ^ read2) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                    for (int i48 = 0; i48 <= 0; i48++) {
                                        if (j3 == jArr2[i48]) {
                                            int i49 = i48 + 1;
                                            try {
                                                bufferedInputStream4.close();
                                            } catch (java.lang.Exception unused8) {
                                            }
                                            if (i49 != 0) {
                                                java.lang.Object[] objArr148 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                int currentTimeMillis51 = (int) java.lang.System.currentTimeMillis();
                                                int i50 = ~currentTimeMillis51;
                                                java.lang.Object[] objArr149 = {562270524, 16, java.lang.Integer.valueOf(((((-1073281855) | r5) * (-712)) - 1732885337) + (((~(currentTimeMillis51 | (-134791217))) | (~(i50 | 1073281854))) * (-712)) + ((229165118 | (~(938490638 | i50))) * 712))};
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                if (obj38 == null) {
                                                    java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.view.MotionEvent.axisFromString(str7), android.view.MotionEvent.axisFromString(str7) + 2714, (char) (android.view.MotionEvent.axisFromString(str7) + 1));
                                                    byte b35 = $$a[14];
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    a((short) 653, b35, (byte) (b35 - 1), objArr150);
                                                    obj38 = cls35.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                }
                                                ((int[]) objArr148[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr149)).intValue();
                                                return objArr148;
                                            }
                                        }
                                    }
                                }
                            } catch (java.io.IOException unused9) {
                            } catch (java.lang.Throwable th6) {
                                th2 = th6;
                                bufferedInputStream3 = bufferedInputStream4;
                                if (bufferedInputStream3 == null) {
                                    throw th2;
                                }
                                try {
                                    bufferedInputStream3.close();
                                    throw th2;
                                } catch (java.lang.Exception unused10) {
                                    throw th2;
                                }
                            }
                            try {
                                bufferedInputStream4.close();
                                break;
                            } catch (java.lang.Exception unused11) {
                            }
                        }
                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                        if (obj39 == null) {
                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName(str7) + 32, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1891, (char) (3600 - android.graphics.Color.red(0)));
                            byte[] bArr27 = $$a;
                            byte b36 = bArr27[14];
                            java.lang.Object[] objArr151 = new java.lang.Object[1];
                            a((short) (b36 - 1), b36, (byte) (-bArr27[16]), objArr151);
                            obj39 = cls36.getMethod((java.lang.String) objArr151[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj39);
                        }
                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, null)).longValue();
                        long currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                        long j67 = ~currentTimeMillis52;
                        long j68 = ((((((-520) * longValue18) - 76456387872L) + (((~(j67 | longValue18)) | (-146468176)) * (-1042))) + ((longValue18 | currentTimeMillis52) * 521)) + ((((~((~longValue18) | 146468175)) | (~(currentTimeMillis52 | 146468175))) | (~((j67 | (-146468176)) | longValue18))) * 521)) - 1732780204;
                        int i51 = (int) (j68 >> 32);
                        int currentTimeMillis53 = (int) java.lang.System.currentTimeMillis();
                        int i52 = ~currentTimeMillis53;
                        int i53 = ~(813685979 | i52);
                        int i54 = (int) j68;
                        int currentTimeMillis54 = (int) java.lang.System.currentTimeMillis();
                        int i55 = ~currentTimeMillis54;
                        int i56 = ~(currentTimeMillis54 | 2051910141);
                        if (((i51 & ((((~(i52 | (-813685980))) | (~((-623540432) | i52)) | 539646155 | (~(897580255 | currentTimeMillis53))) * (-84)) + 1905160562 + (((~(currentTimeMillis53 | (-813685980))) | 623540431 | i53) * (-84)) + (((-897580256) | i53) * 84))) | (((((((~((-1913487869) | i55)) | 805830744) | i56) * (-252)) - 231341835) + (((~((-1107657125) | i55)) | i56) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) & i54)) != 0) {
                            java.lang.Object[] objArr152 = {new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i47}, null, new int[1]};
                            int currentTimeMillis55 = (int) java.lang.System.currentTimeMillis();
                            int i57 = ~currentTimeMillis55;
                            java.lang.Object[] objArr153 = {562270524, 16, java.lang.Integer.valueOf((((((~((-207651073) | i57)) | (~((-276955210) | currentTimeMillis55))) | (~((-17068167) | currentTimeMillis55))) * 765) - 2115434729) + (((~((-484606282) | i57)) | 207651072) * 1530) + (((~(currentTimeMillis55 | (-484606282))) | (~(i57 | (-17068167)))) * 765))};
                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj40 == null) {
                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), 2713 - android.view.View.MeasureSpec.getMode(0), (char) android.view.KeyEvent.normalizeMetaState(0));
                                byte b37 = $$a[14];
                                java.lang.Object[] objArr154 = new java.lang.Object[1];
                                a((short) 653, b37, (byte) (b37 - 1), objArr154);
                                obj40 = cls37.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                            }
                            ((int[]) objArr152[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr153)).intValue();
                            return objArr152;
                        }
                        java.lang.Object[] objArr155 = {2};
                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                        if (obj41 == null) {
                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str7, 0, 0) + 27, android.widget.ExpandableListView.getPackedPositionType(0L) + 2364, (char) ((-1) - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                            byte[] bArr28 = $$a;
                            byte b38 = bArr28[14];
                            java.lang.Object[] objArr156 = new java.lang.Object[1];
                            a((short) (b38 - 1), b38, (byte) (-bArr28[16]), objArr156);
                            obj41 = cls38.getMethod((java.lang.String) objArr156[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj41);
                        }
                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, objArr155)).longValue();
                        int currentTimeMillis56 = (int) java.lang.System.currentTimeMillis();
                        long j69 = ~longValue19;
                        long j70 = currentTimeMillis56;
                        long j71 = 590672049 | j69;
                        long j72 = ((131 * longValue19) - 76196694321L) + ((~(j69 | (~j70) | 590672049)) * 130) + ((~j71) * (-260)) + (((~((-590672050) | longValue19)) | (~(j71 | j70))) * 130) + 817238150;
                        int i58 = (int) (j72 >> 32);
                        int currentTimeMillis57 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis58 = (int) java.lang.System.currentTimeMillis();
                        if (((i58 & ((((~((~currentTimeMillis57) | 1830997784)) | 307769445) * 529) + 1520786966 + (((~(currentTimeMillis57 | 1830997784)) | 393771373) * 529))) | (((int) j72) & (((((~((-931264986) | currentTimeMillis58)) | 847360088) * 336) - 501357939) + (((~(1926475900 | currentTimeMillis58)) | (-2010380798)) * (-168)) + (((~((~currentTimeMillis58) | 1926475900)) | (-931264986)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE)))) == 2) {
                            java.lang.Object[] objArr157 = {new int[]{0}, new int[]{270}, null, new int[1]};
                            int currentTimeMillis59 = (int) java.lang.System.currentTimeMillis();
                            int i59 = ~currentTimeMillis59;
                            java.lang.Object[] objArr158 = {562270524, 16, java.lang.Integer.valueOf((((~((-717931229) | i59)) | (-8605709)) * (-602)) + 1172590825 + (((~(currentTimeMillis59 | (-717931229))) | 709395152 | (~((-69633) | i59))) * (-301)) + ((~((-8605709) | i59)) * 301))};
                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj42 == null) {
                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(str7), 2713 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b39 = $$a[14];
                                java.lang.Object[] objArr159 = new java.lang.Object[1];
                                a((short) 653, b39, (byte) (b39 - 1), objArr159);
                                obj42 = cls39.getMethod((java.lang.String) objArr159[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                            }
                            ((int[]) objArr157[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr158)).intValue();
                            return objArr157;
                        }
                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                        if (obj43 == null) {
                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 40, 3197 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                            java.lang.Object[] objArr160 = new java.lang.Object[1];
                            a((short) 612, (byte) ($$a[14] - 1), r3[21], objArr160);
                            obj43 = cls40.getMethod((java.lang.String) objArr160[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj43);
                        }
                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                        int currentTimeMillis60 = (int) java.lang.System.currentTimeMillis();
                        long j73 = ~longValue20;
                        long j74 = currentTimeMillis60;
                        long j75 = ~j74;
                        long j76 = ~(91004127 | j73);
                        long j77 = (longValue20 * (-463)) + 42316919055L + (((~(j73 | j75)) | j76 | (~(j75 | 91004127))) * 464) + (((-91004128) | j74 | j73) * (-464)) + (((~(91004127 | j74)) | j76) * 464) + 5241234;
                        int currentTimeMillis61 = (int) java.lang.System.currentTimeMillis();
                        int i60 = ~currentTimeMillis61;
                        if (((((int) (j77 >> 32)) & (((((~((-1711827203) | i60)) | r7) * 1150) - 334238508) + (((~(274600791 | currentTimeMillis61)) | (~((-274600792) | i60))) * (-575)) + (((~(currentTimeMillis61 | (-1711827203))) | (~(i60 | 1711827202))) * 575))) | ((((((-268961025) | r6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) - 1210995715) + (((~(1312248563 | (~((int) java.lang.System.currentTimeMillis())))) | (-304678290)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) & ((int) j77))) != 0) {
                            java.lang.Object[] objArr161 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                            int currentTimeMillis62 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr162 = {562270524, 16, java.lang.Integer.valueOf((((-340263937) | (~currentTimeMillis62)) * (-490)) + 1001666193 + (((~(currentTimeMillis62 | (-349981834))) | 9717897) * 490) + 15252506)};
                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj44 == null) {
                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 50, 2713 - android.graphics.Color.green(0), (char) android.graphics.Color.red(0));
                                byte b40 = $$a[14];
                                java.lang.Object[] objArr163 = new java.lang.Object[1];
                                a((short) 653, b40, (byte) (b40 - 1), objArr163);
                                obj44 = cls41.getMethod((java.lang.String) objArr163[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                            }
                            ((int[]) objArr161[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr162)).intValue();
                            return objArr161;
                        }
                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                        if (obj45 == null) {
                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 41, 3197 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte[] bArr29 = $$a;
                            byte b41 = bArr29[14];
                            java.lang.Object[] objArr164 = new java.lang.Object[1];
                            a((short) (b41 - 1), b41, (byte) (-bArr29[16]), objArr164);
                            obj45 = cls42.getMethod((java.lang.String) objArr164[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj45);
                        }
                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                        int currentTimeMillis63 = (int) java.lang.System.currentTimeMillis();
                        long j78 = ~longValue21;
                        long j79 = currentTimeMillis63;
                        long j80 = ~j79;
                        long j81 = ((-209) * longValue21) + 141394210925L + ((~(j78 | 676527324)) * 210) + (((~(j78 | j80)) | (~(j79 | 676527324))) * 210) + (((~((-676527325) | j78 | j79)) | (~(676527324 | j80 | longValue21))) * 210) + 1629397215;
                        int currentTimeMillis64 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis65 = (int) java.lang.System.currentTimeMillis();
                        if (((((int) (j81 >> 32)) & ((((~((~currentTimeMillis64) | 298765467)) | 1714496068) * 446) + 384374654 + (((~(currentTimeMillis64 | 2013261535)) | 21495810) * 446) + 161067640)) | ((((((~(379280152 | r6)) | (-1057946258)) * (-90)) - 1687905466) + (((~(379280152 | currentTimeMillis65)) | 369777168) * (-45)) + (((~(currentTimeMillis65 | 1057946257)) | 379280152 | (~((~currentTimeMillis65) | (-1057946258)))) * 45)) & ((int) j81))) != 0) {
                            java.lang.Object[] objArr165 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                            int i61 = ~((int) java.lang.System.currentTimeMillis());
                            java.lang.Object[] objArr166 = {562270524, 16, java.lang.Integer.valueOf((((~((-262577722) | i61)) | (-446747799)) * (-983)) + 2042585204 + (((~(i61 | (-446747799))) | 268451974) * 983))};
                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj46 == null) {
                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                byte b42 = $$a[14];
                                java.lang.Object[] objArr167 = new java.lang.Object[1];
                                a((short) 653, b42, (byte) (b42 - 1), objArr167);
                                obj46 = cls43.getMethod((java.lang.String) objArr167[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                            }
                            ((int[]) objArr165[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr166)).intValue();
                            return objArr165;
                        }
                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                        if (obj47 == null) {
                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2837 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                            byte[] bArr30 = $$a;
                            byte b43 = bArr30[14];
                            java.lang.Object[] objArr168 = new java.lang.Object[1];
                            a((short) (b43 - 1), b43, (byte) (-bArr30[16]), objArr168);
                            obj47 = cls44.getMethod((java.lang.String) objArr168[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj47);
                        }
                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, null)).longValue();
                        long currentTimeMillis66 = (int) java.lang.System.currentTimeMillis();
                        long j82 = (((((382 * longValue22) + 124104680320L) + (((longValue22 | currentTimeMillis66) | 326591263) * (-381))) + ((((~((~longValue22) | 326591263)) | (~((~currentTimeMillis66) | longValue22))) | (~((-326591264) | longValue22))) * 381)) + ((~(326591263 | longValue22)) * 381)) - 479703491;
                        if (((((int) (j82 >> 32)) & (((((~((-108192923) | r3)) | 1545419333) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) - 870101687) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-108192923))) | 68165632) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))) | (((((~((-1107905029) | r5)) * (-783)) - 2018754176) + (((~((~((int) java.lang.System.currentTimeMillis())) | 944123953)) | (-1913616933)) * 783)) & ((int) j82))) != 0) {
                            java.lang.Object[] objArr169 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                            int currentTimeMillis67 = (int) java.lang.System.currentTimeMillis();
                            int i62 = ~currentTimeMillis67;
                            java.lang.Object[] objArr170 = {562270524, 16, java.lang.Integer.valueOf((((~((-564927867) | i62)) | 144397653) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1936568614 + (((~(i62 | (-556009515))) | (~(700407167 | currentTimeMillis67))) * (-519)) + (((~(currentTimeMillis67 | 144397653)) | 564927866) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE))};
                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj48 == null) {
                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                byte b44 = $$a[14];
                                java.lang.Object[] objArr171 = new java.lang.Object[1];
                                a((short) 653, b44, (byte) (b44 - 1), objArr171);
                                obj48 = cls45.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                            }
                            ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr170)).intValue();
                            return objArr169;
                        }
                        long[] jArr3 = {624887784092251L};
                        java.lang.Object[] objArr172 = new java.lang.Object[1];
                        c("矩䀺≇䃉䷡ꄺᘿ멼曳\ue9f0砌䑏\uf852\udd65ጡ仛\uf70d\uf561", (android.view.ViewConfiguration.getTouchSlop() >> 8) + 17, objArr172);
                        java.lang.Object[] objArr173 = {((java.lang.String) objArr172[0]).intern(), 3, 2251799813685247L, jArr3};
                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                        if (obj49 == null) {
                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 37, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3095, (char) (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                            byte[] bArr31 = $$a;
                            byte b45 = bArr31[14];
                            java.lang.Object[] objArr174 = new java.lang.Object[1];
                            a((short) (b45 - 1), b45, (byte) (-bArr31[16]), objArr174);
                            obj49 = cls46.getMethod((java.lang.String) objArr174[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj49);
                        }
                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr173)).longValue();
                        int currentTimeMillis68 = (int) java.lang.System.currentTimeMillis();
                        long j83 = ~longValue23;
                        long j84 = currentTimeMillis68;
                        long j85 = ~j84;
                        long j86 = ((((((-987) * longValue23) - 613852903732L) + (((~((j83 | j85) | (-620680388))) | (~((longValue23 | (-620680388)) | j84))) * 988)) + ((j83 | (-620680388)) * (-988))) + ((((~(j83 | 620680387)) | (~(j83 | j84))) | (~(longValue23 | ((-620680388) | j85)))) * 988)) - 1289967522;
                        int currentTimeMillis69 = (int) java.lang.System.currentTimeMillis();
                        int i63 = ~currentTimeMillis69;
                        int i64 = ~(((int) java.lang.System.currentTimeMillis()) | 309577605);
                        if (((((int) (j86 >> 32)) & (((((-276877463) | i63) * (-369)) - 802173004) + (((~(428134590 | i63)) | 1865361001) * (-369)) + (((~(currentTimeMillis69 | (-428134591))) | 151257128 | (~(i63 | 2142238463))) * 369))) | (((((1180933 | i64) * (-196)) - 1521969111) + ((308396672 | i64) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE)) & ((int) j86))) != 0) {
                            java.lang.Object[] objArr175 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                            java.lang.Object[] objArr176 = {562270524, 16, java.lang.Integer.valueOf(((((~(423485423 | r1)) | 285840096) * (-756)) - 271326589) + (((~((int) java.lang.System.currentTimeMillis())) | 423485423) * 756))};
                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj50 == null) {
                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.view.View.combineMeasuredStates(0, 0));
                                byte b46 = $$a[14];
                                java.lang.Object[] objArr177 = new java.lang.Object[1];
                                a((short) 653, b46, (byte) (b46 - 1), objArr177);
                                obj50 = cls47.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                            }
                            ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr176)).intValue();
                            return objArr175;
                        }
                        java.lang.Object[] objArr178 = new java.lang.Object[1];
                        c("ᴩ喹菚᷈㿨桵㴅ỳွ\ue70b釽㘔", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 11, objArr178);
                        java.lang.Object[] objArr179 = {((java.lang.String) objArr178[0]).intern()};
                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                        if (obj51 == null) {
                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.combineMeasuredStates(0, 0), 3160 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (33099 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)));
                            java.lang.Object[] objArr180 = new java.lang.Object[1];
                            a((short) 612, (byte) ($$a[14] - 1), r4[21], objArr180);
                            obj51 = cls48.getMethod((java.lang.String) objArr180[0], java.lang.String.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj51);
                        }
                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, objArr179)).longValue();
                        int currentTimeMillis70 = (int) java.lang.System.currentTimeMillis();
                        long j87 = ~longValue24;
                        long j88 = currentTimeMillis70;
                        long j89 = (~j88) | j87;
                        long j90 = ((-112) * longValue24) + 120127679728L + (((~j89) | (-1072568569)) * 226) + (((~(longValue24 | 1072568568)) | (~(1072568568 | j88)) | (~((-1072568569) | j89))) * (-113)) + ((~(j87 | j88)) * 113) + 2068003472;
                        int currentTimeMillis71 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis72 = (int) java.lang.System.currentTimeMillis();
                        if (((((int) (j90 >> 32)) & (((((~(1082987465 | currentTimeMillis71)) | 1774753419) * (-964)) - 1715293074) + (((~((~currentTimeMillis71) | 1082987465)) | 692093954) * (-964)))) | ((((((~((-237209700) | r7)) | (~(1674436109 | currentTimeMillis72))) * (-370)) - 635053777) + (((~(currentTimeMillis72 | (-237209700))) | (~((~currentTimeMillis72) | 1674436109)) | 1640781324) * (-370)) + 1498701144) & ((int) j90))) != 0) {
                            java.lang.Object[] objArr181 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis73 = (int) java.lang.System.currentTimeMillis();
                            int i65 = ~((~currentTimeMillis73) | 536801279);
                            java.lang.Object[] objArr182 = {562270524, 16, java.lang.Integer.valueOf((((~((-200855250) | currentTimeMillis73)) | 172524240 | i65) * (-470)) + 191339695 + (((~(currentTimeMillis73 | (-28331010))) | i65) * 470))};
                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj52 == null) {
                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2713 - android.text.TextUtils.getCapsMode(str7, 0, 0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                byte b47 = $$a[14];
                                java.lang.Object[] objArr183 = new java.lang.Object[1];
                                a((short) 653, b47, (byte) (b47 - 1), objArr183);
                                obj52 = cls49.getMethod((java.lang.String) objArr183[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                            }
                            ((int[]) objArr181[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr182)).intValue();
                            return objArr181;
                        }
                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                        if (obj53 == null) {
                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.KeyEvent.normalizeMetaState(0) + 2185, (char) (59513 - android.graphics.Color.argb(0, 0, 0, 0)));
                            byte[] bArr32 = $$a;
                            byte b48 = bArr32[14];
                            java.lang.Object[] objArr184 = new java.lang.Object[1];
                            a((short) (b48 - 1), b48, (byte) (-bArr32[16]), objArr184);
                            obj53 = cls50.getMethod((java.lang.String) objArr184[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj53);
                        }
                        long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                        int currentTimeMillis74 = (int) java.lang.System.currentTimeMillis();
                        long j91 = ~longValue25;
                        long j92 = currentTimeMillis74;
                        long j93 = ~j92;
                        long j94 = (((((832 * longValue25) - 309283390530L) + (((~(j91 | j93)) | (~((longValue25 | 372630591) | j92))) * (-831))) + ((~((j91 | 372630591) | j92)) * (-1662))) + (((~(longValue25 | j92)) | ((~(372630591 | j92)) | (~((-372630592) | j93)))) * 831)) - 1244721177;
                        int currentTimeMillis75 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis76 = (int) java.lang.System.currentTimeMillis();
                        if (((((int) (j94 >> 32)) & (((((~((-2080881550) | currentTimeMillis75)) | (-776859336)) * 56) - 148223134) + (((~((~currentTimeMillis75) | (-776859336))) | (-2080881550)) * 56))) | ((((((~((-582476517) | currentTimeMillis76)) | 539107460) * (-566)) - 1245082067) + ((~(currentTimeMillis76 | (-43369057))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST)) & ((int) j94))) != 0) {
                            java.lang.Object[] objArr185 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                            int currentTimeMillis77 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr186 = {562270524, 16, java.lang.Integer.valueOf((((~(209398176 | currentTimeMillis77)) | 499927343) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE) + 1052829661 + (((~((~currentTimeMillis77) | 209398176)) | 293879823) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE))};
                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj54 == null) {
                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                byte b49 = $$a[14];
                                java.lang.Object[] objArr187 = new java.lang.Object[1];
                                a((short) 653, b49, (byte) (b49 - 1), objArr187);
                                obj54 = cls51.getMethod((java.lang.String) objArr187[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                            }
                            ((int[]) objArr185[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr186)).intValue();
                            return objArr185;
                        }
                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                        if (obj55 == null) {
                            java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.View.resolveSize(0, 0), 2973 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                            byte[] bArr33 = $$a;
                            byte b50 = bArr33[14];
                            java.lang.Object[] objArr188 = new java.lang.Object[1];
                            a((short) (b50 - 1), b50, (byte) (-bArr33[16]), objArr188);
                            obj55 = cls52.getMethod((java.lang.String) objArr188[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj55);
                        }
                        long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                        int currentTimeMillis78 = (int) java.lang.System.currentTimeMillis();
                        long j95 = ~longValue26;
                        long j96 = currentTimeMillis78;
                        long j97 = ((((((-103) * longValue26) + 74319468514L) + (((~(j95 | j96)) | (~(721548237 | j95))) * 104)) + ((~(longValue26 | ((~j96) | (-721548238)))) * (-104))) + (((-721548238) | j96) * 104)) - 1131153526;
                        int currentTimeMillis79 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis80 = (int) java.lang.System.currentTimeMillis();
                        int i66 = ~((-1854844914) | (~currentTimeMillis80));
                        if (((((int) (j97 >> 32)) & ((((~((~currentTimeMillis79) | (-782716858))) | 715541145) * 529) + 1520786966 + (((~(currentTimeMillis79 | (-782716858))) | 2075024027) * 529))) | ((((((((~((-417618504) | r6)) | 274747398) | (~(r6 | 1854844913))) | (~((-1711973809) | currentTimeMillis80))) * (-84)) - 1905160647) + (((~(currentTimeMillis80 | 1854844913)) | 417618503 | i66) * (-84)) + ((1711973808 | i66) * 84)) & ((int) j97))) != 0) {
                            java.lang.Object[] objArr189 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis81 = (int) java.lang.System.currentTimeMillis();
                            int i67 = ~currentTimeMillis81;
                            java.lang.Object[] objArr190 = {562270524, 16, java.lang.Integer.valueOf((((((~((-502793796) | i67)) | 206046208) | (~((-206531725) | i67))) * (-1136)) - 120705513) + (((~((-502793796) | currentTimeMillis81)) | (~((-206531725) | currentTimeMillis81)) | (~(503279311 | i67))) * (-568)) + (((~(currentTimeMillis81 | (-206046209))) | (~(i67 | 502793795)) | (~(206531724 | i67))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj56 == null) {
                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1));
                                byte b51 = $$a[14];
                                java.lang.Object[] objArr191 = new java.lang.Object[1];
                                a((short) 653, b51, (byte) (b51 - 1), objArr191);
                                obj56 = cls53.getMethod((java.lang.String) objArr191[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                            }
                            ((int[]) objArr189[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr190)).intValue();
                            return objArr189;
                        }
                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                        if (obj57 == null) {
                            java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (android.os.Process.myPid() >> 22) + 2159, (char) (56400 - (android.view.ViewConfiguration.getTapTimeout() >> 16)));
                            byte[] bArr34 = $$a;
                            byte b52 = bArr34[14];
                            java.lang.Object[] objArr192 = new java.lang.Object[1];
                            a((short) (b52 - 1), b52, (byte) (-bArr34[16]), objArr192);
                            obj57 = cls54.getMethod((java.lang.String) objArr192[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj57);
                        }
                        long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                        long currentTimeMillis82 = (int) java.lang.System.currentTimeMillis();
                        long j98 = ~currentTimeMillis82;
                        long j99 = (((((565 * longValue27) - 304241815244L) + (((~(longValue27 | currentTimeMillis82)) | ((~((~longValue27) | j98)) | (-540393989))) * (-564))) + ((~(currentTimeMillis82 | ((-540393989) | longValue27))) * 1128)) + (((~(longValue27 | 540393988)) | (~((-540393989) | j98))) * 564)) - 1106212008;
                        int currentTimeMillis83 = (int) java.lang.System.currentTimeMillis();
                        int i68 = ~currentTimeMillis83;
                        int i69 = ~((int) java.lang.System.currentTimeMillis());
                        if (((((int) (j99 >> 32)) & (((((~((-830821528) | i68)) | 606404883) * 226) - 2055567968) + (((~(i68 | (-293622917))) | (~((-606404884) | currentTimeMillis83)) | 69206272) * (-113)) + ((~(currentTimeMillis83 | (-830821528))) * 113))) | (((int) j99) & ((((((~r4) | 274213474) * (-828)) - 1754753727) + (((-1711439885) | i69) * (-828))) - 266983728))) != 0) {
                            java.lang.Object[] objArr193 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                            int currentTimeMillis84 = (int) java.lang.System.currentTimeMillis();
                            java.lang.Object[] objArr194 = {562270524, 16, java.lang.Integer.valueOf((((~((-633821079) | currentTimeMillis84)) | 75502352) * 345) + 805157336 + (((~((-633821079) | (~currentTimeMillis84))) | 2089) * 345) + ((~(currentTimeMillis84 | (-75502353))) * 345))};
                            java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj58 == null) {
                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTouchSlop() >> 8) + 50, 2712 - android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                                byte b53 = $$a[14];
                                java.lang.Object[] objArr195 = new java.lang.Object[1];
                                a((short) 653, b53, (byte) (b53 - 1), objArr195);
                                obj58 = cls55.getMethod((java.lang.String) objArr195[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                            }
                            ((int[]) objArr193[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr194)).intValue();
                            SdkCoreBusinessLogicModuleImpl = (SdkCoreAlternateContactlessPaymentDataImpl + 109) % 128;
                            return objArr193;
                        }
                        java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                        if (obj59 == null) {
                            java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 35, 838 - android.graphics.Color.alpha(0), (char) android.view.KeyEvent.getDeadChar(0, 0));
                            byte[] bArr35 = $$a;
                            byte b54 = bArr35[14];
                            java.lang.Object[] objArr196 = new java.lang.Object[1];
                            a((short) (b54 - 1), b54, (byte) (-bArr35[16]), objArr196);
                            obj59 = cls56.getMethod((java.lang.String) objArr196[0], null);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj59);
                        }
                        long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj59).invoke(null, null)).longValue();
                        int currentTimeMillis85 = (int) java.lang.System.currentTimeMillis();
                        long j100 = ~longValue28;
                        long j101 = ~currentTimeMillis85;
                        long j102 = ((185 * longValue28) - 265973650458L) + (((-1453407927) | longValue28) * (-368)) + ((1453407926 | j100 | j101) * 184) + (((~(longValue28 | 1453407926)) | (~(j100 | (-1453407927))) | (~(j101 | 1453407926))) * 184) + 507344976;
                        int currentTimeMillis86 = (int) java.lang.System.currentTimeMillis();
                        int i70 = ~currentTimeMillis86;
                        int currentTimeMillis87 = (int) java.lang.System.currentTimeMillis();
                        int i71 = ((((int) (j102 >> 32)) & ((((((~((-2091104374) | i70)) | (-653877963)) * (-602)) + 1001907677) + ((((~(currentTimeMillis86 | (-2091104374))) | 1476565045) | (~((-39338635) | i70))) * (-301))) + ((~((-653877963) | i70)) * 301))) | (((((((~((-1553643303) | currentTimeMillis87)) | 1285206822) * 576) + 1771465493) + (((~((~currentTimeMillis87) | (-268436481))) | 18890761) * 576)) + 1544754560) & ((int) j102))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                        if (i71 != 0) {
                            java.lang.Object[] objArr197 = {new int[]{0}, new int[]{i71}, null, new int[1]};
                            int currentTimeMillis88 = (int) java.lang.System.currentTimeMillis();
                            int i72 = ~currentTimeMillis88;
                            java.lang.Object[] objArr198 = {562270524, 16, java.lang.Integer.valueOf((((~((-316252430) | currentTimeMillis88)) | (-393073091)) * (-318)) + 2050159097 + (((~((-393073091) | currentTimeMillis88)) | (~(402518479 | i72))) * 318) + (((~(currentTimeMillis88 | 402518479)) | (~(i72 | (-86266051)))) * 318))};
                            java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj60 == null) {
                                java.lang.Class cls57 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 50, 2713 - android.text.TextUtils.getCapsMode(str7, 0, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                byte b55 = $$a[14];
                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                a((short) 653, b55, (byte) (b55 - 1), objArr199);
                                obj60 = cls57.getMethod((java.lang.String) objArr199[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                            }
                            ((int[]) objArr197[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr198)).intValue();
                            java.lang.Object[] objArr200 = {objArr197};
                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                            if (obj61 == null) {
                                java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.view.View.combineMeasuredStates(0, 0), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3237, (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
                                byte b56 = $$a[14];
                                java.lang.Object[] objArr201 = new java.lang.Object[1];
                                a((short) 653, b56, (byte) (b56 - 1), objArr201);
                                obj61 = cls58.getMethod((java.lang.String) objArr201[0], java.lang.Object[].class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj61);
                            }
                            ((java.lang.reflect.Method) obj61).invoke(obj, objArr200);
                            return objArr197;
                        }
                        java.lang.Object[] objArr202 = {0, obj, 562270524, 0};
                        java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                        if (obj62 == null) {
                            obj62 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 31, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3289, (char) (android.os.Process.myTid() >> 22))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.text.TextUtils.indexOf(str7, str7, 0), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 3238, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj62);
                        }
                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj62).newInstance(objArr202);
                        try {
                            java.lang.Object[] objArr203 = new java.lang.Object[1];
                            c("笕\ue968랶\uf0ea䭝Ვ砱뜾鈅儢\ue0f0뺜\ud7ac藵\ue31a䯄", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 16, objArr203);
                            java.lang.Class<?> cls59 = java.lang.Class.forName(((java.lang.String) objArr203[0]).intern());
                            java.lang.Object[] objArr204 = new java.lang.Object[1];
                            b("\u0000\u0000\u0000\u0000", "\ue66b墇삉샼秘", "ⴐ㔺㯾\uf38c", ((android.os.Process.getThreadPriority(0) + 20) >> 6) - 30066131, (char) (35900 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr204);
                            cls59.getMethod(((java.lang.String) objArr204[0]).intern(), null).invoke(newInstance, null);
                            java.lang.Object[] objArr205 = {new int[]{0}, new int[]{0}, null, new int[1]};
                            int currentTimeMillis89 = (int) java.lang.System.currentTimeMillis();
                            int i73 = ~(921998003 | currentTimeMillis89);
                            java.lang.Object[] objArr206 = {562270524, 0, java.lang.Integer.valueOf((((~((-921998004) | currentTimeMillis89)) | 844136464 | (~(212672483 | currentTimeMillis89))) * (-880)) + 2145524319 + (((~((~currentTimeMillis89) | (-921998004))) | (-212672484) | i73) * (-880)) + (i73 * 880))};
                            java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                            if (obj63 == null) {
                                java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 50, 2714 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) android.text.TextUtils.getTrimmedLength(str7));
                                byte b57 = $$a[14];
                                java.lang.Object[] objArr207 = new java.lang.Object[1];
                                a((short) 653, b57, (byte) (b57 - 1), objArr207);
                                obj63 = cls60.getMethod((java.lang.String) objArr207[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj63);
                            }
                            ((int[]) objArr205[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj63).invoke(null, objArr206)).intValue();
                            return objArr205;
                        } catch (java.lang.Throwable th7) {
                            java.lang.Throwable cause = th7.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th7;
                        }
                    }
                    java.lang.Object[] objArr208 = {((java.lang.String) objArr2[0]).intern()};
                    java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj64 == null) {
                        java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str7, str7, 0, 0) + 40, 1920 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        byte[] bArr36 = $$a;
                        byte b58 = bArr36[14];
                        java.lang.Object[] objArr209 = new java.lang.Object[1];
                        a((short) (b58 - 1), b58, (byte) (-bArr36[16]), objArr209);
                        obj64 = cls61.getMethod((java.lang.String) objArr209[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj64);
                    }
                    java.lang.Object invoke7 = ((java.lang.reflect.Method) obj64).invoke(null, objArr208);
                    if (invoke7 != null) {
                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                        c("䯂熟\u17df㵦➇坔\uf4ce㝡", 7 - android.text.TextUtils.getOffsetBefore(str7, 0), objArr210);
                        if (invoke7.equals(((java.lang.String) objArr210[0]).intern())) {
                            java.lang.Object[] objArr211 = new java.lang.Object[1];
                            c("뻏铪䰸㉟ွ\ue70bﭡ現\ue297ᾇ⏴ቬ≇䃉㒀磪ⷹ潹벆潽䌚碌\uf70d\uf561", ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 23, objArr211);
                            try {
                                java.lang.Object[] objArr212 = {((java.lang.String) objArr211[0]).intern()};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj65 == null) {
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1921 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                    byte[] bArr37 = $$a;
                                    byte b59 = bArr37[14];
                                    java.lang.Object[] objArr213 = new java.lang.Object[1];
                                    a((short) (b59 - 1), b59, (byte) (-bArr37[16]), objArr213);
                                    obj65 = cls62.getMethod((java.lang.String) objArr213[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj65);
                                }
                                java.lang.String str10 = (java.lang.String) ((java.lang.reflect.Method) obj65).invoke(null, objArr212);
                                if (str10 != null && (parseInt = java.lang.Integer.parseInt(str10)) != 0) {
                                    i2 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                    if (i2 != 0) {
                                    }
                                }
                            } catch (java.lang.Throwable th8) {
                                java.lang.Throwable cause2 = th8.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th8;
                            }
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                    }
                } catch (java.lang.Throwable th9) {
                    java.lang.Throwable cause3 = th9.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th9;
                }
                objArr2 = new java.lang.Object[1];
                c("➇坔ꞡⷛꑪ䌰㮚\udb93ꑪ䌰ꌢ儞\uef34꜊薹靀넋僚", android.text.TextUtils.getTrimmedLength(str7) + 18, objArr2);
            } catch (java.lang.Throwable th10) {
                java.lang.Throwable cause4 = th10.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th10;
            }
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause5 = th11.getCause();
            if (cause5 != null) {
                throw cause5;
            }
            throw th11;
        }
    }

    static void init$1() {
        $$d = new byte[]{115, 113, -43, -44};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE;
    }

    static void init$0() {
        $$a = new byte[]{98, 74, -39, 82, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
        $$b = 76;
    }

    public final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1989125740, 1989125740, java.lang.System.identityHashCode(this));
    }
}
