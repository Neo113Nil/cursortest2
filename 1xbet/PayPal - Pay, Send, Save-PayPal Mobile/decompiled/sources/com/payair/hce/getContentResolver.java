package com.payair.hce;

/* loaded from: classes4.dex */
public class getContentResolver implements com.payair.hce.postInitializationCleanup {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static int RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private static char getProfileVersion;
    private static long valueOf;
    private static int values;
    private com.payair.hce.checkPermission AlternateContactlessPaymentDataJson;
    private com.payair.hce.getApplicationContext DigitizedCardProfile;
    private com.payair.hce.getApplicationInfo writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2 = 37 - (s3 * 34);
        int i3 = s * 2;
        byte[] bArr = $$a;
        int i4 = 718 - s2;
        char[] cArr = new char[i3 + 1];
        if (bArr == null) {
            i4 = i3;
            int i5 = i2;
            int i6 = 0;
            i4 = (i4 + (-i2)) - 2;
            i2 = i5;
            i = i6;
            int i7 = i2 + 1;
            cArr[i] = (char) i4;
            if (i == i3) {
                objArr[0] = new java.lang.String(cArr);
                return;
            }
            int i8 = i + 1;
            i5 = i7;
            i2 = bArr[i7];
            i6 = i8;
            i4 = (i4 + (-i2)) - 2;
            i2 = i5;
            i = i6;
            int i72 = i2 + 1;
            cArr[i] = (char) i4;
            if (i == i3) {
            }
        } else {
            i = 0;
            int i722 = i2 + 1;
            cArr[i] = (char) i4;
            if (i == i3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 3 - (i * 4);
        int i5 = i2 * 4;
        byte[] bArr = $$d;
        int i6 = 106 - s;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = 0;
            int i9 = i4;
            int i10 = i4 + i7;
            i3 = i8;
            int i11 = i9;
            i6 = i10;
            i4 = i11;
            int i12 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i13 = i6;
            i9 = i12;
            i4 = bArr[i12];
            i8 = i3 + 1;
            i7 = i13;
            int i102 = i4 + i7;
            i3 = i8;
            int i112 = i9;
            i6 = i102;
            i4 = i112;
            int i122 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i4 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i5) {
            }
        }
    }

    public getContentResolver(com.payair.hce.getApplicationContext getapplicationcontext, com.payair.hce.getApplicationInfo getapplicationinfo) {
        int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\u0000\u0000\u0000\u0000", "傅낷葳墀\ue47dﱒ", "ⅆ撱\uee60䡌", doubleTapTimeout >> 16, (char) (19694 - android.text.TextUtils.getCapsMode("", 0, 0)), objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.getContentResolver.class.getName());
        this.AlternateContactlessPaymentDataJson = com.payair.hce.checkPermission.DigitizedCardProfile(sb.toString());
        this.DigitizedCardProfile = getapplicationcontext;
        this.writeReplace = getapplicationinfo;
    }

    /* renamed from: com.payair.hce.getContentResolver$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        private static int DigitizedCardProfile = 1;
        private static int values;
        static final /* synthetic */ int[] writeReplace;

        static {
            int[] iArr = new int[com.payair.hce.getMDESCardsUniqueTokenReferences.values().length];
            writeReplace = iArr;
            try {
                iArr[com.payair.hce.getMDESCardsUniqueTokenReferences.AlternateContactlessPaymentDataJson.ordinal()] = 1;
                int i = DigitizedCardProfile;
                int i2 = i & 49;
                int i3 = (i | 49) & (~i2);
                int i4 = i2 << 1;
                int i5 = (i3 & i4) + (i3 | i4);
                values = i5 % 128;
                int i6 = i5 % 2;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                writeReplace[com.payair.hce.getMDESCardsUniqueTokenReferences.writeReplace.ordinal()] = 2;
                int i7 = DigitizedCardProfile;
                values = (((i7 | 67) << 1) - (i7 ^ 67)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                writeReplace[com.payair.hce.getMDESCardsUniqueTokenReferences.DigitizedCardProfile.ordinal()] = 3;
                int i8 = values;
                int i9 = i8 & 91;
                int i10 = (i9 - (~(-(-((i8 ^ 91) | i9))))) - 1;
                DigitizedCardProfile = i10 % 128;
                int i11 = i10 % 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                writeReplace[com.payair.hce.getMDESCardsUniqueTokenReferences.valueOf.ordinal()] = 4;
                int i12 = values;
                int i13 = i12 & 61;
                DigitizedCardProfile = (((((i12 ^ 61) | i13) << 1) - (~(-((i12 | 61) & (~i13))))) - 1) % 128;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void DigitizedCardProfile(com.payair.hce.setSelectedCard setselectedcard) {
        int i = com.payair.hce.getContentResolver.AnonymousClass2.writeReplace[setselectedcard.valueOf().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            try {
                this.DigitizedCardProfile.valueOf(new com.payair.hce.onStartCommand(this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(), setselectedcard));
                RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
            } catch (com.payair.hce.getTokenInfo unused) {
            }
        }
        this.DigitizedCardProfile.getGpoResponse();
        this.DigitizedCardProfile.getDualTapResetTimeout();
        this.writeReplace.valueOf(this.DigitizedCardProfile, setselectedcard);
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 1;
        RecordsJson = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static void c(int i, char c, int i2, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i3 = $10 + 57;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(IccPrivateKeyCrtComponentsJson[i / getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 381, (char) (62388 - android.view.View.MeasureSpec.getSize(0)));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        d(0, (short) 7, 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 3967 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((android.view.ViewConfiguration.getTapTimeout() >> 16) + 40223))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
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
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 381, (char) (62388 - android.graphics.Color.alpha(0)));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    d(0, (short) 7, 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.red(0) + 35, android.widget.ExpandableListView.getPackedPositionChild(0L) + 3967, (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40222))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), 212 - (android.os.Process.myTid() >> 22), (char) android.graphics.Color.argb(0, 0, 0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            int i6 = $11 + 79;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 4;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj7 == null) {
                obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.text.TextUtils.getOffsetBefore("", 0), android.graphics.Color.blue(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) ((-1) - android.graphics.ImageFormat.getBitsPerPixel(0)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
            }
            ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void writeReplace(com.payair.hce.replenishToken replenishtoken, java.lang.Exception exc) {
        try {
            this.DigitizedCardProfile.valueOf(new com.payair.hce.onStartCommand(this.DigitizedCardProfile.AlternateContactlessPaymentDataJson(), null, java.lang.System.currentTimeMillis(), 0L, 0, (byte) 6, new byte[0]));
            SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 61) % 128;
        } catch (com.payair.hce.getTokenInfo unused) {
        }
        this.DigitizedCardProfile.getGpoResponse();
        this.DigitizedCardProfile.getDualTapResetTimeout();
        this.writeReplace.writeReplace(this.DigitizedCardProfile, replenishtoken, exc);
        RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 29) % 128;
    }

    @Override // com.payair.hce.postInitializationCleanup
    public final void DigitizedCardProfile(java.lang.Exception exc) {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 113;
        RecordsJson = i % 128;
        if (i % 2 != 0) {
            this.writeReplace.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, exc);
        } else {
            this.writeReplace.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, exc);
            throw new java.lang.ArithmeticException();
        }
    }

    private static void a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, char c, java.lang.Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        char c2;
        if (str3 != null) {
            $11 = ($10 + 45) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != null) {
            int i2 = $11 + 71;
            $10 = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            cArr2 = str2.toCharArray();
            $11 = ($10 + 45) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            $11 = ($10 + 97) % 128;
            cArr3 = str.toCharArray();
            int i3 = $10 + 23;
            $11 = i3 % 128;
            int i4 = i3 % 2;
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
            try {
                java.lang.Object[] objArr2 = {getwalletdata};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-800817016);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(70 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1179 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.text.TextUtils.getCapsMode("", 0, 0));
                    byte length4 = (byte) $$d.length;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    d(0, length4, (byte) (length4 - 4), objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-800817016, obj);
                }
                int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                java.lang.Object[] objArr4 = {getwalletdata};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(811305766);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 30, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 3443, (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3830))).getMethod("g", java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(811305766, obj2);
                }
                int intValue2 = ((java.lang.Integer) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).intValue();
                java.lang.Object[] objArr5 = {getwalletdata, java.lang.Integer.valueOf(cArr7[getwalletdata.writeReplace % 4] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
                if (obj3 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 1863 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 41775));
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    d(0, (short) 1, 0, objArr6);
                    obj3 = cls2.getMethod((java.lang.String) objArr6[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                java.lang.Object[] objArr7 = {java.lang.Integer.valueOf(cArr7[intValue2] * 32718), java.lang.Integer.valueOf(cArr8[intValue])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(140076502);
                if (obj4 == null) {
                    java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 3133 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.blue(0));
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    d(0, (short) 0, 0, objArr8);
                    c2 = 2;
                    obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(140076502, obj4);
                } else {
                    c2 = 2;
                }
                cArr8[intValue2] = ((java.lang.Character) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).charValue();
                cArr7[intValue2] = getwalletdata.values;
                cArr9[getwalletdata.writeReplace] = (char) ((((cArr7[intValue2] ^ cArr5[getwalletdata.writeReplace]) ^ (valueOf ^ 1263759066225628708L)) ^ ((int) (values ^ 1263759066225628708L))) ^ ((char) (getProfileVersion ^ 1263759066225628708L)));
                getwalletdata.writeReplace++;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new java.lang.String(cArr9);
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        RecordsJson = 1;
        valueOf = 1263759066225628708L;
        values = 202919196;
        getProfileVersion = (char) 54820;
        IccPrivateKeyCrtComponentsJson = new char[]{31820, 17494, 3102, 54363, 40016, 25714, 11376, 62586, 48229, 33909, 19542, 5150, 56331, 41995, 27689, 13361, 64559, 50218, 35892, 21710, 7360, 58568, 44246, 24192, 26317, 11989, 63193, 48796, 18149, 3819, 55031, 40675, 42687, 28293, 13966, 65168, 34448, 20192, 5794, 57018, 59066, 44708, 30285, 15940, 50781, 36439, 22114, 7778, 9774, 61035, 46705, 21918, 28036, 9676, 64925, 46485, 19885, 1459, 56762, 38323, 44466, 26056, 15821, 62941, 24222, 24270, 26316, 11971, 63205, 48856, 18153, 3836, 55021, 24262, 26311, 11989, 63189, 48835, 24262, 26335, 24259, 26311, 11974, 63178, 48854, 18174, 3830, 55031, 40676, 42724, 28359, 13969, 65167, 34453, 20159, 5810, 24287, 26330, 11982, 63193, 48833, 18157, 3819, 55029, 1425, 15764, 30080, 44434, 58782, 7597, 21927, 36284, 50620, 64957, 13779, 28111, 42433, 56790, 24284, 26304, 11982, 63181, 48862, 18157, 3829, 24284, 26329, 11981, 63187, 48839, 18153, 3766, 18301, 32637, 14177, 61289, 42854, 24434, 5971, 53078, 34626, 48985, 30487, 12079, 59189, 40758, 22279, 3846, 50969, 65308, 46878, 28671, 24284, 26313, 11983, 63187, 48839, 18149, 3839, 55035, 40677, 42685, 28314, 13974, 65178, 34432, 20152, 5813, 24283, 26330, 11968, 63193, 48854, 18172, 3812, 55018, 40703, 9173, 7054, 21389, 35740, 50066, 15292, 29629, 44004, 58272, 56236, 5074, 19352, 24192, 26328, 11987, 63189, 48848, 18083, 3830, 55035, 40699, 42742, 28358, 13969, 65167, 34453, 20153, 5811, 57004, 13400, 3092, 17436, 39956, 24192, 26331, 11992, 63177, 48839, 18153, 3816, 54961, 40676, 42738, 28288, 13964, 24192, 26334, 11972, 63188, 48855, 18147, 3831, 54961, 40693, 42745, 28295, 24192, 26331, 11971, 63187, 48861, 24192, 26317, 11989, 63193, 24285, 26311, 11919, 63192, 48838, 18149, 3817, 55034, 40633, 42744, 28294, 13969, 65167, 24268, 26321, 11968, 63188, 48860, 18155, 3808, 55024, 40698, 42751, 28301, 24285, 26333, 11983, 63188, 48858, 18146, 3810, 995, 15279, 29603, 43949, 58289, 7104, 21386, 35730, 50071, 64402, 13286, 27566, 24192, 26316, 11968, 63182, 48850, 18083, 3817, 55025, 40692, 42737, 28293, 14029, 65177, 34461, 20131, 5865, 26921, 20837, 6505, 49511, 35195, 28938, 14656, 57688, 43357, 37208, 22828, 356, 51498, 45375, 30989, 8449, 59737, 24192, 26331, 11971, 63187, 48861, 18083, 64877, 50486, 36149, 21796, 7466, 58628, 44293, 30044, 15625, 1305, 52523, 38263, 23924, 9584, 60750, 46340, 17371, 31616, 13187, 60306, 41884, 23474, 5043, 52202, 33721, 48056, 29632, 11158, 58327, 39882, 21435, 3059, 50145, 64486, 46062, 27484, 8970, 56072, 37633, 19233, 883, 34792, 49075, 63408, 12193, 26543, 40833, 55168, 4057, 18311, 32666, 47080, 61412, 10172, 24192, 26331, 11988, 63125, 48849, 18149, 3819, 54961, 24192, 26328, 11987, 63189, 48848, 18083, 3830, 55035, 40699, 42742, 28358, 13967, 65172, 34433, 20131, 5810, 57004, 34887, 45099, 63551, 8240, 26717, 36884, 30180, 19900, 1463, 56753, 38324, 28103, 24192, 26316, 11972, 63180, 48796, 18166, 3836, 55033, 40702, 42723, 28290, 3549, 13777, 32207, 42435, 60805, 5624, 24060, 34280, 52712, 62886, 15781, 26002, 44433, 54665, 7604, 17850, 24284, 26332, 11968, 63176, 48839};
        getAid = -4697311168067443032L;
    }

    static void init$1() {
        $$d = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -26, -77, 102};
        $$e = 238;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x16d5, code lost:
    
        if (r4 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x16d7, code lost:
    
        r4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(37 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), 3161 - android.graphics.Color.red(0), (char) (33099 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
        r5 = (byte) (com.payair.hce.getContentResolver.$$a[14] + 1);
        r9 = new java.lang.Object[1];
        b(r5, (short) (r5 | 618), r5, r9);
        r4 = r4.getMethod((java.lang.String) r9[0], java.lang.String.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-604620973, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x1725, code lost:
    
        r4 = ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r2)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x1732, code lost:
    
        r8 = (int) java.lang.System.currentTimeMillis();
        r6 = r3;
        r10 = ((((((-301) * r4) - 365416860114L) + (((~(((~r8) | 1205996237) | r4)) | (~(((-1205996238) | r4) | r8))) * (-302))) + ((~((1205996237 | r4) | r8)) * (-604))) + (((~(r4 | r8)) | (~((~r4) | (-1205996238)))) * 302)) + 2113466976;
        r2 = (int) (r10 >> 32);
        r3 = (int) java.lang.System.currentTimeMillis();
        r4 = (int) r10;
        r5 = (int) java.lang.System.currentTimeMillis();
        r8 = ~(1749956595 | r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x17c9, code lost:
    
        if (((r2 & ((((((-1477249473) | (~r3)) * (-490)) + 1871960942) + (((~(r3 | (-2107460041))) | 630210568) * 490)) + 1996963714)) | ((((((((~((-1749956596) | r5)) | 1074147938) | (~((-1107784291) | r5))) * (-880)) + 818884229) + ((((~((~r5) | (-1749956596))) | 1107784290) | r8) * (-880))) + (r8 * 880)) & r4)) != 0) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x17cb, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x17ce, code lost:
    
        r3 = r6 + r2;
        r1 = r1 + 1;
        r2 = 28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x17cd, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x17df, code lost:
    
        if (r3 < 25.2d) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x17e1, code lost:
    
        r3 = new java.lang.Object[]{new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, null, new int[1]};
        r1 = (int) java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x1800, code lost:
    
        r5 = new java.lang.Object[]{-1884061761, 16, java.lang.Integer.valueOf(((((~((-116632730) | r1)) | 77605001) * (-566)) + 1684083125) + ((~(r1 | (-39027729))) * com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.PULL_TOKEN_DOES_NOT_EXIST))};
        r1 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x1840, code lost:
    
        if (r1 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x1842, code lost:
    
        r1 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(r7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.indexOf(r7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2714, (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 1));
        r8 = new java.lang.Object[1];
        b(r4[16], 653, (byte) (-com.payair.hce.getContentResolver.$$a[14]), r8);
        r1 = r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x18a6, code lost:
    
        ((int[]) r3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) r1).invoke(null, r5)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x18ae, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x1688, code lost:
    
        if (((((int) r1) & ((((((~((-1261050365) | r5)) | ((~(r5 | 176176045)) | 1093271632)) * 464) + 1987230501) + ((1269447677 | r2) * (-464))) + (((~(r2 | (-1261050365))) | 1093271632) * 464))) | (((int) (r1 >> 32)) & (((((~((-1302149288) | r4)) | (-1555591598)) * 56) - 685968286) + (((~((~r4) | (-1555591598))) | (-1302149288)) * 56)))) == 477111747) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0c52, code lost:
    
        if (r3.equals(((java.lang.String) r11[0]).intern()) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x071f, code lost:
    
        if (((((int) r2) & (((((~((-11152409) | r3)) | (~(1476394494 | r8))) * 497) + 1147508200) + (((~(r3 | 1476394494)) | ((~(r8 | (-28015677))) | 16863268)) * 497))) | (((int) (r2 >> 32)) & ((((((~((-745777106) | r6)) | 1156432) * (-140)) + 293439742) + ((~((-744620674) | r6)) * 70)) + (((~(r6 | (-2111963780))) | 1368499538) * 70)))) != 477111747) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0842, code lost:
    
        if (((((int) r2) & (((((~(209110919 | r10)) | (~(1228115490 | r3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + 1674025163) + (((~(r3 | (-1090586657))) | (~((-71582086) | r10))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE))) | (((int) (r2 >> 32)) & ((((((~((-2050047435) | r8)) | r9) * 1150) - 334238508) + ((r9 | (~((-612821024) | r8))) * (-575))) + (((~(r6 | (-2050047435))) | (~(r8 | 2050047434))) * 575)))) != (-1032769152)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x094f, code lost:
    
        if (((((int) r3) & ((((((-161546661) | r4) * (-627)) - 635053948) + (((~(1873119654 | r4)) | 435893244) * (-627))) + (((~((~r4) | (-1873119655))) | (~(435893244 | r4))) * 627))) | (((int) (r3 << 65)) & (((((~(1513550023 | r6)) | 526600) * (-283)) + 1586254210) + ((~(r6 | 1514076623)) * 283)))) == 542074309) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0a69, code lost:
    
        if (((((int) r3) & ((((((~(694060103 | r8)) | (~(743166306 | r4))) * 1900) - 1871736089) + (((~((-743166307) | r8)) | (~((-694060104) | r4))) * (-950))) + (((~(r4 | (-743166307))) | (~(r8 | (-694060104)))) * 950))) | (((int) (r3 >> 32)) & (((((~((-559163457) | r6)) | 98324) * 449) - 607357118) + (((~((~r6) | (-559163457))) | 98324) * 449)))) == 542074309) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x156e, code lost:
    
        if (((((int) (r13 >> 32)) & (((((~((-454901242) | r4)) | 982325169) * (-366)) - 1805690696) + (((~(r4 | (-17836105))) | 545260032) * 366))) | ((((((((~((-1259927514) | r9)) | (~(1597813372 | r10))) | r11) * (-516)) + 307329481) + (((~(r9 | (-1259909721))) | (~(r10 | (-337903653)))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) + ((337903652 | r11) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)) & r8)) != 477111747) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x168a, code lost:
    
        r1 = 0;
        r2 = 28;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x168e, code lost:
    
        if (r1 >= r2) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x1690, code lost:
    
        r2 = r3[r1];
        r14 = new java.lang.Object[1];
        c(178 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), (char) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 32085), 11 - android.text.TextUtils.indexOf(r7, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x16c4, code lost:
    
        r2 = new java.lang.Object[]{((java.lang.String) r14[0]).intern().concat(java.lang.String.valueOf(r2))};
        r4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-604620973);
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x18ea A[Catch: all -> 0x4661, TryCatch #0 {all -> 0x4661, blocks: (B:3:0x0002, B:5:0x001a, B:6:0x0058, B:10:0x014c, B:12:0x018b, B:13:0x01db, B:18:0x0218, B:20:0x022b, B:21:0x0273, B:25:0x02ce, B:27:0x02e1, B:28:0x032e, B:32:0x03ef, B:34:0x03ff, B:35:0x0442, B:37:0x0470, B:39:0x0480, B:40:0x04c7, B:42:0x04d0, B:44:0x04ee, B:45:0x0540, B:52:0x0a99, B:54:0x0aac, B:55:0x0afb, B:60:0x0c71, B:62:0x0cc0, B:63:0x0d16, B:67:0x11bb, B:69:0x11cb, B:70:0x120c, B:73:0x126a, B:75:0x127d, B:76:0x12ca, B:80:0x1377, B:82:0x1387, B:83:0x13cf, B:85:0x1404, B:87:0x1414, B:88:0x145d, B:90:0x1466, B:92:0x1484, B:93:0x14d7, B:99:0x16c4, B:101:0x16d7, B:102:0x1725, B:114:0x1800, B:116:0x1842, B:117:0x1899, B:122:0x1573, B:124:0x1590, B:125:0x15dc, B:129:0x18d7, B:131:0x18ea, B:132:0x1935, B:134:0x1a07, B:136:0x1a1a, B:137:0x1a68, B:145:0x1b48, B:147:0x1b8a, B:148:0x1bde, B:152:0x1c21, B:154:0x1c34, B:155:0x1c7f, B:157:0x1d3d, B:159:0x1d50, B:160:0x1d99, B:168:0x1e78, B:170:0x1ec2, B:171:0x1f18, B:178:0x2052, B:180:0x2065, B:181:0x20b3, B:189:0x2174, B:191:0x21c5, B:192:0x221d, B:217:0x2587, B:219:0x25cd, B:220:0x2624, B:224:0x2662, B:226:0x2675, B:227:0x26c0, B:240:0x2930, B:242:0x2943, B:243:0x298f, B:251:0x2a68, B:253:0x2aae, B:254:0x2b04, B:258:0x2b47, B:260:0x2b70, B:261:0x2bca, B:268:0x2c88, B:270:0x2cce, B:271:0x2d2c, B:275:0x2d6f, B:277:0x2d98, B:278:0x2df2, B:282:0x2eb1, B:284:0x2efe, B:285:0x2f57, B:288:0x2f6d, B:290:0x2f7c, B:291:0x2fc5, B:295:0x3083, B:297:0x30d4, B:298:0x312d, B:302:0x3144, B:304:0x315d, B:305:0x31a5, B:309:0x3266, B:311:0x32b8, B:312:0x330d, B:315:0x3323, B:317:0x3332, B:318:0x3378, B:322:0x344e, B:324:0x349a, B:325:0x34ef, B:328:0x3505, B:330:0x3514, B:331:0x355a, B:335:0x361e, B:337:0x3662, B:338:0x36b9, B:341:0x36cf, B:343:0x36de, B:344:0x3721, B:348:0x37f8, B:350:0x3850, B:351:0x38aa, B:355:0x38ec, B:357:0x3916, B:358:0x396e, B:362:0x3a1c, B:364:0x3a6b, B:365:0x3ac4, B:369:0x3afd, B:371:0x3b10, B:372:0x3b5d, B:376:0x3c1b, B:378:0x3c68, B:379:0x3cc0, B:382:0x3cd6, B:384:0x3ce5, B:385:0x3d2c, B:389:0x3dfc, B:391:0x3e42, B:392:0x3e9c, B:395:0x3eb2, B:397:0x3ec1, B:398:0x3f06, B:402:0x3fbc, B:404:0x3fff, B:405:0x4053, B:408:0x4069, B:410:0x4078, B:411:0x40c2, B:415:0x418b, B:417:0x41df, B:418:0x4239, B:421:0x424f, B:423:0x425e, B:424:0x42a3, B:430:0x4373, B:432:0x43bd, B:433:0x4411, B:435:0x4426, B:437:0x4439, B:438:0x4487, B:440:0x448f, B:442:0x44be, B:443:0x4518, B:448:0x4597, B:450:0x45e9, B:451:0x4641, B:512:0x0bc9, B:514:0x0bd9, B:515:0x0c25, B:520:0x0600, B:522:0x061d, B:523:0x0673, B:528:0x0727, B:530:0x0744, B:531:0x0797, B:537:0x0852, B:539:0x086f, B:540:0x08bd, B:543:0x0953, B:545:0x0970, B:546:0x09bb), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x1a1a A[Catch: all -> 0x4661, TryCatch #0 {all -> 0x4661, blocks: (B:3:0x0002, B:5:0x001a, B:6:0x0058, B:10:0x014c, B:12:0x018b, B:13:0x01db, B:18:0x0218, B:20:0x022b, B:21:0x0273, B:25:0x02ce, B:27:0x02e1, B:28:0x032e, B:32:0x03ef, B:34:0x03ff, B:35:0x0442, B:37:0x0470, B:39:0x0480, B:40:0x04c7, B:42:0x04d0, B:44:0x04ee, B:45:0x0540, B:52:0x0a99, B:54:0x0aac, B:55:0x0afb, B:60:0x0c71, B:62:0x0cc0, B:63:0x0d16, B:67:0x11bb, B:69:0x11cb, B:70:0x120c, B:73:0x126a, B:75:0x127d, B:76:0x12ca, B:80:0x1377, B:82:0x1387, B:83:0x13cf, B:85:0x1404, B:87:0x1414, B:88:0x145d, B:90:0x1466, B:92:0x1484, B:93:0x14d7, B:99:0x16c4, B:101:0x16d7, B:102:0x1725, B:114:0x1800, B:116:0x1842, B:117:0x1899, B:122:0x1573, B:124:0x1590, B:125:0x15dc, B:129:0x18d7, B:131:0x18ea, B:132:0x1935, B:134:0x1a07, B:136:0x1a1a, B:137:0x1a68, B:145:0x1b48, B:147:0x1b8a, B:148:0x1bde, B:152:0x1c21, B:154:0x1c34, B:155:0x1c7f, B:157:0x1d3d, B:159:0x1d50, B:160:0x1d99, B:168:0x1e78, B:170:0x1ec2, B:171:0x1f18, B:178:0x2052, B:180:0x2065, B:181:0x20b3, B:189:0x2174, B:191:0x21c5, B:192:0x221d, B:217:0x2587, B:219:0x25cd, B:220:0x2624, B:224:0x2662, B:226:0x2675, B:227:0x26c0, B:240:0x2930, B:242:0x2943, B:243:0x298f, B:251:0x2a68, B:253:0x2aae, B:254:0x2b04, B:258:0x2b47, B:260:0x2b70, B:261:0x2bca, B:268:0x2c88, B:270:0x2cce, B:271:0x2d2c, B:275:0x2d6f, B:277:0x2d98, B:278:0x2df2, B:282:0x2eb1, B:284:0x2efe, B:285:0x2f57, B:288:0x2f6d, B:290:0x2f7c, B:291:0x2fc5, B:295:0x3083, B:297:0x30d4, B:298:0x312d, B:302:0x3144, B:304:0x315d, B:305:0x31a5, B:309:0x3266, B:311:0x32b8, B:312:0x330d, B:315:0x3323, B:317:0x3332, B:318:0x3378, B:322:0x344e, B:324:0x349a, B:325:0x34ef, B:328:0x3505, B:330:0x3514, B:331:0x355a, B:335:0x361e, B:337:0x3662, B:338:0x36b9, B:341:0x36cf, B:343:0x36de, B:344:0x3721, B:348:0x37f8, B:350:0x3850, B:351:0x38aa, B:355:0x38ec, B:357:0x3916, B:358:0x396e, B:362:0x3a1c, B:364:0x3a6b, B:365:0x3ac4, B:369:0x3afd, B:371:0x3b10, B:372:0x3b5d, B:376:0x3c1b, B:378:0x3c68, B:379:0x3cc0, B:382:0x3cd6, B:384:0x3ce5, B:385:0x3d2c, B:389:0x3dfc, B:391:0x3e42, B:392:0x3e9c, B:395:0x3eb2, B:397:0x3ec1, B:398:0x3f06, B:402:0x3fbc, B:404:0x3fff, B:405:0x4053, B:408:0x4069, B:410:0x4078, B:411:0x40c2, B:415:0x418b, B:417:0x41df, B:418:0x4239, B:421:0x424f, B:423:0x425e, B:424:0x42a3, B:430:0x4373, B:432:0x43bd, B:433:0x4411, B:435:0x4426, B:437:0x4439, B:438:0x4487, B:440:0x448f, B:442:0x44be, B:443:0x4518, B:448:0x4597, B:450:0x45e9, B:451:0x4641, B:512:0x0bc9, B:514:0x0bd9, B:515:0x0c25, B:520:0x0600, B:522:0x061d, B:523:0x0673, B:528:0x0727, B:530:0x0744, B:531:0x0797, B:537:0x0852, B:539:0x086f, B:540:0x08bd, B:543:0x0953, B:545:0x0970, B:546:0x09bb), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x1b16  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x1c34 A[Catch: all -> 0x4661, TryCatch #0 {all -> 0x4661, blocks: (B:3:0x0002, B:5:0x001a, B:6:0x0058, B:10:0x014c, B:12:0x018b, B:13:0x01db, B:18:0x0218, B:20:0x022b, B:21:0x0273, B:25:0x02ce, B:27:0x02e1, B:28:0x032e, B:32:0x03ef, B:34:0x03ff, B:35:0x0442, B:37:0x0470, B:39:0x0480, B:40:0x04c7, B:42:0x04d0, B:44:0x04ee, B:45:0x0540, B:52:0x0a99, B:54:0x0aac, B:55:0x0afb, B:60:0x0c71, B:62:0x0cc0, B:63:0x0d16, B:67:0x11bb, B:69:0x11cb, B:70:0x120c, B:73:0x126a, B:75:0x127d, B:76:0x12ca, B:80:0x1377, B:82:0x1387, B:83:0x13cf, B:85:0x1404, B:87:0x1414, B:88:0x145d, B:90:0x1466, B:92:0x1484, B:93:0x14d7, B:99:0x16c4, B:101:0x16d7, B:102:0x1725, B:114:0x1800, B:116:0x1842, B:117:0x1899, B:122:0x1573, B:124:0x1590, B:125:0x15dc, B:129:0x18d7, B:131:0x18ea, B:132:0x1935, B:134:0x1a07, B:136:0x1a1a, B:137:0x1a68, B:145:0x1b48, B:147:0x1b8a, B:148:0x1bde, B:152:0x1c21, B:154:0x1c34, B:155:0x1c7f, B:157:0x1d3d, B:159:0x1d50, B:160:0x1d99, B:168:0x1e78, B:170:0x1ec2, B:171:0x1f18, B:178:0x2052, B:180:0x2065, B:181:0x20b3, B:189:0x2174, B:191:0x21c5, B:192:0x221d, B:217:0x2587, B:219:0x25cd, B:220:0x2624, B:224:0x2662, B:226:0x2675, B:227:0x26c0, B:240:0x2930, B:242:0x2943, B:243:0x298f, B:251:0x2a68, B:253:0x2aae, B:254:0x2b04, B:258:0x2b47, B:260:0x2b70, B:261:0x2bca, B:268:0x2c88, B:270:0x2cce, B:271:0x2d2c, B:275:0x2d6f, B:277:0x2d98, B:278:0x2df2, B:282:0x2eb1, B:284:0x2efe, B:285:0x2f57, B:288:0x2f6d, B:290:0x2f7c, B:291:0x2fc5, B:295:0x3083, B:297:0x30d4, B:298:0x312d, B:302:0x3144, B:304:0x315d, B:305:0x31a5, B:309:0x3266, B:311:0x32b8, B:312:0x330d, B:315:0x3323, B:317:0x3332, B:318:0x3378, B:322:0x344e, B:324:0x349a, B:325:0x34ef, B:328:0x3505, B:330:0x3514, B:331:0x355a, B:335:0x361e, B:337:0x3662, B:338:0x36b9, B:341:0x36cf, B:343:0x36de, B:344:0x3721, B:348:0x37f8, B:350:0x3850, B:351:0x38aa, B:355:0x38ec, B:357:0x3916, B:358:0x396e, B:362:0x3a1c, B:364:0x3a6b, B:365:0x3ac4, B:369:0x3afd, B:371:0x3b10, B:372:0x3b5d, B:376:0x3c1b, B:378:0x3c68, B:379:0x3cc0, B:382:0x3cd6, B:384:0x3ce5, B:385:0x3d2c, B:389:0x3dfc, B:391:0x3e42, B:392:0x3e9c, B:395:0x3eb2, B:397:0x3ec1, B:398:0x3f06, B:402:0x3fbc, B:404:0x3fff, B:405:0x4053, B:408:0x4069, B:410:0x4078, B:411:0x40c2, B:415:0x418b, B:417:0x41df, B:418:0x4239, B:421:0x424f, B:423:0x425e, B:424:0x42a3, B:430:0x4373, B:432:0x43bd, B:433:0x4411, B:435:0x4426, B:437:0x4439, B:438:0x4487, B:440:0x448f, B:442:0x44be, B:443:0x4518, B:448:0x4597, B:450:0x45e9, B:451:0x4641, B:512:0x0bc9, B:514:0x0bd9, B:515:0x0c25, B:520:0x0600, B:522:0x061d, B:523:0x0673, B:528:0x0727, B:530:0x0744, B:531:0x0797, B:537:0x0852, B:539:0x086f, B:540:0x08bd, B:543:0x0953, B:545:0x0970, B:546:0x09bb), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x1d50 A[Catch: all -> 0x4661, TryCatch #0 {all -> 0x4661, blocks: (B:3:0x0002, B:5:0x001a, B:6:0x0058, B:10:0x014c, B:12:0x018b, B:13:0x01db, B:18:0x0218, B:20:0x022b, B:21:0x0273, B:25:0x02ce, B:27:0x02e1, B:28:0x032e, B:32:0x03ef, B:34:0x03ff, B:35:0x0442, B:37:0x0470, B:39:0x0480, B:40:0x04c7, B:42:0x04d0, B:44:0x04ee, B:45:0x0540, B:52:0x0a99, B:54:0x0aac, B:55:0x0afb, B:60:0x0c71, B:62:0x0cc0, B:63:0x0d16, B:67:0x11bb, B:69:0x11cb, B:70:0x120c, B:73:0x126a, B:75:0x127d, B:76:0x12ca, B:80:0x1377, B:82:0x1387, B:83:0x13cf, B:85:0x1404, B:87:0x1414, B:88:0x145d, B:90:0x1466, B:92:0x1484, B:93:0x14d7, B:99:0x16c4, B:101:0x16d7, B:102:0x1725, B:114:0x1800, B:116:0x1842, B:117:0x1899, B:122:0x1573, B:124:0x1590, B:125:0x15dc, B:129:0x18d7, B:131:0x18ea, B:132:0x1935, B:134:0x1a07, B:136:0x1a1a, B:137:0x1a68, B:145:0x1b48, B:147:0x1b8a, B:148:0x1bde, B:152:0x1c21, B:154:0x1c34, B:155:0x1c7f, B:157:0x1d3d, B:159:0x1d50, B:160:0x1d99, B:168:0x1e78, B:170:0x1ec2, B:171:0x1f18, B:178:0x2052, B:180:0x2065, B:181:0x20b3, B:189:0x2174, B:191:0x21c5, B:192:0x221d, B:217:0x2587, B:219:0x25cd, B:220:0x2624, B:224:0x2662, B:226:0x2675, B:227:0x26c0, B:240:0x2930, B:242:0x2943, B:243:0x298f, B:251:0x2a68, B:253:0x2aae, B:254:0x2b04, B:258:0x2b47, B:260:0x2b70, B:261:0x2bca, B:268:0x2c88, B:270:0x2cce, B:271:0x2d2c, B:275:0x2d6f, B:277:0x2d98, B:278:0x2df2, B:282:0x2eb1, B:284:0x2efe, B:285:0x2f57, B:288:0x2f6d, B:290:0x2f7c, B:291:0x2fc5, B:295:0x3083, B:297:0x30d4, B:298:0x312d, B:302:0x3144, B:304:0x315d, B:305:0x31a5, B:309:0x3266, B:311:0x32b8, B:312:0x330d, B:315:0x3323, B:317:0x3332, B:318:0x3378, B:322:0x344e, B:324:0x349a, B:325:0x34ef, B:328:0x3505, B:330:0x3514, B:331:0x355a, B:335:0x361e, B:337:0x3662, B:338:0x36b9, B:341:0x36cf, B:343:0x36de, B:344:0x3721, B:348:0x37f8, B:350:0x3850, B:351:0x38aa, B:355:0x38ec, B:357:0x3916, B:358:0x396e, B:362:0x3a1c, B:364:0x3a6b, B:365:0x3ac4, B:369:0x3afd, B:371:0x3b10, B:372:0x3b5d, B:376:0x3c1b, B:378:0x3c68, B:379:0x3cc0, B:382:0x3cd6, B:384:0x3ce5, B:385:0x3d2c, B:389:0x3dfc, B:391:0x3e42, B:392:0x3e9c, B:395:0x3eb2, B:397:0x3ec1, B:398:0x3f06, B:402:0x3fbc, B:404:0x3fff, B:405:0x4053, B:408:0x4069, B:410:0x4078, B:411:0x40c2, B:415:0x418b, B:417:0x41df, B:418:0x4239, B:421:0x424f, B:423:0x425e, B:424:0x42a3, B:430:0x4373, B:432:0x43bd, B:433:0x4411, B:435:0x4426, B:437:0x4439, B:438:0x4487, B:440:0x448f, B:442:0x44be, B:443:0x4518, B:448:0x4597, B:450:0x45e9, B:451:0x4641, B:512:0x0bc9, B:514:0x0bd9, B:515:0x0c25, B:520:0x0600, B:522:0x061d, B:523:0x0673, B:528:0x0727, B:530:0x0744, B:531:0x0797, B:537:0x0852, B:539:0x086f, B:540:0x08bd, B:543:0x0953, B:545:0x0970, B:546:0x09bb), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x1e4d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x2048  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x2152  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x2233  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x256a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x263a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x214f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x11cb A[Catch: all -> 0x4661, TryCatch #0 {all -> 0x4661, blocks: (B:3:0x0002, B:5:0x001a, B:6:0x0058, B:10:0x014c, B:12:0x018b, B:13:0x01db, B:18:0x0218, B:20:0x022b, B:21:0x0273, B:25:0x02ce, B:27:0x02e1, B:28:0x032e, B:32:0x03ef, B:34:0x03ff, B:35:0x0442, B:37:0x0470, B:39:0x0480, B:40:0x04c7, B:42:0x04d0, B:44:0x04ee, B:45:0x0540, B:52:0x0a99, B:54:0x0aac, B:55:0x0afb, B:60:0x0c71, B:62:0x0cc0, B:63:0x0d16, B:67:0x11bb, B:69:0x11cb, B:70:0x120c, B:73:0x126a, B:75:0x127d, B:76:0x12ca, B:80:0x1377, B:82:0x1387, B:83:0x13cf, B:85:0x1404, B:87:0x1414, B:88:0x145d, B:90:0x1466, B:92:0x1484, B:93:0x14d7, B:99:0x16c4, B:101:0x16d7, B:102:0x1725, B:114:0x1800, B:116:0x1842, B:117:0x1899, B:122:0x1573, B:124:0x1590, B:125:0x15dc, B:129:0x18d7, B:131:0x18ea, B:132:0x1935, B:134:0x1a07, B:136:0x1a1a, B:137:0x1a68, B:145:0x1b48, B:147:0x1b8a, B:148:0x1bde, B:152:0x1c21, B:154:0x1c34, B:155:0x1c7f, B:157:0x1d3d, B:159:0x1d50, B:160:0x1d99, B:168:0x1e78, B:170:0x1ec2, B:171:0x1f18, B:178:0x2052, B:180:0x2065, B:181:0x20b3, B:189:0x2174, B:191:0x21c5, B:192:0x221d, B:217:0x2587, B:219:0x25cd, B:220:0x2624, B:224:0x2662, B:226:0x2675, B:227:0x26c0, B:240:0x2930, B:242:0x2943, B:243:0x298f, B:251:0x2a68, B:253:0x2aae, B:254:0x2b04, B:258:0x2b47, B:260:0x2b70, B:261:0x2bca, B:268:0x2c88, B:270:0x2cce, B:271:0x2d2c, B:275:0x2d6f, B:277:0x2d98, B:278:0x2df2, B:282:0x2eb1, B:284:0x2efe, B:285:0x2f57, B:288:0x2f6d, B:290:0x2f7c, B:291:0x2fc5, B:295:0x3083, B:297:0x30d4, B:298:0x312d, B:302:0x3144, B:304:0x315d, B:305:0x31a5, B:309:0x3266, B:311:0x32b8, B:312:0x330d, B:315:0x3323, B:317:0x3332, B:318:0x3378, B:322:0x344e, B:324:0x349a, B:325:0x34ef, B:328:0x3505, B:330:0x3514, B:331:0x355a, B:335:0x361e, B:337:0x3662, B:338:0x36b9, B:341:0x36cf, B:343:0x36de, B:344:0x3721, B:348:0x37f8, B:350:0x3850, B:351:0x38aa, B:355:0x38ec, B:357:0x3916, B:358:0x396e, B:362:0x3a1c, B:364:0x3a6b, B:365:0x3ac4, B:369:0x3afd, B:371:0x3b10, B:372:0x3b5d, B:376:0x3c1b, B:378:0x3c68, B:379:0x3cc0, B:382:0x3cd6, B:384:0x3ce5, B:385:0x3d2c, B:389:0x3dfc, B:391:0x3e42, B:392:0x3e9c, B:395:0x3eb2, B:397:0x3ec1, B:398:0x3f06, B:402:0x3fbc, B:404:0x3fff, B:405:0x4053, B:408:0x4069, B:410:0x4078, B:411:0x40c2, B:415:0x418b, B:417:0x41df, B:418:0x4239, B:421:0x424f, B:423:0x425e, B:424:0x42a3, B:430:0x4373, B:432:0x43bd, B:433:0x4411, B:435:0x4426, B:437:0x4439, B:438:0x4487, B:440:0x448f, B:442:0x44be, B:443:0x4518, B:448:0x4597, B:450:0x45e9, B:451:0x4641, B:512:0x0bc9, B:514:0x0bd9, B:515:0x0c25, B:520:0x0600, B:522:0x061d, B:523:0x0673, B:528:0x0727, B:530:0x0744, B:531:0x0797, B:537:0x0852, B:539:0x086f, B:540:0x08bd, B:543:0x0953, B:545:0x0970, B:546:0x09bb), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x1215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.Object[] AlternateContactlessPaymentDataJson$466995e3(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.Object invoke;
        java.lang.Object obj3;
        long j;
        java.lang.Object obj4;
        java.lang.Object obj5;
        long j2;
        java.lang.Object obj6;
        int i;
        int i2;
        int i3;
        int i4;
        java.lang.Object invoke2;
        java.lang.Object[] objArr;
        int parseInt;
        java.lang.Object obj7;
        java.lang.String str2;
        int i5;
        int i6;
        try {
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1566620024);
            if (obj8 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.resolveSizeAndState(0, 0, 0) + 26, (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1838, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))));
                byte b = $$a[14];
                byte b2 = (byte) (b + 1);
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                b(b2, b2, (byte) (-b), objArr2);
                obj8 = cls.getMethod((java.lang.String) objArr2[0], null);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1566620024, obj8);
            }
            long longValue = ((java.lang.Long) ((java.lang.reflect.Method) obj8).invoke(null, null)).longValue();
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            long j3 = ~longValue;
            long j4 = currentTimeMillis;
            long j5 = ~j4;
            long j6 = longValue | 124267470;
            long j7 = ~(j5 | longValue);
            long j8 = (longValue * 85) + 10562734950L + (((~(j5 | (-124267471))) | (~(j3 | (-124267471))) | (~(j3 | j5)) | (~(j6 | j4))) * (-84)) + (((~(j3 | j4)) | 124267470 | j7) * (-84)) + ((j7 | (~j6)) * 84) + 715811475;
            int i7 = (int) (j8 >> 32);
            int currentTimeMillis2 = (int) java.lang.System.currentTimeMillis();
            int i8 = ~currentTimeMillis2;
            int i9 = (int) j8;
            int currentTimeMillis3 = (int) java.lang.System.currentTimeMillis();
            if (((i7 & ((((~(150713420 | i8)) | (~((-1587939832) | i8))) * (-867)) + 1972008040 + (((~(150713420 | currentTimeMillis2)) | 1443105203 | (~((-1587939832) | currentTimeMillis2))) * (-1734)) + (((~(currentTimeMillis2 | 1593818623)) | (~(i8 | (-1443105204))) | (~((-144834629) | currentTimeMillis2))) * 867))) | ((((((-1614625606) | r7) * (-757)) - 790335232) + ((~((-1057026) | currentTimeMillis3)) * 1514) + (((~((-1613568581) | currentTimeMillis3)) | (~((-177399196) | (~currentTimeMillis3))) | 176342170) * 757)) & i9)) != 0) {
                java.lang.Object[] objArr3 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INSTITUTION_BRUSHSTROKE_VALUE}, null, new int[1]};
                java.lang.Object[] objArr4 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-404211242) | r10)) | 268928032) * 1504) - 127520065) + ((~(((int) java.lang.System.currentTimeMillis()) | (-135283210))) * (-1504)) + 96011280)};
                java.lang.Object obj9 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj9 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2713 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    b(r6[16], (short) 653, (byte) (-$$a[14]), objArr5);
                    obj9 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj9);
                }
                ((int[]) objArr3[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj9).invoke(null, objArr4)).intValue();
                return objArr3;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ܗ歯兩휻✄㴐ꩲ\ue3b7惆䃑瑜", "䠳ᄒ廦窞", android.graphics.ImageFormat.getBitsPerPixel(0) - 435088823, (char) android.graphics.Color.red(0), objArr6);
            java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
            java.lang.Object obj10 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj10 == null) {
                java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 39, 1922 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                byte b3 = $$a[14];
                byte b4 = (byte) (b3 + 1);
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                b(b4, b4, (byte) (-b3), objArr8);
                obj10 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.String.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj10);
            }
            java.lang.Object invoke3 = ((java.lang.reflect.Method) obj10).invoke(null, objArr7);
            if (invoke3 != null) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "돆\uebfa愶\uf7aa厽\u3130", "璕衋℞隷", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 46882), objArr9);
                java.lang.String intern = ((java.lang.String) objArr9[0]).intern();
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                a("\u0000\u0000\u0000\u0000", "튚练ꗧ\ua7e1ޡṺ꽍\ud8b0", "紷Æʕះ", android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (char) android.view.View.resolveSize(0, 0), objArr10);
                java.lang.Object[] objArr11 = {invoke3, new java.lang.String[]{intern, ((java.lang.String) objArr10[0]).intern()}};
                java.lang.Object obj11 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                if (obj11 == null) {
                    java.lang.Class cls4 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 2879 - android.widget.ExpandableListView.getPackedPositionChild(0L), (char) android.view.View.resolveSizeAndState(0, 0, 0));
                    byte b5 = $$a[14];
                    byte b6 = (byte) (b5 + 1);
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    b(b6, b6, (byte) (-b5), objArr12);
                    obj11 = cls4.getMethod((java.lang.String) objArr12[0], java.lang.String.class, java.lang.String[].class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj11);
                }
                long longValue2 = ((java.lang.Long) ((java.lang.reflect.Method) obj11).invoke(null, objArr11)).longValue();
                long currentTimeMillis4 = (int) java.lang.System.currentTimeMillis();
                long j9 = ~longValue2;
                long j10 = (((((302 * longValue2) + 360088272000L) + ((~((longValue2 | (-1200294240)) | currentTimeMillis4)) * (-301))) + (((~(j9 | currentTimeMillis4)) | (~((~currentTimeMillis4) | (-1200294240)))) * (-301))) + (((~(1200294239 | currentTimeMillis4)) | j9) * 301)) - 828417539;
                int currentTimeMillis5 = (int) java.lang.System.currentTimeMillis();
                int currentTimeMillis6 = (int) java.lang.System.currentTimeMillis();
                if (((((int) j10) & ((((~(1772219260 | currentTimeMillis6)) | 307631234) * 345) + 484646344 + (((~(1772219260 | (~currentTimeMillis6))) | 27361616) * 345) + ((~(currentTimeMillis6 | (-307631235))) * 345))) | (((int) (j10 >> 32)) & (((((~(559354044 | currentTimeMillis5)) | (-1996580456)) * (-964)) - 1467371946) + (((~((~currentTimeMillis5) | 559354044)) | (-2002220800)) * (-964))))) != 0) {
                    java.lang.Object[] objArr13 = new java.lang.Object[1];
                    c(android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) (android.graphics.Color.blue(0) + 8849), android.view.View.getDefaultSize(0, 0) + 23, objArr13);
                    java.lang.Object[] objArr14 = {((java.lang.String) objArr13[0]).intern()};
                    java.lang.Object obj12 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj12 == null) {
                        java.lang.Class cls5 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getOffsetAfter("", 0) + 40, 1969 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.graphics.Color.alpha(0));
                        byte b7 = $$a[14];
                        byte b8 = (byte) (b7 + 1);
                        java.lang.Object[] objArr15 = new java.lang.Object[1];
                        b(b8, b8, (byte) (-b7), objArr15);
                        obj12 = cls5.getMethod((java.lang.String) objArr15[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj12);
                    }
                    java.lang.Object invoke4 = ((java.lang.reflect.Method) obj12).invoke(null, objArr14);
                    java.lang.Object[] objArr16 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "夒魩\ue374㎂艃芫잳羛핞ེ噽̕勱痑䣿ﶂ뉉湽覸\uede6ꖪ烣鿟䃵㎮嬳惱䷵⾪㰅", "㦱稗䨩㞧", android.view.Gravity.getAbsoluteGravity(0, 0), (char) (42826 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), objArr16);
                    java.lang.Object[] objArr17 = {((java.lang.String) objArr16[0]).intern()};
                    java.lang.Object obj13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj13 == null) {
                        java.lang.Class cls6 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, 1921 - android.graphics.Color.red(0), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8));
                        byte b9 = $$a[14];
                        byte b10 = (byte) (b9 + 1);
                        java.lang.Object[] objArr18 = new java.lang.Object[1];
                        b(b10, b10, (byte) (-b9), objArr18);
                        obj13 = cls6.getMethod((java.lang.String) objArr18[0], java.lang.String.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj13);
                    }
                    java.lang.Object invoke5 = ((java.lang.reflect.Method) obj13).invoke(null, objArr17);
                    if (invoke4 != null) {
                        java.lang.Object[] objArr19 = {invoke4, 42};
                        java.lang.Object obj14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj14 == null) {
                            java.lang.Class cls7 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(27 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2595, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                            byte b11 = $$a[14];
                            byte b12 = (byte) (b11 + 1);
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            b(b12, b12, (byte) (-b11), objArr20);
                            obj14 = cls7.getMethod((java.lang.String) objArr20[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj14);
                        }
                        long longValue3 = ((java.lang.Long) ((java.lang.reflect.Method) obj14).invoke(null, objArr19)).longValue();
                        long currentTimeMillis7 = (int) java.lang.System.currentTimeMillis();
                        obj7 = invoke4;
                        long j11 = (~(currentTimeMillis7 | 638075731)) | (~((~longValue3) | 638075731));
                        str2 = "";
                        long j12 = ((-495) * longValue3) + 315847487340L + (992 * j11) + ((j11 | (~((~currentTimeMillis7) | (-638075732) | longValue3))) * (-496)) + ((longValue3 | currentTimeMillis7) * 496) + 1895176256;
                        int i10 = (int) (j12 >> 32);
                        int currentTimeMillis8 = (int) java.lang.System.currentTimeMillis();
                        int i11 = ~currentTimeMillis8;
                        int currentTimeMillis9 = (int) java.lang.System.currentTimeMillis();
                        if (((i10 & ((((~(i11 | 1281357493)) | 295698698 | (~((-1576383392) | i11))) * 464) + 1984163210 + ((1577056191 | currentTimeMillis8) * (-464)) + (((~(currentTimeMillis8 | (-1576383392))) | 295698698) * 464))) | (((int) j12) & (((((~(1966655923 | r9)) | 529429513) * (-90)) - 1687905466) + (((~(1966655923 | currentTimeMillis9)) | 1613793714) * (-45)) + (((~(currentTimeMillis9 | (-529429514))) | 1966655923 | (~((~currentTimeMillis9) | 529429513))) * 45)))) == 477111747) {
                            str = str2;
                            if (android.os.Build.VERSION.SDK_INT > 33) {
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                c((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22, (char) android.text.TextUtils.getTrimmedLength(str), 28 - (android.os.Process.myTid() >> 22), objArr21);
                                java.lang.Object[] objArr22 = {((java.lang.String) objArr21[0]).intern()};
                                java.lang.Object obj15 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                if (obj15 == null) {
                                    java.lang.Class cls8 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35, 3161 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.Color.blue(0) + 33099));
                                    byte b13 = $$a[14];
                                    byte b14 = (byte) (b13 + 1);
                                    java.lang.Object[] objArr23 = new java.lang.Object[1];
                                    b(b14, b14, (byte) (-b13), objArr23);
                                    obj15 = cls8.getMethod((java.lang.String) objArr23[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj15);
                                }
                                long longValue4 = ((java.lang.Long) ((java.lang.reflect.Method) obj15).invoke(null, objArr22)).longValue();
                                long currentTimeMillis10 = (int) java.lang.System.currentTimeMillis();
                                long j13 = (~(1080856062 | currentTimeMillis10)) | (~((~longValue4) | 1080856062));
                                long j14 = ((((((-495) * longValue4) + 535023751185L) + (992 * j13)) + (((~(((~currentTimeMillis10) | (-1080856063)) | longValue4)) | j13) * (-496))) + ((longValue4 | currentTimeMillis10) * 496)) - 256812045;
                                int currentTimeMillis11 = (int) java.lang.System.currentTimeMillis();
                                int i12 = ~currentTimeMillis11;
                                int currentTimeMillis12 = (int) java.lang.System.currentTimeMillis();
                                int i13 = ~currentTimeMillis12;
                                if (((((int) (j14 >> 32)) & ((((~(434087682 | i12)) | (~(1871314093 | currentTimeMillis11))) * 959) + 409373113 + (((~(currentTimeMillis11 | 434087682)) | (~(i12 | 1871314093))) * 959))) | (((((~(1572214148 | i13)) | 134987738) * (-602)) + 1725924248 + (((~(1572214148 | currentTimeMillis12)) | 633434 | (~((-1437859845) | i13))) * (-301)) + ((~(134987738 | i13)) * 301)) & ((int) j14))) == 1) {
                                    i6 = 1;
                                    i5 = 0;
                                    int[] iArr = new int[i6];
                                    int[] iArr2 = new int[i6];
                                    iArr[i5] = i5;
                                    iArr2[i5] = 260;
                                    java.lang.Object[] objArr24 = {iArr, iArr2, null, new int[i6]};
                                    int currentTimeMillis13 = (int) java.lang.System.currentTimeMillis();
                                    java.lang.Object[] objArr25 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-40888300) | currentTimeMillis13)) | (-671084528)) * (-502)) - 787620215) + ((~((~currentTimeMillis13) | (-2647308))) * (-502)) + (((~(currentTimeMillis13 | (-668437221))) | (-40888300)) * 502))};
                                    java.lang.Object obj16 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj16 == null) {
                                        java.lang.Class cls9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.view.View.resolveSize(0, 0), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                        java.lang.Object[] objArr26 = new java.lang.Object[1];
                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr26);
                                        obj16 = cls9.getMethod((java.lang.String) objArr26[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj16);
                                    }
                                    ((int[]) objArr24[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj16).invoke(null, objArr25)).intValue();
                                    return objArr24;
                                }
                                java.lang.Object[] objArr27 = new java.lang.Object[1];
                                c(android.view.View.MeasureSpec.getSize(0) + 65, (char) android.graphics.Color.red(0), 8 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr27);
                                java.lang.String intern2 = ((java.lang.String) objArr27[0]).intern();
                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\ue2ab쮗\uf4be伪跭\u0de5", "ܣ툍猹\udd68", (android.os.Process.getThreadPriority(0) + 20) >> 6, (char) (26739 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr28);
                                java.lang.String intern3 = ((java.lang.String) objArr28[0]).intern();
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ሲᣒ愈\ue0dd\ud9e2䞻읍", "ᇀ᳸挍㬗", android.graphics.Color.red(0) + 220002321, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr29);
                                java.lang.String intern4 = ((java.lang.String) objArr29[0]).intern();
                                java.lang.Object[] objArr30 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\ue996殺緯\ue3f0굤虨쎍\uec43ŧ", "抄啿揄퓩", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1001029791, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr30);
                                java.lang.String intern5 = ((java.lang.String) objArr30[0]).intern();
                                java.lang.Object[] objArr31 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "㣉塕∞ཥ䙢\ue6e8", "耗沯❄踢", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (8743 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr31);
                                java.lang.String intern6 = ((java.lang.String) objArr31[0]).intern();
                                java.lang.Object[] objArr32 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\ue9da쿷\uf289囔ᣡ媊\uf269⩕烐煢㼪븷ᘷ", "Ď\ue778슘ⴕ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1729660927, (char) (5570 - android.text.TextUtils.indexOf(str, str)), objArr32);
                                java.lang.String intern7 = ((java.lang.String) objArr32[0]).intern();
                                java.lang.Object[] objArr33 = new java.lang.Object[1];
                                c(72 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr33);
                                java.lang.String intern8 = ((java.lang.String) objArr33[0]).intern();
                                java.lang.Object[] objArr34 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "顃釋㽫兹潽\udbfc", "ꨋ쒪凌⌞", android.os.Process.myPid() >> 22, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7929), objArr34);
                                java.lang.String intern9 = ((java.lang.String) objArr34[0]).intern();
                                java.lang.Object[] objArr35 = new java.lang.Object[1];
                                c(78 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2 - android.view.View.MeasureSpec.getMode(0), objArr35);
                                java.lang.String intern10 = ((java.lang.String) objArr35[0]).intern();
                                java.lang.Object[] objArr36 = new java.lang.Object[1];
                                c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 80, (char) android.graphics.Color.green(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 16, objArr36);
                                java.lang.String intern11 = ((java.lang.String) objArr36[0]).intern();
                                java.lang.Object[] objArr37 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "䣹鞐⮙钗韬ꀝ\ueed9\uf828\u09d1噒", "桔ﱑ੩궆", android.text.TextUtils.getOffsetBefore(str, 0), (char) ((-1) - android.os.Process.getGidForName(str)), objArr37);
                                java.lang.String intern12 = ((java.lang.String) objArr37[0]).intern();
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                c(96 - android.text.TextUtils.indexOf(str, str), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 8, objArr38);
                                java.lang.String intern13 = ((java.lang.String) objArr38[0]).intern();
                                java.lang.Object[] objArr39 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "⡲䋪篐ᷙ\ufaff\uf463爥ᖛ姘ᙣ脮쳲", "奸峧\uecd9ꃹ", android.text.TextUtils.getTrimmedLength(str), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr39);
                                java.lang.String intern14 = ((java.lang.String) objArr39[0]).intern();
                                java.lang.Object[] objArr40 = new java.lang.Object[1];
                                c(103 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 23374), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, objArr40);
                                java.lang.String intern15 = ((java.lang.String) objArr40[0]).intern();
                                java.lang.Object[] objArr41 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "մ䳣홭˒햱\ufbcbꜬ", "购敪ೋ\ue7fb", (-882546034) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.getCapsMode(str, 0, 0), objArr41);
                                java.lang.String intern16 = ((java.lang.String) objArr41[0]).intern();
                                java.lang.Object[] objArr42 = new java.lang.Object[1];
                                c(android.widget.ExpandableListView.getPackedPositionType(0L) + 118, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr42);
                                java.lang.String intern17 = ((java.lang.String) objArr42[0]).intern();
                                java.lang.Object[] objArr43 = new java.lang.Object[1];
                                c(125 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.getOffsetBefore(str, 0) + 7, objArr43);
                                java.lang.String intern18 = ((java.lang.String) objArr43[0]).intern();
                                java.lang.Object[] objArr44 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "茵㗦", "䮟停ퟎ焺", android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15062), objArr44);
                                java.lang.String intern19 = ((java.lang.String) objArr44[0]).intern();
                                java.lang.Object[] objArr45 = new java.lang.Object[1];
                                c(132 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (6561 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, objArr45);
                                java.lang.String intern20 = ((java.lang.String) objArr45[0]).intern();
                                java.lang.Object[] objArr46 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "虮ⅇ皔鴇⩩钯", "圌刷唐㾖", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38485), objArr46);
                                java.lang.String intern21 = ((java.lang.String) objArr46[0]).intern();
                                java.lang.Object[] objArr47 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\udcb1铿", "鞝ᤳ䘥\ude7e", android.graphics.Color.blue(0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32326), objArr47);
                                java.lang.String intern22 = ((java.lang.String) objArr47[0]).intern();
                                java.lang.Object[] objArr48 = new java.lang.Object[1];
                                c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 152, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr48);
                                java.lang.String intern23 = ((java.lang.String) objArr48[0]).intern();
                                java.lang.Object[] objArr49 = new java.lang.Object[1];
                                c((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 9, objArr49);
                                java.lang.String intern24 = ((java.lang.String) objArr49[0]).intern();
                                java.lang.Object[] objArr50 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "롕뻽ײַ蜓練\ue8a1ƻ\u0ef0뼪ꖏ", "⢪쮗宎ܥ", android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr50);
                                java.lang.String intern25 = ((java.lang.String) objArr50[0]).intern();
                                java.lang.Object[] objArr51 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\uf1e9댃톾龶楻ꋏ㬐즐\uf87e恗\u0de5", "䬐䟮磇⇅", (-951587253) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.View.resolveSize(0, 0), objArr51);
                                java.lang.String intern26 = ((java.lang.String) objArr51[0]).intern();
                                java.lang.Object[] objArr52 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ﮨ龺隙뎑스ᠠ먪㧚㲒ꜣ죳", "㑮쪄魦孕", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1724548148, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr52);
                                java.lang.String intern27 = ((java.lang.String) objArr52[0]).intern();
                                java.lang.Object[] objArr53 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "㍒\uf28e霙螚狂樗룶䂖絲轓渥鐮ᘻ鴧ᆧ", "窕㷬숥왗", 624815226 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 22466), objArr53);
                                java.lang.String intern28 = ((java.lang.String) objArr53[0]).intern();
                                java.lang.Object[] objArr54 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "볉쯘\ue19a\uf33a\uefac䠮\uec15֯쨬몑⬁枩岲ᖧ", "㋇\u18fcᄅ䪸", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (47121 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr54);
                                java.lang.String[] strArr = {intern2, intern3, intern4, intern5, intern6, intern7, intern8, intern9, intern10, intern11, intern12, intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, intern21, intern22, intern23, intern24, intern25, intern26, intern27, intern28, ((java.lang.String) objArr54[0]).intern()};
                                java.lang.Object[] objArr55 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "ܗ歯兩휻✄㴐ꩲ\ue3b7惆䃑瑜", "䠳ᄒ廦窞", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 435088825, (char) android.text.TextUtils.getTrimmedLength(str), objArr55);
                                java.lang.Object[] objArr56 = {((java.lang.String) objArr55[0]).intern()};
                                obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj2 == null) {
                                    java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 40, 1920 - android.os.Process.getGidForName(str), (char) android.graphics.Color.alpha(0));
                                    byte b15 = $$a[14];
                                    byte b16 = (byte) (b15 + 1);
                                    java.lang.Object[] objArr57 = new java.lang.Object[1];
                                    b(b16, b16, (byte) (-b15), objArr57);
                                    obj2 = cls10.getMethod((java.lang.String) objArr57[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj2);
                                }
                                invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr56);
                                if (invoke != null) {
                                    java.lang.Object[] objArr58 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "돆\uebfa愶\uf7aa厽\u3130", "璕衋℞隷", android.view.ViewConfiguration.getEdgeSlop() >> 16, (char) (46881 - android.view.Gravity.getAbsoluteGravity(0, 0)), objArr58);
                                    java.lang.String intern29 = ((java.lang.String) objArr58[0]).intern();
                                    java.lang.Object[] objArr59 = new java.lang.Object[1];
                                    a("\u0000\u0000\u0000\u0000", "튚练ꗧ\ua7e1ޡṺ꽍\ud8b0", "紷Æʕះ", android.graphics.Color.red(0), (char) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr59);
                                    java.lang.Object[] objArr60 = {invoke, new java.lang.String[]{intern29, ((java.lang.String) objArr59[0]).intern()}};
                                    java.lang.Object obj17 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                    if (obj17 == null) {
                                        java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.MeasureSpec.getSize(0), 2880 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (char) android.graphics.Color.green(0));
                                        byte b17 = $$a[14];
                                        byte b18 = (byte) (b17 + 1);
                                        java.lang.Object[] objArr61 = new java.lang.Object[1];
                                        b(b18, b18, (byte) (-b17), objArr61);
                                        obj17 = cls11.getMethod((java.lang.String) objArr61[0], java.lang.String.class, java.lang.String[].class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj17);
                                    }
                                    long longValue5 = ((java.lang.Long) ((java.lang.reflect.Method) obj17).invoke(null, objArr60)).longValue();
                                    int currentTimeMillis14 = (int) java.lang.System.currentTimeMillis();
                                    long j15 = ~longValue5;
                                    long j16 = currentTimeMillis14;
                                    long j17 = j16 | (-793221031);
                                    long j18 = (((((longValue5 * (-667)) + 1058950076385L) + (((~j17) | j15) * (-668))) + (((~(j15 | j16)) | (-793221031)) * 1336)) + ((j17 | j15) * 668)) - 1235490748;
                                    int i14 = (int) (j18 >> 32);
                                    int i15 = ~((int) java.lang.System.currentTimeMillis());
                                    int i16 = (int) j18;
                                    int currentTimeMillis15 = (int) java.lang.System.currentTimeMillis();
                                    if (((i14 & ((((~((-1098907653) | i15)) * (-783)) - 364021422) + (((~(i15 | 304075731)) | (-1133150680)) * 783))) | ((((((~((-1419365301) | currentTimeMillis15)) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE) * (-283)) - 1437148303) + ((~(currentTimeMillis15 | (-1419365025))) * 283)) & i16)) != 0) {
                                        java.lang.Object[] objArr62 = new java.lang.Object[1];
                                        c(1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (8849 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), 22 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr62);
                                        java.lang.Object[] objArr63 = {((java.lang.String) objArr62[0]).intern()};
                                        java.lang.Object obj18 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj18 == null) {
                                            java.lang.Class cls12 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.KeyEvent.getDeadChar(0, 0) + 40, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 1921, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                            byte b19 = $$a[14];
                                            byte b20 = (byte) (b19 + 1);
                                            java.lang.Object[] objArr64 = new java.lang.Object[1];
                                            b(b20, b20, (byte) (-b19), objArr64);
                                            obj18 = cls12.getMethod((java.lang.String) objArr64[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj18);
                                        }
                                        java.lang.Object invoke6 = ((java.lang.reflect.Method) obj18).invoke(null, objArr63);
                                        java.lang.Object[] objArr65 = new java.lang.Object[1];
                                        a("\u0000\u0000\u0000\u0000", "夒魩\ue374㎂艃芫잳羛핞ེ噽̕勱痑䣿ﶂ뉉湽覸\uede6ꖪ烣鿟䃵㎮嬳惱䷵⾪㰅", "㦱稗䨩㞧", (-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 42826), objArr65);
                                        java.lang.Object[] objArr66 = {((java.lang.String) objArr65[0]).intern()};
                                        java.lang.Object obj19 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj19 == null) {
                                            java.lang.Class cls13 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1921, (char) (android.graphics.Color.rgb(0, 0, 0) + 16777216));
                                            byte b21 = $$a[14];
                                            byte b22 = (byte) (b21 + 1);
                                            java.lang.Object[] objArr67 = new java.lang.Object[1];
                                            b(b22, b22, (byte) (-b21), objArr67);
                                            obj19 = cls13.getMethod((java.lang.String) objArr67[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj19);
                                        }
                                        java.lang.Object invoke7 = ((java.lang.reflect.Method) obj19).invoke(null, objArr66);
                                        if (invoke6 != null) {
                                            java.lang.Object[] objArr68 = {invoke6, 42};
                                            java.lang.Object obj20 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj20 == null) {
                                                java.lang.Class cls14 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2594, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                byte b23 = $$a[14];
                                                byte b24 = (byte) (b23 + 1);
                                                java.lang.Object[] objArr69 = new java.lang.Object[1];
                                                b(b24, b24, (byte) (-b23), objArr69);
                                                obj20 = cls14.getMethod((java.lang.String) objArr69[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj20);
                                            }
                                            long longValue6 = ((java.lang.Long) ((java.lang.reflect.Method) obj20).invoke(null, objArr68)).longValue();
                                            long j19 = ~((int) java.lang.System.currentTimeMillis());
                                            long j20 = (((-782) * longValue6) - 45151797152L) + ((~longValue6) * (-783)) + ((~(57591577 | j19 | longValue6)) * (-783)) + (((~(longValue6 | j19)) | 57591577) * 783) + 1314692102;
                                            int currentTimeMillis16 = (int) java.lang.System.currentTimeMillis();
                                            int i17 = (int) j20;
                                            int currentTimeMillis17 = (int) java.lang.System.currentTimeMillis();
                                            int i18 = ~currentTimeMillis17;
                                            int i19 = ~(1259927513 | i18);
                                        }
                                        if (invoke7 != null) {
                                            java.lang.Object[] objArr70 = {invoke7, 42};
                                            java.lang.Object obj21 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                                            if (obj21 == null) {
                                                java.lang.Class cls15 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str) + 28, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2595, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                byte b25 = $$a[14];
                                                byte b26 = (byte) (b25 + 1);
                                                java.lang.Object[] objArr71 = new java.lang.Object[1];
                                                b(b26, b26, (byte) (-b25), objArr71);
                                                obj21 = cls15.getMethod((java.lang.String) objArr71[0], java.lang.String.class, java.lang.Integer.TYPE);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj21);
                                            }
                                            long longValue7 = ((java.lang.Long) ((java.lang.reflect.Method) obj21).invoke(null, objArr70)).longValue();
                                            long j21 = (-161266334) | longValue7;
                                            long currentTimeMillis18 = (int) java.lang.System.currentTimeMillis();
                                            long j22 = ~currentTimeMillis18;
                                            long j23 = ((-753) * longValue7) + 121756081415L + (((~(currentTimeMillis18 | (-161266334))) | (~j21) | (~(longValue7 | currentTimeMillis18))) * (-754)) + (((~(j21 | currentTimeMillis18)) | (~(longValue7 | 161266333 | j22))) * (-754)) + (((-161266334) | j22) * 754) + 1095834191;
                                            int currentTimeMillis19 = (int) java.lang.System.currentTimeMillis();
                                            int currentTimeMillis20 = (int) java.lang.System.currentTimeMillis();
                                            int i20 = ~currentTimeMillis20;
                                        }
                                    }
                                }
                                java.lang.Object[] objArr72 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", android.view.View.resolveSize(0, 0) - 637855546, (char) android.graphics.Color.blue(0), objArr72);
                                java.lang.Object[] objArr73 = {((java.lang.String) objArr72[0]).intern()};
                                obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj3 == null) {
                                    java.lang.Class cls16 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, android.view.View.MeasureSpec.getMode(0) + 2807, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    byte b27 = $$a[14];
                                    byte b28 = (byte) (b27 + 1);
                                    java.lang.Object[] objArr74 = new java.lang.Object[1];
                                    b(b28, b28, (byte) (-b27), objArr74);
                                    obj3 = cls16.getMethod((java.lang.String) objArr74[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj3);
                                }
                                long longValue8 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr73)).longValue();
                                long currentTimeMillis21 = (int) java.lang.System.currentTimeMillis();
                                long j24 = ~currentTimeMillis21;
                                long j25 = ~longValue8;
                                long j26 = (((-756) * longValue8) - 283252960152L) + ((j24 | (-373684644)) * (-757)) + ((~(j25 | (-373684644) | currentTimeMillis21)) * 1514) + (((~(longValue8 | (-373684644) | currentTimeMillis21)) | (~(j25 | j24)) | (~(373684643 | j25))) * 757) + 1664224711;
                                int currentTimeMillis22 = (int) java.lang.System.currentTimeMillis();
                                int i21 = ~currentTimeMillis22;
                                int currentTimeMillis23 = (int) java.lang.System.currentTimeMillis();
                                int i22 = ~currentTimeMillis23;
                                j = (((int) j26) & ((((~(1000722173 | currentTimeMillis23)) | (~((-18876482) | i22))) * 497) + 757014578 + (((~(currentTimeMillis23 | (-18876482))) | (~(455380717 | i22)) | 545341456) * 497))) | (((int) (j26 >> 32)) & ((((~(45771374 | i21)) | (-1482997786)) * (-865)) + 1901830178 + ((~(currentTimeMillis22 | (-45771375))) * 865) + (((~((-1482997786) | i21)) | (~(i21 | (-45771375)))) * 865)));
                                java.lang.Object[] objArr75 = new java.lang.Object[1];
                                c(189 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.blue(0), 17 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr75);
                                java.lang.Object[] objArr76 = {((java.lang.String) objArr75[0]).intern()};
                                obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj4 == null) {
                                    java.lang.Class cls17 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 28, 2808 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (android.os.Process.myPid() >> 22));
                                    byte b29 = $$a[14];
                                    byte b30 = (byte) (b29 + 1);
                                    java.lang.Object[] objArr77 = new java.lang.Object[1];
                                    b(b30, b30, (byte) (-b29), objArr77);
                                    obj4 = cls17.getMethod((java.lang.String) objArr77[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj4);
                                }
                                long longValue9 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr76)).longValue();
                                long currentTimeMillis24 = (int) java.lang.System.currentTimeMillis();
                                long j27 = ~((~currentTimeMillis24) | (-85136923));
                                long j28 = ((339 * longValue9) - 28691142714L) + (((~((~longValue9) | 85136922)) | j27 | (~(currentTimeMillis24 | 85136922))) * (-338)) + ((~((-85136923) | longValue9)) * 338) + (((~(85136922 | longValue9 | currentTimeMillis24)) | j27) * 338) + 1205403145;
                                int i23 = ~((int) java.lang.System.currentTimeMillis());
                                int currentTimeMillis25 = (int) java.lang.System.currentTimeMillis();
                                int i24 = ~currentTimeMillis25;
                                long j29 = (((int) (j28 >> 32)) & (((((~(1118487812 | i23)) | (-1739253077)) * (-241)) - 1110938399) + (((~(i23 | (-620765265))) | 4) * 241))) | (((((-1451095723) | currentTimeMillis25) * 614) + 41425219 + (((~((-552194434) | i24)) | 545259777 | (~((-1989420844) | i24))) * (-1228)) + (((~((-1444161067) | i24)) | (~(i24 | (-6934657)))) * 614)) & ((int) j28));
                                if (j <= 0 && j29 > 0 && j29 - 3 < j) {
                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 119) % 128;
                                    java.lang.Object[] objArr78 = {new int[]{0}, new int[]{247}, null, new int[1]};
                                    int currentTimeMillis26 = (int) java.lang.System.currentTimeMillis();
                                    java.lang.Object[] objArr79 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-14783549) | currentTimeMillis26)) | 8388652) * (-283)) - 1211653261) + ((~(currentTimeMillis26 | (-6394897))) * 283))};
                                    java.lang.Object obj22 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj22 == null) {
                                        java.lang.Class cls18 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 2713 - android.view.KeyEvent.normalizeMetaState(0), (char) android.widget.ExpandableListView.getPackedPositionType(0L));
                                        java.lang.Object[] objArr80 = new java.lang.Object[1];
                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr80);
                                        obj22 = cls18.getMethod((java.lang.String) objArr80[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj22);
                                    }
                                    ((int[]) objArr78[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj22).invoke(null, objArr79)).intValue();
                                    return objArr78;
                                }
                                java.lang.Object[] objArr81 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", (-637855545) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr81);
                                java.lang.Object[] objArr82 = {((java.lang.String) objArr81[0]).intern()};
                                obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj5 == null) {
                                    java.lang.Class cls19 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 2808 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) android.text.TextUtils.getCapsMode(str, 0, 0));
                                    byte b31 = $$a[14];
                                    byte b32 = (byte) (b31 + 1);
                                    java.lang.Object[] objArr83 = new java.lang.Object[1];
                                    b(b32, b32, (byte) (-b31), objArr83);
                                    obj5 = cls19.getMethod((java.lang.String) objArr83[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj5);
                                }
                                long longValue10 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr82)).longValue();
                                long j30 = ~((int) java.lang.System.currentTimeMillis());
                                long j31 = ((-159) * longValue10) + 135972659958L + ((longValue10 | 855173961) * 160) + (((~(longValue10 | (-855173962))) | (~(j30 | (-855173962)))) * (-160)) + (((~((~longValue10) | j30)) | (-855173962)) * 160) + 2145714029;
                                int currentTimeMillis27 = (int) java.lang.System.currentTimeMillis();
                                int currentTimeMillis28 = (int) java.lang.System.currentTimeMillis();
                                j2 = (((int) (j31 >> 32)) & ((((~((-1706593274) | currentTimeMillis27)) | (-1974910392)) * 398) + 1097477276 + (((~((~currentTimeMillis27) | (-1706593274))) | (-1974910392)) * 398))) | (((((~((-374457680) | currentTimeMillis28)) | 1062768730) * (-668)) + 1881936201 + (((~(1062768730 | currentTimeMillis28)) | (-374457680)) * 1336) + ((currentTimeMillis28 | (-83206)) * 668)) & ((int) j31));
                                java.lang.Object[] objArr84 = new java.lang.Object[1];
                                c(205 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (27352 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr84);
                                java.lang.Object[] objArr85 = {((java.lang.String) objArr84[0]).intern()};
                                obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                                if (obj6 == null) {
                                    java.lang.Class cls20 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2807 - android.text.TextUtils.getTrimmedLength(str), (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                                    byte b33 = $$a[14];
                                    byte b34 = (byte) (b33 + 1);
                                    java.lang.Object[] objArr86 = new java.lang.Object[1];
                                    b(b34, b34, (byte) (-b33), objArr86);
                                    obj6 = cls20.getMethod((java.lang.String) objArr86[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1729156627, obj6);
                                }
                                long longValue11 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr85)).longValue();
                                long currentTimeMillis29 = (int) java.lang.System.currentTimeMillis();
                                long j32 = (((-301) * longValue11) - 178358073924L) + (((~(longValue11 | (-588640508) | currentTimeMillis29)) | (~((~currentTimeMillis29) | 588640507 | longValue11))) * (-302)) + ((~(588640507 | longValue11 | currentTimeMillis29)) * (-604)) + (((~((~longValue11) | (-588640508))) | (~(longValue11 | currentTimeMillis29))) * 302) + 1879180575;
                                int currentTimeMillis30 = (int) java.lang.System.currentTimeMillis();
                                int currentTimeMillis31 = (int) java.lang.System.currentTimeMillis();
                                int i25 = ~currentTimeMillis31;
                                long j33 = (((int) (j32 >> 32)) & (((((~((-675545266) | currentTimeMillis30)) | (~((~currentTimeMillis30) | 761681145))) * (-318)) - 1322998726) + (((~(675681529 | currentTimeMillis30)) | 85999616) * (-318)) + (((~(currentTimeMillis30 | (-675681530))) | (-761544882)) * 318))) | (((((~(1576638815 | i25)) | (-139412406)) * (-865)) + 237151840 + ((~(currentTimeMillis31 | (-1576638816))) * 865) + (((~((-139412406) | i25)) | (~(i25 | (-1576638816)))) * 865)) & ((int) j32));
                                if (j2 <= 0 && j33 > 0 && j33 + 100 < j2) {
                                    java.lang.Object[] objArr87 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE}, null, new int[1]};
                                    java.lang.Object[] objArr88 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-79700252) | r1)) | (-629625269)) * (-933)) - 1269607118) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-629625269))) | 554127524) * 933) + 1344171840)};
                                    java.lang.Object obj23 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj23 == null) {
                                        java.lang.Class cls21 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.graphics.Color.blue(0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                        java.lang.Object[] objArr89 = new java.lang.Object[1];
                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr89);
                                        obj23 = cls21.getMethod((java.lang.String) objArr89[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj23);
                                    }
                                    ((int[]) objArr87[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj23).invoke(null, objArr88)).intValue();
                                    return objArr87;
                                }
                                java.lang.Object[] objArr90 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\uea9a〉䃲̈\udb00\ua634\uf1ae", "ꜱᩅ캳馷", (-1290123865) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr90);
                                java.lang.String intern30 = ((java.lang.String) objArr90[0]).intern();
                                java.lang.Object[] objArr91 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "朱裠ꦄ⹀뮒랜\u135b╳ꡒ嫉\ude8a", "\uf349\ued86\udd39ʅ", 971867890 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr91);
                                java.lang.String intern31 = ((java.lang.String) objArr91[0]).intern();
                                java.lang.Object[] objArr92 = new java.lang.Object[1];
                                c(android.text.TextUtils.getOffsetBefore(str, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 12 - android.text.TextUtils.getCapsMode(str, 0, 0), objArr92);
                                java.lang.String intern32 = ((java.lang.String) objArr92[0]).intern();
                                java.lang.Object[] objArr93 = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "尾銇⟷뚡쨲絅뽉ݞɛ뙤⇲汦", "ꚤ愡洏ꏀ", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr93);
                                java.lang.String intern33 = ((java.lang.String) objArr93[0]).intern();
                                java.lang.Object[] objArr94 = new java.lang.Object[1];
                                c(223 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0), android.view.View.getDefaultSize(0, 0) + 11, objArr94);
                                java.lang.String intern34 = ((java.lang.String) objArr94[0]).intern();
                                java.lang.Object[] objArr95 = new java.lang.Object[1];
                                c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, objArr95);
                                java.lang.String intern35 = ((java.lang.String) objArr95[0]).intern();
                                java.lang.Object[] objArr96 = new java.lang.Object[1];
                                c(237 - android.view.MotionEvent.axisFromString(str), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 4 - android.text.TextUtils.indexOf(str, str, 0), objArr96);
                                java.lang.String[] strArr2 = {intern30, intern31, intern32, intern33, intern34, intern35, ((java.lang.String) objArr96[0]).intern()};
                                i = 0;
                                while (true) {
                                    if (i >= 7) {
                                        i2 = 0;
                                        break;
                                    }
                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 95) % 128;
                                    java.lang.Object[] objArr97 = {strArr2[i]};
                                    java.lang.Object obj24 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2046560211);
                                    if (obj24 == null) {
                                        java.lang.Class cls22 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1672, (char) (47940 - android.graphics.Color.alpha(0)));
                                        byte b35 = $$a[14];
                                        byte b36 = (byte) (b35 + 1);
                                        java.lang.Object[] objArr98 = new java.lang.Object[1];
                                        b(b36, b36, (byte) (-b35), objArr98);
                                        obj24 = cls22.getMethod((java.lang.String) objArr98[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2046560211, obj24);
                                    }
                                    long longValue12 = ((java.lang.Long) ((java.lang.reflect.Method) obj24).invoke(null, objArr97)).longValue();
                                    long j34 = ~((int) java.lang.System.currentTimeMillis());
                                    long j35 = ((((((-782) * longValue12) - 1178883287008L) + ((~longValue12) * (-783))) + ((~((1503677661 | j34) | longValue12)) * (-783))) + (((~(j34 | longValue12)) | 1503677661) * 783)) - 121852520;
                                    int i26 = (int) (j35 >> 32);
                                    int i27 = ~((int) java.lang.System.currentTimeMillis());
                                    if (((i26 & ((((((~((-8396865) | i27)) | (~((-83952659) | i27))) * (-184)) - 1019427974) + (((~(i27 | 1466648339)) | ((~(1391092545 | i27)) | (-1475045204))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE)) - 1012935024)) | (((int) j35) & (((((~(673969027 | r9)) | 1439959084) * 305) - 1704616964) + (((~((~((int) java.lang.System.currentTimeMillis())) | 673969027)) | 2111195437) * 305)))) != 0) {
                                        i2 = i + 90;
                                        break;
                                    }
                                    i++;
                                }
                                if (i2 != 0) {
                                    java.lang.Object[] objArr99 = {new int[]{0}, new int[]{i2}, null, new int[1]};
                                    int currentTimeMillis32 = (int) java.lang.System.currentTimeMillis();
                                    int i28 = ~(78231729 | currentTimeMillis32);
                                    java.lang.Object[] objArr100 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-78231730) | currentTimeMillis32)) | 76134416 | (~((-631093791) | currentTimeMillis32))) * (-880)) + 2145524319 + (((~((~currentTimeMillis32) | (-78231730))) | 631093790 | i28) * (-880)) + (i28 * 880))};
                                    java.lang.Object obj25 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                    if (obj25 == null) {
                                        java.lang.Class cls23 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 50, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2712, (char) android.view.KeyEvent.keyCodeFromString(str));
                                        java.lang.Object[] objArr101 = new java.lang.Object[1];
                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr101);
                                        obj25 = cls23.getMethod((java.lang.String) objArr101[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj25);
                                    }
                                    ((int[]) objArr99[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj25).invoke(null, objArr100)).intValue();
                                    return objArr99;
                                }
                                try {
                                    java.lang.Object[] objArr102 = new java.lang.Object[1];
                                    c((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), 13 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr102);
                                    try {
                                        java.lang.Object[] objArr103 = {((java.lang.String) objArr102[0]).intern()};
                                        java.lang.Object obj26 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                        if (obj26 == null) {
                                            java.lang.Class cls24 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(39 - android.view.MotionEvent.axisFromString(str), 1921 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                            byte b37 = $$a[14];
                                            byte b38 = (byte) (b37 + 1);
                                            java.lang.Object[] objArr104 = new java.lang.Object[1];
                                            b(b38, b38, (byte) (-b37), objArr104);
                                            obj26 = cls24.getMethod((java.lang.String) objArr104[0], java.lang.String.class);
                                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj26);
                                        }
                                        invoke2 = ((java.lang.reflect.Method) obj26).invoke(null, objArr103);
                                    } catch (java.lang.Throwable th) {
                                        java.lang.Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Exception unused) {
                                }
                                try {
                                    if (invoke2 != null) {
                                        java.lang.Object[] objArr105 = new java.lang.Object[1];
                                        c(254 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) android.text.TextUtils.indexOf(str, str, 0), 11 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr105);
                                        try {
                                            java.lang.Object[] objArr106 = {invoke2, new java.lang.String[]{((java.lang.String) objArr105[0]).intern()}};
                                            java.lang.Object obj27 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1831766780);
                                            if (obj27 == null) {
                                                java.lang.Class cls25 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(42 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.text.TextUtils.getOffsetBefore(str, 0) + 2880, (char) (1 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1))));
                                                byte b39 = $$a[14];
                                                byte b40 = (byte) (b39 + 1);
                                                java.lang.Object[] objArr107 = new java.lang.Object[1];
                                                b(b40, b40, (byte) (-b39), objArr107);
                                                obj27 = cls25.getMethod((java.lang.String) objArr107[0], java.lang.String.class, java.lang.String[].class);
                                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1831766780, obj27);
                                            }
                                            long longValue13 = ((java.lang.Long) ((java.lang.reflect.Method) obj27).invoke(null, objArr106)).longValue();
                                            long j36 = ~((int) java.lang.System.currentTimeMillis());
                                            long j37 = ((((((-782) * longValue13) - 1464517675376L) + ((~longValue13) * (-783))) + ((~((1868007238 | j36) | longValue13)) * (-783))) + (((~(longValue13 | j36)) | 1868007238) * 783)) - 160704540;
                                            int i29 = (int) (j37 >> 32);
                                            int currentTimeMillis33 = (int) java.lang.System.currentTimeMillis();
                                            int i30 = ~currentTimeMillis33;
                                            int i31 = (int) j37;
                                            int currentTimeMillis34 = (int) java.lang.System.currentTimeMillis();
                                            if (((i29 & ((((16875784 | currentTimeMillis33) * 988) - 1295881502) + (((~(659679064 | i30)) | 134744066) * (-1976)) + (((~(currentTimeMillis33 | (-777547347))) | 16875784 | (~(i30 | 777547346))) * 988))) | ((((((~((-545924373) | currentTimeMillis34)) | 85983361) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) - 195420740) + ((~((~currentTimeMillis34) | (-545924373))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)) & i31)) == 0) {
                                                i3 = 0;
                                                if (i3 != 0) {
                                                    java.lang.Object[] objArr108 = {new int[]{0}, new int[]{i3}, null, new int[1]};
                                                    int currentTimeMillis35 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr109 = {-1884061761, 16, java.lang.Integer.valueOf((((-744583889) | (~currentTimeMillis35)) * (-490)) + 213864693 + (((~(currentTimeMillis35 | 43650059)) | (-788233948)) * 490) + 409153256)};
                                                    java.lang.Object obj28 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj28 == null) {
                                                        java.lang.Class cls26 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.view.MotionEvent.axisFromString(str) + 2714, (char) android.widget.ExpandableListView.getPackedPositionGroup(0L));
                                                        java.lang.Object[] objArr110 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr110);
                                                        obj28 = cls26.getMethod((java.lang.String) objArr110[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj28);
                                                    }
                                                    ((int[]) objArr108[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj28).invoke(null, objArr109)).intValue();
                                                    return objArr108;
                                                }
                                                java.lang.Object[] objArr111 = new java.lang.Object[1];
                                                c(243 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), android.graphics.Color.blue(0) + 13, objArr111);
                                                java.lang.Object[] objArr112 = {((java.lang.String) objArr111[0]).intern()};
                                                java.lang.Object obj29 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj29 == null) {
                                                    java.lang.Class cls27 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 39, 1921 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                    byte b41 = $$a[14];
                                                    byte b42 = (byte) (b41 + 1);
                                                    java.lang.Object[] objArr113 = new java.lang.Object[1];
                                                    b(b42, b42, (byte) (-b41), objArr113);
                                                    obj29 = cls27.getMethod((java.lang.String) objArr113[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj29);
                                                }
                                                java.lang.String str3 = (java.lang.String) ((java.lang.reflect.Method) obj29).invoke(null, objArr112);
                                                if (str3 != null) {
                                                    java.lang.Object[] objArr114 = new java.lang.Object[1];
                                                    c((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 255, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 11, objArr114);
                                                    java.lang.String[] strArr3 = {((java.lang.String) objArr114[0]).intern()};
                                                    int i32 = 0;
                                                    while (true) {
                                                        if (i32 > 0) {
                                                            RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 55) % 128;
                                                            java.lang.Object[] objArr115 = new java.lang.Object[1];
                                                            c(android.view.View.combineMeasuredStates(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 23908), 12 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), objArr115);
                                                            java.lang.String intern36 = ((java.lang.String) objArr115[0]).intern();
                                                            java.lang.Object[] objArr116 = new java.lang.Object[1];
                                                            c(285 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr116);
                                                            java.lang.String intern37 = ((java.lang.String) objArr116[0]).intern();
                                                            java.lang.Object[] objArr117 = new java.lang.Object[1];
                                                            c((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 302, (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 14249), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 17, objArr117);
                                                            java.lang.String intern38 = ((java.lang.String) objArr117[0]).intern();
                                                            java.lang.Object[] objArr118 = new java.lang.Object[1];
                                                            c(318 - android.graphics.Color.red(0), (char) ((-1) - android.os.Process.getGidForName(str)), 6 - android.view.View.resolveSize(0, 0), objArr118);
                                                            java.lang.String intern39 = ((java.lang.String) objArr118[0]).intern();
                                                            java.lang.Object[] objArr119 = new java.lang.Object[1];
                                                            c(177 - android.text.TextUtils.getOffsetAfter(str, 0), (char) (android.view.MotionEvent.axisFromString(str) + 32086), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 12, objArr119);
                                                            java.lang.String intern40 = ((java.lang.String) objArr119[0]).intern();
                                                            java.lang.Object[] objArr120 = new java.lang.Object[1];
                                                            a("\u0000\u0000\u0000\u0000", "ꜛ\ue01e⍫\ue096獳\u1aea八梂㎀쎟㰕▧횣\ue7ea황垾媯", "Čら苂밀", (-1037006591) - android.graphics.Color.argb(0, 0, 0, 0), (char) (131 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr120);
                                                            java.lang.String intern41 = ((java.lang.String) objArr120[0]).intern();
                                                            java.lang.Object[] objArr121 = new java.lang.Object[1];
                                                            a("\u0000\u0000\u0000\u0000", "콶탡\uf71bཝⵏ극ᠽί≷楹\u19cb桕\uf475Ƥ\uf422\ud91b騢뇷恒\uea8b筻", "铤쨞꼦솈", 650780308 - android.view.View.combineMeasuredStates(0, 0), (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), objArr121);
                                                            java.lang.String intern42 = ((java.lang.String) objArr121[0]).intern();
                                                            java.lang.Object[] objArr122 = new java.lang.Object[1];
                                                            c(324 - android.text.TextUtils.indexOf(str, str), (char) (41964 - ((byte) android.view.KeyEvent.getModifierMetaStateMask())), 17 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr122);
                                                            java.lang.String intern43 = ((java.lang.String) objArr122[0]).intern();
                                                            java.lang.Object[] objArr123 = new java.lang.Object[1];
                                                            c((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 339, (char) (7515 - android.graphics.Color.red(0)), 25 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr123);
                                                            java.lang.String intern44 = ((java.lang.String) objArr123[0]).intern();
                                                            java.lang.Object[] objArr124 = new java.lang.Object[1];
                                                            c(366 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (55656 - android.view.View.combineMeasuredStates(0, 0)), 13 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr124);
                                                            java.lang.String intern45 = ((java.lang.String) objArr124[0]).intern();
                                                            java.lang.Object[] objArr125 = new java.lang.Object[1];
                                                            a("\u0000\u0000\u0000\u0000", "늭麤掁띇쟠拎攷餶䢸", "ᾪ等̍릅", android.text.TextUtils.getOffsetBefore(str, 0) + 226183455, (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr125);
                                                            java.lang.String intern46 = ((java.lang.String) objArr125[0]).intern();
                                                            java.lang.Object[] objArr126 = new java.lang.Object[1];
                                                            c(377 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 8, objArr126);
                                                            java.lang.String[] strArr4 = {intern36, intern37, intern38, intern39, intern40, intern41, intern42, intern43, intern44, intern45, intern46, ((java.lang.String) objArr126[0]).intern()};
                                                            for (int i33 = 0; i33 < 12; i33++) {
                                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                                sb.append(strArr4[i33]);
                                                                java.lang.Object[] objArr127 = new java.lang.Object[1];
                                                                a("\u0000\u0000\u0000\u0000", "\udcb1铿", "鞝ᤳ䘥\ude7e", (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (char) (32326 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr127);
                                                                sb.append(((java.lang.String) objArr127[0]).intern());
                                                                java.lang.Object[] objArr128 = {sb.toString()};
                                                                java.lang.Object obj30 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1161224381);
                                                                if (obj30 == null) {
                                                                    java.lang.Class cls28 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 36, 3161 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (33099 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)));
                                                                    byte b43 = $$a[14];
                                                                    byte b44 = (byte) (b43 + 1);
                                                                    java.lang.Object[] objArr129 = new java.lang.Object[1];
                                                                    b(b44, b44, (byte) (-b43), objArr129);
                                                                    obj30 = cls28.getMethod((java.lang.String) objArr129[0], java.lang.String.class);
                                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1161224381, obj30);
                                                                }
                                                                long longValue14 = ((java.lang.Long) ((java.lang.reflect.Method) obj30).invoke(null, objArr128)).longValue();
                                                                long currentTimeMillis36 = (int) java.lang.System.currentTimeMillis();
                                                                long j38 = ~currentTimeMillis36;
                                                                long j39 = j38 | (-52827775);
                                                                long j40 = (((((370 * longValue14) + 19546276380L) + (((longValue14 | 52827774) | j38) * (-369))) + (((~j39) | longValue14) * (-369))) + (((~(j39 | longValue14)) | ((~((~longValue14) | 52827774)) | (~(currentTimeMillis36 | 52827774)))) * 369)) - 1390495882;
                                                                int currentTimeMillis37 = (int) java.lang.System.currentTimeMillis();
                                                                int i34 = ~currentTimeMillis37;
                                                                int currentTimeMillis38 = (int) java.lang.System.currentTimeMillis();
                                                                if (((((int) j40) & (((((~((-1077235613) | currentTimeMillis38)) | 706024741) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) - 433976567) + (((~((~currentTimeMillis38) | (-1077235613))) | 706024741) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE))) | (((int) (j40 >> 32)) & ((((-830481944) | currentTimeMillis37) * (-50)) + 1146534166 + (((~(currentTimeMillis37 | 2044044863)) | (~((-16785923) | i34))) * 50) + (((~(2027258941 | i34)) | 16785922 | (~(i34 | (-830481944)))) * 50)))) != 0) {
                                                                    i4 = i33 + 110;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            if (str3.contains(strArr3[i32])) {
                                                                break;
                                                            }
                                                            i32++;
                                                        }
                                                    }
                                                }
                                                i4 = 0;
                                                if (i4 != 0) {
                                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 29) % 128;
                                                    java.lang.Object[] objArr130 = {new int[]{0}, new int[]{i4}, null, new int[1]};
                                                    int i35 = ~((int) java.lang.System.currentTimeMillis());
                                                    java.lang.Object[] objArr131 = {-1884061761, 16, java.lang.Integer.valueOf((((~(92283176 | i35)) | (-633827760)) * (-160)) + 495692751 + (((~(i35 | (-617042344))) | 92283176) * 160))};
                                                    java.lang.Object obj31 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj31 == null) {
                                                        java.lang.Class cls29 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.getDefaultSize(0, 0) + 50, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2712, (char) android.text.TextUtils.getCapsMode(str, 0, 0));
                                                        java.lang.Object[] objArr132 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr132);
                                                        obj31 = cls29.getMethod((java.lang.String) objArr132[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj31);
                                                    }
                                                    ((int[]) objArr130[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj31).invoke(null, objArr131)).intValue();
                                                    return objArr130;
                                                }
                                                long[] jArr = {472001035};
                                                java.lang.Object[] objArr133 = new java.lang.Object[1];
                                                c((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 386, (char) android.graphics.Color.blue(0), 'A' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr133);
                                                java.lang.Object[] objArr134 = {((java.lang.String) objArr133[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr};
                                                java.lang.Object obj32 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj32 == null) {
                                                    java.lang.Class cls30 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3096, (char) (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                                    byte b45 = $$a[14];
                                                    byte b46 = (byte) (b45 + 1);
                                                    java.lang.Object[] objArr135 = new java.lang.Object[1];
                                                    b(b46, b46, (byte) (-b45), objArr135);
                                                    obj32 = cls30.getMethod((java.lang.String) objArr135[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj32);
                                                }
                                                long longValue15 = ((java.lang.Long) ((java.lang.reflect.Method) obj32).invoke(null, objArr134)).longValue();
                                                int currentTimeMillis39 = (int) java.lang.System.currentTimeMillis();
                                                long j41 = ~longValue15;
                                                long j42 = 415054353 | j41;
                                                long j43 = currentTimeMillis39;
                                                long j44 = (((((longValue15 * (-344)) + 142778697776L) + (((~j42) | (~(j43 | 415054353))) * 345)) + (((~(415054353 | (~j43))) | (~((-415054354) | j41))) * 345)) + ((~(j42 | j43)) * 345)) - 1495593556;
                                                int currentTimeMillis40 = (int) java.lang.System.currentTimeMillis();
                                                int currentTimeMillis41 = (int) java.lang.System.currentTimeMillis();
                                                int i36 = ((((int) (j44 >> 32)) & (((((~((~currentTimeMillis40) | (-16851201))) * 433) + 1377826324) + (((~(25387365 | currentTimeMillis40)) | (-1462613777)) * (-433))) + (((~(currentTimeMillis40 | (-1462613777))) | 8536165) * 433))) | (((((~((-1075838993) | currentTimeMillis41)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 525688452) + (((~((~currentTimeMillis41) | (-1075838993))) | 134235201) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL)) & ((int) j44))) != 0 ? 240 : 0;
                                                if (i36 != 0) {
                                                    java.lang.Object[] objArr136 = {new int[]{0}, new int[]{i36}, null, new int[1]};
                                                    int i37 = ~((int) java.lang.System.currentTimeMillis());
                                                    java.lang.Object[] objArr137 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-184560802) | i37)) | (-524764719)) * (-983)) + 838488212 + (((~(i37 | (-524764719))) | 340214286) * 983))};
                                                    java.lang.Object obj33 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj33 == null) {
                                                        java.lang.Class cls31 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 49, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2713, (char) ((android.os.Process.getThreadPriority(0) + 20) >> 6));
                                                        java.lang.Object[] objArr138 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr138);
                                                        obj33 = cls31.getMethod((java.lang.String) objArr138[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj33);
                                                    }
                                                    ((int[]) objArr136[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj33).invoke(null, objArr137)).intValue();
                                                    return objArr136;
                                                }
                                                long[] jArr2 = {472001035};
                                                java.lang.Object[] objArr139 = new java.lang.Object[1];
                                                a("\u0000\u0000\u0000\u0000", "寶◚렎\ue0e4₫霠濾徵䠔ៗ鮗聵긷墟鷯딂ꬃ풙揾랝㏇題", "竏軤⧦뿒", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) android.view.Gravity.getAbsoluteGravity(0, 0), objArr139);
                                                java.lang.Object[] objArr140 = {((java.lang.String) objArr139[0]).intern(), 5, java.lang.Long.valueOf(kotlinx.coroutines.internal.LockFreeTaskQueueCore.HEAD_MASK), jArr2};
                                                java.lang.Object obj34 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj34 == null) {
                                                    java.lang.Class cls32 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777179) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 3097, (char) (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                    byte b47 = $$a[14];
                                                    byte b48 = (byte) (b47 + 1);
                                                    java.lang.Object[] objArr141 = new java.lang.Object[1];
                                                    b(b48, b48, (byte) (-b47), objArr141);
                                                    obj34 = cls32.getMethod((java.lang.String) objArr141[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj34);
                                                }
                                                long longValue16 = ((java.lang.Long) ((java.lang.reflect.Method) obj34).invoke(null, objArr140)).longValue();
                                                int currentTimeMillis42 = (int) java.lang.System.currentTimeMillis();
                                                long j45 = ~longValue16;
                                                long j46 = currentTimeMillis42;
                                                long j47 = ~j46;
                                                long j48 = (((((longValue16 * (-978)) - 108180334080L) + ((~(j45 | j47)) * 979)) + (((-110388096) | j46) * (-979))) + (((~(j47 | (-110388096))) | (~(j45 | j46))) * 979)) - 1800259814;
                                                int currentTimeMillis43 = (int) java.lang.System.currentTimeMillis();
                                                int i38 = (int) j48;
                                                int currentTimeMillis44 = (int) java.lang.System.currentTimeMillis();
                                                if (((((int) (j48 >> 32)) & ((((~(1154183392 | currentTimeMillis43)) | 269779978) * (-140)) + 586942374 + ((~(1423963370 | currentTimeMillis43)) * 70) + (((~(currentTimeMillis43 | 283043018)) | 1410700330) * 70))) | (((((~currentTimeMillis44) | 1080208518) * 1324) + 818885255 + (((~(currentTimeMillis44 | 1240657102)) | (~(1617083783 | currentTimeMillis44))) * (-1324)) + 2066887366) & i38)) != 0) {
                                                    SdkCoreAlternateContactlessPaymentDataImpl = (RecordsJson + 109) % 128;
                                                    java.lang.Object[] objArr142 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE}, null, new int[1]};
                                                    int currentTimeMillis45 = (int) java.lang.System.currentTimeMillis();
                                                    int i39 = ~currentTimeMillis45;
                                                    java.lang.Object[] objArr143 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-36417) | i39)) | 709361936) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + 413327219 + (((~(i39 | (-83922536))) | 793248055) * (-440)) + ((currentTimeMillis45 | (-36417)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE))};
                                                    java.lang.Object obj35 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj35 == null) {
                                                        java.lang.Class cls33 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1));
                                                        java.lang.Object[] objArr144 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr144);
                                                        obj35 = cls33.getMethod((java.lang.String) objArr144[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj35);
                                                    }
                                                    ((int[]) objArr142[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj35).invoke(null, objArr143)).intValue();
                                                    return objArr142;
                                                }
                                                java.lang.Object obj36 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(724989957);
                                                if (obj36 == null) {
                                                    java.lang.Class cls34 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1889, (char) (3600 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)));
                                                    byte b49 = $$a[14];
                                                    byte b50 = (byte) (b49 + 1);
                                                    java.lang.Object[] objArr145 = new java.lang.Object[1];
                                                    b(b50, b50, (byte) (-b49), objArr145);
                                                    obj36 = cls34.getMethod((java.lang.String) objArr145[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(724989957, obj36);
                                                }
                                                long longValue17 = ((java.lang.Long) ((java.lang.reflect.Method) obj36).invoke(null, null)).longValue();
                                                long currentTimeMillis46 = (int) java.lang.System.currentTimeMillis();
                                                long j49 = ~currentTimeMillis46;
                                                long j50 = ~longValue17;
                                                long j51 = (((((longValue17 * (-858)) - 286713384160L) + ((currentTimeMillis46 | (-333387656)) * (-859))) + (((~(j49 | (-333387656))) | (~((j50 | 333387655) | currentTimeMillis46))) * 859)) + (((~(j50 | j49)) | (~(j50 | (-333387656)))) * 859)) - 1545860724;
                                                int i40 = (int) (j51 >> 32);
                                                int currentTimeMillis47 = (int) java.lang.System.currentTimeMillis();
                                                int i41 = (int) j51;
                                                int i42 = ~((int) java.lang.System.currentTimeMillis());
                                                if (((i40 & (((((-414258865) | (~currentTimeMillis47)) * (-490)) - 1465123250) + (((~(currentTimeMillis47 | (-414791409))) | 532544) * 490) + 1518022162)) | (((((~((-502413953) | i42)) | 1939640362) * (-933)) + 666782604 + (((~(i42 | 1939640362)) | (-2147400363)) * 933) + 1468995858) & i41)) != 0) {
                                                    java.lang.Object[] objArr146 = {new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PLAID_LOGO_VALUE}, new int[]{i36}, null, new int[1]};
                                                    int currentTimeMillis48 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr147 = {-1884061761, 16, java.lang.Integer.valueOf((((~(658960319 | currentTimeMillis48)) * (-301)) - 1875755838) + (((~((-122064696) | currentTimeMillis48)) | (~((~currentTimeMillis48) | 587260824))) * (-301)) + (((~(currentTimeMillis48 | (-587260825))) | (-122064696)) * 301))};
                                                    java.lang.Object obj37 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj37 == null) {
                                                        java.lang.Class cls35 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 49, android.text.TextUtils.getTrimmedLength(str) + 2713, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                        java.lang.Object[] objArr148 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr148);
                                                        obj37 = cls35.getMethod((java.lang.String) objArr148[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj37);
                                                    }
                                                    ((int[]) objArr146[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj37).invoke(null, objArr147)).intValue();
                                                    return objArr146;
                                                }
                                                java.lang.Object[] objArr149 = {2};
                                                java.lang.Object obj38 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(104106647);
                                                if (obj38 == null) {
                                                    java.lang.Class cls36 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 28, android.view.View.MeasureSpec.getMode(0) + 2364, (char) ('0' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
                                                    byte b51 = $$a[14];
                                                    byte b52 = (byte) (b51 + 1);
                                                    java.lang.Object[] objArr150 = new java.lang.Object[1];
                                                    b(b52, b52, (byte) (-b51), objArr150);
                                                    obj38 = cls36.getMethod((java.lang.String) objArr150[0], java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(104106647, obj38);
                                                }
                                                long longValue18 = ((java.lang.Long) ((java.lang.reflect.Method) obj38).invoke(null, objArr149)).longValue();
                                                int currentTimeMillis49 = (int) java.lang.System.currentTimeMillis();
                                                long j52 = ~longValue18;
                                                long j53 = currentTimeMillis49;
                                                long j54 = ~j53;
                                                long j55 = ((longValue18 * (-978)) - 359351361740L) + ((~(j52 | j54)) * 979) + (((-366685063) | j53) * (-979)) + (((~(j52 | j53)) | (~((-366685063) | j54))) * 979) + 1774595262;
                                                int currentTimeMillis50 = (int) java.lang.System.currentTimeMillis();
                                                int i43 = ~currentTimeMillis50;
                                                int i44 = ~(2054356869 | i43);
                                                int i45 = ~((int) java.lang.System.currentTimeMillis());
                                                if (((((int) j55) & ((((~(129666694 | i45)) | 1307559715) * (-983)) + 41590494 + (((~(i45 | 1307559715)) | 34605188) * 983))) | (((int) (j55 >> 32)) & ((((~((-2054356870) | currentTimeMillis50)) | (~((-617130459) | i43)) | i44) * (-516)) + 1240185642 + (((~(currentTimeMillis50 | (-1513248262))) | (~(i43 | 2130378719))) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR) + (((-2130378720) | i44) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_CRYPTO_ERROR)))) == 2) {
                                                    java.lang.Object[] objArr151 = {new int[]{0}, new int[]{270}, null, new int[1]};
                                                    int currentTimeMillis51 = (int) java.lang.System.currentTimeMillis();
                                                    int i46 = ~currentTimeMillis51;
                                                    java.lang.Object[] objArr152 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-356438957) | i46)) | 352883488) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1801722615 + ((~((-352883489) | currentTimeMillis51)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(currentTimeMillis51 | (-3555469))) | (~(i46 | (-352886564))) | 3075) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                    java.lang.Object obj39 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj39 == null) {
                                                        java.lang.Class cls37 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2713 - android.view.View.MeasureSpec.getSize(0), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                                        java.lang.Object[] objArr153 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr153);
                                                        obj39 = cls37.getMethod((java.lang.String) objArr153[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj39);
                                                    }
                                                    ((int[]) objArr151[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj39).invoke(null, objArr152)).intValue();
                                                    return objArr151;
                                                }
                                                java.lang.Object obj40 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1411285061);
                                                if (obj40 == null) {
                                                    java.lang.Class cls38 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 39, 3196 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) android.text.TextUtils.indexOf(str, str, 0));
                                                    byte b53 = $$a[14];
                                                    java.lang.Object[] objArr154 = new java.lang.Object[1];
                                                    b((byte) (-b53), (short) 612, (byte) (b53 + 1), objArr154);
                                                    obj40 = cls38.getMethod((java.lang.String) objArr154[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1411285061, obj40);
                                                }
                                                long longValue19 = ((java.lang.Long) ((java.lang.reflect.Method) obj40).invoke(null, null)).longValue();
                                                int currentTimeMillis52 = (int) java.lang.System.currentTimeMillis();
                                                long j56 = ~(1619210127 | longValue19);
                                                long j57 = ~longValue19;
                                                long j58 = ~((-1619210128) | j57);
                                                long j59 = currentTimeMillis52;
                                                long j60 = (longValue19 * 263) + 846846896944L + ((j56 | j58 | (~(j57 | j59))) * 262) + ((-786) * j58) + (((~((~j59) | j57)) | j56 | j58) * 262) + 1715455489;
                                                int currentTimeMillis53 = (int) java.lang.System.currentTimeMillis();
                                                int i47 = ~currentTimeMillis53;
                                                int currentTimeMillis54 = (int) java.lang.System.currentTimeMillis();
                                                int i48 = ~currentTimeMillis54;
                                                if (((((int) (j60 >> 32)) & (((((~((-2080582173) | i47)) | (-643355762)) * (-602)) - 125877118) + (((~(currentTimeMillis53 | (-2080582173))) | 1476602380 | (~((-39375970) | i47))) * (-301)) + ((~((-643355762) | i47)) * 301))) | (((((~(387833365 | i48)) | (-1049393045)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE) + 1453938690 + (((~((-679485825) | i48)) | (~((-369907221) | currentTimeMillis54))) * (-519)) + (((~(currentTimeMillis54 | (-1049393045))) | (-387833366)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_INVALID_CA_CERTIFICATE)) & ((int) j60))) != 0) {
                                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 81) % 128;
                                                    java.lang.Object[] objArr155 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE}, null, new int[1]};
                                                    int currentTimeMillis55 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr156 = {-1884061761, 16, java.lang.Integer.valueOf((((((~currentTimeMillis55) | (-28733616)) * 1444) - 322590975) + ((((~(currentTimeMillis55 | 367956254)) | (-369029568)) | (~(341369265 | currentTimeMillis55))) * (-1444))) - 729166450)};
                                                    java.lang.Object obj41 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj41 == null) {
                                                        java.lang.Class cls39 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getTouchSlop() >> 8), android.view.KeyEvent.normalizeMetaState(0) + 2713, (char) android.view.KeyEvent.normalizeMetaState(0));
                                                        java.lang.Object[] objArr157 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr157);
                                                        obj41 = cls39.getMethod((java.lang.String) objArr157[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj41);
                                                    }
                                                    ((int[]) objArr155[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj41).invoke(null, objArr156)).intValue();
                                                    return objArr155;
                                                }
                                                java.lang.Object obj42 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(502613909);
                                                if (obj42 == null) {
                                                    java.lang.Class cls40 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 3196 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                    byte b54 = $$a[14];
                                                    byte b55 = (byte) (b54 + 1);
                                                    java.lang.Object[] objArr158 = new java.lang.Object[1];
                                                    b(b55, b55, (byte) (-b54), objArr158);
                                                    obj42 = cls40.getMethod((java.lang.String) objArr158[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(502613909, obj42);
                                                }
                                                long longValue20 = ((java.lang.Long) ((java.lang.reflect.Method) obj42).invoke(null, null)).longValue();
                                                long j61 = 887494487 | longValue20;
                                                long currentTimeMillis56 = (int) java.lang.System.currentTimeMillis();
                                                long j62 = (~currentTimeMillis56) | (-887494488);
                                                long j63 = ~(currentTimeMillis56 | j61);
                                                long j64 = (503 * longValue20) + 446409726961L + (j61 * (-502)) + (((~((-887494488) | (~longValue20))) | (~j62) | j63) * (-502)) + ((j63 | (~(longValue20 | j62))) * 502) + 65375403;
                                                int currentTimeMillis57 = (int) java.lang.System.currentTimeMillis();
                                                int currentTimeMillis58 = (int) java.lang.System.currentTimeMillis();
                                                int i49 = ~currentTimeMillis58;
                                                if (((((int) (j64 >> 32)) & ((((~((-1200417) | currentTimeMillis57)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) - 1160114440) + (((~((~currentTimeMillis57) | (-1200417))) | 696255618) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))) | (((((138773777 | currentTimeMillis58) * 988) - 1427058803) + (((~(1481478033 | i49)) | 33558596) * (-1976)) + (((~(currentTimeMillis58 | (-1376262853))) | 138773777 | (~(i49 | 1376262852))) * 988)) & ((int) j64))) != 0) {
                                                    java.lang.Object[] objArr159 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, null, new int[1]};
                                                    int currentTimeMillis59 = (int) java.lang.System.currentTimeMillis();
                                                    int i50 = ~((~currentTimeMillis59) | (-29401137));
                                                    java.lang.Object[] objArr160 = {-1884061761, 16, java.lang.Integer.valueOf((((~(65202227 | currentTimeMillis59)) | 738726656 | i50) * (-470)) + 18502863 + (((~(currentTimeMillis59 | 803928883)) | i50) * 470))};
                                                    java.lang.Object obj43 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj43 == null) {
                                                        java.lang.Class cls41 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 50, 2713 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) android.text.TextUtils.getOffsetAfter(str, 0));
                                                        java.lang.Object[] objArr161 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr161);
                                                        obj43 = cls41.getMethod((java.lang.String) objArr161[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj43);
                                                    }
                                                    ((int[]) objArr159[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj43).invoke(null, objArr160)).intValue();
                                                    return objArr159;
                                                }
                                                java.lang.Object obj44 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1293945309);
                                                if (obj44 == null) {
                                                    java.lang.Class cls42 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(44 - android.text.TextUtils.indexOf(str, str), 2836 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0));
                                                    byte b56 = $$a[14];
                                                    byte b57 = (byte) (b56 + 1);
                                                    java.lang.Object[] objArr162 = new java.lang.Object[1];
                                                    b(b57, b57, (byte) (-b56), objArr162);
                                                    obj44 = cls42.getMethod((java.lang.String) objArr162[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1293945309, obj44);
                                                }
                                                long longValue21 = ((java.lang.Long) ((java.lang.reflect.Method) obj44).invoke(null, null)).longValue();
                                                long currentTimeMillis60 = (int) java.lang.System.currentTimeMillis();
                                                long j65 = ~longValue21;
                                                long j66 = ((((((-661) * longValue21) - 276081172170L) + (((~(j65 | (-417671971))) | (~currentTimeMillis60)) * 1324)) + (((~(417671970 | currentTimeMillis60)) | (~(longValue21 | currentTimeMillis60))) * (-1324))) + (((~(417671970 | j65)) | (~(longValue21 | (-417671971)))) * 662)) - 1223966725;
                                                int i51 = (int) (j66 >> 32);
                                                int currentTimeMillis61 = (int) java.lang.System.currentTimeMillis();
                                                int i52 = ~currentTimeMillis61;
                                                int i53 = ~(1760534528 | i52);
                                                int i54 = (int) j66;
                                                int currentTimeMillis62 = (int) java.lang.System.currentTimeMillis();
                                                int i55 = ~currentTimeMillis62;
                                                if (((i51 & ((((~((-323308118) | i52)) | 4521984) * (-1188)) + 1060670658 + (((~(currentTimeMillis61 | 323308117)) | 4521984 | i53) * 594) + (((~(323308117 | i52)) | (-2079320662) | i53) * 594))) | (((((-134554179) | i55) * (-369)) + 802172634 + (((~(1216684902 | i55)) | (-220541508)) * (-369)) + (((~((-1216684903) | currentTimeMillis62)) | 1082130724 | (~((-85987330) | i55))) * 369)) & i54)) != 0) {
                                                    java.lang.Object[] objArr163 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    int currentTimeMillis63 = (int) java.lang.System.currentTimeMillis();
                                                    int i56 = ~currentTimeMillis63;
                                                    java.lang.Object[] objArr164 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-319116706) | i56)) | (~(390553007 | currentTimeMillis63))) * (-831)) + 1761325084 + ((~((-344194) | currentTimeMillis63)) * (-1662)) + (((~(currentTimeMillis63 | 390208814)) | (~(i56 | (-390208815))) | (~(319116705 | currentTimeMillis63))) * 831))};
                                                    java.lang.Object obj45 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj45 == null) {
                                                        java.lang.Class cls43 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.widget.ExpandableListView.getPackedPositionType(0L) + 50, 2713 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1));
                                                        java.lang.Object[] objArr165 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr165);
                                                        obj45 = cls43.getMethod((java.lang.String) objArr165[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj45);
                                                    }
                                                    ((int[]) objArr163[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj45).invoke(null, objArr164)).intValue();
                                                    return objArr163;
                                                }
                                                long[] jArr3 = {624887784092251L};
                                                java.lang.Object[] objArr166 = new java.lang.Object[1];
                                                c(386 - android.graphics.Color.blue(0), (char) (android.os.Process.myPid() >> 22), 17 - android.graphics.Color.blue(0), objArr166);
                                                java.lang.Object[] objArr167 = {((java.lang.String) objArr166[0]).intern(), 3, 2251799813685247L, jArr3};
                                                java.lang.Object obj46 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1441749806);
                                                if (obj46 == null) {
                                                    java.lang.Class cls44 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - android.view.MotionEvent.axisFromString(str), android.view.View.resolveSizeAndState(0, 0, 0) + 3096, (char) (android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1));
                                                    byte b58 = $$a[14];
                                                    byte b59 = (byte) (b58 + 1);
                                                    java.lang.Object[] objArr168 = new java.lang.Object[1];
                                                    b(b59, b59, (byte) (-b58), objArr168);
                                                    obj46 = cls44.getMethod((java.lang.String) objArr168[0], java.lang.String.class, java.lang.Integer.TYPE, java.lang.Long.TYPE, long[].class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1441749806, obj46);
                                                }
                                                long longValue22 = ((java.lang.Long) ((java.lang.reflect.Method) obj46).invoke(null, objArr167)).longValue();
                                                long j67 = ~(((int) java.lang.System.currentTimeMillis()) | longValue22);
                                                long j68 = (((((111 * longValue22) + 159179228010L) + ((1460359889 | j67) * (-220))) + ((j67 | (~((-1460359890) | longValue22))) * 220)) + (((~((~longValue22) | (-1460359890))) | (~(1460359889 | longValue22))) * 110)) - 450288020;
                                                int i57 = (int) (j68 >> 32);
                                                int i58 = ~(((int) java.lang.System.currentTimeMillis()) | (-381636755));
                                                int i59 = (int) j68;
                                                int currentTimeMillis64 = (int) java.lang.System.currentTimeMillis();
                                                if (((i57 & ((((-2130704064) | i58) * (-196)) + 1211248694 + ((i58 | 1749067309) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE))) | (((((~((-553657477) | currentTimeMillis64)) | 145293585) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING) + 575610300 + ((~((~currentTimeMillis64) | (-553657477))) * androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)) & i59)) != 0) {
                                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 35) % 128;
                                                    java.lang.Object[] objArr169 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, null, new int[1]};
                                                    int currentTimeMillis65 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr170 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-583742435) | currentTimeMillis65)) | (-671039472)) * (-502)) - 1222915267) + ((~((~currentTimeMillis65) | (-545456387))) * (-502)) + (((~(currentTimeMillis65 | (-125583086))) | (-583742435)) * 502))};
                                                    java.lang.Object obj47 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj47 == null) {
                                                        java.lang.Class cls45 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 49, android.widget.ExpandableListView.getPackedPositionChild(0L) + 2714, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                                        java.lang.Object[] objArr171 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr171);
                                                        obj47 = cls45.getMethod((java.lang.String) objArr171[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj47);
                                                    }
                                                    ((int[]) objArr169[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj47).invoke(null, objArr170)).intValue();
                                                    return objArr169;
                                                }
                                                java.lang.Object[] objArr172 = new java.lang.Object[1];
                                                c(415 - android.view.View.combineMeasuredStates(0, 0), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.MotionEvent.axisFromString(str) + 12, objArr172);
                                                java.lang.Object[] objArr173 = {((java.lang.String) objArr172[0]).intern()};
                                                java.lang.Object obj48 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(269015277);
                                                if (obj48 == null) {
                                                    java.lang.Class cls46 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getTrimmedLength(str) + 36, 3161 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (33099 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)));
                                                    byte b60 = $$a[14];
                                                    java.lang.Object[] objArr174 = new java.lang.Object[1];
                                                    b((byte) (-b60), (short) 612, (byte) (b60 + 1), objArr174);
                                                    obj48 = cls46.getMethod((java.lang.String) objArr174[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(269015277, obj48);
                                                }
                                                long longValue23 = ((java.lang.Long) ((java.lang.reflect.Method) obj48).invoke(null, objArr173)).longValue();
                                                int currentTimeMillis66 = (int) java.lang.System.currentTimeMillis();
                                                long j69 = ~longValue23;
                                                long j70 = (-507059641) | j69;
                                                long j71 = currentTimeMillis66;
                                                long j72 = ~j71;
                                                long j73 = (((-167) * longValue23) - 84678959880L) + (((~j70) | (~(j69 | j72))) * 168) + ((~(j70 | j71)) * 168) + (((~(j72 | (-507059641))) | (~(longValue23 | (-507059641))) | (~(507059640 | j69 | j71))) * 168) + 488375263;
                                                int i60 = ~((-1404458591) | ((int) java.lang.System.currentTimeMillis()));
                                                if (((((int) j73) & (((((~((-1464488440) | r2)) | (-1393252447)) * (-964)) - 1485206859) + (((~((~((int) java.lang.System.currentTimeMillis())) | (-1464488440))) | 71303585) * (-964)))) | (((int) (j73 >> 32)) & (((((~((~r4) | (-1404458591))) | 1375993874) * (-245)) - 1800951324) + (i60 * (-245)) + ((i60 | 32767820) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE)))) != 0) {
                                                    java.lang.Object[] objArr175 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    int currentTimeMillis67 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr176 = {-1884061761, 16, java.lang.Integer.valueOf(((((~(345353210 | currentTimeMillis67)) | (-363972310)) * (-465)) - 90011722) + (((~((-363972310) | currentTimeMillis67)) | 345353210) * 930) + ((currentTimeMillis67 | (-18891782)) * 465))};
                                                    java.lang.Object obj49 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj49 == null) {
                                                        java.lang.Class cls47 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), 2713 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
                                                        java.lang.Object[] objArr177 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr177);
                                                        obj49 = cls47.getMethod((java.lang.String) objArr177[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj49);
                                                    }
                                                    ((int[]) objArr175[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj49).invoke(null, objArr176)).intValue();
                                                    return objArr175;
                                                }
                                                java.lang.Object obj50 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(236031171);
                                                if (obj50 == null) {
                                                    java.lang.Class cls48 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), android.view.View.combineMeasuredStates(0, 0) + 2185, (char) (59513 - android.text.TextUtils.getOffsetAfter(str, 0)));
                                                    byte b61 = $$a[14];
                                                    byte b62 = (byte) (b61 + 1);
                                                    java.lang.Object[] objArr178 = new java.lang.Object[1];
                                                    b(b62, b62, (byte) (-b61), objArr178);
                                                    obj50 = cls48.getMethod((java.lang.String) objArr178[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(236031171, obj50);
                                                }
                                                long longValue24 = ((java.lang.Long) ((java.lang.reflect.Method) obj50).invoke(null, null)).longValue();
                                                long currentTimeMillis68 = (int) java.lang.System.currentTimeMillis();
                                                long j74 = ~((~currentTimeMillis68) | 479828498);
                                                long j75 = (((((339 * longValue24) + 161702204163L) + (((~(currentTimeMillis68 | (-479828499))) | ((~((~longValue24) | (-479828499))) | j74)) * (-338))) + ((~(longValue24 | 479828498)) * 338)) + (((~((longValue24 | (-479828499)) | currentTimeMillis68)) | j74) * 338)) - 392262087;
                                                int currentTimeMillis69 = (int) java.lang.System.currentTimeMillis();
                                                int i61 = ~currentTimeMillis69;
                                                int currentTimeMillis70 = (int) java.lang.System.currentTimeMillis();
                                                if (((((int) (j75 >> 32)) & (((((~(104539905 | i61)) | (-1541766317)) * (-865)) - 983480644) + ((~(currentTimeMillis69 | (-104539906))) * 865) + (((~((-1541766317) | i61)) | (~(i61 | (-104539906)))) * 865))) | (((((~((-18361497) | currentTimeMillis70)) | (~((~currentTimeMillis70) | (-1455587907)))) * (-318)) + 917793883 + (((~((-2126959460) | currentTimeMillis70)) | 671371553) * (-318)) + (((~(2126959459 | currentTimeMillis70)) | (-689733050)) * 318)) & ((int) j75))) != 0) {
                                                    java.lang.Object[] objArr179 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, null, new int[1]};
                                                    int i62 = ~((int) java.lang.System.currentTimeMillis());
                                                    java.lang.Object[] objArr180 = {-1884061761, 16, java.lang.Integer.valueOf((((~((-798797568) | i62)) | 713589456) * (-241)) + 1149986719 + (((~(i62 | (-85208112))) | (-803061504)) * 241))};
                                                    java.lang.Object obj51 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj51 == null) {
                                                        java.lang.Class cls49 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2712, (char) android.graphics.Color.alpha(0));
                                                        java.lang.Object[] objArr181 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr181);
                                                        obj51 = cls49.getMethod((java.lang.String) objArr181[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj51);
                                                    }
                                                    ((int[]) objArr179[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj51).invoke(null, objArr180)).intValue();
                                                    return objArr179;
                                                }
                                                java.lang.Object obj52 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1050293330);
                                                if (obj52 == null) {
                                                    java.lang.Class cls50 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2971, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16));
                                                    byte b63 = $$a[14];
                                                    byte b64 = (byte) (b63 + 1);
                                                    java.lang.Object[] objArr182 = new java.lang.Object[1];
                                                    b(b64, b64, (byte) (-b63), objArr182);
                                                    obj52 = cls50.getMethod((java.lang.String) objArr182[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1050293330, obj52);
                                                }
                                                long longValue25 = ((java.lang.Long) ((java.lang.reflect.Method) obj52).invoke(null, null)).longValue();
                                                int currentTimeMillis71 = (int) java.lang.System.currentTimeMillis();
                                                long j76 = ~longValue25;
                                                long j77 = ~((~currentTimeMillis71) | longValue25);
                                                long j78 = (((((971 * longValue25) + 1539849695090L) + (((~(j76 | (-794146310))) | j77) * (-970))) + ((~(longValue25 | 794146309)) * 1940)) + (((~(794146309 | j76)) | j77) * 970)) - 1058555454;
                                                int currentTimeMillis72 = (int) java.lang.System.currentTimeMillis();
                                                int currentTimeMillis73 = (int) java.lang.System.currentTimeMillis();
                                                if (((((int) (j78 >> 32)) & (((((~(1329210155 | currentTimeMillis72)) | (-108016256)) * (-465)) - 760554811) + (((~((-108016256) | currentTimeMillis72)) | 1329210155) * 930) + ((currentTimeMillis72 | (-4198485)) * 465))) | (((((~(296443141 | currentTimeMillis73)) | 1381344673) * 398) + 1073938893 + (((~((~currentTimeMillis73) | 296443141)) | 1381344673) * 398)) & ((int) j78))) != 0) {
                                                    java.lang.Object[] objArr183 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    int currentTimeMillis74 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr184 = {-1884061761, 16, java.lang.Integer.valueOf(((~((-604250115) | currentTimeMillis74)) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL) + 2075062216 + (((~((~currentTimeMillis74) | (-604250115))) | 3162253) * my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_SCRP_FAIL))};
                                                    java.lang.Object obj53 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj53 == null) {
                                                        java.lang.Class cls51 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.text.TextUtils.getCapsMode(str, 0, 0), (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 2713, (char) (android.view.ViewConfiguration.getTapTimeout() >> 16));
                                                        java.lang.Object[] objArr185 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr185);
                                                        obj53 = cls51.getMethod((java.lang.String) objArr185[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj53);
                                                    }
                                                    ((int[]) objArr183[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj53).invoke(null, objArr184)).intValue();
                                                    return objArr183;
                                                }
                                                java.lang.Object obj54 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1827153043);
                                                if (obj54 == null) {
                                                    java.lang.Class cls52 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(26 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2159 - android.view.KeyEvent.normalizeMetaState(0), (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 56399));
                                                    byte b65 = $$a[14];
                                                    byte b66 = (byte) (b65 + 1);
                                                    java.lang.Object[] objArr186 = new java.lang.Object[1];
                                                    b(b66, b66, (byte) (-b65), objArr186);
                                                    obj54 = cls52.getMethod((java.lang.String) objArr186[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1827153043, obj54);
                                                }
                                                long longValue26 = ((java.lang.Long) ((java.lang.reflect.Method) obj54).invoke(null, null)).longValue();
                                                long currentTimeMillis75 = (int) java.lang.System.currentTimeMillis();
                                                long j79 = ~currentTimeMillis75;
                                                long j80 = ~(1450321691 | longValue26);
                                                long j81 = (~longValue26) | (-1450321692);
                                                long j82 = (((((1435 * longValue26) - 1038430330756L) + ((longValue26 | (-1450321692)) * (-1434))) + (((~(j81 | currentTimeMillis75)) | ((~(j79 | longValue26)) | j80)) * 717)) + ((((~(j81 | j79)) | j80) | (~(longValue26 | currentTimeMillis75))) * 717)) - 2016139711;
                                                int currentTimeMillis76 = (int) java.lang.System.currentTimeMillis();
                                                int i63 = ~currentTimeMillis76;
                                                int i64 = ~(currentTimeMillis76 | (-277351529));
                                                int i65 = ~((int) java.lang.System.currentTimeMillis());
                                                if (((((int) (j82 >> 32)) & ((((((~((-1714582168) | i63)) | 1714577939) | i64) * (-252)) - 280829858) + ((i64 | (~(i63 | (-4229)))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE))) | (((((~(765082923 | i65)) | 672143486) * (-983)) + 984588112 + (((~(672143486 | i65)) | 92939521) * 983)) & ((int) j82))) != 0) {
                                                    RecordsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 107) % 128;
                                                    java.lang.Object[] objArr187 = {new int[]{0}, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE}, null, new int[1]};
                                                    int currentTimeMillis77 = (int) java.lang.System.currentTimeMillis();
                                                    java.lang.Object[] objArr188 = {-1884061761, 16, java.lang.Integer.valueOf(((((~((-289477624) | r4)) | 419847896) * 226) - 2135046800) + (((~((~currentTimeMillis77) | (-4260136))) | (~((-419847897) | currentTimeMillis77)) | 134630408) * (-113)) + ((~(currentTimeMillis77 | (-289477624))) * 113))};
                                                    java.lang.Object obj55 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj55 == null) {
                                                        java.lang.Class cls53 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.os.Process.getGidForName(str), (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2712, (char) (1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))));
                                                        java.lang.Object[] objArr189 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr189);
                                                        obj55 = cls53.getMethod((java.lang.String) objArr189[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj55);
                                                    }
                                                    ((int[]) objArr187[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj55).invoke(null, objArr188)).intValue();
                                                    return objArr187;
                                                }
                                                java.lang.Object obj56 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(887063382);
                                                if (obj56 == null) {
                                                    java.lang.Class cls54 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 34, android.graphics.Color.green(0) + 838, (char) ((-1) - ((byte) android.view.KeyEvent.getModifierMetaStateMask())));
                                                    byte b67 = $$a[14];
                                                    byte b68 = (byte) (b67 + 1);
                                                    java.lang.Object[] objArr190 = new java.lang.Object[1];
                                                    b(b68, b68, (byte) (-b67), objArr190);
                                                    obj56 = cls54.getMethod((java.lang.String) objArr190[0], null);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(887063382, obj56);
                                                }
                                                long longValue27 = ((java.lang.Long) ((java.lang.reflect.Method) obj56).invoke(null, null)).longValue();
                                                int currentTimeMillis78 = (int) java.lang.System.currentTimeMillis();
                                                long j83 = ~longValue27;
                                                long j84 = currentTimeMillis78;
                                                long j85 = ~j84;
                                                long j86 = (((-97) * longValue27) - 7427653550L) + (((~(j83 | (-148553071))) | (~(j83 | j85))) * 98) + (((~(148553070 | j85)) | j83 | (~((-148553071) | j84))) * (-49)) + (((~(j84 | j83)) | (~(longValue27 | (-148553071)))) * 49) + 2109305973;
                                                int currentTimeMillis79 = (int) java.lang.System.currentTimeMillis();
                                                int currentTimeMillis80 = (int) java.lang.System.currentTimeMillis();
                                                int i66 = ~currentTimeMillis80;
                                                int i67 = ((((int) j86) & (((((1210090500 | currentTimeMillis80) * 988) + 1934966129) + (((~((-113604980) | i66)) | 74049) * (-1976))) + ((((~(currentTimeMillis80 | 1323621430)) | 1210090500) | (~(i66 | (-1323621431)))) * 988))) | (((int) (j86 >> 32)) & ((((((~((-1975943226) | currentTimeMillis79)) | 1438810161) * 1504) + (-1320242614)) + ((~(currentTimeMillis79 | (-537133065))) * (-1504))) - 844463232))) != 0 ? com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BANK_VALUE : 0;
                                                if (i67 != 0) {
                                                    java.lang.Object[] objArr191 = {new int[]{0}, new int[]{i67}, null, new int[1]};
                                                    java.lang.Object[] objArr192 = {-1884061761, 16, java.lang.Integer.valueOf((((((~((-949844326) | r1)) | 240518805) * (-933)) - 1078402922) + (((~((~((int) java.lang.System.currentTimeMillis())) | 240518805)) | (-1054834678)) * 933)) - 828249392)};
                                                    java.lang.Object obj57 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj57 == null) {
                                                        java.lang.Class cls55 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0, 0) + 50, 2712 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16));
                                                        java.lang.Object[] objArr193 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr193);
                                                        obj57 = cls55.getMethod((java.lang.String) objArr193[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj57);
                                                    }
                                                    ((int[]) objArr191[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj57).invoke(null, objArr192)).intValue();
                                                    java.lang.Object[] objArr194 = {objArr191};
                                                    java.lang.Object obj58 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(712501173);
                                                    if (obj58 == null) {
                                                        java.lang.Class cls56 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - android.view.View.MeasureSpec.getMode(0), 3237 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                                                        java.lang.Object[] objArr195 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr195);
                                                        obj58 = cls56.getMethod((java.lang.String) objArr195[0], java.lang.Object[].class);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(712501173, obj58);
                                                    }
                                                    ((java.lang.reflect.Method) obj58).invoke(obj, objArr194);
                                                    return objArr191;
                                                }
                                                java.lang.Object[] objArr196 = {0, obj, -1884061761, 0};
                                                java.lang.Object obj59 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(97317038);
                                                if (obj59 == null) {
                                                    obj59 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.getCapsMode(str, 0, 0) + 30, android.graphics.Color.argb(0, 0, 0, 0) + 3289, (char) android.text.TextUtils.indexOf(str, str, 0, 0))).getDeclaredConstructor(java.lang.Integer.TYPE, (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(52 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 3238 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.graphics.Color.argb(0, 0, 0, 0)), java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(97317038, obj59);
                                                }
                                                java.lang.Object newInstance = ((java.lang.reflect.Constructor) obj59).newInstance(objArr196);
                                                try {
                                                    java.lang.Object[] objArr197 = new java.lang.Object[1];
                                                    c(426 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (char) (21272 - android.view.KeyEvent.normalizeMetaState(0)), 16 - (android.os.Process.myPid() >> 22), objArr197);
                                                    java.lang.Class<?> cls57 = java.lang.Class.forName(((java.lang.String) objArr197[0]).intern());
                                                    java.lang.Object[] objArr198 = new java.lang.Object[1];
                                                    c(442 - android.view.View.MeasureSpec.getMode(0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 5 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr198);
                                                    cls57.getMethod(((java.lang.String) objArr198[0]).intern(), null).invoke(newInstance, null);
                                                    java.lang.Object[] objArr199 = {new int[]{0}, new int[]{0}, null, new int[1]};
                                                    int currentTimeMillis81 = (int) java.lang.System.currentTimeMillis();
                                                    int i68 = ~currentTimeMillis81;
                                                    java.lang.Object[] objArr200 = {-1884061761, 0, java.lang.Integer.valueOf((((~((-308232663) | i68)) | 306708688) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + 1801722615 + ((~((-306708689) | currentTimeMillis81)) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE) + (((~(currentTimeMillis81 | (-1523975))) | (~(i68 | (-401092858))) | 94384169) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE))};
                                                    java.lang.Object obj60 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                    if (obj60 == null) {
                                                        java.lang.Class cls58 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - android.widget.ExpandableListView.getPackedPositionGroup(0L), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2713, (char) android.view.View.getDefaultSize(0, 0));
                                                        java.lang.Object[] objArr201 = new java.lang.Object[1];
                                                        b(r4[16], (short) 653, (byte) (-$$a[14]), objArr201);
                                                        obj60 = cls58.getMethod((java.lang.String) objArr201[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj60);
                                                    }
                                                    ((int[]) objArr199[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj60).invoke(null, objArr200)).intValue();
                                                    return objArr199;
                                                } catch (java.lang.Throwable th2) {
                                                    java.lang.Throwable cause2 = th2.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        } catch (java.lang.Throwable th3) {
                                            java.lang.Throwable cause3 = th3.getCause();
                                            if (cause3 != null) {
                                                throw cause3;
                                            }
                                            throw th3;
                                        }
                                    }
                                    java.lang.Object[] objArr202 = {((java.lang.String) objArr[0]).intern()};
                                    java.lang.Object obj61 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                    if (obj61 == null) {
                                        java.lang.Class cls59 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(40 - android.graphics.Color.alpha(0), (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1920, (char) android.text.TextUtils.getTrimmedLength(str));
                                        byte b69 = $$a[14];
                                        byte b70 = (byte) (b69 + 1);
                                        java.lang.Object[] objArr203 = new java.lang.Object[1];
                                        b(b70, b70, (byte) (-b69), objArr203);
                                        obj61 = cls59.getMethod((java.lang.String) objArr203[0], java.lang.String.class);
                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj61);
                                    }
                                    java.lang.Object invoke8 = ((java.lang.reflect.Method) obj61).invoke(null, objArr202);
                                    if (invoke8 != null) {
                                        java.lang.Object[] objArr204 = new java.lang.Object[1];
                                        c(266 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) android.view.View.MeasureSpec.getSize(0), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, objArr204);
                                        if (invoke8.equals(((java.lang.String) objArr204[0]).intern())) {
                                            java.lang.Object[] objArr205 = new java.lang.Object[1];
                                            a("\u0000\u0000\u0000\u0000", "ꃓᇦᬌ횘⋴쭫⎪䅨㏑ݐ猳奱ⓧﮜ궍確닜弦蝍ዪ桇㷅\ud90e", "ď꣰\u19dd檱", (-576131072) - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), objArr205);
                                            try {
                                                java.lang.Object[] objArr206 = {((java.lang.String) objArr205[0]).intern()};
                                                java.lang.Object obj62 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                                if (obj62 == null) {
                                                    java.lang.Class cls60 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 41, android.graphics.Color.rgb(0, 0, 0) + 16779137, (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)));
                                                    byte b71 = $$a[14];
                                                    byte b72 = (byte) (b71 + 1);
                                                    java.lang.Object[] objArr207 = new java.lang.Object[1];
                                                    b(b72, b72, (byte) (-b71), objArr207);
                                                    obj62 = cls60.getMethod((java.lang.String) objArr207[0], java.lang.String.class);
                                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj62);
                                                }
                                                java.lang.String str4 = (java.lang.String) ((java.lang.reflect.Method) obj62).invoke(null, objArr206);
                                                if (str4 != null && (parseInt = java.lang.Integer.parseInt(str4)) != 0) {
                                                    i3 = parseInt + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE;
                                                    if (i3 != 0) {
                                                    }
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        }
                                    }
                                    i3 = 0;
                                    if (i3 != 0) {
                                    }
                                } catch (java.lang.Throwable th5) {
                                    java.lang.Throwable cause5 = th5.getCause();
                                    if (cause5 != null) {
                                        throw cause5;
                                    }
                                    throw th5;
                                }
                                objArr = new java.lang.Object[1];
                                a("\u0000\u0000\u0000\u0000", "\uf35b驕碏搧옯뼜虑灱掼降Ț戞毧컬툷\udb63\uf2ab\udd74", "㍺㫶ẩ쾐", android.os.Process.myTid() >> 22, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 36894), objArr);
                            } else {
                                java.lang.Object[] objArr208 = new java.lang.Object[1];
                                c(51 - android.view.View.resolveSize(0, 0), (char) (android.view.KeyEvent.getDeadChar(0, 0) + 2883), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 13, objArr208);
                                java.lang.Object[] objArr209 = {((java.lang.String) objArr208[0]).intern()};
                                java.lang.Object obj63 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                                if (obj63 == null) {
                                    java.lang.Class cls61 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 39, 1922 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                    byte b73 = $$a[14];
                                    byte b74 = (byte) (b73 + 1);
                                    java.lang.Object[] objArr210 = new java.lang.Object[1];
                                    b(b74, b74, (byte) (-b73), objArr210);
                                    obj63 = cls61.getMethod((java.lang.String) objArr210[0], java.lang.String.class);
                                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(609763459, obj63);
                                }
                                java.lang.Object invoke9 = ((java.lang.reflect.Method) obj63).invoke(null, objArr209);
                                i5 = 0;
                                i6 = 1;
                                java.lang.Object[] objArr211 = new java.lang.Object[1];
                                c(64 - android.graphics.Color.green(0), (char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr211);
                            }
                        }
                    } else {
                        obj7 = invoke4;
                        str2 = "";
                    }
                    if (invoke5 != null) {
                        java.lang.Object[] objArr212 = {invoke5, 42};
                        java.lang.Object obj64 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj64 == null) {
                            str = str2;
                            java.lang.Class cls62 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2594 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.text.TextUtils.indexOf(str, str, 0, 0));
                            byte b75 = $$a[14];
                            byte b76 = (byte) (b75 + 1);
                            java.lang.Object[] objArr213 = new java.lang.Object[1];
                            b(b76, b76, (byte) (-b75), objArr213);
                            obj64 = cls62.getMethod((java.lang.String) objArr213[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj64);
                        } else {
                            str = str2;
                        }
                        long longValue28 = ((java.lang.Long) ((java.lang.reflect.Method) obj64).invoke(null, objArr212)).longValue();
                        long currentTimeMillis82 = (int) java.lang.System.currentTimeMillis();
                        long j87 = ~currentTimeMillis82;
                        long j88 = ~longValue28;
                        long j89 = ((-163) * longValue28) + 67923635175L + (((~(j87 | longValue28)) | 411658395) * (-328)) + ((411658395 | currentTimeMillis82) * 164) + (((~(j87 | 411658395 | longValue28)) | (~(j88 | currentTimeMillis82)) | (~((-411658396) | j88))) * 164) + 845442129;
                        int currentTimeMillis83 = (int) java.lang.System.currentTimeMillis();
                        int currentTimeMillis84 = (int) java.lang.System.currentTimeMillis();
                        int i69 = ~currentTimeMillis84;
                    } else {
                        str = str2;
                    }
                    if (obj7 != null) {
                        java.lang.Object[] objArr214 = {obj7, 42};
                        java.lang.Object obj65 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                        if (obj65 == null) {
                            java.lang.Class cls63 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(28 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 2594 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (char) android.text.TextUtils.getOffsetAfter(str, 0));
                            byte b77 = $$a[14];
                            byte b78 = (byte) (b77 + 1);
                            java.lang.Object[] objArr215 = new java.lang.Object[1];
                            b(b78, b78, (byte) (-b77), objArr215);
                            obj65 = cls63.getMethod((java.lang.String) objArr215[0], java.lang.String.class, java.lang.Integer.TYPE);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj65);
                        }
                        long longValue29 = ((java.lang.Long) ((java.lang.reflect.Method) obj65).invoke(null, objArr214)).longValue();
                        long currentTimeMillis85 = (int) java.lang.System.currentTimeMillis();
                        long j90 = ~longValue29;
                        long j91 = (((-661) * longValue29) - 29579165676L) + (((~currentTimeMillis85) | (~(j90 | (-44749117)))) * 1324) + (((~(44749116 | currentTimeMillis85)) | (~(currentTimeMillis85 | longValue29))) * (-1324)) + (((~((-44749117) | longValue29)) | (~(44749116 | j90))) * 662) + 1212351408;
                        int currentTimeMillis86 = (int) java.lang.System.currentTimeMillis();
                        int i70 = ~currentTimeMillis86;
                        int i71 = ~(612821023 | currentTimeMillis86);
                        int currentTimeMillis87 = (int) java.lang.System.currentTimeMillis();
                        int i72 = ~currentTimeMillis87;
                    }
                    if (invoke5 != null) {
                        int i73 = SdkCoreAlternateContactlessPaymentDataImpl + 55;
                        RecordsJson = i73 % 128;
                        if (i73 % 2 == 0) {
                            java.lang.Object[] objArr216 = {invoke5, 27};
                            java.lang.Object obj66 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj66 == null) {
                                java.lang.Class cls64 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf(str, str, 0) + 28, 2594 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 1));
                                byte b79 = $$a[14];
                                byte b80 = (byte) (b79 + 1);
                                java.lang.Object[] objArr217 = new java.lang.Object[1];
                                b(b80, b80, (byte) (-b79), objArr217);
                                obj66 = cls64.getMethod((java.lang.String) objArr217[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj66);
                            }
                            long longValue30 = ((java.lang.Long) ((java.lang.reflect.Method) obj66).invoke(null, objArr216)).longValue();
                            int currentTimeMillis88 = (int) java.lang.System.currentTimeMillis();
                            long j92 = ~(565345273 | (~longValue30));
                            long j93 = (-565345274) | longValue30;
                            long j94 = currentTimeMillis88;
                            long j95 = (longValue30 * (-755)) + 426835681870L + (1512 * j92) + ((j92 | (~(j93 | j94))) * (-756)) + (((~j94) | j93) * 756) + 1822445798;
                            int currentTimeMillis89 = (int) java.lang.System.currentTimeMillis();
                            int currentTimeMillis90 = (int) java.lang.System.currentTimeMillis();
                        } else {
                            java.lang.Object[] objArr218 = {invoke5, 42};
                            java.lang.Object obj67 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1118958177);
                            if (obj67 == null) {
                                java.lang.Class cls65 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 29, 2594 - android.text.TextUtils.getOffsetAfter(str, 0), (char) android.text.TextUtils.indexOf(str, str, 0));
                                byte b81 = $$a[14];
                                byte b82 = (byte) (b81 + 1);
                                java.lang.Object[] objArr219 = new java.lang.Object[1];
                                b(b82, b82, (byte) (-b81), objArr219);
                                obj67 = cls65.getMethod((java.lang.String) objArr219[0], java.lang.String.class, java.lang.Integer.TYPE);
                                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1118958177, obj67);
                            }
                            long longValue31 = ((java.lang.Long) ((java.lang.reflect.Method) obj67).invoke(null, objArr218)).longValue();
                            long currentTimeMillis91 = (int) java.lang.System.currentTimeMillis();
                            long j96 = ~currentTimeMillis91;
                            long j97 = ~((~longValue31) | 332299173);
                            long j98 = ((-107) * longValue31) + 18276454515L + (((~(longValue31 | j96)) | (~(longValue31 | (-332299174)))) * (-108)) + (((~(332299173 | j96)) | (~((-332299174) | currentTimeMillis91)) | j97) * 54) + ((currentTimeMillis91 | j97) * 54) + 924801351;
                            int currentTimeMillis92 = (int) java.lang.System.currentTimeMillis();
                            int currentTimeMillis93 = (int) java.lang.System.currentTimeMillis();
                            int i74 = ~currentTimeMillis93;
                        }
                    }
                    java.lang.Object[] objArr272 = new java.lang.Object[1];
                    c(android.view.View.MeasureSpec.getSize(0) + 65, (char) android.graphics.Color.red(0), 8 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr272);
                    java.lang.String intern210 = ((java.lang.String) objArr272[0]).intern();
                    java.lang.Object[] objArr282 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\ue2ab쮗\uf4be伪跭\u0de5", "ܣ툍猹\udd68", (android.os.Process.getThreadPriority(0) + 20) >> 6, (char) (26739 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr282);
                    java.lang.String intern310 = ((java.lang.String) objArr282[0]).intern();
                    java.lang.Object[] objArr292 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "ሲᣒ愈\ue0dd\ud9e2䞻읍", "ᇀ᳸挍㬗", android.graphics.Color.red(0) + 220002321, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr292);
                    java.lang.String intern47 = ((java.lang.String) objArr292[0]).intern();
                    java.lang.Object[] objArr302 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\ue996殺緯\ue3f0굤虨쎍\uec43ŧ", "抄啿揄퓩", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1001029791, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr302);
                    java.lang.String intern52 = ((java.lang.String) objArr302[0]).intern();
                    java.lang.Object[] objArr312 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "㣉塕∞ཥ䙢\ue6e8", "耗沯❄踢", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (8743 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr312);
                    java.lang.String intern62 = ((java.lang.String) objArr312[0]).intern();
                    java.lang.Object[] objArr322 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\ue9da쿷\uf289囔ᣡ媊\uf269⩕烐煢㼪븷ᘷ", "Ď\ue778슘ⴕ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1729660927, (char) (5570 - android.text.TextUtils.indexOf(str, str)), objArr322);
                    java.lang.String intern72 = ((java.lang.String) objArr322[0]).intern();
                    java.lang.Object[] objArr332 = new java.lang.Object[1];
                    c(72 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr332);
                    java.lang.String intern82 = ((java.lang.String) objArr332[0]).intern();
                    java.lang.Object[] objArr342 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "顃釋㽫兹潽\udbfc", "ꨋ쒪凌⌞", android.os.Process.myPid() >> 22, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7929), objArr342);
                    java.lang.String intern92 = ((java.lang.String) objArr342[0]).intern();
                    java.lang.Object[] objArr352 = new java.lang.Object[1];
                    c(78 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2 - android.view.View.MeasureSpec.getMode(0), objArr352);
                    java.lang.String intern102 = ((java.lang.String) objArr352[0]).intern();
                    java.lang.Object[] objArr362 = new java.lang.Object[1];
                    c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 80, (char) android.graphics.Color.green(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 16, objArr362);
                    java.lang.String intern112 = ((java.lang.String) objArr362[0]).intern();
                    java.lang.Object[] objArr372 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "䣹鞐⮙钗韬ꀝ\ueed9\uf828\u09d1噒", "桔ﱑ੩궆", android.text.TextUtils.getOffsetBefore(str, 0), (char) ((-1) - android.os.Process.getGidForName(str)), objArr372);
                    java.lang.String intern122 = ((java.lang.String) objArr372[0]).intern();
                    java.lang.Object[] objArr382 = new java.lang.Object[1];
                    c(96 - android.text.TextUtils.indexOf(str, str), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 8, objArr382);
                    java.lang.String intern132 = ((java.lang.String) objArr382[0]).intern();
                    java.lang.Object[] objArr392 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "⡲䋪篐ᷙ\ufaff\uf463爥ᖛ姘ᙣ脮쳲", "奸峧\uecd9ꃹ", android.text.TextUtils.getTrimmedLength(str), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr392);
                    java.lang.String intern142 = ((java.lang.String) objArr392[0]).intern();
                    java.lang.Object[] objArr402 = new java.lang.Object[1];
                    c(103 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 23374), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, objArr402);
                    java.lang.String intern152 = ((java.lang.String) objArr402[0]).intern();
                    java.lang.Object[] objArr412 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "մ䳣홭˒햱\ufbcbꜬ", "购敪ೋ\ue7fb", (-882546034) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.getCapsMode(str, 0, 0), objArr412);
                    java.lang.String intern162 = ((java.lang.String) objArr412[0]).intern();
                    java.lang.Object[] objArr422 = new java.lang.Object[1];
                    c(android.widget.ExpandableListView.getPackedPositionType(0L) + 118, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr422);
                    java.lang.String intern172 = ((java.lang.String) objArr422[0]).intern();
                    java.lang.Object[] objArr432 = new java.lang.Object[1];
                    c(125 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.getOffsetBefore(str, 0) + 7, objArr432);
                    java.lang.String intern182 = ((java.lang.String) objArr432[0]).intern();
                    java.lang.Object[] objArr442 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "茵㗦", "䮟停ퟎ焺", android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15062), objArr442);
                    java.lang.String intern192 = ((java.lang.String) objArr442[0]).intern();
                    java.lang.Object[] objArr452 = new java.lang.Object[1];
                    c(132 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (6561 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, objArr452);
                    java.lang.String intern202 = ((java.lang.String) objArr452[0]).intern();
                    java.lang.Object[] objArr462 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "虮ⅇ皔鴇⩩钯", "圌刷唐㾖", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38485), objArr462);
                    java.lang.String intern212 = ((java.lang.String) objArr462[0]).intern();
                    java.lang.Object[] objArr472 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\udcb1铿", "鞝ᤳ䘥\ude7e", android.graphics.Color.blue(0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32326), objArr472);
                    java.lang.String intern222 = ((java.lang.String) objArr472[0]).intern();
                    java.lang.Object[] objArr482 = new java.lang.Object[1];
                    c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 152, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr482);
                    java.lang.String intern232 = ((java.lang.String) objArr482[0]).intern();
                    java.lang.Object[] objArr492 = new java.lang.Object[1];
                    c((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 9, objArr492);
                    java.lang.String intern242 = ((java.lang.String) objArr492[0]).intern();
                    java.lang.Object[] objArr502 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "롕뻽ײַ蜓練\ue8a1ƻ\u0ef0뼪ꖏ", "⢪쮗宎ܥ", android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr502);
                    java.lang.String intern252 = ((java.lang.String) objArr502[0]).intern();
                    java.lang.Object[] objArr512 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\uf1e9댃톾龶楻ꋏ㬐즐\uf87e恗\u0de5", "䬐䟮磇⇅", (-951587253) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.View.resolveSize(0, 0), objArr512);
                    java.lang.String intern262 = ((java.lang.String) objArr512[0]).intern();
                    java.lang.Object[] objArr522 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "ﮨ龺隙뎑스ᠠ먪㧚㲒ꜣ죳", "㑮쪄魦孕", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1724548148, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr522);
                    java.lang.String intern272 = ((java.lang.String) objArr522[0]).intern();
                    java.lang.Object[] objArr532 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "㍒\uf28e霙螚狂樗룶䂖絲轓渥鐮ᘻ鴧ᆧ", "窕㷬숥왗", 624815226 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 22466), objArr532);
                    java.lang.String intern282 = ((java.lang.String) objArr532[0]).intern();
                    java.lang.Object[] objArr542 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "볉쯘\ue19a\uf33a\uefac䠮\uec15֯쨬몑⬁枩岲ᖧ", "㋇\u18fcᄅ䪸", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (47121 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr542);
                    java.lang.String[] strArr5 = {intern210, intern310, intern47, intern52, intern62, intern72, intern82, intern92, intern102, intern112, intern122, intern132, intern142, intern152, intern162, intern172, intern182, intern192, intern202, intern212, intern222, intern232, intern242, intern252, intern262, intern272, intern282, ((java.lang.String) objArr542[0]).intern()};
                    java.lang.Object[] objArr552 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "ܗ歯兩휻✄㴐ꩲ\ue3b7惆䃑瑜", "䠳ᄒ廦窞", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 435088825, (char) android.text.TextUtils.getTrimmedLength(str), objArr552);
                    java.lang.Object[] objArr562 = {((java.lang.String) objArr552[0]).intern()};
                    obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
                    if (obj2 == null) {
                    }
                    invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr562);
                    if (invoke != null) {
                    }
                    java.lang.Object[] objArr722 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", android.view.View.resolveSize(0, 0) - 637855546, (char) android.graphics.Color.blue(0), objArr722);
                    java.lang.Object[] objArr732 = {((java.lang.String) objArr722[0]).intern()};
                    obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj3 == null) {
                    }
                    long longValue82 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr732)).longValue();
                    long currentTimeMillis212 = (int) java.lang.System.currentTimeMillis();
                    long j242 = ~currentTimeMillis212;
                    long j252 = ~longValue82;
                    long j262 = (((-756) * longValue82) - 283252960152L) + ((j242 | (-373684644)) * (-757)) + ((~(j252 | (-373684644) | currentTimeMillis212)) * 1514) + (((~(longValue82 | (-373684644) | currentTimeMillis212)) | (~(j252 | j242)) | (~(373684643 | j252))) * 757) + 1664224711;
                    int currentTimeMillis222 = (int) java.lang.System.currentTimeMillis();
                    int i212 = ~currentTimeMillis222;
                    int currentTimeMillis232 = (int) java.lang.System.currentTimeMillis();
                    int i222 = ~currentTimeMillis232;
                    j = (((int) j262) & ((((~(1000722173 | currentTimeMillis232)) | (~((-18876482) | i222))) * 497) + 757014578 + (((~(currentTimeMillis232 | (-18876482))) | (~(455380717 | i222)) | 545341456) * 497))) | (((int) (j262 >> 32)) & ((((~(45771374 | i212)) | (-1482997786)) * (-865)) + 1901830178 + ((~(currentTimeMillis222 | (-45771375))) * 865) + (((~((-1482997786) | i212)) | (~(i212 | (-45771375)))) * 865)));
                    java.lang.Object[] objArr752 = new java.lang.Object[1];
                    c(189 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.blue(0), 17 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr752);
                    java.lang.Object[] objArr762 = {((java.lang.String) objArr752[0]).intern()};
                    obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj4 == null) {
                    }
                    long longValue92 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr762)).longValue();
                    long currentTimeMillis242 = (int) java.lang.System.currentTimeMillis();
                    long j272 = ~((~currentTimeMillis242) | (-85136923));
                    long j282 = ((339 * longValue92) - 28691142714L) + (((~((~longValue92) | 85136922)) | j272 | (~(currentTimeMillis242 | 85136922))) * (-338)) + ((~((-85136923) | longValue92)) * 338) + (((~(85136922 | longValue92 | currentTimeMillis242)) | j272) * 338) + 1205403145;
                    int i232 = ~((int) java.lang.System.currentTimeMillis());
                    int currentTimeMillis252 = (int) java.lang.System.currentTimeMillis();
                    int i242 = ~currentTimeMillis252;
                    long j292 = (((int) (j282 >> 32)) & (((((~(1118487812 | i232)) | (-1739253077)) * (-241)) - 1110938399) + (((~(i232 | (-620765265))) | 4) * 241))) | (((((-1451095723) | currentTimeMillis252) * 614) + 41425219 + (((~((-552194434) | i242)) | 545259777 | (~((-1989420844) | i242))) * (-1228)) + (((~((-1444161067) | i242)) | (~(i242 | (-6934657)))) * 614)) & ((int) j282));
                    if (j <= 0) {
                    }
                    java.lang.Object[] objArr812 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", (-637855545) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr812);
                    java.lang.Object[] objArr822 = {((java.lang.String) objArr812[0]).intern()};
                    obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj5 == null) {
                    }
                    long longValue102 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr822)).longValue();
                    long j302 = ~((int) java.lang.System.currentTimeMillis());
                    long j312 = ((-159) * longValue102) + 135972659958L + ((longValue102 | 855173961) * 160) + (((~(longValue102 | (-855173962))) | (~(j302 | (-855173962)))) * (-160)) + (((~((~longValue102) | j302)) | (-855173962)) * 160) + 2145714029;
                    int currentTimeMillis272 = (int) java.lang.System.currentTimeMillis();
                    int currentTimeMillis282 = (int) java.lang.System.currentTimeMillis();
                    j2 = (((int) (j312 >> 32)) & ((((~((-1706593274) | currentTimeMillis272)) | (-1974910392)) * 398) + 1097477276 + (((~((~currentTimeMillis272) | (-1706593274))) | (-1974910392)) * 398))) | (((((~((-374457680) | currentTimeMillis282)) | 1062768730) * (-668)) + 1881936201 + (((~(1062768730 | currentTimeMillis282)) | (-374457680)) * 1336) + ((currentTimeMillis282 | (-83206)) * 668)) & ((int) j312));
                    java.lang.Object[] objArr842 = new java.lang.Object[1];
                    c(205 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (27352 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr842);
                    java.lang.Object[] objArr852 = {((java.lang.String) objArr842[0]).intern()};
                    obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
                    if (obj6 == null) {
                    }
                    long longValue112 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr852)).longValue();
                    long currentTimeMillis292 = (int) java.lang.System.currentTimeMillis();
                    long j322 = (((-301) * longValue112) - 178358073924L) + (((~(longValue112 | (-588640508) | currentTimeMillis292)) | (~((~currentTimeMillis292) | 588640507 | longValue112))) * (-302)) + ((~(588640507 | longValue112 | currentTimeMillis292)) * (-604)) + (((~((~longValue112) | (-588640508))) | (~(longValue112 | currentTimeMillis292))) * 302) + 1879180575;
                    int currentTimeMillis302 = (int) java.lang.System.currentTimeMillis();
                    int currentTimeMillis312 = (int) java.lang.System.currentTimeMillis();
                    int i252 = ~currentTimeMillis312;
                    long j332 = (((int) (j322 >> 32)) & (((((~((-675545266) | currentTimeMillis302)) | (~((~currentTimeMillis302) | 761681145))) * (-318)) - 1322998726) + (((~(675681529 | currentTimeMillis302)) | 85999616) * (-318)) + (((~(currentTimeMillis302 | (-675681530))) | (-761544882)) * 318))) | (((((~(1576638815 | i252)) | (-139412406)) * (-865)) + 237151840 + ((~(currentTimeMillis312 | (-1576638816))) * 865) + (((~((-139412406) | i252)) | (~(i252 | (-1576638816)))) * 865)) & ((int) j322));
                    if (j2 <= 0) {
                    }
                    java.lang.Object[] objArr902 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "\uea9a〉䃲̈\udb00\ua634\uf1ae", "ꜱᩅ캳馷", (-1290123865) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr902);
                    java.lang.String intern302 = ((java.lang.String) objArr902[0]).intern();
                    java.lang.Object[] objArr912 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "朱裠ꦄ⹀뮒랜\u135b╳ꡒ嫉\ude8a", "\uf349\ued86\udd39ʅ", 971867890 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr912);
                    java.lang.String intern312 = ((java.lang.String) objArr912[0]).intern();
                    java.lang.Object[] objArr922 = new java.lang.Object[1];
                    c(android.text.TextUtils.getOffsetBefore(str, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 12 - android.text.TextUtils.getCapsMode(str, 0, 0), objArr922);
                    java.lang.String intern322 = ((java.lang.String) objArr922[0]).intern();
                    java.lang.Object[] objArr932 = new java.lang.Object[1];
                    a("\u0000\u0000\u0000\u0000", "尾銇⟷뚡쨲絅뽉ݞɛ뙤⇲汦", "ꚤ愡洏ꏀ", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr932);
                    java.lang.String intern332 = ((java.lang.String) objArr932[0]).intern();
                    java.lang.Object[] objArr942 = new java.lang.Object[1];
                    c(223 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0), android.view.View.getDefaultSize(0, 0) + 11, objArr942);
                    java.lang.String intern342 = ((java.lang.String) objArr942[0]).intern();
                    java.lang.Object[] objArr952 = new java.lang.Object[1];
                    c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, objArr952);
                    java.lang.String intern352 = ((java.lang.String) objArr952[0]).intern();
                    java.lang.Object[] objArr962 = new java.lang.Object[1];
                    c(237 - android.view.MotionEvent.axisFromString(str), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 4 - android.text.TextUtils.indexOf(str, str, 0), objArr962);
                    java.lang.String[] strArr22 = {intern302, intern312, intern322, intern332, intern342, intern352, ((java.lang.String) objArr962[0]).intern()};
                    i = 0;
                    while (true) {
                        if (i >= 7) {
                        }
                        i++;
                    }
                    if (i2 != 0) {
                    }
                }
            }
            str = "";
            java.lang.Object[] objArr2722 = new java.lang.Object[1];
            c(android.view.View.MeasureSpec.getSize(0) + 65, (char) android.graphics.Color.red(0), 8 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr2722);
            java.lang.String intern2102 = ((java.lang.String) objArr2722[0]).intern();
            java.lang.Object[] objArr2822 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue2ab쮗\uf4be伪跭\u0de5", "ܣ툍猹\udd68", (android.os.Process.getThreadPriority(0) + 20) >> 6, (char) (26739 - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2822);
            java.lang.String intern3102 = ((java.lang.String) objArr2822[0]).intern();
            java.lang.Object[] objArr2922 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ሲᣒ愈\ue0dd\ud9e2䞻읍", "ᇀ᳸挍㬗", android.graphics.Color.red(0) + 220002321, (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2922);
            java.lang.String intern472 = ((java.lang.String) objArr2922[0]).intern();
            java.lang.Object[] objArr3022 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue996殺緯\ue3f0굤虨쎍\uec43ŧ", "抄啿揄퓩", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1001029791, (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr3022);
            java.lang.String intern522 = ((java.lang.String) objArr3022[0]).intern();
            java.lang.Object[] objArr3122 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㣉塕∞ཥ䙢\ue6e8", "耗沯❄踢", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (8743 - android.view.View.resolveSizeAndState(0, 0, 0)), objArr3122);
            java.lang.String intern622 = ((java.lang.String) objArr3122[0]).intern();
            java.lang.Object[] objArr3222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\ue9da쿷\uf289囔ᣡ媊\uf269⩕烐煢㼪븷ᘷ", "Ď\ue778슘ⴕ", (android.view.ViewConfiguration.getScrollBarSize() >> 8) - 1729660927, (char) (5570 - android.text.TextUtils.indexOf(str, str)), objArr3222);
            java.lang.String intern722 = ((java.lang.String) objArr3222[0]).intern();
            java.lang.Object[] objArr3322 = new java.lang.Object[1];
            c(72 - android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 5 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr3322);
            java.lang.String intern822 = ((java.lang.String) objArr3322[0]).intern();
            java.lang.Object[] objArr3422 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "顃釋㽫兹潽\udbfc", "ꨋ쒪凌⌞", android.os.Process.myPid() >> 22, (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7929), objArr3422);
            java.lang.String intern922 = ((java.lang.String) objArr3422[0]).intern();
            java.lang.Object[] objArr3522 = new java.lang.Object[1];
            c(78 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2 - android.view.View.MeasureSpec.getMode(0), objArr3522);
            java.lang.String intern1022 = ((java.lang.String) objArr3522[0]).intern();
            java.lang.Object[] objArr3622 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 80, (char) android.graphics.Color.green(0), android.widget.ExpandableListView.getPackedPositionType(0L) + 16, objArr3622);
            java.lang.String intern1122 = ((java.lang.String) objArr3622[0]).intern();
            java.lang.Object[] objArr3722 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "䣹鞐⮙钗韬ꀝ\ueed9\uf828\u09d1噒", "桔ﱑ੩궆", android.text.TextUtils.getOffsetBefore(str, 0), (char) ((-1) - android.os.Process.getGidForName(str)), objArr3722);
            java.lang.String intern1222 = ((java.lang.String) objArr3722[0]).intern();
            java.lang.Object[] objArr3822 = new java.lang.Object[1];
            c(96 - android.text.TextUtils.indexOf(str, str), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.View.combineMeasuredStates(0, 0) + 8, objArr3822);
            java.lang.String intern1322 = ((java.lang.String) objArr3822[0]).intern();
            java.lang.Object[] objArr3922 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "⡲䋪篐ᷙ\ufaff\uf463爥ᖛ姘ᙣ脮쳲", "奸峧\uecd9ꃹ", android.text.TextUtils.getTrimmedLength(str), (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr3922);
            java.lang.String intern1422 = ((java.lang.String) objArr3922[0]).intern();
            java.lang.Object[] objArr4022 = new java.lang.Object[1];
            c(103 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 23374), android.text.TextUtils.indexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 15, objArr4022);
            java.lang.String intern1522 = ((java.lang.String) objArr4022[0]).intern();
            java.lang.Object[] objArr4122 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "մ䳣홭˒햱\ufbcbꜬ", "购敪ೋ\ue7fb", (-882546034) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) android.text.TextUtils.getCapsMode(str, 0, 0), objArr4122);
            java.lang.String intern1622 = ((java.lang.String) objArr4122[0]).intern();
            java.lang.Object[] objArr4222 = new java.lang.Object[1];
            c(android.widget.ExpandableListView.getPackedPositionType(0L) + 118, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 8, objArr4222);
            java.lang.String intern1722 = ((java.lang.String) objArr4222[0]).intern();
            java.lang.Object[] objArr4322 = new java.lang.Object[1];
            c(125 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) android.view.View.combineMeasuredStates(0, 0), android.text.TextUtils.getOffsetBefore(str, 0) + 7, objArr4322);
            java.lang.String intern1822 = ((java.lang.String) objArr4322[0]).intern();
            java.lang.Object[] objArr4422 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "茵㗦", "䮟停ퟎ焺", android.view.ViewConfiguration.getScrollBarSize() >> 8, (char) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15062), objArr4422);
            java.lang.String intern1922 = ((java.lang.String) objArr4422[0]).intern();
            java.lang.Object[] objArr4522 = new java.lang.Object[1];
            c(132 - android.widget.ExpandableListView.getPackedPositionType(0L), (char) (6561 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 21, objArr4522);
            java.lang.String intern2022 = ((java.lang.String) objArr4522[0]).intern();
            java.lang.Object[] objArr4622 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "虮ⅇ皔鴇⩩钯", "圌刷唐㾖", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 38485), objArr4622);
            java.lang.String intern2122 = ((java.lang.String) objArr4622[0]).intern();
            java.lang.Object[] objArr4722 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\udcb1铿", "鞝ᤳ䘥\ude7e", android.graphics.Color.blue(0), (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32326), objArr4722);
            java.lang.String intern2222 = ((java.lang.String) objArr4722[0]).intern();
            java.lang.Object[] objArr4822 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 152, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr4822);
            java.lang.String intern2322 = ((java.lang.String) objArr4822[0]).intern();
            java.lang.Object[] objArr4922 = new java.lang.Object[1];
            c((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16), android.view.View.resolveSizeAndState(0, 0, 0) + 9, objArr4922);
            java.lang.String intern2422 = ((java.lang.String) objArr4922[0]).intern();
            java.lang.Object[] objArr5022 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "롕뻽ײַ蜓練\ue8a1ƻ\u0ef0뼪ꖏ", "⢪쮗宎ܥ", android.view.ViewConfiguration.getTapTimeout() >> 16, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5022);
            java.lang.String intern2522 = ((java.lang.String) objArr5022[0]).intern();
            java.lang.Object[] objArr5122 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\uf1e9댃톾龶楻ꋏ㬐즐\uf87e恗\u0de5", "䬐䟮磇⇅", (-951587253) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) android.view.View.resolveSize(0, 0), objArr5122);
            java.lang.String intern2622 = ((java.lang.String) objArr5122[0]).intern();
            java.lang.Object[] objArr5222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ﮨ龺隙뎑스ᠠ먪㧚㲒ꜣ죳", "㑮쪄魦孕", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1724548148, (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1))), objArr5222);
            java.lang.String intern2722 = ((java.lang.String) objArr5222[0]).intern();
            java.lang.Object[] objArr5322 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㍒\uf28e霙螚狂樗룶䂖絲轓渥鐮ᘻ鴧ᆧ", "窕㷬숥왗", 624815226 - android.view.View.resolveSizeAndState(0, 0, 0), (char) (android.view.KeyEvent.normalizeMetaState(0) + 22466), objArr5322);
            java.lang.String intern2822 = ((java.lang.String) objArr5322[0]).intern();
            java.lang.Object[] objArr5422 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "볉쯘\ue19a\uf33a\uefac䠮\uec15֯쨬몑⬁枩岲ᖧ", "㋇\u18fcᄅ䪸", android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (47121 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), objArr5422);
            java.lang.String[] strArr52 = {intern2102, intern3102, intern472, intern522, intern622, intern722, intern822, intern922, intern1022, intern1122, intern1222, intern1322, intern1422, intern1522, intern1622, intern1722, intern1822, intern1922, intern2022, intern2122, intern2222, intern2322, intern2422, intern2522, intern2622, intern2722, intern2822, ((java.lang.String) objArr5422[0]).intern()};
            java.lang.Object[] objArr5522 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "ܗ歯兩휻✄㴐ꩲ\ue3b7惆䃑瑜", "䠳ᄒ廦窞", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 435088825, (char) android.text.TextUtils.getTrimmedLength(str), objArr5522);
            java.lang.Object[] objArr5622 = {((java.lang.String) objArr5522[0]).intern()};
            obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(609763459);
            if (obj2 == null) {
            }
            invoke = ((java.lang.reflect.Method) obj2).invoke(null, objArr5622);
            if (invoke != null) {
            }
            java.lang.Object[] objArr7222 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", android.view.View.resolveSize(0, 0) - 637855546, (char) android.graphics.Color.blue(0), objArr7222);
            java.lang.Object[] objArr7322 = {((java.lang.String) objArr7222[0]).intern()};
            obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj3 == null) {
            }
            long longValue822 = ((java.lang.Long) ((java.lang.reflect.Method) obj3).invoke(null, objArr7322)).longValue();
            long currentTimeMillis2122 = (int) java.lang.System.currentTimeMillis();
            long j2422 = ~currentTimeMillis2122;
            long j2522 = ~longValue822;
            long j2622 = (((-756) * longValue822) - 283252960152L) + ((j2422 | (-373684644)) * (-757)) + ((~(j2522 | (-373684644) | currentTimeMillis2122)) * 1514) + (((~(longValue822 | (-373684644) | currentTimeMillis2122)) | (~(j2522 | j2422)) | (~(373684643 | j2522))) * 757) + 1664224711;
            int currentTimeMillis2222 = (int) java.lang.System.currentTimeMillis();
            int i2122 = ~currentTimeMillis2222;
            int currentTimeMillis2322 = (int) java.lang.System.currentTimeMillis();
            int i2222 = ~currentTimeMillis2322;
            j = (((int) j2622) & ((((~(1000722173 | currentTimeMillis2322)) | (~((-18876482) | i2222))) * 497) + 757014578 + (((~(currentTimeMillis2322 | (-18876482))) | (~(455380717 | i2222)) | 545341456) * 497))) | (((int) (j2622 >> 32)) & ((((~(45771374 | i2122)) | (-1482997786)) * (-865)) + 1901830178 + ((~(currentTimeMillis2222 | (-45771375))) * 865) + (((~((-1482997786) | i2122)) | (~(i2122 | (-45771375)))) * 865)));
            java.lang.Object[] objArr7522 = new java.lang.Object[1];
            c(189 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (char) android.graphics.Color.blue(0), 17 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr7522);
            java.lang.Object[] objArr7622 = {((java.lang.String) objArr7522[0]).intern()};
            obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj4 == null) {
            }
            long longValue922 = ((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr7622)).longValue();
            long currentTimeMillis2422 = (int) java.lang.System.currentTimeMillis();
            long j2722 = ~((~currentTimeMillis2422) | (-85136923));
            long j2822 = ((339 * longValue922) - 28691142714L) + (((~((~longValue922) | 85136922)) | j2722 | (~(currentTimeMillis2422 | 85136922))) * (-338)) + ((~((-85136923) | longValue922)) * 338) + (((~(85136922 | longValue922 | currentTimeMillis2422)) | j2722) * 338) + 1205403145;
            int i2322 = ~((int) java.lang.System.currentTimeMillis());
            int currentTimeMillis2522 = (int) java.lang.System.currentTimeMillis();
            int i2422 = ~currentTimeMillis2522;
            long j2922 = (((int) (j2822 >> 32)) & (((((~(1118487812 | i2322)) | (-1739253077)) * (-241)) - 1110938399) + (((~(i2322 | (-620765265))) | 4) * 241))) | (((((-1451095723) | currentTimeMillis2522) * 614) + 41425219 + (((~((-552194434) | i2422)) | 545259777 | (~((-1989420844) | i2422))) * (-1228)) + (((~((-1444161067) | i2422)) | (~(i2422 | (-6934657)))) * 614)) & ((int) j2822));
            if (j <= 0) {
            }
            java.lang.Object[] objArr8122 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "㢞ᦑ堏앵帳ᚷ錎\ud9f2ꔯ퉎䳐棯᭼\ue9bb顏㡷ꑔ돃㥫쩪揲\ud942䖻", "웤\ufb18ⓙ\u206c", (-637855545) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr8122);
            java.lang.Object[] objArr8222 = {((java.lang.String) objArr8122[0]).intern()};
            obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj5 == null) {
            }
            long longValue1022 = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8222)).longValue();
            long j3022 = ~((int) java.lang.System.currentTimeMillis());
            long j3122 = ((-159) * longValue1022) + 135972659958L + ((longValue1022 | 855173961) * 160) + (((~(longValue1022 | (-855173962))) | (~(j3022 | (-855173962)))) * (-160)) + (((~((~longValue1022) | j3022)) | (-855173962)) * 160) + 2145714029;
            int currentTimeMillis2722 = (int) java.lang.System.currentTimeMillis();
            int currentTimeMillis2822 = (int) java.lang.System.currentTimeMillis();
            j2 = (((int) (j3122 >> 32)) & ((((~((-1706593274) | currentTimeMillis2722)) | (-1974910392)) * 398) + 1097477276 + (((~((~currentTimeMillis2722) | (-1706593274))) | (-1974910392)) * 398))) | (((((~((-374457680) | currentTimeMillis2822)) | 1062768730) * (-668)) + 1881936201 + (((~(1062768730 | currentTimeMillis2822)) | (-374457680)) * 1336) + ((currentTimeMillis2822 | (-83206)) * 668)) & ((int) j3122));
            java.lang.Object[] objArr8422 = new java.lang.Object[1];
            c(205 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (char) (27352 - android.graphics.drawable.Drawable.resolveOpacity(0, 0)), 4 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr8422);
            java.lang.Object[] objArr8522 = {((java.lang.String) objArr8422[0]).intern()};
            obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1729156627);
            if (obj6 == null) {
            }
            long longValue1122 = ((java.lang.Long) ((java.lang.reflect.Method) obj6).invoke(null, objArr8522)).longValue();
            long currentTimeMillis2922 = (int) java.lang.System.currentTimeMillis();
            long j3222 = (((-301) * longValue1122) - 178358073924L) + (((~(longValue1122 | (-588640508) | currentTimeMillis2922)) | (~((~currentTimeMillis2922) | 588640507 | longValue1122))) * (-302)) + ((~(588640507 | longValue1122 | currentTimeMillis2922)) * (-604)) + (((~((~longValue1122) | (-588640508))) | (~(longValue1122 | currentTimeMillis2922))) * 302) + 1879180575;
            int currentTimeMillis3022 = (int) java.lang.System.currentTimeMillis();
            int currentTimeMillis3122 = (int) java.lang.System.currentTimeMillis();
            int i2522 = ~currentTimeMillis3122;
            long j3322 = (((int) (j3222 >> 32)) & (((((~((-675545266) | currentTimeMillis3022)) | (~((~currentTimeMillis3022) | 761681145))) * (-318)) - 1322998726) + (((~(675681529 | currentTimeMillis3022)) | 85999616) * (-318)) + (((~(currentTimeMillis3022 | (-675681530))) | (-761544882)) * 318))) | (((((~(1576638815 | i2522)) | (-139412406)) * (-865)) + 237151840 + ((~(currentTimeMillis3122 | (-1576638816))) * 865) + (((~((-139412406) | i2522)) | (~(i2522 | (-1576638816)))) * 865)) & ((int) j3222));
            if (j2 <= 0) {
            }
            java.lang.Object[] objArr9022 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "\uea9a〉䃲̈\udb00\ua634\uf1ae", "ꜱᩅ캳馷", (-1290123865) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr9022);
            java.lang.String intern3022 = ((java.lang.String) objArr9022[0]).intern();
            java.lang.Object[] objArr9122 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "朱裠ꦄ⹀뮒랜\u135b╳ꡒ嫉\ude8a", "\uf349\ued86\udd39ʅ", 971867890 - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr9122);
            java.lang.String intern3122 = ((java.lang.String) objArr9122[0]).intern();
            java.lang.Object[] objArr9222 = new java.lang.Object[1];
            c(android.text.TextUtils.getOffsetBefore(str, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (char) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), 12 - android.text.TextUtils.getCapsMode(str, 0, 0), objArr9222);
            java.lang.String intern3222 = ((java.lang.String) objArr9222[0]).intern();
            java.lang.Object[] objArr9322 = new java.lang.Object[1];
            a("\u0000\u0000\u0000\u0000", "尾銇⟷뚡쨲絅뽉ݞɛ뙤⇲汦", "ꚤ愡洏ꏀ", android.view.ViewConfiguration.getScrollDefaultDelay() >> 16, (char) android.view.KeyEvent.getDeadChar(0, 0), objArr9322);
            java.lang.String intern3322 = ((java.lang.String) objArr9322[0]).intern();
            java.lang.Object[] objArr9422 = new java.lang.Object[1];
            c(223 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) android.graphics.Color.alpha(0), android.view.View.getDefaultSize(0, 0) + 11, objArr9422);
            java.lang.String intern3422 = ((java.lang.String) objArr9422[0]).intern();
            java.lang.Object[] objArr9522 = new java.lang.Object[1];
            c((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6, objArr9522);
            java.lang.String intern3522 = ((java.lang.String) objArr9522[0]).intern();
            java.lang.Object[] objArr9622 = new java.lang.Object[1];
            c(237 - android.view.MotionEvent.axisFromString(str), (char) ((-1) - android.text.TextUtils.lastIndexOf(str, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), 4 - android.text.TextUtils.indexOf(str, str, 0), objArr9622);
            java.lang.String[] strArr222 = {intern3022, intern3122, intern3222, intern3322, intern3422, intern3522, ((java.lang.String) objArr9622[0]).intern()};
            i = 0;
            while (true) {
                if (i >= 7) {
                }
                i++;
            }
            if (i2 != 0) {
            }
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable cause6 = th6.getCause();
            if (cause6 != null) {
                throw cause6;
            }
            throw th6;
        }
    }

    static void init$0() {
        $$a = new byte[]{6, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -80, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1, -15, 10};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    }
}
