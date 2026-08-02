package com.payair.hce;

/* loaded from: classes4.dex */
public final class setupValuesAfterAuthenticate {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long DigitizedCardProfile;
    private static long IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getProfileVersion;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] valueOf;
    private java.lang.String values;
    private java.lang.String writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return values(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$d;
        int i3 = s2 + 102;
        int i4 = 3 - (s * 3);
        int i5 = 1 - (b * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            int i8 = i4;
            int i9 = (-i4) + i6;
            i = i7;
            int i10 = i8;
            i3 = i9;
            i4 = i10;
            int i11 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i3;
            i8 = i11;
            i4 = bArr[i11];
            i7 = i2;
            i6 = i12;
            int i92 = (-i4) + i6;
            i = i7;
            int i102 = i8;
            i3 = i92;
            i4 = i102;
            int i112 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            int i1122 = i4 + 1;
            bArr2[i] = (byte) i3;
            i2 = i + 1;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 653) + 65;
        byte[] bArr = $$a;
        int i5 = 35 - (i * 34);
        int i6 = (b * 34) + 4;
        char[] cArr = new char[i5];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            i6++;
            i4 = (i7 + (-i4)) - 2;
            i2 = i8;
            cArr[i2] = (char) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            i7 = i4;
            i4 = bArr[i6];
            i8 = i3;
            i6++;
            i4 = (i7 + (-i4)) - 2;
            i2 = i8;
            cArr[i2] = (char) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            cArr[i2] = (char) i4;
            i3 = i2 + 1;
            if (i3 == i5) {
            }
        }
    }

    public final java.lang.String DigitizedCardProfile() {
        int i = getProfileVersion;
        int i2 = i + 113;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        java.lang.String str = this.writeReplace;
        int i3 = i + 1;
        getAid = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void DigitizedCardProfile(java.lang.String str) {
        int i = getProfileVersion + 89;
        getAid = i % 128;
        if (i % 2 == 0) {
            this.writeReplace = str;
        } else {
            this.writeReplace = str;
            throw null;
        }
    }

    public final byte[] AlternateContactlessPaymentDataJson() {
        int i = getAid;
        getProfileVersion = (i + 101) % 128;
        byte[] bArr = this.valueOf;
        getProfileVersion = (i + 31) % 128;
        return bArr;
    }

    public final void DigitizedCardProfile(byte[] bArr) {
        int i = getProfileVersion + 85;
        int i2 = i % 128;
        getAid = i2;
        if (i % 2 == 0) {
            this.valueOf = bArr;
            int i3 = i2 + 65;
            getProfileVersion = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.valueOf = bArr;
        throw new java.lang.ArithmeticException();
    }

    public final java.lang.String values() {
        int i = (getAid + 59) % 128;
        getProfileVersion = i;
        java.lang.String str = this.values;
        int i2 = i + 79;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void AlternateContactlessPaymentDataJson(java.lang.String str) {
        int i = getAid + 9;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            this.values = str;
        } else {
            this.values = str;
            throw null;
        }
    }

    public final byte[] writeReplace() {
        int i = getAid;
        getProfileVersion = (i + 79) % 128;
        byte[] bArr = this.AlternateContactlessPaymentDataJson;
        int i2 = i + 77;
        getProfileVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final void writeReplace(byte[] bArr) {
        int i = getProfileVersion;
        int i2 = i + 69;
        getAid = i2 % 128;
        if (i2 % 2 == 0) {
            this.AlternateContactlessPaymentDataJson = bArr;
            int i3 = i + 81;
            getAid = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        this.AlternateContactlessPaymentDataJson = bArr;
        throw new java.lang.ArithmeticException();
    }

    private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = $11;
        int i3 = i2 + 45;
        $10 = i3 % 128;
        char[] cArr = str;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (str != null) {
            $10 = (i2 + 47) % 128;
            cArr = str.toCharArray();
        }
        com.payair.hce.getCardholderValidator getcardholdervalidator = new com.payair.hce.getCardholderValidator();
        char[] writeReplace = com.payair.hce.getCardholderValidator.writeReplace(DigitizedCardProfile ^ (-3824242241614154557L), cArr, i);
        getcardholdervalidator.valueOf = 4;
        while (getcardholdervalidator.valueOf < writeReplace.length) {
            getcardholdervalidator.DigitizedCardProfile = getcardholdervalidator.valueOf - 4;
            int i4 = getcardholdervalidator.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Long.valueOf(writeReplace[getcardholdervalidator.valueOf] ^ writeReplace[getcardholdervalidator.valueOf % 4]), java.lang.Long.valueOf(getcardholdervalidator.DigitizedCardProfile), java.lang.Long.valueOf(DigitizedCardProfile)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1178927836);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1921, (char) android.text.TextUtils.indexOf("", ""));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (short) 15, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1178927836, obj);
                }
                writeReplace[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {getcardholdervalidator, getcardholdervalidator};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1228006564);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getMode(0) + 27, 428 - android.view.MotionEvent.axisFromString(""), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 31610));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (short) 17, objArr5);
                    obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1228006564, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                $11 = ($10 + 75) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(writeReplace, 4, writeReplace.length - 4);
    }

    private static void d(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, char c, java.lang.Object[] objArr) {
        char[] cArr;
        int i2 = ($10 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        $11 = i2;
        java.lang.Object obj = null;
        if (str3 != null) {
            int i3 = i2 + 77;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length);
        java.lang.System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        getwalletdata.writeReplace = 0;
        while (getwalletdata.writeReplace < length3) {
            $11 = ($10 + 49) % 128;
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj2 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 71, (android.os.Process.myPid() >> 22) + 1179, (char) (android.view.MotionEvent.axisFromString("") + 1));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (short) 0, objArr3);
                    obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.os.Process.getGidForName(""), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3444, (char) (3831 - (android.os.Process.myPid() >> 22)))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(obj, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr3[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 1864, (char) (41775 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (short) 3, objArr6);
                    obj4 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr3[intValue2] * 32718), java.lang.Integer.valueOf(cArr4[intValue])};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj5 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 28, 3134 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a((short) 0, (byte) 0, (byte) $$d.length, objArr8);
                    obj5 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                }
                cArr4[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                cArr3[intValue2] = getwalletdata.values;
                cArr5[getwalletdata.writeReplace] = (char) ((((cArr3[intValue2] ^ charArray2[getwalletdata.writeReplace]) ^ (IccPrivateKeyCrtComponentsJson ^ 1263759066225628708L)) ^ ((int) (SdkCoreAlternateContactlessPaymentDataImpl ^ 1263759066225628708L))) ^ ((char) (RecordsJson ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
                obj = null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:230:0x0b23, code lost:
    
        com.payair.hce.setupValuesAfterAuthenticate.getAid = (com.payair.hce.setupValuesAfterAuthenticate.getProfileVersion + 5) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0b2c, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0b3f, code lost:
    
        ((int[]) r2[1])[0] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0b47, code lost:
    
        r1 = (int) java.lang.System.currentTimeMillis();
        r3 = ~(669406102 | r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0b4e, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r26), r12, java.lang.Integer.valueOf(((((((~((-669406103) | r1)) | 19026050) | (~((-1227086059) | r1))) * (-880)) + 67314816) + ((((~((~r1) | (-669406103))) | 1227086058) | r3) * (-880))) + (r3 * 880))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0b8d, code lost:
    
        if (r1 != null) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0b8f, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.red(0), android.text.TextUtils.getOffsetBefore("", 0) + 2713, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
        r3 = (byte) (com.payair.hce.setupValuesAfterAuthenticate.$$a[14] + 1);
        r9 = r3;
        r10 = new java.lang.Object[1];
        b(r3, r9, r9, r10);
        r1 = r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0be3, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0bea, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0beb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0bec, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0bf1, code lost:
    
        if (r2 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0bf3, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0bf4, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0c30, code lost:
    
        r2 = new java.lang.Object[]{new int[1], new int[1], new int[1]};
        ((int[]) r2[0])[0] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0c43, code lost:
    
        ((int[]) r2[1])[0] = r7 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0c4d, code lost:
    
        r1 = (int) java.lang.System.currentTimeMillis();
        r3 = ~((~r1) | 1073687423);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0c55, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r26), 16, java.lang.Integer.valueOf((((((~((-962528012) | r1)) | 822804737) | r3) * (-470)) + 2067661910) + (((~(r1 | (-139723275))) | r3) * 470))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0c8d, code lost:
    
        if (r1 != null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0c8f, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 50, android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
        r3 = (byte) (com.payair.hce.setupValuesAfterAuthenticate.$$a[14] + 1);
        r9 = r3;
        r10 = new java.lang.Object[1];
        b(r3, r9, r9, r10);
        r1 = r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(r5, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0ce0, code lost:
    
        ((int[]) r2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0ce7, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0ce8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0ce9, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0cee, code lost:
    
        if (r2 != null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0cf0, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0cf1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v214 */
    /* JADX WARN: Type inference failed for: r1v249 */
    /* JADX WARN: Type inference failed for: r1v250 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r2v157, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v164, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.reflect.Field] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        java.lang.String intern;
        java.lang.Integer num;
        java.nio.LongBuffer[] longBufferArr;
        java.lang.Integer num2;
        int i4;
        int i5;
        java.nio.LongBuffer[] longBufferArr2;
        java.lang.String[] strArr;
        java.lang.Integer num3;
        int i6 = 0;
        java.lang.Integer num4 = 0;
        android.content.Context context = (android.content.Context) objArr[0];
        int i7 = 1;
        java.lang.String[] strArr2 = (java.lang.String[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int intValue3 = ((java.lang.Number) objArr[4]).intValue();
        int i8 = getProfileVersion;
        int i9 = (i8 + 95) % 128;
        getAid = i9;
        try {
            if (context == null) {
                getProfileVersion = (i9 + 103) % 128;
                java.lang.Object[] objArr2 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr2[0])[0] = intValue;
                ((int[]) objArr2[1])[0] = intValue;
                int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(intValue3), num4, java.lang.Integer.valueOf(((((~(r7 | 1878649980)) | 17842180) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) - 1691658784) + (((~((~currentTimeMillis) | 1161388044)) | 735104116) * (-440)) + ((currentTimeMillis | 1878649980) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 50, 2713 - android.view.View.combineMeasuredStates(0, 0), (char) android.view.View.getDefaultSize(0, 0));
                    byte b = (byte) ($$a[14] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    b(b, b2, b2, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            if (strArr2.length == 0) {
                getAid = (i8 + 5) % 128;
                java.lang.Object[] objArr5 = {new int[1], new int[1], new int[1]};
                ((int[]) objArr5[0])[0] = intValue;
                ((int[]) objArr5[1])[0] = 4 ^ intValue;
                int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
                int i10 = ~currentTimeMillis2;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf((((~((-1778235100) | i10)) | (-118257062) | (~(1778235099 | currentTimeMillis2))) * (-564)) + 1821235064 + ((~(currentTimeMillis2 | (-100679973))) * 1128) + (((~(i10 | (-118257062))) | (-1878915072)) * 564))};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj2 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                    byte b3 = (byte) ($$a[14] + 1);
                    byte b4 = b3;
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    b(b3, b4, b4, objArr7);
                    obj2 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                }
                ((int[]) objArr5[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr6)).intValue();
                return objArr5;
            }
            int length = strArr2.length;
            java.nio.LongBuffer[] longBufferArr3 = new java.nio.LongBuffer[length];
            int i11 = 0;
            java.lang.String[] strArr3 = -1347122530;
            while (i11 < strArr2.length) {
                java.lang.String lowerCase = strArr2[i11].toLowerCase();
                int capsMode = android.text.TextUtils.getCapsMode("", i6, i6);
                java.lang.Object[] objArr8 = new java.lang.Object[i7];
                c("춊닂敂춰囆", capsMode, objArr8);
                java.lang.String replaceAll = lowerCase.replaceAll(((java.lang.String) objArr8[0]).intern(), "");
                int i12 = intValue2;
                long longValue = new java.math.BigInteger(replaceAll.substring(16, 32), 16).longValue();
                java.lang.String[] strArr4 = strArr2;
                long longValue2 = new java.math.BigInteger(replaceAll.substring(0, 16), 16).longValue();
                int length2 = replaceAll.length();
                if (length2 == 32) {
                    i4 = intValue3;
                    i5 = length;
                    longBufferArr2 = longBufferArr3;
                    strArr = strArr3;
                    num3 = num4;
                    longBufferArr2[i11] = java.nio.LongBuffer.allocate(2).put(longValue2).put(longValue);
                } else {
                    if (length2 != 64) {
                        java.lang.Object[] objArr9 = {new int[1], new int[1], new int[1]};
                        ((int[]) objArr9[0])[0] = intValue;
                        ((int[]) objArr9[1])[0] = intValue ^ 3;
                        int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
                        java.lang.Object[] objArr10 = {java.lang.Integer.valueOf(intValue3), 16, java.lang.Integer.valueOf((((((~((-303304709) | currentTimeMillis3)) | (~(1593187452 | currentTimeMillis3))) * 69) - 534691160) + ((((~(currentTimeMillis3 | (-370415685))) | 67110976) | (~(1526076476 | currentTimeMillis3))) * (-69))) - 1528093928)};
                        java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr3);
                        if (obj3 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 50, android.view.View.combineMeasuredStates(0, 0) + 2713, (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1));
                            byte b5 = (byte) ($$a[14] + 1);
                            byte b6 = b5;
                            java.lang.Object[] objArr11 = new java.lang.Object[1];
                            b(b5, b6, b6, objArr11);
                            obj3 = cls3.getMethod((java.lang.String) objArr11[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr3, obj3);
                        }
                        ((int[]) objArr9[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr10)).intValue();
                        return objArr9;
                    }
                    i5 = length;
                    longBufferArr2 = longBufferArr3;
                    strArr = strArr3;
                    num3 = num4;
                    i4 = intValue3;
                    longBufferArr2[i11] = java.nio.LongBuffer.allocate(4).put(longValue2).put(longValue).put(new java.math.BigInteger(replaceAll.substring(32, 48), 16).longValue()).put(new java.math.BigInteger(replaceAll.substring(48), 16).longValue());
                }
                i11++;
                num4 = num3;
                longBufferArr3 = longBufferArr2;
                strArr2 = strArr4;
                intValue2 = i12;
                length = i5;
                strArr3 = strArr;
                intValue3 = i4;
                i6 = 0;
                i7 = 1;
            }
            int i13 = intValue2;
            int i14 = intValue3;
            int i15 = length;
            java.nio.LongBuffer[] longBufferArr4 = longBufferArr3;
            java.lang.String[] strArr5 = strArr3;
            java.lang.Integer num5 = num4;
            if (context == null) {
                i = 1;
                try {
                    java.lang.Object[] objArr12 = {new int[1], new int[1], new int[1]};
                    ((int[]) objArr12[0])[0] = intValue;
                    try {
                        ((int[]) objArr12[1])[0] = intValue;
                        int currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                        try {
                            java.lang.Object[] objArr13 = {java.lang.Integer.valueOf(i14), num5, java.lang.Integer.valueOf((((~((-452044869) | currentTimeMillis4)) | 148973632) * (-283)) + 1106357056 + ((~(currentTimeMillis4 | (-303071237))) * 283))};
                            try {
                                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr5);
                                if (obj4 == null) {
                                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.getDefaultSize(0, 0), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) android.text.TextUtils.getOffsetAfter("", 0));
                                    byte b7 = (byte) ($$a[14] + 1);
                                    byte b8 = b7;
                                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                                    b(b7, b8, b8, objArr14);
                                    obj4 = cls4.getMethod((java.lang.String) objArr14[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr5, obj4);
                                }
                                ((int[]) objArr12[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr13)).intValue();
                                return objArr12;
                            } catch (java.lang.Throwable th) {
                                th = th;
                                java.lang.Throwable th2 = th;
                                java.lang.Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    } catch (java.lang.Throwable unused) {
                        strArr2 = strArr5;
                    }
                } catch (java.lang.Throwable unused2) {
                    strArr2 = strArr5;
                }
            } else {
                strArr2 = strArr5;
                byte[][] bArr = new byte[i15][];
                int i16 = 0;
                int i17 = 0;
                while (i16 < i15) {
                    java.nio.LongBuffer longBuffer = longBufferArr4[i16];
                    if (longBuffer.capacity() == 4) {
                        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(32);
                        java.nio.LongBuffer asLongBuffer = allocate.asLongBuffer();
                        long[] array = longBuffer.array();
                        int length3 = array.length;
                        int i18 = 0;
                        while (i18 < length3) {
                            int i19 = length3;
                            int i20 = getAid + 43;
                            java.nio.LongBuffer[] longBufferArr5 = longBufferArr4;
                            getProfileVersion = i20 % 128;
                            if (i20 % 2 == 0) {
                                num2 = num5;
                                asLongBuffer.put(array[i18]);
                                i18 += 107;
                            } else {
                                num2 = num5;
                                asLongBuffer.put(array[i18]);
                                i18++;
                            }
                            num5 = num2;
                            longBufferArr4 = longBufferArr5;
                            length3 = i19;
                        }
                        num = num5;
                        longBufferArr = longBufferArr4;
                        bArr[i17] = allocate.array();
                        i17++;
                    } else {
                        num = num5;
                        longBufferArr = longBufferArr4;
                    }
                    i16++;
                    num5 = num;
                    longBufferArr4 = longBufferArr;
                }
                java.lang.Integer num6 = num5;
                java.nio.LongBuffer[] longBufferArr6 = longBufferArr4;
                if (i17 > 0) {
                    getAid = (getProfileVersion + 15) % 128;
                    int currentTimeMillis5 = ((int) java.lang.System.currentTimeMillis()) ^ 343337308;
                    try {
                        java.lang.Object[] objArr15 = {java.lang.Integer.valueOf(intValue ^ currentTimeMillis5), bArr, java.lang.Integer.valueOf(i17)};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(336776035);
                        if (obj5 == null) {
                            java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.resolveSizeAndState(0, 0, 0), 429 - android.view.View.MeasureSpec.getMode(0), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 31611));
                            byte b9 = (byte) (-$$a[14]);
                            byte b10 = b9;
                            java.lang.Object[] objArr16 = new java.lang.Object[1];
                            b(b9, b10, b10, objArr16);
                            obj5 = cls5.getMethod((java.lang.String) objArr16[0], java.lang.Integer.TYPE, byte[][].class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(336776035, obj5);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr15)).longValue();
                        long currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                        i2 = i15;
                        long j = ((628 * longValue3) - 353446935776L) + ((longValue3 | currentTimeMillis6 | 562813591) * (-627)) + (((~((~longValue3) | currentTimeMillis6)) | (-562813592)) * (-627)) + (((~((~currentTimeMillis6) | longValue3)) | (((-562813592) | currentTimeMillis6) ^ (-1))) * 627) + 1496714299;
                        int i21 = (int) (j >> 32);
                        int currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                        int i22 = (int) j;
                        int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                        int i23 = ~currentTimeMillis8;
                        int i24 = ((i22 & (((((~(currentTimeMillis8 | 1732641750)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) + 942959549) + (((-631850) | i23) * (-216))) + (((~(i23 | 1732641750)) | 1125099135) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | (((((((~(324535148 | currentTimeMillis7)) | 307757672) * (-502)) + 2088299218) + ((~((~currentTimeMillis7) | 2069519231)) * (-502))) + (((~(currentTimeMillis7 | (-1761761560))) | 324535148) * 502)) & i21)) ^ currentTimeMillis5;
                        try {
                            if ((i13 & 1) == 1 && (i24 ^ intValue) == 15) {
                                java.lang.Object[] objArr17 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr17[0])[0] = intValue;
                                ((int[]) objArr17[1])[0] = i24;
                                int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                                int i25 = ~currentTimeMillis9;
                                try {
                                    java.lang.Object[] objArr18 = {java.lang.Integer.valueOf(i14), 16, java.lang.Integer.valueOf(((((~((-1854151647) | i25)) | (~(42340514 | currentTimeMillis9))) * 959) - 463594885) + (((~(currentTimeMillis9 | (-1854151647))) | (~(i25 | 42340514))) * 959))};
                                    java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
                                    if (obj6 == null) {
                                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, android.view.View.resolveSize(0, 0) + 2713, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                        byte b11 = (byte) ($$a[14] + 1);
                                        byte b12 = b11;
                                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                                        b(b11, b12, b12, objArr19);
                                        obj6 = cls6.getMethod((java.lang.String) objArr19[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, obj6);
                                    }
                                    ((int[]) objArr17[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj6).invoke(null, objArr18)).intValue();
                                    return objArr17;
                                } catch (java.lang.Throwable th4) {
                                    java.lang.Throwable cause2 = th4.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th4;
                                }
                            }
                            int i26 = i24 ^ intValue;
                            if (i26 == 0) {
                                try {
                                    java.lang.Object[] objArr20 = {new int[1], new int[1], new int[1]};
                                    ((int[]) objArr20[0])[0] = intValue;
                                    ((int[]) objArr20[1])[0] = i24;
                                    int currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                    int i27 = ~currentTimeMillis10;
                                    try {
                                        java.lang.Object[] objArr21 = {java.lang.Integer.valueOf(i14), num6, java.lang.Integer.valueOf((((~((-14631181) | i27)) | (~((-1881860981) | i27))) * (-867)) + 1182720512 + (((~((-14631181) | currentTimeMillis10)) | 672004 | (~((-1881860981) | currentTimeMillis10))) * (-1734)) + (((~(currentTimeMillis10 | (-13959177))) | (~(i27 | (-672005))) | (~((-1881188977) | currentTimeMillis10))) * 867))};
                                        java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
                                        if (obj7 == null) {
                                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 50, 2713 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (char) android.view.View.getDefaultSize(0, 0));
                                            byte b13 = (byte) ($$a[14] + 1);
                                            byte b14 = b13;
                                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                                            b(b13, b14, b14, objArr22);
                                            obj7 = cls7.getMethod((java.lang.String) objArr22[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, obj7);
                                        }
                                        ((int[]) objArr20[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj7).invoke(null, objArr21)).intValue();
                                        int i28 = getAid + 65;
                                        getProfileVersion = i28 % 128;
                                        if (i28 % 2 != 0) {
                                            return objArr20;
                                        }
                                        throw new java.lang.ArithmeticException();
                                    } catch (java.lang.Throwable th5) {
                                        java.lang.Throwable cause3 = th5.getCause();
                                        if (cause3 != null) {
                                            throw cause3;
                                        }
                                        throw th5;
                                    }
                                } catch (java.lang.Throwable unused3) {
                                    i = 1;
                                }
                            } else if (i26 == 11) {
                                java.lang.Object[] objArr23 = {new int[1], new int[1], new int[1]};
                                ((int[]) objArr23[0])[0] = intValue;
                                ((int[]) objArr23[1])[0] = i24;
                                int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                try {
                                    java.lang.Object[] objArr24 = {java.lang.Integer.valueOf(i14), 16, java.lang.Integer.valueOf((((549487482 | r2) * (-476)) - 2046354456) + ((~((-1342775301) | currentTimeMillis11)) * 952) + ((~((~currentTimeMillis11) | (-1342775301))) * 476))};
                                    java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
                                    if (obj8 == null) {
                                        java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.green(0) + 50, 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                        byte b15 = (byte) ($$a[14] + 1);
                                        byte b16 = b15;
                                        java.lang.Object[] objArr25 = new java.lang.Object[1];
                                        b(b15, b16, b16, objArr25);
                                        obj8 = cls8.getMethod((java.lang.String) objArr25[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, obj8);
                                    }
                                    ((int[]) objArr23[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr24)).intValue();
                                    return objArr23;
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause4 = th6.getCause();
                                    if (cause4 != null) {
                                        throw cause4;
                                    }
                                    throw th6;
                                }
                            }
                        } catch (java.lang.Throwable unused4) {
                            i = 1;
                        }
                    } catch (java.lang.Throwable th7) {
                        java.lang.Throwable cause5 = th7.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th7;
                    }
                    i = 1;
                } else {
                    i2 = i15;
                }
                getProfileVersion = (getAid + 117) % 128;
                try {
                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                    d("拿탭籖邫珢墩诂抍堺辄\u0cf6퀀쬿씟鈽\uefd6\ue842㧄歸⽦摐ፁ兖", "픁溸笻䜼", android.widget.ExpandableListView.getPackedPositionChild(0L) + 997112022, "\u0000\u0000\u0000\u0000", (char) android.graphics.Color.argb(0, 0, 0, 0), objArr26);
                    java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                    d("\udc63㝈費ය綇\uab07쉙ോ\u0bde铉貨෪֏\uf4eaಘ裷ከ", "\ue68e圊䈝掸", 492243686 - android.text.TextUtils.indexOf("", "", 0, 0), "\u0000\u0000\u0000\u0000", (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 47170), objArr27);
                    java.lang.Object invoke = cls9.getMethod(((java.lang.String) objArr27[0]).intern(), null).invoke(context, null);
                    try {
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        d("拿탭籖邫珢墩诂抍堺辄\u0cf6퀀쬿씟鈽\uefd6\ue842㧄歸⽦摐ፁ兖", "픁溸笻䜼", 47365 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0000\u0000\u0000\u0000", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr28);
                        java.lang.Class<?> cls10 = java.lang.Class.forName(((java.lang.String) objArr28[0]).intern());
                        java.lang.Object[] objArr29 = new java.lang.Object[1];
                        c("瞎瀰熞矩쾭บ⃑蠏쾋ล⃀蠩쿭\u0e60Ὡ₠衃쿍", android.view.KeyEvent.keyCodeFromString(""), objArr29);
                        try {
                            java.lang.Object[] objArr30 = {cls10.getMethod(((java.lang.String) objArr29[0]).intern(), null).invoke(context, null), 64};
                            java.lang.Object[] objArr31 = new java.lang.Object[1];
                            d("죲ᒐ㽩꭛\uebb7Ꞣ드︵\uf135싔\uda3e蛙줔턒\ue165ꔱꊩど啢Ἣ߆잻\uedb5豫䡉ሉ∲䠸휽䨎\uf74e\ue7e9딶", "堫蠯什ꟙ", (-41406631) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0000\u0000\u0000\u0000", (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr31);
                            java.lang.Class<?> cls11 = java.lang.Class.forName(((java.lang.String) objArr31[0]).intern());
                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                            c("헊忋籖햭\ue056ϒ稯⩋\ue070ϭ稾⩭\ue016ί䖗穑⨌\ue03c", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr32);
                            java.lang.Object invoke2 = cls11.getMethod(((java.lang.String) objArr32[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr30);
                            int i29 = 0;
                            i = invoke2;
                            loop3: while (true) {
                                try {
                                    if (i29 >= i2) {
                                        break;
                                    }
                                    java.nio.LongBuffer longBuffer2 = longBufferArr6[i29];
                                    if (longBuffer2.capacity() == 4) {
                                        getProfileVersion = (getAid + 29) % 128;
                                        try {
                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                            d("條₶⼝⎊䃼璒衾", "\ue57f鯢⽶\ude2e", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1989927653, "\u0000\u0000\u0000\u0000", (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr33);
                                            intern = ((java.lang.String) objArr33[0]).intern();
                                            i3 = 0;
                                        } catch (java.lang.Throwable unused5) {
                                            i = 1;
                                        }
                                    } else {
                                        i3 = 0;
                                        try {
                                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                                            c("\uf46f邏⽓\uf422䚯傖쏛", android.view.KeyEvent.getDeadChar(0, 0), objArr34);
                                            intern = ((java.lang.String) objArr34[0]).intern();
                                        } catch (java.lang.Throwable unused6) {
                                            i = 1;
                                        }
                                    }
                                    try {
                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                        c("셿䇊穠섞﹜״⚸㻰ﹻה⛄㻜\ufe1d־ᤢ⛾㺺︼ք⚄㺏ﻟԾ☚㹾ﻱ՛☋㹘ﺗԙ♤㸹ﺽ", android.text.TextUtils.indexOf("", "", i3, i3), objArr35);
                                        java.lang.Class<?> cls12 = java.lang.Class.forName(((java.lang.String) objArr35[i3]).intern());
                                        try {
                                            java.lang.Object[] objArr36 = new java.lang.Object[1];
                                            d("珵鰪ᧁ鋜뷷䂰뜰鈳퐑쏣", "\u09d2\uf4e2\ue150ꁐ", android.view.ViewConfiguration.getTouchSlop() >> 8, "\u0000\u0000\u0000\u0000", (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr36);
                                            java.lang.Object[] objArr37 = (java.lang.Object[]) cls12.getField(((java.lang.String) objArr36[0]).intern()).get(i);
                                            int length4 = objArr37.length;
                                            int i30 = 0;
                                            java.lang.Object obj9 = i;
                                            while (i30 < length4) {
                                                java.lang.Object obj10 = objArr37[i30];
                                                try {
                                                    java.lang.Object obj11 = obj9;
                                                    java.lang.Object[] objArr38 = objArr37;
                                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                                    d("飍诮햠㑩益跦쒣Ὲ㰟楻왓夨ﭱ㰼\uf00d\udd5e譨遂\udc5e\ud8e9鸜䐨\u0e6b䵳颌\ue5f7鲋", "\u2e72鹻绀ඪ", android.os.Process.getGidForName("") - 1063355601, "\u0000\u0000\u0000\u0000", (char) (43646 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr39);
                                                    java.lang.Class<?> cls13 = java.lang.Class.forName(((java.lang.String) objArr39[0]).intern());
                                                    int i31 = i2;
                                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                                    c("\udb2c鵅禟\udb4b⋘؛绰⒢⋮ػ绸⒂⊞ي䅑", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr40);
                                                    java.lang.Object invoke3 = cls13.getMethod(((java.lang.String) objArr40[0]).intern(), java.lang.String.class).invoke(null, intern);
                                                    try {
                                                        java.lang.Object[] objArr41 = new java.lang.Object[1];
                                                        c("쨠樐揌쩁햆᱘༾㖯햡ᱸག㖃헇ᰒイླྀ㗥헦ᰨ༂㗐픅Გྟ㔩픯ᳲྍ㔔핝\u1c8e\u0fe9", 1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr41);
                                                        java.lang.Class<?> cls14 = java.lang.Class.forName(((java.lang.String) objArr41[0]).intern());
                                                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                                                        c("⩍䴸褁⨹\uf2af\uf6b3\ue83e헙\uf285\uf690\ue815헿\uf2e1\uf6c8\ud7af", (-16777216) - android.graphics.Color.rgb(0, 0, 0), objArr42);
                                                        try {
                                                            java.lang.Object[] objArr43 = {cls14.getMethod(((java.lang.String) objArr42[0]).intern(), null).invoke(obj10, null)};
                                                            java.lang.Object[] objArr44 = new java.lang.Object[1];
                                                            d("飍诮햠㑩益跦쒣Ὲ㰟楻왓夨ﭱ㰼\uf00d\udd5e譨遂\udc5e\ud8e9鸜䐨\u0e6b䵳颌\ue5f7鲋", "\u2e72鹻绀ඪ", (android.view.KeyEvent.getMaxKeyCode() >> 16) - 1063355602, "\u0000\u0000\u0000\u0000", (char) (43646 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), objArr44);
                                                            java.lang.Class<?> cls15 = java.lang.Class.forName(((java.lang.String) objArr44[0]).intern());
                                                            java.lang.Object[] objArr45 = new java.lang.Object[1];
                                                            c("\uf4c9䌠橴\uf4adﲱᗣల\u0b5aﲌ㎿", android.view.Gravity.getAbsoluteGravity(0, 0), objArr45);
                                                            if (java.nio.ByteBuffer.wrap((byte[]) cls15.getMethod(((java.lang.String) objArr45[0]).intern(), byte[].class).invoke(invoke3, objArr43)).asLongBuffer().equals(longBuffer2.rewind())) {
                                                                break loop3;
                                                            }
                                                            i30++;
                                                            obj9 = obj11;
                                                            objArr37 = objArr38;
                                                            i2 = i31;
                                                        } catch (java.lang.Throwable th8) {
                                                            java.lang.Throwable cause6 = th8.getCause();
                                                            if (cause6 != null) {
                                                                throw cause6;
                                                            }
                                                            throw th8;
                                                        }
                                                    } catch (java.lang.Throwable th9) {
                                                        java.lang.Throwable cause7 = th9.getCause();
                                                        if (cause7 != null) {
                                                            throw cause7;
                                                        }
                                                        throw th9;
                                                    }
                                                } catch (java.lang.Throwable th10) {
                                                    java.lang.Throwable cause8 = th10.getCause();
                                                    if (cause8 != null) {
                                                        throw cause8;
                                                    }
                                                    throw th10;
                                                }
                                            }
                                            i29++;
                                            i = obj9;
                                        } catch (java.lang.Throwable unused7) {
                                            i = 1;
                                        }
                                    } catch (java.lang.Throwable unused8) {
                                        i = 1;
                                    }
                                } catch (java.lang.Throwable unused9) {
                                }
                                i = 1;
                            }
                        } catch (java.lang.Throwable th11) {
                            java.lang.Throwable cause9 = th11.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th11;
                        }
                    } catch (java.lang.Throwable th12) {
                        java.lang.Throwable cause10 = th12.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th12;
                    }
                } catch (java.lang.Throwable th13) {
                    java.lang.Throwable cause11 = th13.getCause();
                    if (cause11 != null) {
                        throw cause11;
                    }
                    throw th13;
                }
            }
            java.lang.Object[] objArr46 = {new int[i], new int[i], new int[i]};
            ((int[]) objArr46[0])[0] = intValue;
            ((int[]) objArr46[i])[0] = intValue ^ 2;
            int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
            java.lang.Object[] objArr47 = {java.lang.Integer.valueOf(i14), 16, java.lang.Integer.valueOf((((~((-1320263767) | currentTimeMillis12)) | 541065768) * 449) + 1257792858 + (((~((~currentTimeMillis12) | (-1320263767))) | 541065768) * 449))};
            java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(strArr2);
            if (obj12 == null) {
                java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0));
                byte b17 = (byte) ($$a[14] + 1);
                byte b18 = b17;
                java.lang.Object[] objArr48 = new java.lang.Object[1];
                b(b17, b18, b18, objArr48);
                obj12 = cls16.getMethod((java.lang.String) objArr48[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(strArr2, obj12);
            }
            ((int[]) objArr46[2])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj12).invoke(null, objArr47)).intValue();
            return objArr46;
        } catch (java.lang.Throwable th14) {
            java.lang.Throwable cause12 = th14.getCause();
            if (cause12 != null) {
                throw cause12;
            }
            throw th14;
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        getProfileVersion = 1;
        DigitizedCardProfile = -4255892165499761861L;
        IccPrivateKeyCrtComponentsJson = 1263759066225628708L;
        SdkCoreAlternateContactlessPaymentDataImpl = -804334044;
        RecordsJson = (char) 48193;
    }

    static void init$1() {
        $$d = new byte[]{118, 40, com.google.common.base.Ascii.SYN, 126};
        $$e = 94;
    }

    static void init$0() {
        $$a = new byte[]{117, 72, 94, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = 134;
    }

    public static java.lang.Object[] values(android.content.Context context, java.lang.String[] strArr, int i, int i2, int i3) {
        return (java.lang.Object[]) DigitizedCardProfile(new java.lang.Object[]{context, strArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)}, 1516179835, -1516179835, i);
    }
}
