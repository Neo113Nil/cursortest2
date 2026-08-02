package com.payair.hce;

/* loaded from: classes4.dex */
public final class close implements com.payair.hce.findFragmentById {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static int getProfileVersion;
    private java.security.SecureRandom AlternateContactlessPaymentDataJson;
    private com.payair.hce.findFragmentById DigitizedCardProfile;
    private boolean valueOf;
    private byte[] values;
    private com.payair.hce.getTransactionExecutor writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = s2 + 4;
        byte[] bArr = $$a;
        int i3 = (s3 * 4) + 99;
        int i4 = s * 2;
        byte[] bArr2 = new byte[i4 + 44];
        int i5 = i4 + 43;
        if (bArr == null) {
            int i6 = i5;
            i = 0;
            i3 = (i3 + (-i6)) - 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i++;
            i6 = bArr[i2];
            i3 = (i3 + (-i6)) - 1;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = (i * 4) + 4;
        byte[] bArr = $$d;
        int i6 = 1 - (b2 * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            i3 = i5;
            int i7 = i6;
            i4 = 0;
            i5 += -i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i3];
            i5 += -i7;
            i3++;
            i2 = i4;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            int i8 = 99 - (b * 33);
            i2 = 0;
            i3 = i5;
            i5 = i8;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public close(com.payair.hce.findFragmentById findfragmentbyid, com.payair.hce.getTransactionExecutor gettransactionexecutor) {
        this(findfragmentbyid, gettransactionexecutor, (byte) 0);
    }

    private close(com.payair.hce.findFragmentById findfragmentbyid, com.payair.hce.getTransactionExecutor gettransactionexecutor, byte b) {
        this(findfragmentbyid, gettransactionexecutor, gettransactionexecutor, null);
    }

    private close(com.payair.hce.findFragmentById findfragmentbyid, com.payair.hce.getTransactionExecutor gettransactionexecutor, com.payair.hce.getTransactionExecutor gettransactionexecutor2, byte[] bArr) {
        this.DigitizedCardProfile = findfragmentbyid;
        this.writeReplace = gettransactionexecutor2;
        this.values = new byte[gettransactionexecutor.AlternateContactlessPaymentDataJson()];
        gettransactionexecutor.valueOf();
        gettransactionexecutor.valueOf(this.values, 0);
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        byte b = 0;
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $11 + 51;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[b] = java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i % getcvmmodel.valueOf]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.text.TextUtils.getOffsetAfter("", b) + 381, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 62387));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(b, b, b, objArr3);
                        java.lang.String str = (java.lang.String) objArr3[b];
                        java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                        clsArr[b] = java.lang.Integer.TYPE;
                        obj = cls.getMethod(str, clsArr);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.Gravity.getAbsoluteGravity(0, 0) + 35, (-16773250) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.blue(0) + 34, 213 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, 381 - (android.os.Process.myPid() >> 22), (char) (android.view.View.combineMeasuredStates(0, 0) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, (byte) 0, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3967, (char) (android.view.View.combineMeasuredStates(0, 0) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson('R' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), 212 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            b = 0;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 213, (char) android.view.View.MeasureSpec.getSize(0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
            $11 = ($10 + 63) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.findFragmentById
    public final void values(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) {
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 25) % 128;
        byte[] bArr = $$a;
        byte b = (byte) (bArr[5] - 1);
        byte b2 = bArr[22];
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, (byte) (b2 + 1), objArr);
        if (java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getmcallbacksannotations)) {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 61) % 128;
            this.AlternateContactlessPaymentDataJson = ((com.payair.hce.isGooglePlayServicesAvailable) getmcallbacksannotations).DigitizedCardProfile();
        } else {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 25) % 128;
            try {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(new int[]{-260966676, 105997847, 1396729588, 1740195844, 1823450732, 1243220149, -1109512661, 602883828, 2121051117, 1989068947, 1569420247, -542795795, -2084085818, -686194906}, 26 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
                this.AlternateContactlessPaymentDataJson = (java.security.SecureRandom) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.DigitizedCardProfile.values(z, getmcallbacksannotations);
        this.valueOf = z;
    }

    private static void b(int[] iArr, int i, java.lang.Object[] objArr) {
        int[] iArr2;
        com.payair.hce.isTransitSupported istransitsupported = new com.payair.hce.isTransitSupported();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = RecordsJson;
        int i2 = 16;
        int i3 = 1;
        char c = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            int[] iArr4 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(iArr3[i4]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                    if (obj == null) {
                        obj = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - (android.view.ViewConfiguration.getFadingEdgeLength() >> i2), (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, (char) (android.os.Process.getGidForName("") + 1))).getMethod("z", java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj);
                    }
                    iArr4[i4] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                    i4++;
                    i2 = 16;
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
        int[] iArr6 = RecordsJson;
        if (iArr6 != null) {
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i5 = 0;
            while (i5 < length3) {
                java.lang.Object[] objArr3 = new java.lang.Object[i3];
                objArr3[0] = java.lang.Integer.valueOf(iArr6[i5]);
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-902340571);
                if (obj2 == null) {
                    iArr2 = iArr6;
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 27, android.view.View.resolveSizeAndState(0, 0, 0) + 29, (char) (android.view.ViewConfiguration.getEdgeSlop() >> 16))).getMethod("z", java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-902340571, obj2);
                } else {
                    iArr2 = iArr6;
                }
                iArr7[i5] = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr3)).intValue();
                i5++;
                iArr6 = iArr2;
                i3 = 1;
            }
            iArr6 = iArr7;
        }
        char c2 = 0;
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length2);
        istransitsupported.valueOf = 0;
        while (istransitsupported.valueOf < iArr.length) {
            cArr[c2] = (char) (iArr[istransitsupported.valueOf] >> 16);
            cArr[1] = (char) iArr[istransitsupported.valueOf];
            cArr[2] = (char) (iArr[istransitsupported.valueOf + 1] >> 16);
            cArr[3] = (char) iArr[istransitsupported.valueOf + 1];
            istransitsupported.DigitizedCardProfile = (cArr[0] << 16) + cArr[1];
            istransitsupported.values = (cArr[2] << 16) + cArr[3];
            com.payair.hce.isTransitSupported.values(iArr5);
            int i6 = 0;
            for (int i7 = 16; i6 < i7; i7 = 16) {
                istransitsupported.DigitizedCardProfile ^= iArr5[i6];
                java.lang.Object[] objArr4 = {istransitsupported, java.lang.Integer.valueOf(com.payair.hce.isTransitSupported.writeReplace(istransitsupported.DigitizedCardProfile)), istransitsupported, istransitsupported};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1131271445);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(31 - android.graphics.Color.argb(0, 0, 0, 0), 5088 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("D", java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1131271445, obj3);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr4)).intValue();
                istransitsupported.DigitizedCardProfile = istransitsupported.values;
                istransitsupported.values = intValue;
                i6++;
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
            java.lang.Object[] objArr5 = {istransitsupported, istransitsupported};
            java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-825681165);
            if (obj4 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), android.text.TextUtils.getCapsMode("", 0, 0) + 2923, (char) (android.os.Process.getGidForName("") + 3038));
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                d(0, (byte) 1, (byte) 0, objArr6);
                obj4 = cls.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-825681165, obj4);
            }
            ((java.lang.reflect.Method) obj4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // com.payair.hce.findFragmentById
    public final int DigitizedCardProfile() {
        int i = getProfileVersion + 5;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            int DigitizedCardProfile = this.DigitizedCardProfile.DigitizedCardProfile();
            if (!this.valueOf) {
                return DigitizedCardProfile;
            }
            int length = this.values.length;
            int i2 = getProfileVersion + 1;
            SdkCoreAlternateContactlessPaymentDataImpl = i2 % 128;
            if (i2 % 2 != 0) {
                return (DigitizedCardProfile - 1) - (length * 2);
            }
            throw null;
        }
        this.DigitizedCardProfile.DigitizedCardProfile();
        throw null;
    }

    @Override // com.payair.hce.findFragmentById
    public final int values() {
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 113) % 128;
        int values = this.DigitizedCardProfile.values();
        if (this.valueOf) {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 21) % 128;
            return values;
        }
        int length = (values - 1) - (this.values.length * 2);
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 55) % 128;
        return length;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.close closeVar = (com.payair.hce.close) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        int intValue2 = ((java.lang.Number) objArr[3]).intValue();
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 83;
        int i2 = i % 128;
        getProfileVersion = i2;
        if (i % 2 == 0) {
            if (closeVar.valueOf) {
                int i3 = i2 + 41;
                SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                if (i3 % 2 != 0) {
                    return closeVar.DigitizedCardProfile(bArr, intValue, intValue2);
                }
                closeVar.DigitizedCardProfile(bArr, intValue, intValue2);
                throw null;
            }
            return closeVar.valueOf(bArr, intValue, intValue2);
        }
        boolean z = closeVar.valueOf;
        throw null;
    }

    private byte[] DigitizedCardProfile(byte[] bArr, int i, int i2) throws com.payair.hce.getSuspendingTransactionId {
        int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 53;
        getProfileVersion = i3 % 128;
        if (i3 % 2 != 0) {
            DigitizedCardProfile();
            throw new java.lang.ArithmeticException();
        }
        if (i2 > DigitizedCardProfile()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            c(android.text.TextUtils.indexOf("", "", 0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 17716), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, objArr);
            throw new com.payair.hce.getInvalidationTracker(((java.lang.String) objArr[0]).intern());
        }
        int DigitizedCardProfile = DigitizedCardProfile() + 1 + (this.values.length * 2);
        byte[] bArr2 = new byte[DigitizedCardProfile];
        int i4 = DigitizedCardProfile - i2;
        java.lang.System.arraycopy(bArr, i, bArr2, i4, i2);
        bArr2[i4 - 1] = 1;
        byte[] bArr3 = this.values;
        java.lang.System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length = this.values.length;
        byte[] bArr4 = new byte[length];
        java.security.SecureRandom secureRandom = this.AlternateContactlessPaymentDataJson;
        int i5 = SdkCoreAlternateContactlessPaymentDataImpl;
        getProfileVersion = (i5 + 69) % 128;
        getProfileVersion = (i5 + 3) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b(new int[]{-1400354587, 375887301, 110271226, -446309921, -1004812987, 710510742}, (android.os.Process.myTid() >> 22) + 9, objArr2);
            java.util.Random.class.getMethod((java.lang.String) objArr2[0], byte[].class).invoke(secureRandom, bArr4);
            byte[] DigitizedCardProfile2 = DigitizedCardProfile(bArr4, 0, length, DigitizedCardProfile - this.values.length);
            for (int length2 = this.values.length; length2 != DigitizedCardProfile; length2++) {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 93) % 128;
                bArr2[length2] = (byte) (bArr2[length2] ^ DigitizedCardProfile2[length2 - this.values.length]);
            }
            java.lang.System.arraycopy(bArr4, 0, bArr2, 0, this.values.length);
            byte[] bArr5 = this.values;
            byte[] DigitizedCardProfile3 = DigitizedCardProfile(bArr2, bArr5.length, DigitizedCardProfile - bArr5.length, bArr5.length);
            for (int i6 = 0; i6 != this.values.length; i6++) {
                bArr2[i6] = (byte) (bArr2[i6] ^ DigitizedCardProfile3[i6]);
            }
            return this.DigitizedCardProfile.writeReplace(bArr2, 0, DigitizedCardProfile);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private byte[] valueOf(byte[] bArr, int i, int i2) throws com.payair.hce.getSuspendingTransactionId {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 59) % 128;
        byte[] writeReplace = this.DigitizedCardProfile.writeReplace(bArr, i, i2);
        int values = this.DigitizedCardProfile.values();
        byte[] bArr4 = new byte[values];
        java.lang.System.arraycopy(writeReplace, 0, bArr4, values - writeReplace.length, writeReplace.length);
        byte[] bArr5 = this.values;
        boolean z2 = values < (bArr5.length * 2) + 1;
        byte[] DigitizedCardProfile = DigitizedCardProfile(bArr4, bArr5.length, values - bArr5.length, bArr5.length);
        int i3 = 0;
        while (true) {
            bArr2 = this.values;
            if (i3 == bArr2.length) {
                break;
            }
            bArr4[i3] = (byte) (bArr4[i3] ^ DigitizedCardProfile[i3]);
            i3++;
        }
        byte[] DigitizedCardProfile2 = DigitizedCardProfile(bArr4, 0, bArr2.length, values - bArr2.length);
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 13) % 128;
        for (int length = this.values.length; length != values; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ DigitizedCardProfile2[length - this.values.length]);
        }
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            bArr3 = this.values;
            if (i4 == bArr3.length) {
                break;
            }
            if (bArr3[i4] != bArr4[bArr3.length + i4]) {
                getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 111) % 128;
                z3 = true;
            }
            i4++;
        }
        getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 69) % 128;
        int i5 = values;
        for (int length2 = bArr3.length * 2; length2 != values; length2++) {
            if (bArr4[length2] != 0) {
                SdkCoreAlternateContactlessPaymentDataImpl = (getProfileVersion + 83) % 128;
                z = true;
            } else {
                z = false;
            }
            if (z & (i5 == values)) {
                i5 = length2;
            }
        }
        boolean z4 = i5 > values + (-1);
        boolean z5 = bArr4[i5] != 1;
        int i6 = i5 + 1;
        if (!(z4 | z5) && !(z2 | z3)) {
            int i7 = values - i6;
            byte[] bArr6 = new byte[i7];
            java.lang.System.arraycopy(bArr4, i6, bArr6, 0, i7);
            return bArr6;
        }
        com.payair.hce.getClientVersion.writeReplace(bArr4);
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(18 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 10 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
        throw new com.payair.hce.getSuspendingTransactionId(((java.lang.String) objArr[0]).intern());
    }

    private static void AlternateContactlessPaymentDataJson(int i, byte[] bArr) {
        int i2 = getProfileVersion + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i3 = i2 % 128;
        SdkCoreAlternateContactlessPaymentDataImpl = i3;
        if (i2 % 2 == 0) {
            bArr[0] = (byte) (i / 78);
            bArr[1] = (byte) (i >> 118);
            bArr[5] = (byte) (i >> 27);
            bArr[4] = (byte) i;
        } else {
            bArr[0] = (byte) (i >>> 24);
            bArr[1] = (byte) (i >>> 16);
            bArr[2] = (byte) (i >>> 8);
            bArr[3] = (byte) i;
        }
        int i4 = i3 + 61;
        getProfileVersion = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private byte[] DigitizedCardProfile(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        int i4;
        int i5 = getProfileVersion + 71;
        SdkCoreAlternateContactlessPaymentDataImpl = i5 % 128;
        if (i5 % 2 == 0) {
            bArr2 = new byte[i3];
            bArr3 = new byte[this.writeReplace.AlternateContactlessPaymentDataJson()];
            bArr4 = new byte[5];
            this.writeReplace.valueOf();
            i4 = 1;
        } else {
            bArr2 = new byte[i3];
            bArr3 = new byte[this.writeReplace.AlternateContactlessPaymentDataJson()];
            bArr4 = new byte[4];
            this.writeReplace.valueOf();
            i4 = 0;
        }
        while (i4 < i3 / bArr3.length) {
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 105) % 128;
            AlternateContactlessPaymentDataJson(i4, bArr4);
            this.writeReplace.DigitizedCardProfile(bArr, i, i2);
            this.writeReplace.DigitizedCardProfile(bArr4, 0, bArr4.length);
            this.writeReplace.valueOf(bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr3.length);
            i4++;
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
        }
        if (bArr3.length * i4 < i3) {
            AlternateContactlessPaymentDataJson(i4, bArr4);
            this.writeReplace.DigitizedCardProfile(bArr, i, i2);
            this.writeReplace.DigitizedCardProfile(bArr4, 0, bArr4.length);
            this.writeReplace.valueOf(bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr2, bArr3.length * i4, bArr2.length - (i4 * bArr3.length));
            getProfileVersion = (SdkCoreAlternateContactlessPaymentDataImpl + 39) % 128;
        }
        return bArr2;
    }

    static void AlternateContactlessPaymentDataJson() {
        RecordsJson = new int[]{1004699348, -795399161, 582527435, 846591565, -1605547045, 28053802, 1786562382, -653250573, 1526741455, -1336852884, -181085501, -1704458930, -1571178362, -164807686, 1770886919, -1647001453, 1426095038, 2036352023};
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getProfileVersion = 0;
        SdkCoreAlternateContactlessPaymentDataImpl = 1;
        AlternateContactlessPaymentDataJson();
        IccPrivateKeyCrtComponentsJson = new char[]{7154, 33387, 10455, 55092, 32151, 7085, 33355, 10408, 55071, 32116, 7063, 33317, 10396, 55026, 32031, 7093, 33300, 10379, 55008, 24267, 51024, 28135, 37396, 14583, 24270, 51049, 28050, 37425, 14406};
        getAid = -3114368838985136335L;
    }

    static void init$1() {
        $$d = new byte[]{69, -73, 121, 3};
        $$e = 34;
    }

    static void init$0() {
        $$a = new byte[]{82, -10, -24, -99, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -60, -11, 43, -41, -1, 7, -6, 6, com.google.common.base.Ascii.DC4, -29, 10, -25, 37, -19, -14, -5, com.google.common.base.Ascii.FF, 5, -3, -15, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -54, com.google.common.base.Ascii.DC4, -9, -4, 10, -2, -11, 6};
        $$b = 17;
    }

    @Override // com.payair.hce.findFragmentById
    public final byte[] writeReplace(byte[] bArr, int i, int i2) throws com.payair.hce.getSuspendingTransactionId {
        return (byte[]) DigitizedCardProfile(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, -1242791389, 1242791389, i);
    }
}
