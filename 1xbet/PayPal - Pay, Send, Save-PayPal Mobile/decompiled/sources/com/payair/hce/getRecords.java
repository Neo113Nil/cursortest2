package com.payair.hce;

/* loaded from: classes4.dex */
public final class getRecords {
    public static com.payair.hce.getCiacDecline AlternateContactlessPaymentDataJson(com.payair.hce.getAckAutomaticallyResetByApplication getackautomaticallyresetbyapplication) throws com.payair.hce.getSecurityWord {
        boolean z;
        try {
            try {
                getackautomaticallyresetbyapplication.getProfileVersion();
            } catch (java.io.EOFException e) {
                e = e;
                z = true;
            }
            try {
                return com.payair.hce.SdkCoreMChipCvmIssuerOptionsImpl.buildRecords.AlternateContactlessPaymentDataJson(getackautomaticallyresetbyapplication);
            } catch (java.io.EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return com.payair.hce.SdkCoreBusinessLogicModuleImpl.values;
                }
                throw new com.payair.hce.getDualTapResetTimeout(e);
            }
        } catch (com.payair.hce.SdkCoreMppLiteModuleImpl e3) {
            throw new com.payair.hce.getDualTapResetTimeout(e3);
        } catch (java.io.IOException e4) {
            throw new com.payair.hce.getPaymentFci(e4);
        } catch (java.lang.NumberFormatException e5) {
            throw new com.payair.hce.getDualTapResetTimeout(e5);
        }
    }

    /* loaded from: classes10.dex */
    public static final class values extends java.io.Writer {
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
        private static int getProfileVersion;
        private static long valueOf;
        private static char values;
        private static int writeReplace;
        private final java.lang.Appendable AlternateContactlessPaymentDataJson;
        private final com.payair.hce.getRecords.values.valueOf DigitizedCardProfile;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
            int i2;
            int i3 = 65 - (s * 3);
            byte[] bArr = $$a;
            int i4 = b * 4;
            int i5 = i + 4;
            byte[] bArr2 = new byte[i4 + 35];
            if (bArr == null) {
                int i6 = i5;
                int i7 = 0;
                i3 = (i3 + i5) - 2;
                i5 = i6;
                i2 = i7;
                int i8 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4 + 34) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i9 = i2 + 1;
                i6 = i8;
                i5 = bArr[i8];
                i7 = i9;
                i3 = (i3 + i5) - 2;
                i5 = i6;
                i2 = i7;
                int i82 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4 + 34) {
                }
            } else {
                i2 = 0;
                int i822 = i5 + 1;
                bArr2[i2] = (byte) i3;
                if (i2 == i4 + 34) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(byte b, byte b2, short s, java.lang.Object[] objArr) {
            int i;
            int i2;
            byte[] bArr = $$d;
            int i3 = b2 + 4;
            int i4 = b * 2;
            int i5 = 110 - s;
            byte[] bArr2 = new byte[1 - i4];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i3 += -i5;
                i2 = i6;
                i = i7;
                bArr2[i] = (byte) i3;
                int i8 = i2 + 1;
                if (i == 0 - i4) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                int i9 = i + 1;
                i6 = i8;
                i5 = bArr[i8];
                i7 = i9;
                i3 += -i5;
                i2 = i6;
                i = i7;
                bArr2[i] = (byte) i3;
                int i82 = i2 + 1;
                if (i == 0 - i4) {
                }
            } else {
                i = 0;
                i2 = i3;
                i3 = i5;
                bArr2[i] = (byte) i3;
                int i822 = i2 + 1;
                if (i == 0 - i4) {
                }
            }
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            char c;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
            char[] cArr = new char[charArray.length];
            getproducttype.AlternateContactlessPaymentDataJson = 0;
            char c2 = 2;
            char[] cArr2 = new char[2];
            while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
                cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
                cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
                int i2 = 58224;
                int i3 = 0;
                while (i3 < 16) {
                    $10 = ($11 + 21) % 128;
                    char c3 = cArr2[1];
                    char c4 = cArr2[0];
                    char c5 = (char) (SdkCoreAlternateContactlessPaymentDataImpl ^ 2144259807102049818L);
                    try {
                        java.lang.Object[] objArr2 = new java.lang.Object[4];
                        objArr2[3] = java.lang.Integer.valueOf(getAid);
                        objArr2[c2] = java.lang.Integer.valueOf(c4 >>> 5);
                        objArr2[1] = java.lang.Integer.valueOf(((c4 << 4) + c5) ^ (c4 + i2));
                        objArr2[0] = java.lang.Integer.valueOf(c3);
                        java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 1334 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (android.os.Process.myTid() >> 22));
                            byte b = $$d[0];
                            byte b2 = (byte) (b - 1);
                            byte b3 = (byte) (-b);
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(b2, b3, (byte) (b3 + 1), objArr3);
                            obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                        }
                        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                        cArr2[1] = charValue;
                        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (IccPrivateKeyCrtComponentsJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(RecordsJson)};
                        int i4 = charValue + i2;
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                        if (obj2 == null) {
                            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(62 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1335 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte b4 = $$d[0];
                            byte b5 = (byte) (b4 - 1);
                            byte b6 = (byte) (-b4);
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            d(b5, b6, (byte) (b6 + 1), objArr5);
                            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                        }
                        cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
                        i3++;
                        $11 = ($10 + 47) % 128;
                        c2 = 2;
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
                    c = 2;
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.graphics.Color.alpha(0), 3543 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (char) android.text.TextUtils.getCapsMode("", 0, 0))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
                } else {
                    c = 2;
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
                c2 = c;
            }
            objArr[0] = new java.lang.String(cArr, 0, i);
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) throws java.io.IOException {
            getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 1) % 128;
            this.DigitizedCardProfile.writeReplace = cArr;
            this.AlternateContactlessPaymentDataJson.append(this.DigitizedCardProfile, i, i2 + i);
            int i3 = getProfileVersion + 17;
            SdkCoreBusinessLogicModuleImpl = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        @Override // java.io.Writer
        public final void write(int i) throws java.io.IOException {
            int i2 = getProfileVersion + 43;
            SdkCoreBusinessLogicModuleImpl = i2 % 128;
            if (i2 % 2 != 0) {
                this.AlternateContactlessPaymentDataJson.append((char) i);
                getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 51) % 128;
            } else {
                this.AlternateContactlessPaymentDataJson.append((char) i);
                throw null;
            }
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            getProfileVersion = (SdkCoreBusinessLogicModuleImpl + 69) % 128;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            int i = getProfileVersion + 39;
            SdkCoreBusinessLogicModuleImpl = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        static final class valueOf implements java.lang.CharSequence {
            char[] writeReplace;

            valueOf() {
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return this.writeReplace.length;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return this.writeReplace[i];
            }

            @Override // java.lang.CharSequence
            public final java.lang.CharSequence subSequence(int i, int i2) {
                return new java.lang.String(this.writeReplace, i, i2 - i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static void b(java.lang.String str, char c, java.lang.String str2, java.lang.String str3, int i, java.lang.Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            char c2;
            int i2 = $10;
            int i3 = i2 + 23;
            $11 = i3 % 128;
            java.lang.Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            if (str3 != null) {
                int i4 = i2 + 73;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                cArr = str3.toCharArray();
            } else {
                cArr = str3;
            }
            char[] cArr3 = cArr;
            if (str2 != 0) {
                cArr2 = str2.toCharArray();
                $10 = ($11 + 69) % 128;
            } else {
                cArr2 = str2;
            }
            char[] cArr4 = cArr2;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getWalletData getwalletdata = new com.payair.hce.getWalletData();
            int length = charArray.length;
            char[] cArr5 = new char[length];
            int length2 = cArr3.length;
            char[] cArr6 = new char[length2];
            int i5 = 0;
            java.lang.System.arraycopy(charArray, 0, cArr5, 0, length);
            java.lang.System.arraycopy(cArr3, 0, cArr6, 0, length2);
            cArr5[0] = (char) (cArr5[0] ^ c);
            cArr6[2] = (char) (cArr6[2] + ((char) i));
            int length3 = cArr4.length;
            char[] cArr7 = new char[length3];
            getwalletdata.writeReplace = 0;
            while (getwalletdata.writeReplace < length3) {
                $10 = ($11 + 61) % 128;
                try {
                    java.lang.Object[] objArr2 = {getwalletdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                    if (obj2 == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(71 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 1180 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(i5)));
                        byte b = $$d[i5];
                        byte b2 = (byte) (b - 1);
                        byte b3 = (byte) (-b);
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b2, b3, (byte) (b3 & 8), objArr3);
                        java.lang.String str4 = (java.lang.String) objArr3[i5];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[i5] = java.lang.Object.class;
                        obj2 = cls.getMethod(str4, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj2);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(obj, objArr2)).intValue();
                    java.lang.Object[] objArr4 = {getwalletdata};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                    if (obj3 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 30, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, i5) + 3444, (char) (3832 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))));
                        java.lang.Class<?>[] clsArr2 = new java.lang.Class[1];
                        clsArr2[i5] = java.lang.Object.class;
                        obj3 = cls2.getMethod("g", clsArr2);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj3);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    char c3 = cArr5[getwalletdata.writeReplace % 4];
                    java.lang.Object[] objArr5 = new java.lang.Object[3];
                    objArr5[2] = java.lang.Integer.valueOf(cArr6[intValue]);
                    objArr5[1] = java.lang.Integer.valueOf(c3 * 32718);
                    objArr5[i5] = getwalletdata;
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                    if (obj4 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1865 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (41775 - (android.util.TypedValue.complexToFloat(i5) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(i5) == 0.0f ? 0 : -1))));
                        byte b4 = $$d[i5];
                        byte b5 = (byte) (b4 - 1);
                        byte b6 = (byte) (-b4);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        d(b5, b6, (byte) (b6 & 5), objArr6);
                        java.lang.String str5 = (java.lang.String) objArr6[i5];
                        java.lang.Class<?>[] clsArr3 = new java.lang.Class[3];
                        clsArr3[i5] = java.lang.Object.class;
                        clsArr3[1] = java.lang.Integer.TYPE;
                        clsArr3[2] = java.lang.Integer.TYPE;
                        obj4 = cls3.getMethod(str5, clsArr3);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj4);
                    }
                    ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
                    char c4 = cArr5[intValue2];
                    java.lang.Object[] objArr7 = new java.lang.Object[2];
                    objArr7[1] = java.lang.Integer.valueOf(cArr6[intValue]);
                    objArr7[i5] = java.lang.Integer.valueOf(c4 * 32718);
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                    if (obj5 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 28, 3133 - android.view.View.MeasureSpec.makeMeasureSpec(i5, i5), (char) (android.os.Process.myTid() >> 22));
                        byte[] bArr = $$d;
                        byte b7 = bArr[i5];
                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                        d((byte) (b7 - 1), (byte) (-b7), (byte) bArr.length, objArr8);
                        java.lang.String str6 = (java.lang.String) objArr8[i5];
                        c2 = 2;
                        java.lang.Class<?>[] clsArr4 = new java.lang.Class[2];
                        clsArr4[i5] = java.lang.Integer.TYPE;
                        clsArr4[1] = java.lang.Integer.TYPE;
                        obj5 = cls4.getMethod(str6, clsArr4);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj5);
                    } else {
                        c2 = 2;
                    }
                    cArr6[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj5).invoke(null, objArr7)).charValue();
                    cArr5[intValue2] = getwalletdata.values;
                    cArr7[getwalletdata.writeReplace] = (char) ((((int) (writeReplace ^ 1263759066225628708L)) ^ ((cArr5[intValue2] ^ cArr4[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L))) ^ ((char) (values ^ 1263759066225628708L)));
                    getwalletdata.writeReplace++;
                    obj = null;
                    i5 = 0;
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
            getProfileVersion = 0;
            SdkCoreBusinessLogicModuleImpl = 1;
            valueOf = 1263759066225628708L;
            writeReplace = -804334044;
            values = (char) 61089;
            IccPrivateKeyCrtComponentsJson = (char) 14077;
            RecordsJson = (char) 59032;
            SdkCoreAlternateContactlessPaymentDataImpl = (char) 36213;
            getAid = (char) 5404;
        }

        static void init$1() {
            $$d = new byte[]{1, 58, com.google.common.base.Ascii.FF, Byte.MIN_VALUE};
            $$e = 92;
        }

        static void init$0() {
            $$a = new byte[]{com.visa.cbp.getEncExpo.IResultReceiver2, 75, 70, 2, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1};
            $$b = 99;
        }

        public static java.lang.Object[] values(android.content.Context context, int i, int i2) {
            int i3;
            java.lang.Object[] objArr;
            int i4;
            java.lang.Object invoke;
            try {
                if (context == null) {
                    java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((-269564167) | r1) * 494) - 368041656) + (((~((~i) | 653182569)) | (-840564487)) * 494))};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2712 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.green(0));
                        byte b = $$a[14];
                        byte b2 = (byte) (b - 1);
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a(b2, b2, (byte) (-b), objArr4);
                        obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                    }
                    ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                    return objArr2;
                }
                try {
                    char c = (char) (0 - (~(-(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)))));
                    try {
                        int i5 = -android.graphics.Color.rgb(0, 0, 0);
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b("ᇆ葀兼篲", c, "\ua8dc鎃羦\ud8e9볟쑔먕긐㲺䨉瘾兡꣮纼栥\uf1deꞴ貟˙擙맳㛚䅂ၴ導Ꮙ鵨繝蝄\u180e杠赡燬峨䵬ꠥ㤿哷", "\u0000\u0000\u0000\u0000", ((i5 | (-16777216)) << 1) - (i5 ^ (-16777216)), objArr5);
                        objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName((java.lang.String) objArr5[0]), 2);
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        c("㍥諯䫅₦㏞\ue049ࠊ㹜雇䁋ೃ視锆䙡㑵뫙犯ꝿ䫅₦㏞\ue049ࠊ㹜雇䁋왧㔺\ufdedꢿ媏嬥", 30 - android.view.MotionEvent.axisFromString(""), objArr6);
                        try {
                            java.lang.Object[] objArr7 = {(java.lang.String) objArr6[0]};
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b("ᇆ葀兼篲", (char) android.view.View.resolveSize(0, 0), "\ua8dc鎃羦\ud8e9볟쑔먕긐㲺䨉瘾兡꣮纼栥\uf1deꞴ貟˙擙맳㛚䅂ၴ導Ꮙ鵨繝蝄\u180e杠赡燬峨䵬ꠥ㤿哷", "\u0000\u0000\u0000\u0000", android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr8);
                            objArr[0] = java.lang.Class.forName((java.lang.String) objArr8[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                            char indexOf = (char) (9181 - android.text.TextUtils.indexOf("", "", 0, 0));
                            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i6 = (packedPositionType * 881) + 2068219449;
                            int i7 = ~packedPositionType;
                            int i8 = (~(i7 | 538789046)) | (~((i7 ^ i) | (i7 & i)));
                            int i9 = ~(538789046 | i);
                            int i10 = ((i8 & i9) | (i8 ^ i9)) * (-880);
                            int i11 = ((i6 | i10) << 1) - (i6 ^ i10);
                            i4 = ~i;
                            int i12 = ((~((i7 & i4) | (i7 ^ i4))) | (-538789047) | (~((packedPositionType ^ i) | (packedPositionType & i)))) * (-880);
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            b("䦚\ue2bb\udddf⌣", indexOf, "隼芎\uf695貮喙챑优狙딚Ⱍ鶃煮⺮瀮\uebcc㰕ꡔ鉓赏쩅䴷镘偪ꥆ孑㺥ᓺ핰❟Ფ⮛", "\u0000\u0000\u0000\u0000", (i11 ^ i12) + ((i12 & i11) << 1) + ((~(packedPositionType | i)) * 880), objArr9);
                            try {
                                java.lang.Object[] objArr10 = {(java.lang.String) objArr9[0]};
                                java.lang.Object[] objArr11 = new java.lang.Object[1];
                                b("ᇆ葀兼篲", (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "\ua8dc鎃羦\ud8e9볟쑔먕긐㲺䨉瘾兡꣮纼栥\uf1deꞴ貟˙擙맳㛚䅂ၴ導Ꮙ鵨繝蝄\u180e杠赡燬峨䵬ꠥ㤿哷", "\u0000\u0000\u0000\u0000", 0 - (~(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr11);
                                objArr[1] = java.lang.Class.forName((java.lang.String) objArr11[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                                try {
                                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                                    b("둎럽\uedc2펋", (char) android.text.TextUtils.getOffsetAfter("", 0), "ᢙ滥堲ꭞ\uea07\uefb4╍\udff2黬鑬ᝋ쬱⾕▇ಣ㘈\uf18e픺苃ᙺ㎈嵠측", "\u0000\u0000\u0000\u0000", (-1028129357) - (~(android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr12);
                                    java.lang.Class<?> cls2 = java.lang.Class.forName((java.lang.String) objArr12[0]);
                                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                                    c("Ӓൿ棹怊礢ꉞ㎄볷Ӓൿ谁䚨Ⱉ㶧Ӓൿ㮔孃", 16 - (~(-android.graphics.Color.alpha(0))), objArr13);
                                    invoke = cls2.getMethod((java.lang.String) objArr13[0], null).invoke(context, null);
                                } catch (java.lang.Throwable th) {
                                    java.lang.Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                java.lang.Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } catch (java.lang.Throwable th3) {
                            java.lang.Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                } catch (java.lang.Throwable unused2) {
                    i3 = 1;
                }
                try {
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    b("둎럽\uedc2펋", (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), "ᢙ滥堲ꭞ\uea07\uefb4╍\udff2黬鑬ᝋ쬱⾕▇ಣ㘈\uf18e픺苃ᙺ㎈嵠측", "\u0000\u0000\u0000\u0000", (-1028129357) - (~(-android.view.View.combineMeasuredStates(0, 0))), objArr14);
                    java.lang.Class<?> cls3 = java.lang.Class.forName((java.lang.String) objArr14[0]);
                    int i13 = -(android.view.KeyEvent.getMaxKeyCode() >> 16);
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    b("簀뽝\uf834\ue641", (char) ((i13 & 16888) + (i13 | 16888)), "㱢쪲ᡃ렝頄霫ꫛ찇\ufae7눕䕻簅⌠⯝", "\u0000\u0000\u0000\u0000", android.view.ViewConfiguration.getTapTimeout() >> 16, objArr15);
                    try {
                        java.lang.Object[] objArr16 = {cls3.getMethod((java.lang.String) objArr15[0], null).invoke(context, null), 64};
                        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        int i14 = lastIndexOf * (-518);
                        int i15 = (i14 ^ (-518)) + ((i14 & (-518)) << 1);
                        int i16 = ~lastIndexOf;
                        int i17 = ~(i16 | i4);
                        int i18 = -(-(((i17 & 1) | (i17 ^ 1)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE));
                        int i19 = (i16 ^ i4) | (i16 & i4);
                        int i20 = lastIndexOf | 1;
                        int i21 = ((((i15 | i18) << 1) - (i15 ^ i18)) - (~(-(-(((~((i19 ^ 1) | (i19 & 1))) | (~((i20 & i) | (i20 ^ i)))) * (-519)))))) - 1;
                        int i22 = ~(i | 1);
                        int i23 = ((i22 ^ lastIndexOf) | (i22 & lastIndexOf)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE;
                        int i24 = -android.text.TextUtils.indexOf("", "");
                        int i25 = i24 * 755;
                        int i26 = (((-1881945895) | i25) << 1) - (i25 ^ (-1881945895));
                        int i27 = ~i24;
                        int i28 = (i27 ^ 1382820759) | (i27 & 1382820759);
                        int i29 = ~i28;
                        int i30 = ~(i27 | i);
                        int i31 = (i29 ^ i30) | (i29 & i30);
                        int i32 = ~((i ^ 1382820759) | (i & 1382820759));
                        int i33 = -(-(((i31 ^ i32) | (i31 & i32)) * (-754)));
                        int i34 = ((i26 | i33) << 1) - (i33 ^ i26);
                        int i35 = i24 | i4;
                        int i36 = -(-(((~((i35 ^ 1382820759) | (i35 & 1382820759))) | (~(i28 | i))) * (-754)));
                        int i37 = (i34 & i36) + (i36 | i34);
                        int i38 = -(-((i27 | i4) * 754));
                        java.lang.Object[] objArr17 = new java.lang.Object[1];
                        b("韏氫\uda52\udaa6", (char) (((i21 | i23) << 1) - (i21 ^ i23)), "栗㨨Ⱔ㘃岣鲢◑Ẇ窤떩䢧س窟劧ᬆ\ue4dfꥻ鐀곓퐷쟵ꮼ낟䃀생ꖃ㙌ﭛ痓閂찜‼\ue2a9", "\u0000\u0000\u0000\u0000", ((i37 | i38) << 1) - (i38 ^ i37), objArr17);
                        java.lang.Class<?> cls4 = java.lang.Class.forName((java.lang.String) objArr17[0]);
                        int i39 = -(android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        int i40 = ~i39;
                        int i41 = (i40 ^ i4) | (i40 & i4);
                        int i42 = (i39 * (-432)) + 6510 + ((~((i41 & 15) | (i41 ^ 15))) * 433);
                        int i43 = ~(i | (-16));
                        int i44 = ((i43 & i40) | (i40 ^ i43)) * (-433);
                        int i45 = ((i42 | i44) << 1) - (i44 ^ i42);
                        int i46 = ~((i40 & i) | (i40 ^ i));
                        int i47 = ~((i39 ^ 15) | (i39 & 15));
                        int i48 = ((i47 ^ i46) | (i47 & i46)) * 433;
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        c("Ӓൿ棹怊礢ꉞ㎄볷Ӓൿ\udf5c뎏詰㶮", ((i45 | i48) << 1) - (i48 ^ i45), objArr18);
                        java.lang.Object invoke2 = cls4.getMethod((java.lang.String) objArr18[0], java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        b("耲\uefba֖뜀", (char) (5 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "趠㡜፠划枍䧨\uec1fᮐ揧㢱킗楢䜞Ƭ苁賰궁ޒ葷丼⬃ﴈ饢㷿쵓\uf5dd\udeda癕\uebfb엑", "\u0000\u0000\u0000\u0000", android.view.View.getDefaultSize(0, 0), objArr19);
                        java.lang.Class<?> cls5 = java.lang.Class.forName((java.lang.String) objArr19[0]);
                        int i49 = -(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i50 = i49 * 306;
                        int i51 = (((i50 | androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS) << 1) - (i50 ^ androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS)) + 3366;
                        int i52 = ~((i49 ^ 11) | (i49 & 11));
                        int i53 = ~(i49 | i);
                        int i54 = ((i52 ^ i53) | (i52 & i53)) * 305;
                        int i55 = ~((i49 ^ i4) | (i49 & i4));
                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                        c("댤␕ਢ㋐쿃죶ꌷ㗶䙩樬", (((i51 & i54) + (i54 | i51)) - (~(-(-(((i55 ^ (-12)) | (i55 & (-12))) * 305))))) - 1, objArr20);
                        java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField((java.lang.String) objArr20[0]).get(invoke2);
                        int length = objArr21.length;
                        int i56 = 0;
                        while (i56 < length) {
                            java.lang.Object obj2 = objArr21[i56];
                            int i57 = -android.view.KeyEvent.keyCodeFromString("");
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            c("ﬨ\ue3ad霆ﵱ瓌꾞", ((i57 | 5) << 1) - (i57 ^ 5), objArr22);
                            try {
                                java.lang.Object[] objArr23 = {(java.lang.String) objArr22[0]};
                                int i58 = -(-(android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                                java.lang.Object[] objArr24 = new java.lang.Object[1];
                                c("泖\uda11켦篦게钣鑧ꡔꌷ㗶\uf4ae炱ᛔ龯휀쫗⎧飐狧섕폵伉\udff7ᧀ鮭\uf873珛᠊ৡאּ댉ꆵ⣍ब㢵怚錷Ʒ", (i58 ^ 36) + ((i58 & 36) << 1), objArr24);
                                java.lang.Class<?> cls6 = java.lang.Class.forName((java.lang.String) objArr24[0]);
                                int i59 = -android.text.TextUtils.indexOf("", "", 0, 0);
                                int i60 = i59 * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE;
                                int i61 = ~i59;
                                int i62 = ~((i61 & (-12)) | (i61 ^ (-12)));
                                int i63 = (i4 ^ i59) | (i4 & i59);
                                int i64 = ~((i63 ^ 11) | (i63 & 11));
                                java.lang.Object[] objArr25 = objArr21;
                                int i65 = ~((i4 ^ 11) | (i4 & 11));
                                int i66 = length;
                                int i67 = ((((i60 ^ (-2409)) + ((i60 & (-2409)) << 1)) + (((i62 ^ i64) | (i62 & i64)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE)) - (~(-(-(((i65 & i59) | (i59 ^ i65)) * (-440)))))) - 1;
                                int i68 = ((i59 ^ 11) | (i59 & 11) | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                c("Ӓൿ\uef5d厴볼摿\u001dኋꍾ䓛溜撂", (i67 & i68) + (i68 | i67), objArr26);
                                java.lang.Object invoke3 = cls6.getMethod((java.lang.String) objArr26[0], java.lang.String.class).invoke(null, objArr23);
                                try {
                                    int i69 = -(android.os.Process.myTid() >> 22);
                                    int i70 = i69 * 714;
                                    int i71 = ((-11635504) & i70) + (i70 | (-11635504));
                                    int i72 = ~i69;
                                    int i73 = (~((i72 & i4) | (i72 ^ i4))) | (~((i72 ^ 16342) | (i72 & 16342)));
                                    int i74 = ~(i69 | (-16343) | i);
                                    int i75 = -(-(((i73 & i74) | (i73 ^ i74)) * (-713)));
                                    int i76 = (i71 ^ i75) + ((i75 & i71) << 1);
                                    int i77 = i74 * 1426;
                                    int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                                    int i79 = -(-((~(i4 | (-16343))) * 713));
                                    char c2 = (char) ((i78 & i79) + (i79 | i78));
                                    int i80 = -(-android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    b("쉎䠔홨밿", c2, "츎囤ㆷ嵺鯤闎⳺䗿肛훀≲\ue548ত轫⾆븼쮸㟹\uede4룲\ue188艥碜妚陋䶉믘濶", "\u0000\u0000\u0000\u0000", ((i80 | 1) << 1) - (i80 ^ 1), objArr27);
                                    java.lang.Class<?> cls7 = java.lang.Class.forName((java.lang.String) objArr27[0]);
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    c("沚蒴\uf4c4\ue31aৡאּᮺڄꝅᏽ錷Ʒ", 10 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr28);
                                    try {
                                        java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod((java.lang.String) objArr28[0], null).invoke(obj2, null))};
                                        int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop() >> 8;
                                        int i81 = (windowTouchSlop * (-432)) + 16058;
                                        int i82 = ~windowTouchSlop;
                                        int i83 = (i82 ^ i4) | (i82 & i4);
                                        int i84 = (~((i83 ^ 37) | (i83 & 37))) * 433;
                                        int i85 = (i81 & i84) + (i81 | i84);
                                        int i86 = ~(i | (-38));
                                        int i87 = ((i86 ^ i82) | (i86 & i82)) * (-433);
                                        int i88 = (i85 & i87) + (i87 | i85);
                                        int i89 = ~(i82 | i);
                                        int i90 = ~((windowTouchSlop ^ 37) | (windowTouchSlop & 37));
                                        int i91 = ((i90 ^ i89) | (i90 & i89)) * 433;
                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                        c("泖\uda11켦篦게钣鑧ꡔꌷ㗶\uf4ae炱ᛔ龯휀쫗⎧飐狧섕폵伉\udff7ᧀ鮭\uf873珛᠊ৡאּ댉ꆵ⣍ब㢵怚錷Ʒ", (i88 ^ i91) + ((i91 & i88) << 1), objArr30);
                                        java.lang.Class<?> cls8 = java.lang.Class.forName((java.lang.String) objArr30[0]);
                                        int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                                        int i92 = (i ^ 19) | (i & 19);
                                        int i93 = ~packedPositionGroup;
                                        int i94 = (packedPositionGroup * 628) + 11932 + (((i92 & i93) | (i92 ^ i93)) * (-627));
                                        int i95 = ~((i & (-20)) | (i ^ (-20)));
                                        int i96 = -(-(((i95 ^ packedPositionGroup) | (i95 & packedPositionGroup)) * (-627)));
                                        int i97 = ~(i4 | 19);
                                        int i98 = ~(packedPositionGroup | i);
                                        java.lang.Object[] objArr31 = new java.lang.Object[1];
                                        c("Ӓൿ꿩☺ꝅᏽৡאּ齢ꊊ⎧飐䅽㋆匏莆쿃죶溜撂", (((i94 ^ i96) + ((i96 & i94) << 1)) - (~(-(-(((i98 ^ i97) | (i98 & i97)) * 627))))) - 1, objArr31);
                                        java.lang.Object invoke4 = cls8.getMethod((java.lang.String) objArr31[0], java.io.InputStream.class).invoke(invoke3, objArr29);
                                        int length2 = objArr.length;
                                        int i99 = 0;
                                        while (i99 < 2) {
                                            java.lang.Object obj3 = objArr[i99];
                                            try {
                                                int green = android.graphics.Color.green(0);
                                                int i100 = green * 465;
                                                int i101 = (i100 ^ (-15742)) + ((i100 & (-15742)) << 1);
                                                int i102 = ~((i4 ^ (-35)) | (i4 & (-35)));
                                                int i103 = ~((green ^ (-35)) | (green & (-35)));
                                                int i104 = (i102 & i103) | (i102 ^ i103);
                                                int i105 = ~((i4 ^ green) | (i4 & green));
                                                int i106 = -(-(((i104 & i105) | (i104 ^ i105)) * 464));
                                                int i107 = (i101 & i106) + (i106 | i101);
                                                int i108 = (~green) | i;
                                                int i109 = ((i108 ^ (-35)) | (i108 & (-35))) * (-464);
                                                int i110 = ((i107 | i109) << 1) - (i109 ^ i107);
                                                int i111 = ~((green & i) | (green ^ i));
                                                int i112 = -(-(((i111 ^ i103) | (i111 & i103)) * 464));
                                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                c("泖\uda11켦篦게钣鑧ꡔꌷ㗶\uf4ae炱ᛔ龯휀쫗⎧飐绥鴻霆ﵱ\u0c45煐폵伉\udff7ᧀ鮭\uf873珛᠊ৡאּ", ((i110 | i112) << 1) - (i112 ^ i110), objArr32);
                                                java.lang.Class<?> cls9 = java.lang.Class.forName((java.lang.String) objArr32[0]);
                                                char resolveOpacity = (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0);
                                                int i113 = -android.view.View.resolveSizeAndState(0, 0, 0);
                                                int i114 = (i113 * (-103)) + 488391714;
                                                int i115 = ~((~i113) | (-1162822259));
                                                int i116 = ~((-1162822259) | i);
                                                int i117 = -(-(((i115 ^ i116) | (i115 & i116)) * 104));
                                                int i118 = (i114 & i117) + (i114 | i117);
                                                int i119 = (i4 ^ i113) | (i4 & i113);
                                                int i120 = (~((i119 & 1162822258) | (1162822258 ^ i119))) * (-104);
                                                java.lang.Object[] objArr33 = objArr;
                                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                                b("牉佂\uf245ﲽ", resolveOpacity, "釜ሻ\ud876唥面募樼䗛鐝\ueb3b䛛ฟ牸삯渎烎\u1afa\ue105㰬곹㢪ᬐ牉", "\u0000\u0000\u0000\u0000", (((i118 & i120) + (i120 | i118)) - (~(-(-(((i113 & i) | (i113 ^ i)) * 104))))) - 1, objArr34);
                                                if (obj3.equals(cls9.getMethod((java.lang.String) objArr34[0], null).invoke(invoke4, null))) {
                                                    java.lang.Object[] objArr35 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                    try {
                                                        java.lang.Object[] objArr36 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((-50435073) | i) * (-381)) - 143576984) + (((~(951872468 | i4)) | (-999686097)) * 381) + 2035893248)};
                                                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                        if (obj4 == null) {
                                                            java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 50, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 2713, (char) android.text.TextUtils.indexOf("", ""));
                                                            byte b3 = $$a[14];
                                                            byte b4 = (byte) (b3 - 1);
                                                            java.lang.Object[] objArr37 = new java.lang.Object[1];
                                                            a(b4, b4, (byte) (-b3), objArr37);
                                                            obj4 = cls10.getMethod((java.lang.String) objArr37[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                        }
                                                        ((int[]) objArr35[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr36)).intValue();
                                                        return objArr35;
                                                    } catch (java.lang.Throwable th4) {
                                                        java.lang.Throwable cause4 = th4.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                                i99++;
                                                objArr = objArr33;
                                            } catch (java.lang.Throwable th5) {
                                                java.lang.Throwable cause5 = th5.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th5;
                                            }
                                        }
                                        i56 = (i56 ^ 1) + ((i56 & 1) << 1);
                                        objArr21 = objArr25;
                                        length = i66;
                                        objArr = objArr;
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
                        i3 = 1;
                        int[] iArr = new int[i3];
                        int[] iArr2 = new int[i3];
                        iArr[0] = i;
                        iArr2[0] = i;
                        java.lang.Object[] objArr38 = {iArr, iArr2, null, new int[i3]};
                        java.lang.Object[] objArr39 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(155940531 | i)) | 848988453) * 56) + 968227032 + (((~((~i) | 848988453)) | 155940531) * 56))};
                        java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                        if (obj5 == null) {
                            java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2713, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                            byte b5 = $$a[14];
                            byte b6 = (byte) (b5 - 1);
                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                            a(b6, b6, (byte) (-b5), objArr40);
                            obj5 = cls11.getMethod((java.lang.String) objArr40[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                        }
                        ((int[]) objArr38[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr39)).intValue();
                        return objArr38;
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
    }
}
