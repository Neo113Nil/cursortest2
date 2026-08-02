package com.payair.hce;

/* loaded from: classes4.dex */
public final class setUserValidationRequestListener extends com.payair.hce.isLvtAllowed {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static long SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getCvrMaskAnd;
    private static int getProfileVersion;
    private static char[] valueOf;
    private static long writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = $$d;
        int i5 = b + 4;
        int i6 = (i * 2) + 1;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = i5;
            i4 = 0;
            i5 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i3];
            i5 += i7;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            int i8 = (b2 * 2) + 99;
            i2 = 0;
            i3 = i5;
            i5 = i8;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        char[] cArr;
        int i4;
        int i5 = ~i;
        int i6 = ~i3;
        int i7 = (i * 302) + (i2 * 603) + (((~(i5 | i6)) | i2) * (-602)) + (((~(i | i6 | i2)) | (~(i3 | i5)) | (~(i5 | (~i2)))) * (-301)) + ((~(i6 | i2)) * 301);
        int i8 = 1;
        if (i7 != 1) {
            return values(objArr);
        }
        int intValue = ((java.lang.Number) objArr[0]).intValue();
        char charValue = ((java.lang.Character) objArr[1]).charValue();
        int intValue2 = ((java.lang.Number) objArr[2]).intValue();
        int i9 = RecordsJson + 39;
        getProfileVersion = i9 % 128;
        if (i9 % 2 == 0) {
            cArr = new char[intValue];
        } else {
            int i10 = getAid + 23;
            getCvrMaskAnd = i10 % 128;
            int i11 = i10 % 2;
            cArr = new char[intValue];
            i8 = 0;
        }
        while (i8 < intValue) {
            int i12 = getCvrMaskAnd;
            int i13 = i12 + 43;
            int i14 = i13 % 128;
            getAid = i14;
            if (i13 % 2 != 0) {
                int i15 = getProfileVersion % 101;
                RecordsJson = i15 + 26455;
                if (i15 % 3 != 0) {
                    int i16 = (i14 + 81) % 128;
                    getCvrMaskAnd = i16;
                    cArr[i8] = (char) ((valueOf[intValue2 / i8] ^ (i8 ^ writeReplace)) - charValue);
                    i8 += 119;
                    i4 = i16 + 53;
                    getAid = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i17 = 3 / 3;
                    }
                } else {
                    getAid = (i12 + 31) % 128;
                    cArr[i8] = (char) ((valueOf[intValue2 + i8] ^ (i8 * writeReplace)) ^ charValue);
                    i8++;
                }
            } else {
                int i18 = getProfileVersion + 7;
                RecordsJson = i18 % 128;
                if (i18 % 2 != 0) {
                    int i162 = (i14 + 81) % 128;
                    getCvrMaskAnd = i162;
                    cArr[i8] = (char) ((valueOf[intValue2 / i8] ^ (i8 ^ writeReplace)) - charValue);
                    i8 += 119;
                    i4 = i162 + 53;
                    getAid = i4 % 128;
                    if (i4 % 2 == 0) {
                    }
                } else {
                    getAid = (i12 + 31) % 128;
                    cArr[i8] = (char) ((valueOf[intValue2 + i8] ^ (i8 * writeReplace)) ^ charValue);
                    i8++;
                }
            }
        }
        return new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        com.payair.hce.setUserValidationRequestListener.getCvrMaskAnd = (r0 + 43) % 128;
        r0 = r0 + 45;
        com.payair.hce.setUserValidationRequestListener.getCvrMaskAnd = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if ((r1 + 3) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        throw null;
     */
    @Override // com.payair.hce.isLvtAllowed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void valueOf() {
        int i = getProfileVersion + 85;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            getAid = (getCvrMaskAnd + 17) % 128;
        } else {
            getCvrMaskAnd = (getAid + 67) % 128;
        }
        super.valueOf();
        int i2 = getAid;
        int i3 = i2 + 79;
        getCvrMaskAnd = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = getProfileVersion << 57;
            RecordsJson = i4 * 28248;
        } else {
            int i5 = getProfileVersion + 13;
            RecordsJson = i5 % 128;
        }
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ void values() {
        int i = RecordsJson + 45;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            getCvrMaskAnd = (getAid + 83) % 128;
            super.values();
        } else {
            getAid = (getCvrMaskAnd + 73) % 128;
            super.values();
            throw null;
        }
    }

    @Override // com.payair.hce.isLvtAllowed
    public final /* synthetic */ boolean writeReplace() {
        int i = getCvrMaskAnd;
        int i2 = (i + 69) % 128;
        getAid = i2;
        int i3 = RecordsJson + 31;
        getProfileVersion = i3 % 128;
        if (i3 % 2 == 0) {
            getAid = (i + 21) % 128;
            super.writeReplace();
            throw null;
        }
        getCvrMaskAnd = (i2 + 53) % 128;
        getCvrMaskAnd = (i2 + 11) % 128;
        boolean writeReplace2 = super.writeReplace();
        int i4 = getProfileVersion + 101;
        RecordsJson = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        int i5 = getAid + 23;
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 != 0) {
            return writeReplace2;
        }
        throw null;
    }

    public setUserValidationRequestListener(com.payair.hce.onGetCertOperationUnsuccessful ongetcertoperationunsuccessful) {
        super(ongetcertoperationunsuccessful);
    }

    /* renamed from: com.payair.hce.setUserValidationRequestListener$2, reason: invalid class name */
    public final class AnonymousClass2 implements com.payair.hce.getNetworkTokenReference {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long IccPrivateKeyCrtComponentsJson;
        private static int SdkCoreAlternateContactlessPaymentDataImpl;
        private static int getAid;
        private static char values;
        private static char[] writeReplace;
        private /* synthetic */ byte[] AlternateContactlessPaymentDataJson;
        private /* synthetic */ java.lang.String DigitizedCardProfile;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
            int i3;
            int i4;
            int i5 = (s * 2) + 1;
            int i6 = 37 - (i2 * 34);
            int i7 = 718 - i;
            byte[] bArr = $$a;
            char[] cArr = new char[i5];
            if (bArr == null) {
                i7 = i5;
                int i8 = i6;
                i4 = 0;
                i7 = (i7 + i6) - 2;
                i6 = i8;
                i3 = i4;
                i4 = i3 + 1;
                int i9 = i6 + 1;
                cArr[i3] = (char) i7;
                if (i4 == i5) {
                    objArr[0] = new java.lang.String(cArr);
                    return;
                }
                i8 = i9;
                i6 = bArr[i9];
                i7 = (i7 + i6) - 2;
                i6 = i8;
                i3 = i4;
                i4 = i3 + 1;
                int i92 = i6 + 1;
                cArr[i3] = (char) i7;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                i4 = i3 + 1;
                int i922 = i6 + 1;
                cArr[i3] = (char) i7;
                if (i4 == i5) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
            int i2;
            byte[] bArr = $$d;
            int i3 = b + 65;
            int i4 = (b2 * 3) + 4;
            int i5 = i * 2;
            byte[] bArr2 = new byte[i5 + 1];
            if (bArr == null) {
                int i6 = i5;
                i3 = i4;
                i2 = 0;
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i2++;
                i6 = bArr[i4];
                i4++;
                i3 += -i6;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i3;
                if (i2 == i5) {
                }
            }
        }

        private static void c(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = $11 + 111;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.getDsrpData getdsrpdata = new com.payair.hce.getDsrpData();
            getdsrpdata.values = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < charArray.length) {
                int i3 = getdsrpdata.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(charArray[getdsrpdata.valueOf]), getdsrpdata, getdsrpdata};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2053068265);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 31, 1890 - android.text.TextUtils.getCapsMode("", 0, 0), (char) (3599 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (byte) 48, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2053068265, obj);
                    }
                    jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue() ^ (IccPrivateKeyCrtComponentsJson ^ (-4761752123935132024L));
                    java.lang.Object[] objArr4 = {getdsrpdata, getdsrpdata};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.resolveSize(0, 0), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1443, (char) (android.graphics.Color.alpha(0) + 29682));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        d(0, (byte) 47, (byte) 0, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj2);
                    }
                    ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
                    $10 = ($11 + 17) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[length];
            getdsrpdata.valueOf = 0;
            while (getdsrpdata.valueOf < charArray.length) {
                cArr[getdsrpdata.valueOf] = (char) jArr[getdsrpdata.valueOf];
                java.lang.Object[] objArr6 = {getdsrpdata, getdsrpdata};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-737688135);
                if (obj3 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(64 - android.view.View.combineMeasuredStates(0, 0), android.graphics.Color.blue(0) + 1443, (char) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 29682));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, (byte) 47, (byte) 0, objArr7);
                    obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-737688135, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
            }
            objArr[0] = new java.lang.String(cArr);
        }

        AnonymousClass2(java.lang.String str, byte[] bArr) {
            this.DigitizedCardProfile = str;
            this.AlternateContactlessPaymentDataJson = bArr;
        }

        @Override // com.payair.hce.getNetworkTokenReference
        public final java.lang.String DigitizedCardProfile() {
            int i = SdkCoreAlternateContactlessPaymentDataImpl + 21;
            getAid = i % 128;
            java.lang.String str = this.DigitizedCardProfile;
            if (i % 2 != 0) {
                return str;
            }
            throw new java.lang.ArithmeticException();
        }

        @Override // com.payair.hce.getNetworkTokenReference
        public final byte[] AlternateContactlessPaymentDataJson() {
            int i = SdkCoreAlternateContactlessPaymentDataImpl;
            getAid = (i + 21) % 128;
            byte[] bArr = this.AlternateContactlessPaymentDataJson;
            int i2 = i + 101;
            getAid = i2 % 128;
            if (i2 % 2 != 0) {
                return bArr;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
        
            if (r2.valueOf == r2.writeReplace) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0155, code lost:
        
            r13 = new java.lang.Object[13];
            r13[12] = r2;
            r13[11] = java.lang.Integer.valueOf(r5);
            r13[10] = r2;
            r13[9] = r2;
            r13[8] = java.lang.Integer.valueOf(r5);
            r13[7] = r2;
            r13[r10] = r2;
            r13[5] = java.lang.Integer.valueOf(r5);
            r13[4] = r2;
            r13[3] = r2;
            r13[2] = java.lang.Integer.valueOf(r5);
            r13[1] = r2;
            r13[0] = r2;
            r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01a0, code lost:
        
            if (r4 != null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x01a2, code lost:
        
            r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 29, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3597, (char) android.view.View.MeasureSpec.getMode(0));
            r11 = new java.lang.Class[13];
            r11[0] = java.lang.Object.class;
            r11[1] = java.lang.Object.class;
            r11[2] = java.lang.Integer.TYPE;
            r11[3] = java.lang.Object.class;
            r11[4] = java.lang.Object.class;
            r11[5] = java.lang.Integer.TYPE;
            r11[r10] = java.lang.Object.class;
            r11[7] = java.lang.Object.class;
            r11[8] = java.lang.Integer.TYPE;
            r11[9] = java.lang.Object.class;
            r11[10] = java.lang.Object.class;
            r11[11] = java.lang.Integer.TYPE;
            r11[12] = java.lang.Object.class;
            r4 = r4.getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, r11);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x021a, code lost:
        
            if (((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r13)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x021e, code lost:
        
            r11 = new java.lang.Object[11];
            r11[10] = r2;
            r11[9] = java.lang.Integer.valueOf(r5);
            r11[8] = r2;
            r11[7] = java.lang.Integer.valueOf(r5);
            r11[r10] = java.lang.Integer.valueOf(r5);
            r11[5] = r2;
            r11[4] = r2;
            r11[3] = java.lang.Integer.valueOf(r5);
            r11[2] = java.lang.Integer.valueOf(r5);
            r11[1] = r2;
            r11[0] = r2;
            r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x025b, code lost:
        
            if (r4 != null) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x025d, code lost:
        
            r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(47 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 2665 - (android.os.Process.myPid() >> 22), (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 18889));
            r14 = new java.lang.Object[1];
            d(0, (byte) 8, (byte) 0, r14);
            r13 = (java.lang.String) r14[0];
            r14 = new java.lang.Class[11];
            r14[0] = java.lang.Object.class;
            r14[1] = java.lang.Object.class;
            r14[2] = java.lang.Integer.TYPE;
            r14[3] = java.lang.Integer.TYPE;
            r14[4] = java.lang.Object.class;
            r14[5] = java.lang.Object.class;
            r14[r10] = java.lang.Integer.TYPE;
            r14[7] = java.lang.Integer.TYPE;
            r14[8] = java.lang.Object.class;
            r14[9] = java.lang.Integer.TYPE;
            r14[10] = java.lang.Object.class;
            r4 = r4.getMethod(r13, r14);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x02c9, code lost:
        
            r13 = null;
            r4 = ((java.lang.Integer) ((java.lang.reflect.Method) r4).invoke(null, r11)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x02d6, code lost:
        
            r11 = r2.AlternateContactlessPaymentDataJson;
            r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
            r8[r2.values] = r3[r4];
            r8[r2.values + 1] = r3[(r11 * r5) + r14];
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0332, code lost:
        
            r2.values += 2;
            r4 = r13;
            r10 = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x02ea, code lost:
        
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x02ef, code lost:
        
            if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x02f1, code lost:
        
            r2.RecordsJson = ((r2.RecordsJson + r5) - 1) % r5;
            r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r5) - 1) % r5;
            r4 = r2.DigitizedCardProfile;
            r11 = r2.RecordsJson;
            r14 = r2.AlternateContactlessPaymentDataJson;
            r15 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
            r8[r2.values] = r3[(r4 * r5) + r11];
            r8[r2.values + 1] = r3[(r14 * r5) + r15];
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0319, code lost:
        
            r4 = r2.DigitizedCardProfile;
            r10 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
            r11 = r2.AlternateContactlessPaymentDataJson;
            r14 = r2.RecordsJson;
            r8[r2.values] = r3[(r4 * r5) + r10];
            r8[r2.values + 1] = r3[(r11 * r5) + r14];
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
        
            r8[r2.values] = (char) (r2.valueOf - r25);
            r8[r2.values + 1] = (char) (r2.writeReplace - r25);
            com.payair.hce.setUserValidationRequestListener.AnonymousClass2.$10 = (com.payair.hce.setUserValidationRequestListener.AnonymousClass2.$11 + 37) % 128;
            r13 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0133, code lost:
        
            if (r2.valueOf == r2.writeReplace) goto L37;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
            int i2;
            $10 = ($11 + 89) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
            char[] cArr = writeReplace;
            java.lang.Object obj = null;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i3])};
                        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                        if (obj2 == null) {
                            java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 2508 - android.view.View.combineMeasuredStates(0, 0), (char) (6802 - android.view.View.MeasureSpec.getSize(0)));
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            d(0, (byte) 0, (byte) 0, objArr3);
                            obj2 = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
                        }
                        cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr2)).charValue();
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(values)};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
            char c = 6;
            if (obj3 == null) {
                java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777167) - android.graphics.Color.rgb(0, 0, 0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2508, (char) (6802 - ((android.os.Process.getThreadPriority(0) + 20) >> 6)));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                d(0, (byte) 0, (byte) 0, objArr5);
                obj3 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj3);
            }
            char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                digitizedCardJson12.values = 0;
                while (digitizedCardJson12.values < i2) {
                    int i4 = $10 + 17;
                    $11 = i4 % 128;
                    if (i4 % 2 == 0) {
                        digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                        digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values >> 1];
                    } else {
                        digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                        digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                    }
                }
            }
            for (int i5 = 0; i5 < i; i5++) {
                $10 = ($11 + 25) % 128;
                cArr3[i5] = (char) (cArr3[i5] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            SdkCoreAlternateContactlessPaymentDataImpl = 0;
            getAid = 1;
            writeReplace = new char[]{12344, 12332, 12320, 12311, 12345, 12349, 12331, 12321, 12326, 12324, 12325, 12348, 12346, 12388, 12328, 12410, 12333, 12351, 12305, 12350, 12403, 12389, 12409, 12334, 12309, 12385, 12329, 12323, 12322, 12347, 12335, 12338, 12339, 12327, 12336, 12391};
            values = (char) 1494;
            IccPrivateKeyCrtComponentsJson = -9042155754785387123L;
        }

        static void init$1() {
            $$d = new byte[]{com.google.common.base.Ascii.SI, -31, 80, -73};
            $$e = 50;
        }

        /* JADX WARN: Code restructure failed: missing block: B:210:0x1e41, code lost:
        
            if (((r3 & ((((((-19155371) | r10) * 1444) - 1153123274) + ((((~(709314218 | r62)) | (-728190891)) | (~(727912192 | r62))) * (-1444))) + 945275252)) | (((int) r13) & ((((((~((-1838244373) | r62)) | 746602496) | r5) * (-470)) + 1573595733) + ((r5 | (~((-1091641877) | r62))) * 470)))) == 0) goto L283;
         */
        /* JADX WARN: Code restructure failed: missing block: B:486:0x24d4, code lost:
        
            if (r7 == null) goto L353;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x05fc, code lost:
        
            if (((((int) r2) & (((((~(165548903 | r62)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1731284883) + ((1608416119 | r10) * (-216))) + (((~(165548903 | r10)) | (-1602775314)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))) | (((int) (r2 >> 32)) & (((((916584102 | r62) * (-50)) - 240520370) + (((~((-151521537) | r10)) | (~((-369120773) | r62))) * 50)) + ((((~((-520642309) | r10)) | 151521536) | (~(916584102 | r10))) * 50)))) != 477111747) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0824, code lost:
        
            if (((((int) (r6 >> 32)) & ((((((~(1870827037 | r62)) | 433600626) * (-668)) - 729286042) + (((~(433600626 | r62)) | 1870827037) * 1336)) + ((2145042047 | r62) * 668))) | (((int) r6) & ((((((~((-1860688258) | r10)) | 997052628) * (-602)) - 785548918) + ((((~((-1860688258) | r62)) | 711315584) | (~(2146425301 | r10))) * (-301))) + ((~(997052628 | r10)) * 301)))) == 542074309) goto L69;
         */
        /* JADX WARN: Removed duplicated region for block: B:103:0x11df  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x1321  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x1443 A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x153c A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:139:0x1620  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x1732 A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x183b A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:162:0x192c  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x1aec  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x1bf5  */
        /* JADX WARN: Removed duplicated region for block: B:194:0x1cbf A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:213:0x1fab  */
        /* JADX WARN: Removed duplicated region for block: B:220:0x207c  */
        /* JADX WARN: Removed duplicated region for block: B:549:0x1bf2 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:551:0x177c  */
        /* JADX WARN: Removed duplicated region for block: B:565:0x082c  */
        /* JADX WARN: Removed duplicated region for block: B:576:0x0a45 A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:580:0x094b  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0e28 A[Catch: all -> 0x3da0, TryCatch #0 {all -> 0x3da0, blocks: (B:3:0x0004, B:5:0x001c, B:6:0x005b, B:10:0x0128, B:12:0x0179, B:13:0x01c7, B:18:0x0200, B:22:0x0218, B:23:0x025d, B:32:0x02d9, B:34:0x02e9, B:35:0x0330, B:37:0x035a, B:39:0x036a, B:40:0x03b3, B:42:0x03bc, B:44:0x03da, B:45:0x0428, B:49:0x04ee, B:51:0x050c, B:52:0x055d, B:55:0x0600, B:57:0x061e, B:58:0x0671, B:62:0x0714, B:64:0x0732, B:65:0x0780, B:70:0x0e15, B:72:0x0e28, B:73:0x0e71, B:83:0x0edf, B:85:0x0ef2, B:86:0x0f3b, B:88:0x0f63, B:90:0x0f76, B:91:0x0fbd, B:93:0x0fc6, B:95:0x0fe4, B:96:0x1036, B:104:0x1205, B:106:0x1218, B:107:0x1267, B:120:0x133b, B:122:0x138f, B:123:0x13e8, B:128:0x1430, B:130:0x1443, B:131:0x1486, B:133:0x1529, B:135:0x153c, B:136:0x1587, B:144:0x164d, B:146:0x1696, B:147:0x16ed, B:151:0x171f, B:153:0x1732, B:154:0x177e, B:156:0x1828, B:158:0x183b, B:159:0x1885, B:167:0x1951, B:169:0x19b9, B:170:0x1a0d, B:177:0x1aee, B:179:0x1b01, B:180:0x1b4c, B:188:0x1c0e, B:190:0x1c53, B:191:0x1ca9, B:214:0x1fc4, B:216:0x200e, B:217:0x2066, B:221:0x2095, B:223:0x20a8, B:224:0x20f7, B:237:0x229d, B:239:0x22b0, B:240:0x22fc, B:248:0x23b0, B:250:0x23f2, B:251:0x244f, B:280:0x24f5, B:282:0x2557, B:283:0x25ad, B:287:0x25ee, B:289:0x2617, B:290:0x266e, B:294:0x2719, B:296:0x276b, B:297:0x27bf, B:300:0x27d5, B:302:0x27e4, B:303:0x2827, B:307:0x28db, B:309:0x2929, B:310:0x297c, B:314:0x2993, B:316:0x29ac, B:317:0x29f5, B:321:0x2a99, B:323:0x2adb, B:324:0x2b35, B:327:0x2b4b, B:329:0x2b5a, B:330:0x2b9d, B:334:0x2c4a, B:336:0x2c94, B:337:0x2cec, B:340:0x2d02, B:342:0x2d11, B:343:0x2d53, B:347:0x2dfb, B:349:0x2e3b, B:350:0x2e97, B:353:0x2ead, B:355:0x2ebc, B:356:0x2f00, B:360:0x2fc5, B:362:0x3014, B:363:0x306d, B:367:0x30a6, B:369:0x30d0, B:370:0x3125, B:374:0x31cd, B:376:0x3229, B:377:0x3282, B:381:0x32b1, B:383:0x32c4, B:384:0x3314, B:388:0x33ba, B:390:0x33fc, B:391:0x3454, B:394:0x346a, B:396:0x3479, B:397:0x34c5, B:401:0x356c, B:403:0x35bd, B:404:0x3619, B:407:0x362f, B:409:0x363e, B:410:0x3684, B:414:0x3723, B:416:0x3778, B:417:0x37ce, B:420:0x37e4, B:422:0x37f3, B:423:0x383c, B:427:0x38e1, B:429:0x3937, B:430:0x3990, B:433:0x39a6, B:435:0x39b5, B:436:0x39f7, B:444:0x3ab3, B:446:0x3b07, B:447:0x3b5e, B:449:0x3b73, B:451:0x3b86, B:452:0x3bd2, B:454:0x3bda, B:456:0x3c0a, B:457:0x3c64, B:462:0x3cd1, B:464:0x3d29, B:465:0x3d80, B:553:0x10c8, B:555:0x10e6, B:556:0x1133, B:566:0x084c, B:568:0x085f, B:569:0x08a6, B:574:0x09ff, B:576:0x0a45, B:577:0x0a9b, B:581:0x0967, B:583:0x097a, B:584:0x09c0), top: B:2:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0e7c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object[] DigitizedCardProfile$4956fc2a(int i, java.lang.Object obj) {
            long j;
            java.lang.String str;
            java.lang.Object obj2;
            java.lang.String str2;
            java.lang.String str3;
            long j2;
            int i2;
            java.lang.Object obj3;
            long j3;
            java.lang.Object obj4;
            java.lang.Object obj5;
            java.lang.String str4;
            long j4;
            java.lang.Object obj6;
            java.lang.String[] strArr;
            int i3;
            int i4;
            int i5;
            int i6;
            java.lang.Throwable th;
            java.io.BufferedInputStream bufferedInputStream;
            int i7;
            int i8;
            long j5;
            java.lang.Object invoke;
            int parseInt;
            java.lang.String[] strArr2;
            java.lang.String str5;
            int i9;
            int i10;
            java.lang.String str6;
            java.lang.Object obj7;
            java.lang.Object obj8;
            java.lang.String str7;
            java.lang.String str8;
            char c;
            int i11;
            java.lang.Object obj9;
            try {
                java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
                if (obj10 == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.KeyEvent.getMaxKeyCode() >> 16), 1839 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
                    byte b = $$a[14];
                    byte b2 = (byte) (b - 1);
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    a(b2, b2, b, objArr);
                    obj10 = cls.getMethod((java.lang.String) objArr[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj10);
                }
                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj10).invoke(null, null)).longValue();
                long j6 = i;
                long j7 = ~longValue;
                long j8 = ~j6;
                long j9 = (((-675) * longValue) - 172815369048L) + ((j6 | (-255266424) | j7) * (-676)) + (((~(j7 | (-255266424))) | (~(j8 | (-255266424)))) * 676) + (((~(j7 | j8)) | (~(255266423 | j7)) | (~(longValue | (-255266424) | j6))) * 676) + 1095345369;
                int i12 = ~i;
                if (((((int) j9) & ((((((~((-2079733228) | i12)) | 710292586) * 446) - 384374209) + (((~((-1369440642) | i)) | 67715072) * 446)) - 1037086548)) | (((int) (j9 >> 32)) & ((((~((-1082466323) | i12)) * 433) - 982457160) + (((~(1927619187 | i)) | 930121697) * (-433)) + (((~(930121697 | i)) | 845152865) * 433)))) != 0) {
                    getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 93) % 128;
                    java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                    java.lang.Object[] objArr3 = {-275039665, 16, java.lang.Integer.valueOf((((~(201366354 | i12)) | (~((-134254929) | i))) * (-831)) + 6905860 + ((~(1044946802 | i)) * (-1662)) + (((~(i | 910691874)) | (~((-910691875) | i12)) | (~((-201366355) | i))) * 831))};
                    java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj11 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 50, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16));
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        a((byte) (-$$a[16]), 653, r7[14], objArr4);
                        obj11 = cls2.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj11);
                    }
                    ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj11).invoke(null, objArr3)).intValue();
                    return objArr2;
                }
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b("\u0004\u0006\u0010\u0019\f\u0006\u001d\u000b\f\u0006㙋", 11 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (byte) (77 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr5);
                java.lang.Object[] objArr6 = {((java.lang.String) objArr5[0]).intern()};
                int i13 = 609763459;
                java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj12 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 40, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1921, (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                    byte b3 = $$a[14];
                    byte b4 = (byte) (b3 - 1);
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    a(b4, b4, b3, objArr7);
                    obj12 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.String.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                }
                java.lang.String str9 = (java.lang.String) ((java.lang.reflect.Method) obj12).invoke(null, objArr6);
                if (str9 != null) {
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    c("㭷\uf007궭奏ᛡ쎟", 52068 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr8);
                    java.lang.String intern = ((java.lang.String) objArr8[0]).intern();
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    c("㭢\ueb79魏䭘笯⬳\udb04诨", 53267 - android.text.TextUtils.getOffsetAfter("", 0), objArr9);
                    java.lang.String[] strArr3 = {intern, ((java.lang.String) objArr9[0]).intern()};
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        if (str9.contains(strArr3[i14])) {
                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 59) % 128;
                            java.lang.Object[] objArr10 = new java.lang.Object[1];
                            b("\u0004\u0006\u000e\r\u0004\u0006\u001d\u0017\u0019\u0014\u000f\u001f\u0007\n\r\u0005\b\u0018\u0017\r\u0006\u0000㘛", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23, (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 51), objArr10);
                            java.lang.Object[] objArr11 = {((java.lang.String) objArr10[0]).intern()};
                            java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i13));
                            if (obj13 == null) {
                                java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 39, android.graphics.Color.alpha(0) + 1921, (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
                                byte b5 = $$a[14];
                                byte b6 = (byte) (b5 - 1);
                                java.lang.Object[] objArr12 = new java.lang.Object[1];
                                a(b6, b6, b5, objArr12);
                                obj13 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(java.lang.Integer.valueOf(i13), obj13);
                            }
                            java.lang.Object invoke2 = ((java.lang.reflect.Method) obj13).invoke(null, objArr11);
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            b("\u0004\u0006\u000e\r\u0004\u0006\u001d\u0017\u0019\u0014\u0010\u0001\"\u0002\u0012\u001f\u001f\u000f\u001e\t\u000b\u000f\u0000\u0007\u0019\u0014\f\u0005\u0000\u0006", 29 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 54), objArr13);
                            java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                            java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(java.lang.Integer.valueOf(i13));
                            if (obj14 == null) {
                                java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 1921 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                byte b7 = $$a[14];
                                byte b8 = (byte) (b7 - 1);
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(b8, b8, b7, objArr15);
                                obj14 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj14);
                            }
                            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj14).invoke(null, objArr14);
                            if (invoke2 != null) {
                                java.lang.Object[] objArr16 = {invoke2, 42};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj15 == null) {
                                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.alpha(0) + 28, android.view.KeyEvent.keyCodeFromString("") + 2594, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                                    byte b9 = $$a[14];
                                    byte b10 = (byte) (b9 - 1);
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a(b10, b10, b9, objArr17);
                                    obj15 = cls6.getMethod((java.lang.String) objArr17[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj15);
                                }
                                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr16)).longValue();
                                long j10 = ~longValue2;
                                str7 = "";
                                obj8 = invoke3;
                                obj7 = invoke2;
                                long j11 = (((-97) * longValue2) - 40028778300L) + (((~(j10 | j8)) | (~(j10 | (-800575566)))) * 98) + (((~(800575565 | j8)) | j10 | (~((-800575566) | j6))) * (-49)) + (((~(j10 | j6)) | (~((-800575566) | longValue2))) * 49) + 2057676090;
                                if (((((int) j11) & ((((~(781947929 | i12)) | (-655278481)) * (-235)) + 745363009 + (((~(781947929 | i)) | (-655278481)) * (-470)) + (((~((-17056129) | i)) | 143725577) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE))) | (((int) (j11 >> 32)) & ((((~(2147285428 | i12)) | (~((-1344555013) | i)) | (~((-92274961) | i))) * 765) + 1379096213 + (((~(802730416 | i12)) | (-2147285429)) * 1530) + (((~(802730416 | i)) | (~((-92274961) | i12))) * 765)))) != 477111747) {
                                }
                                j = j8;
                                str8 = str7;
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    b("\u0012!\u0014\u0019\u001b!\u000f!\u0014\u0016㘏㘏\u000b\u0013\u0005\u001d \f\f\u0011\f\n\u0014\u000e\u001f\f\u0002\u0018", android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, (byte) (24 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), objArr18);
                                    java.lang.Object[] objArr19 = {((java.lang.String) objArr18[0]).intern()};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                    if (obj16 == null) {
                                        java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 36, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 3161, (char) (33099 - android.view.View.combineMeasuredStates(0, 0)));
                                        byte b11 = $$a[14];
                                        byte b12 = (byte) (b11 - 1);
                                        java.lang.Object[] objArr20 = new java.lang.Object[1];
                                        a(b12, b12, b11, objArr20);
                                        obj16 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj16);
                                    }
                                    long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj16).invoke(null, objArr19)).longValue();
                                    long j12 = ~longValue3;
                                    str = str8;
                                    long j13 = ((((((-958) * longValue3) - 563957056146L) + ((((~(j12 | j)) | (~(j6 | (-588681688)))) | (~(j | 588681687))) * 959)) + ((~(longValue3 | 588681687)) * (-959))) + ((((~(j | (-588681688))) | (~(j12 | j6))) | (~(588681687 | j6))) * 959)) - 1926349795;
                                    int i16 = (~((-950091365) | i12)) | 547366944 | (~(487135046 | i12));
                                    int i17 = ~((-8492426) | i);
                                    if (((((int) (j13 >> 32)) & (((((~((-84410627) | i)) | i16) * 590) - 296452914) + (i16 * (-1180)) + (((~((-487135047) | i12)) | (~(950091364 | i12))) * 590))) | ((((554696704 | i17) * (-476)) + 857972633 + (i17 * 952) + ((~((-8492426) | i12)) * 476)) & ((int) j13))) == 1) {
                                        i11 = 1;
                                        c = 0;
                                        int[] iArr = new int[i11];
                                        int[] iArr2 = new int[i11];
                                        iArr[c] = i;
                                        iArr2[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        java.lang.Object[] objArr21 = {iArr, iArr2, null, new int[i11]};
                                        java.lang.Object[] objArr22 = {-275039665, 16, java.lang.Integer.valueOf((((~(i | (-272089354))) | (-437236167)) * (-964)) + 421586775 + (((~((-272089354) | i12)) | 3162121) * (-964)))};
                                        obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj9 == null) {
                                            java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.MeasureSpec.getMode(0), 2712 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) android.graphics.Color.red(0));
                                            java.lang.Object[] objArr23 = new java.lang.Object[1];
                                            a((byte) (-$$a[16]), 653, r2[14], objArr23);
                                            obj9 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                                        }
                                        ((int[]) objArr21[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr22)).intValue();
                                        return objArr21;
                                    }
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    c("㭤\udca4\uf4ed谕ꑺ붹嗢洕", 59333 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr24);
                                    java.lang.String intern2 = ((java.lang.String) objArr24[0]).intern();
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    c("㭤ꉌः\uf0dd徇악", 39227 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr25);
                                    java.lang.String intern3 = ((java.lang.String) objArr25[0]).intern();
                                    java.lang.Object[] objArr26 = new java.lang.Object[1];
                                    b("\u0015#\u0010\u0005\u0000\u0006㙰", 7 - android.graphics.Color.red(0), (byte) (114 - android.view.KeyEvent.getDeadChar(0, 0)), objArr26);
                                    java.lang.String intern4 = ((java.lang.String) objArr26[0]).intern();
                                    java.lang.Object[] objArr27 = new java.lang.Object[1];
                                    b("\u0011\u0016\u0010\u0002\u0000\u0006\u0006#㗮", 9 - android.graphics.Color.alpha(0), (byte) ((-16777210) - android.graphics.Color.rgb(0, 0, 0)), objArr27);
                                    java.lang.String intern5 = ((java.lang.String) objArr27[0]).intern();
                                    java.lang.String str10 = str;
                                    java.lang.Object[] objArr28 = new java.lang.Object[1];
                                    c("㭬꿄ሣ蚉槽\udc55", android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38054, objArr28);
                                    java.lang.String intern6 = ((java.lang.String) objArr28[0]).intern();
                                    java.lang.Object[] objArr29 = new java.lang.Object[1];
                                    c("㭬\u2d6cᝢ祤挴啂뽊ꅖ譈ﵝ\ue76d줺㌲", 5638 - android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr29);
                                    java.lang.String intern7 = ((java.lang.String) objArr29[0]).intern();
                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                    b("\u001c\t\u0016\u0007㙊", 6 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getMode(0) + 96), objArr30);
                                    java.lang.String intern8 = ((java.lang.String) objArr30[0]).intern();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    b("\u0018\u000f\u0000\u0006\u0004\u0013", 5 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((-16777091) - android.graphics.Color.rgb(0, 0, 0)), objArr31);
                                    java.lang.String intern9 = ((java.lang.String) objArr31[0]).intern();
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    b("\u001d\u0003", 3 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29), objArr32);
                                    java.lang.String intern10 = ((java.lang.String) objArr32[0]).intern();
                                    java.lang.Object[] objArr33 = new java.lang.Object[1];
                                    b("\t\u000b\u0011\r\u0000\u0006\u0003\u001c\u0001\u0016\u0010\u0001\u0012\u0007\u0001\u0012", 15 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17), objArr33);
                                    java.lang.String intern11 = ((java.lang.String) objArr33[0]).intern();
                                    java.lang.Object[] objArr34 = new java.lang.Object[1];
                                    c("㭩ẳ烐䫺가號\ud877㏄ᖿ濇", android.view.View.resolveSizeAndState(0, 0, 0) + 9689, objArr34);
                                    java.lang.String intern12 = ((java.lang.String) objArr34[0]).intern();
                                    java.lang.Object[] objArr35 = new java.lang.Object[1];
                                    b("\u0012\u0006\b\u001c\u0006\f\n\b", (-16777208) - android.graphics.Color.rgb(0, 0, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46), objArr35);
                                    java.lang.String intern13 = ((java.lang.String) objArr35[0]).intern();
                                    java.lang.Object[] objArr36 = new java.lang.Object[1];
                                    c("㭵⹀ᄄӆ澺兹䐣꿨鋘薉\uef57툼", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5431, objArr36);
                                    java.lang.String intern14 = ((java.lang.String) objArr36[0]).intern();
                                    java.lang.Object[] objArr37 = new java.lang.Object[1];
                                    b("\u0012\u0006\u0007\u0004\u001c\b㙊㙊 \u0018\u0014\u0019\u0014\u0007", 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 84), objArr37);
                                    java.lang.String intern15 = ((java.lang.String) objArr37[0]).intern();
                                    java.lang.Object[] objArr38 = new java.lang.Object[1];
                                    b("\u0006\u0000\"\t\u000f\u000b㘮", 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (63 - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr38);
                                    java.lang.String intern16 = ((java.lang.String) objArr38[0]).intern();
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    c("㭶鎐檐솅颜瞕캛", android.view.View.resolveSize(0, 0) + 43261, objArr39);
                                    java.lang.String intern17 = ((java.lang.String) objArr39[0]).intern();
                                    java.lang.Object[] objArr40 = new java.lang.Object[1];
                                    b("\u0005\u001c\t\u001a\u0012\u001f㗎", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 7, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr40);
                                    java.lang.String intern18 = ((java.lang.String) objArr40[0]).intern();
                                    java.lang.Object[] objArr41 = new java.lang.Object[1];
                                    c("㭶\uf3c1", android.view.View.combineMeasuredStates(0, 0) + 51383, objArr41);
                                    java.lang.String intern19 = ((java.lang.String) objArr41[0]).intern();
                                    java.lang.Object[] objArr42 = new java.lang.Object[1];
                                    c("㭶㼎㎚㘊⪍ⴡↈ␕ᢉጚឬਜພĕ֜砕粒眏殅渜", 1151 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr42);
                                    java.lang.String intern20 = ((java.lang.String) objArr42[0]).intern();
                                    java.lang.Object[] objArr43 = new java.lang.Object[1];
                                    b("\u0001\u0016\u0006\f\u0018 ", 5 - android.view.MotionEvent.axisFromString(str10), (byte) (android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 116), objArr43);
                                    java.lang.String intern21 = ((java.lang.String) objArr43[0]).intern();
                                    java.lang.Object[] objArr44 = new java.lang.Object[1];
                                    c("㭶\ueacd", android.text.TextUtils.indexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53694, objArr44);
                                    java.lang.String intern22 = ((java.lang.String) objArr44[0]).intern();
                                    java.lang.Object[] objArr45 = new java.lang.Object[1];
                                    b("\u0000\n\u000f!\u0015\u0019#\u001f\u0005\u001e\u0001\u0016\u0007\u0012\u0010\u0005", 16 - android.view.View.MeasureSpec.getMode(0), (byte) (53 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr45);
                                    java.lang.String intern23 = ((java.lang.String) objArr45[0]).intern();
                                    java.lang.Object[] objArr46 = new java.lang.Object[1];
                                    c("㭱䠈\udd9a愛\uf69c税辞ገꂕ", 29567 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr46);
                                    java.lang.String intern24 = ((java.lang.String) objArr46[0]).intern();
                                    java.lang.Object[] objArr47 = new java.lang.Object[1];
                                    c("㭱\u2ef8ၺ篋浜傾먾궘霕老", 5519 - android.view.KeyEvent.normalizeMetaState(0), objArr47);
                                    java.lang.String intern25 = ((java.lang.String) objArr47[0]).intern();
                                    java.lang.Object[] objArr48 = new java.lang.Object[1];
                                    c("㭱零恦㏥赤売⩬藷坹⋩ﰹ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44417, objArr48);
                                    java.lang.String intern26 = ((java.lang.String) objArr48[0]).intern();
                                    java.lang.Object[] objArr49 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u0019\u001c\u0007\u0003㗿", 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (10 - android.text.TextUtils.getTrimmedLength(str10)), objArr49);
                                    java.lang.String intern27 = ((java.lang.String) objArr49[0]).intern();
                                    java.lang.Object[] objArr50 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u001e\u0006\"\f\u0019\u001c\u0007\u0003㘀", android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11), objArr50);
                                    java.lang.String intern28 = ((java.lang.String) objArr50[0]).intern();
                                    java.lang.Object[] objArr51 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u001c\u0000!\"\u0010\b\n\u0002", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), objArr51);
                                    java.lang.String[] strArr4 = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr51[0]).intern()};
                                    java.lang.Object[] objArr52 = new java.lang.Object[1];
                                    b("\u0004\u0006\u0010\u0019\f\u0006\u001d\u000b\f\u0006㙋", android.view.View.combineMeasuredStates(0, 0) + 11, (byte) (android.text.TextUtils.getCapsMode(str10, 0, 0) + 76), objArr52);
                                    java.lang.Object[] objArr53 = {((java.lang.String) objArr52[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777256, 1921 - android.text.TextUtils.getOffsetBefore(str10, 0), (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                        byte b13 = $$a[14];
                                        byte b14 = (byte) (b13 - 1);
                                        java.lang.Object[] objArr54 = new java.lang.Object[1];
                                        a(b14, b14, b13, objArr54);
                                        obj2 = cls9.getMethod((java.lang.String) objArr54[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                    }
                                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr53);
                                    if (str2 != null) {
                                        java.lang.Object[] objArr55 = new java.lang.Object[1];
                                        c("㭷\uf007궭奏ᛡ쎟", (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 52067, objArr55);
                                        int i18 = 0;
                                        java.lang.String intern29 = ((java.lang.String) objArr55[0]).intern();
                                        java.lang.Object[] objArr56 = new java.lang.Object[1];
                                        c("㭢\ueb79魏䭘笯⬳\udb04诨", (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 53267, objArr56);
                                        java.lang.String[] strArr5 = {intern29, ((java.lang.String) objArr56[0]).intern()};
                                        int i19 = 0;
                                        while (i19 < 2) {
                                            if (str2.contains(strArr5[i19])) {
                                                java.lang.Object[] objArr57 = new java.lang.Object[1];
                                                b("\u0004\u0006\u000e\r\u0004\u0006\u001d\u0017\u0019\u0014\u000f\u001f\u0007\n\r\u0005\b\u0018\u0017\r\u0006\u0000㘛", 22 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (byte) (android.graphics.drawable.Drawable.resolveOpacity(i18, i18) + 51), objArr57);
                                                java.lang.Object[] objArr58 = {((java.lang.String) objArr57[i18]).intern()};
                                                java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj17 == null) {
                                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 40, 1920 - android.os.Process.getGidForName(str10), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16));
                                                    byte b15 = $$a[14];
                                                    byte b16 = (byte) (b15 - 1);
                                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                                    a(b16, b16, b15, objArr59);
                                                    obj17 = cls10.getMethod((java.lang.String) objArr59[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj17);
                                                }
                                                java.lang.Object invoke4 = ((java.lang.reflect.Method) obj17).invoke(null, objArr58);
                                                java.lang.Object[] objArr60 = new java.lang.Object[1];
                                                b("\u0004\u0006\u000e\r\u0004\u0006\u001d\u0017\u0019\u0014\u0010\u0001\"\u0002\u0012\u001f\u001f\u000f\u001e\t\u000b\u000f\u0000\u0007\u0019\u0014\f\u0005\u0000\u0006", 30 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (android.text.TextUtils.indexOf(str10, str10, 0) + 54), objArr60);
                                                java.lang.Object[] objArr61 = {((java.lang.String) objArr60[0]).intern()};
                                                java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj18 == null) {
                                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str10, 0, 0) + 40, android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1922, (char) ((-1) - android.text.TextUtils.lastIndexOf(str10, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    byte b17 = $$a[14];
                                                    byte b18 = (byte) (b17 - 1);
                                                    java.lang.Object[] objArr62 = new java.lang.Object[1];
                                                    a(b18, b18, b17, objArr62);
                                                    obj18 = cls11.getMethod((java.lang.String) objArr62[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                                }
                                                java.lang.Object invoke5 = ((java.lang.reflect.Method) obj18).invoke(null, objArr61);
                                                if (invoke4 != null) {
                                                    java.lang.Object[] objArr63 = {invoke4, 42};
                                                    java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj19 == null) {
                                                        java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2594, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                                                        byte b19 = $$a[14];
                                                        byte b20 = (byte) (b19 - 1);
                                                        java.lang.Object[] objArr64 = new java.lang.Object[1];
                                                        a(b20, b20, b19, objArr64);
                                                        obj19 = cls12.getMethod((java.lang.String) objArr64[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj19);
                                                    }
                                                    long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj19).invoke(null, objArr63)).longValue();
                                                    long j14 = ((-782) * longValue4) + 7287854672L + ((~longValue4) * (-783)) + ((~(j | (-9295734) | longValue4)) * (-783)) + (((~(j | longValue4)) | (-9295734)) * 783) + 1247804791;
                                                    int i20 = ~(72364634 | i);
                                                    if (((((int) j14) & ((((~((-1476437555) | i)) | 39211144) * (-756)) + 1931889297 + (((-1476437555) | i12) * 756))) | (((int) (j14 >> 32)) & (((((~((-5251665) | i12)) | (~(1364861776 | i))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL) - 774125222) + (((~((-1364861777) | i12)) | i20) * (-1040)) + ((i20 | (~((-72364635) | i12)) | 1359610112) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL)))) == 477111747) {
                                                        str5 = str10;
                                                        i9 = 0;
                                                        i10 = 0;
                                                        while (i9 < 28) {
                                                            java.lang.String str11 = strArr4[i9];
                                                            java.lang.Object[] objArr65 = new java.lang.Object[1];
                                                            c("㬪證嬂⯋ﮍ䩛ᨒ\uea93몟ज़\ud91dꦟ", 45119 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr65);
                                                            java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern().concat(java.lang.String.valueOf(str11))};
                                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
                                                            if (obj20 == null) {
                                                                str6 = str5;
                                                                java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str6, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 37, android.text.TextUtils.getCapsMode(str6, 0, 0) + 3161, (char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 33099));
                                                                byte b21 = (byte) ($$a[14] - 1);
                                                                java.lang.Object[] objArr67 = new java.lang.Object[1];
                                                                a(b21, (short) (b21 | 618), b21, objArr67);
                                                                obj20 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, obj20);
                                                            } else {
                                                                str6 = str5;
                                                            }
                                                            long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr66)).longValue();
                                                            long j15 = j | 462399137;
                                                            java.lang.String[] strArr6 = strArr4;
                                                            long j16 = ~longValue5;
                                                            long j17 = j6;
                                                            long j18 = ((53 * longValue5) - 23582355987L) + ((~(j15 | longValue5)) * 52) + (((~(j16 | 462399137)) | (~(j16 | j)) | (~j15)) * (-52)) + (((~(longValue5 | (-462399138))) | (~(j | (-462399138)))) * 52) + 445071601;
                                                            int i21 = ~((-1726672421) | i12);
                                                            int i22 = ~(82923482 | i);
                                                            i10 += ((((int) j18) & ((((((~(1354302927 | i12)) | i22) * 1150) + 334239082) + ((i22 | (~((-82923483) | i12))) * (-575))) + (((~(1354302927 | i)) | (~((-1354302928) | i12))) * 575))) | (((int) (j18 >> 32)) & ((((((-2011889278) | i21) | (~(1726672420 | i))) * (-338)) + 23483214) + ((i21 | (~((-285216858) | i))) * 338)))) == 0 ? 0 : 1;
                                                            i9++;
                                                            str5 = str6;
                                                            strArr4 = strArr6;
                                                            j6 = j17;
                                                        }
                                                        j2 = j6;
                                                        str3 = str5;
                                                        if (i10 >= 25.2d) {
                                                            java.lang.Object[] objArr68 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
                                                            java.lang.Object[] objArr69 = {-275039665, 16, java.lang.Integer.valueOf((((~(430371247 | i12)) * 52) - 1083238661) + (((~(413196716 | i12)) | (~((-296128804) | i12)) | 17174531) * (-52)) + (((~((-413196717) | i12)) | 134242444) * 52))};
                                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj21 == null) {
                                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2713, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
                                                                java.lang.Object[] objArr70 = new java.lang.Object[1];
                                                                a((byte) (-$$a[16]), 653, r4[14], objArr70);
                                                                obj21 = cls14.getMethod((java.lang.String) objArr70[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj21);
                                                            }
                                                            ((int[]) objArr68[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj21).invoke(null, objArr69)).intValue();
                                                            return objArr68;
                                                        }
                                                        i2 = 0;
                                                        java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr71);
                                                        java.lang.Object[] objArr72 = {((java.lang.String) objArr71[i2]).intern()};
                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj3 == null) {
                                                            java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.combineMeasuredStates(0, 0) + 29, 2807 - android.view.View.getDefaultSize(0, 0), (char) android.view.KeyEvent.keyCodeFromString(str3));
                                                            byte b22 = $$a[14];
                                                            byte b23 = (byte) (b22 - 1);
                                                            java.lang.Object[] objArr73 = new java.lang.Object[1];
                                                            a(b23, b23, b22, objArr73);
                                                            obj3 = cls15.getMethod((java.lang.String) objArr73[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                                        }
                                                        long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr72)).longValue();
                                                        long j19 = ((-215) * longValue6) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue6) | j) * (-216)) + ((longValue6 | (~(j | 140210277))) * 216) + 1150329790;
                                                        j3 = (((int) (j19 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j19) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                                        java.lang.Object[] objArr74 = new java.lang.Object[1];
                                                        c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr74);
                                                        java.lang.Object[] objArr75 = {((java.lang.String) objArr74[0]).intern()};
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj4 == null) {
                                                            java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2807, (char) (android.text.TextUtils.lastIndexOf(str3, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                            byte b24 = $$a[14];
                                                            byte b25 = (byte) (b24 - 1);
                                                            java.lang.Object[] objArr76 = new java.lang.Object[1];
                                                            a(b25, b25, b24, objArr76);
                                                            obj4 = cls16.getMethod((java.lang.String) objArr76[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                                        }
                                                        long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr75)).longValue();
                                                        long j20 = ~longValue7;
                                                        java.lang.String str12 = str3;
                                                        long j21 = (((-67) * longValue7) - 22281076419L) + (((~(322914150 | j20 | j)) | (~(longValue7 | (-322914151))) | (~(longValue7 | j2))) * (-68)) + ((~(j | 322914150 | longValue7)) * (-68)) + (((~(j20 | j)) | 322914150) * 68) + 1613454218;
                                                        long j22 = (((int) (j21 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j21) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                                        if (j3 > 0) {
                                                            getAid = (SdkCoreAlternateContactlessPaymentDataImpl + 91) % 128;
                                                            if (j22 > 0 && j22 - 3 < j3) {
                                                                java.lang.Object[] objArr77 = {new int[]{i}, new int[]{i ^ 247}, null, new int[1]};
                                                                java.lang.Object[] objArr78 = {-275039665, 16, java.lang.Integer.valueOf((((~(i | 11521377)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE) - 1498863657) + (((-688922639) | i12) * (-216)) + (((~(11521377 | i12)) | 697804142) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE))};
                                                                java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                if (obj22 == null) {
                                                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.combineMeasuredStates(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2713, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                                    java.lang.Object[] objArr79 = new java.lang.Object[1];
                                                                    a((byte) (-$$a[16]), 653, r2[14], objArr79);
                                                                    obj22 = cls17.getMethod((java.lang.String) objArr79[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                                                }
                                                                ((int[]) objArr77[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr78)).intValue();
                                                                return objArr77;
                                                            }
                                                        }
                                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr80);
                                                        java.lang.Object[] objArr81 = {((java.lang.String) objArr80[0]).intern()};
                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj5 != null) {
                                                            str4 = str12;
                                                            java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 29, 2807 - android.graphics.Color.green(0), (char) ((-1) - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                            byte b26 = $$a[14];
                                                            byte b27 = (byte) (b26 - 1);
                                                            java.lang.Object[] objArr82 = new java.lang.Object[1];
                                                            a(b27, b27, b26, objArr82);
                                                            obj5 = cls18.getMethod((java.lang.String) objArr82[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                                        } else {
                                                            str4 = str12;
                                                        }
                                                        long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr81)).longValue();
                                                        long j23 = ~((-950742289) | longValue8);
                                                        long j24 = ~longValue8;
                                                        long j25 = ~(950742288 | j24);
                                                        long j26 = ((longValue8 * 263) - 497238216624L) + (((~(j24 | j2)) | j23 | j25) * 262) + ((-786) * j25) + (((~(j24 | j)) | j23 | j25) * 262) + 339797779;
                                                        j4 = (((int) j26) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j26 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                                        java.lang.Object[] objArr83 = new java.lang.Object[1];
                                                        c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr83);
                                                        java.lang.Object[] objArr84 = {((java.lang.String) objArr83[0]).intern()};
                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj6 == null) {
                                                            java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 2807 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.view.MotionEvent.axisFromString(str4)));
                                                            byte b28 = $$a[14];
                                                            byte b29 = (byte) (b28 - 1);
                                                            java.lang.Object[] objArr85 = new java.lang.Object[1];
                                                            a(b29, b29, b28, objArr85);
                                                            obj6 = cls19.getMethod((java.lang.String) objArr85[0], java.lang.String.class);
                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                                        }
                                                        long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr84)).longValue();
                                                        long j27 = 768395910 | longValue9;
                                                        long j28 = (829 * longValue9) + 637000209390L + (((~((~longValue9) | (-768395911))) | (~(longValue9 | j | 768395910))) * (-828)) + ((j27 | j) * (-828)) + ((~j27) * 828) + 522144157;
                                                        int i23 = ~((-1851749727) | i12);
                                                        long j29 = (((int) (j28 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j28) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i23) * 594) + ((i23 | (~((-414523317) | i12)) | 135599380) * 594)));
                                                        if (j4 <= 0 && j29 > 0 && j29 + 100 < j4) {
                                                            java.lang.Object[] objArr86 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                                            java.lang.Object[] objArr87 = {-275039665, 16, java.lang.Integer.valueOf((((((~((-500501323) | i12)) | 206570240) | (~((-208824198) | i12))) * (-1136)) - 120705513) + (((~((-500501323) | i)) | (~((-208824198) | i)) | (~(502755279 | i12))) * (-568)) + (((~(i | (-206570241))) | (~(500501322 | i12)) | (~(208824197 | i12))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PUSH_INVALID_CONVERSATION))};
                                                            java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj23 == null) {
                                                                java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777166) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf(str4, str4) + 2713, (char) android.view.KeyEvent.keyCodeFromString(str4));
                                                                java.lang.Object[] objArr88 = new java.lang.Object[1];
                                                                a((byte) (-$$a[16]), 653, r2[14], objArr88);
                                                                obj23 = cls20.getMethod((java.lang.String) objArr88[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                                            }
                                                            ((int[]) objArr86[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr87)).intValue();
                                                            return objArr86;
                                                        }
                                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr89);
                                                        java.lang.String intern30 = ((java.lang.String) objArr89[0]).intern();
                                                        java.lang.Object[] objArr90 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr90);
                                                        java.lang.String intern31 = ((java.lang.String) objArr90[0]).intern();
                                                        java.lang.Object[] objArr91 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr91);
                                                        java.lang.String intern32 = ((java.lang.String) objArr91[0]).intern();
                                                        java.lang.Object[] objArr92 = new java.lang.Object[1];
                                                        c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr92);
                                                        java.lang.String intern33 = ((java.lang.String) objArr92[0]).intern();
                                                        java.lang.Object[] objArr93 = new java.lang.Object[1];
                                                        c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr93);
                                                        java.lang.String intern34 = ((java.lang.String) objArr93[0]).intern();
                                                        java.lang.Object[] objArr94 = new java.lang.Object[1];
                                                        c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr94);
                                                        java.lang.String intern35 = ((java.lang.String) objArr94[0]).intern();
                                                        java.lang.Object[] objArr95 = new java.lang.Object[1];
                                                        c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr95);
                                                        strArr = new java.lang.String[]{intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr95[0]).intern()};
                                                        i3 = 0;
                                                        while (true) {
                                                            if (i3 < 7) {
                                                                i4 = 0;
                                                                break;
                                                            }
                                                            java.lang.Object[] objArr96 = {strArr[i3]};
                                                            java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                                            if (obj24 == null) {
                                                                java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.view.View.MeasureSpec.getSize(0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1672, (char) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 47940));
                                                                byte b30 = $$a[14];
                                                                byte b31 = (byte) (b30 - 1);
                                                                java.lang.Object[] objArr97 = new java.lang.Object[1];
                                                                a(b31, b31, b30, objArr97);
                                                                obj24 = cls21.getMethod((java.lang.String) objArr97[0], java.lang.String.class);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj24);
                                                            }
                                                            long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr96)).longValue();
                                                            long j30 = ~longValue10;
                                                            long j31 = j | 154482717;
                                                            strArr2 = strArr;
                                                            long j32 = (-1471047464) + ((242 * longValue10) - 74615152794L) + (((~(j30 | 154482717)) | (~j31)) * (-241)) + (((-154482718) | longValue10) * (-482)) + (((~((-154482718) | j30)) | (~(j31 | longValue10))) * 241);
                                                            if (((((int) j32) & (((((~((-1774000324) | i12)) | 690292801) * 98) - 1926886239) + (((~((-1083740563) | i12)) | (-1774000324) | (~(1083740562 | i))) * (-49)) + (((~((-1774000324) | i)) | (-1774033364)) * 49))) | (((int) (j32 >> 32)) & ((((-8405579) | i) * (-627)) + 635053320 + (((~(1356232271 | i)) | (-1501508614)) * (-627)) + (((~((-1356232272) | i12)) | (~((-1501508614) | i))) * 627)))) != 0) {
                                                                i4 = i3 + 90;
                                                                break;
                                                            }
                                                            i3++;
                                                            strArr = strArr2;
                                                        }
                                                        if (i4 == 0) {
                                                            java.lang.Object[] objArr98 = {new int[]{i}, new int[]{i4 ^ i}, null, new int[1]};
                                                            java.lang.Object[] objArr99 = {-275039665, 16, java.lang.Integer.valueOf(((((-38896849) | i12) * (-490)) - 2094405387) + (((~(i | (-659924469))) | 621027620) * 490) + 1563288296)};
                                                            java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                            if (obj25 == null) {
                                                                java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSize(0, 0) + 50, 2714 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) android.graphics.drawable.Drawable.resolveOpacity(0, 0));
                                                                java.lang.Object[] objArr100 = new java.lang.Object[1];
                                                                a((byte) (-$$a[16]), 653, r2[14], objArr100);
                                                                obj25 = cls22.getMethod((java.lang.String) objArr100[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                                            }
                                                            ((int[]) objArr98[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr99)).intValue();
                                                            return objArr98;
                                                        }
                                                        try {
                                                            java.lang.Object[] objArr101 = new java.lang.Object[1];
                                                            c("㭷ⰷᖑ絰昄侽띇飪臃\ue928틈㮉⌭", 5981 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr101);
                                                            try {
                                                                java.lang.Object[] objArr102 = {((java.lang.String) objArr101[0]).intern()};
                                                                java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                if (obj26 == null) {
                                                                    java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionChild(0L) + 41, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1920, (char) (android.view.MotionEvent.axisFromString(str4) + 1));
                                                                    byte b32 = $$a[14];
                                                                    byte b33 = (byte) (b32 - 1);
                                                                    java.lang.Object[] objArr103 = new java.lang.Object[1];
                                                                    a(b33, b33, b32, objArr103);
                                                                    obj26 = cls23.getMethod((java.lang.String) objArr103[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                                                }
                                                                java.lang.Object invoke6 = ((java.lang.reflect.Method) obj26).invoke(null, objArr102);
                                                                if (invoke6 != null) {
                                                                    java.lang.Object[] objArr104 = new java.lang.Object[1];
                                                                    c("㭦≩ॎ灔弾䘋괞铸\uf3c0\udad7솳", 6421 - android.text.TextUtils.indexOf(str4, str4), objArr104);
                                                                    try {
                                                                        java.lang.Object[] objArr105 = {invoke6, new java.lang.String[]{((java.lang.String) objArr104[0]).intern()}};
                                                                        java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                                                        if (obj27 == null) {
                                                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2880, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                                                            byte b34 = $$a[14];
                                                                            byte b35 = (byte) (b34 - 1);
                                                                            java.lang.Object[] objArr106 = new java.lang.Object[1];
                                                                            a(b35, b35, b34, objArr106);
                                                                            obj27 = cls24.getMethod((java.lang.String) objArr106[0], java.lang.String.class, java.lang.String[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj27);
                                                                        }
                                                                        long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr105)).longValue();
                                                                        long j33 = ~longValue11;
                                                                        long j34 = ~(1440636754 | j33);
                                                                        long j35 = ((((((-575) * longValue11) + 828366134125L) + (((~(j33 | j2)) | j34) * 576)) + (((~(longValue11 | 1440636754)) | (~((j33 | j) | (-1440636755)))) * 576)) + (j34 * 576)) - 588075024;
                                                                        int i24 = (int) (j35 >> 32);
                                                                        int i25 = ~(2111138389 | i12);
                                                                    } catch (java.lang.Throwable th2) {
                                                                        java.lang.Throwable cause = th2.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                                b("!\u000f\u0019\u0015\u0010\u0001\b\u001d\u0010\u0001\f\u001d\u0012\u000b\u001f\"\u000b\n", 18 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 105), objArr107);
                                                                try {
                                                                    java.lang.Object[] objArr108 = {((java.lang.String) objArr107[0]).intern()};
                                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj28 == null) {
                                                                        java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), 1921 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) android.text.TextUtils.getCapsMode(str4, 0, 0));
                                                                        byte b36 = $$a[14];
                                                                        byte b37 = (byte) (b36 - 1);
                                                                        java.lang.Object[] objArr109 = new java.lang.Object[1];
                                                                        a(b37, b37, b36, objArr109);
                                                                        obj28 = cls25.getMethod((java.lang.String) objArr109[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj28);
                                                                    }
                                                                    invoke = ((java.lang.reflect.Method) obj28).invoke(null, objArr108);
                                                                } catch (java.lang.Throwable th3) {
                                                                    java.lang.Throwable cause2 = th3.getCause();
                                                                    if (cause2 != null) {
                                                                        throw cause2;
                                                                    }
                                                                    throw th3;
                                                                }
                                                            } catch (java.lang.Throwable th4) {
                                                                java.lang.Throwable cause3 = th4.getCause();
                                                                if (cause3 != null) {
                                                                    throw cause3;
                                                                }
                                                                throw th4;
                                                            }
                                                        } catch (java.lang.Exception unused) {
                                                        }
                                                        if (invoke != null) {
                                                            java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                            c("㭷觙帹Ⲑ\uf1c8䘦ᒔ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45737, objArr110);
                                                            if (invoke.equals(((java.lang.String) objArr110[0]).intern())) {
                                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                                b("\u0012\u0000\u0001\u0005\u001c\u0003\u0019\u0013\u0002\"\u0001\u0010\u0004\u0006\u0007\u0016\u001e\f㘅㘅\"\u0000㗵", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 23, (byte) (13 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr111);
                                                                try {
                                                                    java.lang.Object[] objArr112 = {((java.lang.String) objArr111[0]).intern()};
                                                                    java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                    if (obj29 == null) {
                                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.os.Process.myPid() >> 22) + 1921, (char) android.text.TextUtils.getTrimmedLength(str4));
                                                                        byte b38 = $$a[14];
                                                                        byte b39 = (byte) (b38 - 1);
                                                                        java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                                        a(b39, b39, b38, objArr113);
                                                                        obj29 = cls26.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                                                    }
                                                                    java.lang.String str13 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr112);
                                                                    if (str13 != null && (parseInt = java.lang.Integer.parseInt(str13)) != 0) {
                                                                        i5 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                                        if (i5 == 0) {
                                                                            java.lang.Object[] objArr114 = {new int[]{i}, new int[]{i ^ i5}, null, new int[1]};
                                                                            java.lang.Object[] objArr115 = {-275039665, 16, java.lang.Integer.valueOf((((((~((-982301760) | i12)) | 272976239) * (-933)) - 642373222) + (((~(272976239 | i12)) | (-986578304)) * 933)) - 304951744)};
                                                                            java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj30 == null) {
                                                                                java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 50, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) (android.os.Process.getGidForName(str4) + 1));
                                                                                java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r5[14], objArr116);
                                                                                obj30 = cls27.getMethod((java.lang.String) objArr116[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj30);
                                                                            }
                                                                            ((int[]) objArr114[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj30).invoke(null, objArr115)).intValue();
                                                                            return objArr114;
                                                                        }
                                                                        java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                                        c("㭷ⰷᖑ絰昄侽띇飪臃\ue928틈㮉⌭", android.graphics.Color.rgb(0, 0, 0) + 16783197, objArr117);
                                                                        java.lang.Object[] objArr118 = {((java.lang.String) objArr117[0]).intern()};
                                                                        java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                                        if (obj31 == null) {
                                                                            java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(41 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1921 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                            byte b40 = $$a[14];
                                                                            byte b41 = (byte) (b40 - 1);
                                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                                            a(b41, b41, b40, objArr119);
                                                                            obj31 = cls28.getMethod((java.lang.String) objArr119[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj31);
                                                                        }
                                                                        java.lang.String str14 = (java.lang.String) ((java.lang.reflect.Method) obj31).invoke(null, objArr118);
                                                                        if (str14 != null) {
                                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                                            c("㭦≩ॎ灔弾䘋괞铸\uf3c0\udad7솳", 6421 - android.view.View.combineMeasuredStates(0, 0), objArr120);
                                                                            java.lang.String[] strArr7 = {((java.lang.String) objArr120[0]).intern()};
                                                                            int i26 = 0;
                                                                            while (true) {
                                                                                if (i26 > 0) {
                                                                                    java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                                                    c("㬪ዺ桒䞠鴈\ueb2d싋ᡗ瞾䴗魧\uf283", 10650 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr121);
                                                                                    java.lang.String intern36 = ((java.lang.String) objArr121[0]).intern();
                                                                                    java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                                                    b("\u0016\u0012\u0007\u0012\t\u0012\t\u000b\u0018\b\t\u0014\u000f\u001a\u000f\u001b", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 16, (byte) (android.view.KeyEvent.getDeadChar(0, 0) + 11), objArr122);
                                                                                    java.lang.String intern37 = ((java.lang.String) objArr122[0]).intern();
                                                                                    java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                                                    b("\u0016\u0012\u0007\u0012\t\u0012\t\u000b\u0018\b\t\u0014 \r!\u000f㘙", android.widget.ExpandableListView.getPackedPositionType(0L) + 17, (byte) (100 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr123);
                                                                                    java.lang.String intern38 = ((java.lang.String) objArr123[0]).intern();
                                                                                    java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                                                    c("㬪⠡᷉ũ瘷宙", android.graphics.Color.alpha(0) + 4951, objArr124);
                                                                                    java.lang.String intern39 = ((java.lang.String) objArr124[0]).intern();
                                                                                    java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                                                    c("㬪證嬂⯋ﮍ䩛ᨒ\uea93몟ज़\ud91dꦟ", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 45119, objArr125);
                                                                                    java.lang.String intern40 = ((java.lang.String) objArr125[0]).intern();
                                                                                    java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a\u000f\u001b\f\u001f\u0001\u0019㗟", 16 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (43 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), objArr126);
                                                                                    java.lang.String intern41 = ((java.lang.String) objArr126[0]).intern();
                                                                                    java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                                    c("㬪䨧\ud9de梅︵\u0df5鲎∝뇯삵噁\ue551璯啕ं飖\u2e66봅쳑剣\ue17e", android.text.TextUtils.getOffsetBefore(str4, 0) + 29009, objArr127);
                                                                                    java.lang.String intern42 = ((java.lang.String) objArr127[0]).intern();
                                                                                    java.lang.Object[] objArr128 = new java.lang.Object[1];
                                                                                    c("㬪嬥ﯚᮏ먽\udaff窚饯㧮妊\uf814ᣬ뢃\udf5b翡鿷", 24659 - android.text.TextUtils.getOffsetBefore(str4, 0), objArr128);
                                                                                    java.lang.String intern43 = ((java.lang.String) objArr128[0]).intern();
                                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0010\u0005\u0003\u0012\u0000#!\u000b㘧㘧\u001d\u0005\u0004\u0006\u0007\u0016㗝", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24, (byte) (39 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr129);
                                                                                    java.lang.String intern44 = ((java.lang.String) objArr129[0]).intern();
                                                                                    java.lang.Object[] objArr130 = new java.lang.Object[1];
                                                                                    c("㬪瞑ꊲ\uddc3࣭믣\uf602ⅻ居轸㩪皆ꇾ", android.graphics.Color.red(0) + 19687, objArr130);
                                                                                    java.lang.String intern45 = ((java.lang.String) objArr130[0]).intern();
                                                                                    java.lang.Object[] objArr131 = new java.lang.Object[1];
                                                                                    c("㬪䫝\ud82c湰ﶞ̆酢⃐뙂", (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29101, objArr131);
                                                                                    java.lang.String intern46 = ((java.lang.String) objArr131[0]).intern();
                                                                                    java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                                                    c("㬪ꎃચ\uf1f5墳장껕ᖙ", android.view.KeyEvent.getDeadChar(0, 0) + 39157, objArr132);
                                                                                    java.lang.String[] strArr8 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr132[0]).intern()};
                                                                                    for (int i27 = 0; i27 < 12; i27++) {
                                                                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                                        sb.append(strArr8[i27]);
                                                                                        java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                                                        c("㭶\ueacd", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 53693, objArr133);
                                                                                        sb.append(((java.lang.String) objArr133[0]).intern());
                                                                                        java.lang.Object[] objArr134 = {sb.toString()};
                                                                                        java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                                        if (obj32 == null) {
                                                                                            java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf(str4, str4, 0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3160, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 33100));
                                                                                            byte b42 = $$a[14];
                                                                                            java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                                                            a(b42, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (b42 - 1), objArr135);
                                                                                            obj32 = cls29.getMethod((java.lang.String) objArr135[0], java.lang.String.class);
                                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj32);
                                                                                        }
                                                                                        long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).longValue();
                                                                                        long j36 = ~longValue12;
                                                                                        long j37 = ~(j | (-877046625) | longValue12);
                                                                                        long j38 = 1872481528 + ((471 * longValue12) - 413088960375L) + ((longValue12 | (-877046625)) * (-470)) + (((~(j36 | j2)) | (~(877046624 | j36)) | j37) * (-470)) + (((~((-877046625) | j36 | j2)) | j37) * 470);
                                                                                        if (((((int) j38) & ((((578082056 | i12) * (-757)) - 1040654772) + ((~(2055208890 | i)) * 1514) + (((~(2015308466 | i12)) | 39900424 | (~((-1477126835) | i))) * 757))) | (((int) (j38 >> 32)) & ((((~(682460114 | i12)) | (-754832347)) * 529) + 1520786966 + (((~(682460114 | i)) | (-754766297)) * 529)))) != 0) {
                                                                                            i6 = i27 + 110;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (str14.contains(strArr7[i26])) {
                                                                                        break;
                                                                                    }
                                                                                    i26++;
                                                                                }
                                                                            }
                                                                        }
                                                                        i6 = 0;
                                                                        if (i6 != 0) {
                                                                            java.lang.Object[] objArr136 = {new int[]{i}, new int[]{i6 ^ i}, null, new int[1]};
                                                                            java.lang.Object[] objArr137 = {-275039665, 16, java.lang.Integer.valueOf(((~(i | (-226367041))) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING) + 719721359 + (((~((-226367041) | i12)) | 847350032) * androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING))};
                                                                            java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj33 == null) {
                                                                                java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 50, (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                                                java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr138);
                                                                                obj33 = cls30.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                                            }
                                                                            ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).intValue();
                                                                            return objArr136;
                                                                        }
                                                                        long[] jArr = {472001035};
                                                                        java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                                        c("㬪쀀춝줵횲퉣\udfc8\udb53\ue0c1\uec7e\ue9b8\uf56f\uf216ﾁ\ufb0d肪谦", 64373 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr139);
                                                                        try {
                                                                            bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(((java.lang.String) objArr139[0]).intern()));
                                                                            j5 = 0;
                                                                        } catch (java.io.IOException unused2) {
                                                                            bufferedInputStream = null;
                                                                        } catch (java.lang.Throwable th5) {
                                                                            th = th5;
                                                                            bufferedInputStream = null;
                                                                        }
                                                                        while (true) {
                                                                            try {
                                                                                int read = bufferedInputStream.read();
                                                                                if (read != -1) {
                                                                                    j5 = ((j5 << 5) ^ read) & kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK;
                                                                                    int i28 = 0;
                                                                                    while (i28 <= 0) {
                                                                                        if (j5 == jArr[i28]) {
                                                                                            int i29 = getAid + 19;
                                                                                            SdkCoreAlternateContactlessPaymentDataImpl = i29 % 128;
                                                                                            if (i29 % 2 == 0) {
                                                                                                i28++;
                                                                                            }
                                                                                            try {
                                                                                                bufferedInputStream.close();
                                                                                            } catch (java.lang.Exception unused3) {
                                                                                            }
                                                                                            if (i28 != 0) {
                                                                                                i7 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                                                                                            }
                                                                                        } else {
                                                                                            i28++;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } catch (java.io.IOException unused4) {
                                                                            } catch (java.lang.Throwable th6) {
                                                                                th = th6;
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
                                                                                bufferedInputStream.close();
                                                                                break;
                                                                            } catch (java.lang.Exception unused6) {
                                                                            }
                                                                        }
                                                                        i7 = 0;
                                                                        if (i7 != 0) {
                                                                            java.lang.Object[] objArr140 = {new int[]{i}, new int[]{i7 ^ i}, null, new int[1]};
                                                                            java.lang.Object[] objArr141 = {-275039665, 16, java.lang.Integer.valueOf((((~((-932685362) | i12)) | (~(223359841 | i12))) * (-867)) + 1514227164 + (((~((-932685362) | i)) | 847741968 | (~(223359841 | i))) * (-1734)) + (((~(i | (-84943394))) | (~((-847741969) | i12)) | (~(1071101809 | i))) * 867))};
                                                                            java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj34 == null) {
                                                                                java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, (-16774503) - android.graphics.Color.rgb(0, 0, 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                java.lang.Object[] objArr142 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr142);
                                                                                obj34 = cls31.getMethod((java.lang.String) objArr142[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj34);
                                                                            }
                                                                            ((int[]) objArr140[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj34).invoke(null, objArr141)).intValue();
                                                                            return objArr140;
                                                                        }
                                                                        long[] jArr2 = {472001035};
                                                                        java.lang.Object[] objArr143 = new java.lang.Object[1];
                                                                        b("\u0016\u0003\"\u0002\u0013\u0003\u0003\u0016\u0000\"\t\u001a\u000b\u000f!\u0013\u0010\u0006\t\u001a \u0002", (-16777194) - android.graphics.Color.rgb(0, 0, 0), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54), objArr143);
                                                                        java.lang.Object[] objArr144 = {((java.lang.String) objArr143[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                                        java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                        if (obj35 == null) {
                                                                            java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 11, 3096 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            byte b43 = $$a[14];
                                                                            byte b44 = (byte) (b43 - 1);
                                                                            java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                                            a(b44, b44, b43, objArr145);
                                                                            obj35 = cls32.getMethod((java.lang.String) objArr145[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj35);
                                                                        }
                                                                        long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj35).invoke(null, objArr144)).longValue();
                                                                        long j39 = ~((~longValue13) | (-559108842));
                                                                        long j40 = (((((522 * longValue13) + 290736597840L) + ((~((559108841 | longValue13) | j2)) * 521)) + ((-1042) * j39)) + (((~((j | 559108841) | longValue13)) | j39) * 521)) - 1351539068;
                                                                        int i30 = (~((-1153285823) | i)) | 11310764;
                                                                        if (((((int) (j40 >> 32)) & ((i30 * 992) + 1537498186 + ((i30 | (~(1425915646 | i12))) * (-496)) + ((283940588 | i) * 496))) | (((int) j40) & ((((~(2055265400 | i12)) | (~((-618038991) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 2124284551 + (((~((-545293385) | i12)) | (~(2128011006 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)))) != 0) {
                                                                            SdkCoreAlternateContactlessPaymentDataImpl = (getAid + 35) % 128;
                                                                            java.lang.Object[] objArr146 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                                            int i31 = ~(409118013 | i12);
                                                                            java.lang.Object[] objArr147 = {-275039665, 16, java.lang.Integer.valueOf((((~((-409118014) | i)) | (~(300207506 | i12)) | i31) * (-516)) + 1072572283 + (((~(i | (-274760977))) | (~((-25446531) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + ((25446530 | i31) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR))};
                                                                            java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj36 == null) {
                                                                                java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str4, 0, 0) + 50, android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) android.view.View.resolveSize(0, 0));
                                                                                java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr148);
                                                                                obj36 = cls33.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj36);
                                                                            }
                                                                            ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj36).invoke(null, objArr147)).intValue();
                                                                            return objArr146;
                                                                        }
                                                                        java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                                        if (obj37 == null) {
                                                                            java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 30, 1890 - android.graphics.Color.argb(0, 0, 0, 0), (char) (android.graphics.Color.blue(0) + 3600));
                                                                            byte b45 = $$a[14];
                                                                            byte b46 = (byte) (b45 - 1);
                                                                            java.lang.Object[] objArr149 = new java.lang.Object[1];
                                                                            a(b46, b46, b45, objArr149);
                                                                            obj37 = cls34.getMethod((java.lang.String) objArr149[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj37);
                                                                        }
                                                                        long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj37).invoke(null, null)).longValue();
                                                                        long j41 = ~longValue14;
                                                                        long j42 = (((((46 * longValue14) - 77292813070L) + (((~(j41 | j)) | (-1680278545)) * (-90))) + (((~(longValue14 | (-1680278545))) | (~(j41 | j2))) * (-45))) + ((((~(j2 | 1680278544)) | j41) | (~(j | (-1680278545)))) * 45)) - 198969835;
                                                                        if (((((int) (j42 >> 32)) & ((((((~((-986778091) | i)) | (~((-450448321) | i12))) | (~(986778090 | i12))) * 959) - 526986455) + (((~((-986778091) | i12)) | (~((-450448321) | i)) | (~(986778090 | i))) * 959))) | (((int) j42) & ((((((~(2101843901 | i12)) | (-664617492)) * (-933)) - 1270361184) + (((~((-664617492) | i12)) | 621085201) * 933)) - 1431602212))) != 0) {
                                                                            java.lang.Object[] objArr150 = {new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i7}, null, new int[1]};
                                                                            java.lang.Object[] objArr151 = {-275039665, 16, java.lang.Integer.valueOf((((~(509908077 | i)) | 25315842) * (-140)) + 449817549 + ((~(535223919 | i)) * 70) + (((~(i | 199417442)) | 361122319) * 70))};
                                                                            java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj38 == null) {
                                                                                java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.indexOf(str4, str4), android.graphics.Color.alpha(0) + 2713, (char) android.graphics.Color.alpha(0));
                                                                                java.lang.Object[] objArr152 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr152);
                                                                                obj38 = cls35.getMethod((java.lang.String) objArr152[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj38);
                                                                            }
                                                                            ((int[]) objArr150[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj38).invoke(null, objArr151)).intValue();
                                                                            return objArr150;
                                                                        }
                                                                        java.lang.Object[] objArr153 = {2};
                                                                        java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                                        if (obj39 == null) {
                                                                            java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.graphics.Color.red(0), 2364 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) ((-1) - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                                            byte b47 = $$a[14];
                                                                            byte b48 = (byte) (b47 - 1);
                                                                            java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                                            a(b48, b48, b47, objArr154);
                                                                            obj39 = cls36.getMethod((java.lang.String) objArr154[0], java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj39);
                                                                        }
                                                                        long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj39).invoke(null, objArr153)).longValue();
                                                                        long j43 = ~longValue15;
                                                                        long j44 = ~(349717503 | longValue15);
                                                                        long j45 = (longValue15 * 371) + 129745193613L + (((~(j43 | j)) | (~(j2 | (-349717504)))) * (-370)) + (((~(j43 | j2)) | (~(j | (-349717504))) | j44) * (-370)) + (j44 * 370) + 1058192696;
                                                                        if (((((int) j45) & ((((~((-1405303835) | i12)) | (~(1452437051 | i))) * com.visa.cbp.getCertUsage.getODAData) + 1373233295 + (((~((-1405303835) | i)) | (~(1452437051 | i12))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) (j45 >> 32)) & ((((((~((-1961699231) | i)) | 1621960204) | r6) * (-470)) - 745656398) + (((~((-184733794) | i12)) | (~((-339739027) | i))) * 470)))) == 2) {
                                                                            java.lang.Object[] objArr155 = {new int[]{i}, new int[]{i ^ 270}, null, new int[1]};
                                                                            java.lang.Object[] objArr156 = {-275039665, 16, java.lang.Integer.valueOf(((((~((-91817920) | i)) | 19989679) * (-566)) - 861418055) + ((~(i | (-71828241))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                                                                            java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj40 == null) {
                                                                                java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) android.view.KeyEvent.keyCodeFromString(str4));
                                                                                java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr157);
                                                                                obj40 = cls37.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj40);
                                                                            }
                                                                            ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj40).invoke(null, objArr156)).intValue();
                                                                            return objArr155;
                                                                        }
                                                                        java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                                        if (obj41 == null) {
                                                                            java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40, (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 3197, (char) (android.os.Process.getGidForName(str4) + 1));
                                                                            byte b49 = $$a[14];
                                                                            java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                                            a(b49, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (b49 - 1), objArr158);
                                                                            obj41 = cls38.getMethod((java.lang.String) objArr158[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj41);
                                                                        }
                                                                        long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj41).invoke(null, null)).longValue();
                                                                        long j46 = ~(1633884306 | longValue16);
                                                                        long j47 = ~longValue16;
                                                                        long j48 = ~((-1633884307) | j47);
                                                                        long j49 = (longValue16 * 263) + 854521492561L + (((~(j47 | j2)) | j46 | j48) * 262) + ((-786) * j48) + (((~(j47 | j)) | j46 | j48) * 262) + 1730129668;
                                                                        if (((((int) (j49 >> 32)) & ((((((~(1985928235 | i)) | (-2013191724)) * 1504) - 1320242614) + ((~((-27263489) | i)) * (-1504))) - 1649089056)) | (((int) j49) & ((((((~(1432731039 | i12)) | (~((-86057985) | i))) | (~((-1342177686) | i))) * 765) - 2057912972) + (((~(1346673055 | i12)) | (-1432731040)) * 1530) + (((~(1346673055 | i)) | (~((-1342177686) | i12))) * 765)))) != 0) {
                                                                            java.lang.Object[] objArr159 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr160 = {-275039665, 16, java.lang.Integer.valueOf(((~(165777373 | i12)) * (-560)) + 1807560895 + ((~(i | (-537157667))) * (-560)) + (((~(543548146 | i12)) | 159386893) * 560))};
                                                                            java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj42 == null) {
                                                                                java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 2713, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                                                java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr161);
                                                                                obj42 = cls39.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj42);
                                                                            }
                                                                            ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj42).invoke(null, objArr160)).intValue();
                                                                            return objArr159;
                                                                        }
                                                                        java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                                        if (obj43 == null) {
                                                                            java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), android.text.TextUtils.indexOf(str4, str4, 0, 0) + 3197, (char) (android.widget.ExpandableListView.getPackedPositionChild(0L) + 1));
                                                                            byte b50 = $$a[14];
                                                                            byte b51 = (byte) (b50 - 1);
                                                                            java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                                            a(b51, b51, b50, objArr162);
                                                                            obj43 = cls40.getMethod((java.lang.String) objArr162[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj43);
                                                                        }
                                                                        long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj43).invoke(null, null)).longValue();
                                                                        long j50 = ~longValue17;
                                                                        long j51 = ((185 * longValue17) - 130189416774L) + (((-711417579) | longValue17) * (-368)) + ((711417578 | j50 | j) * 184) + (((~(longValue17 | 711417578)) | (~(j50 | (-711417579))) | (~(j | 711417578))) * 184) + 241452312;
                                                                        if (((((int) (j51 >> 32)) & ((((1438116565 | i12) * 1444) - 1153123274) + (((~(1975066946 | i)) | 445077 | (~((-537840536) | i))) * (-1444)) + 1061924980)) | (((int) j51) & (((((~((-1447405848) | i)) | 39168041) * 398) - 805496155) + (((~((-1447405848) | i12)) | 39168041) * 398)))) != 0) {
                                                                            java.lang.Object[] objArr163 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                                            int i32 = ~(i | 611633714);
                                                                            java.lang.Object[] objArr164 = {-275039665, 16, java.lang.Integer.valueOf((((-97691806) | i32) * (-220)) + 1408360661 + ((i32 | (-636938944)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 1971218226)};
                                                                            java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj44 == null) {
                                                                                java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.Process.myPid() >> 22), 2713 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                                                java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr165);
                                                                                obj44 = cls41.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj44);
                                                                            }
                                                                            ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj44).invoke(null, objArr164)).intValue();
                                                                            return objArr163;
                                                                        }
                                                                        java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                                        if (obj45 == null) {
                                                                            java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionGroup(0L) + 44, 2836 - android.view.View.combineMeasuredStates(0, 0), (char) (android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                                                            byte b52 = $$a[14];
                                                                            byte b53 = (byte) (b52 - 1);
                                                                            java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                                            a(b53, b53, b52, objArr166);
                                                                            obj45 = cls42.getMethod((java.lang.String) objArr166[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj45);
                                                                        }
                                                                        long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj45).invoke(null, null)).longValue();
                                                                        long j52 = ~longValue18;
                                                                        long j53 = (-369111179) | j52;
                                                                        long j54 = ((((((-764) * longValue18) - 564370991162L) + ((((~(j53 | j)) | (~((longValue18 | (-369111179)) | j2))) | (~((369111178 | j52) | j2))) * 765)) + (((~j53) | (~(j | (-369111179)))) * 1530)) + (((~(j2 | (-369111179))) | (~(369111178 | (j52 | j)))) * 765)) - 1175405933;
                                                                        if (((((int) (j54 >> 32)) & (((((~((-1575862051) | i12)) | (-138635640)) * 226) - 2055567968) + (((~(138635639 | i)) | (-1576009592) | (~((-138488099) | i12))) * (-113)) + ((~((-1575862051) | i)) * 113))) | (((int) j54) & (((((~((-920188073) | i)) | 517038337) * (-465)) - 456151831) + (((~(517038337 | i)) | (-920188073)) * 930) + (((-537433257) | i) * 465)))) != 0) {
                                                                            java.lang.Object[] objArr167 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr168 = {-275039665, 16, java.lang.Integer.valueOf(((402795827 | i12) * (-757)) + 568345682 + ((~((-38092941) | i)) * 1514) + (((~(i | 440888767)) | (~((-306529693) | i12)) | 268436752) * 757))};
                                                                            java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj46 == null) {
                                                                                java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 50, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2712, (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                                                java.lang.Object[] objArr169 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr169);
                                                                                obj46 = cls43.getMethod((java.lang.String) objArr169[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj46);
                                                                            }
                                                                            ((int[]) objArr167[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj46).invoke(null, objArr168)).intValue();
                                                                            return objArr167;
                                                                        }
                                                                        long[] jArr3 = {624887784092251L};
                                                                        java.lang.Object[] objArr170 = new java.lang.Object[1];
                                                                        c("㬪쀀춝줵횲퉣\udfc8\udb53\ue0c1\uec7e\ue9b8\uf56f\uf216ﾁ\ufb0d肪谦", 64373 - android.view.View.combineMeasuredStates(0, 0), objArr170);
                                                                        java.lang.Object[] objArr171 = {((java.lang.String) objArr170[0]).intern(), 3, 2251799813685247L, jArr3};
                                                                        java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                                        if (obj47 == null) {
                                                                            java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3096 - android.text.TextUtils.getCapsMode(str4, 0, 0), (char) android.text.TextUtils.indexOf(str4, str4, 0, 0));
                                                                            byte b54 = $$a[14];
                                                                            byte b55 = (byte) (b54 - 1);
                                                                            java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                                            a(b55, b55, b54, objArr172);
                                                                            obj47 = cls44.getMethod((java.lang.String) objArr172[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj47);
                                                                        }
                                                                        long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj47).invoke(null, objArr171)).longValue();
                                                                        long j55 = ~((~longValue19) | (-1166385436));
                                                                        long j56 = ~(j2 | (-1166385436));
                                                                        long j57 = ((((((-657) * longValue19) - 768648002324L) + ((((~(longValue19 | 1166385435)) | j55) | j56) * (-658))) + (658 * j55)) + ((j55 | j56) * 658)) - 744262474;
                                                                        if (((((int) (j57 >> 32)) & ((((~(1907832543 | i12)) | (-949908342)) * (-602)) + 2091076814 + (((~(1907832543 | i)) | (-2042591232) | (~((-815149654) | i12))) * (-301)) + ((~((-949908342) | i12)) * 301))) | (((int) j57) & ((((~(979790126 | i)) | (-1877950760)) * (-465)) + 817248610 + (((~((-1877950760) | i)) | 979790126) * 930) + (((-1166606338) | i) * 465)))) != 0) {
                                                                            java.lang.Object[] objArr173 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr174 = {-275039665, 16, java.lang.Integer.valueOf((((~((-4822113) | i12)) | (~((-9715715) | i)) | (~((-689965582) | i))) * 765) + 1004647778 + (((~((-14537827) | i12)) | 4822112) * 1530) + (((~(i | (-14537827))) | (~((-689965582) | i12))) * 765))};
                                                                            java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj48 == null) {
                                                                                java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 49, 2713 - (android.os.Process.myTid() >> 22), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                                                java.lang.Object[] objArr175 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr175);
                                                                                obj48 = cls45.getMethod((java.lang.String) objArr175[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj48);
                                                                            }
                                                                            ((int[]) objArr173[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj48).invoke(null, objArr174)).intValue();
                                                                            return objArr173;
                                                                        }
                                                                        java.lang.Object[] objArr176 = new java.lang.Object[1];
                                                                        c("㬪턐\uef82萠鋮꽊䗚創棤ڏጄ", 60017 - android.text.TextUtils.getOffsetAfter(str4, 0), objArr176);
                                                                        java.lang.Object[] objArr177 = {((java.lang.String) objArr176[0]).intern()};
                                                                        java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                                        if (obj49 == null) {
                                                                            java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 37, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3160, (char) (33098 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))));
                                                                            byte b56 = $$a[14];
                                                                            java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                                            a(b56, androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, (byte) (b56 - 1), objArr178);
                                                                            obj49 = cls46.getMethod((java.lang.String) objArr178[0], java.lang.String.class);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj49);
                                                                        }
                                                                        long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj49).invoke(null, objArr177)).longValue();
                                                                        long j58 = ~longValue20;
                                                                        long j59 = ~(j | 132816253);
                                                                        long j60 = ((713 * longValue20) - 94432355883L) + (((~(j58 | 132816253)) | j59) * (-712)) + (((~(j58 | j | 132816253)) | (~(longValue20 | 132816253 | j2))) * (-712)) + ((j58 | j59) * 712) + 862618650;
                                                                        if (((((int) (j60 >> 32)) & ((((-2125397952) | i) * 988) + 197357798 + (((~((-478324501) | i12)) | 268477460) * (-1976)) + (((~((-1915550912) | i)) | (-2125397952) | (~(1915550911 | i12))) * 988))) | (((int) j60) & (((((~((-143149156) | i)) | 134219777) * (-283)) - 2107735184) + ((~((-8929379) | i)) * 283)))) != 0) {
                                                                            java.lang.Object[] objArr179 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr180 = {-275039665, 16, java.lang.Integer.valueOf(((((~((-488764482) | i)) | 268468289) * (-566)) - 1956445563) + ((~(i | (-220296193))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
                                                                            java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj50 == null) {
                                                                                java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 50, 2713 - android.graphics.Color.red(0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                                                                                java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr181);
                                                                                obj50 = cls47.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj50);
                                                                            }
                                                                            ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj50).invoke(null, objArr180)).intValue();
                                                                            return objArr179;
                                                                        }
                                                                        java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                                        if (obj51 == null) {
                                                                            java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), 2185 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 59513));
                                                                            byte b57 = $$a[14];
                                                                            byte b58 = (byte) (b57 - 1);
                                                                            java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                                            a(b58, b58, b57, objArr182);
                                                                            obj51 = cls48.getMethod((java.lang.String) objArr182[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj51);
                                                                        }
                                                                        long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj51).invoke(null, null)).longValue();
                                                                        long j61 = ~longValue21;
                                                                        long j62 = ~(j | 706449366 | longValue21);
                                                                        long j63 = (-1578539952) + (471 * longValue21) + 332737651386L + ((longValue21 | 706449366) * (-470)) + (((~((-706449367) | j61)) | (~(j61 | j2)) | j62) * (-470)) + (((~(706449366 | j61 | j2)) | j62) * 470);
                                                                        int i33 = ~(1072256088 | i12);
                                                                        if (((((int) j63) & (((1785484797 | i33) * 764) + 806101725 + (((~(1785484797 | i12)) | 360775680) * (-1528)) + ((i33 | 1434780069) * 764))) | (((int) (j63 >> 32)) & (((((-1443694029) | i12) * (-490)) - 640652170) + (((~(24311857 | i)) | (-1468005886)) * 490) + 1105786622))) != 0) {
                                                                            java.lang.Object[] objArr183 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr184 = {-275039665, 16, java.lang.Integer.valueOf(((532004287 | i12) * (-369)) + 457436974 + (((~((-177323285) | i12)) | 532002235) * (-369)) + (((~(i | 177323284)) | 354681003 | (~(i12 | (-2053)))) * 369))};
                                                                            java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj52 == null) {
                                                                                java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getTapTimeout() >> 16) + 50, 2712 - android.text.TextUtils.lastIndexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                                                java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr185);
                                                                                obj52 = cls49.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj52);
                                                                            }
                                                                            ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj52).invoke(null, objArr184)).intValue();
                                                                            return objArr183;
                                                                        }
                                                                        java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                                        if (obj53 == null) {
                                                                            java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 36, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 2972, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1));
                                                                            byte b59 = $$a[14];
                                                                            byte b60 = (byte) (b59 - 1);
                                                                            java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                                            a(b60, b60, b59, objArr186);
                                                                            obj53 = cls50.getMethod((java.lang.String) objArr186[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj53);
                                                                        }
                                                                        long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj53).invoke(null, null)).longValue();
                                                                        long j64 = longValue22 | j2;
                                                                        long j65 = ((((((-929) * longValue22) + 422329110736L) + ((910192048 | (~j64)) * (-465))) + ((longValue22 | (~(j2 | 910192048))) * 930)) + ((910192048 | j64) * 465)) - 942509715;
                                                                        if (((((int) (j65 >> 32)) & (((((~((-87299) | i12)) | (~((-573046801) | i12))) * (-184)) - 1019427974) + (((~(1715350193 | i12)) | (-1715437492) | (~(1142390691 | i12))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + 269573008)) | (((int) j65) & (((((~((-2079168781) | i12)) | 1504483340) * 529) - 1520785380) + (((~((-2079168781) | i)) | (-641942371)) * 529)))) != 0) {
                                                                            java.lang.Object[] objArr187 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr188 = {-275039665, 16, java.lang.Integer.valueOf((((~((-474032750) | i)) | 272704013 | (~(235292770 | i))) * (-754)) + 330643253 + (((~(i | (-272704014))) | (~(507996783 | i12))) * (-754)) + (((-474032750) | i12) * 754))};
                                                                            java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj54 == null) {
                                                                                java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 50, 2713 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                                java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr189);
                                                                                obj54 = cls51.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj54);
                                                                            }
                                                                            ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj54).invoke(null, objArr188)).intValue();
                                                                            return objArr187;
                                                                        }
                                                                        java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                                        if (obj55 == null) {
                                                                            java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 2159 - android.graphics.Color.alpha(0), (char) (56400 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))));
                                                                            byte b61 = $$a[14];
                                                                            byte b62 = (byte) (b61 - 1);
                                                                            java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                                            a(b62, b62, b61, objArr190);
                                                                            obj55 = cls52.getMethod((java.lang.String) objArr190[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj55);
                                                                        }
                                                                        long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj55).invoke(null, null)).longValue();
                                                                        long j66 = ~((~longValue23) | j2);
                                                                        long j67 = ((((((-574) * longValue23) - 719827039050L) + (((~(j | (-1254054076))) | j66) * 1150)) + (((~(j | longValue23)) | j66) * (-575))) + (((~(j2 | (-1254054076))) | (~(j | 1254054075))) * 575)) - 1819872095;
                                                                        if (((((int) (j67 >> 32)) & ((((~((-173244588) | i)) | (~((-1610470999) | i12))) * com.visa.cbp.getCertUsage.getODAData) + 165423453 + (((~((-1610470999) | i)) | (~((-173244588) | i12))) * com.visa.cbp.getCertUsage.getODAData))) | (((int) j67) & (((~((-1216094728) | i12)) * (-560)) + 1691297605 + ((~((-1078984710) | i)) * (-560)) + (((~((-221131683) | i12)) | 84021664) * 560)))) != 0) {
                                                                            java.lang.Object[] objArr191 = {new int[]{i}, new int[]{i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                                            java.lang.Object[] objArr192 = {-275039665, 16, java.lang.Integer.valueOf((((~((-430817915) | i)) | (-278507606)) * (-318)) + 1899363525 + (((~((-278507606) | i)) | (~(431878783 | i12))) * 318) + (((~(i | 431878783)) | (~((-1060870) | i12))) * 318))};
                                                                            java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj56 == null) {
                                                                                java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2714, (char) android.view.View.resolveSize(0, 0));
                                                                                java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r2[14], objArr193);
                                                                                obj56 = cls53.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj56);
                                                                            }
                                                                            ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj56).invoke(null, objArr192)).intValue();
                                                                            return objArr191;
                                                                        }
                                                                        java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                                        if (obj57 == null) {
                                                                            java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 838, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                                                            byte b63 = $$a[14];
                                                                            byte b64 = (byte) (b63 - 1);
                                                                            java.lang.Object[] objArr194 = new java.lang.Object[1];
                                                                            a(b64, b64, b63, objArr194);
                                                                            obj57 = cls54.getMethod((java.lang.String) objArr194[0], null);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj57);
                                                                        }
                                                                        long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj57).invoke(null, null)).longValue();
                                                                        long j68 = ~((~longValue24) | 517154976);
                                                                        long j69 = ~(j2 | 517154976);
                                                                        long j70 = ((-657) * longValue24) + 340805129184L + (((~(longValue24 | (-517154977))) | j68 | j69) * (-658)) + (658 * j68) + ((j68 | j69) * 658) + 1443597926;
                                                                        int i34 = (-1252143238) | i12;
                                                                        if (((((int) (j70 >> 32)) & ((((~i34) | (-1605597648)) * (-828)) + 1754752898 + (i34 * (-828)) + 1687481900)) | (((int) j70) & (((((~(294442953 | i12)) | (~(1142783456 | i12))) * (-867)) - 1972008908) + (((~(294442953 | i)) | (-1436418026) | (~(1142783456 | i))) * (-1734)) + (((~(1436418025 | i12)) | (~((-1141975073) | i)) | (~((-293634570) | i))) * 867)))) != 0) {
                                                                            int i35 = getAid + 91;
                                                                            SdkCoreAlternateContactlessPaymentDataImpl = i35 % 128;
                                                                            i8 = i35 % 2 != 0 ? i ^ 29704 : i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE;
                                                                        } else {
                                                                            i8 = i;
                                                                        }
                                                                        if (i8 != i) {
                                                                            java.lang.Object[] objArr195 = {new int[]{i}, new int[]{i8}, null, new int[1]};
                                                                            java.lang.Object[] objArr196 = {-275039665, 16, java.lang.Integer.valueOf((((~((-335833456) | i12)) | (-373492065) | (~(335833455 | i))) * (-564)) + 944706523 + ((~(i | (-37945345))) * 1128) + (((~((-373492065) | i12)) | (-373778800)) * 564))};
                                                                            java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj58 == null) {
                                                                                java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.Color.blue(0), android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2665, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                                                java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr197);
                                                                                obj58 = cls55.getMethod((java.lang.String) objArr197[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj58);
                                                                            }
                                                                            ((int[]) objArr195[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj58).invoke(null, objArr196)).intValue();
                                                                            java.lang.Object[] objArr198 = {objArr195};
                                                                            java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                                            if (obj59 == null) {
                                                                                java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 52, android.graphics.Color.green(0) + 3237, (char) android.view.KeyEvent.getDeadChar(0, 0));
                                                                                java.lang.Object[] objArr199 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r5[14], objArr199);
                                                                                obj59 = cls56.getMethod((java.lang.String) objArr199[0], java.lang.Object[].class);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj59);
                                                                            }
                                                                            ((java.lang.reflect.Method) obj59).invoke(obj, objArr198);
                                                                            return objArr195;
                                                                        }
                                                                        java.lang.Object[] objArr200 = {java.lang.Integer.valueOf(i), obj, -275039665, 0};
                                                                        java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                                        if (obj60 == null) {
                                                                            obj60 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.normalizeMetaState(0) + 30, (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 3288, (char) android.text.TextUtils.indexOf(str4, str4, 0, 0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 52, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3237, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj60);
                                                                        }
                                                                        java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj60).newInstance(objArr200);
                                                                        try {
                                                                            java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                                            c("㭯鼑玙혻\uaaffഠ\ue1da䑘ᣊ\uf336埃⩪踋抑씂馺", android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 42102, objArr201);
                                                                            java.lang.Class<?> cls57 = java.lang.Class.forName(((java.lang.String) objArr201[0]).intern());
                                                                            java.lang.Object[] objArr202 = new java.lang.Object[1];
                                                                            b("\u0001\u0016\f\u0006㘅", 5 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (byte) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 22), objArr202);
                                                                            cls57.getMethod(((java.lang.String) objArr202[0]).intern(), null).invoke(newInstance, null);
                                                                            java.lang.Object[] objArr203 = {new int[]{i}, new int[]{i}, null, new int[1]};
                                                                            int i36 = ~(399760839 | i12);
                                                                            java.lang.Object[] objArr204 = {-275039665, 0, java.lang.Integer.valueOf((((~((-309564681) | i12)) | 307467520 | (~((-399760840) | i12)) | (~(401857999 | i))) * (-84)) + 163126971 + (((~(i | (-399760840))) | 309564680 | i36) * (-84)) + (((-401858000) | i36) * 84))};
                                                                            java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                            if (obj61 == null) {
                                                                                java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 2713 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
                                                                                java.lang.Object[] objArr205 = new java.lang.Object[1];
                                                                                a((byte) (-$$a[16]), 653, r3[14], objArr205);
                                                                                obj61 = cls58.getMethod((java.lang.String) objArr205[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj61);
                                                                            }
                                                                            ((int[]) objArr203[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj61).invoke(null, objArr204)).intValue();
                                                                            return objArr203;
                                                                        } catch (java.lang.Throwable th7) {
                                                                            java.lang.Throwable cause4 = th7.getCause();
                                                                            if (cause4 != null) {
                                                                                throw cause4;
                                                                            }
                                                                            throw th7;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th8) {
                                                                    java.lang.Throwable cause5 = th8.getCause();
                                                                    if (cause5 != null) {
                                                                        throw cause5;
                                                                    }
                                                                    throw th8;
                                                                }
                                                            }
                                                        }
                                                        i5 = 0;
                                                        if (i5 == 0) {
                                                        }
                                                    }
                                                }
                                                if (invoke5 != null) {
                                                    java.lang.Object[] objArr206 = {invoke5, 42};
                                                    java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                                    if (obj62 == null) {
                                                        java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28, 2594 - android.text.TextUtils.getTrimmedLength(str10), (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8));
                                                        byte b65 = $$a[14];
                                                        byte b66 = (byte) (b65 - 1);
                                                        java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                        a(b66, b66, b65, objArr207);
                                                        obj62 = cls59.getMethod((java.lang.String) objArr207[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj62);
                                                    }
                                                    long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj62).invoke(null, objArr206)).longValue();
                                                    long j71 = ~((-269745231) | longValue25);
                                                    long j72 = ~longValue25;
                                                    str5 = str10;
                                                    long j73 = 987355294 + ((-613) * longValue25) + 165893316450L + ((j6 | j71 | (~(j72 | 269745230))) * 614) + (((~(j | (-269745231))) | j71 | (~(j | longValue25))) * (-1228)) + (((~(longValue25 | j | 269745230)) | (~((-269745231) | j72 | j))) * 614);
                                                    if (((((int) j73) & (((2080012271 | i) * (-381)) + 1369059638 + (((~(468721989 | i12)) | 1785354154) * 381) + 2084274128)) | (((int) (j73 >> 32)) & ((((27271296 | i12) * (-192)) - 1788177110) + (((~(771252949 | i12)) | (-2113759232)) * (-384)) + (((~(2113759231 | i)) | (~((-1342506283) | i12)) | (~((-743981654) | i))) * 192)))) != 477111747) {
                                                        j2 = j6;
                                                        str3 = str5;
                                                        i2 = 0;
                                                        java.lang.Object[] objArr712 = new java.lang.Object[1];
                                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr712);
                                                        java.lang.Object[] objArr722 = {((java.lang.String) objArr712[i2]).intern()};
                                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj3 == null) {
                                                        }
                                                        long longValue62 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr722)).longValue();
                                                        long j192 = ((-215) * longValue62) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue62) | j) * (-216)) + ((longValue62 | (~(j | 140210277))) * 216) + 1150329790;
                                                        j3 = (((int) (j192 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j192) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                                        java.lang.Object[] objArr742 = new java.lang.Object[1];
                                                        c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr742);
                                                        java.lang.Object[] objArr752 = {((java.lang.String) objArr742[0]).intern()};
                                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj4 == null) {
                                                        }
                                                        long longValue72 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr752)).longValue();
                                                        long j202 = ~longValue72;
                                                        java.lang.String str122 = str3;
                                                        long j212 = (((-67) * longValue72) - 22281076419L) + (((~(322914150 | j202 | j)) | (~(longValue72 | (-322914151))) | (~(longValue72 | j2))) * (-68)) + ((~(j | 322914150 | longValue72)) * (-68)) + (((~(j202 | j)) | 322914150) * 68) + 1613454218;
                                                        long j222 = (((int) (j212 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j212) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                                        if (j3 > 0) {
                                                        }
                                                        java.lang.Object[] objArr802 = new java.lang.Object[1];
                                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr802);
                                                        java.lang.Object[] objArr812 = {((java.lang.String) objArr802[0]).intern()};
                                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj5 != null) {
                                                        }
                                                        long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr812)).longValue();
                                                        long j232 = ~((-950742289) | longValue82);
                                                        long j242 = ~longValue82;
                                                        long j252 = ~(950742288 | j242);
                                                        long j262 = ((longValue82 * 263) - 497238216624L) + (((~(j242 | j2)) | j232 | j252) * 262) + ((-786) * j252) + (((~(j242 | j)) | j232 | j252) * 262) + 339797779;
                                                        j4 = (((int) j262) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j262 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                                        java.lang.Object[] objArr832 = new java.lang.Object[1];
                                                        c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr832);
                                                        java.lang.Object[] objArr842 = {((java.lang.String) objArr832[0]).intern()};
                                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                        if (obj6 == null) {
                                                        }
                                                        long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr842)).longValue();
                                                        long j272 = 768395910 | longValue92;
                                                        long j282 = (829 * longValue92) + 637000209390L + (((~((~longValue92) | (-768395911))) | (~(longValue92 | j | 768395910))) * (-828)) + ((j272 | j) * (-828)) + ((~j272) * 828) + 522144157;
                                                        int i232 = ~((-1851749727) | i12);
                                                        long j292 = (((int) (j282 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j282) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i232) * 594) + ((i232 | (~((-414523317) | i12)) | 135599380) * 594)));
                                                        if (j4 <= 0) {
                                                        }
                                                        java.lang.Object[] objArr892 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr892);
                                                        java.lang.String intern302 = ((java.lang.String) objArr892[0]).intern();
                                                        java.lang.Object[] objArr902 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr902);
                                                        java.lang.String intern312 = ((java.lang.String) objArr902[0]).intern();
                                                        java.lang.Object[] objArr912 = new java.lang.Object[1];
                                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr912);
                                                        java.lang.String intern322 = ((java.lang.String) objArr912[0]).intern();
                                                        java.lang.Object[] objArr922 = new java.lang.Object[1];
                                                        c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr922);
                                                        java.lang.String intern332 = ((java.lang.String) objArr922[0]).intern();
                                                        java.lang.Object[] objArr932 = new java.lang.Object[1];
                                                        c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr932);
                                                        java.lang.String intern342 = ((java.lang.String) objArr932[0]).intern();
                                                        java.lang.Object[] objArr942 = new java.lang.Object[1];
                                                        c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr942);
                                                        java.lang.String intern352 = ((java.lang.String) objArr942[0]).intern();
                                                        java.lang.Object[] objArr952 = new java.lang.Object[1];
                                                        c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr952);
                                                        strArr = new java.lang.String[]{intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr952[0]).intern()};
                                                        i3 = 0;
                                                        while (true) {
                                                            if (i3 < 7) {
                                                            }
                                                            i3++;
                                                            strArr = strArr2;
                                                        }
                                                        if (i4 == 0) {
                                                        }
                                                    }
                                                    i9 = 0;
                                                    i10 = 0;
                                                    while (i9 < 28) {
                                                    }
                                                    j2 = j6;
                                                    str3 = str5;
                                                    if (i10 >= 25.2d) {
                                                    }
                                                    i2 = 0;
                                                    java.lang.Object[] objArr7122 = new java.lang.Object[1];
                                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr7122);
                                                    java.lang.Object[] objArr7222 = {((java.lang.String) objArr7122[i2]).intern()};
                                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj3 == null) {
                                                    }
                                                    long longValue622 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7222)).longValue();
                                                    long j1922 = ((-215) * longValue622) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue622) | j) * (-216)) + ((longValue622 | (~(j | 140210277))) * 216) + 1150329790;
                                                    j3 = (((int) (j1922 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j1922) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                                    java.lang.Object[] objArr7422 = new java.lang.Object[1];
                                                    c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7422);
                                                    java.lang.Object[] objArr7522 = {((java.lang.String) objArr7422[0]).intern()};
                                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj4 == null) {
                                                    }
                                                    long longValue722 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7522)).longValue();
                                                    long j2022 = ~longValue722;
                                                    java.lang.String str1222 = str3;
                                                    long j2122 = (((-67) * longValue722) - 22281076419L) + (((~(322914150 | j2022 | j)) | (~(longValue722 | (-322914151))) | (~(longValue722 | j2))) * (-68)) + ((~(j | 322914150 | longValue722)) * (-68)) + (((~(j2022 | j)) | 322914150) * 68) + 1613454218;
                                                    long j2222 = (((int) (j2122 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j2122) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                                    if (j3 > 0) {
                                                    }
                                                    java.lang.Object[] objArr8022 = new java.lang.Object[1];
                                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr8022);
                                                    java.lang.Object[] objArr8122 = {((java.lang.String) objArr8022[0]).intern()};
                                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj5 != null) {
                                                    }
                                                    long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8122)).longValue();
                                                    long j2322 = ~((-950742289) | longValue822);
                                                    long j2422 = ~longValue822;
                                                    long j2522 = ~(950742288 | j2422);
                                                    long j2622 = ((longValue822 * 263) - 497238216624L) + (((~(j2422 | j2)) | j2322 | j2522) * 262) + ((-786) * j2522) + (((~(j2422 | j)) | j2322 | j2522) * 262) + 339797779;
                                                    j4 = (((int) j2622) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j2622 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                                    java.lang.Object[] objArr8322 = new java.lang.Object[1];
                                                    c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr8322);
                                                    java.lang.Object[] objArr8422 = {((java.lang.String) objArr8322[0]).intern()};
                                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                                    if (obj6 == null) {
                                                    }
                                                    long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8422)).longValue();
                                                    long j2722 = 768395910 | longValue922;
                                                    long j2822 = (829 * longValue922) + 637000209390L + (((~((~longValue922) | (-768395911))) | (~(longValue922 | j | 768395910))) * (-828)) + ((j2722 | j) * (-828)) + ((~j2722) * 828) + 522144157;
                                                    int i2322 = ~((-1851749727) | i12);
                                                    long j2922 = (((int) (j2822 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j2822) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i2322) * 594) + ((i2322 | (~((-414523317) | i12)) | 135599380) * 594)));
                                                    if (j4 <= 0) {
                                                    }
                                                    java.lang.Object[] objArr8922 = new java.lang.Object[1];
                                                    b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr8922);
                                                    java.lang.String intern3022 = ((java.lang.String) objArr8922[0]).intern();
                                                    java.lang.Object[] objArr9022 = new java.lang.Object[1];
                                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr9022);
                                                    java.lang.String intern3122 = ((java.lang.String) objArr9022[0]).intern();
                                                    java.lang.Object[] objArr9122 = new java.lang.Object[1];
                                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr9122);
                                                    java.lang.String intern3222 = ((java.lang.String) objArr9122[0]).intern();
                                                    java.lang.Object[] objArr9222 = new java.lang.Object[1];
                                                    c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9222);
                                                    java.lang.String intern3322 = ((java.lang.String) objArr9222[0]).intern();
                                                    java.lang.Object[] objArr9322 = new java.lang.Object[1];
                                                    c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9322);
                                                    java.lang.String intern3422 = ((java.lang.String) objArr9322[0]).intern();
                                                    java.lang.Object[] objArr9422 = new java.lang.Object[1];
                                                    c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr9422);
                                                    java.lang.String intern3522 = ((java.lang.String) objArr9422[0]).intern();
                                                    java.lang.Object[] objArr9522 = new java.lang.Object[1];
                                                    c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr9522);
                                                    strArr = new java.lang.String[]{intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9522[0]).intern()};
                                                    i3 = 0;
                                                    while (true) {
                                                        if (i3 < 7) {
                                                        }
                                                        i3++;
                                                        strArr = strArr2;
                                                    }
                                                    if (i4 == 0) {
                                                    }
                                                }
                                            } else {
                                                i19++;
                                                i18 = 0;
                                            }
                                        }
                                        str3 = str10;
                                        j2 = j6;
                                        i2 = i18;
                                        java.lang.Object[] objArr71222 = new java.lang.Object[1];
                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr71222);
                                        java.lang.Object[] objArr72222 = {((java.lang.String) objArr71222[i2]).intern()};
                                        obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                        if (obj3 == null) {
                                        }
                                        long longValue6222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr72222)).longValue();
                                        long j19222 = ((-215) * longValue6222) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue6222) | j) * (-216)) + ((longValue6222 | (~(j | 140210277))) * 216) + 1150329790;
                                        j3 = (((int) (j19222 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j19222) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                        java.lang.Object[] objArr74222 = new java.lang.Object[1];
                                        c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr74222);
                                        java.lang.Object[] objArr75222 = {((java.lang.String) objArr74222[0]).intern()};
                                        obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                        if (obj4 == null) {
                                        }
                                        long longValue7222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr75222)).longValue();
                                        long j20222 = ~longValue7222;
                                        java.lang.String str12222 = str3;
                                        long j21222 = (((-67) * longValue7222) - 22281076419L) + (((~(322914150 | j20222 | j)) | (~(longValue7222 | (-322914151))) | (~(longValue7222 | j2))) * (-68)) + ((~(j | 322914150 | longValue7222)) * (-68)) + (((~(j20222 | j)) | 322914150) * 68) + 1613454218;
                                        long j22222 = (((int) (j21222 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j21222) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                        if (j3 > 0) {
                                        }
                                        java.lang.Object[] objArr80222 = new java.lang.Object[1];
                                        c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr80222);
                                        java.lang.Object[] objArr81222 = {((java.lang.String) objArr80222[0]).intern()};
                                        obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                        if (obj5 != null) {
                                        }
                                        long longValue8222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr81222)).longValue();
                                        long j23222 = ~((-950742289) | longValue8222);
                                        long j24222 = ~longValue8222;
                                        long j25222 = ~(950742288 | j24222);
                                        long j26222 = ((longValue8222 * 263) - 497238216624L) + (((~(j24222 | j2)) | j23222 | j25222) * 262) + ((-786) * j25222) + (((~(j24222 | j)) | j23222 | j25222) * 262) + 339797779;
                                        j4 = (((int) j26222) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j26222 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                        java.lang.Object[] objArr83222 = new java.lang.Object[1];
                                        c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr83222);
                                        java.lang.Object[] objArr84222 = {((java.lang.String) objArr83222[0]).intern()};
                                        obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                        if (obj6 == null) {
                                        }
                                        long longValue9222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr84222)).longValue();
                                        long j27222 = 768395910 | longValue9222;
                                        long j28222 = (829 * longValue9222) + 637000209390L + (((~((~longValue9222) | (-768395911))) | (~(longValue9222 | j | 768395910))) * (-828)) + ((j27222 | j) * (-828)) + ((~j27222) * 828) + 522144157;
                                        int i23222 = ~((-1851749727) | i12);
                                        long j29222 = (((int) (j28222 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j28222) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i23222) * 594) + ((i23222 | (~((-414523317) | i12)) | 135599380) * 594)));
                                        if (j4 <= 0) {
                                        }
                                        java.lang.Object[] objArr89222 = new java.lang.Object[1];
                                        b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr89222);
                                        java.lang.String intern30222 = ((java.lang.String) objArr89222[0]).intern();
                                        java.lang.Object[] objArr90222 = new java.lang.Object[1];
                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr90222);
                                        java.lang.String intern31222 = ((java.lang.String) objArr90222[0]).intern();
                                        java.lang.Object[] objArr91222 = new java.lang.Object[1];
                                        b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr91222);
                                        java.lang.String intern32222 = ((java.lang.String) objArr91222[0]).intern();
                                        java.lang.Object[] objArr92222 = new java.lang.Object[1];
                                        c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr92222);
                                        java.lang.String intern33222 = ((java.lang.String) objArr92222[0]).intern();
                                        java.lang.Object[] objArr93222 = new java.lang.Object[1];
                                        c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr93222);
                                        java.lang.String intern34222 = ((java.lang.String) objArr93222[0]).intern();
                                        java.lang.Object[] objArr94222 = new java.lang.Object[1];
                                        c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr94222);
                                        java.lang.String intern35222 = ((java.lang.String) objArr94222[0]).intern();
                                        java.lang.Object[] objArr95222 = new java.lang.Object[1];
                                        c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr95222);
                                        strArr = new java.lang.String[]{intern30222, intern31222, intern32222, intern33222, intern34222, intern35222, ((java.lang.String) objArr95222[0]).intern()};
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < 7) {
                                            }
                                            i3++;
                                            strArr = strArr2;
                                        }
                                        if (i4 == 0) {
                                        }
                                    }
                                    str3 = str10;
                                    j2 = j6;
                                    i2 = 0;
                                    java.lang.Object[] objArr712222 = new java.lang.Object[1];
                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr712222);
                                    java.lang.Object[] objArr722222 = {((java.lang.String) objArr712222[i2]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long longValue62222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr722222)).longValue();
                                    long j192222 = ((-215) * longValue62222) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue62222) | j) * (-216)) + ((longValue62222 | (~(j | 140210277))) * 216) + 1150329790;
                                    j3 = (((int) (j192222 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j192222) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                    java.lang.Object[] objArr742222 = new java.lang.Object[1];
                                    c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr742222);
                                    java.lang.Object[] objArr752222 = {((java.lang.String) objArr742222[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue72222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr752222)).longValue();
                                    long j202222 = ~longValue72222;
                                    java.lang.String str122222 = str3;
                                    long j212222 = (((-67) * longValue72222) - 22281076419L) + (((~(322914150 | j202222 | j)) | (~(longValue72222 | (-322914151))) | (~(longValue72222 | j2))) * (-68)) + ((~(j | 322914150 | longValue72222)) * (-68)) + (((~(j202222 | j)) | 322914150) * 68) + 1613454218;
                                    long j222222 = (((int) (j212222 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j212222) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                    if (j3 > 0) {
                                    }
                                    java.lang.Object[] objArr802222 = new java.lang.Object[1];
                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr802222);
                                    java.lang.Object[] objArr812222 = {((java.lang.String) objArr802222[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 != null) {
                                    }
                                    long longValue82222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr812222)).longValue();
                                    long j232222 = ~((-950742289) | longValue82222);
                                    long j242222 = ~longValue82222;
                                    long j252222 = ~(950742288 | j242222);
                                    long j262222 = ((longValue82222 * 263) - 497238216624L) + (((~(j242222 | j2)) | j232222 | j252222) * 262) + ((-786) * j252222) + (((~(j242222 | j)) | j232222 | j252222) * 262) + 339797779;
                                    j4 = (((int) j262222) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j262222 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                    java.lang.Object[] objArr832222 = new java.lang.Object[1];
                                    c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr832222);
                                    java.lang.Object[] objArr842222 = {((java.lang.String) objArr832222[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue92222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr842222)).longValue();
                                    long j272222 = 768395910 | longValue92222;
                                    long j282222 = (829 * longValue92222) + 637000209390L + (((~((~longValue92222) | (-768395911))) | (~(longValue92222 | j | 768395910))) * (-828)) + ((j272222 | j) * (-828)) + ((~j272222) * 828) + 522144157;
                                    int i232222 = ~((-1851749727) | i12);
                                    long j292222 = (((int) (j282222 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j282222) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i232222) * 594) + ((i232222 | (~((-414523317) | i12)) | 135599380) * 594)));
                                    if (j4 <= 0) {
                                    }
                                    java.lang.Object[] objArr892222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr892222);
                                    java.lang.String intern302222 = ((java.lang.String) objArr892222[0]).intern();
                                    java.lang.Object[] objArr902222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr902222);
                                    java.lang.String intern312222 = ((java.lang.String) objArr902222[0]).intern();
                                    java.lang.Object[] objArr912222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr912222);
                                    java.lang.String intern322222 = ((java.lang.String) objArr912222[0]).intern();
                                    java.lang.Object[] objArr922222 = new java.lang.Object[1];
                                    c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr922222);
                                    java.lang.String intern332222 = ((java.lang.String) objArr922222[0]).intern();
                                    java.lang.Object[] objArr932222 = new java.lang.Object[1];
                                    c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr932222);
                                    java.lang.String intern342222 = ((java.lang.String) objArr932222[0]).intern();
                                    java.lang.Object[] objArr942222 = new java.lang.Object[1];
                                    c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr942222);
                                    java.lang.String intern352222 = ((java.lang.String) objArr942222[0]).intern();
                                    java.lang.Object[] objArr952222 = new java.lang.Object[1];
                                    c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr952222);
                                    strArr = new java.lang.String[]{intern302222, intern312222, intern322222, intern332222, intern342222, intern352222, ((java.lang.String) objArr952222[0]).intern()};
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < 7) {
                                        }
                                        i3++;
                                        strArr = strArr2;
                                    }
                                    if (i4 == 0) {
                                    }
                                } else {
                                    str = str8;
                                    java.lang.Object[] objArr208 = new java.lang.Object[1];
                                    c("㭷\u0bff威꫞老즎\u180e潱뿊蹙\udeb5ⴎ綜", (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12437, objArr208);
                                    java.lang.Object[] objArr209 = {((java.lang.String) objArr208[0]).intern()};
                                    java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj63 == null) {
                                        java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 40, 1921 - android.graphics.Color.green(0), (char) android.view.View.combineMeasuredStates(0, 0));
                                        byte b67 = $$a[14];
                                        byte b68 = (byte) (b67 - 1);
                                        java.lang.Object[] objArr210 = new java.lang.Object[1];
                                        a(b68, b68, b67, objArr210);
                                        obj63 = cls60.getMethod((java.lang.String) objArr210[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj63);
                                    }
                                    java.lang.Object invoke7 = ((java.lang.reflect.Method) obj63).invoke(null, objArr209);
                                    c = 0;
                                    java.lang.Object[] objArr211 = new java.lang.Object[1];
                                    c("㬴", android.graphics.Color.green(0) + 33199, objArr211);
                                    if (invoke7.equals(((java.lang.String) objArr211[0]).intern())) {
                                        i11 = 1;
                                        int[] iArr3 = new int[i11];
                                        int[] iArr22 = new int[i11];
                                        iArr3[c] = i;
                                        iArr22[c] = i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE;
                                        java.lang.Object[] objArr212 = {iArr3, iArr22, null, new int[i11]};
                                        java.lang.Object[] objArr222 = {-275039665, 16, java.lang.Integer.valueOf((((~(i | (-272089354))) | (-437236167)) * (-964)) + 421586775 + (((~((-272089354) | i12)) | 3162121) * (-964)))};
                                        obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                        if (obj9 == null) {
                                        }
                                        ((int[]) objArr212[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr222)).intValue();
                                        return objArr212;
                                    }
                                    java.lang.Object[] objArr242 = new java.lang.Object[1];
                                    c("㭤\udca4\uf4ed谕ꑺ붹嗢洕", 59333 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr242);
                                    java.lang.String intern210 = ((java.lang.String) objArr242[0]).intern();
                                    java.lang.Object[] objArr252 = new java.lang.Object[1];
                                    c("㭤ꉌः\uf0dd徇악", 39227 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr252);
                                    java.lang.String intern310 = ((java.lang.String) objArr252[0]).intern();
                                    java.lang.Object[] objArr262 = new java.lang.Object[1];
                                    b("\u0015#\u0010\u0005\u0000\u0006㙰", 7 - android.graphics.Color.red(0), (byte) (114 - android.view.KeyEvent.getDeadChar(0, 0)), objArr262);
                                    java.lang.String intern47 = ((java.lang.String) objArr262[0]).intern();
                                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                                    b("\u0011\u0016\u0010\u0002\u0000\u0006\u0006#㗮", 9 - android.graphics.Color.alpha(0), (byte) ((-16777210) - android.graphics.Color.rgb(0, 0, 0)), objArr272);
                                    java.lang.String intern52 = ((java.lang.String) objArr272[0]).intern();
                                    java.lang.String str102 = str;
                                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                                    c("㭬꿄ሣ蚉槽\udc55", android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38054, objArr282);
                                    java.lang.String intern62 = ((java.lang.String) objArr282[0]).intern();
                                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                                    c("㭬\u2d6cᝢ祤挴啂뽊ꅖ譈ﵝ\ue76d줺㌲", 5638 - android.text.TextUtils.indexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr292);
                                    java.lang.String intern72 = ((java.lang.String) objArr292[0]).intern();
                                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                                    b("\u001c\t\u0016\u0007㙊", 6 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getMode(0) + 96), objArr302);
                                    java.lang.String intern82 = ((java.lang.String) objArr302[0]).intern();
                                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                                    b("\u0018\u000f\u0000\u0006\u0004\u0013", 5 - android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((-16777091) - android.graphics.Color.rgb(0, 0, 0)), objArr312);
                                    java.lang.String intern92 = ((java.lang.String) objArr312[0]).intern();
                                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                                    b("\u001d\u0003", 3 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29), objArr322);
                                    java.lang.String intern102 = ((java.lang.String) objArr322[0]).intern();
                                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                                    b("\t\u000b\u0011\r\u0000\u0006\u0003\u001c\u0001\u0016\u0010\u0001\u0012\u0007\u0001\u0012", 15 - android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17), objArr332);
                                    java.lang.String intern112 = ((java.lang.String) objArr332[0]).intern();
                                    java.lang.Object[] objArr342 = new java.lang.Object[1];
                                    c("㭩ẳ烐䫺가號\ud877㏄ᖿ濇", android.view.View.resolveSizeAndState(0, 0, 0) + 9689, objArr342);
                                    java.lang.String intern122 = ((java.lang.String) objArr342[0]).intern();
                                    java.lang.Object[] objArr352 = new java.lang.Object[1];
                                    b("\u0012\u0006\b\u001c\u0006\f\n\b", (-16777208) - android.graphics.Color.rgb(0, 0, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46), objArr352);
                                    java.lang.String intern132 = ((java.lang.String) objArr352[0]).intern();
                                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                                    c("㭵⹀ᄄӆ澺兹䐣꿨鋘薉\uef57툼", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5431, objArr362);
                                    java.lang.String intern142 = ((java.lang.String) objArr362[0]).intern();
                                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                                    b("\u0012\u0006\u0007\u0004\u001c\b㙊㙊 \u0018\u0014\u0019\u0014\u0007", 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 84), objArr372);
                                    java.lang.String intern152 = ((java.lang.String) objArr372[0]).intern();
                                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                                    b("\u0006\u0000\"\t\u000f\u000b㘮", 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (63 - android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr382);
                                    java.lang.String intern162 = ((java.lang.String) objArr382[0]).intern();
                                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                                    c("㭶鎐檐솅颜瞕캛", android.view.View.resolveSize(0, 0) + 43261, objArr392);
                                    java.lang.String intern172 = ((java.lang.String) objArr392[0]).intern();
                                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                                    b("\u0005\u001c\t\u001a\u0012\u001f㗎", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 7, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr402);
                                    java.lang.String intern182 = ((java.lang.String) objArr402[0]).intern();
                                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                                    c("㭶\uf3c1", android.view.View.combineMeasuredStates(0, 0) + 51383, objArr412);
                                    java.lang.String intern192 = ((java.lang.String) objArr412[0]).intern();
                                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                                    c("㭶㼎㎚㘊⪍ⴡↈ␕ᢉጚឬਜພĕ֜砕粒眏殅渜", 1151 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr422);
                                    java.lang.String intern202 = ((java.lang.String) objArr422[0]).intern();
                                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                                    b("\u0001\u0016\u0006\f\u0018 ", 5 - android.view.MotionEvent.axisFromString(str102), (byte) (android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 116), objArr432);
                                    java.lang.String intern212 = ((java.lang.String) objArr432[0]).intern();
                                    java.lang.Object[] objArr442 = new java.lang.Object[1];
                                    c("㭶\ueacd", android.text.TextUtils.indexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53694, objArr442);
                                    java.lang.String intern222 = ((java.lang.String) objArr442[0]).intern();
                                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                                    b("\u0000\n\u000f!\u0015\u0019#\u001f\u0005\u001e\u0001\u0016\u0007\u0012\u0010\u0005", 16 - android.view.View.MeasureSpec.getMode(0), (byte) (53 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr452);
                                    java.lang.String intern232 = ((java.lang.String) objArr452[0]).intern();
                                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                                    c("㭱䠈\udd9a愛\uf69c税辞ገꂕ", 29567 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr462);
                                    java.lang.String intern242 = ((java.lang.String) objArr462[0]).intern();
                                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                                    c("㭱\u2ef8ၺ篋浜傾먾궘霕老", 5519 - android.view.KeyEvent.normalizeMetaState(0), objArr472);
                                    java.lang.String intern252 = ((java.lang.String) objArr472[0]).intern();
                                    java.lang.Object[] objArr482 = new java.lang.Object[1];
                                    c("㭱零恦㏥赤売⩬藷坹⋩ﰹ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44417, objArr482);
                                    java.lang.String intern262 = ((java.lang.String) objArr482[0]).intern();
                                    java.lang.Object[] objArr492 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u0019\u001c\u0007\u0003㗿", 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (10 - android.text.TextUtils.getTrimmedLength(str102)), objArr492);
                                    java.lang.String intern272 = ((java.lang.String) objArr492[0]).intern();
                                    java.lang.Object[] objArr502 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u001e\u0006\"\f\u0019\u001c\u0007\u0003㘀", android.text.TextUtils.lastIndexOf(str102, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11), objArr502);
                                    java.lang.String intern282 = ((java.lang.String) objArr502[0]).intern();
                                    java.lang.Object[] objArr512 = new java.lang.Object[1];
                                    b("\u000f\u000b\u0003\u001d\u000b\u0015\u001c\u0000!\"\u0010\b\n\u0002", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), objArr512);
                                    java.lang.String[] strArr42 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr512[0]).intern()};
                                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                                    b("\u0004\u0006\u0010\u0019\f\u0006\u001d\u000b\f\u0006㙋", android.view.View.combineMeasuredStates(0, 0) + 11, (byte) (android.text.TextUtils.getCapsMode(str102, 0, 0) + 76), objArr522);
                                    java.lang.Object[] objArr532 = {((java.lang.String) objArr522[0]).intern()};
                                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj2 == null) {
                                    }
                                    str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr532);
                                    if (str2 != null) {
                                    }
                                    str3 = str102;
                                    j2 = j6;
                                    i2 = 0;
                                    java.lang.Object[] objArr7122222 = new java.lang.Object[1];
                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr7122222);
                                    java.lang.Object[] objArr7222222 = {((java.lang.String) objArr7122222[i2]).intern()};
                                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj3 == null) {
                                    }
                                    long longValue622222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7222222)).longValue();
                                    long j1922222 = ((-215) * longValue622222) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue622222) | j) * (-216)) + ((longValue622222 | (~(j | 140210277))) * 216) + 1150329790;
                                    j3 = (((int) (j1922222 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j1922222) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                                    java.lang.Object[] objArr7422222 = new java.lang.Object[1];
                                    c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr7422222);
                                    java.lang.Object[] objArr7522222 = {((java.lang.String) objArr7422222[0]).intern()};
                                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj4 == null) {
                                    }
                                    long longValue722222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7522222)).longValue();
                                    long j2022222 = ~longValue722222;
                                    java.lang.String str1222222 = str3;
                                    long j2122222 = (((-67) * longValue722222) - 22281076419L) + (((~(322914150 | j2022222 | j)) | (~(longValue722222 | (-322914151))) | (~(longValue722222 | j2))) * (-68)) + ((~(j | 322914150 | longValue722222)) * (-68)) + (((~(j2022222 | j)) | 322914150) * 68) + 1613454218;
                                    long j2222222 = (((int) (j2122222 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j2122222) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                                    if (j3 > 0) {
                                    }
                                    java.lang.Object[] objArr8022222 = new java.lang.Object[1];
                                    c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr8022222);
                                    java.lang.Object[] objArr8122222 = {((java.lang.String) objArr8022222[0]).intern()};
                                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj5 != null) {
                                    }
                                    long longValue822222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8122222)).longValue();
                                    long j2322222 = ~((-950742289) | longValue822222);
                                    long j2422222 = ~longValue822222;
                                    long j2522222 = ~(950742288 | j2422222);
                                    long j2622222 = ((longValue822222 * 263) - 497238216624L) + (((~(j2422222 | j2)) | j2322222 | j2522222) * 262) + ((-786) * j2522222) + (((~(j2422222 | j)) | j2322222 | j2522222) * 262) + 339797779;
                                    j4 = (((int) j2622222) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j2622222 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                                    java.lang.Object[] objArr8322222 = new java.lang.Object[1];
                                    c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr8322222);
                                    java.lang.Object[] objArr8422222 = {((java.lang.String) objArr8322222[0]).intern()};
                                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                    if (obj6 == null) {
                                    }
                                    long longValue922222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8422222)).longValue();
                                    long j2722222 = 768395910 | longValue922222;
                                    long j2822222 = (829 * longValue922222) + 637000209390L + (((~((~longValue922222) | (-768395911))) | (~(longValue922222 | j | 768395910))) * (-828)) + ((j2722222 | j) * (-828)) + ((~j2722222) * 828) + 522144157;
                                    int i2322222 = ~((-1851749727) | i12);
                                    long j2922222 = (((int) (j2822222 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j2822222) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i2322222) * 594) + ((i2322222 | (~((-414523317) | i12)) | 135599380) * 594)));
                                    if (j4 <= 0) {
                                    }
                                    java.lang.Object[] objArr8922222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr8922222);
                                    java.lang.String intern3022222 = ((java.lang.String) objArr8922222[0]).intern();
                                    java.lang.Object[] objArr9022222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr9022222);
                                    java.lang.String intern3122222 = ((java.lang.String) objArr9022222[0]).intern();
                                    java.lang.Object[] objArr9122222 = new java.lang.Object[1];
                                    b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr9122222);
                                    java.lang.String intern3222222 = ((java.lang.String) objArr9122222[0]).intern();
                                    java.lang.Object[] objArr9222222 = new java.lang.Object[1];
                                    c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr9222222);
                                    java.lang.String intern3322222 = ((java.lang.String) objArr9222222[0]).intern();
                                    java.lang.Object[] objArr9322222 = new java.lang.Object[1];
                                    c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr9322222);
                                    java.lang.String intern3422222 = ((java.lang.String) objArr9322222[0]).intern();
                                    java.lang.Object[] objArr9422222 = new java.lang.Object[1];
                                    c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr9422222);
                                    java.lang.String intern3522222 = ((java.lang.String) objArr9422222[0]).intern();
                                    java.lang.Object[] objArr9522222 = new java.lang.Object[1];
                                    c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr9522222);
                                    strArr = new java.lang.String[]{intern3022222, intern3122222, intern3222222, intern3322222, intern3422222, intern3522222, ((java.lang.String) objArr9522222[0]).intern()};
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < 7) {
                                        }
                                        i3++;
                                        strArr = strArr2;
                                    }
                                    if (i4 == 0) {
                                    }
                                }
                            } else {
                                obj7 = invoke2;
                                obj8 = invoke3;
                                str7 = "";
                            }
                            if (obj8 != null) {
                                java.lang.Object[] objArr213 = {obj8, 42};
                                java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj64 == null) {
                                    java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 28, 2595 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                                    byte b69 = $$a[14];
                                    byte b70 = (byte) (b69 - 1);
                                    java.lang.Object[] objArr214 = new java.lang.Object[1];
                                    a(b70, b70, b69, objArr214);
                                    obj64 = cls61.getMethod((java.lang.String) objArr214[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                                }
                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr213)).longValue();
                                long j74 = ~((-936350076) | longValue26);
                                long j75 = ~longValue26;
                                long j76 = ~(j8 | 936350075);
                                long j77 = ((-1187) * longValue26) + 557128294625L + (((~(longValue26 | j8)) | j74) * (-1188)) + (((~(j75 | j6)) | j74 | j76) * 594) + (((~(j75 | j8)) | (~(936350075 | j75)) | j76) * 594) + 320750449;
                            }
                            if (obj7 != null) {
                                java.lang.Object[] objArr215 = {obj7, 42};
                                java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj65 == null) {
                                    str8 = str7;
                                    java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, 2594 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) android.text.TextUtils.getCapsMode(str8, 0, 0));
                                    byte b71 = $$a[14];
                                    byte b72 = (byte) (b71 - 1);
                                    java.lang.Object[] objArr216 = new java.lang.Object[1];
                                    a(b72, b72, b71, objArr216);
                                    obj65 = cls62.getMethod((java.lang.String) objArr216[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                                } else {
                                    str8 = str7;
                                }
                                long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr215)).longValue();
                                long j78 = ~longValue27;
                                j = j8;
                                long j79 = ((-565) * longValue27) + 163472880186L + (((~(longValue27 | (-288311959))) | (~(j6 | (-288311959)))) * (-566)) + ((~(288311958 | j78)) * 566) + ((~((-288311959) | j78 | j6)) * 566) + 968788566;
                                if (((((int) j79) & ((((((~((-1216304262) | i)) | 1079399552) | (~(1778341333 | i12))) * 886) - 113172025) + (((~(1216304261 | i12)) | 1641436624) * (-1772)) + ((~(1641436624 | i12)) * 886))) | (((int) (j79 >> 32)) & ((((((~((-1748174822) | i12)) | 544) | (~((-310948411) | i12))) * 464) - 513213526) + (((-1748174278) | i) * (-464)) + (((~((-310948411) | i)) | 544) * 464)))) != -1032769152) {
                                }
                                if (android.os.Build.VERSION.SDK_INT <= 33) {
                                }
                            } else {
                                j = j8;
                                str8 = str7;
                            }
                            if (obj8 != null) {
                                java.lang.Object[] objArr217 = {obj8, 42};
                                java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                if (obj66 == null) {
                                    java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf(str8, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 2594 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                    byte b73 = $$a[14];
                                    byte b74 = (byte) (b73 - 1);
                                    java.lang.Object[] objArr218 = new java.lang.Object[1];
                                    a(b74, b74, b73, objArr218);
                                    obj66 = cls63.getMethod((java.lang.String) objArr218[0], java.lang.String.class, java.lang.Integer.TYPE);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                                }
                                long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr217)).longValue();
                                long j80 = ~((-348801933) | longValue28);
                                long j81 = ~longValue28;
                                long j82 = ~(j | 348801932);
                                long j83 = ((-1187) * longValue28) + 207537149540L + ((j80 | (~(j | longValue28))) * (-1188)) + ((j80 | (~(j81 | j6)) | j82) * 594) + (((~(j81 | j)) | (~(j81 | 348801932)) | j82) * 594) + 908298592;
                            }
                            str = str8;
                            java.lang.Object[] objArr2422 = new java.lang.Object[1];
                            c("㭤\udca4\uf4ed谕ꑺ붹嗢洕", 59333 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2422);
                            java.lang.String intern2102 = ((java.lang.String) objArr2422[0]).intern();
                            java.lang.Object[] objArr2522 = new java.lang.Object[1];
                            c("㭤ꉌः\uf0dd徇악", 39227 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2522);
                            java.lang.String intern3102 = ((java.lang.String) objArr2522[0]).intern();
                            java.lang.Object[] objArr2622 = new java.lang.Object[1];
                            b("\u0015#\u0010\u0005\u0000\u0006㙰", 7 - android.graphics.Color.red(0), (byte) (114 - android.view.KeyEvent.getDeadChar(0, 0)), objArr2622);
                            java.lang.String intern472 = ((java.lang.String) objArr2622[0]).intern();
                            java.lang.Object[] objArr2722 = new java.lang.Object[1];
                            b("\u0011\u0016\u0010\u0002\u0000\u0006\u0006#㗮", 9 - android.graphics.Color.alpha(0), (byte) ((-16777210) - android.graphics.Color.rgb(0, 0, 0)), objArr2722);
                            java.lang.String intern522 = ((java.lang.String) objArr2722[0]).intern();
                            java.lang.String str1022 = str;
                            java.lang.Object[] objArr2822 = new java.lang.Object[1];
                            c("㭬꿄ሣ蚉槽\udc55", android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38054, objArr2822);
                            java.lang.String intern622 = ((java.lang.String) objArr2822[0]).intern();
                            java.lang.Object[] objArr2922 = new java.lang.Object[1];
                            c("㭬\u2d6cᝢ祤挴啂뽊ꅖ譈ﵝ\ue76d줺㌲", 5638 - android.text.TextUtils.indexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2922);
                            java.lang.String intern722 = ((java.lang.String) objArr2922[0]).intern();
                            java.lang.Object[] objArr3022 = new java.lang.Object[1];
                            b("\u001c\t\u0016\u0007㙊", 6 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getMode(0) + 96), objArr3022);
                            java.lang.String intern822 = ((java.lang.String) objArr3022[0]).intern();
                            java.lang.Object[] objArr3122 = new java.lang.Object[1];
                            b("\u0018\u000f\u0000\u0006\u0004\u0013", 5 - android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((-16777091) - android.graphics.Color.rgb(0, 0, 0)), objArr3122);
                            java.lang.String intern922 = ((java.lang.String) objArr3122[0]).intern();
                            java.lang.Object[] objArr3222 = new java.lang.Object[1];
                            b("\u001d\u0003", 3 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29), objArr3222);
                            java.lang.String intern1022 = ((java.lang.String) objArr3222[0]).intern();
                            java.lang.Object[] objArr3322 = new java.lang.Object[1];
                            b("\t\u000b\u0011\r\u0000\u0006\u0003\u001c\u0001\u0016\u0010\u0001\u0012\u0007\u0001\u0012", 15 - android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17), objArr3322);
                            java.lang.String intern1122 = ((java.lang.String) objArr3322[0]).intern();
                            java.lang.Object[] objArr3422 = new java.lang.Object[1];
                            c("㭩ẳ烐䫺가號\ud877㏄ᖿ濇", android.view.View.resolveSizeAndState(0, 0, 0) + 9689, objArr3422);
                            java.lang.String intern1222 = ((java.lang.String) objArr3422[0]).intern();
                            java.lang.Object[] objArr3522 = new java.lang.Object[1];
                            b("\u0012\u0006\b\u001c\u0006\f\n\b", (-16777208) - android.graphics.Color.rgb(0, 0, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46), objArr3522);
                            java.lang.String intern1322 = ((java.lang.String) objArr3522[0]).intern();
                            java.lang.Object[] objArr3622 = new java.lang.Object[1];
                            c("㭵⹀ᄄӆ澺兹䐣꿨鋘薉\uef57툼", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5431, objArr3622);
                            java.lang.String intern1422 = ((java.lang.String) objArr3622[0]).intern();
                            java.lang.Object[] objArr3722 = new java.lang.Object[1];
                            b("\u0012\u0006\u0007\u0004\u001c\b㙊㙊 \u0018\u0014\u0019\u0014\u0007", 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 84), objArr3722);
                            java.lang.String intern1522 = ((java.lang.String) objArr3722[0]).intern();
                            java.lang.Object[] objArr3822 = new java.lang.Object[1];
                            b("\u0006\u0000\"\t\u000f\u000b㘮", 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (63 - android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr3822);
                            java.lang.String intern1622 = ((java.lang.String) objArr3822[0]).intern();
                            java.lang.Object[] objArr3922 = new java.lang.Object[1];
                            c("㭶鎐檐솅颜瞕캛", android.view.View.resolveSize(0, 0) + 43261, objArr3922);
                            java.lang.String intern1722 = ((java.lang.String) objArr3922[0]).intern();
                            java.lang.Object[] objArr4022 = new java.lang.Object[1];
                            b("\u0005\u001c\t\u001a\u0012\u001f㗎", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 7, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr4022);
                            java.lang.String intern1822 = ((java.lang.String) objArr4022[0]).intern();
                            java.lang.Object[] objArr4122 = new java.lang.Object[1];
                            c("㭶\uf3c1", android.view.View.combineMeasuredStates(0, 0) + 51383, objArr4122);
                            java.lang.String intern1922 = ((java.lang.String) objArr4122[0]).intern();
                            java.lang.Object[] objArr4222 = new java.lang.Object[1];
                            c("㭶㼎㎚㘊⪍ⴡↈ␕ᢉጚឬਜພĕ֜砕粒眏殅渜", 1151 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr4222);
                            java.lang.String intern2022 = ((java.lang.String) objArr4222[0]).intern();
                            java.lang.Object[] objArr4322 = new java.lang.Object[1];
                            b("\u0001\u0016\u0006\f\u0018 ", 5 - android.view.MotionEvent.axisFromString(str1022), (byte) (android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 116), objArr4322);
                            java.lang.String intern2122 = ((java.lang.String) objArr4322[0]).intern();
                            java.lang.Object[] objArr4422 = new java.lang.Object[1];
                            c("㭶\ueacd", android.text.TextUtils.indexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53694, objArr4422);
                            java.lang.String intern2222 = ((java.lang.String) objArr4422[0]).intern();
                            java.lang.Object[] objArr4522 = new java.lang.Object[1];
                            b("\u0000\n\u000f!\u0015\u0019#\u001f\u0005\u001e\u0001\u0016\u0007\u0012\u0010\u0005", 16 - android.view.View.MeasureSpec.getMode(0), (byte) (53 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr4522);
                            java.lang.String intern2322 = ((java.lang.String) objArr4522[0]).intern();
                            java.lang.Object[] objArr4622 = new java.lang.Object[1];
                            c("㭱䠈\udd9a愛\uf69c税辞ገꂕ", 29567 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr4622);
                            java.lang.String intern2422 = ((java.lang.String) objArr4622[0]).intern();
                            java.lang.Object[] objArr4722 = new java.lang.Object[1];
                            c("㭱\u2ef8ၺ篋浜傾먾궘霕老", 5519 - android.view.KeyEvent.normalizeMetaState(0), objArr4722);
                            java.lang.String intern2522 = ((java.lang.String) objArr4722[0]).intern();
                            java.lang.Object[] objArr4822 = new java.lang.Object[1];
                            c("㭱零恦㏥赤売⩬藷坹⋩ﰹ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44417, objArr4822);
                            java.lang.String intern2622 = ((java.lang.String) objArr4822[0]).intern();
                            java.lang.Object[] objArr4922 = new java.lang.Object[1];
                            b("\u000f\u000b\u0003\u001d\u000b\u0015\u0019\u001c\u0007\u0003㗿", 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (10 - android.text.TextUtils.getTrimmedLength(str1022)), objArr4922);
                            java.lang.String intern2722 = ((java.lang.String) objArr4922[0]).intern();
                            java.lang.Object[] objArr5022 = new java.lang.Object[1];
                            b("\u000f\u000b\u0003\u001d\u000b\u0015\u001e\u0006\"\f\u0019\u001c\u0007\u0003㘀", android.text.TextUtils.lastIndexOf(str1022, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11), objArr5022);
                            java.lang.String intern2822 = ((java.lang.String) objArr5022[0]).intern();
                            java.lang.Object[] objArr5122 = new java.lang.Object[1];
                            b("\u000f\u000b\u0003\u001d\u000b\u0015\u001c\u0000!\"\u0010\b\n\u0002", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), objArr5122);
                            java.lang.String[] strArr422 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5122[0]).intern()};
                            java.lang.Object[] objArr5222 = new java.lang.Object[1];
                            b("\u0004\u0006\u0010\u0019\f\u0006\u001d\u000b\f\u0006㙋", android.view.View.combineMeasuredStates(0, 0) + 11, (byte) (android.text.TextUtils.getCapsMode(str1022, 0, 0) + 76), objArr5222);
                            java.lang.Object[] objArr5322 = {((java.lang.String) objArr5222[0]).intern()};
                            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                            if (obj2 == null) {
                            }
                            str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr5322);
                            if (str2 != null) {
                            }
                            str3 = str1022;
                            j2 = j6;
                            i2 = 0;
                            java.lang.Object[] objArr71222222 = new java.lang.Object[1];
                            c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr71222222);
                            java.lang.Object[] objArr72222222 = {((java.lang.String) objArr71222222[i2]).intern()};
                            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj3 == null) {
                            }
                            long longValue6222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr72222222)).longValue();
                            long j19222222 = ((-215) * longValue6222222) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue6222222) | j) * (-216)) + ((longValue6222222 | (~(j | 140210277))) * 216) + 1150329790;
                            j3 = (((int) (j19222222 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j19222222) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                            java.lang.Object[] objArr74222222 = new java.lang.Object[1];
                            c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr74222222);
                            java.lang.Object[] objArr75222222 = {((java.lang.String) objArr74222222[0]).intern()};
                            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj4 == null) {
                            }
                            long longValue7222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr75222222)).longValue();
                            long j20222222 = ~longValue7222222;
                            java.lang.String str12222222 = str3;
                            long j21222222 = (((-67) * longValue7222222) - 22281076419L) + (((~(322914150 | j20222222 | j)) | (~(longValue7222222 | (-322914151))) | (~(longValue7222222 | j2))) * (-68)) + ((~(j | 322914150 | longValue7222222)) * (-68)) + (((~(j20222222 | j)) | 322914150) * 68) + 1613454218;
                            long j22222222 = (((int) (j21222222 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j21222222) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                            if (j3 > 0) {
                            }
                            java.lang.Object[] objArr80222222 = new java.lang.Object[1];
                            c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr80222222);
                            java.lang.Object[] objArr81222222 = {((java.lang.String) objArr80222222[0]).intern()};
                            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj5 != null) {
                            }
                            long longValue8222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr81222222)).longValue();
                            long j23222222 = ~((-950742289) | longValue8222222);
                            long j24222222 = ~longValue8222222;
                            long j25222222 = ~(950742288 | j24222222);
                            long j26222222 = ((longValue8222222 * 263) - 497238216624L) + (((~(j24222222 | j2)) | j23222222 | j25222222) * 262) + ((-786) * j25222222) + (((~(j24222222 | j)) | j23222222 | j25222222) * 262) + 339797779;
                            j4 = (((int) j26222222) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j26222222 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                            java.lang.Object[] objArr83222222 = new java.lang.Object[1];
                            c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr83222222);
                            java.lang.Object[] objArr84222222 = {((java.lang.String) objArr83222222[0]).intern()};
                            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                            if (obj6 == null) {
                            }
                            long longValue9222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr84222222)).longValue();
                            long j27222222 = 768395910 | longValue9222222;
                            long j28222222 = (829 * longValue9222222) + 637000209390L + (((~((~longValue9222222) | (-768395911))) | (~(longValue9222222 | j | 768395910))) * (-828)) + ((j27222222 | j) * (-828)) + ((~j27222222) * 828) + 522144157;
                            int i23222222 = ~((-1851749727) | i12);
                            long j29222222 = (((int) (j28222222 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j28222222) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i23222222) * 594) + ((i23222222 | (~((-414523317) | i12)) | 135599380) * 594)));
                            if (j4 <= 0) {
                            }
                            java.lang.Object[] objArr89222222 = new java.lang.Object[1];
                            b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr89222222);
                            java.lang.String intern30222222 = ((java.lang.String) objArr89222222[0]).intern();
                            java.lang.Object[] objArr90222222 = new java.lang.Object[1];
                            b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr90222222);
                            java.lang.String intern31222222 = ((java.lang.String) objArr90222222[0]).intern();
                            java.lang.Object[] objArr91222222 = new java.lang.Object[1];
                            b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr91222222);
                            java.lang.String intern32222222 = ((java.lang.String) objArr91222222[0]).intern();
                            java.lang.Object[] objArr92222222 = new java.lang.Object[1];
                            c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr92222222);
                            java.lang.String intern33222222 = ((java.lang.String) objArr92222222[0]).intern();
                            java.lang.Object[] objArr93222222 = new java.lang.Object[1];
                            c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr93222222);
                            java.lang.String intern34222222 = ((java.lang.String) objArr93222222[0]).intern();
                            java.lang.Object[] objArr94222222 = new java.lang.Object[1];
                            c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr94222222);
                            java.lang.String intern35222222 = ((java.lang.String) objArr94222222[0]).intern();
                            java.lang.Object[] objArr95222222 = new java.lang.Object[1];
                            c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr95222222);
                            strArr = new java.lang.String[]{intern30222222, intern31222222, intern32222222, intern33222222, intern34222222, intern35222222, ((java.lang.String) objArr95222222[0]).intern()};
                            i3 = 0;
                            while (true) {
                                if (i3 < 7) {
                                }
                                i3++;
                                strArr = strArr2;
                            }
                            if (i4 == 0) {
                            }
                        } else {
                            i14++;
                            i15 = 2;
                            i13 = 609763459;
                        }
                    }
                }
                j = j8;
                str = "";
                java.lang.Object[] objArr24222 = new java.lang.Object[1];
                c("㭤\udca4\uf4ed谕ꑺ붹嗢洕", 59333 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr24222);
                java.lang.String intern21022 = ((java.lang.String) objArr24222[0]).intern();
                java.lang.Object[] objArr25222 = new java.lang.Object[1];
                c("㭤ꉌः\uf0dd徇악", 39227 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr25222);
                java.lang.String intern31022 = ((java.lang.String) objArr25222[0]).intern();
                java.lang.Object[] objArr26222 = new java.lang.Object[1];
                b("\u0015#\u0010\u0005\u0000\u0006㙰", 7 - android.graphics.Color.red(0), (byte) (114 - android.view.KeyEvent.getDeadChar(0, 0)), objArr26222);
                java.lang.String intern4722 = ((java.lang.String) objArr26222[0]).intern();
                java.lang.Object[] objArr27222 = new java.lang.Object[1];
                b("\u0011\u0016\u0010\u0002\u0000\u0006\u0006#㗮", 9 - android.graphics.Color.alpha(0), (byte) ((-16777210) - android.graphics.Color.rgb(0, 0, 0)), objArr27222);
                java.lang.String intern5222 = ((java.lang.String) objArr27222[0]).intern();
                java.lang.String str10222 = str;
                java.lang.Object[] objArr28222 = new java.lang.Object[1];
                c("㭬꿄ሣ蚉槽\udc55", android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 38054, objArr28222);
                java.lang.String intern6222 = ((java.lang.String) objArr28222[0]).intern();
                java.lang.Object[] objArr29222 = new java.lang.Object[1];
                c("㭬\u2d6cᝢ祤挴啂뽊ꅖ譈ﵝ\ue76d줺㌲", 5638 - android.text.TextUtils.indexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr29222);
                java.lang.String intern7222 = ((java.lang.String) objArr29222[0]).intern();
                java.lang.Object[] objArr30222 = new java.lang.Object[1];
                b("\u001c\t\u0016\u0007㙊", 6 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (android.view.View.MeasureSpec.getMode(0) + 96), objArr30222);
                java.lang.String intern8222 = ((java.lang.String) objArr30222[0]).intern();
                java.lang.Object[] objArr31222 = new java.lang.Object[1];
                b("\u0018\u000f\u0000\u0006\u0004\u0013", 5 - android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) ((-16777091) - android.graphics.Color.rgb(0, 0, 0)), objArr31222);
                java.lang.String intern9222 = ((java.lang.String) objArr31222[0]).intern();
                java.lang.Object[] objArr32222 = new java.lang.Object[1];
                b("\u001d\u0003", 3 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 29), objArr32222);
                java.lang.String intern10222 = ((java.lang.String) objArr32222[0]).intern();
                java.lang.Object[] objArr33222 = new java.lang.Object[1];
                b("\t\u000b\u0011\r\u0000\u0006\u0003\u001c\u0001\u0016\u0010\u0001\u0012\u0007\u0001\u0012", 15 - android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 17), objArr33222);
                java.lang.String intern11222 = ((java.lang.String) objArr33222[0]).intern();
                java.lang.Object[] objArr34222 = new java.lang.Object[1];
                c("㭩ẳ烐䫺가號\ud877㏄ᖿ濇", android.view.View.resolveSizeAndState(0, 0, 0) + 9689, objArr34222);
                java.lang.String intern12222 = ((java.lang.String) objArr34222[0]).intern();
                java.lang.Object[] objArr35222 = new java.lang.Object[1];
                b("\u0012\u0006\b\u001c\u0006\f\n\b", (-16777208) - android.graphics.Color.rgb(0, 0, 0), (byte) (((android.os.Process.getThreadPriority(0) + 20) >> 6) + 46), objArr35222);
                java.lang.String intern13222 = ((java.lang.String) objArr35222[0]).intern();
                java.lang.Object[] objArr36222 = new java.lang.Object[1];
                c("㭵⹀ᄄӆ澺兹䐣꿨鋘薉\uef57툼", (android.view.KeyEvent.getMaxKeyCode() >> 16) + 5431, objArr36222);
                java.lang.String intern14222 = ((java.lang.String) objArr36222[0]).intern();
                java.lang.Object[] objArr37222 = new java.lang.Object[1];
                b("\u0012\u0006\u0007\u0004\u001c\b㙊㙊 \u0018\u0014\u0019\u0014\u0007", 14 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 84), objArr37222);
                java.lang.String intern15222 = ((java.lang.String) objArr37222[0]).intern();
                java.lang.Object[] objArr38222 = new java.lang.Object[1];
                b("\u0006\u0000\"\t\u000f\u000b㘮", 7 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (63 - android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr38222);
                java.lang.String intern16222 = ((java.lang.String) objArr38222[0]).intern();
                java.lang.Object[] objArr39222 = new java.lang.Object[1];
                c("㭶鎐檐솅颜瞕캛", android.view.View.resolveSize(0, 0) + 43261, objArr39222);
                java.lang.String intern17222 = ((java.lang.String) objArr39222[0]).intern();
                java.lang.Object[] objArr40222 = new java.lang.Object[1];
                b("\u0005\u001c\t\u001a\u0012\u001f㗎", android.widget.ExpandableListView.getPackedPositionGroup(0L) + 7, (byte) (37 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), objArr40222);
                java.lang.String intern18222 = ((java.lang.String) objArr40222[0]).intern();
                java.lang.Object[] objArr41222 = new java.lang.Object[1];
                c("㭶\uf3c1", android.view.View.combineMeasuredStates(0, 0) + 51383, objArr41222);
                java.lang.String intern19222 = ((java.lang.String) objArr41222[0]).intern();
                java.lang.Object[] objArr42222 = new java.lang.Object[1];
                c("㭶㼎㎚㘊⪍ⴡↈ␕ᢉጚឬਜພĕ֜砕粒眏殅渜", 1151 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr42222);
                java.lang.String intern20222 = ((java.lang.String) objArr42222[0]).intern();
                java.lang.Object[] objArr43222 = new java.lang.Object[1];
                b("\u0001\u0016\u0006\f\u0018 ", 5 - android.view.MotionEvent.axisFromString(str10222), (byte) (android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 116), objArr43222);
                java.lang.String intern21222 = ((java.lang.String) objArr43222[0]).intern();
                java.lang.Object[] objArr44222 = new java.lang.Object[1];
                c("㭶\ueacd", android.text.TextUtils.indexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 53694, objArr44222);
                java.lang.String intern22222 = ((java.lang.String) objArr44222[0]).intern();
                java.lang.Object[] objArr45222 = new java.lang.Object[1];
                b("\u0000\n\u000f!\u0015\u0019#\u001f\u0005\u001e\u0001\u0016\u0007\u0012\u0010\u0005", 16 - android.view.View.MeasureSpec.getMode(0), (byte) (53 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr45222);
                java.lang.String intern23222 = ((java.lang.String) objArr45222[0]).intern();
                java.lang.Object[] objArr46222 = new java.lang.Object[1];
                c("㭱䠈\udd9a愛\uf69c税辞ገꂕ", 29567 - (android.view.KeyEvent.getMaxKeyCode() >> 16), objArr46222);
                java.lang.String intern24222 = ((java.lang.String) objArr46222[0]).intern();
                java.lang.Object[] objArr47222 = new java.lang.Object[1];
                c("㭱\u2ef8ၺ篋浜傾먾궘霕老", 5519 - android.view.KeyEvent.normalizeMetaState(0), objArr47222);
                java.lang.String intern25222 = ((java.lang.String) objArr47222[0]).intern();
                java.lang.Object[] objArr48222 = new java.lang.Object[1];
                c("㭱零恦㏥赤売⩬藷坹⋩ﰹ", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44417, objArr48222);
                java.lang.String intern26222 = ((java.lang.String) objArr48222[0]).intern();
                java.lang.Object[] objArr49222 = new java.lang.Object[1];
                b("\u000f\u000b\u0003\u001d\u000b\u0015\u0019\u001c\u0007\u0003㗿", 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (10 - android.text.TextUtils.getTrimmedLength(str10222)), objArr49222);
                java.lang.String intern27222 = ((java.lang.String) objArr49222[0]).intern();
                java.lang.Object[] objArr50222 = new java.lang.Object[1];
                b("\u000f\u000b\u0003\u001d\u000b\u0015\u001e\u0006\"\f\u0019\u001c\u0007\u0003㘀", android.text.TextUtils.lastIndexOf(str10222, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 16, (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11), objArr50222);
                java.lang.String intern28222 = ((java.lang.String) objArr50222[0]).intern();
                java.lang.Object[] objArr51222 = new java.lang.Object[1];
                b("\u000f\u000b\u0003\u001d\u000b\u0015\u001c\u0000!\"\u0010\b\n\u0002", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, (byte) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 99), objArr51222);
                java.lang.String[] strArr4222 = {intern21022, intern31022, intern4722, intern5222, intern6222, intern7222, intern8222, intern9222, intern10222, intern11222, intern12222, intern13222, intern14222, intern15222, intern16222, intern17222, intern18222, intern19222, intern20222, intern21222, intern22222, intern23222, intern24222, intern25222, intern26222, intern27222, intern28222, ((java.lang.String) objArr51222[0]).intern()};
                java.lang.Object[] objArr52222 = new java.lang.Object[1];
                b("\u0004\u0006\u0010\u0019\f\u0006\u001d\u000b\f\u0006㙋", android.view.View.combineMeasuredStates(0, 0) + 11, (byte) (android.text.TextUtils.getCapsMode(str10222, 0, 0) + 76), objArr52222);
                java.lang.Object[] objArr53222 = {((java.lang.String) objArr52222[0]).intern()};
                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                if (obj2 == null) {
                }
                str2 = (java.lang.String) ((java.lang.reflect.Method) obj2).invoke(null, objArr53222);
                if (str2 != null) {
                }
                str3 = str10222;
                j2 = j6;
                i2 = 0;
                java.lang.Object[] objArr712222222 = new java.lang.Object[1];
                c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", 48731 - android.text.TextUtils.indexOf(str3, str3, i2), objArr712222222);
                java.lang.Object[] objArr722222222 = {((java.lang.String) objArr712222222[i2]).intern()};
                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj3 == null) {
                }
                long longValue62222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr722222222)).longValue();
                long j192222222 = ((-215) * longValue62222222) + 30425630109L + ((~(j2 | 140210277)) * 216) + ((140210277 | (~longValue62222222) | j) * (-216)) + ((longValue62222222 | (~(j | 140210277))) * 216) + 1150329790;
                j3 = (((int) (j192222222 >> 32)) & ((((~(1067013469 | i12)) | 370212941) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 710727530 + (((~(378619213 | i12)) | 1058607197) * (-440)) + ((1067013469 | i) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))) | (((int) j192222222) & ((((~((-65569) | i12)) * 433) - 882996370) + (((~(717973216 | i)) | 719253193) * (-433)) + (((~(719253193 | i)) | 717907648) * 433)));
                java.lang.Object[] objArr742222222 = new java.lang.Object[1];
                c("㬪⥸Ὥ്獒慫圸䔻ꬁ餖辨ﷹ\ue3ed퇍쟇㖳ᮦ", 4621 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr742222222);
                java.lang.Object[] objArr752222222 = {((java.lang.String) objArr742222222[0]).intern()};
                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj4 == null) {
                }
                long longValue72222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr752222222)).longValue();
                long j202222222 = ~longValue72222222;
                java.lang.String str122222222 = str3;
                long j212222222 = (((-67) * longValue72222222) - 22281076419L) + (((~(322914150 | j202222222 | j)) | (~(longValue72222222 | (-322914151))) | (~(longValue72222222 | j2))) * (-68)) + ((~(j | 322914150 | longValue72222222)) * (-68)) + (((~(j202222222 | j)) | 322914150) * 68) + 1613454218;
                long j222222222 = (((int) (j212222222 >> 32)) & (((((~(1691023329 | i12)) | (~(1166717555 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) - 1888441842) + (((~((-541083009) | i12)) | (~((-16777235) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) j212222222) & ((((~((-840871287) | i12)) | (~((-2016869600) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1655263015 + (((~((-1210077322) | i12)) | (~((-34079009) | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE)));
                if (j3 > 0) {
                }
                java.lang.Object[] objArr802222222 = new java.lang.Object[1];
                c("㬪蔭䟊g쉆貤䵔བྷ즮詓哧ᚅ휯釯厇᱿\uded0齠夅᮫\ue46bꘑ悲", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 48730, objArr802222222);
                java.lang.Object[] objArr812222222 = {((java.lang.String) objArr802222222[0]).intern()};
                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj5 != null) {
                }
                long longValue82222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr812222222)).longValue();
                long j232222222 = ~((-950742289) | longValue82222222);
                long j242222222 = ~longValue82222222;
                long j252222222 = ~(950742288 | j242222222);
                long j262222222 = ((longValue82222222 * 263) - 497238216624L) + (((~(j242222222 | j2)) | j232222222 | j252222222) * 262) + ((-786) * j252222222) + (((~(j242222222 | j)) | j232222222 | j252222222) * 262) + 339797779;
                j4 = (((int) j262222222) & (((((~((-1893096401) | i12)) | 455869990) * (-1042)) - 1691416060) + (((-1893096401) | i) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + (((~((-455869991) | i)) | 187171878 | (~((-1624398289) | i12))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((int) (j262222222 >> 32)) & (((((~((-134285396) | i)) | (~((-1075856385) | i12))) * 497) - 1879363645) + (((~((-227084632) | i12)) | 92799236 | (~((-1075856385) | i))) * 497)));
                java.lang.Object[] objArr832222222 = new java.lang.Object[1];
                c("㬪헂\ue626\uf09a", android.text.TextUtils.getTrimmedLength(str4) + 61091, objArr832222222);
                java.lang.Object[] objArr842222222 = {((java.lang.String) objArr832222222[0]).intern()};
                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                if (obj6 == null) {
                }
                long longValue92222222 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr842222222)).longValue();
                long j272222222 = 768395910 | longValue92222222;
                long j282222222 = (829 * longValue92222222) + 637000209390L + (((~((~longValue92222222) | (-768395911))) | (~(longValue92222222 | j | 768395910))) * (-828)) + ((j272222222 | j) * (-828)) + ((~j272222222) * 828) + 522144157;
                int i232222222 = ~((-1851749727) | i12);
                long j292222222 = (((int) (j282222222 >> 32)) & ((((~(495702745 | i12)) | (~((-210358874) | i))) * (-831)) + 1878744968 + ((~(2143288029 | i)) * (-1662)) + (((~((-1932929157) | i12)) | (~(1932929156 | i)) | (~((-495702746) | i))) * 831))) | (((int) j282222222) & (((((~(414523316 | i12)) | (-2130673663)) * (-1188)) - 397396841) + (((~((-414523317) | i)) | (-2130673663) | i232222222) * 594) + ((i232222222 | (~((-414523317) | i12)) | 135599380) * 594)));
                if (j4 <= 0) {
                }
                java.lang.Object[] objArr892222222 = new java.lang.Object[1];
                b("\u0016\u0003\"\u0002\u0012\u001f㘟", 7 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39), objArr892222222);
                java.lang.String intern302222222 = ((java.lang.String) objArr892222222[0]).intern();
                java.lang.Object[] objArr902222222 = new java.lang.Object[1];
                b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u000f\u001a㘓", 11 - android.view.View.resolveSizeAndState(0, 0, 0), (byte) (31 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr902222222);
                java.lang.String intern312222222 = ((java.lang.String) objArr902222222[0]).intern();
                java.lang.Object[] objArr912222222 = new java.lang.Object[1];
                b("\u0016\u0003\"\u0002\u0012\u001f\u0003\u001b\u0002\u0010!\u000f", 11 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 68), objArr912222222);
                java.lang.String intern322222222 = ((java.lang.String) objArr912222222[0]).intern();
                java.lang.Object[] objArr922222222 = new java.lang.Object[1];
                c("㬪ᬁ箒娓몭餳廉\ud86b㣅Ὀ翊并", 8311 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr922222222);
                java.lang.String intern332222222 = ((java.lang.String) objArr922222222[0]).intern();
                java.lang.Object[] objArr932222222 = new java.lang.Object[1];
                c("㬪么턖據\uef8d煍萕ྷ銿⑿꼥", 30010 - android.text.TextUtils.indexOf(str4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr932222222);
                java.lang.String intern342222222 = ((java.lang.String) objArr932222222[0]).intern();
                java.lang.Object[] objArr942222222 = new java.lang.Object[1];
                c("㬪꩑ᤩ蠙翷", 37159 - android.graphics.Color.alpha(0), objArr942222222);
                java.lang.String intern352222222 = ((java.lang.String) objArr942222222[0]).intern();
                java.lang.Object[] objArr952222222 = new java.lang.Object[1];
                c("㬪奷｟ᴣ", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 25111, objArr952222222);
                strArr = new java.lang.String[]{intern302222222, intern312222222, intern322222222, intern332222222, intern342222222, intern352222222, ((java.lang.String) objArr952222222[0]).intern()};
                i3 = 0;
                while (true) {
                    if (i3 < 7) {
                    }
                    i3++;
                    strArr = strArr2;
                }
                if (i4 == 0) {
                }
            } catch (java.lang.Throwable th9) {
                java.lang.Throwable cause6 = th9.getCause();
                if (cause6 != null) {
                    throw cause6;
                }
                throw th9;
            }
        }

        static void init$0() {
            $$a = new byte[]{73, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -116, -114, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, com.google.common.base.Ascii.SI, -10};
            $$b = 146;
        }
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 67;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i << getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 381 - android.view.View.getDefaultSize(0, 0), (char) (62388 - android.graphics.Color.red(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (byte) -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 3967, (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.getSize(0) + 34, android.view.KeyEvent.keyCodeFromString("") + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.os.Process.myTid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 48, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 381, (char) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62387));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, (byte) -1, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(SdkCoreAlternateContactlessPaymentDataImpl), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 35, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3967, (char) (40224 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getCapsMode("", 0, 0), android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            $10 = ($11 + 25) % 128;
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 35, 211 - android.os.Process.getGidForName(""), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values(java.lang.String str, com.payair.hce.getNetworkTokenReference getnetworktokenreference) {
        android.database.sqlite.SQLiteStatement compileStatement;
        byte[] AlternateContactlessPaymentDataJson;
        java.lang.String obj;
        int i = RecordsJson + 109;
        getProfileVersion = i % 128;
        if (i % 2 != 0) {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.DigitizedCardProfile.getWritableDatabase();
            if (str != null && !str.isEmpty()) {
                getCvrMaskAnd = (getAid + 65) % 128;
                if (android.database.DatabaseUtils.queryNumEntries(this.DigitizedCardProfile.getReadableDatabase(), ((java.lang.String) writeReplace(new java.lang.Object[]{21, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE)}, 829128761, -829128760, 21)).intern(), ((java.lang.String) writeReplace(new java.lang.Object[]{12, (char) 63445, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE)}, 829128761, -829128760, 12)).intern(), new java.lang.String[]{str}) != 0) {
                    compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{108, (char) 10932, 111}, 829128761, -829128760, 108)).intern());
                    AlternateContactlessPaymentDataJson = getnetworktokenreference.AlternateContactlessPaymentDataJson();
                    java.lang.String DigitizedCardProfile = getnetworktokenreference.DigitizedCardProfile();
                    com.payair.hce.Initializer DigitizedCardProfile2 = DigitizedCardProfile(AlternateContactlessPaymentDataJson);
                    if (AlternateContactlessPaymentDataJson == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append(DigitizedCardProfile);
                        sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile2}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile2))).writeReplace());
                        obj = sb.toString();
                        compileStatement.bindBlob(1, (byte[]) com.payair.hce.NullActivityException.AlternateContactlessPaymentDataJson(new java.lang.Object[]{DigitizedCardProfile2}, -1877837077, 1877837077, java.lang.System.identityHashCode(DigitizedCardProfile2)));
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str);
                        sb2.append(DigitizedCardProfile);
                        sb2.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(new byte[0]).writeReplace());
                        obj = sb2.toString();
                        compileStatement.bindNull(1);
                    }
                    byte[] DigitizedCardProfile3 = DigitizedCardProfile(obj);
                    compileStatement.bindString(2, DigitizedCardProfile);
                    compileStatement.bindBlob(3, DigitizedCardProfile3);
                    compileStatement.bindString(4, str);
                    compileStatement.executeUpdateDelete();
                    compileStatement.clearBindings();
                    return;
                }
                getAid = (getCvrMaskAnd + 51) % 128;
                RecordsJson = (getProfileVersion + 55) % 128;
            }
            compileStatement = writableDatabase.compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{111, (char) 48262, 0}, 829128761, -829128760, 111)).intern());
            AlternateContactlessPaymentDataJson = getnetworktokenreference.AlternateContactlessPaymentDataJson();
            java.lang.String DigitizedCardProfile4 = getnetworktokenreference.DigitizedCardProfile();
            com.payair.hce.Initializer DigitizedCardProfile22 = DigitizedCardProfile(AlternateContactlessPaymentDataJson);
            if (AlternateContactlessPaymentDataJson == null) {
            }
            byte[] DigitizedCardProfile32 = DigitizedCardProfile(obj);
            compileStatement.bindString(2, DigitizedCardProfile4);
            compileStatement.bindBlob(3, DigitizedCardProfile32);
            compileStatement.bindString(4, str);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            return;
        }
        this.DigitizedCardProfile.getWritableDatabase();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        com.payair.hce.setUserValidationRequestListener.getAid = (r1 + 91) % 128;
        DigitizedCardProfile();
        r0 = r8.DigitizedCardProfile.getReadableDatabase();
        r1 = new java.lang.String[0];
        r1[1] = r9;
        r9 = r0.rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{52, (char) 0, 19854}, 829128761, -829128760, 52)).intern(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (r9.moveToFirst() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if ((r0 % 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (((r0 - 120) / 2) != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006a, code lost:
    
        com.payair.hce.setUserValidationRequestListener.getAid = (r1 + 67) % 128;
        DigitizedCardProfile();
        r9 = r8.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{84, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)}, 829128761, -829128760, 84)).intern(), new java.lang.String[]{r9});
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009f, code lost:
    
        if (r9.moveToFirst() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a1, code lost:
    
        r6 = new com.payair.hce.setUserValidationRequestListener.AnonymousClass2(r8, r9.getString(r9.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{19, (char) 53248, 347}, 829128761, -829128760, 19)).intern())), writeReplace(new com.payair.hce.Initializer(r9.getBlob(r9.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{11, (char) 0, 336}, 829128761, -829128760, 11)).intern())))));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.payair.hce.getNetworkTokenReference AlternateContactlessPaymentDataJson(java.lang.String str) {
        android.database.Cursor rawQuery;
        int i = getAid + 3;
        int i2 = i % 128;
        getCvrMaskAnd = i2;
        com.payair.hce.setUserValidationRequestListener.AnonymousClass2 anonymousClass2 = null;
        if (i % 2 == 0) {
            int i3 = getProfileVersion;
            RecordsJson = i3 + 19824;
        } else {
            int i4 = getProfileVersion + 57;
            RecordsJson = i4 % 128;
        }
        rawQuery.close();
        getCvrMaskAnd = (getAid + 21) % 128;
        RecordsJson = (getProfileVersion + 119) % 128;
        return anonymousClass2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0143, code lost:
    
        if ((r2 - 5) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0152, code lost:
    
        r0 = r0 + 13;
        com.payair.hce.setUserValidationRequestListener.getCvrMaskAnd = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x015a, code lost:
    
        if ((r0 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x015c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0150, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.util.List<com.payair.hce.identify> IccPrivateKeyCrtComponentsJson() {
        android.database.Cursor rawQuery = this.DigitizedCardProfile.getReadableDatabase().rawQuery(((java.lang.String) writeReplace(new java.lang.Object[]{35, (char) 58352, 383}, 829128761, -829128760, 35)).intern(), null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rawQuery.moveToFirst()) {
            int i = getAid + 17;
            getCvrMaskAnd = i % 128;
            int i2 = i % 2;
            while (!rawQuery.isAfterLast()) {
                com.payair.hce.identify identifyVar = new com.payair.hce.identify();
                identifyVar.AlternateContactlessPaymentDataJson(rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{7, (char) 0, 418}, 829128761, -829128760, 7)).intern())));
                identifyVar.writeReplace(rawQuery.getString(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{19, (char) 53248, 347}, 829128761, -829128760, 19)).intern())));
                identifyVar.valueOf(rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{11, (char) 0, 336}, 829128761, -829128760, 11)).intern())));
                com.payair.hce.identify.values(new java.lang.Object[]{identifyVar, rawQuery.getBlob(rawQuery.getColumnIndex(((java.lang.String) writeReplace(new java.lang.Object[]{8, java.lang.Character.valueOf(kotlin.text.Typography.almostEqual), java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE)}, 829128761, -829128760, 8)).intern()))}, 315281711, -315281711, java.lang.System.identityHashCode(identifyVar));
                arrayList.add(identifyVar);
                rawQuery.moveToNext();
                int i3 = RecordsJson + 75;
                getProfileVersion = i3 % 128;
                getCvrMaskAnd = (i3 % 2 == 0 ? getAid + 115 : getAid + 43) % 128;
            }
        }
        rawQuery.close();
        int i4 = getAid;
        int i5 = i4 + 79;
        getCvrMaskAnd = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = getProfileVersion * 15;
            RecordsJson = i6 % 11424;
        } else {
            int i7 = getProfileVersion + 79;
            RecordsJson = i7 % 128;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void RecordsJson() {
        int i = (getCvrMaskAnd + 25) % 128;
        getAid = i;
        int i2 = getProfileVersion + 47;
        RecordsJson = i2 % 128;
        if (i2 % 2 != 0) {
            getCvrMaskAnd = (i + 117) % 128;
        }
        this.DigitizedCardProfile.getWritableDatabase().delete(((java.lang.String) writeReplace(new java.lang.Object[]{21, (char) 0, java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE)}, 829128761, -829128760, 21)).intern(), null, null);
        int i3 = getProfileVersion + 101;
        RecordsJson = i3 % 128;
        if (i3 % 2 != 0) {
            getAid = (getCvrMaskAnd + 67) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        r0 = IccPrivateKeyCrtComponentsJson();
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if ((r0 % 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if ((r0 / 2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r0 = IccPrivateKeyCrtComponentsJson();
        r4 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DigitizedCardProfile(com.payair.hce.sign signVar) throws java.security.GeneralSecurityException {
        java.util.List<com.payair.hce.identify> IccPrivateKeyCrtComponentsJson2;
        int i;
        int i2 = getCvrMaskAnd + 121;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = RecordsJson >> 54;
            getProfileVersion = i3 >>> 3360;
        } else {
            int i4 = RecordsJson + 105;
            getProfileVersion = i4 % 128;
        }
        int i5 = getProfileVersion + 51;
        RecordsJson = i5 % 128;
        if (i5 % 2 != 0) {
            getAid = (getCvrMaskAnd + 19) % 128;
        } else {
            int i6 = getCvrMaskAnd + 77;
            getAid = i6 % 128;
            int i7 = i6 % 2;
        }
        while (i < IccPrivateKeyCrtComponentsJson2.size()) {
            java.lang.String valueOf2 = IccPrivateKeyCrtComponentsJson2.get(i).valueOf();
            java.lang.String AlternateContactlessPaymentDataJson = IccPrivateKeyCrtComponentsJson2.get(i).AlternateContactlessPaymentDataJson();
            byte[] AlternateContactlessPaymentDataJson2 = ((com.payair.hce.MDESInstanceIDListenerService) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 1749273454, -1749273451, java.lang.System.identityHashCode(signVar))).AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, -918818020, 918818022, java.lang.System.identityHashCode(signVar)), (byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 89227428, -89227427, java.lang.System.identityHashCode(signVar)), IccPrivateKeyCrtComponentsJson2.get(i).values());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(AlternateContactlessPaymentDataJson);
            sb.append(valueOf2);
            sb.append(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson2).writeReplace());
            byte[] AlternateContactlessPaymentDataJson3 = this.values.AlternateContactlessPaymentDataJson((byte[]) com.payair.hce.sign.DigitizedCardProfile(new java.lang.Object[]{signVar}, 985989721, -985989721, java.lang.System.identityHashCode(signVar)), sb.toString().getBytes());
            android.database.sqlite.SQLiteStatement compileStatement = this.DigitizedCardProfile.getWritableDatabase().compileStatement(((java.lang.String) writeReplace(new java.lang.Object[]{84, (char) 0, 433}, 829128761, -829128760, 84)).intern());
            compileStatement.bindBlob(1, AlternateContactlessPaymentDataJson2);
            compileStatement.bindBlob(2, AlternateContactlessPaymentDataJson3);
            compileStatement.bindString(3, AlternateContactlessPaymentDataJson);
            compileStatement.executeUpdateDelete();
            compileStatement.clearBindings();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i;
        com.payair.hce.setUserValidationRequestListener setuservalidationrequestlistener = (com.payair.hce.setUserValidationRequestListener) objArr[0];
        int i2 = getAid + 9;
        getCvrMaskAnd = i2 % 128;
        if (i2 % 2 == 0) {
            setuservalidationrequestlistener.IccPrivateKeyCrtComponentsJson().size();
            throw null;
        }
        java.util.List<com.payair.hce.identify> IccPrivateKeyCrtComponentsJson2 = setuservalidationrequestlistener.IccPrivateKeyCrtComponentsJson();
        int size = IccPrivateKeyCrtComponentsJson2.size();
        if (size > 0) {
            int i3 = 0;
            boolean z = false;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                java.lang.String valueOf2 = IccPrivateKeyCrtComponentsJson2.get(i3).valueOf();
                java.lang.String AlternateContactlessPaymentDataJson = IccPrivateKeyCrtComponentsJson2.get(i3).AlternateContactlessPaymentDataJson();
                com.payair.hce.bindIsolatedService AlternateContactlessPaymentDataJson2 = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(IccPrivateKeyCrtComponentsJson2.get(i3).values());
                byte[] DigitizedCardProfile = IccPrivateKeyCrtComponentsJson2.get(i3).DigitizedCardProfile();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(AlternateContactlessPaymentDataJson);
                sb.append(valueOf2);
                sb.append(AlternateContactlessPaymentDataJson2);
                z = setuservalidationrequestlistener.valueOf(((java.lang.String) writeReplace(new java.lang.Object[]{17, (char) 30797, 366}, 829128761, -829128760, 17)).intern(), DigitizedCardProfile, sb.toString().getBytes());
                if (z) {
                    getCvrMaskAnd = (getAid + 3) % 128;
                    break;
                }
                getProfileVersion = (RecordsJson + 91) % 128;
                i3++;
            }
            if (z) {
                getCvrMaskAnd = (getAid + 71) % 128;
                int i4 = RecordsJson + 1;
                getProfileVersion = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
                    throw null;
                }
                i = com.payair.hce.onRegisterOperationUnsuccessful.writeReplace;
                getAid = (getCvrMaskAnd + 35) % 128;
                if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
                    com.payair.hce.checkPermission checkpermission = setuservalidationrequestlistener.AlternateContactlessPaymentDataJson;
                    android.view.ViewConfiguration.getMaximumDrawingCacheSize();
                    android.view.View.combineMeasuredStates(0, 0);
                    android.widget.ExpandableListView.getPackedPositionChild(0L);
                }
                getAid = (getCvrMaskAnd + 109) % 128;
                RecordsJson = (getProfileVersion + 31) % 128;
                return null;
            }
        }
        i = com.payair.hce.onRegisterOperationUnsuccessful.AlternateContactlessPaymentDataJson;
        if (i == com.payair.hce.onRegisterOperationUnsuccessful.writeReplace) {
        }
        getAid = (getCvrMaskAnd + 109) % 128;
        RecordsJson = (getProfileVersion + 31) % 128;
        return null;
    }

    static void getProfileVersion() {
        char[] cArr = new char[1072];
        java.nio.ByteBuffer.wrap("^ø´ú\u008a«à_ö\u001aÍß#·9\u0087\u000fne\u000fxÆN³¤\u008bºj\u0090\u0015çÏý\u008aÓû){?S\u0012ëhª~\u009aTSª\n\u0081é\u0097¢í\u0097¾kT,jþ\u0000¯\u0016A-^Ã¤Ùüï?\u0085g\u0098\u0092®åDôZÝp_\u0007 \u001dÂ3\u000bÉ%ßUò\u0098\u0088â\u009eó´9JUa\"wø\rp#\u00039±Ì¦âåø9\u008e@¤L»ÕQög\u0092}\u0019\u0013\u009d&\u008c<\u0014Ò'è\u0005þZ\u0095Ü«\u008dAvW\u0017mæ\u0000ú\u0016.,MÂ\u0083Ø ï\u00ad\u0085»\u009bt±\u000eG8Zðps\u0006[\u001c¬3ÎÉ\u0097ß¡õA\u008b$\u009e¥´ÎJ\u0019`QvÂ\rô#P9\u008fÏ\u0011å\"ø\u0085\u008e¥¤ ºOPõgò}r\u0013\u0095)ý?\bÒ´è£þå\u0094¦ª<A\bW)m\u0093\u0003\u0089\u0019ö,\u0001ÂIØ:î¼\u0084\u0018\u009b'±\u0099G\u0089]\u009dsü\u0006X\u001cW2ÝÈÊÞZõ\u001d\u008b¥¡ ·\fMÊ`-v]\fô\"ð8\u008eÏ\u000båëû¾\u0091,¤ º\u0017PKf\u0092|þ\u0013d)\u0011?ÖÕôë[þ_\u0094\u0091ª!@ÑV\u0084mI\u0003\u001f\u0019&/òÅiØUîÈ\u00848\u009az°¢G>]\u0005sb\tø\u001f¨2SÈäÞöô\u0005\u008a\u0099¡\u008d·#MícÆy\u009a\fY\"\u00148ìÎ\u0003ä\u0097ûÙ\u0091:§v½¬SìfG|%\u0012ú(Í>mÕðëð\u00815\u0097[\u00adq@\u00adVKl\u0000\u0002\u0088\u0019\u009b/©ÅîÛ4ñQ\u0084È\u009a»°jF.\\\u0095s\u0081\t\u0019\u001fÄ5BËoÞÅôò\u008aú \u0014¶\u00adM¯c\u0012yÂ\u000fµ%E8êÎèä¸ú\u0013\u0090f§å½zS\u0080i«\u007fï\u0012c(Z>\"Ô±êk\u0081,\u0097®\u00ad\u009aC÷Yál\u0004\u0002L\u0018î.ÛÄwÛ6ñë\u0087\u008d\u009d&³ÛF+\\Fr\u0094\bí\u001e\u00935\u0018Ëòá·÷\u001b\u008a2 Ú¶XL¸bçy@\u000f\u0002%\u0010;\u0099ÑEä4úã\u00903¦R¼\u0099S&i\u0004\u007f5\u0015ã+¢>^Ôñê5\u0080?\u0096°\u00adØC\u001eYroå\u0005\u0087\u0018@.\u008fÄßÚ\fð\u008a\u0087Æ\u009d0³\u008fIß_ÓrJ\b\u000e\u001eá4#Ê\u009cá¬÷+\u008dk£±¹úL\\bsxë\u000e¢$\u0086;ÿÑ\u001dçvýH\u0093W¦¶¼,R\u001dhÃ\u007f\u0088\u0015\u001b+çÁ\u0010×BêÂ\u0080©\u0096\u0093¬7BÇY\u0092or\u0005é\u001bÇ1DÄ\u0090Úãð¿\u0086\u000e\u009c&³´Iw_Óuþ\u000bN\u001eT4åÊÁà\u0000ö6\u008d®£]¹5O\u0088ePxN\u000eï$\f:zÐQçáýË\u0093O©ê¿:RSh\u0091~°\u0014\f*7Áû×§íF\u0083 \u0099,¬7B»X®n\u0016\u0004\u0094\u001bí1øÇxÝ\u001cðç\u0086Î\u009c\u008d²\u008aH8_\u0003u×\u000bB!R7\u000bÊùà¨ö\u0084\u008c\u0013¢\"¹\u0018O¹e\u0013{T\u0011\u0082$\u0013:ÑÐ~æZüå\u0093«©C¿\u0017U¾k°~\u0015\u0014Î*\u0090À\tÖÿíÃ\u0083E\u0099¼¯ EÖX?n\u000f\u0004ª\u001aw0ÑÇÎÝ|ó/\u0089ê\u009f¤²\u0001H'^¼tø\n/!\u008c7JÍ\u000eãåù\u001f\u008c\u0010¢[¸»NÎe&{K\u0011P'\u001c=ëÐ\u0083æ\u0006üº\u0092\u0091¨û¿<U2kG\u0001È\u0017Ñ*¨ÀLÖðì§\u0082\r\u0099\u0012¯sE}[Úqø\u0004F\u001aR0ÝÆ\u00adÜ\u0012ó\b\u0089\u0099\u009f µÕK5^St\u008a\n¬ o6\u000eÍôã¹ùY\u008f\u000b¥?¸JN\u0094d\u009az\t\u0010«'î=òÓSéAÿ8\u0092ê¨·¾\u0010TâjB\u0001\u001d\u0017§-¸ÃÚÖ#ì\u0010\u0082N\u0098Ã®èEû[\u0003qø\u0007\u009e\u001d\u000209Æ\u000bÜDò§\u0088ï\u009fZµIKÇa¤wh\n\u001f \u009f6zÌ\u008eâåùw\u008fP¥&»ªQ\u0007d\u0005z¨\u0010\u0090&r<ûÓ;éFÿ÷\u0095Ñ«ª¾KT×jæ\u0000x\u0016\u0091-ïÃ<Ù\u009eï§\u0085\u0087\u0098R®\u0016DìZdp\u0087\u0007Ù\u001d\u00123¦É½ßõòx\u0088\u0018\u009eÒ´vKMa¼w(\ry#\u00936{Ì~âIøù\u008e±¥S»¨Q.g\u0006}\u0089\u0010\u009f&\u0014<DÒÿèÖÿº\u0095\u0017«ÔA\u0003WOjæ\u0000ê\u0016³,\u0015ÂôÙ ï;\u0085;\u009bò±UD£Zàpz\u0006\u000b\u001c\u00103\u0096É@ß\u0001õÈ\u008b|\u009ee´ÖJ\u000b`Av\u0012\r¬#\u009e9\u0017ÏÕåbøJ\u008eü¤1ºWP'g¢}¼\u0013\r)×<èÒ\u0016è\u0083þÅ\u0094=«\u009eAØW¯mC\u0003\u0000\u0016î,\u0006Â\u0089Ø¹î$\u0085[\u009b¾±ìGY]^pä\u0006\u009f\u001c\u008f2ÏÈ*ß>õ\u0085\u008bg¡\u007f·\u0014JÚ`ÿvW\f\u0014\"Â9\u0086Ï}ågû\u0098\u0091Ó¤\u0003ºVP®fÃ|È\u0013¤)c?\u000bÕþë\"þ\u0019\u0094sª¤@ÊVÿm\u008c\u0003\u009a\u0019\u000e/5Å\u001fØÀî[\u0084k\u009aÎ±öGK]\u0080s\u001c\t;\u001c\u00832ÖÈºÞAôû\u008bì¡2·\u0097MÈc\u0001v½\f\u009c\"ú8wÎ\u0011åÂût\u0091\u00ad§Ò½(P@f\u0082|Ý\u0012\u001f()?JÕ\u009bëÕ\u0081\u001a\u0097°ªn@\u000bVËlæ\u0002Þ\u0019`/æÅËÛvñ¶\u0084¿\u009a\u0011°îF\u008c\\·sg\t\u0002\u001fá5:Ë\u008cÞëô\u0017\u008a\u0004 ²¶\u009eMMc[y¬\u000f¸\"É8zÎ¦ä¯ú\u0013\u0091â§ø½¸Sei{|Ó\u00123(¨>\u009dÔ\u0005ëk\u0081\u0092\u0097\u0099\u00ad\u007fC\u0011VÄlÈ\u0002\u0092\u0018Ö.\u000fÅ/Û¤ñD\u0087Q\u009d6°þFÇ\\{r\u0013\b\u0011\u001fF5®Ë\u0093áK÷ä\u008aÐ \u008b¶}L2bzy\u0083\u000fÐ%ê;MÑÀäªú`\u0090\u0017¦(¼|Sµiù\u007f;\u0015W+\u0092>¬Ô~ê\t\u0080\u0005\u0097\u0096\u00adÚCÃY\u0011o\u0007\u0002°\u0018\u0012.öÄ\u008dÚ)ñ(\u0087\u000b\u009dS³\u009cIþ\\nrx\bÏ\u001e]4 Ë\u0018á\u009f÷w\u008d\u000e£â¶lLIb8x´\u000eÔ%\u0002;®Ñ\u0099çrý?\u0090\u009e¦z¼/R\u0095h'\u007f\u0000\u0015F+«Á\u008f×Öêj\u0080`\u0096s¬ûB`Y\u0016o\u008a\u0005¡\u001bó1ÌÄ/ÚWðÂ\u0086Á\u009cO³<IÐ_\u0097u\u0017\b\u0002\u001e\u00164mÊÿàÈ÷^\u008d\"£ü¹½O$b\u0018xô\u000ec$\u0081:ÎÑgç)ý6\u0093Ã©B¼~R±h\u0019~f\u0014\u0084+\u0015Á/×[íÊ\u0083\u009c\u0096d¬öBÿXcn\u009a\u0005k\u001b%1\u0088ÇðÝ\u0082ðj\u0086ë\u009cÅ²7H°_Êu\u001b\u000b§!\u00867ÈÊqà\u000föË\u008c~¢¦¹·O1eF{\u009c\u0011\u009b$g:2Ð2æÓý¬\u0093È©Ç¿'Urh\u009f~\u009d\u0014@*\u0018À¯×³í~\u0083Í\u0099\f¯hBøXón¤\u0004\u001e\u001aÞ1\u0099Ç2Ýôó£\u0089n\u009cÚ²ÉHÛ^4tp\u000b\u009f!\u00137\u001aÍ\u0097ãtö\u009c\u008cÏ¢7¸*N&eµ{U\u0011`'\u009e=\u001bÐ\u000fæµüs\u0092 ¨t¿ËU\u008akv\u0001í\u0017\u0001*'À\u009cÖøì6\u0082R\u0099Á¯ëEl[Sn÷\u0004J\u001a¢0«Æ\u001dÝ\u0000ó÷\u0089\u0083\u009fbµ|^æ´È\u008a\u0088à\u001eöGÍ\u0093#¢9ú\u000f\"eJ".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1072);
        IccPrivateKeyCrtComponentsJson = cArr;
        SdkCoreAlternateContactlessPaymentDataImpl = 7731817253418742939L;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAid = 0;
        getCvrMaskAnd = 1;
        getProfileVersion();
        RecordsJson = 0;
        getProfileVersion = 1;
        char[] cArr = new char[my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(29 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "", 0, 0) + 57464), android.view.View.resolveSize(0, 0) + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_COPYRIGHT_FLAG, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        c(1062 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (char) android.text.TextUtils.indexOf("", "", 0), 9 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        java.nio.ByteBuffer.wrap(intern.getBytes(((java.lang.String) objArr2[0]).intern())).asCharBuffer().get(cArr, 0, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CERTIFICATE);
        valueOf = cArr;
        writeReplace = -4896653945864585940L;
        getAid = (getCvrMaskAnd + 57) % 128;
    }

    private static java.lang.String valueOf(int i, char c, int i2) {
        return (java.lang.String) writeReplace(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(i2)}, 829128761, -829128760, i);
    }

    static void init$0() {
        $$d = new byte[]{39, 89, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 10};
        $$e = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
    }

    @Override // com.payair.hce.isLvtAllowed
    public final void AlternateContactlessPaymentDataJson() {
        writeReplace(new java.lang.Object[]{this}, 179554626, -179554626, java.lang.System.identityHashCode(this));
    }
}
