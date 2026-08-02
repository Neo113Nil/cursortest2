package com.payair.hce;

/* loaded from: classes4.dex */
public class compileStatement {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int valueOf;
    private static int values;
    private static int[] writeReplace;
    private boolean AlternateContactlessPaymentDataJson;
    private com.payair.hce.showErrorNotification DigitizedCardProfile;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (b * 4) + 99;
        int i5 = 44 - (s * 2);
        byte[] bArr = $$d;
        int i6 = i + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            i4 = i5;
            int i7 = i6;
            i3 = 0;
            i4 = (i4 + i6) - 1;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            int i8 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i8;
            i6 = bArr[i8];
            i4 = (i4 + i6) - 1;
            i6 = i7;
            i2 = i3;
            i3 = i2 + 1;
            int i82 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            int i822 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 43 - b2;
        byte[] bArr = $$a;
        char[] cArr = new char[35 - b];
        ?? r9 = s + 65;
        if (bArr == null) {
            byte b3 = r9;
            int i4 = 0;
            i2 = i3;
            i3 = (i3 + b3) - 2;
            i2++;
            i = i4;
            cArr[i] = (char) i3;
            i4 = i + 1;
            if (i == 34 - b) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            b3 = bArr[i2];
            i3 = (i3 + b3) - 2;
            i2++;
            i = i4;
            cArr[i] = (char) i3;
            i4 = i + 1;
            if (i == 34 - b) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = r9;
            cArr[i] = (char) i3;
            i4 = i + 1;
            if (i == 34 - b) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        byte[] bArr = $$g;
        int i4 = 66 - (s * 3);
        int i5 = 3 - (i * 2);
        int i6 = i2 * 2;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += -i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i5];
            i4 += -i7;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            i5++;
            bArr2[i3] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    compileStatement() {
    }

    public final void values(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        valueOf = (values + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        byte b = (byte) ($$d[22] - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b, r0[5], objArr);
        if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getmcallbacksannotations)) {
            this.DigitizedCardProfile = (com.payair.hce.showErrorNotification) getmcallbacksannotations;
        } else {
            valueOf = (values + 7) % 128;
            this.DigitizedCardProfile = (com.payair.hce.showErrorNotification) ((com.payair.hce.isGooglePlayServicesAvailable) getmcallbacksannotations).valueOf();
        }
        this.AlternateContactlessPaymentDataJson = z;
        values = (valueOf + 79) % 128;
    }

    public final int writeReplace() {
        values = (valueOf + 25) % 128;
        int bitLength = this.DigitizedCardProfile.valueOf().bitLength();
        if (this.AlternateContactlessPaymentDataJson) {
            valueOf = (values + 35) % 128;
            return ((bitLength + 7) / 8) - 1;
        }
        int i = (bitLength + 7) / 8;
        values = (valueOf + 83) % 128;
        return i;
    }

    public final int AlternateContactlessPaymentDataJson() {
        int i = valueOf + 19;
        values = i % 128;
        if (i % 2 != 0) {
            int bitLength = this.DigitizedCardProfile.valueOf().bitLength();
            if (this.AlternateContactlessPaymentDataJson) {
                int i2 = (bitLength + 7) / 8;
                values = (valueOf + 121) % 128;
                return i2;
            }
            return ((bitLength + 7) / 8) - 1;
        }
        this.DigitizedCardProfile.valueOf().bitLength();
        throw new java.lang.ArithmeticException();
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int i2;
        int length;
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = writeReplace;
        int i3 = 1;
        int i4 = 0;
        if (iArr3 != null) {
            int i5 = $10 + 29;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(iArr3[i6])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 27, android.view.KeyEvent.normalizeMetaState(0) + 29, (char) android.graphics.Color.alpha(0))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr2[i6] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            $11 = ($10 + 17) % 128;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = writeReplace;
        if (iArr5 != null) {
            $11 = ($10 + 81) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                $11 = ($10 + 23) % 128;
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[i4] = java.lang.Integer.valueOf(iArr5[i7]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 29 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                }
                iArr6[i7] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i7++;
                i3 = 1;
                i4 = 0;
            }
            i2 = i4;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        java.lang.System.arraycopy(iArr5, i2, iArr4, i2, length2);
        istransitsupported.valueOf = i2;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[i2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr4);
            int i8 = 0;
            for (int i9 = 16; i8 < i9; i9 = 16) {
                int i10 = $11 + 25;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    istransitsupported.DigitizedCardProfile ^= iArr4[i8];
                    java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, 5089 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                    }
                    int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue;
                    i8 += 61;
                } else {
                    istransitsupported.DigitizedCardProfile ^= iArr4[i8];
                    java.lang.Object[] objArr5 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                    if (obj4 == null) {
                        obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 31, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 5088, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj4);
                    }
                    int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr5)).intValue();
                    istransitsupported.DigitizedCardProfile = istransitsupported.values;
                    istransitsupported.values = intValue2;
                    i8++;
                }
            }
            int i11 = istransitsupported.DigitizedCardProfile;
            istransitsupported.DigitizedCardProfile = istransitsupported.values;
            istransitsupported.values = i11;
            istransitsupported.values ^= iArr4[16];
            istransitsupported.DigitizedCardProfile ^= iArr4[17];
            int i12 = istransitsupported.DigitizedCardProfile;
            int i13 = istransitsupported.values;
            cArr[0] = (char) (istransitsupported.DigitizedCardProfile >>> 16);
            cArr[1] = (char) istransitsupported.DigitizedCardProfile;
            cArr[2] = (char) (istransitsupported.values >>> 16);
            cArr[3] = (char) istransitsupported.values;
            com.payair.hce.isTransitSupported.values(iArr4);
            cArr2[istransitsupported.valueOf * 2] = cArr[0];
            cArr2[(istransitsupported.valueOf * 2) + 1] = cArr[1];
            cArr2[(istransitsupported.valueOf * 2) + 2] = cArr[2];
            cArr2[(istransitsupported.valueOf * 2) + 3] = cArr[3];
            java.lang.Object[] objArr6 = {istransitsupported, istransitsupported};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj5 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2924 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.view.KeyEvent.normalizeMetaState(0) + 3037));
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                d(0, 0, (short) 0, objArr7);
                obj5 = cls.getMethod((java.lang.String) objArr7[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r8 != r6.length) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.math.BigInteger writeReplace(byte[] bArr, int i, int i2) {
        valueOf = (values + 125) % 128;
        if (i2 > writeReplace() + 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b(new int[]{1241538876, -1271379582, -850123448, -2064827947, 435347716, 616389939, 715294378, -1652644291, -331049660, 836796061, -1337116724, 833555994, -1924515345, 591629504, -1703427648, 1355178792}, 31 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr[0]).intern());
        }
        if (i2 == writeReplace() + 1 && !this.AlternateContactlessPaymentDataJson) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(new int[]{1241538876, -1271379582, -850123448, -2064827947, 435347716, 616389939, 715294378, -1652644291, -331049660, 836796061, -1337116724, 833555994, -1924515345, 591629504, -1703427648, 1355178792}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, objArr2);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr2[0]).intern());
        }
        if (i == 0) {
            int i3 = valueOf + 91;
            values = i3 % 128;
            if (i3 % 2 == 0) {
                int length = bArr.length;
                throw null;
            }
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        bArr = bArr2;
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(this.DigitizedCardProfile.valueOf()) < 0) {
            return bigInteger;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b(new int[]{1241538876, -1271379582, -850123448, -2064827947, 435347716, 616389939, 715294378, -1652644291, -331049660, 836796061, -1337116724, 833555994, -1924515345, 591629504, -1703427648, 1355178792}, 30 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
        throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr3[0]).intern());
    }

    public final byte[] DigitizedCardProfile(java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.AlternateContactlessPaymentDataJson) {
            if (byteArray[0] == 0) {
                values = (valueOf + 105) % 128;
                if (byteArray.length > AlternateContactlessPaymentDataJson()) {
                    int length = byteArray.length - 1;
                    byte[] bArr = new byte[length];
                    java.lang.System.arraycopy(byteArray, 1, bArr, 0, length);
                    return bArr;
                }
            }
            if (byteArray.length >= AlternateContactlessPaymentDataJson()) {
                return byteArray;
            }
            values = (valueOf + 47) % 128;
            int AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson();
            byte[] bArr2 = new byte[AlternateContactlessPaymentDataJson];
            java.lang.System.arraycopy(byteArray, 0, bArr2, AlternateContactlessPaymentDataJson - byteArray.length, byteArray.length);
            return bArr2;
        }
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length2 = byteArray.length - 1;
        byte[] bArr3 = new byte[length2];
        java.lang.System.arraycopy(byteArray, 1, bArr3, 0, length2);
        int i = valueOf + 89;
        values = i % 128;
        if (i % 2 != 0) {
            return bArr3;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.compileStatement compilestatement = (com.payair.hce.compileStatement) objArr[0];
        java.math.BigInteger bigInteger = (java.math.BigInteger) objArr[1];
        int i = valueOf + 39;
        values = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.showErrorNotification showerrornotification = compilestatement.DigitizedCardProfile;
            if (showerrornotification instanceof com.payair.hce.getRemoteContext) {
                com.payair.hce.getRemoteContext getremotecontext = (com.payair.hce.getRemoteContext) showerrornotification;
                java.math.BigInteger bigInteger2 = (java.math.BigInteger) com.payair.hce.getRemoteContext.DigitizedCardProfile(new java.lang.Object[]{getremotecontext}, 1300626065, -1300626064, java.lang.System.identityHashCode(getremotecontext));
                java.math.BigInteger bigInteger3 = (java.math.BigInteger) com.payair.hce.getRemoteContext.DigitizedCardProfile(new java.lang.Object[]{getremotecontext}, 1302316443, -1302316440, java.lang.System.identityHashCode(getremotecontext));
                java.math.BigInteger bigInteger4 = (java.math.BigInteger) com.payair.hce.getRemoteContext.DigitizedCardProfile(new java.lang.Object[]{getremotecontext}, -1481790620, 1481790622, java.lang.System.identityHashCode(getremotecontext));
                java.math.BigInteger bigInteger5 = (java.math.BigInteger) com.payair.hce.getRemoteContext.DigitizedCardProfile(new java.lang.Object[]{getremotecontext}, 1357454054, -1357454054, java.lang.System.identityHashCode(getremotecontext));
                java.math.BigInteger bigInteger6 = (java.math.BigInteger) com.payair.hce.getRemoteContext.DigitizedCardProfile(new java.lang.Object[]{getremotecontext}, 1047405534, -1047405530, java.lang.System.identityHashCode(getremotecontext));
                java.math.BigInteger modPow = bigInteger.remainder(bigInteger2).modPow(bigInteger4, bigInteger2);
                java.math.BigInteger modPow2 = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
                return modPow.subtract(modPow2).multiply(bigInteger6).mod(bigInteger2).multiply(bigInteger3).add(modPow2);
            }
            java.math.BigInteger modPow3 = bigInteger.modPow(showerrornotification.values(), compilestatement.DigitizedCardProfile.valueOf());
            values = (valueOf + 67) % 128;
            return modPow3;
        }
        com.payair.hce.showErrorNotification showerrornotification2 = compilestatement.DigitizedCardProfile;
        throw null;
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        valueOf = 0;
        values = 1;
        writeReplace = new int[]{746249830, -1892893859, 859401031, -1036627719, -1193084546, -766532847, -1205946073, 2134566641, -266741637, -406001076, -902569239, -2036589232, -26831507, 151978543, 1031680664, -1763045897, -298099456, -1782818025};
    }

    static void init$2() {
        $$g = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -43, -26, -116};
        $$h = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x03cd, code lost:
    
        if (r0.contains(r2.getField((java.lang.String) r4[0]).get(null)) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x05b2, code lost:
    
        if (((((int) r0) & (((((~((-2134053) | r3)) | 1074070785) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 550029548) + ((~(r4 | (-2134053))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING))) | (((int) (r0 >> 32)) & ((((((~((-1439694818) | r4)) | (-2468407)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) - 1453938172) + (((~((-371233) | r4)) | (~((-2097175) | r3))) * (-519))) + (((~((-2468407) | r3)) | 1439694817) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)))) == 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0663, code lost:
    
        com.payair.hce.compileStatement.valueOf = (com.payair.hce.compileStatement.values + 49) % 128;
        r0 = new java.lang.Object[]{new int[]{r3}, new int[]{r3 ^ 10}, null, new int[1]};
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0684, code lost:
    
        r5 = new java.lang.Object[]{java.lang.Integer.valueOf(r28), 16, java.lang.Integer.valueOf(((((~((~r3) | (-291002881))) * 433) + 1119630334) + (((~((-646423792) | r3)) | (-358505194)) * (-433))) + (((~(r3 | (-358505194))) | (-937426672)) * 433))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x06cd, code lost:
    
        if (r1 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x06cf, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 2713, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
        r3 = r24 - 5;
        r8 = new java.lang.Object[1];
        c((byte) r3, r13[0], (short) r3, r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x072a, code lost:
    
        ((int[]) r0[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0731, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0661, code lost:
    
        if (r0.equals(((java.lang.String) r5[0]).intern()) != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson(android.content.Context context, int i, int i2) {
        java.lang.Object[] objArr;
        int i3;
        int i4;
        int i5 = values;
        int i6 = i5 + 109;
        valueOf = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        try {
            if (context == null) {
                valueOf = (i5 + 43) % 128;
                java.lang.Object[] objArr2 = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i7 = ~i;
                java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-316608251) | i)) | (-688320735)) * (-318)) - 1235523936) + (((~((-688320735) | i)) | (~(i7 | 1004535550))) * 318) + (((~(i | 1004535550)) | (~(i7 | (-687927301)))) * 318))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.MotionEvent.axisFromString("") + 2714, (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                    int i8 = $$b - 5;
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    c((byte) i8, $$a[0], (short) i8, objArr4);
                    obj = cls.getMethod((java.lang.String) objArr4[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr2[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr3)).intValue();
                return objArr2;
            }
            valueOf = (i5 + 51) % 128;
            try {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                b(new int[]{843815039, -1192860732, 1056661685, 1358152202, -1220092962, -1836866126, -1013599448, 956405388, 1483317343, 1285654256, 2124296071, 688224075}, 22 - android.os.Process.getGidForName(""), objArr5);
                java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr5[0]).intern());
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                b(new int[]{-1257847773, -713777718, 778934297, -1358379442, -913552850, -796650905, 667557687, -2139962288, 653711669, 833137654}, android.text.TextUtils.getOffsetAfter("", 0) + 18, objArr6);
                java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr6[0]).intern(), null).invoke(context, null);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                b(new int[]{843815039, -1192860732, 1056661685, 1358152202, -1220092962, -1836866126, -1013599448, 956405388, 33223933, -1139241144, 778934297, -1358379442, -913552850, -796650905, 667557687, -2139962288, 653711669, 833137654}, 34 - android.graphics.Color.green(0), objArr7);
                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(new int[]{1894665760, 1673968399, -648961638, 1547493161}, 5 - android.view.View.combineMeasuredStates(0, 0), objArr8);
                if ((cls3.getField(((java.lang.String) objArr8[0]).intern()).getInt(invoke) & 2) != 0) {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                    int i9 = ~i;
                    int i10 = ~((-538043921) | i);
                    java.lang.Object[] objArr9 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf((((~(i9 | (-399382888))) | 331880710 | i10) * (-713)) + 39448318 + (i10 * 1426) + ((~(i9 | (-605546098))) * 713))};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj2 == null) {
                        java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode("", 0, 0), android.view.KeyEvent.getDeadChar(0, 0) + 2713, (char) android.view.View.resolveSizeAndState(0, 0, 0));
                        int i11 = $$b - 5;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        c((byte) i11, $$a[0], (short) i11, objArr10);
                        obj2 = cls4.getMethod((java.lang.String) objArr10[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj2);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr9)).intValue();
                } else {
                    objArr = new java.lang.Object[]{new int[]{i}, new int[]{i}, null, new int[1]};
                    int i12 = ~i;
                    java.lang.Object[] objArr11 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((((~((-906274684) | i12)) | 98654301) * (-602)) - 1823951319) + (((~((-906274684) | i)) | 67108953 | (~(937820031 | i12))) * (-301)) + ((~(i12 | 98654301)) * 301))};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj3 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength("") + 50, android.widget.ExpandableListView.getPackedPositionType(0L) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        int i13 = $$b - 5;
                        java.lang.Object[] objArr12 = new java.lang.Object[1];
                        c((byte) i13, $$a[0], (short) i13, objArr12);
                        obj3 = cls5.getMethod((java.lang.String) objArr12[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj3);
                    }
                    ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr11)).intValue();
                }
                if (((int[]) objArr[1])[0] != i) {
                    valueOf = (values + 53) % 128;
                    return objArr;
                }
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2058003131);
                if (obj4 == null) {
                    java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 34, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1738, (char) (5826 - android.graphics.Color.red(0)));
                    int i14 = $$b - 5;
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c((byte) i14, $$a[0], (short) i14, objArr13);
                    obj4 = cls6.getMethod((java.lang.String) objArr13[0], null);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2058003131, obj4);
                }
                java.util.Set set = (java.util.Set) ((java.lang.reflect.Method) obj4).invoke(null, null);
                java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 33, 1738 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) (5825 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                i3 = $$b;
                int i15 = i3 - 5;
                byte b = (byte) i15;
                byte[] bArr = $$a;
                short s = (short) i15;
                java.lang.Object[] objArr14 = new java.lang.Object[1];
                c(b, bArr[0], s, objArr14);
                if (!set.contains(cls7.getField((java.lang.String) objArr14[0]).get(null))) {
                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, 1738 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (char) (5825 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)));
                    byte b2 = (byte) i3;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    c((byte) (i3 | 24), b2, (short) (b2 | 48), objArr15);
                }
                if (android.os.Build.VERSION.SDK_INT == 30) {
                    valueOf = (values + 3) % 128;
                    java.lang.Object[] objArr16 = {new int[]{i}, new int[]{i}, null, new int[1]};
                    int i16 = ~(633105722 | i);
                    java.lang.Object[] objArr17 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((302092932 | i16) * (-814)) + 2061159070 + ((i16 | (~((~i) | (-371823263))) | 563375392) * 407) + (((~(i | (-633105723))) | 563375392 | (~(371823262 | i))) * 407))};
                    java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                    if (obj5 == null) {
                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetBefore("", 0) + 50, 2714 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0));
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        c(b, bArr[0], s, objArr18);
                        obj5 = cls9.getMethod((java.lang.String) objArr18[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
                    }
                    ((int[]) objArr16[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr17)).intValue();
                    return objArr16;
                }
                try {
                    try {
                        if (android.os.Build.VERSION.SDK_INT > 33) {
                            java.lang.Object[] objArr19 = new java.lang.Object[1];
                            b(new int[]{-131512676, -914159984, -96642313, 147498723, 1774954667, -2069764689, -964293636, 587000919, 2008652854, -1847635666, 1442891197, 1334596813, 441465030, -1574045026}, 28 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr19);
                            try {
                                java.lang.Object[] objArr20 = {((java.lang.String) objArr19[0]).intern()};
                                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj6 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.text.TextUtils.indexOf("", ""), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 3161, (char) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33099));
                                    java.lang.Object[] objArr21 = new java.lang.Object[1];
                                    c((byte) 34, b, (short) (b | 653), objArr21);
                                    obj6 = cls10.getMethod((java.lang.String) objArr21[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj6);
                                }
                                long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr20)).longValue();
                                long j = i;
                                long j2 = ~j;
                                long j3 = ~(longValue | (-433150576));
                                long j4 = (~longValue) | 433150575;
                                i4 = i3;
                                long j5 = (((((1435 * longValue) + 310135812416L) + ((longValue | 433150575) * (-1434))) + (((~(j4 | j)) | ((~(j2 | longValue)) | j3)) * 717)) + (((~(longValue | j)) | ((~(j4 | j2)) | j3)) * 717)) - 904517532;
                                i3 = i;
                                int i17 = ~i3;
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } else {
                            i4 = i3;
                            i3 = i;
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            b(new int[]{456329186, 836338668, 2008652854, -1847635666, 1442891197, 1334596813, -873476123, -40840422}, 13 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr22);
                            try {
                                java.lang.Object[] objArr23 = {((java.lang.String) objArr22[0]).intern()};
                                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj7 == null) {
                                    java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), 1920 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16));
                                    java.lang.Object[] objArr24 = new java.lang.Object[1];
                                    c((byte) 34, b, (short) (b | 653), objArr24);
                                    obj7 = cls11.getMethod((java.lang.String) objArr24[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj7);
                                }
                                java.lang.Object invoke2 = ((java.lang.reflect.Method) obj7).invoke(null, objArr23);
                                java.lang.Object[] objArr25 = new java.lang.Object[1];
                                b(new int[]{1664502577, 680207536}, (android.view.ViewConfiguration.getTapTimeout() >> 16) + 1, objArr25);
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
                } catch (java.lang.Exception unused2) {
                    i3 = i;
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
        java.lang.Object[] objArr26 = {new int[]{i3}, new int[]{i3}, null, new int[1]};
        int i18 = ~i3;
        java.lang.Object[] objArr27 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf(((809608224 | i18) * (-192)) + 677765592 + (((~((-194927328) | i18)) | 393433) * (-384)) + (((~(i18 | (-194533895))) | (~(i3 | (-393434))) | (~(1004535551 | i3))) * 192))};
        java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
        if (obj8 == null) {
            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 49, 2712 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
            int i19 = $$b - 5;
            java.lang.Object[] objArr28 = new java.lang.Object[1];
            c((byte) i19, $$a[0], (short) i19, objArr28);
            obj8 = cls12.getMethod((java.lang.String) objArr28[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj8);
        }
        ((int[]) objArr26[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj8).invoke(null, objArr27)).intValue();
        return objArr26;
    }

    static void init$1() {
        $$d = new byte[]{com.google.common.base.Ascii.US, -55, -63, 6, 13, -1, -62, 67, -14, com.google.common.base.Ascii.EM, -23, 9, 10, -67, 59, -4, 3, -54, 60, com.google.common.base.Ascii.VT, -43, 41, 1, -7, 6, -6, -20, com.google.common.base.Ascii.GS, -10, com.google.common.base.Ascii.EM, -37, 19, 14, 5, -12, -5, 3, com.google.common.base.Ascii.SI, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -20, 9, 4, -10, 2, com.google.common.base.Ascii.VT, -6};
        $$e = 154;
    }

    static void init$0() {
        $$a = new byte[]{39, 108, -2, 93, 45, 10, -13, com.google.common.base.Ascii.SI, -2, -11, com.google.common.base.Ascii.NAK, -13, -32, 46, 1, 8, -17, 4, 19, -6, -5, 16, 2, -33, 19, com.google.common.base.Ascii.SUB, -10, -6, com.google.common.base.Ascii.VT, 8, -46, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, -17, -21, 43, -2, 1, -19, 13, com.google.common.base.Ascii.VT, -14, 16};
        $$b = 5;
    }

    public final java.math.BigInteger writeReplace(java.math.BigInteger bigInteger) {
        return (java.math.BigInteger) writeReplace(new java.lang.Object[]{this, bigInteger}, -1511920445, 1511920445, java.lang.System.identityHashCode(this));
    }
}
